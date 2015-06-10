/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmapping;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezmapping.EzmappingFactory
 * @model kind="package"
 * @generated
 */
public interface EzmappingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezmapping";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ezmapping/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezmapping";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzmappingPackage eINSTANCE = net.sf.smbt.ezmapping.impl.EzmappingPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmapping.impl.AbstractEZMappingElemImpl <em>Abstract EZ Mapping Elem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmapping.impl.AbstractEZMappingElemImpl
	 * @see net.sf.smbt.ezmapping.impl.EzmappingPackageImpl#getAbstractEZMappingElem()
	 * @generated
	 */
	int ABSTRACT_EZ_MAPPING_ELEM = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EZ_MAPPING_ELEM__ID = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EZ_MAPPING_ELEM__LABEL = 1;

	/**
	 * The number of structural features of the '<em>Abstract EZ Mapping Elem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EZ_MAPPING_ELEM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmapping.impl.EZMappingImpl <em>EZ Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmapping.impl.EZMappingImpl
	 * @see net.sf.smbt.ezmapping.impl.EzmappingPackageImpl#getEZMapping()
	 * @generated
	 */
	int EZ_MAPPING = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MAPPING__ID = ABSTRACT_EZ_MAPPING_ELEM__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MAPPING__LABEL = ABSTRACT_EZ_MAPPING_ELEM__LABEL;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MAPPING__FROM = ABSTRACT_EZ_MAPPING_ELEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MAPPING__TO = ABSTRACT_EZ_MAPPING_ELEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EZ Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MAPPING_FEATURE_COUNT = ABSTRACT_EZ_MAPPING_ELEM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmapping.impl.EZMappingManagerImpl <em>EZ Mapping Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmapping.impl.EZMappingManagerImpl
	 * @see net.sf.smbt.ezmapping.impl.EzmappingPackageImpl#getEZMappingManager()
	 * @generated
	 */
	int EZ_MAPPING_MANAGER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MAPPING_MANAGER__ID = 0;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MAPPING_MANAGER__MAPPINGS = 1;

	/**
	 * The number of structural features of the '<em>EZ Mapping Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MAPPING_MANAGER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmapping.impl.EZMappingCategoryImpl <em>EZ Mapping Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmapping.impl.EZMappingCategoryImpl
	 * @see net.sf.smbt.ezmapping.impl.EzmappingPackageImpl#getEZMappingCategory()
	 * @generated
	 */
	int EZ_MAPPING_CATEGORY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MAPPING_CATEGORY__ID = ABSTRACT_EZ_MAPPING_ELEM__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MAPPING_CATEGORY__LABEL = ABSTRACT_EZ_MAPPING_ELEM__LABEL;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MAPPING_CATEGORY__CHILDREN = ABSTRACT_EZ_MAPPING_ELEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EZ Mapping Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MAPPING_CATEGORY_FEATURE_COUNT = ABSTRACT_EZ_MAPPING_ELEM_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezmapping.EZMapping <em>EZ Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EZ Mapping</em>'.
	 * @see net.sf.smbt.ezmapping.EZMapping
	 * @generated
	 */
	EClass getEZMapping();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezmapping.EZMapping#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see net.sf.smbt.ezmapping.EZMapping#getFrom()
	 * @see #getEZMapping()
	 * @generated
	 */
	EReference getEZMapping_From();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezmapping.EZMapping#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see net.sf.smbt.ezmapping.EZMapping#getTo()
	 * @see #getEZMapping()
	 * @generated
	 */
	EReference getEZMapping_To();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezmapping.EZMappingManager <em>EZ Mapping Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EZ Mapping Manager</em>'.
	 * @see net.sf.smbt.ezmapping.EZMappingManager
	 * @generated
	 */
	EClass getEZMappingManager();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmapping.EZMappingManager#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.smbt.ezmapping.EZMappingManager#getId()
	 * @see #getEZMappingManager()
	 * @generated
	 */
	EAttribute getEZMappingManager_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezmapping.EZMappingManager#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see net.sf.smbt.ezmapping.EZMappingManager#getMappings()
	 * @see #getEZMappingManager()
	 * @generated
	 */
	EReference getEZMappingManager_Mappings();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezmapping.EZMappingCategory <em>EZ Mapping Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EZ Mapping Category</em>'.
	 * @see net.sf.smbt.ezmapping.EZMappingCategory
	 * @generated
	 */
	EClass getEZMappingCategory();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezmapping.EZMappingCategory#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see net.sf.smbt.ezmapping.EZMappingCategory#getChildren()
	 * @see #getEZMappingCategory()
	 * @generated
	 */
	EReference getEZMappingCategory_Children();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezmapping.AbstractEZMappingElem <em>Abstract EZ Mapping Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract EZ Mapping Elem</em>'.
	 * @see net.sf.smbt.ezmapping.AbstractEZMappingElem
	 * @generated
	 */
	EClass getAbstractEZMappingElem();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmapping.AbstractEZMappingElem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.smbt.ezmapping.AbstractEZMappingElem#getId()
	 * @see #getAbstractEZMappingElem()
	 * @generated
	 */
	EAttribute getAbstractEZMappingElem_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmapping.AbstractEZMappingElem#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.sf.smbt.ezmapping.AbstractEZMappingElem#getLabel()
	 * @see #getAbstractEZMappingElem()
	 * @generated
	 */
	EAttribute getAbstractEZMappingElem_Label();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EzmappingFactory getEzmappingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmapping.impl.EZMappingImpl <em>EZ Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmapping.impl.EZMappingImpl
		 * @see net.sf.smbt.ezmapping.impl.EzmappingPackageImpl#getEZMapping()
		 * @generated
		 */
		EClass EZ_MAPPING = eINSTANCE.getEZMapping();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_MAPPING__FROM = eINSTANCE.getEZMapping_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_MAPPING__TO = eINSTANCE.getEZMapping_To();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmapping.impl.EZMappingManagerImpl <em>EZ Mapping Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmapping.impl.EZMappingManagerImpl
		 * @see net.sf.smbt.ezmapping.impl.EzmappingPackageImpl#getEZMappingManager()
		 * @generated
		 */
		EClass EZ_MAPPING_MANAGER = eINSTANCE.getEZMappingManager();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_MAPPING_MANAGER__ID = eINSTANCE.getEZMappingManager_Id();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_MAPPING_MANAGER__MAPPINGS = eINSTANCE.getEZMappingManager_Mappings();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmapping.impl.EZMappingCategoryImpl <em>EZ Mapping Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmapping.impl.EZMappingCategoryImpl
		 * @see net.sf.smbt.ezmapping.impl.EzmappingPackageImpl#getEZMappingCategory()
		 * @generated
		 */
		EClass EZ_MAPPING_CATEGORY = eINSTANCE.getEZMappingCategory();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_MAPPING_CATEGORY__CHILDREN = eINSTANCE.getEZMappingCategory_Children();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmapping.impl.AbstractEZMappingElemImpl <em>Abstract EZ Mapping Elem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmapping.impl.AbstractEZMappingElemImpl
		 * @see net.sf.smbt.ezmapping.impl.EzmappingPackageImpl#getAbstractEZMappingElem()
		 * @generated
		 */
		EClass ABSTRACT_EZ_MAPPING_ELEM = eINSTANCE.getAbstractEZMappingElem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_EZ_MAPPING_ELEM__ID = eINSTANCE.getAbstractEZMappingElem_Id();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_EZ_MAPPING_ELEM__LABEL = eINSTANCE.getAbstractEZMappingElem_Label();

	}

} //EzmappingPackage
