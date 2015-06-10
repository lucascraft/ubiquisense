/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.httpcomm.impl;

import net.sf.smbt.httpcomm.HttpCommPort;
import net.sf.smbt.httpcomm.HttpcommFactory;
import net.sf.smbt.httpcomm.HttpcommPackage;

import net.sf.xqz.model.cmd.CmdPackage;

import net.sf.xqz.model.engine.EnginePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HttpcommPackageImpl extends EPackageImpl implements HttpcommPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpCommPortEClass = null;

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
	 * @see net.sf.smbt.httpcomm.HttpcommPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HttpcommPackageImpl() {
		super(eNS_URI, HttpcommFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HttpcommPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HttpcommPackage init() {
		if (isInited) return (HttpcommPackage)EPackage.Registry.INSTANCE.getEPackage(HttpcommPackage.eNS_URI);

		// Obtain or create and register package
		HttpcommPackageImpl theHttpcommPackage = (HttpcommPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HttpcommPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HttpcommPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EnginePackage.eINSTANCE.eClass();
		CmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theHttpcommPackage.createPackageContents();

		// Initialize created meta-data
		theHttpcommPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHttpcommPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HttpcommPackage.eNS_URI, theHttpcommPackage);
		return theHttpcommPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHttpCommPort() {
		return httpCommPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpcommFactory getHttpcommFactory() {
		return (HttpcommFactory)getEFactoryInstance();
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
		httpCommPortEClass = createEClass(HTTP_COMM_PORT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		httpCommPortEClass.getESuperTypes().add(theEnginePackage.getPort());

		// Initialize classes and features; add operations and parameters
		initEClass(httpCommPortEClass, HttpCommPort.class, "HttpCommPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //HttpcommPackageImpl
