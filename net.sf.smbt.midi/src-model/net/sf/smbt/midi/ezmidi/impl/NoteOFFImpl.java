/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.midi.ezmidi.impl;

import net.sf.smbt.midi.ezmidi.EzmidiPackage;
import net.sf.smbt.midi.ezmidi.NoteOFF;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Note OFF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.midi.ezmidi.impl.NoteOFFImpl#getNote <em>Note</em>}</li>
 *   <li>{@link net.sf.smbt.midi.ezmidi.impl.NoteOFFImpl#getVelocity <em>Velocity</em>}</li>
 *   <li>{@link net.sf.smbt.midi.ezmidi.impl.NoteOFFImpl#getPitch <em>Pitch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NoteOFFImpl extends DSLMidiMessageImpl implements NoteOFF {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoteOFFImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzmidiPackage.Literals.NOTE_OFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNote() {
		return (Integer)eGet(EzmidiPackage.Literals.NOTE_OFF__NOTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(int newNote) {
		eSet(EzmidiPackage.Literals.NOTE_OFF__NOTE, newNote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVelocity() {
		return (Integer)eGet(EzmidiPackage.Literals.NOTE_OFF__VELOCITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVelocity(int newVelocity) {
		eSet(EzmidiPackage.Literals.NOTE_OFF__VELOCITY, newVelocity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPitch() {
		return (Integer)eGet(EzmidiPackage.Literals.NOTE_OFF__PITCH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPitch(int newPitch) {
		eSet(EzmidiPackage.Literals.NOTE_OFF__PITCH, newPitch);
	}

} //NoteOFFImpl
