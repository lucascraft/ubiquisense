/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.protocol.ezfirmata.impl;

import net.sf.smbt.midi.ezmidi.EzmidiPackage;
import net.sf.smbt.protocol.ezfirmata.EzfirmataFactory;
import net.sf.smbt.protocol.ezfirmata.EzfirmataPackage;
import net.sf.smbt.protocol.ezfirmata.FirmataAnalogIOMsgCmd;
import net.sf.smbt.protocol.ezfirmata.FirmataCapabilitiesCmd;
import net.sf.smbt.protocol.ezfirmata.FirmataCmd;
import net.sf.smbt.protocol.ezfirmata.FirmataDigitalIOMsgCmd;
import net.sf.smbt.protocol.ezfirmata.FirmataPinStateResponse;
import net.sf.smbt.protocol.ezfirmata.FirmataProtocolVersionCmd;
import net.sf.smbt.protocol.ezfirmata.FirmataReportAnalogPinCmd;
import net.sf.smbt.protocol.ezfirmata.FirmataReportDigitalPinCmd;
import net.sf.smbt.protocol.ezfirmata.FirmataSetPinModeCmd;
import net.sf.smbt.protocol.ezfirmata.FirmataSysexMessage;
import net.sf.smbt.protocol.ezfirmata.FirmataSystemResetCmd;
import net.sf.smbt.protocol.ezfirmata.SysexStart;
import net.sf.smbt.protocol.ezfirmata.SysexStop;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzfirmataPackageImpl extends EPackageImpl implements EzfirmataPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firmataCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firmataReportDigitalPinCmdEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firmataReportAnalogPinCmdEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firmataSetPinModeCmdEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firmataProtocolVersionCmdEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firmataSystemResetCmdEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firmataAnalogIOMsgCmdEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firmataDigitalIOMsgCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sysexStartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sysexStopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firmataSysexMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firmataCapabilitiesCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firmataPinStateResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum firmatA_I2C_RW_MODEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum firmatA_I2C_ADDR_MODEEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.sf.smbt.protocol.ezfirmata.EzfirmataPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EzfirmataPackageImpl() {
		super(eNS_URI, EzfirmataFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EzfirmataPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EzfirmataPackage init() {
		if (isInited) return (EzfirmataPackage)EPackage.Registry.INSTANCE.getEPackage(EzfirmataPackage.eNS_URI);

		// Obtain or create and register package
		EzfirmataPackageImpl theEzfirmataPackage = (EzfirmataPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EzfirmataPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EzfirmataPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EzmidiPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEzfirmataPackage.createPackageContents();

		// Initialize created meta-data
		theEzfirmataPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEzfirmataPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EzfirmataPackage.eNS_URI, theEzfirmataPackage);
		return theEzfirmataPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirmataCmd() {
		return firmataCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirmataReportDigitalPinCmd() {
		return firmataReportDigitalPinCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirmataReportAnalogPinCmd() {
		return firmataReportAnalogPinCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirmataSetPinModeCmd() {
		return firmataSetPinModeCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirmataProtocolVersionCmd() {
		return firmataProtocolVersionCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirmataSystemResetCmd() {
		return firmataSystemResetCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirmataAnalogIOMsgCmd() {
		return firmataAnalogIOMsgCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirmataDigitalIOMsgCmd() {
		return firmataDigitalIOMsgCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSysexStart() {
		return sysexStartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSysexStop() {
		return sysexStopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirmataSysexMessage() {
		return firmataSysexMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirmataCapabilitiesCmd() {
		return firmataCapabilitiesCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirmataPinStateResponse() {
		return firmataPinStateResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirmataPinStateResponse_Pin() {
		return (EAttribute)firmataPinStateResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirmataPinStateResponse_Model() {
		return (EAttribute)firmataPinStateResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirmataPinStateResponse_Value() {
		return (EAttribute)firmataPinStateResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFIRMATA_I2C_RW_MODE() {
		return firmatA_I2C_RW_MODEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFIRMATA_I2C_ADDR_MODE() {
		return firmatA_I2C_ADDR_MODEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzfirmataFactory getEzfirmataFactory() {
		return (EzfirmataFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		firmataCmdEClass = createEClass(FIRMATA_CMD);

		firmataReportDigitalPinCmdEClass = createEClass(FIRMATA_REPORT_DIGITAL_PIN_CMD);

		firmataReportAnalogPinCmdEClass = createEClass(FIRMATA_REPORT_ANALOG_PIN_CMD);

		firmataSetPinModeCmdEClass = createEClass(FIRMATA_SET_PIN_MODE_CMD);

		firmataProtocolVersionCmdEClass = createEClass(FIRMATA_PROTOCOL_VERSION_CMD);

		firmataSystemResetCmdEClass = createEClass(FIRMATA_SYSTEM_RESET_CMD);

		firmataAnalogIOMsgCmdEClass = createEClass(FIRMATA_ANALOG_IO_MSG_CMD);

		firmataDigitalIOMsgCmdEClass = createEClass(FIRMATA_DIGITAL_IO_MSG_CMD);

		sysexStartEClass = createEClass(SYSEX_START);

		sysexStopEClass = createEClass(SYSEX_STOP);

		firmataSysexMessageEClass = createEClass(FIRMATA_SYSEX_MESSAGE);

		firmataCapabilitiesCmdEClass = createEClass(FIRMATA_CAPABILITIES_CMD);

		firmataPinStateResponseEClass = createEClass(FIRMATA_PIN_STATE_RESPONSE);
		createEAttribute(firmataPinStateResponseEClass, FIRMATA_PIN_STATE_RESPONSE__PIN);
		createEAttribute(firmataPinStateResponseEClass, FIRMATA_PIN_STATE_RESPONSE__MODEL);
		createEAttribute(firmataPinStateResponseEClass, FIRMATA_PIN_STATE_RESPONSE__VALUE);

		// Create enums
		firmatA_I2C_RW_MODEEEnum = createEEnum(FIRMATA_I2C_RW_MODE);
		firmatA_I2C_ADDR_MODEEEnum = createEEnum(FIRMATA_I2C_ADDR_MODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EzmidiPackage theEzmidiPackage = (EzmidiPackage)EPackage.Registry.INSTANCE.getEPackage(EzmidiPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		firmataCmdEClass.getESuperTypes().add(theEzmidiPackage.getDSLMidiMessage());
		firmataReportDigitalPinCmdEClass.getESuperTypes().add(this.getFirmataCmd());
		firmataReportAnalogPinCmdEClass.getESuperTypes().add(theEzmidiPackage.getAbstractMidiCmd());
		firmataSetPinModeCmdEClass.getESuperTypes().add(this.getFirmataCmd());
		firmataProtocolVersionCmdEClass.getESuperTypes().add(this.getFirmataCmd());
		firmataSystemResetCmdEClass.getESuperTypes().add(this.getFirmataCmd());
		firmataAnalogIOMsgCmdEClass.getESuperTypes().add(this.getFirmataCmd());
		firmataDigitalIOMsgCmdEClass.getESuperTypes().add(this.getFirmataCmd());
		sysexStartEClass.getESuperTypes().add(theEzmidiPackage.getSysexMessage());
		sysexStopEClass.getESuperTypes().add(theEzmidiPackage.getSysexMessage());
		firmataSysexMessageEClass.getESuperTypes().add(theEzmidiPackage.getSysexMessage());
		firmataCapabilitiesCmdEClass.getESuperTypes().add(this.getFirmataCmd());
		firmataPinStateResponseEClass.getESuperTypes().add(this.getFirmataCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(firmataCmdEClass, FirmataCmd.class, "FirmataCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(firmataReportDigitalPinCmdEClass, FirmataReportDigitalPinCmd.class, "FirmataReportDigitalPinCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(firmataReportAnalogPinCmdEClass, FirmataReportAnalogPinCmd.class, "FirmataReportAnalogPinCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(firmataSetPinModeCmdEClass, FirmataSetPinModeCmd.class, "FirmataSetPinModeCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(firmataProtocolVersionCmdEClass, FirmataProtocolVersionCmd.class, "FirmataProtocolVersionCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(firmataSystemResetCmdEClass, FirmataSystemResetCmd.class, "FirmataSystemResetCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(firmataAnalogIOMsgCmdEClass, FirmataAnalogIOMsgCmd.class, "FirmataAnalogIOMsgCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(firmataDigitalIOMsgCmdEClass, FirmataDigitalIOMsgCmd.class, "FirmataDigitalIOMsgCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sysexStartEClass, SysexStart.class, "SysexStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sysexStopEClass, SysexStop.class, "SysexStop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(firmataSysexMessageEClass, FirmataSysexMessage.class, "FirmataSysexMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(firmataCapabilitiesCmdEClass, FirmataCapabilitiesCmd.class, "FirmataCapabilitiesCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(firmataPinStateResponseEClass, FirmataPinStateResponse.class, "FirmataPinStateResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFirmataPinStateResponse_Pin(), ecorePackage.getEInt(), "pin", null, 0, 1, FirmataPinStateResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFirmataPinStateResponse_Model(), ecorePackage.getEInt(), "model", null, 0, 1, FirmataPinStateResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFirmataPinStateResponse_Value(), ecorePackage.getEFloat(), "value", null, 0, 1, FirmataPinStateResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(firmatA_I2C_RW_MODEEEnum, net.sf.smbt.protocol.ezfirmata.FIRMATA_I2C_RW_MODE.class, "FIRMATA_I2C_RW_MODE");
		addEEnumLiteral(firmatA_I2C_RW_MODEEEnum, net.sf.smbt.protocol.ezfirmata.FIRMATA_I2C_RW_MODE.WRITE);
		addEEnumLiteral(firmatA_I2C_RW_MODEEEnum, net.sf.smbt.protocol.ezfirmata.FIRMATA_I2C_RW_MODE.READ_ONCE);
		addEEnumLiteral(firmatA_I2C_RW_MODEEEnum, net.sf.smbt.protocol.ezfirmata.FIRMATA_I2C_RW_MODE.READ_CONTINUOUSLY);
		addEEnumLiteral(firmatA_I2C_RW_MODEEEnum, net.sf.smbt.protocol.ezfirmata.FIRMATA_I2C_RW_MODE.STOP_READING);

		initEEnum(firmatA_I2C_ADDR_MODEEEnum, net.sf.smbt.protocol.ezfirmata.FIRMATA_I2C_ADDR_MODE.class, "FIRMATA_I2C_ADDR_MODE");
		addEEnumLiteral(firmatA_I2C_ADDR_MODEEEnum, net.sf.smbt.protocol.ezfirmata.FIRMATA_I2C_ADDR_MODE.I2C_ADDR_MODE_7BITS);
		addEEnumLiteral(firmatA_I2C_ADDR_MODEEEnum, net.sf.smbt.protocol.ezfirmata.FIRMATA_I2C_ADDR_MODE.I2C_ADDR_MODE_10_BITS);

		// Create resource
		createResource(eNS_URI);
	}

} //EzfirmataPackageImpl
