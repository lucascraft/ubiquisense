/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.google.earth.kml._2.AltitudeModeEnum;
import com.google.earth.kml._2.LatLonAltBoxType;
import com.google.earth.kml._2.v21Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lat Lon Alt Box Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.impl.LatLonAltBoxTypeImpl#getMinAltitude <em>Min Altitude</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.LatLonAltBoxTypeImpl#getMaxAltitude <em>Max Altitude</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.LatLonAltBoxTypeImpl#getAltitudeMode <em>Altitude Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LatLonAltBoxTypeImpl extends LatLonBoxTypeImpl implements LatLonAltBoxType {
	/**
	 * The default value of the '{@link #getMinAltitude() <em>Min Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinAltitude()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_ALTITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinAltitude() <em>Min Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinAltitude()
	 * @generated
	 * @ordered
	 */
	protected double minAltitude = MIN_ALTITUDE_EDEFAULT;

	/**
	 * This is true if the Min Altitude attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minAltitudeESet;

	/**
	 * The default value of the '{@link #getMaxAltitude() <em>Max Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAltitude()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_ALTITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxAltitude() <em>Max Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAltitude()
	 * @generated
	 * @ordered
	 */
	protected double maxAltitude = MAX_ALTITUDE_EDEFAULT;

	/**
	 * This is true if the Max Altitude attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxAltitudeESet;

	/**
	 * The default value of the '{@link #getAltitudeMode() <em>Altitude Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitudeMode()
	 * @generated
	 * @ordered
	 */
	protected static final AltitudeModeEnum ALTITUDE_MODE_EDEFAULT = AltitudeModeEnum.CLAMP_TO_GROUND;

	/**
	 * The cached value of the '{@link #getAltitudeMode() <em>Altitude Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitudeMode()
	 * @generated
	 * @ordered
	 */
	protected AltitudeModeEnum altitudeMode = ALTITUDE_MODE_EDEFAULT;

	/**
	 * This is true if the Altitude Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean altitudeModeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LatLonAltBoxTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return v21Package.Literals.LAT_LON_ALT_BOX_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinAltitude() {
		return minAltitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinAltitude(double newMinAltitude) {
		double oldMinAltitude = minAltitude;
		minAltitude = newMinAltitude;
		boolean oldMinAltitudeESet = minAltitudeESet;
		minAltitudeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.LAT_LON_ALT_BOX_TYPE__MIN_ALTITUDE, oldMinAltitude, minAltitude, !oldMinAltitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinAltitude() {
		double oldMinAltitude = minAltitude;
		boolean oldMinAltitudeESet = minAltitudeESet;
		minAltitude = MIN_ALTITUDE_EDEFAULT;
		minAltitudeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.LAT_LON_ALT_BOX_TYPE__MIN_ALTITUDE, oldMinAltitude, MIN_ALTITUDE_EDEFAULT, oldMinAltitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinAltitude() {
		return minAltitudeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxAltitude() {
		return maxAltitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxAltitude(double newMaxAltitude) {
		double oldMaxAltitude = maxAltitude;
		maxAltitude = newMaxAltitude;
		boolean oldMaxAltitudeESet = maxAltitudeESet;
		maxAltitudeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.LAT_LON_ALT_BOX_TYPE__MAX_ALTITUDE, oldMaxAltitude, maxAltitude, !oldMaxAltitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxAltitude() {
		double oldMaxAltitude = maxAltitude;
		boolean oldMaxAltitudeESet = maxAltitudeESet;
		maxAltitude = MAX_ALTITUDE_EDEFAULT;
		maxAltitudeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.LAT_LON_ALT_BOX_TYPE__MAX_ALTITUDE, oldMaxAltitude, MAX_ALTITUDE_EDEFAULT, oldMaxAltitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxAltitude() {
		return maxAltitudeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltitudeModeEnum getAltitudeMode() {
		return altitudeMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltitudeMode(AltitudeModeEnum newAltitudeMode) {
		AltitudeModeEnum oldAltitudeMode = altitudeMode;
		altitudeMode = newAltitudeMode == null ? ALTITUDE_MODE_EDEFAULT : newAltitudeMode;
		boolean oldAltitudeModeESet = altitudeModeESet;
		altitudeModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.LAT_LON_ALT_BOX_TYPE__ALTITUDE_MODE, oldAltitudeMode, altitudeMode, !oldAltitudeModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAltitudeMode() {
		AltitudeModeEnum oldAltitudeMode = altitudeMode;
		boolean oldAltitudeModeESet = altitudeModeESet;
		altitudeMode = ALTITUDE_MODE_EDEFAULT;
		altitudeModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.LAT_LON_ALT_BOX_TYPE__ALTITUDE_MODE, oldAltitudeMode, ALTITUDE_MODE_EDEFAULT, oldAltitudeModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAltitudeMode() {
		return altitudeModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case v21Package.LAT_LON_ALT_BOX_TYPE__MIN_ALTITUDE:
				return getMinAltitude();
			case v21Package.LAT_LON_ALT_BOX_TYPE__MAX_ALTITUDE:
				return getMaxAltitude();
			case v21Package.LAT_LON_ALT_BOX_TYPE__ALTITUDE_MODE:
				return getAltitudeMode();
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
			case v21Package.LAT_LON_ALT_BOX_TYPE__MIN_ALTITUDE:
				setMinAltitude((Double)newValue);
				return;
			case v21Package.LAT_LON_ALT_BOX_TYPE__MAX_ALTITUDE:
				setMaxAltitude((Double)newValue);
				return;
			case v21Package.LAT_LON_ALT_BOX_TYPE__ALTITUDE_MODE:
				setAltitudeMode((AltitudeModeEnum)newValue);
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
			case v21Package.LAT_LON_ALT_BOX_TYPE__MIN_ALTITUDE:
				unsetMinAltitude();
				return;
			case v21Package.LAT_LON_ALT_BOX_TYPE__MAX_ALTITUDE:
				unsetMaxAltitude();
				return;
			case v21Package.LAT_LON_ALT_BOX_TYPE__ALTITUDE_MODE:
				unsetAltitudeMode();
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
			case v21Package.LAT_LON_ALT_BOX_TYPE__MIN_ALTITUDE:
				return isSetMinAltitude();
			case v21Package.LAT_LON_ALT_BOX_TYPE__MAX_ALTITUDE:
				return isSetMaxAltitude();
			case v21Package.LAT_LON_ALT_BOX_TYPE__ALTITUDE_MODE:
				return isSetAltitudeMode();
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
		result.append(" (minAltitude: ");
		if (minAltitudeESet) result.append(minAltitude); else result.append("<unset>");
		result.append(", maxAltitude: ");
		if (maxAltitudeESet) result.append(maxAltitude); else result.append("<unset>");
		result.append(", altitudeMode: ");
		if (altitudeModeESet) result.append(altitudeMode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LatLonAltBoxTypeImpl
