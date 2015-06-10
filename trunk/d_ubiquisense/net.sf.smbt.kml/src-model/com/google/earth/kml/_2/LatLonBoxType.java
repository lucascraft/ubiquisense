/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lat Lon Box Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.LatLonBoxType#getNorth <em>North</em>}</li>
 *   <li>{@link com.google.earth.kml._2.LatLonBoxType#getSouth <em>South</em>}</li>
 *   <li>{@link com.google.earth.kml._2.LatLonBoxType#getEast <em>East</em>}</li>
 *   <li>{@link com.google.earth.kml._2.LatLonBoxType#getWest <em>West</em>}</li>
 *   <li>{@link com.google.earth.kml._2.LatLonBoxType#getRotation <em>Rotation</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.earth.kml._2.v21Package#getLatLonBoxType()
 * @model extendedMetaData="name='LatLonBoxType' kind='elementOnly'"
 * @generated
 */
public interface LatLonBoxType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>North</b></em>' attribute.
	 * The default value is <code>"180.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>North</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>North</em>' attribute.
	 * @see #isSetNorth()
	 * @see #unsetNorth()
	 * @see #setNorth(double)
	 * @see com.google.earth.kml._2.v21Package#getLatLonBoxType_North()
	 * @model default="180.0" unsettable="true" dataType="com.google.earth.kml._2.Angle180"
	 *        extendedMetaData="kind='element' name='north' namespace='##targetNamespace'"
	 * @generated
	 */
	double getNorth();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.LatLonBoxType#getNorth <em>North</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>North</em>' attribute.
	 * @see #isSetNorth()
	 * @see #unsetNorth()
	 * @see #getNorth()
	 * @generated
	 */
	void setNorth(double value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.LatLonBoxType#getNorth <em>North</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNorth()
	 * @see #getNorth()
	 * @see #setNorth(double)
	 * @generated
	 */
	void unsetNorth();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.LatLonBoxType#getNorth <em>North</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>North</em>' attribute is set.
	 * @see #unsetNorth()
	 * @see #getNorth()
	 * @see #setNorth(double)
	 * @generated
	 */
	boolean isSetNorth();

	/**
	 * Returns the value of the '<em><b>South</b></em>' attribute.
	 * The default value is <code>"-180.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>South</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>South</em>' attribute.
	 * @see #isSetSouth()
	 * @see #unsetSouth()
	 * @see #setSouth(double)
	 * @see com.google.earth.kml._2.v21Package#getLatLonBoxType_South()
	 * @model default="-180.0" unsettable="true" dataType="com.google.earth.kml._2.Angle180"
	 *        extendedMetaData="kind='element' name='south' namespace='##targetNamespace'"
	 * @generated
	 */
	double getSouth();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.LatLonBoxType#getSouth <em>South</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>South</em>' attribute.
	 * @see #isSetSouth()
	 * @see #unsetSouth()
	 * @see #getSouth()
	 * @generated
	 */
	void setSouth(double value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.LatLonBoxType#getSouth <em>South</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSouth()
	 * @see #getSouth()
	 * @see #setSouth(double)
	 * @generated
	 */
	void unsetSouth();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.LatLonBoxType#getSouth <em>South</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>South</em>' attribute is set.
	 * @see #unsetSouth()
	 * @see #getSouth()
	 * @see #setSouth(double)
	 * @generated
	 */
	boolean isSetSouth();

	/**
	 * Returns the value of the '<em><b>East</b></em>' attribute.
	 * The default value is <code>"180.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>East</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>East</em>' attribute.
	 * @see #isSetEast()
	 * @see #unsetEast()
	 * @see #setEast(double)
	 * @see com.google.earth.kml._2.v21Package#getLatLonBoxType_East()
	 * @model default="180.0" unsettable="true" dataType="com.google.earth.kml._2.Angle180"
	 *        extendedMetaData="kind='element' name='east' namespace='##targetNamespace'"
	 * @generated
	 */
	double getEast();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.LatLonBoxType#getEast <em>East</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>East</em>' attribute.
	 * @see #isSetEast()
	 * @see #unsetEast()
	 * @see #getEast()
	 * @generated
	 */
	void setEast(double value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.LatLonBoxType#getEast <em>East</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEast()
	 * @see #getEast()
	 * @see #setEast(double)
	 * @generated
	 */
	void unsetEast();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.LatLonBoxType#getEast <em>East</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>East</em>' attribute is set.
	 * @see #unsetEast()
	 * @see #getEast()
	 * @see #setEast(double)
	 * @generated
	 */
	boolean isSetEast();

	/**
	 * Returns the value of the '<em><b>West</b></em>' attribute.
	 * The default value is <code>"-180.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>West</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>West</em>' attribute.
	 * @see #isSetWest()
	 * @see #unsetWest()
	 * @see #setWest(double)
	 * @see com.google.earth.kml._2.v21Package#getLatLonBoxType_West()
	 * @model default="-180.0" unsettable="true" dataType="com.google.earth.kml._2.Angle180"
	 *        extendedMetaData="kind='element' name='west' namespace='##targetNamespace'"
	 * @generated
	 */
	double getWest();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.LatLonBoxType#getWest <em>West</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>West</em>' attribute.
	 * @see #isSetWest()
	 * @see #unsetWest()
	 * @see #getWest()
	 * @generated
	 */
	void setWest(double value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.LatLonBoxType#getWest <em>West</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWest()
	 * @see #getWest()
	 * @see #setWest(double)
	 * @generated
	 */
	void unsetWest();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.LatLonBoxType#getWest <em>West</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>West</em>' attribute is set.
	 * @see #unsetWest()
	 * @see #getWest()
	 * @see #setWest(double)
	 * @generated
	 */
	boolean isSetWest();

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
	 * @see #setRotation(double)
	 * @see com.google.earth.kml._2.v21Package#getLatLonBoxType_Rotation()
	 * @model default="0" unsettable="true" dataType="com.google.earth.kml._2.Angle180"
	 *        extendedMetaData="kind='element' name='rotation' namespace='##targetNamespace'"
	 * @generated
	 */
	double getRotation();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.LatLonBoxType#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' attribute.
	 * @see #isSetRotation()
	 * @see #unsetRotation()
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(double value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.LatLonBoxType#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRotation()
	 * @see #getRotation()
	 * @see #setRotation(double)
	 * @generated
	 */
	void unsetRotation();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.LatLonBoxType#getRotation <em>Rotation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rotation</em>' attribute is set.
	 * @see #unsetRotation()
	 * @see #getRotation()
	 * @see #setRotation(double)
	 * @generated
	 */
	boolean isSetRotation();

} // LatLonBoxType
