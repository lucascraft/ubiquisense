/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.protocol.ezfirmata;

import net.sf.smbt.midi.ezmidi.EzmidiPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see net.sf.smbt.protocol.ezfirmata.EzfirmataFactory
 * @model kind="package"
 * @generated
 */
public interface EzfirmataPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezfirmata";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ezfirmata/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezfirmata";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzfirmataPackage eINSTANCE = net.sf.smbt.protocol.ezfirmata.impl.EzfirmataPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.protocol.ezfirmata.impl.FirmataCmdImpl <em>Firmata Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.protocol.ezfirmata.impl.FirmataCmdImpl
	 * @see net.sf.smbt.protocol.ezfirmata.impl.EzfirmataPackageImpl#getFirmataCmd()
	 * @generated
	 */
	int FIRMATA_CMD = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_CMD__PRIORITY = EzmidiPackage.DSL_MIDI_MESSAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_CMD__STAMP = EzmidiPackage.DSL_MIDI_MESSAGE__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_CMD__ADDR = EzmidiPackage.DSL_MIDI_MESSAGE__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_CMD__MSG_SIZE = EzmidiPackage.DSL_MIDI_MESSAGE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_CMD__BYTE1 = EzmidiPackage.DSL_MIDI_MESSAGE__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_CMD__BYTE2 = EzmidiPackage.DSL_MIDI_MESSAGE__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_CMD__MESSAGE = EzmidiPackage.DSL_MIDI_MESSAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_CMD__CHANNEL = EzmidiPackage.DSL_MIDI_MESSAGE__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_CMD__CMD = EzmidiPackage.DSL_MIDI_MESSAGE__CMD;

	/**
	 * The number of structural features of the '<em>Firmata Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_CMD_FEATURE_COUNT = EzmidiPackage.DSL_MIDI_MESSAGE_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link net.sf.smbt.protocol.ezfirmata.impl.FirmataReportDigitalPinCmdImpl <em>Firmata Report Digital Pin Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.protocol.ezfirmata.impl.FirmataReportDigitalPinCmdImpl
	 * @see net.sf.smbt.protocol.ezfirmata.impl.EzfirmataPackageImpl#getFirmataReportDigitalPinCmd()
	 * @generated
	 */
	int FIRMATA_REPORT_DIGITAL_PIN_CMD = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_REPORT_DIGITAL_PIN_CMD__PRIORITY = FIRMATA_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_REPORT_DIGITAL_PIN_CMD__STAMP = FIRMATA_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_REPORT_DIGITAL_PIN_CMD__ADDR = FIRMATA_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_REPORT_DIGITAL_PIN_CMD__MSG_SIZE = FIRMATA_CMD__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_REPORT_DIGITAL_PIN_CMD__BYTE1 = FIRMATA_CMD__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_REPORT_DIGITAL_PIN_CMD__BYTE2 = FIRMATA_CMD__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_REPORT_DIGITAL_PIN_CMD__MESSAGE = FIRMATA_CMD__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_REPORT_DIGITAL_PIN_CMD__CHANNEL = FIRMATA_CMD__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_REPORT_DIGITAL_PIN_CMD__CMD = FIRMATA_CMD__CMD;

	/**
	 * The number of structural features of the '<em>Firmata Report Digital Pin Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_REPORT_DIGITAL_PIN_CMD_FEATURE_COUNT = FIRMATA_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.protocol.ezfirmata.impl.FirmataReportAnalogPinCmdImpl <em>Firmata Report Analog Pin Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.protocol.ezfirmata.impl.FirmataReportAnalogPinCmdImpl
	 * @see net.sf.smbt.protocol.ezfirmata.impl.EzfirmataPackageImpl#getFirmataReportAnalogPinCmd()
	 * @generated
	 */
	int FIRMATA_REPORT_ANALOG_PIN_CMD = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_REPORT_ANALOG_PIN_CMD__PRIORITY = EzmidiPackage.ABSTRACT_MIDI_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_REPORT_ANALOG_PIN_CMD__STAMP = EzmidiPackage.ABSTRACT_MIDI_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_REPORT_ANALOG_PIN_CMD__ADDR = EzmidiPackage.ABSTRACT_MIDI_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_REPORT_ANALOG_PIN_CMD__MSG_SIZE = EzmidiPackage.ABSTRACT_MIDI_CMD__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_REPORT_ANALOG_PIN_CMD__BYTE1 = EzmidiPackage.ABSTRACT_MIDI_CMD__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_REPORT_ANALOG_PIN_CMD__BYTE2 = EzmidiPackage.ABSTRACT_MIDI_CMD__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_REPORT_ANALOG_PIN_CMD__MESSAGE = EzmidiPackage.ABSTRACT_MIDI_CMD__MESSAGE;

	/**
	 * The number of structural features of the '<em>Firmata Report Analog Pin Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_REPORT_ANALOG_PIN_CMD_FEATURE_COUNT = EzmidiPackage.ABSTRACT_MIDI_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.protocol.ezfirmata.impl.FirmataSetPinModeCmdImpl <em>Firmata Set Pin Mode Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.protocol.ezfirmata.impl.FirmataSetPinModeCmdImpl
	 * @see net.sf.smbt.protocol.ezfirmata.impl.EzfirmataPackageImpl#getFirmataSetPinModeCmd()
	 * @generated
	 */
	int FIRMATA_SET_PIN_MODE_CMD = 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_SET_PIN_MODE_CMD__PRIORITY = FIRMATA_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_SET_PIN_MODE_CMD__STAMP = FIRMATA_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_SET_PIN_MODE_CMD__ADDR = FIRMATA_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_SET_PIN_MODE_CMD__MSG_SIZE = FIRMATA_CMD__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_SET_PIN_MODE_CMD__BYTE1 = FIRMATA_CMD__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_SET_PIN_MODE_CMD__BYTE2 = FIRMATA_CMD__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_SET_PIN_MODE_CMD__MESSAGE = FIRMATA_CMD__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_SET_PIN_MODE_CMD__CHANNEL = FIRMATA_CMD__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_SET_PIN_MODE_CMD__CMD = FIRMATA_CMD__CMD;

	/**
	 * The number of structural features of the '<em>Firmata Set Pin Mode Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_SET_PIN_MODE_CMD_FEATURE_COUNT = FIRMATA_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.protocol.ezfirmata.impl.FirmataProtocolVersionCmdImpl <em>Firmata Protocol Version Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.protocol.ezfirmata.impl.FirmataProtocolVersionCmdImpl
	 * @see net.sf.smbt.protocol.ezfirmata.impl.EzfirmataPackageImpl#getFirmataProtocolVersionCmd()
	 * @generated
	 */
	int FIRMATA_PROTOCOL_VERSION_CMD = 4;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_PROTOCOL_VERSION_CMD__PRIORITY = FIRMATA_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_PROTOCOL_VERSION_CMD__STAMP = FIRMATA_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_PROTOCOL_VERSION_CMD__ADDR = FIRMATA_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_PROTOCOL_VERSION_CMD__MSG_SIZE = FIRMATA_CMD__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_PROTOCOL_VERSION_CMD__BYTE1 = FIRMATA_CMD__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_PROTOCOL_VERSION_CMD__BYTE2 = FIRMATA_CMD__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_PROTOCOL_VERSION_CMD__MESSAGE = FIRMATA_CMD__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_PROTOCOL_VERSION_CMD__CHANNEL = FIRMATA_CMD__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_PROTOCOL_VERSION_CMD__CMD = FIRMATA_CMD__CMD;

	/**
	 * The number of structural features of the '<em>Firmata Protocol Version Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_PROTOCOL_VERSION_CMD_FEATURE_COUNT = FIRMATA_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.protocol.ezfirmata.impl.FirmataSystemResetCmdImpl <em>Firmata System Reset Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.protocol.ezfirmata.impl.FirmataSystemResetCmdImpl
	 * @see net.sf.smbt.protocol.ezfirmata.impl.EzfirmataPackageImpl#getFirmataSystemResetCmd()
	 * @generated
	 */
	int FIRMATA_SYSTEM_RESET_CMD = 5;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_SYSTEM_RESET_CMD__PRIORITY = FIRMATA_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_SYSTEM_RESET_CMD__STAMP = FIRMATA_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_SYSTEM_RESET_CMD__ADDR = FIRMATA_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_SYSTEM_RESET_CMD__MSG_SIZE = FIRMATA_CMD__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_SYSTEM_RESET_CMD__BYTE1 = FIRMATA_CMD__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_SYSTEM_RESET_CMD__BYTE2 = FIRMATA_CMD__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_SYSTEM_RESET_CMD__MESSAGE = FIRMATA_CMD__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_SYSTEM_RESET_CMD__CHANNEL = FIRMATA_CMD__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_SYSTEM_RESET_CMD__CMD = FIRMATA_CMD__CMD;

	/**
	 * The number of structural features of the '<em>Firmata System Reset Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_SYSTEM_RESET_CMD_FEATURE_COUNT = FIRMATA_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.protocol.ezfirmata.impl.FirmataAnalogIOMsgCmdImpl <em>Firmata Analog IO Msg Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.protocol.ezfirmata.impl.FirmataAnalogIOMsgCmdImpl
	 * @see net.sf.smbt.protocol.ezfirmata.impl.EzfirmataPackageImpl#getFirmataAnalogIOMsgCmd()
	 * @generated
	 */
	int FIRMATA_ANALOG_IO_MSG_CMD = 6;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_ANALOG_IO_MSG_CMD__PRIORITY = FIRMATA_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_ANALOG_IO_MSG_CMD__STAMP = FIRMATA_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_ANALOG_IO_MSG_CMD__ADDR = FIRMATA_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_ANALOG_IO_MSG_CMD__MSG_SIZE = FIRMATA_CMD__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_ANALOG_IO_MSG_CMD__BYTE1 = FIRMATA_CMD__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_ANALOG_IO_MSG_CMD__BYTE2 = FIRMATA_CMD__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_ANALOG_IO_MSG_CMD__MESSAGE = FIRMATA_CMD__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_ANALOG_IO_MSG_CMD__CHANNEL = FIRMATA_CMD__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_ANALOG_IO_MSG_CMD__CMD = FIRMATA_CMD__CMD;

	/**
	 * The number of structural features of the '<em>Firmata Analog IO Msg Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_ANALOG_IO_MSG_CMD_FEATURE_COUNT = FIRMATA_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.protocol.ezfirmata.impl.FirmataDigitalIOMsgCmdImpl <em>Firmata Digital IO Msg Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.protocol.ezfirmata.impl.FirmataDigitalIOMsgCmdImpl
	 * @see net.sf.smbt.protocol.ezfirmata.impl.EzfirmataPackageImpl#getFirmataDigitalIOMsgCmd()
	 * @generated
	 */
	int FIRMATA_DIGITAL_IO_MSG_CMD = 7;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_DIGITAL_IO_MSG_CMD__PRIORITY = FIRMATA_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_DIGITAL_IO_MSG_CMD__STAMP = FIRMATA_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_DIGITAL_IO_MSG_CMD__ADDR = FIRMATA_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_DIGITAL_IO_MSG_CMD__MSG_SIZE = FIRMATA_CMD__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_DIGITAL_IO_MSG_CMD__BYTE1 = FIRMATA_CMD__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_DIGITAL_IO_MSG_CMD__BYTE2 = FIRMATA_CMD__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_DIGITAL_IO_MSG_CMD__MESSAGE = FIRMATA_CMD__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_DIGITAL_IO_MSG_CMD__CHANNEL = FIRMATA_CMD__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_DIGITAL_IO_MSG_CMD__CMD = FIRMATA_CMD__CMD;

	/**
	 * The number of structural features of the '<em>Firmata Digital IO Msg Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_DIGITAL_IO_MSG_CMD_FEATURE_COUNT = FIRMATA_CMD_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link net.sf.smbt.protocol.ezfirmata.impl.SysexStartImpl <em>Sysex Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.protocol.ezfirmata.impl.SysexStartImpl
	 * @see net.sf.smbt.protocol.ezfirmata.impl.EzfirmataPackageImpl#getSysexStart()
	 * @generated
	 */
	int SYSEX_START = 8;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_START__PRIORITY = EzmidiPackage.SYSEX_MESSAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_START__STAMP = EzmidiPackage.SYSEX_MESSAGE__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_START__ADDR = EzmidiPackage.SYSEX_MESSAGE__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_START__MSG_SIZE = EzmidiPackage.SYSEX_MESSAGE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_START__BYTE1 = EzmidiPackage.SYSEX_MESSAGE__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_START__BYTE2 = EzmidiPackage.SYSEX_MESSAGE__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_START__MESSAGE = EzmidiPackage.SYSEX_MESSAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_START__CHANNEL = EzmidiPackage.SYSEX_MESSAGE__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_START__CMD = EzmidiPackage.SYSEX_MESSAGE__CMD;

	/**
	 * The number of structural features of the '<em>Sysex Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_START_FEATURE_COUNT = EzmidiPackage.SYSEX_MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.protocol.ezfirmata.impl.SysexStopImpl <em>Sysex Stop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.protocol.ezfirmata.impl.SysexStopImpl
	 * @see net.sf.smbt.protocol.ezfirmata.impl.EzfirmataPackageImpl#getSysexStop()
	 * @generated
	 */
	int SYSEX_STOP = 9;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_STOP__PRIORITY = EzmidiPackage.SYSEX_MESSAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_STOP__STAMP = EzmidiPackage.SYSEX_MESSAGE__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_STOP__ADDR = EzmidiPackage.SYSEX_MESSAGE__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_STOP__MSG_SIZE = EzmidiPackage.SYSEX_MESSAGE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_STOP__BYTE1 = EzmidiPackage.SYSEX_MESSAGE__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_STOP__BYTE2 = EzmidiPackage.SYSEX_MESSAGE__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_STOP__MESSAGE = EzmidiPackage.SYSEX_MESSAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_STOP__CHANNEL = EzmidiPackage.SYSEX_MESSAGE__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_STOP__CMD = EzmidiPackage.SYSEX_MESSAGE__CMD;

	/**
	 * The number of structural features of the '<em>Sysex Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSEX_STOP_FEATURE_COUNT = EzmidiPackage.SYSEX_MESSAGE_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link net.sf.smbt.protocol.ezfirmata.impl.FirmataSysexMessageImpl <em>Firmata Sysex Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.protocol.ezfirmata.impl.FirmataSysexMessageImpl
	 * @see net.sf.smbt.protocol.ezfirmata.impl.EzfirmataPackageImpl#getFirmataSysexMessage()
	 * @generated
	 */
	int FIRMATA_SYSEX_MESSAGE = 10;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_SYSEX_MESSAGE__PRIORITY = EzmidiPackage.SYSEX_MESSAGE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_SYSEX_MESSAGE__STAMP = EzmidiPackage.SYSEX_MESSAGE__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_SYSEX_MESSAGE__ADDR = EzmidiPackage.SYSEX_MESSAGE__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_SYSEX_MESSAGE__MSG_SIZE = EzmidiPackage.SYSEX_MESSAGE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_SYSEX_MESSAGE__BYTE1 = EzmidiPackage.SYSEX_MESSAGE__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_SYSEX_MESSAGE__BYTE2 = EzmidiPackage.SYSEX_MESSAGE__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_SYSEX_MESSAGE__MESSAGE = EzmidiPackage.SYSEX_MESSAGE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_SYSEX_MESSAGE__CHANNEL = EzmidiPackage.SYSEX_MESSAGE__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_SYSEX_MESSAGE__CMD = EzmidiPackage.SYSEX_MESSAGE__CMD;

	/**
	 * The number of structural features of the '<em>Firmata Sysex Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_SYSEX_MESSAGE_FEATURE_COUNT = EzmidiPackage.SYSEX_MESSAGE_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link net.sf.smbt.protocol.ezfirmata.impl.FirmataCapabilitiesCmdImpl <em>Firmata Capabilities Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.protocol.ezfirmata.impl.FirmataCapabilitiesCmdImpl
	 * @see net.sf.smbt.protocol.ezfirmata.impl.EzfirmataPackageImpl#getFirmataCapabilitiesCmd()
	 * @generated
	 */
	int FIRMATA_CAPABILITIES_CMD = 11;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_CAPABILITIES_CMD__PRIORITY = FIRMATA_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_CAPABILITIES_CMD__STAMP = FIRMATA_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_CAPABILITIES_CMD__ADDR = FIRMATA_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_CAPABILITIES_CMD__MSG_SIZE = FIRMATA_CMD__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_CAPABILITIES_CMD__BYTE1 = FIRMATA_CMD__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_CAPABILITIES_CMD__BYTE2 = FIRMATA_CMD__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_CAPABILITIES_CMD__MESSAGE = FIRMATA_CMD__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_CAPABILITIES_CMD__CHANNEL = FIRMATA_CMD__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_CAPABILITIES_CMD__CMD = FIRMATA_CMD__CMD;

	/**
	 * The number of structural features of the '<em>Firmata Capabilities Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_CAPABILITIES_CMD_FEATURE_COUNT = FIRMATA_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.protocol.ezfirmata.impl.FirmataPinStateResponseImpl <em>Firmata Pin State Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.protocol.ezfirmata.impl.FirmataPinStateResponseImpl
	 * @see net.sf.smbt.protocol.ezfirmata.impl.EzfirmataPackageImpl#getFirmataPinStateResponse()
	 * @generated
	 */
	int FIRMATA_PIN_STATE_RESPONSE = 12;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_PIN_STATE_RESPONSE__PRIORITY = FIRMATA_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_PIN_STATE_RESPONSE__STAMP = FIRMATA_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_PIN_STATE_RESPONSE__ADDR = FIRMATA_CMD__ADDR;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_PIN_STATE_RESPONSE__MSG_SIZE = FIRMATA_CMD__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>Byte1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_PIN_STATE_RESPONSE__BYTE1 = FIRMATA_CMD__BYTE1;

	/**
	 * The feature id for the '<em><b>Byte2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_PIN_STATE_RESPONSE__BYTE2 = FIRMATA_CMD__BYTE2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_PIN_STATE_RESPONSE__MESSAGE = FIRMATA_CMD__MESSAGE;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_PIN_STATE_RESPONSE__CHANNEL = FIRMATA_CMD__CHANNEL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_PIN_STATE_RESPONSE__CMD = FIRMATA_CMD__CMD;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_PIN_STATE_RESPONSE__PIN = FIRMATA_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_PIN_STATE_RESPONSE__MODEL = FIRMATA_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_PIN_STATE_RESPONSE__VALUE = FIRMATA_CMD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Firmata Pin State Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRMATA_PIN_STATE_RESPONSE_FEATURE_COUNT = FIRMATA_CMD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.protocol.ezfirmata.FIRMATA_I2C_RW_MODE <em>FIRMATA I2C RW MODE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.protocol.ezfirmata.FIRMATA_I2C_RW_MODE
	 * @see net.sf.smbt.protocol.ezfirmata.impl.EzfirmataPackageImpl#getFIRMATA_I2C_RW_MODE()
	 * @generated
	 */
	int FIRMATA_I2C_RW_MODE = 13;

	/**
	 * The meta object id for the '{@link net.sf.smbt.protocol.ezfirmata.FIRMATA_I2C_ADDR_MODE <em>FIRMATA I2C ADDR MODE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.protocol.ezfirmata.FIRMATA_I2C_ADDR_MODE
	 * @see net.sf.smbt.protocol.ezfirmata.impl.EzfirmataPackageImpl#getFIRMATA_I2C_ADDR_MODE()
	 * @generated
	 */
	int FIRMATA_I2C_ADDR_MODE = 14;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.protocol.ezfirmata.FirmataCmd <em>Firmata Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firmata Cmd</em>'.
	 * @see net.sf.smbt.protocol.ezfirmata.FirmataCmd
	 * @generated
	 */
	EClass getFirmataCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.protocol.ezfirmata.FirmataReportDigitalPinCmd <em>Firmata Report Digital Pin Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firmata Report Digital Pin Cmd</em>'.
	 * @see net.sf.smbt.protocol.ezfirmata.FirmataReportDigitalPinCmd
	 * @generated
	 */
	EClass getFirmataReportDigitalPinCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.protocol.ezfirmata.FirmataReportAnalogPinCmd <em>Firmata Report Analog Pin Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firmata Report Analog Pin Cmd</em>'.
	 * @see net.sf.smbt.protocol.ezfirmata.FirmataReportAnalogPinCmd
	 * @generated
	 */
	EClass getFirmataReportAnalogPinCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.protocol.ezfirmata.FirmataSetPinModeCmd <em>Firmata Set Pin Mode Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firmata Set Pin Mode Cmd</em>'.
	 * @see net.sf.smbt.protocol.ezfirmata.FirmataSetPinModeCmd
	 * @generated
	 */
	EClass getFirmataSetPinModeCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.protocol.ezfirmata.FirmataProtocolVersionCmd <em>Firmata Protocol Version Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firmata Protocol Version Cmd</em>'.
	 * @see net.sf.smbt.protocol.ezfirmata.FirmataProtocolVersionCmd
	 * @generated
	 */
	EClass getFirmataProtocolVersionCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.protocol.ezfirmata.FirmataSystemResetCmd <em>Firmata System Reset Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firmata System Reset Cmd</em>'.
	 * @see net.sf.smbt.protocol.ezfirmata.FirmataSystemResetCmd
	 * @generated
	 */
	EClass getFirmataSystemResetCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.protocol.ezfirmata.FirmataAnalogIOMsgCmd <em>Firmata Analog IO Msg Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firmata Analog IO Msg Cmd</em>'.
	 * @see net.sf.smbt.protocol.ezfirmata.FirmataAnalogIOMsgCmd
	 * @generated
	 */
	EClass getFirmataAnalogIOMsgCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.protocol.ezfirmata.FirmataDigitalIOMsgCmd <em>Firmata Digital IO Msg Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firmata Digital IO Msg Cmd</em>'.
	 * @see net.sf.smbt.protocol.ezfirmata.FirmataDigitalIOMsgCmd
	 * @generated
	 */
	EClass getFirmataDigitalIOMsgCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.protocol.ezfirmata.SysexStart <em>Sysex Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sysex Start</em>'.
	 * @see net.sf.smbt.protocol.ezfirmata.SysexStart
	 * @generated
	 */
	EClass getSysexStart();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.protocol.ezfirmata.SysexStop <em>Sysex Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sysex Stop</em>'.
	 * @see net.sf.smbt.protocol.ezfirmata.SysexStop
	 * @generated
	 */
	EClass getSysexStop();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.protocol.ezfirmata.FirmataSysexMessage <em>Firmata Sysex Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firmata Sysex Message</em>'.
	 * @see net.sf.smbt.protocol.ezfirmata.FirmataSysexMessage
	 * @generated
	 */
	EClass getFirmataSysexMessage();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.protocol.ezfirmata.FirmataCapabilitiesCmd <em>Firmata Capabilities Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firmata Capabilities Cmd</em>'.
	 * @see net.sf.smbt.protocol.ezfirmata.FirmataCapabilitiesCmd
	 * @generated
	 */
	EClass getFirmataCapabilitiesCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.protocol.ezfirmata.FirmataPinStateResponse <em>Firmata Pin State Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firmata Pin State Response</em>'.
	 * @see net.sf.smbt.protocol.ezfirmata.FirmataPinStateResponse
	 * @generated
	 */
	EClass getFirmataPinStateResponse();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.protocol.ezfirmata.FirmataPinStateResponse#getPin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin</em>'.
	 * @see net.sf.smbt.protocol.ezfirmata.FirmataPinStateResponse#getPin()
	 * @see #getFirmataPinStateResponse()
	 * @generated
	 */
	EAttribute getFirmataPinStateResponse_Pin();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.protocol.ezfirmata.FirmataPinStateResponse#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see net.sf.smbt.protocol.ezfirmata.FirmataPinStateResponse#getModel()
	 * @see #getFirmataPinStateResponse()
	 * @generated
	 */
	EAttribute getFirmataPinStateResponse_Model();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.protocol.ezfirmata.FirmataPinStateResponse#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.protocol.ezfirmata.FirmataPinStateResponse#getValue()
	 * @see #getFirmataPinStateResponse()
	 * @generated
	 */
	EAttribute getFirmataPinStateResponse_Value();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.protocol.ezfirmata.FIRMATA_I2C_RW_MODE <em>FIRMATA I2C RW MODE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>FIRMATA I2C RW MODE</em>'.
	 * @see net.sf.smbt.protocol.ezfirmata.FIRMATA_I2C_RW_MODE
	 * @generated
	 */
	EEnum getFIRMATA_I2C_RW_MODE();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.protocol.ezfirmata.FIRMATA_I2C_ADDR_MODE <em>FIRMATA I2C ADDR MODE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>FIRMATA I2C ADDR MODE</em>'.
	 * @see net.sf.smbt.protocol.ezfirmata.FIRMATA_I2C_ADDR_MODE
	 * @generated
	 */
	EEnum getFIRMATA_I2C_ADDR_MODE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EzfirmataFactory getEzfirmataFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.protocol.ezfirmata.impl.FirmataCmdImpl <em>Firmata Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.protocol.ezfirmata.impl.FirmataCmdImpl
		 * @see net.sf.smbt.protocol.ezfirmata.impl.EzfirmataPackageImpl#getFirmataCmd()
		 * @generated
		 */
		EClass FIRMATA_CMD = eINSTANCE.getFirmataCmd();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.protocol.ezfirmata.impl.FirmataReportDigitalPinCmdImpl <em>Firmata Report Digital Pin Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.protocol.ezfirmata.impl.FirmataReportDigitalPinCmdImpl
		 * @see net.sf.smbt.protocol.ezfirmata.impl.EzfirmataPackageImpl#getFirmataReportDigitalPinCmd()
		 * @generated
		 */
		EClass FIRMATA_REPORT_DIGITAL_PIN_CMD = eINSTANCE.getFirmataReportDigitalPinCmd();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.protocol.ezfirmata.impl.FirmataReportAnalogPinCmdImpl <em>Firmata Report Analog Pin Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.protocol.ezfirmata.impl.FirmataReportAnalogPinCmdImpl
		 * @see net.sf.smbt.protocol.ezfirmata.impl.EzfirmataPackageImpl#getFirmataReportAnalogPinCmd()
		 * @generated
		 */
		EClass FIRMATA_REPORT_ANALOG_PIN_CMD = eINSTANCE.getFirmataReportAnalogPinCmd();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.protocol.ezfirmata.impl.FirmataSetPinModeCmdImpl <em>Firmata Set Pin Mode Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.protocol.ezfirmata.impl.FirmataSetPinModeCmdImpl
		 * @see net.sf.smbt.protocol.ezfirmata.impl.EzfirmataPackageImpl#getFirmataSetPinModeCmd()
		 * @generated
		 */
		EClass FIRMATA_SET_PIN_MODE_CMD = eINSTANCE.getFirmataSetPinModeCmd();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.protocol.ezfirmata.impl.FirmataProtocolVersionCmdImpl <em>Firmata Protocol Version Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.protocol.ezfirmata.impl.FirmataProtocolVersionCmdImpl
		 * @see net.sf.smbt.protocol.ezfirmata.impl.EzfirmataPackageImpl#getFirmataProtocolVersionCmd()
		 * @generated
		 */
		EClass FIRMATA_PROTOCOL_VERSION_CMD = eINSTANCE.getFirmataProtocolVersionCmd();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.protocol.ezfirmata.impl.FirmataSystemResetCmdImpl <em>Firmata System Reset Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.protocol.ezfirmata.impl.FirmataSystemResetCmdImpl
		 * @see net.sf.smbt.protocol.ezfirmata.impl.EzfirmataPackageImpl#getFirmataSystemResetCmd()
		 * @generated
		 */
		EClass FIRMATA_SYSTEM_RESET_CMD = eINSTANCE.getFirmataSystemResetCmd();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.protocol.ezfirmata.impl.FirmataAnalogIOMsgCmdImpl <em>Firmata Analog IO Msg Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.protocol.ezfirmata.impl.FirmataAnalogIOMsgCmdImpl
		 * @see net.sf.smbt.protocol.ezfirmata.impl.EzfirmataPackageImpl#getFirmataAnalogIOMsgCmd()
		 * @generated
		 */
		EClass FIRMATA_ANALOG_IO_MSG_CMD = eINSTANCE.getFirmataAnalogIOMsgCmd();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.protocol.ezfirmata.impl.FirmataDigitalIOMsgCmdImpl <em>Firmata Digital IO Msg Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.protocol.ezfirmata.impl.FirmataDigitalIOMsgCmdImpl
		 * @see net.sf.smbt.protocol.ezfirmata.impl.EzfirmataPackageImpl#getFirmataDigitalIOMsgCmd()
		 * @generated
		 */
		EClass FIRMATA_DIGITAL_IO_MSG_CMD = eINSTANCE.getFirmataDigitalIOMsgCmd();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.protocol.ezfirmata.impl.SysexStartImpl <em>Sysex Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.protocol.ezfirmata.impl.SysexStartImpl
		 * @see net.sf.smbt.protocol.ezfirmata.impl.EzfirmataPackageImpl#getSysexStart()
		 * @generated
		 */
		EClass SYSEX_START = eINSTANCE.getSysexStart();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.protocol.ezfirmata.impl.SysexStopImpl <em>Sysex Stop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.protocol.ezfirmata.impl.SysexStopImpl
		 * @see net.sf.smbt.protocol.ezfirmata.impl.EzfirmataPackageImpl#getSysexStop()
		 * @generated
		 */
		EClass SYSEX_STOP = eINSTANCE.getSysexStop();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.protocol.ezfirmata.impl.FirmataSysexMessageImpl <em>Firmata Sysex Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.protocol.ezfirmata.impl.FirmataSysexMessageImpl
		 * @see net.sf.smbt.protocol.ezfirmata.impl.EzfirmataPackageImpl#getFirmataSysexMessage()
		 * @generated
		 */
		EClass FIRMATA_SYSEX_MESSAGE = eINSTANCE.getFirmataSysexMessage();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.protocol.ezfirmata.impl.FirmataCapabilitiesCmdImpl <em>Firmata Capabilities Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.protocol.ezfirmata.impl.FirmataCapabilitiesCmdImpl
		 * @see net.sf.smbt.protocol.ezfirmata.impl.EzfirmataPackageImpl#getFirmataCapabilitiesCmd()
		 * @generated
		 */
		EClass FIRMATA_CAPABILITIES_CMD = eINSTANCE.getFirmataCapabilitiesCmd();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.protocol.ezfirmata.impl.FirmataPinStateResponseImpl <em>Firmata Pin State Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.protocol.ezfirmata.impl.FirmataPinStateResponseImpl
		 * @see net.sf.smbt.protocol.ezfirmata.impl.EzfirmataPackageImpl#getFirmataPinStateResponse()
		 * @generated
		 */
		EClass FIRMATA_PIN_STATE_RESPONSE = eINSTANCE.getFirmataPinStateResponse();
		/**
		 * The meta object literal for the '<em><b>Pin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIRMATA_PIN_STATE_RESPONSE__PIN = eINSTANCE.getFirmataPinStateResponse_Pin();
		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIRMATA_PIN_STATE_RESPONSE__MODEL = eINSTANCE.getFirmataPinStateResponse_Model();
		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIRMATA_PIN_STATE_RESPONSE__VALUE = eINSTANCE.getFirmataPinStateResponse_Value();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.protocol.ezfirmata.FIRMATA_I2C_RW_MODE <em>FIRMATA I2C RW MODE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.protocol.ezfirmata.FIRMATA_I2C_RW_MODE
		 * @see net.sf.smbt.protocol.ezfirmata.impl.EzfirmataPackageImpl#getFIRMATA_I2C_RW_MODE()
		 * @generated
		 */
		EEnum FIRMATA_I2C_RW_MODE = eINSTANCE.getFIRMATA_I2C_RW_MODE();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.protocol.ezfirmata.FIRMATA_I2C_ADDR_MODE <em>FIRMATA I2C ADDR MODE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.protocol.ezfirmata.FIRMATA_I2C_ADDR_MODE
		 * @see net.sf.smbt.protocol.ezfirmata.impl.EzfirmataPackageImpl#getFIRMATA_I2C_ADDR_MODE()
		 * @generated
		 */
		EEnum FIRMATA_I2C_ADDR_MODE = eINSTANCE.getFIRMATA_I2C_ADDR_MODE();

	}

} //EzfirmataPackage
