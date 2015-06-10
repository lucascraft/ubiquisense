/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.comm.script.netConf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Net Decoder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.comm.script.netConf.NetDecoder#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.NetDecoder#getClazz <em>Clazz</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.comm.script.netConf.NetConfPackage#getNetDecoder()
 * @model
 * @generated
 */
public interface NetDecoder extends EObject
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
   * @see net.sf.smbt.comm.script.netConf.NetConfPackage#getNetDecoder_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.sf.smbt.comm.script.netConf.NetDecoder#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Clazz</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clazz</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clazz</em>' attribute.
   * @see #setClazz(String)
   * @see net.sf.smbt.comm.script.netConf.NetConfPackage#getNetDecoder_Clazz()
   * @model
   * @generated
   */
  String getClazz();

  /**
   * Sets the value of the '{@link net.sf.smbt.comm.script.netConf.NetDecoder#getClazz <em>Clazz</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clazz</em>' attribute.
   * @see #getClazz()
   * @generated
   */
  void setClazz(String value);

} // NetDecoder
