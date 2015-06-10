/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xcp;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XCP Devices Registery</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.xcp.XCPDevicesRegistery#getDevices <em>Devices</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.xcp.XcpPackage#getXCPDevicesRegistery()
 * @model
 * @generated
 */
public interface XCPDevicesRegistery extends EObject {
	/**
	 * Returns the value of the '<em><b>Devices</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.xcp.XCPDevice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices</em>' containment reference list.
	 * @see net.sf.smbt.xcp.XcpPackage#getXCPDevicesRegistery_Devices()
	 * @model containment="true"
	 * @generated
	 */
	EList<XCPDevice> getDevices();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<XCPDevice> getDevicesFromType(String type);

} // XCPDevicesRegistery
