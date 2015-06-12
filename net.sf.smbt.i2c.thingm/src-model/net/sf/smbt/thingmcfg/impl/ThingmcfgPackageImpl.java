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
import net.sf.smbt.thingmcfg.ThingmcfgFactory;
import net.sf.smbt.thingmcfg.ThingmcfgPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThingmcfgPackageImpl extends EPackageImpl implements ThingmcfgPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thingMCfgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum thingMDeviceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType commPortIdentifierEDataType = null;

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
	 * @see net.sf.smbt.thingmcfg.ThingmcfgPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ThingmcfgPackageImpl() {
		super(eNS_URI, ThingmcfgFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ThingmcfgPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ThingmcfgPackage init() {
		if (isInited) return (ThingmcfgPackage)EPackage.Registry.INSTANCE.getEPackage(ThingmcfgPackage.eNS_URI);

		// Obtain or create and register package
		ThingmcfgPackageImpl theThingmcfgPackage = (ThingmcfgPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ThingmcfgPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ThingmcfgPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theThingmcfgPackage.createPackageContents();

		// Initialize created meta-data
		theThingmcfgPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theThingmcfgPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ThingmcfgPackage.eNS_URI, theThingmcfgPackage);
		return theThingmcfgPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThingMCfg() {
		return thingMCfgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThingMCfg_PortAddr() {
		return (EAttribute)thingMCfgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThingMCfg_Speed() {
		return (EAttribute)thingMCfgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThingMCfg_Device() {
		return (EAttribute)thingMCfgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getThingMDevice() {
		return thingMDeviceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCommPortIdentifier() {
		return commPortIdentifierEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThingmcfgFactory getThingmcfgFactory() {
		return (ThingmcfgFactory)getEFactoryInstance();
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
		thingMCfgEClass = createEClass(THING_MCFG);
		createEAttribute(thingMCfgEClass, THING_MCFG__PORT_ADDR);
		createEAttribute(thingMCfgEClass, THING_MCFG__SPEED);
		createEAttribute(thingMCfgEClass, THING_MCFG__DEVICE);

		// Create enums
		thingMDeviceEEnum = createEEnum(THING_MDEVICE);

		// Create data types
		commPortIdentifierEDataType = createEDataType(COMM_PORT_IDENTIFIER);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(thingMCfgEClass, ThingMCfg.class, "ThingMCfg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThingMCfg_PortAddr(), this.getCommPortIdentifier(), "portAddr", null, 0, 1, ThingMCfg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThingMCfg_Speed(), ecorePackage.getEInt(), "speed", null, 0, 1, ThingMCfg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThingMCfg_Device(), this.getThingMDevice(), "device", null, 0, 1, ThingMCfg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(thingMDeviceEEnum, ThingMDevice.class, "ThingMDevice");
		addEEnumLiteral(thingMDeviceEEnum, ThingMDevice.BLINK_M);
		addEEnumLiteral(thingMDeviceEEnum, ThingMDevice.MAX_M);
		addEEnumLiteral(thingMDeviceEEnum, ThingMDevice.MINI_M);
		addEEnumLiteral(thingMDeviceEEnum, ThingMDevice.CONTROL_M);
		addEEnumLiteral(thingMDeviceEEnum, ThingMDevice.REMOTE_M);

		// Initialize data types
		initEDataType(commPortIdentifierEDataType, CommPortIdentifier.class, "CommPortIdentifier", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ThingmcfgPackageImpl
