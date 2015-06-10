/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Replace Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.ReplaceType#getFeatureGroup <em>Feature Group</em>}</li>
 *   <li>{@link com.google.earth.kml._2.ReplaceType#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.earth.kml._2.v21Package#getReplaceType()
 * @model extendedMetaData="name='ReplaceType' kind='elementOnly'"
 * @generated
 */
public interface ReplaceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Group</em>' attribute list.
	 * @see com.google.earth.kml._2.v21Package#getReplaceType_FeatureGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='Feature:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getFeatureGroup();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference.
	 * @see com.google.earth.kml._2.v21Package#getReplaceType_Feature()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Feature' namespace='##targetNamespace' group='Feature:group'"
	 * @generated
	 */
	FeatureType getFeature();

} // ReplaceType
