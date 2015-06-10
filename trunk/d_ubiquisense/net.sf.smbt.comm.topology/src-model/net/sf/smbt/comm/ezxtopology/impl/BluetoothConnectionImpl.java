/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.comm.ezxtopology.impl;

import javax.bluetooth.L2CAPConnection;

import net.sf.smbt.comm.ezxtopology.BluetoothConnection;
import net.sf.smbt.comm.ezxtopology.EzxtopologyPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bluetooth Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.comm.ezxtopology.impl.BluetoothConnectionImpl#getL2cap <em>L2cap</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BluetoothConnectionImpl extends MinimalEObjectImpl.Container implements BluetoothConnection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BluetoothConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzxtopologyPackage.Literals.BLUETOOTH_CONNECTION;
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
	public L2CAPConnection getL2cap() {
		return (L2CAPConnection)eGet(EzxtopologyPackage.Literals.BLUETOOTH_CONNECTION__L2CAP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setL2cap(L2CAPConnection newL2cap) {
		eSet(EzxtopologyPackage.Literals.BLUETOOTH_CONNECTION__L2CAP, newL2cap);
	}

} //BluetoothConnectionImpl
