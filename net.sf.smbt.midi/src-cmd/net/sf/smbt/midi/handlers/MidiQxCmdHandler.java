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

package net.sf.smbt.midi.handlers;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

import net.sf.smbt.comm.utils.rxtx.Serial;
import net.sf.smbt.midi.ezmidi.AbstractMidiCmd;
import net.sf.smbt.midi.ezmidi.DSLMidiMessage;
import net.sf.smbt.midi.utils.MidiCommunicator;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.cmd.CompoundCmd;
import net.sf.xqz.model.engine.EVENT_KIND;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.IChannel;
import net.sf.xqz.model.engine.Qx;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

public class MidiQxCmdHandler extends AbstractQxEventHandlerImpl {
	
	@Override
	public void handleQxEvent(Event event) {
		if (event.getCmd() instanceof AbstractMidiCmd) {
			if (event.getKind() == EVENT_KIND.TX_DONE) {
				if (event.getCmd() instanceof CompoundCmd) {
					for (Cmd c : ((CompoundCmd)event.getCmd()).getChildren()) {
						handleCmd(event.getQx(), c);
					}
				} else {
					handleCmd(event.getQx(), event.getCmd());
				}
			}
		}
	}

	private synchronized void handleCmd(Qx _qx, Cmd _cmd) {
		if (_cmd instanceof DSLMidiMessage) {
			DSLMidiMessage cmd = (DSLMidiMessage) _cmd;
			Object obj = _qx.getEngine().getPort().getChannel();
			synchronized (_qx.getEngine().getOutputInterpreter()) {
				if (obj instanceof MidiCommunicator) {
					((MidiCommunicator) obj).send(cmd);
				} else if (obj instanceof IChannel) {
					byte[] bytes = _qx.getEngine().getOutputInterpreter().cmd2ByteArray(cmd);
					((IChannel)obj).send(bytes);
				} else if (obj instanceof Serial) {
					byte[] frame = _qx.getEngine().getOutputInterpreter().cmd2ByteArray(cmd);
					if (frame!=null && frame.length>0) {
						((Serial) obj).write(frame);
					}
				} else if (obj instanceof DatagramSocket) {
					DatagramSocket socket = (DatagramSocket) obj;
					try {
						byte[] frame = _qx.getEngine().getOutputInterpreter().cmd2ByteArray(_cmd);
						DatagramPacket packet = new DatagramPacket(frame, frame.length);
						socket.send(packet);
					} catch (IOException e) {
						System.err.println("Midi over UDP problem ...");
					} catch (NullPointerException ee) {
						ee.printStackTrace();
					}
				}
			}
		}
	}
}
