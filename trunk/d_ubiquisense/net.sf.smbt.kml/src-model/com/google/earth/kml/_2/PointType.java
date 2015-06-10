/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.PointType#isExtrude <em>Extrude</em>}</li>
 *   <li>{@link com.google.earth.kml._2.PointType#isTessellate <em>Tessellate</em>}</li>
 *   <li>{@link com.google.earth.kml._2.PointType#getAltitudeMode <em>Altitude Mode</em>}</li>
 *   <li>{@link com.google.earth.kml._2.PointType#getCoordinates <em>Coordinates</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.earth.kml._2.v21Package#getPointType()
 * @model extendedMetaData="name='PointType' kind='elementOnly'"
 * @generated
 */
public interface PointType extends GeometryType {
	/**
	 * Returns the value of the '<em><b>Extrude</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extrude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrude</em>' attribute.
	 * @see #isSetExtrude()
	 * @see #unsetExtrude()
	 * @see #setExtrude(boolean)
	 * @see com.google.earth.kml._2.v21Package#getPointType_Extrude()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='extrude' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isExtrude();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.PointType#isExtrude <em>Extrude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrude</em>' attribute.
	 * @see #isSetExtrude()
	 * @see #unsetExtrude()
	 * @see #isExtrude()
	 * @generated
	 */
	void setExtrude(boolean value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.PointType#isExtrude <em>Extrude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExtrude()
	 * @see #isExtrude()
	 * @see #setExtrude(boolean)
	 * @generated
	 */
	void unsetExtrude();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.PointType#isExtrude <em>Extrude</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Extrude</em>' attribute is set.
	 * @see #unsetExtrude()
	 * @see #isExtrude()
	 * @see #setExtrude(boolean)
	 * @generated
	 */
	boolean isSetExtrude();

	/**
	 * Returns the value of the '<em><b>Tessellate</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tessellate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tessellate</em>' attribute.
	 * @see #isSetTessellate()
	 * @see #unsetTessellate()
	 * @see #setTessellate(boolean)
	 * @see com.google.earth.kml._2.v21Package#getPointType_Tessellate()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='tessellate' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isTessellate();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.PointType#isTessellate <em>Tessellate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tessellate</em>' attribute.
	 * @see #isSetTessellate()
	 * @see #unsetTessellate()
	 * @see #isTessellate()
	 * @generated
	 */
	void setTessellate(boolean value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.PointType#isTessellate <em>Tessellate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTessellate()
	 * @see #isTessellate()
	 * @see #setTessellate(boolean)
	 * @generated
	 */
	void unsetTessellate();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.PointType#isTessellate <em>Tessellate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tessellate</em>' attribute is set.
	 * @see #unsetTessellate()
	 * @see #isTessellate()
	 * @see #setTessellate(boolean)
	 * @generated
	 */
	boolean isSetTessellate();

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
	 * @see com.google.earth.kml._2.v21Package#getPointType_AltitudeMode()
	 * @model default="clampToGround" unsettable="true"
	 *        extendedMetaData="kind='element' name='altitudeMode' namespace='##targetNamespace'"
	 * @generated
	 */
	AltitudeModeEnum getAltitudeMode();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.PointType#getAltitudeMode <em>Altitude Mode</em>}' attribute.
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
	 * Unsets the value of the '{@link com.google.earth.kml._2.PointType#getAltitudeMode <em>Altitude Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAltitudeMode()
	 * @see #getAltitudeMode()
	 * @see #setAltitudeMode(AltitudeModeEnum)
	 * @generated
	 */
	void unsetAltitudeMode();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.PointType#getAltitudeMode <em>Altitude Mode</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Coordinates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinates</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates</em>' attribute.
	 * @see #setCoordinates(List)
	 * @see com.google.earth.kml._2.v21Package#getPointType_Coordinates()
	 * @model dataType="com.google.earth.kml._2.CoordinatesType" required="true" many="false"
	 *        extendedMetaData="kind='element' name='coordinates' namespace='##targetNamespace'"
	 * @generated
	 */
	List<String> getCoordinates();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.PointType#getCoordinates <em>Coordinates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinates</em>' attribute.
	 * @see #getCoordinates()
	 * @generated
	 */
	void setCoordinates(List<String> value);

} // PointType
