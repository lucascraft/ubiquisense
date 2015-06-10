/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.btcomm.impl;

import net.sf.smbt.btcomm.BluetoothPort;
import net.sf.smbt.btcomm.BtcommFactory;
import net.sf.smbt.btcomm.BtcommPackage;

import net.sf.smbt.btcomm.L2CAPInJob;
import net.sf.smbt.btcomm.L2CAPoutJob;
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
public class BtcommPackageImpl extends EPackageImpl implements BtcommPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bluetoothPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass l2CAPInJobEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass l2CAPoutJobEClass = null;

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
	 * @see net.sf.smbt.btcomm.BtcommPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BtcommPackageImpl() {
		super(eNS_URI, BtcommFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BtcommPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BtcommPackage init() {
		if (isInited) return (BtcommPackage)EPackage.Registry.INSTANCE.getEPackage(BtcommPackage.eNS_URI);

		// Obtain or create and register package
		BtcommPackageImpl theBtcommPackage = (BtcommPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BtcommPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BtcommPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EnginePackage.eINSTANCE.eClass();
		CmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBtcommPackage.createPackageContents();

		// Initialize created meta-data
		theBtcommPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBtcommPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BtcommPackage.eNS_URI, theBtcommPackage);
		return theBtcommPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBluetoothPort() {
		return bluetoothPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getL2CAPInJob() {
		return l2CAPInJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getL2CAPoutJob() {
		return l2CAPoutJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtcommFactory getBtcommFactory() {
		return (BtcommFactory)getEFactoryInstance();
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
		bluetoothPortEClass = createEClass(BLUETOOTH_PORT);

		l2CAPInJobEClass = createEClass(L2CAP_IN_JOB);

		l2CAPoutJobEClass = createEClass(L2CA_POUT_JOB);
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
		bluetoothPortEClass.getESuperTypes().add(theEnginePackage.getPort());
		l2CAPInJobEClass.getESuperTypes().add(theEnginePackage.getInputJob());
		l2CAPoutJobEClass.getESuperTypes().add(theEnginePackage.getOutputJob());

		// Initialize classes and features; add operations and parameters
		initEClass(bluetoothPortEClass, BluetoothPort.class, "BluetoothPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(l2CAPInJobEClass, L2CAPInJob.class, "L2CAPInJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(l2CAPoutJobEClass, L2CAPoutJob.class, "L2CAPoutJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //BtcommPackageImpl
