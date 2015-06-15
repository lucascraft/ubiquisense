/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.eztuio2.impl;

import net.sf.smbt.osc.eztuio2.Eztuio2Package;
import net.sf.smbt.osc.eztuio2.Link;
import net.sf.smbt.osc.eztuio2.LinkTreeElem;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Tree Elem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.LinkTreeElemImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.LinkTreeElemImpl#getLastNode <em>Last Node</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.LinkTreeElemImpl#getLink <em>Link</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkTreeElemImpl extends MinimalEObjectImpl.Container implements LinkTreeElem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkTreeElemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eztuio2Package.Literals.LINK_TREE_ELEM;
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
	public int getId() {
		return (Integer)eGet(Eztuio2Package.Literals.LINK_TREE_ELEM__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		eSet(Eztuio2Package.Literals.LINK_TREE_ELEM__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLastNode() {
		return (Integer)eGet(Eztuio2Package.Literals.LINK_TREE_ELEM__LAST_NODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastNode(int newLastNode) {
		eSet(Eztuio2Package.Literals.LINK_TREE_ELEM__LAST_NODE, newLastNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link getLink() {
		return (Link)eGet(Eztuio2Package.Literals.LINK_TREE_ELEM__LINK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(Link newLink) {
		eSet(Eztuio2Package.Literals.LINK_TREE_ELEM__LINK, newLink);
	}

} //LinkTreeElemImpl
