/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.eztuio2.impl;

import net.sf.smbt.osc.eztuio2.Eztuio2Package;
import net.sf.smbt.osc.eztuio2.Tuio2T3D;
import net.sf.smbt.osccmd.impl.OscCmdImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tuio2 T3D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2T3DImpl#getS_id <em>Sid</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2T3DImpl#getTu_id <em>Tu id</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2T3DImpl#getC_id <em>Cid</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2T3DImpl#getX_pos <em>Xpos</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2T3DImpl#getY_pos <em>Ypos</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2T3DImpl#getZ_pos <em>Zpos</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2T3DImpl#getYaw <em>Yaw</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2T3DImpl#getPitch <em>Pitch</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2T3DImpl#getRoll <em>Roll</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2T3DImpl#getX_vel <em>Xvel</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2T3DImpl#getY_vel <em>Yvel</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2T3DImpl#getZ_vel <em>Zvel</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2T3DImpl#getA_vel <em>Avel</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2T3DImpl#getB_vel <em>Bvel</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2T3DImpl#getC_vel <em>Cvel</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2T3DImpl#getM_acc <em>Macc</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2T3DImpl#getR_acc <em>Racc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Tuio2T3DImpl extends OscCmdImpl implements Tuio2T3D {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tuio2T3DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eztuio2Package.Literals.TUIO2_T3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getS_id() {
		return (String)eGet(Eztuio2Package.Literals.TUIO2_T3D__SID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS_id(String newS_id) {
		eSet(Eztuio2Package.Literals.TUIO2_T3D__SID, newS_id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTu_id() {
		return (String)eGet(Eztuio2Package.Literals.TUIO2_T3D__TU_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTu_id(String newTu_id) {
		eSet(Eztuio2Package.Literals.TUIO2_T3D__TU_ID, newTu_id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getC_id() {
		return (String)eGet(Eztuio2Package.Literals.TUIO2_T3D__CID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC_id(String newC_id) {
		eSet(Eztuio2Package.Literals.TUIO2_T3D__CID, newC_id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getX_pos() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_T3D__XPOS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX_pos(float newX_pos) {
		eSet(Eztuio2Package.Literals.TUIO2_T3D__XPOS, newX_pos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getY_pos() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_T3D__YPOS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY_pos(float newY_pos) {
		eSet(Eztuio2Package.Literals.TUIO2_T3D__YPOS, newY_pos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getZ_pos() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_T3D__ZPOS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ_pos(float newZ_pos) {
		eSet(Eztuio2Package.Literals.TUIO2_T3D__ZPOS, newZ_pos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getYaw() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_T3D__YAW, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYaw(float newYaw) {
		eSet(Eztuio2Package.Literals.TUIO2_T3D__YAW, newYaw);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPitch() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_T3D__PITCH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPitch(float newPitch) {
		eSet(Eztuio2Package.Literals.TUIO2_T3D__PITCH, newPitch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRoll() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_T3D__ROLL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoll(float newRoll) {
		eSet(Eztuio2Package.Literals.TUIO2_T3D__ROLL, newRoll);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getX_vel() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_T3D__XVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX_vel(float newX_vel) {
		eSet(Eztuio2Package.Literals.TUIO2_T3D__XVEL, newX_vel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getY_vel() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_T3D__YVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY_vel(float newY_vel) {
		eSet(Eztuio2Package.Literals.TUIO2_T3D__YVEL, newY_vel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getZ_vel() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_T3D__ZVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ_vel(float newZ_vel) {
		eSet(Eztuio2Package.Literals.TUIO2_T3D__ZVEL, newZ_vel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getA_vel() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_T3D__AVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA_vel(float newA_vel) {
		eSet(Eztuio2Package.Literals.TUIO2_T3D__AVEL, newA_vel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getB_vel() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_T3D__BVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB_vel(float newB_vel) {
		eSet(Eztuio2Package.Literals.TUIO2_T3D__BVEL, newB_vel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getC_vel() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_T3D__CVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC_vel(float newC_vel) {
		eSet(Eztuio2Package.Literals.TUIO2_T3D__CVEL, newC_vel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getM_acc() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_T3D__MACC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_acc(float newM_acc) {
		eSet(Eztuio2Package.Literals.TUIO2_T3D__MACC, newM_acc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getR_acc() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_T3D__RACC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR_acc(float newR_acc) {
		eSet(Eztuio2Package.Literals.TUIO2_T3D__RACC, newR_acc);
	}

} //Tuio2T3DImpl
