/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezquant.impl;

import net.sf.smbt.comm.ezxtopology.EzxtopologyPackage;
import net.sf.smbt.comm.script.netConf.NetConfPackage;
import net.sf.smbt.ezquant.EzquantFactory;
import net.sf.smbt.ezquant.EzquantPackage;
import net.sf.smbt.ezquant.QHub;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzquantPackageImpl extends EPackageImpl implements EzquantPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qHubEClass = null;
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
	 * @see net.sf.smbt.ezquant.EzquantPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EzquantPackageImpl() {
		super(eNS_URI, EzquantFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EzquantPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EzquantPackage init() {
		if (isInited) return (EzquantPackage)EPackage.Registry.INSTANCE.getEPackage(EzquantPackage.eNS_URI);

		// Obtain or create and register package
		EzquantPackageImpl theEzquantPackage = (EzquantPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EzquantPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EzquantPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EzxtopologyPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEzquantPackage.createPackageContents();

		// Initialize created meta-data
		theEzquantPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEzquantPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EzquantPackage.eNS_URI, theEzquantPackage);
		return theEzquantPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQHub() {
		return qHubEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQHub_Configurations() {
		return (EReference)qHubEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQHub_Topology() {
		return (EReference)qHubEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQHub_ID() {
		return (EAttribute)qHubEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQHub_Agent() {
		return (EAttribute)qHubEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQHub_Supervisor() {
		return (EAttribute)qHubEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzquantFactory getEzquantFactory() {
		return (EzquantFactory)getEFactoryInstance();
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
		qHubEClass = createEClass(QHUB);
		createEReference(qHubEClass, QHUB__CONFIGURATIONS);
		createEReference(qHubEClass, QHUB__TOPOLOGY);
		createEAttribute(qHubEClass, QHUB__ID);
		createEAttribute(qHubEClass, QHUB__AGENT);
		createEAttribute(qHubEClass, QHUB__SUPERVISOR);
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
		NetConfPackage theNetConfPackage = (NetConfPackage)EPackage.Registry.INSTANCE.getEPackage(NetConfPackage.eNS_URI);
		EzxtopologyPackage theEzxtopologyPackage = (EzxtopologyPackage)EPackage.Registry.INSTANCE.getEPackage(EzxtopologyPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(qHubEClass, QHub.class, "QHub", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQHub_Configurations(), theNetConfPackage.getNetCfg(), null, "configurations", null, 0, -1, QHub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQHub_Topology(), theEzxtopologyPackage.getTopologyCache(), null, "topology", null, 0, 1, QHub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQHub_ID(), ecorePackage.getEString(), "ID", null, 0, 1, QHub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQHub_Agent(), ecorePackage.getEJavaObject(), "agent", null, 0, 1, QHub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQHub_Supervisor(), ecorePackage.getEJavaObject(), "supervisor", null, 0, 1, QHub.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EzquantPackageImpl
