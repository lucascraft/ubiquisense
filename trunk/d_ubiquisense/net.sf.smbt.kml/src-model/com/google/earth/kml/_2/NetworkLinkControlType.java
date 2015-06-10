/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Link Control Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.NetworkLinkControlType#getMinRefreshPeriod <em>Min Refresh Period</em>}</li>
 *   <li>{@link com.google.earth.kml._2.NetworkLinkControlType#getCookie <em>Cookie</em>}</li>
 *   <li>{@link com.google.earth.kml._2.NetworkLinkControlType#getMessage <em>Message</em>}</li>
 *   <li>{@link com.google.earth.kml._2.NetworkLinkControlType#getLinkName <em>Link Name</em>}</li>
 *   <li>{@link com.google.earth.kml._2.NetworkLinkControlType#getLinkDescription <em>Link Description</em>}</li>
 *   <li>{@link com.google.earth.kml._2.NetworkLinkControlType#getLinkSnippet <em>Link Snippet</em>}</li>
 *   <li>{@link com.google.earth.kml._2.NetworkLinkControlType#getExpires <em>Expires</em>}</li>
 *   <li>{@link com.google.earth.kml._2.NetworkLinkControlType#getUpdate <em>Update</em>}</li>
 *   <li>{@link com.google.earth.kml._2.NetworkLinkControlType#getLookAt <em>Look At</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.earth.kml._2.v21Package#getNetworkLinkControlType()
 * @model extendedMetaData="name='NetworkLinkControlType' kind='elementOnly'"
 * @generated
 */
public interface NetworkLinkControlType extends EObject {
	/**
	 * Returns the value of the '<em><b>Min Refresh Period</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Refresh Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Refresh Period</em>' attribute.
	 * @see #isSetMinRefreshPeriod()
	 * @see #unsetMinRefreshPeriod()
	 * @see #setMinRefreshPeriod(float)
	 * @see com.google.earth.kml._2.v21Package#getNetworkLinkControlType_MinRefreshPeriod()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='minRefreshPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	float getMinRefreshPeriod();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.NetworkLinkControlType#getMinRefreshPeriod <em>Min Refresh Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Refresh Period</em>' attribute.
	 * @see #isSetMinRefreshPeriod()
	 * @see #unsetMinRefreshPeriod()
	 * @see #getMinRefreshPeriod()
	 * @generated
	 */
	void setMinRefreshPeriod(float value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.NetworkLinkControlType#getMinRefreshPeriod <em>Min Refresh Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinRefreshPeriod()
	 * @see #getMinRefreshPeriod()
	 * @see #setMinRefreshPeriod(float)
	 * @generated
	 */
	void unsetMinRefreshPeriod();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.NetworkLinkControlType#getMinRefreshPeriod <em>Min Refresh Period</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Refresh Period</em>' attribute is set.
	 * @see #unsetMinRefreshPeriod()
	 * @see #getMinRefreshPeriod()
	 * @see #setMinRefreshPeriod(float)
	 * @generated
	 */
	boolean isSetMinRefreshPeriod();

	/**
	 * Returns the value of the '<em><b>Cookie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cookie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cookie</em>' attribute.
	 * @see #setCookie(String)
	 * @see com.google.earth.kml._2.v21Package#getNetworkLinkControlType_Cookie()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='cookie' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCookie();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.NetworkLinkControlType#getCookie <em>Cookie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cookie</em>' attribute.
	 * @see #getCookie()
	 * @generated
	 */
	void setCookie(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see com.google.earth.kml._2.v21Package#getNetworkLinkControlType_Message()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='message' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.NetworkLinkControlType#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Link Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Name</em>' attribute.
	 * @see #setLinkName(String)
	 * @see com.google.earth.kml._2.v21Package#getNetworkLinkControlType_LinkName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='linkName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLinkName();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.NetworkLinkControlType#getLinkName <em>Link Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Name</em>' attribute.
	 * @see #getLinkName()
	 * @generated
	 */
	void setLinkName(String value);

	/**
	 * Returns the value of the '<em><b>Link Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Description</em>' attribute.
	 * @see #setLinkDescription(String)
	 * @see com.google.earth.kml._2.v21Package#getNetworkLinkControlType_LinkDescription()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='linkDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLinkDescription();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.NetworkLinkControlType#getLinkDescription <em>Link Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Description</em>' attribute.
	 * @see #getLinkDescription()
	 * @generated
	 */
	void setLinkDescription(String value);

	/**
	 * Returns the value of the '<em><b>Link Snippet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Snippet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Snippet</em>' containment reference.
	 * @see #setLinkSnippet(SnippetType)
	 * @see com.google.earth.kml._2.v21Package#getNetworkLinkControlType_LinkSnippet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='linkSnippet' namespace='##targetNamespace'"
	 * @generated
	 */
	SnippetType getLinkSnippet();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.NetworkLinkControlType#getLinkSnippet <em>Link Snippet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Snippet</em>' containment reference.
	 * @see #getLinkSnippet()
	 * @generated
	 */
	void setLinkSnippet(SnippetType value);

	/**
	 * Returns the value of the '<em><b>Expires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expires</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expires</em>' attribute.
	 * @see #setExpires(XMLGregorianCalendar)
	 * @see com.google.earth.kml._2.v21Package#getNetworkLinkControlType_Expires()
	 * @model dataType="com.google.earth.kml._2.DateTimeType"
	 *        extendedMetaData="kind='element' name='expires' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getExpires();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.NetworkLinkControlType#getExpires <em>Expires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expires</em>' attribute.
	 * @see #getExpires()
	 * @generated
	 */
	void setExpires(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update</em>' containment reference.
	 * @see #setUpdate(UpdateType)
	 * @see com.google.earth.kml._2.v21Package#getNetworkLinkControlType_Update()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Update' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateType getUpdate();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.NetworkLinkControlType#getUpdate <em>Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update</em>' containment reference.
	 * @see #getUpdate()
	 * @generated
	 */
	void setUpdate(UpdateType value);

	/**
	 * Returns the value of the '<em><b>Look At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Look At</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Look At</em>' containment reference.
	 * @see #setLookAt(LookAtType)
	 * @see com.google.earth.kml._2.v21Package#getNetworkLinkControlType_LookAt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LookAt' namespace='##targetNamespace'"
	 * @generated
	 */
	LookAtType getLookAt();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.NetworkLinkControlType#getLookAt <em>Look At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Look At</em>' containment reference.
	 * @see #getLookAt()
	 * @generated
	 */
	void setLookAt(LookAtType value);

} // NetworkLinkControlType
