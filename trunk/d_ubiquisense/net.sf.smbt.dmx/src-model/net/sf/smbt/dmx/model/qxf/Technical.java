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
 * A representation of the model object '<em><b>Technical</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.Technical#getDmxConnector <em>Dmx Connector</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.Technical#getPowerConsumption <em>Power Consumption</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getTechnical()
 * @model extendedMetaData="name='Technical' kind='empty'"
 * @generated
 */
public interface Technical extends EObject {
	/**
	 * Returns the value of the '<em><b>Dmx Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dmx Connector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dmx Connector</em>' attribute.
	 * @see #setDmxConnector(String)
	 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getTechnical_DmxConnector()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='DmxConnector'"
	 * @generated
	 */
	String getDmxConnector();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.qxf.Technical#getDmxConnector <em>Dmx Connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dmx Connector</em>' attribute.
	 * @see #getDmxConnector()
	 * @generated
	 */
	void setDmxConnector(String value);

	/**
	 * Returns the value of the '<em><b>Power Consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power Consumption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Consumption</em>' attribute.
	 * @see #setPowerConsumption(String)
	 * @see net.sf.smbt.dmx.model.qxf.QxfPackage#getTechnical_PowerConsumption()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='PowerConsumption'"
	 * @generated
	 */
	String getPowerConsumption();

	/**
	 * Sets the value of the '{@link net.sf.smbt.dmx.model.qxf.Technical#getPowerConsumption <em>Power Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Consumption</em>' attribute.
	 * @see #getPowerConsumption()
	 * @generated
	 */
	void setPowerConsumption(String value);

} // Technical
