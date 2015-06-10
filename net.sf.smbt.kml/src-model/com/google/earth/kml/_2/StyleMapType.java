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
 * A representation of the model object '<em><b>Style Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.StyleMapType#getPair <em>Pair</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.earth.kml._2.v21Package#getStyleMapType()
 * @model extendedMetaData="name='StyleMapType' kind='elementOnly'"
 * @generated
 */
public interface StyleMapType extends StyleSelectorType {
	/**
	 * Returns the value of the '<em><b>Pair</b></em>' containment reference list.
	 * The list contents are of type {@link com.google.earth.kml._2.StyleMapPairType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pair</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pair</em>' containment reference list.
	 * @see com.google.earth.kml._2.v21Package#getStyleMapType_Pair()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Pair' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<StyleMapPairType> getPair();

} // StyleMapType
