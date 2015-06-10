/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ground Overlay Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.GroundOverlayType#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link com.google.earth.kml._2.GroundOverlayType#getAltitudeMode <em>Altitude Mode</em>}</li>
 *   <li>{@link com.google.earth.kml._2.GroundOverlayType#getLatLonBox <em>Lat Lon Box</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.earth.kml._2.v21Package#getGroundOverlayType()
 * @model extendedMetaData="name='GroundOverlayType' kind='elementOnly'"
 * @generated
 */
public interface GroundOverlayType extends OverlayType {
	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Altitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude</em>' attribute.
	 * @see #isSetAltitude()
	 * @see #unsetAltitude()
	 * @see #setAltitude(double)
	 * @see com.google.earth.kml._2.v21Package#getGroundOverlayType_Altitude()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='altitude' namespace='##targetNamespace'"
	 * @generated
	 */
	double getAltitude();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.GroundOverlayType#getAltitude <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' attribute.
	 * @see #isSetAltitude()
	 * @see #unsetAltitude()
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(double value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.GroundOverlayType#getAltitude <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAltitude()
	 * @see #getAltitude()
	 * @see #setAltitude(double)
	 * @generated
	 */
	void unsetAltitude();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.GroundOverlayType#getAltitude <em>Altitude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Altitude</em>' attribute is set.
	 * @see #unsetAltitude()
	 * @see #getAltitude()
	 * @see #setAltitude(double)
	 * @generated
	 */
	boolean isSetAltitude();

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
	 * @see com.google.earth.kml._2.v21Package#getGroundOverlayType_AltitudeMode()
	 * @model default="clampToGround" unsettable="true"
	 *        extendedMetaData="kind='element' name='altitudeMode' namespace='##targetNamespace'"
	 * @generated
	 */
	AltitudeModeEnum getAltitudeMode();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.GroundOverlayType#getAltitudeMode <em>Altitude Mode</em>}' attribute.
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
	 * Unsets the value of the '{@link com.google.earth.kml._2.GroundOverlayType#getAltitudeMode <em>Altitude Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAltitudeMode()
	 * @see #getAltitudeMode()
	 * @see #setAltitudeMode(AltitudeModeEnum)
	 * @generated
	 */
	void unsetAltitudeMode();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.GroundOverlayType#getAltitudeMode <em>Altitude Mode</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Lat Lon Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lat Lon Box</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat Lon Box</em>' containment reference.
	 * @see #setLatLonBox(LatLonBoxType)
	 * @see com.google.earth.kml._2.v21Package#getGroundOverlayType_LatLonBox()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LatLonBox' namespace='##targetNamespace'"
	 * @generated
	 */
	LatLonBoxType getLatLonBox();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.GroundOverlayType#getLatLonBox <em>Lat Lon Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat Lon Box</em>' containment reference.
	 * @see #getLatLonBox()
	 * @generated
	 */
	void setLatLonBox(LatLonBoxType value);

} // GroundOverlayType
