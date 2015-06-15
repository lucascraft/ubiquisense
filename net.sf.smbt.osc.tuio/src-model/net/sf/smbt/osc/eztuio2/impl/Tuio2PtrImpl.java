/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.eztuio2.impl;

import net.sf.smbt.osc.eztuio2.Eztuio2Package;
import net.sf.smbt.osc.eztuio2.Tuio2Ptr;
import net.sf.smbt.osccmd.impl.OscCmdImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tuio2 Ptr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2PtrImpl#getS_id <em>Sid</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2PtrImpl#getTu_id <em>Tu id</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2PtrImpl#getC_id <em>Cid</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2PtrImpl#getX_pos <em>Xpos</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2PtrImpl#getY_pos <em>Ypos</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2PtrImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2PtrImpl#getPress <em>Press</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2PtrImpl#getX_vel <em>Xvel</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2PtrImpl#getY_vel <em>Yvel</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2PtrImpl#getM_acc <em>Macc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Tuio2PtrImpl extends OscCmdImpl implements Tuio2Ptr {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tuio2PtrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eztuio2Package.Literals.TUIO2_PTR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getS_id() {
		return (String)eGet(Eztuio2Package.Literals.TUIO2_PTR__SID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS_id(String newS_id) {
		eSet(Eztuio2Package.Literals.TUIO2_PTR__SID, newS_id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTu_id() {
		return (String)eGet(Eztuio2Package.Literals.TUIO2_PTR__TU_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTu_id(String newTu_id) {
		eSet(Eztuio2Package.Literals.TUIO2_PTR__TU_ID, newTu_id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getC_id() {
		return (String)eGet(Eztuio2Package.Literals.TUIO2_PTR__CID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC_id(String newC_id) {
		eSet(Eztuio2Package.Literals.TUIO2_PTR__CID, newC_id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getX_pos() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_PTR__XPOS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX_pos(float newX_pos) {
		eSet(Eztuio2Package.Literals.TUIO2_PTR__XPOS, newX_pos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getY_pos() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_PTR__YPOS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY_pos(float newY_pos) {
		eSet(Eztuio2Package.Literals.TUIO2_PTR__YPOS, newY_pos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return (Integer)eGet(Eztuio2Package.Literals.TUIO2_PTR__WIDTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		eSet(Eztuio2Package.Literals.TUIO2_PTR__WIDTH, newWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPress() {
		return (Integer)eGet(Eztuio2Package.Literals.TUIO2_PTR__PRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPress(int newPress) {
		eSet(Eztuio2Package.Literals.TUIO2_PTR__PRESS, newPress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getX_vel() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_PTR__XVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX_vel(float newX_vel) {
		eSet(Eztuio2Package.Literals.TUIO2_PTR__XVEL, newX_vel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getY_vel() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_PTR__YVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY_vel(float newY_vel) {
		eSet(Eztuio2Package.Literals.TUIO2_PTR__YVEL, newY_vel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getM_acc() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_PTR__MACC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_acc(float newM_acc) {
		eSet(Eztuio2Package.Literals.TUIO2_PTR__MACC, newM_acc);
	}

} //Tuio2PtrImpl
