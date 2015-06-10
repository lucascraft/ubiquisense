/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.model.qxf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Focus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.Focus#getPanMax <em>Pan Max</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.Focus#getTiltMax <em>Tilt Max</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.Focus#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getFocus()
 * @model extendedMetaData="name='Focus' kind='empty'"
 * @generated
 */
public interface Focus extends EObject {
	/**
	 * Returns the value of the '<em><b>Pan Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pan Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pan Max</em>' attribute.
	 * @see #setPanMax(String)
	 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getFocus_PanMax()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='PanMax'"
	 * @generated
	 */
	String getPanMax();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.qxf.Focus#getPanMax <em>Pan Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pan Max</em>' attribute.
	 * @see #getPanMax()
	 * @generated
	 */
	void setPanMax(String value);

	/**
	 * Returns the value of the '<em><b>Tilt Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tilt Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tilt Max</em>' attribute.
	 * @see #setTiltMax(String)
	 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getFocus_TiltMax()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='TiltMax'"
	 * @generated
	 */
	String getTiltMax();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.qxf.Focus#getTiltMax <em>Tilt Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tilt Max</em>' attribute.
	 * @see #getTiltMax()
	 * @generated
	 */
	void setTiltMax(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getFocus_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.qxf.Focus#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Focus
