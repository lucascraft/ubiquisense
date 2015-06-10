/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.firmata.ubiquino;

import net.sf.smbt.mdl.arduino.Arduino;
import net.sf.smbt.xcp.XCPAddress;
import net.sf.xqz.model.engine.IConnectedUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ubiquino</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.firmata.ubiquino.Ubiquino#getBoard <em>Board</em>}</li>
 *   <li>{@link net.sf.smbt.firmata.ubiquino.Ubiquino#getConfig <em>Config</em>}</li>
 *   <li>{@link net.sf.smbt.firmata.ubiquino.Ubiquino#getLastAddress <em>Last Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.firmata.ubiquino.UbiquinoPackage#getUbiquino()
 * @model
 * @generated
 */
public interface Ubiquino extends IConnectedUnit {
	/**
	 * Returns the value of the '<em><b>Board</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Board</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board</em>' containment reference.
	 * @see #setBoard(Arduino)
	 * @see net.sf.smbt.firmata.ubiquino.UbiquinoPackage#getUbiquino_Board()
	 * @model containment="true"
	 * @generated
	 */
	Arduino getBoard();

	/**
	 * Sets the value of the '{@link net.sf.smbt.firmata.ubiquino.Ubiquino#getBoard <em>Board</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board</em>' containment reference.
	 * @see #getBoard()
	 * @generated
	 */
	void setBoard(Arduino value);

	/**
	 * Returns the value of the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' containment reference.
	 * @see #setConfig(UbiquinoConfig)
	 * @see net.sf.smbt.firmata.ubiquino.UbiquinoPackage#getUbiquino_Config()
	 * @model containment="true"
	 * @generated
	 */
	UbiquinoConfig getConfig();

	/**
	 * Sets the value of the '{@link net.sf.smbt.firmata.ubiquino.Ubiquino#getConfig <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' containment reference.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(UbiquinoConfig value);

	/**
	 * Returns the value of the '<em><b>Last Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Address</em>' containment reference.
	 * @see #setLastAddress(XCPAddress)
	 * @see net.sf.smbt.firmata.ubiquino.UbiquinoPackage#getUbiquino_LastAddress()
	 * @model containment="true"
	 * @generated
	 */
	XCPAddress getLastAddress();

	/**
	 * Sets the value of the '{@link net.sf.smbt.firmata.ubiquino.Ubiquino#getLastAddress <em>Last Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Address</em>' containment reference.
	 * @see #getLastAddress()
	 * @generated
	 */
	void setLastAddress(XCPAddress value);

} // Ubiquino
