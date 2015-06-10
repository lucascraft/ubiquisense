/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.httpcomm;

import net.sf.xqz.model.engine.EnginePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see net.sf.smbt.httpcomm.HttpcommFactory
 * @model kind="package"
 * @generated
 */
public interface HttpcommPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "httpcomm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://httpcomm/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "httpcomm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HttpcommPackage eINSTANCE = net.sf.smbt.httpcomm.impl.HttpcommPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.httpcomm.impl.HttpCommPortImpl <em>Http Comm Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.httpcomm.impl.HttpCommPortImpl
	 * @see net.sf.smbt.httpcomm.impl.HttpcommPackageImpl#getHttpCommPort()
	 * @generated
	 */
	int HTTP_COMM_PORT = 0;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_COMM_PORT__ENGINE = EnginePackage.PORT__ENGINE;

	/**
	 * The feature id for the '<em><b>Input Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_COMM_PORT__INPUT_JOBS = EnginePackage.PORT__INPUT_JOBS;

	/**
	 * The feature id for the '<em><b>Output Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_COMM_PORT__OUTPUT_JOBS = EnginePackage.PORT__OUTPUT_JOBS;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_COMM_PORT__CHANNEL = EnginePackage.PORT__CHANNEL;

	/**
	 * The number of structural features of the '<em>Http Comm Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_COMM_PORT_FEATURE_COUNT = EnginePackage.PORT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.httpcomm.HttpCommPort <em>Http Comm Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Http Comm Port</em>'.
	 * @see net.sf.smbt.httpcomm.HttpCommPort
	 * @generated
	 */
	EClass getHttpCommPort();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HttpcommFactory getHttpcommFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.httpcomm.impl.HttpCommPortImpl <em>Http Comm Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.httpcomm.impl.HttpCommPortImpl
		 * @see net.sf.smbt.httpcomm.impl.HttpcommPackageImpl#getHttpCommPort()
		 * @generated
		 */
		EClass HTTP_COMM_PORT = eINSTANCE.getHttpCommPort();

	}

} //HttpcommPackage
