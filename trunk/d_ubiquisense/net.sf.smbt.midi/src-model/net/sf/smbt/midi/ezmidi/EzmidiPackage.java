/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.midi.ezmidi;

import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see net.sf.smbt.midi.ezmidi.EzmidiFactory
 * @model kind="package"
 * @generated
 */
public interface EzmidiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezmidi";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ezmidi/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezmidi";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzmidiPackage eINSTANCE = net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.midi.ezmidi.impl.AbstractMidiCmdImpl <em>Abstract Midi Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.midi.ezmidi.impl.AbstractMidiCmdImpl
	 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getAbstractMidiCmd()
	 * @generated
	 */
	int ABSTRACT_MIDI_CMD = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MIDI_CMD__PRIORITY = CmdPackage.CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MIDI_CMD__STAMP = CmdPackage.CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MIDI_CMD__ADDR = CmdPackage.CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MIDI_CMD__MSG_SIZE = CmdPackage.CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MIDI_CMD__BYTE1 = CmdPackage.CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MIDI_CMD__BYTE2 = CmdPackage.CMD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MIDI_CMD__MESSAGE = CmdPackage.CMD_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Abstract Midi Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MIDI_CMD_FEATURE_COUNT = CmdPackage.CMD_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link net.sf.smbt.midi.ezmidi.impl.SysexMessageImpl <em>Sysex Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.midi.ezmidi.impl.SysexMessageImpl
	 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getSysexMessage()
	 * @generated
	 */
	int SYSEX_MESSAGE = 27;

	/**
	 * The meta object id for the '{@link net.sf.smbt.midi.ezmidi.impl.SysexGSResetImpl <em>Sysex GS Reset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.midi.ezmidi.impl.SysexGSResetImpl
	 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getSysexGSReset()
	 * @generated
	 */
	int SYSEX_GS_RESET = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.midi.ezmidi.impl.SysexPatchChangedImpl <em>Sysex Patch Changed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.midi.ezmidi.impl.SysexPatchChangedImpl
	 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getSysexPatchChanged()
	 * @generated
	 */
	int SYSEX_PATCH_CHANGED = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.midi.ezmidi.impl.DSLMidiMessageImpl <em>DSL Midi Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.midi.ezmidi.impl.DSLMidiMessageImpl
	 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getDSLMidiMessage()
	 * @generated
	 */
	int DSL_MIDI_MESSAGE = 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MIDI_MESSAGE__PRIORITY = ABSTRACT_MIDI_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MIDI_MESSAGE__STAMP = ABSTRACT_MIDI_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MIDI_MESSAGE__ADDR = ABSTRACT_MIDI_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MIDI_MESSAGE__MSG_SIZE = ABSTRACT_MIDI_CMD__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MIDI_MESSAGE__BYTE1 = ABSTRACT_MIDI_CMD__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MIDI_MESSAGE__BYTE2 = ABSTRACT_MIDI_CMD__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MIDI_MESSAGE__MESSAGE = ABSTRACT_MIDI_CMD__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MIDI_MESSAGE__CHANNEL = ABSTRACT_MIDI_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MIDI_MESSAGE__CMD = ABSTRACT_MIDI_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>DSL Midi Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSL_MIDI_MESSAGE_FEATURE_COUNT = ABSTRACT_MIDI_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_MESSAGE__PRIORITY = DSL_MIDI_MESSAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_MESSAGE__STAMP = DSL_MIDI_MESSAGE__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_MESSAGE__ADDR = DSL_MIDI_MESSAGE__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_MESSAGE__MSG_SIZE = DSL_MIDI_MESSAGE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_MESSAGE__BYTE1 = DSL_MIDI_MESSAGE__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_MESSAGE__BYTE2 = DSL_MIDI_MESSAGE__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_MESSAGE__MESSAGE = DSL_MIDI_MESSAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_MESSAGE__CHANNEL = DSL_MIDI_MESSAGE__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_MESSAGE__CMD = DSL_MIDI_MESSAGE__CMD;

	/**
	 * The number of structural features of the '<em>Sysex Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_MESSAGE_FEATURE_COUNT = DSL_MIDI_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_GS_RESET__PRIORITY = SYSEX_MESSAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_GS_RESET__STAMP = SYSEX_MESSAGE__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_GS_RESET__ADDR = SYSEX_MESSAGE__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_GS_RESET__MSG_SIZE = SYSEX_MESSAGE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_GS_RESET__BYTE1 = SYSEX_MESSAGE__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_GS_RESET__BYTE2 = SYSEX_MESSAGE__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_GS_RESET__MESSAGE = SYSEX_MESSAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_GS_RESET__CHANNEL = SYSEX_MESSAGE__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_GS_RESET__CMD = SYSEX_MESSAGE__CMD;

	/**
	 * The number of structural features of the '<em>Sysex GS Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_GS_RESET_FEATURE_COUNT = SYSEX_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_PATCH_CHANGED__PRIORITY = SYSEX_MESSAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_PATCH_CHANGED__STAMP = SYSEX_MESSAGE__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_PATCH_CHANGED__ADDR = SYSEX_MESSAGE__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_PATCH_CHANGED__MSG_SIZE = SYSEX_MESSAGE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_PATCH_CHANGED__BYTE1 = SYSEX_MESSAGE__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_PATCH_CHANGED__BYTE2 = SYSEX_MESSAGE__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_PATCH_CHANGED__MESSAGE = SYSEX_MESSAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_PATCH_CHANGED__CHANNEL = SYSEX_MESSAGE__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_PATCH_CHANGED__CMD = SYSEX_MESSAGE__CMD;

	/**
	 * The number of structural features of the '<em>Sysex Patch Changed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_PATCH_CHANGED_FEATURE_COUNT = SYSEX_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '<em>Midi Message</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.sound.midi.MidiMessage
	 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getMidiMessage()
	 * @generated
	 */
	int MIDI_MESSAGE = 29;

	/**
	 * The meta object id for the '{@link net.sf.smbt.midi.ezmidi.impl.NoteONImpl <em>Note ON</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.midi.ezmidi.impl.NoteONImpl
	 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getNoteON()
	 * @generated
	 */
	int NOTE_ON = 4;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_ON__PRIORITY = DSL_MIDI_MESSAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_ON__STAMP = DSL_MIDI_MESSAGE__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_ON__ADDR = DSL_MIDI_MESSAGE__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_ON__MSG_SIZE = DSL_MIDI_MESSAGE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_ON__BYTE1 = DSL_MIDI_MESSAGE__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_ON__BYTE2 = DSL_MIDI_MESSAGE__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_ON__MESSAGE = DSL_MIDI_MESSAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_ON__CHANNEL = DSL_MIDI_MESSAGE__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_ON__CMD = DSL_MIDI_MESSAGE__CMD;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_ON__NOTE = DSL_MIDI_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_ON__VELOCITY = DSL_MIDI_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_ON__PITCH = DSL_MIDI_MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Note ON</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_ON_FEATURE_COUNT = DSL_MIDI_MESSAGE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.midi.ezmidi.impl.NoteOFFImpl <em>Note OFF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.midi.ezmidi.impl.NoteOFFImpl
	 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getNoteOFF()
	 * @generated
	 */
	int NOTE_OFF = 5;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OFF__PRIORITY = DSL_MIDI_MESSAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OFF__STAMP = DSL_MIDI_MESSAGE__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OFF__ADDR = DSL_MIDI_MESSAGE__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OFF__MSG_SIZE = DSL_MIDI_MESSAGE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OFF__BYTE1 = DSL_MIDI_MESSAGE__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OFF__BYTE2 = DSL_MIDI_MESSAGE__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OFF__MESSAGE = DSL_MIDI_MESSAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OFF__CHANNEL = DSL_MIDI_MESSAGE__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OFF__CMD = DSL_MIDI_MESSAGE__CMD;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OFF__NOTE = DSL_MIDI_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OFF__VELOCITY = DSL_MIDI_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OFF__PITCH = DSL_MIDI_MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Note OFF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OFF_FEATURE_COUNT = DSL_MIDI_MESSAGE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.midi.ezmidi.impl.KeyPressureImpl <em>Key Pressure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.midi.ezmidi.impl.KeyPressureImpl
	 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getKeyPressure()
	 * @generated
	 */
	int KEY_PRESSURE = 6;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PRESSURE__PRIORITY = DSL_MIDI_MESSAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PRESSURE__STAMP = DSL_MIDI_MESSAGE__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PRESSURE__ADDR = DSL_MIDI_MESSAGE__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PRESSURE__MSG_SIZE = DSL_MIDI_MESSAGE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PRESSURE__BYTE1 = DSL_MIDI_MESSAGE__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PRESSURE__BYTE2 = DSL_MIDI_MESSAGE__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PRESSURE__MESSAGE = DSL_MIDI_MESSAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PRESSURE__CHANNEL = DSL_MIDI_MESSAGE__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PRESSURE__CMD = DSL_MIDI_MESSAGE__CMD;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PRESSURE__KEY = DSL_MIDI_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PRESSURE__PRESSURE = DSL_MIDI_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Key Pressure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_PRESSURE_FEATURE_COUNT = DSL_MIDI_MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.midi.ezmidi.impl.ControllerChangeImpl <em>Controller Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.midi.ezmidi.impl.ControllerChangeImpl
	 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getControllerChange()
	 * @generated
	 */
	int CONTROLLER_CHANGE = 7;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CHANGE__PRIORITY = DSL_MIDI_MESSAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CHANGE__STAMP = DSL_MIDI_MESSAGE__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CHANGE__ADDR = DSL_MIDI_MESSAGE__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CHANGE__MSG_SIZE = DSL_MIDI_MESSAGE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CHANGE__BYTE1 = DSL_MIDI_MESSAGE__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CHANGE__BYTE2 = DSL_MIDI_MESSAGE__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CHANGE__MESSAGE = DSL_MIDI_MESSAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CHANGE__CHANNEL = DSL_MIDI_MESSAGE__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CHANGE__CMD = DSL_MIDI_MESSAGE__CMD;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CHANGE__VALUE = DSL_MIDI_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CHANGE__CONTROLLER = DSL_MIDI_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Controller Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CHANGE_FEATURE_COUNT = DSL_MIDI_MESSAGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.midi.ezmidi.impl.ProgramChangeImpl <em>Program Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.midi.ezmidi.impl.ProgramChangeImpl
	 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getProgramChange()
	 * @generated
	 */
	int PROGRAM_CHANGE = 8;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CHANGE__PRIORITY = DSL_MIDI_MESSAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CHANGE__STAMP = DSL_MIDI_MESSAGE__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CHANGE__ADDR = DSL_MIDI_MESSAGE__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CHANGE__MSG_SIZE = DSL_MIDI_MESSAGE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CHANGE__BYTE1 = DSL_MIDI_MESSAGE__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CHANGE__BYTE2 = DSL_MIDI_MESSAGE__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CHANGE__MESSAGE = DSL_MIDI_MESSAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CHANGE__CHANNEL = DSL_MIDI_MESSAGE__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CHANGE__CMD = DSL_MIDI_MESSAGE__CMD;

	/**
	 * The feature id for the '<em><b>Preset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CHANGE__PRESET = DSL_MIDI_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Program Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_CHANGE_FEATURE_COUNT = DSL_MIDI_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.midi.ezmidi.impl.ChannelPressureImpl <em>Channel Pressure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.midi.ezmidi.impl.ChannelPressureImpl
	 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getChannelPressure()
	 * @generated
	 */
	int CHANNEL_PRESSURE = 9;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_PRESSURE__PRIORITY = DSL_MIDI_MESSAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_PRESSURE__STAMP = DSL_MIDI_MESSAGE__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_PRESSURE__ADDR = DSL_MIDI_MESSAGE__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_PRESSURE__MSG_SIZE = DSL_MIDI_MESSAGE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_PRESSURE__BYTE1 = DSL_MIDI_MESSAGE__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_PRESSURE__BYTE2 = DSL_MIDI_MESSAGE__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_PRESSURE__MESSAGE = DSL_MIDI_MESSAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_PRESSURE__CHANNEL = DSL_MIDI_MESSAGE__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_PRESSURE__CMD = DSL_MIDI_MESSAGE__CMD;

	/**
	 * The feature id for the '<em><b>Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_PRESSURE__PRESSURE = DSL_MIDI_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Channel Pressure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_PRESSURE_FEATURE_COUNT = DSL_MIDI_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.midi.ezmidi.impl.PitchBendImpl <em>Pitch Bend</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.midi.ezmidi.impl.PitchBendImpl
	 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getPitchBend()
	 * @generated
	 */
	int PITCH_BEND = 10;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PITCH_BEND__PRIORITY = DSL_MIDI_MESSAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PITCH_BEND__STAMP = DSL_MIDI_MESSAGE__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PITCH_BEND__ADDR = DSL_MIDI_MESSAGE__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PITCH_BEND__MSG_SIZE = DSL_MIDI_MESSAGE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PITCH_BEND__BYTE1 = DSL_MIDI_MESSAGE__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PITCH_BEND__BYTE2 = DSL_MIDI_MESSAGE__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PITCH_BEND__MESSAGE = DSL_MIDI_MESSAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PITCH_BEND__CHANNEL = DSL_MIDI_MESSAGE__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PITCH_BEND__CMD = DSL_MIDI_MESSAGE__CMD;

	/**
	 * The feature id for the '<em><b>Bend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PITCH_BEND__BEND = DSL_MIDI_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pitch Bend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PITCH_BEND_FEATURE_COUNT = DSL_MIDI_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.midi.ezmidi.impl.SystemExclusiveImpl <em>System Exclusive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.midi.ezmidi.impl.SystemExclusiveImpl
	 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getSystemExclusive()
	 * @generated
	 */
	int SYSTEM_EXCLUSIVE = 11;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EXCLUSIVE__PRIORITY = DSL_MIDI_MESSAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EXCLUSIVE__STAMP = DSL_MIDI_MESSAGE__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EXCLUSIVE__ADDR = DSL_MIDI_MESSAGE__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EXCLUSIVE__MSG_SIZE = DSL_MIDI_MESSAGE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EXCLUSIVE__BYTE1 = DSL_MIDI_MESSAGE__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EXCLUSIVE__BYTE2 = DSL_MIDI_MESSAGE__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EXCLUSIVE__MESSAGE = DSL_MIDI_MESSAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EXCLUSIVE__CHANNEL = DSL_MIDI_MESSAGE__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EXCLUSIVE__CMD = DSL_MIDI_MESSAGE__CMD;

	/**
	 * The number of structural features of the '<em>System Exclusive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EXCLUSIVE_FEATURE_COUNT = DSL_MIDI_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.midi.ezmidi.impl.SongPositionImpl <em>Song Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.midi.ezmidi.impl.SongPositionImpl
	 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getSongPosition()
	 * @generated
	 */
	int SONG_POSITION = 12;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_POSITION__PRIORITY = DSL_MIDI_MESSAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_POSITION__STAMP = DSL_MIDI_MESSAGE__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_POSITION__ADDR = DSL_MIDI_MESSAGE__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_POSITION__MSG_SIZE = DSL_MIDI_MESSAGE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_POSITION__BYTE1 = DSL_MIDI_MESSAGE__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_POSITION__BYTE2 = DSL_MIDI_MESSAGE__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_POSITION__MESSAGE = DSL_MIDI_MESSAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_POSITION__CHANNEL = DSL_MIDI_MESSAGE__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_POSITION__CMD = DSL_MIDI_MESSAGE__CMD;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_POSITION__POSITION = DSL_MIDI_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Song Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_POSITION_FEATURE_COUNT = DSL_MIDI_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.midi.ezmidi.impl.SongSelectImpl <em>Song Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.midi.ezmidi.impl.SongSelectImpl
	 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getSongSelect()
	 * @generated
	 */
	int SONG_SELECT = 13;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_SELECT__PRIORITY = DSL_MIDI_MESSAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_SELECT__STAMP = DSL_MIDI_MESSAGE__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_SELECT__ADDR = DSL_MIDI_MESSAGE__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_SELECT__MSG_SIZE = DSL_MIDI_MESSAGE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_SELECT__BYTE1 = DSL_MIDI_MESSAGE__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_SELECT__BYTE2 = DSL_MIDI_MESSAGE__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_SELECT__MESSAGE = DSL_MIDI_MESSAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_SELECT__CHANNEL = DSL_MIDI_MESSAGE__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_SELECT__CMD = DSL_MIDI_MESSAGE__CMD;

	/**
	 * The feature id for the '<em><b>Song Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_SELECT__SONG_NUMBER = DSL_MIDI_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Song Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONG_SELECT_FEATURE_COUNT = DSL_MIDI_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.midi.ezmidi.impl.UnofficialBusSelectImpl <em>Unofficial Bus Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.midi.ezmidi.impl.UnofficialBusSelectImpl
	 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getUnofficialBusSelect()
	 * @generated
	 */
	int UNOFFICIAL_BUS_SELECT = 14;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNOFFICIAL_BUS_SELECT__PRIORITY = DSL_MIDI_MESSAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNOFFICIAL_BUS_SELECT__STAMP = DSL_MIDI_MESSAGE__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNOFFICIAL_BUS_SELECT__ADDR = DSL_MIDI_MESSAGE__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNOFFICIAL_BUS_SELECT__MSG_SIZE = DSL_MIDI_MESSAGE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNOFFICIAL_BUS_SELECT__BYTE1 = DSL_MIDI_MESSAGE__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNOFFICIAL_BUS_SELECT__BYTE2 = DSL_MIDI_MESSAGE__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNOFFICIAL_BUS_SELECT__MESSAGE = DSL_MIDI_MESSAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNOFFICIAL_BUS_SELECT__CHANNEL = DSL_MIDI_MESSAGE__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNOFFICIAL_BUS_SELECT__CMD = DSL_MIDI_MESSAGE__CMD;

	/**
	 * The feature id for the '<em><b>Bus Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNOFFICIAL_BUS_SELECT__BUS_NUMBER = DSL_MIDI_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unofficial Bus Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNOFFICIAL_BUS_SELECT_FEATURE_COUNT = DSL_MIDI_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.midi.ezmidi.impl.TuneRequestImpl <em>Tune Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.midi.ezmidi.impl.TuneRequestImpl
	 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getTuneRequest()
	 * @generated
	 */
	int TUNE_REQUEST = 15;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNE_REQUEST__PRIORITY = DSL_MIDI_MESSAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNE_REQUEST__STAMP = DSL_MIDI_MESSAGE__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNE_REQUEST__ADDR = DSL_MIDI_MESSAGE__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNE_REQUEST__MSG_SIZE = DSL_MIDI_MESSAGE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNE_REQUEST__BYTE1 = DSL_MIDI_MESSAGE__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNE_REQUEST__BYTE2 = DSL_MIDI_MESSAGE__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNE_REQUEST__MESSAGE = DSL_MIDI_MESSAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNE_REQUEST__CHANNEL = DSL_MIDI_MESSAGE__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNE_REQUEST__CMD = DSL_MIDI_MESSAGE__CMD;

	/**
	 * The number of structural features of the '<em>Tune Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNE_REQUEST_FEATURE_COUNT = DSL_MIDI_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.midi.ezmidi.impl.EndOfExclusiveImpl <em>End Of Exclusive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.midi.ezmidi.impl.EndOfExclusiveImpl
	 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getEndOfExclusive()
	 * @generated
	 */
	int END_OF_EXCLUSIVE = 16;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OF_EXCLUSIVE__PRIORITY = DSL_MIDI_MESSAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OF_EXCLUSIVE__STAMP = DSL_MIDI_MESSAGE__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OF_EXCLUSIVE__ADDR = DSL_MIDI_MESSAGE__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OF_EXCLUSIVE__MSG_SIZE = DSL_MIDI_MESSAGE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OF_EXCLUSIVE__BYTE1 = DSL_MIDI_MESSAGE__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OF_EXCLUSIVE__BYTE2 = DSL_MIDI_MESSAGE__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OF_EXCLUSIVE__MESSAGE = DSL_MIDI_MESSAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OF_EXCLUSIVE__CHANNEL = DSL_MIDI_MESSAGE__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OF_EXCLUSIVE__CMD = DSL_MIDI_MESSAGE__CMD;

	/**
	 * The number of structural features of the '<em>End Of Exclusive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OF_EXCLUSIVE_FEATURE_COUNT = DSL_MIDI_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.midi.ezmidi.impl.TimingTickImpl <em>Timing Tick</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.midi.ezmidi.impl.TimingTickImpl
	 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getTimingTick()
	 * @generated
	 */
	int TIMING_TICK = 17;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_TICK__PRIORITY = DSL_MIDI_MESSAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_TICK__STAMP = DSL_MIDI_MESSAGE__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_TICK__ADDR = DSL_MIDI_MESSAGE__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_TICK__MSG_SIZE = DSL_MIDI_MESSAGE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_TICK__BYTE1 = DSL_MIDI_MESSAGE__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_TICK__BYTE2 = DSL_MIDI_MESSAGE__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_TICK__MESSAGE = DSL_MIDI_MESSAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_TICK__CHANNEL = DSL_MIDI_MESSAGE__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_TICK__CMD = DSL_MIDI_MESSAGE__CMD;

	/**
	 * The number of structural features of the '<em>Timing Tick</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_TICK_FEATURE_COUNT = DSL_MIDI_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.midi.ezmidi.impl.StartSongImpl <em>Start Song</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.midi.ezmidi.impl.StartSongImpl
	 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getStartSong()
	 * @generated
	 */
	int START_SONG = 18;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_SONG__PRIORITY = DSL_MIDI_MESSAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_SONG__STAMP = DSL_MIDI_MESSAGE__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_SONG__ADDR = DSL_MIDI_MESSAGE__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_SONG__MSG_SIZE = DSL_MIDI_MESSAGE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_SONG__BYTE1 = DSL_MIDI_MESSAGE__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_SONG__BYTE2 = DSL_MIDI_MESSAGE__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_SONG__MESSAGE = DSL_MIDI_MESSAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_SONG__CHANNEL = DSL_MIDI_MESSAGE__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_SONG__CMD = DSL_MIDI_MESSAGE__CMD;

	/**
	 * The number of structural features of the '<em>Start Song</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_SONG_FEATURE_COUNT = DSL_MIDI_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.midi.ezmidi.impl.ContinueSongImpl <em>Continue Song</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.midi.ezmidi.impl.ContinueSongImpl
	 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getContinueSong()
	 * @generated
	 */
	int CONTINUE_SONG = 19;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_SONG__PRIORITY = DSL_MIDI_MESSAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_SONG__STAMP = DSL_MIDI_MESSAGE__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_SONG__ADDR = DSL_MIDI_MESSAGE__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_SONG__MSG_SIZE = DSL_MIDI_MESSAGE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_SONG__BYTE1 = DSL_MIDI_MESSAGE__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_SONG__BYTE2 = DSL_MIDI_MESSAGE__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_SONG__MESSAGE = DSL_MIDI_MESSAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_SONG__CHANNEL = DSL_MIDI_MESSAGE__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_SONG__CMD = DSL_MIDI_MESSAGE__CMD;

	/**
	 * The number of structural features of the '<em>Continue Song</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_SONG_FEATURE_COUNT = DSL_MIDI_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.midi.ezmidi.impl.StopSongImpl <em>Stop Song</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.midi.ezmidi.impl.StopSongImpl
	 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getStopSong()
	 * @generated
	 */
	int STOP_SONG = 20;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_SONG__PRIORITY = DSL_MIDI_MESSAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_SONG__STAMP = DSL_MIDI_MESSAGE__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_SONG__ADDR = DSL_MIDI_MESSAGE__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_SONG__MSG_SIZE = DSL_MIDI_MESSAGE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_SONG__BYTE1 = DSL_MIDI_MESSAGE__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_SONG__BYTE2 = DSL_MIDI_MESSAGE__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_SONG__MESSAGE = DSL_MIDI_MESSAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_SONG__CHANNEL = DSL_MIDI_MESSAGE__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_SONG__CMD = DSL_MIDI_MESSAGE__CMD;

	/**
	 * The number of structural features of the '<em>Stop Song</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_SONG_FEATURE_COUNT = DSL_MIDI_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.midi.ezmidi.impl.ActiveSensingImpl <em>Active Sensing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.midi.ezmidi.impl.ActiveSensingImpl
	 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getActiveSensing()
	 * @generated
	 */
	int ACTIVE_SENSING = 21;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_SENSING__PRIORITY = DSL_MIDI_MESSAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_SENSING__STAMP = DSL_MIDI_MESSAGE__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_SENSING__ADDR = DSL_MIDI_MESSAGE__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_SENSING__MSG_SIZE = DSL_MIDI_MESSAGE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_SENSING__BYTE1 = DSL_MIDI_MESSAGE__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_SENSING__BYTE2 = DSL_MIDI_MESSAGE__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_SENSING__MESSAGE = DSL_MIDI_MESSAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_SENSING__CHANNEL = DSL_MIDI_MESSAGE__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_SENSING__CMD = DSL_MIDI_MESSAGE__CMD;

	/**
	 * The number of structural features of the '<em>Active Sensing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_SENSING_FEATURE_COUNT = DSL_MIDI_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.midi.ezmidi.impl.SystemResetImpl <em>System Reset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.midi.ezmidi.impl.SystemResetImpl
	 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getSystemReset()
	 * @generated
	 */
	int SYSTEM_RESET = 22;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_RESET__PRIORITY = DSL_MIDI_MESSAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_RESET__STAMP = DSL_MIDI_MESSAGE__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_RESET__ADDR = DSL_MIDI_MESSAGE__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_RESET__MSG_SIZE = DSL_MIDI_MESSAGE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_RESET__BYTE1 = DSL_MIDI_MESSAGE__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_RESET__BYTE2 = DSL_MIDI_MESSAGE__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_RESET__MESSAGE = DSL_MIDI_MESSAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_RESET__CHANNEL = DSL_MIDI_MESSAGE__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_RESET__CMD = DSL_MIDI_MESSAGE__CMD;

	/**
	 * The number of structural features of the '<em>System Reset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_RESET_FEATURE_COUNT = DSL_MIDI_MESSAGE_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link net.sf.smbt.midi.ezmidi.impl.MidiTimeCodeImpl <em>Midi Time Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.midi.ezmidi.impl.MidiTimeCodeImpl
	 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getMidiTimeCode()
	 * @generated
	 */
	int MIDI_TIME_CODE = 23;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_TIME_CODE__PRIORITY = DSL_MIDI_MESSAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_TIME_CODE__STAMP = DSL_MIDI_MESSAGE__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_TIME_CODE__ADDR = DSL_MIDI_MESSAGE__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_TIME_CODE__MSG_SIZE = DSL_MIDI_MESSAGE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_TIME_CODE__BYTE1 = DSL_MIDI_MESSAGE__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_TIME_CODE__BYTE2 = DSL_MIDI_MESSAGE__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_TIME_CODE__MESSAGE = DSL_MIDI_MESSAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_TIME_CODE__CHANNEL = DSL_MIDI_MESSAGE__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_TIME_CODE__CMD = DSL_MIDI_MESSAGE__CMD;

	/**
	 * The number of structural features of the '<em>Midi Time Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_TIME_CODE_FEATURE_COUNT = DSL_MIDI_MESSAGE_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link net.sf.smbt.midi.ezmidi.impl.PolyPressureImpl <em>Poly Pressure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.midi.ezmidi.impl.PolyPressureImpl
	 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getPolyPressure()
	 * @generated
	 */
	int POLY_PRESSURE = 24;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_PRESSURE__PRIORITY = DSL_MIDI_MESSAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_PRESSURE__STAMP = DSL_MIDI_MESSAGE__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_PRESSURE__ADDR = DSL_MIDI_MESSAGE__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_PRESSURE__MSG_SIZE = DSL_MIDI_MESSAGE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_PRESSURE__BYTE1 = DSL_MIDI_MESSAGE__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_PRESSURE__BYTE2 = DSL_MIDI_MESSAGE__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_PRESSURE__MESSAGE = DSL_MIDI_MESSAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_PRESSURE__CHANNEL = DSL_MIDI_MESSAGE__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_PRESSURE__CMD = DSL_MIDI_MESSAGE__CMD;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_PRESSURE__NOTE = DSL_MIDI_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_PRESSURE__PRESSURE = DSL_MIDI_MESSAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Poly Pressure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_PRESSURE_FEATURE_COUNT = DSL_MIDI_MESSAGE_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link net.sf.smbt.midi.ezmidi.impl.TimingClockImpl <em>Timing Clock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.midi.ezmidi.impl.TimingClockImpl
	 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getTimingClock()
	 * @generated
	 */
	int TIMING_CLOCK = 25;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CLOCK__PRIORITY = DSL_MIDI_MESSAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CLOCK__STAMP = DSL_MIDI_MESSAGE__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CLOCK__ADDR = DSL_MIDI_MESSAGE__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CLOCK__MSG_SIZE = DSL_MIDI_MESSAGE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CLOCK__BYTE1 = DSL_MIDI_MESSAGE__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CLOCK__BYTE2 = DSL_MIDI_MESSAGE__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CLOCK__MESSAGE = DSL_MIDI_MESSAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CLOCK__CHANNEL = DSL_MIDI_MESSAGE__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CLOCK__CMD = DSL_MIDI_MESSAGE__CMD;

	/**
	 * The number of structural features of the '<em>Timing Clock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CLOCK_FEATURE_COUNT = DSL_MIDI_MESSAGE_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link net.sf.smbt.midi.ezmidi.impl.TimeCodeImpl <em>Time Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.midi.ezmidi.impl.TimeCodeImpl
	 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getTimeCode()
	 * @generated
	 */
	int TIME_CODE = 26;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CODE__PRIORITY = DSL_MIDI_MESSAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CODE__STAMP = DSL_MIDI_MESSAGE__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CODE__ADDR = DSL_MIDI_MESSAGE__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CODE__MSG_SIZE = DSL_MIDI_MESSAGE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CODE__BYTE1 = DSL_MIDI_MESSAGE__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CODE__BYTE2 = DSL_MIDI_MESSAGE__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CODE__MESSAGE = DSL_MIDI_MESSAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CODE__CHANNEL = DSL_MIDI_MESSAGE__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CODE__CMD = DSL_MIDI_MESSAGE__CMD;

	/**
	 * The number of structural features of the '<em>Time Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CODE_FEATURE_COUNT = DSL_MIDI_MESSAGE_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES <em>CONTROLLER CHANGE VALUES</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES
	 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getCONTROLLER_CHANGE_VALUES()
	 * @generated
	 */
	int CONTROLLER_CHANGE_VALUES = 28;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.midi.ezmidi.AbstractMidiCmd <em>Abstract Midi Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Midi Cmd</em>'.
	 * @see net.sf.smbt.midi.ezmidi.AbstractMidiCmd
	 * @generated
	 */
	EClass getAbstractMidiCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.midi.ezmidi.AbstractMidiCmd#getAddr <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addr</em>'.
	 * @see net.sf.smbt.midi.ezmidi.AbstractMidiCmd#getAddr()
	 * @see #getAbstractMidiCmd()
	 * @generated
	 */
	EAttribute getAbstractMidiCmd_Addr();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.midi.ezmidi.AbstractMidiCmd#getMsgSize <em>Msg Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Msg Size</em>'.
	 * @see net.sf.smbt.midi.ezmidi.AbstractMidiCmd#getMsgSize()
	 * @see #getAbstractMidiCmd()
	 * @generated
	 */
	EAttribute getAbstractMidiCmd_MsgSize();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.midi.ezmidi.AbstractMidiCmd#getByte1 <em>Byte1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte1</em>'.
	 * @see net.sf.smbt.midi.ezmidi.AbstractMidiCmd#getByte1()
	 * @see #getAbstractMidiCmd()
	 * @generated
	 */
	EAttribute getAbstractMidiCmd_Byte1();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.midi.ezmidi.AbstractMidiCmd#getByte2 <em>Byte2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte2</em>'.
	 * @see net.sf.smbt.midi.ezmidi.AbstractMidiCmd#getByte2()
	 * @see #getAbstractMidiCmd()
	 * @generated
	 */
	EAttribute getAbstractMidiCmd_Byte2();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.midi.ezmidi.AbstractMidiCmd#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see net.sf.smbt.midi.ezmidi.AbstractMidiCmd#getMessage()
	 * @see #getAbstractMidiCmd()
	 * @generated
	 */
	EAttribute getAbstractMidiCmd_Message();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.midi.ezmidi.SysexMessage <em>Sysex Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sysex Message</em>'.
	 * @see net.sf.smbt.midi.ezmidi.SysexMessage
	 * @generated
	 */
	EClass getSysexMessage();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES <em>CONTROLLER CHANGE VALUES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CONTROLLER CHANGE VALUES</em>'.
	 * @see net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES
	 * @generated
	 */
	EEnum getCONTROLLER_CHANGE_VALUES();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.midi.ezmidi.SysexGSReset <em>Sysex GS Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sysex GS Reset</em>'.
	 * @see net.sf.smbt.midi.ezmidi.SysexGSReset
	 * @generated
	 */
	EClass getSysexGSReset();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.midi.ezmidi.SysexPatchChanged <em>Sysex Patch Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sysex Patch Changed</em>'.
	 * @see net.sf.smbt.midi.ezmidi.SysexPatchChanged
	 * @generated
	 */
	EClass getSysexPatchChanged();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.midi.ezmidi.DSLMidiMessage <em>DSL Midi Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DSL Midi Message</em>'.
	 * @see net.sf.smbt.midi.ezmidi.DSLMidiMessage
	 * @generated
	 */
	EClass getDSLMidiMessage();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.midi.ezmidi.DSLMidiMessage#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel</em>'.
	 * @see net.sf.smbt.midi.ezmidi.DSLMidiMessage#getChannel()
	 * @see #getDSLMidiMessage()
	 * @generated
	 */
	EAttribute getDSLMidiMessage_Channel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.midi.ezmidi.DSLMidiMessage#getCmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmd</em>'.
	 * @see net.sf.smbt.midi.ezmidi.DSLMidiMessage#getCmd()
	 * @see #getDSLMidiMessage()
	 * @generated
	 */
	EAttribute getDSLMidiMessage_Cmd();

	/**
	 * Returns the meta object for data type '{@link javax.sound.midi.MidiMessage <em>Midi Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Midi Message</em>'.
	 * @see javax.sound.midi.MidiMessage
	 * @model instanceClass="javax.sound.midi.MidiMessage"
	 * @generated
	 */
	EDataType getMidiMessage();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.midi.ezmidi.NoteON <em>Note ON</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note ON</em>'.
	 * @see net.sf.smbt.midi.ezmidi.NoteON
	 * @generated
	 */
	EClass getNoteON();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.midi.ezmidi.NoteON#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see net.sf.smbt.midi.ezmidi.NoteON#getNote()
	 * @see #getNoteON()
	 * @generated
	 */
	EAttribute getNoteON_Note();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.midi.ezmidi.NoteON#getVelocity <em>Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Velocity</em>'.
	 * @see net.sf.smbt.midi.ezmidi.NoteON#getVelocity()
	 * @see #getNoteON()
	 * @generated
	 */
	EAttribute getNoteON_Velocity();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.midi.ezmidi.NoteON#getPitch <em>Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pitch</em>'.
	 * @see net.sf.smbt.midi.ezmidi.NoteON#getPitch()
	 * @see #getNoteON()
	 * @generated
	 */
	EAttribute getNoteON_Pitch();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.midi.ezmidi.NoteOFF <em>Note OFF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note OFF</em>'.
	 * @see net.sf.smbt.midi.ezmidi.NoteOFF
	 * @generated
	 */
	EClass getNoteOFF();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.midi.ezmidi.NoteOFF#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see net.sf.smbt.midi.ezmidi.NoteOFF#getNote()
	 * @see #getNoteOFF()
	 * @generated
	 */
	EAttribute getNoteOFF_Note();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.midi.ezmidi.NoteOFF#getVelocity <em>Velocity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Velocity</em>'.
	 * @see net.sf.smbt.midi.ezmidi.NoteOFF#getVelocity()
	 * @see #getNoteOFF()
	 * @generated
	 */
	EAttribute getNoteOFF_Velocity();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.midi.ezmidi.NoteOFF#getPitch <em>Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pitch</em>'.
	 * @see net.sf.smbt.midi.ezmidi.NoteOFF#getPitch()
	 * @see #getNoteOFF()
	 * @generated
	 */
	EAttribute getNoteOFF_Pitch();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.midi.ezmidi.KeyPressure <em>Key Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Pressure</em>'.
	 * @see net.sf.smbt.midi.ezmidi.KeyPressure
	 * @generated
	 */
	EClass getKeyPressure();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.midi.ezmidi.KeyPressure#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see net.sf.smbt.midi.ezmidi.KeyPressure#getKey()
	 * @see #getKeyPressure()
	 * @generated
	 */
	EAttribute getKeyPressure_Key();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.midi.ezmidi.KeyPressure#getPressure <em>Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pressure</em>'.
	 * @see net.sf.smbt.midi.ezmidi.KeyPressure#getPressure()
	 * @see #getKeyPressure()
	 * @generated
	 */
	EAttribute getKeyPressure_Pressure();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.midi.ezmidi.ControllerChange <em>Controller Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller Change</em>'.
	 * @see net.sf.smbt.midi.ezmidi.ControllerChange
	 * @generated
	 */
	EClass getControllerChange();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.midi.ezmidi.ControllerChange#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.midi.ezmidi.ControllerChange#getValue()
	 * @see #getControllerChange()
	 * @generated
	 */
	EAttribute getControllerChange_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.midi.ezmidi.ControllerChange#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controller</em>'.
	 * @see net.sf.smbt.midi.ezmidi.ControllerChange#getController()
	 * @see #getControllerChange()
	 * @generated
	 */
	EAttribute getControllerChange_Controller();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.midi.ezmidi.ProgramChange <em>Program Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Change</em>'.
	 * @see net.sf.smbt.midi.ezmidi.ProgramChange
	 * @generated
	 */
	EClass getProgramChange();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.midi.ezmidi.ProgramChange#getPreset <em>Preset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preset</em>'.
	 * @see net.sf.smbt.midi.ezmidi.ProgramChange#getPreset()
	 * @see #getProgramChange()
	 * @generated
	 */
	EAttribute getProgramChange_Preset();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.midi.ezmidi.ChannelPressure <em>Channel Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel Pressure</em>'.
	 * @see net.sf.smbt.midi.ezmidi.ChannelPressure
	 * @generated
	 */
	EClass getChannelPressure();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.midi.ezmidi.ChannelPressure#getPressure <em>Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pressure</em>'.
	 * @see net.sf.smbt.midi.ezmidi.ChannelPressure#getPressure()
	 * @see #getChannelPressure()
	 * @generated
	 */
	EAttribute getChannelPressure_Pressure();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.midi.ezmidi.PitchBend <em>Pitch Bend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pitch Bend</em>'.
	 * @see net.sf.smbt.midi.ezmidi.PitchBend
	 * @generated
	 */
	EClass getPitchBend();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.midi.ezmidi.PitchBend#getBend <em>Bend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bend</em>'.
	 * @see net.sf.smbt.midi.ezmidi.PitchBend#getBend()
	 * @see #getPitchBend()
	 * @generated
	 */
	EAttribute getPitchBend_Bend();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.midi.ezmidi.SystemExclusive <em>System Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Exclusive</em>'.
	 * @see net.sf.smbt.midi.ezmidi.SystemExclusive
	 * @generated
	 */
	EClass getSystemExclusive();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.midi.ezmidi.SongPosition <em>Song Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Song Position</em>'.
	 * @see net.sf.smbt.midi.ezmidi.SongPosition
	 * @generated
	 */
	EClass getSongPosition();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.midi.ezmidi.SongPosition#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see net.sf.smbt.midi.ezmidi.SongPosition#getPosition()
	 * @see #getSongPosition()
	 * @generated
	 */
	EAttribute getSongPosition_Position();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.midi.ezmidi.SongSelect <em>Song Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Song Select</em>'.
	 * @see net.sf.smbt.midi.ezmidi.SongSelect
	 * @generated
	 */
	EClass getSongSelect();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.midi.ezmidi.SongSelect#getSongNumber <em>Song Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Song Number</em>'.
	 * @see net.sf.smbt.midi.ezmidi.SongSelect#getSongNumber()
	 * @see #getSongSelect()
	 * @generated
	 */
	EAttribute getSongSelect_SongNumber();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.midi.ezmidi.UnofficialBusSelect <em>Unofficial Bus Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unofficial Bus Select</em>'.
	 * @see net.sf.smbt.midi.ezmidi.UnofficialBusSelect
	 * @generated
	 */
	EClass getUnofficialBusSelect();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.midi.ezmidi.UnofficialBusSelect#getBusNumber <em>Bus Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bus Number</em>'.
	 * @see net.sf.smbt.midi.ezmidi.UnofficialBusSelect#getBusNumber()
	 * @see #getUnofficialBusSelect()
	 * @generated
	 */
	EAttribute getUnofficialBusSelect_BusNumber();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.midi.ezmidi.TuneRequest <em>Tune Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tune Request</em>'.
	 * @see net.sf.smbt.midi.ezmidi.TuneRequest
	 * @generated
	 */
	EClass getTuneRequest();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.midi.ezmidi.EndOfExclusive <em>End Of Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Of Exclusive</em>'.
	 * @see net.sf.smbt.midi.ezmidi.EndOfExclusive
	 * @generated
	 */
	EClass getEndOfExclusive();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.midi.ezmidi.TimingTick <em>Timing Tick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Tick</em>'.
	 * @see net.sf.smbt.midi.ezmidi.TimingTick
	 * @generated
	 */
	EClass getTimingTick();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.midi.ezmidi.StartSong <em>Start Song</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Song</em>'.
	 * @see net.sf.smbt.midi.ezmidi.StartSong
	 * @generated
	 */
	EClass getStartSong();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.midi.ezmidi.ContinueSong <em>Continue Song</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continue Song</em>'.
	 * @see net.sf.smbt.midi.ezmidi.ContinueSong
	 * @generated
	 */
	EClass getContinueSong();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.midi.ezmidi.StopSong <em>Stop Song</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Song</em>'.
	 * @see net.sf.smbt.midi.ezmidi.StopSong
	 * @generated
	 */
	EClass getStopSong();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.midi.ezmidi.ActiveSensing <em>Active Sensing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Active Sensing</em>'.
	 * @see net.sf.smbt.midi.ezmidi.ActiveSensing
	 * @generated
	 */
	EClass getActiveSensing();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.midi.ezmidi.SystemReset <em>System Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Reset</em>'.
	 * @see net.sf.smbt.midi.ezmidi.SystemReset
	 * @generated
	 */
	EClass getSystemReset();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.midi.ezmidi.MidiTimeCode <em>Midi Time Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Midi Time Code</em>'.
	 * @see net.sf.smbt.midi.ezmidi.MidiTimeCode
	 * @generated
	 */
	EClass getMidiTimeCode();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.midi.ezmidi.PolyPressure <em>Poly Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poly Pressure</em>'.
	 * @see net.sf.smbt.midi.ezmidi.PolyPressure
	 * @generated
	 */
	EClass getPolyPressure();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.midi.ezmidi.PolyPressure#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see net.sf.smbt.midi.ezmidi.PolyPressure#getNote()
	 * @see #getPolyPressure()
	 * @generated
	 */
	EAttribute getPolyPressure_Note();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.midi.ezmidi.PolyPressure#getPressure <em>Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pressure</em>'.
	 * @see net.sf.smbt.midi.ezmidi.PolyPressure#getPressure()
	 * @see #getPolyPressure()
	 * @generated
	 */
	EAttribute getPolyPressure_Pressure();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.midi.ezmidi.TimingClock <em>Timing Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Clock</em>'.
	 * @see net.sf.smbt.midi.ezmidi.TimingClock
	 * @generated
	 */
	EClass getTimingClock();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.midi.ezmidi.TimeCode <em>Time Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Code</em>'.
	 * @see net.sf.smbt.midi.ezmidi.TimeCode
	 * @generated
	 */
	EClass getTimeCode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EzmidiFactory getEzmidiFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.midi.ezmidi.impl.AbstractMidiCmdImpl <em>Abstract Midi Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.midi.ezmidi.impl.AbstractMidiCmdImpl
		 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getAbstractMidiCmd()
		 * @generated
		 */
		EClass ABSTRACT_MIDI_CMD = eINSTANCE.getAbstractMidiCmd();

		/**
		 * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_MIDI_CMD__ADDR = eINSTANCE.getAbstractMidiCmd_Addr();

		/**
		 * The meta object literal for the '<em><b>Msg Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_MIDI_CMD__MSG_SIZE = eINSTANCE.getAbstractMidiCmd_MsgSize();

		/**
		 * The meta object literal for the '<em><b>Byte1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_MIDI_CMD__BYTE1 = eINSTANCE.getAbstractMidiCmd_Byte1();

		/**
		 * The meta object literal for the '<em><b>Byte2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_MIDI_CMD__BYTE2 = eINSTANCE.getAbstractMidiCmd_Byte2();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_MIDI_CMD__MESSAGE = eINSTANCE.getAbstractMidiCmd_Message();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.midi.ezmidi.impl.SysexMessageImpl <em>Sysex Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.midi.ezmidi.impl.SysexMessageImpl
		 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getSysexMessage()
		 * @generated
		 */
		EClass SYSEX_MESSAGE = eINSTANCE.getSysexMessage();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES <em>CONTROLLER CHANGE VALUES</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.midi.ezmidi.CONTROLLER_CHANGE_VALUES
		 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getCONTROLLER_CHANGE_VALUES()
		 * @generated
		 */
		EEnum CONTROLLER_CHANGE_VALUES = eINSTANCE.getCONTROLLER_CHANGE_VALUES();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.midi.ezmidi.impl.SysexGSResetImpl <em>Sysex GS Reset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.midi.ezmidi.impl.SysexGSResetImpl
		 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getSysexGSReset()
		 * @generated
		 */
		EClass SYSEX_GS_RESET = eINSTANCE.getSysexGSReset();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.midi.ezmidi.impl.SysexPatchChangedImpl <em>Sysex Patch Changed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.midi.ezmidi.impl.SysexPatchChangedImpl
		 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getSysexPatchChanged()
		 * @generated
		 */
		EClass SYSEX_PATCH_CHANGED = eINSTANCE.getSysexPatchChanged();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.midi.ezmidi.impl.DSLMidiMessageImpl <em>DSL Midi Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.midi.ezmidi.impl.DSLMidiMessageImpl
		 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getDSLMidiMessage()
		 * @generated
		 */
		EClass DSL_MIDI_MESSAGE = eINSTANCE.getDSLMidiMessage();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_MIDI_MESSAGE__CHANNEL = eINSTANCE.getDSLMidiMessage_Channel();

		/**
		 * The meta object literal for the '<em><b>Cmd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSL_MIDI_MESSAGE__CMD = eINSTANCE.getDSLMidiMessage_Cmd();

		/**
		 * The meta object literal for the '<em>Midi Message</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.sound.midi.MidiMessage
		 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getMidiMessage()
		 * @generated
		 */
		EDataType MIDI_MESSAGE = eINSTANCE.getMidiMessage();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.midi.ezmidi.impl.NoteONImpl <em>Note ON</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.midi.ezmidi.impl.NoteONImpl
		 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getNoteON()
		 * @generated
		 */
		EClass NOTE_ON = eINSTANCE.getNoteON();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE_ON__NOTE = eINSTANCE.getNoteON_Note();

		/**
		 * The meta object literal for the '<em><b>Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE_ON__VELOCITY = eINSTANCE.getNoteON_Velocity();

		/**
		 * The meta object literal for the '<em><b>Pitch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE_ON__PITCH = eINSTANCE.getNoteON_Pitch();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.midi.ezmidi.impl.NoteOFFImpl <em>Note OFF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.midi.ezmidi.impl.NoteOFFImpl
		 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getNoteOFF()
		 * @generated
		 */
		EClass NOTE_OFF = eINSTANCE.getNoteOFF();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE_OFF__NOTE = eINSTANCE.getNoteOFF_Note();

		/**
		 * The meta object literal for the '<em><b>Velocity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE_OFF__VELOCITY = eINSTANCE.getNoteOFF_Velocity();

		/**
		 * The meta object literal for the '<em><b>Pitch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE_OFF__PITCH = eINSTANCE.getNoteOFF_Pitch();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.midi.ezmidi.impl.KeyPressureImpl <em>Key Pressure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.midi.ezmidi.impl.KeyPressureImpl
		 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getKeyPressure()
		 * @generated
		 */
		EClass KEY_PRESSURE = eINSTANCE.getKeyPressure();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_PRESSURE__KEY = eINSTANCE.getKeyPressure_Key();

		/**
		 * The meta object literal for the '<em><b>Pressure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_PRESSURE__PRESSURE = eINSTANCE.getKeyPressure_Pressure();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.midi.ezmidi.impl.ControllerChangeImpl <em>Controller Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.midi.ezmidi.impl.ControllerChangeImpl
		 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getControllerChange()
		 * @generated
		 */
		EClass CONTROLLER_CHANGE = eINSTANCE.getControllerChange();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_CHANGE__VALUE = eINSTANCE.getControllerChange_Value();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER_CHANGE__CONTROLLER = eINSTANCE.getControllerChange_Controller();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.midi.ezmidi.impl.ProgramChangeImpl <em>Program Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.midi.ezmidi.impl.ProgramChangeImpl
		 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getProgramChange()
		 * @generated
		 */
		EClass PROGRAM_CHANGE = eINSTANCE.getProgramChange();

		/**
		 * The meta object literal for the '<em><b>Preset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_CHANGE__PRESET = eINSTANCE.getProgramChange_Preset();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.midi.ezmidi.impl.ChannelPressureImpl <em>Channel Pressure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.midi.ezmidi.impl.ChannelPressureImpl
		 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getChannelPressure()
		 * @generated
		 */
		EClass CHANNEL_PRESSURE = eINSTANCE.getChannelPressure();

		/**
		 * The meta object literal for the '<em><b>Pressure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL_PRESSURE__PRESSURE = eINSTANCE.getChannelPressure_Pressure();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.midi.ezmidi.impl.PitchBendImpl <em>Pitch Bend</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.midi.ezmidi.impl.PitchBendImpl
		 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getPitchBend()
		 * @generated
		 */
		EClass PITCH_BEND = eINSTANCE.getPitchBend();

		/**
		 * The meta object literal for the '<em><b>Bend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PITCH_BEND__BEND = eINSTANCE.getPitchBend_Bend();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.midi.ezmidi.impl.SystemExclusiveImpl <em>System Exclusive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.midi.ezmidi.impl.SystemExclusiveImpl
		 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getSystemExclusive()
		 * @generated
		 */
		EClass SYSTEM_EXCLUSIVE = eINSTANCE.getSystemExclusive();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.midi.ezmidi.impl.SongPositionImpl <em>Song Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.midi.ezmidi.impl.SongPositionImpl
		 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getSongPosition()
		 * @generated
		 */
		EClass SONG_POSITION = eINSTANCE.getSongPosition();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG_POSITION__POSITION = eINSTANCE.getSongPosition_Position();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.midi.ezmidi.impl.SongSelectImpl <em>Song Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.midi.ezmidi.impl.SongSelectImpl
		 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getSongSelect()
		 * @generated
		 */
		EClass SONG_SELECT = eINSTANCE.getSongSelect();

		/**
		 * The meta object literal for the '<em><b>Song Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SONG_SELECT__SONG_NUMBER = eINSTANCE.getSongSelect_SongNumber();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.midi.ezmidi.impl.UnofficialBusSelectImpl <em>Unofficial Bus Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.midi.ezmidi.impl.UnofficialBusSelectImpl
		 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getUnofficialBusSelect()
		 * @generated
		 */
		EClass UNOFFICIAL_BUS_SELECT = eINSTANCE.getUnofficialBusSelect();

		/**
		 * The meta object literal for the '<em><b>Bus Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNOFFICIAL_BUS_SELECT__BUS_NUMBER = eINSTANCE.getUnofficialBusSelect_BusNumber();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.midi.ezmidi.impl.TuneRequestImpl <em>Tune Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.midi.ezmidi.impl.TuneRequestImpl
		 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getTuneRequest()
		 * @generated
		 */
		EClass TUNE_REQUEST = eINSTANCE.getTuneRequest();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.midi.ezmidi.impl.EndOfExclusiveImpl <em>End Of Exclusive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.midi.ezmidi.impl.EndOfExclusiveImpl
		 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getEndOfExclusive()
		 * @generated
		 */
		EClass END_OF_EXCLUSIVE = eINSTANCE.getEndOfExclusive();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.midi.ezmidi.impl.TimingTickImpl <em>Timing Tick</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.midi.ezmidi.impl.TimingTickImpl
		 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getTimingTick()
		 * @generated
		 */
		EClass TIMING_TICK = eINSTANCE.getTimingTick();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.midi.ezmidi.impl.StartSongImpl <em>Start Song</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.midi.ezmidi.impl.StartSongImpl
		 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getStartSong()
		 * @generated
		 */
		EClass START_SONG = eINSTANCE.getStartSong();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.midi.ezmidi.impl.ContinueSongImpl <em>Continue Song</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.midi.ezmidi.impl.ContinueSongImpl
		 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getContinueSong()
		 * @generated
		 */
		EClass CONTINUE_SONG = eINSTANCE.getContinueSong();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.midi.ezmidi.impl.StopSongImpl <em>Stop Song</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.midi.ezmidi.impl.StopSongImpl
		 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getStopSong()
		 * @generated
		 */
		EClass STOP_SONG = eINSTANCE.getStopSong();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.midi.ezmidi.impl.ActiveSensingImpl <em>Active Sensing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.midi.ezmidi.impl.ActiveSensingImpl
		 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getActiveSensing()
		 * @generated
		 */
		EClass ACTIVE_SENSING = eINSTANCE.getActiveSensing();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.midi.ezmidi.impl.SystemResetImpl <em>System Reset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.midi.ezmidi.impl.SystemResetImpl
		 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getSystemReset()
		 * @generated
		 */
		EClass SYSTEM_RESET = eINSTANCE.getSystemReset();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.midi.ezmidi.impl.MidiTimeCodeImpl <em>Midi Time Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.midi.ezmidi.impl.MidiTimeCodeImpl
		 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getMidiTimeCode()
		 * @generated
		 */
		EClass MIDI_TIME_CODE = eINSTANCE.getMidiTimeCode();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.midi.ezmidi.impl.PolyPressureImpl <em>Poly Pressure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.midi.ezmidi.impl.PolyPressureImpl
		 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getPolyPressure()
		 * @generated
		 */
		EClass POLY_PRESSURE = eINSTANCE.getPolyPressure();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLY_PRESSURE__NOTE = eINSTANCE.getPolyPressure_Note();

		/**
		 * The meta object literal for the '<em><b>Pressure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLY_PRESSURE__PRESSURE = eINSTANCE.getPolyPressure_Pressure();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.midi.ezmidi.impl.TimingClockImpl <em>Timing Clock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.midi.ezmidi.impl.TimingClockImpl
		 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getTimingClock()
		 * @generated
		 */
		EClass TIMING_CLOCK = eINSTANCE.getTimingClock();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.midi.ezmidi.impl.TimeCodeImpl <em>Time Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.midi.ezmidi.impl.TimeCodeImpl
		 * @see net.sf.smbt.midi.ezmidi.impl.EzmidiPackageImpl#getTimeCode()
		 * @generated
		 */
		EClass TIME_CODE = eINSTANCE.getTimeCode();

	}

} //EzmidiPackage
