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

import com.google.earth.kml._2.ScreenOverlayType;
import com.google.earth.kml._2.Vec2Type;
import com.google.earth.kml._2.v21Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Screen Overlay Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.impl.ScreenOverlayTypeImpl#getOverlayXY <em>Overlay XY</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.ScreenOverlayTypeImpl#getScreenXY <em>Screen XY</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.ScreenOverlayTypeImpl#getRotationXY <em>Rotation XY</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.ScreenOverlayTypeImpl#getSize <em>Size</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.ScreenOverlayTypeImpl#getRotation <em>Rotation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScreenOverlayTypeImpl extends OverlayTypeImpl implements ScreenOverlayType {
	/**
	 * The cached value of the '{@link #getOverlayXY() <em>Overlay XY</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverlayXY()
	 * @generated
	 * @ordered
	 */
	protected Vec2Type overlayXY;

	/**
	 * The cached value of the '{@link #getScreenXY() <em>Screen XY</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenXY()
	 * @generated
	 * @ordered
	 */
	protected Vec2Type screenXY;

	/**
	 * The cached value of the '{@link #getRotationXY() <em>Rotation XY</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationXY()
	 * @generated
	 * @ordered
	 */
	protected Vec2Type rotationXY;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Vec2Type size;

	/**
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected static final float ROTATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected float rotation = ROTATION_EDEFAULT;

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
	protected ScreenOverlayTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return v21Package.Literals.SCREEN_OVERLAY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vec2Type getOverlayXY() {
		return overlayXY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverlayXY(Vec2Type newOverlayXY, NotificationChain msgs) {
		Vec2Type oldOverlayXY = overlayXY;
		overlayXY = newOverlayXY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, v21Package.SCREEN_OVERLAY_TYPE__OVERLAY_XY, oldOverlayXY, newOverlayXY);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverlayXY(Vec2Type newOverlayXY) {
		if (newOverlayXY != overlayXY) {
			NotificationChain msgs = null;
			if (overlayXY != null)
				msgs = ((InternalEObject)overlayXY).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - v21Package.SCREEN_OVERLAY_TYPE__OVERLAY_XY, null, msgs);
			if (newOverlayXY != null)
				msgs = ((InternalEObject)newOverlayXY).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - v21Package.SCREEN_OVERLAY_TYPE__OVERLAY_XY, null, msgs);
			msgs = basicSetOverlayXY(newOverlayXY, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.SCREEN_OVERLAY_TYPE__OVERLAY_XY, newOverlayXY, newOverlayXY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vec2Type getScreenXY() {
		return screenXY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScreenXY(Vec2Type newScreenXY, NotificationChain msgs) {
		Vec2Type oldScreenXY = screenXY;
		screenXY = newScreenXY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, v21Package.SCREEN_OVERLAY_TYPE__SCREEN_XY, oldScreenXY, newScreenXY);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScreenXY(Vec2Type newScreenXY) {
		if (newScreenXY != screenXY) {
			NotificationChain msgs = null;
			if (screenXY != null)
				msgs = ((InternalEObject)screenXY).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - v21Package.SCREEN_OVERLAY_TYPE__SCREEN_XY, null, msgs);
			if (newScreenXY != null)
				msgs = ((InternalEObject)newScreenXY).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - v21Package.SCREEN_OVERLAY_TYPE__SCREEN_XY, null, msgs);
			msgs = basicSetScreenXY(newScreenXY, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.SCREEN_OVERLAY_TYPE__SCREEN_XY, newScreenXY, newScreenXY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vec2Type getRotationXY() {
		return rotationXY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRotationXY(Vec2Type newRotationXY, NotificationChain msgs) {
		Vec2Type oldRotationXY = rotationXY;
		rotationXY = newRotationXY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, v21Package.SCREEN_OVERLAY_TYPE__ROTATION_XY, oldRotationXY, newRotationXY);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationXY(Vec2Type newRotationXY) {
		if (newRotationXY != rotationXY) {
			NotificationChain msgs = null;
			if (rotationXY != null)
				msgs = ((InternalEObject)rotationXY).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - v21Package.SCREEN_OVERLAY_TYPE__ROTATION_XY, null, msgs);
			if (newRotationXY != null)
				msgs = ((InternalEObject)newRotationXY).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - v21Package.SCREEN_OVERLAY_TYPE__ROTATION_XY, null, msgs);
			msgs = basicSetRotationXY(newRotationXY, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.SCREEN_OVERLAY_TYPE__ROTATION_XY, newRotationXY, newRotationXY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vec2Type getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSize(Vec2Type newSize, NotificationChain msgs) {
		Vec2Type oldSize = size;
		size = newSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, v21Package.SCREEN_OVERLAY_TYPE__SIZE, oldSize, newSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Vec2Type newSize) {
		if (newSize != size) {
			NotificationChain msgs = null;
			if (size != null)
				msgs = ((InternalEObject)size).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - v21Package.SCREEN_OVERLAY_TYPE__SIZE, null, msgs);
			if (newSize != null)
				msgs = ((InternalEObject)newSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - v21Package.SCREEN_OVERLAY_TYPE__SIZE, null, msgs);
			msgs = basicSetSize(newSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.SCREEN_OVERLAY_TYPE__SIZE, newSize, newSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotation(float newRotation) {
		float oldRotation = rotation;
		rotation = newRotation;
		boolean oldRotationESet = rotationESet;
		rotationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.SCREEN_OVERLAY_TYPE__ROTATION, oldRotation, rotation, !oldRotationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotation() {
		float oldRotation = rotation;
		boolean oldRotationESet = rotationESet;
		rotation = ROTATION_EDEFAULT;
		rotationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.SCREEN_OVERLAY_TYPE__ROTATION, oldRotation, ROTATION_EDEFAULT, oldRotationESet));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case v21Package.SCREEN_OVERLAY_TYPE__OVERLAY_XY:
				return basicSetOverlayXY(null, msgs);
			case v21Package.SCREEN_OVERLAY_TYPE__SCREEN_XY:
				return basicSetScreenXY(null, msgs);
			case v21Package.SCREEN_OVERLAY_TYPE__ROTATION_XY:
				return basicSetRotationXY(null, msgs);
			case v21Package.SCREEN_OVERLAY_TYPE__SIZE:
				return basicSetSize(null, msgs);
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
			case v21Package.SCREEN_OVERLAY_TYPE__OVERLAY_XY:
				return getOverlayXY();
			case v21Package.SCREEN_OVERLAY_TYPE__SCREEN_XY:
				return getScreenXY();
			case v21Package.SCREEN_OVERLAY_TYPE__ROTATION_XY:
				return getRotationXY();
			case v21Package.SCREEN_OVERLAY_TYPE__SIZE:
				return getSize();
			case v21Package.SCREEN_OVERLAY_TYPE__ROTATION:
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
			case v21Package.SCREEN_OVERLAY_TYPE__OVERLAY_XY:
				setOverlayXY((Vec2Type)newValue);
				return;
			case v21Package.SCREEN_OVERLAY_TYPE__SCREEN_XY:
				setScreenXY((Vec2Type)newValue);
				return;
			case v21Package.SCREEN_OVERLAY_TYPE__ROTATION_XY:
				setRotationXY((Vec2Type)newValue);
				return;
			case v21Package.SCREEN_OVERLAY_TYPE__SIZE:
				setSize((Vec2Type)newValue);
				return;
			case v21Package.SCREEN_OVERLAY_TYPE__ROTATION:
				setRotation((Float)newValue);
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
			case v21Package.SCREEN_OVERLAY_TYPE__OVERLAY_XY:
				setOverlayXY((Vec2Type)null);
				return;
			case v21Package.SCREEN_OVERLAY_TYPE__SCREEN_XY:
				setScreenXY((Vec2Type)null);
				return;
			case v21Package.SCREEN_OVERLAY_TYPE__ROTATION_XY:
				setRotationXY((Vec2Type)null);
				return;
			case v21Package.SCREEN_OVERLAY_TYPE__SIZE:
				setSize((Vec2Type)null);
				return;
			case v21Package.SCREEN_OVERLAY_TYPE__ROTATION:
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
			case v21Package.SCREEN_OVERLAY_TYPE__OVERLAY_XY:
				return overlayXY != null;
			case v21Package.SCREEN_OVERLAY_TYPE__SCREEN_XY:
				return screenXY != null;
			case v21Package.SCREEN_OVERLAY_TYPE__ROTATION_XY:
				return rotationXY != null;
			case v21Package.SCREEN_OVERLAY_TYPE__SIZE:
				return size != null;
			case v21Package.SCREEN_OVERLAY_TYPE__ROTATION:
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
		result.append(" (rotation: ");
		if (rotationESet) result.append(rotation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ScreenOverlayTypeImpl
