/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.comm.ezxtopology;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.comm.ezxtopology.EzxtopologyPackage
 * @generated
 */
public interface EzxtopologyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzxtopologyFactory eINSTANCE = net.sf.smbt.comm.ezxtopology.impl.EzxtopologyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Topology Cache</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topology Cache</em>'.
	 * @generated
	 */
	TopologyCache createTopologyCache();

	/**
	 * Returns a new object of class '<em>Topology Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topology Node</em>'.
	 * @generated
	 */
	TopologyNode createTopologyNode();

	/**
	 * Returns a new object of class '<em>Topology Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topology Group</em>'.
	 * @generated
	 */
	TopologyGroup createTopologyGroup();

	/**
	 * Returns a new object of class '<em>Session Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Session Manager</em>'.
	 * @generated
	 */
	SessionManager createSessionManager();

	/**
	 * Returns a new object of class '<em>Usb Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usb Connection</em>'.
	 * @generated
	 */
	UsbConnection createUsbConnection();

	/**
	 * Returns a new object of class '<em>Bluetooth Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bluetooth Connection</em>'.
	 * @generated
	 */
	BluetoothConnection createBluetoothConnection();

	/**
	 * Returns a new object of class '<em>UDP Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UDP Connection</em>'.
	 * @generated
	 */
	UDPConnection createUDPConnection();

	/**
	 * Returns a new object of class '<em>Tcp Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tcp Connection</em>'.
	 * @generated
	 */
	TcpConnection createTcpConnection();

	/**
	 * Returns a new object of class '<em>XBee Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XBee Connection</em>'.
	 * @generated
	 */
	XBeeConnection createXBeeConnection();

	/**
	 * Returns a new object of class '<em>HTTP Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HTTP Connection</em>'.
	 * @generated
	 */
	HTTPConnection createHTTPConnection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EzxtopologyPackage getEzxtopologyPackage();

} //EzxtopologyFactory
