/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.google.earth.kml._2.AltitudeModeEnum;
import com.google.earth.kml._2.GroundOverlayType;
import com.google.earth.kml._2.LatLonBoxType;
import com.google.earth.kml._2.v21Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ground Overlay Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.impl.GroundOverlayTypeImpl#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.GroundOverlayTypeImpl#getAltitudeMode <em>Altitude Mode</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.GroundOverlayTypeImpl#getLatLonBox <em>Lat Lon Box</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroundOverlayTypeImpl extends OverlayTypeImpl implements GroundOverlayType {
	/**
	 * The default value of the '{@link #getAltitude() <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected static final double ALTITUDE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAltitude() <em>Altitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected double altitude = ALTITUDE_EDEFAULT;

	/**
	 * This is true if the Altitude attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean altitudeESet;

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
	 * The cached value of the '{@link #getLatLonBox() <em>Lat Lon Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatLonBox()
	 * @generated
	 * @ordered
	 */
	protected LatLonBoxType latLonBox;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroundOverlayTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return v21Package.Literals.GROUND_OVERLAY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAltitude() {
		return altitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltitude(double newAltitude) {
		double oldAltitude = altitude;
		altitude = newAltitude;
		boolean oldAltitudeESet = altitudeESet;
		altitudeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.GROUND_OVERLAY_TYPE__ALTITUDE, oldAltitude, altitude, !oldAltitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAltitude() {
		double oldAltitude = altitude;
		boolean oldAltitudeESet = altitudeESet;
		altitude = ALTITUDE_EDEFAULT;
		altitudeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.GROUND_OVERLAY_TYPE__ALTITUDE, oldAltitude, ALTITUDE_EDEFAULT, oldAltitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAltitude() {
		return altitudeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.GROUND_OVERLAY_TYPE__ALTITUDE_MODE, oldAltitudeMode, altitudeMode, !oldAltitudeModeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.GROUND_OVERLAY_TYPE__ALTITUDE_MODE, oldAltitudeMode, ALTITUDE_MODE_EDEFAULT, oldAltitudeModeESet));
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
	public LatLonBoxType getLatLonBox() {
		return latLonBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLatLonBox(LatLonBoxType newLatLonBox, NotificationChain msgs) {
		LatLonBoxType oldLatLonBox = latLonBox;
		latLonBox = newLatLonBox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, v21Package.GROUND_OVERLAY_TYPE__LAT_LON_BOX, oldLatLonBox, newLatLonBox);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatLonBox(LatLonBoxType newLatLonBox) {
		if (newLatLonBox != latLonBox) {
			NotificationChain msgs = null;
			if (latLonBox != null)
				msgs = ((InternalEObject)latLonBox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - v21Package.GROUND_OVERLAY_TYPE__LAT_LON_BOX, null, msgs);
			if (newLatLonBox != null)
				msgs = ((InternalEObject)newLatLonBox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - v21Package.GROUND_OVERLAY_TYPE__LAT_LON_BOX, null, msgs);
			msgs = basicSetLatLonBox(newLatLonBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.GROUND_OVERLAY_TYPE__LAT_LON_BOX, newLatLonBox, newLatLonBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case v21Package.GROUND_OVERLAY_TYPE__LAT_LON_BOX:
				return basicSetLatLonBox(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case v21Package.GROUND_OVERLAY_TYPE__ALTITUDE:
				return getAltitude();
			case v21Package.GROUND_OVERLAY_TYPE__ALTITUDE_MODE:
				return getAltitudeMode();
			case v21Package.GROUND_OVERLAY_TYPE__LAT_LON_BOX:
				return getLatLonBox();
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
			case v21Package.GROUND_OVERLAY_TYPE__ALTITUDE:
				setAltitude((Double)newValue);
				return;
			case v21Package.GROUND_OVERLAY_TYPE__ALTITUDE_MODE:
				setAltitudeMode((AltitudeModeEnum)newValue);
				return;
			case v21Package.GROUND_OVERLAY_TYPE__LAT_LON_BOX:
				setLatLonBox((LatLonBoxType)newValue);
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
			case v21Package.GROUND_OVERLAY_TYPE__ALTITUDE:
				unsetAltitude();
				return;
			case v21Package.GROUND_OVERLAY_TYPE__ALTITUDE_MODE:
				unsetAltitudeMode();
				return;
			case v21Package.GROUND_OVERLAY_TYPE__LAT_LON_BOX:
				setLatLonBox((LatLonBoxType)null);
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
			case v21Package.GROUND_OVERLAY_TYPE__ALTITUDE:
				return isSetAltitude();
			case v21Package.GROUND_OVERLAY_TYPE__ALTITUDE_MODE:
				return isSetAltitudeMode();
			case v21Package.GROUND_OVERLAY_TYPE__LAT_LON_BOX:
				return latLonBox != null;
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
		result.append(" (altitude: ");
		if (altitudeESet) result.append(altitude); else result.append("<unset>");
		result.append(", altitudeMode: ");
		if (altitudeModeESet) result.append(altitudeMode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GroundOverlayTypeImpl
