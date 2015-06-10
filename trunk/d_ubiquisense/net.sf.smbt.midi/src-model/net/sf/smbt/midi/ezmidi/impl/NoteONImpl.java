/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.midi.ezmidi.impl;

import net.sf.smbt.midi.ezmidi.EzmidiPackage;
import net.sf.smbt.midi.ezmidi.NoteON;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Note ON</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.midi.ezmidi.impl.NoteONImpl#getNote <em>Note</em>}</li>
 *   <li>{@link net.sf.smbt.midi.ezmidi.impl.NoteONImpl#getVelocity <em>Velocity</em>}</li>
 *   <li>{@link net.sf.smbt.midi.ezmidi.impl.NoteONImpl#getPitch <em>Pitch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NoteONImpl extends DSLMidiMessageImpl implements NoteON {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoteONImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzmidiPackage.Literals.NOTE_ON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNote() {
		return (Integer)eGet(EzmidiPackage.Literals.NOTE_ON__NOTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(int newNote) {
		eSet(EzmidiPackage.Literals.NOTE_ON__NOTE, newNote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVelocity() {
		return (Integer)eGet(EzmidiPackage.Literals.NOTE_ON__VELOCITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVelocity(int newVelocity) {
		eSet(EzmidiPackage.Literals.NOTE_ON__VELOCITY, newVelocity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPitch() {
		return (Integer)eGet(EzmidiPackage.Literals.NOTE_ON__PITCH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPitch(int newPitch) {
		eSet(EzmidiPackage.Literals.NOTE_ON__PITCH, newPitch);
	}

} //NoteONImpl
