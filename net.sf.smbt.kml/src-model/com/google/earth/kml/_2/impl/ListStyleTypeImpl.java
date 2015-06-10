/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.google.earth.kml._2.ItemIconType;
import com.google.earth.kml._2.ListItemTypeEnum;
import com.google.earth.kml._2.ListStyleType;
import com.google.earth.kml._2.v21Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Style Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.impl.ListStyleTypeImpl#getListItemType <em>List Item Type</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.ListStyleTypeImpl#getBgColor <em>Bg Color</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.ListStyleTypeImpl#getItemIcon <em>Item Icon</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListStyleTypeImpl extends ObjectTypeImpl implements ListStyleType {
	/**
	 * The default value of the '{@link #getListItemType() <em>List Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListItemType()
	 * @generated
	 * @ordered
	 */
	protected static final ListItemTypeEnum LIST_ITEM_TYPE_EDEFAULT = ListItemTypeEnum.CHECK;

	/**
	 * The cached value of the '{@link #getListItemType() <em>List Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListItemType()
	 * @generated
	 * @ordered
	 */
	protected ListItemTypeEnum listItemType = LIST_ITEM_TYPE_EDEFAULT;

	/**
	 * This is true if the List Item Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean listItemTypeESet;

	/**
	 * The default value of the '{@link #getBgColor() <em>Bg Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBgColor()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] BG_COLOR_EDEFAULT = { (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff };

	/**
	 * The cached value of the '{@link #getBgColor() <em>Bg Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBgColor()
	 * @generated
	 * @ordered
	 */
	protected byte[] bgColor = BG_COLOR_EDEFAULT;

	/**
	 * This is true if the Bg Color attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bgColorESet;

	/**
	 * The cached value of the '{@link #getItemIcon() <em>Item Icon</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemIcon()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemIconType> itemIcon;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListStyleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return v21Package.Literals.LIST_STYLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListItemTypeEnum getListItemType() {
		return listItemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListItemType(ListItemTypeEnum newListItemType) {
		ListItemTypeEnum oldListItemType = listItemType;
		listItemType = newListItemType == null ? LIST_ITEM_TYPE_EDEFAULT : newListItemType;
		boolean oldListItemTypeESet = listItemTypeESet;
		listItemTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.LIST_STYLE_TYPE__LIST_ITEM_TYPE, oldListItemType, listItemType, !oldListItemTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetListItemType() {
		ListItemTypeEnum oldListItemType = listItemType;
		boolean oldListItemTypeESet = listItemTypeESet;
		listItemType = LIST_ITEM_TYPE_EDEFAULT;
		listItemTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.LIST_STYLE_TYPE__LIST_ITEM_TYPE, oldListItemType, LIST_ITEM_TYPE_EDEFAULT, oldListItemTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetListItemType() {
		return listItemTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getBgColor() {
		return bgColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBgColor(byte[] newBgColor) {
		byte[] oldBgColor = bgColor;
		bgColor = newBgColor;
		boolean oldBgColorESet = bgColorESet;
		bgColorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.LIST_STYLE_TYPE__BG_COLOR, oldBgColor, bgColor, !oldBgColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBgColor() {
		byte[] oldBgColor = bgColor;
		boolean oldBgColorESet = bgColorESet;
		bgColor = BG_COLOR_EDEFAULT;
		bgColorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.LIST_STYLE_TYPE__BG_COLOR, oldBgColor, BG_COLOR_EDEFAULT, oldBgColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBgColor() {
		return bgColorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemIconType> getItemIcon() {
		if (itemIcon == null) {
			itemIcon = new EObjectContainmentEList<ItemIconType>(ItemIconType.class, this, v21Package.LIST_STYLE_TYPE__ITEM_ICON);
		}
		return itemIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case v21Package.LIST_STYLE_TYPE__ITEM_ICON:
				return ((InternalEList<?>)getItemIcon()).basicRemove(otherEnd, msgs);
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
			case v21Package.LIST_STYLE_TYPE__LIST_ITEM_TYPE:
				return getListItemType();
			case v21Package.LIST_STYLE_TYPE__BG_COLOR:
				return getBgColor();
			case v21Package.LIST_STYLE_TYPE__ITEM_ICON:
				return getItemIcon();
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
			case v21Package.LIST_STYLE_TYPE__LIST_ITEM_TYPE:
				setListItemType((ListItemTypeEnum)newValue);
				return;
			case v21Package.LIST_STYLE_TYPE__BG_COLOR:
				setBgColor((byte[])newValue);
				return;
			case v21Package.LIST_STYLE_TYPE__ITEM_ICON:
				getItemIcon().clear();
				getItemIcon().addAll((Collection<? extends ItemIconType>)newValue);
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
			case v21Package.LIST_STYLE_TYPE__LIST_ITEM_TYPE:
				unsetListItemType();
				return;
			case v21Package.LIST_STYLE_TYPE__BG_COLOR:
				unsetBgColor();
				return;
			case v21Package.LIST_STYLE_TYPE__ITEM_ICON:
				getItemIcon().clear();
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
			case v21Package.LIST_STYLE_TYPE__LIST_ITEM_TYPE:
				return isSetListItemType();
			case v21Package.LIST_STYLE_TYPE__BG_COLOR:
				return isSetBgColor();
			case v21Package.LIST_STYLE_TYPE__ITEM_ICON:
				return itemIcon != null && !itemIcon.isEmpty();
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
		result.append(" (listItemType: ");
		if (listItemTypeESet) result.append(listItemType); else result.append("<unset>");
		result.append(", bgColor: ");
		if (bgColorESet) result.append(bgColor); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ListStyleTypeImpl
