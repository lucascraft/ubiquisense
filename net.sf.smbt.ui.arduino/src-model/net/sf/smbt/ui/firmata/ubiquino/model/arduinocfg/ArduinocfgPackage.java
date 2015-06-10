/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinocfgFactory
 * @model kind="package"
 * @generated
 */
public interface ArduinocfgPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "arduinocfg";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://arduinocfg/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "arduinocfg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArduinocfgPackage eINSTANCE = net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.impl.ArduinocfgPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.impl.ArduinoConfigImpl <em>Arduino Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.impl.ArduinoConfigImpl
	 * @see net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.impl.ArduinocfgPackageImpl#getArduinoConfig()
	 * @generated
	 */
	int ARDUINO_CONFIG = 0;

	/**
	 * The feature id for the '<em><b>Arduino Comm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_CONFIG__ARDUINO_COMM = 0;

	/**
	 * The feature id for the '<em><b>Board Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_CONFIG__BOARD_KIND = 1;

	/**
	 * The feature id for the '<em><b>Usb Comm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_CONFIG__USB_COMM = 2;

	/**
	 * The feature id for the '<em><b>Usb Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_CONFIG__USB_SPEED = 3;

	/**
	 * The number of structural features of the '<em>Arduino Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARDUINO_CONFIG_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '<em>Comm Port Identifier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gnu.io.CommPortIdentifier
	 * @see net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.impl.ArduinocfgPackageImpl#getCommPortIdentifier()
	 * @generated
	 */
	int COMM_PORT_IDENTIFIER = 1;

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinoConfig <em>Arduino Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arduino Config</em>'.
	 * @see net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinoConfig
	 * @generated
	 */
	EClass getArduinoConfig();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinoConfig#getArduinoComm <em>Arduino Comm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arduino Comm</em>'.
	 * @see net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinoConfig#getArduinoComm()
	 * @see #getArduinoConfig()
	 * @generated
	 */
	EAttribute getArduinoConfig_ArduinoComm();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinoConfig#getBoardKind <em>Board Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Board Kind</em>'.
	 * @see net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinoConfig#getBoardKind()
	 * @see #getArduinoConfig()
	 * @generated
	 */
	EAttribute getArduinoConfig_BoardKind();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinoConfig#getUsbComm <em>Usb Comm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usb Comm</em>'.
	 * @see net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinoConfig#getUsbComm()
	 * @see #getArduinoConfig()
	 * @generated
	 */
	EAttribute getArduinoConfig_UsbComm();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinoConfig#getUsbSpeed <em>Usb Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usb Speed</em>'.
	 * @see net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinoConfig#getUsbSpeed()
	 * @see #getArduinoConfig()
	 * @generated
	 */
	EAttribute getArduinoConfig_UsbSpeed();

	/**
	 * Returns the meta object for data type '{@link gnu.io.CommPortIdentifier <em>Comm Port Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Comm Port Identifier</em>'.
	 * @see gnu.io.CommPortIdentifier
	 * @model instanceClass="gnu.io.CommPortIdentifier"
	 * @generated
	 */
	EDataType getCommPortIdentifier();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArduinocfgFactory getArduinocfgFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.impl.ArduinoConfigImpl <em>Arduino Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.impl.ArduinoConfigImpl
		 * @see net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.impl.ArduinocfgPackageImpl#getArduinoConfig()
		 * @generated
		 */
		EClass ARDUINO_CONFIG = eINSTANCE.getArduinoConfig();

		/**
		 * The meta object literal for the '<em><b>Arduino Comm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_CONFIG__ARDUINO_COMM = eINSTANCE.getArduinoConfig_ArduinoComm();

		/**
		 * The meta object literal for the '<em><b>Board Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_CONFIG__BOARD_KIND = eINSTANCE.getArduinoConfig_BoardKind();

		/**
		 * The meta object literal for the '<em><b>Usb Comm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_CONFIG__USB_COMM = eINSTANCE.getArduinoConfig_UsbComm();

		/**
		 * The meta object literal for the '<em><b>Usb Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARDUINO_CONFIG__USB_SPEED = eINSTANCE.getArduinoConfig_UsbSpeed();

		/**
		 * The meta object literal for the '<em>Comm Port Identifier</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gnu.io.CommPortIdentifier
		 * @see net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.impl.ArduinocfgPackageImpl#getCommPortIdentifier()
		 * @generated
		 */
		EDataType COMM_PORT_IDENTIFIER = eINSTANCE.getCommPortIdentifier();

	}

} //ArduinocfgPackage
