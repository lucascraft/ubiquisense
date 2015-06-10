/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.comm.ezxtopology.impl;

import java.net.Socket;

import net.sf.smbt.comm.ezxtopology.EzxtopologyPackage;
import net.sf.smbt.comm.ezxtopology.TcpConnection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tcp Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.comm.ezxtopology.impl.TcpConnectionImpl#getSocket <em>Socket</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TcpConnectionImpl extends MinimalEObjectImpl.Container implements TcpConnection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TcpConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzxtopologyPackage.Literals.TCP_CONNECTION;
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
	public Socket getSocket() {
		return (Socket)eGet(EzxtopologyPackage.Literals.TCP_CONNECTION__SOCKET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSocket(Socket newSocket) {
		eSet(EzxtopologyPackage.Literals.TCP_CONNECTION__SOCKET, newSocket);
	}

} //TcpConnectionImpl
