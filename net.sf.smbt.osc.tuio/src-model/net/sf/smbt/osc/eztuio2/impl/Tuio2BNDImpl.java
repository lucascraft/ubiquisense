/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.eztuio2.impl;

import net.sf.smbt.osc.eztuio2.Eztuio2Package;
import net.sf.smbt.osc.eztuio2.Tuio2BND;
import net.sf.smbt.osccmd.impl.OscCmdImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tuio2 BND</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2BNDImpl#getS_id <em>Sid</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2BNDImpl#getX_pos <em>Xpos</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2BNDImpl#getY_pos <em>Ypos</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2BNDImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2BNDImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2BNDImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2BNDImpl#getArea <em>Area</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2BNDImpl#getX_vel <em>Xvel</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2BNDImpl#getY_vel <em>Yvel</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2BNDImpl#getA_vel <em>Avel</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2BNDImpl#getM_acc <em>Macc</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2BNDImpl#getR_acc <em>Racc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Tuio2BNDImpl extends OscCmdImpl implements Tuio2BND {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tuio2BNDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eztuio2Package.Literals.TUIO2_BND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getS_id() {
		return (String)eGet(Eztuio2Package.Literals.TUIO2_BND__SID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS_id(String newS_id) {
		eSet(Eztuio2Package.Literals.TUIO2_BND__SID, newS_id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getX_pos() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_BND__XPOS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX_pos(float newX_pos) {
		eSet(Eztuio2Package.Literals.TUIO2_BND__XPOS, newX_pos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getY_pos() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_BND__YPOS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY_pos(float newY_pos) {
		eSet(Eztuio2Package.Literals.TUIO2_BND__YPOS, newY_pos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAngle() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_BND__ANGLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngle(float newAngle) {
		eSet(Eztuio2Package.Literals.TUIO2_BND__ANGLE, newAngle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return (Integer)eGet(Eztuio2Package.Literals.TUIO2_BND__WIDTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		eSet(Eztuio2Package.Literals.TUIO2_BND__WIDTH, newWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return (Integer)eGet(Eztuio2Package.Literals.TUIO2_BND__HEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		eSet(Eztuio2Package.Literals.TUIO2_BND__HEIGHT, newHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArea() {
		return (String)eGet(Eztuio2Package.Literals.TUIO2_BND__AREA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArea(String newArea) {
		eSet(Eztuio2Package.Literals.TUIO2_BND__AREA, newArea);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getX_vel() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_BND__XVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX_vel(float newX_vel) {
		eSet(Eztuio2Package.Literals.TUIO2_BND__XVEL, newX_vel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getY_vel() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_BND__YVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY_vel(float newY_vel) {
		eSet(Eztuio2Package.Literals.TUIO2_BND__YVEL, newY_vel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getA_vel() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_BND__AVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA_vel(float newA_vel) {
		eSet(Eztuio2Package.Literals.TUIO2_BND__AVEL, newA_vel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getM_acc() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_BND__MACC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_acc(float newM_acc) {
		eSet(Eztuio2Package.Literals.TUIO2_BND__MACC, newM_acc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getR_acc() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_BND__RACC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR_acc(float newR_acc) {
		eSet(Eztuio2Package.Literals.TUIO2_BND__RACC, newR_acc);
	}

} //Tuio2BNDImpl
