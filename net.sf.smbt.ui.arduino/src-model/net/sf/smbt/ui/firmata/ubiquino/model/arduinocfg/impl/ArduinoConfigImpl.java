/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.impl;

import gnu.io.CommPortIdentifier;
import net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID;
import net.sf.smbt.mdl.arduino.ARDUINO_COMM;
import net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinoConfig;
import net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinocfgPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arduino Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.impl.ArduinoConfigImpl#getArduinoComm <em>Arduino Comm</em>}</li>
 *   <li>{@link net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.impl.ArduinoConfigImpl#getBoardKind <em>Board Kind</em>}</li>
 *   <li>{@link net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.impl.ArduinoConfigImpl#getUsbComm <em>Usb Comm</em>}</li>
 *   <li>{@link net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.impl.ArduinoConfigImpl#getUsbSpeed <em>Usb Speed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArduinoConfigImpl extends EObjectImpl implements ArduinoConfig {
	/**
	 * The default value of the '{@link #getArduinoComm() <em>Arduino Comm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduinoComm()
	 * @generated
	 * @ordered
	 */
	protected static final ARDUINO_COMM ARDUINO_COMM_EDEFAULT = ARDUINO_COMM.USB;

	/**
	 * The cached value of the '{@link #getArduinoComm() <em>Arduino Comm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArduinoComm()
	 * @generated
	 * @ordered
	 */
	protected ARDUINO_COMM arduinoComm = ARDUINO_COMM_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoardKind() <em>Board Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardKind()
	 * @generated
	 * @ordered
	 */
	protected static final ARDUINO_BOARD_UID BOARD_KIND_EDEFAULT = ARDUINO_BOARD_UID.DIECMILA_ATMEGA_168;

	/**
	 * The cached value of the '{@link #getBoardKind() <em>Board Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoardKind()
	 * @generated
	 * @ordered
	 */
	protected ARDUINO_BOARD_UID boardKind = BOARD_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsbComm() <em>Usb Comm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsbComm()
	 * @generated
	 * @ordered
	 */
	protected static final CommPortIdentifier USB_COMM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsbComm() <em>Usb Comm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsbComm()
	 * @generated
	 * @ordered
	 */
	protected CommPortIdentifier usbComm = USB_COMM_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsbSpeed() <em>Usb Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsbSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final int USB_SPEED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUsbSpeed() <em>Usb Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsbSpeed()
	 * @generated
	 * @ordered
	 */
	protected int usbSpeed = USB_SPEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArduinoConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinocfgPackage.Literals.ARDUINO_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARDUINO_COMM getArduinoComm() {
		return arduinoComm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArduinoComm(ARDUINO_COMM newArduinoComm) {
		ARDUINO_COMM oldArduinoComm = arduinoComm;
		arduinoComm = newArduinoComm == null ? ARDUINO_COMM_EDEFAULT : newArduinoComm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinocfgPackage.ARDUINO_CONFIG__ARDUINO_COMM, oldArduinoComm, arduinoComm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARDUINO_BOARD_UID getBoardKind() {
		return boardKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoardKind(ARDUINO_BOARD_UID newBoardKind) {
		ARDUINO_BOARD_UID oldBoardKind = boardKind;
		boardKind = newBoardKind == null ? BOARD_KIND_EDEFAULT : newBoardKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinocfgPackage.ARDUINO_CONFIG__BOARD_KIND, oldBoardKind, boardKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommPortIdentifier getUsbComm() {
		return usbComm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsbComm(CommPortIdentifier newUsbComm) {
		CommPortIdentifier oldUsbComm = usbComm;
		usbComm = newUsbComm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinocfgPackage.ARDUINO_CONFIG__USB_COMM, oldUsbComm, usbComm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUsbSpeed() {
		return usbSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsbSpeed(int newUsbSpeed) {
		int oldUsbSpeed = usbSpeed;
		usbSpeed = newUsbSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinocfgPackage.ARDUINO_CONFIG__USB_SPEED, oldUsbSpeed, usbSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArduinocfgPackage.ARDUINO_CONFIG__ARDUINO_COMM:
				return getArduinoComm();
			case ArduinocfgPackage.ARDUINO_CONFIG__BOARD_KIND:
				return getBoardKind();
			case ArduinocfgPackage.ARDUINO_CONFIG__USB_COMM:
				return getUsbComm();
			case ArduinocfgPackage.ARDUINO_CONFIG__USB_SPEED:
				return getUsbSpeed();
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
			case ArduinocfgPackage.ARDUINO_CONFIG__ARDUINO_COMM:
				setArduinoComm((ARDUINO_COMM)newValue);
				return;
			case ArduinocfgPackage.ARDUINO_CONFIG__BOARD_KIND:
				setBoardKind((ARDUINO_BOARD_UID)newValue);
				return;
			case ArduinocfgPackage.ARDUINO_CONFIG__USB_COMM:
				setUsbComm((CommPortIdentifier)newValue);
				return;
			case ArduinocfgPackage.ARDUINO_CONFIG__USB_SPEED:
				setUsbSpeed((Integer)newValue);
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
			case ArduinocfgPackage.ARDUINO_CONFIG__ARDUINO_COMM:
				setArduinoComm(ARDUINO_COMM_EDEFAULT);
				return;
			case ArduinocfgPackage.ARDUINO_CONFIG__BOARD_KIND:
				setBoardKind(BOARD_KIND_EDEFAULT);
				return;
			case ArduinocfgPackage.ARDUINO_CONFIG__USB_COMM:
				setUsbComm(USB_COMM_EDEFAULT);
				return;
			case ArduinocfgPackage.ARDUINO_CONFIG__USB_SPEED:
				setUsbSpeed(USB_SPEED_EDEFAULT);
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
			case ArduinocfgPackage.ARDUINO_CONFIG__ARDUINO_COMM:
				return arduinoComm != ARDUINO_COMM_EDEFAULT;
			case ArduinocfgPackage.ARDUINO_CONFIG__BOARD_KIND:
				return boardKind != BOARD_KIND_EDEFAULT;
			case ArduinocfgPackage.ARDUINO_CONFIG__USB_COMM:
				return USB_COMM_EDEFAULT == null ? usbComm != null : !USB_COMM_EDEFAULT.equals(usbComm);
			case ArduinocfgPackage.ARDUINO_CONFIG__USB_SPEED:
				return usbSpeed != USB_SPEED_EDEFAULT;
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
		result.append(" (arduinoComm: ");
		result.append(arduinoComm);
		result.append(", boardKind: ");
		result.append(boardKind);
		result.append(", usbComm: ");
		result.append(usbComm);
		result.append(", usbSpeed: ");
		result.append(usbSpeed);
		result.append(')');
		return result.toString();
	}

} //ArduinoConfigImpl
