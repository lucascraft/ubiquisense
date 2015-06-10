/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.tests.rgb.rgbargs.impl;

import net.sf.smbt.tests.rgb.rgbargs.RGBStepNDelayArgs;
import net.sf.smbt.tests.rgb.rgbargs.RgbargsFactory;
import net.sf.smbt.tests.rgb.rgbargs.RgbargsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RgbargsPackageImpl extends EPackageImpl implements RgbargsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rgbStepNDelayArgsEClass = null;

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
	 * @see net.sf.smbt.tests.rgb.rgbargs.RgbargsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RgbargsPackageImpl() {
		super(eNS_URI, RgbargsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RgbargsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RgbargsPackage init() {
		if (isInited) return (RgbargsPackage)EPackage.Registry.INSTANCE.getEPackage(RgbargsPackage.eNS_URI);

		// Obtain or create and register package
		RgbargsPackageImpl theRgbargsPackage = (RgbargsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RgbargsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RgbargsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRgbargsPackage.createPackageContents();

		// Initialize created meta-data
		theRgbargsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRgbargsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RgbargsPackage.eNS_URI, theRgbargsPackage);
		return theRgbargsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRGBStepNDelayArgs() {
		return rgbStepNDelayArgsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRGBStepNDelayArgs_R() {
		return (EAttribute)rgbStepNDelayArgsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRGBStepNDelayArgs_G() {
		return (EAttribute)rgbStepNDelayArgsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRGBStepNDelayArgs_B() {
		return (EAttribute)rgbStepNDelayArgsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRGBStepNDelayArgs_RMotion() {
		return (EAttribute)rgbStepNDelayArgsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRGBStepNDelayArgs_GMotion() {
		return (EAttribute)rgbStepNDelayArgsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRGBStepNDelayArgs_BMotion() {
		return (EAttribute)rgbStepNDelayArgsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRGBStepNDelayArgs_Increment() {
		return (EAttribute)rgbStepNDelayArgsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRGBStepNDelayArgs_Delay() {
		return (EAttribute)rgbStepNDelayArgsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRGBStepNDelayArgs_Running() {
		return (EAttribute)rgbStepNDelayArgsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RgbargsFactory getRgbargsFactory() {
		return (RgbargsFactory)getEFactoryInstance();
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
		rgbStepNDelayArgsEClass = createEClass(RGB_STEP_NDELAY_ARGS);
		createEAttribute(rgbStepNDelayArgsEClass, RGB_STEP_NDELAY_ARGS__R);
		createEAttribute(rgbStepNDelayArgsEClass, RGB_STEP_NDELAY_ARGS__G);
		createEAttribute(rgbStepNDelayArgsEClass, RGB_STEP_NDELAY_ARGS__B);
		createEAttribute(rgbStepNDelayArgsEClass, RGB_STEP_NDELAY_ARGS__RMOTION);
		createEAttribute(rgbStepNDelayArgsEClass, RGB_STEP_NDELAY_ARGS__GMOTION);
		createEAttribute(rgbStepNDelayArgsEClass, RGB_STEP_NDELAY_ARGS__BMOTION);
		createEAttribute(rgbStepNDelayArgsEClass, RGB_STEP_NDELAY_ARGS__INCREMENT);
		createEAttribute(rgbStepNDelayArgsEClass, RGB_STEP_NDELAY_ARGS__DELAY);
		createEAttribute(rgbStepNDelayArgsEClass, RGB_STEP_NDELAY_ARGS__RUNNING);
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
		initEClass(rgbStepNDelayArgsEClass, RGBStepNDelayArgs.class, "RGBStepNDelayArgs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRGBStepNDelayArgs_R(), ecorePackage.getEInt(), "r", null, 0, 1, RGBStepNDelayArgs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRGBStepNDelayArgs_G(), ecorePackage.getEInt(), "g", null, 0, 1, RGBStepNDelayArgs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRGBStepNDelayArgs_B(), ecorePackage.getEInt(), "b", null, 0, 1, RGBStepNDelayArgs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRGBStepNDelayArgs_RMotion(), ecorePackage.getEBoolean(), "rMotion", null, 0, 1, RGBStepNDelayArgs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRGBStepNDelayArgs_GMotion(), ecorePackage.getEBoolean(), "gMotion", null, 0, 1, RGBStepNDelayArgs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRGBStepNDelayArgs_BMotion(), ecorePackage.getEBoolean(), "bMotion", null, 0, 1, RGBStepNDelayArgs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRGBStepNDelayArgs_Increment(), ecorePackage.getEDouble(), "increment", null, 0, 1, RGBStepNDelayArgs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRGBStepNDelayArgs_Delay(), ecorePackage.getELong(), "delay", null, 0, 1, RGBStepNDelayArgs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRGBStepNDelayArgs_Running(), ecorePackage.getEBoolean(), "running", null, 0, 1, RGBStepNDelayArgs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RgbargsPackageImpl
