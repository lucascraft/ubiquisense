/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.midi.ezmidi.impl;

import net.sf.smbt.midi.ezmidi.DSLMidiMessage;
import net.sf.smbt.midi.ezmidi.EzmidiPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSL Midi Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.midi.ezmidi.impl.DSLMidiMessageImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link net.sf.smbt.midi.ezmidi.impl.DSLMidiMessageImpl#getCmd <em>Cmd</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSLMidiMessageImpl extends AbstractMidiCmdImpl implements DSLMidiMessage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSLMidiMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzmidiPackage.Literals.DSL_MIDI_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getChannel() {
		return (Integer)eGet(EzmidiPackage.Literals.DSL_MIDI_MESSAGE__CHANNEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannel(int newChannel) {
		eSet(EzmidiPackage.Literals.DSL_MIDI_MESSAGE__CHANNEL, newChannel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCmd() {
		return (Integer)eGet(EzmidiPackage.Literals.DSL_MIDI_MESSAGE__CMD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCmd(int newCmd) {
		eSet(EzmidiPackage.Literals.DSL_MIDI_MESSAGE__CMD, newCmd);
	}

} //DSLMidiMessageImpl
