/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.thingmcfg.impl;

import gnu.io.CommPortIdentifier;
import net.sf.smbt.thingmcfg.ThingMCfg;
import net.sf.smbt.thingmcfg.ThingMDevice;
import net.sf.smbt.thingmcfg.ThingmcfgPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thing MCfg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.thingmcfg.impl.ThingMCfgImpl#getPortAddr <em>Port Addr</em>}</li>
 *   <li>{@link net.sf.smbt.thingmcfg.impl.ThingMCfgImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link net.sf.smbt.thingmcfg.impl.ThingMCfgImpl#getDevice <em>Device</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThingMCfgImpl extends EObjectImpl implements ThingMCfg {
	/**
	 * The default value of the '{@link #getPortAddr() <em>Port Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortAddr()
	 * @generated
	 * @ordered
	 */
	protected static final CommPortIdentifier PORT_ADDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortAddr() <em>Port Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortAddr()
	 * @generated
	 * @ordered
	 */
	protected CommPortIdentifier portAddr = PORT_ADDR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final int SPEED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected int speed = SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDevice() <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected static final ThingMDevice DEVICE_EDEFAULT = ThingMDevice.BLINK_M;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected ThingMDevice device = DEVICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThingMCfgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThingmcfgPackage.Literals.THING_MCFG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommPortIdentifier getPortAddr() {
		return portAddr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortAddr(CommPortIdentifier newPortAddr) {
		CommPortIdentifier oldPortAddr = portAddr;
		portAddr = newPortAddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingmcfgPackage.THING_MCFG__PORT_ADDR, oldPortAddr, portAddr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeed(int newSpeed) {
		int oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingmcfgPackage.THING_MCFG__SPEED, oldSpeed, speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThingMDevice getDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice(ThingMDevice newDevice) {
		ThingMDevice oldDevice = device;
		device = newDevice == null ? DEVICE_EDEFAULT : newDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingmcfgPackage.THING_MCFG__DEVICE, oldDevice, device));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ThingmcfgPackage.THING_MCFG__PORT_ADDR:
				return getPortAddr();
			case ThingmcfgPackage.THING_MCFG__SPEED:
				return getSpeed();
			case ThingmcfgPackage.THING_MCFG__DEVICE:
				return getDevice();
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
			case ThingmcfgPackage.THING_MCFG__PORT_ADDR:
				setPortAddr((CommPortIdentifier)newValue);
				return;
			case ThingmcfgPackage.THING_MCFG__SPEED:
				setSpeed((Integer)newValue);
				return;
			case ThingmcfgPackage.THING_MCFG__DEVICE:
				setDevice((ThingMDevice)newValue);
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
			case ThingmcfgPackage.THING_MCFG__PORT_ADDR:
				setPortAddr(PORT_ADDR_EDEFAULT);
				return;
			case ThingmcfgPackage.THING_MCFG__SPEED:
				setSpeed(SPEED_EDEFAULT);
				return;
			case ThingmcfgPackage.THING_MCFG__DEVICE:
				setDevice(DEVICE_EDEFAULT);
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
			case ThingmcfgPackage.THING_MCFG__PORT_ADDR:
				return PORT_ADDR_EDEFAULT == null ? portAddr != null : !PORT_ADDR_EDEFAULT.equals(portAddr);
			case ThingmcfgPackage.THING_MCFG__SPEED:
				return speed != SPEED_EDEFAULT;
			case ThingmcfgPackage.THING_MCFG__DEVICE:
				return device != DEVICE_EDEFAULT;
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
		result.append(" (portAddr: ");
		result.append(portAddr);
		result.append(", speed: ");
		result.append(speed);
		result.append(", device: ");
		result.append(device);
		result.append(')');
		return result.toString();
	}

} //ThingMCfgImpl
