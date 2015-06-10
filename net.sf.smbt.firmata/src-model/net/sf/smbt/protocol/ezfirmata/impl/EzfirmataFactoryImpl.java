/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.protocol.ezfirmata.impl;

import net.sf.smbt.protocol.ezfirmata.*;
import net.sf.smbt.protocol.ezfirmata.EzfirmataFactory;
import net.sf.smbt.protocol.ezfirmata.EzfirmataPackage;
import net.sf.smbt.protocol.ezfirmata.FIRMATA_I2C_ADDR_MODE;
import net.sf.smbt.protocol.ezfirmata.FIRMATA_I2C_RW_MODE;
import net.sf.smbt.protocol.ezfirmata.FirmataAnalogIOMsgCmd;
import net.sf.smbt.protocol.ezfirmata.FirmataCmd;
import net.sf.smbt.protocol.ezfirmata.FirmataDigitalIOMsgCmd;
import net.sf.smbt.protocol.ezfirmata.FirmataProtocolVersionCmd;
import net.sf.smbt.protocol.ezfirmata.FirmataReportAnalogPinCmd;
import net.sf.smbt.protocol.ezfirmata.FirmataReportDigitalPinCmd;
import net.sf.smbt.protocol.ezfirmata.FirmataSetPinModeCmd;
import net.sf.smbt.protocol.ezfirmata.FirmataSysexMessage;
import net.sf.smbt.protocol.ezfirmata.FirmataSystemResetCmd;
import net.sf.smbt.protocol.ezfirmata.SysexStart;
import net.sf.smbt.protocol.ezfirmata.SysexStop;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzfirmataFactoryImpl extends EFactoryImpl implements EzfirmataFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EzfirmataFactory init() {
		try {
			EzfirmataFactory theEzfirmataFactory = (EzfirmataFactory)EPackage.Registry.INSTANCE.getEFactory(EzfirmataPackage.eNS_URI);
			if (theEzfirmataFactory != null) {
				return theEzfirmataFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EzfirmataFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzfirmataFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EzfirmataPackage.FIRMATA_CMD: return createFirmataCmd();
			case EzfirmataPackage.FIRMATA_REPORT_DIGITAL_PIN_CMD: return createFirmataReportDigitalPinCmd();
			case EzfirmataPackage.FIRMATA_REPORT_ANALOG_PIN_CMD: return createFirmataReportAnalogPinCmd();
			case EzfirmataPackage.FIRMATA_SET_PIN_MODE_CMD: return createFirmataSetPinModeCmd();
			case EzfirmataPackage.FIRMATA_PROTOCOL_VERSION_CMD: return createFirmataProtocolVersionCmd();
			case EzfirmataPackage.FIRMATA_SYSTEM_RESET_CMD: return createFirmataSystemResetCmd();
			case EzfirmataPackage.FIRMATA_ANALOG_IO_MSG_CMD: return createFirmataAnalogIOMsgCmd();
			case EzfirmataPackage.FIRMATA_DIGITAL_IO_MSG_CMD: return createFirmataDigitalIOMsgCmd();
			case EzfirmataPackage.SYSEX_START: return createSysexStart();
			case EzfirmataPackage.SYSEX_STOP: return createSysexStop();
			case EzfirmataPackage.FIRMATA_SYSEX_MESSAGE: return createFirmataSysexMessage();
			case EzfirmataPackage.FIRMATA_CAPABILITIES_CMD: return createFirmataCapabilitiesCmd();
			case EzfirmataPackage.FIRMATA_PIN_STATE_RESPONSE: return createFirmataPinStateResponse();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EzfirmataPackage.FIRMATA_I2C_RW_MODE:
				return createFIRMATA_I2C_RW_MODEFromString(eDataType, initialValue);
			case EzfirmataPackage.FIRMATA_I2C_ADDR_MODE:
				return createFIRMATA_I2C_ADDR_MODEFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EzfirmataPackage.FIRMATA_I2C_RW_MODE:
				return convertFIRMATA_I2C_RW_MODEToString(eDataType, instanceValue);
			case EzfirmataPackage.FIRMATA_I2C_ADDR_MODE:
				return convertFIRMATA_I2C_ADDR_MODEToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirmataCmd createFirmataCmd() {
		FirmataCmdImpl firmataCmd = new FirmataCmdImpl();
		return firmataCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirmataReportDigitalPinCmd createFirmataReportDigitalPinCmd() {
		FirmataReportDigitalPinCmdImpl firmataReportDigitalPinCmd = new FirmataReportDigitalPinCmdImpl();
		return firmataReportDigitalPinCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirmataReportAnalogPinCmd createFirmataReportAnalogPinCmd() {
		FirmataReportAnalogPinCmdImpl firmataReportAnalogPinCmd = new FirmataReportAnalogPinCmdImpl();
		return firmataReportAnalogPinCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirmataSetPinModeCmd createFirmataSetPinModeCmd() {
		FirmataSetPinModeCmdImpl firmataSetPinModeCmd = new FirmataSetPinModeCmdImpl();
		return firmataSetPinModeCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirmataProtocolVersionCmd createFirmataProtocolVersionCmd() {
		FirmataProtocolVersionCmdImpl firmataProtocolVersionCmd = new FirmataProtocolVersionCmdImpl();
		return firmataProtocolVersionCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirmataSystemResetCmd createFirmataSystemResetCmd() {
		FirmataSystemResetCmdImpl firmataSystemResetCmd = new FirmataSystemResetCmdImpl();
		return firmataSystemResetCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirmataAnalogIOMsgCmd createFirmataAnalogIOMsgCmd() {
		FirmataAnalogIOMsgCmdImpl firmataAnalogIOMsgCmd = new FirmataAnalogIOMsgCmdImpl();
		return firmataAnalogIOMsgCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirmataDigitalIOMsgCmd createFirmataDigitalIOMsgCmd() {
		FirmataDigitalIOMsgCmdImpl firmataDigitalIOMsgCmd = new FirmataDigitalIOMsgCmdImpl();
		return firmataDigitalIOMsgCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysexStart createSysexStart() {
		SysexStartImpl sysexStart = new SysexStartImpl();
		return sysexStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysexStop createSysexStop() {
		SysexStopImpl sysexStop = new SysexStopImpl();
		return sysexStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirmataSysexMessage createFirmataSysexMessage() {
		FirmataSysexMessageImpl firmataSysexMessage = new FirmataSysexMessageImpl();
		return firmataSysexMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirmataCapabilitiesCmd createFirmataCapabilitiesCmd() {
		FirmataCapabilitiesCmdImpl firmataCapabilitiesCmd = new FirmataCapabilitiesCmdImpl();
		return firmataCapabilitiesCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirmataPinStateResponse createFirmataPinStateResponse() {
		FirmataPinStateResponseImpl firmataPinStateResponse = new FirmataPinStateResponseImpl();
		return firmataPinStateResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FIRMATA_I2C_RW_MODE createFIRMATA_I2C_RW_MODEFromString(EDataType eDataType, String initialValue) {
		FIRMATA_I2C_RW_MODE result = FIRMATA_I2C_RW_MODE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFIRMATA_I2C_RW_MODEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FIRMATA_I2C_ADDR_MODE createFIRMATA_I2C_ADDR_MODEFromString(EDataType eDataType, String initialValue) {
		FIRMATA_I2C_ADDR_MODE result = FIRMATA_I2C_ADDR_MODE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFIRMATA_I2C_ADDR_MODEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzfirmataPackage getEzfirmataPackage() {
		return (EzfirmataPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EzfirmataPackage getPackage() {
		return EzfirmataPackage.eINSTANCE;
	}

} //EzfirmataFactoryImpl
