/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.midi.ezmidi;

import net.sf.xqz.model.cmd.Cmd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Midi Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.midi.ezmidi.AbstractMidiCmd#getAddr <em>Addr</em>}</li>
 *   <li>{@link net.sf.smbt.midi.ezmidi.AbstractMidiCmd#getMsgSize <em>Msg Size</em>}</li>
 *   <li>{@link net.sf.smbt.midi.ezmidi.AbstractMidiCmd#getByte1 <em>Byte1</em>}</li>
 *   <li>{@link net.sf.smbt.midi.ezmidi.AbstractMidiCmd#getByte2 <em>Byte2</em>}</li>
 *   <li>{@link net.sf.smbt.midi.ezmidi.AbstractMidiCmd#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.midi.ezmidi.EzmidiPackage#getAbstractMidiCmd()
 * @model abstract="true"
 * @generated
 */
public interface AbstractMidiCmd extends Cmd {
	/**
	 * Returns the value of the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addr</em>' attribute.
	 * @see #setAddr(byte)
	 * @see net.sf.smbt.midi.ezmidi.EzmidiPackage#getAbstractMidiCmd_Addr()
	 * @model
	 * @generated
	 */
	byte getAddr();

	/**
	 * Sets the value of the '{@link net.sf.smbt.midi.ezmidi.AbstractMidiCmd#getAddr <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addr</em>' attribute.
	 * @see #getAddr()
	 * @generated
	 */
	void setAddr(byte value);

	/**
	 * Returns the value of the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg Size</em>' attribute.
	 * @see #setMsgSize(int)
	 * @see net.sf.smbt.midi.ezmidi.EzmidiPackage#getAbstractMidiCmd_MsgSize()
	 * @model
	 * @generated
	 */
	int getMsgSize();

	/**
	 * Sets the value of the '{@link net.sf.smbt.midi.ezmidi.AbstractMidiCmd#getMsgSize <em>Msg Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msg Size</em>' attribute.
	 * @see #getMsgSize()
	 * @generated
	 */
	void setMsgSize(int value);

	/**
	 * Returns the value of the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte1</em>' attribute.
	 * @see #setByte1(byte)
	 * @see net.sf.smbt.midi.ezmidi.EzmidiPackage#getAbstractMidiCmd_Byte1()
	 * @model
	 * @generated
	 */
	byte getByte1();

	/**
	 * Sets the value of the '{@link net.sf.smbt.midi.ezmidi.AbstractMidiCmd#getByte1 <em>Byte1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte1</em>' attribute.
	 * @see #getByte1()
	 * @generated
	 */
	void setByte1(byte value);

	/**
	 * Returns the value of the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte2</em>' attribute.
	 * @see #setByte2(byte)
	 * @see net.sf.smbt.midi.ezmidi.EzmidiPackage#getAbstractMidiCmd_Byte2()
	 * @model
	 * @generated
	 */
	byte getByte2();

	/**
	 * Sets the value of the '{@link net.sf.smbt.midi.ezmidi.AbstractMidiCmd#getByte2 <em>Byte2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte2</em>' attribute.
	 * @see #getByte2()
	 * @generated
	 */
	void setByte2(byte value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(byte[])
	 * @see net.sf.smbt.midi.ezmidi.EzmidiPackage#getAbstractMidiCmd_Message()
	 * @model
	 * @generated
	 */
	byte[] getMessage();

	/**
	 * Sets the value of the '{@link net.sf.smbt.midi.ezmidi.AbstractMidiCmd#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(byte[] value);

} // AbstractMidiCmd
