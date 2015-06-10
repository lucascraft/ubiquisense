/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eeml.xsd._0._5;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Current Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eeml.xsd._0._5.CurrentValueType#getValue <em>Value</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.CurrentValueType#getAt <em>At</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eeml.xsd._0._5._5Package#getCurrentValueType()
 * @model extendedMetaData="name='current_value_._type' kind='simple'"
 * @generated
 */
public interface CurrentValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.eeml.xsd._0._5._5Package#getCurrentValueType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.eeml.xsd._0._5.CurrentValueType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>At</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>At</em>' attribute.
	 * @see #setAt(XMLGregorianCalendar)
	 * @see org.eeml.xsd._0._5._5Package#getCurrentValueType_At()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='attribute' name='at'"
	 * @generated
	 */
	XMLGregorianCalendar getAt();

	/**
	 * Sets the value of the '{@link org.eeml.xsd._0._5.CurrentValueType#getAt <em>At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>At</em>' attribute.
	 * @see #getAt()
	 * @generated
	 */
	void setAt(XMLGregorianCalendar value);

} // CurrentValueType
