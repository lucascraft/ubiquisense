/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.comm.ezxtopology.impl;

import net.sf.smbt.comm.ezxtopology.BluetoothConnection;
import net.sf.smbt.comm.ezxtopology.EzxtopologyPackage;
import net.sf.smbt.comm.ezxtopology.HTTPConnection;
import net.sf.smbt.comm.ezxtopology.SessionManager;
import net.sf.smbt.comm.ezxtopology.TcpConnection;
import net.sf.smbt.comm.ezxtopology.UDPConnection;
import net.sf.smbt.comm.ezxtopology.UsbConnection;
import net.sf.smbt.comm.ezxtopology.XBeeConnection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Session Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.comm.ezxtopology.impl.SessionManagerImpl#getUsbConnections <em>Usb Connections</em>}</li>
 *   <li>{@link net.sf.smbt.comm.ezxtopology.impl.SessionManagerImpl#getBluetoothConnections <em>Bluetooth Connections</em>}</li>
 *   <li>{@link net.sf.smbt.comm.ezxtopology.impl.SessionManagerImpl#getUdpConnections <em>Udp Connections</em>}</li>
 *   <li>{@link net.sf.smbt.comm.ezxtopology.impl.SessionManagerImpl#getTcpConnections <em>Tcp Connections</em>}</li>
 *   <li>{@link net.sf.smbt.comm.ezxtopology.impl.SessionManagerImpl#getXbeeConnections <em>Xbee Connections</em>}</li>
 *   <li>{@link net.sf.smbt.comm.ezxtopology.impl.SessionManagerImpl#getHttpConnections <em>Http Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SessionManagerImpl extends MinimalEObjectImpl.Container implements SessionManager {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SessionManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzxtopologyPackage.Literals.SESSION_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UsbConnection> getUsbConnections() {
		return (EList<UsbConnection>)eGet(EzxtopologyPackage.Literals.SESSION_MANAGER__USB_CONNECTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BluetoothConnection> getBluetoothConnections() {
		return (EList<BluetoothConnection>)eGet(EzxtopologyPackage.Literals.SESSION_MANAGER__BLUETOOTH_CONNECTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UDPConnection> getUdpConnections() {
		return (EList<UDPConnection>)eGet(EzxtopologyPackage.Literals.SESSION_MANAGER__UDP_CONNECTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TcpConnection> getTcpConnections() {
		return (EList<TcpConnection>)eGet(EzxtopologyPackage.Literals.SESSION_MANAGER__TCP_CONNECTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<XBeeConnection> getXbeeConnections() {
		return (EList<XBeeConnection>)eGet(EzxtopologyPackage.Literals.SESSION_MANAGER__XBEE_CONNECTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<HTTPConnection> getHttpConnections() {
		return (EList<HTTPConnection>)eGet(EzxtopologyPackage.Literals.SESSION_MANAGER__HTTP_CONNECTIONS, true);
	}

} //SessionManagerImpl
