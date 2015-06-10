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

import com.google.earth.kml._2.IconStyleIconType;
import com.google.earth.kml._2.IconStyleType;
import com.google.earth.kml._2.Vec2Type;
import com.google.earth.kml._2.v21Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Icon Style Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.impl.IconStyleTypeImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.IconStyleTypeImpl#getHeading <em>Heading</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.IconStyleTypeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.IconStyleTypeImpl#getHotSpot <em>Hot Spot</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IconStyleTypeImpl extends ColorStyleTypeImpl implements IconStyleType {
	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final float SCALE_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected float scale = SCALE_EDEFAULT;

	/**
	 * This is true if the Scale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scaleESet;

	/**
	 * The default value of the '{@link #getHeading() <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeading()
	 * @generated
	 * @ordered
	 */
	protected static final float HEADING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHeading() <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeading()
	 * @generated
	 * @ordered
	 */
	protected float heading = HEADING_EDEFAULT;

	/**
	 * This is true if the Heading attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean headingESet;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected IconStyleIconType icon;

	/**
	 * The cached value of the '{@link #getHotSpot() <em>Hot Spot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHotSpot()
	 * @generated
	 * @ordered
	 */
	protected Vec2Type hotSpot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IconStyleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return v21Package.Literals.ICON_STYLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(float newScale) {
		float oldScale = scale;
		scale = newScale;
		boolean oldScaleESet = scaleESet;
		scaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.ICON_STYLE_TYPE__SCALE, oldScale, scale, !oldScaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScale() {
		float oldScale = scale;
		boolean oldScaleESet = scaleESet;
		scale = SCALE_EDEFAULT;
		scaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.ICON_STYLE_TYPE__SCALE, oldScale, SCALE_EDEFAULT, oldScaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScale() {
		return scaleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHeading() {
		return heading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeading(float newHeading) {
		float oldHeading = heading;
		heading = newHeading;
		boolean oldHeadingESet = headingESet;
		headingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.ICON_STYLE_TYPE__HEADING, oldHeading, heading, !oldHeadingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHeading() {
		float oldHeading = heading;
		boolean oldHeadingESet = headingESet;
		heading = HEADING_EDEFAULT;
		headingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.ICON_STYLE_TYPE__HEADING, oldHeading, HEADING_EDEFAULT, oldHeadingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHeading() {
		return headingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IconStyleIconType getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIcon(IconStyleIconType newIcon, NotificationChain msgs) {
		IconStyleIconType oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, v21Package.ICON_STYLE_TYPE__ICON, oldIcon, newIcon);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(IconStyleIconType newIcon) {
		if (newIcon != icon) {
			NotificationChain msgs = null;
			if (icon != null)
				msgs = ((InternalEObject)icon).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - v21Package.ICON_STYLE_TYPE__ICON, null, msgs);
			if (newIcon != null)
				msgs = ((InternalEObject)newIcon).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - v21Package.ICON_STYLE_TYPE__ICON, null, msgs);
			msgs = basicSetIcon(newIcon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.ICON_STYLE_TYPE__ICON, newIcon, newIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vec2Type getHotSpot() {
		return hotSpot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHotSpot(Vec2Type newHotSpot, NotificationChain msgs) {
		Vec2Type oldHotSpot = hotSpot;
		hotSpot = newHotSpot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, v21Package.ICON_STYLE_TYPE__HOT_SPOT, oldHotSpot, newHotSpot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHotSpot(Vec2Type newHotSpot) {
		if (newHotSpot != hotSpot) {
			NotificationChain msgs = null;
			if (hotSpot != null)
				msgs = ((InternalEObject)hotSpot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - v21Package.ICON_STYLE_TYPE__HOT_SPOT, null, msgs);
			if (newHotSpot != null)
				msgs = ((InternalEObject)newHotSpot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - v21Package.ICON_STYLE_TYPE__HOT_SPOT, null, msgs);
			msgs = basicSetHotSpot(newHotSpot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.ICON_STYLE_TYPE__HOT_SPOT, newHotSpot, newHotSpot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case v21Package.ICON_STYLE_TYPE__ICON:
				return basicSetIcon(null, msgs);
			case v21Package.ICON_STYLE_TYPE__HOT_SPOT:
				return basicSetHotSpot(null, msgs);
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
			case v21Package.ICON_STYLE_TYPE__SCALE:
				return getScale();
			case v21Package.ICON_STYLE_TYPE__HEADING:
				return getHeading();
			case v21Package.ICON_STYLE_TYPE__ICON:
				return getIcon();
			case v21Package.ICON_STYLE_TYPE__HOT_SPOT:
				return getHotSpot();
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
			case v21Package.ICON_STYLE_TYPE__SCALE:
				setScale((Float)newValue);
				return;
			case v21Package.ICON_STYLE_TYPE__HEADING:
				setHeading((Float)newValue);
				return;
			case v21Package.ICON_STYLE_TYPE__ICON:
				setIcon((IconStyleIconType)newValue);
				return;
			case v21Package.ICON_STYLE_TYPE__HOT_SPOT:
				setHotSpot((Vec2Type)newValue);
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
			case v21Package.ICON_STYLE_TYPE__SCALE:
				unsetScale();
				return;
			case v21Package.ICON_STYLE_TYPE__HEADING:
				unsetHeading();
				return;
			case v21Package.ICON_STYLE_TYPE__ICON:
				setIcon((IconStyleIconType)null);
				return;
			case v21Package.ICON_STYLE_TYPE__HOT_SPOT:
				setHotSpot((Vec2Type)null);
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
			case v21Package.ICON_STYLE_TYPE__SCALE:
				return isSetScale();
			case v21Package.ICON_STYLE_TYPE__HEADING:
				return isSetHeading();
			case v21Package.ICON_STYLE_TYPE__ICON:
				return icon != null;
			case v21Package.ICON_STYLE_TYPE__HOT_SPOT:
				return hotSpot != null;
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
		result.append(" (scale: ");
		if (scaleESet) result.append(scale); else result.append("<unset>");
		result.append(", heading: ");
		if (headingESet) result.append(heading); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IconStyleTypeImpl
