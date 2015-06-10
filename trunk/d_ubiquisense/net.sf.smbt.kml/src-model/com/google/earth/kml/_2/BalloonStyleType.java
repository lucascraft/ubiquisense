/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Balloon Style Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.BalloonStyleType#getColor <em>Color</em>}</li>
 *   <li>{@link com.google.earth.kml._2.BalloonStyleType#getBgColor <em>Bg Color</em>}</li>
 *   <li>{@link com.google.earth.kml._2.BalloonStyleType#getTextColor <em>Text Color</em>}</li>
 *   <li>{@link com.google.earth.kml._2.BalloonStyleType#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.earth.kml._2.v21Package#getBalloonStyleType()
 * @model extendedMetaData="name='BalloonStyleType' kind='elementOnly'"
 * @generated
 */
public interface BalloonStyleType extends ObjectType {
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
	 * @see com.google.earth.kml._2.v21Package#getBalloonStyleType_Color()
	 * @model default="ffffffff" unsettable="true" dataType="com.google.earth.kml._2.Color"
	 *        extendedMetaData="kind='element' name='color' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getColor();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.BalloonStyleType#getColor <em>Color</em>}' attribute.
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
	 * Unsets the value of the '{@link com.google.earth.kml._2.BalloonStyleType#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColor()
	 * @see #getColor()
	 * @see #setColor(byte[])
	 * @generated
	 */
	void unsetColor();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.BalloonStyleType#getColor <em>Color</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Bg Color</b></em>' attribute.
	 * The default value is <code>"ffffffff"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bg Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bg Color</em>' attribute.
	 * @see #isSetBgColor()
	 * @see #unsetBgColor()
	 * @see #setBgColor(byte[])
	 * @see com.google.earth.kml._2.v21Package#getBalloonStyleType_BgColor()
	 * @model default="ffffffff" unsettable="true" dataType="com.google.earth.kml._2.Color"
	 *        extendedMetaData="kind='element' name='bgColor' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getBgColor();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.BalloonStyleType#getBgColor <em>Bg Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bg Color</em>' attribute.
	 * @see #isSetBgColor()
	 * @see #unsetBgColor()
	 * @see #getBgColor()
	 * @generated
	 */
	void setBgColor(byte[] value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.BalloonStyleType#getBgColor <em>Bg Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBgColor()
	 * @see #getBgColor()
	 * @see #setBgColor(byte[])
	 * @generated
	 */
	void unsetBgColor();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.BalloonStyleType#getBgColor <em>Bg Color</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bg Color</em>' attribute is set.
	 * @see #unsetBgColor()
	 * @see #getBgColor()
	 * @see #setBgColor(byte[])
	 * @generated
	 */
	boolean isSetBgColor();

	/**
	 * Returns the value of the '<em><b>Text Color</b></em>' attribute.
	 * The default value is <code>"ff000000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Color</em>' attribute.
	 * @see #isSetTextColor()
	 * @see #unsetTextColor()
	 * @see #setTextColor(byte[])
	 * @see com.google.earth.kml._2.v21Package#getBalloonStyleType_TextColor()
	 * @model default="ff000000" unsettable="true" dataType="com.google.earth.kml._2.Color"
	 *        extendedMetaData="kind='element' name='textColor' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getTextColor();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.BalloonStyleType#getTextColor <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Color</em>' attribute.
	 * @see #isSetTextColor()
	 * @see #unsetTextColor()
	 * @see #getTextColor()
	 * @generated
	 */
	void setTextColor(byte[] value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.BalloonStyleType#getTextColor <em>Text Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextColor()
	 * @see #getTextColor()
	 * @see #setTextColor(byte[])
	 * @generated
	 */
	void unsetTextColor();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.BalloonStyleType#getTextColor <em>Text Color</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Color</em>' attribute is set.
	 * @see #unsetTextColor()
	 * @see #getTextColor()
	 * @see #setTextColor(byte[])
	 * @generated
	 */
	boolean isSetTextColor();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see com.google.earth.kml._2.v21Package#getBalloonStyleType_Text()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.BalloonStyleType#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // BalloonStyleType
