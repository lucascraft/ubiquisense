/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lod Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.LodType#getMinLodPixels <em>Min Lod Pixels</em>}</li>
 *   <li>{@link com.google.earth.kml._2.LodType#getMaxLodPixels <em>Max Lod Pixels</em>}</li>
 *   <li>{@link com.google.earth.kml._2.LodType#getMinFadeExtent <em>Min Fade Extent</em>}</li>
 *   <li>{@link com.google.earth.kml._2.LodType#getMaxFadeExtent <em>Max Fade Extent</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.earth.kml._2.v21Package#getLodType()
 * @model extendedMetaData="name='LodType' kind='elementOnly'"
 * @generated
 */
public interface LodType extends ObjectType {
	/**
	 * Returns the value of the '<em><b>Min Lod Pixels</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Lod Pixels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Lod Pixels</em>' attribute.
	 * @see #isSetMinLodPixels()
	 * @see #unsetMinLodPixels()
	 * @see #setMinLodPixels(float)
	 * @see com.google.earth.kml._2.v21Package#getLodType_MinLodPixels()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='minLodPixels' namespace='##targetNamespace'"
	 * @generated
	 */
	float getMinLodPixels();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.LodType#getMinLodPixels <em>Min Lod Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Lod Pixels</em>' attribute.
	 * @see #isSetMinLodPixels()
	 * @see #unsetMinLodPixels()
	 * @see #getMinLodPixels()
	 * @generated
	 */
	void setMinLodPixels(float value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.LodType#getMinLodPixels <em>Min Lod Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinLodPixels()
	 * @see #getMinLodPixels()
	 * @see #setMinLodPixels(float)
	 * @generated
	 */
	void unsetMinLodPixels();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.LodType#getMinLodPixels <em>Min Lod Pixels</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Lod Pixels</em>' attribute is set.
	 * @see #unsetMinLodPixels()
	 * @see #getMinLodPixels()
	 * @see #setMinLodPixels(float)
	 * @generated
	 */
	boolean isSetMinLodPixels();

	/**
	 * Returns the value of the '<em><b>Max Lod Pixels</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Lod Pixels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Lod Pixels</em>' attribute.
	 * @see #isSetMaxLodPixels()
	 * @see #unsetMaxLodPixels()
	 * @see #setMaxLodPixels(float)
	 * @see com.google.earth.kml._2.v21Package#getLodType_MaxLodPixels()
	 * @model default="-1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='maxLodPixels' namespace='##targetNamespace'"
	 * @generated
	 */
	float getMaxLodPixels();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.LodType#getMaxLodPixels <em>Max Lod Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Lod Pixels</em>' attribute.
	 * @see #isSetMaxLodPixels()
	 * @see #unsetMaxLodPixels()
	 * @see #getMaxLodPixels()
	 * @generated
	 */
	void setMaxLodPixels(float value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.LodType#getMaxLodPixels <em>Max Lod Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxLodPixels()
	 * @see #getMaxLodPixels()
	 * @see #setMaxLodPixels(float)
	 * @generated
	 */
	void unsetMaxLodPixels();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.LodType#getMaxLodPixels <em>Max Lod Pixels</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Lod Pixels</em>' attribute is set.
	 * @see #unsetMaxLodPixels()
	 * @see #getMaxLodPixels()
	 * @see #setMaxLodPixels(float)
	 * @generated
	 */
	boolean isSetMaxLodPixels();

	/**
	 * Returns the value of the '<em><b>Min Fade Extent</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Fade Extent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Fade Extent</em>' attribute.
	 * @see #isSetMinFadeExtent()
	 * @see #unsetMinFadeExtent()
	 * @see #setMinFadeExtent(float)
	 * @see com.google.earth.kml._2.v21Package#getLodType_MinFadeExtent()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='minFadeExtent' namespace='##targetNamespace'"
	 * @generated
	 */
	float getMinFadeExtent();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.LodType#getMinFadeExtent <em>Min Fade Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Fade Extent</em>' attribute.
	 * @see #isSetMinFadeExtent()
	 * @see #unsetMinFadeExtent()
	 * @see #getMinFadeExtent()
	 * @generated
	 */
	void setMinFadeExtent(float value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.LodType#getMinFadeExtent <em>Min Fade Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinFadeExtent()
	 * @see #getMinFadeExtent()
	 * @see #setMinFadeExtent(float)
	 * @generated
	 */
	void unsetMinFadeExtent();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.LodType#getMinFadeExtent <em>Min Fade Extent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Fade Extent</em>' attribute is set.
	 * @see #unsetMinFadeExtent()
	 * @see #getMinFadeExtent()
	 * @see #setMinFadeExtent(float)
	 * @generated
	 */
	boolean isSetMinFadeExtent();

	/**
	 * Returns the value of the '<em><b>Max Fade Extent</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Fade Extent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Fade Extent</em>' attribute.
	 * @see #isSetMaxFadeExtent()
	 * @see #unsetMaxFadeExtent()
	 * @see #setMaxFadeExtent(float)
	 * @see com.google.earth.kml._2.v21Package#getLodType_MaxFadeExtent()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='maxFadeExtent' namespace='##targetNamespace'"
	 * @generated
	 */
	float getMaxFadeExtent();

	/**
	 * Sets the value of the '{@link com.google.earth.kml._2.LodType#getMaxFadeExtent <em>Max Fade Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Fade Extent</em>' attribute.
	 * @see #isSetMaxFadeExtent()
	 * @see #unsetMaxFadeExtent()
	 * @see #getMaxFadeExtent()
	 * @generated
	 */
	void setMaxFadeExtent(float value);

	/**
	 * Unsets the value of the '{@link com.google.earth.kml._2.LodType#getMaxFadeExtent <em>Max Fade Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxFadeExtent()
	 * @see #getMaxFadeExtent()
	 * @see #setMaxFadeExtent(float)
	 * @generated
	 */
	void unsetMaxFadeExtent();

	/**
	 * Returns whether the value of the '{@link com.google.earth.kml._2.LodType#getMaxFadeExtent <em>Max Fade Extent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Fade Extent</em>' attribute is set.
	 * @see #unsetMaxFadeExtent()
	 * @see #getMaxFadeExtent()
	 * @see #setMaxFadeExtent(float)
	 * @generated
	 */
	boolean isSetMaxFadeExtent();

} // LodType
