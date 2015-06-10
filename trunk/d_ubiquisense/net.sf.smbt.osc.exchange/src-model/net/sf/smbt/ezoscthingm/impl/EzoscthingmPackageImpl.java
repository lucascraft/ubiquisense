/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezoscthingm.impl;

import net.sf.smbt.ezoscthingm.EzoscthingmFactory;
import net.sf.smbt.ezoscthingm.EzoscthingmPackage;
import net.sf.smbt.ezoscthingm.ThingMOscCmd;

import net.sf.smbt.osccmd.OsccmdPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzoscthingmPackageImpl extends EPackageImpl implements EzoscthingmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thingMOscCmdEClass = null;

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
	 * @see net.sf.smbt.ezoscthingm.EzoscthingmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EzoscthingmPackageImpl() {
		super(eNS_URI, EzoscthingmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EzoscthingmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EzoscthingmPackage init() {
		if (isInited) return (EzoscthingmPackage)EPackage.Registry.INSTANCE.getEPackage(EzoscthingmPackage.eNS_URI);

		// Obtain or create and register package
		EzoscthingmPackageImpl theEzoscthingmPackage = (EzoscthingmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EzoscthingmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EzoscthingmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OsccmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEzoscthingmPackage.createPackageContents();

		// Initialize created meta-data
		theEzoscthingmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEzoscthingmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EzoscthingmPackage.eNS_URI, theEzoscthingmPackage);
		return theEzoscthingmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThingMOscCmd() {
		return thingMOscCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzoscthingmFactory getEzoscthingmFactory() {
		return (EzoscthingmFactory)getEFactoryInstance();
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
		thingMOscCmdEClass = createEClass(THING_MOSC_CMD);
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
		thingMOscCmdEClass.getESuperTypes().add(theOsccmdPackage.getOscCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(thingMOscCmdEClass, ThingMOscCmd.class, "ThingMOscCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EzoscthingmPackageImpl
