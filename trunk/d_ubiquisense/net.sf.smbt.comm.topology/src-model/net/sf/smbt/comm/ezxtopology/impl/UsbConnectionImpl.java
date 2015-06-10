/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.comm.ezxtopology.impl;

import net.sf.smbt.comm.ezxtopology.EzxtopologyPackage;
import net.sf.smbt.comm.ezxtopology.UsbConnection;
import net.sf.smbt.comm.utils.rxtx.Serial;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usb Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.comm.ezxtopology.impl.UsbConnectionImpl#getSerial <em>Serial</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsbConnectionImpl extends MinimalEObjectImpl.Container implements UsbConnection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsbConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzxtopologyPackage.Literals.USB_CONNECTION;
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
	public Serial getSerial() {
		return (Serial)eGet(EzxtopologyPackage.Literals.USB_CONNECTION__SERIAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSerial(Serial newSerial) {
		eSet(EzxtopologyPackage.Literals.USB_CONNECTION__SERIAL, newSerial);
	}

} //UsbConnectionImpl
