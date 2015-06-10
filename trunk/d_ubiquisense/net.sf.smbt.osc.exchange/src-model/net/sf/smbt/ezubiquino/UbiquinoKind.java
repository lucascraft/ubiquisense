/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezubiquino;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ubiquino Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezubiquino.EzubiquinoPackage#getUbiquinoKind()
 * @model
 * @generated
 */
public enum UbiquinoKind implements Enumerator {
	/**
	 * The '<em><b>FIRMATA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRMATA_VALUE
	 * @generated
	 * @ordered
	 */
	FIRMATA(0, "FIRMATA", "FIRMATA"),

	/**
	 * The '<em><b>FIRMATA I2C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRMATA_I2C_VALUE
	 * @generated
	 * @ordered
	 */
	FIRMATA_I2C(1, "FIRMATA_I2C", "FIRMATA_I2C"),

	/**
	 * The '<em><b>FIRMATA SERVO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRMATA_SERVO_VALUE
	 * @generated
	 * @ordered
	 */
	FIRMATA_SERVO(2, "FIRMATA_SERVO", "FIRMATA_SERVO");

	/**
	 * The '<em><b>FIRMATA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FIRMATA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIRMATA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIRMATA_VALUE = 0;

	/**
	 * The '<em><b>FIRMATA I2C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FIRMATA I2C</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIRMATA_I2C
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIRMATA_I2C_VALUE = 1;

	/**
	 * The '<em><b>FIRMATA SERVO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FIRMATA SERVO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIRMATA_SERVO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIRMATA_SERVO_VALUE = 2;

	/**
	 * An array of all the '<em><b>Ubiquino Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UbiquinoKind[] VALUES_ARRAY =
		new UbiquinoKind[] {
			FIRMATA,
			FIRMATA_I2C,
			FIRMATA_SERVO,
		};

	/**
	 * A public read-only list of all the '<em><b>Ubiquino Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UbiquinoKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ubiquino Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UbiquinoKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UbiquinoKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ubiquino Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UbiquinoKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UbiquinoKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ubiquino Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UbiquinoKind get(int value) {
		switch (value) {
			case FIRMATA_VALUE: return FIRMATA;
			case FIRMATA_I2C_VALUE: return FIRMATA_I2C;
			case FIRMATA_SERVO_VALUE: return FIRMATA_SERVO;
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
	private UbiquinoKind(int value, String name, String literal) {
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
	
} //UbiquinoKind
