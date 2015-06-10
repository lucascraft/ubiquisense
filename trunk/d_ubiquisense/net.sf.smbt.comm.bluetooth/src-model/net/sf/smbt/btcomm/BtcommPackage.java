/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.btcomm;

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
 * @see net.sf.smbt.btcomm.BtcommFactory
 * @model kind="package"
 * @generated
 */
public interface BtcommPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "btcomm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://btcomm/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "btcomm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BtcommPackage eINSTANCE = net.sf.smbt.btcomm.impl.BtcommPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.btcomm.impl.BluetoothPortImpl <em>Bluetooth Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btcomm.impl.BluetoothPortImpl
	 * @see net.sf.smbt.btcomm.impl.BtcommPackageImpl#getBluetoothPort()
	 * @generated
	 */
	int BLUETOOTH_PORT = 0;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_PORT__ENGINE = EnginePackage.PORT__ENGINE;

	/**
	 * The feature id for the '<em><b>Input Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_PORT__INPUT_JOBS = EnginePackage.PORT__INPUT_JOBS;

	/**
	 * The feature id for the '<em><b>Output Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_PORT__OUTPUT_JOBS = EnginePackage.PORT__OUTPUT_JOBS;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_PORT__CHANNEL = EnginePackage.PORT__CHANNEL;

	/**
	 * The number of structural features of the '<em>Bluetooth Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_PORT_FEATURE_COUNT = EnginePackage.PORT_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link net.sf.smbt.btcomm.impl.L2CAPInJobImpl <em>L2CAP In Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btcomm.impl.L2CAPInJobImpl
	 * @see net.sf.smbt.btcomm.impl.BtcommPackageImpl#getL2CAPInJob()
	 * @generated
	 */
	int L2CAP_IN_JOB = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int L2CAP_IN_JOB__ID = EnginePackage.INPUT_JOB__ID;

	/**
	 * The feature id for the '<em><b>Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int L2CAP_IN_JOB__JOB = EnginePackage.INPUT_JOB__JOB;

	/**
	 * The number of structural features of the '<em>L2CAP In Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int L2CAP_IN_JOB_FEATURE_COUNT = EnginePackage.INPUT_JOB_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.btcomm.impl.L2CAPoutJobImpl <em>L2CA Pout Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.btcomm.impl.L2CAPoutJobImpl
	 * @see net.sf.smbt.btcomm.impl.BtcommPackageImpl#getL2CAPoutJob()
	 * @generated
	 */
	int L2CA_POUT_JOB = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int L2CA_POUT_JOB__ID = EnginePackage.OUTPUT_JOB__ID;

	/**
	 * The feature id for the '<em><b>Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int L2CA_POUT_JOB__JOB = EnginePackage.OUTPUT_JOB__JOB;

	/**
	 * The number of structural features of the '<em>L2CA Pout Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int L2CA_POUT_JOB_FEATURE_COUNT = EnginePackage.OUTPUT_JOB_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btcomm.BluetoothPort <em>Bluetooth Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bluetooth Port</em>'.
	 * @see net.sf.smbt.btcomm.BluetoothPort
	 * @generated
	 */
	EClass getBluetoothPort();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btcomm.L2CAPInJob <em>L2CAP In Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>L2CAP In Job</em>'.
	 * @see net.sf.smbt.btcomm.L2CAPInJob
	 * @generated
	 */
	EClass getL2CAPInJob();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.btcomm.L2CAPoutJob <em>L2CA Pout Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>L2CA Pout Job</em>'.
	 * @see net.sf.smbt.btcomm.L2CAPoutJob
	 * @generated
	 */
	EClass getL2CAPoutJob();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BtcommFactory getBtcommFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.btcomm.impl.BluetoothPortImpl <em>Bluetooth Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btcomm.impl.BluetoothPortImpl
		 * @see net.sf.smbt.btcomm.impl.BtcommPackageImpl#getBluetoothPort()
		 * @generated
		 */
		EClass BLUETOOTH_PORT = eINSTANCE.getBluetoothPort();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.btcomm.impl.L2CAPInJobImpl <em>L2CAP In Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btcomm.impl.L2CAPInJobImpl
		 * @see net.sf.smbt.btcomm.impl.BtcommPackageImpl#getL2CAPInJob()
		 * @generated
		 */
		EClass L2CAP_IN_JOB = eINSTANCE.getL2CAPInJob();
		/**
		 * The meta object literal for the '{@link net.sf.smbt.btcomm.impl.L2CAPoutJobImpl <em>L2CA Pout Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.btcomm.impl.L2CAPoutJobImpl
		 * @see net.sf.smbt.btcomm.impl.BtcommPackageImpl#getL2CAPoutJob()
		 * @generated
		 */
		EClass L2CA_POUT_JOB = eINSTANCE.getL2CAPoutJob();

	}

} //BtcommPackage
