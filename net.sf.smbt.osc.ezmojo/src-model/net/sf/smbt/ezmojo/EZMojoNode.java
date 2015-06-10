/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmojo;

import net.sf.smbt.ezmotion.Motion;
import net.sf.smbt.motion.engine.MotionEngine;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EZ Mojo Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoNode#getVars <em>Vars</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoNode#getElements <em>Elements</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoNode#getTtl <em>Ttl</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoNode#getToken <em>Token</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoNode#getUuid <em>Uuid</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoNode#getService <em>Service</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoNode#isToggle <em>Toggle</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoNode#getLastBang <em>Last Bang</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoNode#getListeners <em>Listeners</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoNode#getForwards <em>Forwards</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoNode#getMotions <em>Motions</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoNode#getClock <em>Clock</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoNode#getRoot <em>Root</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoNode#getHitsRatePerSec <em>Hits Rate Per Sec</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoNode#getTouches <em>Touches</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoNode#getScripts <em>Scripts</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoNode()
 * @model
 * @generated
 */
public interface EZMojoNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Vars</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezmojo.EZVar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vars</em>' containment reference list.
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoNode_Vars()
	 * @model containment="true"
	 * @generated
	 */
	EList<EZVar> getVars();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezmojo.EZMojoNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoNode_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<EZMojoNode> getElements();

	/**
	 * Returns the value of the '<em><b>Ttl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ttl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ttl</em>' attribute.
	 * @see #setTtl(long)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoNode_Ttl()
	 * @model
	 * @generated
	 */
	long getTtl();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.EZMojoNode#getTtl <em>Ttl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ttl</em>' attribute.
	 * @see #getTtl()
	 * @generated
	 */
	void setTtl(long value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(String)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoNode_Token()
	 * @model
	 * @generated
	 */
	String getToken();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.EZMojoNode#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(String value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uuid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoNode_Uuid()
	 * @model
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.EZMojoNode#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference.
	 * @see #setService(EzMojoService)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoNode_Service()
	 * @model containment="true"
	 * @generated
	 */
	EzMojoService getService();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.EZMojoNode#getService <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' containment reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(EzMojoService value);

	/**
	 * Returns the value of the '<em><b>Toggle</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toggle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toggle</em>' attribute.
	 * @see #setToggle(boolean)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoNode_Toggle()
	 * @model default="false"
	 * @generated
	 */
	boolean isToggle();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.EZMojoNode#isToggle <em>Toggle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toggle</em>' attribute.
	 * @see #isToggle()
	 * @generated
	 */
	void setToggle(boolean value);

	/**
	 * Returns the value of the '<em><b>Last Bang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Bang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Bang</em>' attribute.
	 * @see #setLastBang(long)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoNode_LastBang()
	 * @model transient="true"
	 * @generated
	 */
	long getLastBang();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.EZMojoNode#getLastBang <em>Last Bang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Bang</em>' attribute.
	 * @see #getLastBang()
	 * @generated
	 */
	void setLastBang(long value);

	/**
	 * Returns the value of the '<em><b>Listeners</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezmojo.EZMojoTarget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listeners</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listeners</em>' containment reference list.
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoNode_Listeners()
	 * @model containment="true"
	 * @generated
	 */
	EList<EZMojoTarget> getListeners();

	/**
	 * Returns the value of the '<em><b>Forwards</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezmojo.EZMojoTarget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forwards</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forwards</em>' containment reference list.
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoNode_Forwards()
	 * @model containment="true"
	 * @generated
	 */
	EList<EZMojoTarget> getForwards();

	/**
	 * Returns the value of the '<em><b>Motions</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezmotion.Motion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motions</em>' containment reference list.
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoNode_Motions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Motion> getMotions();

	/**
	 * Returns the value of the '<em><b>Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock</em>' attribute.
	 * @see #setClock(MotionEngine)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoNode_Clock()
	 * @model dataType="net.sf.smbt.ezmojo.MotionEngine"
	 * @generated
	 */
	MotionEngine getClock();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.EZMojoNode#getClock <em>Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock</em>' attribute.
	 * @see #getClock()
	 * @generated
	 */
	void setClock(MotionEngine value);

	/**
	 * Returns the value of the '<em><b>Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link net.sf.smbt.ezmojo.EZMojoRoot#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' container reference.
	 * @see #setRoot(EZMojoRoot)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoNode_Root()
	 * @see net.sf.smbt.ezmojo.EZMojoRoot#getRoot
	 * @model opposite="root" transient="false"
	 * @generated
	 */
	EZMojoRoot getRoot();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.EZMojoNode#getRoot <em>Root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' container reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(EZMojoRoot value);

	/**
	 * Returns the value of the '<em><b>Hits Rate Per Sec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hits Rate Per Sec</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hits Rate Per Sec</em>' attribute.
	 * @see #setHitsRatePerSec(float)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoNode_HitsRatePerSec()
	 * @model transient="true"
	 * @generated
	 */
	float getHitsRatePerSec();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.EZMojoNode#getHitsRatePerSec <em>Hits Rate Per Sec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hits Rate Per Sec</em>' attribute.
	 * @see #getHitsRatePerSec()
	 * @generated
	 */
	void setHitsRatePerSec(float value);

	/**
	 * Returns the value of the '<em><b>Touches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Touches</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Touches</em>' attribute.
	 * @see #isSetTouches()
	 * @see #unsetTouches()
	 * @see #setTouches(long)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoNode_Touches()
	 * @model unsettable="true"
	 * @generated
	 */
	long getTouches();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.EZMojoNode#getTouches <em>Touches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Touches</em>' attribute.
	 * @see #isSetTouches()
	 * @see #unsetTouches()
	 * @see #getTouches()
	 * @generated
	 */
	void setTouches(long value);

	/**
	 * Unsets the value of the '{@link net.sf.smbt.ezmojo.EZMojoNode#getTouches <em>Touches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTouches()
	 * @see #getTouches()
	 * @see #setTouches(long)
	 * @generated
	 */
	void unsetTouches();

	/**
	 * Returns whether the value of the '{@link net.sf.smbt.ezmojo.EZMojoNode#getTouches <em>Touches</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Touches</em>' attribute is set.
	 * @see #unsetTouches()
	 * @see #getTouches()
	 * @see #setTouches(long)
	 * @generated
	 */
	boolean isSetTouches();

	/**
	 * Returns the value of the '<em><b>Scripts</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezmojo.EZScript}.
	 * It is bidirectional and its opposite is '{@link net.sf.smbt.ezmojo.EZScript#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scripts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scripts</em>' containment reference list.
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoNode_Scripts()
	 * @see net.sf.smbt.ezmojo.EZScript#getNode
	 * @model opposite="node" containment="true"
	 * @generated
	 */
	EList<EZScript> getScripts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Object set(String msg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Object get(String msg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Object unset(String msg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Object query(String msg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Object bind(String msg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EZMojoNode listen(String msg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EZMojoNode unlisten(String msg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EZMojoNode forward(String msg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EZMojoNode unforward(String msg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addTrigger(String expr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addKinematics(String expr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeTrigger();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeKinematics();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isService();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getAddr();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void bang(MotionEvalCtx motionVal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<CmdPipe> getCompatibleCmdPipe(String protocolID);

} // EZMojoNode
