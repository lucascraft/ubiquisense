/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.eztuio2.impl;

import net.sf.smbt.osc.eztuio2.Eztuio2Package;
import net.sf.smbt.osc.eztuio2.Tuio2Sym;
import net.sf.smbt.osccmd.impl.OscCmdImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tuio2 Sym</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2SymImpl#getS_id <em>Sid</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2SymImpl#getTu_id <em>Tu id</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2SymImpl#getC_id <em>Cid</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2SymImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2SymImpl#getS <em>S</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Tuio2SymImpl extends OscCmdImpl implements Tuio2Sym {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tuio2SymImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eztuio2Package.Literals.TUIO2_SYM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getS_id() {
		return (String)eGet(Eztuio2Package.Literals.TUIO2_SYM__SID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS_id(String newS_id) {
		eSet(Eztuio2Package.Literals.TUIO2_SYM__SID, newS_id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTu_id() {
		return (String)eGet(Eztuio2Package.Literals.TUIO2_SYM__TU_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTu_id(String newTu_id) {
		eSet(Eztuio2Package.Literals.TUIO2_SYM__TU_ID, newTu_id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getC_id() {
		return (String)eGet(Eztuio2Package.Literals.TUIO2_SYM__CID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC_id(String newC_id) {
		eSet(Eztuio2Package.Literals.TUIO2_SYM__CID, newC_id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroup() {
		return (String)eGet(Eztuio2Package.Literals.TUIO2_SYM__GROUP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(String newGroup) {
		eSet(Eztuio2Package.Literals.TUIO2_SYM__GROUP, newGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getS() {
		return (String)eGet(Eztuio2Package.Literals.TUIO2_SYM__S, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS(String newS) {
		eSet(Eztuio2Package.Literals.TUIO2_SYM__S, newS);
	}

} //Tuio2SymImpl
