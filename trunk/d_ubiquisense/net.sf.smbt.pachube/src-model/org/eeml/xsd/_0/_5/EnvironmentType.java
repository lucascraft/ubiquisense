/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eeml.xsd._0._5;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eeml.xsd._0._5.EnvironmentType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.EnvironmentType#getFeed <em>Feed</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.EnvironmentType#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.EnvironmentType#getPrivate <em>Private</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.EnvironmentType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.EnvironmentType#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.EnvironmentType#getWebsite <em>Website</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.EnvironmentType#getEmail <em>Email</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.EnvironmentType#getTag <em>Tag</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.EnvironmentType#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.EnvironmentType#getData <em>Data</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.EnvironmentType#getCreator <em>Creator</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.EnvironmentType#getId <em>Id</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.EnvironmentType#getUpdated <em>Updated</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eeml.xsd._0._5._5Package#getEnvironmentType()
 * @model extendedMetaData="name='environment_._type' kind='elementOnly'"
 * @generated
 */
public interface EnvironmentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.eeml.xsd._0._5._5Package#getEnvironmentType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eeml.xsd._0._5.EnvironmentType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Feed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feed</em>' attribute.
	 * @see #setFeed(String)
	 * @see org.eeml.xsd._0._5._5Package#getEnvironmentType_Feed()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='feed' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFeed();

	/**
	 * Sets the value of the '{@link org.eeml.xsd._0._5.EnvironmentType#getFeed <em>Feed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feed</em>' attribute.
	 * @see #getFeed()
	 * @generated
	 */
	void setFeed(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eeml.xsd._0._5.StatusType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.eeml.xsd._0._5.StatusType
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #setStatus(StatusType)
	 * @see org.eeml.xsd._0._5._5Package#getEnvironmentType_Status()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	StatusType getStatus();

	/**
	 * Sets the value of the '{@link org.eeml.xsd._0._5.EnvironmentType#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.eeml.xsd._0._5.StatusType
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusType value);

	/**
	 * Unsets the value of the '{@link org.eeml.xsd._0._5.EnvironmentType#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatus()
	 * @see #getStatus()
	 * @see #setStatus(StatusType)
	 * @generated
	 */
	void unsetStatus();

	/**
	 * Returns whether the value of the '{@link org.eeml.xsd._0._5.EnvironmentType#getStatus <em>Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Status</em>' attribute is set.
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @see #setStatus(StatusType)
	 * @generated
	 */
	boolean isSetStatus();

	/**
	 * Returns the value of the '<em><b>Private</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eeml.xsd._0._5.PrivateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Private</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private</em>' attribute.
	 * @see org.eeml.xsd._0._5.PrivateType
	 * @see #isSetPrivate()
	 * @see #unsetPrivate()
	 * @see #setPrivate(PrivateType)
	 * @see org.eeml.xsd._0._5._5Package#getEnvironmentType_Private()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='private' namespace='##targetNamespace'"
	 * @generated
	 */
	PrivateType getPrivate();

	/**
	 * Sets the value of the '{@link org.eeml.xsd._0._5.EnvironmentType#getPrivate <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private</em>' attribute.
	 * @see org.eeml.xsd._0._5.PrivateType
	 * @see #isSetPrivate()
	 * @see #unsetPrivate()
	 * @see #getPrivate()
	 * @generated
	 */
	void setPrivate(PrivateType value);

	/**
	 * Unsets the value of the '{@link org.eeml.xsd._0._5.EnvironmentType#getPrivate <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrivate()
	 * @see #getPrivate()
	 * @see #setPrivate(PrivateType)
	 * @generated
	 */
	void unsetPrivate();

	/**
	 * Returns whether the value of the '{@link org.eeml.xsd._0._5.EnvironmentType#getPrivate <em>Private</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Private</em>' attribute is set.
	 * @see #unsetPrivate()
	 * @see #getPrivate()
	 * @see #setPrivate(PrivateType)
	 * @generated
	 */
	boolean isSetPrivate();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eeml.xsd._0._5._5Package#getEnvironmentType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eeml.xsd._0._5.EnvironmentType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Icon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see org.eeml.xsd._0._5._5Package#getEnvironmentType_Icon()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='icon' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link org.eeml.xsd._0._5.EnvironmentType#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

	/**
	 * Returns the value of the '<em><b>Website</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Website</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Website</em>' attribute.
	 * @see #setWebsite(String)
	 * @see org.eeml.xsd._0._5._5Package#getEnvironmentType_Website()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='website' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWebsite();

	/**
	 * Sets the value of the '{@link org.eeml.xsd._0._5.EnvironmentType#getWebsite <em>Website</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Website</em>' attribute.
	 * @see #getWebsite()
	 * @generated
	 */
	void setWebsite(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see org.eeml.xsd._0._5._5Package#getEnvironmentType_Email()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='email' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link org.eeml.xsd._0._5.EnvironmentType#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute list.
	 * @see org.eeml.xsd._0._5._5Package#getEnvironmentType_Tag()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='tag' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getTag();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(LocationType)
	 * @see org.eeml.xsd._0._5._5Package#getEnvironmentType_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	LocationType getLocation();

	/**
	 * Sets the value of the '{@link org.eeml.xsd._0._5.EnvironmentType#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(LocationType value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.eeml.xsd._0._5.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see org.eeml.xsd._0._5._5Package#getEnvironmentType_Data()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='data' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DataType> getData();

	/**
	 * Returns the value of the '<em><b>Creator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creator</em>' attribute.
	 * @see #setCreator(String)
	 * @see org.eeml.xsd._0._5._5Package#getEnvironmentType_Creator()
	 * @model dataType="org.eeml.xsd._0._5.CreatorType"
	 *        extendedMetaData="kind='attribute' name='creator'"
	 * @generated
	 */
	String getCreator();

	/**
	 * Sets the value of the '{@link org.eeml.xsd._0._5.EnvironmentType#getCreator <em>Creator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creator</em>' attribute.
	 * @see #getCreator()
	 * @generated
	 */
	void setCreator(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eeml.xsd._0._5._5Package#getEnvironmentType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eeml.xsd._0._5.EnvironmentType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updated</em>' attribute.
	 * @see #setUpdated(XMLGregorianCalendar)
	 * @see org.eeml.xsd._0._5._5Package#getEnvironmentType_Updated()
	 * @model dataType="org.eeml.xsd._0._5.UpdatedType"
	 *        extendedMetaData="kind='attribute' name='updated'"
	 * @generated
	 */
	XMLGregorianCalendar getUpdated();

	/**
	 * Sets the value of the '{@link org.eeml.xsd._0._5.EnvironmentType#getUpdated <em>Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated</em>' attribute.
	 * @see #getUpdated()
	 * @generated
	 */
	void setUpdated(XMLGregorianCalendar value);

} // EnvironmentType
