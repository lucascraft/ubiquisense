/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.model.qxf;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixture Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.FixtureDefinition#getCreator <em>Creator</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.FixtureDefinition#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.FixtureDefinition#getModel <em>Model</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.FixtureDefinition#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.FixtureDefinition#getChannel <em>Channel</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.FixtureDefinition#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getFixtureDefinition()
 * @model extendedMetaData="name='FixtureDefinition' kind='elementOnly'"
 * @generated
 */
public interface FixtureDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Creator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creator</em>' containment reference.
	 * @see #setCreator(Creator)
	 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getFixtureDefinition_Creator()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Creator'"
	 * @generated
	 */
	Creator getCreator();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.qxf.FixtureDefinition#getCreator <em>Creator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creator</em>' containment reference.
	 * @see #getCreator()
	 * @generated
	 */
	void setCreator(Creator value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufacturer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturer</em>' attribute.
	 * @see #setManufacturer(String)
	 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getFixtureDefinition_Manufacturer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Manufacturer'"
	 * @generated
	 */
	String getManufacturer();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.qxf.FixtureDefinition#getManufacturer <em>Manufacturer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' attribute.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getFixtureDefinition_Model()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Model'"
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.qxf.FixtureDefinition#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getFixtureDefinition_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.qxf.FixtureDefinition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Channel</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.dmx.model.qxf.Channel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel</em>' containment reference list.
	 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getFixtureDefinition_Channel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Channel'"
	 * @generated
	 */
	EList<Channel> getChannel();

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.dmx.model.qxf.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' containment reference list.
	 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getFixtureDefinition_Mode()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Mode'"
	 * @generated
	 */
	EList<Mode> getMode();

} // FixtureDefinition
