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

import com.google.earth.kml._2.LinkType;
import com.google.earth.kml._2.NetworkLinkType;
import com.google.earth.kml._2.v21Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Link Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.impl.NetworkLinkTypeImpl#isRefreshVisibility <em>Refresh Visibility</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.NetworkLinkTypeImpl#isFlyToView <em>Fly To View</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.NetworkLinkTypeImpl#getLink <em>Link</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.NetworkLinkTypeImpl#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetworkLinkTypeImpl extends FeatureTypeImpl implements NetworkLinkType {
	/**
	 * The default value of the '{@link #isRefreshVisibility() <em>Refresh Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRefreshVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REFRESH_VISIBILITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRefreshVisibility() <em>Refresh Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRefreshVisibility()
	 * @generated
	 * @ordered
	 */
	protected boolean refreshVisibility = REFRESH_VISIBILITY_EDEFAULT;

	/**
	 * This is true if the Refresh Visibility attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean refreshVisibilityESet;

	/**
	 * The default value of the '{@link #isFlyToView() <em>Fly To View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFlyToView()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FLY_TO_VIEW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFlyToView() <em>Fly To View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFlyToView()
	 * @generated
	 * @ordered
	 */
	protected boolean flyToView = FLY_TO_VIEW_EDEFAULT;

	/**
	 * This is true if the Fly To View attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean flyToViewESet;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected LinkType link;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected LinkType url;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkLinkTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return v21Package.Literals.NETWORK_LINK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRefreshVisibility() {
		return refreshVisibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefreshVisibility(boolean newRefreshVisibility) {
		boolean oldRefreshVisibility = refreshVisibility;
		refreshVisibility = newRefreshVisibility;
		boolean oldRefreshVisibilityESet = refreshVisibilityESet;
		refreshVisibilityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.NETWORK_LINK_TYPE__REFRESH_VISIBILITY, oldRefreshVisibility, refreshVisibility, !oldRefreshVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRefreshVisibility() {
		boolean oldRefreshVisibility = refreshVisibility;
		boolean oldRefreshVisibilityESet = refreshVisibilityESet;
		refreshVisibility = REFRESH_VISIBILITY_EDEFAULT;
		refreshVisibilityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.NETWORK_LINK_TYPE__REFRESH_VISIBILITY, oldRefreshVisibility, REFRESH_VISIBILITY_EDEFAULT, oldRefreshVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRefreshVisibility() {
		return refreshVisibilityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFlyToView() {
		return flyToView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlyToView(boolean newFlyToView) {
		boolean oldFlyToView = flyToView;
		flyToView = newFlyToView;
		boolean oldFlyToViewESet = flyToViewESet;
		flyToViewESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.NETWORK_LINK_TYPE__FLY_TO_VIEW, oldFlyToView, flyToView, !oldFlyToViewESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlyToView() {
		boolean oldFlyToView = flyToView;
		boolean oldFlyToViewESet = flyToViewESet;
		flyToView = FLY_TO_VIEW_EDEFAULT;
		flyToViewESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.NETWORK_LINK_TYPE__FLY_TO_VIEW, oldFlyToView, FLY_TO_VIEW_EDEFAULT, oldFlyToViewESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlyToView() {
		return flyToViewESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType getLink() {
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLink(LinkType newLink, NotificationChain msgs) {
		LinkType oldLink = link;
		link = newLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, v21Package.NETWORK_LINK_TYPE__LINK, oldLink, newLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(LinkType newLink) {
		if (newLink != link) {
			NotificationChain msgs = null;
			if (link != null)
				msgs = ((InternalEObject)link).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - v21Package.NETWORK_LINK_TYPE__LINK, null, msgs);
			if (newLink != null)
				msgs = ((InternalEObject)newLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - v21Package.NETWORK_LINK_TYPE__LINK, null, msgs);
			msgs = basicSetLink(newLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.NETWORK_LINK_TYPE__LINK, newLink, newLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(LinkType newUrl, NotificationChain msgs) {
		LinkType oldUrl = url;
		url = newUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, v21Package.NETWORK_LINK_TYPE__URL, oldUrl, newUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(LinkType newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - v21Package.NETWORK_LINK_TYPE__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - v21Package.NETWORK_LINK_TYPE__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.NETWORK_LINK_TYPE__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case v21Package.NETWORK_LINK_TYPE__LINK:
				return basicSetLink(null, msgs);
			case v21Package.NETWORK_LINK_TYPE__URL:
				return basicSetUrl(null, msgs);
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
			case v21Package.NETWORK_LINK_TYPE__REFRESH_VISIBILITY:
				return isRefreshVisibility();
			case v21Package.NETWORK_LINK_TYPE__FLY_TO_VIEW:
				return isFlyToView();
			case v21Package.NETWORK_LINK_TYPE__LINK:
				return getLink();
			case v21Package.NETWORK_LINK_TYPE__URL:
				return getUrl();
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
			case v21Package.NETWORK_LINK_TYPE__REFRESH_VISIBILITY:
				setRefreshVisibility((Boolean)newValue);
				return;
			case v21Package.NETWORK_LINK_TYPE__FLY_TO_VIEW:
				setFlyToView((Boolean)newValue);
				return;
			case v21Package.NETWORK_LINK_TYPE__LINK:
				setLink((LinkType)newValue);
				return;
			case v21Package.NETWORK_LINK_TYPE__URL:
				setUrl((LinkType)newValue);
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
			case v21Package.NETWORK_LINK_TYPE__REFRESH_VISIBILITY:
				unsetRefreshVisibility();
				return;
			case v21Package.NETWORK_LINK_TYPE__FLY_TO_VIEW:
				unsetFlyToView();
				return;
			case v21Package.NETWORK_LINK_TYPE__LINK:
				setLink((LinkType)null);
				return;
			case v21Package.NETWORK_LINK_TYPE__URL:
				setUrl((LinkType)null);
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
			case v21Package.NETWORK_LINK_TYPE__REFRESH_VISIBILITY:
				return isSetRefreshVisibility();
			case v21Package.NETWORK_LINK_TYPE__FLY_TO_VIEW:
				return isSetFlyToView();
			case v21Package.NETWORK_LINK_TYPE__LINK:
				return link != null;
			case v21Package.NETWORK_LINK_TYPE__URL:
				return url != null;
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
		result.append(" (refreshVisibility: ");
		if (refreshVisibilityESet) result.append(refreshVisibility); else result.append("<unset>");
		result.append(", flyToView: ");
		if (flyToViewESet) result.append(flyToView); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NetworkLinkTypeImpl
