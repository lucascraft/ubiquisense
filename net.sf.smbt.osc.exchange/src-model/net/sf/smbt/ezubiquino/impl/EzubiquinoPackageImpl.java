/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezubiquino.impl;

import net.sf.smbt.ezubiquino.EzubiquinoFactory;
import net.sf.smbt.ezubiquino.EzubiquinoPackage;
import net.sf.smbt.ezubiquino.OscFirmataCmd;
import net.sf.smbt.ezubiquino.OscUbiquinoCmd;
import net.sf.smbt.ezubiquino.UbiquinoKind;
import net.sf.smbt.osccmd.OsccmdPackage;

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
public class EzubiquinoPackageImpl extends EPackageImpl implements EzubiquinoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oscUbiquinoCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oscFirmataCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ubiquinoKindEEnum = null;

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
	 * @see net.sf.smbt.ezubiquino.EzubiquinoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EzubiquinoPackageImpl() {
		super(eNS_URI, EzubiquinoFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EzubiquinoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EzubiquinoPackage init() {
		if (isInited) return (EzubiquinoPackage)EPackage.Registry.INSTANCE.getEPackage(EzubiquinoPackage.eNS_URI);

		// Obtain or create and register package
		EzubiquinoPackageImpl theEzubiquinoPackage = (EzubiquinoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EzubiquinoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EzubiquinoPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OsccmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEzubiquinoPackage.createPackageContents();

		// Initialize created meta-data
		theEzubiquinoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEzubiquinoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EzubiquinoPackage.eNS_URI, theEzubiquinoPackage);
		return theEzubiquinoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOscUbiquinoCmd() {
		return oscUbiquinoCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOscUbiquinoCmd_Kind() {
		return (EAttribute)oscUbiquinoCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOscFirmataCmd() {
		return oscFirmataCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOscFirmataCmd_Kind() {
		return (EAttribute)oscFirmataCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUbiquinoKind() {
		return ubiquinoKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzubiquinoFactory getEzubiquinoFactory() {
		return (EzubiquinoFactory)getEFactoryInstance();
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
		oscUbiquinoCmdEClass = createEClass(OSC_UBIQUINO_CMD);
		createEAttribute(oscUbiquinoCmdEClass, OSC_UBIQUINO_CMD__KIND);

		oscFirmataCmdEClass = createEClass(OSC_FIRMATA_CMD);
		createEAttribute(oscFirmataCmdEClass, OSC_FIRMATA_CMD__KIND);

		// Create enums
		ubiquinoKindEEnum = createEEnum(UBIQUINO_KIND);
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
		OsccmdPackage theOsccmdPackage = (OsccmdPackage)EPackage.Registry.INSTANCE.getEPackage(OsccmdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		oscUbiquinoCmdEClass.getESuperTypes().add(theOsccmdPackage.getOscCmd());
		oscFirmataCmdEClass.getESuperTypes().add(theOsccmdPackage.getOscCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(oscUbiquinoCmdEClass, OscUbiquinoCmd.class, "OscUbiquinoCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOscUbiquinoCmd_Kind(), this.getUbiquinoKind(), "kind", null, 0, 1, OscUbiquinoCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oscFirmataCmdEClass, OscFirmataCmd.class, "OscFirmataCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOscFirmataCmd_Kind(), this.getUbiquinoKind(), "kind", null, 0, 1, OscFirmataCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(ubiquinoKindEEnum, UbiquinoKind.class, "UbiquinoKind");
		addEEnumLiteral(ubiquinoKindEEnum, UbiquinoKind.FIRMATA);
		addEEnumLiteral(ubiquinoKindEEnum, UbiquinoKind.FIRMATA_I2C);
		addEEnumLiteral(ubiquinoKindEEnum, UbiquinoKind.FIRMATA_SERVO);

		// Create resource
		createResource(eNS_URI);
	}

} //EzubiquinoPackageImpl
