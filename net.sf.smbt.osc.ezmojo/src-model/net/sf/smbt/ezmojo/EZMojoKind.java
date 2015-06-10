/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmojo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EZ Mojo Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZMojoKind()
 * @model
 * @generated
 */
public enum EZMojoKind implements Enumerator {
	/**
	 * The '<em><b>GET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET_VALUE
	 * @generated
	 * @ordered
	 */
	GET(0, "GET", ":"),

	/**
	 * The '<em><b>SET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_VALUE
	 * @generated
	 * @ordered
	 */
	SET(1, "SET", "+"),

	/**
	 * The '<em><b>LISTEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LISTEN_VALUE
	 * @generated
	 * @ordered
	 */
	LISTEN(2, "LISTEN", "!"), /**
	 * The '<em><b>UNSET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSET_VALUE
	 * @generated
	 * @ordered
	 */
	UNSET(3, "UNSET", "-"), /**
	 * The '<em><b>SERVICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE(4, "SERVICE", "$"), /**
	 * The '<em><b>QUERY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUERY_VALUE
	 * @generated
	 * @ordered
	 */
	QUERY(5, "QUERY", "?"), /**
	 * The '<em><b>UNLISTEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNLISTEN_VALUE
	 * @generated
	 * @ordered
	 */
	UNLISTEN(6, "UNLISTEN", "#"), /**
	 * The '<em><b>BIND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIND_VALUE
	 * @generated
	 * @ordered
	 */
	BIND(7, "BIND", "="), /**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(8, "NONE", "NONE"), /**
	 * The '<em><b>FORWARD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORWARD_VALUE
	 * @generated
	 * @ordered
	 */
	FORWARD(9, "FORWARD", ">"), /**
	 * The '<em><b>UNFORWARD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNFORWARD_VALUE
	 * @generated
	 * @ordered
	 */
	UNFORWARD(10, "UNFORWARD", "<"), /**
	 * The '<em><b>LEGACY SET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGACY_SET_VALUE
	 * @generated
	 * @ordered
	 */
	LEGACY_SET(11, "LEGACY_SET", "/"), /**
	 * The '<em><b>SELECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECT_VALUE
	 * @generated
	 * @ordered
	 */
	SELECT(12, "SELECT", "."), /**
	 * The '<em><b>TRIGGER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIGGER_VALUE
	 * @generated
	 * @ordered
	 */
	TRIGGER(13, "TRIGGER", "T"), /**
	 * The '<em><b>KINEMATICS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KINEMATICS_VALUE
	 * @generated
	 * @ordered
	 */
	KINEMATICS(14, "KINEMATICS", "k"), /**
	 * The '<em><b>COMMAND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMAND_VALUE
	 * @generated
	 * @ordered
	 */
	COMMAND(15, "COMMAND", "%"), /**
	 * The '<em><b>INFO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFO_VALUE
	 * @generated
	 * @ordered
	 */
	INFO(16, "INFO", "_"), /**
	 * The '<em><b>CLOCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOCK_VALUE
	 * @generated
	 * @ordered
	 */
	CLOCK(17, "CLOCK", "&"), /**
	 * The '<em><b>FUNCTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTION(18, "FUNCTION", "("), /**
	 * The '<em><b>BANG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BANG_VALUE
	 * @generated
	 * @ordered
	 */
	BANG(19, "BANG", "@"), /**
	 * The '<em><b>TOGGLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOGGLE_VALUE
	 * @generated
	 * @ordered
	 */
	TOGGLE(20, "TOGGLE", ")"), /**
	 * The '<em><b>MAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAP_VALUE
	 * @generated
	 * @ordered
	 */
	MAP(21, "MAP", "m"), /**
	 * The '<em><b>UNMAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNMAP_VALUE
	 * @generated
	 * @ordered
	 */
	UNMAP(22, "UNMAP", "u"), /**
	 * The '<em><b>MNEMONIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MNEMONIC_VALUE
	 * @generated
	 * @ordered
	 */
	MNEMONIC(23, "MNEMONIC", "r"), /**
	 * The '<em><b>PLAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAY_VALUE
	 * @generated
	 * @ordered
	 */
	PLAY(24, "PLAY", "p");

	/**
	 * The '<em><b>GET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GET
	 * @model literal=":"
	 * @generated
	 * @ordered
	 */
	public static final int GET_VALUE = 0;

	/**
	 * The '<em><b>SET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SET
	 * @model literal="+"
	 * @generated
	 * @ordered
	 */
	public static final int SET_VALUE = 1;

	/**
	 * The '<em><b>LISTEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LISTEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LISTEN
	 * @model literal="!"
	 * @generated
	 * @ordered
	 */
	public static final int LISTEN_VALUE = 2;

	/**
	 * The '<em><b>UNSET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNSET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSET
	 * @model literal="-"
	 * @generated
	 * @ordered
	 */
	public static final int UNSET_VALUE = 3;

	/**
	 * The '<em><b>SERVICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SERVICE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVICE
	 * @model literal="$"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_VALUE = 4;

	/**
	 * The '<em><b>QUERY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>QUERY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUERY
	 * @model literal="?"
	 * @generated
	 * @ordered
	 */
	public static final int QUERY_VALUE = 5;

	/**
	 * The '<em><b>UNLISTEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNLISTEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNLISTEN
	 * @model literal="#"
	 * @generated
	 * @ordered
	 */
	public static final int UNLISTEN_VALUE = 6;

	/**
	 * The '<em><b>BIND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BIND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIND
	 * @model literal="="
	 * @generated
	 * @ordered
	 */
	public static final int BIND_VALUE = 7;

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 8;

	/**
	 * The '<em><b>FORWARD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FORWARD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FORWARD
	 * @model literal=">"
	 * @generated
	 * @ordered
	 */
	public static final int FORWARD_VALUE = 9;

	/**
	 * The '<em><b>UNFORWARD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNFORWARD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNFORWARD
	 * @model literal="<"
	 * @generated
	 * @ordered
	 */
	public static final int UNFORWARD_VALUE = 10;

	/**
	 * The '<em><b>LEGACY SET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LEGACY SET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEGACY_SET
	 * @model literal="/"
	 * @generated
	 * @ordered
	 */
	public static final int LEGACY_SET_VALUE = 11;

	/**
	 * The '<em><b>SELECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SELECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SELECT
	 * @model literal="."
	 * @generated
	 * @ordered
	 */
	public static final int SELECT_VALUE = 12;

	/**
	 * The '<em><b>TRIGGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRIGGER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRIGGER
	 * @model literal="T"
	 * @generated
	 * @ordered
	 */
	public static final int TRIGGER_VALUE = 13;

	/**
	 * The '<em><b>KINEMATICS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KINEMATICS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KINEMATICS
	 * @model literal="k"
	 * @generated
	 * @ordered
	 */
	public static final int KINEMATICS_VALUE = 14;

	/**
	 * The '<em><b>COMMAND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMMAND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMMAND
	 * @model literal="%"
	 * @generated
	 * @ordered
	 */
	public static final int COMMAND_VALUE = 15;

	/**
	 * The '<em><b>INFO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INFO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFO
	 * @model literal="_"
	 * @generated
	 * @ordered
	 */
	public static final int INFO_VALUE = 16;

	/**
	 * The '<em><b>CLOCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLOCK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLOCK
	 * @model literal="&"
	 * @generated
	 * @ordered
	 */
	public static final int CLOCK_VALUE = 17;

	/**
	 * The '<em><b>FUNCTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FUNCTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNCTION
	 * @model literal="("
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTION_VALUE = 18;

	/**
	 * The '<em><b>BANG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BANG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BANG
	 * @model literal="@"
	 * @generated
	 * @ordered
	 */
	public static final int BANG_VALUE = 19;

	/**
	 * The '<em><b>TOGGLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOGGLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOGGLE
	 * @model literal=")"
	 * @generated
	 * @ordered
	 */
	public static final int TOGGLE_VALUE = 20;

	/**
	 * The '<em><b>MAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MAP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAP
	 * @model literal="m"
	 * @generated
	 * @ordered
	 */
	public static final int MAP_VALUE = 21;

	/**
	 * The '<em><b>UNMAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNMAP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNMAP
	 * @model literal="u"
	 * @generated
	 * @ordered
	 */
	public static final int UNMAP_VALUE = 22;

	/**
	 * The '<em><b>MNEMONIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MNEMONIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MNEMONIC
	 * @model literal="r"
	 * @generated
	 * @ordered
	 */
	public static final int MNEMONIC_VALUE = 23;

	/**
	 * The '<em><b>PLAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLAY
	 * @model literal="p"
	 * @generated
	 * @ordered
	 */
	public static final int PLAY_VALUE = 24;

	/**
	 * An array of all the '<em><b>EZ Mojo Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EZMojoKind[] VALUES_ARRAY =
		new EZMojoKind[] {
			GET,
			SET,
			LISTEN,
			UNSET,
			SERVICE,
			QUERY,
			UNLISTEN,
			BIND,
			NONE,
			FORWARD,
			UNFORWARD,
			LEGACY_SET,
			SELECT,
			TRIGGER,
			KINEMATICS,
			COMMAND,
			INFO,
			CLOCK,
			FUNCTION,
			BANG,
			TOGGLE,
			MAP,
			UNMAP,
			MNEMONIC,
			PLAY,
		};

	/**
	 * A public read-only list of all the '<em><b>EZ Mojo Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EZMojoKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EZ Mojo Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EZMojoKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EZMojoKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EZ Mojo Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EZMojoKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EZMojoKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EZ Mojo Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EZMojoKind get(int value) {
		switch (value) {
			case GET_VALUE: return GET;
			case SET_VALUE: return SET;
			case LISTEN_VALUE: return LISTEN;
			case UNSET_VALUE: return UNSET;
			case SERVICE_VALUE: return SERVICE;
			case QUERY_VALUE: return QUERY;
			case UNLISTEN_VALUE: return UNLISTEN;
			case BIND_VALUE: return BIND;
			case NONE_VALUE: return NONE;
			case FORWARD_VALUE: return FORWARD;
			case UNFORWARD_VALUE: return UNFORWARD;
			case LEGACY_SET_VALUE: return LEGACY_SET;
			case SELECT_VALUE: return SELECT;
			case TRIGGER_VALUE: return TRIGGER;
			case KINEMATICS_VALUE: return KINEMATICS;
			case COMMAND_VALUE: return COMMAND;
			case INFO_VALUE: return INFO;
			case CLOCK_VALUE: return CLOCK;
			case FUNCTION_VALUE: return FUNCTION;
			case BANG_VALUE: return BANG;
			case TOGGLE_VALUE: return TOGGLE;
			case MAP_VALUE: return MAP;
			case UNMAP_VALUE: return UNMAP;
			case MNEMONIC_VALUE: return MNEMONIC;
			case PLAY_VALUE: return PLAY;
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
	private EZMojoKind(int value, String name, String literal) {
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
	
} //EZMojoKind
