/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.comm.script.netConf;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.comm.script.netConf.NetConfPackage
 * @generated
 */
public interface NetConfFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  NetConfFactory eINSTANCE = net.sf.smbt.comm.script.netConf.impl.NetConfFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Net Cfg</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Net Cfg</em>'.
   * @generated
   */
  NetCfg createNetCfg();

  /**
   * Returns a new object of class '<em>DSL Orchestror Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>DSL Orchestror Import</em>'.
   * @generated
   */
  DSLOrchestrorImport createDSLOrchestrorImport();

  /**
   * Returns a new object of class '<em>Net Port</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Net Port</em>'.
   * @generated
   */
  NetPort createNetPort();

  /**
   * Returns a new object of class '<em>Net Decoder</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Net Decoder</em>'.
   * @generated
   */
  NetDecoder createNetDecoder();

  /**
   * Returns a new object of class '<em>Net Interpreter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Net Interpreter</em>'.
   * @generated
   */
  NetInterpreter createNetInterpreter();

  /**
   * Returns a new object of class '<em>Net Listener</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Net Listener</em>'.
   * @generated
   */
  NetListener createNetListener();

  /**
   * Returns a new object of class '<em>Net Orchestror Scope</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Net Orchestror Scope</em>'.
   * @generated
   */
  NetOrchestrorScope createNetOrchestrorScope();

  /**
   * Returns a new object of class '<em>Net Bind</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Net Bind</em>'.
   * @generated
   */
  NetBind createNetBind();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  NetConfPackage getNetConfPackage();

} //NetConfFactory
