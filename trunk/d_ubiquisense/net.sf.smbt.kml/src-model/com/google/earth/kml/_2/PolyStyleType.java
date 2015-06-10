/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Poly Style Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.PolyStyleType#isFill <em>Fill</em>}</li>
 *   <li>{@link com.google.earth.kml._2.PolyStyleType#isOutline <em>Outline</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.earth.kml._2.v21Package#getPolyStyleType()
 * @model extendedMetaData="name='PolyStyleType' kind='elementOnly'"
 * @generated
 */
public interface PolyStyleType extends ColorStyleType {
	/**
	 * Returns the value of the '<em><b>Fill</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill</em>' attribute.
	 * @see #isSetFill()
	 * @see #unsetFill()
	 * @see #setFill(boolean)
	 * @see com.google.earth.kml._2.v21Package#getPolyStyleType_Fill()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='fill' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isFill();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.PolyStyleType#isFill <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill</em>' attribute.
	 * @see #isSetFill()
	 * @see #unsetFill()
	 * @see #isFill()
	 * @generated
	 */
	void setFill(boolean value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.PolyStyleType#isFill <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFill()
	 * @see #isFill()
	 * @see #setFill(boolean)
	 * @generated
	 */
	void unsetFill();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.PolyStyleType#isFill <em>Fill</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fill</em>' attribute is set.
	 * @see #unsetFill()
	 * @see #isFill()
	 * @see #setFill(boolean)
	 * @generated
	 */
	boolean isSetFill();

	/**
	 * Returns the value of the '<em><b>Outline</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outline</em>' attribute.
	 * @see #isSetOutline()
	 * @see #unsetOutline()
	 * @see #setOutline(boolean)
	 * @see com.google.earth.kml._2.v21Package#getPolyStyleType_Outline()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='outline' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isOutline();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.PolyStyleType#isOutline <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outline</em>' attribute.
	 * @see #isSetOutline()
	 * @see #unsetOutline()
	 * @see #isOutline()
	 * @generated
	 */
	void setOutline(boolean value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.PolyStyleType#isOutline <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOutline()
	 * @see #isOutline()
	 * @see #setOutline(boolean)
	 * @generated
	 */
	void unsetOutline();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.PolyStyleType#isOutline <em>Outline</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Outline</em>' attribute is set.
	 * @see #unsetOutline()
	 * @see #isOutline()
	 * @see #setOutline(boolean)
	 * @generated
	 */
	boolean isSetOutline();

} // PolyStyleType
