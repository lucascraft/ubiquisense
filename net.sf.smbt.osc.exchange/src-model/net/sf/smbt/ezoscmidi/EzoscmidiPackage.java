/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezoscmidi;

import net.sf.smbt.osccmd.OsccmdPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezoscmidi.EzoscmidiFactory
 * @model kind="package"
 * @generated
 */
public interface EzoscmidiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezoscmidi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ezoscmidi/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezoscmidi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzoscmidiPackage eINSTANCE = net.sf.smbt.ezoscmidi.impl.EzoscmidiPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezoscmidi.impl.OscMidiNoteOnImpl <em>Osc Midi Note On</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezoscmidi.impl.OscMidiNoteOnImpl
	 * @see net.sf.smbt.ezoscmidi.impl.EzoscmidiPackageImpl#getOscMidiNoteOn()
	 * @generated
	 */
	int OSC_MIDI_NOTE_ON = 0;

	/**
	 * The number of structural features of the '<em>Osc Midi Note On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_MIDI_NOTE_ON_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezoscmidi.impl.OscMidiNoteOffImpl <em>Osc Midi Note Off</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezoscmidi.impl.OscMidiNoteOffImpl
	 * @see net.sf.smbt.ezoscmidi.impl.EzoscmidiPackageImpl#getOscMidiNoteOff()
	 * @generated
	 */
	int OSC_MIDI_NOTE_OFF = 1;

	/**
	 * The number of structural features of the '<em>Osc Midi Note Off</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_MIDI_NOTE_OFF_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezoscmidi.impl.OscMidiSysExImpl <em>Osc Midi Sys Ex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezoscmidi.impl.OscMidiSysExImpl
	 * @see net.sf.smbt.ezoscmidi.impl.EzoscmidiPackageImpl#getOscMidiSysEx()
	 * @generated
	 */
	int OSC_MIDI_SYS_EX = 2;

	/**
	 * The number of structural features of the '<em>Osc Midi Sys Ex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_MIDI_SYS_EX_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezoscmidi.impl.OscMidiPolyPressureImpl <em>Osc Midi Poly Pressure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezoscmidi.impl.OscMidiPolyPressureImpl
	 * @see net.sf.smbt.ezoscmidi.impl.EzoscmidiPackageImpl#getOscMidiPolyPressure()
	 * @generated
	 */
	int OSC_MIDI_POLY_PRESSURE = 3;

	/**
	 * The number of structural features of the '<em>Osc Midi Poly Pressure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_MIDI_POLY_PRESSURE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezoscmidi.impl.OscMidiEndSysexImpl <em>Osc Midi End Sysex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezoscmidi.impl.OscMidiEndSysexImpl
	 * @see net.sf.smbt.ezoscmidi.impl.EzoscmidiPackageImpl#getOscMidiEndSysex()
	 * @generated
	 */
	int OSC_MIDI_END_SYSEX = 4;

	/**
	 * The number of structural features of the '<em>Osc Midi End Sysex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_MIDI_END_SYSEX_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezoscmidi.impl.OscMidiCmdImpl <em>Osc Midi Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezoscmidi.impl.OscMidiCmdImpl
	 * @see net.sf.smbt.ezoscmidi.impl.EzoscmidiPackageImpl#getOscMidiCmd()
	 * @generated
	 */
	int OSC_MIDI_CMD = 5;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_MIDI_CMD__PRIORITY = OsccmdPackage.OSC_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_MIDI_CMD__MSG = OsccmdPackage.OSC_CMD__MSG;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_MIDI_CMD__ADDR = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_MIDI_CMD__MSG_SIZE = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_MIDI_CMD__BYTE1 = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_MIDI_CMD__BYTE2 = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_MIDI_CMD__MESSAGE = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Osc Midi Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSC_MIDI_CMD_FEATURE_COUNT = OsccmdPackage.OSC_CMD_FEATURE_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezoscmidi.OscMidiNoteOn <em>Osc Midi Note On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Osc Midi Note On</em>'.
	 * @see net.sf.smbt.ezoscmidi.OscMidiNoteOn
	 * @generated
	 */
	EClass getOscMidiNoteOn();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezoscmidi.OscMidiNoteOff <em>Osc Midi Note Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Osc Midi Note Off</em>'.
	 * @see net.sf.smbt.ezoscmidi.OscMidiNoteOff
	 * @generated
	 */
	EClass getOscMidiNoteOff();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezoscmidi.OscMidiSysEx <em>Osc Midi Sys Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Osc Midi Sys Ex</em>'.
	 * @see net.sf.smbt.ezoscmidi.OscMidiSysEx
	 * @generated
	 */
	EClass getOscMidiSysEx();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezoscmidi.OscMidiPolyPressure <em>Osc Midi Poly Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Osc Midi Poly Pressure</em>'.
	 * @see net.sf.smbt.ezoscmidi.OscMidiPolyPressure
	 * @generated
	 */
	EClass getOscMidiPolyPressure();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezoscmidi.OscMidiEndSysex <em>Osc Midi End Sysex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Osc Midi End Sysex</em>'.
	 * @see net.sf.smbt.ezoscmidi.OscMidiEndSysex
	 * @generated
	 */
	EClass getOscMidiEndSysex();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezoscmidi.OscMidiCmd <em>Osc Midi Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Osc Midi Cmd</em>'.
	 * @see net.sf.smbt.ezoscmidi.OscMidiCmd
	 * @generated
	 */
	EClass getOscMidiCmd();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EzoscmidiFactory getEzoscmidiFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezoscmidi.impl.OscMidiNoteOnImpl <em>Osc Midi Note On</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezoscmidi.impl.OscMidiNoteOnImpl
		 * @see net.sf.smbt.ezoscmidi.impl.EzoscmidiPackageImpl#getOscMidiNoteOn()
		 * @generated
		 */
		EClass OSC_MIDI_NOTE_ON = eINSTANCE.getOscMidiNoteOn();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezoscmidi.impl.OscMidiNoteOffImpl <em>Osc Midi Note Off</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezoscmidi.impl.OscMidiNoteOffImpl
		 * @see net.sf.smbt.ezoscmidi.impl.EzoscmidiPackageImpl#getOscMidiNoteOff()
		 * @generated
		 */
		EClass OSC_MIDI_NOTE_OFF = eINSTANCE.getOscMidiNoteOff();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezoscmidi.impl.OscMidiSysExImpl <em>Osc Midi Sys Ex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezoscmidi.impl.OscMidiSysExImpl
		 * @see net.sf.smbt.ezoscmidi.impl.EzoscmidiPackageImpl#getOscMidiSysEx()
		 * @generated
		 */
		EClass OSC_MIDI_SYS_EX = eINSTANCE.getOscMidiSysEx();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezoscmidi.impl.OscMidiPolyPressureImpl <em>Osc Midi Poly Pressure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezoscmidi.impl.OscMidiPolyPressureImpl
		 * @see net.sf.smbt.ezoscmidi.impl.EzoscmidiPackageImpl#getOscMidiPolyPressure()
		 * @generated
		 */
		EClass OSC_MIDI_POLY_PRESSURE = eINSTANCE.getOscMidiPolyPressure();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezoscmidi.impl.OscMidiEndSysexImpl <em>Osc Midi End Sysex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezoscmidi.impl.OscMidiEndSysexImpl
		 * @see net.sf.smbt.ezoscmidi.impl.EzoscmidiPackageImpl#getOscMidiEndSysex()
		 * @generated
		 */
		EClass OSC_MIDI_END_SYSEX = eINSTANCE.getOscMidiEndSysex();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezoscmidi.impl.OscMidiCmdImpl <em>Osc Midi Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezoscmidi.impl.OscMidiCmdImpl
		 * @see net.sf.smbt.ezoscmidi.impl.EzoscmidiPackageImpl#getOscMidiCmd()
		 * @generated
		 */
		EClass OSC_MIDI_CMD = eINSTANCE.getOscMidiCmd();

	}

} //EzoscmidiPackage
