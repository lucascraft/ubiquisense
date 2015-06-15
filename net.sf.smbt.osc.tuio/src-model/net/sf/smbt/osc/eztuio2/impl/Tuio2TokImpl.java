/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.eztuio2.impl;

import net.sf.smbt.osc.eztuio2.Eztuio2Package;
import net.sf.smbt.osc.eztuio2.Tuio2Tok;
import net.sf.smbt.osccmd.impl.OscCmdImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tuio2 Tok</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2TokImpl#getS_id <em>Sid</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2TokImpl#getTu_id <em>Tu id</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2TokImpl#getC_id <em>Cid</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2TokImpl#getX_pos <em>Xpos</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2TokImpl#getY_pos <em>Ypos</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2TokImpl#getX_vel <em>Xvel</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2TokImpl#getY_vel <em>Yvel</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2TokImpl#getM_acc <em>Macc</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2TokImpl#getR_acc <em>Racc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Tuio2TokImpl extends OscCmdImpl implements Tuio2Tok {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tuio2TokImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eztuio2Package.Literals.TUIO2_TOK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getS_id() {
		return (String)eGet(Eztuio2Package.Literals.TUIO2_TOK__SID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS_id(String newS_id) {
		eSet(Eztuio2Package.Literals.TUIO2_TOK__SID, newS_id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTu_id() {
		return (String)eGet(Eztuio2Package.Literals.TUIO2_TOK__TU_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTu_id(String newTu_id) {
		eSet(Eztuio2Package.Literals.TUIO2_TOK__TU_ID, newTu_id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getC_id() {
		return (String)eGet(Eztuio2Package.Literals.TUIO2_TOK__CID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC_id(String newC_id) {
		eSet(Eztuio2Package.Literals.TUIO2_TOK__CID, newC_id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getX_pos() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_TOK__XPOS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX_pos(float newX_pos) {
		eSet(Eztuio2Package.Literals.TUIO2_TOK__XPOS, newX_pos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getY_pos() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_TOK__YPOS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY_pos(float newY_pos) {
		eSet(Eztuio2Package.Literals.TUIO2_TOK__YPOS, newY_pos);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getX_vel() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_TOK__XVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX_vel(float newX_vel) {
		eSet(Eztuio2Package.Literals.TUIO2_TOK__XVEL, newX_vel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getY_vel() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_TOK__YVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY_vel(float newY_vel) {
		eSet(Eztuio2Package.Literals.TUIO2_TOK__YVEL, newY_vel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getM_acc() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_TOK__MACC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM_acc(float newM_acc) {
		eSet(Eztuio2Package.Literals.TUIO2_TOK__MACC, newM_acc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getR_acc() {
		return (Float)eGet(Eztuio2Package.Literals.TUIO2_TOK__RACC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR_acc(float newR_acc) {
		eSet(Eztuio2Package.Literals.TUIO2_TOK__RACC, newR_acc);
	}

} //Tuio2TokImpl
