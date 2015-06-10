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
 * A representation of the literals of the enumeration '<em><b>CMD KIND</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.at.atcmdset.AtcmdsetPackage#getCMD_KIND()
 * @model
 * @generated
 */
public enum CMD_KIND implements Enumerator {
	/**
	 * The '<em><b>BD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BD_VALUE
	 * @generated
	 * @ordered
	 */
	BD(0, "BD", "BD"),

	/**
	 * The '<em><b>WR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WR_VALUE
	 * @generated
	 * @ordered
	 */
	WR(1, "WR", "WR"),

	/**
	 * The '<em><b>PP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PP_VALUE
	 * @generated
	 * @ordered
	 */
	PP(2, "PP", "PP"),

	/**
	 * The '<em><b>ID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_VALUE
	 * @generated
	 * @ordered
	 */
	ID(3, "ID", "ID"),

	/**
	 * The '<em><b>MY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MY_VALUE
	 * @generated
	 * @ordered
	 */
	MY(4, "MY", "MY"),

	/**
	 * The '<em><b>CN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CN_VALUE
	 * @generated
	 * @ordered
	 */
	CN(5, "CN", "CN"),

	/**
	 * The '<em><b>DL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DL_VALUE
	 * @generated
	 * @ordered
	 */
	DL(6, "DL", "DL");

	/**
	 * The '<em><b>BD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BD_VALUE = 0;

	/**
	 * The '<em><b>WR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WR_VALUE = 1;

	/**
	 * The '<em><b>PP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PP_VALUE = 2;

	/**
	 * The '<em><b>ID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ID_VALUE = 3;

	/**
	 * The '<em><b>MY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MY_VALUE = 4;

	/**
	 * The '<em><b>CN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CN_VALUE = 5;

	/**
	 * The '<em><b>DL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DL_VALUE = 6;

	/**
	 * An array of all the '<em><b>CMD KIND</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CMD_KIND[] VALUES_ARRAY =
		new CMD_KIND[] {
			BD,
			WR,
			PP,
			ID,
			MY,
			CN,
			DL,
		};

	/**
	 * A public read-only list of all the '<em><b>CMD KIND</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CMD_KIND> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CMD KIND</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CMD_KIND get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CMD_KIND result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CMD KIND</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CMD_KIND getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CMD_KIND result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CMD KIND</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CMD_KIND get(int value) {
		switch (value) {
			case BD_VALUE: return BD;
			case WR_VALUE: return WR;
			case PP_VALUE: return PP;
			case ID_VALUE: return ID;
			case MY_VALUE: return MY;
			case CN_VALUE: return CN;
			case DL_VALUE: return DL;
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
	private CMD_KIND(int value, String name, String literal) {
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
	
} //CMD_KIND
