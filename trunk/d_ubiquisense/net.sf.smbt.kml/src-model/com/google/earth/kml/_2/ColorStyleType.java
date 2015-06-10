/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Style Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.ColorStyleType#getColor <em>Color</em>}</li>
 *   <li>{@link com.google.earth.kml._2.ColorStyleType#getColorMode <em>Color Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.earth.kml._2.v21Package#getColorStyleType()
 * @model abstract="true"
 *        extendedMetaData="name='ColorStyleType' kind='elementOnly'"
 * @generated
 */
public interface ColorStyleType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"ffffffff"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #isSetColor()
	 * @see #unsetColor()
	 * @see #setColor(byte[])
	 * @see com.google.earth.kml._2.v21Package#getColorStyleType_Color()
	 * @model default="ffffffff" unsettable="true" dataType="com.google.earth.kml._2.Color"
	 *        extendedMetaData="kind='element' name='color' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getColor();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.ColorStyleType#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #isSetColor()
	 * @see #unsetColor()
	 * @see #getColor()
	 * @generated
	 */
	void setColor(byte[] value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.ColorStyleType#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColor()
	 * @see #getColor()
	 * @see #setColor(byte[])
	 * @generated
	 */
	void unsetColor();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.ColorStyleType#getColor <em>Color</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Color</em>' attribute is set.
	 * @see #unsetColor()
	 * @see #getColor()
	 * @see #setColor(byte[])
	 * @generated
	 */
	boolean isSetColor();

	/**
	 * Returns the value of the '<em><b>Color Mode</b></em>' attribute.
	 * The default value is <code>"normal"</code>.
	 * The literals are from the enumeration {@link com.google.earth.kml._2.ColorModeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color Mode</em>' attribute.
	 * @see com.google.earth.kml._2.ColorModeEnum
	 * @see #isSetColorMode()
	 * @see #unsetColorMode()
	 * @see #setColorMode(ColorModeEnum)
	 * @see com.google.earth.kml._2.v21Package#getColorStyleType_ColorMode()
	 * @model default="normal" unsettable="true"
	 *        extendedMetaData="kind='element' name='colorMode' namespace='##targetNamespace'"
	 * @generated
	 */
	ColorModeEnum getColorMode();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.ColorStyleType#getColorMode <em>Color Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Mode</em>' attribute.
	 * @see com.google.earth.kml._2.ColorModeEnum
	 * @see #isSetColorMode()
	 * @see #unsetColorMode()
	 * @see #getColorMode()
	 * @generated
	 */
	void setColorMode(ColorModeEnum value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.ColorStyleType#getColorMode <em>Color Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColorMode()
	 * @see #getColorMode()
	 * @see #setColorMode(ColorModeEnum)
	 * @generated
	 */
	void unsetColorMode();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.ColorStyleType#getColorMode <em>Color Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Color Mode</em>' attribute is set.
	 * @see #unsetColorMode()
	 * @see #getColorMode()
	 * @see #setColorMode(ColorModeEnum)
	 * @generated
	 */
	boolean isSetColorMode();

} // ColorStyleType
