/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.eztuio2.impl;

import net.sf.smbt.osc.eztuio2.Eztuio2Package;
import net.sf.smbt.osc.eztuio2.TreeElem;
import net.sf.smbt.osc.eztuio2.TuioPoint;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tree Elem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.TreeElemImpl#getPt <em>Pt</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.TreeElemImpl#getLastNode <em>Last Node</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.TreeElemImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TreeElemImpl extends MinimalEObjectImpl.Container implements TreeElem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreeElemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eztuio2Package.Literals.TREE_ELEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuioPoint getPt() {
		return (TuioPoint)eGet(Eztuio2Package.Literals.TREE_ELEM__PT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPt(TuioPoint newPt) {
		eSet(Eztuio2Package.Literals.TREE_ELEM__PT, newPt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLastNode() {
		return (Integer)eGet(Eztuio2Package.Literals.TREE_ELEM__LAST_NODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastNode(int newLastNode) {
		eSet(Eztuio2Package.Literals.TREE_ELEM__LAST_NODE, newLastNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return (Integer)eGet(Eztuio2Package.Literals.TREE_ELEM__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		eSet(Eztuio2Package.Literals.TREE_ELEM__ID, newId);
	}

} //TreeElemImpl
