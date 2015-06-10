/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eeml.xsd._0._5;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eeml.xsd._0._5.DataType#getTag <em>Tag</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.DataType#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.DataType#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.DataType#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.DataType#getDatapoints <em>Datapoints</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.DataType#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.eeml.xsd._0._5.DataType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eeml.xsd._0._5._5Package#getDataType()
 * @model extendedMetaData="name='data_._type' kind='elementOnly'"
 * @generated
 */
public interface DataType extends EObject {
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
	 * @see org.eeml.xsd._0._5._5Package#getDataType_Tag()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='tag' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getTag();

	/**
	 * Returns the value of the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Value</em>' containment reference.
	 * @see #setCurrentValue(CurrentValueType)
	 * @see org.eeml.xsd._0._5._5Package#getDataType_CurrentValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='current_value' namespace='##targetNamespace'"
	 * @generated
	 */
	CurrentValueType getCurrentValue();

	/**
	 * Sets the value of the '{@link org.eeml.xsd._0._5.DataType#getCurrentValue <em>Current Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Value</em>' containment reference.
	 * @see #getCurrentValue()
	 * @generated
	 */
	void setCurrentValue(CurrentValueType value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(String)
	 * @see org.eeml.xsd._0._5._5Package#getDataType_MaxValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='max_value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMaxValue();

	/**
	 * Sets the value of the '{@link org.eeml.xsd._0._5.DataType#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(String value);

	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #setMinValue(String)
	 * @see org.eeml.xsd._0._5._5Package#getDataType_MinValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='min_value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMinValue();

	/**
	 * Sets the value of the '{@link org.eeml.xsd._0._5.DataType#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(String value);

	/**
	 * Returns the value of the '<em><b>Datapoints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datapoints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datapoints</em>' containment reference.
	 * @see #setDatapoints(DatapointsType)
	 * @see org.eeml.xsd._0._5._5Package#getDataType_Datapoints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='datapoints' namespace='##targetNamespace'"
	 * @generated
	 */
	DatapointsType getDatapoints();

	/**
	 * Sets the value of the '{@link org.eeml.xsd._0._5.DataType#getDatapoints <em>Datapoints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datapoints</em>' containment reference.
	 * @see #getDatapoints()
	 * @generated
	 */
	void setDatapoints(DatapointsType value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #setUnit(UnitType)
	 * @see org.eeml.xsd._0._5._5Package#getDataType_Unit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unit' namespace='##targetNamespace'"
	 * @generated
	 */
	UnitType getUnit();

	/**
	 * Sets the value of the '{@link org.eeml.xsd._0._5.DataType#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(UnitType value);

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
	 * @see org.eeml.xsd._0._5._5Package#getDataType_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eeml.xsd._0._5.DataType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // DataType
