/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Stamp Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.TimeStampType#getWhen <em>When</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.earth.kml._2.v21Package#getTimeStampType()
 * @model extendedMetaData="name='TimeStampType' kind='elementOnly'"
 * @generated
 */
public interface TimeStampType extends TimePrimitiveType {
	/**
	 * Returns the value of the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' attribute.
	 * @see #setWhen(XMLGregorianCalendar)
	 * @see com.google.earth.kml._2.v21Package#getTimeStampType_When()
	 * @model dataType="com.google.earth.kml._2.DateTimeType" required="true"
	 *        extendedMetaData="kind='element' name='when' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getWhen();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.TimeStampType#getWhen <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' attribute.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(XMLGregorianCalendar value);

} // TimeStampType
