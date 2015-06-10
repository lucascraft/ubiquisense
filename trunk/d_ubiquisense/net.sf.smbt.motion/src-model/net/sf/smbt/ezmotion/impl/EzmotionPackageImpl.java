/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmotion.impl;

import net.sf.smbt.ezmotion.EzmotionFactory;
import net.sf.smbt.ezmotion.EzmotionPackage;
import net.sf.smbt.ezmotion.Motion;
import net.sf.smbt.ezmotion.MotionAxis;
import net.sf.smbt.ezmotion.MotionCinematic;
import net.sf.smbt.ezmotion.MotionKind;
import net.sf.smbt.ezmotion.MotionValue;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzmotionPackageImpl extends EPackageImpl implements EzmotionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motionValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum motionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum motionCinematicEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum motionAxisEEnum = null;

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
	 * @see net.sf.smbt.ezmotion.EzmotionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EzmotionPackageImpl() {
		super(eNS_URI, EzmotionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EzmotionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EzmotionPackage init() {
		if (isInited) return (EzmotionPackage)EPackage.Registry.INSTANCE.getEPackage(EzmotionPackage.eNS_URI);

		// Obtain or create and register package
		EzmotionPackageImpl theEzmotionPackage = (EzmotionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EzmotionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EzmotionPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEzmotionPackage.createPackageContents();

		// Initialize created meta-data
		theEzmotionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEzmotionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EzmotionPackage.eNS_URI, theEzmotionPackage);
		return theEzmotionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotion() {
		return motionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotion_Kind() {
		return (EAttribute)motionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotion_ID() {
		return (EAttribute)motionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotion_Cinematic() {
		return (EAttribute)motionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotion_Duration() {
		return (EAttribute)motionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotion_Amplitude() {
		return (EAttribute)motionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotion_SampleRate() {
		return (EAttribute)motionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotion_Frequency() {
		return (EAttribute)motionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotion_Time() {
		return (EAttribute)motionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotion_Discretization() {
		return (EReference)motionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotion_Axis() {
		return (EAttribute)motionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotionValue() {
		return motionValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotionValue_X() {
		return (EAttribute)motionValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotionValue_Y() {
		return (EAttribute)motionValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotionValue_Z() {
		return (EAttribute)motionValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotionValue_XAccel() {
		return (EAttribute)motionValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotionValue_YAccel() {
		return (EAttribute)motionValueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotionValue_ZAccel() {
		return (EAttribute)motionValueEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotionValue_XRot() {
		return (EAttribute)motionValueEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotionValue_YRot() {
		return (EAttribute)motionValueEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotionValue_ZRot() {
		return (EAttribute)motionValueEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMotionKind() {
		return motionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMotionCinematic() {
		return motionCinematicEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMotionAxis() {
		return motionAxisEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzmotionFactory getEzmotionFactory() {
		return (EzmotionFactory)getEFactoryInstance();
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
		motionEClass = createEClass(MOTION);
		createEAttribute(motionEClass, MOTION__KIND);
		createEAttribute(motionEClass, MOTION__ID);
		createEAttribute(motionEClass, MOTION__CINEMATIC);
		createEAttribute(motionEClass, MOTION__DURATION);
		createEAttribute(motionEClass, MOTION__AMPLITUDE);
		createEAttribute(motionEClass, MOTION__SAMPLE_RATE);
		createEAttribute(motionEClass, MOTION__FREQUENCY);
		createEAttribute(motionEClass, MOTION__TIME);
		createEReference(motionEClass, MOTION__DISCRETIZATION);
		createEAttribute(motionEClass, MOTION__AXIS);

		motionValueEClass = createEClass(MOTION_VALUE);
		createEAttribute(motionValueEClass, MOTION_VALUE__X);
		createEAttribute(motionValueEClass, MOTION_VALUE__Y);
		createEAttribute(motionValueEClass, MOTION_VALUE__Z);
		createEAttribute(motionValueEClass, MOTION_VALUE__XACCEL);
		createEAttribute(motionValueEClass, MOTION_VALUE__YACCEL);
		createEAttribute(motionValueEClass, MOTION_VALUE__ZACCEL);
		createEAttribute(motionValueEClass, MOTION_VALUE__XROT);
		createEAttribute(motionValueEClass, MOTION_VALUE__YROT);
		createEAttribute(motionValueEClass, MOTION_VALUE__ZROT);

		// Create enums
		motionKindEEnum = createEEnum(MOTION_KIND);
		motionCinematicEEnum = createEEnum(MOTION_CINEMATIC);
		motionAxisEEnum = createEEnum(MOTION_AXIS);
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
		initEClass(motionEClass, Motion.class, "Motion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMotion_Kind(), this.getMotionKind(), "kind", null, 0, 1, Motion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotion_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Motion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotion_Cinematic(), this.getMotionCinematic(), "cinematic", null, 0, 1, Motion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotion_Duration(), ecorePackage.getELong(), "duration", null, 0, 1, Motion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotion_Amplitude(), ecorePackage.getEFloat(), "amplitude", null, 0, 1, Motion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotion_SampleRate(), ecorePackage.getEInt(), "sampleRate", null, 0, 1, Motion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotion_Frequency(), ecorePackage.getEFloat(), "frequency", null, 0, 1, Motion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotion_Time(), ecorePackage.getELong(), "time", null, 0, 1, Motion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMotion_Discretization(), this.getMotionValue(), null, "discretization", null, 0, -1, Motion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotion_Axis(), this.getMotionAxis(), "axis", null, 0, 1, Motion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(motionValueEClass, MotionValue.class, "MotionValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMotionValue_X(), ecorePackage.getEDouble(), "x", null, 0, 1, MotionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotionValue_Y(), ecorePackage.getEDouble(), "y", null, 0, 1, MotionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotionValue_Z(), ecorePackage.getEDouble(), "z", null, 0, 1, MotionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotionValue_XAccel(), ecorePackage.getEFloat(), "xAccel", null, 0, 1, MotionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotionValue_YAccel(), ecorePackage.getEFloat(), "yAccel", null, 0, 1, MotionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotionValue_ZAccel(), ecorePackage.getEFloat(), "zAccel", null, 0, 1, MotionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotionValue_XRot(), ecorePackage.getEFloat(), "xRot", null, 0, 1, MotionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotionValue_YRot(), ecorePackage.getEFloat(), "yRot", null, 0, 1, MotionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotionValue_ZRot(), ecorePackage.getEFloat(), "zRot", null, 0, 1, MotionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(motionKindEEnum, MotionKind.class, "MotionKind");
		addEEnumLiteral(motionKindEEnum, MotionKind.RANDOM);
		addEEnumLiteral(motionKindEEnum, MotionKind.CYCLIC);
		addEEnumLiteral(motionKindEEnum, MotionKind.NONE);
		addEEnumLiteral(motionKindEEnum, MotionKind.PATH);

		initEEnum(motionCinematicEEnum, MotionCinematic.class, "MotionCinematic");
		addEEnumLiteral(motionCinematicEEnum, MotionCinematic.SIN);
		addEEnumLiteral(motionCinematicEEnum, MotionCinematic.SAW);
		addEEnumLiteral(motionCinematicEEnum, MotionCinematic.SQR);
		addEEnumLiteral(motionCinematicEEnum, MotionCinematic.TRI);
		addEEnumLiteral(motionCinematicEEnum, MotionCinematic.RAMP);
		addEEnumLiteral(motionCinematicEEnum, MotionCinematic.QUADRATIC);
		addEEnumLiteral(motionCinematicEEnum, MotionCinematic.CUBIC);
		addEEnumLiteral(motionCinematicEEnum, MotionCinematic.LOG);
		addEEnumLiteral(motionCinematicEEnum, MotionCinematic.COMPLEX);
		addEEnumLiteral(motionCinematicEEnum, MotionCinematic.NONE);
		addEEnumLiteral(motionCinematicEEnum, MotionCinematic.SQUARE);
		addEEnumLiteral(motionCinematicEEnum, MotionCinematic.LINEAR);
		addEEnumLiteral(motionCinematicEEnum, MotionCinematic.HARMONIC);
		addEEnumLiteral(motionCinematicEEnum, MotionCinematic.CIRCULAR);
		addEEnumLiteral(motionCinematicEEnum, MotionCinematic.GAUSSIAN);
		addEEnumLiteral(motionCinematicEEnum, MotionCinematic.POISSON);
		addEEnumLiteral(motionCinematicEEnum, MotionCinematic.IMPULSE);
		addEEnumLiteral(motionCinematicEEnum, MotionCinematic.COS);

		initEEnum(motionAxisEEnum, MotionAxis.class, "MotionAxis");
		addEEnumLiteral(motionAxisEEnum, MotionAxis.XAXIS);
		addEEnumLiteral(motionAxisEEnum, MotionAxis.YAXIS);
		addEEnumLiteral(motionAxisEEnum, MotionAxis.ZAXIS);

		// Create resource
		createResource(eNS_URI);
	}

} //EzmotionPackageImpl
