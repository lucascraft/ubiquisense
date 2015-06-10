/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2008 - 2012, Lucas Bigeardel
 * 
 * The library is released under:
 * 
 * A) LGPL
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA 02110-1301 USA
 * 
 * B) EPL
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Lucas Bigeardel <lucas.bigeardel@gmail.com> - Initial API and implementation
 ***********************************************************************************/

package net.sf.smbt.firmata.handlers;

import java.nio.ByteBuffer;

import net.sf.smbt.firmata.utils.FirmataCmdUtils;
import net.sf.smbt.midi.ezmidi.DSLMidiMessage;
import net.sf.xqz.engine.cmd.utils.CmdUtil;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.cmd.CompoundCmd;
import net.sf.xqz.model.engine.impl.AbstractFrameInterpreterImpl;

import org.eclipse.core.runtime.Platform;

public class FirmataFrameHandler extends AbstractFrameInterpreterImpl {

	private final static String ANALOG_IO 				= "0xe0";
	private final static String DIGITAL_IO 				= "0x90";
	private final static String FIRMWARE_RESPONSE 		= "0x79";
	private final static String ANALOG_MAPPING_RESPONSE = "0x6a";
	private final static String CAPABILITIES_RESPONSE 	= "0x6c";
	private final static String PIN_STATE_RESPONSE 		= "0x6e";
	private final static String PIN_MODE_RESPONSE 		= "0x73";
	
	@Override
	public synchronized Cmd byteArray2Cmd(final byte[] stream) {
		if (Platform.inDebugMode()) {
			System.out.println("RCV : " + CmdUtil.INSTANCE.getFrameHexInfo(stream));
		}
		return parse(stream);		
	}
	
	static ByteBuffer sysexBuffer = ByteBuffer.allocate(65635*32);
	
	public Cmd parse(byte[] bytes) {
		CompoundCmd cc = CmdUtil.INSTANCE.createCompoundCmd();
		for (int i=0;i<bytes.length;i++) {
			sysexBuffer.put(bytes[i]);
			if ("0xf0".equals(valueOf(bytes[i]))) {								
				sysexBuffer.clear();
				sysexBuffer.put(bytes[i]);	
			} else if ("0xf7".equals(valueOf(bytes[i]))) {
				sysexBuffer.flip();
				byte[] sysex = new byte[sysexBuffer.limit()];
				sysexBuffer.get(sysex);
				sysexBuffer.clear();
				
				Cmd cs = processSysex(sysex);
				if (cs instanceof Cmd) {
					cc.add(cs);
				}
				// consume remaining bytes
				if (bytes.length-1<i) {
					byte[] tail = new byte[bytes.length - i -1];
					System.arraycopy(bytes, i+1, tail, 0, tail.length);
					parse(tail);
				}
			}
		}
		Cmd c = processIO(bytes);
		if (c instanceof Cmd) {
			cc.add(c);
		} 

		return cc;
	}

	public Cmd processIO(byte[] stream) {
		if (stream != null && stream.length>0) {
			String io = getIOKind(stream[0]);
			if (ANALOG_IO.equals(io)) {
				CompoundCmd cc = CmdUtil.INSTANCE.createCompoundCmd();
				for (int n=0;n<stream.length/3;n++) {
					byte[] tmp = new byte[3];
					System.arraycopy(stream, 3*n, tmp, 0, 3);
					int channel = tmp[0] & 0x0f;
					if (tmp.length>2) {
						int analog_val = tmp[1] | (tmp[2] << 7);
						if (Platform.inDebugMode()) {
							System.out.println("ANALOG " + channel + " : " + analog_val);
						}
						cc.add(FirmataCmdUtils.INSTANCE.createAnalogIO(channel, tmp[2], tmp[1]));
					}
				}
				sysexBuffer.clear();
				return cc;
			} else if (DIGITAL_IO.equals(io)) {
				CompoundCmd cc = CmdUtil.INSTANCE.createCompoundCmd();
				int channel = stream[0] & 0x0f;
				if (stream.length>2) {
					int digital_val = stream[1] | (stream[2] << 7);
					if (Platform.inDebugMode()) {
						System.out.println("DIGITAL " + channel + " : " + digital_val);
					}
					cc.add(FirmataCmdUtils.INSTANCE.createAnalogIO(channel, stream[2], stream[1]));
				}
				sysexBuffer.clear();
				return cc;
			} 
		}
		return null;
	}
	
	public Cmd processSysex(byte[] stream) {
		if (stream != null && stream.length > 1) {
			String tag = getTag(stream[1]);
			if (FIRMWARE_RESPONSE.equals(tag) && stream.length > 2) {
				DSLMidiMessage message = FirmataCmdUtils.INSTANCE.createProtocolVersionResponse(stream[1], stream[2]);
				int major = Byte.valueOf(stream[1]).intValue();
				int minor = Byte.valueOf(stream[2]).intValue();
				message.setMessage(stream);
				if (Platform.inDebugMode()) {
					System.out.println("Firmata v"+major+"."+minor + " started");
				}
				return message;
			} else if (PIN_MODE_RESPONSE.equals(tag)) {
				if (stream != null && stream.length>=3) {
					DSLMidiMessage message = FirmataCmdUtils.INSTANCE.createPinModeResponse(stream[1], stream[2]);
					message.setMessage(stream);
					int port = Byte.valueOf(stream[1]).intValue();
					int mode= Byte.valueOf(stream[2]).intValue();
					if (Platform.inDebugMode()) {
						System.out.println("port "+ port + " in mode " + mode);
					}
					return message;
				}
				return null;
			} if (ANALOG_MAPPING_RESPONSE.equals(tag)) { // Analog Mapping Response
				return FirmataCmdUtils.INSTANCE.createAnalogMappingResponse(stream);
			} else if (CAPABILITIES_RESPONSE.equals(tag)) { // Capability Response
				return FirmataCmdUtils.INSTANCE.createCapabilityResponse(stream);
			} else if (PIN_STATE_RESPONSE.equals(tag)) { // Pin State Response
				return FirmataCmdUtils.INSTANCE.createPinStateResponse(stream);
			} /* else if (b == 0xc0) {
				System.out.println("0xc0");
			} else if (b == 0xd0) {
				System.out.println("0xd0");
			} else if (b == 0xe0) {
				System.out.println("0xe0");
			} */
		}
		return null;
	}
	
	private String valueOf(byte num) {
		String hex = Integer.toHexString((int) num & 0xFF);
		return "0x" + (hex.length() == 1 ? "0" : "") + hex;
	}

	public String getTag(byte hex) {
		return valueOf((byte) (hex & 0xff));
	}
	public String getIOKind(byte hex) {
		return valueOf((byte) (hex & 0xf0));
	}
}
