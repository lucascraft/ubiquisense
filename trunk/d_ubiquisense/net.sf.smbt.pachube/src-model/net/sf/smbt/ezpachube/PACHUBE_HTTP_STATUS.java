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
 * A representation of the literals of the enumeration '<em><b>PACHUBE HTTP STATUS</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezpachube.EzpachubePackage#getPACHUBE_HTTP_STATUS()
 * @model
 * @generated
 */
public enum PACHUBE_HTTP_STATUS implements Enumerator {
	/**
	 * The '<em><b>STATUS 200</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATUS_200_VALUE
	 * @generated
	 * @ordered
	 */
	STATUS_200(200, "STATUS_200", "OK: request processed successfully"),

	/**
	 * The '<em><b>STATUS 401</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATUS_401_VALUE
	 * @generated
	 * @ordered
	 */
	STATUS_401(1, "STATUS_401", "Not Authorized: either you need to provide authentication credentials, or the credentials provided aren\'t valid."),

	/**
	 * The '<em><b>STATUS 403</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATUS_403_VALUE
	 * @generated
	 * @ordered
	 */
	STATUS_403(403, "STATUS_403", "Forbidden: Pachube understands your request, but refuses to fulfill it. An accompanying error message should explain why."),

	/**
	 * The '<em><b>STATUS 404</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATUS_404_VALUE
	 * @generated
	 * @ordered
	 */
	STATUS_404(404, "STATUS_404", "Not Found: either you\'re requesting an invalid URI or the resource in question doesn\'t exist (eg. no such feed).");

	/**
	 * The '<em><b>STATUS 200</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STATUS 200</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STATUS_200
	 * @model literal="OK: request processed successfully"
	 * @generated
	 * @ordered
	 */
	public static final int STATUS_200_VALUE = 200;

	/**
	 * The '<em><b>STATUS 401</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STATUS 401</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STATUS_401
	 * @model literal="Not Authorized: either you need to provide authentication credentials, or the credentials provided aren\'t valid."
	 * @generated
	 * @ordered
	 */
	public static final int STATUS_401_VALUE = 1;

	/**
	 * The '<em><b>STATUS 403</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STATUS 403</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STATUS_403
	 * @model literal="Forbidden: Pachube understands your request, but refuses to fulfill it. An accompanying error message should explain why."
	 * @generated
	 * @ordered
	 */
	public static final int STATUS_403_VALUE = 403;

	/**
	 * The '<em><b>STATUS 404</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STATUS 404</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STATUS_404
	 * @model literal="Not Found: either you\'re requesting an invalid URI or the resource in question doesn\'t exist (eg. no such feed)."
	 * @generated
	 * @ordered
	 */
	public static final int STATUS_404_VALUE = 404;

	/**
	 * An array of all the '<em><b>PACHUBE HTTP STATUS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PACHUBE_HTTP_STATUS[] VALUES_ARRAY =
		new PACHUBE_HTTP_STATUS[] {
			STATUS_200,
			STATUS_401,
			STATUS_403,
			STATUS_404,
		};

	/**
	 * A public read-only list of all the '<em><b>PACHUBE HTTP STATUS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PACHUBE_HTTP_STATUS> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>PACHUBE HTTP STATUS</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PACHUBE_HTTP_STATUS get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PACHUBE_HTTP_STATUS result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PACHUBE HTTP STATUS</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PACHUBE_HTTP_STATUS getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PACHUBE_HTTP_STATUS result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PACHUBE HTTP STATUS</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PACHUBE_HTTP_STATUS get(int value) {
		switch (value) {
			case STATUS_200_VALUE: return STATUS_200;
			case STATUS_401_VALUE: return STATUS_401;
			case STATUS_403_VALUE: return STATUS_403;
			case STATUS_404_VALUE: return STATUS_404;
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
	private PACHUBE_HTTP_STATUS(int value, String name, String literal) {
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
	
} //PACHUBE_HTTP_STATUS
