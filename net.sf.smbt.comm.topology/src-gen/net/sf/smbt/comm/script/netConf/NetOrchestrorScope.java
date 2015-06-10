/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.comm.script.netConf;

import net.sf.xqz.engine.script.orchestror.DSLOrchestror;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Net Orchestror Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.comm.script.netConf.NetOrchestrorScope#getDslOrchestror <em>Dsl Orchestror</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.NetOrchestrorScope#getBinds <em>Binds</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.comm.script.netConf.NetConfPackage#getNetOrchestrorScope()
 * @model
 * @generated
 */
public interface NetOrchestrorScope extends EObject
{
  /**
   * Returns the value of the '<em><b>Dsl Orchestror</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl Orchestror</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl Orchestror</em>' reference.
   * @see #setDslOrchestror(DSLOrchestror)
   * @see net.sf.smbt.comm.script.netConf.NetConfPackage#getNetOrchestrorScope_DslOrchestror()
   * @model
   * @generated
   */
  DSLOrchestror getDslOrchestror();

  /**
   * Sets the value of the '{@link net.sf.smbt.comm.script.netConf.NetOrchestrorScope#getDslOrchestror <em>Dsl Orchestror</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dsl Orchestror</em>' reference.
   * @see #getDslOrchestror()
   * @generated
   */
  void setDslOrchestror(DSLOrchestror value);

  /**
   * Returns the value of the '<em><b>Binds</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.smbt.comm.script.netConf.NetBind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binds</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Binds</em>' containment reference list.
   * @see net.sf.smbt.comm.script.netConf.NetConfPackage#getNetOrchestrorScope_Binds()
   * @model containment="true"
   * @generated
   */
  EList<NetBind> getBinds();

} // NetOrchestrorScope
