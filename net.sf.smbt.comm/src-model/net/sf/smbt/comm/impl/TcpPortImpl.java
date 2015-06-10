/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.comm.impl;

import java.io.IOException;
import java.net.Socket;

import net.sf.smbt.comm.CommPackage;
import net.sf.smbt.comm.TcpPort;
import net.sf.smbt.comm.io.TcpInputPortJob;
import net.sf.xqz.model.engine.InputJob;
import net.sf.xqz.model.engine.OutputJob;
import net.sf.xqz.model.engine.impl.PortImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tcp Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TcpPortImpl extends PortImpl implements TcpPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TcpPortImpl() {
		super();
	}
	
	@Override
	public void finalize() {
		for (InputJob iJob : getInputJobs()) {
			TcpInputPortJob ij = (TcpInputPortJob) iJob.getJob();
			ij.sleep();
			ij.cancel();
			//iJob.close();
		}
		for (OutputJob oJob : getOutputJobs()) {
			TcpInputPortJob oj = (TcpInputPortJob) oJob.getJob();
			oj.sleep();
			oj.cancel();
			//oJob.close();
		}
		if (getChannel() instanceof Socket) {
			try {
				((Socket)getChannel()).close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommPackage.Literals.TCP_PORT;
	}

} //TcpPortImpl
