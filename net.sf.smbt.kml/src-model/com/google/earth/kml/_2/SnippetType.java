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
 * A representation of the model object '<em><b>Snippet Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.SnippetType#getValue <em>Value</em>}</li>
 *   <li>{@link com.google.earth.kml._2.SnippetType#getMaxLines <em>Max Lines</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.earth.kml._2.v21Package#getSnippetType()
 * @model extendedMetaData="name='SnippetType' kind='simple'"
 * @generated
 */
public interface SnippetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see com.google.earth.kml._2.v21Package#getSnippetType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.SnippetType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Max Lines</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Lines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Lines</em>' attribute.
	 * @see #isSetMaxLines()
	 * @see #unsetMaxLines()
	 * @see #setMaxLines(int)
	 * @see com.google.earth.kml._2.v21Package#getSnippetType_MaxLines()
	 * @model default="2" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='maxLines'"
	 * @generated
	 */
	int getMaxLines();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.SnippetType#getMaxLines <em>Max Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Lines</em>' attribute.
	 * @see #isSetMaxLines()
	 * @see #unsetMaxLines()
	 * @see #getMaxLines()
	 * @generated
	 */
	void setMaxLines(int value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.SnippetType#getMaxLines <em>Max Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxLines()
	 * @see #getMaxLines()
	 * @see #setMaxLines(int)
	 * @generated
	 */
	void unsetMaxLines();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.SnippetType#getMaxLines <em>Max Lines</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Lines</em>' attribute is set.
	 * @see #unsetMaxLines()
	 * @see #getMaxLines()
	 * @see #setMaxLines(int)
	 * @generated
	 */
	boolean isSetMaxLines();

} // SnippetType
