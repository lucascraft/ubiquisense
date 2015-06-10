/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezquant;

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
 * @see net.sf.smbt.ezquant.EzquantFactory
 * @model kind="package"
 * @generated
 */
public interface EzquantPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezquant";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ezquant/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezquant";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzquantPackage eINSTANCE = net.sf.smbt.ezquant.impl.EzquantPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezquant.impl.QHubImpl <em>QHub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezquant.impl.QHubImpl
	 * @see net.sf.smbt.ezquant.impl.EzquantPackageImpl#getQHub()
	 * @generated
	 */
	int QHUB = 0;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QHUB__CONFIGURATIONS = 0;

	/**
	 * The feature id for the '<em><b>Topology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QHUB__TOPOLOGY = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QHUB__ID = 2;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QHUB__AGENT = 3;

	/**
	 * The feature id for the '<em><b>Supervisor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QHUB__SUPERVISOR = 4;

	/**
	 * The number of structural features of the '<em>QHub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QHUB_FEATURE_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezquant.QHub <em>QHub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QHub</em>'.
	 * @see net.sf.smbt.ezquant.QHub
	 * @generated
	 */
	EClass getQHub();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezquant.QHub#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configurations</em>'.
	 * @see net.sf.smbt.ezquant.QHub#getConfigurations()
	 * @see #getQHub()
	 * @generated
	 */
	EReference getQHub_Configurations();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ezquant.QHub#getTopology <em>Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Topology</em>'.
	 * @see net.sf.smbt.ezquant.QHub#getTopology()
	 * @see #getQHub()
	 * @generated
	 */
	EReference getQHub_Topology();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezquant.QHub#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see net.sf.smbt.ezquant.QHub#getID()
	 * @see #getQHub()
	 * @generated
	 */
	EAttribute getQHub_ID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezquant.QHub#getAgent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agent</em>'.
	 * @see net.sf.smbt.ezquant.QHub#getAgent()
	 * @see #getQHub()
	 * @generated
	 */
	EAttribute getQHub_Agent();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezquant.QHub#getSupervisor <em>Supervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supervisor</em>'.
	 * @see net.sf.smbt.ezquant.QHub#getSupervisor()
	 * @see #getQHub()
	 * @generated
	 */
	EAttribute getQHub_Supervisor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EzquantFactory getEzquantFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.ezquant.impl.QHubImpl <em>QHub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezquant.impl.QHubImpl
		 * @see net.sf.smbt.ezquant.impl.EzquantPackageImpl#getQHub()
		 * @generated
		 */
		EClass QHUB = eINSTANCE.getQHub();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QHUB__CONFIGURATIONS = eINSTANCE.getQHub_Configurations();

		/**
		 * The meta object literal for the '<em><b>Topology</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QHUB__TOPOLOGY = eINSTANCE.getQHub_Topology();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QHUB__ID = eINSTANCE.getQHub_ID();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QHUB__AGENT = eINSTANCE.getQHub_Agent();

		/**
		 * The meta object literal for the '<em><b>Supervisor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QHUB__SUPERVISOR = eINSTANCE.getQHub_Supervisor();

	}

} //EzquantPackage
