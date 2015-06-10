/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.btcomm.impl;

import net.sf.smbt.btcomm.BtcommPackage;
import net.sf.smbt.btcomm.L2CAPoutJob;
import net.sf.xqz.model.engine.impl.OutputJobImpl;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>L2CA Pout Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class L2CAPoutJobImpl extends OutputJobImpl implements L2CAPoutJob {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected L2CAPoutJobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtcommPackage.Literals.L2CA_POUT_JOB;
	}

	@Override
	public void close() {
		super.close();
		Object o = getJob();
		if (o instanceof Job) {
			Job j = (Job) o;
			j.cancel();
		}
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		Object o = getJob();
		if (o instanceof Job) {
			Job j = (Job) o;
			j.cancel();
		}
	}

} //L2CAPoutJobImpl
