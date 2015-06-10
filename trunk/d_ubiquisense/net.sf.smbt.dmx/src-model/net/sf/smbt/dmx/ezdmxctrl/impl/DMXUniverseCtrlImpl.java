/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.ezdmxctrl.impl;

import java.util.Collection;
import java.util.List;

import net.sf.smbt.dmx.ezdmxctrl.DMXChannel;
import net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence;
import net.sf.smbt.dmx.ezdmxctrl.DMXFixtureValuations;
import net.sf.smbt.dmx.ezdmxctrl.DMXProject;
import net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl;
import net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage;
import net.sf.xqz.model.engine.CmdPipe;

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
 * An implementation of the model object '<em><b>DMX Universe Ctrl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXUniverseCtrlImpl#getEngines <em>Engines</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXUniverseCtrlImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXUniverseCtrlImpl#getVer <em>Ver</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXUniverseCtrlImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXUniverseCtrlImpl#getFixtures <em>Fixtures</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXUniverseCtrlImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXUniverseCtrlImpl#getAddrRangeMin <em>Addr Range Min</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXUniverseCtrlImpl#getAddrRangeMax <em>Addr Range Max</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXUniverseCtrlImpl#getManager <em>Manager</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXUniverseCtrlImpl#getCues <em>Cues</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXUniverseCtrlImpl#getSteps <em>Steps</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DMXUniverseCtrlImpl extends MinimalEObjectImpl.Container implements DMXUniverseCtrl {
	/**
	 * The cached value of the '{@link #getEngines() <em>Engines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngines()
	 * @generated
	 * @ordered
	 */
	protected EList<CmdPipe> engines;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected CmdPipe default_;

	/**
	 * The default value of the '{@link #getVer() <em>Ver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVer()
	 * @generated
	 * @ordered
	 */
	protected static final String VER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVer() <em>Ver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVer()
	 * @generated
	 * @ordered
	 */
	protected String ver = VER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChannels() <em>Channels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannels()
	 * @generated
	 * @ordered
	 */
	protected EList<DMXChannel> channels;

	/**
	 * The cached value of the '{@link #getFixtures() <em>Fixtures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixtures()
	 * @generated
	 * @ordered
	 */
	protected EList<DMXFixtureValuations> fixtures;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddrRangeMin() <em>Addr Range Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddrRangeMin()
	 * @generated
	 * @ordered
	 */
	protected static final int ADDR_RANGE_MIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAddrRangeMin() <em>Addr Range Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddrRangeMin()
	 * @generated
	 * @ordered
	 */
	protected int addrRangeMin = ADDR_RANGE_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddrRangeMax() <em>Addr Range Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddrRangeMax()
	 * @generated
	 * @ordered
	 */
	protected static final int ADDR_RANGE_MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAddrRangeMax() <em>Addr Range Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddrRangeMax()
	 * @generated
	 * @ordered
	 */
	protected int addrRangeMax = ADDR_RANGE_MAX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCues() <em>Cues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCues()
	 * @generated
	 * @ordered
	 */
	protected EList<DMXFixtureValuations> cues;

	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<DMXCueSequence> steps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DMXUniverseCtrlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzdmxctrlPackage.Literals.DMX_UNIVERSE_CTRL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<CmdPipe> getEngines() {
		if (engines == null) {
			engines = new EObjectResolvingEList<CmdPipe>(CmdPipe.class, this, EzdmxctrlPackage.DMX_UNIVERSE_CTRL__ENGINES);
		}
		return engines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmdPipe getDefault() {
		if (default_ != null && default_.eIsProxy()) {
			InternalEObject oldDefault = (InternalEObject)default_;
			default_ = (CmdPipe)eResolveProxy(oldDefault);
			if (default_ != oldDefault) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EzdmxctrlPackage.DMX_UNIVERSE_CTRL__DEFAULT, oldDefault, default_));
			}
		}
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(CmdPipe newDefault) {
		CmdPipe oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzdmxctrlPackage.DMX_UNIVERSE_CTRL__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVer() {
		return ver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVer(String newVer) {
		String oldVer = ver;
		ver = newVer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzdmxctrlPackage.DMX_UNIVERSE_CTRL__VER, oldVer, ver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DMXChannel> getChannels() {
		if (channels == null) {
			channels = new EObjectContainmentEList<DMXChannel>(DMXChannel.class, this, EzdmxctrlPackage.DMX_UNIVERSE_CTRL__CHANNELS);
		}
		return channels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DMXFixtureValuations> getFixtures() {
		if (fixtures == null) {
			fixtures = new EObjectContainmentEList<DMXFixtureValuations>(DMXFixtureValuations.class, this, EzdmxctrlPackage.DMX_UNIVERSE_CTRL__FIXTURES);
		}
		return fixtures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzdmxctrlPackage.DMX_UNIVERSE_CTRL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAddrRangeMin() {
		return addrRangeMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddrRangeMin(int newAddrRangeMin) {
		int oldAddrRangeMin = addrRangeMin;
		addrRangeMin = newAddrRangeMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzdmxctrlPackage.DMX_UNIVERSE_CTRL__ADDR_RANGE_MIN, oldAddrRangeMin, addrRangeMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAddrRangeMax() {
		return addrRangeMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddrRangeMax(int newAddrRangeMax) {
		int oldAddrRangeMax = addrRangeMax;
		addrRangeMax = newAddrRangeMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzdmxctrlPackage.DMX_UNIVERSE_CTRL__ADDR_RANGE_MAX, oldAddrRangeMax, addrRangeMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMXProject getManager() {
		if (eContainerFeatureID() != EzdmxctrlPackage.DMX_UNIVERSE_CTRL__MANAGER) return null;
		return (DMXProject)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManager(DMXProject newManager, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newManager, EzdmxctrlPackage.DMX_UNIVERSE_CTRL__MANAGER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManager(DMXProject newManager) {
		if (newManager != eInternalContainer() || (eContainerFeatureID() != EzdmxctrlPackage.DMX_UNIVERSE_CTRL__MANAGER && newManager != null)) {
			if (EcoreUtil.isAncestor(this, newManager))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newManager != null)
				msgs = ((InternalEObject)newManager).eInverseAdd(this, EzdmxctrlPackage.DMX_PROJECT__UNIVERSES, DMXProject.class, msgs);
			msgs = basicSetManager(newManager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzdmxctrlPackage.DMX_UNIVERSE_CTRL__MANAGER, newManager, newManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DMXFixtureValuations> getCues() {
		if (cues == null) {
			cues = new EObjectContainmentEList<DMXFixtureValuations>(DMXFixtureValuations.class, this, EzdmxctrlPackage.DMX_UNIVERSE_CTRL__CUES);
		}
		return cues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DMXCueSequence> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentEList<DMXCueSequence>(DMXCueSequence.class, this, EzdmxctrlPackage.DMX_UNIVERSE_CTRL__STEPS);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__MANAGER:
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
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__CHANNELS:
				return ((InternalEList<?>)getChannels()).basicRemove(otherEnd, msgs);
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__FIXTURES:
				return ((InternalEList<?>)getFixtures()).basicRemove(otherEnd, msgs);
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__MANAGER:
				return basicSetManager(null, msgs);
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__CUES:
				return ((InternalEList<?>)getCues()).basicRemove(otherEnd, msgs);
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__STEPS:
				return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
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
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__MANAGER:
				return eInternalContainer().eInverseRemove(this, EzdmxctrlPackage.DMX_PROJECT__UNIVERSES, DMXProject.class, msgs);
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
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__ENGINES:
				return getEngines();
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__DEFAULT:
				return getDefault();
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__VER:
				return getVer();
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__CHANNELS:
				return getChannels();
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__FIXTURES:
				return getFixtures();
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__ID:
				return getId();
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__ADDR_RANGE_MIN:
				return getAddrRangeMin();
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__ADDR_RANGE_MAX:
				return getAddrRangeMax();
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__MANAGER:
				return getManager();
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__CUES:
				return getCues();
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__STEPS:
				return getSteps();
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
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__ENGINES:
				getEngines().clear();
				getEngines().addAll((Collection<? extends CmdPipe>)newValue);
				return;
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__DEFAULT:
				setDefault((CmdPipe)newValue);
				return;
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__VER:
				setVer((String)newValue);
				return;
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__CHANNELS:
				getChannels().clear();
				getChannels().addAll((Collection<? extends DMXChannel>)newValue);
				return;
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__FIXTURES:
				getFixtures().clear();
				getFixtures().addAll((Collection<? extends DMXFixtureValuations>)newValue);
				return;
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__ID:
				setId((Integer)newValue);
				return;
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__ADDR_RANGE_MIN:
				setAddrRangeMin((Integer)newValue);
				return;
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__ADDR_RANGE_MAX:
				setAddrRangeMax((Integer)newValue);
				return;
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__MANAGER:
				setManager((DMXProject)newValue);
				return;
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__CUES:
				getCues().clear();
				getCues().addAll((Collection<? extends DMXFixtureValuations>)newValue);
				return;
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection<? extends DMXCueSequence>)newValue);
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
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__ENGINES:
				getEngines().clear();
				return;
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__DEFAULT:
				setDefault((CmdPipe)null);
				return;
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__VER:
				setVer(VER_EDEFAULT);
				return;
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__CHANNELS:
				getChannels().clear();
				return;
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__FIXTURES:
				getFixtures().clear();
				return;
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__ID:
				setId(ID_EDEFAULT);
				return;
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__ADDR_RANGE_MIN:
				setAddrRangeMin(ADDR_RANGE_MIN_EDEFAULT);
				return;
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__ADDR_RANGE_MAX:
				setAddrRangeMax(ADDR_RANGE_MAX_EDEFAULT);
				return;
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__MANAGER:
				setManager((DMXProject)null);
				return;
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__CUES:
				getCues().clear();
				return;
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__STEPS:
				getSteps().clear();
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
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__ENGINES:
				return engines != null && !engines.isEmpty();
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__DEFAULT:
				return default_ != null;
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__VER:
				return VER_EDEFAULT == null ? ver != null : !VER_EDEFAULT.equals(ver);
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__CHANNELS:
				return channels != null && !channels.isEmpty();
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__FIXTURES:
				return fixtures != null && !fixtures.isEmpty();
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__ID:
				return id != ID_EDEFAULT;
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__ADDR_RANGE_MIN:
				return addrRangeMin != ADDR_RANGE_MIN_EDEFAULT;
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__ADDR_RANGE_MAX:
				return addrRangeMax != ADDR_RANGE_MAX_EDEFAULT;
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__MANAGER:
				return getManager() != null;
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__CUES:
				return cues != null && !cues.isEmpty();
			case EzdmxctrlPackage.DMX_UNIVERSE_CTRL__STEPS:
				return steps != null && !steps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ver: ");
		result.append(ver);
		result.append(", id: ");
		result.append(id);
		result.append(", addrRangeMin: ");
		result.append(addrRangeMin);
		result.append(", addrRangeMax: ");
		result.append(addrRangeMax);
		result.append(')');
		return result.toString();
	}

} //DMXUniverseCtrlImpl
