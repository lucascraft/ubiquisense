/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.json.ecore.ezjson.impl;

import net.sf.smbt.json.ecore.ezjson.EzjsonFactory;
import net.sf.smbt.json.ecore.ezjson.EzjsonPackage;
import net.sf.smbt.json.ecore.ezjson.InJSonCmd;
import net.sf.smbt.json.ecore.ezjson.JsonCmd;
import net.sf.smbt.json.ecore.ezjson.OutJsonCmd;

import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzjsonPackageImpl extends EPackageImpl implements EzjsonPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inJSonCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outJsonCmdEClass = null;

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
	 * @see net.sf.smbt.json.ecore.ezjson.EzjsonPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EzjsonPackageImpl() {
		super(eNS_URI, EzjsonFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EzjsonPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EzjsonPackage init() {
		if (isInited) return (EzjsonPackage)EPackage.Registry.INSTANCE.getEPackage(EzjsonPackage.eNS_URI);

		// Obtain or create and register package
		EzjsonPackageImpl theEzjsonPackage = (EzjsonPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EzjsonPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EzjsonPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEzjsonPackage.createPackageContents();

		// Initialize created meta-data
		theEzjsonPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEzjsonPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EzjsonPackage.eNS_URI, theEzjsonPackage);
		return theEzjsonPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJsonCmd() {
		return jsonCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJsonCmd_Json() {
		return (EAttribute)jsonCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInJSonCmd() {
		return inJSonCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutJsonCmd() {
		return outJsonCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzjsonFactory getEzjsonFactory() {
		return (EzjsonFactory)getEFactoryInstance();
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
		jsonCmdEClass = createEClass(JSON_CMD);
		createEAttribute(jsonCmdEClass, JSON_CMD__JSON);

		inJSonCmdEClass = createEClass(IN_JSON_CMD);

		outJsonCmdEClass = createEClass(OUT_JSON_CMD);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		jsonCmdEClass.getESuperTypes().add(theCmdPackage.getCmd());
		inJSonCmdEClass.getESuperTypes().add(this.getJsonCmd());
		outJsonCmdEClass.getESuperTypes().add(this.getJsonCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(jsonCmdEClass, JsonCmd.class, "JsonCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJsonCmd_Json(), theEcorePackage.getEJavaObject(), "json", null, 0, 1, JsonCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inJSonCmdEClass, InJSonCmd.class, "InJSonCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outJsonCmdEClass, OutJsonCmd.class, "OutJsonCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EzjsonPackageImpl
