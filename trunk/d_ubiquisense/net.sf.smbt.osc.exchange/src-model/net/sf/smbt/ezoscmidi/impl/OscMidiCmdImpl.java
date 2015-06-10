/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezoscmidi.impl;

import net.sf.smbt.ezoscmidi.EzoscmidiPackage;
import net.sf.smbt.ezoscmidi.OscMidiCmd;
import net.sf.smbt.midi.ezmidi.AbstractMidiCmd;
import net.sf.smbt.midi.ezmidi.EzmidiPackage;
import net.sf.smbt.osccmd.impl.OscCmdImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Osc Midi Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezoscmidi.impl.OscMidiCmdImpl#getAddr <em>Addr</em>}</li>
 *   <li>{@link net.sf.smbt.ezoscmidi.impl.OscMidiCmdImpl#getMsgSize <em>Msg Size</em>}</li>
 *   <li>{@link net.sf.smbt.ezoscmidi.impl.OscMidiCmdImpl#getByte1 <em>Byte1</em>}</li>
 *   <li>{@link net.sf.smbt.ezoscmidi.impl.OscMidiCmdImpl#getByte2 <em>Byte2</em>}</li>
 *   <li>{@link net.sf.smbt.ezoscmidi.impl.OscMidiCmdImpl#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OscMidiCmdImpl extends OscCmdImpl implements OscMidiCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OscMidiCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzoscmidiPackage.Literals.OSC_MIDI_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getAddr() {
		return (Byte)eGet(EzmidiPackage.Literals.ABSTRACT_MIDI_CMD__ADDR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddr(byte newAddr) {
		eSet(EzmidiPackage.Literals.ABSTRACT_MIDI_CMD__ADDR, newAddr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMsgSize() {
		return (Integer)eGet(EzmidiPackage.Literals.ABSTRACT_MIDI_CMD__MSG_SIZE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMsgSize(int newMsgSize) {
		eSet(EzmidiPackage.Literals.ABSTRACT_MIDI_CMD__MSG_SIZE, newMsgSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getByte1() {
		return (Byte)eGet(EzmidiPackage.Literals.ABSTRACT_MIDI_CMD__BYTE1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByte1(byte newByte1) {
		eSet(EzmidiPackage.Literals.ABSTRACT_MIDI_CMD__BYTE1, newByte1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getByte2() {
		return (Byte)eGet(EzmidiPackage.Literals.ABSTRACT_MIDI_CMD__BYTE2, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByte2(byte newByte2) {
		eSet(EzmidiPackage.Literals.ABSTRACT_MIDI_CMD__BYTE2, newByte2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getMessage() {
		return (byte[])eGet(EzmidiPackage.Literals.ABSTRACT_MIDI_CMD__MESSAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(byte[] newMessage) {
		eSet(EzmidiPackage.Literals.ABSTRACT_MIDI_CMD__MESSAGE, newMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractMidiCmd.class) {
			switch (derivedFeatureID) {
				case EzoscmidiPackage.OSC_MIDI_CMD__ADDR: return EzmidiPackage.ABSTRACT_MIDI_CMD__ADDR;
				case EzoscmidiPackage.OSC_MIDI_CMD__MSG_SIZE: return EzmidiPackage.ABSTRACT_MIDI_CMD__MSG_SIZE;
				case EzoscmidiPackage.OSC_MIDI_CMD__BYTE1: return EzmidiPackage.ABSTRACT_MIDI_CMD__BYTE1;
				case EzoscmidiPackage.OSC_MIDI_CMD__BYTE2: return EzmidiPackage.ABSTRACT_MIDI_CMD__BYTE2;
				case EzoscmidiPackage.OSC_MIDI_CMD__MESSAGE: return EzmidiPackage.ABSTRACT_MIDI_CMD__MESSAGE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractMidiCmd.class) {
			switch (baseFeatureID) {
				case EzmidiPackage.ABSTRACT_MIDI_CMD__ADDR: return EzoscmidiPackage.OSC_MIDI_CMD__ADDR;
				case EzmidiPackage.ABSTRACT_MIDI_CMD__MSG_SIZE: return EzoscmidiPackage.OSC_MIDI_CMD__MSG_SIZE;
				case EzmidiPackage.ABSTRACT_MIDI_CMD__BYTE1: return EzoscmidiPackage.OSC_MIDI_CMD__BYTE1;
				case EzmidiPackage.ABSTRACT_MIDI_CMD__BYTE2: return EzoscmidiPackage.OSC_MIDI_CMD__BYTE2;
				case EzmidiPackage.ABSTRACT_MIDI_CMD__MESSAGE: return EzoscmidiPackage.OSC_MIDI_CMD__MESSAGE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //OscMidiCmdImpl
