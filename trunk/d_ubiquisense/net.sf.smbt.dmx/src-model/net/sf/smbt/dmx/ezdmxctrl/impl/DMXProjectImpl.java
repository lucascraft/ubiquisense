/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.ezdmxctrl.impl;

import java.util.Collection;

import net.sf.smbt.dmx.ezdmxctrl.DMXLibrary;
import net.sf.smbt.dmx.ezdmxctrl.DMXProject;
import net.sf.smbt.dmx.ezdmxctrl.DMXScene;
import net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl;
import net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage;
import net.sf.smbt.dmx.model.qxf.FixtureDefinition;
import net.sf.smbt.xcp.XCPAddress;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DMX Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXProjectImpl#getUniverses <em>Universes</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXProjectImpl#getScenes <em>Scenes</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXProjectImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXProjectImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXProjectImpl#getFixtureDefinitions <em>Fixture Definitions</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXProjectImpl#getLastAddress <em>Last Address</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXProjectImpl#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DMXProjectImpl extends MinimalEObjectImpl.Container implements DMXProject {
	/**
	 * The cached value of the '{@link #getUniverses() <em>Universes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniverses()
	 * @generated
	 * @ordered
	 */
	protected EList<DMXUniverseCtrl> universes;

	/**
	 * The cached value of the '{@link #getScenes() <em>Scenes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenes()
	 * @generated
	 * @ordered
	 */
	protected EList<DMXScene> scenes;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected DMXLibrary library;

	/**
	 * The cached value of the '{@link #getFixtureDefinitions() <em>Fixture Definitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixtureDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<FixtureDefinition> fixtureDefinitions;

	/**
	 * The cached value of the '{@link #getLastAddress() <em>Last Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastAddress()
	 * @generated
	 * @ordered
	 */
	protected XCPAddress lastAddress;

	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected EObject selection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DMXProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzdmxctrlPackage.Literals.DMX_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DMXUniverseCtrl> getUniverses() {
		if (universes == null) {
			universes = new EObjectContainmentWithInverseEList<DMXUniverseCtrl>(DMXUniverseCtrl.class, this, EzdmxctrlPackage.DMX_PROJECT__UNIVERSES, EzdmxctrlPackage.DMX_UNIVERSE_CTRL__MANAGER);
		}
		return universes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DMXScene> getScenes() {
		if (scenes == null) {
			scenes = new EObjectContainmentWithInverseEList<DMXScene>(DMXScene.class, this, EzdmxctrlPackage.DMX_PROJECT__SCENES, EzdmxctrlPackage.DMX_SCENE__MANAGER);
		}
		return scenes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzdmxctrlPackage.DMX_PROJECT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzdmxctrlPackage.DMX_PROJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMXLibrary getLibrary() {
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLibrary(DMXLibrary newLibrary, NotificationChain msgs) {
		DMXLibrary oldLibrary = library;
		library = newLibrary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EzdmxctrlPackage.DMX_PROJECT__LIBRARY, oldLibrary, newLibrary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibrary(DMXLibrary newLibrary) {
		if (newLibrary != library) {
			NotificationChain msgs = null;
			if (library != null)
				msgs = ((InternalEObject)library).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EzdmxctrlPackage.DMX_PROJECT__LIBRARY, null, msgs);
			if (newLibrary != null)
				msgs = ((InternalEObject)newLibrary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EzdmxctrlPackage.DMX_PROJECT__LIBRARY, null, msgs);
			msgs = basicSetLibrary(newLibrary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzdmxctrlPackage.DMX_PROJECT__LIBRARY, newLibrary, newLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FixtureDefinition> getFixtureDefinitions() {
		if (fixtureDefinitions == null) {
			fixtureDefinitions = new EObjectResolvingEList<FixtureDefinition>(FixtureDefinition.class, this, EzdmxctrlPackage.DMX_PROJECT__FIXTURE_DEFINITIONS);
		}
		return fixtureDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XCPAddress getLastAddress() {
		return lastAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastAddress(XCPAddress newLastAddress, NotificationChain msgs) {
		XCPAddress oldLastAddress = lastAddress;
		lastAddress = newLastAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EzdmxctrlPackage.DMX_PROJECT__LAST_ADDRESS, oldLastAddress, newLastAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastAddress(XCPAddress newLastAddress) {
		if (newLastAddress != lastAddress) {
			NotificationChain msgs = null;
			if (lastAddress != null)
				msgs = ((InternalEObject)lastAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EzdmxctrlPackage.DMX_PROJECT__LAST_ADDRESS, null, msgs);
			if (newLastAddress != null)
				msgs = ((InternalEObject)newLastAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EzdmxctrlPackage.DMX_PROJECT__LAST_ADDRESS, null, msgs);
			msgs = basicSetLastAddress(newLastAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzdmxctrlPackage.DMX_PROJECT__LAST_ADDRESS, newLastAddress, newLastAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getSelection() {
		if (selection != null && selection.eIsProxy()) {
			InternalEObject oldSelection = (InternalEObject)selection;
			selection = eResolveProxy(oldSelection);
			if (selection != oldSelection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EzdmxctrlPackage.DMX_PROJECT__SELECTION, oldSelection, selection));
			}
		}
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetSelection() {
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(EObject newSelection) {
		EObject oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzdmxctrlPackage.DMX_PROJECT__SELECTION, oldSelection, selection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EzdmxctrlPackage.DMX_PROJECT__UNIVERSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUniverses()).basicAdd(otherEnd, msgs);
			case EzdmxctrlPackage.DMX_PROJECT__SCENES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getScenes()).basicAdd(otherEnd, msgs);
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
			case EzdmxctrlPackage.DMX_PROJECT__UNIVERSES:
				return ((InternalEList<?>)getUniverses()).basicRemove(otherEnd, msgs);
			case EzdmxctrlPackage.DMX_PROJECT__SCENES:
				return ((InternalEList<?>)getScenes()).basicRemove(otherEnd, msgs);
			case EzdmxctrlPackage.DMX_PROJECT__LIBRARY:
				return basicSetLibrary(null, msgs);
			case EzdmxctrlPackage.DMX_PROJECT__LAST_ADDRESS:
				return basicSetLastAddress(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EzdmxctrlPackage.DMX_PROJECT__UNIVERSES:
				return getUniverses();
			case EzdmxctrlPackage.DMX_PROJECT__SCENES:
				return getScenes();
			case EzdmxctrlPackage.DMX_PROJECT__ID:
				return getId();
			case EzdmxctrlPackage.DMX_PROJECT__NAME:
				return getName();
			case EzdmxctrlPackage.DMX_PROJECT__LIBRARY:
				return getLibrary();
			case EzdmxctrlPackage.DMX_PROJECT__FIXTURE_DEFINITIONS:
				return getFixtureDefinitions();
			case EzdmxctrlPackage.DMX_PROJECT__LAST_ADDRESS:
				return getLastAddress();
			case EzdmxctrlPackage.DMX_PROJECT__SELECTION:
				if (resolve) return getSelection();
				return basicGetSelection();
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
			case EzdmxctrlPackage.DMX_PROJECT__UNIVERSES:
				getUniverses().clear();
				getUniverses().addAll((Collection<? extends DMXUniverseCtrl>)newValue);
				return;
			case EzdmxctrlPackage.DMX_PROJECT__SCENES:
				getScenes().clear();
				getScenes().addAll((Collection<? extends DMXScene>)newValue);
				return;
			case EzdmxctrlPackage.DMX_PROJECT__ID:
				setId((String)newValue);
				return;
			case EzdmxctrlPackage.DMX_PROJECT__NAME:
				setName((String)newValue);
				return;
			case EzdmxctrlPackage.DMX_PROJECT__LIBRARY:
				setLibrary((DMXLibrary)newValue);
				return;
			case EzdmxctrlPackage.DMX_PROJECT__FIXTURE_DEFINITIONS:
				getFixtureDefinitions().clear();
				getFixtureDefinitions().addAll((Collection<? extends FixtureDefinition>)newValue);
				return;
			case EzdmxctrlPackage.DMX_PROJECT__LAST_ADDRESS:
				setLastAddress((XCPAddress)newValue);
				return;
			case EzdmxctrlPackage.DMX_PROJECT__SELECTION:
				setSelection((EObject)newValue);
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
			case EzdmxctrlPackage.DMX_PROJECT__UNIVERSES:
				getUniverses().clear();
				return;
			case EzdmxctrlPackage.DMX_PROJECT__SCENES:
				getScenes().clear();
				return;
			case EzdmxctrlPackage.DMX_PROJECT__ID:
				setId(ID_EDEFAULT);
				return;
			case EzdmxctrlPackage.DMX_PROJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EzdmxctrlPackage.DMX_PROJECT__LIBRARY:
				setLibrary((DMXLibrary)null);
				return;
			case EzdmxctrlPackage.DMX_PROJECT__FIXTURE_DEFINITIONS:
				getFixtureDefinitions().clear();
				return;
			case EzdmxctrlPackage.DMX_PROJECT__LAST_ADDRESS:
				setLastAddress((XCPAddress)null);
				return;
			case EzdmxctrlPackage.DMX_PROJECT__SELECTION:
				setSelection((EObject)null);
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
			case EzdmxctrlPackage.DMX_PROJECT__UNIVERSES:
				return universes != null && !universes.isEmpty();
			case EzdmxctrlPackage.DMX_PROJECT__SCENES:
				return scenes != null && !scenes.isEmpty();
			case EzdmxctrlPackage.DMX_PROJECT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EzdmxctrlPackage.DMX_PROJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EzdmxctrlPackage.DMX_PROJECT__LIBRARY:
				return library != null;
			case EzdmxctrlPackage.DMX_PROJECT__FIXTURE_DEFINITIONS:
				return fixtureDefinitions != null && !fixtureDefinitions.isEmpty();
			case EzdmxctrlPackage.DMX_PROJECT__LAST_ADDRESS:
				return lastAddress != null;
			case EzdmxctrlPackage.DMX_PROJECT__SELECTION:
				return selection != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DMXProjectImpl
