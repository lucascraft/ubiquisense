/**
 */
package net.sf.smbt.ezcosm.impl;

import java.util.Collection;

import net.sf.smbt.ezcosm.Coordinates;
import net.sf.smbt.ezcosm.CosmProject;
import net.sf.smbt.ezcosm.EzcosmPackage;
import net.sf.smbt.ezcosm.Trigger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eeml.xsd._0._5.DataType;
import org.eeml.xsd._0._5.EemlType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cosm Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezcosm.impl.CosmProjectImpl#getEeml <em>Eeml</em>}</li>
 *   <li>{@link net.sf.smbt.ezcosm.impl.CosmProjectImpl#getLastCoordinate <em>Last Coordinate</em>}</li>
 *   <li>{@link net.sf.smbt.ezcosm.impl.CosmProjectImpl#isHideFrozen <em>Hide Frozen</em>}</li>
 *   <li>{@link net.sf.smbt.ezcosm.impl.CosmProjectImpl#getLastDatastream <em>Last Datastream</em>}</li>
 *   <li>{@link net.sf.smbt.ezcosm.impl.CosmProjectImpl#getTriggers <em>Triggers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CosmProjectImpl extends EObjectImpl implements CosmProject {
	/**
	 * The cached value of the '{@link #getEeml() <em>Eeml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEeml()
	 * @generated
	 * @ordered
	 */
	protected EemlType eeml;

	/**
	 * The cached value of the '{@link #getLastCoordinate() <em>Last Coordinate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastCoordinate()
	 * @generated
	 * @ordered
	 */
	protected Coordinates lastCoordinate;

	/**
	 * The default value of the '{@link #isHideFrozen() <em>Hide Frozen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideFrozen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HIDE_FROZEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHideFrozen() <em>Hide Frozen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHideFrozen()
	 * @generated
	 * @ordered
	 */
	protected boolean hideFrozen = HIDE_FROZEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLastDatastream() <em>Last Datastream</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastDatastream()
	 * @generated
	 * @ordered
	 */
	protected DataType lastDatastream;

	/**
	 * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> triggers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CosmProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzcosmPackage.Literals.COSM_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EemlType getEeml() {
		return eeml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEeml(EemlType newEeml, NotificationChain msgs) {
		EemlType oldEeml = eeml;
		eeml = newEeml;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EzcosmPackage.COSM_PROJECT__EEML, oldEeml, newEeml);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEeml(EemlType newEeml) {
		if (newEeml != eeml) {
			NotificationChain msgs = null;
			if (eeml != null)
				msgs = ((InternalEObject)eeml).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EzcosmPackage.COSM_PROJECT__EEML, null, msgs);
			if (newEeml != null)
				msgs = ((InternalEObject)newEeml).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EzcosmPackage.COSM_PROJECT__EEML, null, msgs);
			msgs = basicSetEeml(newEeml, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzcosmPackage.COSM_PROJECT__EEML, newEeml, newEeml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinates getLastCoordinate() {
		return lastCoordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastCoordinate(Coordinates newLastCoordinate, NotificationChain msgs) {
		Coordinates oldLastCoordinate = lastCoordinate;
		lastCoordinate = newLastCoordinate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EzcosmPackage.COSM_PROJECT__LAST_COORDINATE, oldLastCoordinate, newLastCoordinate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastCoordinate(Coordinates newLastCoordinate) {
		if (newLastCoordinate != lastCoordinate) {
			NotificationChain msgs = null;
			if (lastCoordinate != null)
				msgs = ((InternalEObject)lastCoordinate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EzcosmPackage.COSM_PROJECT__LAST_COORDINATE, null, msgs);
			if (newLastCoordinate != null)
				msgs = ((InternalEObject)newLastCoordinate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EzcosmPackage.COSM_PROJECT__LAST_COORDINATE, null, msgs);
			msgs = basicSetLastCoordinate(newLastCoordinate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzcosmPackage.COSM_PROJECT__LAST_COORDINATE, newLastCoordinate, newLastCoordinate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHideFrozen() {
		return hideFrozen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHideFrozen(boolean newHideFrozen) {
		boolean oldHideFrozen = hideFrozen;
		hideFrozen = newHideFrozen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzcosmPackage.COSM_PROJECT__HIDE_FROZEN, oldHideFrozen, hideFrozen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getLastDatastream() {
		if (lastDatastream != null && lastDatastream.eIsProxy()) {
			InternalEObject oldLastDatastream = (InternalEObject)lastDatastream;
			lastDatastream = (DataType)eResolveProxy(oldLastDatastream);
			if (lastDatastream != oldLastDatastream) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EzcosmPackage.COSM_PROJECT__LAST_DATASTREAM, oldLastDatastream, lastDatastream));
			}
		}
		return lastDatastream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetLastDatastream() {
		return lastDatastream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastDatastream(DataType newLastDatastream) {
		DataType oldLastDatastream = lastDatastream;
		lastDatastream = newLastDatastream;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzcosmPackage.COSM_PROJECT__LAST_DATASTREAM, oldLastDatastream, lastDatastream));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getTriggers() {
		if (triggers == null) {
			triggers = new EObjectContainmentEList<Trigger>(Trigger.class, this, EzcosmPackage.COSM_PROJECT__TRIGGERS);
		}
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EzcosmPackage.COSM_PROJECT__EEML:
				return basicSetEeml(null, msgs);
			case EzcosmPackage.COSM_PROJECT__LAST_COORDINATE:
				return basicSetLastCoordinate(null, msgs);
			case EzcosmPackage.COSM_PROJECT__TRIGGERS:
				return ((InternalEList<?>)getTriggers()).basicRemove(otherEnd, msgs);
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
			case EzcosmPackage.COSM_PROJECT__EEML:
				return getEeml();
			case EzcosmPackage.COSM_PROJECT__LAST_COORDINATE:
				return getLastCoordinate();
			case EzcosmPackage.COSM_PROJECT__HIDE_FROZEN:
				return isHideFrozen();
			case EzcosmPackage.COSM_PROJECT__LAST_DATASTREAM:
				if (resolve) return getLastDatastream();
				return basicGetLastDatastream();
			case EzcosmPackage.COSM_PROJECT__TRIGGERS:
				return getTriggers();
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
			case EzcosmPackage.COSM_PROJECT__EEML:
				setEeml((EemlType)newValue);
				return;
			case EzcosmPackage.COSM_PROJECT__LAST_COORDINATE:
				setLastCoordinate((Coordinates)newValue);
				return;
			case EzcosmPackage.COSM_PROJECT__HIDE_FROZEN:
				setHideFrozen((Boolean)newValue);
				return;
			case EzcosmPackage.COSM_PROJECT__LAST_DATASTREAM:
				setLastDatastream((DataType)newValue);
				return;
			case EzcosmPackage.COSM_PROJECT__TRIGGERS:
				getTriggers().clear();
				getTriggers().addAll((Collection<? extends Trigger>)newValue);
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
			case EzcosmPackage.COSM_PROJECT__EEML:
				setEeml((EemlType)null);
				return;
			case EzcosmPackage.COSM_PROJECT__LAST_COORDINATE:
				setLastCoordinate((Coordinates)null);
				return;
			case EzcosmPackage.COSM_PROJECT__HIDE_FROZEN:
				setHideFrozen(HIDE_FROZEN_EDEFAULT);
				return;
			case EzcosmPackage.COSM_PROJECT__LAST_DATASTREAM:
				setLastDatastream((DataType)null);
				return;
			case EzcosmPackage.COSM_PROJECT__TRIGGERS:
				getTriggers().clear();
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
			case EzcosmPackage.COSM_PROJECT__EEML:
				return eeml != null;
			case EzcosmPackage.COSM_PROJECT__LAST_COORDINATE:
				return lastCoordinate != null;
			case EzcosmPackage.COSM_PROJECT__HIDE_FROZEN:
				return hideFrozen != HIDE_FROZEN_EDEFAULT;
			case EzcosmPackage.COSM_PROJECT__LAST_DATASTREAM:
				return lastDatastream != null;
			case EzcosmPackage.COSM_PROJECT__TRIGGERS:
				return triggers != null && !triggers.isEmpty();
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
		result.append(" (hideFrozen: ");
		result.append(hideFrozen);
		result.append(')');
		return result.toString();
	}

} //CosmProjectImpl
