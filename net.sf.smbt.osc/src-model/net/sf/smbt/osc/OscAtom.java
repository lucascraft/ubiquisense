/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.OscAtom#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.osc.OscPackage#getOscAtom()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface OscAtom extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.osc.OscType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see net.sf.smbt.osc.OscType
	 * @see #setType(OscType)
	 * @see net.sf.smbt.osc.OscPackage#getOscAtom_Type()
	 * @model
	 * @generated
	 */
	OscType getType();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.OscAtom#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see net.sf.smbt.osc.OscType
	 * @see #getType()
	 * @generated
	 */
	void setType(OscType value);

} // OscAtom
