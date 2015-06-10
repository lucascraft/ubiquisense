/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Units Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.google.earth.kml._2.v21Package#getUnitsEnum()
 * @model extendedMetaData="name='unitsEnum'"
 * @generated
 */
public enum UnitsEnum implements Enumerator {
	/**
	 * The '<em><b>Fraction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRACTION_VALUE
	 * @generated
	 * @ordered
	 */
	FRACTION(0, "fraction", "fraction"),

	/**
	 * The '<em><b>Pixels</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIXELS_VALUE
	 * @generated
	 * @ordered
	 */
	PIXELS(1, "pixels", "pixels"),

	/**
	 * The '<em><b>Inset Pixels</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSET_PIXELS_VALUE
	 * @generated
	 * @ordered
	 */
	INSET_PIXELS(2, "insetPixels", "insetPixels");

	/**
	 * The '<em><b>Fraction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fraction</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FRACTION
	 * @model name="fraction"
	 * @generated
	 * @ordered
	 */
	public static final int FRACTION_VALUE = 0;

	/**
	 * The '<em><b>Pixels</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pixels</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIXELS
	 * @model name="pixels"
	 * @generated
	 * @ordered
	 */
	public static final int PIXELS_VALUE = 1;

	/**
	 * The '<em><b>Inset Pixels</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inset Pixels</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSET_PIXELS
	 * @model name="insetPixels"
	 * @generated
	 * @ordered
	 */
	public static final int INSET_PIXELS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Units Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UnitsEnum[] VALUES_ARRAY =
		new UnitsEnum[] {
			FRACTION,
			PIXELS,
			INSET_PIXELS,
		};

	/**
	 * A public read-only list of all the '<em><b>Units Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UnitsEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Units Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UnitsEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitsEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Units Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UnitsEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitsEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Units Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UnitsEnum get(int value) {
		switch (value) {
			case FRACTION_VALUE: return FRACTION;
			case PIXELS_VALUE: return PIXELS;
			case INSET_PIXELS_VALUE: return INSET_PIXELS;
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
	private UnitsEnum(int value, String name, String literal) {
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
	
} //UnitsEnum
