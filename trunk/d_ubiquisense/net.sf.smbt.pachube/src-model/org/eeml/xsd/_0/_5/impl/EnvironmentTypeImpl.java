/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eeml.xsd._0._5.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eeml.xsd._0._5.DataType;
import org.eeml.xsd._0._5.EnvironmentType;
import org.eeml.xsd._0._5.LocationType;
import org.eeml.xsd._0._5.PrivateType;
import org.eeml.xsd._0._5.StatusType;
import org.eeml.xsd._0._5._5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eeml.xsd._0._5.impl.EnvironmentTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.impl.EnvironmentTypeImpl#getFeed <em>Feed</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.impl.EnvironmentTypeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.impl.EnvironmentTypeImpl#getPrivate <em>Private</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.impl.EnvironmentTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.impl.EnvironmentTypeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.impl.EnvironmentTypeImpl#getWebsite <em>Website</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.impl.EnvironmentTypeImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.impl.EnvironmentTypeImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.impl.EnvironmentTypeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.impl.EnvironmentTypeImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.impl.EnvironmentTypeImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.impl.EnvironmentTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.impl.EnvironmentTypeImpl#getUpdated <em>Updated</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnvironmentTypeImpl extends EObjectImpl implements EnvironmentType {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeed() <em>Feed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeed()
	 * @generated
	 * @ordered
	 */
	protected static final String FEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeed() <em>Feed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeed()
	 * @generated
	 * @ordered
	 */
	protected String feed = FEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final StatusType STATUS_EDEFAULT = StatusType.FROZEN;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected StatusType status = STATUS_EDEFAULT;

	/**
	 * This is true if the Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean statusESet;

	/**
	 * The default value of the '{@link #getPrivate() <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivate()
	 * @generated
	 * @ordered
	 */
	protected static final PrivateType PRIVATE_EDEFAULT = PrivateType.TRUE;

	/**
	 * The cached value of the '{@link #getPrivate() <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivate()
	 * @generated
	 * @ordered
	 */
	protected PrivateType private_ = PRIVATE_EDEFAULT;

	/**
	 * This is true if the Private attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean privateESet;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected String icon = ICON_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebsite() <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsite()
	 * @generated
	 * @ordered
	 */
	protected static final String WEBSITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebsite() <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebsite()
	 * @generated
	 * @ordered
	 */
	protected String website = WEBSITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tag;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected LocationType location;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> data;

	/**
	 * The default value of the '{@link #getCreator() <em>Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreator() <em>Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreator()
	 * @generated
	 * @ordered
	 */
	protected String creator = CREATOR_EDEFAULT;

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
	 * The default value of the '{@link #getUpdated() <em>Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdated()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar UPDATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdated() <em>Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdated()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar updated = UPDATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _5Package.Literals.ENVIRONMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _5Package.ENVIRONMENT_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeed() {
		return feed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeed(String newFeed) {
		String oldFeed = feed;
		feed = newFeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _5Package.ENVIRONMENT_TYPE__FEED, oldFeed, feed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusType getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(StatusType newStatus) {
		StatusType oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		boolean oldStatusESet = statusESet;
		statusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _5Package.ENVIRONMENT_TYPE__STATUS, oldStatus, status, !oldStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStatus() {
		StatusType oldStatus = status;
		boolean oldStatusESet = statusESet;
		status = STATUS_EDEFAULT;
		statusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _5Package.ENVIRONMENT_TYPE__STATUS, oldStatus, STATUS_EDEFAULT, oldStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStatus() {
		return statusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivateType getPrivate() {
		return private_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivate(PrivateType newPrivate) {
		PrivateType oldPrivate = private_;
		private_ = newPrivate == null ? PRIVATE_EDEFAULT : newPrivate;
		boolean oldPrivateESet = privateESet;
		privateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _5Package.ENVIRONMENT_TYPE__PRIVATE, oldPrivate, private_, !oldPrivateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrivate() {
		PrivateType oldPrivate = private_;
		boolean oldPrivateESet = privateESet;
		private_ = PRIVATE_EDEFAULT;
		privateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _5Package.ENVIRONMENT_TYPE__PRIVATE, oldPrivate, PRIVATE_EDEFAULT, oldPrivateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrivate() {
		return privateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _5Package.ENVIRONMENT_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(String newIcon) {
		String oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _5Package.ENVIRONMENT_TYPE__ICON, oldIcon, icon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebsite() {
		return website;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebsite(String newWebsite) {
		String oldWebsite = website;
		website = newWebsite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _5Package.ENVIRONMENT_TYPE__WEBSITE, oldWebsite, website));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _5Package.ENVIRONMENT_TYPE__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTag() {
		if (tag == null) {
			tag = new EDataTypeEList<String>(String.class, this, _5Package.ENVIRONMENT_TYPE__TAG);
		}
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(LocationType newLocation, NotificationChain msgs) {
		LocationType oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _5Package.ENVIRONMENT_TYPE__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(LocationType newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _5Package.ENVIRONMENT_TYPE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _5Package.ENVIRONMENT_TYPE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _5Package.ENVIRONMENT_TYPE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<DataType>(DataType.class, this, _5Package.ENVIRONMENT_TYPE__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreator() {
		return creator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreator(String newCreator) {
		String oldCreator = creator;
		creator = newCreator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _5Package.ENVIRONMENT_TYPE__CREATOR, oldCreator, creator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _5Package.ENVIRONMENT_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getUpdated() {
		return updated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdated(XMLGregorianCalendar newUpdated) {
		XMLGregorianCalendar oldUpdated = updated;
		updated = newUpdated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _5Package.ENVIRONMENT_TYPE__UPDATED, oldUpdated, updated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _5Package.ENVIRONMENT_TYPE__LOCATION:
				return basicSetLocation(null, msgs);
			case _5Package.ENVIRONMENT_TYPE__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
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
			case _5Package.ENVIRONMENT_TYPE__TITLE:
				return getTitle();
			case _5Package.ENVIRONMENT_TYPE__FEED:
				return getFeed();
			case _5Package.ENVIRONMENT_TYPE__STATUS:
				return getStatus();
			case _5Package.ENVIRONMENT_TYPE__PRIVATE:
				return getPrivate();
			case _5Package.ENVIRONMENT_TYPE__DESCRIPTION:
				return getDescription();
			case _5Package.ENVIRONMENT_TYPE__ICON:
				return getIcon();
			case _5Package.ENVIRONMENT_TYPE__WEBSITE:
				return getWebsite();
			case _5Package.ENVIRONMENT_TYPE__EMAIL:
				return getEmail();
			case _5Package.ENVIRONMENT_TYPE__TAG:
				return getTag();
			case _5Package.ENVIRONMENT_TYPE__LOCATION:
				return getLocation();
			case _5Package.ENVIRONMENT_TYPE__DATA:
				return getData();
			case _5Package.ENVIRONMENT_TYPE__CREATOR:
				return getCreator();
			case _5Package.ENVIRONMENT_TYPE__ID:
				return getId();
			case _5Package.ENVIRONMENT_TYPE__UPDATED:
				return getUpdated();
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
			case _5Package.ENVIRONMENT_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case _5Package.ENVIRONMENT_TYPE__FEED:
				setFeed((String)newValue);
				return;
			case _5Package.ENVIRONMENT_TYPE__STATUS:
				setStatus((StatusType)newValue);
				return;
			case _5Package.ENVIRONMENT_TYPE__PRIVATE:
				setPrivate((PrivateType)newValue);
				return;
			case _5Package.ENVIRONMENT_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case _5Package.ENVIRONMENT_TYPE__ICON:
				setIcon((String)newValue);
				return;
			case _5Package.ENVIRONMENT_TYPE__WEBSITE:
				setWebsite((String)newValue);
				return;
			case _5Package.ENVIRONMENT_TYPE__EMAIL:
				setEmail((String)newValue);
				return;
			case _5Package.ENVIRONMENT_TYPE__TAG:
				getTag().clear();
				getTag().addAll((Collection<? extends String>)newValue);
				return;
			case _5Package.ENVIRONMENT_TYPE__LOCATION:
				setLocation((LocationType)newValue);
				return;
			case _5Package.ENVIRONMENT_TYPE__DATA:
				getData().clear();
				getData().addAll((Collection<? extends DataType>)newValue);
				return;
			case _5Package.ENVIRONMENT_TYPE__CREATOR:
				setCreator((String)newValue);
				return;
			case _5Package.ENVIRONMENT_TYPE__ID:
				setId((String)newValue);
				return;
			case _5Package.ENVIRONMENT_TYPE__UPDATED:
				setUpdated((XMLGregorianCalendar)newValue);
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
			case _5Package.ENVIRONMENT_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case _5Package.ENVIRONMENT_TYPE__FEED:
				setFeed(FEED_EDEFAULT);
				return;
			case _5Package.ENVIRONMENT_TYPE__STATUS:
				unsetStatus();
				return;
			case _5Package.ENVIRONMENT_TYPE__PRIVATE:
				unsetPrivate();
				return;
			case _5Package.ENVIRONMENT_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case _5Package.ENVIRONMENT_TYPE__ICON:
				setIcon(ICON_EDEFAULT);
				return;
			case _5Package.ENVIRONMENT_TYPE__WEBSITE:
				setWebsite(WEBSITE_EDEFAULT);
				return;
			case _5Package.ENVIRONMENT_TYPE__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case _5Package.ENVIRONMENT_TYPE__TAG:
				getTag().clear();
				return;
			case _5Package.ENVIRONMENT_TYPE__LOCATION:
				setLocation((LocationType)null);
				return;
			case _5Package.ENVIRONMENT_TYPE__DATA:
				getData().clear();
				return;
			case _5Package.ENVIRONMENT_TYPE__CREATOR:
				setCreator(CREATOR_EDEFAULT);
				return;
			case _5Package.ENVIRONMENT_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case _5Package.ENVIRONMENT_TYPE__UPDATED:
				setUpdated(UPDATED_EDEFAULT);
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
			case _5Package.ENVIRONMENT_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case _5Package.ENVIRONMENT_TYPE__FEED:
				return FEED_EDEFAULT == null ? feed != null : !FEED_EDEFAULT.equals(feed);
			case _5Package.ENVIRONMENT_TYPE__STATUS:
				return isSetStatus();
			case _5Package.ENVIRONMENT_TYPE__PRIVATE:
				return isSetPrivate();
			case _5Package.ENVIRONMENT_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case _5Package.ENVIRONMENT_TYPE__ICON:
				return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
			case _5Package.ENVIRONMENT_TYPE__WEBSITE:
				return WEBSITE_EDEFAULT == null ? website != null : !WEBSITE_EDEFAULT.equals(website);
			case _5Package.ENVIRONMENT_TYPE__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case _5Package.ENVIRONMENT_TYPE__TAG:
				return tag != null && !tag.isEmpty();
			case _5Package.ENVIRONMENT_TYPE__LOCATION:
				return location != null;
			case _5Package.ENVIRONMENT_TYPE__DATA:
				return data != null && !data.isEmpty();
			case _5Package.ENVIRONMENT_TYPE__CREATOR:
				return CREATOR_EDEFAULT == null ? creator != null : !CREATOR_EDEFAULT.equals(creator);
			case _5Package.ENVIRONMENT_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case _5Package.ENVIRONMENT_TYPE__UPDATED:
				return UPDATED_EDEFAULT == null ? updated != null : !UPDATED_EDEFAULT.equals(updated);
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
		result.append(" (title: ");
		result.append(title);
		result.append(", feed: ");
		result.append(feed);
		result.append(", status: ");
		if (statusESet) result.append(status); else result.append("<unset>");
		result.append(", private: ");
		if (privateESet) result.append(private_); else result.append("<unset>");
		result.append(", description: ");
		result.append(description);
		result.append(", icon: ");
		result.append(icon);
		result.append(", website: ");
		result.append(website);
		result.append(", email: ");
		result.append(email);
		result.append(", tag: ");
		result.append(tag);
		result.append(", creator: ");
		result.append(creator);
		result.append(", id: ");
		result.append(id);
		result.append(", updated: ");
		result.append(updated);
		result.append(')');
		return result.toString();
	}

} //EnvironmentTypeImpl
