/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.comm.impl;

import net.sf.smbt.comm.CommPackage;
import net.sf.smbt.comm.UbiPort;
import net.sf.smbt.comm.utils.io.IChannelCloser;
import net.sf.xqz.model.engine.impl.PortImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ubi Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UbiPortImpl extends PortImpl implements UbiPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UbiPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommPackage.Literals.UBI_PORT;
	}
	
	

	@Override
	public void finalize() {
		Object c = getChannel();
		if (c instanceof IChannelCloser) {
			((IChannelCloser)c).close();
		}
	}


} //UbiPortImpl
