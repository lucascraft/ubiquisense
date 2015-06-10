/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osccmd;

import net.sf.xqz.model.cmd.Cmd;

import com.illposed.osc.OSCPacket;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Osc Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.osccmd.OscCmd#getMsg <em>Msg</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.osccmd.OsccmdPackage#getOscCmd()
 * @model
 * @generated
 */
public interface OscCmd extends Cmd {

	/**
	 * Returns the value of the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Msg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg</em>' attribute.
	 * @see #setMsg(OSCPacket)
	 * @see net.sf.smbt.osccmd.OsccmdPackage#getOscCmd_Msg()
	 * @model dataType="net.sf.smbt.osccmd.OSCPacket"
	 * @generated
	 */
	OSCPacket getMsg();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osccmd.OscCmd#getMsg <em>Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msg</em>' attribute.
	 * @see #getMsg()
	 * @generated
	 */
	void setMsg(OSCPacket value);
} // OscCmd
