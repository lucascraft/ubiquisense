/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.comm.ezxtopology.impl;

import java.net.DatagramSocket;

import net.sf.smbt.comm.ezxtopology.EzxtopologyPackage;
import net.sf.smbt.comm.ezxtopology.UDPConnection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UDP Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.comm.ezxtopology.impl.UDPConnectionImpl#getDatagramSocket <em>Datagram Socket</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UDPConnectionImpl extends MinimalEObjectImpl.Container implements UDPConnection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UDPConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzxtopologyPackage.Literals.UDP_CONNECTION;
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
	public DatagramSocket getDatagramSocket() {
		return (DatagramSocket)eGet(EzxtopologyPackage.Literals.UDP_CONNECTION__DATAGRAM_SOCKET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatagramSocket(DatagramSocket newDatagramSocket) {
		eSet(EzxtopologyPackage.Literals.UDP_CONNECTION__DATAGRAM_SOCKET, newDatagramSocket);
	}

} //UDPConnectionImpl
