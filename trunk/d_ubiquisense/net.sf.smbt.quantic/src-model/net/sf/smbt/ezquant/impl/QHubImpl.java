/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezquant.impl;

import net.sf.smbt.comm.ezxtopology.TopologyCache;
import net.sf.smbt.comm.script.netConf.NetCfg;
import net.sf.smbt.ezquant.EzquantPackage;
import net.sf.smbt.ezquant.QHub;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QHub</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezquant.impl.QHubImpl#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link net.sf.smbt.ezquant.impl.QHubImpl#getTopology <em>Topology</em>}</li>
 *   <li>{@link net.sf.smbt.ezquant.impl.QHubImpl#getID <em>ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezquant.impl.QHubImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link net.sf.smbt.ezquant.impl.QHubImpl#getSupervisor <em>Supervisor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QHubImpl extends MinimalEObjectImpl.Container implements QHub {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QHubImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzquantPackage.Literals.QHUB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<NetCfg> getConfigurations() {
		return (EList<NetCfg>)eGet(EzquantPackage.Literals.QHUB__CONFIGURATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyCache getTopology() {
		return (TopologyCache)eGet(EzquantPackage.Literals.QHUB__TOPOLOGY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopology(TopologyCache newTopology) {
		eSet(EzquantPackage.Literals.QHUB__TOPOLOGY, newTopology);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return (String)eGet(EzquantPackage.Literals.QHUB__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		eSet(EzquantPackage.Literals.QHUB__ID, newID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAgent() {
		return (Object)eGet(EzquantPackage.Literals.QHUB__AGENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgent(Object newAgent) {
		eSet(EzquantPackage.Literals.QHUB__AGENT, newAgent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSupervisor() {
		return (Object)eGet(EzquantPackage.Literals.QHUB__SUPERVISOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupervisor(Object newSupervisor) {
		eSet(EzquantPackage.Literals.QHUB__SUPERVISOR, newSupervisor);
	}

} //QHubImpl
