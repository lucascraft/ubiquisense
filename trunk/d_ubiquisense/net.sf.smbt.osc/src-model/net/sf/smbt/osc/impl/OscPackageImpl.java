/**
Î * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.impl;

import net.sf.smbt.osc.OscAtom;
import net.sf.smbt.osc.OscData;
import net.sf.smbt.osc.OscFactory;
import net.sf.smbt.osc.OscFraming;
import net.sf.smbt.osc.OscMeta;
import net.sf.smbt.osc.OscPackage;
import net.sf.smbt.osc.OscType;
import net.sf.smbt.osc.OscVersion;
import net.sf.smbt.osccmd.OsccmdPackage;
import net.sf.smbt.osccmd.impl.OsccmdPackageImpl;
import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import com.illposed.osc.OSCMessage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OscPackageImpl extends EPackageImpl implements OscPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oscAtomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oscMetaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum oscTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum oscDataEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum oscFramingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum oscVersionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oscMessageEDataType = null;

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
	 * @see net.sf.smbt.osc.OscPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OscPackageImpl() {
		super(eNS_URI, OscFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OscPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OscPackage init() {
		if (isInited) return (OscPackage)EPackage.Registry.INSTANCE.getEPackage(OscPackage.eNS_URI);

		// Obtain or create and register package
		OscPackageImpl theOscPackage = (OscPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OscPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OscPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CmdPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		OsccmdPackageImpl theOsccmdPackage = (OsccmdPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OsccmdPackage.eNS_URI) instanceof OsccmdPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OsccmdPackage.eNS_URI) : OsccmdPackage.eINSTANCE);

		// Create package meta-data objects
		theOscPackage.createPackageContents();
		theOsccmdPackage.createPackageContents();

		// Initialize created meta-data
		theOscPackage.initializePackageContents();
		theOsccmdPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOscPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OscPackage.eNS_URI, theOscPackage);
		return theOscPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOscAtom() {
		return oscAtomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOscAtom_Type() {
		return (EAttribute)oscAtomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOscMeta() {
		return oscMetaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOscMeta_Version() {
		return (EAttribute)oscMetaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOscMeta_Framing() {
		return (EAttribute)oscMetaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOscMeta_Uri() {
		return (EAttribute)oscMetaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOscMeta_Types() {
		return (EAttribute)oscMetaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOscType() {
		return oscTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOscData() {
		return oscDataEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOscFraming() {
		return oscFramingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOscVersion() {
		return oscVersionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOSCMessage() {
		return oscMessageEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscFactory getOscFactory() {
		return (OscFactory)getEFactoryInstance();
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
		oscAtomEClass = createEClass(OSC_ATOM);
		createEAttribute(oscAtomEClass, OSC_ATOM__TYPE);

		oscMetaEClass = createEClass(OSC_META);
		createEAttribute(oscMetaEClass, OSC_META__VERSION);
		createEAttribute(oscMetaEClass, OSC_META__FRAMING);
		createEAttribute(oscMetaEClass, OSC_META__URI);
		createEAttribute(oscMetaEClass, OSC_META__TYPES);

		// Create enums
		oscTypeEEnum = createEEnum(OSC_TYPE);
		oscDataEEnum = createEEnum(OSC_DATA);
		oscFramingEEnum = createEEnum(OSC_FRAMING);
		oscVersionEEnum = createEEnum(OSC_VERSION);

		// Create data types
		oscMessageEDataType = createEDataType(OSC_MESSAGE);
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
		initEClass(oscAtomEClass, OscAtom.class, "OscAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOscAtom_Type(), this.getOscType(), "type", null, 0, 1, OscAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oscMetaEClass, OscMeta.class, "OscMeta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOscMeta_Version(), this.getOscType(), "version", null, 0, 1, OscMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOscMeta_Framing(), this.getOscFraming(), "framing", null, 0, 1, OscMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOscMeta_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, OscMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOscMeta_Types(), this.getOscType(), "types", null, 0, -1, OscMeta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(oscTypeEEnum, OscType.class, "OscType");
		addEEnumLiteral(oscTypeEEnum, OscType.STRING);
		addEEnumLiteral(oscTypeEEnum, OscType.FLOAT);
		addEEnumLiteral(oscTypeEEnum, OscType.INTEGER);
		addEEnumLiteral(oscTypeEEnum, OscType.BLOB);
		addEEnumLiteral(oscTypeEEnum, OscType.BIGINT);
		addEEnumLiteral(oscTypeEEnum, OscType.DOUBLE);
		addEEnumLiteral(oscTypeEEnum, OscType.TIME_TAG);
		addEEnumLiteral(oscTypeEEnum, OscType.SSTRING);
		addEEnumLiteral(oscTypeEEnum, OscType.CHARACTER);
		addEEnumLiteral(oscTypeEEnum, OscType.RGB);
		addEEnumLiteral(oscTypeEEnum, OscType.MIDI);
		addEEnumLiteral(oscTypeEEnum, OscType.OPEN_BRACKET);
		addEEnumLiteral(oscTypeEEnum, OscType.CLOSE_BRACKET);

		initEEnum(oscDataEEnum, OscData.class, "OscData");
		addEEnumLiteral(oscDataEEnum, OscData.TRUE);
		addEEnumLiteral(oscDataEEnum, OscData.FALSE);
		addEEnumLiteral(oscDataEEnum, OscData.NULL);
		addEEnumLiteral(oscDataEEnum, OscData.IMPULSE);
		addEEnumLiteral(oscDataEEnum, OscData.TIME_TAG);

		initEEnum(oscFramingEEnum, OscFraming.class, "OscFraming");
		addEEnumLiteral(oscFramingEEnum, OscFraming.SLIP);
		addEEnumLiteral(oscFramingEEnum, OscFraming.OMIT);

		initEEnum(oscVersionEEnum, OscVersion.class, "OscVersion");
		addEEnumLiteral(oscVersionEEnum, OscVersion.V1_0);
		addEEnumLiteral(oscVersionEEnum, OscVersion.V1_1);

		// Initialize data types
		initEDataType(oscMessageEDataType, OSCMessage.class, "OSCMessage", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //OscPackageImpl
