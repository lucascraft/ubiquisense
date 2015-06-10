/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.firmata.ubiquino.impl;

import net.sf.smbt.firmata.ubiquino.PortConfig;
import net.sf.smbt.firmata.ubiquino.PortConfigKind;
import net.sf.smbt.firmata.ubiquino.Ubiquino;
import net.sf.smbt.firmata.ubiquino.UbiquinoConfig;
import net.sf.smbt.firmata.ubiquino.UbiquinoFactory;
import net.sf.smbt.firmata.ubiquino.UbiquinoPackage;
import net.sf.smbt.mdl.arduino.ArduinoPackage;
import net.sf.smbt.xcp.XcpPackage;
import net.sf.xqz.model.cmd.CmdPackage;
import net.sf.xqz.model.engine.EnginePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UbiquinoPackageImpl extends EPackageImpl implements UbiquinoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ubiquinoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ubiquinoConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum portConfigKindEEnum = null;

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
	 * @see net.sf.smbt.firmata.ubiquino.UbiquinoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UbiquinoPackageImpl() {
		super(eNS_URI, UbiquinoFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UbiquinoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UbiquinoPackage init() {
		if (isInited) return (UbiquinoPackage)EPackage.Registry.INSTANCE.getEPackage(UbiquinoPackage.eNS_URI);

		// Obtain or create and register package
		UbiquinoPackageImpl theUbiquinoPackage = (UbiquinoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UbiquinoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UbiquinoPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ArduinoPackage.eINSTANCE.eClass();
		XcpPackage.eINSTANCE.eClass();
		EnginePackage.eINSTANCE.eClass();
		CmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theUbiquinoPackage.createPackageContents();

		// Initialize created meta-data
		theUbiquinoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUbiquinoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UbiquinoPackage.eNS_URI, theUbiquinoPackage);
		return theUbiquinoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUbiquino() {
		return ubiquinoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUbiquino_Board() {
		return (EReference)ubiquinoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUbiquino_Config() {
		return (EReference)ubiquinoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUbiquino_LastAddress() {
		return (EReference)ubiquinoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUbiquinoConfig() {
		return ubiquinoConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUbiquinoConfig_Ports() {
		return (EReference)ubiquinoConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortConfig() {
		return portConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortConfig_Target() {
		return (EReference)portConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortConfig_Kind() {
		return (EAttribute)portConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortConfig_Enabled() {
		return (EAttribute)portConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortConfig_Mode() {
		return (EAttribute)portConfigEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortConfig_Pwm() {
		return (EAttribute)portConfigEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortConfig_Channel() {
		return (EAttribute)portConfigEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPortConfigKind() {
		return portConfigKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbiquinoFactory getUbiquinoFactory() {
		return (UbiquinoFactory)getEFactoryInstance();
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
		ubiquinoEClass = createEClass(UBIQUINO);
		createEReference(ubiquinoEClass, UBIQUINO__BOARD);
		createEReference(ubiquinoEClass, UBIQUINO__CONFIG);
		createEReference(ubiquinoEClass, UBIQUINO__LAST_ADDRESS);

		ubiquinoConfigEClass = createEClass(UBIQUINO_CONFIG);
		createEReference(ubiquinoConfigEClass, UBIQUINO_CONFIG__PORTS);

		portConfigEClass = createEClass(PORT_CONFIG);
		createEReference(portConfigEClass, PORT_CONFIG__TARGET);
		createEAttribute(portConfigEClass, PORT_CONFIG__KIND);
		createEAttribute(portConfigEClass, PORT_CONFIG__ENABLED);
		createEAttribute(portConfigEClass, PORT_CONFIG__MODE);
		createEAttribute(portConfigEClass, PORT_CONFIG__PWM);
		createEAttribute(portConfigEClass, PORT_CONFIG__CHANNEL);

		// Create enums
		portConfigKindEEnum = createEEnum(PORT_CONFIG_KIND);
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
		EnginePackage theEnginePackage = (EnginePackage)EPackage.Registry.INSTANCE.getEPackage(EnginePackage.eNS_URI);
		ArduinoPackage theArduinoPackage = (ArduinoPackage)EPackage.Registry.INSTANCE.getEPackage(ArduinoPackage.eNS_URI);
		XcpPackage theXcpPackage = (XcpPackage)EPackage.Registry.INSTANCE.getEPackage(XcpPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ubiquinoEClass.getESuperTypes().add(theEnginePackage.getIConnectedUnit());

		// Initialize classes and features; add operations and parameters
		initEClass(ubiquinoEClass, Ubiquino.class, "Ubiquino", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUbiquino_Board(), theArduinoPackage.getArduino(), null, "board", null, 0, 1, Ubiquino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUbiquino_Config(), this.getUbiquinoConfig(), null, "config", null, 0, 1, Ubiquino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUbiquino_LastAddress(), theXcpPackage.getXCPAddress(), null, "lastAddress", null, 0, 1, Ubiquino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ubiquinoConfigEClass, UbiquinoConfig.class, "UbiquinoConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUbiquinoConfig_Ports(), this.getPortConfig(), null, "ports", null, 0, -1, UbiquinoConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portConfigEClass, PortConfig.class, "PortConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortConfig_Target(), theArduinoPackage.getPort(), null, "target", null, 0, 1, PortConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortConfig_Kind(), this.getPortConfigKind(), "kind", null, 0, 1, PortConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortConfig_Enabled(), ecorePackage.getEBoolean(), "enabled", null, 0, 1, PortConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortConfig_Mode(), theArduinoPackage.getPIN_MODE(), "mode", null, 0, 1, PortConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortConfig_Pwm(), theArduinoPackage.getPWM_MODE(), "pwm", null, 0, 1, PortConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPortConfig_Channel(), theEcorePackage.getEInt(), "channel", null, 0, 1, PortConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(portConfigKindEEnum, PortConfigKind.class, "PortConfigKind");
		addEEnumLiteral(portConfigKindEEnum, PortConfigKind.ANALOGIC);
		addEEnumLiteral(portConfigKindEEnum, PortConfigKind.PWM);
		addEEnumLiteral(portConfigKindEEnum, PortConfigKind.INPUT);
		addEEnumLiteral(portConfigKindEEnum, PortConfigKind.OUTPUT);
		addEEnumLiteral(portConfigKindEEnum, PortConfigKind.HIGH);
		addEEnumLiteral(portConfigKindEEnum, PortConfigKind.LOW);
		addEEnumLiteral(portConfigKindEEnum, PortConfigKind.SERVO);
		addEEnumLiteral(portConfigKindEEnum, PortConfigKind.DIGITAL);
		addEEnumLiteral(portConfigKindEEnum, PortConfigKind.UNKNOWN);

		// Create resource
		createResource(eNS_URI);
	}

} //UbiquinoPackageImpl
