/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.thingmcfg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Thing MDevice</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.thingmcfg.ThingmcfgPackage#getThingMDevice()
 * @model
 * @generated
 */
public enum ThingMDevice implements Enumerator {
	/**
	 * The '<em><b>BLINK M</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLINK_M_VALUE
	 * @generated
	 * @ordered
	 */
	BLINK_M(0, "BLINK_M", "BLINK_M"),

	/**
	 * The '<em><b>MAX M</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_M_VALUE
	 * @generated
	 * @ordered
	 */
	MAX_M(1, "MAX_M", "MAX_M"),

	/**
	 * The '<em><b>MINI M</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINI_M_VALUE
	 * @generated
	 * @ordered
	 */
	MINI_M(2, "MINI_M", "MINI_M"),

	/**
	 * The '<em><b>CONTROL M</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROL_M_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROL_M(3, "CONTROL_M", "CONTROL_M"),

	/**
	 * The '<em><b>REMOTE M</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOTE_M_VALUE
	 * @generated
	 * @ordered
	 */
	REMOTE_M(4, "REMOTE_M", "REMOTE_M");

	/**
	 * The '<em><b>BLINK M</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BLINK M</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLINK_M
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BLINK_M_VALUE = 0;

	/**
	 * The '<em><b>MAX M</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MAX M</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAX_M
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAX_M_VALUE = 1;

	/**
	 * The '<em><b>MINI M</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MINI M</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MINI_M
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MINI_M_VALUE = 2;

	/**
	 * The '<em><b>CONTROL M</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONTROL M</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTROL_M
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_M_VALUE = 3;

	/**
	 * The '<em><b>REMOTE M</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REMOTE M</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOTE_M
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REMOTE_M_VALUE = 4;

	/**
	 * An array of all the '<em><b>Thing MDevice</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ThingMDevice[] VALUES_ARRAY =
		new ThingMDevice[] {
			BLINK_M,
			MAX_M,
			MINI_M,
			CONTROL_M,
			REMOTE_M,
		};

	/**
	 * A public read-only list of all the '<em><b>Thing MDevice</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ThingMDevice> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Thing MDevice</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ThingMDevice get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ThingMDevice result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Thing MDevice</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ThingMDevice getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ThingMDevice result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Thing MDevice</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ThingMDevice get(int value) {
		switch (value) {
			case BLINK_M_VALUE: return BLINK_M;
			case MAX_M_VALUE: return MAX_M;
			case MINI_M_VALUE: return MINI_M;
			case CONTROL_M_VALUE: return CONTROL_M;
			case REMOTE_M_VALUE: return REMOTE_M;
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
	private ThingMDevice(int value, String name, String literal) {
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
	
} //ThingMDevice
