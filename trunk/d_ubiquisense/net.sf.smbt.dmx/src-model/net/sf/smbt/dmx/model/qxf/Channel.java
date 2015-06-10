/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.model.qxf;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.Channel#getGroup <em>Group</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.Channel#getColour <em>Colour</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.Channel#getCapability <em>Capability</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.Channel#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.Channel#getNumber <em>Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getChannel()
 * @model extendedMetaData="name='Channel' kind='elementOnly'"
 * @generated
 */
public interface Channel extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference.
	 * @see #setGroup(Group)
	 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getChannel_Group()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Group'"
	 * @generated
	 */
	Group getGroup();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.qxf.Channel#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(Group value);

	/**
	 * Returns the value of the '<em><b>Colour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colour</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colour</em>' containment reference.
	 * @see #setColour(Colour)
	 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getChannel_Colour()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Colour'"
	 * @generated
	 */
	Colour getColour();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.qxf.Channel#getColour <em>Colour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colour</em>' containment reference.
	 * @see #getColour()
	 * @generated
	 */
	void setColour(Colour value);

	/**
	 * Returns the value of the '<em><b>Capability</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.dmx.model.qxf.Capability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability</em>' containment reference list.
	 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getChannel_Capability()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Capability'"
	 * @generated
	 */
	EList<Capability> getCapability();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getChannel_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.qxf.Channel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(BigInteger)
	 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getChannel_Number()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='Number'"
	 * @generated
	 */
	BigInteger getNumber();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.qxf.Channel#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(BigInteger value);

} // Channel
