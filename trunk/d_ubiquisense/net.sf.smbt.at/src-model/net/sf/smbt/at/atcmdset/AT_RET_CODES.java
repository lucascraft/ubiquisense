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
 * A representation of the literals of the enumeration '<em><b>AT RET CODES</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.at.atcmdset.AtcmdsetPackage#getAT_RET_CODES()
 * @model
 * @generated
 */
public enum AT_RET_CODES implements Enumerator {
	/**
	 * The '<em><b>OK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OK_VALUE
	 * @generated
	 * @ordered
	 */
	OK(0, "OK", "OK"),

	/**
	 * The '<em><b>RING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RING_VALUE
	 * @generated
	 * @ordered
	 */
	RING(1, "RING", "RING"),

	/**
	 * The '<em><b>NO CARRIER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_CARRIER_VALUE
	 * @generated
	 * @ordered
	 */
	NO_CARRIER(2, "NO_CARRIER", "NO_CARRIER"),

	/**
	 * The '<em><b>ERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR(3, "ERROR", "ERROR"),

	/**
	 * The '<em><b>CONNECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECT_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECT(4, "CONNECT", "CONNECT"),

	/**
	 * The '<em><b>NO DIALTONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_DIALTONE_VALUE
	 * @generated
	 * @ordered
	 */
	NO_DIALTONE(5, "NO_DIALTONE", "NO_DIALTONE"),

	/**
	 * The '<em><b>BUSY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUSY_VALUE
	 * @generated
	 * @ordered
	 */
	BUSY(6, "BUSY", "BUSY"),

	/**
	 * The '<em><b>NO ANSWER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_ANSWER_VALUE
	 * @generated
	 * @ordered
	 */
	NO_ANSWER(7, "NO_ANSWER", "NO_ANSWER"),

	/**
	 * The '<em><b>CONNECT O600</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECT_O600_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECT_O600(8, "CONNECT_O600", "CONNECT_O600"),

	/**
	 * The '<em><b>CONNECT 2400</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECT_2400_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECT_2400(9, "CONNECT_2400", "CONNECT_2400"),

	/**
	 * The '<em><b>CONNECT 4800</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECT_4800_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECT_4800(10, "CONNECT_4800", "CONNECT_4800"),

	/**
	 * The '<em><b>CONNECT 9600</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECT_9600_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECT_9600(11, "CONNECT_9600", "CONNECT_9600"),

	/**
	 * The '<em><b>CONNECT 7200</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECT_7200_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECT_7200(12, "CONNECT_7200", "CONNECT_7200"),

	/**
	 * The '<em><b>CONNECT 12000</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECT_12000_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECT_12000(13, "CONNECT_12000", "CONNECT_12000"),

	/**
	 * The '<em><b>CONNECT 14400</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECT_14400_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECT_14400(14, "CONNECT_14400", "CONNECT_14400"),

	/**
	 * The '<em><b>CONNECT 19200</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECT_19200_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECT_19200(15, "CONNECT_19200", "CONNECT_19200"),

	/**
	 * The '<em><b>CONNECT 38400</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECT_38400_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECT_38400(16, "CONNECT_38400", "CONNECT_38400"),

	/**
	 * The '<em><b>CONNECT 57600</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECT_57600_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECT_57600(17, "CONNECT_57600", "CONNECT_57600"),

	/**
	 * The '<em><b>CONNECT 115200</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECT_115200_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECT_115200(18, "CONNECT_115200", "CONNECT_115200"),

	/**
	 * The '<em><b>CONNECT 75TX 1200RX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECT_75TX_1200RX_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECT_75TX_1200RX(19, "CONNECT_75TX_1200RX", "CONNECT_75TX_1200RX"),

	/**
	 * The '<em><b>CONNECT 1200TX 75RX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECT_1200TX_75RX_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECT_1200TX_75RX(20, "CONNECT_1200TX_75RX", "CONNECT_1200TX_75RX"),

	/**
	 * The '<em><b>DELAYED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELAYED_VALUE
	 * @generated
	 * @ordered
	 */
	DELAYED(21, "DELAYED", "DELAYED"),

	/**
	 * The '<em><b>BLACKLISTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLACKLISTED_VALUE
	 * @generated
	 * @ordered
	 */
	BLACKLISTED(22, "BLACKLISTED", "BLACKLISTED"),

	/**
	 * The '<em><b>FAX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAX_VALUE
	 * @generated
	 * @ordered
	 */
	FAX(23, "FAX", "FAX"),

	/**
	 * The '<em><b>DATA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_VALUE
	 * @generated
	 * @ordered
	 */
	DATA(24, "DATA", "DATA"),

	/**
	 * The '<em><b>CARRIER 300</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARRIER_300_VALUE
	 * @generated
	 * @ordered
	 */
	CARRIER_300(25, "CARRIER_300", "CARRIER_300"),

	/**
	 * The '<em><b>CARRIER 1200 75</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARRIER_1200_75_VALUE
	 * @generated
	 * @ordered
	 */
	CARRIER_1200_75(26, "CARRIER_1200_75", "CARRIER_1200_75"),

	/**
	 * The '<em><b>CARRIER 75 1200</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARRIER_75_1200_VALUE
	 * @generated
	 * @ordered
	 */
	CARRIER_75_1200(27, "CARRIER_75_1200", "CARRIER_75_1200"),

	/**
	 * The '<em><b>CAARRIER 1200</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAARRIER_1200_VALUE
	 * @generated
	 * @ordered
	 */
	CAARRIER_1200(28, "CAARRIER_1200", "CAARRIER_1200"),

	/**
	 * The '<em><b>CARRIER 2400</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARRIER_2400_VALUE
	 * @generated
	 * @ordered
	 */
	CARRIER_2400(29, "CARRIER_2400", "CARRIER_2400"),

	/**
	 * The '<em><b>CARRIER 4800</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARRIER_4800_VALUE
	 * @generated
	 * @ordered
	 */
	CARRIER_4800(30, "CARRIER_4800", "CARRIER_4800"),

	/**
	 * The '<em><b>CARRIER 9600</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARRIER_9600_VALUE
	 * @generated
	 * @ordered
	 */
	CARRIER_9600(31, "CARRIER_9600", "CARRIER_9600"),

	/**
	 * The '<em><b>CARRIER 7200</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARRIER_7200_VALUE
	 * @generated
	 * @ordered
	 */
	CARRIER_7200(32, "CARRIER_7200", "CARRIER_7200"),

	/**
	 * The '<em><b>CARRIER 12000</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARRIER_12000_VALUE
	 * @generated
	 * @ordered
	 */
	CARRIER_12000(33, "CARRIER_12000", "CARRIER_12000"),

	/**
	 * The '<em><b>CARRIER 14400</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARRIER_14400_VALUE
	 * @generated
	 * @ordered
	 */
	CARRIER_14400(34, "CARRIER_14400", "CARRIER_14400"),

	/**
	 * The '<em><b>CONNECT 16800</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECT_16800_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECT_16800(35, "CONNECT_16800", "CONNECT_16800"),

	/**
	 * The '<em><b>CARRIER 19200</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARRIER_19200_VALUE
	 * @generated
	 * @ordered
	 */
	CARRIER_19200(36, "CARRIER_19200", "CARRIER_19200"),

	/**
	 * The '<em><b>CONNECT 21600</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECT_21600_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECT_21600(37, "CONNECT_21600", "CONNECT_21600"),

	/**
	 * The '<em><b>CONNECT 24000</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECT_24000_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECT_24000(38, "CONNECT_24000", "CONNECT_24000"),

	/**
	 * The '<em><b>CONNECT 26400</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECT_26400_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECT_26400(39, "CONNECT_26400", "CONNECT_26400"),

	/**
	 * The '<em><b>CONNECT 28800</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECT_28800_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECT_28800(40, "CONNECT_28800", "CONNECT_28800"),

	/**
	 * The '<em><b>CONNECT 31200</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECT_31200_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECT_31200(41, "CONNECT_31200", "CONNECT_31200"),

	/**
	 * The '<em><b>CONNECT 36600</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECT_36600_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECT_36600(42, "CONNECT_36600", "CONNECT_36600"),

	/**
	 * The '<em><b>COMPRESSION CLASS 5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPRESSION_CLASS_5_VALUE
	 * @generated
	 * @ordered
	 */
	COMPRESSION_CLASS_5(43, "COMPRESSION_CLASS_5", "COMPRESSION_CLASS_5"),

	/**
	 * The '<em><b>COMPRESSION V42 BIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPRESSION_V42_BIS_VALUE
	 * @generated
	 * @ordered
	 */
	COMPRESSION_V42_BIS(44, "COMPRESSION_V42_BIS", "COMPRESSION_V42_BIS"),

	/**
	 * The '<em><b>COMPRESSION NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPRESSION_NONE_VALUE
	 * @generated
	 * @ordered
	 */
	COMPRESSION_NONE(45, "COMPRESSION_NONE", "COMPRESSION_NONE"),

	/**
	 * The '<em><b>PROTOCOL NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROTOCOL_NONE_VALUE
	 * @generated
	 * @ordered
	 */
	PROTOCOL_NONE(46, "PROTOCOL_NONE", "PROTOCOL_NONE"),

	/**
	 * The '<em><b>PROTOCOL LAPM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROTOCOL_LAPM_VALUE
	 * @generated
	 * @ordered
	 */
	PROTOCOL_LAPM(47, "PROTOCOL_LAPM", "PROTOCOL_LAPM"),

	/**
	 * The '<em><b>PROTOCOL ALT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROTOCOL_ALT_VALUE
	 * @generated
	 * @ordered
	 */
	PROTOCOL_ALT(48, "PROTOCOL_ALT", "PROTOCOL_ALT"),

	/**
	 * The '<em><b>PROTOCOL ALT CELLULAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROTOCOL_ALT_CELLULAR_VALUE
	 * @generated
	 * @ordered
	 */
	PROTOCOL_ALT_CELLULAR(49, "PROTOCOL_ALT_CELLULAR", "PROTOCOL_ALT_CELLULAR"),

	/**
	 * The '<em><b>PLUS F4 PLUS FCERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLUS_F4_PLUS_FCERROR_VALUE
	 * @generated
	 * @ordered
	 */
	PLUS_F4_PLUS_FCERROR(50, "PLUS_F4_PLUS_FCERROR", "PLUS_F4_PLUS_FCERROR");

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
	public static final int OK_VALUE = 0;

	/**
	 * The '<em><b>RING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RING_VALUE = 1;

	/**
	 * The '<em><b>NO CARRIER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO CARRIER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_CARRIER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_CARRIER_VALUE = 2;

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
	public static final int ERROR_VALUE = 3;

	/**
	 * The '<em><b>CONNECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONNECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_VALUE = 4;

	/**
	 * The '<em><b>NO DIALTONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO DIALTONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_DIALTONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_DIALTONE_VALUE = 5;

	/**
	 * The '<em><b>BUSY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUSY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUSY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUSY_VALUE = 6;

	/**
	 * The '<em><b>NO ANSWER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO ANSWER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_ANSWER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_ANSWER_VALUE = 7;

	/**
	 * The '<em><b>CONNECT O600</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONNECT O600</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECT_O600
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_O600_VALUE = 8;

	/**
	 * The '<em><b>CONNECT 2400</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONNECT 2400</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECT_2400
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_2400_VALUE = 9;

	/**
	 * The '<em><b>CONNECT 4800</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONNECT 4800</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECT_4800
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_4800_VALUE = 10;

	/**
	 * The '<em><b>CONNECT 9600</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONNECT 9600</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECT_9600
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_9600_VALUE = 11;

	/**
	 * The '<em><b>CONNECT 7200</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONNECT 7200</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECT_7200
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_7200_VALUE = 12;

	/**
	 * The '<em><b>CONNECT 12000</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONNECT 12000</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECT_12000
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_12000_VALUE = 13;

	/**
	 * The '<em><b>CONNECT 14400</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONNECT 14400</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECT_14400
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_14400_VALUE = 14;

	/**
	 * The '<em><b>CONNECT 19200</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONNECT 19200</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECT_19200
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_19200_VALUE = 15;

	/**
	 * The '<em><b>CONNECT 38400</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONNECT 38400</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECT_38400
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_38400_VALUE = 16;

	/**
	 * The '<em><b>CONNECT 57600</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONNECT 57600</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECT_57600
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_57600_VALUE = 17;

	/**
	 * The '<em><b>CONNECT 115200</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONNECT 115200</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECT_115200
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_115200_VALUE = 18;

	/**
	 * The '<em><b>CONNECT 75TX 1200RX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONNECT 75TX 1200RX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECT_75TX_1200RX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_75TX_1200RX_VALUE = 19;

	/**
	 * The '<em><b>CONNECT 1200TX 75RX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONNECT 1200TX 75RX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECT_1200TX_75RX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_1200TX_75RX_VALUE = 20;

	/**
	 * The '<em><b>DELAYED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DELAYED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELAYED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DELAYED_VALUE = 21;

	/**
	 * The '<em><b>BLACKLISTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BLACKLISTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLACKLISTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BLACKLISTED_VALUE = 22;

	/**
	 * The '<em><b>FAX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FAX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FAX_VALUE = 23;

	/**
	 * The '<em><b>DATA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DATA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATA_VALUE = 24;

	/**
	 * The '<em><b>CARRIER 300</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CARRIER 300</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARRIER_300
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CARRIER_300_VALUE = 25;

	/**
	 * The '<em><b>CARRIER 1200 75</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CARRIER 1200 75</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARRIER_1200_75
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CARRIER_1200_75_VALUE = 26;

	/**
	 * The '<em><b>CARRIER 75 1200</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CARRIER 75 1200</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARRIER_75_1200
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CARRIER_75_1200_VALUE = 27;

	/**
	 * The '<em><b>CAARRIER 1200</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CAARRIER 1200</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAARRIER_1200
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CAARRIER_1200_VALUE = 28;

	/**
	 * The '<em><b>CARRIER 2400</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CARRIER 2400</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARRIER_2400
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CARRIER_2400_VALUE = 29;

	/**
	 * The '<em><b>CARRIER 4800</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CARRIER 4800</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARRIER_4800
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CARRIER_4800_VALUE = 30;

	/**
	 * The '<em><b>CARRIER 9600</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CARRIER 9600</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARRIER_9600
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CARRIER_9600_VALUE = 31;

	/**
	 * The '<em><b>CARRIER 7200</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CARRIER 7200</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARRIER_7200
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CARRIER_7200_VALUE = 32;

	/**
	 * The '<em><b>CARRIER 12000</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CARRIER 12000</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARRIER_12000
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CARRIER_12000_VALUE = 33;

	/**
	 * The '<em><b>CARRIER 14400</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CARRIER 14400</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARRIER_14400
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CARRIER_14400_VALUE = 34;

	/**
	 * The '<em><b>CONNECT 16800</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONNECT 16800</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECT_16800
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_16800_VALUE = 35;

	/**
	 * The '<em><b>CARRIER 19200</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CARRIER 19200</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARRIER_19200
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CARRIER_19200_VALUE = 36;

	/**
	 * The '<em><b>CONNECT 21600</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONNECT 21600</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECT_21600
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_21600_VALUE = 37;

	/**
	 * The '<em><b>CONNECT 24000</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONNECT 24000</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECT_24000
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_24000_VALUE = 38;

	/**
	 * The '<em><b>CONNECT 26400</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONNECT 26400</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECT_26400
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_26400_VALUE = 39;

	/**
	 * The '<em><b>CONNECT 28800</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONNECT 28800</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECT_28800
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_28800_VALUE = 40;

	/**
	 * The '<em><b>CONNECT 31200</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONNECT 31200</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECT_31200
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_31200_VALUE = 41;

	/**
	 * The '<em><b>CONNECT 36600</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONNECT 36600</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECT_36600
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONNECT_36600_VALUE = 42;

	/**
	 * The '<em><b>COMPRESSION CLASS 5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPRESSION CLASS 5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPRESSION_CLASS_5
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPRESSION_CLASS_5_VALUE = 43;

	/**
	 * The '<em><b>COMPRESSION V42 BIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPRESSION V42 BIS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPRESSION_V42_BIS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPRESSION_V42_BIS_VALUE = 44;

	/**
	 * The '<em><b>COMPRESSION NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPRESSION NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPRESSION_NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPRESSION_NONE_VALUE = 45;

	/**
	 * The '<em><b>PROTOCOL NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROTOCOL NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROTOCOL_NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROTOCOL_NONE_VALUE = 46;

	/**
	 * The '<em><b>PROTOCOL LAPM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROTOCOL LAPM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROTOCOL_LAPM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROTOCOL_LAPM_VALUE = 47;

	/**
	 * The '<em><b>PROTOCOL ALT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROTOCOL ALT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROTOCOL_ALT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROTOCOL_ALT_VALUE = 48;

	/**
	 * The '<em><b>PROTOCOL ALT CELLULAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROTOCOL ALT CELLULAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROTOCOL_ALT_CELLULAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROTOCOL_ALT_CELLULAR_VALUE = 49;

	/**
	 * The '<em><b>PLUS F4 PLUS FCERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLUS F4 PLUS FCERROR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLUS_F4_PLUS_FCERROR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PLUS_F4_PLUS_FCERROR_VALUE = 50;

	/**
	 * An array of all the '<em><b>AT RET CODES</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AT_RET_CODES[] VALUES_ARRAY =
		new AT_RET_CODES[] {
			OK,
			RING,
			NO_CARRIER,
			ERROR,
			CONNECT,
			NO_DIALTONE,
			BUSY,
			NO_ANSWER,
			CONNECT_O600,
			CONNECT_2400,
			CONNECT_4800,
			CONNECT_9600,
			CONNECT_7200,
			CONNECT_12000,
			CONNECT_14400,
			CONNECT_19200,
			CONNECT_38400,
			CONNECT_57600,
			CONNECT_115200,
			CONNECT_75TX_1200RX,
			CONNECT_1200TX_75RX,
			DELAYED,
			BLACKLISTED,
			FAX,
			DATA,
			CARRIER_300,
			CARRIER_1200_75,
			CARRIER_75_1200,
			CAARRIER_1200,
			CARRIER_2400,
			CARRIER_4800,
			CARRIER_9600,
			CARRIER_7200,
			CARRIER_12000,
			CARRIER_14400,
			CONNECT_16800,
			CARRIER_19200,
			CONNECT_21600,
			CONNECT_24000,
			CONNECT_26400,
			CONNECT_28800,
			CONNECT_31200,
			CONNECT_36600,
			COMPRESSION_CLASS_5,
			COMPRESSION_V42_BIS,
			COMPRESSION_NONE,
			PROTOCOL_NONE,
			PROTOCOL_LAPM,
			PROTOCOL_ALT,
			PROTOCOL_ALT_CELLULAR,
			PLUS_F4_PLUS_FCERROR,
		};

	/**
	 * A public read-only list of all the '<em><b>AT RET CODES</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AT_RET_CODES> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>AT RET CODES</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AT_RET_CODES get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AT_RET_CODES result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>AT RET CODES</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AT_RET_CODES getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AT_RET_CODES result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>AT RET CODES</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AT_RET_CODES get(int value) {
		switch (value) {
			case OK_VALUE: return OK;
			case RING_VALUE: return RING;
			case NO_CARRIER_VALUE: return NO_CARRIER;
			case ERROR_VALUE: return ERROR;
			case CONNECT_VALUE: return CONNECT;
			case NO_DIALTONE_VALUE: return NO_DIALTONE;
			case BUSY_VALUE: return BUSY;
			case NO_ANSWER_VALUE: return NO_ANSWER;
			case CONNECT_O600_VALUE: return CONNECT_O600;
			case CONNECT_2400_VALUE: return CONNECT_2400;
			case CONNECT_4800_VALUE: return CONNECT_4800;
			case CONNECT_9600_VALUE: return CONNECT_9600;
			case CONNECT_7200_VALUE: return CONNECT_7200;
			case CONNECT_12000_VALUE: return CONNECT_12000;
			case CONNECT_14400_VALUE: return CONNECT_14400;
			case CONNECT_19200_VALUE: return CONNECT_19200;
			case CONNECT_38400_VALUE: return CONNECT_38400;
			case CONNECT_57600_VALUE: return CONNECT_57600;
			case CONNECT_115200_VALUE: return CONNECT_115200;
			case CONNECT_75TX_1200RX_VALUE: return CONNECT_75TX_1200RX;
			case CONNECT_1200TX_75RX_VALUE: return CONNECT_1200TX_75RX;
			case DELAYED_VALUE: return DELAYED;
			case BLACKLISTED_VALUE: return BLACKLISTED;
			case FAX_VALUE: return FAX;
			case DATA_VALUE: return DATA;
			case CARRIER_300_VALUE: return CARRIER_300;
			case CARRIER_1200_75_VALUE: return CARRIER_1200_75;
			case CARRIER_75_1200_VALUE: return CARRIER_75_1200;
			case CAARRIER_1200_VALUE: return CAARRIER_1200;
			case CARRIER_2400_VALUE: return CARRIER_2400;
			case CARRIER_4800_VALUE: return CARRIER_4800;
			case CARRIER_9600_VALUE: return CARRIER_9600;
			case CARRIER_7200_VALUE: return CARRIER_7200;
			case CARRIER_12000_VALUE: return CARRIER_12000;
			case CARRIER_14400_VALUE: return CARRIER_14400;
			case CONNECT_16800_VALUE: return CONNECT_16800;
			case CARRIER_19200_VALUE: return CARRIER_19200;
			case CONNECT_21600_VALUE: return CONNECT_21600;
			case CONNECT_24000_VALUE: return CONNECT_24000;
			case CONNECT_26400_VALUE: return CONNECT_26400;
			case CONNECT_28800_VALUE: return CONNECT_28800;
			case CONNECT_31200_VALUE: return CONNECT_31200;
			case CONNECT_36600_VALUE: return CONNECT_36600;
			case COMPRESSION_CLASS_5_VALUE: return COMPRESSION_CLASS_5;
			case COMPRESSION_V42_BIS_VALUE: return COMPRESSION_V42_BIS;
			case COMPRESSION_NONE_VALUE: return COMPRESSION_NONE;
			case PROTOCOL_NONE_VALUE: return PROTOCOL_NONE;
			case PROTOCOL_LAPM_VALUE: return PROTOCOL_LAPM;
			case PROTOCOL_ALT_VALUE: return PROTOCOL_ALT;
			case PROTOCOL_ALT_CELLULAR_VALUE: return PROTOCOL_ALT_CELLULAR;
			case PLUS_F4_PLUS_FCERROR_VALUE: return PLUS_F4_PLUS_FCERROR;
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
	private AT_RET_CODES(int value, String name, String literal) {
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
	
} //AT_RET_CODES
