/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmojo;

import net.sf.smbt.osccmd.OscCmd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EZ Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmojo.EZEvent#getKind <em>Kind</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.EZEvent#getOsc <em>Osc</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.EZEvent#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZEvent()
 * @model
 * @generated
 */
public interface EZEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.ezmojo.EZMojoKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.ezmojo.EZMojoKind
	 * @see #setKind(EZMojoKind)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZEvent_Kind()
	 * @model
	 * @generated
	 */
	EZMojoKind getKind();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.EZEvent#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.ezmojo.EZMojoKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(EZMojoKind value);

	/**
	 * Returns the value of the '<em><b>Osc</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.osccmd.OscCmd}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Osc</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Osc</em>' containment reference list.
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZEvent_Osc()
	 * @model containment="true"
	 * @generated
	 */
	EList<OscCmd> getOsc();

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.ezmojo.EZMojoTarget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' reference list.
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZEvent_Targets()
	 * @model
	 * @generated
	 */
	EList<EZMojoTarget> getTargets();

} // EZEvent
