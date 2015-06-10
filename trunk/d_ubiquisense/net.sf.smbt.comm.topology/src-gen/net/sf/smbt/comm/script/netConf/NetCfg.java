/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.comm.script.netConf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Net Cfg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.comm.script.netConf.NetCfg#getImports <em>Imports</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.NetCfg#getListeners <em>Listeners</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.NetCfg#getInterpreters <em>Interpreters</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.NetCfg#getDecoders <em>Decoders</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.NetCfg#getPorts <em>Ports</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.NetCfg#getOrchestrorScopes <em>Orchestror Scopes</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.comm.script.netConf.NetConfPackage#getNetCfg()
 * @model
 * @generated
 */
public interface NetCfg extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.smbt.comm.script.netConf.DSLOrchestrorImport}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see net.sf.smbt.comm.script.netConf.NetConfPackage#getNetCfg_Imports()
   * @model containment="true"
   * @generated
   */
  EList<DSLOrchestrorImport> getImports();

  /**
   * Returns the value of the '<em><b>Listeners</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.smbt.comm.script.netConf.NetListener}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Listeners</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Listeners</em>' containment reference list.
   * @see net.sf.smbt.comm.script.netConf.NetConfPackage#getNetCfg_Listeners()
   * @model containment="true"
   * @generated
   */
  EList<NetListener> getListeners();

  /**
   * Returns the value of the '<em><b>Interpreters</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.smbt.comm.script.netConf.NetInterpreter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interpreters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interpreters</em>' containment reference list.
   * @see net.sf.smbt.comm.script.netConf.NetConfPackage#getNetCfg_Interpreters()
   * @model containment="true"
   * @generated
   */
  EList<NetInterpreter> getInterpreters();

  /**
   * Returns the value of the '<em><b>Decoders</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.smbt.comm.script.netConf.NetDecoder}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decoders</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decoders</em>' containment reference list.
   * @see net.sf.smbt.comm.script.netConf.NetConfPackage#getNetCfg_Decoders()
   * @model containment="true"
   * @generated
   */
  EList<NetDecoder> getDecoders();

  /**
   * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.smbt.comm.script.netConf.NetPort}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ports</em>' containment reference list.
   * @see net.sf.smbt.comm.script.netConf.NetConfPackage#getNetCfg_Ports()
   * @model containment="true"
   * @generated
   */
  EList<NetPort> getPorts();

  /**
   * Returns the value of the '<em><b>Orchestror Scopes</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.smbt.comm.script.netConf.NetOrchestrorScope}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orchestror Scopes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Orchestror Scopes</em>' containment reference list.
   * @see net.sf.smbt.comm.script.netConf.NetConfPackage#getNetCfg_OrchestrorScopes()
   * @model containment="true"
   * @generated
   */
  EList<NetOrchestrorScope> getOrchestrorScopes();

} // NetCfg
