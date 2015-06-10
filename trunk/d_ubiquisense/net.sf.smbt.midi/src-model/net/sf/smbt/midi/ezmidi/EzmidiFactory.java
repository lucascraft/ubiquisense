/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.midi.ezmidi;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.midi.ezmidi.EzmidiPackage
 * @generated
 */
public interface EzmidiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzmidiFactory eINSTANCE = net.sf.smbt.midi.ezmidi.impl.EzmidiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sysex Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sysex Message</em>'.
	 * @generated
	 */
	SysexMessage createSysexMessage();

	/**
	 * Returns a new object of class '<em>Sysex GS Reset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sysex GS Reset</em>'.
	 * @generated
	 */
	SysexGSReset createSysexGSReset();

	/**
	 * Returns a new object of class '<em>Sysex Patch Changed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sysex Patch Changed</em>'.
	 * @generated
	 */
	SysexPatchChanged createSysexPatchChanged();

	/**
	 * Returns a new object of class '<em>DSL Midi Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DSL Midi Message</em>'.
	 * @generated
	 */
	DSLMidiMessage createDSLMidiMessage();

	/**
	 * Returns a new object of class '<em>Note ON</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Note ON</em>'.
	 * @generated
	 */
	NoteON createNoteON();

	/**
	 * Returns a new object of class '<em>Note OFF</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Note OFF</em>'.
	 * @generated
	 */
	NoteOFF createNoteOFF();

	/**
	 * Returns a new object of class '<em>Key Pressure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Pressure</em>'.
	 * @generated
	 */
	KeyPressure createKeyPressure();

	/**
	 * Returns a new object of class '<em>Controller Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Controller Change</em>'.
	 * @generated
	 */
	ControllerChange createControllerChange();

	/**
	 * Returns a new object of class '<em>Program Change</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program Change</em>'.
	 * @generated
	 */
	ProgramChange createProgramChange();

	/**
	 * Returns a new object of class '<em>Channel Pressure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Channel Pressure</em>'.
	 * @generated
	 */
	ChannelPressure createChannelPressure();

	/**
	 * Returns a new object of class '<em>Pitch Bend</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pitch Bend</em>'.
	 * @generated
	 */
	PitchBend createPitchBend();

	/**
	 * Returns a new object of class '<em>System Exclusive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Exclusive</em>'.
	 * @generated
	 */
	SystemExclusive createSystemExclusive();

	/**
	 * Returns a new object of class '<em>Song Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Song Position</em>'.
	 * @generated
	 */
	SongPosition createSongPosition();

	/**
	 * Returns a new object of class '<em>Song Select</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Song Select</em>'.
	 * @generated
	 */
	SongSelect createSongSelect();

	/**
	 * Returns a new object of class '<em>Unofficial Bus Select</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unofficial Bus Select</em>'.
	 * @generated
	 */
	UnofficialBusSelect createUnofficialBusSelect();

	/**
	 * Returns a new object of class '<em>Tune Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tune Request</em>'.
	 * @generated
	 */
	TuneRequest createTuneRequest();

	/**
	 * Returns a new object of class '<em>End Of Exclusive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Of Exclusive</em>'.
	 * @generated
	 */
	EndOfExclusive createEndOfExclusive();

	/**
	 * Returns a new object of class '<em>Timing Tick</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timing Tick</em>'.
	 * @generated
	 */
	TimingTick createTimingTick();

	/**
	 * Returns a new object of class '<em>Start Song</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Song</em>'.
	 * @generated
	 */
	StartSong createStartSong();

	/**
	 * Returns a new object of class '<em>Continue Song</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Continue Song</em>'.
	 * @generated
	 */
	ContinueSong createContinueSong();

	/**
	 * Returns a new object of class '<em>Stop Song</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Song</em>'.
	 * @generated
	 */
	StopSong createStopSong();

	/**
	 * Returns a new object of class '<em>Active Sensing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Active Sensing</em>'.
	 * @generated
	 */
	ActiveSensing createActiveSensing();

	/**
	 * Returns a new object of class '<em>System Reset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Reset</em>'.
	 * @generated
	 */
	SystemReset createSystemReset();

	/**
	 * Returns a new object of class '<em>Midi Time Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Midi Time Code</em>'.
	 * @generated
	 */
	MidiTimeCode createMidiTimeCode();

	/**
	 * Returns a new object of class '<em>Poly Pressure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Poly Pressure</em>'.
	 * @generated
	 */
	PolyPressure createPolyPressure();

	/**
	 * Returns a new object of class '<em>Timing Clock</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timing Clock</em>'.
	 * @generated
	 */
	TimingClock createTimingClock();

	/**
	 * Returns a new object of class '<em>Time Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Code</em>'.
	 * @generated
	 */
	TimeCode createTimeCode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EzmidiPackage getEzmidiPackage();

} //EzmidiFactory
