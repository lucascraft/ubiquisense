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

import com.google.earth.kml._2.LodType;
import com.google.earth.kml._2.v21Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lod Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.impl.LodTypeImpl#getMinLodPixels <em>Min Lod Pixels</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.LodTypeImpl#getMaxLodPixels <em>Max Lod Pixels</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.LodTypeImpl#getMinFadeExtent <em>Min Fade Extent</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.LodTypeImpl#getMaxFadeExtent <em>Max Fade Extent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LodTypeImpl extends ObjectTypeImpl implements LodType {
	/**
	 * The default value of the '{@link #getMinLodPixels() <em>Min Lod Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLodPixels()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_LOD_PIXELS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinLodPixels() <em>Min Lod Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLodPixels()
	 * @generated
	 * @ordered
	 */
	protected float minLodPixels = MIN_LOD_PIXELS_EDEFAULT;

	/**
	 * This is true if the Min Lod Pixels attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minLodPixelsESet;

	/**
	 * The default value of the '{@link #getMaxLodPixels() <em>Max Lod Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLodPixels()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_LOD_PIXELS_EDEFAULT = -1.0F;

	/**
	 * The cached value of the '{@link #getMaxLodPixels() <em>Max Lod Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLodPixels()
	 * @generated
	 * @ordered
	 */
	protected float maxLodPixels = MAX_LOD_PIXELS_EDEFAULT;

	/**
	 * This is true if the Max Lod Pixels attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxLodPixelsESet;

	/**
	 * The default value of the '{@link #getMinFadeExtent() <em>Min Fade Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinFadeExtent()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_FADE_EXTENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinFadeExtent() <em>Min Fade Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinFadeExtent()
	 * @generated
	 * @ordered
	 */
	protected float minFadeExtent = MIN_FADE_EXTENT_EDEFAULT;

	/**
	 * This is true if the Min Fade Extent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minFadeExtentESet;

	/**
	 * The default value of the '{@link #getMaxFadeExtent() <em>Max Fade Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFadeExtent()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_FADE_EXTENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxFadeExtent() <em>Max Fade Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFadeExtent()
	 * @generated
	 * @ordered
	 */
	protected float maxFadeExtent = MAX_FADE_EXTENT_EDEFAULT;

	/**
	 * This is true if the Max Fade Extent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxFadeExtentESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LodTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return v21Package.Literals.LOD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinLodPixels() {
		return minLodPixels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinLodPixels(float newMinLodPixels) {
		float oldMinLodPixels = minLodPixels;
		minLodPixels = newMinLodPixels;
		boolean oldMinLodPixelsESet = minLodPixelsESet;
		minLodPixelsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.LOD_TYPE__MIN_LOD_PIXELS, oldMinLodPixels, minLodPixels, !oldMinLodPixelsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinLodPixels() {
		float oldMinLodPixels = minLodPixels;
		boolean oldMinLodPixelsESet = minLodPixelsESet;
		minLodPixels = MIN_LOD_PIXELS_EDEFAULT;
		minLodPixelsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.LOD_TYPE__MIN_LOD_PIXELS, oldMinLodPixels, MIN_LOD_PIXELS_EDEFAULT, oldMinLodPixelsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinLodPixels() {
		return minLodPixelsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxLodPixels() {
		return maxLodPixels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLodPixels(float newMaxLodPixels) {
		float oldMaxLodPixels = maxLodPixels;
		maxLodPixels = newMaxLodPixels;
		boolean oldMaxLodPixelsESet = maxLodPixelsESet;
		maxLodPixelsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.LOD_TYPE__MAX_LOD_PIXELS, oldMaxLodPixels, maxLodPixels, !oldMaxLodPixelsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxLodPixels() {
		float oldMaxLodPixels = maxLodPixels;
		boolean oldMaxLodPixelsESet = maxLodPixelsESet;
		maxLodPixels = MAX_LOD_PIXELS_EDEFAULT;
		maxLodPixelsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.LOD_TYPE__MAX_LOD_PIXELS, oldMaxLodPixels, MAX_LOD_PIXELS_EDEFAULT, oldMaxLodPixelsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxLodPixels() {
		return maxLodPixelsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinFadeExtent() {
		return minFadeExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinFadeExtent(float newMinFadeExtent) {
		float oldMinFadeExtent = minFadeExtent;
		minFadeExtent = newMinFadeExtent;
		boolean oldMinFadeExtentESet = minFadeExtentESet;
		minFadeExtentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.LOD_TYPE__MIN_FADE_EXTENT, oldMinFadeExtent, minFadeExtent, !oldMinFadeExtentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinFadeExtent() {
		float oldMinFadeExtent = minFadeExtent;
		boolean oldMinFadeExtentESet = minFadeExtentESet;
		minFadeExtent = MIN_FADE_EXTENT_EDEFAULT;
		minFadeExtentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.LOD_TYPE__MIN_FADE_EXTENT, oldMinFadeExtent, MIN_FADE_EXTENT_EDEFAULT, oldMinFadeExtentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinFadeExtent() {
		return minFadeExtentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxFadeExtent() {
		return maxFadeExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxFadeExtent(float newMaxFadeExtent) {
		float oldMaxFadeExtent = maxFadeExtent;
		maxFadeExtent = newMaxFadeExtent;
		boolean oldMaxFadeExtentESet = maxFadeExtentESet;
		maxFadeExtentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.LOD_TYPE__MAX_FADE_EXTENT, oldMaxFadeExtent, maxFadeExtent, !oldMaxFadeExtentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxFadeExtent() {
		float oldMaxFadeExtent = maxFadeExtent;
		boolean oldMaxFadeExtentESet = maxFadeExtentESet;
		maxFadeExtent = MAX_FADE_EXTENT_EDEFAULT;
		maxFadeExtentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.LOD_TYPE__MAX_FADE_EXTENT, oldMaxFadeExtent, MAX_FADE_EXTENT_EDEFAULT, oldMaxFadeExtentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxFadeExtent() {
		return maxFadeExtentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case v21Package.LOD_TYPE__MIN_LOD_PIXELS:
				return getMinLodPixels();
			case v21Package.LOD_TYPE__MAX_LOD_PIXELS:
				return getMaxLodPixels();
			case v21Package.LOD_TYPE__MIN_FADE_EXTENT:
				return getMinFadeExtent();
			case v21Package.LOD_TYPE__MAX_FADE_EXTENT:
				return getMaxFadeExtent();
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
			case v21Package.LOD_TYPE__MIN_LOD_PIXELS:
				setMinLodPixels((Float)newValue);
				return;
			case v21Package.LOD_TYPE__MAX_LOD_PIXELS:
				setMaxLodPixels((Float)newValue);
				return;
			case v21Package.LOD_TYPE__MIN_FADE_EXTENT:
				setMinFadeExtent((Float)newValue);
				return;
			case v21Package.LOD_TYPE__MAX_FADE_EXTENT:
				setMaxFadeExtent((Float)newValue);
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
			case v21Package.LOD_TYPE__MIN_LOD_PIXELS:
				unsetMinLodPixels();
				return;
			case v21Package.LOD_TYPE__MAX_LOD_PIXELS:
				unsetMaxLodPixels();
				return;
			case v21Package.LOD_TYPE__MIN_FADE_EXTENT:
				unsetMinFadeExtent();
				return;
			case v21Package.LOD_TYPE__MAX_FADE_EXTENT:
				unsetMaxFadeExtent();
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
			case v21Package.LOD_TYPE__MIN_LOD_PIXELS:
				return isSetMinLodPixels();
			case v21Package.LOD_TYPE__MAX_LOD_PIXELS:
				return isSetMaxLodPixels();
			case v21Package.LOD_TYPE__MIN_FADE_EXTENT:
				return isSetMinFadeExtent();
			case v21Package.LOD_TYPE__MAX_FADE_EXTENT:
				return isSetMaxFadeExtent();
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
		result.append(" (minLodPixels: ");
		if (minLodPixelsESet) result.append(minLodPixels); else result.append("<unset>");
		result.append(", maxLodPixels: ");
		if (maxLodPixelsESet) result.append(maxLodPixels); else result.append("<unset>");
		result.append(", minFadeExtent: ");
		if (minFadeExtentESet) result.append(minFadeExtent); else result.append("<unset>");
		result.append(", maxFadeExtent: ");
		if (maxFadeExtentESet) result.append(maxFadeExtent); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LodTypeImpl
