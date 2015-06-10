/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.comm.impl;

import net.sf.smbt.comm.CommPackage;
import net.sf.smbt.comm.UsbPort;
import net.sf.smbt.comm.utils.rxtx.Serial;
import net.sf.xqz.model.engine.impl.PortImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usb Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UsbPortImpl extends PortImpl implements UsbPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsbPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommPackage.Literals.USB_PORT;
	}
	
	@Override
	public void finalize() {
		super.finalize();
		Serial serial = (Serial) getChannel();
		if (serial != null) {
			serial.stop();
		}
	}
} //UsbPortImpl
