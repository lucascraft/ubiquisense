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

package net.sf.smbt.midi.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MetaMessage;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.SysexMessage;

import net.sf.smbt.midi.ezmidi.AbstractMidiCmd;
import net.sf.smbt.midi.ezmidi.ActiveSensing;
import net.sf.smbt.midi.ezmidi.ChannelPressure;
import net.sf.smbt.midi.ezmidi.ContinueSong;
import net.sf.smbt.midi.ezmidi.ControllerChange;
import net.sf.smbt.midi.ezmidi.DSLMidiMessage;
import net.sf.smbt.midi.ezmidi.EndOfExclusive;
import net.sf.smbt.midi.ezmidi.EzmidiFactory;
import net.sf.smbt.midi.ezmidi.EzmidiPackage;
import net.sf.smbt.midi.ezmidi.KeyPressure;
import net.sf.smbt.midi.ezmidi.NoteOFF;
import net.sf.smbt.midi.ezmidi.NoteON;
import net.sf.smbt.midi.ezmidi.PitchBend;
import net.sf.smbt.midi.ezmidi.PolyPressure;
import net.sf.smbt.midi.ezmidi.ProgramChange;
import net.sf.smbt.midi.ezmidi.SongPosition;
import net.sf.smbt.midi.ezmidi.SongSelect;
import net.sf.smbt.midi.ezmidi.StartSong;
import net.sf.smbt.midi.ezmidi.StopSong;
import net.sf.smbt.midi.ezmidi.SystemExclusive;
import net.sf.smbt.midi.ezmidi.SystemReset;
import net.sf.smbt.midi.ezmidi.TimeCode;
import net.sf.smbt.midi.ezmidi.TimingClock;
import net.sf.smbt.midi.ezmidi.TimingTick;
import net.sf.smbt.midi.ezmidi.TuneRequest;
import net.sf.smbt.midi.ezmidi.UnofficialBusSelect;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.ecore.EClassifier;

public class MidiCmdUtils {
	public final static MidiCmdUtils INSTANCE = new MidiCmdUtils();
	
	private static Map<EClassifier, Cmd> possibleCommands;
	
	public MidiCmdUtils() {
		possibleCommands = new HashMap<EClassifier, Cmd>();
		possibleCommands.put(EzmidiPackage.Literals.NOTE_ON,			EzmidiFactory.eINSTANCE.createNoteON());
		possibleCommands.put(EzmidiPackage.Literals.NOTE_OFF,			EzmidiFactory.eINSTANCE.createNoteOFF());
		possibleCommands.put(EzmidiPackage.Literals.ACTIVE_SENSING,		EzmidiFactory.eINSTANCE.createActiveSensing());
		possibleCommands.put(EzmidiPackage.Literals.CHANNEL_PRESSURE,	EzmidiFactory.eINSTANCE.createChannelPressure());
		possibleCommands.put(EzmidiPackage.Literals.CONTINUE_SONG,		EzmidiFactory.eINSTANCE.createContinueSong());
		possibleCommands.put(EzmidiPackage.Literals.CONTROLLER_CHANGE,	EzmidiFactory.eINSTANCE.createControllerChange());
		possibleCommands.put(EzmidiPackage.Literals.END_OF_EXCLUSIVE,	EzmidiFactory.eINSTANCE.createEndOfExclusive());
		possibleCommands.put(EzmidiPackage.Literals.KEY_PRESSURE,		EzmidiFactory.eINSTANCE.createKeyPressure());
		possibleCommands.put(EzmidiPackage.Literals.MIDI_MESSAGE,		EzmidiFactory.eINSTANCE.createDSLMidiMessage());
		possibleCommands.put(EzmidiPackage.Literals.PITCH_BEND,			EzmidiFactory.eINSTANCE.createPitchBend());
		possibleCommands.put(EzmidiPackage.Literals.PROGRAM_CHANGE,		EzmidiFactory.eINSTANCE.createProgramChange());
		possibleCommands.put(EzmidiPackage.Literals.SONG_POSITION,		EzmidiFactory.eINSTANCE.createSongPosition());
		possibleCommands.put(EzmidiPackage.Literals.SONG_SELECT,		EzmidiFactory.eINSTANCE.createSongSelect());
		possibleCommands.put(EzmidiPackage.Literals.START_SONG,			EzmidiFactory.eINSTANCE.createStartSong());
		possibleCommands.put(EzmidiPackage.Literals.STOP_SONG,			EzmidiFactory.eINSTANCE.createStopSong());
		possibleCommands.put(EzmidiPackage.Literals.SYSTEM_EXCLUSIVE,	EzmidiFactory.eINSTANCE.createSystemExclusive());
		possibleCommands.put(EzmidiPackage.Literals.SYSTEM_RESET,		EzmidiFactory.eINSTANCE.createSystemReset());
	}
	
	public Cmd createRandomMidiCommand() {
		return new ArrayList<Cmd>(possibleCommands.values()).get(new Random().nextInt(possibleCommands.values().size()-1));
	}
	
	public DSLMidiMessage createMidiMessage(javax.sound.midi.MidiMessage midiMessage) {
		if (midiMessage instanceof ShortMessage) {
			ShortMessage shortMessage = (ShortMessage) midiMessage;
			switch(shortMessage.getCommand()) {
				case ShortMessage.NOTE_ON:
					return createNoteON(midiMessage);
				case ShortMessage.NOTE_OFF:
					return createNoteOFF(midiMessage);
				case ShortMessage.ACTIVE_SENSING:
					return createActiveSensing(midiMessage);
				case ShortMessage.CHANNEL_PRESSURE:
					return createChannelPressure(midiMessage);
				case ShortMessage.CONTROL_CHANGE:
					return createControllerChange(midiMessage);
				case ShortMessage.END_OF_EXCLUSIVE:
					return createEndOfExclusive(midiMessage);
				case ShortMessage.MIDI_TIME_CODE:
					return createTimeCode(midiMessage);
				case ShortMessage.PITCH_BEND:
					return createPitchBend(midiMessage);
				case ShortMessage.POLY_PRESSURE:
					return createPolyPressure(midiMessage);
				case ShortMessage.PROGRAM_CHANGE:
					return createProgramChange(midiMessage);
				case ShortMessage.SONG_POSITION_POINTER:
					return createSongPosition(midiMessage);
				case ShortMessage.SONG_SELECT:
					return createSongSelect(midiMessage);
				case ShortMessage.START:
					return createStartSong(midiMessage);
				case ShortMessage.CONTINUE:
					return createContinueSong(midiMessage);
				case ShortMessage.STOP:
					return createStopSong(midiMessage);
				case ShortMessage.SYSTEM_RESET:
					return createSystemReset(midiMessage);
				case ShortMessage.TIMING_CLOCK:
					return createTimingClock(midiMessage);
				case ShortMessage.TUNE_REQUEST:
					return createTuneRequest(midiMessage);
			};
		} else if (midiMessage instanceof MetaMessage) {
			// to consider later
		} else if (midiMessage instanceof SysexMessage) {
			return createSystemExclusive(midiMessage);
		}
		return null;
	}
	
	public DSLMidiMessage createMidiMessage(int id, byte b1, byte b2) {
		return createMidiMessage(id, 1, b1, b2);
	}
	
	public DSLMidiMessage createMidiMessage(int cmd, int channel, byte b1, byte b2) {
			int msgCmdId = (int)cmd & 0xff;

			if (msgCmdId == SysexMessage.SYSTEM_EXCLUSIVE) {
				SysexMessage msg = new SysexMessage();
				//msg.setMessage(msgCmdId, channel, b1, b2);
				return createSystemExclusive(msg);
			} else {
				ShortMessage msg = new ShortMessage();
				try {
					msg.setMessage(msgCmdId, channel, b1, b2);
				} catch (InvalidMidiDataException e) {
					e.printStackTrace();
				}
				switch(msgCmdId) {
					case ShortMessage.NOTE_ON:
						return createNoteON(msg);
					case ShortMessage.NOTE_OFF:
						return createNoteOFF(msg);
					case ShortMessage.ACTIVE_SENSING:
						return createActiveSensing(msg);
					case ShortMessage.CHANNEL_PRESSURE:
						return createChannelPressure(msg);
					case ShortMessage.CONTROL_CHANGE:
						return createControlChange(msg, b1, b2);
					case ShortMessage.END_OF_EXCLUSIVE:
						return createEndOfExclusive(msg);
					case ShortMessage.MIDI_TIME_CODE:
						return createTimeCode(msg);
					case ShortMessage.PITCH_BEND:
						return createPitchBend(msg);
					case ShortMessage.POLY_PRESSURE:
						return createPolyPressure(msg);
					case ShortMessage.PROGRAM_CHANGE:
						return createProgramChange(msg);
					case ShortMessage.SONG_POSITION_POINTER:
						return createSongPosition(msg);
					case ShortMessage.SONG_SELECT:
						return createSongSelect(msg);
					case ShortMessage.START:
						return createStartSong(msg);
					case ShortMessage.CONTINUE:
						return createContinueSong(msg);
					case ShortMessage.STOP:
						return createStopSong(msg);
					case ShortMessage.SYSTEM_RESET:
						return createSystemReset(msg);
					case ShortMessage.TIMING_CLOCK:
						return createTimingClock(msg);
					case ShortMessage.TUNE_REQUEST:
						return createTuneRequest(msg);
				};
			}
		/*} else if (midiMessage instanceof MetaMessage) {
			// to consider later
		} else if (midiMessage instanceof SysexMessage) {
			return createSystemExclusive(midiMessage);
		}*/
		return null;
	}
	
	public byte[] dumpLegacyMidiMessageStream(DSLMidiMessage message) {
		return new byte[] {(byte)message.getCmd(), message.getByte1(), message.getByte2(), (byte)message.getChannel()};
	}
	
	public byte[] dumpSysexMessage(net.sf.smbt.midi.ezmidi.SysexMessage message) {
		byte[] shortMessage = dumpLegacyMidiMessageStream((DSLMidiMessage) message);
		byte[] sysexMessage = new byte[shortMessage.length + (message.getMessage()==null?0:message.getMessage().length)];
		// copy short message 1st
		System.arraycopy(shortMessage, 0, sysexMessage, 0, 4);
		if (message.getMessage()!= null &&  message.getMessage().length > 0) {
			// copy sysex data if any
			System.arraycopy(message.getMessage(), 0, sysexMessage, 4, message.getMessage().length);
		}
		return sysexMessage;
	}
	
	public byte[] dumpMidiMessage(AbstractMidiCmd message) {
		if (message instanceof net.sf.smbt.midi.ezmidi.SysexMessage) {
			return dumpSysexMessage((net.sf.smbt.midi.ezmidi.SysexMessage) message);
		} else if (message instanceof DSLMidiMessage) {
			return dumpLegacyMidiMessageStream((DSLMidiMessage) message);
		} else if (message instanceof MetaMessage) {
		} 
		return new byte[0];
	}
	
	private void initDSLMessage(DSLMidiMessage dslMsg, MidiMessage midiMsg) {
		if (midiMsg instanceof ShortMessage) {
			dslMsg.setCmd(midiMsg.getMessage()[0]);
			dslMsg.setByte1(midiMsg.getMessage()[1]);
			dslMsg.setByte2(midiMsg.getMessage()[2]);
			dslMsg.setMessage(midiMsg.getMessage());
		}
	}
	
	public NoteON createNoteON(javax.sound.midi.MidiMessage midiMessage){
		NoteON message =  EzmidiFactory.eINSTANCE.createNoteON();
		initDSLMessage(message, midiMessage);
		message.setChannel(midiMessage.getMessage()[0]&0x0f);
		message.setNote(midiMessage.getMessage()[1]);
		message.setVelocity(midiMessage.getMessage()[2]);
		return message;
	};
	
	public NoteOFF createNoteOFF(javax.sound.midi.MidiMessage midiMessage){
		NoteOFF message =  EzmidiFactory.eINSTANCE.createNoteOFF();
		initDSLMessage(message, midiMessage);
		message.setChannel(midiMessage.getMessage()[0]&0x0f);
		message.setNote(midiMessage.getMessage()[1]);
		message.setVelocity(midiMessage.getMessage()[2]);
		return message;
	};
	
	public ActiveSensing createActiveSensing(javax.sound.midi.MidiMessage midiMessage){
		ActiveSensing message = EzmidiFactory.eINSTANCE.createActiveSensing();  
		initDSLMessage(message, midiMessage);
		return message;
	};
	
	public ChannelPressure createChannelPressure(javax.sound.midi.MidiMessage midiMessage){
		ChannelPressure message = EzmidiFactory.eINSTANCE.createChannelPressure();  
		initDSLMessage(message, midiMessage);
		message.setPressure(midiMessage.getMessage()[1]);
		return message;
	};
	
	public ContinueSong createContinueSong(javax.sound.midi.MidiMessage midiMessage){	
		ContinueSong message = EzmidiFactory.eINSTANCE.createContinueSong();  
		initDSLMessage(message, midiMessage);
		return message;
	};
	public ControllerChange createControllerChange(javax.sound.midi.MidiMessage midiMessage){
		return createControlChange(midiMessage, ((ShortMessage)midiMessage).getData1(), ((ShortMessage)midiMessage).getData2());
	}
	
	public ControllerChange createControlChange(javax.sound.midi.MidiMessage midiMessage, int controller, int value){
		ControllerChange message = EzmidiFactory.eINSTANCE.createControllerChange();  
		initDSLMessage(message, midiMessage);
		message.setController(controller);
		message.setValue(value);
		return message;
	};
	
	public EndOfExclusive createEndOfExclusive(javax.sound.midi.MidiMessage midiMessage){
		EndOfExclusive message = EzmidiFactory.eINSTANCE.createEndOfExclusive();  
		initDSLMessage(message, midiMessage);
		return message;
	};
	
	public KeyPressure createKeyPressure(javax.sound.midi.MidiMessage midiMessage){
		KeyPressure message = EzmidiFactory.eINSTANCE.createKeyPressure();  
		initDSLMessage(message, midiMessage);
		message.setPressure(midiMessage.getMessage()[1]);
		return message;
	};
	
	public PitchBend createPitchBend(javax.sound.midi.MidiMessage midiMessage){
		PitchBend message = EzmidiFactory.eINSTANCE.createPitchBend();  
		initDSLMessage(message, midiMessage);
		byte lsb = midiMessage.getMessage()[1];
		byte msb = midiMessage.getMessage()[2];
		message.setBend(lsb<<8 + msb);
		return message;
	};
	
	public ProgramChange createProgramChange(javax.sound.midi.MidiMessage midiMessage){
		ProgramChange message = EzmidiFactory.eINSTANCE.createProgramChange();  
		initDSLMessage(message, midiMessage);
		message.setPreset(midiMessage.getMessage()[1]);
		return message;
	};
	
	public SongPosition createSongPosition(javax.sound.midi.MidiMessage midiMessage){
		SongPosition message = EzmidiFactory.eINSTANCE.createSongPosition();  
		initDSLMessage(message, midiMessage);
		byte lsb = midiMessage.getMessage()[1];
		byte msb = midiMessage.getMessage()[2];
		message.setPosition(lsb<<8 + msb);
		return message;
	};
	
	public SongSelect createSongSelect(javax.sound.midi.MidiMessage midiMessage){
		SongSelect message = EzmidiFactory.eINSTANCE.createSongSelect();  
		initDSLMessage(message, midiMessage);
		return message;
	};
	
	public StartSong createStartSong(javax.sound.midi.MidiMessage midiMessage){
		StartSong message = EzmidiFactory.eINSTANCE.createStartSong();  
		initDSLMessage(message, midiMessage);
		return message;
	};
	
	public StopSong	createStopSong(javax.sound.midi.MidiMessage midiMessage){
		StopSong message = EzmidiFactory.eINSTANCE.createStopSong();  
		initDSLMessage(message, midiMessage);
		return message;
	};
	
	public PolyPressure	createPolyPressure(javax.sound.midi.MidiMessage midiMessage){
		PolyPressure message = EzmidiFactory.eINSTANCE.createPolyPressure();  
		initDSLMessage(message, midiMessage);
		return message;
	};
	
	public SystemExclusive createSystemExclusive(javax.sound.midi.MidiMessage midiMessage){
		SystemExclusive message = EzmidiFactory.eINSTANCE.createSystemExclusive();  
		if (midiMessage instanceof SysexMessage) {
			SysexMessage sysexMessage = (SysexMessage) midiMessage;
			message.setMessage(sysexMessage.getMessage());
			message.setMsgSize(sysexMessage.getLength());
		}
		return message;
	};
	
	public SystemReset	createSystemReset(javax.sound.midi.MidiMessage midiMessage){
		SystemReset message = EzmidiFactory.eINSTANCE.createSystemReset();  
		initDSLMessage(message, midiMessage);
		return message;
	};
	
	public TimeCode	createTimeCode(javax.sound.midi.MidiMessage midiMessage){
		TimeCode message = EzmidiFactory.eINSTANCE.createTimeCode();  
		initDSLMessage(message, midiMessage);
		return message;
	};
	
	public TimingTick createMidiTimingTick(javax.sound.midi.MidiMessage midiMessage){
		TimingTick message = EzmidiFactory.eINSTANCE.createTimingTick();  
		initDSLMessage(message, midiMessage);
		return message;
	};
	
	public TimingClock	createTimingClock(javax.sound.midi.MidiMessage midiMessage){
		TimingClock message = EzmidiFactory.eINSTANCE.createTimingClock();  
		initDSLMessage(message, midiMessage);
		return message;
	};
	
	public TuneRequest	createTuneRequest(javax.sound.midi.MidiMessage midiMessage){
		TuneRequest message = EzmidiFactory.eINSTANCE.createTuneRequest();  
		initDSLMessage(message, midiMessage);
		return message;
	};
	
	public UnofficialBusSelect	createUnoficialBusSelect(javax.sound.midi.MidiMessage midiMessage){
		UnofficialBusSelect message = EzmidiFactory.eINSTANCE.createUnofficialBusSelect();  
		initDSLMessage(message, midiMessage);
		message.setBusNumber(midiMessage.getMessage()[1]);
		return message;
	};
	
	public net.sf.smbt.midi.ezmidi.SysexMessage createSysexMessage(byte[] value) {
		net.sf.smbt.midi.ezmidi.SysexMessage message = EzmidiFactory.eINSTANCE.createSysexMessage();
		message.setMessage(value == null ? value = new byte[0] : value);
		message.setMsgSize(value.length);
		return message;
	}
	
	//
	// byte -> Midi
	//
	
	public MidiMessage translateMidiMessage(DSLMidiMessage msg) {
		return createMidiMessage(dumpMidiMessage(msg));
	}
	
	public MidiMessage createMidiMessage(byte[] frame) {
		MidiMessage msg = null;
		if (frame != null) {
			int id = (int) frame[0] & 0xFF;
			if (frame.length >= 3) {
				switch(id) {
					case ShortMessage.NOTE_ON:
					case ShortMessage.NOTE_OFF:
					case ShortMessage.ACTIVE_SENSING:
					case ShortMessage.CHANNEL_PRESSURE:
					case ShortMessage.CONTROL_CHANGE:
					case ShortMessage.END_OF_EXCLUSIVE:
					case ShortMessage.MIDI_TIME_CODE:
					case ShortMessage.PITCH_BEND:
					case ShortMessage.POLY_PRESSURE:
					case ShortMessage.PROGRAM_CHANGE:
					case ShortMessage.SONG_POSITION_POINTER:
					case ShortMessage.SONG_SELECT:
					case ShortMessage.START:
					case ShortMessage.CONTINUE:
					case ShortMessage.STOP:
					case ShortMessage.SYSTEM_RESET:
					case ShortMessage.TIMING_CLOCK:
					case ShortMessage.TUNE_REQUEST:
						ShortMessage sm = new ShortMessage();
						try {
							if (frame.length == 3) {
								sm.setMessage(id, 1, (int)frame[1], (int)frame[2]);
							} else {
								sm.setMessage(id, 1, (int)frame[1], (int)frame[2] /*, (int)frame[3]*/);
							}
						} catch (InvalidMidiDataException e) {
							e.printStackTrace();
						}
						msg = sm;
						break;
						//
					case SysexMessage.SYSTEM_EXCLUSIVE:
						SysexMessage ssx = new SysexMessage();
						try {
							ssx.setMessage(frame, frame.length);
						} catch (InvalidMidiDataException e) {
							e.printStackTrace();
						}
						msg = ssx;
						break;
				};
			} 
		}
		return msg;
	}
	
}
