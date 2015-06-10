/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmojo;

import net.sf.smbt.ezmotion.Motion;
import net.sf.smbt.osc.eztuio2.Tuio2B3D;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EZTUIO Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmojo.EZTUIOVar#getMotion <em>Motion</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.EZTUIOVar#getB3d <em>B3d</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZTUIOVar()
 * @model
 * @generated
 */
public interface EZTUIOVar extends EZVar {
	/**
	 * Returns the value of the '<em><b>Motion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motion</em>' reference.
	 * @see #setMotion(Motion)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZTUIOVar_Motion()
	 * @model
	 * @generated
	 */
	Motion getMotion();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.EZTUIOVar#getMotion <em>Motion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motion</em>' reference.
	 * @see #getMotion()
	 * @generated
	 */
	void setMotion(Motion value);

	/**
	 * Returns the value of the '<em><b>B3d</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B3d</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B3d</em>' reference.
	 * @see #setB3d(Tuio2B3D)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZTUIOVar_B3d()
	 * @model
	 * @generated
	 */
	Tuio2B3D getB3d();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.EZTUIOVar#getB3d <em>B3d</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B3d</em>' reference.
	 * @see #getB3d()
	 * @generated
	 */
	void setB3d(Tuio2B3D value);

} // EZTUIOVar
