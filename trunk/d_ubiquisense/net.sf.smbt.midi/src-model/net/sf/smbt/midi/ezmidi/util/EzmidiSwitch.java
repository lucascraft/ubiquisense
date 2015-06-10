/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.midi.ezmidi.util;

import java.util.List;

import net.sf.smbt.midi.ezmidi.*;
import net.sf.smbt.midi.ezmidi.AbstractMidiCmd;
import net.sf.smbt.midi.ezmidi.ActiveSensing;
import net.sf.smbt.midi.ezmidi.ChannelPressure;
import net.sf.smbt.midi.ezmidi.ContinueSong;
import net.sf.smbt.midi.ezmidi.ControllerChange;
import net.sf.smbt.midi.ezmidi.DSLMidiMessage;
import net.sf.smbt.midi.ezmidi.EndOfExclusive;
import net.sf.smbt.midi.ezmidi.EzmidiPackage;
import net.sf.smbt.midi.ezmidi.KeyPressure;
import net.sf.smbt.midi.ezmidi.MidiTimeCode;
import net.sf.smbt.midi.ezmidi.NoteOFF;
import net.sf.smbt.midi.ezmidi.NoteON;
import net.sf.smbt.midi.ezmidi.PitchBend;
import net.sf.smbt.midi.ezmidi.PolyPressure;
import net.sf.smbt.midi.ezmidi.ProgramChange;
import net.sf.smbt.midi.ezmidi.SongPosition;
import net.sf.smbt.midi.ezmidi.SongSelect;
import net.sf.smbt.midi.ezmidi.StartSong;
import net.sf.smbt.midi.ezmidi.StopSong;
import net.sf.smbt.midi.ezmidi.SysexGSReset;
import net.sf.smbt.midi.ezmidi.SysexMessage;
import net.sf.smbt.midi.ezmidi.SysexPatchChanged;
import net.sf.smbt.midi.ezmidi.SystemExclusive;
import net.sf.smbt.midi.ezmidi.SystemReset;
import net.sf.smbt.midi.ezmidi.TimeCode;
import net.sf.smbt.midi.ezmidi.TimingClock;
import net.sf.smbt.midi.ezmidi.TimingTick;
import net.sf.smbt.midi.ezmidi.TuneRequest;
import net.sf.smbt.midi.ezmidi.UnofficialBusSelect;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.midi.ezmidi.EzmidiPackage
 * @generated
 */
public class EzmidiSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzmidiPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzmidiSwitch() {
		if (modelPackage == null) {
			modelPackage = EzmidiPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EzmidiPackage.ABSTRACT_MIDI_CMD: {
				AbstractMidiCmd abstractMidiCmd = (AbstractMidiCmd)theEObject;
				T result = caseAbstractMidiCmd(abstractMidiCmd);
				if (result == null) result = caseCmd(abstractMidiCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmidiPackage.SYSEX_GS_RESET: {
				SysexGSReset sysexGSReset = (SysexGSReset)theEObject;
				T result = caseSysexGSReset(sysexGSReset);
				if (result == null) result = caseSysexMessage(sysexGSReset);
				if (result == null) result = caseDSLMidiMessage(sysexGSReset);
				if (result == null) result = caseAbstractMidiCmd(sysexGSReset);
				if (result == null) result = caseCmd(sysexGSReset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmidiPackage.SYSEX_PATCH_CHANGED: {
				SysexPatchChanged sysexPatchChanged = (SysexPatchChanged)theEObject;
				T result = caseSysexPatchChanged(sysexPatchChanged);
				if (result == null) result = caseSysexMessage(sysexPatchChanged);
				if (result == null) result = caseDSLMidiMessage(sysexPatchChanged);
				if (result == null) result = caseAbstractMidiCmd(sysexPatchChanged);
				if (result == null) result = caseCmd(sysexPatchChanged);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmidiPackage.DSL_MIDI_MESSAGE: {
				DSLMidiMessage dslMidiMessage = (DSLMidiMessage)theEObject;
				T result = caseDSLMidiMessage(dslMidiMessage);
				if (result == null) result = caseAbstractMidiCmd(dslMidiMessage);
				if (result == null) result = caseCmd(dslMidiMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmidiPackage.NOTE_ON: {
				NoteON noteON = (NoteON)theEObject;
				T result = caseNoteON(noteON);
				if (result == null) result = caseDSLMidiMessage(noteON);
				if (result == null) result = caseAbstractMidiCmd(noteON);
				if (result == null) result = caseCmd(noteON);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmidiPackage.NOTE_OFF: {
				NoteOFF noteOFF = (NoteOFF)theEObject;
				T result = caseNoteOFF(noteOFF);
				if (result == null) result = caseDSLMidiMessage(noteOFF);
				if (result == null) result = caseAbstractMidiCmd(noteOFF);
				if (result == null) result = caseCmd(noteOFF);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmidiPackage.KEY_PRESSURE: {
				KeyPressure keyPressure = (KeyPressure)theEObject;
				T result = caseKeyPressure(keyPressure);
				if (result == null) result = caseDSLMidiMessage(keyPressure);
				if (result == null) result = caseAbstractMidiCmd(keyPressure);
				if (result == null) result = caseCmd(keyPressure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmidiPackage.CONTROLLER_CHANGE: {
				ControllerChange controllerChange = (ControllerChange)theEObject;
				T result = caseControllerChange(controllerChange);
				if (result == null) result = caseDSLMidiMessage(controllerChange);
				if (result == null) result = caseAbstractMidiCmd(controllerChange);
				if (result == null) result = caseCmd(controllerChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmidiPackage.PROGRAM_CHANGE: {
				ProgramChange programChange = (ProgramChange)theEObject;
				T result = caseProgramChange(programChange);
				if (result == null) result = caseDSLMidiMessage(programChange);
				if (result == null) result = caseAbstractMidiCmd(programChange);
				if (result == null) result = caseCmd(programChange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmidiPackage.CHANNEL_PRESSURE: {
				ChannelPressure channelPressure = (ChannelPressure)theEObject;
				T result = caseChannelPressure(channelPressure);
				if (result == null) result = caseDSLMidiMessage(channelPressure);
				if (result == null) result = caseAbstractMidiCmd(channelPressure);
				if (result == null) result = caseCmd(channelPressure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmidiPackage.PITCH_BEND: {
				PitchBend pitchBend = (PitchBend)theEObject;
				T result = casePitchBend(pitchBend);
				if (result == null) result = caseDSLMidiMessage(pitchBend);
				if (result == null) result = caseAbstractMidiCmd(pitchBend);
				if (result == null) result = caseCmd(pitchBend);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmidiPackage.SYSTEM_EXCLUSIVE: {
				SystemExclusive systemExclusive = (SystemExclusive)theEObject;
				T result = caseSystemExclusive(systemExclusive);
				if (result == null) result = caseDSLMidiMessage(systemExclusive);
				if (result == null) result = caseAbstractMidiCmd(systemExclusive);
				if (result == null) result = caseCmd(systemExclusive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmidiPackage.SONG_POSITION: {
				SongPosition songPosition = (SongPosition)theEObject;
				T result = caseSongPosition(songPosition);
				if (result == null) result = caseDSLMidiMessage(songPosition);
				if (result == null) result = caseAbstractMidiCmd(songPosition);
				if (result == null) result = caseCmd(songPosition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmidiPackage.SONG_SELECT: {
				SongSelect songSelect = (SongSelect)theEObject;
				T result = caseSongSelect(songSelect);
				if (result == null) result = caseDSLMidiMessage(songSelect);
				if (result == null) result = caseAbstractMidiCmd(songSelect);
				if (result == null) result = caseCmd(songSelect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmidiPackage.UNOFFICIAL_BUS_SELECT: {
				UnofficialBusSelect unofficialBusSelect = (UnofficialBusSelect)theEObject;
				T result = caseUnofficialBusSelect(unofficialBusSelect);
				if (result == null) result = caseDSLMidiMessage(unofficialBusSelect);
				if (result == null) result = caseAbstractMidiCmd(unofficialBusSelect);
				if (result == null) result = caseCmd(unofficialBusSelect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmidiPackage.TUNE_REQUEST: {
				TuneRequest tuneRequest = (TuneRequest)theEObject;
				T result = caseTuneRequest(tuneRequest);
				if (result == null) result = caseDSLMidiMessage(tuneRequest);
				if (result == null) result = caseAbstractMidiCmd(tuneRequest);
				if (result == null) result = caseCmd(tuneRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmidiPackage.END_OF_EXCLUSIVE: {
				EndOfExclusive endOfExclusive = (EndOfExclusive)theEObject;
				T result = caseEndOfExclusive(endOfExclusive);
				if (result == null) result = caseDSLMidiMessage(endOfExclusive);
				if (result == null) result = caseAbstractMidiCmd(endOfExclusive);
				if (result == null) result = caseCmd(endOfExclusive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmidiPackage.TIMING_TICK: {
				TimingTick timingTick = (TimingTick)theEObject;
				T result = caseTimingTick(timingTick);
				if (result == null) result = caseDSLMidiMessage(timingTick);
				if (result == null) result = caseAbstractMidiCmd(timingTick);
				if (result == null) result = caseCmd(timingTick);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmidiPackage.START_SONG: {
				StartSong startSong = (StartSong)theEObject;
				T result = caseStartSong(startSong);
				if (result == null) result = caseDSLMidiMessage(startSong);
				if (result == null) result = caseAbstractMidiCmd(startSong);
				if (result == null) result = caseCmd(startSong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmidiPackage.CONTINUE_SONG: {
				ContinueSong continueSong = (ContinueSong)theEObject;
				T result = caseContinueSong(continueSong);
				if (result == null) result = caseDSLMidiMessage(continueSong);
				if (result == null) result = caseAbstractMidiCmd(continueSong);
				if (result == null) result = caseCmd(continueSong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmidiPackage.STOP_SONG: {
				StopSong stopSong = (StopSong)theEObject;
				T result = caseStopSong(stopSong);
				if (result == null) result = caseDSLMidiMessage(stopSong);
				if (result == null) result = caseAbstractMidiCmd(stopSong);
				if (result == null) result = caseCmd(stopSong);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmidiPackage.ACTIVE_SENSING: {
				ActiveSensing activeSensing = (ActiveSensing)theEObject;
				T result = caseActiveSensing(activeSensing);
				if (result == null) result = caseDSLMidiMessage(activeSensing);
				if (result == null) result = caseAbstractMidiCmd(activeSensing);
				if (result == null) result = caseCmd(activeSensing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmidiPackage.SYSTEM_RESET: {
				SystemReset systemReset = (SystemReset)theEObject;
				T result = caseSystemReset(systemReset);
				if (result == null) result = caseDSLMidiMessage(systemReset);
				if (result == null) result = caseAbstractMidiCmd(systemReset);
				if (result == null) result = caseCmd(systemReset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmidiPackage.MIDI_TIME_CODE: {
				MidiTimeCode midiTimeCode = (MidiTimeCode)theEObject;
				T result = caseMidiTimeCode(midiTimeCode);
				if (result == null) result = caseDSLMidiMessage(midiTimeCode);
				if (result == null) result = caseAbstractMidiCmd(midiTimeCode);
				if (result == null) result = caseCmd(midiTimeCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmidiPackage.POLY_PRESSURE: {
				PolyPressure polyPressure = (PolyPressure)theEObject;
				T result = casePolyPressure(polyPressure);
				if (result == null) result = caseDSLMidiMessage(polyPressure);
				if (result == null) result = caseAbstractMidiCmd(polyPressure);
				if (result == null) result = caseCmd(polyPressure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmidiPackage.TIMING_CLOCK: {
				TimingClock timingClock = (TimingClock)theEObject;
				T result = caseTimingClock(timingClock);
				if (result == null) result = caseDSLMidiMessage(timingClock);
				if (result == null) result = caseAbstractMidiCmd(timingClock);
				if (result == null) result = caseCmd(timingClock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmidiPackage.TIME_CODE: {
				TimeCode timeCode = (TimeCode)theEObject;
				T result = caseTimeCode(timeCode);
				if (result == null) result = caseDSLMidiMessage(timeCode);
				if (result == null) result = caseAbstractMidiCmd(timeCode);
				if (result == null) result = caseCmd(timeCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmidiPackage.SYSEX_MESSAGE: {
				SysexMessage sysexMessage = (SysexMessage)theEObject;
				T result = caseSysexMessage(sysexMessage);
				if (result == null) result = caseDSLMidiMessage(sysexMessage);
				if (result == null) result = caseAbstractMidiCmd(sysexMessage);
				if (result == null) result = caseCmd(sysexMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Midi Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Midi Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMidiCmd(AbstractMidiCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sysex Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sysex Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSysexMessage(SysexMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sysex GS Reset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sysex GS Reset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSysexGSReset(SysexGSReset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sysex Patch Changed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sysex Patch Changed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSysexPatchChanged(SysexPatchChanged object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DSL Midi Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DSL Midi Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSLMidiMessage(DSLMidiMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note ON</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note ON</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoteON(NoteON object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note OFF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note OFF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoteOFF(NoteOFF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Pressure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Pressure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyPressure(KeyPressure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllerChange(ControllerChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program Change</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program Change</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramChange(ProgramChange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel Pressure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel Pressure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannelPressure(ChannelPressure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pitch Bend</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pitch Bend</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePitchBend(PitchBend object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Exclusive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Exclusive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemExclusive(SystemExclusive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Song Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Song Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSongPosition(SongPosition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Song Select</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Song Select</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSongSelect(SongSelect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unofficial Bus Select</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unofficial Bus Select</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnofficialBusSelect(UnofficialBusSelect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tune Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tune Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuneRequest(TuneRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Of Exclusive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Of Exclusive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndOfExclusive(EndOfExclusive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing Tick</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing Tick</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingTick(TimingTick object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Song</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Song</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartSong(StartSong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continue Song</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continue Song</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinueSong(ContinueSong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Song</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Song</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopSong(StopSong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Active Sensing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Active Sensing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActiveSensing(ActiveSensing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Reset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Reset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemReset(SystemReset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Midi Time Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Midi Time Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMidiTimeCode(MidiTimeCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Poly Pressure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Poly Pressure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolyPressure(PolyPressure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timing Clock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timing Clock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimingClock(TimingClock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeCode(TimeCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmd(Cmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EzmidiSwitch
