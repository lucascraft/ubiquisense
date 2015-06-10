/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.comm.ezxtopology.util;

import net.sf.smbt.comm.ezxtopology.AbstractTopologyItem;
import net.sf.smbt.comm.ezxtopology.BluetoothConnection;
import net.sf.smbt.comm.ezxtopology.EzxtopologyPackage;
import net.sf.smbt.comm.ezxtopology.HTTPConnection;
import net.sf.smbt.comm.ezxtopology.SessionManager;
import net.sf.smbt.comm.ezxtopology.TcpConnection;
import net.sf.smbt.comm.ezxtopology.TopologyCache;
import net.sf.smbt.comm.ezxtopology.TopologyGroup;
import net.sf.smbt.comm.ezxtopology.TopologyNode;
import net.sf.smbt.comm.ezxtopology.UDPConnection;
import net.sf.smbt.comm.ezxtopology.UsbConnection;
import net.sf.smbt.comm.ezxtopology.XBeeConnection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.comm.ezxtopology.EzxtopologyPackage
 * @generated
 */
public class EzxtopologyAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzxtopologyPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzxtopologyAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EzxtopologyPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EzxtopologySwitch<Adapter> modelSwitch =
		new EzxtopologySwitch<Adapter>() {
			@Override
			public Adapter caseTopologyCache(TopologyCache object) {
				return createTopologyCacheAdapter();
			}
			@Override
			public Adapter caseTopologyNode(TopologyNode object) {
				return createTopologyNodeAdapter();
			}
			@Override
			public Adapter caseTopologyGroup(TopologyGroup object) {
				return createTopologyGroupAdapter();
			}
			@Override
			public Adapter caseAbstractTopologyItem(AbstractTopologyItem object) {
				return createAbstractTopologyItemAdapter();
			}
			@Override
			public Adapter caseSessionManager(SessionManager object) {
				return createSessionManagerAdapter();
			}
			@Override
			public Adapter caseUsbConnection(UsbConnection object) {
				return createUsbConnectionAdapter();
			}
			@Override
			public Adapter caseBluetoothConnection(BluetoothConnection object) {
				return createBluetoothConnectionAdapter();
			}
			@Override
			public Adapter caseUDPConnection(UDPConnection object) {
				return createUDPConnectionAdapter();
			}
			@Override
			public Adapter caseTcpConnection(TcpConnection object) {
				return createTcpConnectionAdapter();
			}
			@Override
			public Adapter caseXBeeConnection(XBeeConnection object) {
				return createXBeeConnectionAdapter();
			}
			@Override
			public Adapter caseHTTPConnection(HTTPConnection object) {
				return createHTTPConnectionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.comm.ezxtopology.TopologyCache <em>Topology Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.comm.ezxtopology.TopologyCache
	 * @generated
	 */
	public Adapter createTopologyCacheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.comm.ezxtopology.TopologyNode <em>Topology Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.comm.ezxtopology.TopologyNode
	 * @generated
	 */
	public Adapter createTopologyNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.comm.ezxtopology.TopologyGroup <em>Topology Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.comm.ezxtopology.TopologyGroup
	 * @generated
	 */
	public Adapter createTopologyGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.comm.ezxtopology.AbstractTopologyItem <em>Abstract Topology Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.comm.ezxtopology.AbstractTopologyItem
	 * @generated
	 */
	public Adapter createAbstractTopologyItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.comm.ezxtopology.SessionManager <em>Session Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.comm.ezxtopology.SessionManager
	 * @generated
	 */
	public Adapter createSessionManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.comm.ezxtopology.UsbConnection <em>Usb Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.comm.ezxtopology.UsbConnection
	 * @generated
	 */
	public Adapter createUsbConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.comm.ezxtopology.BluetoothConnection <em>Bluetooth Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.comm.ezxtopology.BluetoothConnection
	 * @generated
	 */
	public Adapter createBluetoothConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.comm.ezxtopology.UDPConnection <em>UDP Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.comm.ezxtopology.UDPConnection
	 * @generated
	 */
	public Adapter createUDPConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.comm.ezxtopology.TcpConnection <em>Tcp Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.comm.ezxtopology.TcpConnection
	 * @generated
	 */
	public Adapter createTcpConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.comm.ezxtopology.XBeeConnection <em>XBee Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.comm.ezxtopology.XBeeConnection
	 * @generated
	 */
	public Adapter createXBeeConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.comm.ezxtopology.HTTPConnection <em>HTTP Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.comm.ezxtopology.HTTPConnection
	 * @generated
	 */
	public Adapter createHTTPConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EzxtopologyAdapterFactory
