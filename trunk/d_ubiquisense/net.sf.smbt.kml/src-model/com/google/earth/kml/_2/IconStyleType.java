/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Icon Style Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.IconStyleType#getScale <em>Scale</em>}</li>
 *   <li>{@link com.google.earth.kml._2.IconStyleType#getHeading <em>Heading</em>}</li>
 *   <li>{@link com.google.earth.kml._2.IconStyleType#getIcon <em>Icon</em>}</li>
 *   <li>{@link com.google.earth.kml._2.IconStyleType#getHotSpot <em>Hot Spot</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.earth.kml._2.v21Package#getIconStyleType()
 * @model extendedMetaData="name='IconStyleType' kind='elementOnly'"
 * @generated
 */
public interface IconStyleType extends ColorStyleType {
	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #isSetScale()
	 * @see #unsetScale()
	 * @see #setScale(float)
	 * @see com.google.earth.kml._2.v21Package#getIconStyleType_Scale()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='scale' namespace='##targetNamespace'"
	 * @generated
	 */
	float getScale();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.IconStyleType#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #isSetScale()
	 * @see #unsetScale()
	 * @see #getScale()
	 * @generated
	 */
	void setScale(float value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.IconStyleType#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScale()
	 * @see #getScale()
	 * @see #setScale(float)
	 * @generated
	 */
	void unsetScale();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.IconStyleType#getScale <em>Scale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scale</em>' attribute is set.
	 * @see #unsetScale()
	 * @see #getScale()
	 * @see #setScale(float)
	 * @generated
	 */
	boolean isSetScale();

	/**
	 * Returns the value of the '<em><b>Heading</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heading</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heading</em>' attribute.
	 * @see #isSetHeading()
	 * @see #unsetHeading()
	 * @see #setHeading(float)
	 * @see com.google.earth.kml._2.v21Package#getIconStyleType_Heading()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='heading' namespace='##targetNamespace'"
	 * @generated
	 */
	float getHeading();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.IconStyleType#getHeading <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heading</em>' attribute.
	 * @see #isSetHeading()
	 * @see #unsetHeading()
	 * @see #getHeading()
	 * @generated
	 */
	void setHeading(float value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.IconStyleType#getHeading <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHeading()
	 * @see #getHeading()
	 * @see #setHeading(float)
	 * @generated
	 */
	void unsetHeading();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.IconStyleType#getHeading <em>Heading</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Heading</em>' attribute is set.
	 * @see #unsetHeading()
	 * @see #getHeading()
	 * @see #setHeading(float)
	 * @generated
	 */
	boolean isSetHeading();

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' containment reference.
	 * @see #setIcon(IconStyleIconType)
	 * @see com.google.earth.kml._2.v21Package#getIconStyleType_Icon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Icon' namespace='##targetNamespace'"
	 * @generated
	 */
	IconStyleIconType getIcon();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.IconStyleType#getIcon <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' containment reference.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(IconStyleIconType value);

	/**
	 * Returns the value of the '<em><b>Hot Spot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hot Spot</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hot Spot</em>' containment reference.
	 * @see #setHotSpot(Vec2Type)
	 * @see com.google.earth.kml._2.v21Package#getIconStyleType_HotSpot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hotSpot' namespace='##targetNamespace'"
	 * @generated
	 */
	Vec2Type getHotSpot();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.IconStyleType#getHotSpot <em>Hot Spot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hot Spot</em>' containment reference.
	 * @see #getHotSpot()
	 * @generated
	 */
	void setHotSpot(Vec2Type value);

} // IconStyleType
