/**
 * <copyright>
 * </copyright>
 *
 * $Id: BlinkMCmd.java,v 1.2 2009/01/20 07:06:03 lucascraft Exp $
 */
package net.sf.smbt.commands;

import net.sf.xqz.model.cmd.Cmd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blink MCmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.commands.BlinkMCmd#getCmdByte <em>Cmd Byte</em>}</li>
 *   <li>{@link net.sf.smbt.commands.BlinkMCmd#getCmdChar <em>Cmd Char</em>}</li>
 *   <li>{@link net.sf.smbt.commands.BlinkMCmd#getArguments <em>Arguments</em>}</li>
 *   <li>{@link net.sf.smbt.commands.BlinkMCmd#getRetValues <em>Ret Values</em>}</li>
 *   <li>{@link net.sf.smbt.commands.BlinkMCmd#getAddr <em>Addr</em>}</li>
 *   <li>{@link net.sf.smbt.commands.BlinkMCmd#getFlag <em>Flag</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.commands.CommandsPackage#getBlinkMCmd()
 * @model
 * @generated
 */
public interface BlinkMCmd extends Cmd {
	/**
	 * Returns the value of the '<em><b>Cmd Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cmd Byte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmd Byte</em>' attribute.
	 * @see #setCmdByte(byte)
	 * @see net.sf.smbt.commands.CommandsPackage#getBlinkMCmd_CmdByte()
	 * @model
	 * @generated
	 */
	byte getCmdByte();

	/**
	 * Sets the value of the '{@link net.sf.smbt.commands.BlinkMCmd#getCmdByte <em>Cmd Byte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmd Byte</em>' attribute.
	 * @see #getCmdByte()
	 * @generated
	 */
	void setCmdByte(byte value);

	/**
	 * Returns the value of the '<em><b>Cmd Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cmd Char</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmd Char</em>' attribute.
	 * @see #setCmdChar(byte)
	 * @see net.sf.smbt.commands.CommandsPackage#getBlinkMCmd_CmdChar()
	 * @model
	 * @generated
	 */
	byte getCmdChar();

	/**
	 * Sets the value of the '{@link net.sf.smbt.commands.BlinkMCmd#getCmdChar <em>Cmd Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmd Char</em>' attribute.
	 * @see #getCmdChar()
	 * @generated
	 */
	void setCmdChar(byte value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' attribute.
	 * @see #setArguments(byte[])
	 * @see net.sf.smbt.commands.CommandsPackage#getBlinkMCmd_Arguments()
	 * @model
	 * @generated
	 */
	byte[] getArguments();

	/**
	 * Sets the value of the '{@link net.sf.smbt.commands.BlinkMCmd#getArguments <em>Arguments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arguments</em>' attribute.
	 * @see #getArguments()
	 * @generated
	 */
	void setArguments(byte[] value);

	/**
	 * Returns the value of the '<em><b>Ret Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ret Values</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ret Values</em>' attribute.
	 * @see #setRetValues(byte[])
	 * @see net.sf.smbt.commands.CommandsPackage#getBlinkMCmd_RetValues()
	 * @model
	 * @generated
	 */
	byte[] getRetValues();

	/**
	 * Sets the value of the '{@link net.sf.smbt.commands.BlinkMCmd#getRetValues <em>Ret Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ret Values</em>' attribute.
	 * @see #getRetValues()
	 * @generated
	 */
	void setRetValues(byte[] value);

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
	 * @see net.sf.smbt.commands.CommandsPackage#getBlinkMCmd_Addr()
	 * @model
	 * @generated
	 */
	byte getAddr();

	/**
	 * Sets the value of the '{@link net.sf.smbt.commands.BlinkMCmd#getAddr <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addr</em>' attribute.
	 * @see #getAddr()
	 * @generated
	 */
	void setAddr(byte value);

	/**
	 * Returns the value of the '<em><b>Flag</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.commands.FLAG}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flag</em>' attribute.
	 * @see net.sf.smbt.commands.FLAG
	 * @see #setFlag(FLAG)
	 * @see net.sf.smbt.commands.CommandsPackage#getBlinkMCmd_Flag()
	 * @model
	 * @generated
	 */
	FLAG getFlag();

	/**
	 * Sets the value of the '{@link net.sf.smbt.commands.BlinkMCmd#getFlag <em>Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flag</em>' attribute.
	 * @see net.sf.smbt.commands.FLAG
	 * @see #getFlag()
	 * @generated
	 */
	void setFlag(FLAG value);

} // BlinkMCmd
