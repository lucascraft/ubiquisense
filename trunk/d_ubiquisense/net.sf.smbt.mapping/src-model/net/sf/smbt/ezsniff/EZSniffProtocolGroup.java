/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsniff;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EZ Sniff Protocol Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsniff.EZSniffProtocolGroup#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezsniff.EzsniffPackage#getEZSniffProtocolGroup()
 * @model
 * @generated
 */
public interface EZSniffProtocolGroup extends AbstractEZSniffElem {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezsniff.AbstractEZSniffElem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see net.sf.smbt.ezsniff.EzsniffPackage#getEZSniffProtocolGroup_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractEZSniffElem> getChildren();

} // EZSniffProtocolGroup
