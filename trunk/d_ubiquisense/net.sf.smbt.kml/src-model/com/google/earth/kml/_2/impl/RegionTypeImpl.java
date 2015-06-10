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

import com.google.earth.kml._2.LatLonAltBoxType;
import com.google.earth.kml._2.LodType;
import com.google.earth.kml._2.RegionType;
import com.google.earth.kml._2.v21Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.impl.RegionTypeImpl#getLatLonAltBox <em>Lat Lon Alt Box</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.RegionTypeImpl#getLod <em>Lod</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegionTypeImpl extends ObjectTypeImpl implements RegionType {
	/**
	 * The cached value of the '{@link #getLatLonAltBox() <em>Lat Lon Alt Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatLonAltBox()
	 * @generated
	 * @ordered
	 */
	protected LatLonAltBoxType latLonAltBox;

	/**
	 * The cached value of the '{@link #getLod() <em>Lod</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLod()
	 * @generated
	 * @ordered
	 */
	protected LodType lod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return v21Package.Literals.REGION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatLonAltBoxType getLatLonAltBox() {
		return latLonAltBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLatLonAltBox(LatLonAltBoxType newLatLonAltBox, NotificationChain msgs) {
		LatLonAltBoxType oldLatLonAltBox = latLonAltBox;
		latLonAltBox = newLatLonAltBox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, v21Package.REGION_TYPE__LAT_LON_ALT_BOX, oldLatLonAltBox, newLatLonAltBox);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatLonAltBox(LatLonAltBoxType newLatLonAltBox) {
		if (newLatLonAltBox != latLonAltBox) {
			NotificationChain msgs = null;
			if (latLonAltBox != null)
				msgs = ((InternalEObject)latLonAltBox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - v21Package.REGION_TYPE__LAT_LON_ALT_BOX, null, msgs);
			if (newLatLonAltBox != null)
				msgs = ((InternalEObject)newLatLonAltBox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - v21Package.REGION_TYPE__LAT_LON_ALT_BOX, null, msgs);
			msgs = basicSetLatLonAltBox(newLatLonAltBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.REGION_TYPE__LAT_LON_ALT_BOX, newLatLonAltBox, newLatLonAltBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LodType getLod() {
		return lod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLod(LodType newLod, NotificationChain msgs) {
		LodType oldLod = lod;
		lod = newLod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, v21Package.REGION_TYPE__LOD, oldLod, newLod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLod(LodType newLod) {
		if (newLod != lod) {
			NotificationChain msgs = null;
			if (lod != null)
				msgs = ((InternalEObject)lod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - v21Package.REGION_TYPE__LOD, null, msgs);
			if (newLod != null)
				msgs = ((InternalEObject)newLod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - v21Package.REGION_TYPE__LOD, null, msgs);
			msgs = basicSetLod(newLod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.REGION_TYPE__LOD, newLod, newLod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case v21Package.REGION_TYPE__LAT_LON_ALT_BOX:
				return basicSetLatLonAltBox(null, msgs);
			case v21Package.REGION_TYPE__LOD:
				return basicSetLod(null, msgs);
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
			case v21Package.REGION_TYPE__LAT_LON_ALT_BOX:
				return getLatLonAltBox();
			case v21Package.REGION_TYPE__LOD:
				return getLod();
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
			case v21Package.REGION_TYPE__LAT_LON_ALT_BOX:
				setLatLonAltBox((LatLonAltBoxType)newValue);
				return;
			case v21Package.REGION_TYPE__LOD:
				setLod((LodType)newValue);
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
			case v21Package.REGION_TYPE__LAT_LON_ALT_BOX:
				setLatLonAltBox((LatLonAltBoxType)null);
				return;
			case v21Package.REGION_TYPE__LOD:
				setLod((LodType)null);
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
			case v21Package.REGION_TYPE__LAT_LON_ALT_BOX:
				return latLonAltBox != null;
			case v21Package.REGION_TYPE__LOD:
				return lod != null;
		}
		return super.eIsSet(featureID);
	}

} //RegionTypeImpl
