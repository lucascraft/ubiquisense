/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.httpcomm.impl;

import net.sf.smbt.comm.http.io.HttpCommunicator;
import net.sf.smbt.httpcomm.HttpCommPort;
import net.sf.smbt.httpcomm.HttpcommPackage;
import net.sf.xqz.model.engine.impl.PortImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Http Comm Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HttpCommPortImpl extends PortImpl implements HttpCommPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HttpCommPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HttpcommPackage.Literals.HTTP_COMM_PORT;
	}
	
	@Override
	public void finalize() {
		HttpCommunicator httpComm = (HttpCommunicator) getChannel();
		if (httpComm != null) {
			httpComm.close();
		}
	}

} //HttpCommPortImpl
