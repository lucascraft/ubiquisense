/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.ModelType#getAltitudeMode <em>Altitude Mode</em>}</li>
 *   <li>{@link com.google.earth.kml._2.ModelType#getLocation <em>Location</em>}</li>
 *   <li>{@link com.google.earth.kml._2.ModelType#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link com.google.earth.kml._2.ModelType#getScale <em>Scale</em>}</li>
 *   <li>{@link com.google.earth.kml._2.ModelType#getLink <em>Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.earth.kml._2.v21Package#getModelType()
 * @model extendedMetaData="name='ModelType' kind='elementOnly'"
 * @generated
 */
public interface ModelType extends GeometryType {
	/**
	 * Returns the value of the '<em><b>Altitude Mode</b></em>' attribute.
	 * The default value is <code>"clampToGround"</code>.
	 * The literals are from the enumeration {@link com.google.earth.kml._2.AltitudeModeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altitude Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude Mode</em>' attribute.
	 * @see com.google.earth.kml._2.AltitudeModeEnum
	 * @see #isSetAltitudeMode()
	 * @see #unsetAltitudeMode()
	 * @see #setAltitudeMode(AltitudeModeEnum)
	 * @see com.google.earth.kml._2.v21Package#getModelType_AltitudeMode()
	 * @model default="clampToGround" unsettable="true"
	 *        extendedMetaData="kind='element' name='altitudeMode' namespace='##targetNamespace'"
	 * @generated
	 */
	AltitudeModeEnum getAltitudeMode();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.ModelType#getAltitudeMode <em>Altitude Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude Mode</em>' attribute.
	 * @see com.google.earth.kml._2.AltitudeModeEnum
	 * @see #isSetAltitudeMode()
	 * @see #unsetAltitudeMode()
	 * @see #getAltitudeMode()
	 * @generated
	 */
	void setAltitudeMode(AltitudeModeEnum value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.ModelType#getAltitudeMode <em>Altitude Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAltitudeMode()
	 * @see #getAltitudeMode()
	 * @see #setAltitudeMode(AltitudeModeEnum)
	 * @generated
	 */
	void unsetAltitudeMode();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.ModelType#getAltitudeMode <em>Altitude Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Altitude Mode</em>' attribute is set.
	 * @see #unsetAltitudeMode()
	 * @see #getAltitudeMode()
	 * @see #setAltitudeMode(AltitudeModeEnum)
	 * @generated
	 */
	boolean isSetAltitudeMode();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(LocationType)
	 * @see com.google.earth.kml._2.v21Package#getModelType_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Location' namespace='##targetNamespace'"
	 * @generated
	 */
	LocationType getLocation();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.ModelType#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(LocationType value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' containment reference.
	 * @see #setOrientation(OrientationType)
	 * @see com.google.earth.kml._2.v21Package#getModelType_Orientation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Orientation' namespace='##targetNamespace'"
	 * @generated
	 */
	OrientationType getOrientation();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.ModelType#getOrientation <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' containment reference.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(OrientationType value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' containment reference.
	 * @see #setScale(ScaleType)
	 * @see com.google.earth.kml._2.v21Package#getModelType_Scale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Scale' namespace='##targetNamespace'"
	 * @generated
	 */
	ScaleType getScale();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.ModelType#getScale <em>Scale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' containment reference.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(ScaleType value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference.
	 * @see #setLink(LinkType)
	 * @see com.google.earth.kml._2.v21Package#getModelType_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Link' namespace='##targetNamespace'"
	 * @generated
	 */
	LinkType getLink();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.ModelType#getLink <em>Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' containment reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(LinkType value);

} // ModelType
