/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmojo;

import net.sf.smbt.xcp.XCPAddress;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EZ Mojo Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoTarget#getKind <em>Kind</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoTarget#isHierarchical <em>Hierarchical</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoTarget()
 * @model
 * @generated
 */
public interface EZMojoTarget extends XCPAddress {
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
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoTarget_Kind()
	 * @model
	 * @generated
	 */
	EZMojoKind getKind();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.EZMojoTarget#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.ezmojo.EZMojoKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(EZMojoKind value);

	/**
	 * Returns the value of the '<em><b>Hierarchical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hierarchical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchical</em>' attribute.
	 * @see #setHierarchical(boolean)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoTarget_Hierarchical()
	 * @model
	 * @generated
	 */
	boolean isHierarchical();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.EZMojoTarget#isHierarchical <em>Hierarchical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hierarchical</em>' attribute.
	 * @see #isHierarchical()
	 * @generated
	 */
	void setHierarchical(boolean value);
	
	public String toString2();

} // EZMojoTarget
