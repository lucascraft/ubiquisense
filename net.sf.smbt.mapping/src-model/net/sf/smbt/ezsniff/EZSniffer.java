/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsniff;

import net.sf.smbt.ezmapping.EZMapping;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EZ Sniffer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsniff.EZSniffer#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.smbt.ezsniff.EZSniffer#getHits <em>Hits</em>}</li>
 *   <li>{@link net.sf.smbt.ezsniff.EZSniffer#getLabel <em>Label</em>}</li>
 *   <li>{@link net.sf.smbt.ezsniff.EZSniffer#getMappings <em>Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezsniff.EzsniffPackage#getEZSniffer()
 * @model
 * @generated
 */
public interface EZSniffer extends EObject {
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
	 * @see net.sf.smbt.ezsniff.EzsniffPackage#getEZSniffer_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsniff.EZSniffer#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Hits</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezsniff.AbstractEZSniffElem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hits</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hits</em>' containment reference list.
	 * @see net.sf.smbt.ezsniff.EzsniffPackage#getEZSniffer_Hits()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractEZSniffElem> getHits();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see net.sf.smbt.ezsniff.EzsniffPackage#getEZSniffer_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsniff.EZSniffer#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.ezmapping.EZMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' reference list.
	 * @see net.sf.smbt.ezsniff.EzsniffPackage#getEZSniffer_Mappings()
	 * @model
	 * @generated
	 */
	EList<EZMapping> getMappings();

} // EZSniffer
