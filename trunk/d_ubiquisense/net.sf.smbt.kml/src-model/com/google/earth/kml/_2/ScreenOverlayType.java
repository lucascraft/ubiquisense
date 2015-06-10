/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Screen Overlay Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.ScreenOverlayType#getOverlayXY <em>Overlay XY</em>}</li>
 *   <li>{@link com.google.earth.kml._2.ScreenOverlayType#getScreenXY <em>Screen XY</em>}</li>
 *   <li>{@link com.google.earth.kml._2.ScreenOverlayType#getRotationXY <em>Rotation XY</em>}</li>
 *   <li>{@link com.google.earth.kml._2.ScreenOverlayType#getSize <em>Size</em>}</li>
 *   <li>{@link com.google.earth.kml._2.ScreenOverlayType#getRotation <em>Rotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.earth.kml._2.v21Package#getScreenOverlayType()
 * @model extendedMetaData="name='ScreenOverlayType' kind='elementOnly'"
 * @generated
 */
public interface ScreenOverlayType extends OverlayType {
	/**
	 * Returns the value of the '<em><b>Overlay XY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overlay XY</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overlay XY</em>' containment reference.
	 * @see #setOverlayXY(Vec2Type)
	 * @see com.google.earth.kml._2.v21Package#getScreenOverlayType_OverlayXY()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='overlayXY' namespace='##targetNamespace'"
	 * @generated
	 */
	Vec2Type getOverlayXY();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.ScreenOverlayType#getOverlayXY <em>Overlay XY</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overlay XY</em>' containment reference.
	 * @see #getOverlayXY()
	 * @generated
	 */
	void setOverlayXY(Vec2Type value);

	/**
	 * Returns the value of the '<em><b>Screen XY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screen XY</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen XY</em>' containment reference.
	 * @see #setScreenXY(Vec2Type)
	 * @see com.google.earth.kml._2.v21Package#getScreenOverlayType_ScreenXY()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='screenXY' namespace='##targetNamespace'"
	 * @generated
	 */
	Vec2Type getScreenXY();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.ScreenOverlayType#getScreenXY <em>Screen XY</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screen XY</em>' containment reference.
	 * @see #getScreenXY()
	 * @generated
	 */
	void setScreenXY(Vec2Type value);

	/**
	 * Returns the value of the '<em><b>Rotation XY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotation XY</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation XY</em>' containment reference.
	 * @see #setRotationXY(Vec2Type)
	 * @see com.google.earth.kml._2.v21Package#getScreenOverlayType_RotationXY()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rotationXY' namespace='##targetNamespace'"
	 * @generated
	 */
	Vec2Type getRotationXY();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.ScreenOverlayType#getRotationXY <em>Rotation XY</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation XY</em>' containment reference.
	 * @see #getRotationXY()
	 * @generated
	 */
	void setRotationXY(Vec2Type value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' containment reference.
	 * @see #setSize(Vec2Type)
	 * @see com.google.earth.kml._2.v21Package#getScreenOverlayType_Size()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='size' namespace='##targetNamespace'"
	 * @generated
	 */
	Vec2Type getSize();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.ScreenOverlayType#getSize <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' containment reference.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Vec2Type value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute.
	 * @see #isSetRotation()
	 * @see #unsetRotation()
	 * @see #setRotation(float)
	 * @see com.google.earth.kml._2.v21Package#getScreenOverlayType_Rotation()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='rotation' namespace='##targetNamespace'"
	 * @generated
	 */
	float getRotation();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.ScreenOverlayType#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' attribute.
	 * @see #isSetRotation()
	 * @see #unsetRotation()
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(float value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.ScreenOverlayType#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRotation()
	 * @see #getRotation()
	 * @see #setRotation(float)
	 * @generated
	 */
	void unsetRotation();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.ScreenOverlayType#getRotation <em>Rotation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rotation</em>' attribute is set.
	 * @see #unsetRotation()
	 * @see #getRotation()
	 * @see #setRotation(float)
	 * @generated
	 */
	boolean isSetRotation();

} // ScreenOverlayType
