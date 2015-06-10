/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmojo;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Motion Reactor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmojo.MotionReactor#getJob <em>Job</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezmojo.EzmojoPackage#getMotionReactor()
 * @model
 * @generated
 */
public interface MotionReactor extends EObject {
	/**
	 * Returns the value of the '<em><b>Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job</em>' attribute.
	 * @see #setJob(Job)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getMotionReactor_Job()
	 * @model dataType="net.sf.smbt.ezmojo.Job"
	 * @generated
	 */
	Job getJob();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.MotionReactor#getJob <em>Job</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job</em>' attribute.
	 * @see #getJob()
	 * @generated
	 */
	void setJob(Job value);

} // MotionReactor
