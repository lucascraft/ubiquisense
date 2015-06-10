/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.UpdateType#getTargetHref <em>Target Href</em>}</li>
 *   <li>{@link com.google.earth.kml._2.UpdateType#getGroup <em>Group</em>}</li>
 *   <li>{@link com.google.earth.kml._2.UpdateType#getCreate <em>Create</em>}</li>
 *   <li>{@link com.google.earth.kml._2.UpdateType#getDelete <em>Delete</em>}</li>
 *   <li>{@link com.google.earth.kml._2.UpdateType#getChange <em>Change</em>}</li>
 *   <li>{@link com.google.earth.kml._2.UpdateType#getReplace <em>Replace</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.earth.kml._2.v21Package#getUpdateType()
 * @model extendedMetaData="name='UpdateType' kind='elementOnly'"
 * @generated
 */
public interface UpdateType extends EObject {
	/**
	 * Returns the value of the '<em><b>Target Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Href</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Href</em>' attribute.
	 * @see #setTargetHref(String)
	 * @see com.google.earth.kml._2.v21Package#getUpdateType_TargetHref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='element' name='targetHref' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTargetHref();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.UpdateType#getTargetHref <em>Target Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Href</em>' attribute.
	 * @see #getTargetHref()
	 * @generated
	 */
	void setTargetHref(String value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see com.google.earth.kml._2.v21Package#getUpdateType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Create</b></em>' containment reference list.
	 * The list contents are of type {@link com.google.earth.kml._2.CreateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create</em>' containment reference list.
	 * @see com.google.earth.kml._2.v21Package#getUpdateType_Create()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Create' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<CreateType> getCreate();

	/**
	 * Returns the value of the '<em><b>Delete</b></em>' containment reference list.
	 * The list contents are of type {@link com.google.earth.kml._2.DeleteType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete</em>' containment reference list.
	 * @see com.google.earth.kml._2.v21Package#getUpdateType_Delete()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Delete' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<DeleteType> getDelete();

	/**
	 * Returns the value of the '<em><b>Change</b></em>' containment reference list.
	 * The list contents are of type {@link com.google.earth.kml._2.ChangeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change</em>' containment reference list.
	 * @see com.google.earth.kml._2.v21Package#getUpdateType_Change()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Change' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ChangeType> getChange();

	/**
	 * Returns the value of the '<em><b>Replace</b></em>' containment reference list.
	 * The list contents are of type {@link com.google.earth.kml._2.ReplaceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replace</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replace</em>' containment reference list.
	 * @see com.google.earth.kml._2.v21Package#getUpdateType_Replace()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Replace' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ReplaceType> getReplace();

} // UpdateType
