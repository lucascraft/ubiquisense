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
 * A representation of the model object '<em><b>Bulb</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.Bulb#getColourTemperature <em>Colour Temperature</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.Bulb#getLumens <em>Lumens</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.Bulb#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getBulb()
 * @model extendedMetaData="name='Bulb' kind='empty'"
 * @generated
 */
public interface Bulb extends EObject {
	/**
	 * Returns the value of the '<em><b>Colour Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colour Temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colour Temperature</em>' attribute.
	 * @see #setColourTemperature(String)
	 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getBulb_ColourTemperature()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ColourTemperature'"
	 * @generated
	 */
	String getColourTemperature();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.qxf.Bulb#getColourTemperature <em>Colour Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colour Temperature</em>' attribute.
	 * @see #getColourTemperature()
	 * @generated
	 */
	void setColourTemperature(String value);

	/**
	 * Returns the value of the '<em><b>Lumens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lumens</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lumens</em>' attribute.
	 * @see #setLumens(String)
	 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getBulb_Lumens()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Lumens'"
	 * @generated
	 */
	String getLumens();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.qxf.Bulb#getLumens <em>Lumens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lumens</em>' attribute.
	 * @see #getLumens()
	 * @generated
	 */
	void setLumens(String value);

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
	 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getBulb_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.qxf.Bulb#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Bulb
