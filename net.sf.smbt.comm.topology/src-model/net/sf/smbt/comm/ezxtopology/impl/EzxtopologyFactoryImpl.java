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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.rapplogic.xbee.api.XBee;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzxtopologyFactoryImpl extends EFactoryImpl implements EzxtopologyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EzxtopologyFactory init() {
		try {
			EzxtopologyFactory theEzxtopologyFactory = (EzxtopologyFactory)EPackage.Registry.INSTANCE.getEFactory("http://ezxtopology/1.0"); 
			if (theEzxtopologyFactory != null) {
				return theEzxtopologyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EzxtopologyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzxtopologyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EzxtopologyPackage.TOPOLOGY_CACHE: return createTopologyCache();
			case EzxtopologyPackage.TOPOLOGY_NODE: return createTopologyNode();
			case EzxtopologyPackage.TOPOLOGY_GROUP: return createTopologyGroup();
			case EzxtopologyPackage.SESSION_MANAGER: return createSessionManager();
			case EzxtopologyPackage.USB_CONNECTION: return createUsbConnection();
			case EzxtopologyPackage.BLUETOOTH_CONNECTION: return createBluetoothConnection();
			case EzxtopologyPackage.UDP_CONNECTION: return createUDPConnection();
			case EzxtopologyPackage.TCP_CONNECTION: return createTcpConnection();
			case EzxtopologyPackage.XBEE_CONNECTION: return createXBeeConnection();
			case EzxtopologyPackage.HTTP_CONNECTION: return createHTTPConnection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EzxtopologyPackage.MIME:
				return createMimeFromString(eDataType, initialValue);
			case EzxtopologyPackage.SERIAL:
				return createSerialFromString(eDataType, initialValue);
			case EzxtopologyPackage.BLUETOOTH_L2CAP_CONNECTION:
				return createBluetoothL2CAPConnectionFromString(eDataType, initialValue);
			case EzxtopologyPackage.DATAGRAM_SOCKET:
				return createDatagramSocketFromString(eDataType, initialValue);
			case EzxtopologyPackage.SOCKET:
				return createSocketFromString(eDataType, initialValue);
			case EzxtopologyPackage.XBEE:
				return createXBeeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EzxtopologyPackage.MIME:
				return convertMimeToString(eDataType, instanceValue);
			case EzxtopologyPackage.SERIAL:
				return convertSerialToString(eDataType, instanceValue);
			case EzxtopologyPackage.BLUETOOTH_L2CAP_CONNECTION:
				return convertBluetoothL2CAPConnectionToString(eDataType, instanceValue);
			case EzxtopologyPackage.DATAGRAM_SOCKET:
				return convertDatagramSocketToString(eDataType, instanceValue);
			case EzxtopologyPackage.SOCKET:
				return convertSocketToString(eDataType, instanceValue);
			case EzxtopologyPackage.XBEE:
				return convertXBeeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyCache createTopologyCache() {
		TopologyCacheImpl topologyCache = new TopologyCacheImpl();
		return topologyCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyNode createTopologyNode() {
		TopologyNodeImpl topologyNode = new TopologyNodeImpl();
		return topologyNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyGroup createTopologyGroup() {
		TopologyGroupImpl topologyGroup = new TopologyGroupImpl();
		return topologyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionManager createSessionManager() {
		SessionManagerImpl sessionManager = new SessionManagerImpl();
		return sessionManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsbConnection createUsbConnection() {
		UsbConnectionImpl usbConnection = new UsbConnectionImpl();
		return usbConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BluetoothConnection createBluetoothConnection() {
		BluetoothConnectionImpl bluetoothConnection = new BluetoothConnectionImpl();
		return bluetoothConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UDPConnection createUDPConnection() {
		UDPConnectionImpl udpConnection = new UDPConnectionImpl();
		return udpConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TcpConnection createTcpConnection() {
		TcpConnectionImpl tcpConnection = new TcpConnectionImpl();
		return tcpConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XBeeConnection createXBeeConnection() {
		XBeeConnectionImpl xBeeConnection = new XBeeConnectionImpl();
		return xBeeConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPConnection createHTTPConnection() {
		HTTPConnectionImpl httpConnection = new HTTPConnectionImpl();
		return httpConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mime createMimeFromString(EDataType eDataType, String initialValue) {
		Mime result = Mime.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMimeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Serial createSerialFromString(EDataType eDataType, String initialValue) {
		return (Serial)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSerialToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public L2CAPConnection createBluetoothL2CAPConnectionFromString(EDataType eDataType, String initialValue) {
		return (L2CAPConnection)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBluetoothL2CAPConnectionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatagramSocket createDatagramSocketFromString(EDataType eDataType, String initialValue) {
		return (DatagramSocket)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatagramSocketToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Socket createSocketFromString(EDataType eDataType, String initialValue) {
		return (Socket)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSocketToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XBee createXBeeFromString(EDataType eDataType, String initialValue) {
		return (XBee)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXBeeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzxtopologyPackage getEzxtopologyPackage() {
		return (EzxtopologyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EzxtopologyPackage getPackage() {
		return EzxtopologyPackage.eINSTANCE;
	}

} //EzxtopologyFactoryImpl
