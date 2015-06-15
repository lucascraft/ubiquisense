/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.eztuio2;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuio2 ICG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.eztuio2.Tuio2ICG#getS_id <em>Sid</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.Tuio2ICG#getPts <em>Pts</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.Tuio2ICG#getAdditional <em>Additional</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.Tuio2ICG#isShapeNeeded <em>Shape Needed</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.osc.eztuio2.Eztuio2Package#getTuio2ICG()
 * @model
 * @generated
 */
public interface Tuio2ICG extends EObject {
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
	 * @see net.sf.smbt.osc.eztuio2.Eztuio2Package#getTuio2ICG_S_id()
	 * @model
	 * @generated
	 */
	String getS_id();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.eztuio2.Tuio2ICG#getS_id <em>Sid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sid</em>' attribute.
	 * @see #getS_id()
	 * @generated
	 */
	void setS_id(String value);

	/**
	 * Returns the value of the '<em><b>Pts</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.osc.eztuio2.TuioPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pts</em>' containment reference list.
	 * @see net.sf.smbt.osc.eztuio2.Eztuio2Package#getTuio2ICG_Pts()
	 * @model containment="true"
	 * @generated
	 */
	EList<TuioPoint> getPts();

	/**
	 * Returns the value of the '<em><b>Additional</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.osc.eztuio2.TuioPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional</em>' containment reference list.
	 * @see net.sf.smbt.osc.eztuio2.Eztuio2Package#getTuio2ICG_Additional()
	 * @model containment="true"
	 * @generated
	 */
	EList<TuioPoint> getAdditional();

	/**
	 * Returns the value of the '<em><b>Shape Needed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape Needed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape Needed</em>' attribute.
	 * @see #setShapeNeeded(boolean)
	 * @see net.sf.smbt.osc.eztuio2.Eztuio2Package#getTuio2ICG_ShapeNeeded()
	 * @model
	 * @generated
	 */
	boolean isShapeNeeded();

	/**
	 * Sets the value of the '{@link net.sf.smbt.osc.eztuio2.Tuio2ICG#isShapeNeeded <em>Shape Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape Needed</em>' attribute.
	 * @see #isShapeNeeded()
	 * @generated
	 */
	void setShapeNeeded(boolean value);

} // Tuio2ICG
