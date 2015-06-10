/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.midi.ezmidi.impl;

import javax.sound.midi.MidiMessage;

import net.sf.smbt.midi.ezmidi.*;
import net.sf.smbt.midi.ezmidi.ActiveSensing;
import net.sf.smbt.midi.ezmidi.ChannelPressure;
import net.sf.smbt.midi.ezmidi.ContinueSong;
import net.sf.smbt.midi.ezmidi.ControllerChange;
import net.sf.smbt.midi.ezmidi.DSLMidiMessage;
import net.sf.smbt.midi.ezmidi.EndOfExclusive;
import net.sf.smbt.midi.ezmidi.EzmidiFactory;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzmidiFactoryImpl extends EFactoryImpl implements EzmidiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EzmidiFactory init() {
		try {
			EzmidiFactory theEzmidiFactory = (EzmidiFactory)EPackage.Registry.INSTANCE.getEFactory("http://ezmidi/1.0"); 
			if (theEzmidiFactory != null) {
				return theEzmidiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EzmidiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzmidiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EzmidiPackage.SYSEX_GS_RESET: return createSysexGSReset();
			case EzmidiPackage.SYSEX_PATCH_CHANGED: return createSysexPatchChanged();
			case EzmidiPackage.DSL_MIDI_MESSAGE: return createDSLMidiMessage();
			case EzmidiPackage.NOTE_ON: return createNoteON();
			case EzmidiPackage.NOTE_OFF: return createNoteOFF();
			case EzmidiPackage.KEY_PRESSURE: return createKeyPressure();
			case EzmidiPackage.CONTROLLER_CHANGE: return createControllerChange();
			case EzmidiPackage.PROGRAM_CHANGE: return createProgramChange();
			case EzmidiPackage.CHANNEL_PRESSURE: return createChannelPressure();
			case EzmidiPackage.PITCH_BEND: return createPitchBend();
			case EzmidiPackage.SYSTEM_EXCLUSIVE: return createSystemExclusive();
			case EzmidiPackage.SONG_POSITION: return createSongPosition();
			case EzmidiPackage.SONG_SELECT: return createSongSelect();
			case EzmidiPackage.UNOFFICIAL_BUS_SELECT: return createUnofficialBusSelect();
			case EzmidiPackage.TUNE_REQUEST: return createTuneRequest();
			case EzmidiPackage.END_OF_EXCLUSIVE: return createEndOfExclusive();
			case EzmidiPackage.TIMING_TICK: return createTimingTick();
			case EzmidiPackage.START_SONG: return createStartSong();
			case EzmidiPackage.CONTINUE_SONG: return createContinueSong();
			case EzmidiPackage.STOP_SONG: return createStopSong();
			case EzmidiPackage.ACTIVE_SENSING: return createActiveSensing();
			case EzmidiPackage.SYSTEM_RESET: return createSystemReset();
			case EzmidiPackage.MIDI_TIME_CODE: return createMidiTimeCode();
			case EzmidiPackage.POLY_PRESSURE: return createPolyPressure();
			case EzmidiPackage.TIMING_CLOCK: return createTimingClock();
			case EzmidiPackage.TIME_CODE: return createTimeCode();
			case EzmidiPackage.SYSEX_MESSAGE: return createSysexMessage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EzmidiPackage.CONTROLLER_CHANGE_VALUES:
				return createCONTROLLER_CHANGE_VALUESFromString(eDataType, initialValue);
			case EzmidiPackage.MIDI_MESSAGE:
				return createMidiMessageFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EzmidiPackage.CONTROLLER_CHANGE_VALUES:
				return convertCONTROLLER_CHANGE_VALUESToString(eDataType, instanceValue);
			case EzmidiPackage.MIDI_MESSAGE:
				return convertMidiMessageToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysexMessage createSysexMessage() {
		SysexMessageImpl sysexMessage = new SysexMessageImpl();
		return sysexMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CONTROLLER_CHANGE_VALUES createCONTROLLER_CHANGE_VALUESFromString(EDataType eDataType, String initialValue) {
		CONTROLLER_CHANGE_VALUES result = CONTROLLER_CHANGE_VALUES.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCONTROLLER_CHANGE_VALUESToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysexGSReset createSysexGSReset() {
		SysexGSResetImpl sysexGSReset = new SysexGSResetImpl();
		return sysexGSReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysexPatchChanged createSysexPatchChanged() {
		SysexPatchChangedImpl sysexPatchChanged = new SysexPatchChangedImpl();
		return sysexPatchChanged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSLMidiMessage createDSLMidiMessage() {
		DSLMidiMessageImpl dslMidiMessage = new DSLMidiMessageImpl();
		return dslMidiMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteON createNoteON() {
		NoteONImpl noteON = new NoteONImpl();
		return noteON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteOFF createNoteOFF() {
		NoteOFFImpl noteOFF = new NoteOFFImpl();
		return noteOFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyPressure createKeyPressure() {
		KeyPressureImpl keyPressure = new KeyPressureImpl();
		return keyPressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerChange createControllerChange() {
		ControllerChangeImpl controllerChange = new ControllerChangeImpl();
		return controllerChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramChange createProgramChange() {
		ProgramChangeImpl programChange = new ProgramChangeImpl();
		return programChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelPressure createChannelPressure() {
		ChannelPressureImpl channelPressure = new ChannelPressureImpl();
		return channelPressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PitchBend createPitchBend() {
		PitchBendImpl pitchBend = new PitchBendImpl();
		return pitchBend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemExclusive createSystemExclusive() {
		SystemExclusiveImpl systemExclusive = new SystemExclusiveImpl();
		return systemExclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SongPosition createSongPosition() {
		SongPositionImpl songPosition = new SongPositionImpl();
		return songPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SongSelect createSongSelect() {
		SongSelectImpl songSelect = new SongSelectImpl();
		return songSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnofficialBusSelect createUnofficialBusSelect() {
		UnofficialBusSelectImpl unofficialBusSelect = new UnofficialBusSelectImpl();
		return unofficialBusSelect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuneRequest createTuneRequest() {
		TuneRequestImpl tuneRequest = new TuneRequestImpl();
		return tuneRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndOfExclusive createEndOfExclusive() {
		EndOfExclusiveImpl endOfExclusive = new EndOfExclusiveImpl();
		return endOfExclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingTick createTimingTick() {
		TimingTickImpl timingTick = new TimingTickImpl();
		return timingTick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartSong createStartSong() {
		StartSongImpl startSong = new StartSongImpl();
		return startSong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinueSong createContinueSong() {
		ContinueSongImpl continueSong = new ContinueSongImpl();
		return continueSong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopSong createStopSong() {
		StopSongImpl stopSong = new StopSongImpl();
		return stopSong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActiveSensing createActiveSensing() {
		ActiveSensingImpl activeSensing = new ActiveSensingImpl();
		return activeSensing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemReset createSystemReset() {
		SystemResetImpl systemReset = new SystemResetImpl();
		return systemReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiTimeCode createMidiTimeCode() {
		MidiTimeCodeImpl midiTimeCode = new MidiTimeCodeImpl();
		return midiTimeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolyPressure createPolyPressure() {
		PolyPressureImpl polyPressure = new PolyPressureImpl();
		return polyPressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingClock createTimingClock() {
		TimingClockImpl timingClock = new TimingClockImpl();
		return timingClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeCode createTimeCode() {
		TimeCodeImpl timeCode = new TimeCodeImpl();
		return timeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MidiMessage createMidiMessageFromString(EDataType eDataType, String initialValue) {
		return (MidiMessage)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMidiMessageToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzmidiPackage getEzmidiPackage() {
		return (EzmidiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EzmidiPackage getPackage() {
		return EzmidiPackage.eINSTANCE;
	}

} //EzmidiFactoryImpl
