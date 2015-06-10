/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.comm.script.netConf;

import net.sf.xqz.engine.script.orchestror.DSLCommandEngine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Net Bind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.comm.script.netConf.NetBind#getEngine <em>Engine</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.NetBind#getInterpreter <em>Interpreter</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.NetBind#getCmdInject <em>Cmd Inject</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.NetBind#getDecoder <em>Decoder</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.NetBind#getFrameInject <em>Frame Inject</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.NetBind#getPort <em>Port</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.NetBind#getListeners <em>Listeners</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.comm.script.netConf.NetConfPackage#getNetBind()
 * @model
 * @generated
 */
public interface NetBind extends EObject
{
  /**
   * Returns the value of the '<em><b>Engine</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Engine</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Engine</em>' reference.
   * @see #setEngine(DSLCommandEngine)
   * @see net.sf.smbt.comm.script.netConf.NetConfPackage#getNetBind_Engine()
   * @model
   * @generated
   */
  DSLCommandEngine getEngine();

  /**
   * Sets the value of the '{@link net.sf.smbt.comm.script.netConf.NetBind#getEngine <em>Engine</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Engine</em>' reference.
   * @see #getEngine()
   * @generated
   */
  void setEngine(DSLCommandEngine value);

  /**
   * Returns the value of the '<em><b>Interpreter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interpreter</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interpreter</em>' reference.
   * @see #setInterpreter(NetInterpreter)
   * @see net.sf.smbt.comm.script.netConf.NetConfPackage#getNetBind_Interpreter()
   * @model
   * @generated
   */
  NetInterpreter getInterpreter();

  /**
   * Sets the value of the '{@link net.sf.smbt.comm.script.netConf.NetBind#getInterpreter <em>Interpreter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interpreter</em>' reference.
   * @see #getInterpreter()
   * @generated
   */
  void setInterpreter(NetInterpreter value);

  /**
   * Returns the value of the '<em><b>Cmd Inject</b></em>' reference list.
   * The list contents are of type {@link net.sf.smbt.comm.script.netConf.NetPort}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cmd Inject</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cmd Inject</em>' reference list.
   * @see net.sf.smbt.comm.script.netConf.NetConfPackage#getNetBind_CmdInject()
   * @model
   * @generated
   */
  EList<NetPort> getCmdInject();

  /**
   * Returns the value of the '<em><b>Decoder</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decoder</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decoder</em>' reference.
   * @see #setDecoder(NetDecoder)
   * @see net.sf.smbt.comm.script.netConf.NetConfPackage#getNetBind_Decoder()
   * @model
   * @generated
   */
  NetDecoder getDecoder();

  /**
   * Sets the value of the '{@link net.sf.smbt.comm.script.netConf.NetBind#getDecoder <em>Decoder</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Decoder</em>' reference.
   * @see #getDecoder()
   * @generated
   */
  void setDecoder(NetDecoder value);

  /**
   * Returns the value of the '<em><b>Frame Inject</b></em>' reference list.
   * The list contents are of type {@link net.sf.smbt.comm.script.netConf.NetPort}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Frame Inject</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Frame Inject</em>' reference list.
   * @see net.sf.smbt.comm.script.netConf.NetConfPackage#getNetBind_FrameInject()
   * @model
   * @generated
   */
  EList<NetPort> getFrameInject();

  /**
   * Returns the value of the '<em><b>Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' reference.
   * @see #setPort(NetPort)
   * @see net.sf.smbt.comm.script.netConf.NetConfPackage#getNetBind_Port()
   * @model
   * @generated
   */
  NetPort getPort();

  /**
   * Sets the value of the '{@link net.sf.smbt.comm.script.netConf.NetBind#getPort <em>Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' reference.
   * @see #getPort()
   * @generated
   */
  void setPort(NetPort value);

  /**
   * Returns the value of the '<em><b>Listeners</b></em>' reference list.
   * The list contents are of type {@link net.sf.smbt.comm.script.netConf.NetListener}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Listeners</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Listeners</em>' reference list.
   * @see net.sf.smbt.comm.script.netConf.NetConfPackage#getNetBind_Listeners()
   * @model
   * @generated
   */
  EList<NetListener> getListeners();

} // NetBind
