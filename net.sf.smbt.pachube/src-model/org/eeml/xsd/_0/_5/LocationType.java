/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eeml.xsd._0._5;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eeml.xsd._0._5.LocationType#getName <em>Name</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.LocationType#getLat <em>Lat</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.LocationType#getLon <em>Lon</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.LocationType#getEle <em>Ele</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.LocationType#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.LocationType#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.LocationType#getExposure <em>Exposure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eeml.xsd._0._5._5Package#getLocationType()
 * @model extendedMetaData="name='location_._type' kind='elementOnly'"
 * @generated
 */
public interface LocationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eeml.xsd._0._5._5Package#getLocationType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eeml.xsd._0._5.LocationType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lat</em>' attribute.
	 * @see #isSetLat()
	 * @see #unsetLat()
	 * @see #setLat(double)
	 * @see org.eeml.xsd._0._5._5Package#getLocationType_Lat()
	 * @model unsettable="true" dataType="org.eeml.xsd._0._5.LatType" required="true"
	 *        extendedMetaData="kind='element' name='lat' namespace='##targetNamespace'"
	 * @generated
	 */
	double getLat();

	/**
	 * Sets the value of the '{@link org.eeml.xsd._0._5.LocationType#getLat <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lat</em>' attribute.
	 * @see #isSetLat()
	 * @see #unsetLat()
	 * @see #getLat()
	 * @generated
	 */
	void setLat(double value);

	/**
	 * Unsets the value of the '{@link org.eeml.xsd._0._5.LocationType#getLat <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLat()
	 * @see #getLat()
	 * @see #setLat(double)
	 * @generated
	 */
	void unsetLat();

	/**
	 * Returns whether the value of the '{@link org.eeml.xsd._0._5.LocationType#getLat <em>Lat</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lat</em>' attribute is set.
	 * @see #unsetLat()
	 * @see #getLat()
	 * @see #setLat(double)
	 * @generated
	 */
	boolean isSetLat();

	/**
	 * Returns the value of the '<em><b>Lon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lon</em>' attribute.
	 * @see #isSetLon()
	 * @see #unsetLon()
	 * @see #setLon(double)
	 * @see org.eeml.xsd._0._5._5Package#getLocationType_Lon()
	 * @model unsettable="true" dataType="org.eeml.xsd._0._5.LonType" required="true"
	 *        extendedMetaData="kind='element' name='lon' namespace='##targetNamespace'"
	 * @generated
	 */
	double getLon();

	/**
	 * Sets the value of the '{@link org.eeml.xsd._0._5.LocationType#getLon <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lon</em>' attribute.
	 * @see #isSetLon()
	 * @see #unsetLon()
	 * @see #getLon()
	 * @generated
	 */
	void setLon(double value);

	/**
	 * Unsets the value of the '{@link org.eeml.xsd._0._5.LocationType#getLon <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLon()
	 * @see #getLon()
	 * @see #setLon(double)
	 * @generated
	 */
	void unsetLon();

	/**
	 * Returns whether the value of the '{@link org.eeml.xsd._0._5.LocationType#getLon <em>Lon</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lon</em>' attribute is set.
	 * @see #unsetLon()
	 * @see #getLon()
	 * @see #setLon(double)
	 * @generated
	 */
	boolean isSetLon();

	/**
	 * Returns the value of the '<em><b>Ele</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ele</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ele</em>' attribute.
	 * @see #isSetEle()
	 * @see #unsetEle()
	 * @see #setEle(double)
	 * @see org.eeml.xsd._0._5._5Package#getLocationType_Ele()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='ele' namespace='##targetNamespace'"
	 * @generated
	 */
	double getEle();

	/**
	 * Sets the value of the '{@link org.eeml.xsd._0._5.LocationType#getEle <em>Ele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ele</em>' attribute.
	 * @see #isSetEle()
	 * @see #unsetEle()
	 * @see #getEle()
	 * @generated
	 */
	void setEle(double value);

	/**
	 * Unsets the value of the '{@link org.eeml.xsd._0._5.LocationType#getEle <em>Ele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEle()
	 * @see #getEle()
	 * @see #setEle(double)
	 * @generated
	 */
	void unsetEle();

	/**
	 * Returns whether the value of the '{@link org.eeml.xsd._0._5.LocationType#getEle <em>Ele</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ele</em>' attribute is set.
	 * @see #unsetEle()
	 * @see #getEle()
	 * @see #setEle(double)
	 * @generated
	 */
	boolean isSetEle();

	/**
	 * Returns the value of the '<em><b>Disposition</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eeml.xsd._0._5.DispositionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disposition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disposition</em>' attribute.
	 * @see org.eeml.xsd._0._5.DispositionType
	 * @see #isSetDisposition()
	 * @see #unsetDisposition()
	 * @see #setDisposition(DispositionType)
	 * @see org.eeml.xsd._0._5._5Package#getLocationType_Disposition()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='disposition'"
	 * @generated
	 */
	DispositionType getDisposition();

	/**
	 * Sets the value of the '{@link org.eeml.xsd._0._5.LocationType#getDisposition <em>Disposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disposition</em>' attribute.
	 * @see org.eeml.xsd._0._5.DispositionType
	 * @see #isSetDisposition()
	 * @see #unsetDisposition()
	 * @see #getDisposition()
	 * @generated
	 */
	void setDisposition(DispositionType value);

	/**
	 * Unsets the value of the '{@link org.eeml.xsd._0._5.LocationType#getDisposition <em>Disposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisposition()
	 * @see #getDisposition()
	 * @see #setDisposition(DispositionType)
	 * @generated
	 */
	void unsetDisposition();

	/**
	 * Returns whether the value of the '{@link org.eeml.xsd._0._5.LocationType#getDisposition <em>Disposition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Disposition</em>' attribute is set.
	 * @see #unsetDisposition()
	 * @see #getDisposition()
	 * @see #setDisposition(DispositionType)
	 * @generated
	 */
	boolean isSetDisposition();

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eeml.xsd._0._5.DomainType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see org.eeml.xsd._0._5.DomainType
	 * @see #isSetDomain()
	 * @see #unsetDomain()
	 * @see #setDomain(DomainType)
	 * @see org.eeml.xsd._0._5._5Package#getLocationType_Domain()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='domain'"
	 * @generated
	 */
	DomainType getDomain();

	/**
	 * Sets the value of the '{@link org.eeml.xsd._0._5.LocationType#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see org.eeml.xsd._0._5.DomainType
	 * @see #isSetDomain()
	 * @see #unsetDomain()
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(DomainType value);

	/**
	 * Unsets the value of the '{@link org.eeml.xsd._0._5.LocationType#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDomain()
	 * @see #getDomain()
	 * @see #setDomain(DomainType)
	 * @generated
	 */
	void unsetDomain();

	/**
	 * Returns whether the value of the '{@link org.eeml.xsd._0._5.LocationType#getDomain <em>Domain</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Domain</em>' attribute is set.
	 * @see #unsetDomain()
	 * @see #getDomain()
	 * @see #setDomain(DomainType)
	 * @generated
	 */
	boolean isSetDomain();

	/**
	 * Returns the value of the '<em><b>Exposure</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eeml.xsd._0._5.ExposureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposure</em>' attribute.
	 * @see org.eeml.xsd._0._5.ExposureType
	 * @see #isSetExposure()
	 * @see #unsetExposure()
	 * @see #setExposure(ExposureType)
	 * @see org.eeml.xsd._0._5._5Package#getLocationType_Exposure()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='exposure'"
	 * @generated
	 */
	ExposureType getExposure();

	/**
	 * Sets the value of the '{@link org.eeml.xsd._0._5.LocationType#getExposure <em>Exposure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposure</em>' attribute.
	 * @see org.eeml.xsd._0._5.ExposureType
	 * @see #isSetExposure()
	 * @see #unsetExposure()
	 * @see #getExposure()
	 * @generated
	 */
	void setExposure(ExposureType value);

	/**
	 * Unsets the value of the '{@link org.eeml.xsd._0._5.LocationType#getExposure <em>Exposure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExposure()
	 * @see #getExposure()
	 * @see #setExposure(ExposureType)
	 * @generated
	 */
	void unsetExposure();

	/**
	 * Returns whether the value of the '{@link org.eeml.xsd._0._5.LocationType#getExposure <em>Exposure</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Exposure</em>' attribute is set.
	 * @see #unsetExposure()
	 * @see #getExposure()
	 * @see #setExposure(ExposureType)
	 * @generated
	 */
	boolean isSetExposure();

} // LocationType
