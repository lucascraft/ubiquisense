/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.comm.script.netConf;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TRANSPORT PROTOCOL</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.comm.script.netConf.NetConfPackage#getTRANSPORT_PROTOCOL()
 * @model
 * @generated
 */
public enum TRANSPORT_PROTOCOL implements Enumerator
{
  /**
   * The '<em><b>USB</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #USB_VALUE
   * @generated
   * @ordered
   */
  USB(0, "USB", "usb://"),

  /**
   * The '<em><b>TCP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TCP_VALUE
   * @generated
   * @ordered
   */
  TCP(1, "TCP", "tcp://"),

  /**
   * The '<em><b>UDP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UDP_VALUE
   * @generated
   * @ordered
   */
  UDP(2, "UDP", "udp://"),

  /**
   * The '<em><b>HTTP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HTTP_VALUE
   * @generated
   * @ordered
   */
  HTTP(3, "HTTP", "http://"),

  /**
   * The '<em><b>BLUETOOTH</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BLUETOOTH_VALUE
   * @generated
   * @ordered
   */
  BLUETOOTH(4, "BLUETOOTH", "bt://"),

  /**
   * The '<em><b>XBEE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #XBEE_VALUE
   * @generated
   * @ordered
   */
  XBEE(5, "XBEE", "xbee://"),

  /**
   * The '<em><b>MIDI</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MIDI_VALUE
   * @generated
   * @ordered
   */
  MIDI(6, "MIDI", "midi://");

  /**
   * The '<em><b>USB</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>USB</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #USB
   * @model literal="usb://"
   * @generated
   * @ordered
   */
  public static final int USB_VALUE = 0;

  /**
   * The '<em><b>TCP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TCP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TCP
   * @model literal="tcp://"
   * @generated
   * @ordered
   */
  public static final int TCP_VALUE = 1;

  /**
   * The '<em><b>UDP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>UDP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UDP
   * @model literal="udp://"
   * @generated
   * @ordered
   */
  public static final int UDP_VALUE = 2;

  /**
   * The '<em><b>HTTP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>HTTP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HTTP
   * @model literal="http://"
   * @generated
   * @ordered
   */
  public static final int HTTP_VALUE = 3;

  /**
   * The '<em><b>BLUETOOTH</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BLUETOOTH</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BLUETOOTH
   * @model literal="bt://"
   * @generated
   * @ordered
   */
  public static final int BLUETOOTH_VALUE = 4;

  /**
   * The '<em><b>XBEE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>XBEE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #XBEE
   * @model literal="xbee://"
   * @generated
   * @ordered
   */
  public static final int XBEE_VALUE = 5;

  /**
   * The '<em><b>MIDI</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MIDI</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MIDI
   * @model literal="midi://"
   * @generated
   * @ordered
   */
  public static final int MIDI_VALUE = 6;

  /**
   * An array of all the '<em><b>TRANSPORT PROTOCOL</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final TRANSPORT_PROTOCOL[] VALUES_ARRAY =
    new TRANSPORT_PROTOCOL[]
    {
      USB,
      TCP,
      UDP,
      HTTP,
      BLUETOOTH,
      XBEE,
      MIDI,
    };

  /**
   * A public read-only list of all the '<em><b>TRANSPORT PROTOCOL</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<TRANSPORT_PROTOCOL> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>TRANSPORT PROTOCOL</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TRANSPORT_PROTOCOL get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TRANSPORT_PROTOCOL result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>TRANSPORT PROTOCOL</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TRANSPORT_PROTOCOL getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TRANSPORT_PROTOCOL result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>TRANSPORT PROTOCOL</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TRANSPORT_PROTOCOL get(int value)
  {
    switch (value)
    {
      case USB_VALUE: return USB;
      case TCP_VALUE: return TCP;
      case UDP_VALUE: return UDP;
      case HTTP_VALUE: return HTTP;
      case BLUETOOTH_VALUE: return BLUETOOTH;
      case XBEE_VALUE: return XBEE;
      case MIDI_VALUE: return MIDI;
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
  private TRANSPORT_PROTOCOL(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //TRANSPORT_PROTOCOL
