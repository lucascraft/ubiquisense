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

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.SysexMessage;

import net.sf.smbt.midi.utils.MidiCmdUtils;
import net.sf.smbt.osc.exchange.oscmidi.OscMidiUtils;
import net.sf.xqz.model.cmd.Cmd;

import com.illposed.osc.OSCMessage;

public class Osc2MidiMapping {
	
	public final static Osc2MidiMapping INSTANCE = new Osc2MidiMapping();
	
	public Cmd osc2midi(OSCMessage msg) {
		if (msg.getAddress().startsWith(OscMidiUtils.OSC_MIDI_NOTE_ON)) {
			if (msg.getArguments() != null && msg.getArguments().length>2) {
				Integer channel	= (Integer) msg.getArguments()[0];
				Integer d1		= (Integer) msg.getArguments()[1];
				Integer d2		= (Integer) msg.getArguments()[2];
				ShortMessage sm = new ShortMessage();
				try {
					sm.setMessage(ShortMessage.NOTE_ON, channel, d1, d2);
				} catch (InvalidMidiDataException e) {
					e.printStackTrace();
				}
				return MidiCmdUtils.INSTANCE.createNoteON(sm);
			}
		} else if (msg.getAddress().startsWith(OscMidiUtils.OSC_MIDI_NOTE_OFF)) {
			if (msg.getArguments() != null && msg.getArguments().length>2) {
				Integer channel	= (Integer) msg.getArguments()[0];
				Integer d1		= (Integer) msg.getArguments()[1];
				Integer d2		= (Integer) msg.getArguments()[2];
				ShortMessage sm = new ShortMessage();
				try {
					sm.setMessage(ShortMessage.NOTE_OFF, channel, d1, d2);
				} catch (InvalidMidiDataException e) {
					e.printStackTrace();
				}
				return MidiCmdUtils.INSTANCE.createNoteOFF(sm);
			}
		} else if (msg.getAddress().startsWith(OscMidiUtils.OSC_MIDI_CHANNEL_PRESSURE)) {
			if (msg.getArguments() != null && msg.getArguments().length>2) {
				Integer channel	= (Integer) msg.getArguments()[0];
				Integer d1		= (Integer) msg.getArguments()[1];
				Integer d2		= (Integer) msg.getArguments()[2];
				ShortMessage sm = new ShortMessage();
				try {
					sm.setMessage(ShortMessage.CHANNEL_PRESSURE, channel, d1, d2);
				} catch (InvalidMidiDataException e) {
					e.printStackTrace();
				}
				return MidiCmdUtils.INSTANCE.createChannelPressure(sm);
			}
		} else if (msg.getAddress().startsWith(OscMidiUtils.OSC_MIDI_CONTROL_CHANGE)) {
			if (msg.getArguments() != null && msg.getArguments().length>2) {
				Integer channel	= (Integer) msg.getArguments()[0];
				Integer d1		= (Integer) msg.getArguments()[1];
				Integer d2		= (Integer) msg.getArguments()[2];
				ShortMessage sm = new ShortMessage();
				try {
					sm.setMessage(ShortMessage.CONTROL_CHANGE, channel, d1, d2);
				} catch (InvalidMidiDataException e) {
					e.printStackTrace();
				}
				return MidiCmdUtils.INSTANCE.createControllerChange(sm);
			}
		} else if (msg.getAddress().startsWith(OscMidiUtils.OSC_MIDI_LOWER_PITCH) || msg.getAddress().startsWith(OscMidiUtils.OSC_MIDI_UPPER_PITCH)) {
			if (msg.getArguments() != null && msg.getArguments().length>2) {
				Integer channel	= (Integer) msg.getArguments()[0];
				Integer d1		= (Integer) msg.getArguments()[1];
				Integer d2		= (Integer) msg.getArguments()[2];
				ShortMessage sm = new ShortMessage();
				try {
					sm.setMessage(ShortMessage.PITCH_BEND, channel, d1, d2);
				} catch (InvalidMidiDataException e) {
					e.printStackTrace();
				}
				return MidiCmdUtils.INSTANCE.createPitchBend(sm);
			}
		} else if (msg.getAddress().startsWith(OscMidiUtils.OSC_MIDI_SYSEX)) {
			if (msg.getArguments() != null && msg.getArguments().length>2) {
				Integer channel	= (Integer) msg.getArguments()[0];
				Byte[] data		= (Byte[]) msg.getArguments()[1];
				SysexMessage sm = new SysexMessage();
				//try {
					//sm.setMessage(data, data.length);
				//} catch (InvalidMidiDataException e) {
				//	e.printStackTrace();
				//}
				return MidiCmdUtils.INSTANCE.createPitchBend(sm);
			}
		} 
		return null;
	}
}
