/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsniff;

import net.sf.xqz.model.cmd.XCmd;

import org.eclipse.emf.ecore.EClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EZ Sniff Hit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsniff.EZSniffHit#getSeek <em>Seek</em>}</li>
 *   <li>{@link net.sf.smbt.ezsniff.EZSniffHit#getHit <em>Hit</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezsniff.EzsniffPackage#getEZSniffHit()
 * @model
 * @generated
 */
public interface EZSniffHit extends AbstractEZSniffElem {
	/**
	 * Returns the value of the '<em><b>Seek</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seek</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seek</em>' reference.
	 * @see #setSeek(EClassifier)
	 * @see net.sf.smbt.ezsniff.EzsniffPackage#getEZSniffHit_Seek()
	 * @model
	 * @generated
	 */
	EClassifier getSeek();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsniff.EZSniffHit#getSeek <em>Seek</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seek</em>' reference.
	 * @see #getSeek()
	 * @generated
	 */
	void setSeek(EClassifier value);

	/**
	 * Returns the value of the '<em><b>Hit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hit</em>' reference.
	 * @see #setHit(XCmd)
	 * @see net.sf.smbt.ezsniff.EzsniffPackage#getEZSniffHit_Hit()
	 * @model
	 * @generated
	 */
	XCmd getHit();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsniff.EZSniffHit#getHit <em>Hit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hit</em>' reference.
	 * @see #getHit()
	 * @generated
	 */
	void setHit(XCmd value);

} // EZSniffHit
