/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orientation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.OrientationType#getHeading <em>Heading</em>}</li>
 *   <li>{@link com.google.earth.kml._2.OrientationType#getTilt <em>Tilt</em>}</li>
 *   <li>{@link com.google.earth.kml._2.OrientationType#getRoll <em>Roll</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.earth.kml._2.v21Package#getOrientationType()
 * @model extendedMetaData="name='OrientationType' kind='elementOnly'"
 * @generated
 */
public interface OrientationType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Heading</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heading</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heading</em>' attribute.
	 * @see #isSetHeading()
	 * @see #unsetHeading()
	 * @see #setHeading(double)
	 * @see com.google.earth.kml._2.v21Package#getOrientationType_Heading()
	 * @model default="0.0" unsettable="true" dataType="com.google.earth.kml._2.Angle360"
	 *        extendedMetaData="kind='element' name='heading' namespace='##targetNamespace'"
	 * @generated
	 */
	double getHeading();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.OrientationType#getHeading <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heading</em>' attribute.
	 * @see #isSetHeading()
	 * @see #unsetHeading()
	 * @see #getHeading()
	 * @generated
	 */
	void setHeading(double value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.OrientationType#getHeading <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHeading()
	 * @see #getHeading()
	 * @see #setHeading(double)
	 * @generated
	 */
	void unsetHeading();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.OrientationType#getHeading <em>Heading</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Heading</em>' attribute is set.
	 * @see #unsetHeading()
	 * @see #getHeading()
	 * @see #setHeading(double)
	 * @generated
	 */
	boolean isSetHeading();

	/**
	 * Returns the value of the '<em><b>Tilt</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tilt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tilt</em>' attribute.
	 * @see #isSetTilt()
	 * @see #unsetTilt()
	 * @see #setTilt(double)
	 * @see com.google.earth.kml._2.v21Package#getOrientationType_Tilt()
	 * @model default="0.0" unsettable="true" dataType="com.google.earth.kml._2.Angle360"
	 *        extendedMetaData="kind='element' name='tilt' namespace='##targetNamespace'"
	 * @generated
	 */
	double getTilt();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.OrientationType#getTilt <em>Tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tilt</em>' attribute.
	 * @see #isSetTilt()
	 * @see #unsetTilt()
	 * @see #getTilt()
	 * @generated
	 */
	void setTilt(double value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.OrientationType#getTilt <em>Tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTilt()
	 * @see #getTilt()
	 * @see #setTilt(double)
	 * @generated
	 */
	void unsetTilt();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.OrientationType#getTilt <em>Tilt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tilt</em>' attribute is set.
	 * @see #unsetTilt()
	 * @see #getTilt()
	 * @see #setTilt(double)
	 * @generated
	 */
	boolean isSetTilt();

	/**
	 * Returns the value of the '<em><b>Roll</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roll</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roll</em>' attribute.
	 * @see #isSetRoll()
	 * @see #unsetRoll()
	 * @see #setRoll(double)
	 * @see com.google.earth.kml._2.v21Package#getOrientationType_Roll()
	 * @model default="0.0" unsettable="true" dataType="com.google.earth.kml._2.Angle360"
	 *        extendedMetaData="kind='element' name='roll' namespace='##targetNamespace'"
	 * @generated
	 */
	double getRoll();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.OrientationType#getRoll <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll</em>' attribute.
	 * @see #isSetRoll()
	 * @see #unsetRoll()
	 * @see #getRoll()
	 * @generated
	 */
	void setRoll(double value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.OrientationType#getRoll <em>Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRoll()
	 * @see #getRoll()
	 * @see #setRoll(double)
	 * @generated
	 */
	void unsetRoll();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.OrientationType#getRoll <em>Roll</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Roll</em>' attribute is set.
	 * @see #unsetRoll()
	 * @see #getRoll()
	 * @see #setRoll(double)
	 * @generated
	 */
	boolean isSetRoll();

} // OrientationType
