/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.model.qxf.impl;

import net.sf.smbt.dmx.model.qxf.Focus;
import net.sf.smbt.dmx.model.qxf.QxfPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Focus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.impl.FocusImpl#getPanMax <em>Pan Max</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.impl.FocusImpl#getTiltMax <em>Tilt Max</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.impl.FocusImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FocusImpl extends EObjectImpl implements Focus {
	/**
	 * The default value of the '{@link #getPanMax() <em>Pan Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanMax()
	 * @generated
	 * @ordered
	 */
	protected static final String PAN_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPanMax() <em>Pan Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanMax()
	 * @generated
	 * @ordered
	 */
	protected String panMax = PAN_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getTiltMax() <em>Tilt Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiltMax()
	 * @generated
	 * @ordered
	 */
	protected static final String TILT_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTiltMax() <em>Tilt Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiltMax()
	 * @generated
	 * @ordered
	 */
	protected String tiltMax = TILT_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FocusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QxfPackage.Literals.FOCUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPanMax() {
		return panMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanMax(String newPanMax) {
		String oldPanMax = panMax;
		panMax = newPanMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QxfPackage.FOCUS__PAN_MAX, oldPanMax, panMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTiltMax() {
		return tiltMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTiltMax(String newTiltMax) {
		String oldTiltMax = tiltMax;
		tiltMax = newTiltMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QxfPackage.FOCUS__TILT_MAX, oldTiltMax, tiltMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QxfPackage.FOCUS__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QxfPackage.FOCUS__PAN_MAX:
				return getPanMax();
			case QxfPackage.FOCUS__TILT_MAX:
				return getTiltMax();
			case QxfPackage.FOCUS__TYPE:
				return getType();
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
			case QxfPackage.FOCUS__PAN_MAX:
				setPanMax((String)newValue);
				return;
			case QxfPackage.FOCUS__TILT_MAX:
				setTiltMax((String)newValue);
				return;
			case QxfPackage.FOCUS__TYPE:
				setType((String)newValue);
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
			case QxfPackage.FOCUS__PAN_MAX:
				setPanMax(PAN_MAX_EDEFAULT);
				return;
			case QxfPackage.FOCUS__TILT_MAX:
				setTiltMax(TILT_MAX_EDEFAULT);
				return;
			case QxfPackage.FOCUS__TYPE:
				setType(TYPE_EDEFAULT);
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
			case QxfPackage.FOCUS__PAN_MAX:
				return PAN_MAX_EDEFAULT == null ? panMax != null : !PAN_MAX_EDEFAULT.equals(panMax);
			case QxfPackage.FOCUS__TILT_MAX:
				return TILT_MAX_EDEFAULT == null ? tiltMax != null : !TILT_MAX_EDEFAULT.equals(tiltMax);
			case QxfPackage.FOCUS__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (panMax: ");
		result.append(panMax);
		result.append(", tiltMax: ");
		result.append(tiltMax);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //FocusImpl
