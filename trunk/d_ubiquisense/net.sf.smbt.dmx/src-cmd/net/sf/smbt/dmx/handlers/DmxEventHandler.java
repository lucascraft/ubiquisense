/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2010 - 2012, Lucas Bigeardel
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

package net.sf.smbt.dmx.handlers;

import net.sf.smbt.dmx.model.ezdmx.DMXSetCmd;
import net.sf.smbt.dmx.model.ezdmx.DMXSndCmd;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXFade;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.cmd.CompoundCmd;
import net.sf.xqz.model.engine.EVENT_KIND;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.IChannel;
import net.sf.xqz.model.engine.IXCmdInterpreter;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

public class DmxEventHandler extends AbstractQxEventHandlerImpl {

	@Override
	public synchronized void handleQxEvent(Event event) {
		if (isAValidOpenDMXCmd(event.getCmd())) {
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
			Object obj = evt.getQx().getEngine().getPort().getChannel();
			synchronized (evt.getQx().getEngine().getOutputInterpreter()) {
				IXCmdInterpreter outputInterpreter = evt.getQx().getEngine().getOutputInterpreter();
				if (outputInterpreter != null) {
					if (obj instanceof IChannel) { // Serial
						byte[] frame = outputInterpreter.cmd2ByteArray(evt.getCmd());
						if (frame != null && frame.length > 0) {
							((IChannel) obj).send(frame);
						}
					}
				}
			}
		}
	}
	
	//
	// think compound !!!
	//
	boolean isAValidOpenDMXCmd(Cmd cmd) {
		if (cmd instanceof DMXSndCmd || cmd instanceof OpenDMXFade || cmd instanceof DMXSetCmd) {
			return true;
		} else if (cmd instanceof CompoundCmd) {
			for (Cmd c : ((CompoundCmd)cmd).getChildren()) {
				if (!isAValidOpenDMXCmd(c)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}
