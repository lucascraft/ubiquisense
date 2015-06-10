/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.midi.ezmidi.util;

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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.midi.ezmidi.EzmidiPackage
 * @generated
 */
public class EzmidiAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzmidiPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzmidiAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EzmidiPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EzmidiSwitch<Adapter> modelSwitch =
		new EzmidiSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractMidiCmd(AbstractMidiCmd object) {
				return createAbstractMidiCmdAdapter();
			}
			@Override
			public Adapter caseSysexGSReset(SysexGSReset object) {
				return createSysexGSResetAdapter();
			}
			@Override
			public Adapter caseSysexPatchChanged(SysexPatchChanged object) {
				return createSysexPatchChangedAdapter();
			}
			@Override
			public Adapter caseDSLMidiMessage(DSLMidiMessage object) {
				return createDSLMidiMessageAdapter();
			}
			@Override
			public Adapter caseNoteON(NoteON object) {
				return createNoteONAdapter();
			}
			@Override
			public Adapter caseNoteOFF(NoteOFF object) {
				return createNoteOFFAdapter();
			}
			@Override
			public Adapter caseKeyPressure(KeyPressure object) {
				return createKeyPressureAdapter();
			}
			@Override
			public Adapter caseControllerChange(ControllerChange object) {
				return createControllerChangeAdapter();
			}
			@Override
			public Adapter caseProgramChange(ProgramChange object) {
				return createProgramChangeAdapter();
			}
			@Override
			public Adapter caseChannelPressure(ChannelPressure object) {
				return createChannelPressureAdapter();
			}
			@Override
			public Adapter casePitchBend(PitchBend object) {
				return createPitchBendAdapter();
			}
			@Override
			public Adapter caseSystemExclusive(SystemExclusive object) {
				return createSystemExclusiveAdapter();
			}
			@Override
			public Adapter caseSongPosition(SongPosition object) {
				return createSongPositionAdapter();
			}
			@Override
			public Adapter caseSongSelect(SongSelect object) {
				return createSongSelectAdapter();
			}
			@Override
			public Adapter caseUnofficialBusSelect(UnofficialBusSelect object) {
				return createUnofficialBusSelectAdapter();
			}
			@Override
			public Adapter caseTuneRequest(TuneRequest object) {
				return createTuneRequestAdapter();
			}
			@Override
			public Adapter caseEndOfExclusive(EndOfExclusive object) {
				return createEndOfExclusiveAdapter();
			}
			@Override
			public Adapter caseTimingTick(TimingTick object) {
				return createTimingTickAdapter();
			}
			@Override
			public Adapter caseStartSong(StartSong object) {
				return createStartSongAdapter();
			}
			@Override
			public Adapter caseContinueSong(ContinueSong object) {
				return createContinueSongAdapter();
			}
			@Override
			public Adapter caseStopSong(StopSong object) {
				return createStopSongAdapter();
			}
			@Override
			public Adapter caseActiveSensing(ActiveSensing object) {
				return createActiveSensingAdapter();
			}
			@Override
			public Adapter caseSystemReset(SystemReset object) {
				return createSystemResetAdapter();
			}
			@Override
			public Adapter caseMidiTimeCode(MidiTimeCode object) {
				return createMidiTimeCodeAdapter();
			}
			@Override
			public Adapter casePolyPressure(PolyPressure object) {
				return createPolyPressureAdapter();
			}
			@Override
			public Adapter caseTimingClock(TimingClock object) {
				return createTimingClockAdapter();
			}
			@Override
			public Adapter caseTimeCode(TimeCode object) {
				return createTimeCodeAdapter();
			}
			@Override
			public Adapter caseSysexMessage(SysexMessage object) {
				return createSysexMessageAdapter();
			}
			@Override
			public Adapter caseCmd(Cmd object) {
				return createCmdAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.AbstractMidiCmd <em>Abstract Midi Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.AbstractMidiCmd
	 * @generated
	 */
	public Adapter createAbstractMidiCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.SysexMessage <em>Sysex Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.SysexMessage
	 * @generated
	 */
	public Adapter createSysexMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.SysexGSReset <em>Sysex GS Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.SysexGSReset
	 * @generated
	 */
	public Adapter createSysexGSResetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.SysexPatchChanged <em>Sysex Patch Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.SysexPatchChanged
	 * @generated
	 */
	public Adapter createSysexPatchChangedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.DSLMidiMessage <em>DSL Midi Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.DSLMidiMessage
	 * @generated
	 */
	public Adapter createDSLMidiMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.NoteON <em>Note ON</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.NoteON
	 * @generated
	 */
	public Adapter createNoteONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.NoteOFF <em>Note OFF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.NoteOFF
	 * @generated
	 */
	public Adapter createNoteOFFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.KeyPressure <em>Key Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.KeyPressure
	 * @generated
	 */
	public Adapter createKeyPressureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.ControllerChange <em>Controller Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.ControllerChange
	 * @generated
	 */
	public Adapter createControllerChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.ProgramChange <em>Program Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.ProgramChange
	 * @generated
	 */
	public Adapter createProgramChangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.ChannelPressure <em>Channel Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.ChannelPressure
	 * @generated
	 */
	public Adapter createChannelPressureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.PitchBend <em>Pitch Bend</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.PitchBend
	 * @generated
	 */
	public Adapter createPitchBendAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.SystemExclusive <em>System Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.SystemExclusive
	 * @generated
	 */
	public Adapter createSystemExclusiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.SongPosition <em>Song Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.SongPosition
	 * @generated
	 */
	public Adapter createSongPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.SongSelect <em>Song Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.SongSelect
	 * @generated
	 */
	public Adapter createSongSelectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.UnofficialBusSelect <em>Unofficial Bus Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.UnofficialBusSelect
	 * @generated
	 */
	public Adapter createUnofficialBusSelectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.TuneRequest <em>Tune Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.TuneRequest
	 * @generated
	 */
	public Adapter createTuneRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.EndOfExclusive <em>End Of Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.EndOfExclusive
	 * @generated
	 */
	public Adapter createEndOfExclusiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.TimingTick <em>Timing Tick</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.TimingTick
	 * @generated
	 */
	public Adapter createTimingTickAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.StartSong <em>Start Song</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.StartSong
	 * @generated
	 */
	public Adapter createStartSongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.ContinueSong <em>Continue Song</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.ContinueSong
	 * @generated
	 */
	public Adapter createContinueSongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.StopSong <em>Stop Song</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.StopSong
	 * @generated
	 */
	public Adapter createStopSongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.ActiveSensing <em>Active Sensing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.ActiveSensing
	 * @generated
	 */
	public Adapter createActiveSensingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.SystemReset <em>System Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.SystemReset
	 * @generated
	 */
	public Adapter createSystemResetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.MidiTimeCode <em>Midi Time Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.MidiTimeCode
	 * @generated
	 */
	public Adapter createMidiTimeCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.PolyPressure <em>Poly Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.PolyPressure
	 * @generated
	 */
	public Adapter createPolyPressureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.TimingClock <em>Timing Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.TimingClock
	 * @generated
	 */
	public Adapter createTimingClockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.TimeCode <em>Time Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.TimeCode
	 * @generated
	 */
	public Adapter createTimeCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.xqz.model.cmd.Cmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.xqz.model.cmd.Cmd
	 * @generated
	 */
	public Adapter createCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EzmidiAdapterFactory
