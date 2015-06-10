/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.protocol.ezfirmata;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.protocol.ezfirmata.EzfirmataPackage
 * @generated
 */
public interface EzfirmataFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzfirmataFactory eINSTANCE = net.sf.smbt.protocol.ezfirmata.impl.EzfirmataFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Firmata Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Firmata Cmd</em>'.
	 * @generated
	 */
	FirmataCmd createFirmataCmd();

	/**
	 * Returns a new object of class '<em>Firmata Report Digital Pin Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Firmata Report Digital Pin Cmd</em>'.
	 * @generated
	 */
	FirmataReportDigitalPinCmd createFirmataReportDigitalPinCmd();

	/**
	 * Returns a new object of class '<em>Firmata Report Analog Pin Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Firmata Report Analog Pin Cmd</em>'.
	 * @generated
	 */
	FirmataReportAnalogPinCmd createFirmataReportAnalogPinCmd();

	/**
	 * Returns a new object of class '<em>Firmata Set Pin Mode Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Firmata Set Pin Mode Cmd</em>'.
	 * @generated
	 */
	FirmataSetPinModeCmd createFirmataSetPinModeCmd();

	/**
	 * Returns a new object of class '<em>Firmata Protocol Version Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Firmata Protocol Version Cmd</em>'.
	 * @generated
	 */
	FirmataProtocolVersionCmd createFirmataProtocolVersionCmd();

	/**
	 * Returns a new object of class '<em>Firmata System Reset Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Firmata System Reset Cmd</em>'.
	 * @generated
	 */
	FirmataSystemResetCmd createFirmataSystemResetCmd();

	/**
	 * Returns a new object of class '<em>Firmata Analog IO Msg Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Firmata Analog IO Msg Cmd</em>'.
	 * @generated
	 */
	FirmataAnalogIOMsgCmd createFirmataAnalogIOMsgCmd();

	/**
	 * Returns a new object of class '<em>Firmata Digital IO Msg Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Firmata Digital IO Msg Cmd</em>'.
	 * @generated
	 */
	FirmataDigitalIOMsgCmd createFirmataDigitalIOMsgCmd();

	/**
	 * Returns a new object of class '<em>Sysex Start</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sysex Start</em>'.
	 * @generated
	 */
	SysexStart createSysexStart();

	/**
	 * Returns a new object of class '<em>Sysex Stop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sysex Stop</em>'.
	 * @generated
	 */
	SysexStop createSysexStop();

	/**
	 * Returns a new object of class '<em>Firmata Sysex Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Firmata Sysex Message</em>'.
	 * @generated
	 */
	FirmataSysexMessage createFirmataSysexMessage();

	/**
	 * Returns a new object of class '<em>Firmata Capabilities Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Firmata Capabilities Cmd</em>'.
	 * @generated
	 */
	FirmataCapabilitiesCmd createFirmataCapabilitiesCmd();

	/**
	 * Returns a new object of class '<em>Firmata Pin State Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Firmata Pin State Response</em>'.
	 * @generated
	 */
	FirmataPinStateResponse createFirmataPinStateResponse();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EzfirmataPackage getEzfirmataPackage();

} //EzfirmataFactory
