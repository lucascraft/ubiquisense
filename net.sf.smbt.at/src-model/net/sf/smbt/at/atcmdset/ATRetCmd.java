/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.at.atcmdset;

import net.sf.xqz.model.cmd.Cmd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AT Ret Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.at.atcmdset.ATRetCmd#getCode <em>Code</em>}</li>
 *   <li>{@link net.sf.smbt.at.atcmdset.ATRetCmd#getData <em>Data</em>}</li>
 *   <li>{@link net.sf.smbt.at.atcmdset.ATRetCmd#getMessage <em>Message</em>}</li>
 *   <li>{@link net.sf.smbt.at.atcmdset.ATRetCmd#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.at.atcmdset.AtcmdsetPackage#getATRetCmd()
 * @model
 * @generated
 */
public interface ATRetCmd extends Cmd {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.at.atcmdset.AT_RET_CODES}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see net.sf.smbt.at.atcmdset.AT_RET_CODES
	 * @see #setCode(AT_RET_CODES)
	 * @see net.sf.smbt.at.atcmdset.AtcmdsetPackage#getATRetCmd_Code()
	 * @model
	 * @generated
	 */
	AT_RET_CODES getCode();

	/**
	 * Sets the value of the '{@link net.sf.smbt.at.atcmdset.ATRetCmd#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see net.sf.smbt.at.atcmdset.AT_RET_CODES
	 * @see #getCode()
	 * @generated
	 */
	void setCode(AT_RET_CODES value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(byte[])
	 * @see net.sf.smbt.at.atcmdset.AtcmdsetPackage#getATRetCmd_Data()
	 * @model
	 * @generated
	 */
	byte[] getData();

	/**
	 * Sets the value of the '{@link net.sf.smbt.at.atcmdset.ATRetCmd#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(byte[] value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see net.sf.smbt.at.atcmdset.AtcmdsetPackage#getATRetCmd_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link net.sf.smbt.at.atcmdset.ATRetCmd#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.at.atcmdset.AT_STATUS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see net.sf.smbt.at.atcmdset.AT_STATUS
	 * @see #setStatus(AT_STATUS)
	 * @see net.sf.smbt.at.atcmdset.AtcmdsetPackage#getATRetCmd_Status()
	 * @model
	 * @generated
	 */
	AT_STATUS getStatus();

	/**
	 * Sets the value of the '{@link net.sf.smbt.at.atcmdset.ATRetCmd#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see net.sf.smbt.at.atcmdset.AT_STATUS
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(AT_STATUS value);

} // ATRetCmd
