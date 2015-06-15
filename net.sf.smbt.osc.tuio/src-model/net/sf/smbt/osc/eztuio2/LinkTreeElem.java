/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.eztuio2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Tree Elem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.eztuio2.LinkTreeElem#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.LinkTreeElem#getLastNode <em>Last Node</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.LinkTreeElem#getLink <em>Link</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.osc.eztuio2.Eztuio2Package#getLinkTreeElem()
 * @model
 * @generated
 */
public interface LinkTreeElem extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see net.sf.smbt.osc.eztuio2.Eztuio2Package#getLinkTreeElem_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.eztuio2.LinkTreeElem#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Last Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Node</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Node</em>' attribute.
	 * @see #setLastNode(int)
	 * @see net.sf.smbt.osc.eztuio2.Eztuio2Package#getLinkTreeElem_LastNode()
	 * @model
	 * @generated
	 */
	int getLastNode();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.eztuio2.LinkTreeElem#getLastNode <em>Last Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Node</em>' attribute.
	 * @see #getLastNode()
	 * @generated
	 */
	void setLastNode(int value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference.
	 * @see #setLink(Link)
	 * @see net.sf.smbt.osc.eztuio2.Eztuio2Package#getLinkTreeElem_Link()
	 * @model containment="true"
	 * @generated
	 */
	Link getLink();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.eztuio2.LinkTreeElem#getLink <em>Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' containment reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(Link value);

} // LinkTreeElem
