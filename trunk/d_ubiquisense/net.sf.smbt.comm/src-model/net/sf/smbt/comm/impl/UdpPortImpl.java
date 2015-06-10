/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.comm.impl;

import java.net.DatagramSocket;

import net.sf.smbt.comm.CommPackage;
import net.sf.smbt.comm.UdpPort;
import net.sf.smbt.comm.io.UdpInputPortJob;
import net.sf.xqz.model.engine.InputJob;
import net.sf.xqz.model.engine.OutputJob;
import net.sf.xqz.model.engine.impl.PortImpl;

import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Udp Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UdpPortImpl extends PortImpl implements UdpPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UdpPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommPackage.Literals.UDP_PORT;
	}

	
	@Override
	public void finalize() {
		for (InputJob iJob : getInputJobs()) {
			UdpInputPortJob ij = (UdpInputPortJob) iJob.getJob();
			ij.sleep();
			ij.cancel();
			ij.done(Status.OK_STATUS);
			ij.close();
		}
		for (OutputJob oJob : getOutputJobs()) {
			UdpInputPortJob oj = (UdpInputPortJob) oJob.getJob();
			oj.sleep();
			oj.cancel();
			oj.done(Status.OK_STATUS);
			oj.close();
		}
		if (getChannel() instanceof DatagramSocket) {
			((DatagramSocket)getChannel()).close();
		}
	}

} //UdpPortImpl
