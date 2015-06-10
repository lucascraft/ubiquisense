/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.comm.ezxtopology.util;

import net.sf.smbt.comm.ezxtopology.AbstractTopologyItem;
import net.sf.smbt.comm.ezxtopology.BluetoothConnection;
import net.sf.smbt.comm.ezxtopology.EzxtopologyPackage;
import net.sf.smbt.comm.ezxtopology.HTTPConnection;
import net.sf.smbt.comm.ezxtopology.SessionManager;
import net.sf.smbt.comm.ezxtopology.TcpConnection;
import net.sf.smbt.comm.ezxtopology.TopologyCache;
import net.sf.smbt.comm.ezxtopology.TopologyGroup;
import net.sf.smbt.comm.ezxtopology.TopologyNode;
import net.sf.smbt.comm.ezxtopology.UDPConnection;
import net.sf.smbt.comm.ezxtopology.UsbConnection;
import net.sf.smbt.comm.ezxtopology.XBeeConnection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.comm.ezxtopology.EzxtopologyPackage
 * @generated
 */
public class EzxtopologySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzxtopologyPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzxtopologySwitch() {
		if (modelPackage == null) {
			modelPackage = EzxtopologyPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EzxtopologyPackage.TOPOLOGY_CACHE: {
				TopologyCache topologyCache = (TopologyCache)theEObject;
				T result = caseTopologyCache(topologyCache);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzxtopologyPackage.TOPOLOGY_NODE: {
				TopologyNode topologyNode = (TopologyNode)theEObject;
				T result = caseTopologyNode(topologyNode);
				if (result == null) result = caseAbstractTopologyItem(topologyNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzxtopologyPackage.TOPOLOGY_GROUP: {
				TopologyGroup topologyGroup = (TopologyGroup)theEObject;
				T result = caseTopologyGroup(topologyGroup);
				if (result == null) result = caseAbstractTopologyItem(topologyGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzxtopologyPackage.ABSTRACT_TOPOLOGY_ITEM: {
				AbstractTopologyItem abstractTopologyItem = (AbstractTopologyItem)theEObject;
				T result = caseAbstractTopologyItem(abstractTopologyItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzxtopologyPackage.SESSION_MANAGER: {
				SessionManager sessionManager = (SessionManager)theEObject;
				T result = caseSessionManager(sessionManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzxtopologyPackage.USB_CONNECTION: {
				UsbConnection usbConnection = (UsbConnection)theEObject;
				T result = caseUsbConnection(usbConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzxtopologyPackage.BLUETOOTH_CONNECTION: {
				BluetoothConnection bluetoothConnection = (BluetoothConnection)theEObject;
				T result = caseBluetoothConnection(bluetoothConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzxtopologyPackage.UDP_CONNECTION: {
				UDPConnection udpConnection = (UDPConnection)theEObject;
				T result = caseUDPConnection(udpConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzxtopologyPackage.TCP_CONNECTION: {
				TcpConnection tcpConnection = (TcpConnection)theEObject;
				T result = caseTcpConnection(tcpConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzxtopologyPackage.XBEE_CONNECTION: {
				XBeeConnection xBeeConnection = (XBeeConnection)theEObject;
				T result = caseXBeeConnection(xBeeConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzxtopologyPackage.HTTP_CONNECTION: {
				HTTPConnection httpConnection = (HTTPConnection)theEObject;
				T result = caseHTTPConnection(httpConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topology Cache</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topology Cache</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopologyCache(TopologyCache object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topology Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topology Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopologyNode(TopologyNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topology Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topology Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopologyGroup(TopologyGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Topology Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Topology Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTopologyItem(AbstractTopologyItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Session Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Session Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSessionManager(SessionManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usb Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usb Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsbConnection(UsbConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bluetooth Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bluetooth Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBluetoothConnection(BluetoothConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UDP Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UDP Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUDPConnection(UDPConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tcp Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tcp Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTcpConnection(TcpConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XBee Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XBee Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXBeeConnection(XBeeConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTTP Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTTP Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTTPConnection(HTTPConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EzxtopologySwitch
