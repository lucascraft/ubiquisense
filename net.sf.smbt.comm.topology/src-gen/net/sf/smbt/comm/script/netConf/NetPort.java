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
 * A representation of the model object '<em><b>Net Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.comm.script.netConf.NetPort#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.NetPort#getPortID <em>Port ID</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.NetPort#getKind <em>Kind</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.NetPort#getSpeed <em>Speed</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.NetPort#getPorts <em>Ports</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.NetPort#getIpExpr <em>Ip Expr</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.NetPort#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.comm.script.netConf.NetConfPackage#getNetPort()
 * @model
 * @generated
 */
public interface NetPort extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see net.sf.smbt.comm.script.netConf.NetConfPackage#getNetPort_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.sf.smbt.comm.script.netConf.NetPort#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Port ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port ID</em>' attribute.
   * @see #setPortID(String)
   * @see net.sf.smbt.comm.script.netConf.NetConfPackage#getNetPort_PortID()
   * @model
   * @generated
   */
  String getPortID();

  /**
   * Sets the value of the '{@link net.sf.smbt.comm.script.netConf.NetPort#getPortID <em>Port ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port ID</em>' attribute.
   * @see #getPortID()
   * @generated
   */
  void setPortID(String value);

  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * The literals are from the enumeration {@link net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL
   * @see #setKind(TRANSPORT_PROTOCOL)
   * @see net.sf.smbt.comm.script.netConf.NetConfPackage#getNetPort_Kind()
   * @model
   * @generated
   */
  TRANSPORT_PROTOCOL getKind();

  /**
   * Sets the value of the '{@link net.sf.smbt.comm.script.netConf.NetPort#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL
   * @see #getKind()
   * @generated
   */
  void setKind(TRANSPORT_PROTOCOL value);

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
   * @see net.sf.smbt.comm.script.netConf.NetConfPackage#getNetPort_Speed()
   * @model
   * @generated
   */
  int getSpeed();

  /**
   * Sets the value of the '{@link net.sf.smbt.comm.script.netConf.NetPort#getSpeed <em>Speed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Speed</em>' attribute.
   * @see #getSpeed()
   * @generated
   */
  void setSpeed(int value);

  /**
   * Returns the value of the '<em><b>Ports</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ports</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ports</em>' attribute list.
   * @see net.sf.smbt.comm.script.netConf.NetConfPackage#getNetPort_Ports()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getPorts();

  /**
   * Returns the value of the '<em><b>Ip Expr</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ip Expr</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ip Expr</em>' attribute list.
   * @see net.sf.smbt.comm.script.netConf.NetConfPackage#getNetPort_IpExpr()
   * @model unique="false"
   * @generated
   */
  EList<String> getIpExpr();

  /**
   * Returns the value of the '<em><b>Mode</b></em>' attribute.
   * The literals are from the enumeration {@link net.sf.smbt.comm.script.netConf.RxKind}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mode</em>' attribute.
   * @see net.sf.smbt.comm.script.netConf.RxKind
   * @see #setMode(RxKind)
   * @see net.sf.smbt.comm.script.netConf.NetConfPackage#getNetPort_Mode()
   * @model
   * @generated
   */
  RxKind getMode();

  /**
   * Sets the value of the '{@link net.sf.smbt.comm.script.netConf.NetPort#getMode <em>Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mode</em>' attribute.
   * @see net.sf.smbt.comm.script.netConf.RxKind
   * @see #getMode()
   * @generated
   */
  void setMode(RxKind value);

} // NetPort
