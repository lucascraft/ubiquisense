/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.eztuio2;

import net.sf.smbt.osccmd.OscCmd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuio2 LTA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.eztuio2.Tuio2LTA#getS_id <em>Sid</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.Tuio2LTA#isBool <em>Bool</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.Tuio2LTA#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.osc.eztuio2.Eztuio2Package#getTuio2LTA()
 * @model
 * @generated
 */
public interface Tuio2LTA extends OscCmd {
	/**
	 * Returns the value of the '<em><b>Sid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sid</em>' attribute.
	 * @see #setS_id(String)
	 * @see net.sf.smbt.osc.eztuio2.Eztuio2Package#getTuio2LTA_S_id()
	 * @model
	 * @generated
	 */
	String getS_id();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.eztuio2.Tuio2LTA#getS_id <em>Sid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sid</em>' attribute.
	 * @see #getS_id()
	 * @generated
	 */
	void setS_id(String value);

	/**
	 * Returns the value of the '<em><b>Bool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool</em>' attribute.
	 * @see #setBool(boolean)
	 * @see net.sf.smbt.osc.eztuio2.Eztuio2Package#getTuio2LTA_Bool()
	 * @model
	 * @generated
	 */
	boolean isBool();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.eztuio2.Tuio2LTA#isBool <em>Bool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bool</em>' attribute.
	 * @see #isBool()
	 * @generated
	 */
	void setBool(boolean value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.osc.eztuio2.LinkTreeElem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see net.sf.smbt.osc.eztuio2.Eztuio2Package#getTuio2LTA_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkTreeElem> getLinks();

} // Tuio2LTA
