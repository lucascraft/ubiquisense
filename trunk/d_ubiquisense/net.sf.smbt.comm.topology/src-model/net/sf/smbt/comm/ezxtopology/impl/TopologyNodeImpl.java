/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.comm.ezxtopology.impl;

import net.sf.smbt.comm.ezxtopology.EzxtopologyPackage;
import net.sf.smbt.comm.ezxtopology.Mime;
import net.sf.smbt.comm.ezxtopology.TopologyNode;
import net.sf.smbt.xcp.XCPDevice;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topology Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.comm.ezxtopology.impl.TopologyNodeImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link net.sf.smbt.comm.ezxtopology.impl.TopologyNodeImpl#getMime <em>Mime</em>}</li>
 *   <li>{@link net.sf.smbt.comm.ezxtopology.impl.TopologyNodeImpl#getID <em>ID</em>}</li>
 *   <li>{@link net.sf.smbt.comm.ezxtopology.impl.TopologyNodeImpl#getHeartBeat <em>Heart Beat</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TopologyNodeImpl extends AbstractTopologyItemImpl implements TopologyNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TopologyNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzxtopologyPackage.Literals.TOPOLOGY_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XCPDevice getDevice() {
		return (XCPDevice)eGet(EzxtopologyPackage.Literals.TOPOLOGY_NODE__DEVICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice(XCPDevice newDevice) {
		eSet(EzxtopologyPackage.Literals.TOPOLOGY_NODE__DEVICE, newDevice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mime getMime() {
		return (Mime)eGet(EzxtopologyPackage.Literals.TOPOLOGY_NODE__MIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMime(Mime newMime) {
		eSet(EzxtopologyPackage.Literals.TOPOLOGY_NODE__MIME, newMime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return (String)eGet(EzxtopologyPackage.Literals.TOPOLOGY_NODE__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		eSet(EzxtopologyPackage.Literals.TOPOLOGY_NODE__ID, newID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeartBeat() {
		return (Integer)eGet(EzxtopologyPackage.Literals.TOPOLOGY_NODE__HEART_BEAT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeartBeat(int newHeartBeat) {
		eSet(EzxtopologyPackage.Literals.TOPOLOGY_NODE__HEART_BEAT, newHeartBeat);
	}

} //TopologyNodeImpl
