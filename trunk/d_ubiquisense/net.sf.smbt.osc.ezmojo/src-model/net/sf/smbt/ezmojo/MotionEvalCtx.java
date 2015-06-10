/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmojo;

import net.sf.smbt.ezmotion.Motion;
import net.sf.smbt.ezmotion.MotionValue;
import net.sf.smbt.osccmd.OscCmd;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Motion Eval Ctx</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmojo.MotionEvalCtx#getCtx <em>Ctx</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.MotionEvalCtx#getKicked <em>Kicked</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.MotionEvalCtx#getScript <em>Script</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.MotionEvalCtx#getNode <em>Node</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.MotionEvalCtx#getCmd <em>Cmd</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.MotionEvalCtx#getStrategy <em>Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezmojo.EzmojoPackage#getMotionEvalCtx()
 * @model
 * @generated
 */
public interface MotionEvalCtx extends EObject {
	/**
	 * Returns the value of the '<em><b>Ctx</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.ezmotion.Motion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ctx</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ctx</em>' reference list.
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getMotionEvalCtx_Ctx()
	 * @model
	 * @generated
	 */
	EList<Motion> getCtx();

	/**
	 * Returns the value of the '<em><b>Kicked</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kicked</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kicked</em>' reference.
	 * @see #setKicked(MotionValue)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getMotionEvalCtx_Kicked()
	 * @model
	 * @generated
	 */
	MotionValue getKicked();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.MotionEvalCtx#getKicked <em>Kicked</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kicked</em>' reference.
	 * @see #getKicked()
	 * @generated
	 */
	void setKicked(MotionValue value);

	/**
	 * Returns the value of the '<em><b>Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' reference.
	 * @see #setScript(EZScript)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getMotionEvalCtx_Script()
	 * @model
	 * @generated
	 */
	EZScript getScript();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.MotionEvalCtx#getScript <em>Script</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' reference.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(EZScript value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(EZMojoNode)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getMotionEvalCtx_Node()
	 * @model
	 * @generated
	 */
	EZMojoNode getNode();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.MotionEvalCtx#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(EZMojoNode value);

	/**
	 * Returns the value of the '<em><b>Cmd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cmd</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmd</em>' reference.
	 * @see #setCmd(OscCmd)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getMotionEvalCtx_Cmd()
	 * @model
	 * @generated
	 */
	OscCmd getCmd();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.MotionEvalCtx#getCmd <em>Cmd</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmd</em>' reference.
	 * @see #getCmd()
	 * @generated
	 */
	void setCmd(OscCmd value);

	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.ezmojo.MotionEvalStrategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' attribute.
	 * @see net.sf.smbt.ezmojo.MotionEvalStrategy
	 * @see #setStrategy(MotionEvalStrategy)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getMotionEvalCtx_Strategy()
	 * @model
	 * @generated
	 */
	MotionEvalStrategy getStrategy();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.MotionEvalCtx#getStrategy <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy</em>' attribute.
	 * @see net.sf.smbt.ezmojo.MotionEvalStrategy
	 * @see #getStrategy()
	 * @generated
	 */
	void setStrategy(MotionEvalStrategy value);

} // MotionEvalCtx
