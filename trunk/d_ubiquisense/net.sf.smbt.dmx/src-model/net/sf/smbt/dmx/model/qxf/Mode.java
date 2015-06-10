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
 * A representation of the model object '<em><b>Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.Mode#getPhysical <em>Physical</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.Mode#getChannel <em>Channel</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.Mode#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getMode()
 * @model extendedMetaData="name='Mode' kind='elementOnly'"
 * @generated
 */
public interface Mode extends EObject {
	/**
	 * Returns the value of the '<em><b>Physical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical</em>' containment reference.
	 * @see #setPhysical(Physical)
	 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getMode_Physical()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Physical'"
	 * @generated
	 */
	Physical getPhysical();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.qxf.Mode#getPhysical <em>Physical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical</em>' containment reference.
	 * @see #getPhysical()
	 * @generated
	 */
	void setPhysical(Physical value);

	/**
	 * Returns the value of the '<em><b>Channel</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.dmx.model.qxf.ModeChannel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel</em>' containment reference list.
	 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getMode_Channel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Channel'"
	 * @generated
	 */
	EList<ModeChannel> getChannel();

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
	 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getMode_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.qxf.Mode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Mode
