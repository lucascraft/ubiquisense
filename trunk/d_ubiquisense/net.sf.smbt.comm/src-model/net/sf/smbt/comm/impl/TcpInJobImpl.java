/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.comm.impl;

import net.sf.smbt.comm.CommPackage;
import net.sf.smbt.comm.TcpInJob;

import net.sf.xqz.model.engine.impl.InputJobImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tcp In Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TcpInJobImpl extends InputJobImpl implements TcpInJob {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TcpInJobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommPackage.Literals.TCP_IN_JOB;
	}

} //TcpInJobImpl
