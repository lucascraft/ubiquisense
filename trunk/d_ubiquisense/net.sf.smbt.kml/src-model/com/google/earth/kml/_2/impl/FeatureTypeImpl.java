/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import com.google.earth.kml._2.FeatureType;
import com.google.earth.kml._2.LookAtType;
import com.google.earth.kml._2.MetadataType;
import com.google.earth.kml._2.RegionType;
import com.google.earth.kml._2.SnippetType;
import com.google.earth.kml._2.StyleSelectorType;
import com.google.earth.kml._2.TimePrimitiveType;
import com.google.earth.kml._2.v21Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.impl.FeatureTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.FeatureTypeImpl#isVisibility <em>Visibility</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.FeatureTypeImpl#isOpen <em>Open</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.FeatureTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.FeatureTypeImpl#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.FeatureTypeImpl#getSnippet <em>Snippet</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.FeatureTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.FeatureTypeImpl#getLookAt <em>Look At</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.FeatureTypeImpl#getTimePrimitiveGroup <em>Time Primitive Group</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.FeatureTypeImpl#getTimePrimitive <em>Time Primitive</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.FeatureTypeImpl#getStyleUrl <em>Style Url</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.FeatureTypeImpl#getStyleSelectorGroup <em>Style Selector Group</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.FeatureTypeImpl#getStyleSelector <em>Style Selector</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.FeatureTypeImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.FeatureTypeImpl#getMetadata <em>Metadata</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FeatureTypeImpl extends ObjectTypeImpl implements FeatureType {
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
	 * The default value of the '{@link #isVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBILITY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisibility()
	 * @generated
	 * @ordered
	 */
	protected boolean visibility = VISIBILITY_EDEFAULT;

	/**
	 * This is true if the Visibility attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean visibilityESet;

	/**
	 * The default value of the '{@link #isOpen() <em>Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPEN_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isOpen() <em>Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOpen()
	 * @generated
	 * @ordered
	 */
	protected boolean open = OPEN_EDEFAULT;

	/**
	 * This is true if the Open attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean openESet;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected String phoneNumber = PHONE_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSnippet() <em>Snippet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnippet()
	 * @generated
	 * @ordered
	 */
	protected SnippetType snippet;

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
	 * The cached value of the '{@link #getLookAt() <em>Look At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLookAt()
	 * @generated
	 * @ordered
	 */
	protected LookAtType lookAt;

	/**
	 * The cached value of the '{@link #getTimePrimitiveGroup() <em>Time Primitive Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimePrimitiveGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap timePrimitiveGroup;

	/**
	 * The default value of the '{@link #getStyleUrl() <em>Style Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyleUrl() <em>Style Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleUrl()
	 * @generated
	 * @ordered
	 */
	protected String styleUrl = STYLE_URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStyleSelectorGroup() <em>Style Selector Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleSelectorGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap styleSelectorGroup;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected RegionType region;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected MetadataType metadata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return v21Package.Literals.FEATURE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.FEATURE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(boolean newVisibility) {
		boolean oldVisibility = visibility;
		visibility = newVisibility;
		boolean oldVisibilityESet = visibilityESet;
		visibilityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.FEATURE_TYPE__VISIBILITY, oldVisibility, visibility, !oldVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisibility() {
		boolean oldVisibility = visibility;
		boolean oldVisibilityESet = visibilityESet;
		visibility = VISIBILITY_EDEFAULT;
		visibilityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.FEATURE_TYPE__VISIBILITY, oldVisibility, VISIBILITY_EDEFAULT, oldVisibilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibility() {
		return visibilityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOpen() {
		return open;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpen(boolean newOpen) {
		boolean oldOpen = open;
		open = newOpen;
		boolean oldOpenESet = openESet;
		openESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.FEATURE_TYPE__OPEN, oldOpen, open, !oldOpenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOpen() {
		boolean oldOpen = open;
		boolean oldOpenESet = openESet;
		open = OPEN_EDEFAULT;
		openESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.FEATURE_TYPE__OPEN, oldOpen, OPEN_EDEFAULT, oldOpenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOpen() {
		return openESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.FEATURE_TYPE__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoneNumber(String newPhoneNumber) {
		String oldPhoneNumber = phoneNumber;
		phoneNumber = newPhoneNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.FEATURE_TYPE__PHONE_NUMBER, oldPhoneNumber, phoneNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnippetType getSnippet() {
		return snippet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSnippet(SnippetType newSnippet, NotificationChain msgs) {
		SnippetType oldSnippet = snippet;
		snippet = newSnippet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, v21Package.FEATURE_TYPE__SNIPPET, oldSnippet, newSnippet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSnippet(SnippetType newSnippet) {
		if (newSnippet != snippet) {
			NotificationChain msgs = null;
			if (snippet != null)
				msgs = ((InternalEObject)snippet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - v21Package.FEATURE_TYPE__SNIPPET, null, msgs);
			if (newSnippet != null)
				msgs = ((InternalEObject)newSnippet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - v21Package.FEATURE_TYPE__SNIPPET, null, msgs);
			msgs = basicSetSnippet(newSnippet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.FEATURE_TYPE__SNIPPET, newSnippet, newSnippet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.FEATURE_TYPE__DESCRIPTION, oldDescription, description));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, v21Package.FEATURE_TYPE__LOOK_AT, oldLookAt, newLookAt);
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
				msgs = ((InternalEObject)lookAt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - v21Package.FEATURE_TYPE__LOOK_AT, null, msgs);
			if (newLookAt != null)
				msgs = ((InternalEObject)newLookAt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - v21Package.FEATURE_TYPE__LOOK_AT, null, msgs);
			msgs = basicSetLookAt(newLookAt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.FEATURE_TYPE__LOOK_AT, newLookAt, newLookAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getTimePrimitiveGroup() {
		if (timePrimitiveGroup == null) {
			timePrimitiveGroup = new BasicFeatureMap(this, v21Package.FEATURE_TYPE__TIME_PRIMITIVE_GROUP);
		}
		return timePrimitiveGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePrimitiveType getTimePrimitive() {
		return (TimePrimitiveType)getTimePrimitiveGroup().get(v21Package.Literals.FEATURE_TYPE__TIME_PRIMITIVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimePrimitive(TimePrimitiveType newTimePrimitive, NotificationChain msgs) {
		return ((FeatureMap.Internal)getTimePrimitiveGroup()).basicAdd(v21Package.Literals.FEATURE_TYPE__TIME_PRIMITIVE, newTimePrimitive, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleUrl() {
		return styleUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleUrl(String newStyleUrl) {
		String oldStyleUrl = styleUrl;
		styleUrl = newStyleUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.FEATURE_TYPE__STYLE_URL, oldStyleUrl, styleUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getStyleSelectorGroup() {
		if (styleSelectorGroup == null) {
			styleSelectorGroup = new BasicFeatureMap(this, v21Package.FEATURE_TYPE__STYLE_SELECTOR_GROUP);
		}
		return styleSelectorGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StyleSelectorType> getStyleSelector() {
		return getStyleSelectorGroup().list(v21Package.Literals.FEATURE_TYPE__STYLE_SELECTOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionType getRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegion(RegionType newRegion, NotificationChain msgs) {
		RegionType oldRegion = region;
		region = newRegion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, v21Package.FEATURE_TYPE__REGION, oldRegion, newRegion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(RegionType newRegion) {
		if (newRegion != region) {
			NotificationChain msgs = null;
			if (region != null)
				msgs = ((InternalEObject)region).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - v21Package.FEATURE_TYPE__REGION, null, msgs);
			if (newRegion != null)
				msgs = ((InternalEObject)newRegion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - v21Package.FEATURE_TYPE__REGION, null, msgs);
			msgs = basicSetRegion(newRegion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.FEATURE_TYPE__REGION, newRegion, newRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataType getMetadata() {
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(MetadataType newMetadata, NotificationChain msgs) {
		MetadataType oldMetadata = metadata;
		metadata = newMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, v21Package.FEATURE_TYPE__METADATA, oldMetadata, newMetadata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata(MetadataType newMetadata) {
		if (newMetadata != metadata) {
			NotificationChain msgs = null;
			if (metadata != null)
				msgs = ((InternalEObject)metadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - v21Package.FEATURE_TYPE__METADATA, null, msgs);
			if (newMetadata != null)
				msgs = ((InternalEObject)newMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - v21Package.FEATURE_TYPE__METADATA, null, msgs);
			msgs = basicSetMetadata(newMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.FEATURE_TYPE__METADATA, newMetadata, newMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case v21Package.FEATURE_TYPE__SNIPPET:
				return basicSetSnippet(null, msgs);
			case v21Package.FEATURE_TYPE__LOOK_AT:
				return basicSetLookAt(null, msgs);
			case v21Package.FEATURE_TYPE__TIME_PRIMITIVE_GROUP:
				return ((InternalEList<?>)getTimePrimitiveGroup()).basicRemove(otherEnd, msgs);
			case v21Package.FEATURE_TYPE__TIME_PRIMITIVE:
				return basicSetTimePrimitive(null, msgs);
			case v21Package.FEATURE_TYPE__STYLE_SELECTOR_GROUP:
				return ((InternalEList<?>)getStyleSelectorGroup()).basicRemove(otherEnd, msgs);
			case v21Package.FEATURE_TYPE__STYLE_SELECTOR:
				return ((InternalEList<?>)getStyleSelector()).basicRemove(otherEnd, msgs);
			case v21Package.FEATURE_TYPE__REGION:
				return basicSetRegion(null, msgs);
			case v21Package.FEATURE_TYPE__METADATA:
				return basicSetMetadata(null, msgs);
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
			case v21Package.FEATURE_TYPE__NAME:
				return getName();
			case v21Package.FEATURE_TYPE__VISIBILITY:
				return isVisibility();
			case v21Package.FEATURE_TYPE__OPEN:
				return isOpen();
			case v21Package.FEATURE_TYPE__ADDRESS:
				return getAddress();
			case v21Package.FEATURE_TYPE__PHONE_NUMBER:
				return getPhoneNumber();
			case v21Package.FEATURE_TYPE__SNIPPET:
				return getSnippet();
			case v21Package.FEATURE_TYPE__DESCRIPTION:
				return getDescription();
			case v21Package.FEATURE_TYPE__LOOK_AT:
				return getLookAt();
			case v21Package.FEATURE_TYPE__TIME_PRIMITIVE_GROUP:
				if (coreType) return getTimePrimitiveGroup();
				return ((FeatureMap.Internal)getTimePrimitiveGroup()).getWrapper();
			case v21Package.FEATURE_TYPE__TIME_PRIMITIVE:
				return getTimePrimitive();
			case v21Package.FEATURE_TYPE__STYLE_URL:
				return getStyleUrl();
			case v21Package.FEATURE_TYPE__STYLE_SELECTOR_GROUP:
				if (coreType) return getStyleSelectorGroup();
				return ((FeatureMap.Internal)getStyleSelectorGroup()).getWrapper();
			case v21Package.FEATURE_TYPE__STYLE_SELECTOR:
				return getStyleSelector();
			case v21Package.FEATURE_TYPE__REGION:
				return getRegion();
			case v21Package.FEATURE_TYPE__METADATA:
				return getMetadata();
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
			case v21Package.FEATURE_TYPE__NAME:
				setName((String)newValue);
				return;
			case v21Package.FEATURE_TYPE__VISIBILITY:
				setVisibility((Boolean)newValue);
				return;
			case v21Package.FEATURE_TYPE__OPEN:
				setOpen((Boolean)newValue);
				return;
			case v21Package.FEATURE_TYPE__ADDRESS:
				setAddress((String)newValue);
				return;
			case v21Package.FEATURE_TYPE__PHONE_NUMBER:
				setPhoneNumber((String)newValue);
				return;
			case v21Package.FEATURE_TYPE__SNIPPET:
				setSnippet((SnippetType)newValue);
				return;
			case v21Package.FEATURE_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case v21Package.FEATURE_TYPE__LOOK_AT:
				setLookAt((LookAtType)newValue);
				return;
			case v21Package.FEATURE_TYPE__TIME_PRIMITIVE_GROUP:
				((FeatureMap.Internal)getTimePrimitiveGroup()).set(newValue);
				return;
			case v21Package.FEATURE_TYPE__STYLE_URL:
				setStyleUrl((String)newValue);
				return;
			case v21Package.FEATURE_TYPE__STYLE_SELECTOR_GROUP:
				((FeatureMap.Internal)getStyleSelectorGroup()).set(newValue);
				return;
			case v21Package.FEATURE_TYPE__REGION:
				setRegion((RegionType)newValue);
				return;
			case v21Package.FEATURE_TYPE__METADATA:
				setMetadata((MetadataType)newValue);
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
			case v21Package.FEATURE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case v21Package.FEATURE_TYPE__VISIBILITY:
				unsetVisibility();
				return;
			case v21Package.FEATURE_TYPE__OPEN:
				unsetOpen();
				return;
			case v21Package.FEATURE_TYPE__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case v21Package.FEATURE_TYPE__PHONE_NUMBER:
				setPhoneNumber(PHONE_NUMBER_EDEFAULT);
				return;
			case v21Package.FEATURE_TYPE__SNIPPET:
				setSnippet((SnippetType)null);
				return;
			case v21Package.FEATURE_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case v21Package.FEATURE_TYPE__LOOK_AT:
				setLookAt((LookAtType)null);
				return;
			case v21Package.FEATURE_TYPE__TIME_PRIMITIVE_GROUP:
				getTimePrimitiveGroup().clear();
				return;
			case v21Package.FEATURE_TYPE__STYLE_URL:
				setStyleUrl(STYLE_URL_EDEFAULT);
				return;
			case v21Package.FEATURE_TYPE__STYLE_SELECTOR_GROUP:
				getStyleSelectorGroup().clear();
				return;
			case v21Package.FEATURE_TYPE__REGION:
				setRegion((RegionType)null);
				return;
			case v21Package.FEATURE_TYPE__METADATA:
				setMetadata((MetadataType)null);
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
			case v21Package.FEATURE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case v21Package.FEATURE_TYPE__VISIBILITY:
				return isSetVisibility();
			case v21Package.FEATURE_TYPE__OPEN:
				return isSetOpen();
			case v21Package.FEATURE_TYPE__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case v21Package.FEATURE_TYPE__PHONE_NUMBER:
				return PHONE_NUMBER_EDEFAULT == null ? phoneNumber != null : !PHONE_NUMBER_EDEFAULT.equals(phoneNumber);
			case v21Package.FEATURE_TYPE__SNIPPET:
				return snippet != null;
			case v21Package.FEATURE_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case v21Package.FEATURE_TYPE__LOOK_AT:
				return lookAt != null;
			case v21Package.FEATURE_TYPE__TIME_PRIMITIVE_GROUP:
				return timePrimitiveGroup != null && !timePrimitiveGroup.isEmpty();
			case v21Package.FEATURE_TYPE__TIME_PRIMITIVE:
				return getTimePrimitive() != null;
			case v21Package.FEATURE_TYPE__STYLE_URL:
				return STYLE_URL_EDEFAULT == null ? styleUrl != null : !STYLE_URL_EDEFAULT.equals(styleUrl);
			case v21Package.FEATURE_TYPE__STYLE_SELECTOR_GROUP:
				return styleSelectorGroup != null && !styleSelectorGroup.isEmpty();
			case v21Package.FEATURE_TYPE__STYLE_SELECTOR:
				return !getStyleSelector().isEmpty();
			case v21Package.FEATURE_TYPE__REGION:
				return region != null;
			case v21Package.FEATURE_TYPE__METADATA:
				return metadata != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", visibility: ");
		if (visibilityESet) result.append(visibility); else result.append("<unset>");
		result.append(", open: ");
		if (openESet) result.append(open); else result.append("<unset>");
		result.append(", address: ");
		result.append(address);
		result.append(", phoneNumber: ");
		result.append(phoneNumber);
		result.append(", description: ");
		result.append(description);
		result.append(", timePrimitiveGroup: ");
		result.append(timePrimitiveGroup);
		result.append(", styleUrl: ");
		result.append(styleUrl);
		result.append(", styleSelectorGroup: ");
		result.append(styleSelectorGroup);
		result.append(')');
		return result.toString();
	}

} //FeatureTypeImpl
