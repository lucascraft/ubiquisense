/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.btcomm.impl;

import net.sf.smbt.btcomm.BluetoothPort;
import net.sf.smbt.btcomm.BtcommPackage;
import net.sf.smbt.comm.bluetooth.io.BTCommunicator;
import net.sf.xqz.model.engine.impl.PortImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bluetooth Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BluetoothPortImpl extends PortImpl implements BluetoothPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BluetoothPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtcommPackage.Literals.BLUETOOTH_PORT;
	}

	@Override
	public void finalize() {
		Object c = getChannel();
		if (c instanceof BTCommunicator) {
			((BTCommunicator)c).close();
		}
	}

} //BluetoothPortImpl
