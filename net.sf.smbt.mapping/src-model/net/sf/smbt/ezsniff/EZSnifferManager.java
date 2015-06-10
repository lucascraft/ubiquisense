/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsniff;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EZ Sniffer Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsniff.EZSnifferManager#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.smbt.ezsniff.EZSnifferManager#getSniffers <em>Sniffers</em>}</li>
 *   <li>{@link net.sf.smbt.ezsniff.EZSnifferManager#getCache <em>Cache</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezsniff.EzsniffPackage#getEZSnifferManager()
 * @model
 * @generated
 */
public interface EZSnifferManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see net.sf.smbt.ezsniff.EzsniffPackage#getEZSnifferManager_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsniff.EZSnifferManager#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Sniffers</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezsniff.EZSniffer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sniffers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sniffers</em>' containment reference list.
	 * @see net.sf.smbt.ezsniff.EzsniffPackage#getEZSnifferManager_Sniffers()
	 * @model containment="true"
	 * @generated
	 */
	EList<EZSniffer> getSniffers();

	/**
	 * Returns the value of the '<em><b>Cache</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClassifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache</em>' reference list.
	 * @see net.sf.smbt.ezsniff.EzsniffPackage#getEZSnifferManager_Cache()
	 * @model
	 * @generated
	 */
	EList<EClassifier> getCache();

} // EZSnifferManager
