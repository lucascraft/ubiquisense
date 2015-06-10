/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.at.atcmdset;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>V34 COMMAND TYPES</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.at.atcmdset.AtcmdsetPackage#getV34_COMMAND_TYPES()
 * @model
 * @generated
 */
public enum V34_COMMAND_TYPES implements Enumerator {
	/**
	 * The '<em><b>AROBASE M</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AROBASE_M_VALUE
	 * @generated
	 * @ordered
	 */
	AROBASE_M(0, "AROBASE_M", "AROBASE_M"),

	/**
	 * The '<em><b>TWODOTS E</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWODOTS_E_VALUE
	 * @generated
	 * @ordered
	 */
	TWODOTS_E(1, "TWODOTS_E", "TWODOTS_E"),

	/**
	 * The '<em><b>PLUS MS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLUS_MS_VALUE
	 * @generated
	 * @ordered
	 */
	PLUS_MS(2, "PLUS_MS", "PLUS_MS");

	/**
	 * The '<em><b>AROBASE M</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AROBASE M</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AROBASE_M
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AROBASE_M_VALUE = 0;

	/**
	 * The '<em><b>TWODOTS E</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TWODOTS E</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TWODOTS_E
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TWODOTS_E_VALUE = 1;

	/**
	 * The '<em><b>PLUS MS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLUS MS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLUS_MS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PLUS_MS_VALUE = 2;

	/**
	 * An array of all the '<em><b>V34 COMMAND TYPES</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final V34_COMMAND_TYPES[] VALUES_ARRAY =
		new V34_COMMAND_TYPES[] {
			AROBASE_M,
			TWODOTS_E,
			PLUS_MS,
		};

	/**
	 * A public read-only list of all the '<em><b>V34 COMMAND TYPES</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<V34_COMMAND_TYPES> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>V34 COMMAND TYPES</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static V34_COMMAND_TYPES get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			V34_COMMAND_TYPES result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>V34 COMMAND TYPES</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static V34_COMMAND_TYPES getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			V34_COMMAND_TYPES result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>V34 COMMAND TYPES</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static V34_COMMAND_TYPES get(int value) {
		switch (value) {
			case AROBASE_M_VALUE: return AROBASE_M;
			case TWODOTS_E_VALUE: return TWODOTS_E;
			case PLUS_MS_VALUE: return PLUS_MS;
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
	private V34_COMMAND_TYPES(int value, String name, String literal) {
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
	
} //V34_COMMAND_TYPES
