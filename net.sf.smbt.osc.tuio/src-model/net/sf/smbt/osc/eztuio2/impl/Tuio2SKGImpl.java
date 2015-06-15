/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.eztuio2.impl;

import net.sf.smbt.osc.eztuio2.Eztuio2Package;
import net.sf.smbt.osc.eztuio2.TreeElem;
import net.sf.smbt.osc.eztuio2.Tuio2SKG;
import net.sf.smbt.osccmd.impl.OscCmdImpl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tuio2 SKG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2SKGImpl#getS_id <em>Sid</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2SKGImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2SKGImpl#getRadiuses <em>Radiuses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Tuio2SKGImpl extends OscCmdImpl implements Tuio2SKG {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tuio2SKGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eztuio2Package.Literals.TUIO2_SKG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getS_id() {
		return (String)eGet(Eztuio2Package.Literals.TUIO2_SKG__SID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS_id(String newS_id) {
		eSet(Eztuio2Package.Literals.TUIO2_SKG__SID, newS_id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TreeElem> getNodes() {
		return (EList<TreeElem>)eGet(Eztuio2Package.Literals.TUIO2_SKG__NODES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Integer> getRadiuses() {
		return (EList<Integer>)eGet(Eztuio2Package.Literals.TUIO2_SKG__RADIUSES, true);
	}

} //Tuio2SKGImpl
