/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.comm.ezxtopology.impl;

import net.sf.smbt.comm.ezxtopology.AbstractTopologyItem;
import net.sf.smbt.comm.ezxtopology.EzxtopologyPackage;
import net.sf.smbt.comm.ezxtopology.SessionManager;
import net.sf.smbt.comm.ezxtopology.TopologyCache;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topology Cache</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.comm.ezxtopology.impl.TopologyCacheImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link net.sf.smbt.comm.ezxtopology.impl.TopologyCacheImpl#getSession <em>Session</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TopologyCacheImpl extends MinimalEObjectImpl.Container implements TopologyCache {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopologyCacheImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzxtopologyPackage.Literals.TOPOLOGY_CACHE;
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
	public EList<AbstractTopologyItem> getNodes() {
		return (EList<AbstractTopologyItem>)eGet(EzxtopologyPackage.Literals.TOPOLOGY_CACHE__NODES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionManager getSession() {
		return (SessionManager)eGet(EzxtopologyPackage.Literals.TOPOLOGY_CACHE__SESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSession(SessionManager newSession) {
		eSet(EzxtopologyPackage.Literals.TOPOLOGY_CACHE__SESSION, newSession);
	}

} //TopologyCacheImpl
