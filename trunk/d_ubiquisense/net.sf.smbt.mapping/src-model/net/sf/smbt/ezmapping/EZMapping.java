/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmapping;

import net.sf.xqz.model.cmd.XCmd;

import org.eclipse.emf.ecore.EClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EZ Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmapping.EZMapping#getFrom <em>From</em>}</li>
 *   <li>{@link net.sf.smbt.ezmapping.EZMapping#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezmapping.EzmappingPackage#getEZMapping()
 * @model
 * @generated
 */
public interface EZMapping extends AbstractEZMappingElem {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(EClassifier)
	 * @see net.sf.smbt.ezmapping.EzmappingPackage#getEZMapping_From()
	 * @model
	 * @generated
	 */
	EClassifier getFrom();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmapping.EZMapping#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(EClassifier value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(EClassifier)
	 * @see net.sf.smbt.ezmapping.EzmappingPackage#getEZMapping_To()
	 * @model
	 * @generated
	 */
	EClassifier getTo();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmapping.EZMapping#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(EClassifier value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	XCmd left2right(XCmd cmd);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	XCmd right2left(XCmd cmd);

} // EZMapping
