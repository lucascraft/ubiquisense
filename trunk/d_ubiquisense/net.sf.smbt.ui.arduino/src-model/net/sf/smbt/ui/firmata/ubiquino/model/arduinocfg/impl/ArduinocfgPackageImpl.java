/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.impl;

import gnu.io.CommPortIdentifier;
import net.sf.smbt.mdl.arduino.ArduinoPackage;
import net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinoConfig;
import net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinocfgFactory;
import net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinocfgPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArduinocfgPackageImpl extends EPackageImpl implements ArduinocfgPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arduinoConfigEClass = null;

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
	 * @see net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinocfgPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArduinocfgPackageImpl() {
		super(eNS_URI, ArduinocfgFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ArduinocfgPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArduinocfgPackage init() {
		if (isInited) return (ArduinocfgPackage)EPackage.Registry.INSTANCE.getEPackage(ArduinocfgPackage.eNS_URI);

		// Obtain or create and register package
		ArduinocfgPackageImpl theArduinocfgPackage = (ArduinocfgPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArduinocfgPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArduinocfgPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ArduinoPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theArduinocfgPackage.createPackageContents();

		// Initialize created meta-data
		theArduinocfgPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArduinocfgPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArduinocfgPackage.eNS_URI, theArduinocfgPackage);
		return theArduinocfgPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArduinoConfig() {
		return arduinoConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoConfig_ArduinoComm() {
		return (EAttribute)arduinoConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoConfig_BoardKind() {
		return (EAttribute)arduinoConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoConfig_UsbComm() {
		return (EAttribute)arduinoConfigEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArduinoConfig_UsbSpeed() {
		return (EAttribute)arduinoConfigEClass.getEStructuralFeatures().get(3);
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
	public ArduinocfgFactory getArduinocfgFactory() {
		return (ArduinocfgFactory)getEFactoryInstance();
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
		arduinoConfigEClass = createEClass(ARDUINO_CONFIG);
		createEAttribute(arduinoConfigEClass, ARDUINO_CONFIG__ARDUINO_COMM);
		createEAttribute(arduinoConfigEClass, ARDUINO_CONFIG__BOARD_KIND);
		createEAttribute(arduinoConfigEClass, ARDUINO_CONFIG__USB_COMM);
		createEAttribute(arduinoConfigEClass, ARDUINO_CONFIG__USB_SPEED);

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

		// Obtain other dependent packages
		ArduinoPackage theArduinoPackage = (ArduinoPackage)EPackage.Registry.INSTANCE.getEPackage(ArduinoPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(arduinoConfigEClass, ArduinoConfig.class, "ArduinoConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArduinoConfig_ArduinoComm(), theArduinoPackage.getARDUINO_COMM(), "arduinoComm", null, 0, 1, ArduinoConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoConfig_BoardKind(), theArduinoPackage.getARDUINO_BOARD_UID(), "boardKind", null, 0, 1, ArduinoConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoConfig_UsbComm(), this.getCommPortIdentifier(), "usbComm", null, 0, 1, ArduinoConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArduinoConfig_UsbSpeed(), ecorePackage.getEInt(), "usbSpeed", null, 0, 1, ArduinoConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(commPortIdentifierEDataType, CommPortIdentifier.class, "CommPortIdentifier", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ArduinocfgPackageImpl
