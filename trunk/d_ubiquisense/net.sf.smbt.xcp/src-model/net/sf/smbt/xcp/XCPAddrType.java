/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xcp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>XCP Addr Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.xcp.XcpPackage#getXCPAddrType()
 * @model
 * @generated
 */
public enum XCPAddrType implements Enumerator {
	/**
	 * The '<em><b>XCP ADDR BLUETOOTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XCP_ADDR_BLUETOOTH_VALUE
	 * @generated
	 * @ordered
	 */
	XCP_ADDR_BLUETOOTH(0, "XCP_ADDR_BLUETOOTH", "BT"),

	/**
	 * The '<em><b>XCP ADDR UDP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XCP_ADDR_UDP_VALUE
	 * @generated
	 * @ordered
	 */
	XCP_ADDR_UDP(1, "XCP_ADDR_UDP", "UDP"), /**
	 * The '<em><b>XCP ADDR TCP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XCP_ADDR_TCP_VALUE
	 * @generated
	 * @ordered
	 */
	XCP_ADDR_TCP(2, "XCP_ADDR_TCP", "TCP"),

	/**
	 * The '<em><b>XCP ADDR USB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XCP_ADDR_USB_VALUE
	 * @generated
	 * @ordered
	 */
	XCP_ADDR_USB(3, "XCP_ADDR_USB", "USB"), /**
	 * The '<em><b>XCP ADDR HTTP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XCP_ADDR_HTTP_VALUE
	 * @generated
	 * @ordered
	 */
	XCP_ADDR_HTTP(4, "XCP_ADDR_HTTP", "XCP_ADDR_HTTP"), /**
	 * The '<em><b>XCP ADDR MIDI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XCP_ADDR_MIDI_VALUE
	 * @generated
	 * @ordered
	 */
	XCP_ADDR_MIDI(5, "XCP_ADDR_MIDI", "XCP_ADDR_MIDI"), /**
	 * The '<em><b>XCP ADDR XBEE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XCP_ADDR_XBEE_VALUE
	 * @generated
	 * @ordered
	 */
	XCP_ADDR_XBEE(6, "XCP_ADDR_XBEE", "XCP_ADDR_XBEE");

	/**
	 * The '<em><b>XCP ADDR BLUETOOTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XCP ADDR BLUETOOTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XCP_ADDR_BLUETOOTH
	 * @model literal="BT"
	 * @generated
	 * @ordered
	 */
	public static final int XCP_ADDR_BLUETOOTH_VALUE = 0;

	/**
	 * The '<em><b>XCP ADDR UDP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XCP ADDR UDP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XCP_ADDR_UDP
	 * @model literal="UDP"
	 * @generated
	 * @ordered
	 */
	public static final int XCP_ADDR_UDP_VALUE = 1;

	/**
	 * The '<em><b>XCP ADDR TCP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XCP ADDR TCP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XCP_ADDR_TCP
	 * @model literal="TCP"
	 * @generated
	 * @ordered
	 */
	public static final int XCP_ADDR_TCP_VALUE = 2;

	/**
	 * The '<em><b>XCP ADDR USB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XCP ADDR USB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XCP_ADDR_USB
	 * @model literal="USB"
	 * @generated
	 * @ordered
	 */
	public static final int XCP_ADDR_USB_VALUE = 3;

	/**
	 * The '<em><b>XCP ADDR HTTP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XCP ADDR HTTP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XCP_ADDR_HTTP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XCP_ADDR_HTTP_VALUE = 4;

	/**
	 * The '<em><b>XCP ADDR MIDI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XCP ADDR MIDI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XCP_ADDR_MIDI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XCP_ADDR_MIDI_VALUE = 5;

	/**
	 * The '<em><b>XCP ADDR XBEE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XCP ADDR XBEE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XCP_ADDR_XBEE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XCP_ADDR_XBEE_VALUE = 6;

	/**
	 * An array of all the '<em><b>XCP Addr Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final XCPAddrType[] VALUES_ARRAY =
		new XCPAddrType[] {
			XCP_ADDR_BLUETOOTH,
			XCP_ADDR_UDP,
			XCP_ADDR_TCP,
			XCP_ADDR_USB,
			XCP_ADDR_HTTP,
			XCP_ADDR_MIDI,
			XCP_ADDR_XBEE,
		};

	/**
	 * A public read-only list of all the '<em><b>XCP Addr Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<XCPAddrType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>XCP Addr Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XCPAddrType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			XCPAddrType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>XCP Addr Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XCPAddrType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			XCPAddrType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>XCP Addr Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XCPAddrType get(int value) {
		switch (value) {
			case XCP_ADDR_BLUETOOTH_VALUE: return XCP_ADDR_BLUETOOTH;
			case XCP_ADDR_UDP_VALUE: return XCP_ADDR_UDP;
			case XCP_ADDR_TCP_VALUE: return XCP_ADDR_TCP;
			case XCP_ADDR_USB_VALUE: return XCP_ADDR_USB;
			case XCP_ADDR_HTTP_VALUE: return XCP_ADDR_HTTP;
			case XCP_ADDR_MIDI_VALUE: return XCP_ADDR_MIDI;
			case XCP_ADDR_XBEE_VALUE: return XCP_ADDR_XBEE;
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
	private XCPAddrType(int value, String name, String literal) {
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
	
} //XCPAddrType
