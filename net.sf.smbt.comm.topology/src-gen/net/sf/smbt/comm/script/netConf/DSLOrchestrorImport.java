/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.comm.script.netConf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSL Orchestror Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.comm.script.netConf.DSLOrchestrorImport#getImportURI <em>Import URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.comm.script.netConf.NetConfPackage#getDSLOrchestrorImport()
 * @model
 * @generated
 */
public interface DSLOrchestrorImport extends EObject
{
  /**
   * Returns the value of the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import URI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import URI</em>' attribute.
   * @see #setImportURI(String)
   * @see net.sf.smbt.comm.script.netConf.NetConfPackage#getDSLOrchestrorImport_ImportURI()
   * @model
   * @generated
   */
  String getImportURI();

  /**
   * Sets the value of the '{@link net.sf.smbt.comm.script.netConf.DSLOrchestrorImport#getImportURI <em>Import URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import URI</em>' attribute.
   * @see #getImportURI()
   * @generated
   */
  void setImportURI(String value);

} // DSLOrchestrorImport
