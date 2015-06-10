/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezoscmidi.impl;

import net.sf.smbt.ezoscmidi.*;
import net.sf.smbt.ezoscmidi.EzoscmidiFactory;
import net.sf.smbt.ezoscmidi.EzoscmidiPackage;
import net.sf.smbt.ezoscmidi.OscMidiCmd;
import net.sf.smbt.ezoscmidi.OscMidiEndSysex;
import net.sf.smbt.ezoscmidi.OscMidiNoteOff;
import net.sf.smbt.ezoscmidi.OscMidiNoteOn;
import net.sf.smbt.ezoscmidi.OscMidiPolyPressure;
import net.sf.smbt.ezoscmidi.OscMidiSysEx;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzoscmidiFactoryImpl extends EFactoryImpl implements EzoscmidiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EzoscmidiFactory init() {
		try {
			EzoscmidiFactory theEzoscmidiFactory = (EzoscmidiFactory)EPackage.Registry.INSTANCE.getEFactory("http://ezoscmidi/1.0"); 
			if (theEzoscmidiFactory != null) {
				return theEzoscmidiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EzoscmidiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzoscmidiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EzoscmidiPackage.OSC_MIDI_NOTE_ON: return createOscMidiNoteOn();
			case EzoscmidiPackage.OSC_MIDI_NOTE_OFF: return createOscMidiNoteOff();
			case EzoscmidiPackage.OSC_MIDI_SYS_EX: return createOscMidiSysEx();
			case EzoscmidiPackage.OSC_MIDI_POLY_PRESSURE: return createOscMidiPolyPressure();
			case EzoscmidiPackage.OSC_MIDI_END_SYSEX: return createOscMidiEndSysex();
			case EzoscmidiPackage.OSC_MIDI_CMD: return createOscMidiCmd();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscMidiNoteOn createOscMidiNoteOn() {
		OscMidiNoteOnImpl oscMidiNoteOn = new OscMidiNoteOnImpl();
		return oscMidiNoteOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscMidiNoteOff createOscMidiNoteOff() {
		OscMidiNoteOffImpl oscMidiNoteOff = new OscMidiNoteOffImpl();
		return oscMidiNoteOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscMidiSysEx createOscMidiSysEx() {
		OscMidiSysExImpl oscMidiSysEx = new OscMidiSysExImpl();
		return oscMidiSysEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscMidiPolyPressure createOscMidiPolyPressure() {
		OscMidiPolyPressureImpl oscMidiPolyPressure = new OscMidiPolyPressureImpl();
		return oscMidiPolyPressure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscMidiEndSysex createOscMidiEndSysex() {
		OscMidiEndSysexImpl oscMidiEndSysex = new OscMidiEndSysexImpl();
		return oscMidiEndSysex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscMidiCmd createOscMidiCmd() {
		OscMidiCmdImpl oscMidiCmd = new OscMidiCmdImpl();
		return oscMidiCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzoscmidiPackage getEzoscmidiPackage() {
		return (EzoscmidiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EzoscmidiPackage getPackage() {
		return EzoscmidiPackage.eINSTANCE;
	}

} //EzoscmidiFactoryImpl
