/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.comm;

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
 * @see net.sf.smbt.comm.CommFactory
 * @model kind="package"
 * @generated
 */
public interface CommPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "comm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://comm/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "comm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommPackage eINSTANCE = net.sf.smbt.comm.impl.CommPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.comm.impl.UdpPortImpl <em>Udp Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.comm.impl.UdpPortImpl
	 * @see net.sf.smbt.comm.impl.CommPackageImpl#getUdpPort()
	 * @generated
	 */
	int UDP_PORT = 0;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_PORT__ENGINE = EnginePackage.PORT__ENGINE;

	/**
	 * The feature id for the '<em><b>Input Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_PORT__INPUT_JOBS = EnginePackage.PORT__INPUT_JOBS;

	/**
	 * The feature id for the '<em><b>Output Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_PORT__OUTPUT_JOBS = EnginePackage.PORT__OUTPUT_JOBS;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_PORT__CHANNEL = EnginePackage.PORT__CHANNEL;

	/**
	 * The number of structural features of the '<em>Udp Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_PORT_FEATURE_COUNT = EnginePackage.PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.comm.impl.TcpPortImpl <em>Tcp Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.comm.impl.TcpPortImpl
	 * @see net.sf.smbt.comm.impl.CommPackageImpl#getTcpPort()
	 * @generated
	 */
	int TCP_PORT = 1;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_PORT__ENGINE = EnginePackage.PORT__ENGINE;

	/**
	 * The feature id for the '<em><b>Input Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_PORT__INPUT_JOBS = EnginePackage.PORT__INPUT_JOBS;

	/**
	 * The feature id for the '<em><b>Output Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_PORT__OUTPUT_JOBS = EnginePackage.PORT__OUTPUT_JOBS;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_PORT__CHANNEL = EnginePackage.PORT__CHANNEL;

	/**
	 * The number of structural features of the '<em>Tcp Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_PORT_FEATURE_COUNT = EnginePackage.PORT_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link net.sf.smbt.comm.impl.UsbPortImpl <em>Usb Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.comm.impl.UsbPortImpl
	 * @see net.sf.smbt.comm.impl.CommPackageImpl#getUsbPort()
	 * @generated
	 */
	int USB_PORT = 2;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USB_PORT__ENGINE = EnginePackage.PORT__ENGINE;

	/**
	 * The feature id for the '<em><b>Input Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USB_PORT__INPUT_JOBS = EnginePackage.PORT__INPUT_JOBS;

	/**
	 * The feature id for the '<em><b>Output Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USB_PORT__OUTPUT_JOBS = EnginePackage.PORT__OUTPUT_JOBS;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USB_PORT__CHANNEL = EnginePackage.PORT__CHANNEL;

	/**
	 * The number of structural features of the '<em>Usb Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USB_PORT_FEATURE_COUNT = EnginePackage.PORT_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link net.sf.smbt.comm.impl.BTPortImpl <em>BT Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.comm.impl.BTPortImpl
	 * @see net.sf.smbt.comm.impl.CommPackageImpl#getBTPort()
	 * @generated
	 */
	int BT_PORT = 3;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BT_PORT__ENGINE = EnginePackage.PORT__ENGINE;

	/**
	 * The feature id for the '<em><b>Input Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BT_PORT__INPUT_JOBS = EnginePackage.PORT__INPUT_JOBS;

	/**
	 * The feature id for the '<em><b>Output Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BT_PORT__OUTPUT_JOBS = EnginePackage.PORT__OUTPUT_JOBS;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BT_PORT__CHANNEL = EnginePackage.PORT__CHANNEL;

	/**
	 * The number of structural features of the '<em>BT Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BT_PORT_FEATURE_COUNT = EnginePackage.PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.comm.impl.HttpPortImpl <em>Http Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.comm.impl.HttpPortImpl
	 * @see net.sf.smbt.comm.impl.CommPackageImpl#getHttpPort()
	 * @generated
	 */
	int HTTP_PORT = 4;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PORT__ENGINE = EnginePackage.PORT__ENGINE;

	/**
	 * The feature id for the '<em><b>Input Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PORT__INPUT_JOBS = EnginePackage.PORT__INPUT_JOBS;

	/**
	 * The feature id for the '<em><b>Output Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PORT__OUTPUT_JOBS = EnginePackage.PORT__OUTPUT_JOBS;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PORT__CHANNEL = EnginePackage.PORT__CHANNEL;

	/**
	 * The number of structural features of the '<em>Http Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PORT_FEATURE_COUNT = EnginePackage.PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.comm.impl.XBeePortImpl <em>XBee Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.comm.impl.XBeePortImpl
	 * @see net.sf.smbt.comm.impl.CommPackageImpl#getXBeePort()
	 * @generated
	 */
	int XBEE_PORT = 5;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_PORT__ENGINE = EnginePackage.PORT__ENGINE;

	/**
	 * The feature id for the '<em><b>Input Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_PORT__INPUT_JOBS = EnginePackage.PORT__INPUT_JOBS;

	/**
	 * The feature id for the '<em><b>Output Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_PORT__OUTPUT_JOBS = EnginePackage.PORT__OUTPUT_JOBS;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_PORT__CHANNEL = EnginePackage.PORT__CHANNEL;

	/**
	 * The number of structural features of the '<em>XBee Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_PORT_FEATURE_COUNT = EnginePackage.PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.comm.impl.UbiPortImpl <em>Ubi Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.comm.impl.UbiPortImpl
	 * @see net.sf.smbt.comm.impl.CommPackageImpl#getUbiPort()
	 * @generated
	 */
	int UBI_PORT = 6;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBI_PORT__ENGINE = EnginePackage.PORT__ENGINE;

	/**
	 * The feature id for the '<em><b>Input Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBI_PORT__INPUT_JOBS = EnginePackage.PORT__INPUT_JOBS;

	/**
	 * The feature id for the '<em><b>Output Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBI_PORT__OUTPUT_JOBS = EnginePackage.PORT__OUTPUT_JOBS;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBI_PORT__CHANNEL = EnginePackage.PORT__CHANNEL;

	/**
	 * The number of structural features of the '<em>Ubi Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UBI_PORT_FEATURE_COUNT = EnginePackage.PORT_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link net.sf.smbt.comm.impl.UdpInJobImpl <em>Udp In Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.comm.impl.UdpInJobImpl
	 * @see net.sf.smbt.comm.impl.CommPackageImpl#getUdpInJob()
	 * @generated
	 */
	int UDP_IN_JOB = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_IN_JOB__ID = EnginePackage.INPUT_JOB__ID;

	/**
	 * The feature id for the '<em><b>Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_IN_JOB__JOB = EnginePackage.INPUT_JOB__JOB;

	/**
	 * The number of structural features of the '<em>Udp In Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_IN_JOB_FEATURE_COUNT = EnginePackage.INPUT_JOB_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.comm.impl.TcpInJobImpl <em>Tcp In Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.comm.impl.TcpInJobImpl
	 * @see net.sf.smbt.comm.impl.CommPackageImpl#getTcpInJob()
	 * @generated
	 */
	int TCP_IN_JOB = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_IN_JOB__ID = EnginePackage.INPUT_JOB__ID;

	/**
	 * The feature id for the '<em><b>Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_IN_JOB__JOB = EnginePackage.INPUT_JOB__JOB;

	/**
	 * The number of structural features of the '<em>Tcp In Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_IN_JOB_FEATURE_COUNT = EnginePackage.INPUT_JOB_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.comm.impl.UdpOutJobImpl <em>Udp Out Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.comm.impl.UdpOutJobImpl
	 * @see net.sf.smbt.comm.impl.CommPackageImpl#getUdpOutJob()
	 * @generated
	 */
	int UDP_OUT_JOB = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_OUT_JOB__ID = EnginePackage.OUTPUT_JOB__ID;

	/**
	 * The feature id for the '<em><b>Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_OUT_JOB__JOB = EnginePackage.OUTPUT_JOB__JOB;

	/**
	 * The number of structural features of the '<em>Udp Out Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_OUT_JOB_FEATURE_COUNT = EnginePackage.OUTPUT_JOB_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.comm.impl.TcpOutJobImpl <em>Tcp Out Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.comm.impl.TcpOutJobImpl
	 * @see net.sf.smbt.comm.impl.CommPackageImpl#getTcpOutJob()
	 * @generated
	 */
	int TCP_OUT_JOB = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_OUT_JOB__ID = EnginePackage.OUTPUT_JOB__ID;

	/**
	 * The feature id for the '<em><b>Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_OUT_JOB__JOB = EnginePackage.OUTPUT_JOB__JOB;

	/**
	 * The number of structural features of the '<em>Tcp Out Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_OUT_JOB_FEATURE_COUNT = EnginePackage.OUTPUT_JOB_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link net.sf.smbt.comm.impl.ProcessPortImpl <em>Process Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.comm.impl.ProcessPortImpl
	 * @see net.sf.smbt.comm.impl.CommPackageImpl#getProcessPort()
	 * @generated
	 */
	int PROCESS_PORT = 11;

	/**
	 * The feature id for the '<em><b>Engine</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PORT__ENGINE = EnginePackage.PORT__ENGINE;

	/**
	 * The feature id for the '<em><b>Input Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PORT__INPUT_JOBS = EnginePackage.PORT__INPUT_JOBS;

	/**
	 * The feature id for the '<em><b>Output Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PORT__OUTPUT_JOBS = EnginePackage.PORT__OUTPUT_JOBS;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PORT__CHANNEL = EnginePackage.PORT__CHANNEL;

	/**
	 * The number of structural features of the '<em>Process Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_PORT_FEATURE_COUNT = EnginePackage.PORT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.comm.UdpPort <em>Udp Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Udp Port</em>'.
	 * @see net.sf.smbt.comm.UdpPort
	 * @generated
	 */
	EClass getUdpPort();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.comm.TcpPort <em>Tcp Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tcp Port</em>'.
	 * @see net.sf.smbt.comm.TcpPort
	 * @generated
	 */
	EClass getTcpPort();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.comm.UsbPort <em>Usb Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usb Port</em>'.
	 * @see net.sf.smbt.comm.UsbPort
	 * @generated
	 */
	EClass getUsbPort();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.comm.BTPort <em>BT Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BT Port</em>'.
	 * @see net.sf.smbt.comm.BTPort
	 * @generated
	 */
	EClass getBTPort();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.comm.HttpPort <em>Http Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Http Port</em>'.
	 * @see net.sf.smbt.comm.HttpPort
	 * @generated
	 */
	EClass getHttpPort();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.comm.XBeePort <em>XBee Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XBee Port</em>'.
	 * @see net.sf.smbt.comm.XBeePort
	 * @generated
	 */
	EClass getXBeePort();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.comm.UbiPort <em>Ubi Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ubi Port</em>'.
	 * @see net.sf.smbt.comm.UbiPort
	 * @generated
	 */
	EClass getUbiPort();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.comm.UdpInJob <em>Udp In Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Udp In Job</em>'.
	 * @see net.sf.smbt.comm.UdpInJob
	 * @generated
	 */
	EClass getUdpInJob();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.comm.TcpInJob <em>Tcp In Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tcp In Job</em>'.
	 * @see net.sf.smbt.comm.TcpInJob
	 * @generated
	 */
	EClass getTcpInJob();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.comm.UdpOutJob <em>Udp Out Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Udp Out Job</em>'.
	 * @see net.sf.smbt.comm.UdpOutJob
	 * @generated
	 */
	EClass getUdpOutJob();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.comm.TcpOutJob <em>Tcp Out Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tcp Out Job</em>'.
	 * @see net.sf.smbt.comm.TcpOutJob
	 * @generated
	 */
	EClass getTcpOutJob();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.comm.ProcessPort <em>Process Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Port</em>'.
	 * @see net.sf.smbt.comm.ProcessPort
	 * @generated
	 */
	EClass getProcessPort();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommFactory getCommFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.comm.impl.UdpPortImpl <em>Udp Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.comm.impl.UdpPortImpl
		 * @see net.sf.smbt.comm.impl.CommPackageImpl#getUdpPort()
		 * @generated
		 */
		EClass UDP_PORT = eINSTANCE.getUdpPort();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.comm.impl.TcpPortImpl <em>Tcp Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.comm.impl.TcpPortImpl
		 * @see net.sf.smbt.comm.impl.CommPackageImpl#getTcpPort()
		 * @generated
		 */
		EClass TCP_PORT = eINSTANCE.getTcpPort();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.comm.impl.UsbPortImpl <em>Usb Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.comm.impl.UsbPortImpl
		 * @see net.sf.smbt.comm.impl.CommPackageImpl#getUsbPort()
		 * @generated
		 */
		EClass USB_PORT = eINSTANCE.getUsbPort();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.comm.impl.BTPortImpl <em>BT Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.comm.impl.BTPortImpl
		 * @see net.sf.smbt.comm.impl.CommPackageImpl#getBTPort()
		 * @generated
		 */
		EClass BT_PORT = eINSTANCE.getBTPort();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.comm.impl.HttpPortImpl <em>Http Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.comm.impl.HttpPortImpl
		 * @see net.sf.smbt.comm.impl.CommPackageImpl#getHttpPort()
		 * @generated
		 */
		EClass HTTP_PORT = eINSTANCE.getHttpPort();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.comm.impl.XBeePortImpl <em>XBee Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.comm.impl.XBeePortImpl
		 * @see net.sf.smbt.comm.impl.CommPackageImpl#getXBeePort()
		 * @generated
		 */
		EClass XBEE_PORT = eINSTANCE.getXBeePort();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.comm.impl.UbiPortImpl <em>Ubi Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.comm.impl.UbiPortImpl
		 * @see net.sf.smbt.comm.impl.CommPackageImpl#getUbiPort()
		 * @generated
		 */
		EClass UBI_PORT = eINSTANCE.getUbiPort();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.comm.impl.UdpInJobImpl <em>Udp In Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.comm.impl.UdpInJobImpl
		 * @see net.sf.smbt.comm.impl.CommPackageImpl#getUdpInJob()
		 * @generated
		 */
		EClass UDP_IN_JOB = eINSTANCE.getUdpInJob();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.comm.impl.TcpInJobImpl <em>Tcp In Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.comm.impl.TcpInJobImpl
		 * @see net.sf.smbt.comm.impl.CommPackageImpl#getTcpInJob()
		 * @generated
		 */
		EClass TCP_IN_JOB = eINSTANCE.getTcpInJob();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.comm.impl.UdpOutJobImpl <em>Udp Out Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.comm.impl.UdpOutJobImpl
		 * @see net.sf.smbt.comm.impl.CommPackageImpl#getUdpOutJob()
		 * @generated
		 */
		EClass UDP_OUT_JOB = eINSTANCE.getUdpOutJob();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.comm.impl.TcpOutJobImpl <em>Tcp Out Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.comm.impl.TcpOutJobImpl
		 * @see net.sf.smbt.comm.impl.CommPackageImpl#getTcpOutJob()
		 * @generated
		 */
		EClass TCP_OUT_JOB = eINSTANCE.getTcpOutJob();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.comm.impl.ProcessPortImpl <em>Process Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.comm.impl.ProcessPortImpl
		 * @see net.sf.smbt.comm.impl.CommPackageImpl#getProcessPort()
		 * @generated
		 */
		EClass PROCESS_PORT = eINSTANCE.getProcessPort();

	}

} //CommPackage
