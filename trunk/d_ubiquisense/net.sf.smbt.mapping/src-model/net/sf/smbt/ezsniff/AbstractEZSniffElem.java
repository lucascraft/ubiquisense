/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsniff;

import net.sf.smbt.ezmapping.EZMapping;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract EZ Sniff Elem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsniff.AbstractEZSniffElem#getMappings <em>Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezsniff.EzsniffPackage#getAbstractEZSniffElem()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AbstractEZSniffElem extends EObject {
	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' reference.
	 * @see #setMappings(EZMapping)
	 * @see net.sf.smbt.ezsniff.EzsniffPackage#getAbstractEZSniffElem_Mappings()
	 * @model
	 * @generated
	 */
	EZMapping getMappings();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsniff.AbstractEZSniffElem#getMappings <em>Mappings</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mappings</em>' reference.
	 * @see #getMappings()
	 * @generated
	 */
	void setMappings(EZMapping value);

} // AbstractEZSniffElem
