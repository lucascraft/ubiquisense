/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.comm.ezxtopology.impl;

import java.net.DatagramSocket;
import java.net.Socket;

import javax.bluetooth.L2CAPConnection;

import net.sf.smbt.comm.ezxtopology.AbstractTopologyItem;
import net.sf.smbt.comm.ezxtopology.BluetoothConnection;
import net.sf.smbt.comm.ezxtopology.EzxtopologyFactory;
import net.sf.smbt.comm.ezxtopology.EzxtopologyPackage;
import net.sf.smbt.comm.ezxtopology.HTTPConnection;
import net.sf.smbt.comm.ezxtopology.Mime;
import net.sf.smbt.comm.ezxtopology.SessionManager;
import net.sf.smbt.comm.ezxtopology.TcpConnection;
import net.sf.smbt.comm.ezxtopology.TopologyCache;
import net.sf.smbt.comm.ezxtopology.TopologyGroup;
import net.sf.smbt.comm.ezxtopology.TopologyNode;
import net.sf.smbt.comm.ezxtopology.UDPConnection;
import net.sf.smbt.comm.ezxtopology.UsbConnection;
import net.sf.smbt.comm.ezxtopology.XBeeConnection;
import net.sf.smbt.comm.utils.rxtx.Serial;
import net.sf.smbt.xcp.XcpPackage;
import net.sf.xqz.engine.script.orchestror.OrchestrorPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import com.rapplogic.xbee.api.XBee;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzxtopologyPackageImpl extends EPackageImpl implements EzxtopologyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topologyCacheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topologyNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topologyGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTopologyItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sessionManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usbConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bluetoothConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass udpConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcpConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xBeeConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mimeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType serialEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bluetoothL2CAPConnectionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType datagramSocketEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType socketEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType xBeeEDataType = null;

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
	 * @see net.sf.smbt.comm.ezxtopology.EzxtopologyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EzxtopologyPackageImpl() {
		super(eNS_URI, EzxtopologyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EzxtopologyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EzxtopologyPackage init() {
		if (isInited) return (EzxtopologyPackage)EPackage.Registry.INSTANCE.getEPackage(EzxtopologyPackage.eNS_URI);

		// Obtain or create and register package
		EzxtopologyPackageImpl theEzxtopologyPackage = (EzxtopologyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EzxtopologyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EzxtopologyPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OrchestrorPackage.eINSTANCE.eClass();
		XcpPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEzxtopologyPackage.createPackageContents();

		// Initialize created meta-data
		theEzxtopologyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEzxtopologyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EzxtopologyPackage.eNS_URI, theEzxtopologyPackage);
		return theEzxtopologyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopologyCache() {
		return topologyCacheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopologyCache_Nodes() {
		return (EReference)topologyCacheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopologyCache_Session() {
		return (EReference)topologyCacheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopologyNode() {
		return topologyNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopologyNode_Device() {
		return (EReference)topologyNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopologyNode_Mime() {
		return (EAttribute)topologyNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopologyNode_ID() {
		return (EAttribute)topologyNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopologyNode_HeartBeat() {
		return (EAttribute)topologyNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopologyGroup() {
		return topologyGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopologyGroup_Children() {
		return (EReference)topologyGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTopologyItem() {
		return abstractTopologyItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSessionManager() {
		return sessionManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionManager_UsbConnections() {
		return (EReference)sessionManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionManager_BluetoothConnections() {
		return (EReference)sessionManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionManager_UdpConnections() {
		return (EReference)sessionManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionManager_TcpConnections() {
		return (EReference)sessionManagerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionManager_XbeeConnections() {
		return (EReference)sessionManagerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSessionManager_HttpConnections() {
		return (EReference)sessionManagerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsbConnection() {
		return usbConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUsbConnection_Serial() {
		return (EAttribute)usbConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBluetoothConnection() {
		return bluetoothConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBluetoothConnection_L2cap() {
		return (EAttribute)bluetoothConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUDPConnection() {
		return udpConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUDPConnection_DatagramSocket() {
		return (EAttribute)udpConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTcpConnection() {
		return tcpConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcpConnection_Socket() {
		return (EAttribute)tcpConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXBeeConnection() {
		return xBeeConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXBeeConnection_Xbee() {
		return (EAttribute)xBeeConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHTTPConnection() {
		return httpConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMime() {
		return mimeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSerial() {
		return serialEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBluetoothL2CAPConnection() {
		return bluetoothL2CAPConnectionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDatagramSocket() {
		return datagramSocketEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSocket() {
		return socketEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getXBee() {
		return xBeeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzxtopologyFactory getEzxtopologyFactory() {
		return (EzxtopologyFactory)getEFactoryInstance();
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
		topologyCacheEClass = createEClass(TOPOLOGY_CACHE);
		createEReference(topologyCacheEClass, TOPOLOGY_CACHE__NODES);
		createEReference(topologyCacheEClass, TOPOLOGY_CACHE__SESSION);

		topologyNodeEClass = createEClass(TOPOLOGY_NODE);
		createEReference(topologyNodeEClass, TOPOLOGY_NODE__DEVICE);
		createEAttribute(topologyNodeEClass, TOPOLOGY_NODE__MIME);
		createEAttribute(topologyNodeEClass, TOPOLOGY_NODE__ID);
		createEAttribute(topologyNodeEClass, TOPOLOGY_NODE__HEART_BEAT);

		topologyGroupEClass = createEClass(TOPOLOGY_GROUP);
		createEReference(topologyGroupEClass, TOPOLOGY_GROUP__CHILDREN);

		abstractTopologyItemEClass = createEClass(ABSTRACT_TOPOLOGY_ITEM);

		sessionManagerEClass = createEClass(SESSION_MANAGER);
		createEReference(sessionManagerEClass, SESSION_MANAGER__USB_CONNECTIONS);
		createEReference(sessionManagerEClass, SESSION_MANAGER__BLUETOOTH_CONNECTIONS);
		createEReference(sessionManagerEClass, SESSION_MANAGER__UDP_CONNECTIONS);
		createEReference(sessionManagerEClass, SESSION_MANAGER__TCP_CONNECTIONS);
		createEReference(sessionManagerEClass, SESSION_MANAGER__XBEE_CONNECTIONS);
		createEReference(sessionManagerEClass, SESSION_MANAGER__HTTP_CONNECTIONS);

		usbConnectionEClass = createEClass(USB_CONNECTION);
		createEAttribute(usbConnectionEClass, USB_CONNECTION__SERIAL);

		bluetoothConnectionEClass = createEClass(BLUETOOTH_CONNECTION);
		createEAttribute(bluetoothConnectionEClass, BLUETOOTH_CONNECTION__L2CAP);

		udpConnectionEClass = createEClass(UDP_CONNECTION);
		createEAttribute(udpConnectionEClass, UDP_CONNECTION__DATAGRAM_SOCKET);

		tcpConnectionEClass = createEClass(TCP_CONNECTION);
		createEAttribute(tcpConnectionEClass, TCP_CONNECTION__SOCKET);

		xBeeConnectionEClass = createEClass(XBEE_CONNECTION);
		createEAttribute(xBeeConnectionEClass, XBEE_CONNECTION__XBEE);

		httpConnectionEClass = createEClass(HTTP_CONNECTION);

		// Create enums
		mimeEEnum = createEEnum(MIME);

		// Create data types
		serialEDataType = createEDataType(SERIAL);
		bluetoothL2CAPConnectionEDataType = createEDataType(BLUETOOTH_L2CAP_CONNECTION);
		datagramSocketEDataType = createEDataType(DATAGRAM_SOCKET);
		socketEDataType = createEDataType(SOCKET);
		xBeeEDataType = createEDataType(XBEE);
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
		XcpPackage theXcpPackage = (XcpPackage)EPackage.Registry.INSTANCE.getEPackage(XcpPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		topologyNodeEClass.getESuperTypes().add(this.getAbstractTopologyItem());
		topologyGroupEClass.getESuperTypes().add(this.getAbstractTopologyItem());

		// Initialize classes and features; add operations and parameters
		initEClass(topologyCacheEClass, TopologyCache.class, "TopologyCache", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTopologyCache_Nodes(), this.getAbstractTopologyItem(), null, "nodes", null, 0, -1, TopologyCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTopologyCache_Session(), this.getSessionManager(), null, "session", null, 0, 1, TopologyCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topologyNodeEClass, TopologyNode.class, "TopologyNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTopologyNode_Device(), theXcpPackage.getXCPDevice(), null, "device", null, 0, 1, TopologyNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTopologyNode_Mime(), this.getMime(), "mime", null, 0, 1, TopologyNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTopologyNode_ID(), ecorePackage.getEString(), "ID", null, 0, 1, TopologyNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTopologyNode_HeartBeat(), ecorePackage.getEInt(), "heartBeat", null, 0, 1, TopologyNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topologyGroupEClass, TopologyGroup.class, "TopologyGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTopologyGroup_Children(), this.getAbstractTopologyItem(), null, "children", null, 0, -1, TopologyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractTopologyItemEClass, AbstractTopologyItem.class, "AbstractTopologyItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sessionManagerEClass, SessionManager.class, "SessionManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSessionManager_UsbConnections(), this.getUsbConnection(), null, "usbConnections", null, 0, -1, SessionManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSessionManager_BluetoothConnections(), this.getBluetoothConnection(), null, "bluetoothConnections", null, 0, -1, SessionManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSessionManager_UdpConnections(), this.getUDPConnection(), null, "udpConnections", null, 0, -1, SessionManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSessionManager_TcpConnections(), this.getTcpConnection(), null, "tcpConnections", null, 0, -1, SessionManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSessionManager_XbeeConnections(), this.getXBeeConnection(), null, "xbeeConnections", null, 0, -1, SessionManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSessionManager_HttpConnections(), this.getHTTPConnection(), null, "httpConnections", null, 0, -1, SessionManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usbConnectionEClass, UsbConnection.class, "UsbConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUsbConnection_Serial(), this.getSerial(), "serial", null, 0, 1, UsbConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bluetoothConnectionEClass, BluetoothConnection.class, "BluetoothConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBluetoothConnection_L2cap(), this.getBluetoothL2CAPConnection(), "l2cap", null, 0, 1, BluetoothConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(udpConnectionEClass, UDPConnection.class, "UDPConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUDPConnection_DatagramSocket(), this.getDatagramSocket(), "datagramSocket", null, 0, 1, UDPConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcpConnectionEClass, TcpConnection.class, "TcpConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTcpConnection_Socket(), this.getSocket(), "socket", null, 0, 1, TcpConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xBeeConnectionEClass, XBeeConnection.class, "XBeeConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXBeeConnection_Xbee(), this.getXBee(), "xbee", null, 0, 1, XBeeConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(httpConnectionEClass, HTTPConnection.class, "HTTPConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(mimeEEnum, Mime.class, "Mime");
		addEEnumLiteral(mimeEEnum, Mime.BLUETOOTH_MIME);
		addEEnumLiteral(mimeEEnum, Mime.UDP_MIME);
		addEEnumLiteral(mimeEEnum, Mime.TCP_MIME);
		addEEnumLiteral(mimeEEnum, Mime.USB_MIME);
		addEEnumLiteral(mimeEEnum, Mime.XBEE_MIME);

		// Initialize data types
		initEDataType(serialEDataType, Serial.class, "Serial", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bluetoothL2CAPConnectionEDataType, L2CAPConnection.class, "BluetoothL2CAPConnection", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(datagramSocketEDataType, DatagramSocket.class, "DatagramSocket", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(socketEDataType, Socket.class, "Socket", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(xBeeEDataType, XBee.class, "XBee", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EzxtopologyPackageImpl
