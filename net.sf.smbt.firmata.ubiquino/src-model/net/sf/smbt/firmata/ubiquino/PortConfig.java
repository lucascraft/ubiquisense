/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.firmata.ubiquino;

import net.sf.smbt.mdl.arduino.PIN_MODE;
import net.sf.smbt.mdl.arduino.PWM_MODE;
import net.sf.smbt.mdl.arduino.Port;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.firmata.ubiquino.PortConfig#getTarget <em>Target</em>}</li>
 *   <li>{@link net.sf.smbt.firmata.ubiquino.PortConfig#getKind <em>Kind</em>}</li>
 *   <li>{@link net.sf.smbt.firmata.ubiquino.PortConfig#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link net.sf.smbt.firmata.ubiquino.PortConfig#getMode <em>Mode</em>}</li>
 *   <li>{@link net.sf.smbt.firmata.ubiquino.PortConfig#getPwm <em>Pwm</em>}</li>
 *   <li>{@link net.sf.smbt.firmata.ubiquino.PortConfig#getChannel <em>Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.firmata.ubiquino.UbiquinoPackage#getPortConfig()
 * @model
 * @generated
 */
public interface PortConfig extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Port)
	 * @see net.sf.smbt.firmata.ubiquino.UbiquinoPackage#getPortConfig_Target()
	 * @model
	 * @generated
	 */
	Port getTarget();

	/**
	 * Sets the value of the '{@link net.sf.smbt.firmata.ubiquino.PortConfig#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Port value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.firmata.ubiquino.PortConfigKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.firmata.ubiquino.PortConfigKind
	 * @see #setKind(PortConfigKind)
	 * @see net.sf.smbt.firmata.ubiquino.UbiquinoPackage#getPortConfig_Kind()
	 * @model
	 * @generated
	 */
	PortConfigKind getKind();

	/**
	 * Sets the value of the '{@link net.sf.smbt.firmata.ubiquino.PortConfig#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.firmata.ubiquino.PortConfigKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PortConfigKind value);

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see net.sf.smbt.firmata.ubiquino.UbiquinoPackage#getPortConfig_Enabled()
	 * @model
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link net.sf.smbt.firmata.ubiquino.PortConfig#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.mdl.arduino.PIN_MODE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see net.sf.smbt.mdl.arduino.PIN_MODE
	 * @see #setMode(PIN_MODE)
	 * @see net.sf.smbt.firmata.ubiquino.UbiquinoPackage#getPortConfig_Mode()
	 * @model
	 * @generated
	 */
	PIN_MODE getMode();

	/**
	 * Sets the value of the '{@link net.sf.smbt.firmata.ubiquino.PortConfig#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see net.sf.smbt.mdl.arduino.PIN_MODE
	 * @see #getMode()
	 * @generated
	 */
	void setMode(PIN_MODE value);

	/**
	 * Returns the value of the '<em><b>Pwm</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.mdl.arduino.PWM_MODE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pwm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pwm</em>' attribute.
	 * @see net.sf.smbt.mdl.arduino.PWM_MODE
	 * @see #setPwm(PWM_MODE)
	 * @see net.sf.smbt.firmata.ubiquino.UbiquinoPackage#getPortConfig_Pwm()
	 * @model
	 * @generated
	 */
	PWM_MODE getPwm();

	/**
	 * Sets the value of the '{@link net.sf.smbt.firmata.ubiquino.PortConfig#getPwm <em>Pwm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pwm</em>' attribute.
	 * @see net.sf.smbt.mdl.arduino.PWM_MODE
	 * @see #getPwm()
	 * @generated
	 */
	void setPwm(PWM_MODE value);

	/**
	 * Returns the value of the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel</em>' attribute.
	 * @see #setChannel(int)
	 * @see net.sf.smbt.firmata.ubiquino.UbiquinoPackage#getPortConfig_Channel()
	 * @model
	 * @generated
	 */
	int getChannel();

	/**
	 * Sets the value of the '{@link net.sf.smbt.firmata.ubiquino.PortConfig#getChannel <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel</em>' attribute.
	 * @see #getChannel()
	 * @generated
	 */
	void setChannel(int value);

} // PortConfig
