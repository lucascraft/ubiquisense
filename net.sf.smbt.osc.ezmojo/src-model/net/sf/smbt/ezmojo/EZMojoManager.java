/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmojo;

import net.sf.xqz.model.engine.IConnectedUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EZ Mojo Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoManager#getRoot <em>Root</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoManager#getSelected <em>Selected</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoManager()
 * @model
 * @generated
 */
public interface EZMojoManager extends IConnectedUnit {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' reference.
	 * @see #setRoot(EZMojoNode)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoManager_Root()
	 * @model
	 * @generated
	 */
	EZMojoNode getRoot();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.EZMojoManager#getRoot <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(EZMojoNode value);

	/**
	 * Returns the value of the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' reference.
	 * @see #setSelected(EZMojoNode)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoManager_Selected()
	 * @model
	 * @generated
	 */
	EZMojoNode getSelected();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.EZMojoManager#getSelected <em>Selected</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' reference.
	 * @see #getSelected()
	 * @generated
	 */
	void setSelected(EZMojoNode value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void accept(String cmd);

} // EZMojoManager
