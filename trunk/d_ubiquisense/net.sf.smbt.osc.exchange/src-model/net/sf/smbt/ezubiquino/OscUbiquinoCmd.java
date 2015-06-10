/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezubiquino;

import net.sf.smbt.osccmd.OscCmd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Osc Ubiquino Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezubiquino.OscUbiquinoCmd#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezubiquino.EzubiquinoPackage#getOscUbiquinoCmd()
 * @model
 * @generated
 */
public interface OscUbiquinoCmd extends OscCmd {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.ezubiquino.UbiquinoKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.ezubiquino.UbiquinoKind
	 * @see #setKind(UbiquinoKind)
	 * @see net.sf.smbt.ezubiquino.EzubiquinoPackage#getOscUbiquinoCmd_Kind()
	 * @model
	 * @generated
	 */
	UbiquinoKind getKind();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezubiquino.OscUbiquinoCmd#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.ezubiquino.UbiquinoKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(UbiquinoKind value);

} // OscUbiquinoCmd
