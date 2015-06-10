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
 * A representation of the literals of the enumeration '<em><b>Refresh Mode Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.google.earth.kml._2.v21Package#getRefreshModeEnum()
 * @model extendedMetaData="name='refreshModeEnum'"
 * @generated
 */
public enum RefreshModeEnum implements Enumerator {
	/**
	 * The '<em><b>On Change</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_CHANGE_VALUE
	 * @generated
	 * @ordered
	 */
	ON_CHANGE(0, "onChange", "onChange"),

	/**
	 * The '<em><b>On Interval</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_INTERVAL_VALUE
	 * @generated
	 * @ordered
	 */
	ON_INTERVAL(1, "onInterval", "onInterval"),

	/**
	 * The '<em><b>On Expire</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_EXPIRE_VALUE
	 * @generated
	 * @ordered
	 */
	ON_EXPIRE(2, "onExpire", "onExpire");

	/**
	 * The '<em><b>On Change</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>On Change</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ON_CHANGE
	 * @model name="onChange"
	 * @generated
	 * @ordered
	 */
	public static final int ON_CHANGE_VALUE = 0;

	/**
	 * The '<em><b>On Interval</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>On Interval</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ON_INTERVAL
	 * @model name="onInterval"
	 * @generated
	 * @ordered
	 */
	public static final int ON_INTERVAL_VALUE = 1;

	/**
	 * The '<em><b>On Expire</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>On Expire</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ON_EXPIRE
	 * @model name="onExpire"
	 * @generated
	 * @ordered
	 */
	public static final int ON_EXPIRE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Refresh Mode Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RefreshModeEnum[] VALUES_ARRAY =
		new RefreshModeEnum[] {
			ON_CHANGE,
			ON_INTERVAL,
			ON_EXPIRE,
		};

	/**
	 * A public read-only list of all the '<em><b>Refresh Mode Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RefreshModeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Refresh Mode Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RefreshModeEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RefreshModeEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Refresh Mode Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RefreshModeEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RefreshModeEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Refresh Mode Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RefreshModeEnum get(int value) {
		switch (value) {
			case ON_CHANGE_VALUE: return ON_CHANGE;
			case ON_INTERVAL_VALUE: return ON_INTERVAL;
			case ON_EXPIRE_VALUE: return ON_EXPIRE;
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
	private RefreshModeEnum(int value, String name, String literal) {
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
	
} //RefreshModeEnum
