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
 * A representation of the model object '<em><b>Tuio2 COA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.eztuio2.Tuio2COA#getS_id <em>Sid</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.Tuio2COA#getSlot <em>Slot</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.Tuio2COA#getIds <em>Ids</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.osc.eztuio2.Eztuio2Package#getTuio2COA()
 * @model
 * @generated
 */
public interface Tuio2COA extends OscCmd {
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
	 * @see net.sf.smbt.osc.eztuio2.Eztuio2Package#getTuio2COA_S_id()
	 * @model
	 * @generated
	 */
	String getS_id();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.eztuio2.Tuio2COA#getS_id <em>Sid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sid</em>' attribute.
	 * @see #getS_id()
	 * @generated
	 */
	void setS_id(String value);

	/**
	 * Returns the value of the '<em><b>Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot</em>' attribute.
	 * @see #setSlot(String)
	 * @see net.sf.smbt.osc.eztuio2.Eztuio2Package#getTuio2COA_Slot()
	 * @model
	 * @generated
	 */
	String getSlot();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.eztuio2.Tuio2COA#getSlot <em>Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot</em>' attribute.
	 * @see #getSlot()
	 * @generated
	 */
	void setSlot(String value);

	/**
	 * Returns the value of the '<em><b>Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ids</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ids</em>' attribute list.
	 * @see net.sf.smbt.osc.eztuio2.Eztuio2Package#getTuio2COA_Ids()
	 * @model
	 * @generated
	 */
	EList<String> getIds();

} // Tuio2COA
