/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.ezdmxctrl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DM Xfixture Motion</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getDMXfixtureMotion()
 * @model
 * @generated
 */
public enum DMXfixtureMotion implements Enumerator {
	/**
	 * The '<em><b>CIRCLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIRCLE_VALUE
	 * @generated
	 * @ordered
	 */
	CIRCLE(0, "CIRCLE", "CIRCLE"),

	/**
	 * The '<em><b>EIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	EIGHT(1, "EIGHT", "EIGHT"),

	/**
	 * The '<em><b>LISSAJOUX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LISSAJOUX_VALUE
	 * @generated
	 * @ordered
	 */
	LISSAJOUX(2, "LISSAJOUX", "LISSAJOUX"),

	/**
	 * The '<em><b>STAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STAR_VALUE
	 * @generated
	 * @ordered
	 */
	STAR(3, "STAR", "STAR"),

	/**
	 * The '<em><b>RAMP UP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAMP_UP_VALUE
	 * @generated
	 * @ordered
	 */
	RAMP_UP(4, "RAMP_UP", "RAMP_UP"),

	/**
	 * The '<em><b>RAMP DOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAMP_DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	RAMP_DOWN(5, "RAMP_DOWN", "RAMP_DOWN");

	/**
	 * The '<em><b>CIRCLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CIRCLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CIRCLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CIRCLE_VALUE = 0;

	/**
	 * The '<em><b>EIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EIGHT_VALUE = 1;

	/**
	 * The '<em><b>LISSAJOUX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LISSAJOUX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LISSAJOUX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LISSAJOUX_VALUE = 2;

	/**
	 * The '<em><b>STAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STAR_VALUE = 3;

	/**
	 * The '<em><b>RAMP UP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RAMP UP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RAMP_UP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RAMP_UP_VALUE = 4;

	/**
	 * The '<em><b>RAMP DOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RAMP DOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RAMP_DOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RAMP_DOWN_VALUE = 5;

	/**
	 * An array of all the '<em><b>DM Xfixture Motion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DMXfixtureMotion[] VALUES_ARRAY =
		new DMXfixtureMotion[] {
			CIRCLE,
			EIGHT,
			LISSAJOUX,
			STAR,
			RAMP_UP,
			RAMP_DOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>DM Xfixture Motion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DMXfixtureMotion> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>DM Xfixture Motion</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DMXfixtureMotion get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DMXfixtureMotion result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DM Xfixture Motion</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DMXfixtureMotion getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DMXfixtureMotion result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DM Xfixture Motion</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DMXfixtureMotion get(int value) {
		switch (value) {
			case CIRCLE_VALUE: return CIRCLE;
			case EIGHT_VALUE: return EIGHT;
			case LISSAJOUX_VALUE: return LISSAJOUX;
			case STAR_VALUE: return STAR;
			case RAMP_UP_VALUE: return RAMP_UP;
			case RAMP_DOWN_VALUE: return RAMP_DOWN;
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
	private DMXfixtureMotion(int value, String name, String literal) {
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
	
} //DMXfixtureMotion
