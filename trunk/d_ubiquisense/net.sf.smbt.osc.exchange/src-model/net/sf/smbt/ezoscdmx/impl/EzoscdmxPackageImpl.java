/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezoscdmx.impl;

import net.sf.smbt.dmx.model.ezdmx.EzdmxPackage;
import net.sf.smbt.ezoscdmx.EzoscdmxFactory;
import net.sf.smbt.ezoscdmx.EzoscdmxPackage;
import net.sf.smbt.ezoscdmx.OscDmxCmd;
import net.sf.smbt.ezoscdmx.OscDmxFadeToRGB;
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
public class EzoscdmxPackageImpl extends EPackageImpl implements EzoscdmxPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oscDmxFadeToRGBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oscDmxCmdEClass = null;

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
	 * @see net.sf.smbt.ezoscdmx.EzoscdmxPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EzoscdmxPackageImpl() {
		super(eNS_URI, EzoscdmxFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EzoscdmxPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EzoscdmxPackage init() {
		if (isInited) return (EzoscdmxPackage)EPackage.Registry.INSTANCE.getEPackage(EzoscdmxPackage.eNS_URI);

		// Obtain or create and register package
		EzoscdmxPackageImpl theEzoscdmxPackage = (EzoscdmxPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EzoscdmxPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EzoscdmxPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EzdmxPackage.eINSTANCE.eClass();
		OsccmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEzoscdmxPackage.createPackageContents();

		// Initialize created meta-data
		theEzoscdmxPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEzoscdmxPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EzoscdmxPackage.eNS_URI, theEzoscdmxPackage);
		return theEzoscdmxPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOscDmxFadeToRGB() {
		return oscDmxFadeToRGBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOscDmxCmd() {
		return oscDmxCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzoscdmxFactory getEzoscdmxFactory() {
		return (EzoscdmxFactory)getEFactoryInstance();
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
		oscDmxFadeToRGBEClass = createEClass(OSC_DMX_FADE_TO_RGB);

		oscDmxCmdEClass = createEClass(OSC_DMX_CMD);
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
		EzdmxPackage theEzdmxPackage = (EzdmxPackage)EPackage.Registry.INSTANCE.getEPackage(EzdmxPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		oscDmxFadeToRGBEClass.getESuperTypes().add(this.getOscDmxCmd());
		oscDmxCmdEClass.getESuperTypes().add(theOsccmdPackage.getOscCmd());
		oscDmxCmdEClass.getESuperTypes().add(theEzdmxPackage.getOpenDMXCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(oscDmxFadeToRGBEClass, OscDmxFadeToRGB.class, "OscDmxFadeToRGB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oscDmxCmdEClass, OscDmxCmd.class, "OscDmxCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EzoscdmxPackageImpl
