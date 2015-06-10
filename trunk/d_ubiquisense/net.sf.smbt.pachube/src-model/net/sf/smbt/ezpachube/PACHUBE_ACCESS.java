/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezpachube;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>PACHUBE ACCESS</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezpachube.EzpachubePackage#getPACHUBE_ACCESS()
 * @model
 * @generated
 */
public enum PACHUBE_ACCESS implements Enumerator {
	/**
	 * The '<em><b>PACHUBE HTTP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACHUBE_HTTP_VALUE
	 * @generated
	 * @ordered
	 */
	PACHUBE_HTTP(0, "PACHUBE_HTTP", "PACHUBE_HTTP"),

	/**
	 * The '<em><b>PACHUBE RESTFULL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACHUBE_RESTFULL_VALUE
	 * @generated
	 * @ordered
	 */
	PACHUBE_RESTFULL(1, "PACHUBE_RESTFULL", "PACHUBE_RESTFULL"),

	/**
	 * The '<em><b>PACHUBE RSS FEED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACHUBE_RSS_FEED_VALUE
	 * @generated
	 * @ordered
	 */
	PACHUBE_RSS_FEED(2, "PACHUBE_RSS_FEED", "PACHUBE_RSS_FEED");

	/**
	 * The '<em><b>PACHUBE HTTP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PACHUBE HTTP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PACHUBE_HTTP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PACHUBE_HTTP_VALUE = 0;

	/**
	 * The '<em><b>PACHUBE RESTFULL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PACHUBE RESTFULL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PACHUBE_RESTFULL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PACHUBE_RESTFULL_VALUE = 1;

	/**
	 * The '<em><b>PACHUBE RSS FEED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PACHUBE RSS FEED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PACHUBE_RSS_FEED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PACHUBE_RSS_FEED_VALUE = 2;

	/**
	 * An array of all the '<em><b>PACHUBE ACCESS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PACHUBE_ACCESS[] VALUES_ARRAY =
		new PACHUBE_ACCESS[] {
			PACHUBE_HTTP,
			PACHUBE_RESTFULL,
			PACHUBE_RSS_FEED,
		};

	/**
	 * A public read-only list of all the '<em><b>PACHUBE ACCESS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PACHUBE_ACCESS> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>PACHUBE ACCESS</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PACHUBE_ACCESS get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PACHUBE_ACCESS result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PACHUBE ACCESS</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PACHUBE_ACCESS getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PACHUBE_ACCESS result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PACHUBE ACCESS</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PACHUBE_ACCESS get(int value) {
		switch (value) {
			case PACHUBE_HTTP_VALUE: return PACHUBE_HTTP;
			case PACHUBE_RESTFULL_VALUE: return PACHUBE_RESTFULL;
			case PACHUBE_RSS_FEED_VALUE: return PACHUBE_RSS_FEED;
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
	private PACHUBE_ACCESS(int value, String name, String literal) {
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
	
} //PACHUBE_ACCESS
