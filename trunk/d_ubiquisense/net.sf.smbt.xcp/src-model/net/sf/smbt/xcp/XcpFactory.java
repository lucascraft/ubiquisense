/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xcp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.xcp.XcpPackage
 * @generated
 */
public interface XcpFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XcpFactory eINSTANCE = net.sf.smbt.xcp.impl.XcpFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>XCP Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XCP Device</em>'.
	 * @generated
	 */
	XCPDevice createXCPDevice();

	/**
	 * Returns a new object of class '<em>XCP Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XCP Address</em>'.
	 * @generated
	 */
	XCPAddress createXCPAddress();

	/**
	 * Returns a new object of class '<em>XCP Devices Registery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XCP Devices Registery</em>'.
	 * @generated
	 */
	XCPDevicesRegistery createXCPDevicesRegistery();

	/**
	 * Returns a new object of class '<em>Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Services</em>'.
	 * @generated
	 */
	Services createServices();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XcpPackage getXcpPackage();

} //XcpFactory
