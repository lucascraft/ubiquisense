/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.firmata.ubiquino;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.firmata.ubiquino.UbiquinoConfig#getPorts <em>Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.firmata.ubiquino.UbiquinoPackage#getUbiquinoConfig()
 * @model
 * @generated
 */
public interface UbiquinoConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.firmata.ubiquino.PortConfig}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see net.sf.smbt.firmata.ubiquino.UbiquinoPackage#getUbiquinoConfig_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortConfig> getPorts();

} // UbiquinoConfig
