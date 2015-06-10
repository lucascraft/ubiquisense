/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.ezdmxctrl.impl;

import net.sf.smbt.dmx.ezdmxctrl.DMXFixtureValuations;
import net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl;
import net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DMX Fixture Valuations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXFixtureValuationsImpl#getUniverse <em>Universe</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DMXFixtureValuationsImpl extends MinimalEObjectImpl.Container implements DMXFixtureValuations {
	/**
	 * The cached value of the '{@link #getUniverse() <em>Universe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniverse()
	 * @generated
	 * @ordered
	 */
	protected DMXUniverseCtrl universe;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DMXFixtureValuationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzdmxctrlPackage.Literals.DMX_FIXTURE_VALUATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMXUniverseCtrl getUniverse() {
		if (universe != null && universe.eIsProxy()) {
			InternalEObject oldUniverse = (InternalEObject)universe;
			universe = (DMXUniverseCtrl)eResolveProxy(oldUniverse);
			if (universe != oldUniverse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EzdmxctrlPackage.DMX_FIXTURE_VALUATIONS__UNIVERSE, oldUniverse, universe));
			}
		}
		return universe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMXUniverseCtrl basicGetUniverse() {
		return universe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniverse(DMXUniverseCtrl newUniverse) {
		DMXUniverseCtrl oldUniverse = universe;
		universe = newUniverse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzdmxctrlPackage.DMX_FIXTURE_VALUATIONS__UNIVERSE, oldUniverse, universe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EzdmxctrlPackage.DMX_FIXTURE_VALUATIONS__UNIVERSE:
				if (resolve) return getUniverse();
				return basicGetUniverse();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EzdmxctrlPackage.DMX_FIXTURE_VALUATIONS__UNIVERSE:
				setUniverse((DMXUniverseCtrl)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EzdmxctrlPackage.DMX_FIXTURE_VALUATIONS__UNIVERSE:
				setUniverse((DMXUniverseCtrl)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EzdmxctrlPackage.DMX_FIXTURE_VALUATIONS__UNIVERSE:
				return universe != null;
		}
		return super.eIsSet(featureID);
	}

} //DMXFixtureValuationsImpl
