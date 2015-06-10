/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.RegionType#getLatLonAltBox <em>Lat Lon Alt Box</em>}</li>
 *   <li>{@link com.google.earth.kml._2.RegionType#getLod <em>Lod</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.earth.kml._2.v21Package#getRegionType()
 * @model extendedMetaData="name='RegionType' kind='elementOnly'"
 * @generated
 */
public interface RegionType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Lat Lon Alt Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lat Lon Alt Box</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat Lon Alt Box</em>' containment reference.
	 * @see #setLatLonAltBox(LatLonAltBoxType)
	 * @see com.google.earth.kml._2.v21Package#getRegionType_LatLonAltBox()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LatLonAltBox' namespace='##targetNamespace'"
	 * @generated
	 */
	LatLonAltBoxType getLatLonAltBox();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.RegionType#getLatLonAltBox <em>Lat Lon Alt Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat Lon Alt Box</em>' containment reference.
	 * @see #getLatLonAltBox()
	 * @generated
	 */
	void setLatLonAltBox(LatLonAltBoxType value);

	/**
	 * Returns the value of the '<em><b>Lod</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lod</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lod</em>' containment reference.
	 * @see #setLod(LodType)
	 * @see com.google.earth.kml._2.v21Package#getRegionType_Lod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Lod' namespace='##targetNamespace'"
	 * @generated
	 */
	LodType getLod();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.RegionType#getLod <em>Lod</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lod</em>' containment reference.
	 * @see #getLod()
	 * @generated
	 */
	void setLod(LodType value);

} // RegionType
