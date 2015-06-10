/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmojo.impl;

import net.sf.smbt.ezmojo.EZTUIOVar;
import net.sf.smbt.ezmojo.EzmojoPackage;
import net.sf.smbt.ezmotion.Motion;
import net.sf.smbt.osc.eztuio2.Tuio2B3D;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EZTUIO Var</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZTUIOVarImpl#getMotion <em>Motion</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZTUIOVarImpl#getB3d <em>B3d</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EZTUIOVarImpl extends EZVarImpl implements EZTUIOVar {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EZTUIOVarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzmojoPackage.Literals.EZTUIO_VAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Motion getMotion() {
		return (Motion)eGet(EzmojoPackage.Literals.EZTUIO_VAR__MOTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotion(Motion newMotion) {
		eSet(EzmojoPackage.Literals.EZTUIO_VAR__MOTION, newMotion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2B3D getB3d() {
		return (Tuio2B3D)eGet(EzmojoPackage.Literals.EZTUIO_VAR__B3D, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB3d(Tuio2B3D newB3d) {
		eSet(EzmojoPackage.Literals.EZTUIO_VAR__B3D, newB3d);
	}

} //EZTUIOVarImpl
