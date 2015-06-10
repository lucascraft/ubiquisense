/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012, Lucas Bigeardel
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

package net.sf.smbt.midi.utils;

import javax.sound.midi.MidiDevice;

import net.sf.smbt.comm.utils.io.IChannelCloser;
import net.sf.smbt.midi.ezmidi.DSLMidiMessage;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.impl.IChannelImpl;

public class MidiCommunicator extends IChannelImpl implements IChannelCloser {
	private MidiDevice device;
	private IMidiIn in;
	private IMidiOut out;
	private CmdPipe engine;
	public MidiCommunicator(CmdPipe engine) {
		this.engine = engine;
	}
	public MidiDevice getDevice() {
		return device;
	}
	public boolean isInputOutputDevice() {
		return isInputDevice() && isOutputDevice();
	}
	public boolean isInputDevice() {
		return device != null && device.getMaxTransmitters() >=0 && device.getMaxReceivers() == -1;
	}
	public boolean isOutputDevice() {
		return device != null && device.getMaxReceivers() >=0 && device.getMaxTransmitters() == -1;
	}
	public void setDevice(MidiDevice device) {
		this.device	= device;
		if (isOutputDevice()) {
			out			= new NullOutputJob();
			in			= new MidiInputJob(device, engine);
		}
		if (isInputDevice()) {
			out			= new MidiOutputJob(device);
			in			= new NullInputJob();
		}
	}
	public void close() {
		if (device != null && device.isOpen()) {
			device.close();
		}
		if (in != null) {
			in.close();
		}
		if (out != null) {
			out.close();
		}
	}
	public void send(DSLMidiMessage msg) {
		if (out != null) {
			out.send(msg);
		}
	}
	@Override
	public void send(byte[] bytes) {
		Cmd cmd = engine.getInputInterpreter().byteArray2Cmd(bytes);
		if (cmd instanceof DSLMidiMessage) {
			send((DSLMidiMessage)cmd);
		}
	}
}
