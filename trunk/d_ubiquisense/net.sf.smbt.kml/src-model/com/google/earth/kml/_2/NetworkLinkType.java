/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Link Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.NetworkLinkType#isRefreshVisibility <em>Refresh Visibility</em>}</li>
 *   <li>{@link com.google.earth.kml._2.NetworkLinkType#isFlyToView <em>Fly To View</em>}</li>
 *   <li>{@link com.google.earth.kml._2.NetworkLinkType#getLink <em>Link</em>}</li>
 *   <li>{@link com.google.earth.kml._2.NetworkLinkType#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.earth.kml._2.v21Package#getNetworkLinkType()
 * @model extendedMetaData="name='NetworkLinkType' kind='elementOnly'"
 * @generated
 */
public interface NetworkLinkType extends FeatureType {
	/**
	 * Returns the value of the '<em><b>Refresh Visibility</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refresh Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Visibility</em>' attribute.
	 * @see #isSetRefreshVisibility()
	 * @see #unsetRefreshVisibility()
	 * @see #setRefreshVisibility(boolean)
	 * @see com.google.earth.kml._2.v21Package#getNetworkLinkType_RefreshVisibility()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='refreshVisibility' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isRefreshVisibility();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.NetworkLinkType#isRefreshVisibility <em>Refresh Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Visibility</em>' attribute.
	 * @see #isSetRefreshVisibility()
	 * @see #unsetRefreshVisibility()
	 * @see #isRefreshVisibility()
	 * @generated
	 */
	void setRefreshVisibility(boolean value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.NetworkLinkType#isRefreshVisibility <em>Refresh Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRefreshVisibility()
	 * @see #isRefreshVisibility()
	 * @see #setRefreshVisibility(boolean)
	 * @generated
	 */
	void unsetRefreshVisibility();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.NetworkLinkType#isRefreshVisibility <em>Refresh Visibility</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Refresh Visibility</em>' attribute is set.
	 * @see #unsetRefreshVisibility()
	 * @see #isRefreshVisibility()
	 * @see #setRefreshVisibility(boolean)
	 * @generated
	 */
	boolean isSetRefreshVisibility();

	/**
	 * Returns the value of the '<em><b>Fly To View</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fly To View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fly To View</em>' attribute.
	 * @see #isSetFlyToView()
	 * @see #unsetFlyToView()
	 * @see #setFlyToView(boolean)
	 * @see com.google.earth.kml._2.v21Package#getNetworkLinkType_FlyToView()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='flyToView' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isFlyToView();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.NetworkLinkType#isFlyToView <em>Fly To View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fly To View</em>' attribute.
	 * @see #isSetFlyToView()
	 * @see #unsetFlyToView()
	 * @see #isFlyToView()
	 * @generated
	 */
	void setFlyToView(boolean value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.NetworkLinkType#isFlyToView <em>Fly To View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFlyToView()
	 * @see #isFlyToView()
	 * @see #setFlyToView(boolean)
	 * @generated
	 */
	void unsetFlyToView();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.NetworkLinkType#isFlyToView <em>Fly To View</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fly To View</em>' attribute is set.
	 * @see #unsetFlyToView()
	 * @see #isFlyToView()
	 * @see #setFlyToView(boolean)
	 * @generated
	 */
	boolean isSetFlyToView();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference.
	 * @see #setLink(LinkType)
	 * @see com.google.earth.kml._2.v21Package#getNetworkLinkType_Link()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Link' namespace='##targetNamespace'"
	 * @generated
	 */
	LinkType getLink();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.NetworkLinkType#getLink <em>Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' containment reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(LinkType value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(LinkType)
	 * @see com.google.earth.kml._2.v21Package#getNetworkLinkType_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Url' namespace='##targetNamespace'"
	 * @generated
	 */
	LinkType getUrl();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.NetworkLinkType#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(LinkType value);

} // NetworkLinkType
