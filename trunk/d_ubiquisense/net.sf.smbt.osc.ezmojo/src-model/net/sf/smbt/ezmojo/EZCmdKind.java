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
 * A representation of the literals of the enumeration '<em><b>EZ Cmd Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezmojo.EzmojoPackage#getEZCmdKind()
 * @model
 * @generated
 */
public enum EZCmdKind implements Enumerator {
	/**
	 * The '<em><b>LIST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIST_VALUE
	 * @generated
	 * @ordered
	 */
	LIST(0, "LIST", "%list"),

	/**
	 * The '<em><b>RESET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESET_VALUE
	 * @generated
	 * @ordered
	 */
	RESET(1, "RESET", "%reset"),

	/**
	 * The '<em><b>CLOSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSE_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSE(2, "CLOSE", "%close"),

	/**
	 * The '<em><b>STATUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATUS_VALUE
	 * @generated
	 * @ordered
	 */
	STATUS(3, "STATUS", "%status"),

	/**
	 * The '<em><b>BIND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIND_VALUE
	 * @generated
	 * @ordered
	 */
	BIND(4, "BIND", "%bind"),

	/**
	 * The '<em><b>DEPLOY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPLOY_VALUE
	 * @generated
	 * @ordered
	 */
	DEPLOY(5, "DEPLOY", "%deploy"),

	/**
	 * The '<em><b>REMOVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVE_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVE(6, "REMOVE", "%remove"), /**
	 * The '<em><b>WTF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WTF_VALUE
	 * @generated
	 * @ordered
	 */
	WTF(8, "WTF", "%wtf"), /**
	 * The '<em><b>HELP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HELP_VALUE
	 * @generated
	 * @ordered
	 */
	HELP(7, "HELP", "%help"), /**
	 * The '<em><b>PROTOCOL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROTOCOL_VALUE
	 * @generated
	 * @ordered
	 */
	PROTOCOL(9, "PROTOCOL", "%protocol"), /**
	 * The '<em><b>ALIAS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALIAS_VALUE
	 * @generated
	 * @ordered
	 */
	ALIAS(10, "ALIAS", "%alias"), /**
	 * The '<em><b>CLEAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLEAR_VALUE
	 * @generated
	 * @ordered
	 */
	CLEAR(11, "CLEAR", "%clear"), /**
	 * The '<em><b>FEEDBACK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEEDBACK_VALUE
	 * @generated
	 * @ordered
	 */
	FEEDBACK(12, "FEEDBACK", "%feedback"), /**
	 * The '<em><b>HOOK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOOK_VALUE
	 * @generated
	 * @ordered
	 */
	HOOK(13, "HOOK", "%hook"), /**
	 * The '<em><b>UNHOOK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNHOOK_VALUE
	 * @generated
	 * @ordered
	 */
	UNHOOK(14, "UNHOOK", "%unhook"), /**
	 * The '<em><b>SAVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAVE_VALUE
	 * @generated
	 * @ordered
	 */
	SAVE(15, "SAVE", "SAVE"), /**
	 * The '<em><b>LOAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOAD_VALUE
	 * @generated
	 * @ordered
	 */
	LOAD(16, "LOAD", "LOAD"), /**
	 * The '<em><b>OK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OK_VALUE
	 * @generated
	 * @ordered
	 */
	OK(17, "OK", "OK"), /**
	 * The '<em><b>ERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR(18, "ERROR", "ERROR");

	/**
	 * The '<em><b>LIST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LIST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIST
	 * @model literal="%list"
	 * @generated
	 * @ordered
	 */
	public static final int LIST_VALUE = 0;

	/**
	 * The '<em><b>RESET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESET
	 * @model literal="%reset"
	 * @generated
	 * @ordered
	 */
	public static final int RESET_VALUE = 1;

	/**
	 * The '<em><b>CLOSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLOSE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLOSE
	 * @model literal="%close"
	 * @generated
	 * @ordered
	 */
	public static final int CLOSE_VALUE = 2;

	/**
	 * The '<em><b>STATUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STATUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STATUS
	 * @model literal="%status"
	 * @generated
	 * @ordered
	 */
	public static final int STATUS_VALUE = 3;

	/**
	 * The '<em><b>BIND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BIND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIND
	 * @model literal="%bind"
	 * @generated
	 * @ordered
	 */
	public static final int BIND_VALUE = 4;

	/**
	 * The '<em><b>DEPLOY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEPLOY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPLOY
	 * @model literal="%deploy"
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOY_VALUE = 5;

	/**
	 * The '<em><b>REMOVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REMOVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REMOVE
	 * @model literal="%remove"
	 * @generated
	 * @ordered
	 */
	public static final int REMOVE_VALUE = 6;

	/**
	 * The '<em><b>WTF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WTF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WTF
	 * @model literal="%wtf"
	 * @generated
	 * @ordered
	 */
	public static final int WTF_VALUE = 8;

	/**
	 * The '<em><b>HELP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HELP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HELP
	 * @model literal="%help"
	 * @generated
	 * @ordered
	 */
	public static final int HELP_VALUE = 7;

	/**
	 * The '<em><b>PROTOCOL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROTOCOL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROTOCOL
	 * @model literal="%protocol"
	 * @generated
	 * @ordered
	 */
	public static final int PROTOCOL_VALUE = 9;

	/**
	 * The '<em><b>ALIAS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALIAS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALIAS
	 * @model literal="%alias"
	 * @generated
	 * @ordered
	 */
	public static final int ALIAS_VALUE = 10;

	/**
	 * The '<em><b>CLEAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLEAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLEAR
	 * @model literal="%clear"
	 * @generated
	 * @ordered
	 */
	public static final int CLEAR_VALUE = 11;

	/**
	 * The '<em><b>FEEDBACK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FEEDBACK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FEEDBACK
	 * @model literal="%feedback"
	 * @generated
	 * @ordered
	 */
	public static final int FEEDBACK_VALUE = 12;

	/**
	 * The '<em><b>HOOK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HOOK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOOK
	 * @model literal="%hook"
	 * @generated
	 * @ordered
	 */
	public static final int HOOK_VALUE = 13;

	/**
	 * The '<em><b>UNHOOK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNHOOK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNHOOK
	 * @model literal="%unhook"
	 * @generated
	 * @ordered
	 */
	public static final int UNHOOK_VALUE = 14;

	/**
	 * The '<em><b>SAVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SAVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAVE_VALUE = 15;

	/**
	 * The '<em><b>LOAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOAD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOAD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_VALUE = 16;

	/**
	 * The '<em><b>OK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OK_VALUE = 17;

	/**
	 * The '<em><b>ERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_VALUE = 18;

	/**
	 * An array of all the '<em><b>EZ Cmd Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EZCmdKind[] VALUES_ARRAY =
		new EZCmdKind[] {
			LIST,
			RESET,
			CLOSE,
			STATUS,
			BIND,
			DEPLOY,
			REMOVE,
			WTF,
			HELP,
			PROTOCOL,
			ALIAS,
			CLEAR,
			FEEDBACK,
			HOOK,
			UNHOOK,
			SAVE,
			LOAD,
			OK,
			ERROR,
		};

	/**
	 * A public read-only list of all the '<em><b>EZ Cmd Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EZCmdKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EZ Cmd Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EZCmdKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EZCmdKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EZ Cmd Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EZCmdKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EZCmdKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EZ Cmd Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EZCmdKind get(int value) {
		switch (value) {
			case LIST_VALUE: return LIST;
			case RESET_VALUE: return RESET;
			case CLOSE_VALUE: return CLOSE;
			case STATUS_VALUE: return STATUS;
			case BIND_VALUE: return BIND;
			case DEPLOY_VALUE: return DEPLOY;
			case REMOVE_VALUE: return REMOVE;
			case WTF_VALUE: return WTF;
			case HELP_VALUE: return HELP;
			case PROTOCOL_VALUE: return PROTOCOL;
			case ALIAS_VALUE: return ALIAS;
			case CLEAR_VALUE: return CLEAR;
			case FEEDBACK_VALUE: return FEEDBACK;
			case HOOK_VALUE: return HOOK;
			case UNHOOK_VALUE: return UNHOOK;
			case SAVE_VALUE: return SAVE;
			case LOAD_VALUE: return LOAD;
			case OK_VALUE: return OK;
			case ERROR_VALUE: return ERROR;
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
	private EZCmdKind(int value, String name, String literal) {
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
	
} //EZCmdKind
