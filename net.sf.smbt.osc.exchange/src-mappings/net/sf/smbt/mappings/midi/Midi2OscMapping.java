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

package net.sf.smbt.mappings.midi;

import net.sf.smbt.midi.ezmidi.ControllerChange;
import net.sf.smbt.midi.ezmidi.DSLMidiMessage;
import net.sf.smbt.midi.ezmidi.NoteOFF;
import net.sf.smbt.midi.ezmidi.NoteON;
import net.sf.smbt.midi.ezmidi.SystemExclusive;
import net.sf.smbt.osc.exchange.oscmidi.OscMidiUtils;
import net.sf.smbt.osccmd.OscCmd;


public class Midi2OscMapping {
	public final static Midi2OscMapping INSTANCE = new Midi2OscMapping();
	
	public OscCmd midi2osc(DSLMidiMessage midiCmd) {
		if (midiCmd instanceof NoteON) {
			return OscMidiUtils.INSTANCE.createNoteOn(
				midiCmd.getChannel(), 
				new Byte(midiCmd.getByte1()).intValue(), 
				new Byte(midiCmd.getByte2()).intValue()
			);
		} else if (midiCmd instanceof NoteOFF) {
			return OscMidiUtils.INSTANCE.createNoteOff(
				midiCmd.getChannel(), 
				new Byte(midiCmd.getByte1()).intValue(), 
				new Byte(midiCmd.getByte2()).intValue()
			);
		} else if (midiCmd instanceof ControllerChange) {
			return OscMidiUtils.INSTANCE.createCC(
				midiCmd.getChannel(), 
				new Byte(midiCmd.getByte1()).intValue(), 
				new Byte(midiCmd.getByte2()).intValue()
			);
		} else if (midiCmd instanceof SystemExclusive) {
			return OscMidiUtils.INSTANCE.createSysex(
				midiCmd.getChannel(), 
				midiCmd.getMessage() 
			);
		}
		return null;
	}
}
