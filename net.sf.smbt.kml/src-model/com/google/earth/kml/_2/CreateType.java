/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.CreateType#getFolder <em>Folder</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.earth.kml._2.v21Package#getCreateType()
 * @model extendedMetaData="name='CreateType' kind='elementOnly'"
 * @generated
 */
public interface CreateType extends EObject {
	/**
	 * Returns the value of the '<em><b>Folder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder</em>' containment reference.
	 * @see #setFolder(FolderType)
	 * @see com.google.earth.kml._2.v21Package#getCreateType_Folder()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Folder' namespace='##targetNamespace'"
	 * @generated
	 */
	FolderType getFolder();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.CreateType#getFolder <em>Folder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folder</em>' containment reference.
	 * @see #getFolder()
	 * @generated
	 */
	void setFolder(FolderType value);

} // CreateType
