/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg;


import gnu.io.CommPortIdentifier;
import net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID;
import net.sf.smbt.mdl.arduino.ARDUINO_COMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arduino Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinoConfig#getArduinoComm <em>Arduino Comm</em>}</li>
 *   <li>{@link net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinoConfig#getBoardKind <em>Board Kind</em>}</li>
 *   <li>{@link net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinoConfig#getUsbComm <em>Usb Comm</em>}</li>
 *   <li>{@link net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinoConfig#getUsbSpeed <em>Usb Speed</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinocfgPackage#getArduinoConfig()
 * @model
 * @generated
 */
public interface ArduinoConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Arduino Comm</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.mdl.arduino.ARDUINO_COMM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arduino Comm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arduino Comm</em>' attribute.
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_COMM
	 * @see #setArduinoComm(ARDUINO_COMM)
	 * @see net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinocfgPackage#getArduinoConfig_ArduinoComm()
	 * @model
	 * @generated
	 */
	ARDUINO_COMM getArduinoComm();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinoConfig#getArduinoComm <em>Arduino Comm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arduino Comm</em>' attribute.
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_COMM
	 * @see #getArduinoComm()
	 * @generated
	 */
	void setArduinoComm(ARDUINO_COMM value);

	/**
	 * Returns the value of the '<em><b>Board Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Board Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board Kind</em>' attribute.
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID
	 * @see #setBoardKind(ARDUINO_BOARD_UID)
	 * @see net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinocfgPackage#getArduinoConfig_BoardKind()
	 * @model
	 * @generated
	 */
	ARDUINO_BOARD_UID getBoardKind();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinoConfig#getBoardKind <em>Board Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board Kind</em>' attribute.
	 * @see net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID
	 * @see #getBoardKind()
	 * @generated
	 */
	void setBoardKind(ARDUINO_BOARD_UID value);

	/**
	 * Returns the value of the '<em><b>Usb Comm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usb Comm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usb Comm</em>' attribute.
	 * @see #setUsbComm(CommPortIdentifier)
	 * @see net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinocfgPackage#getArduinoConfig_UsbComm()
	 * @model dataType="net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.CommPortIdentifier"
	 * @generated
	 */
	CommPortIdentifier getUsbComm();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinoConfig#getUsbComm <em>Usb Comm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usb Comm</em>' attribute.
	 * @see #getUsbComm()
	 * @generated
	 */
	void setUsbComm(CommPortIdentifier value);

	/**
	 * Returns the value of the '<em><b>Usb Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usb Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usb Speed</em>' attribute.
	 * @see #setUsbSpeed(int)
	 * @see net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinocfgPackage#getArduinoConfig_UsbSpeed()
	 * @model
	 * @generated
	 */
	int getUsbSpeed();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinoConfig#getUsbSpeed <em>Usb Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usb Speed</em>' attribute.
	 * @see #getUsbSpeed()
	 * @generated
	 */
	void setUsbSpeed(int value);

} // ArduinoConfig
