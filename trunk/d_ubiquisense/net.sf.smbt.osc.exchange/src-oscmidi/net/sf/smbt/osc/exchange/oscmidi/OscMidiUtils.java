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

package net.sf.smbt.osc.exchange.oscmidi;

import net.sf.smbt.ezoscmidi.EzoscmidiFactory;
import net.sf.smbt.ezoscmidi.OscMidiCmd;
import net.sf.smbt.midi.ezmidi.ControllerChange;
import net.sf.smbt.midi.ezmidi.DSLMidiMessage;
import net.sf.smbt.midi.ezmidi.NoteOFF;
import net.sf.smbt.midi.ezmidi.NoteON;
import net.sf.smbt.midi.ezmidi.SystemExclusive;

import com.illposed.osc.OSCMessage;

/**
 * 
 * @author lucas
 *
 * For instances, following syntax could apply to the midi <-> osc mapping :
 *
 * /osc/midi/out/noteon 		channel (int) 	key (int) 		velocity (int)
 * /osc/midi/out/noteoff 		channel (int) 	key (int) 		velocity (int)
 * /osc/midi/out/polytouch 		channel (int) 	key (int) 		pressure (int)
 * /osc/midi/out/control 		channel (int) 	index (int) 	value (int)
 * /osc/midi/out/cc		 		channel (int) 	index (int) 	value (int)
 * /osc/midi/out/program 		channel (int) 	index (int)
 * /osc/midi/out/touch			channel (int) 	pressure (int)
 * /osc/midi/out/bend			channel (int) 	value (int)
 * /osc/midi/out/allnotesoff 	channel (int)
 */
public class OscMidiUtils {
	public final static OscMidiUtils INSTANCE = new OscMidiUtils();

	public final static String OSC_MIDI_NOTE_ON				= "/ez/midi/noteon";
	public final static String OSC_MIDI_NOTE_OFF			= "/ez/midi/noteoff";
	public final static String OSC_MIDI_SYSEX				= "/ez/midi/sysex";
	public final static String OSC_MIDI_POLYTOUCH			= "/ez/midi/polytouch";
	public final static String OSC_MIDI_TOUCH				= "/ez/midi/touch";
	public final static String OSC_MIDI_PROGRAM				= "/ez/midi/program";
	public final static String OSC_MIDI_BEND				= "/ez/midi/bend";
	public final static String OSC_MIDI_CONTROL_CHANGE 		= "/ez/midi/cc";
	public final static String OSC_MIDI_LOWER_PITCH			= "/ez/midi/pitch/lower";
	public final static String OSC_MIDI_UPPER_PITCH			= "/ez/midi/pitch/upper";
	public final static String OSC_MIDI_DELAY				= "/ez/midi/delay";
	public final static String OSC_MIDI_CHANNEL_PRESSURE 	= "/ez/midi/channelpressure";
	public final static String OSC_MIDI_ALL_NOTES_OFF	 	= "/ez/midi/allnotesof";
	
	public OscMidiCmd createNoteOn(int channel, int note, int pressure) {
		OSCMessage message = new OSCMessage(
			OSC_MIDI_NOTE_ON, 
			new Object[] { 
				new Integer(channel), 
				new Integer(note), 
				new Integer(pressure) 
			}
		);
		OscMidiCmd cmd = EzoscmidiFactory.eINSTANCE.createOscMidiCmd();
		cmd.setMsg(message);
		return cmd;
	}
	
	public OscMidiCmd createNoteOff(int channel, int note, int pressure) {
		OSCMessage message = new OSCMessage(
			OSC_MIDI_NOTE_OFF, 
			new Object[] { 
				new Integer(channel), 
				new Integer(note), 
				new Integer(pressure) 
			}
		);
		OscMidiCmd cmd = EzoscmidiFactory.eINSTANCE.createOscMidiCmd();
		cmd.setMsg(message);
		return cmd;
	}
	
	
	public OscMidiCmd createCC(int channel, int note, int pressure) {
		OSCMessage message = new OSCMessage(
			OSC_MIDI_CONTROL_CHANGE, 
			new Object[] { 
				new Integer(channel), 
				new Integer(note), 
				new Integer(pressure) 
			}
		);
		OscMidiCmd cmd = EzoscmidiFactory.eINSTANCE.createOscMidiCmd();
		cmd.setMsg(message);
		return cmd;
	}
	
	public OscMidiCmd createSysex(int channel, byte[] data) {
		OSCMessage message = new OSCMessage(
			OSC_MIDI_SYSEX, 
			new Object[] { 
				new Integer(channel), 
				data 
			}
		);
		OscMidiCmd cmd = EzoscmidiFactory.eINSTANCE.createOscMidiCmd();
		cmd.setMsg(message);
		return cmd;
	}
	
	public OscMidiCmd createOscMidiMessage(DSLMidiMessage msg) {
		if (msg != null) {
			if (msg instanceof NoteON) {
				NoteON noteOn = (NoteON) msg;
				return createNoteOn(noteOn.getChannel(), noteOn.getNote(), noteOn.getVelocity());
			} else if (msg instanceof NoteOFF) {
				NoteOFF noteOff = (NoteOFF) msg;
				return createNoteOff(noteOff.getChannel(), noteOff.getNote(), noteOff.getVelocity());
			} else if (msg instanceof ControllerChange) {
				ControllerChange cc = (ControllerChange) msg;
				return createCC(cc.getChannel(), cc.getController(), cc.getValue());
			} else if (msg instanceof SystemExclusive) {
				SystemExclusive sysex = (SystemExclusive) msg;
				byte[] data = sysex.getMessage();
				return createSysex(sysex.getChannel(), data);
			}
		}
		return null;
	}
	
	public void handleRTPStuff() {
		
	}
}
