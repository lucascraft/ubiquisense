/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmapping;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EZ Mapping Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmapping.EZMappingCategory#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezmapping.EzmappingPackage#getEZMappingCategory()
 * @model
 * @generated
 */
public interface EZMappingCategory extends AbstractEZMappingElem {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezmapping.AbstractEZMappingElem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see net.sf.smbt.ezmapping.EzmappingPackage#getEZMappingCategory_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractEZMappingElem> getChildren();

} // EZMappingCategory
