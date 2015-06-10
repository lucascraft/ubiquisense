/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.midi.ezmidi.impl;

import net.sf.smbt.midi.ezmidi.AbstractMidiCmd;
import net.sf.smbt.midi.ezmidi.EzmidiPackage;
import net.sf.xqz.engine.cmd.utils.CmdUtil;
import net.sf.xqz.model.cmd.impl.CmdImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Midi Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.midi.ezmidi.impl.AbstractMidiCmdImpl#getAddr <em>Addr</em>}</li>
 *   <li>{@link net.sf.smbt.midi.ezmidi.impl.AbstractMidiCmdImpl#getMsgSize <em>Msg Size</em>}</li>
 *   <li>{@link net.sf.smbt.midi.ezmidi.impl.AbstractMidiCmdImpl#getByte1 <em>Byte1</em>}</li>
 *   <li>{@link net.sf.smbt.midi.ezmidi.impl.AbstractMidiCmdImpl#getByte2 <em>Byte2</em>}</li>
 *   <li>{@link net.sf.smbt.midi.ezmidi.impl.AbstractMidiCmdImpl#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractMidiCmdImpl extends CmdImpl implements AbstractMidiCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractMidiCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzmidiPackage.Literals.ABSTRACT_MIDI_CMD;
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
	
	public String toString() {
		return CmdUtil.INSTANCE.getFrameHexInfo(getMessage());
	};

} //AbstractMidiCmdImpl
