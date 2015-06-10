/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import com.google.earth.kml._2.LookAtType;
import com.google.earth.kml._2.NetworkLinkControlType;
import com.google.earth.kml._2.SnippetType;
import com.google.earth.kml._2.UpdateType;
import com.google.earth.kml._2.v21Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Link Control Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.impl.NetworkLinkControlTypeImpl#getMinRefreshPeriod <em>Min Refresh Period</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.NetworkLinkControlTypeImpl#getCookie <em>Cookie</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.NetworkLinkControlTypeImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.NetworkLinkControlTypeImpl#getLinkName <em>Link Name</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.NetworkLinkControlTypeImpl#getLinkDescription <em>Link Description</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.NetworkLinkControlTypeImpl#getLinkSnippet <em>Link Snippet</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.NetworkLinkControlTypeImpl#getExpires <em>Expires</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.NetworkLinkControlTypeImpl#getUpdate <em>Update</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.NetworkLinkControlTypeImpl#getLookAt <em>Look At</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetworkLinkControlTypeImpl extends EObjectImpl implements NetworkLinkControlType {
	/**
	 * The default value of the '{@link #getMinRefreshPeriod() <em>Min Refresh Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRefreshPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_REFRESH_PERIOD_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinRefreshPeriod() <em>Min Refresh Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRefreshPeriod()
	 * @generated
	 * @ordered
	 */
	protected float minRefreshPeriod = MIN_REFRESH_PERIOD_EDEFAULT;

	/**
	 * This is true if the Min Refresh Period attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minRefreshPeriodESet;

	/**
	 * The default value of the '{@link #getCookie() <em>Cookie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCookie()
	 * @generated
	 * @ordered
	 */
	protected static final String COOKIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCookie() <em>Cookie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCookie()
	 * @generated
	 * @ordered
	 */
	protected String cookie = COOKIE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkName() <em>Link Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkName()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkName() <em>Link Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkName()
	 * @generated
	 * @ordered
	 */
	protected String linkName = LINK_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinkDescription() <em>Link Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkDescription() <em>Link Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkDescription()
	 * @generated
	 * @ordered
	 */
	protected String linkDescription = LINK_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLinkSnippet() <em>Link Snippet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkSnippet()
	 * @generated
	 * @ordered
	 */
	protected SnippetType linkSnippet;

	/**
	 * The default value of the '{@link #getExpires() <em>Expires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpires()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar EXPIRES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpires() <em>Expires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpires()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar expires = EXPIRES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUpdate() <em>Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdate()
	 * @generated
	 * @ordered
	 */
	protected UpdateType update;

	/**
	 * The cached value of the '{@link #getLookAt() <em>Look At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLookAt()
	 * @generated
	 * @ordered
	 */
	protected LookAtType lookAt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkLinkControlTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return v21Package.Literals.NETWORK_LINK_CONTROL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinRefreshPeriod() {
		return minRefreshPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinRefreshPeriod(float newMinRefreshPeriod) {
		float oldMinRefreshPeriod = minRefreshPeriod;
		minRefreshPeriod = newMinRefreshPeriod;
		boolean oldMinRefreshPeriodESet = minRefreshPeriodESet;
		minRefreshPeriodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.NETWORK_LINK_CONTROL_TYPE__MIN_REFRESH_PERIOD, oldMinRefreshPeriod, minRefreshPeriod, !oldMinRefreshPeriodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinRefreshPeriod() {
		float oldMinRefreshPeriod = minRefreshPeriod;
		boolean oldMinRefreshPeriodESet = minRefreshPeriodESet;
		minRefreshPeriod = MIN_REFRESH_PERIOD_EDEFAULT;
		minRefreshPeriodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.NETWORK_LINK_CONTROL_TYPE__MIN_REFRESH_PERIOD, oldMinRefreshPeriod, MIN_REFRESH_PERIOD_EDEFAULT, oldMinRefreshPeriodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinRefreshPeriod() {
		return minRefreshPeriodESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCookie() {
		return cookie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCookie(String newCookie) {
		String oldCookie = cookie;
		cookie = newCookie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.NETWORK_LINK_CONTROL_TYPE__COOKIE, oldCookie, cookie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.NETWORK_LINK_CONTROL_TYPE__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinkName() {
		return linkName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkName(String newLinkName) {
		String oldLinkName = linkName;
		linkName = newLinkName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.NETWORK_LINK_CONTROL_TYPE__LINK_NAME, oldLinkName, linkName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinkDescription() {
		return linkDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkDescription(String newLinkDescription) {
		String oldLinkDescription = linkDescription;
		linkDescription = newLinkDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.NETWORK_LINK_CONTROL_TYPE__LINK_DESCRIPTION, oldLinkDescription, linkDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnippetType getLinkSnippet() {
		return linkSnippet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkSnippet(SnippetType newLinkSnippet, NotificationChain msgs) {
		SnippetType oldLinkSnippet = linkSnippet;
		linkSnippet = newLinkSnippet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, v21Package.NETWORK_LINK_CONTROL_TYPE__LINK_SNIPPET, oldLinkSnippet, newLinkSnippet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkSnippet(SnippetType newLinkSnippet) {
		if (newLinkSnippet != linkSnippet) {
			NotificationChain msgs = null;
			if (linkSnippet != null)
				msgs = ((InternalEObject)linkSnippet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - v21Package.NETWORK_LINK_CONTROL_TYPE__LINK_SNIPPET, null, msgs);
			if (newLinkSnippet != null)
				msgs = ((InternalEObject)newLinkSnippet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - v21Package.NETWORK_LINK_CONTROL_TYPE__LINK_SNIPPET, null, msgs);
			msgs = basicSetLinkSnippet(newLinkSnippet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.NETWORK_LINK_CONTROL_TYPE__LINK_SNIPPET, newLinkSnippet, newLinkSnippet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getExpires() {
		return expires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpires(XMLGregorianCalendar newExpires) {
		XMLGregorianCalendar oldExpires = expires;
		expires = newExpires;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.NETWORK_LINK_CONTROL_TYPE__EXPIRES, oldExpires, expires));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateType getUpdate() {
		return update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdate(UpdateType newUpdate, NotificationChain msgs) {
		UpdateType oldUpdate = update;
		update = newUpdate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, v21Package.NETWORK_LINK_CONTROL_TYPE__UPDATE, oldUpdate, newUpdate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdate(UpdateType newUpdate) {
		if (newUpdate != update) {
			NotificationChain msgs = null;
			if (update != null)
				msgs = ((InternalEObject)update).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - v21Package.NETWORK_LINK_CONTROL_TYPE__UPDATE, null, msgs);
			if (newUpdate != null)
				msgs = ((InternalEObject)newUpdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - v21Package.NETWORK_LINK_CONTROL_TYPE__UPDATE, null, msgs);
			msgs = basicSetUpdate(newUpdate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.NETWORK_LINK_CONTROL_TYPE__UPDATE, newUpdate, newUpdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookAtType getLookAt() {
		return lookAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLookAt(LookAtType newLookAt, NotificationChain msgs) {
		LookAtType oldLookAt = lookAt;
		lookAt = newLookAt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, v21Package.NETWORK_LINK_CONTROL_TYPE__LOOK_AT, oldLookAt, newLookAt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLookAt(LookAtType newLookAt) {
		if (newLookAt != lookAt) {
			NotificationChain msgs = null;
			if (lookAt != null)
				msgs = ((InternalEObject)lookAt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - v21Package.NETWORK_LINK_CONTROL_TYPE__LOOK_AT, null, msgs);
			if (newLookAt != null)
				msgs = ((InternalEObject)newLookAt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - v21Package.NETWORK_LINK_CONTROL_TYPE__LOOK_AT, null, msgs);
			msgs = basicSetLookAt(newLookAt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.NETWORK_LINK_CONTROL_TYPE__LOOK_AT, newLookAt, newLookAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case v21Package.NETWORK_LINK_CONTROL_TYPE__LINK_SNIPPET:
				return basicSetLinkSnippet(null, msgs);
			case v21Package.NETWORK_LINK_CONTROL_TYPE__UPDATE:
				return basicSetUpdate(null, msgs);
			case v21Package.NETWORK_LINK_CONTROL_TYPE__LOOK_AT:
				return basicSetLookAt(null, msgs);
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
			case v21Package.NETWORK_LINK_CONTROL_TYPE__MIN_REFRESH_PERIOD:
				return getMinRefreshPeriod();
			case v21Package.NETWORK_LINK_CONTROL_TYPE__COOKIE:
				return getCookie();
			case v21Package.NETWORK_LINK_CONTROL_TYPE__MESSAGE:
				return getMessage();
			case v21Package.NETWORK_LINK_CONTROL_TYPE__LINK_NAME:
				return getLinkName();
			case v21Package.NETWORK_LINK_CONTROL_TYPE__LINK_DESCRIPTION:
				return getLinkDescription();
			case v21Package.NETWORK_LINK_CONTROL_TYPE__LINK_SNIPPET:
				return getLinkSnippet();
			case v21Package.NETWORK_LINK_CONTROL_TYPE__EXPIRES:
				return getExpires();
			case v21Package.NETWORK_LINK_CONTROL_TYPE__UPDATE:
				return getUpdate();
			case v21Package.NETWORK_LINK_CONTROL_TYPE__LOOK_AT:
				return getLookAt();
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
			case v21Package.NETWORK_LINK_CONTROL_TYPE__MIN_REFRESH_PERIOD:
				setMinRefreshPeriod((Float)newValue);
				return;
			case v21Package.NETWORK_LINK_CONTROL_TYPE__COOKIE:
				setCookie((String)newValue);
				return;
			case v21Package.NETWORK_LINK_CONTROL_TYPE__MESSAGE:
				setMessage((String)newValue);
				return;
			case v21Package.NETWORK_LINK_CONTROL_TYPE__LINK_NAME:
				setLinkName((String)newValue);
				return;
			case v21Package.NETWORK_LINK_CONTROL_TYPE__LINK_DESCRIPTION:
				setLinkDescription((String)newValue);
				return;
			case v21Package.NETWORK_LINK_CONTROL_TYPE__LINK_SNIPPET:
				setLinkSnippet((SnippetType)newValue);
				return;
			case v21Package.NETWORK_LINK_CONTROL_TYPE__EXPIRES:
				setExpires((XMLGregorianCalendar)newValue);
				return;
			case v21Package.NETWORK_LINK_CONTROL_TYPE__UPDATE:
				setUpdate((UpdateType)newValue);
				return;
			case v21Package.NETWORK_LINK_CONTROL_TYPE__LOOK_AT:
				setLookAt((LookAtType)newValue);
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
			case v21Package.NETWORK_LINK_CONTROL_TYPE__MIN_REFRESH_PERIOD:
				unsetMinRefreshPeriod();
				return;
			case v21Package.NETWORK_LINK_CONTROL_TYPE__COOKIE:
				setCookie(COOKIE_EDEFAULT);
				return;
			case v21Package.NETWORK_LINK_CONTROL_TYPE__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case v21Package.NETWORK_LINK_CONTROL_TYPE__LINK_NAME:
				setLinkName(LINK_NAME_EDEFAULT);
				return;
			case v21Package.NETWORK_LINK_CONTROL_TYPE__LINK_DESCRIPTION:
				setLinkDescription(LINK_DESCRIPTION_EDEFAULT);
				return;
			case v21Package.NETWORK_LINK_CONTROL_TYPE__LINK_SNIPPET:
				setLinkSnippet((SnippetType)null);
				return;
			case v21Package.NETWORK_LINK_CONTROL_TYPE__EXPIRES:
				setExpires(EXPIRES_EDEFAULT);
				return;
			case v21Package.NETWORK_LINK_CONTROL_TYPE__UPDATE:
				setUpdate((UpdateType)null);
				return;
			case v21Package.NETWORK_LINK_CONTROL_TYPE__LOOK_AT:
				setLookAt((LookAtType)null);
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
			case v21Package.NETWORK_LINK_CONTROL_TYPE__MIN_REFRESH_PERIOD:
				return isSetMinRefreshPeriod();
			case v21Package.NETWORK_LINK_CONTROL_TYPE__COOKIE:
				return COOKIE_EDEFAULT == null ? cookie != null : !COOKIE_EDEFAULT.equals(cookie);
			case v21Package.NETWORK_LINK_CONTROL_TYPE__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case v21Package.NETWORK_LINK_CONTROL_TYPE__LINK_NAME:
				return LINK_NAME_EDEFAULT == null ? linkName != null : !LINK_NAME_EDEFAULT.equals(linkName);
			case v21Package.NETWORK_LINK_CONTROL_TYPE__LINK_DESCRIPTION:
				return LINK_DESCRIPTION_EDEFAULT == null ? linkDescription != null : !LINK_DESCRIPTION_EDEFAULT.equals(linkDescription);
			case v21Package.NETWORK_LINK_CONTROL_TYPE__LINK_SNIPPET:
				return linkSnippet != null;
			case v21Package.NETWORK_LINK_CONTROL_TYPE__EXPIRES:
				return EXPIRES_EDEFAULT == null ? expires != null : !EXPIRES_EDEFAULT.equals(expires);
			case v21Package.NETWORK_LINK_CONTROL_TYPE__UPDATE:
				return update != null;
			case v21Package.NETWORK_LINK_CONTROL_TYPE__LOOK_AT:
				return lookAt != null;
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
		result.append(" (minRefreshPeriod: ");
		if (minRefreshPeriodESet) result.append(minRefreshPeriod); else result.append("<unset>");
		result.append(", cookie: ");
		result.append(cookie);
		result.append(", message: ");
		result.append(message);
		result.append(", linkName: ");
		result.append(linkName);
		result.append(", linkDescription: ");
		result.append(linkDescription);
		result.append(", expires: ");
		result.append(expires);
		result.append(')');
		return result.toString();
	}

} //NetworkLinkControlTypeImpl
