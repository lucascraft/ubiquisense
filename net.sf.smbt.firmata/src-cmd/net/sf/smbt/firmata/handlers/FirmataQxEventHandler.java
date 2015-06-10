/***********************************************************************************
FirmataCmdUtils.java * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2008 - 2015, Lucas Bigeardel
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

import net.sf.smbt.midi.ezmidi.DSLMidiMessage;
import net.sf.smbt.midi.ezmidi.SysexMessage;
import net.sf.smbt.protocol.ezfirmata.FirmataCmd;
import net.sf.xqz.model.cmd.ByteCmd;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.cmd.CompoundCmd;
import net.sf.xqz.model.engine.EVENT_KIND;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.IChannel;
import net.sf.xqz.model.engine.IXCmdInterpreter;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

/**
 * The handler listen to queue event and send a byte[] form of the compatible firmata command
 */
public class FirmataQxEventHandler extends AbstractQxEventHandlerImpl {
	
	@Override
	public synchronized void handleQxEvent(Event event) {
		if (isAValidFirmataCmd(event.getCmd())) {
			if (event.getKind() == EVENT_KIND.TX_DONE) {
				handleQxEvent(event, event.getCmd());
			}
		}
	}
	
	private synchronized void handleQxEvent(Event evt, Cmd c) {
		if (c instanceof CompoundCmd) {
			for (Cmd cc : ((CompoundCmd)c).getChildren()) {
				handleQxEvent(evt, cc);
			}
		}
		if (evt.getQx().getEngine().getPort() != null) {
			Object channel = evt.getQx().getEngine().getPort().getChannel();
			synchronized (evt.getQx().getEngine().getOutputInterpreter()) {
				IXCmdInterpreter outputInterpreter = evt.getQx().getEngine().getOutputInterpreter();
				if (outputInterpreter != null) {
					if (channel instanceof IChannel) { // Serial
						byte[] frame = outputInterpreter.cmd2ByteArray(evt.getCmd());
						if (frame != null && frame.length > 0) {
							((IChannel) channel).send(frame);
						}
					}
				}
			}
		}
	}
	
	//
	// think compound !!!
	//
	boolean isAValidFirmataCmd(Cmd cmd) {
		if (cmd instanceof DSLMidiMessage || cmd instanceof FirmataCmd || cmd instanceof SysexMessage || cmd instanceof ByteCmd) {
			return true;
		} else if (cmd instanceof CompoundCmd) {
			for (Cmd c : ((CompoundCmd)cmd).getChildren()) {
				if (!isAValidFirmataCmd(c)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}
