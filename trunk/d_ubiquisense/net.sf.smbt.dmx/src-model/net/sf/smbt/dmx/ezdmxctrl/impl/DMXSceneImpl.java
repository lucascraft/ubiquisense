/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.ezdmxctrl.impl;

import java.util.Collection;

import net.sf.smbt.dmx.ezdmxctrl.DMXBus;
import net.sf.smbt.dmx.ezdmxctrl.DMXFixture;
import net.sf.smbt.dmx.ezdmxctrl.DMXFx;
import net.sf.smbt.dmx.ezdmxctrl.DMXProject;
import net.sf.smbt.dmx.ezdmxctrl.DMXScene;
import net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DMX Scene</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXSceneImpl#getManager <em>Manager</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXSceneImpl#getFixtures <em>Fixtures</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXSceneImpl#getFx <em>Fx</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXSceneImpl#getBus <em>Bus</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DMXSceneImpl extends MinimalEObjectImpl.Container implements DMXScene {
	/**
	 * The cached value of the '{@link #getFixtures() <em>Fixtures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixtures()
	 * @generated
	 * @ordered
	 */
	protected EList<DMXFixture> fixtures;

	/**
	 * The cached value of the '{@link #getFx() <em>Fx</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFx()
	 * @generated
	 * @ordered
	 */
	protected EList<DMXFx> fx;

	/**
	 * The cached value of the '{@link #getBus() <em>Bus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBus()
	 * @generated
	 * @ordered
	 */
	protected EList<DMXBus> bus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DMXSceneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzdmxctrlPackage.Literals.DMX_SCENE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMXProject getManager() {
		if (eContainerFeatureID() != EzdmxctrlPackage.DMX_SCENE__MANAGER) return null;
		return (DMXProject)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManager(DMXProject newManager, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newManager, EzdmxctrlPackage.DMX_SCENE__MANAGER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManager(DMXProject newManager) {
		if (newManager != eInternalContainer() || (eContainerFeatureID() != EzdmxctrlPackage.DMX_SCENE__MANAGER && newManager != null)) {
			if (EcoreUtil.isAncestor(this, newManager))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newManager != null)
				msgs = ((InternalEObject)newManager).eInverseAdd(this, EzdmxctrlPackage.DMX_PROJECT__SCENES, DMXProject.class, msgs);
			msgs = basicSetManager(newManager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzdmxctrlPackage.DMX_SCENE__MANAGER, newManager, newManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DMXFixture> getFixtures() {
		if (fixtures == null) {
			fixtures = new EObjectResolvingEList<DMXFixture>(DMXFixture.class, this, EzdmxctrlPackage.DMX_SCENE__FIXTURES);
		}
		return fixtures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DMXFx> getFx() {
		if (fx == null) {
			fx = new EObjectResolvingEList<DMXFx>(DMXFx.class, this, EzdmxctrlPackage.DMX_SCENE__FX);
		}
		return fx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DMXBus> getBus() {
		if (bus == null) {
			bus = new EObjectContainmentEList<DMXBus>(DMXBus.class, this, EzdmxctrlPackage.DMX_SCENE__BUS);
		}
		return bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EzdmxctrlPackage.DMX_SCENE__MANAGER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetManager((DMXProject)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EzdmxctrlPackage.DMX_SCENE__MANAGER:
				return basicSetManager(null, msgs);
			case EzdmxctrlPackage.DMX_SCENE__BUS:
				return ((InternalEList<?>)getBus()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case EzdmxctrlPackage.DMX_SCENE__MANAGER:
				return eInternalContainer().eInverseRemove(this, EzdmxctrlPackage.DMX_PROJECT__SCENES, DMXProject.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EzdmxctrlPackage.DMX_SCENE__MANAGER:
				return getManager();
			case EzdmxctrlPackage.DMX_SCENE__FIXTURES:
				return getFixtures();
			case EzdmxctrlPackage.DMX_SCENE__FX:
				return getFx();
			case EzdmxctrlPackage.DMX_SCENE__BUS:
				return getBus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EzdmxctrlPackage.DMX_SCENE__MANAGER:
				setManager((DMXProject)newValue);
				return;
			case EzdmxctrlPackage.DMX_SCENE__FIXTURES:
				getFixtures().clear();
				getFixtures().addAll((Collection<? extends DMXFixture>)newValue);
				return;
			case EzdmxctrlPackage.DMX_SCENE__FX:
				getFx().clear();
				getFx().addAll((Collection<? extends DMXFx>)newValue);
				return;
			case EzdmxctrlPackage.DMX_SCENE__BUS:
				getBus().clear();
				getBus().addAll((Collection<? extends DMXBus>)newValue);
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
			case EzdmxctrlPackage.DMX_SCENE__MANAGER:
				setManager((DMXProject)null);
				return;
			case EzdmxctrlPackage.DMX_SCENE__FIXTURES:
				getFixtures().clear();
				return;
			case EzdmxctrlPackage.DMX_SCENE__FX:
				getFx().clear();
				return;
			case EzdmxctrlPackage.DMX_SCENE__BUS:
				getBus().clear();
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
			case EzdmxctrlPackage.DMX_SCENE__MANAGER:
				return getManager() != null;
			case EzdmxctrlPackage.DMX_SCENE__FIXTURES:
				return fixtures != null && !fixtures.isEmpty();
			case EzdmxctrlPackage.DMX_SCENE__FX:
				return fx != null && !fx.isEmpty();
			case EzdmxctrlPackage.DMX_SCENE__BUS:
				return bus != null && !bus.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DMXSceneImpl
