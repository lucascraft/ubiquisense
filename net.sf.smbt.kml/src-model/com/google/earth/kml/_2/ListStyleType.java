/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Style Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.ListStyleType#getListItemType <em>List Item Type</em>}</li>
 *   <li>{@link com.google.earth.kml._2.ListStyleType#getBgColor <em>Bg Color</em>}</li>
 *   <li>{@link com.google.earth.kml._2.ListStyleType#getItemIcon <em>Item Icon</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.earth.kml._2.v21Package#getListStyleType()
 * @model extendedMetaData="name='ListStyleType' kind='elementOnly'"
 * @generated
 */
public interface ListStyleType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>List Item Type</b></em>' attribute.
	 * The default value is <code>"check"</code>.
	 * The literals are from the enumeration {@link com.google.earth.kml._2.ListItemTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Item Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Item Type</em>' attribute.
	 * @see com.google.earth.kml._2.ListItemTypeEnum
	 * @see #isSetListItemType()
	 * @see #unsetListItemType()
	 * @see #setListItemType(ListItemTypeEnum)
	 * @see com.google.earth.kml._2.v21Package#getListStyleType_ListItemType()
	 * @model default="check" unsettable="true"
	 *        extendedMetaData="kind='element' name='listItemType' namespace='##targetNamespace'"
	 * @generated
	 */
	ListItemTypeEnum getListItemType();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.ListStyleType#getListItemType <em>List Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Item Type</em>' attribute.
	 * @see com.google.earth.kml._2.ListItemTypeEnum
	 * @see #isSetListItemType()
	 * @see #unsetListItemType()
	 * @see #getListItemType()
	 * @generated
	 */
	void setListItemType(ListItemTypeEnum value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.ListStyleType#getListItemType <em>List Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetListItemType()
	 * @see #getListItemType()
	 * @see #setListItemType(ListItemTypeEnum)
	 * @generated
	 */
	void unsetListItemType();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.ListStyleType#getListItemType <em>List Item Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>List Item Type</em>' attribute is set.
	 * @see #unsetListItemType()
	 * @see #getListItemType()
	 * @see #setListItemType(ListItemTypeEnum)
	 * @generated
	 */
	boolean isSetListItemType();

	/**
	 * Returns the value of the '<em><b>Bg Color</b></em>' attribute.
	 * The default value is <code>"ffffffff"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bg Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bg Color</em>' attribute.
	 * @see #isSetBgColor()
	 * @see #unsetBgColor()
	 * @see #setBgColor(byte[])
	 * @see com.google.earth.kml._2.v21Package#getListStyleType_BgColor()
	 * @model default="ffffffff" unsettable="true" dataType="com.google.earth.kml._2.Color"
	 *        extendedMetaData="kind='element' name='bgColor' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getBgColor();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.ListStyleType#getBgColor <em>Bg Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bg Color</em>' attribute.
	 * @see #isSetBgColor()
	 * @see #unsetBgColor()
	 * @see #getBgColor()
	 * @generated
	 */
	void setBgColor(byte[] value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.ListStyleType#getBgColor <em>Bg Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBgColor()
	 * @see #getBgColor()
	 * @see #setBgColor(byte[])
	 * @generated
	 */
	void unsetBgColor();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.ListStyleType#getBgColor <em>Bg Color</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bg Color</em>' attribute is set.
	 * @see #unsetBgColor()
	 * @see #getBgColor()
	 * @see #setBgColor(byte[])
	 * @generated
	 */
	boolean isSetBgColor();

	/**
	 * Returns the value of the '<em><b>Item Icon</b></em>' containment reference list.
	 * The list contents are of type {@link com.google.earth.kml._2.ItemIconType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Icon</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Icon</em>' containment reference list.
	 * @see com.google.earth.kml._2.v21Package#getListStyleType_ItemIcon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ItemIcon' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ItemIconType> getItemIcon();

} // ListStyleType
