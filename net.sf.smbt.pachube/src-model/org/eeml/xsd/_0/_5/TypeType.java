/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eeml.xsd._0._5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eeml.xsd._0._5._5Package#getTypeType()
 * @model extendedMetaData="name='type_._type'"
 * @generated
 */
public enum TypeType implements Enumerator {
	/**
	 * The '<em><b>Basic SI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASIC_SI_VALUE
	 * @generated
	 * @ordered
	 */
	BASIC_SI(0, "basicSI", "basicSI"),

	/**
	 * The '<em><b>Derived SI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DERIVED_SI_VALUE
	 * @generated
	 * @ordered
	 */
	DERIVED_SI(1, "derivedSI", "derivedSI"),

	/**
	 * The '<em><b>Conversion Based Units</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONVERSION_BASED_UNITS_VALUE
	 * @generated
	 * @ordered
	 */
	CONVERSION_BASED_UNITS(2, "conversionBasedUnits", "conversionBasedUnits"),

	/**
	 * The '<em><b>Derived Units</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DERIVED_UNITS_VALUE
	 * @generated
	 * @ordered
	 */
	DERIVED_UNITS(3, "derivedUnits", "derivedUnits"),

	/**
	 * The '<em><b>Context Dependent Units</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTEXT_DEPENDENT_UNITS_VALUE
	 * @generated
	 * @ordered
	 */
	CONTEXT_DEPENDENT_UNITS(4, "contextDependentUnits", "contextDependentUnits");

	/**
	 * The '<em><b>Basic SI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Basic SI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BASIC_SI
	 * @model name="basicSI"
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_SI_VALUE = 0;

	/**
	 * The '<em><b>Derived SI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Derived SI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DERIVED_SI
	 * @model name="derivedSI"
	 * @generated
	 * @ordered
	 */
	public static final int DERIVED_SI_VALUE = 1;

	/**
	 * The '<em><b>Conversion Based Units</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Conversion Based Units</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONVERSION_BASED_UNITS
	 * @model name="conversionBasedUnits"
	 * @generated
	 * @ordered
	 */
	public static final int CONVERSION_BASED_UNITS_VALUE = 2;

	/**
	 * The '<em><b>Derived Units</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Derived Units</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DERIVED_UNITS
	 * @model name="derivedUnits"
	 * @generated
	 * @ordered
	 */
	public static final int DERIVED_UNITS_VALUE = 3;

	/**
	 * The '<em><b>Context Dependent Units</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Context Dependent Units</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTEXT_DEPENDENT_UNITS
	 * @model name="contextDependentUnits"
	 * @generated
	 * @ordered
	 */
	public static final int CONTEXT_DEPENDENT_UNITS_VALUE = 4;

	/**
	 * An array of all the '<em><b>Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeType[] VALUES_ARRAY =
		new TypeType[] {
			BASIC_SI,
			DERIVED_SI,
			CONVERSION_BASED_UNITS,
			DERIVED_UNITS,
			CONTEXT_DEPENDENT_UNITS,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeType get(int value) {
		switch (value) {
			case BASIC_SI_VALUE: return BASIC_SI;
			case DERIVED_SI_VALUE: return DERIVED_SI;
			case CONVERSION_BASED_UNITS_VALUE: return CONVERSION_BASED_UNITS;
			case DERIVED_UNITS_VALUE: return DERIVED_UNITS;
			case CONTEXT_DEPENDENT_UNITS_VALUE: return CONTEXT_DEPENDENT_UNITS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TypeType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TypeType
