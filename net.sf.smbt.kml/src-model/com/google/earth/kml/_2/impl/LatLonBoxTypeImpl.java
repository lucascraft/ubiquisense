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

import com.google.earth.kml._2.LatLonBoxType;
import com.google.earth.kml._2.v21Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lat Lon Box Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.impl.LatLonBoxTypeImpl#getNorth <em>North</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.LatLonBoxTypeImpl#getSouth <em>South</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.LatLonBoxTypeImpl#getEast <em>East</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.LatLonBoxTypeImpl#getWest <em>West</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.LatLonBoxTypeImpl#getRotation <em>Rotation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LatLonBoxTypeImpl extends ObjectTypeImpl implements LatLonBoxType {
	/**
	 * The default value of the '{@link #getNorth() <em>North</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNorth()
	 * @generated
	 * @ordered
	 */
	protected static final double NORTH_EDEFAULT = 180.0;

	/**
	 * The cached value of the '{@link #getNorth() <em>North</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNorth()
	 * @generated
	 * @ordered
	 */
	protected double north = NORTH_EDEFAULT;

	/**
	 * This is true if the North attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean northESet;

	/**
	 * The default value of the '{@link #getSouth() <em>South</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSouth()
	 * @generated
	 * @ordered
	 */
	protected static final double SOUTH_EDEFAULT = -180.0;

	/**
	 * The cached value of the '{@link #getSouth() <em>South</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSouth()
	 * @generated
	 * @ordered
	 */
	protected double south = SOUTH_EDEFAULT;

	/**
	 * This is true if the South attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean southESet;

	/**
	 * The default value of the '{@link #getEast() <em>East</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEast()
	 * @generated
	 * @ordered
	 */
	protected static final double EAST_EDEFAULT = 180.0;

	/**
	 * The cached value of the '{@link #getEast() <em>East</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEast()
	 * @generated
	 * @ordered
	 */
	protected double east = EAST_EDEFAULT;

	/**
	 * This is true if the East attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eastESet;

	/**
	 * The default value of the '{@link #getWest() <em>West</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWest()
	 * @generated
	 * @ordered
	 */
	protected static final double WEST_EDEFAULT = -180.0;

	/**
	 * The cached value of the '{@link #getWest() <em>West</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWest()
	 * @generated
	 * @ordered
	 */
	protected double west = WEST_EDEFAULT;

	/**
	 * This is true if the West attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean westESet;

	/**
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected static final double ROTATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected double rotation = ROTATION_EDEFAULT;

	/**
	 * This is true if the Rotation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rotationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LatLonBoxTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return v21Package.Literals.LAT_LON_BOX_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNorth() {
		return north;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNorth(double newNorth) {
		double oldNorth = north;
		north = newNorth;
		boolean oldNorthESet = northESet;
		northESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.LAT_LON_BOX_TYPE__NORTH, oldNorth, north, !oldNorthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNorth() {
		double oldNorth = north;
		boolean oldNorthESet = northESet;
		north = NORTH_EDEFAULT;
		northESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.LAT_LON_BOX_TYPE__NORTH, oldNorth, NORTH_EDEFAULT, oldNorthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNorth() {
		return northESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSouth() {
		return south;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSouth(double newSouth) {
		double oldSouth = south;
		south = newSouth;
		boolean oldSouthESet = southESet;
		southESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.LAT_LON_BOX_TYPE__SOUTH, oldSouth, south, !oldSouthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSouth() {
		double oldSouth = south;
		boolean oldSouthESet = southESet;
		south = SOUTH_EDEFAULT;
		southESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.LAT_LON_BOX_TYPE__SOUTH, oldSouth, SOUTH_EDEFAULT, oldSouthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSouth() {
		return southESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEast() {
		return east;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEast(double newEast) {
		double oldEast = east;
		east = newEast;
		boolean oldEastESet = eastESet;
		eastESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.LAT_LON_BOX_TYPE__EAST, oldEast, east, !oldEastESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEast() {
		double oldEast = east;
		boolean oldEastESet = eastESet;
		east = EAST_EDEFAULT;
		eastESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.LAT_LON_BOX_TYPE__EAST, oldEast, EAST_EDEFAULT, oldEastESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEast() {
		return eastESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWest() {
		return west;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWest(double newWest) {
		double oldWest = west;
		west = newWest;
		boolean oldWestESet = westESet;
		westESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.LAT_LON_BOX_TYPE__WEST, oldWest, west, !oldWestESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWest() {
		double oldWest = west;
		boolean oldWestESet = westESet;
		west = WEST_EDEFAULT;
		westESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.LAT_LON_BOX_TYPE__WEST, oldWest, WEST_EDEFAULT, oldWestESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWest() {
		return westESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotation(double newRotation) {
		double oldRotation = rotation;
		rotation = newRotation;
		boolean oldRotationESet = rotationESet;
		rotationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.LAT_LON_BOX_TYPE__ROTATION, oldRotation, rotation, !oldRotationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotation() {
		double oldRotation = rotation;
		boolean oldRotationESet = rotationESet;
		rotation = ROTATION_EDEFAULT;
		rotationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.LAT_LON_BOX_TYPE__ROTATION, oldRotation, ROTATION_EDEFAULT, oldRotationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotation() {
		return rotationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case v21Package.LAT_LON_BOX_TYPE__NORTH:
				return getNorth();
			case v21Package.LAT_LON_BOX_TYPE__SOUTH:
				return getSouth();
			case v21Package.LAT_LON_BOX_TYPE__EAST:
				return getEast();
			case v21Package.LAT_LON_BOX_TYPE__WEST:
				return getWest();
			case v21Package.LAT_LON_BOX_TYPE__ROTATION:
				return getRotation();
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
			case v21Package.LAT_LON_BOX_TYPE__NORTH:
				setNorth((Double)newValue);
				return;
			case v21Package.LAT_LON_BOX_TYPE__SOUTH:
				setSouth((Double)newValue);
				return;
			case v21Package.LAT_LON_BOX_TYPE__EAST:
				setEast((Double)newValue);
				return;
			case v21Package.LAT_LON_BOX_TYPE__WEST:
				setWest((Double)newValue);
				return;
			case v21Package.LAT_LON_BOX_TYPE__ROTATION:
				setRotation((Double)newValue);
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
			case v21Package.LAT_LON_BOX_TYPE__NORTH:
				unsetNorth();
				return;
			case v21Package.LAT_LON_BOX_TYPE__SOUTH:
				unsetSouth();
				return;
			case v21Package.LAT_LON_BOX_TYPE__EAST:
				unsetEast();
				return;
			case v21Package.LAT_LON_BOX_TYPE__WEST:
				unsetWest();
				return;
			case v21Package.LAT_LON_BOX_TYPE__ROTATION:
				unsetRotation();
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
			case v21Package.LAT_LON_BOX_TYPE__NORTH:
				return isSetNorth();
			case v21Package.LAT_LON_BOX_TYPE__SOUTH:
				return isSetSouth();
			case v21Package.LAT_LON_BOX_TYPE__EAST:
				return isSetEast();
			case v21Package.LAT_LON_BOX_TYPE__WEST:
				return isSetWest();
			case v21Package.LAT_LON_BOX_TYPE__ROTATION:
				return isSetRotation();
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
		result.append(" (north: ");
		if (northESet) result.append(north); else result.append("<unset>");
		result.append(", south: ");
		if (southESet) result.append(south); else result.append("<unset>");
		result.append(", east: ");
		if (eastESet) result.append(east); else result.append("<unset>");
		result.append(", west: ");
		if (westESet) result.append(west); else result.append("<unset>");
		result.append(", rotation: ");
		if (rotationESet) result.append(rotation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LatLonBoxTypeImpl
