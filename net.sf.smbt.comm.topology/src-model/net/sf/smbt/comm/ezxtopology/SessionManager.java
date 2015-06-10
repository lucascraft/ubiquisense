/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.comm.ezxtopology;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Session Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.comm.ezxtopology.SessionManager#getUsbConnections <em>Usb Connections</em>}</li>
 *   <li>{@link net.sf.smbt.comm.ezxtopology.SessionManager#getBluetoothConnections <em>Bluetooth Connections</em>}</li>
 *   <li>{@link net.sf.smbt.comm.ezxtopology.SessionManager#getUdpConnections <em>Udp Connections</em>}</li>
 *   <li>{@link net.sf.smbt.comm.ezxtopology.SessionManager#getTcpConnections <em>Tcp Connections</em>}</li>
 *   <li>{@link net.sf.smbt.comm.ezxtopology.SessionManager#getXbeeConnections <em>Xbee Connections</em>}</li>
 *   <li>{@link net.sf.smbt.comm.ezxtopology.SessionManager#getHttpConnections <em>Http Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.comm.ezxtopology.EzxtopologyPackage#getSessionManager()
 * @model
 * @generated
 */
public interface SessionManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Usb Connections</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.comm.ezxtopology.UsbConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usb Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usb Connections</em>' containment reference list.
	 * @see net.sf.smbt.comm.ezxtopology.EzxtopologyPackage#getSessionManager_UsbConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<UsbConnection> getUsbConnections();

	/**
	 * Returns the value of the '<em><b>Bluetooth Connections</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.comm.ezxtopology.BluetoothConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bluetooth Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bluetooth Connections</em>' containment reference list.
	 * @see net.sf.smbt.comm.ezxtopology.EzxtopologyPackage#getSessionManager_BluetoothConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<BluetoothConnection> getBluetoothConnections();

	/**
	 * Returns the value of the '<em><b>Udp Connections</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.comm.ezxtopology.UDPConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Udp Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Udp Connections</em>' containment reference list.
	 * @see net.sf.smbt.comm.ezxtopology.EzxtopologyPackage#getSessionManager_UdpConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<UDPConnection> getUdpConnections();

	/**
	 * Returns the value of the '<em><b>Tcp Connections</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.comm.ezxtopology.TcpConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tcp Connections</em>' containment reference list isn't clear,
	 * there relly should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tcp Connections</em>' containment reference list.
	 * @see net.sf.smbt.comm.ezxtopology.EzxtopologyPackage#getSessionManager_TcpConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<TcpConnection> getTcpConnections();

	/**
	 * Returns the value of the '<em><b>Xbee Connections</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.comm.ezxtopology.XBeeConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xbee Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xbee Connections</em>' containment reference list.
	 * @see net.sf.smbt.comm.ezxtopology.EzxtopologyPackage#getSessionManager_XbeeConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<XBeeConnection> getXbeeConnections();

	/**
	 * Returns the value of the '<em><b>Http Connections</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.comm.ezxtopology.HTTPConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Http Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Connections</em>' containment reference list.
	 * @see net.sf.smbt.comm.ezxtopology.EzxtopologyPackage#getSessionManager_HttpConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<HTTPConnection> getHttpConnections();

} // SessionManager
