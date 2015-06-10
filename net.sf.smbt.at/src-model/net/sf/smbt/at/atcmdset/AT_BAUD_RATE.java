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
 * A representation of the literals of the enumeration '<em><b>AT BAUD RATE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.at.atcmdset.AtcmdsetPackage#getAT_BAUD_RATE()
 * @model
 * @generated
 */
public enum AT_BAUD_RATE implements Enumerator {
	/**
	 * The '<em><b>RATE 1200</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RATE_1200_VALUE
	 * @generated
	 * @ordered
	 */
	RATE_1200(0, "RATE_1200", "1200"),

	/**
	 * The '<em><b>RATE 2400</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RATE_2400_VALUE
	 * @generated
	 * @ordered
	 */
	RATE_2400(1, "RATE_2400", "2400"),

	/**
	 * The '<em><b>RATE 4800</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RATE_4800_VALUE
	 * @generated
	 * @ordered
	 */
	RATE_4800(2, "RATE_4800", "4800"),

	/**
	 * The '<em><b>RATE 9600</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RATE_9600_VALUE
	 * @generated
	 * @ordered
	 */
	RATE_9600(3, "RATE_9600", "9600"),

	/**
	 * The '<em><b>RATE 19200</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RATE_19200_VALUE
	 * @generated
	 * @ordered
	 */
	RATE_19200(4, "RATE_19200", "19200"),

	/**
	 * The '<em><b>RATE 38400</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RATE_38400_VALUE
	 * @generated
	 * @ordered
	 */
	RATE_38400(5, "RATE_38400", "38400"),

	/**
	 * The '<em><b>RATE 57600</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RATE_57600_VALUE
	 * @generated
	 * @ordered
	 */
	RATE_57600(6, "RATE_57600", "57600"),

	/**
	 * The '<em><b>RATE 115200</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RATE_115200_VALUE
	 * @generated
	 * @ordered
	 */
	RATE_115200(7, "RATE_115200", "115200");

	/**
	 * The '<em><b>RATE 1200</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RATE 1200</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RATE_1200
	 * @model literal="1200"
	 * @generated
	 * @ordered
	 */
	public static final int RATE_1200_VALUE = 0;

	/**
	 * The '<em><b>RATE 2400</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RATE 2400</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RATE_2400
	 * @model literal="2400"
	 * @generated
	 * @ordered
	 */
	public static final int RATE_2400_VALUE = 1;

	/**
	 * The '<em><b>RATE 4800</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RATE 4800</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RATE_4800
	 * @model literal="4800"
	 * @generated
	 * @ordered
	 */
	public static final int RATE_4800_VALUE = 2;

	/**
	 * The '<em><b>RATE 9600</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RATE 9600</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RATE_9600
	 * @model literal="9600"
	 * @generated
	 * @ordered
	 */
	public static final int RATE_9600_VALUE = 3;

	/**
	 * The '<em><b>RATE 19200</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RATE 19200</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RATE_19200
	 * @model literal="19200"
	 * @generated
	 * @ordered
	 */
	public static final int RATE_19200_VALUE = 4;

	/**
	 * The '<em><b>RATE 38400</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RATE 38400</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RATE_38400
	 * @model literal="38400"
	 * @generated
	 * @ordered
	 */
	public static final int RATE_38400_VALUE = 5;

	/**
	 * The '<em><b>RATE 57600</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RATE 57600</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RATE_57600
	 * @model literal="57600"
	 * @generated
	 * @ordered
	 */
	public static final int RATE_57600_VALUE = 6;

	/**
	 * The '<em><b>RATE 115200</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RATE 115200</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RATE_115200
	 * @model literal="115200"
	 * @generated
	 * @ordered
	 */
	public static final int RATE_115200_VALUE = 7;

	/**
	 * An array of all the '<em><b>AT BAUD RATE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AT_BAUD_RATE[] VALUES_ARRAY =
		new AT_BAUD_RATE[] {
			RATE_1200,
			RATE_2400,
			RATE_4800,
			RATE_9600,
			RATE_19200,
			RATE_38400,
			RATE_57600,
			RATE_115200,
		};

	/**
	 * A public read-only list of all the '<em><b>AT BAUD RATE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AT_BAUD_RATE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>AT BAUD RATE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AT_BAUD_RATE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AT_BAUD_RATE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>AT BAUD RATE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AT_BAUD_RATE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AT_BAUD_RATE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>AT BAUD RATE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AT_BAUD_RATE get(int value) {
		switch (value) {
			case RATE_1200_VALUE: return RATE_1200;
			case RATE_2400_VALUE: return RATE_2400;
			case RATE_4800_VALUE: return RATE_4800;
			case RATE_9600_VALUE: return RATE_9600;
			case RATE_19200_VALUE: return RATE_19200;
			case RATE_38400_VALUE: return RATE_38400;
			case RATE_57600_VALUE: return RATE_57600;
			case RATE_115200_VALUE: return RATE_115200;
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
	private AT_BAUD_RATE(int value, String name, String literal) {
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
	
} //AT_BAUD_RATE
