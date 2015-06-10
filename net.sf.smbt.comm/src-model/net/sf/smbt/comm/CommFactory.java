/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.comm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.comm.CommPackage
 * @generated
 */
public interface CommFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommFactory eINSTANCE = net.sf.smbt.comm.impl.CommFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Udp Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Udp Port</em>'.
	 * @generated
	 */
	UdpPort createUdpPort();

	/**
	 * Returns a new object of class '<em>Tcp Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tcp Port</em>'.
	 * @generated
	 */
	TcpPort createTcpPort();

	/**
	 * Returns a new object of class '<em>Usb Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usb Port</em>'.
	 * @generated
	 */
	UsbPort createUsbPort();

	/**
	 * Returns a new object of class '<em>BT Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BT Port</em>'.
	 * @generated
	 */
	BTPort createBTPort();

	/**
	 * Returns a new object of class '<em>Http Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Http Port</em>'.
	 * @generated
	 */
	HttpPort createHttpPort();

	/**
	 * Returns a new object of class '<em>XBee Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XBee Port</em>'.
	 * @generated
	 */
	XBeePort createXBeePort();

	/**
	 * Returns a new object of class '<em>Ubi Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ubi Port</em>'.
	 * @generated
	 */
	UbiPort createUbiPort();

	/**
	 * Returns a new object of class '<em>Udp In Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Udp In Job</em>'.
	 * @generated
	 */
	UdpInJob createUdpInJob();

	/**
	 * Returns a new object of class '<em>Tcp In Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tcp In Job</em>'.
	 * @generated
	 */
	TcpInJob createTcpInJob();

	/**
	 * Returns a new object of class '<em>Udp Out Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Udp Out Job</em>'.
	 * @generated
	 */
	UdpOutJob createUdpOutJob();

	/**
	 * Returns a new object of class '<em>Tcp Out Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tcp Out Job</em>'.
	 * @generated
	 */
	TcpOutJob createTcpOutJob();

	/**
	 * Returns a new object of class '<em>Process Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Port</em>'.
	 * @generated
	 */
	ProcessPort createProcessPort();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommPackage getCommPackage();

} //CommFactory
