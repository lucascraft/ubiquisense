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
 * A representation of the literals of the enumeration '<em><b>FIRMATA I2C RW MODE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.protocol.ezfirmata.EzfirmataPackage#getFIRMATA_I2C_RW_MODE()
 * @model
 * @generated
 */
public enum FIRMATA_I2C_RW_MODE implements Enumerator {
	/**
	 * The '<em><b>WRITE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITE_VALUE
	 * @generated
	 * @ordered
	 */
	WRITE(0, "WRITE", "WRITE"), /**
	 * The '<em><b>READ ONCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_ONCE_VALUE
	 * @generated
	 * @ordered
	 */
	READ_ONCE(1, "READ_ONCE", "READ_ONCE"),

	/**
	 * The '<em><b>READ CONTINUOUSLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_CONTINUOUSLY_VALUE
	 * @generated
	 * @ordered
	 */
	READ_CONTINUOUSLY(2, "READ_CONTINUOUSLY", "READ_CONTINUOUSLY"),

	/**
	 * The '<em><b>STOP READING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_READING_VALUE
	 * @generated
	 * @ordered
	 */
	STOP_READING(3, "STOP_READING", "STOP_READING");

	/**
	 * The '<em><b>WRITE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WRITE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRITE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WRITE_VALUE = 0;

	/**
	 * The '<em><b>READ ONCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>READ ONCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_ONCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int READ_ONCE_VALUE = 1;

	/**
	 * The '<em><b>READ CONTINUOUSLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>READ CONTINUOUSLY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_CONTINUOUSLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int READ_CONTINUOUSLY_VALUE = 2;

	/**
	 * The '<em><b>STOP READING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STOP READING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STOP_READING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STOP_READING_VALUE = 3;

	/**
	 * An array of all the '<em><b>FIRMATA I2C RW MODE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FIRMATA_I2C_RW_MODE[] VALUES_ARRAY =
		new FIRMATA_I2C_RW_MODE[] {
			WRITE,
			READ_ONCE,
			READ_CONTINUOUSLY,
			STOP_READING,
		};

	/**
	 * A public read-only list of all the '<em><b>FIRMATA I2C RW MODE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FIRMATA_I2C_RW_MODE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>FIRMATA I2C RW MODE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FIRMATA_I2C_RW_MODE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FIRMATA_I2C_RW_MODE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FIRMATA I2C RW MODE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FIRMATA_I2C_RW_MODE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FIRMATA_I2C_RW_MODE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FIRMATA I2C RW MODE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FIRMATA_I2C_RW_MODE get(int value) {
		switch (value) {
			case WRITE_VALUE: return WRITE;
			case READ_ONCE_VALUE: return READ_ONCE;
			case READ_CONTINUOUSLY_VALUE: return READ_CONTINUOUSLY;
			case STOP_READING_VALUE: return STOP_READING;
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
	private FIRMATA_I2C_RW_MODE(int value, String name, String literal) {
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
	
} //FIRMATA_I2C_RW_MODE
