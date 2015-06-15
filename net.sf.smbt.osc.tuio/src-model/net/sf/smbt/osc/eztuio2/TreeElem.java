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
 * A representation of the model object '<em><b>Tree Elem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.eztuio2.TreeElem#getPt <em>Pt</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.TreeElem#getLastNode <em>Last Node</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.TreeElem#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.osc.eztuio2.Eztuio2Package#getTreeElem()
 * @model
 * @generated
 */
public interface TreeElem extends EObject {
	/**
	 * Returns the value of the '<em><b>Pt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pt</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pt</em>' containment reference.
	 * @see #setPt(TuioPoint)
	 * @see net.sf.smbt.osc.eztuio2.Eztuio2Package#getTreeElem_Pt()
	 * @model containment="true"
	 * @generated
	 */
	TuioPoint getPt();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.eztuio2.TreeElem#getPt <em>Pt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pt</em>' containment reference.
	 * @see #getPt()
	 * @generated
	 */
	void setPt(TuioPoint value);

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
	 * @see net.sf.smbt.osc.eztuio2.Eztuio2Package#getTreeElem_LastNode()
	 * @model
	 * @generated
	 */
	int getLastNode();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.eztuio2.TreeElem#getLastNode <em>Last Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Node</em>' attribute.
	 * @see #getLastNode()
	 * @generated
	 */
	void setLastNode(int value);

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
	 * @see net.sf.smbt.osc.eztuio2.Eztuio2Package#getTreeElem_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.eztuio2.TreeElem#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // TreeElem
