/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.protocol.ezfirmata;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>FIRMATA I2C ADDR MODE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.protocol.ezfirmata.EzfirmataPackage#getFIRMATA_I2C_ADDR_MODE()
 * @model
 * @generated
 */
public enum FIRMATA_I2C_ADDR_MODE implements Enumerator {
	/**
	 * The '<em><b>I2C ADDR MODE 7BITS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #I2C_ADDR_MODE_7BITS_VALUE
	 * @generated
	 * @ordered
	 */
	I2C_ADDR_MODE_7BITS(0, "I2C_ADDR_MODE_7_BITS", "I2C_ADDR_MODE_7_BITS"),

	/**
	 * The '<em><b>I2C ADDR MODE 10 BITS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #I2C_ADDR_MODE_10_BITS_VALUE
	 * @generated
	 * @ordered
	 */
	I2C_ADDR_MODE_10_BITS(1, "I2C_ADDR_MODE_10_BITS", "I2C_ADDR_MODE_10_BITS");

	/**
	 * The '<em><b>I2C ADDR MODE 7BITS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>I2C ADDR MODE 7BITS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #I2C_ADDR_MODE_7BITS
	 * @model name="I2C_ADDR_MODE_7_BITS"
	 * @generated
	 * @ordered
	 */
	public static final int I2C_ADDR_MODE_7BITS_VALUE = 0;

	/**
	 * The '<em><b>I2C ADDR MODE 10 BITS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>I2C ADDR MODE 10 BITS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #I2C_ADDR_MODE_10_BITS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int I2C_ADDR_MODE_10_BITS_VALUE = 1;

	/**
	 * An array of all the '<em><b>FIRMATA I2C ADDR MODE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FIRMATA_I2C_ADDR_MODE[] VALUES_ARRAY =
		new FIRMATA_I2C_ADDR_MODE[] {
			I2C_ADDR_MODE_7BITS,
			I2C_ADDR_MODE_10_BITS,
		};

	/**
	 * A public read-only list of all the '<em><b>FIRMATA I2C ADDR MODE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FIRMATA_I2C_ADDR_MODE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>FIRMATA I2C ADDR MODE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FIRMATA_I2C_ADDR_MODE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FIRMATA_I2C_ADDR_MODE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FIRMATA I2C ADDR MODE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FIRMATA_I2C_ADDR_MODE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FIRMATA_I2C_ADDR_MODE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FIRMATA I2C ADDR MODE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FIRMATA_I2C_ADDR_MODE get(int value) {
		switch (value) {
			case I2C_ADDR_MODE_7BITS_VALUE: return I2C_ADDR_MODE_7BITS;
			case I2C_ADDR_MODE_10_BITS_VALUE: return I2C_ADDR_MODE_10_BITS;
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
	private FIRMATA_I2C_ADDR_MODE(int value, String name, String literal) {
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
	
} //FIRMATA_I2C_ADDR_MODE
