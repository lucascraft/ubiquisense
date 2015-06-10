/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsniff;

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
 * @see net.sf.smbt.ezsniff.EzsniffFactory
 * @model kind="package"
 * @generated
 */
public interface EzsniffPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezsniff";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ezsniff/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezsniff";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzsniffPackage eINSTANCE = net.sf.smbt.ezsniff.impl.EzsniffPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsniff.impl.EZSnifferImpl <em>EZ Sniffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsniff.impl.EZSnifferImpl
	 * @see net.sf.smbt.ezsniff.impl.EzsniffPackageImpl#getEZSniffer()
	 * @generated
	 */
	int EZ_SNIFFER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_SNIFFER__ID = 0;

	/**
	 * The feature id for the '<em><b>Hits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_SNIFFER__HITS = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_SNIFFER__LABEL = 2;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_SNIFFER__MAPPINGS = 3;

	/**
	 * The number of structural features of the '<em>EZ Sniffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_SNIFFER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsniff.AbstractEZSniffElem <em>Abstract EZ Sniff Elem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsniff.AbstractEZSniffElem
	 * @see net.sf.smbt.ezsniff.impl.EzsniffPackageImpl#getAbstractEZSniffElem()
	 * @generated
	 */
	int ABSTRACT_EZ_SNIFF_ELEM = 2;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EZ_SNIFF_ELEM__MAPPINGS = 0;

	/**
	 * The number of structural features of the '<em>Abstract EZ Sniff Elem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_EZ_SNIFF_ELEM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsniff.impl.EZSniffProtocolGroupImpl <em>EZ Sniff Protocol Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsniff.impl.EZSniffProtocolGroupImpl
	 * @see net.sf.smbt.ezsniff.impl.EzsniffPackageImpl#getEZSniffProtocolGroup()
	 * @generated
	 */
	int EZ_SNIFF_PROTOCOL_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_SNIFF_PROTOCOL_GROUP__MAPPINGS = ABSTRACT_EZ_SNIFF_ELEM__MAPPINGS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_SNIFF_PROTOCOL_GROUP__CHILDREN = ABSTRACT_EZ_SNIFF_ELEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EZ Sniff Protocol Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_SNIFF_PROTOCOL_GROUP_FEATURE_COUNT = ABSTRACT_EZ_SNIFF_ELEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsniff.impl.EZSniffHitImpl <em>EZ Sniff Hit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsniff.impl.EZSniffHitImpl
	 * @see net.sf.smbt.ezsniff.impl.EzsniffPackageImpl#getEZSniffHit()
	 * @generated
	 */
	int EZ_SNIFF_HIT = 3;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_SNIFF_HIT__MAPPINGS = ABSTRACT_EZ_SNIFF_ELEM__MAPPINGS;

	/**
	 * The feature id for the '<em><b>Seek</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_SNIFF_HIT__SEEK = ABSTRACT_EZ_SNIFF_ELEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_SNIFF_HIT__HIT = ABSTRACT_EZ_SNIFF_ELEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EZ Sniff Hit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_SNIFF_HIT_FEATURE_COUNT = ABSTRACT_EZ_SNIFF_ELEM_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezsniff.impl.EZSnifferManagerImpl <em>EZ Sniffer Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezsniff.impl.EZSnifferManagerImpl
	 * @see net.sf.smbt.ezsniff.impl.EzsniffPackageImpl#getEZSnifferManager()
	 * @generated
	 */
	int EZ_SNIFFER_MANAGER = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_SNIFFER_MANAGER__ID = 0;

	/**
	 * The feature id for the '<em><b>Sniffers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_SNIFFER_MANAGER__SNIFFERS = 1;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_SNIFFER_MANAGER__CACHE = 2;

	/**
	 * The number of structural features of the '<em>EZ Sniffer Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_SNIFFER_MANAGER_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsniff.EZSniffer <em>EZ Sniffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EZ Sniffer</em>'.
	 * @see net.sf.smbt.ezsniff.EZSniffer
	 * @generated
	 */
	EClass getEZSniffer();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsniff.EZSniffer#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.smbt.ezsniff.EZSniffer#getId()
	 * @see #getEZSniffer()
	 * @generated
	 */
	EAttribute getEZSniffer_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezsniff.EZSniffer#getHits <em>Hits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hits</em>'.
	 * @see net.sf.smbt.ezsniff.EZSniffer#getHits()
	 * @see #getEZSniffer()
	 * @generated
	 */
	EReference getEZSniffer_Hits();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsniff.EZSniffer#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.sf.smbt.ezsniff.EZSniffer#getLabel()
	 * @see #getEZSniffer()
	 * @generated
	 */
	EAttribute getEZSniffer_Label();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.ezsniff.EZSniffer#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mappings</em>'.
	 * @see net.sf.smbt.ezsniff.EZSniffer#getMappings()
	 * @see #getEZSniffer()
	 * @generated
	 */
	EReference getEZSniffer_Mappings();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsniff.EZSniffProtocolGroup <em>EZ Sniff Protocol Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EZ Sniff Protocol Group</em>'.
	 * @see net.sf.smbt.ezsniff.EZSniffProtocolGroup
	 * @generated
	 */
	EClass getEZSniffProtocolGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezsniff.EZSniffProtocolGroup#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see net.sf.smbt.ezsniff.EZSniffProtocolGroup#getChildren()
	 * @see #getEZSniffProtocolGroup()
	 * @generated
	 */
	EReference getEZSniffProtocolGroup_Children();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsniff.AbstractEZSniffElem <em>Abstract EZ Sniff Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract EZ Sniff Elem</em>'.
	 * @see net.sf.smbt.ezsniff.AbstractEZSniffElem
	 * @generated
	 */
	EClass getAbstractEZSniffElem();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezsniff.AbstractEZSniffElem#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mappings</em>'.
	 * @see net.sf.smbt.ezsniff.AbstractEZSniffElem#getMappings()
	 * @see #getAbstractEZSniffElem()
	 * @generated
	 */
	EReference getAbstractEZSniffElem_Mappings();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsniff.EZSniffHit <em>EZ Sniff Hit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EZ Sniff Hit</em>'.
	 * @see net.sf.smbt.ezsniff.EZSniffHit
	 * @generated
	 */
	EClass getEZSniffHit();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezsniff.EZSniffHit#getSeek <em>Seek</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Seek</em>'.
	 * @see net.sf.smbt.ezsniff.EZSniffHit#getSeek()
	 * @see #getEZSniffHit()
	 * @generated
	 */
	EReference getEZSniffHit_Seek();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezsniff.EZSniffHit#getHit <em>Hit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hit</em>'.
	 * @see net.sf.smbt.ezsniff.EZSniffHit#getHit()
	 * @see #getEZSniffHit()
	 * @generated
	 */
	EReference getEZSniffHit_Hit();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezsniff.EZSnifferManager <em>EZ Sniffer Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EZ Sniffer Manager</em>'.
	 * @see net.sf.smbt.ezsniff.EZSnifferManager
	 * @generated
	 */
	EClass getEZSnifferManager();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezsniff.EZSnifferManager#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.smbt.ezsniff.EZSnifferManager#getId()
	 * @see #getEZSnifferManager()
	 * @generated
	 */
	EAttribute getEZSnifferManager_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezsniff.EZSnifferManager#getSniffers <em>Sniffers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sniffers</em>'.
	 * @see net.sf.smbt.ezsniff.EZSnifferManager#getSniffers()
	 * @see #getEZSnifferManager()
	 * @generated
	 */
	EReference getEZSnifferManager_Sniffers();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.ezsniff.EZSnifferManager#getCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cache</em>'.
	 * @see net.sf.smbt.ezsniff.EZSnifferManager#getCache()
	 * @see #getEZSnifferManager()
	 * @generated
	 */
	EReference getEZSnifferManager_Cache();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EzsniffFactory getEzsniffFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.ezsniff.impl.EZSnifferImpl <em>EZ Sniffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsniff.impl.EZSnifferImpl
		 * @see net.sf.smbt.ezsniff.impl.EzsniffPackageImpl#getEZSniffer()
		 * @generated
		 */
		EClass EZ_SNIFFER = eINSTANCE.getEZSniffer();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_SNIFFER__ID = eINSTANCE.getEZSniffer_Id();

		/**
		 * The meta object literal for the '<em><b>Hits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_SNIFFER__HITS = eINSTANCE.getEZSniffer_Hits();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_SNIFFER__LABEL = eINSTANCE.getEZSniffer_Label();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_SNIFFER__MAPPINGS = eINSTANCE.getEZSniffer_Mappings();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsniff.impl.EZSniffProtocolGroupImpl <em>EZ Sniff Protocol Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsniff.impl.EZSniffProtocolGroupImpl
		 * @see net.sf.smbt.ezsniff.impl.EzsniffPackageImpl#getEZSniffProtocolGroup()
		 * @generated
		 */
		EClass EZ_SNIFF_PROTOCOL_GROUP = eINSTANCE.getEZSniffProtocolGroup();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_SNIFF_PROTOCOL_GROUP__CHILDREN = eINSTANCE.getEZSniffProtocolGroup_Children();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsniff.AbstractEZSniffElem <em>Abstract EZ Sniff Elem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsniff.AbstractEZSniffElem
		 * @see net.sf.smbt.ezsniff.impl.EzsniffPackageImpl#getAbstractEZSniffElem()
		 * @generated
		 */
		EClass ABSTRACT_EZ_SNIFF_ELEM = eINSTANCE.getAbstractEZSniffElem();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_EZ_SNIFF_ELEM__MAPPINGS = eINSTANCE.getAbstractEZSniffElem_Mappings();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsniff.impl.EZSniffHitImpl <em>EZ Sniff Hit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsniff.impl.EZSniffHitImpl
		 * @see net.sf.smbt.ezsniff.impl.EzsniffPackageImpl#getEZSniffHit()
		 * @generated
		 */
		EClass EZ_SNIFF_HIT = eINSTANCE.getEZSniffHit();

		/**
		 * The meta object literal for the '<em><b>Seek</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_SNIFF_HIT__SEEK = eINSTANCE.getEZSniffHit_Seek();

		/**
		 * The meta object literal for the '<em><b>Hit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_SNIFF_HIT__HIT = eINSTANCE.getEZSniffHit_Hit();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezsniff.impl.EZSnifferManagerImpl <em>EZ Sniffer Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezsniff.impl.EZSnifferManagerImpl
		 * @see net.sf.smbt.ezsniff.impl.EzsniffPackageImpl#getEZSnifferManager()
		 * @generated
		 */
		EClass EZ_SNIFFER_MANAGER = eINSTANCE.getEZSnifferManager();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_SNIFFER_MANAGER__ID = eINSTANCE.getEZSnifferManager_Id();

		/**
		 * The meta object literal for the '<em><b>Sniffers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_SNIFFER_MANAGER__SNIFFERS = eINSTANCE.getEZSnifferManager_Sniffers();

		/**
		 * The meta object literal for the '<em><b>Cache</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_SNIFFER_MANAGER__CACHE = eINSTANCE.getEZSnifferManager_Cache();

	}

} //EzsniffPackage
