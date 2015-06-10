/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Look At Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.LookAtType#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link com.google.earth.kml._2.LookAtType#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link com.google.earth.kml._2.LookAtType#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link com.google.earth.kml._2.LookAtType#getRange <em>Range</em>}</li>
 *   <li>{@link com.google.earth.kml._2.LookAtType#getTilt <em>Tilt</em>}</li>
 *   <li>{@link com.google.earth.kml._2.LookAtType#getHeading <em>Heading</em>}</li>
 *   <li>{@link com.google.earth.kml._2.LookAtType#getAltitudeMode <em>Altitude Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.earth.kml._2.v21Package#getLookAtType()
 * @model extendedMetaData="name='LookAtType' kind='elementOnly'"
 * @generated
 */
public interface LookAtType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' attribute.
	 * @see #isSetLongitude()
	 * @see #unsetLongitude()
	 * @see #setLongitude(double)
	 * @see com.google.earth.kml._2.v21Package#getLookAtType_Longitude()
	 * @model default="0" unsettable="true" dataType="com.google.earth.kml._2.Angle180"
	 *        extendedMetaData="kind='element' name='longitude' namespace='##targetNamespace'"
	 * @generated
	 */
	double getLongitude();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.LookAtType#getLongitude <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' attribute.
	 * @see #isSetLongitude()
	 * @see #unsetLongitude()
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(double value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.LookAtType#getLongitude <em>Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLongitude()
	 * @see #getLongitude()
	 * @see #setLongitude(double)
	 * @generated
	 */
	void unsetLongitude();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.LookAtType#getLongitude <em>Longitude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Longitude</em>' attribute is set.
	 * @see #unsetLongitude()
	 * @see #getLongitude()
	 * @see #setLongitude(double)
	 * @generated
	 */
	boolean isSetLongitude();

	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' attribute.
	 * @see #isSetLatitude()
	 * @see #unsetLatitude()
	 * @see #setLatitude(double)
	 * @see com.google.earth.kml._2.v21Package#getLookAtType_Latitude()
	 * @model default="0" unsettable="true" dataType="com.google.earth.kml._2.Angle90"
	 *        extendedMetaData="kind='element' name='latitude' namespace='##targetNamespace'"
	 * @generated
	 */
	double getLatitude();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.LookAtType#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' attribute.
	 * @see #isSetLatitude()
	 * @see #unsetLatitude()
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(double value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.LookAtType#getLatitude <em>Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLatitude()
	 * @see #getLatitude()
	 * @see #setLatitude(double)
	 * @generated
	 */
	void unsetLatitude();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.LookAtType#getLatitude <em>Latitude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Latitude</em>' attribute is set.
	 * @see #unsetLatitude()
	 * @see #getLatitude()
	 * @see #setLatitude(double)
	 * @generated
	 */
	boolean isSetLatitude();

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
	 * @see com.google.earth.kml._2.v21Package#getLookAtType_Altitude()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='altitude' namespace='##targetNamespace'"
	 * @generated
	 */
	double getAltitude();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.LookAtType#getAltitude <em>Altitude</em>}' attribute.
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
	 * Unsets the value of the '{@link com.google.earth.kml._2.LookAtType#getAltitude <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAltitude()
	 * @see #getAltitude()
	 * @see #setAltitude(double)
	 * @generated
	 */
	void unsetAltitude();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.LookAtType#getAltitude <em>Altitude</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' attribute.
	 * @see #isSetRange()
	 * @see #unsetRange()
	 * @see #setRange(double)
	 * @see com.google.earth.kml._2.v21Package#getLookAtType_Range()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='range' namespace='##targetNamespace'"
	 * @generated
	 */
	double getRange();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.LookAtType#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' attribute.
	 * @see #isSetRange()
	 * @see #unsetRange()
	 * @see #getRange()
	 * @generated
	 */
	void setRange(double value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.LookAtType#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRange()
	 * @see #getRange()
	 * @see #setRange(double)
	 * @generated
	 */
	void unsetRange();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.LookAtType#getRange <em>Range</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Range</em>' attribute is set.
	 * @see #unsetRange()
	 * @see #getRange()
	 * @see #setRange(double)
	 * @generated
	 */
	boolean isSetRange();

	/**
	 * Returns the value of the '<em><b>Tilt</b></em>' attribute.
	 * The default value is <code>"0"</code>.
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
	 * @see com.google.earth.kml._2.v21Package#getLookAtType_Tilt()
	 * @model default="0" unsettable="true" dataType="com.google.earth.kml._2.Anglepos90"
	 *        extendedMetaData="kind='element' name='tilt' namespace='##targetNamespace'"
	 * @generated
	 */
	double getTilt();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.LookAtType#getTilt <em>Tilt</em>}' attribute.
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
	 * Unsets the value of the '{@link com.google.earth.kml._2.LookAtType#getTilt <em>Tilt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTilt()
	 * @see #getTilt()
	 * @see #setTilt(double)
	 * @generated
	 */
	void unsetTilt();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.LookAtType#getTilt <em>Tilt</em>}' attribute is set.
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
	 * @see #setHeading(double)
	 * @see com.google.earth.kml._2.v21Package#getLookAtType_Heading()
	 * @model default="0" unsettable="true" dataType="com.google.earth.kml._2.Angle360"
	 *        extendedMetaData="kind='element' name='heading' namespace='##targetNamespace'"
	 * @generated
	 */
	double getHeading();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.LookAtType#getHeading <em>Heading</em>}' attribute.
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
	 * Unsets the value of the '{@link com.google.earth.kml._2.LookAtType#getHeading <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHeading()
	 * @see #getHeading()
	 * @see #setHeading(double)
	 * @generated
	 */
	void unsetHeading();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.LookAtType#getHeading <em>Heading</em>}' attribute is set.
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
	 * @see com.google.earth.kml._2.v21Package#getLookAtType_AltitudeMode()
	 * @model default="clampToGround" unsettable="true"
	 *        extendedMetaData="kind='element' name='altitudeMode' namespace='##targetNamespace'"
	 * @generated
	 */
	AltitudeModeEnum getAltitudeMode();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.LookAtType#getAltitudeMode <em>Altitude Mode</em>}' attribute.
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
	 * Unsets the value of the '{@link com.google.earth.kml._2.LookAtType#getAltitudeMode <em>Altitude Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAltitudeMode()
	 * @see #getAltitudeMode()
	 * @see #setAltitudeMode(AltitudeModeEnum)
	 * @generated
	 */
	void unsetAltitudeMode();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.LookAtType#getAltitudeMode <em>Altitude Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Altitude Mode</em>' attribute is set.
	 * @see #unsetAltitudeMode()
	 * @see #getAltitudeMode()
	 * @see #setAltitudeMode(AltitudeModeEnum)
	 * @generated
	 */
	boolean isSetAltitudeMode();

} // LookAtType
