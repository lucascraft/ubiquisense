/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.btcomm.impl;

import net.sf.smbt.btcomm.BtcommPackage;
import net.sf.smbt.btcomm.L2CAPInJob;
import net.sf.xqz.model.engine.impl.InputJobImpl;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>L2CAP In Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class L2CAPInJobImpl extends InputJobImpl implements L2CAPInJob {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected L2CAPInJobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BtcommPackage.Literals.L2CAP_IN_JOB;
	}
	
	@Override
	public void close() {
		Object o = getJob();
		if (o instanceof Job) {
			Job j = (Job) o;
			j.cancel();
			j.done(Job.ASYNC_FINISH);
		}
	}
	
	@Override
	protected void finalize() throws Throwable {
		Object o = getJob();
		if (o instanceof Job) {
			Job j = (Job) o;
			j.cancel();
			j.done(Job.ASYNC_FINISH);
		}
	}
} //L2CAPInJobImpl
