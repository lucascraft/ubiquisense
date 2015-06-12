/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.thingmcfg;

import gnu.io.CommPortIdentifier;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thing MCfg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.thingmcfg.ThingMCfg#getPortAddr <em>Port Addr</em>}</li>
 *   <li>{@link net.sf.smbt.thingmcfg.ThingMCfg#getSpeed <em>Speed</em>}</li>
 *   <li>{@link net.sf.smbt.thingmcfg.ThingMCfg#getDevice <em>Device</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.thingmcfg.ThingmcfgPackage#getThingMCfg()
 * @model
 * @generated
 */
public interface ThingMCfg extends EObject {
	/**
	 * Returns the value of the '<em><b>Port Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Addr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Addr</em>' attribute.
	 * @see #setPortAddr(CommPortIdentifier)
	 * @see net.sf.smbt.thingmcfg.ThingmcfgPackage#getThingMCfg_PortAddr()
	 * @model dataType="net.sf.smbt.thingmcfg.CommPortIdentifier"
	 * @generated
	 */
	CommPortIdentifier getPortAddr();

	/**
	 * Sets the value of the '{@link net.sf.smbt.thingmcfg.ThingMCfg#getPortAddr <em>Port Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Addr</em>' attribute.
	 * @see #getPortAddr()
	 * @generated
	 */
	void setPortAddr(CommPortIdentifier value);

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(int)
	 * @see net.sf.smbt.thingmcfg.ThingmcfgPackage#getThingMCfg_Speed()
	 * @model
	 * @generated
	 */
	int getSpeed();

	/**
	 * Sets the value of the '{@link net.sf.smbt.thingmcfg.ThingMCfg#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(int value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.thingmcfg.ThingMDevice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' attribute.
	 * @see net.sf.smbt.thingmcfg.ThingMDevice
	 * @see #setDevice(ThingMDevice)
	 * @see net.sf.smbt.thingmcfg.ThingmcfgPackage#getThingMCfg_Device()
	 * @model
	 * @generated
	 */
	ThingMDevice getDevice();

	/**
	 * Sets the value of the '{@link net.sf.smbt.thingmcfg.ThingMCfg#getDevice <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' attribute.
	 * @see net.sf.smbt.thingmcfg.ThingMDevice
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(ThingMDevice value);

} // ThingMCfg
