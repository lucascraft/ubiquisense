/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import com.google.earth.kml._2.FeatureType;
import com.google.earth.kml._2.KmlType;
import com.google.earth.kml._2.NetworkLinkControlType;
import com.google.earth.kml._2.v21Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kml Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.impl.KmlTypeImpl#getNetworkLinkControl <em>Network Link Control</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.KmlTypeImpl#getFeatureGroup <em>Feature Group</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.KmlTypeImpl#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KmlTypeImpl extends EObjectImpl implements KmlType {
	/**
	 * The cached value of the '{@link #getNetworkLinkControl() <em>Network Link Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkLinkControl()
	 * @generated
	 * @ordered
	 */
	protected NetworkLinkControlType networkLinkControl;

	/**
	 * The cached value of the '{@link #getFeatureGroup() <em>Feature Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap featureGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KmlTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return v21Package.Literals.KML_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkLinkControlType getNetworkLinkControl() {
		return networkLinkControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworkLinkControl(NetworkLinkControlType newNetworkLinkControl, NotificationChain msgs) {
		NetworkLinkControlType oldNetworkLinkControl = networkLinkControl;
		networkLinkControl = newNetworkLinkControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, v21Package.KML_TYPE__NETWORK_LINK_CONTROL, oldNetworkLinkControl, newNetworkLinkControl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkLinkControl(NetworkLinkControlType newNetworkLinkControl) {
		if (newNetworkLinkControl != networkLinkControl) {
			NotificationChain msgs = null;
			if (networkLinkControl != null)
				msgs = ((InternalEObject)networkLinkControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - v21Package.KML_TYPE__NETWORK_LINK_CONTROL, null, msgs);
			if (newNetworkLinkControl != null)
				msgs = ((InternalEObject)newNetworkLinkControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - v21Package.KML_TYPE__NETWORK_LINK_CONTROL, null, msgs);
			msgs = basicSetNetworkLinkControl(newNetworkLinkControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.KML_TYPE__NETWORK_LINK_CONTROL, newNetworkLinkControl, newNetworkLinkControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getFeatureGroup() {
		if (featureGroup == null) {
			featureGroup = new BasicFeatureMap(this, v21Package.KML_TYPE__FEATURE_GROUP);
		}
		return featureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureType getFeature() {
		return (FeatureType)getFeatureGroup().get(v21Package.Literals.KML_TYPE__FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeature(FeatureType newFeature, NotificationChain msgs) {
		return ((FeatureMap.Internal)getFeatureGroup()).basicAdd(v21Package.Literals.KML_TYPE__FEATURE, newFeature, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case v21Package.KML_TYPE__NETWORK_LINK_CONTROL:
				return basicSetNetworkLinkControl(null, msgs);
			case v21Package.KML_TYPE__FEATURE_GROUP:
				return ((InternalEList<?>)getFeatureGroup()).basicRemove(otherEnd, msgs);
			case v21Package.KML_TYPE__FEATURE:
				return basicSetFeature(null, msgs);
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
			case v21Package.KML_TYPE__NETWORK_LINK_CONTROL:
				return getNetworkLinkControl();
			case v21Package.KML_TYPE__FEATURE_GROUP:
				if (coreType) return getFeatureGroup();
				return ((FeatureMap.Internal)getFeatureGroup()).getWrapper();
			case v21Package.KML_TYPE__FEATURE:
				return getFeature();
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
			case v21Package.KML_TYPE__NETWORK_LINK_CONTROL:
				setNetworkLinkControl((NetworkLinkControlType)newValue);
				return;
			case v21Package.KML_TYPE__FEATURE_GROUP:
				((FeatureMap.Internal)getFeatureGroup()).set(newValue);
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
			case v21Package.KML_TYPE__NETWORK_LINK_CONTROL:
				setNetworkLinkControl((NetworkLinkControlType)null);
				return;
			case v21Package.KML_TYPE__FEATURE_GROUP:
				getFeatureGroup().clear();
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
			case v21Package.KML_TYPE__NETWORK_LINK_CONTROL:
				return networkLinkControl != null;
			case v21Package.KML_TYPE__FEATURE_GROUP:
				return featureGroup != null && !featureGroup.isEmpty();
			case v21Package.KML_TYPE__FEATURE:
				return getFeature() != null;
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
		result.append(" (featureGroup: ");
		result.append(featureGroup);
		result.append(')');
		return result.toString();
	}

} //KmlTypeImpl
