/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lat Lon Alt Box Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.LatLonAltBoxType#getMinAltitude <em>Min Altitude</em>}</li>
 *   <li>{@link com.google.earth.kml._2.LatLonAltBoxType#getMaxAltitude <em>Max Altitude</em>}</li>
 *   <li>{@link com.google.earth.kml._2.LatLonAltBoxType#getAltitudeMode <em>Altitude Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.earth.kml._2.v21Package#getLatLonAltBoxType()
 * @model extendedMetaData="name='LatLonAltBoxType' kind='elementOnly'"
 * @generated
 */
public interface LatLonAltBoxType extends LatLonBoxType {
	/**
	 * Returns the value of the '<em><b>Min Altitude</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Altitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Altitude</em>' attribute.
	 * @see #isSetMinAltitude()
	 * @see #unsetMinAltitude()
	 * @see #setMinAltitude(double)
	 * @see com.google.earth.kml._2.v21Package#getLatLonAltBoxType_MinAltitude()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='minAltitude' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMinAltitude();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.LatLonAltBoxType#getMinAltitude <em>Min Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Altitude</em>' attribute.
	 * @see #isSetMinAltitude()
	 * @see #unsetMinAltitude()
	 * @see #getMinAltitude()
	 * @generated
	 */
	void setMinAltitude(double value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.LatLonAltBoxType#getMinAltitude <em>Min Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinAltitude()
	 * @see #getMinAltitude()
	 * @see #setMinAltitude(double)
	 * @generated
	 */
	void unsetMinAltitude();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.LatLonAltBoxType#getMinAltitude <em>Min Altitude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Altitude</em>' attribute is set.
	 * @see #unsetMinAltitude()
	 * @see #getMinAltitude()
	 * @see #setMinAltitude(double)
	 * @generated
	 */
	boolean isSetMinAltitude();

	/**
	 * Returns the value of the '<em><b>Max Altitude</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Altitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Altitude</em>' attribute.
	 * @see #isSetMaxAltitude()
	 * @see #unsetMaxAltitude()
	 * @see #setMaxAltitude(double)
	 * @see com.google.earth.kml._2.v21Package#getLatLonAltBoxType_MaxAltitude()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='maxAltitude' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMaxAltitude();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.LatLonAltBoxType#getMaxAltitude <em>Max Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Altitude</em>' attribute.
	 * @see #isSetMaxAltitude()
	 * @see #unsetMaxAltitude()
	 * @see #getMaxAltitude()
	 * @generated
	 */
	void setMaxAltitude(double value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.LatLonAltBoxType#getMaxAltitude <em>Max Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxAltitude()
	 * @see #getMaxAltitude()
	 * @see #setMaxAltitude(double)
	 * @generated
	 */
	void unsetMaxAltitude();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.LatLonAltBoxType#getMaxAltitude <em>Max Altitude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Altitude</em>' attribute is set.
	 * @see #unsetMaxAltitude()
	 * @see #getMaxAltitude()
	 * @see #setMaxAltitude(double)
	 * @generated
	 */
	boolean isSetMaxAltitude();

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
	 * @see com.google.earth.kml._2.v21Package#getLatLonAltBoxType_AltitudeMode()
	 * @model default="clampToGround" unsettable="true"
	 *        extendedMetaData="kind='element' name='altitudeMode' namespace='##targetNamespace'"
	 * @generated
	 */
	AltitudeModeEnum getAltitudeMode();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.LatLonAltBoxType#getAltitudeMode <em>Altitude Mode</em>}' attribute.
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
	 * Unsets the value of the '{@link com.google.earth.kml._2.LatLonAltBoxType#getAltitudeMode <em>Altitude Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAltitudeMode()
	 * @see #getAltitudeMode()
	 * @see #setAltitudeMode(AltitudeModeEnum)
	 * @generated
	 */
	void unsetAltitudeMode();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.LatLonAltBoxType#getAltitudeMode <em>Altitude Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Altitude Mode</em>' attribute is set.
	 * @see #unsetAltitudeMode()
	 * @see #getAltitudeMode()
	 * @see #setAltitudeMode(AltitudeModeEnum)
	 * @generated
	 */
	boolean isSetAltitudeMode();

} // LatLonAltBoxType
