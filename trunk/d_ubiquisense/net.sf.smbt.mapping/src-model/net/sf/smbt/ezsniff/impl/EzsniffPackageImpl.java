/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsniff.impl;

import net.sf.smbt.ezmapping.EzmappingPackage;
import net.sf.smbt.ezsniff.AbstractEZSniffElem;
import net.sf.smbt.ezsniff.EZSniffHit;
import net.sf.smbt.ezsniff.EZSniffProtocolGroup;
import net.sf.smbt.ezsniff.EZSniffer;
import net.sf.smbt.ezsniff.EZSnifferManager;
import net.sf.smbt.ezsniff.EzsniffFactory;
import net.sf.smbt.ezsniff.EzsniffPackage;
import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzsniffPackageImpl extends EPackageImpl implements EzsniffPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezSnifferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezSniffProtocolGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEZSniffElemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezSniffHitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezSnifferManagerEClass = null;

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
	 * @see net.sf.smbt.ezsniff.EzsniffPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EzsniffPackageImpl() {
		super(eNS_URI, EzsniffFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EzsniffPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EzsniffPackage init() {
		if (isInited) return (EzsniffPackage)EPackage.Registry.INSTANCE.getEPackage(EzsniffPackage.eNS_URI);

		// Obtain or create and register package
		EzsniffPackageImpl theEzsniffPackage = (EzsniffPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EzsniffPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EzsniffPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EzmappingPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEzsniffPackage.createPackageContents();

		// Initialize created meta-data
		theEzsniffPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEzsniffPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EzsniffPackage.eNS_URI, theEzsniffPackage);
		return theEzsniffPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEZSniffer() {
		return ezSnifferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZSniffer_Id() {
		return (EAttribute)ezSnifferEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZSniffer_Hits() {
		return (EReference)ezSnifferEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZSniffer_Label() {
		return (EAttribute)ezSnifferEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZSniffer_Mappings() {
		return (EReference)ezSnifferEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEZSniffProtocolGroup() {
		return ezSniffProtocolGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZSniffProtocolGroup_Children() {
		return (EReference)ezSniffProtocolGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractEZSniffElem() {
		return abstractEZSniffElemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractEZSniffElem_Mappings() {
		return (EReference)abstractEZSniffElemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEZSniffHit() {
		return ezSniffHitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZSniffHit_Seek() {
		return (EReference)ezSniffHitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZSniffHit_Hit() {
		return (EReference)ezSniffHitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEZSnifferManager() {
		return ezSnifferManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZSnifferManager_Id() {
		return (EAttribute)ezSnifferManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZSnifferManager_Sniffers() {
		return (EReference)ezSnifferManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZSnifferManager_Cache() {
		return (EReference)ezSnifferManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzsniffFactory getEzsniffFactory() {
		return (EzsniffFactory)getEFactoryInstance();
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
		ezSnifferEClass = createEClass(EZ_SNIFFER);
		createEAttribute(ezSnifferEClass, EZ_SNIFFER__ID);
		createEReference(ezSnifferEClass, EZ_SNIFFER__HITS);
		createEAttribute(ezSnifferEClass, EZ_SNIFFER__LABEL);
		createEReference(ezSnifferEClass, EZ_SNIFFER__MAPPINGS);

		ezSniffProtocolGroupEClass = createEClass(EZ_SNIFF_PROTOCOL_GROUP);
		createEReference(ezSniffProtocolGroupEClass, EZ_SNIFF_PROTOCOL_GROUP__CHILDREN);

		abstractEZSniffElemEClass = createEClass(ABSTRACT_EZ_SNIFF_ELEM);
		createEReference(abstractEZSniffElemEClass, ABSTRACT_EZ_SNIFF_ELEM__MAPPINGS);

		ezSniffHitEClass = createEClass(EZ_SNIFF_HIT);
		createEReference(ezSniffHitEClass, EZ_SNIFF_HIT__SEEK);
		createEReference(ezSniffHitEClass, EZ_SNIFF_HIT__HIT);

		ezSnifferManagerEClass = createEClass(EZ_SNIFFER_MANAGER);
		createEAttribute(ezSnifferManagerEClass, EZ_SNIFFER_MANAGER__ID);
		createEReference(ezSnifferManagerEClass, EZ_SNIFFER_MANAGER__SNIFFERS);
		createEReference(ezSnifferManagerEClass, EZ_SNIFFER_MANAGER__CACHE);
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
		EzmappingPackage theEzmappingPackage = (EzmappingPackage)EPackage.Registry.INSTANCE.getEPackage(EzmappingPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		CmdPackage theCmdPackage = (CmdPackage)EPackage.Registry.INSTANCE.getEPackage(CmdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ezSniffProtocolGroupEClass.getESuperTypes().add(this.getAbstractEZSniffElem());
		ezSniffHitEClass.getESuperTypes().add(this.getAbstractEZSniffElem());

		// Initialize classes and features; add operations and parameters
		initEClass(ezSnifferEClass, EZSniffer.class, "EZSniffer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEZSniffer_Id(), ecorePackage.getEString(), "id", null, 0, 1, EZSniffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEZSniffer_Hits(), this.getAbstractEZSniffElem(), null, "hits", null, 0, -1, EZSniffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEZSniffer_Label(), ecorePackage.getEString(), "label", null, 0, 1, EZSniffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEZSniffer_Mappings(), theEzmappingPackage.getEZMapping(), null, "mappings", null, 0, -1, EZSniffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ezSniffProtocolGroupEClass, EZSniffProtocolGroup.class, "EZSniffProtocolGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEZSniffProtocolGroup_Children(), this.getAbstractEZSniffElem(), null, "children", null, 0, -1, EZSniffProtocolGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractEZSniffElemEClass, AbstractEZSniffElem.class, "AbstractEZSniffElem", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractEZSniffElem_Mappings(), theEzmappingPackage.getEZMapping(), null, "mappings", null, 0, 1, AbstractEZSniffElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ezSniffHitEClass, EZSniffHit.class, "EZSniffHit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEZSniffHit_Seek(), theEcorePackage.getEClassifier(), null, "seek", null, 0, 1, EZSniffHit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEZSniffHit_Hit(), theCmdPackage.getXCmd(), null, "hit", null, 0, 1, EZSniffHit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ezSnifferManagerEClass, EZSnifferManager.class, "EZSnifferManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEZSnifferManager_Id(), ecorePackage.getEString(), "id", null, 0, 1, EZSnifferManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEZSnifferManager_Sniffers(), this.getEZSniffer(), null, "sniffers", null, 0, -1, EZSnifferManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEZSnifferManager_Cache(), theEcorePackage.getEClassifier(), null, "cache", null, 0, -1, EZSnifferManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EzsniffPackageImpl
