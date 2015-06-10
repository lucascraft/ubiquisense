/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2011, Lucas Bigeardel
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

package net.sf.smbt.mappings;

import net.sf.smbt.mapping.engine.AbstractMapEngine;
import net.sf.smbt.mappings.midi.Midi2OscMapping;
import net.sf.smbt.mappings.midi.Osc2MidiMapping;
import net.sf.smbt.midi.ezmidi.DSLMidiMessage;
import net.sf.smbt.midi.handlers.MidiQxCmdHandler;
import net.sf.smbt.osccmd.OscCmd;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

import com.illposed.osc.OSCMessage;

public class MidiMapping extends AbstractMapEngine {

	@Override
	public Cmd cmd2ez(Cmd leftCmd) {
		return Midi2OscMapping.INSTANCE.midi2osc((DSLMidiMessage)leftCmd);
	}

	@Override
	public Cmd ez2cmd(Cmd leftCmd) {
		return Osc2MidiMapping.INSTANCE.osc2midi((OSCMessage)((OscCmd)leftCmd).getMsg());
	}
	
	@Override
	public AbstractQxEventHandlerImpl getQxHandler() {
		return eventAdapter == null ? eventAdapter = new MidiQxCmdHandler() : eventAdapter;
	}
}
