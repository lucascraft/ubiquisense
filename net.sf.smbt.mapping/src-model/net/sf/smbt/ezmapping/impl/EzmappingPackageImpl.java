/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmapping.impl;

import net.sf.smbt.ezmapping.AbstractEZMappingElem;
import net.sf.smbt.ezmapping.EZMapping;
import net.sf.smbt.ezmapping.EZMappingCategory;
import net.sf.smbt.ezmapping.EZMappingManager;
import net.sf.smbt.ezmapping.EzmappingFactory;
import net.sf.smbt.ezmapping.EzmappingPackage;
import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
public class EzmappingPackageImpl extends EPackageImpl implements EzmappingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezMappingManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezMappingCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEZMappingElemEClass = null;

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
	 * @see net.sf.smbt.ezmapping.EzmappingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EzmappingPackageImpl() {
		super(eNS_URI, EzmappingFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EzmappingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EzmappingPackage init() {
		if (isInited) return (EzmappingPackage)EPackage.Registry.INSTANCE.getEPackage(EzmappingPackage.eNS_URI);

		// Obtain or create and register package
		EzmappingPackageImpl theEzmappingPackage = (EzmappingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EzmappingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EzmappingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEzmappingPackage.createPackageContents();

		// Initialize created meta-data
		theEzmappingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEzmappingPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EzmappingPackage.eNS_URI, theEzmappingPackage);
		return theEzmappingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEZMapping() {
		return ezMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZMapping_From() {
		return (EReference)ezMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZMapping_To() {
		return (EReference)ezMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEZMappingManager() {
		return ezMappingManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZMappingManager_Id() {
		return (EAttribute)ezMappingManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZMappingManager_Mappings() {
		return (EReference)ezMappingManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEZMappingCategory() {
		return ezMappingCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZMappingCategory_Children() {
		return (EReference)ezMappingCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractEZMappingElem() {
		return abstractEZMappingElemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractEZMappingElem_Id() {
		return (EAttribute)abstractEZMappingElemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractEZMappingElem_Label() {
		return (EAttribute)abstractEZMappingElemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzmappingFactory getEzmappingFactory() {
		return (EzmappingFactory)getEFactoryInstance();
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
		ezMappingEClass = createEClass(EZ_MAPPING);
		createEReference(ezMappingEClass, EZ_MAPPING__FROM);
		createEReference(ezMappingEClass, EZ_MAPPING__TO);

		ezMappingManagerEClass = createEClass(EZ_MAPPING_MANAGER);
		createEAttribute(ezMappingManagerEClass, EZ_MAPPING_MANAGER__ID);
		createEReference(ezMappingManagerEClass, EZ_MAPPING_MANAGER__MAPPINGS);

		ezMappingCategoryEClass = createEClass(EZ_MAPPING_CATEGORY);
		createEReference(ezMappingCategoryEClass, EZ_MAPPING_CATEGORY__CHILDREN);

		abstractEZMappingElemEClass = createEClass(ABSTRACT_EZ_MAPPING_ELEM);
		createEAttribute(abstractEZMappingElemEClass, ABSTRACT_EZ_MAPPING_ELEM__ID);
		createEAttribute(abstractEZMappingElemEClass, ABSTRACT_EZ_MAPPING_ELEM__LABEL);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		CmdPackage theCmdPackage = (CmdPackage)EPackage.Registry.INSTANCE.getEPackage(CmdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ezMappingEClass.getESuperTypes().add(this.getAbstractEZMappingElem());
		ezMappingCategoryEClass.getESuperTypes().add(this.getAbstractEZMappingElem());

		// Initialize classes and features; add operations and parameters
		initEClass(ezMappingEClass, EZMapping.class, "EZMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEZMapping_From(), theEcorePackage.getEClassifier(), null, "from", null, 0, 1, EZMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEZMapping_To(), theEcorePackage.getEClassifier(), null, "to", null, 0, 1, EZMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(ezMappingEClass, theCmdPackage.getXCmd(), "left2right", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCmdPackage.getXCmd(), "cmd", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ezMappingEClass, theCmdPackage.getXCmd(), "right2left", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theCmdPackage.getXCmd(), "cmd", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ezMappingManagerEClass, EZMappingManager.class, "EZMappingManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEZMappingManager_Id(), ecorePackage.getEString(), "id", null, 0, 1, EZMappingManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEZMappingManager_Mappings(), this.getAbstractEZMappingElem(), null, "mappings", null, 0, -1, EZMappingManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ezMappingCategoryEClass, EZMappingCategory.class, "EZMappingCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEZMappingCategory_Children(), this.getAbstractEZMappingElem(), null, "children", null, 0, -1, EZMappingCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractEZMappingElemEClass, AbstractEZMappingElem.class, "AbstractEZMappingElem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractEZMappingElem_Id(), ecorePackage.getEString(), "id", null, 0, 1, AbstractEZMappingElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractEZMappingElem_Label(), ecorePackage.getEString(), "label", null, 0, 1, AbstractEZMappingElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EzmappingPackageImpl
