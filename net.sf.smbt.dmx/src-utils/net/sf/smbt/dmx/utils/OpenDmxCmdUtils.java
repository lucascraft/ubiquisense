/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2008 - 2011, Lucas Bigeardel
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

package net.sf.smbt.dmx.utils;

import net.sf.smbt.dmx.model.ezdmx.EzdmxFactory;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXChangeOfStatePacketCmd;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXCmd;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXFade;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXGetWidgetParamRequestCmd;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXGetWidgetParamsReplyCmd;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXGetWidgetSerialNumberReplyCmd;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXGetWidgetSerialNumberRequestCmd;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXOutputOnlySendDMXPacketsRequestCmd;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXProgramFlashPageReply;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXProgramFlashPageRequestCmd;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXReceivedPacketsCmd;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXReprogramFirmwareRequestCmd;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXSendRDMDiscoveryRequestCmd;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXSendRDMPacketCmd;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXSetWidgetParamsRequestCmd;
import net.sf.xqz.engine.cmd.utils.CmdUtil;

public class OpenDmxCmdUtils {
	public final static OpenDmxCmdUtils INSTANCE = new OpenDmxCmdUtils();
	
	private final static Byte BYTE_0X7E = (byte) 0x7e;
	private final static Byte BYTE_0XE7 = (byte) 0xe7;

	/*
	 * The Widget sends one or more instances of this message to the PC unsolicited, 
	 * whenever the Widget receives a changed DMX packet from the DMX port, 
	 * and the Receive DMX on Change mode is 'Send on data change only'.
	 */
	public OpenDMXChangeOfStatePacketCmd createOpenDMXChangeOfStatePacketRcvCmd(byte start, byte[] bits, byte[] data) {
		OpenDMXChangeOfStatePacketCmd dmxCmd = EzdmxFactory.eINSTANCE.createOpenDMXChangeOfStatePacketCmd();
		dmxCmd.setStart(BYTE_0X7E);
		dmxCmd.setLabel(new Integer(9).byteValue());
		
		int length = 1 + bits.length + data.length;
		byte[] bytes = new byte[length];
		
		bytes[0] = start;
		
		System.arraycopy(bits, 0, bytes, 1, bits.length);
		System.arraycopy(data, 0, bytes, bits.length, data.length);

		dmxCmd.setData(bytes);
		dmxCmd.setEnd(BYTE_0XE7);
		return dmxCmd;
	}

	// FIXME : go deeper while understanding the OpenDMX spec 
	public OpenDMXGetWidgetParamRequestCmd createOpenDMXGetWidgetParamRequestCmd() {
		OpenDMXGetWidgetParamRequestCmd dmxCmd = EzdmxFactory.eINSTANCE.createOpenDMXGetWidgetParamRequestCmd();
		dmxCmd.setStart(BYTE_0X7E);
		dmxCmd.setLabel(Byte.decode("0x02"));
		dmxCmd.setData(new byte[0]);
		dmxCmd.setEnd(BYTE_0XE7);
		return dmxCmd;
	}
	
	// FIXME : go deeper while understanding the OpenDMX spec 
	public OpenDMXGetWidgetParamsReplyCmd createOpenDMXGetWidgetParamsReplyCmd() {
		OpenDMXGetWidgetParamsReplyCmd dmxCmd = EzdmxFactory.eINSTANCE.createOpenDMXGetWidgetParamsReplyCmd();
		dmxCmd.setStart(BYTE_0X7E);
		dmxCmd.setLabel(Byte.decode("0x02"));
		dmxCmd.setData(new byte[0]);
		dmxCmd.setEnd(BYTE_0XE7);
		return dmxCmd;
	}
	
	// FIXME : go deeper while understanding the OpenDMX spec 
	public OpenDMXGetWidgetSerialNumberReplyCmd createOpenDMXGetWidgetSerialNumberReplyCmd() {
		OpenDMXGetWidgetSerialNumberReplyCmd dmxCmd = EzdmxFactory.eINSTANCE.createOpenDMXGetWidgetSerialNumberReplyCmd();
		dmxCmd.setStart(BYTE_0X7E);
		dmxCmd.setLabel(Byte.decode("0x02"));
		dmxCmd.setData(new byte[0]);
		dmxCmd.setEnd(BYTE_0XE7);
		return dmxCmd;
	}
	
	// FIXME : go deeper while understanding the OpenDMX spec 
	public OpenDMXGetWidgetSerialNumberRequestCmd createOpenDMXGetWidgetSerialNumberRequestCmd() {
		OpenDMXGetWidgetSerialNumberRequestCmd dmxCmd = EzdmxFactory.eINSTANCE.createOpenDMXGetWidgetSerialNumberRequestCmd();
		dmxCmd.setStart((byte)0x7e);
		dmxCmd.setLabel(new Integer(10).byteValue());
		dmxCmd.setData(new byte[0]);
		dmxCmd.setEnd((byte)0x7e);
		return dmxCmd;
	}
	
	// FIXME : go deeper while understanding the OpenDMX spec 
	public OpenDMXOutputOnlySendDMXPacketsRequestCmd createOpenDMXOutputOnlySendDMXPacketsRequestCmd() {
		OpenDMXOutputOnlySendDMXPacketsRequestCmd dmxCmd = EzdmxFactory.eINSTANCE.createOpenDMXOutputOnlySendDMXPacketsRequestCmd();
		dmxCmd.setStart(BYTE_0X7E);
		dmxCmd.setLabel(new Integer(6).byteValue());
		dmxCmd.setData(new byte[0]);
		dmxCmd.setEnd(BYTE_0XE7);
		return dmxCmd;
	}
	
	public OpenDMXProgramFlashPageReply createOpenDMXProgramFlashPageReply() {
		OpenDMXProgramFlashPageReply dmxCmd = EzdmxFactory.eINSTANCE.createOpenDMXProgramFlashPageReply();
		dmxCmd.setStart(BYTE_0X7E);
		dmxCmd.setLabel(Byte.decode("0x02"));
		dmxCmd.setData(new byte[0]);
		dmxCmd.setEnd(BYTE_0XE7);
		return dmxCmd;
	}
	
	public OpenDMXProgramFlashPageRequestCmd createOpenDMXProgramFlashPageRequestCmd(byte[] pageData) {
		if (pageData == null || pageData.length!=64) {
			throw new UnsupportedOperationException("An OpenDMX program flash page should be exactly 64 byte long");
		}
		
		OpenDMXProgramFlashPageRequestCmd dmxCmd = EzdmxFactory.eINSTANCE.createOpenDMXProgramFlashPageRequestCmd();
		
		dmxCmd.setStart(BYTE_0X7E);
		dmxCmd.setLabel(Byte.decode("0x02"));
		dmxCmd.setData(pageData);
		dmxCmd.setEnd(BYTE_0XE7);
		
		return dmxCmd;
	}
	
	// FIXME : go deeper while understanding the OpenDMX spec 
	public OpenDMXReceivedPacketsCmd createOpenDMXReceivedPacketsCmd() {
		OpenDMXReceivedPacketsCmd dmxCmd = EzdmxFactory.eINSTANCE.createOpenDMXReceivedPacketsCmd();
		dmxCmd.setStart(BYTE_0X7E);
		dmxCmd.setLabel(Byte.decode("0x02"));
		dmxCmd.setData(new byte[0]);
		dmxCmd.setEnd(BYTE_0XE7);
		return dmxCmd;
	}
	
	/*
	 * OK
	 */
	public OpenDMXReprogramFirmwareRequestCmd createOpenDMXReprogramFirmwareRequestCmd() {
		OpenDMXReprogramFirmwareRequestCmd dmxCmd = EzdmxFactory.eINSTANCE.createOpenDMXReprogramFirmwareRequestCmd();
		dmxCmd.setStart(BYTE_0X7E);
		dmxCmd.setLabel(Byte.decode("0x01"));
		dmxCmd.setData(new byte[0]);
		dmxCmd.setEnd(BYTE_0XE7);
		return dmxCmd;
	}
	
	// FIXME : go deeper while understanding the OpenDMX spec 
	public OpenDMXSendRDMDiscoveryRequestCmd createOpenDMXSendRDMDiscoveryRequestCmd() {
		OpenDMXSendRDMDiscoveryRequestCmd dmxCmd = EzdmxFactory.eINSTANCE.createOpenDMXSendRDMDiscoveryRequestCmd();
		dmxCmd.setStart(BYTE_0X7E);
		dmxCmd.setLabel(new Integer(11).byteValue());
		dmxCmd.setData(new byte[0]);
		dmxCmd.setEnd(BYTE_0XE7);
		return dmxCmd;
	}
	
	// FIXME : go deeper while understanding the OpenDMX spec 
	public OpenDMXSendRDMPacketCmd createOpenDMXSendRDMPacketCmd() {
		OpenDMXSendRDMPacketCmd dmxCmd = EzdmxFactory.eINSTANCE.createOpenDMXSendRDMPacketCmd();
		dmxCmd.setStart(BYTE_0X7E);
		dmxCmd.setLabel(Byte.decode("0x02"));
		dmxCmd.setData(new byte[0]);
		dmxCmd.setEnd(BYTE_0XE7);
		return dmxCmd;
	}
	
	// FIXME : go deeper while understanding the OpenDMX spec 
	public OpenDMXSetWidgetParamsRequestCmd createOpenDMXSetWidgetParamsRequestCmd() {
		OpenDMXSetWidgetParamsRequestCmd dmxCmd = EzdmxFactory.eINSTANCE.createOpenDMXSetWidgetParamsRequestCmd();
		dmxCmd.setStart(BYTE_0X7E);
		dmxCmd.setLabel(Byte.decode("0x02"));
		dmxCmd.setData(new byte[0]);
		dmxCmd.setEnd(BYTE_0XE7);
		return dmxCmd;
	}
	
	public OpenDMXCmd createOpenDMXFadeRGBCmd(int channel, int rValue, int gValue, int bValue) {
		OpenDMXFade dmxCmd = EzdmxFactory.eINSTANCE.createOpenDMXFade();
		dmxCmd.setStart((byte) 0x7e);
		dmxCmd.setLabel((byte) 0x06);
		dmxCmd.setData(new byte[] { (byte)channel, (byte)rValue, (byte)gValue, (byte)bValue});
		dmxCmd.setEnd((byte) 0xe7);
		return dmxCmd;
	}
	
	public OpenDMXCmd createOpenDMXFadeRGBWithStrobeCmd(int channel, int rValue, int gValue, int bValue, int strobe) {
		OpenDMXFade dmxCmd = EzdmxFactory.eINSTANCE.createOpenDMXFade();
		dmxCmd.setStart((byte) 0x7e);
		dmxCmd.setLabel((byte) 0x06);
		dmxCmd.setData(new byte[] { (byte)channel, (byte)strobe, (byte)rValue, (byte)gValue, (byte)bValue});
		dmxCmd.setEnd((byte) 0xe7);
		return dmxCmd;
	}
	
	public OpenDMXCmd createOpenDMXFadeRGBFullCmd(int rValue, int gValue, int bValue, int fullColor, int strobe, int modi, int ext) {
		OpenDMXFade dmxCmd = EzdmxFactory.eINSTANCE.createOpenDMXFade();
		dmxCmd.setStart((byte) 0x7e);
		dmxCmd.setLabel((byte) 0x06);
		dmxCmd.setData(new byte[] { (byte)rValue, (byte)gValue, (byte)bValue, (byte)fullColor, (byte)strobe, (byte)modi, (byte)ext});
		dmxCmd.setEnd((byte) 0xe7);
		return dmxCmd;
	}
	public OpenDMXCmd createOpenDMXCmd(byte[] bytes) {
		OpenDMXFade dmxCmd = EzdmxFactory.eINSTANCE.createOpenDMXFade();
		dmxCmd.setStart((byte) 0x7e);
		dmxCmd.setLabel((byte) 0x06);
		dmxCmd.setData(bytes);
		dmxCmd.setEnd((byte) 0xe7);
		return dmxCmd;
	}
	
	//
	// Conversion
	//
	
	// FIXME : go deeper while understanding the OpenDMX spec 
	public OpenDMXCmd createDMXCommandFromFrame(byte[] frame) {
		if (frame == null || frame.length < 5) {
			throw new UnsupportedOperationException("OpenDMX frame is not supported yet. Frame was " + CmdUtil.INSTANCE.getFrameHexInfo(frame));
		}
		
		//
		// right frame first byte ???
		//
		if (!Byte.valueOf(frame[0]).equals(BYTE_0X7E)) {
			// Good news : bouncing bad frame ... 
			throw new UnsupportedOperationException("OpenDMX frame should have a first byte as 0x7e. Frame was " + CmdUtil.INSTANCE.getFrameHexInfo(frame));
		}
		
		// Lets look at the label 
		switch (Byte.valueOf(frame[1]).intValue()) {
			case 7:
				// Firmware Ver MSB 1 : Send RDM Not supported !!!
				break;
			case 11:
				// Firmware Ver MSB 1 : RDM Discovery request Not supported !!!
				break;
			case 8:
				// Firmware Ver MSB 2 : Receive DMX on change Not supported !!!
				break;
			case 9:
				// Firmware Ver MSB 2 : Change on state receive Not supported !!!
				break;
			default:
				break;
		}
		
		return null;
	}
	
	/**
	 * Dump as byte[] the current valuation of an OpenDMX command
	 * 
	 * @param dmxCmd an OpenDMX command
	 * 
	 * @return the byte[] form of the given OpenDMX command
	 */
	public byte[] dumpOpenDMXCmd(OpenDMXCmd dmxCmd) {
		if (dmxCmd !=null) {
			int dataLength = dmxCmd.getData().length;
			byte[] frame = new byte[5 + dataLength];
			frame[0] = (byte) 0x7e; 
			frame[1] = dmxCmd.getLabel();
			frame[2] = (byte) (dataLength & 255);
			frame[3] = (byte) ((dataLength >> 8) & 255);
			frame[dataLength+4] = (byte) 0xe7;
			System.arraycopy(dmxCmd.getData(), 0, frame, 4, dataLength);
			return frame;
		}
		return new byte[0];
	}
}

