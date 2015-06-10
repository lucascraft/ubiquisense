/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.comm.ezxtopology;

import java.net.DatagramSocket;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UDP Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.comm.ezxtopology.UDPConnection#getDatagramSocket <em>Datagram Socket</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.comm.ezxtopology.EzxtopologyPackage#getUDPConnection()
 * @model
 * @generated
 */
public interface UDPConnection extends EObject {
	/**
	 * Returns the value of the '<em><b>Datagram Socket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datagram Socket</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datagram Socket</em>' attribute.
	 * @see #setDatagramSocket(DatagramSocket)
	 * @see net.sf.smbt.comm.ezxtopology.EzxtopologyPackage#getUDPConnection_DatagramSocket()
	 * @model dataType="net.sf.smbt.comm.ezxtopology.DatagramSocket"
	 * @generated
	 */
	DatagramSocket getDatagramSocket();

	/**
	 * Sets the value of the '{@link net.sf.smbt.comm.ezxtopology.UDPConnection#getDatagramSocket <em>Datagram Socket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datagram Socket</em>' attribute.
	 * @see #getDatagramSocket()
	 * @generated
	 */
	void setDatagramSocket(DatagramSocket value);

} // UDPConnection
