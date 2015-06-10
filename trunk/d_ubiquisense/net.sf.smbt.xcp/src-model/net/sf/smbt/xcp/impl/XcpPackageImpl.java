/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xcp.impl;

import javax.jmdns.ServiceInfo;

import net.sf.smbt.xcp.Services;
import net.sf.smbt.xcp.XCPAddrType;
import net.sf.smbt.xcp.XCPAddress;
import net.sf.smbt.xcp.XCPDevice;
import net.sf.smbt.xcp.XCPDevicesRegistery;
import net.sf.smbt.xcp.XCPServiceStatus;
import net.sf.smbt.xcp.XcpFactory;
import net.sf.smbt.xcp.XcpPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import com.illposed.osc.OSCPacket;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XcpPackageImpl extends EPackageImpl implements XcpPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xcpDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xcpAddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xcpDevicesRegisteryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum xcpServiceStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum xcpAddrTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oscPacketEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType serviceInfoEDataType = null;

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
	 * @see net.sf.smbt.xcp.XcpPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XcpPackageImpl() {
		super(eNS_URI, XcpFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link XcpPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XcpPackage init() {
		if (isInited) return (XcpPackage)EPackage.Registry.INSTANCE.getEPackage(XcpPackage.eNS_URI);

		// Obtain or create and register package
		XcpPackageImpl theXcpPackage = (XcpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XcpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XcpPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theXcpPackage.createPackageContents();

		// Initialize created meta-data
		theXcpPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXcpPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XcpPackage.eNS_URI, theXcpPackage);
		return theXcpPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXCPDevice() {
		return xcpDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXCPDevice_Services() {
		return (EReference)xcpDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXCPDevice_Status() {
		return (EAttribute)xcpDeviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXCPDevice_Device() {
		return (EAttribute)xcpDeviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXCPDevice_Name() {
		return (EAttribute)xcpDeviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXCPDevice_DnsSd() {
		return (EAttribute)xcpDeviceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXCPDevice_Addr() {
		return (EReference)xcpDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXCPAddress() {
		return xcpAddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXCPAddress_Type() {
		return (EAttribute)xcpAddressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXCPAddress_Addr() {
		return (EAttribute)xcpAddressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXCPAddress_Ports() {
		return (EAttribute)xcpAddressEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXCPAddress_Alias() {
		return (EAttribute)xcpAddressEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXCPAddress_TransportID() {
		return (EAttribute)xcpAddressEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXCPAddress_ProtocolID() {
		return (EAttribute)xcpAddressEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXCPAddress_Speed() {
		return (EAttribute)xcpAddressEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXCPAddress_Port() {
		return (EAttribute)xcpAddressEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXCPAddress_Name() {
		return (EAttribute)xcpAddressEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXCPDevicesRegistery() {
		return xcpDevicesRegisteryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXCPDevicesRegistery_Devices() {
		return (EReference)xcpDevicesRegisteryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServices() {
		return servicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServices_Osc() {
		return (EAttribute)servicesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getXCPServiceStatus() {
		return xcpServiceStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getXCPAddrType() {
		return xcpAddrTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOSCPacket() {
		return oscPacketEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getServiceInfo() {
		return serviceInfoEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XcpFactory getXcpFactory() {
		return (XcpFactory)getEFactoryInstance();
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
		xcpDeviceEClass = createEClass(XCP_DEVICE);
		createEReference(xcpDeviceEClass, XCP_DEVICE__ADDR);
		createEReference(xcpDeviceEClass, XCP_DEVICE__SERVICES);
		createEAttribute(xcpDeviceEClass, XCP_DEVICE__STATUS);
		createEAttribute(xcpDeviceEClass, XCP_DEVICE__DEVICE);
		createEAttribute(xcpDeviceEClass, XCP_DEVICE__NAME);
		createEAttribute(xcpDeviceEClass, XCP_DEVICE__DNS_SD);

		xcpAddressEClass = createEClass(XCP_ADDRESS);
		createEAttribute(xcpAddressEClass, XCP_ADDRESS__TYPE);
		createEAttribute(xcpAddressEClass, XCP_ADDRESS__ADDR);
		createEAttribute(xcpAddressEClass, XCP_ADDRESS__PORTS);
		createEAttribute(xcpAddressEClass, XCP_ADDRESS__ALIAS);
		createEAttribute(xcpAddressEClass, XCP_ADDRESS__TRANSPORT_ID);
		createEAttribute(xcpAddressEClass, XCP_ADDRESS__PROTOCOL_ID);
		createEAttribute(xcpAddressEClass, XCP_ADDRESS__SPEED);
		createEAttribute(xcpAddressEClass, XCP_ADDRESS__PORT);
		createEAttribute(xcpAddressEClass, XCP_ADDRESS__NAME);

		xcpDevicesRegisteryEClass = createEClass(XCP_DEVICES_REGISTERY);
		createEReference(xcpDevicesRegisteryEClass, XCP_DEVICES_REGISTERY__DEVICES);

		servicesEClass = createEClass(SERVICES);
		createEAttribute(servicesEClass, SERVICES__OSC);

		// Create enums
		xcpServiceStatusEEnum = createEEnum(XCP_SERVICE_STATUS);
		xcpAddrTypeEEnum = createEEnum(XCP_ADDR_TYPE);

		// Create data types
		oscPacketEDataType = createEDataType(OSC_PACKET);
		serviceInfoEDataType = createEDataType(SERVICE_INFO);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(xcpDeviceEClass, XCPDevice.class, "XCPDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXCPDevice_Addr(), this.getXCPAddress(), null, "addr", null, 0, 1, XCPDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXCPDevice_Services(), this.getServices(), null, "services", null, 0, 1, XCPDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXCPDevice_Status(), this.getXCPServiceStatus(), "status", null, 0, 1, XCPDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXCPDevice_Device(), ecorePackage.getEJavaObject(), "device", null, 0, 1, XCPDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXCPDevice_Name(), ecorePackage.getEString(), "name", null, 0, 1, XCPDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXCPDevice_DnsSd(), this.getServiceInfo(), "dnsSd", null, 0, 1, XCPDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xcpAddressEClass, XCPAddress.class, "XCPAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXCPAddress_Type(), ecorePackage.getEString(), "type", null, 0, 1, XCPAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXCPAddress_Addr(), ecorePackage.getEString(), "addr", null, 0, 1, XCPAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXCPAddress_Ports(), ecorePackage.getEInt(), "ports", null, 0, -1, XCPAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXCPAddress_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, XCPAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXCPAddress_TransportID(), ecorePackage.getEString(), "transportID", null, 0, 1, XCPAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXCPAddress_ProtocolID(), ecorePackage.getEString(), "protocolID", null, 0, 1, XCPAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXCPAddress_Speed(), ecorePackage.getEInt(), "speed", null, 0, 1, XCPAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXCPAddress_Port(), ecorePackage.getEInt(), "port", null, 0, 1, XCPAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXCPAddress_Name(), ecorePackage.getEString(), "name", null, 0, 1, XCPAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xcpDevicesRegisteryEClass, XCPDevicesRegistery.class, "XCPDevicesRegistery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXCPDevicesRegistery_Devices(), this.getXCPDevice(), null, "devices", null, 0, -1, XCPDevicesRegistery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(xcpDevicesRegisteryEClass, this.getXCPDevice(), "getDevicesFromType", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(servicesEClass, Services.class, "Services", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServices_Osc(), this.getOSCPacket(), "osc", null, 0, 1, Services.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(xcpServiceStatusEEnum, XCPServiceStatus.class, "XCPServiceStatus");
		addEEnumLiteral(xcpServiceStatusEEnum, XCPServiceStatus.PROBING);
		addEEnumLiteral(xcpServiceStatusEEnum, XCPServiceStatus.DISCOVERED);
		addEEnumLiteral(xcpServiceStatusEEnum, XCPServiceStatus.RESOLVED);
		addEEnumLiteral(xcpServiceStatusEEnum, XCPServiceStatus.READY);
		addEEnumLiteral(xcpServiceStatusEEnum, XCPServiceStatus.UNAVAILABLE);
		addEEnumLiteral(xcpServiceStatusEEnum, XCPServiceStatus.STARTING);
		addEEnumLiteral(xcpServiceStatusEEnum, XCPServiceStatus.STOP);
		addEEnumLiteral(xcpServiceStatusEEnum, XCPServiceStatus.CONNECTED);

		initEEnum(xcpAddrTypeEEnum, XCPAddrType.class, "XCPAddrType");
		addEEnumLiteral(xcpAddrTypeEEnum, XCPAddrType.XCP_ADDR_BLUETOOTH);
		addEEnumLiteral(xcpAddrTypeEEnum, XCPAddrType.XCP_ADDR_UDP);
		addEEnumLiteral(xcpAddrTypeEEnum, XCPAddrType.XCP_ADDR_TCP);
		addEEnumLiteral(xcpAddrTypeEEnum, XCPAddrType.XCP_ADDR_USB);
		addEEnumLiteral(xcpAddrTypeEEnum, XCPAddrType.XCP_ADDR_HTTP);
		addEEnumLiteral(xcpAddrTypeEEnum, XCPAddrType.XCP_ADDR_MIDI);
		addEEnumLiteral(xcpAddrTypeEEnum, XCPAddrType.XCP_ADDR_XBEE);

		// Initialize data types
		initEDataType(oscPacketEDataType, OSCPacket.class, "OSCPacket", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(serviceInfoEDataType, ServiceInfo.class, "ServiceInfo", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //XcpPackageImpl
