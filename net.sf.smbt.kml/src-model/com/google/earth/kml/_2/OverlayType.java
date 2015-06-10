/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Overlay Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.OverlayType#getColor <em>Color</em>}</li>
 *   <li>{@link com.google.earth.kml._2.OverlayType#getDrawOrder <em>Draw Order</em>}</li>
 *   <li>{@link com.google.earth.kml._2.OverlayType#getIcon <em>Icon</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.earth.kml._2.v21Package#getOverlayType()
 * @model abstract="true"
 *        extendedMetaData="name='OverlayType' kind='elementOnly'"
 * @generated
 */
public interface OverlayType extends FeatureType {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"ffffffff"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #isSetColor()
	 * @see #unsetColor()
	 * @see #setColor(byte[])
	 * @see com.google.earth.kml._2.v21Package#getOverlayType_Color()
	 * @model default="ffffffff" unsettable="true" dataType="com.google.earth.kml._2.Color"
	 *        extendedMetaData="kind='element' name='color' namespace='##targetNamespace'"
	 * @generated
	 */
	byte[] getColor();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.OverlayType#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #isSetColor()
	 * @see #unsetColor()
	 * @see #getColor()
	 * @generated
	 */
	void setColor(byte[] value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.OverlayType#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColor()
	 * @see #getColor()
	 * @see #setColor(byte[])
	 * @generated
	 */
	void unsetColor();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.OverlayType#getColor <em>Color</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Color</em>' attribute is set.
	 * @see #unsetColor()
	 * @see #getColor()
	 * @see #setColor(byte[])
	 * @generated
	 */
	boolean isSetColor();

	/**
	 * Returns the value of the '<em><b>Draw Order</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Draw Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Draw Order</em>' attribute.
	 * @see #isSetDrawOrder()
	 * @see #unsetDrawOrder()
	 * @see #setDrawOrder(int)
	 * @see com.google.earth.kml._2.v21Package#getOverlayType_DrawOrder()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='drawOrder' namespace='##targetNamespace'"
	 * @generated
	 */
	int getDrawOrder();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.OverlayType#getDrawOrder <em>Draw Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Draw Order</em>' attribute.
	 * @see #isSetDrawOrder()
	 * @see #unsetDrawOrder()
	 * @see #getDrawOrder()
	 * @generated
	 */
	void setDrawOrder(int value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.OverlayType#getDrawOrder <em>Draw Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDrawOrder()
	 * @see #getDrawOrder()
	 * @see #setDrawOrder(int)
	 * @generated
	 */
	void unsetDrawOrder();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.OverlayType#getDrawOrder <em>Draw Order</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Draw Order</em>' attribute is set.
	 * @see #unsetDrawOrder()
	 * @see #getDrawOrder()
	 * @see #setDrawOrder(int)
	 * @generated
	 */
	boolean isSetDrawOrder();

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' containment reference.
	 * @see #setIcon(LinkType)
	 * @see com.google.earth.kml._2.v21Package#getOverlayType_Icon()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Icon' namespace='##targetNamespace'"
	 * @generated
	 */
	LinkType getIcon();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.OverlayType#getIcon <em>Icon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' containment reference.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(LinkType value);

} // OverlayType
