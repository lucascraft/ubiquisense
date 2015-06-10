/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.comm.ezxtopology;

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
 * @see net.sf.smbt.comm.ezxtopology.EzxtopologyFactory
 * @model kind="package"
 * @generated
 */
public interface EzxtopologyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezxtopology";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ezxtopology/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezxtopology";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzxtopologyPackage eINSTANCE = net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.comm.ezxtopology.impl.TopologyCacheImpl <em>Topology Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.comm.ezxtopology.impl.TopologyCacheImpl
	 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getTopologyCache()
	 * @generated
	 */
	int TOPOLOGY_CACHE = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_CACHE__NODES = 0;

	/**
	 * The feature id for the '<em><b>Session</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_CACHE__SESSION = 1;

	/**
	 * The number of structural features of the '<em>Topology Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_CACHE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.comm.ezxtopology.impl.AbstractTopologyItemImpl <em>Abstract Topology Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.comm.ezxtopology.impl.AbstractTopologyItemImpl
	 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getAbstractTopologyItem()
	 * @generated
	 */
	int ABSTRACT_TOPOLOGY_ITEM = 3;

	/**
	 * The number of structural features of the '<em>Abstract Topology Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TOPOLOGY_ITEM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.comm.ezxtopology.impl.TopologyNodeImpl <em>Topology Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.comm.ezxtopology.impl.TopologyNodeImpl
	 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getTopologyNode()
	 * @generated
	 */
	int TOPOLOGY_NODE = 1;

	/**
	 * The feature id for the '<em><b>Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_NODE__DEVICE = ABSTRACT_TOPOLOGY_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_NODE__MIME = ABSTRACT_TOPOLOGY_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_NODE__ID = ABSTRACT_TOPOLOGY_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Heart Beat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_NODE__HEART_BEAT = ABSTRACT_TOPOLOGY_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Topology Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_NODE_FEATURE_COUNT = ABSTRACT_TOPOLOGY_ITEM_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.comm.ezxtopology.impl.TopologyGroupImpl <em>Topology Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.comm.ezxtopology.impl.TopologyGroupImpl
	 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getTopologyGroup()
	 * @generated
	 */
	int TOPOLOGY_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_GROUP__CHILDREN = ABSTRACT_TOPOLOGY_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Topology Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_GROUP_FEATURE_COUNT = ABSTRACT_TOPOLOGY_ITEM_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link net.sf.smbt.comm.ezxtopology.impl.SessionManagerImpl <em>Session Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.comm.ezxtopology.impl.SessionManagerImpl
	 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getSessionManager()
	 * @generated
	 */
	int SESSION_MANAGER = 4;

	/**
	 * The feature id for the '<em><b>Usb Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_MANAGER__USB_CONNECTIONS = 0;

	/**
	 * The feature id for the '<em><b>Bluetooth Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_MANAGER__BLUETOOTH_CONNECTIONS = 1;

	/**
	 * The feature id for the '<em><b>Udp Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_MANAGER__UDP_CONNECTIONS = 2;

	/**
	 * The feature id for the '<em><b>Tcp Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_MANAGER__TCP_CONNECTIONS = 3;

	/**
	 * The feature id for the '<em><b>Xbee Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_MANAGER__XBEE_CONNECTIONS = 4;

	/**
	 * The feature id for the '<em><b>Http Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_MANAGER__HTTP_CONNECTIONS = 5;

	/**
	 * The number of structural features of the '<em>Session Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_MANAGER_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link net.sf.smbt.comm.ezxtopology.impl.UsbConnectionImpl <em>Usb Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.comm.ezxtopology.impl.UsbConnectionImpl
	 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getUsbConnection()
	 * @generated
	 */
	int USB_CONNECTION = 5;

	/**
	 * The feature id for the '<em><b>Serial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USB_CONNECTION__SERIAL = 0;

	/**
	 * The number of structural features of the '<em>Usb Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USB_CONNECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.comm.ezxtopology.impl.BluetoothConnectionImpl <em>Bluetooth Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.comm.ezxtopology.impl.BluetoothConnectionImpl
	 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getBluetoothConnection()
	 * @generated
	 */
	int BLUETOOTH_CONNECTION = 6;

	/**
	 * The feature id for the '<em><b>L2cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_CONNECTION__L2CAP = 0;

	/**
	 * The number of structural features of the '<em>Bluetooth Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUETOOTH_CONNECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.comm.ezxtopology.impl.UDPConnectionImpl <em>UDP Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.comm.ezxtopology.impl.UDPConnectionImpl
	 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getUDPConnection()
	 * @generated
	 */
	int UDP_CONNECTION = 7;

	/**
	 * The feature id for the '<em><b>Datagram Socket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_CONNECTION__DATAGRAM_SOCKET = 0;

	/**
	 * The number of structural features of the '<em>UDP Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UDP_CONNECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.comm.ezxtopology.impl.TcpConnectionImpl <em>Tcp Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.comm.ezxtopology.impl.TcpConnectionImpl
	 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getTcpConnection()
	 * @generated
	 */
	int TCP_CONNECTION = 8;

	/**
	 * The feature id for the '<em><b>Socket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_CONNECTION__SOCKET = 0;

	/**
	 * The number of structural features of the '<em>Tcp Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_CONNECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.comm.ezxtopology.impl.XBeeConnectionImpl <em>XBee Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.comm.ezxtopology.impl.XBeeConnectionImpl
	 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getXBeeConnection()
	 * @generated
	 */
	int XBEE_CONNECTION = 9;

	/**
	 * The feature id for the '<em><b>Xbee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_CONNECTION__XBEE = 0;

	/**
	 * The number of structural features of the '<em>XBee Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_CONNECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.comm.ezxtopology.impl.HTTPConnectionImpl <em>HTTP Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.comm.ezxtopology.impl.HTTPConnectionImpl
	 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getHTTPConnection()
	 * @generated
	 */
	int HTTP_CONNECTION = 10;

	/**
	 * The number of structural features of the '<em>HTTP Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_CONNECTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.comm.ezxtopology.Mime <em>Mime</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.comm.ezxtopology.Mime
	 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getMime()
	 * @generated
	 */
	int MIME = 11;


	/**
	 * The meta object id for the '<em>Serial</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.comm.utils.rxtx.Serial
	 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getSerial()
	 * @generated
	 */
	int SERIAL = 12;

	/**
	 * The meta object id for the '<em>Bluetooth L2CAP Connection</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.bluetooth.L2CAPConnection
	 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getBluetoothL2CAPConnection()
	 * @generated
	 */
	int BLUETOOTH_L2CAP_CONNECTION = 13;

	/**
	 * The meta object id for the '<em>Datagram Socket</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.DatagramSocket
	 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getDatagramSocket()
	 * @generated
	 */
	int DATAGRAM_SOCKET = 14;

	/**
	 * The meta object id for the '<em>Socket</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.Socket
	 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getSocket()
	 * @generated
	 */
	int SOCKET = 15;


	/**
	 * The meta object id for the '<em>XBee</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rapplogic.xbee.api.XBee
	 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getXBee()
	 * @generated
	 */
	int XBEE = 16;

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.comm.ezxtopology.TopologyCache <em>Topology Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topology Cache</em>'.
	 * @see net.sf.smbt.comm.ezxtopology.TopologyCache
	 * @generated
	 */
	EClass getTopologyCache();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.comm.ezxtopology.TopologyCache#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see net.sf.smbt.comm.ezxtopology.TopologyCache#getNodes()
	 * @see #getTopologyCache()
	 * @generated
	 */
	EReference getTopologyCache_Nodes();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.comm.ezxtopology.TopologyCache#getSession <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Session</em>'.
	 * @see net.sf.smbt.comm.ezxtopology.TopologyCache#getSession()
	 * @see #getTopologyCache()
	 * @generated
	 */
	EReference getTopologyCache_Session();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.comm.ezxtopology.TopologyNode <em>Topology Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topology Node</em>'.
	 * @see net.sf.smbt.comm.ezxtopology.TopologyNode
	 * @generated
	 */
	EClass getTopologyNode();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.comm.ezxtopology.TopologyNode#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Device</em>'.
	 * @see net.sf.smbt.comm.ezxtopology.TopologyNode#getDevice()
	 * @see #getTopologyNode()
	 * @generated
	 */
	EReference getTopologyNode_Device();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.comm.ezxtopology.TopologyNode#getMime <em>Mime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime</em>'.
	 * @see net.sf.smbt.comm.ezxtopology.TopologyNode#getMime()
	 * @see #getTopologyNode()
	 * @generated
	 */
	EAttribute getTopologyNode_Mime();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.comm.ezxtopology.TopologyNode#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see net.sf.smbt.comm.ezxtopology.TopologyNode#getID()
	 * @see #getTopologyNode()
	 * @generated
	 */
	EAttribute getTopologyNode_ID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.comm.ezxtopology.TopologyNode#getHeartBeat <em>Heart Beat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heart Beat</em>'.
	 * @see net.sf.smbt.comm.ezxtopology.TopologyNode#getHeartBeat()
	 * @see #getTopologyNode()
	 * @generated
	 */
	EAttribute getTopologyNode_HeartBeat();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.comm.ezxtopology.TopologyGroup <em>Topology Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topology Group</em>'.
	 * @see net.sf.smbt.comm.ezxtopology.TopologyGroup
	 * @generated
	 */
	EClass getTopologyGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.comm.ezxtopology.TopologyGroup#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see net.sf.smbt.comm.ezxtopology.TopologyGroup#getChildren()
	 * @see #getTopologyGroup()
	 * @generated
	 */
	EReference getTopologyGroup_Children();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.comm.ezxtopology.AbstractTopologyItem <em>Abstract Topology Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Topology Item</em>'.
	 * @see net.sf.smbt.comm.ezxtopology.AbstractTopologyItem
	 * @generated
	 */
	EClass getAbstractTopologyItem();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.comm.ezxtopology.SessionManager <em>Session Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session Manager</em>'.
	 * @see net.sf.smbt.comm.ezxtopology.SessionManager
	 * @generated
	 */
	EClass getSessionManager();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.comm.ezxtopology.SessionManager#getUsbConnections <em>Usb Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Usb Connections</em>'.
	 * @see net.sf.smbt.comm.ezxtopology.SessionManager#getUsbConnections()
	 * @see #getSessionManager()
	 * @generated
	 */
	EReference getSessionManager_UsbConnections();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.comm.ezxtopology.SessionManager#getBluetoothConnections <em>Bluetooth Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bluetooth Connections</em>'.
	 * @see net.sf.smbt.comm.ezxtopology.SessionManager#getBluetoothConnections()
	 * @see #getSessionManager()
	 * @generated
	 */
	EReference getSessionManager_BluetoothConnections();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.comm.ezxtopology.SessionManager#getUdpConnections <em>Udp Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Udp Connections</em>'.
	 * @see net.sf.smbt.comm.ezxtopology.SessionManager#getUdpConnections()
	 * @see #getSessionManager()
	 * @generated
	 */
	EReference getSessionManager_UdpConnections();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.comm.ezxtopology.SessionManager#getTcpConnections <em>Tcp Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tcp Connections</em>'.
	 * @see net.sf.smbt.comm.ezxtopology.SessionManager#getTcpConnections()
	 * @see #getSessionManager()
	 * @generated
	 */
	EReference getSessionManager_TcpConnections();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.comm.ezxtopology.SessionManager#getXbeeConnections <em>Xbee Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Xbee Connections</em>'.
	 * @see net.sf.smbt.comm.ezxtopology.SessionManager#getXbeeConnections()
	 * @see #getSessionManager()
	 * @generated
	 */
	EReference getSessionManager_XbeeConnections();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.comm.ezxtopology.SessionManager#getHttpConnections <em>Http Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Http Connections</em>'.
	 * @see net.sf.smbt.comm.ezxtopology.SessionManager#getHttpConnections()
	 * @see #getSessionManager()
	 * @generated
	 */
	EReference getSessionManager_HttpConnections();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.comm.ezxtopology.UsbConnection <em>Usb Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usb Connection</em>'.
	 * @see net.sf.smbt.comm.ezxtopology.UsbConnection
	 * @generated
	 */
	EClass getUsbConnection();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.comm.ezxtopology.UsbConnection#getSerial <em>Serial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Serial</em>'.
	 * @see net.sf.smbt.comm.ezxtopology.UsbConnection#getSerial()
	 * @see #getUsbConnection()
	 * @generated
	 */
	EAttribute getUsbConnection_Serial();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.comm.ezxtopology.BluetoothConnection <em>Bluetooth Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bluetooth Connection</em>'.
	 * @see net.sf.smbt.comm.ezxtopology.BluetoothConnection
	 * @generated
	 */
	EClass getBluetoothConnection();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.comm.ezxtopology.BluetoothConnection#getL2cap <em>L2cap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>L2cap</em>'.
	 * @see net.sf.smbt.comm.ezxtopology.BluetoothConnection#getL2cap()
	 * @see #getBluetoothConnection()
	 * @generated
	 */
	EAttribute getBluetoothConnection_L2cap();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.comm.ezxtopology.UDPConnection <em>UDP Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UDP Connection</em>'.
	 * @see net.sf.smbt.comm.ezxtopology.UDPConnection
	 * @generated
	 */
	EClass getUDPConnection();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.comm.ezxtopology.UDPConnection#getDatagramSocket <em>Datagram Socket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datagram Socket</em>'.
	 * @see net.sf.smbt.comm.ezxtopology.UDPConnection#getDatagramSocket()
	 * @see #getUDPConnection()
	 * @generated
	 */
	EAttribute getUDPConnection_DatagramSocket();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.comm.ezxtopology.TcpConnection <em>Tcp Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tcp Connection</em>'.
	 * @see net.sf.smbt.comm.ezxtopology.TcpConnection
	 * @generated
	 */
	EClass getTcpConnection();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.comm.ezxtopology.TcpConnection#getSocket <em>Socket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Socket</em>'.
	 * @see net.sf.smbt.comm.ezxtopology.TcpConnection#getSocket()
	 * @see #getTcpConnection()
	 * @generated
	 */
	EAttribute getTcpConnection_Socket();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.comm.ezxtopology.XBeeConnection <em>XBee Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XBee Connection</em>'.
	 * @see net.sf.smbt.comm.ezxtopology.XBeeConnection
	 * @generated
	 */
	EClass getXBeeConnection();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.comm.ezxtopology.XBeeConnection#getXbee <em>Xbee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xbee</em>'.
	 * @see net.sf.smbt.comm.ezxtopology.XBeeConnection#getXbee()
	 * @see #getXBeeConnection()
	 * @generated
	 */
	EAttribute getXBeeConnection_Xbee();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.comm.ezxtopology.HTTPConnection <em>HTTP Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTTP Connection</em>'.
	 * @see net.sf.smbt.comm.ezxtopology.HTTPConnection
	 * @generated
	 */
	EClass getHTTPConnection();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.comm.ezxtopology.Mime <em>Mime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mime</em>'.
	 * @see net.sf.smbt.comm.ezxtopology.Mime
	 * @generated
	 */
	EEnum getMime();

	/**
	 * Returns the meta object for data type '{@link net.sf.smbt.comm.utils.rxtx.Serial <em>Serial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Serial</em>'.
	 * @see net.sf.smbt.comm.utils.rxtx.Serial
	 * @model instanceClass="net.sf.smbt.comm.utils.rxtx.Serial"
	 * @generated
	 */
	EDataType getSerial();

	/**
	 * Returns the meta object for data type '{@link javax.bluetooth.L2CAPConnection <em>Bluetooth L2CAP Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bluetooth L2CAP Connection</em>'.
	 * @see javax.bluetooth.L2CAPConnection
	 * @model instanceClass="javax.bluetooth.L2CAPConnection"
	 * @generated
	 */
	EDataType getBluetoothL2CAPConnection();

	/**
	 * Returns the meta object for data type '{@link java.net.DatagramSocket <em>Datagram Socket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Datagram Socket</em>'.
	 * @see java.net.DatagramSocket
	 * @model instanceClass="java.net.DatagramSocket"
	 * @generated
	 */
	EDataType getDatagramSocket();

	/**
	 * Returns the meta object for data type '{@link java.net.Socket <em>Socket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Socket</em>'.
	 * @see java.net.Socket
	 * @model instanceClass="java.net.Socket"
	 * @generated
	 */
	EDataType getSocket();

	/**
	 * Returns the meta object for data type '{@link com.rapplogic.xbee.api.XBee <em>XBee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>XBee</em>'.
	 * @see com.rapplogic.xbee.api.XBee
	 * @model instanceClass="com.rapplogic.xbee.api.XBee"
	 * @generated
	 */
	EDataType getXBee();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EzxtopologyFactory getEzxtopologyFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.comm.ezxtopology.impl.TopologyCacheImpl <em>Topology Cache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.comm.ezxtopology.impl.TopologyCacheImpl
		 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getTopologyCache()
		 * @generated
		 */
		EClass TOPOLOGY_CACHE = eINSTANCE.getTopologyCache();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY_CACHE__NODES = eINSTANCE.getTopologyCache_Nodes();

		/**
		 * The meta object literal for the '<em><b>Session</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY_CACHE__SESSION = eINSTANCE.getTopologyCache_Session();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.comm.ezxtopology.impl.TopologyNodeImpl <em>Topology Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.comm.ezxtopology.impl.TopologyNodeImpl
		 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getTopologyNode()
		 * @generated
		 */
		EClass TOPOLOGY_NODE = eINSTANCE.getTopologyNode();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY_NODE__DEVICE = eINSTANCE.getTopologyNode_Device();

		/**
		 * The meta object literal for the '<em><b>Mime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPOLOGY_NODE__MIME = eINSTANCE.getTopologyNode_Mime();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPOLOGY_NODE__ID = eINSTANCE.getTopologyNode_ID();

		/**
		 * The meta object literal for the '<em><b>Heart Beat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOPOLOGY_NODE__HEART_BEAT = eINSTANCE.getTopologyNode_HeartBeat();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.comm.ezxtopology.impl.TopologyGroupImpl <em>Topology Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.comm.ezxtopology.impl.TopologyGroupImpl
		 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getTopologyGroup()
		 * @generated
		 */
		EClass TOPOLOGY_GROUP = eINSTANCE.getTopologyGroup();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY_GROUP__CHILDREN = eINSTANCE.getTopologyGroup_Children();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.comm.ezxtopology.impl.AbstractTopologyItemImpl <em>Abstract Topology Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.comm.ezxtopology.impl.AbstractTopologyItemImpl
		 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getAbstractTopologyItem()
		 * @generated
		 */
		EClass ABSTRACT_TOPOLOGY_ITEM = eINSTANCE.getAbstractTopologyItem();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.comm.ezxtopology.impl.SessionManagerImpl <em>Session Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.comm.ezxtopology.impl.SessionManagerImpl
		 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getSessionManager()
		 * @generated
		 */
		EClass SESSION_MANAGER = eINSTANCE.getSessionManager();

		/**
		 * The meta object literal for the '<em><b>Usb Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_MANAGER__USB_CONNECTIONS = eINSTANCE.getSessionManager_UsbConnections();

		/**
		 * The meta object literal for the '<em><b>Bluetooth Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_MANAGER__BLUETOOTH_CONNECTIONS = eINSTANCE.getSessionManager_BluetoothConnections();

		/**
		 * The meta object literal for the '<em><b>Udp Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_MANAGER__UDP_CONNECTIONS = eINSTANCE.getSessionManager_UdpConnections();

		/**
		 * The meta object literal for the '<em><b>Tcp Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_MANAGER__TCP_CONNECTIONS = eINSTANCE.getSessionManager_TcpConnections();

		/**
		 * The meta object literal for the '<em><b>Xbee Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_MANAGER__XBEE_CONNECTIONS = eINSTANCE.getSessionManager_XbeeConnections();

		/**
		 * The meta object literal for the '<em><b>Http Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_MANAGER__HTTP_CONNECTIONS = eINSTANCE.getSessionManager_HttpConnections();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.comm.ezxtopology.impl.UsbConnectionImpl <em>Usb Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.comm.ezxtopology.impl.UsbConnectionImpl
		 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getUsbConnection()
		 * @generated
		 */
		EClass USB_CONNECTION = eINSTANCE.getUsbConnection();

		/**
		 * The meta object literal for the '<em><b>Serial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USB_CONNECTION__SERIAL = eINSTANCE.getUsbConnection_Serial();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.comm.ezxtopology.impl.BluetoothConnectionImpl <em>Bluetooth Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.comm.ezxtopology.impl.BluetoothConnectionImpl
		 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getBluetoothConnection()
		 * @generated
		 */
		EClass BLUETOOTH_CONNECTION = eINSTANCE.getBluetoothConnection();

		/**
		 * The meta object literal for the '<em><b>L2cap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLUETOOTH_CONNECTION__L2CAP = eINSTANCE.getBluetoothConnection_L2cap();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.comm.ezxtopology.impl.UDPConnectionImpl <em>UDP Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.comm.ezxtopology.impl.UDPConnectionImpl
		 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getUDPConnection()
		 * @generated
		 */
		EClass UDP_CONNECTION = eINSTANCE.getUDPConnection();

		/**
		 * The meta object literal for the '<em><b>Datagram Socket</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UDP_CONNECTION__DATAGRAM_SOCKET = eINSTANCE.getUDPConnection_DatagramSocket();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.comm.ezxtopology.impl.TcpConnectionImpl <em>Tcp Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.comm.ezxtopology.impl.TcpConnectionImpl
		 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getTcpConnection()
		 * @generated
		 */
		EClass TCP_CONNECTION = eINSTANCE.getTcpConnection();

		/**
		 * The meta object literal for the '<em><b>Socket</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCP_CONNECTION__SOCKET = eINSTANCE.getTcpConnection_Socket();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.comm.ezxtopology.impl.XBeeConnectionImpl <em>XBee Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.comm.ezxtopology.impl.XBeeConnectionImpl
		 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getXBeeConnection()
		 * @generated
		 */
		EClass XBEE_CONNECTION = eINSTANCE.getXBeeConnection();

		/**
		 * The meta object literal for the '<em><b>Xbee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XBEE_CONNECTION__XBEE = eINSTANCE.getXBeeConnection_Xbee();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.comm.ezxtopology.impl.HTTPConnectionImpl <em>HTTP Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.comm.ezxtopology.impl.HTTPConnectionImpl
		 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getHTTPConnection()
		 * @generated
		 */
		EClass HTTP_CONNECTION = eINSTANCE.getHTTPConnection();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.comm.ezxtopology.Mime <em>Mime</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.comm.ezxtopology.Mime
		 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getMime()
		 * @generated
		 */
		EEnum MIME = eINSTANCE.getMime();

		/**
		 * The meta object literal for the '<em>Serial</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.comm.utils.rxtx.Serial
		 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getSerial()
		 * @generated
		 */
		EDataType SERIAL = eINSTANCE.getSerial();

		/**
		 * The meta object literal for the '<em>Bluetooth L2CAP Connection</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.bluetooth.L2CAPConnection
		 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getBluetoothL2CAPConnection()
		 * @generated
		 */
		EDataType BLUETOOTH_L2CAP_CONNECTION = eINSTANCE.getBluetoothL2CAPConnection();

		/**
		 * The meta object literal for the '<em>Datagram Socket</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.DatagramSocket
		 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getDatagramSocket()
		 * @generated
		 */
		EDataType DATAGRAM_SOCKET = eINSTANCE.getDatagramSocket();

		/**
		 * The meta object literal for the '<em>Socket</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.Socket
		 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getSocket()
		 * @generated
		 */
		EDataType SOCKET = eINSTANCE.getSocket();

		/**
		 * The meta object literal for the '<em>XBee</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rapplogic.xbee.api.XBee
		 * @see net.sf.smbt.comm.ezxtopology.impl.EzxtopologyPackageImpl#getXBee()
		 * @generated
		 */
		EDataType XBEE = eINSTANCE.getXBee();

	}

} //EzxtopologyPackage
