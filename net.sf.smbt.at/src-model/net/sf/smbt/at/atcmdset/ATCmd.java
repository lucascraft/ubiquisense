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
 * A representation of the model object '<em><b>AT Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.at.atcmdset.ATCmd#getKind <em>Kind</em>}</li>
 *   <li>{@link net.sf.smbt.at.atcmdset.ATCmd#getToken <em>Token</em>}</li>
 *   <li>{@link net.sf.smbt.at.atcmdset.ATCmd#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.at.atcmdset.AtcmdsetPackage#getATCmd()
 * @model
 * @generated
 */
public interface ATCmd extends Cmd {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES
	 * @see #setKind(AT_COMMAND_TYPES)
	 * @see net.sf.smbt.at.atcmdset.AtcmdsetPackage#getATCmd_Kind()
	 * @model
	 * @generated
	 */
	AT_COMMAND_TYPES getKind();

	/**
	 * Sets the value of the '{@link net.sf.smbt.at.atcmdset.ATCmd#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES
	 * @see #getKind()
	 * @generated
	 */
	void setKind(AT_COMMAND_TYPES value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(String)
	 * @see net.sf.smbt.at.atcmdset.AtcmdsetPackage#getATCmd_Token()
	 * @model
	 * @generated
	 */
	String getToken();

	/**
	 * Sets the value of the '{@link net.sf.smbt.at.atcmdset.ATCmd#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(String value);

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
	 * @see net.sf.smbt.at.atcmdset.AtcmdsetPackage#getATCmd_Data()
	 * @model
	 * @generated
	 */
	byte[] getData();

	/**
	 * Sets the value of the '{@link net.sf.smbt.at.atcmdset.ATCmd#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(byte[] value);

} // ATCmd
