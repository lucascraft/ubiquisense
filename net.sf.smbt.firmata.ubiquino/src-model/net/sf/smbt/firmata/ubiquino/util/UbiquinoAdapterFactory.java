/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.firmata.ubiquino.util;

import net.sf.smbt.firmata.ubiquino.*;
import net.sf.smbt.firmata.ubiquino.PortConfig;
import net.sf.smbt.firmata.ubiquino.Ubiquino;
import net.sf.smbt.firmata.ubiquino.UbiquinoConfig;
import net.sf.smbt.firmata.ubiquino.UbiquinoPackage;
import net.sf.xqz.model.engine.IConnectedUnit;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.firmata.ubiquino.UbiquinoPackage
 * @generated
 */
public class UbiquinoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UbiquinoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbiquinoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UbiquinoPackage.eINSTANCE;
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
	protected UbiquinoSwitch<Adapter> modelSwitch =
		new UbiquinoSwitch<Adapter>() {
			@Override
			public Adapter caseUbiquino(Ubiquino object) {
				return createUbiquinoAdapter();
			}
			@Override
			public Adapter caseUbiquinoConfig(UbiquinoConfig object) {
				return createUbiquinoConfigAdapter();
			}
			@Override
			public Adapter casePortConfig(PortConfig object) {
				return createPortConfigAdapter();
			}
			@Override
			public Adapter casePortSampler(PortSampler object) {
				return createPortSamplerAdapter();
			}
			@Override
			public Adapter caseIConnectedUnit(IConnectedUnit object) {
				return createIConnectedUnitAdapter();
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
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.firmata.ubiquino.Ubiquino <em>Ubiquino</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.firmata.ubiquino.Ubiquino
	 * @generated
	 */
	public Adapter createUbiquinoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.firmata.ubiquino.UbiquinoConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.firmata.ubiquino.UbiquinoConfig
	 * @generated
	 */
	public Adapter createUbiquinoConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.firmata.ubiquino.PortConfig <em>Port Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.firmata.ubiquino.PortConfig
	 * @generated
	 */
	public Adapter createPortConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.firmata.ubiquino.PortSampler <em>Port Sampler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.firmata.ubiquino.PortSampler
	 * @generated
	 */
	public Adapter createPortSamplerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.xqz.model.engine.IConnectedUnit <em>IConnected Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.xqz.model.engine.IConnectedUnit
	 * @generated
	 */
	public Adapter createIConnectedUnitAdapter() {
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

} //UbiquinoAdapterFactory
