/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezpachube.impl;

import net.sf.smbt.comm.httpcmd.HttpcmdPackage;
import net.sf.smbt.ezpachube.CosmCmd;
import net.sf.smbt.ezpachube.DatastreamAction;
import net.sf.smbt.ezpachube.EzpachubeFactory;
import net.sf.smbt.ezpachube.EzpachubePackage;
import net.sf.smbt.ezpachube.FeedAction;
import net.sf.smbt.ezpachube.FeedKind;
import net.sf.smbt.ezpachube.IntervalKind;
import net.sf.smbt.ezpachube.Version;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eeml.xsd._0._5._5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzpachubePackageImpl extends EPackageImpl implements EzpachubePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cosmCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pachubE_ACCESSEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pachubE_HTTP_STATUSEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum intervalKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum feedKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum versionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum feedActionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum datastreamActionEEnum = null;

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
	 * @see net.sf.smbt.ezpachube.EzpachubePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EzpachubePackageImpl() {
		super(eNS_URI, EzpachubeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EzpachubePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EzpachubePackage init() {
		if (isInited) return (EzpachubePackage)EPackage.Registry.INSTANCE.getEPackage(EzpachubePackage.eNS_URI);

		// Obtain or create and register package
		EzpachubePackageImpl theEzpachubePackage = (EzpachubePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EzpachubePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EzpachubePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		_5Package.eINSTANCE.eClass();
		HttpcmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEzpachubePackage.createPackageContents();

		// Initialize created meta-data
		theEzpachubePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEzpachubePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EzpachubePackage.eNS_URI, theEzpachubePackage);
		return theEzpachubePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCosmCmd() {
		return cosmCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCosmCmd_Status() {
		return (EAttribute)cosmCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCosmCmd_Access() {
		return (EAttribute)cosmCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCosmCmd_Json() {
		return (EAttribute)cosmCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCosmCmd_Version() {
		return (EAttribute)cosmCmdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCosmCmd_FeedKind() {
		return (EAttribute)cosmCmdEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCosmCmd_Feed() {
		return (EAttribute)cosmCmdEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCosmCmd_Eeml() {
		return (EReference)cosmCmdEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCosmCmd_Datastream() {
		return (EAttribute)cosmCmdEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPACHUBE_ACCESS() {
		return pachubE_ACCESSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPACHUBE_HTTP_STATUS() {
		return pachubE_HTTP_STATUSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIntervalKind() {
		return intervalKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFeedKind() {
		return feedKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVersion() {
		return versionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFeedAction() {
		return feedActionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDatastreamAction() {
		return datastreamActionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzpachubeFactory getEzpachubeFactory() {
		return (EzpachubeFactory)getEFactoryInstance();
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
		cosmCmdEClass = createEClass(COSM_CMD);
		createEAttribute(cosmCmdEClass, COSM_CMD__STATUS);
		createEAttribute(cosmCmdEClass, COSM_CMD__ACCESS);
		createEAttribute(cosmCmdEClass, COSM_CMD__JSON);
		createEAttribute(cosmCmdEClass, COSM_CMD__VERSION);
		createEAttribute(cosmCmdEClass, COSM_CMD__FEED_KIND);
		createEAttribute(cosmCmdEClass, COSM_CMD__FEED);
		createEReference(cosmCmdEClass, COSM_CMD__EEML);
		createEAttribute(cosmCmdEClass, COSM_CMD__DATASTREAM);

		// Create enums
		pachubE_ACCESSEEnum = createEEnum(PACHUBE_ACCESS);
		pachubE_HTTP_STATUSEEnum = createEEnum(PACHUBE_HTTP_STATUS);
		intervalKindEEnum = createEEnum(INTERVAL_KIND);
		feedKindEEnum = createEEnum(FEED_KIND);
		versionEEnum = createEEnum(VERSION);
		feedActionEEnum = createEEnum(FEED_ACTION);
		datastreamActionEEnum = createEEnum(DATASTREAM_ACTION);
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
		HttpcmdPackage theHttpcmdPackage = (HttpcmdPackage)EPackage.Registry.INSTANCE.getEPackage(HttpcmdPackage.eNS_URI);
		_5Package the_5Package = (_5Package)EPackage.Registry.INSTANCE.getEPackage(_5Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cosmCmdEClass.getESuperTypes().add(theHttpcmdPackage.getHttpCommCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(cosmCmdEClass, CosmCmd.class, "CosmCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCosmCmd_Status(), this.getPACHUBE_HTTP_STATUS(), "status", null, 0, 1, CosmCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCosmCmd_Access(), this.getPACHUBE_ACCESS(), "access", null, 0, 1, CosmCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCosmCmd_Json(), ecorePackage.getEJavaObject(), "json", null, 0, 1, CosmCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCosmCmd_Version(), this.getVersion(), "version", null, 0, 1, CosmCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCosmCmd_FeedKind(), this.getFeedKind(), "feedKind", null, 0, 1, CosmCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCosmCmd_Feed(), ecorePackage.getEString(), "feed", null, 0, 1, CosmCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCosmCmd_Eeml(), the_5Package.getEemlType(), null, "eeml", null, 0, 1, CosmCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCosmCmd_Datastream(), ecorePackage.getEString(), "datastream", null, 0, 1, CosmCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(pachubE_ACCESSEEnum, net.sf.smbt.ezpachube.PACHUBE_ACCESS.class, "PACHUBE_ACCESS");
		addEEnumLiteral(pachubE_ACCESSEEnum, net.sf.smbt.ezpachube.PACHUBE_ACCESS.PACHUBE_HTTP);
		addEEnumLiteral(pachubE_ACCESSEEnum, net.sf.smbt.ezpachube.PACHUBE_ACCESS.PACHUBE_RESTFULL);
		addEEnumLiteral(pachubE_ACCESSEEnum, net.sf.smbt.ezpachube.PACHUBE_ACCESS.PACHUBE_RSS_FEED);

		initEEnum(pachubE_HTTP_STATUSEEnum, net.sf.smbt.ezpachube.PACHUBE_HTTP_STATUS.class, "PACHUBE_HTTP_STATUS");
		addEEnumLiteral(pachubE_HTTP_STATUSEEnum, net.sf.smbt.ezpachube.PACHUBE_HTTP_STATUS.STATUS_200);
		addEEnumLiteral(pachubE_HTTP_STATUSEEnum, net.sf.smbt.ezpachube.PACHUBE_HTTP_STATUS.STATUS_401);
		addEEnumLiteral(pachubE_HTTP_STATUSEEnum, net.sf.smbt.ezpachube.PACHUBE_HTTP_STATUS.STATUS_403);
		addEEnumLiteral(pachubE_HTTP_STATUSEEnum, net.sf.smbt.ezpachube.PACHUBE_HTTP_STATUS.STATUS_404);

		initEEnum(intervalKindEEnum, IntervalKind.class, "IntervalKind");
		addEEnumLiteral(intervalKindEEnum, IntervalKind.INTERVAL_0);
		addEEnumLiteral(intervalKindEEnum, IntervalKind.INTERVAL_30);
		addEEnumLiteral(intervalKindEEnum, IntervalKind.INTERVAL_60);
		addEEnumLiteral(intervalKindEEnum, IntervalKind.INTERVAL_300);
		addEEnumLiteral(intervalKindEEnum, IntervalKind.INTERVAL_900);
		addEEnumLiteral(intervalKindEEnum, IntervalKind.INTERVAL_1800);
		addEEnumLiteral(intervalKindEEnum, IntervalKind.INTERVAL_3600);
		addEEnumLiteral(intervalKindEEnum, IntervalKind.INTERVAL_10800);
		addEEnumLiteral(intervalKindEEnum, IntervalKind.INTERVAL_21600);
		addEEnumLiteral(intervalKindEEnum, IntervalKind.INTERVAL_43200);
		addEEnumLiteral(intervalKindEEnum, IntervalKind.INTERVAL_86400);

		initEEnum(feedKindEEnum, FeedKind.class, "FeedKind");
		addEEnumLiteral(feedKindEEnum, FeedKind.EEML);
		addEEnumLiteral(feedKindEEnum, FeedKind.JSON);
		addEEnumLiteral(feedKindEEnum, FeedKind.CSV);

		initEEnum(versionEEnum, Version.class, "Version");
		addEEnumLiteral(versionEEnum, Version.V1);
		addEEnumLiteral(versionEEnum, Version.V2);

		initEEnum(feedActionEEnum, FeedAction.class, "FeedAction");
		addEEnumLiteral(feedActionEEnum, FeedAction.CREATE);
		addEEnumLiteral(feedActionEEnum, FeedAction.UPDATE);
		addEEnumLiteral(feedActionEEnum, FeedAction.READ);
		addEEnumLiteral(feedActionEEnum, FeedAction.DELETE);

		initEEnum(datastreamActionEEnum, DatastreamAction.class, "DatastreamAction");
		addEEnumLiteral(datastreamActionEEnum, DatastreamAction.CREATE);
		addEEnumLiteral(datastreamActionEEnum, DatastreamAction.UPDATE);
		addEEnumLiteral(datastreamActionEEnum, DatastreamAction.READ);
		addEEnumLiteral(datastreamActionEEnum, DatastreamAction.DELETE);

		// Create resource
		createResource(eNS_URI);
	}

} //EzpachubePackageImpl
