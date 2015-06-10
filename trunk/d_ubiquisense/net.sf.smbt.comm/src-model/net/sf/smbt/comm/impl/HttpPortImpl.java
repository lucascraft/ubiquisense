/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.comm.impl;

import net.sf.smbt.comm.CommPackage;
import net.sf.smbt.comm.HttpPort;
import net.sf.smbt.comm.http.io.HttpCommunicator;
import net.sf.xqz.model.engine.impl.PortImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Http Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HttpPortImpl extends PortImpl implements HttpPort {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HttpPortImpl() {
		super();
	}
	
	@Override
	public void finalize() {
		super.finalize();
		Object c = getChannel();
		if (c instanceof HttpCommunicator) {
			((HttpCommunicator)c).close();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommPackage.Literals.HTTP_PORT;
	}

} //HttpPortImpl
