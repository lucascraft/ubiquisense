/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eeml.xsd._0._5;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eeml Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eeml.xsd._0._5.EemlType#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.EemlType#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eeml.xsd._0._5._5Package#getEemlType()
 * @model extendedMetaData="name='eeml_._type' kind='elementOnly'"
 * @generated
 */
public interface EemlType extends EObject {
	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference list.
	 * The list contents are of type {@link org.eeml.xsd._0._5.EnvironmentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference list.
	 * @see org.eeml.xsd._0._5._5Package#getEemlType_Environment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='environment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EnvironmentType> getEnvironment();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eeml.xsd._0._5.VersionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see org.eeml.xsd._0._5.VersionType
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(VersionType)
	 * @see org.eeml.xsd._0._5._5Package#getEemlType_Version()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	VersionType getVersion();

	/**
	 * Sets the value of the '{@link org.eeml.xsd._0._5.EemlType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see org.eeml.xsd._0._5.VersionType
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(VersionType value);

	/**
	 * Unsets the value of the '{@link org.eeml.xsd._0._5.EemlType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(VersionType)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link org.eeml.xsd._0._5.EemlType#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(VersionType)
	 * @generated
	 */
	boolean isSetVersion();

} // EemlType
