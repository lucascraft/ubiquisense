/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.FeatureType#getName <em>Name</em>}</li>
 *   <li>{@link com.google.earth.kml._2.FeatureType#isVisibility <em>Visibility</em>}</li>
 *   <li>{@link com.google.earth.kml._2.FeatureType#isOpen <em>Open</em>}</li>
 *   <li>{@link com.google.earth.kml._2.FeatureType#getAddress <em>Address</em>}</li>
 *   <li>{@link com.google.earth.kml._2.FeatureType#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link com.google.earth.kml._2.FeatureType#getSnippet <em>Snippet</em>}</li>
 *   <li>{@link com.google.earth.kml._2.FeatureType#getDescription <em>Description</em>}</li>
 *   <li>{@link com.google.earth.kml._2.FeatureType#getLookAt <em>Look At</em>}</li>
 *   <li>{@link com.google.earth.kml._2.FeatureType#getTimePrimitiveGroup <em>Time Primitive Group</em>}</li>
 *   <li>{@link com.google.earth.kml._2.FeatureType#getTimePrimitive <em>Time Primitive</em>}</li>
 *   <li>{@link com.google.earth.kml._2.FeatureType#getStyleUrl <em>Style Url</em>}</li>
 *   <li>{@link com.google.earth.kml._2.FeatureType#getStyleSelectorGroup <em>Style Selector Group</em>}</li>
 *   <li>{@link com.google.earth.kml._2.FeatureType#getStyleSelector <em>Style Selector</em>}</li>
 *   <li>{@link com.google.earth.kml._2.FeatureType#getRegion <em>Region</em>}</li>
 *   <li>{@link com.google.earth.kml._2.FeatureType#getMetadata <em>Metadata</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.earth.kml._2.v21Package#getFeatureType()
 * @model abstract="true"
 *        extendedMetaData="name='FeatureType' kind='elementOnly'"
 * @generated
 */
public interface FeatureType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.google.earth.kml._2.v21Package#getFeatureType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.FeatureType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see #isSetVisibility()
	 * @see #unsetVisibility()
	 * @see #setVisibility(boolean)
	 * @see com.google.earth.kml._2.v21Package#getFeatureType_Visibility()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='visibility' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isVisibility();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.FeatureType#isVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see #isSetVisibility()
	 * @see #unsetVisibility()
	 * @see #isVisibility()
	 * @generated
	 */
	void setVisibility(boolean value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.FeatureType#isVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisibility()
	 * @see #isVisibility()
	 * @see #setVisibility(boolean)
	 * @generated
	 */
	void unsetVisibility();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.FeatureType#isVisibility <em>Visibility</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visibility</em>' attribute is set.
	 * @see #unsetVisibility()
	 * @see #isVisibility()
	 * @see #setVisibility(boolean)
	 * @generated
	 */
	boolean isSetVisibility();

	/**
	 * Returns the value of the '<em><b>Open</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open</em>' attribute.
	 * @see #isSetOpen()
	 * @see #unsetOpen()
	 * @see #setOpen(boolean)
	 * @see com.google.earth.kml._2.v21Package#getFeatureType_Open()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='open' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isOpen();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.FeatureType#isOpen <em>Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open</em>' attribute.
	 * @see #isSetOpen()
	 * @see #unsetOpen()
	 * @see #isOpen()
	 * @generated
	 */
	void setOpen(boolean value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.FeatureType#isOpen <em>Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOpen()
	 * @see #isOpen()
	 * @see #setOpen(boolean)
	 * @generated
	 */
	void unsetOpen();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.FeatureType#isOpen <em>Open</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Open</em>' attribute is set.
	 * @see #unsetOpen()
	 * @see #isOpen()
	 * @see #setOpen(boolean)
	 * @generated
	 */
	boolean isSetOpen();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see com.google.earth.kml._2.v21Package#getFeatureType_Address()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.FeatureType#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Number</em>' attribute.
	 * @see #setPhoneNumber(String)
	 * @see com.google.earth.kml._2.v21Package#getFeatureType_PhoneNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='phoneNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPhoneNumber();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.FeatureType#getPhoneNumber <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone Number</em>' attribute.
	 * @see #getPhoneNumber()
	 * @generated
	 */
	void setPhoneNumber(String value);

	/**
	 * Returns the value of the '<em><b>Snippet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Snippet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Snippet</em>' containment reference.
	 * @see #setSnippet(SnippetType)
	 * @see com.google.earth.kml._2.v21Package#getFeatureType_Snippet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Snippet' namespace='##targetNamespace'"
	 * @generated
	 */
	SnippetType getSnippet();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.FeatureType#getSnippet <em>Snippet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snippet</em>' containment reference.
	 * @see #getSnippet()
	 * @generated
	 */
	void setSnippet(SnippetType value);

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
	 * @see com.google.earth.kml._2.v21Package#getFeatureType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.FeatureType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see com.google.earth.kml._2.v21Package#getFeatureType_LookAt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LookAt' namespace='##targetNamespace'"
	 * @generated
	 */
	LookAtType getLookAt();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.FeatureType#getLookAt <em>Look At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Look At</em>' containment reference.
	 * @see #getLookAt()
	 * @generated
	 */
	void setLookAt(LookAtType value);

	/**
	 * Returns the value of the '<em><b>Time Primitive Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Primitive Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Primitive Group</em>' attribute list.
	 * @see com.google.earth.kml._2.v21Package#getFeatureType_TimePrimitiveGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='TimePrimitive:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getTimePrimitiveGroup();

	/**
	 * Returns the value of the '<em><b>Time Primitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Primitive</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Primitive</em>' containment reference.
	 * @see com.google.earth.kml._2.v21Package#getFeatureType_TimePrimitive()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimePrimitive' namespace='##targetNamespace' group='TimePrimitive:group'"
	 * @generated
	 */
	TimePrimitiveType getTimePrimitive();

	/**
	 * Returns the value of the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Url</em>' attribute.
	 * @see #setStyleUrl(String)
	 * @see com.google.earth.kml._2.v21Package#getFeatureType_StyleUrl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='styleUrl' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyleUrl();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.FeatureType#getStyleUrl <em>Style Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Url</em>' attribute.
	 * @see #getStyleUrl()
	 * @generated
	 */
	void setStyleUrl(String value);

	/**
	 * Returns the value of the '<em><b>Style Selector Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Selector Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Selector Group</em>' attribute list.
	 * @see com.google.earth.kml._2.v21Package#getFeatureType_StyleSelectorGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='StyleSelector:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getStyleSelectorGroup();

	/**
	 * Returns the value of the '<em><b>Style Selector</b></em>' containment reference list.
	 * The list contents are of type {@link com.google.earth.kml._2.StyleSelectorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Selector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Selector</em>' containment reference list.
	 * @see com.google.earth.kml._2.v21Package#getFeatureType_StyleSelector()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StyleSelector' namespace='##targetNamespace' group='StyleSelector:group'"
	 * @generated
	 */
	EList<StyleSelectorType> getStyleSelector();

	/**
	 * Returns the value of the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Region</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' containment reference.
	 * @see #setRegion(RegionType)
	 * @see com.google.earth.kml._2.v21Package#getFeatureType_Region()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Region' namespace='##targetNamespace'"
	 * @generated
	 */
	RegionType getRegion();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.FeatureType#getRegion <em>Region</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' containment reference.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(RegionType value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(MetadataType)
	 * @see com.google.earth.kml._2.v21Package#getFeatureType_Metadata()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	MetadataType getMetadata();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.FeatureType#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(MetadataType value);

} // FeatureType
