/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eeml.xsd._0._5.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eeml.xsd._0._5.DispositionType;
import org.eeml.xsd._0._5.DomainType;
import org.eeml.xsd._0._5.ExposureType;
import org.eeml.xsd._0._5.LocationType;
import org.eeml.xsd._0._5._5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eeml.xsd._0._5.impl.LocationTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.impl.LocationTypeImpl#getLat <em>Lat</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.impl.LocationTypeImpl#getLon <em>Lon</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.impl.LocationTypeImpl#getEle <em>Ele</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.impl.LocationTypeImpl#getDisposition <em>Disposition</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.impl.LocationTypeImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.impl.LocationTypeImpl#getExposure <em>Exposure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocationTypeImpl extends EObjectImpl implements LocationType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLat() <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLat()
	 * @generated
	 * @ordered
	 */
	protected static final double LAT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLat() <em>Lat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLat()
	 * @generated
	 * @ordered
	 */
	protected double lat = LAT_EDEFAULT;

	/**
	 * This is true if the Lat attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean latESet;

	/**
	 * The default value of the '{@link #getLon() <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLon()
	 * @generated
	 * @ordered
	 */
	protected static final double LON_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLon() <em>Lon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLon()
	 * @generated
	 * @ordered
	 */
	protected double lon = LON_EDEFAULT;

	/**
	 * This is true if the Lon attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lonESet;

	/**
	 * The default value of the '{@link #getEle() <em>Ele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEle()
	 * @generated
	 * @ordered
	 */
	protected static final double ELE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEle() <em>Ele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEle()
	 * @generated
	 * @ordered
	 */
	protected double ele = ELE_EDEFAULT;

	/**
	 * This is true if the Ele attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eleESet;

	/**
	 * The default value of the '{@link #getDisposition() <em>Disposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisposition()
	 * @generated
	 * @ordered
	 */
	protected static final DispositionType DISPOSITION_EDEFAULT = DispositionType.FIXED;

	/**
	 * The cached value of the '{@link #getDisposition() <em>Disposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisposition()
	 * @generated
	 * @ordered
	 */
	protected DispositionType disposition = DISPOSITION_EDEFAULT;

	/**
	 * This is true if the Disposition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dispositionESet;

	/**
	 * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected static final DomainType DOMAIN_EDEFAULT = DomainType.PHYSICAL;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected DomainType domain = DOMAIN_EDEFAULT;

	/**
	 * This is true if the Domain attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean domainESet;

	/**
	 * The default value of the '{@link #getExposure() <em>Exposure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposure()
	 * @generated
	 * @ordered
	 */
	protected static final ExposureType EXPOSURE_EDEFAULT = ExposureType.INDOOR;

	/**
	 * The cached value of the '{@link #getExposure() <em>Exposure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposure()
	 * @generated
	 * @ordered
	 */
	protected ExposureType exposure = EXPOSURE_EDEFAULT;

	/**
	 * This is true if the Exposure attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean exposureESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _5Package.Literals.LOCATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _5Package.LOCATION_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLat() {
		return lat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLat(double newLat) {
		double oldLat = lat;
		lat = newLat;
		boolean oldLatESet = latESet;
		latESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _5Package.LOCATION_TYPE__LAT, oldLat, lat, !oldLatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLat() {
		double oldLat = lat;
		boolean oldLatESet = latESet;
		lat = LAT_EDEFAULT;
		latESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _5Package.LOCATION_TYPE__LAT, oldLat, LAT_EDEFAULT, oldLatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLat() {
		return latESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLon() {
		return lon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLon(double newLon) {
		double oldLon = lon;
		lon = newLon;
		boolean oldLonESet = lonESet;
		lonESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _5Package.LOCATION_TYPE__LON, oldLon, lon, !oldLonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLon() {
		double oldLon = lon;
		boolean oldLonESet = lonESet;
		lon = LON_EDEFAULT;
		lonESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _5Package.LOCATION_TYPE__LON, oldLon, LON_EDEFAULT, oldLonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLon() {
		return lonESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEle() {
		return ele;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEle(double newEle) {
		double oldEle = ele;
		ele = newEle;
		boolean oldEleESet = eleESet;
		eleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _5Package.LOCATION_TYPE__ELE, oldEle, ele, !oldEleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEle() {
		double oldEle = ele;
		boolean oldEleESet = eleESet;
		ele = ELE_EDEFAULT;
		eleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _5Package.LOCATION_TYPE__ELE, oldEle, ELE_EDEFAULT, oldEleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEle() {
		return eleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispositionType getDisposition() {
		return disposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisposition(DispositionType newDisposition) {
		DispositionType oldDisposition = disposition;
		disposition = newDisposition == null ? DISPOSITION_EDEFAULT : newDisposition;
		boolean oldDispositionESet = dispositionESet;
		dispositionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _5Package.LOCATION_TYPE__DISPOSITION, oldDisposition, disposition, !oldDispositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisposition() {
		DispositionType oldDisposition = disposition;
		boolean oldDispositionESet = dispositionESet;
		disposition = DISPOSITION_EDEFAULT;
		dispositionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _5Package.LOCATION_TYPE__DISPOSITION, oldDisposition, DISPOSITION_EDEFAULT, oldDispositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisposition() {
		return dispositionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainType getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(DomainType newDomain) {
		DomainType oldDomain = domain;
		domain = newDomain == null ? DOMAIN_EDEFAULT : newDomain;
		boolean oldDomainESet = domainESet;
		domainESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _5Package.LOCATION_TYPE__DOMAIN, oldDomain, domain, !oldDomainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDomain() {
		DomainType oldDomain = domain;
		boolean oldDomainESet = domainESet;
		domain = DOMAIN_EDEFAULT;
		domainESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _5Package.LOCATION_TYPE__DOMAIN, oldDomain, DOMAIN_EDEFAULT, oldDomainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDomain() {
		return domainESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExposureType getExposure() {
		return exposure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExposure(ExposureType newExposure) {
		ExposureType oldExposure = exposure;
		exposure = newExposure == null ? EXPOSURE_EDEFAULT : newExposure;
		boolean oldExposureESet = exposureESet;
		exposureESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _5Package.LOCATION_TYPE__EXPOSURE, oldExposure, exposure, !oldExposureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExposure() {
		ExposureType oldExposure = exposure;
		boolean oldExposureESet = exposureESet;
		exposure = EXPOSURE_EDEFAULT;
		exposureESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _5Package.LOCATION_TYPE__EXPOSURE, oldExposure, EXPOSURE_EDEFAULT, oldExposureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExposure() {
		return exposureESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _5Package.LOCATION_TYPE__NAME:
				return getName();
			case _5Package.LOCATION_TYPE__LAT:
				return getLat();
			case _5Package.LOCATION_TYPE__LON:
				return getLon();
			case _5Package.LOCATION_TYPE__ELE:
				return getEle();
			case _5Package.LOCATION_TYPE__DISPOSITION:
				return getDisposition();
			case _5Package.LOCATION_TYPE__DOMAIN:
				return getDomain();
			case _5Package.LOCATION_TYPE__EXPOSURE:
				return getExposure();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _5Package.LOCATION_TYPE__NAME:
				setName((String)newValue);
				return;
			case _5Package.LOCATION_TYPE__LAT:
				setLat((Double)newValue);
				return;
			case _5Package.LOCATION_TYPE__LON:
				setLon((Double)newValue);
				return;
			case _5Package.LOCATION_TYPE__ELE:
				setEle((Double)newValue);
				return;
			case _5Package.LOCATION_TYPE__DISPOSITION:
				setDisposition((DispositionType)newValue);
				return;
			case _5Package.LOCATION_TYPE__DOMAIN:
				setDomain((DomainType)newValue);
				return;
			case _5Package.LOCATION_TYPE__EXPOSURE:
				setExposure((ExposureType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case _5Package.LOCATION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case _5Package.LOCATION_TYPE__LAT:
				unsetLat();
				return;
			case _5Package.LOCATION_TYPE__LON:
				unsetLon();
				return;
			case _5Package.LOCATION_TYPE__ELE:
				unsetEle();
				return;
			case _5Package.LOCATION_TYPE__DISPOSITION:
				unsetDisposition();
				return;
			case _5Package.LOCATION_TYPE__DOMAIN:
				unsetDomain();
				return;
			case _5Package.LOCATION_TYPE__EXPOSURE:
				unsetExposure();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case _5Package.LOCATION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case _5Package.LOCATION_TYPE__LAT:
				return isSetLat();
			case _5Package.LOCATION_TYPE__LON:
				return isSetLon();
			case _5Package.LOCATION_TYPE__ELE:
				return isSetEle();
			case _5Package.LOCATION_TYPE__DISPOSITION:
				return isSetDisposition();
			case _5Package.LOCATION_TYPE__DOMAIN:
				return isSetDomain();
			case _5Package.LOCATION_TYPE__EXPOSURE:
				return isSetExposure();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", lat: ");
		if (latESet) result.append(lat); else result.append("<unset>");
		result.append(", lon: ");
		if (lonESet) result.append(lon); else result.append("<unset>");
		result.append(", ele: ");
		if (eleESet) result.append(ele); else result.append("<unset>");
		result.append(", disposition: ");
		if (dispositionESet) result.append(disposition); else result.append("<unset>");
		result.append(", domain: ");
		if (domainESet) result.append(domain); else result.append("<unset>");
		result.append(", exposure: ");
		if (exposureESet) result.append(exposure); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LocationTypeImpl
