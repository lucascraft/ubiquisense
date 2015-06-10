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
 * A representation of the model object '<em><b>Change Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.ChangeType#getGroup <em>Group</em>}</li>
 *   <li>{@link com.google.earth.kml._2.ChangeType#getObjectGroup <em>Object Group</em>}</li>
 *   <li>{@link com.google.earth.kml._2.ChangeType#getObject <em>Object</em>}</li>
 *   <li>{@link com.google.earth.kml._2.ChangeType#getFeatureGroup <em>Feature Group</em>}</li>
 *   <li>{@link com.google.earth.kml._2.ChangeType#getFeature <em>Feature</em>}</li>
 *   <li>{@link com.google.earth.kml._2.ChangeType#getGeometryGroup <em>Geometry Group</em>}</li>
 *   <li>{@link com.google.earth.kml._2.ChangeType#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link com.google.earth.kml._2.ChangeType#getStyleSelectorGroup <em>Style Selector Group</em>}</li>
 *   <li>{@link com.google.earth.kml._2.ChangeType#getStyleSelector <em>Style Selector</em>}</li>
 *   <li>{@link com.google.earth.kml._2.ChangeType#getTimePrimitiveGroup <em>Time Primitive Group</em>}</li>
 *   <li>{@link com.google.earth.kml._2.ChangeType#getTimePrimitive <em>Time Primitive</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.google.earth.kml._2.v21Package#getChangeType()
 * @model extendedMetaData="name='ChangeType' kind='elementOnly'"
 * @generated
 */
public interface ChangeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           
	 * 
	 *             Any element ultimately derived from Object.
	 * 
	 *           
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see com.google.earth.kml._2.v21Package#getChangeType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Object Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Group</em>' attribute list.
	 * @see com.google.earth.kml._2.v21Package#getChangeType_ObjectGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='Object:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getObjectGroup();

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference list.
	 * The list contents are of type {@link com.google.earth.kml._2.ObjectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference list.
	 * @see com.google.earth.kml._2.v21Package#getChangeType_Object()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Object' namespace='##targetNamespace' group='Object:group'"
	 * @generated
	 */
	EList<ObjectType> getObject();

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
	 * @see com.google.earth.kml._2.v21Package#getChangeType_FeatureGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='Feature:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getFeatureGroup();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
	 * The list contents are of type {@link com.google.earth.kml._2.FeatureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference list.
	 * @see com.google.earth.kml._2.v21Package#getChangeType_Feature()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Feature' namespace='##targetNamespace' group='Feature:group'"
	 * @generated
	 */
	EList<FeatureType> getFeature();

	/**
	 * Returns the value of the '<em><b>Geometry Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geometry Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry Group</em>' attribute list.
	 * @see com.google.earth.kml._2.v21Package#getChangeType_GeometryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='Geometry:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getGeometryGroup();

	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' containment reference list.
	 * The list contents are of type {@link com.google.earth.kml._2.GeometryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geometry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry</em>' containment reference list.
	 * @see com.google.earth.kml._2.v21Package#getChangeType_Geometry()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Geometry' namespace='##targetNamespace' group='Geometry:group'"
	 * @generated
	 */
	EList<GeometryType> getGeometry();

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
	 * @see com.google.earth.kml._2.v21Package#getChangeType_StyleSelectorGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='StyleSelector:group' namespace='##targetNamespace' group='#group:0'"
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
	 * @see com.google.earth.kml._2.v21Package#getChangeType_StyleSelector()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StyleSelector' namespace='##targetNamespace' group='StyleSelector:group'"
	 * @generated
	 */
	EList<StyleSelectorType> getStyleSelector();

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
	 * @see com.google.earth.kml._2.v21Package#getChangeType_TimePrimitiveGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='TimePrimitive:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getTimePrimitiveGroup();

	/**
	 * Returns the value of the '<em><b>Time Primitive</b></em>' containment reference list.
	 * The list contents are of type {@link com.google.earth.kml._2.TimePrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Primitive</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Primitive</em>' containment reference list.
	 * @see com.google.earth.kml._2.v21Package#getChangeType_TimePrimitive()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimePrimitive' namespace='##targetNamespace' group='TimePrimitive:group'"
	 * @generated
	 */
	EList<TimePrimitiveType> getTimePrimitive();

} // ChangeType
