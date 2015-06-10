/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.ezdmxctrl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Channel Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage#getChannelKind()
 * @model
 * @generated
 */
public enum ChannelKind implements Enumerator {
	/**
	 * The '<em><b>COLOUR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOUR_VALUE
	 * @generated
	 * @ordered
	 */
	COLOUR(0, "COLOUR", "Colour"),

	/**
	 * The '<em><b>GOBO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOBO_VALUE
	 * @generated
	 * @ordered
	 */
	GOBO(1, "GOBO", "Gobo"),

	/**
	 * The '<em><b>MAINTENANCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAINTENANCE_VALUE
	 * @generated
	 * @ordered
	 */
	MAINTENANCE(2, "MAINTENANCE", "Maintenance"),

	/**
	 * The '<em><b>FX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FX_VALUE
	 * @generated
	 * @ordered
	 */
	FX(3, "FX", "Effect"),

	/**
	 * The '<em><b>SPEED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPEED_VALUE
	 * @generated
	 * @ordered
	 */
	SPEED(4, "SPEED", "Speed"),

	/**
	 * The '<em><b>BEAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEAM_VALUE
	 * @generated
	 * @ordered
	 */
	BEAM(5, "BEAM", "Beam"),

	/**
	 * The '<em><b>INTENSITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTENSITY_VALUE
	 * @generated
	 * @ordered
	 */
	INTENSITY(6, "INTENSITY", "Intensity"),

	/**
	 * The '<em><b>SHUTTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHUTTER_VALUE
	 * @generated
	 * @ordered
	 */
	SHUTTER(7, "SHUTTER", "Shutter"),

	/**
	 * The '<em><b>TILT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TILT_VALUE
	 * @generated
	 * @ordered
	 */
	TILT(8, "TILT", "Tilt"),

	/**
	 * The '<em><b>PAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAN_VALUE
	 * @generated
	 * @ordered
	 */
	PAN(9, "PAN", "Pan"),

	/**
	 * The '<em><b>PRISM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRISM_VALUE
	 * @generated
	 * @ordered
	 */
	PRISM(10, "PRISM", "Prism"),

	/**
	 * The '<em><b>NOTHING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOTHING_VALUE
	 * @generated
	 * @ordered
	 */
	NOTHING(11, "NOTHING", "Nothing");

	/**
	 * The '<em><b>COLOUR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOUR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOUR
	 * @model literal="Colour"
	 * @generated
	 * @ordered
	 */
	public static final int COLOUR_VALUE = 0;

	/**
	 * The '<em><b>GOBO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GOBO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GOBO
	 * @model literal="Gobo"
	 * @generated
	 * @ordered
	 */
	public static final int GOBO_VALUE = 1;

	/**
	 * The '<em><b>MAINTENANCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MAINTENANCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAINTENANCE
	 * @model literal="Maintenance"
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_VALUE = 2;

	/**
	 * The '<em><b>FX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FX
	 * @model literal="Effect"
	 * @generated
	 * @ordered
	 */
	public static final int FX_VALUE = 3;

	/**
	 * The '<em><b>SPEED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPEED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPEED
	 * @model literal="Speed"
	 * @generated
	 * @ordered
	 */
	public static final int SPEED_VALUE = 4;

	/**
	 * The '<em><b>BEAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BEAM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEAM
	 * @model literal="Beam"
	 * @generated
	 * @ordered
	 */
	public static final int BEAM_VALUE = 5;

	/**
	 * The '<em><b>INTENSITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INTENSITY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTENSITY
	 * @model literal="Intensity"
	 * @generated
	 * @ordered
	 */
	public static final int INTENSITY_VALUE = 6;

	/**
	 * The '<em><b>SHUTTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHUTTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHUTTER
	 * @model literal="Shutter"
	 * @generated
	 * @ordered
	 */
	public static final int SHUTTER_VALUE = 7;

	/**
	 * The '<em><b>TILT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TILT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TILT
	 * @model literal="Tilt"
	 * @generated
	 * @ordered
	 */
	public static final int TILT_VALUE = 8;

	/**
	 * The '<em><b>PAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAN
	 * @model literal="Pan"
	 * @generated
	 * @ordered
	 */
	public static final int PAN_VALUE = 9;

	/**
	 * The '<em><b>PRISM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRISM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRISM
	 * @model literal="Prism"
	 * @generated
	 * @ordered
	 */
	public static final int PRISM_VALUE = 10;

	/**
	 * The '<em><b>NOTHING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOTHING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOTHING
	 * @model literal="Nothing"
	 * @generated
	 * @ordered
	 */
	public static final int NOTHING_VALUE = 11;

	/**
	 * An array of all the '<em><b>Channel Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ChannelKind[] VALUES_ARRAY =
		new ChannelKind[] {
			COLOUR,
			GOBO,
			MAINTENANCE,
			FX,
			SPEED,
			BEAM,
			INTENSITY,
			SHUTTER,
			TILT,
			PAN,
			PRISM,
			NOTHING,
		};

	/**
	 * A public read-only list of all the '<em><b>Channel Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ChannelKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Channel Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChannelKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChannelKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Channel Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChannelKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChannelKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Channel Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChannelKind get(int value) {
		switch (value) {
			case COLOUR_VALUE: return COLOUR;
			case GOBO_VALUE: return GOBO;
			case MAINTENANCE_VALUE: return MAINTENANCE;
			case FX_VALUE: return FX;
			case SPEED_VALUE: return SPEED;
			case BEAM_VALUE: return BEAM;
			case INTENSITY_VALUE: return INTENSITY;
			case SHUTTER_VALUE: return SHUTTER;
			case TILT_VALUE: return TILT;
			case PAN_VALUE: return PAN;
			case PRISM_VALUE: return PRISM;
			case NOTHING_VALUE: return NOTHING;
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
	private ChannelKind(int value, String name, String literal) {
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
	
} //ChannelKind
