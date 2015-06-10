/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsniff.util;

import net.sf.smbt.ezsniff.AbstractEZSniffElem;
import net.sf.smbt.ezsniff.EZSniffHit;
import net.sf.smbt.ezsniff.EZSniffProtocolGroup;
import net.sf.smbt.ezsniff.EZSniffer;
import net.sf.smbt.ezsniff.EZSnifferManager;
import net.sf.smbt.ezsniff.EzsniffPackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezsniff.EzsniffPackage
 * @generated
 */
public class EzsniffAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzsniffPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzsniffAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EzsniffPackage.eINSTANCE;
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
	protected EzsniffSwitch<Adapter> modelSwitch =
		new EzsniffSwitch<Adapter>() {
			@Override
			public Adapter caseEZSniffer(EZSniffer object) {
				return createEZSnifferAdapter();
			}
			@Override
			public Adapter caseEZSniffProtocolGroup(EZSniffProtocolGroup object) {
				return createEZSniffProtocolGroupAdapter();
			}
			@Override
			public Adapter caseAbstractEZSniffElem(AbstractEZSniffElem object) {
				return createAbstractEZSniffElemAdapter();
			}
			@Override
			public Adapter caseEZSniffHit(EZSniffHit object) {
				return createEZSniffHitAdapter();
			}
			@Override
			public Adapter caseEZSnifferManager(EZSnifferManager object) {
				return createEZSnifferManagerAdapter();
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
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsniff.EZSniffer <em>EZ Sniffer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsniff.EZSniffer
	 * @generated
	 */
	public Adapter createEZSnifferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsniff.EZSniffProtocolGroup <em>EZ Sniff Protocol Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsniff.EZSniffProtocolGroup
	 * @generated
	 */
	public Adapter createEZSniffProtocolGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsniff.AbstractEZSniffElem <em>Abstract EZ Sniff Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsniff.AbstractEZSniffElem
	 * @generated
	 */
	public Adapter createAbstractEZSniffElemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsniff.EZSniffHit <em>EZ Sniff Hit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsniff.EZSniffHit
	 * @generated
	 */
	public Adapter createEZSniffHitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezsniff.EZSnifferManager <em>EZ Sniffer Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezsniff.EZSnifferManager
	 * @generated
	 */
	public Adapter createEZSnifferManagerAdapter() {
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

} //EzsniffAdapterFactory
