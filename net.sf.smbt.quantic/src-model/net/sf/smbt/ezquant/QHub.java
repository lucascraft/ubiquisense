/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezquant;

import net.sf.smbt.comm.ezxtopology.TopologyCache;
import net.sf.smbt.comm.script.netConf.NetCfg;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QHub</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezquant.QHub#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link net.sf.smbt.ezquant.QHub#getTopology <em>Topology</em>}</li>
 *   <li>{@link net.sf.smbt.ezquant.QHub#getID <em>ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezquant.QHub#getAgent <em>Agent</em>}</li>
 *   <li>{@link net.sf.smbt.ezquant.QHub#getSupervisor <em>Supervisor</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezquant.EzquantPackage#getQHub()
 * @model
 * @generated
 */
public interface QHub extends EObject {
	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.comm.script.netConf.NetCfg}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference list.
	 * @see net.sf.smbt.ezquant.EzquantPackage#getQHub_Configurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<NetCfg> getConfigurations();

	/**
	 * Returns the value of the '<em><b>Topology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topology</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topology</em>' containment reference.
	 * @see #setTopology(TopologyCache)
	 * @see net.sf.smbt.ezquant.EzquantPackage#getQHub_Topology()
	 * @model containment="true"
	 * @generated
	 */
	TopologyCache getTopology();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezquant.QHub#getTopology <em>Topology</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topology</em>' containment reference.
	 * @see #getTopology()
	 * @generated
	 */
	void setTopology(TopologyCache value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see net.sf.smbt.ezquant.EzquantPackage#getQHub_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezquant.QHub#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Agent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' attribute.
	 * @see #setAgent(Object)
	 * @see net.sf.smbt.ezquant.EzquantPackage#getQHub_Agent()
	 * @model
	 * @generated
	 */
	Object getAgent();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezquant.QHub#getAgent <em>Agent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent</em>' attribute.
	 * @see #getAgent()
	 * @generated
	 */
	void setAgent(Object value);

	/**
	 * Returns the value of the '<em><b>Supervisor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supervisor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supervisor</em>' attribute.
	 * @see #setSupervisor(Object)
	 * @see net.sf.smbt.ezquant.EzquantPackage#getQHub_Supervisor()
	 * @model
	 * @generated
	 */
	Object getSupervisor();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezquant.QHub#getSupervisor <em>Supervisor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supervisor</em>' attribute.
	 * @see #getSupervisor()
	 * @generated
	 */
	void setSupervisor(Object value);

} // QHub
