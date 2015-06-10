package net.sf.smbt.xcp;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see net.sf.smbt.xcp.XcpFactory
 * @model kind="package"
 * @generated
 */
public interface XcpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xcp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.sf.net/smbt/xcp/core/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xcp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XcpPackage eINSTANCE = net.sf.smbt.xcp.impl.XcpPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.xcp.impl.XCPDeviceImpl <em>XCP Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.xcp.impl.XCPDeviceImpl
	 * @see net.sf.smbt.xcp.impl.XcpPackageImpl#getXCPDevice()
	 * @generated
	 */
	int XCP_DEVICE = 0;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCP_DEVICE__ADDR = 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCP_DEVICE__SERVICES = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCP_DEVICE__STATUS = 2;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCP_DEVICE__DEVICE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCP_DEVICE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Dns Sd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCP_DEVICE__DNS_SD = 5;

	/**
	 * The number of structural features of the '<em>XCP Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCP_DEVICE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link net.sf.smbt.xcp.impl.XCPAddressImpl <em>XCP Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.xcp.impl.XCPAddressImpl
	 * @see net.sf.smbt.xcp.impl.XcpPackageImpl#getXCPAddress()
	 * @generated
	 */
	int XCP_ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCP_ADDRESS__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCP_ADDRESS__ADDR = 1;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCP_ADDRESS__PORTS = 2;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCP_ADDRESS__ALIAS = 3;

	/**
	 * The feature id for the '<em><b>Transport ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCP_ADDRESS__TRANSPORT_ID = 4;

	/**
	 * The feature id for the '<em><b>Protocol ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCP_ADDRESS__PROTOCOL_ID = 5;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCP_ADDRESS__SPEED = 6;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCP_ADDRESS__PORT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCP_ADDRESS__NAME = 8;

	/**
	 * The number of structural features of the '<em>XCP Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCP_ADDRESS_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link net.sf.smbt.xcp.impl.XCPDevicesRegisteryImpl <em>XCP Devices Registery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.xcp.impl.XCPDevicesRegisteryImpl
	 * @see net.sf.smbt.xcp.impl.XcpPackageImpl#getXCPDevicesRegistery()
	 * @generated
	 */
	int XCP_DEVICES_REGISTERY = 2;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCP_DEVICES_REGISTERY__DEVICES = 0;

	/**
	 * The number of structural features of the '<em>XCP Devices Registery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCP_DEVICES_REGISTERY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.xcp.impl.ServicesImpl <em>Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.xcp.impl.ServicesImpl
	 * @see net.sf.smbt.xcp.impl.XcpPackageImpl#getServices()
	 * @generated
	 */
	int SERVICES = 3;

	/**
	 * The feature id for the '<em><b>Osc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES__OSC = 0;

	/**
	 * The number of structural features of the '<em>Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.xcp.XCPServiceStatus <em>XCP Service Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.xcp.XCPServiceStatus
	 * @see net.sf.smbt.xcp.impl.XcpPackageImpl#getXCPServiceStatus()
	 * @generated
	 */
	int XCP_SERVICE_STATUS = 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.xcp.XCPAddrType <em>XCP Addr Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.xcp.XCPAddrType
	 * @see net.sf.smbt.xcp.impl.XcpPackageImpl#getXCPAddrType()
	 * @generated
	 */
	int XCP_ADDR_TYPE = 5;

	/**
	 * The meta object id for the '<em>OSC Packet</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.illposed.osc.OSCPacket
	 * @see net.sf.smbt.xcp.impl.XcpPackageImpl#getOSCPacket()
	 * @generated
	 */
	int OSC_PACKET = 6;

	/**
	 * The meta object id for the '<em>Service Info</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.jmdns.ServiceInfo
	 * @see net.sf.smbt.xcp.impl.XcpPackageImpl#getServiceInfo()
	 * @generated
	 */
	int SERVICE_INFO = 7;

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.xcp.XCPDevice <em>XCP Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XCP Device</em>'.
	 * @see net.sf.smbt.xcp.XCPDevice
	 * @generated
	 */
	EClass getXCPDevice();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.xcp.XCPDevice#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Services</em>'.
	 * @see net.sf.smbt.xcp.XCPDevice#getServices()
	 * @see #getXCPDevice()
	 * @generated
	 */
	EReference getXCPDevice_Services();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.xcp.XCPDevice#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see net.sf.smbt.xcp.XCPDevice#getStatus()
	 * @see #getXCPDevice()
	 * @generated
	 */
	EAttribute getXCPDevice_Status();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.xcp.XCPDevice#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device</em>'.
	 * @see net.sf.smbt.xcp.XCPDevice#getDevice()
	 * @see #getXCPDevice()
	 * @generated
	 */
	EAttribute getXCPDevice_Device();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.xcp.XCPDevice#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.xcp.XCPDevice#getName()
	 * @see #getXCPDevice()
	 * @generated
	 */
	EAttribute getXCPDevice_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.xcp.XCPDevice#getDnsSd <em>Dns Sd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dns Sd</em>'.
	 * @see net.sf.smbt.xcp.XCPDevice#getDnsSd()
	 * @see #getXCPDevice()
	 * @generated
	 */
	EAttribute getXCPDevice_DnsSd();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.xcp.XCPDevice#getAddr <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Addr</em>'.
	 * @see net.sf.smbt.xcp.XCPDevice#getAddr()
	 * @see #getXCPDevice()
	 * @generated
	 */
	EReference getXCPDevice_Addr();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.xcp.XCPAddress <em>XCP Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XCP Address</em>'.
	 * @see net.sf.smbt.xcp.XCPAddress
	 * @generated
	 */
	EClass getXCPAddress();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.xcp.XCPAddress#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.sf.smbt.xcp.XCPAddress#getType()
	 * @see #getXCPAddress()
	 * @generated
	 */
	EAttribute getXCPAddress_Type();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.xcp.XCPAddress#getAddr <em>Addr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addr</em>'.
	 * @see net.sf.smbt.xcp.XCPAddress#getAddr()
	 * @see #getXCPAddress()
	 * @generated
	 */
	EAttribute getXCPAddress_Addr();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.smbt.xcp.XCPAddress#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ports</em>'.
	 * @see net.sf.smbt.xcp.XCPAddress#getPorts()
	 * @see #getXCPAddress()
	 * @generated
	 */
	EAttribute getXCPAddress_Ports();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.xcp.XCPAddress#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see net.sf.smbt.xcp.XCPAddress#getAlias()
	 * @see #getXCPAddress()
	 * @generated
	 */
	EAttribute getXCPAddress_Alias();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.xcp.XCPAddress#getTransportID <em>Transport ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transport ID</em>'.
	 * @see net.sf.smbt.xcp.XCPAddress#getTransportID()
	 * @see #getXCPAddress()
	 * @generated
	 */
	EAttribute getXCPAddress_TransportID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.xcp.XCPAddress#getProtocolID <em>Protocol ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol ID</em>'.
	 * @see net.sf.smbt.xcp.XCPAddress#getProtocolID()
	 * @see #getXCPAddress()
	 * @generated
	 */
	EAttribute getXCPAddress_ProtocolID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.xcp.XCPAddress#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see net.sf.smbt.xcp.XCPAddress#getSpeed()
	 * @see #getXCPAddress()
	 * @generated
	 */
	EAttribute getXCPAddress_Speed();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.xcp.XCPAddress#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see net.sf.smbt.xcp.XCPAddress#getPort()
	 * @see #getXCPAddress()
	 * @generated
	 */
	EAttribute getXCPAddress_Port();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.xcp.XCPAddress#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.xcp.XCPAddress#getName()
	 * @see #getXCPAddress()
	 * @generated
	 */
	EAttribute getXCPAddress_Name();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.xcp.XCPDevicesRegistery <em>XCP Devices Registery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XCP Devices Registery</em>'.
	 * @see net.sf.smbt.xcp.XCPDevicesRegistery
	 * @generated
	 */
	EClass getXCPDevicesRegistery();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.xcp.XCPDevicesRegistery#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Devices</em>'.
	 * @see net.sf.smbt.xcp.XCPDevicesRegistery#getDevices()
	 * @see #getXCPDevicesRegistery()
	 * @generated
	 */
	EReference getXCPDevicesRegistery_Devices();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.xcp.Services <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Services</em>'.
	 * @see net.sf.smbt.xcp.Services
	 * @generated
	 */
	EClass getServices();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.xcp.Services#getOsc <em>Osc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Osc</em>'.
	 * @see net.sf.smbt.xcp.Services#getOsc()
	 * @see #getServices()
	 * @generated
	 */
	EAttribute getServices_Osc();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.xcp.XCPServiceStatus <em>XCP Service Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XCP Service Status</em>'.
	 * @see net.sf.smbt.xcp.XCPServiceStatus
	 * @generated
	 */
	EEnum getXCPServiceStatus();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.xcp.XCPAddrType <em>XCP Addr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XCP Addr Type</em>'.
	 * @see net.sf.smbt.xcp.XCPAddrType
	 * @generated
	 */
	EEnum getXCPAddrType();

	/**
	 * Returns the meta object for data type '{@link com.illposed.osc.OSCPacket <em>OSC Packet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>OSC Packet</em>'.
	 * @see com.illposed.osc.OSCPacket
	 * @model instanceClass="com.illposed.osc.OSCPacket"
	 * @generated
	 */
	EDataType getOSCPacket();

	/**
	 * Returns the meta object for data type '{@link javax.jmdns.ServiceInfo <em>Service Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Service Info</em>'.
	 * @see javax.jmdns.ServiceInfo
	 * @model instanceClass="javax.jmdns.ServiceInfo"
	 * @generated
	 */
	EDataType getServiceInfo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XcpFactory getXcpFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.xcp.impl.XCPDeviceImpl <em>XCP Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.xcp.impl.XCPDeviceImpl
		 * @see net.sf.smbt.xcp.impl.XcpPackageImpl#getXCPDevice()
		 * @generated
		 */
		EClass XCP_DEVICE = eINSTANCE.getXCPDevice();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XCP_DEVICE__SERVICES = eINSTANCE.getXCPDevice_Services();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XCP_DEVICE__STATUS = eINSTANCE.getXCPDevice_Status();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XCP_DEVICE__DEVICE = eINSTANCE.getXCPDevice_Device();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XCP_DEVICE__NAME = eINSTANCE.getXCPDevice_Name();

		/**
		 * The meta object literal for the '<em><b>Dns Sd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XCP_DEVICE__DNS_SD = eINSTANCE.getXCPDevice_DnsSd();

		/**
		 * The meta object literal for the '<em><b>Addr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XCP_DEVICE__ADDR = eINSTANCE.getXCPDevice_Addr();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.xcp.impl.XCPAddressImpl <em>XCP Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.xcp.impl.XCPAddressImpl
		 * @see net.sf.smbt.xcp.impl.XcpPackageImpl#getXCPAddress()
		 * @generated
		 */
		EClass XCP_ADDRESS = eINSTANCE.getXCPAddress();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XCP_ADDRESS__TYPE = eINSTANCE.getXCPAddress_Type();

		/**
		 * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XCP_ADDRESS__ADDR = eINSTANCE.getXCPAddress_Addr();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XCP_ADDRESS__PORTS = eINSTANCE.getXCPAddress_Ports();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XCP_ADDRESS__ALIAS = eINSTANCE.getXCPAddress_Alias();

		/**
		 * The meta object literal for the '<em><b>Transport ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XCP_ADDRESS__TRANSPORT_ID = eINSTANCE.getXCPAddress_TransportID();

		/**
		 * The meta object literal for the '<em><b>Protocol ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XCP_ADDRESS__PROTOCOL_ID = eINSTANCE.getXCPAddress_ProtocolID();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XCP_ADDRESS__SPEED = eINSTANCE.getXCPAddress_Speed();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XCP_ADDRESS__PORT = eINSTANCE.getXCPAddress_Port();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XCP_ADDRESS__NAME = eINSTANCE.getXCPAddress_Name();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.xcp.impl.XCPDevicesRegisteryImpl <em>XCP Devices Registery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.xcp.impl.XCPDevicesRegisteryImpl
		 * @see net.sf.smbt.xcp.impl.XcpPackageImpl#getXCPDevicesRegistery()
		 * @generated
		 */
		EClass XCP_DEVICES_REGISTERY = eINSTANCE.getXCPDevicesRegistery();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XCP_DEVICES_REGISTERY__DEVICES = eINSTANCE.getXCPDevicesRegistery_Devices();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.xcp.impl.ServicesImpl <em>Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.xcp.impl.ServicesImpl
		 * @see net.sf.smbt.xcp.impl.XcpPackageImpl#getServices()
		 * @generated
		 */
		EClass SERVICES = eINSTANCE.getServices();

		/**
		 * The meta object literal for the '<em><b>Osc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICES__OSC = eINSTANCE.getServices_Osc();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.xcp.XCPServiceStatus <em>XCP Service Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.xcp.XCPServiceStatus
		 * @see net.sf.smbt.xcp.impl.XcpPackageImpl#getXCPServiceStatus()
		 * @generated
		 */
		EEnum XCP_SERVICE_STATUS = eINSTANCE.getXCPServiceStatus();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.xcp.XCPAddrType <em>XCP Addr Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.xcp.XCPAddrType
		 * @see net.sf.smbt.xcp.impl.XcpPackageImpl#getXCPAddrType()
		 * @generated
		 */
		EEnum XCP_ADDR_TYPE = eINSTANCE.getXCPAddrType();

		/**
		 * The meta object literal for the '<em>OSC Packet</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.illposed.osc.OSCPacket
		 * @see net.sf.smbt.xcp.impl.XcpPackageImpl#getOSCPacket()
		 * @generated
		 */
		EDataType OSC_PACKET = eINSTANCE.getOSCPacket();

		/**
		 * The meta object literal for the '<em>Service Info</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.jmdns.ServiceInfo
		 * @see net.sf.smbt.xcp.impl.XcpPackageImpl#getServiceInfo()
		 * @generated
		 */
		EDataType SERVICE_INFO = eINSTANCE.getServiceInfo();

	}

} //XcpPackage