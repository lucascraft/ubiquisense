/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmojo;

import net.sf.xqz.model.engine.IConnectedUnit;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EZ Mojo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoRoot#getRoot <em>Root</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoRoot#getSelected <em>Selected</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoRoot#getTargets <em>Targets</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoRoot#isFeedback <em>Feedback</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoRoot#getMotionReactor <em>Motion Reactor</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoRoot#isVarsMode <em>Vars Mode</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.EZMojoRoot#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoRoot()
 * @model
 * @generated
 */
public interface EZMojoRoot extends IConnectedUnit {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link net.sf.smbt.ezmojo.EZMojoNode#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(EZMojoNode)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoRoot_Root()
	 * @see net.sf.smbt.ezmojo.EZMojoNode#getRoot
	 * @model opposite="root" containment="true"
	 * @generated
	 */
	EZMojoNode getRoot();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.EZMojoRoot#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(EZMojoNode value);

	/**
	 * Returns the value of the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' reference.
	 * @see #setSelected(EZMojoNode)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoRoot_Selected()
	 * @model
	 * @generated
	 */
	EZMojoNode getSelected();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.EZMojoRoot#getSelected <em>Selected</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' reference.
	 * @see #getSelected()
	 * @generated
	 */
	void setSelected(EZMojoNode value);

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezmojo.EZMojoTarget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' containment reference list.
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoRoot_Targets()
	 * @model containment="true"
	 * @generated
	 */
	EList<EZMojoTarget> getTargets();

	/**
	 * Returns the value of the '<em><b>Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feedback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback</em>' attribute.
	 * @see #setFeedback(boolean)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoRoot_Feedback()
	 * @model
	 * @generated
	 */
	boolean isFeedback();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.EZMojoRoot#isFeedback <em>Feedback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feedback</em>' attribute.
	 * @see #isFeedback()
	 * @generated
	 */
	void setFeedback(boolean value);

	/**
	 * Returns the value of the '<em><b>Motion Reactor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motion Reactor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motion Reactor</em>' containment reference.
	 * @see #setMotionReactor(MotionReactor)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoRoot_MotionReactor()
	 * @model containment="true"
	 * @generated
	 */
	MotionReactor getMotionReactor();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.EZMojoRoot#getMotionReactor <em>Motion Reactor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motion Reactor</em>' containment reference.
	 * @see #getMotionReactor()
	 * @generated
	 */
	void setMotionReactor(MotionReactor value);

	/**
	 * Returns the value of the '<em><b>Vars Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vars Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vars Mode</em>' attribute.
	 * @see #setVarsMode(boolean)
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoRoot_VarsMode()
	 * @model
	 * @generated
	 */
	boolean isVarsMode();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmojo.EZMojoRoot#isVarsMode <em>Vars Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vars Mode</em>' attribute.
	 * @see #isVarsMode()
	 * @generated
	 */
	void setVarsMode(boolean value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link net.sf.smbt.ezmojo.EZMojoNode},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' map.
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoRoot_Index()
	 * @model mapType="net.sf.smbt.ezmojo.Index2MojoNode<org.eclipse.emf.ecore.EString, net.sf.smbt.ezmojo.EZMojoNode>"
	 * @generated
	 */
	EMap<String, EZMojoNode> getIndex();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<EZMojoNode> accept(String cmd);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<EZMojoNode> accept(EZMojoCmd cmd);

} // EZMojo
