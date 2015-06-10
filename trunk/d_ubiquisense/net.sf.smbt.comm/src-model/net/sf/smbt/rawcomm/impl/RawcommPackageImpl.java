/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.rawcomm.impl;

import net.sf.smbt.rawcomm.RawCmd;
import net.sf.smbt.rawcomm.RawcommFactory;
import net.sf.smbt.rawcomm.RawcommPackage;

import net.sf.xqz.model.cmd.CmdPackage;

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
public class RawcommPackageImpl extends EPackageImpl implements RawcommPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rawCmdEClass = null;

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
	 * @see net.sf.smbt.rawcomm.RawcommPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RawcommPackageImpl() {
		super(eNS_URI, RawcommFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RawcommPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RawcommPackage init() {
		if (isInited) return (RawcommPackage)EPackage.Registry.INSTANCE.getEPackage(RawcommPackage.eNS_URI);

		// Obtain or create and register package
		RawcommPackageImpl theRawcommPackage = (RawcommPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RawcommPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RawcommPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRawcommPackage.createPackageContents();

		// Initialize created meta-data
		theRawcommPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRawcommPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RawcommPackage.eNS_URI, theRawcommPackage);
		return theRawcommPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRawCmd() {
		return rawCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRawCmd_Bytes() {
		return (EAttribute)rawCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RawcommFactory getRawcommFactory() {
		return (RawcommFactory)getEFactoryInstance();
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
		rawCmdEClass = createEClass(RAW_CMD);
		createEAttribute(rawCmdEClass, RAW_CMD__BYTES);
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
		CmdPackage theCmdPackage = (CmdPackage)EPackage.Registry.INSTANCE.getEPackage(CmdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rawCmdEClass.getESuperTypes().add(theCmdPackage.getCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(rawCmdEClass, RawCmd.class, "RawCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRawCmd_Bytes(), ecorePackage.getEByteArray(), "bytes", null, 0, 1, RawCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RawcommPackageImpl
