/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezoscmidi.util;

import java.util.List;

import net.sf.smbt.ezoscmidi.*;
import net.sf.smbt.ezoscmidi.EzoscmidiPackage;
import net.sf.smbt.ezoscmidi.OscMidiCmd;
import net.sf.smbt.ezoscmidi.OscMidiEndSysex;
import net.sf.smbt.ezoscmidi.OscMidiNoteOff;
import net.sf.smbt.ezoscmidi.OscMidiNoteOn;
import net.sf.smbt.ezoscmidi.OscMidiPolyPressure;
import net.sf.smbt.ezoscmidi.OscMidiSysEx;
import net.sf.smbt.midi.ezmidi.AbstractMidiCmd;
import net.sf.smbt.osccmd.OscCmd;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezoscmidi.EzoscmidiPackage
 * @generated
 */
public class EzoscmidiSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzoscmidiPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzoscmidiSwitch() {
		if (modelPackage == null) {
			modelPackage = EzoscmidiPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EzoscmidiPackage.OSC_MIDI_NOTE_ON: {
				OscMidiNoteOn oscMidiNoteOn = (OscMidiNoteOn)theEObject;
				T result = caseOscMidiNoteOn(oscMidiNoteOn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzoscmidiPackage.OSC_MIDI_NOTE_OFF: {
				OscMidiNoteOff oscMidiNoteOff = (OscMidiNoteOff)theEObject;
				T result = caseOscMidiNoteOff(oscMidiNoteOff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzoscmidiPackage.OSC_MIDI_SYS_EX: {
				OscMidiSysEx oscMidiSysEx = (OscMidiSysEx)theEObject;
				T result = caseOscMidiSysEx(oscMidiSysEx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzoscmidiPackage.OSC_MIDI_POLY_PRESSURE: {
				OscMidiPolyPressure oscMidiPolyPressure = (OscMidiPolyPressure)theEObject;
				T result = caseOscMidiPolyPressure(oscMidiPolyPressure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzoscmidiPackage.OSC_MIDI_END_SYSEX: {
				OscMidiEndSysex oscMidiEndSysex = (OscMidiEndSysex)theEObject;
				T result = caseOscMidiEndSysex(oscMidiEndSysex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzoscmidiPackage.OSC_MIDI_CMD: {
				OscMidiCmd oscMidiCmd = (OscMidiCmd)theEObject;
				T result = caseOscMidiCmd(oscMidiCmd);
				if (result == null) result = caseOscCmd(oscMidiCmd);
				if (result == null) result = caseAbstractMidiCmd(oscMidiCmd);
				if (result == null) result = caseCmd(oscMidiCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Osc Midi Note On</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Osc Midi Note On</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOscMidiNoteOn(OscMidiNoteOn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Osc Midi Note Off</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Osc Midi Note Off</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOscMidiNoteOff(OscMidiNoteOff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Osc Midi Sys Ex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Osc Midi Sys Ex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOscMidiSysEx(OscMidiSysEx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Osc Midi Poly Pressure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Osc Midi Poly Pressure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOscMidiPolyPressure(OscMidiPolyPressure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Osc Midi End Sysex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Osc Midi End Sysex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOscMidiEndSysex(OscMidiEndSysex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Osc Midi Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Osc Midi Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOscMidiCmd(OscMidiCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmd(Cmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Osc Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Osc Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOscCmd(OscCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Midi Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Midi Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMidiCmd(AbstractMidiCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //EzoscmidiSwitch
