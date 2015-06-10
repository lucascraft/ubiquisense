/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.btcomm.util;

import net.sf.smbt.btcomm.*;

import net.sf.xqz.model.engine.IOJob;
import net.sf.xqz.model.engine.InputJob;
import net.sf.xqz.model.engine.OutputJob;
import net.sf.xqz.model.engine.Port;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.btcomm.BtcommPackage
 * @generated
 */
public class BtcommAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BtcommPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BtcommAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BtcommPackage.eINSTANCE;
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
	protected BtcommSwitch<Adapter> modelSwitch =
		new BtcommSwitch<Adapter>() {
			@Override
			public Adapter caseBluetoothPort(BluetoothPort object) {
				return createBluetoothPortAdapter();
			}
			@Override
			public Adapter caseL2CAPInJob(L2CAPInJob object) {
				return createL2CAPInJobAdapter();
			}
			@Override
			public Adapter caseL2CAPoutJob(L2CAPoutJob object) {
				return createL2CAPoutJobAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseIOJob(IOJob object) {
				return createIOJobAdapter();
			}
			@Override
			public Adapter caseInputJob(InputJob object) {
				return createInputJobAdapter();
			}
			@Override
			public Adapter caseOutputJob(OutputJob object) {
				return createOutputJobAdapter();
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
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.btcomm.BluetoothPort <em>Bluetooth Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.btcomm.BluetoothPort
	 * @generated
	 */
	public Adapter createBluetoothPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.btcomm.L2CAPInJob <em>L2CAP In Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.btcomm.L2CAPInJob
	 * @generated
	 */
	public Adapter createL2CAPInJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.btcomm.L2CAPoutJob <em>L2CA Pout Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.btcomm.L2CAPoutJob
	 * @generated
	 */
	public Adapter createL2CAPoutJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.xqz.model.engine.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.xqz.model.engine.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.xqz.model.engine.IOJob <em>IO Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.xqz.model.engine.IOJob
	 * @generated
	 */
	public Adapter createIOJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.xqz.model.engine.InputJob <em>Input Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.xqz.model.engine.InputJob
	 * @generated
	 */
	public Adapter createInputJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.xqz.model.engine.OutputJob <em>Output Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.xqz.model.engine.OutputJob
	 * @generated
	 */
	public Adapter createOutputJobAdapter() {
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

} //BtcommAdapterFactory
