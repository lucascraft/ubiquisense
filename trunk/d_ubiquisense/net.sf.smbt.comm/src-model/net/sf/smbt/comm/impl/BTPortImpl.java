/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.comm.impl;

import net.sf.smbt.comm.BTPort;
import net.sf.smbt.comm.CommPackage;
import net.sf.smbt.comm.bluetooth.io.BTCommunicator;
import net.sf.xqz.model.engine.impl.PortImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BT Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BTPortImpl extends PortImpl implements BTPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BTPortImpl() {
		super();
	}
	
	@Override
	public void finalize() {
		super.finalize();
		Object c = getChannel();
		if (c instanceof BTCommunicator) {
			((BTCommunicator)c).close();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommPackage.Literals.BT_PORT;
	}

} //BTPortImpl
