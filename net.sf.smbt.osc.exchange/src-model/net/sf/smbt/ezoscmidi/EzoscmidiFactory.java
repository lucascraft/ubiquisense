/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezoscmidi;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezoscmidi.EzoscmidiPackage
 * @generated
 */
public interface EzoscmidiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzoscmidiFactory eINSTANCE = net.sf.smbt.ezoscmidi.impl.EzoscmidiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Osc Midi Note On</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Osc Midi Note On</em>'.
	 * @generated
	 */
	OscMidiNoteOn createOscMidiNoteOn();

	/**
	 * Returns a new object of class '<em>Osc Midi Note Off</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Osc Midi Note Off</em>'.
	 * @generated
	 */
	OscMidiNoteOff createOscMidiNoteOff();

	/**
	 * Returns a new object of class '<em>Osc Midi Sys Ex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Osc Midi Sys Ex</em>'.
	 * @generated
	 */
	OscMidiSysEx createOscMidiSysEx();

	/**
	 * Returns a new object of class '<em>Osc Midi Poly Pressure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Osc Midi Poly Pressure</em>'.
	 * @generated
	 */
	OscMidiPolyPressure createOscMidiPolyPressure();

	/**
	 * Returns a new object of class '<em>Osc Midi End Sysex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Osc Midi End Sysex</em>'.
	 * @generated
	 */
	OscMidiEndSysex createOscMidiEndSysex();

	/**
	 * Returns a new object of class '<em>Osc Midi Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Osc Midi Cmd</em>'.
	 * @generated
	 */
	OscMidiCmd createOscMidiCmd();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EzoscmidiPackage getEzoscmidiPackage();

} //EzoscmidiFactory
