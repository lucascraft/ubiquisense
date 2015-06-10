/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.midi.ezmidi.impl;

import javax.sound.midi.MidiMessage;

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
import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzmidiPackageImpl extends EPackageImpl implements EzmidiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMidiCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sysexMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controlleR_CHANGE_VALUESEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sysexGSResetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sysexPatchChangedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslMidiMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteONEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteOFFEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyPressureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelPressureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pitchBendEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemExclusiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass songPositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass songSelectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unofficialBusSelectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuneRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endOfExclusiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingTickEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startSongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continueSongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopSongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activeSensingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemResetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass midiTimeCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polyPressureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingClockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType midiMessageEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.sf.smbt.midi.ezmidi.EzmidiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EzmidiPackageImpl() {
		super(eNS_URI, EzmidiFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EzmidiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EzmidiPackage init() {
		if (isInited) return (EzmidiPackage)EPackage.Registry.INSTANCE.getEPackage(EzmidiPackage.eNS_URI);

		// Obtain or create and register package
		EzmidiPackageImpl theEzmidiPackage = (EzmidiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EzmidiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EzmidiPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEzmidiPackage.createPackageContents();

		// Initialize created meta-data
		theEzmidiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEzmidiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EzmidiPackage.eNS_URI, theEzmidiPackage);
		return theEzmidiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractMidiCmd() {
		return abstractMidiCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractMidiCmd_Addr() {
		return (EAttribute)abstractMidiCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractMidiCmd_MsgSize() {
		return (EAttribute)abstractMidiCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractMidiCmd_Byte1() {
		return (EAttribute)abstractMidiCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractMidiCmd_Byte2() {
		return (EAttribute)abstractMidiCmdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractMidiCmd_Message() {
		return (EAttribute)abstractMidiCmdEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSysexMessage() {
		return sysexMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCONTROLLER_CHANGE_VALUES() {
		return controlleR_CHANGE_VALUESEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSysexGSReset() {
		return sysexGSResetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSysexPatchChanged() {
		return sysexPatchChangedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSLMidiMessage() {
		return dslMidiMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSLMidiMessage_Channel() {
		return (EAttribute)dslMidiMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSLMidiMessage_Cmd() {
		return (EAttribute)dslMidiMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMidiMessage() {
		return midiMessageEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoteON() {
		return noteONEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteON_Note() {
		return (EAttribute)noteONEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteON_Velocity() {
		return (EAttribute)noteONEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteON_Pitch() {
		return (EAttribute)noteONEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoteOFF() {
		return noteOFFEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteOFF_Note() {
		return (EAttribute)noteOFFEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteOFF_Velocity() {
		return (EAttribute)noteOFFEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteOFF_Pitch() {
		return (EAttribute)noteOFFEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyPressure() {
		return keyPressureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyPressure_Key() {
		return (EAttribute)keyPressureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyPressure_Pressure() {
		return (EAttribute)keyPressureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllerChange() {
		return controllerChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerChange_Value() {
		return (EAttribute)controllerChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControllerChange_Controller() {
		return (EAttribute)controllerChangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramChange() {
		return programChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramChange_Preset() {
		return (EAttribute)programChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannelPressure() {
		return channelPressureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelPressure_Pressure() {
		return (EAttribute)channelPressureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPitchBend() {
		return pitchBendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPitchBend_Bend() {
		return (EAttribute)pitchBendEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemExclusive() {
		return systemExclusiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSongPosition() {
		return songPositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSongPosition_Position() {
		return (EAttribute)songPositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSongSelect() {
		return songSelectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSongSelect_SongNumber() {
		return (EAttribute)songSelectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnofficialBusSelect() {
		return unofficialBusSelectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnofficialBusSelect_BusNumber() {
		return (EAttribute)unofficialBusSelectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuneRequest() {
		return tuneRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndOfExclusive() {
		return endOfExclusiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimingTick() {
		return timingTickEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartSong() {
		return startSongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinueSong() {
		return continueSongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStopSong() {
		return stopSongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActiveSensing() {
		return activeSensingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemReset() {
		return systemResetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMidiTimeCode() {
		return midiTimeCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolyPressure() {
		return polyPressureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolyPressure_Note() {
		return (EAttribute)polyPressureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPolyPressure_Pressure() {
		return (EAttribute)polyPressureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimingClock() {
		return timingClockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeCode() {
		return timeCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzmidiFactory getEzmidiFactory() {
		return (EzmidiFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractMidiCmdEClass = createEClass(ABSTRACT_MIDI_CMD);
		createEAttribute(abstractMidiCmdEClass, ABSTRACT_MIDI_CMD__ADDR);
		createEAttribute(abstractMidiCmdEClass, ABSTRACT_MIDI_CMD__MSG_SIZE);
		createEAttribute(abstractMidiCmdEClass, ABSTRACT_MIDI_CMD__BYTE1);
		createEAttribute(abstractMidiCmdEClass, ABSTRACT_MIDI_CMD__BYTE2);
		createEAttribute(abstractMidiCmdEClass, ABSTRACT_MIDI_CMD__MESSAGE);

		sysexGSResetEClass = createEClass(SYSEX_GS_RESET);

		sysexPatchChangedEClass = createEClass(SYSEX_PATCH_CHANGED);

		dslMidiMessageEClass = createEClass(DSL_MIDI_MESSAGE);
		createEAttribute(dslMidiMessageEClass, DSL_MIDI_MESSAGE__CHANNEL);
		createEAttribute(dslMidiMessageEClass, DSL_MIDI_MESSAGE__CMD);

		noteONEClass = createEClass(NOTE_ON);
		createEAttribute(noteONEClass, NOTE_ON__NOTE);
		createEAttribute(noteONEClass, NOTE_ON__VELOCITY);
		createEAttribute(noteONEClass, NOTE_ON__PITCH);

		noteOFFEClass = createEClass(NOTE_OFF);
		createEAttribute(noteOFFEClass, NOTE_OFF__NOTE);
		createEAttribute(noteOFFEClass, NOTE_OFF__VELOCITY);
		createEAttribute(noteOFFEClass, NOTE_OFF__PITCH);

		keyPressureEClass = createEClass(KEY_PRESSURE);
		createEAttribute(keyPressureEClass, KEY_PRESSURE__KEY);
		createEAttribute(keyPressureEClass, KEY_PRESSURE__PRESSURE);

		controllerChangeEClass = createEClass(CONTROLLER_CHANGE);
		createEAttribute(controllerChangeEClass, CONTROLLER_CHANGE__VALUE);
		createEAttribute(controllerChangeEClass, CONTROLLER_CHANGE__CONTROLLER);

		programChangeEClass = createEClass(PROGRAM_CHANGE);
		createEAttribute(programChangeEClass, PROGRAM_CHANGE__PRESET);

		channelPressureEClass = createEClass(CHANNEL_PRESSURE);
		createEAttribute(channelPressureEClass, CHANNEL_PRESSURE__PRESSURE);

		pitchBendEClass = createEClass(PITCH_BEND);
		createEAttribute(pitchBendEClass, PITCH_BEND__BEND);

		systemExclusiveEClass = createEClass(SYSTEM_EXCLUSIVE);

		songPositionEClass = createEClass(SONG_POSITION);
		createEAttribute(songPositionEClass, SONG_POSITION__POSITION);

		songSelectEClass = createEClass(SONG_SELECT);
		createEAttribute(songSelectEClass, SONG_SELECT__SONG_NUMBER);

		unofficialBusSelectEClass = createEClass(UNOFFICIAL_BUS_SELECT);
		createEAttribute(unofficialBusSelectEClass, UNOFFICIAL_BUS_SELECT__BUS_NUMBER);

		tuneRequestEClass = createEClass(TUNE_REQUEST);

		endOfExclusiveEClass = createEClass(END_OF_EXCLUSIVE);

		timingTickEClass = createEClass(TIMING_TICK);

		startSongEClass = createEClass(START_SONG);

		continueSongEClass = createEClass(CONTINUE_SONG);

		stopSongEClass = createEClass(STOP_SONG);

		activeSensingEClass = createEClass(ACTIVE_SENSING);

		systemResetEClass = createEClass(SYSTEM_RESET);

		midiTimeCodeEClass = createEClass(MIDI_TIME_CODE);

		polyPressureEClass = createEClass(POLY_PRESSURE);
		createEAttribute(polyPressureEClass, POLY_PRESSURE__NOTE);
		createEAttribute(polyPressureEClass, POLY_PRESSURE__PRESSURE);

		timingClockEClass = createEClass(TIMING_CLOCK);

		timeCodeEClass = createEClass(TIME_CODE);

		sysexMessageEClass = createEClass(SYSEX_MESSAGE);

		// Create enums
		controlleR_CHANGE_VALUESEEnum = createEEnum(CONTROLLER_CHANGE_VALUES);

		// Create data types
		midiMessageEDataType = createEDataType(MIDI_MESSAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CmdPackage theCmdPackage = (CmdPackage)EPackage.Registry.INSTANCE.getEPackage(CmdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractMidiCmdEClass.getESuperTypes().add(theCmdPackage.getCmd());
		sysexGSResetEClass.getESuperTypes().add(this.getSysexMessage());
		sysexPatchChangedEClass.getESuperTypes().add(this.getSysexMessage());
		dslMidiMessageEClass.getESuperTypes().add(this.getAbstractMidiCmd());
		noteONEClass.getESuperTypes().add(this.getDSLMidiMessage());
		noteOFFEClass.getESuperTypes().add(this.getDSLMidiMessage());
		keyPressureEClass.getESuperTypes().add(this.getDSLMidiMessage());
		controllerChangeEClass.getESuperTypes().add(this.getDSLMidiMessage());
		programChangeEClass.getESuperTypes().add(this.getDSLMidiMessage());
		channelPressureEClass.getESuperTypes().add(this.getDSLMidiMessage());
		pitchBendEClass.getESuperTypes().add(this.getDSLMidiMessage());
		systemExclusiveEClass.getESuperTypes().add(this.getDSLMidiMessage());
		songPositionEClass.getESuperTypes().add(this.getDSLMidiMessage());
		songSelectEClass.getESuperTypes().add(this.getDSLMidiMessage());
		unofficialBusSelectEClass.getESuperTypes().add(this.getDSLMidiMessage());
		tuneRequestEClass.getESuperTypes().add(this.getDSLMidiMessage());
		endOfExclusiveEClass.getESuperTypes().add(this.getDSLMidiMessage());
		timingTickEClass.getESuperTypes().add(this.getDSLMidiMessage());
		startSongEClass.getESuperTypes().add(this.getDSLMidiMessage());
		continueSongEClass.getESuperTypes().add(this.getDSLMidiMessage());
		stopSongEClass.getESuperTypes().add(this.getDSLMidiMessage());
		activeSensingEClass.getESuperTypes().add(this.getDSLMidiMessage());
		systemResetEClass.getESuperTypes().add(this.getDSLMidiMessage());
		midiTimeCodeEClass.getESuperTypes().add(this.getDSLMidiMessage());
		polyPressureEClass.getESuperTypes().add(this.getDSLMidiMessage());
		timingClockEClass.getESuperTypes().add(this.getDSLMidiMessage());
		timeCodeEClass.getESuperTypes().add(this.getDSLMidiMessage());
		sysexMessageEClass.getESuperTypes().add(this.getDSLMidiMessage());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractMidiCmdEClass, AbstractMidiCmd.class, "AbstractMidiCmd", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractMidiCmd_Addr(), ecorePackage.getEByte(), "addr", null, 0, 1, AbstractMidiCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractMidiCmd_MsgSize(), ecorePackage.getEInt(), "msgSize", null, 0, 1, AbstractMidiCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractMidiCmd_Byte1(), ecorePackage.getEByte(), "byte1", null, 0, 1, AbstractMidiCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractMidiCmd_Byte2(), ecorePackage.getEByte(), "byte2", null, 0, 1, AbstractMidiCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractMidiCmd_Message(), ecorePackage.getEByteArray(), "message", null, 0, 1, AbstractMidiCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sysexGSResetEClass, SysexGSReset.class, "SysexGSReset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sysexPatchChangedEClass, SysexPatchChanged.class, "SysexPatchChanged", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dslMidiMessageEClass, DSLMidiMessage.class, "DSLMidiMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDSLMidiMessage_Channel(), ecorePackage.getEInt(), "channel", null, 0, 1, DSLMidiMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSLMidiMessage_Cmd(), ecorePackage.getEInt(), "cmd", null, 0, 1, DSLMidiMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noteONEClass, NoteON.class, "NoteON", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNoteON_Note(), ecorePackage.getEInt(), "note", null, 0, 1, NoteON.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNoteON_Velocity(), ecorePackage.getEInt(), "velocity", null, 0, 1, NoteON.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNoteON_Pitch(), ecorePackage.getEInt(), "pitch", null, 0, 1, NoteON.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noteOFFEClass, NoteOFF.class, "NoteOFF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNoteOFF_Note(), ecorePackage.getEInt(), "note", null, 0, 1, NoteOFF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNoteOFF_Velocity(), ecorePackage.getEInt(), "velocity", null, 0, 1, NoteOFF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNoteOFF_Pitch(), ecorePackage.getEInt(), "pitch", null, 0, 1, NoteOFF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyPressureEClass, KeyPressure.class, "KeyPressure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyPressure_Key(), ecorePackage.getEInt(), "key", null, 0, 1, KeyPressure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyPressure_Pressure(), ecorePackage.getEInt(), "pressure", null, 0, 1, KeyPressure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerChangeEClass, ControllerChange.class, "ControllerChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControllerChange_Value(), ecorePackage.getEInt(), "value", null, 0, 1, ControllerChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControllerChange_Controller(), ecorePackage.getEInt(), "controller", null, 0, 1, ControllerChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programChangeEClass, ProgramChange.class, "ProgramChange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgramChange_Preset(), ecorePackage.getEInt(), "preset", null, 0, 1, ProgramChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelPressureEClass, ChannelPressure.class, "ChannelPressure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChannelPressure_Pressure(), ecorePackage.getEInt(), "pressure", null, 0, 1, ChannelPressure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pitchBendEClass, PitchBend.class, "PitchBend", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPitchBend_Bend(), ecorePackage.getEInt(), "bend", null, 0, 1, PitchBend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemExclusiveEClass, SystemExclusive.class, "SystemExclusive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(songPositionEClass, SongPosition.class, "SongPosition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSongPosition_Position(), ecorePackage.getEInt(), "position", null, 0, 1, SongPosition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(songSelectEClass, SongSelect.class, "SongSelect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSongSelect_SongNumber(), ecorePackage.getEInt(), "songNumber", null, 0, 1, SongSelect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unofficialBusSelectEClass, UnofficialBusSelect.class, "UnofficialBusSelect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnofficialBusSelect_BusNumber(), ecorePackage.getEInt(), "busNumber", null, 0, 1, UnofficialBusSelect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tuneRequestEClass, TuneRequest.class, "TuneRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(endOfExclusiveEClass, EndOfExclusive.class, "EndOfExclusive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timingTickEClass, TimingTick.class, "TimingTick", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(startSongEClass, StartSong.class, "StartSong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(continueSongEClass, ContinueSong.class, "ContinueSong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stopSongEClass, StopSong.class, "StopSong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activeSensingEClass, ActiveSensing.class, "ActiveSensing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemResetEClass, SystemReset.class, "SystemReset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(midiTimeCodeEClass, MidiTimeCode.class, "MidiTimeCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(polyPressureEClass, PolyPressure.class, "PolyPressure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolyPressure_Note(), ecorePackage.getEInt(), "note", null, 0, 1, PolyPressure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPolyPressure_Pressure(), ecorePackage.getEInt(), "pressure", null, 0, 1, PolyPressure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timingClockEClass, TimingClock.class, "TimingClock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeCodeEClass, TimeCode.class, "TimeCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sysexMessageEClass, SysexMessage.class, "SysexMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.class, "CONTROLLER_CHANGE_VALUES");
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.UNDEFINED);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.MODULATION_WHEEL);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.BREATHE_CONTROLLER);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.FOOT_CONTROLLER);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.PORTAMENTO_TIME);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.DATA_ENTRY_SLIDER);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.MAIN_VOLUME);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.BALANCE);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.PAN);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.EXPRESSION_CONTROLLER);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.GENERAL_PURPOSES_CONTROLLER_1);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.GENERAL_PURPOSES_CONTROLLER_2);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.GENERAL_PURPOSES_CONTROLLER_3);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.GENERAL_PURPOSES_CONTROLLER_4);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.LSB_FOR_CONTROLLER_32);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.LSB_FOR_CONTROLLER_33);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.LSB_FOR_CONTROLLER_34);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.LSB_FOR_CONTROLLER_35);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.LSB_FOR_CONTROLLER_36);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.LSB_FOR_CONTROLLER_37);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.LSB_FOR_CONTROLLER_38);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.LSB_FOR_CONTROLLER_39);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.LSB_FOR_CONTROLLER_40);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.LSB_FOR_CONTROLLER_41);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.LSB_FOR_CONTROLLER_42);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.LSB_FOR_CONTROLLER_43);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.LSB_FOR_CONTROLLER_44);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.LSB_FOR_CONTROLLER_45);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.LSB_FOR_CONTROLLER_46);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.LSB_FOR_CONTROLLER_47);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.LSB_FOR_CONTROLLER_48);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.LSB_FOR_CONTROLLER_49);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.LSB_FOR_CONTROLLER_50);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.LSB_FOR_CONTROLLER_51);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.LSB_FOR_CONTROLLER_52);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.LSB_FOR_CONTROLLER_53);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.LSB_FOR_CONTROLLER_54);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.LSB_FOR_CONTROLLER_55);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.LSB_FOR_CONTROLLER_56);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.LSB_FOR_CONTROLLER_57);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.LSB_FOR_CONTROLLER_58);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.LSB_FOR_CONTROLLER_59);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.LSB_FOR_CONTROLLER_60);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.LSB_FOR_CONTROLLER_61);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.LSB_FOR_CONTROLLER_62);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.DAMPER_PEDAL);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.LSB_FOR_CONTROLLER_63);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.PORTAMENTO);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.SOSTENUTO);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.SOFT_PEDAL);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.HOLD_2);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.GENERAL_PURPOSES_CONTROLLER_5);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.GENERAL_PURPOSES_CONTROLLER_6);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.GENERAL_PURPOSES_CONTROLLER_7);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.GENERAL_PURPOSES_CONTROLLER_8);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.TREMOLO_DEPTH);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.CHORUS_DEPTH);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.CELESTE_DETUNE_DEPTH);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.PHASER_DEPTH);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.DATA_INCREMENT);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.DATA_DECREMENT);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.NON_REGISTERED_PARAMETER_NUMBER_LSB);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.NON_REGISTERED_PARAMETER_NUMBER_MSB);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.REGISTERED_PARAMETER_NUMBER_LSB);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.REGISTERED_PARAMETER_NUMBER_MSB);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.CHANNEL_MODE_MESSAGE_0);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.CHANNEL_MODE_MESSAGE_1);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.CHANNEL_MODE_MESSAGE_2);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.CHANNEL_MODE_MESSAGE_3);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.CHANNEL_MODE_MESSAGE_4);
		addEEnumLiteral(controlleR_CHANGE_VALUESEEnum, net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES.CHANNEL_MODE_MESSAGE_5);

		// Initialize data types
		initEDataType(midiMessageEDataType, MidiMessage.class, "MidiMessage", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EzmidiPackageImpl
