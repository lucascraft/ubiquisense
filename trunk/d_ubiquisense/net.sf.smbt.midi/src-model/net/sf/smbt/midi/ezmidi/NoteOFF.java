/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.midi.ezmidi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note OFF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.midi.ezmidi.NoteOFF#getNote <em>Note</em>}</li>
 *   <li>{@link net.sf.smbt.midi.ezmidi.NoteOFF#getVelocity <em>Velocity</em>}</li>
 *   <li>{@link net.sf.smbt.midi.ezmidi.NoteOFF#getPitch <em>Pitch</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.midi.ezmidi.EzmidiPackage#getNoteOFF()
 * @model
 * @generated
 */
public interface NoteOFF extends DSLMidiMessage {

	/**
	 * Returns the value of the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' attribute.
	 * @see #setNote(int)
	 * @see net.sf.smbt.midi.ezmidi.EzmidiPackage#getNoteOFF_Note()
	 * @model
	 * @generated
	 */
	int getNote();

	/**
	 * Sets the value of the '{@link net.sf.smbt.midi.ezmidi.NoteOFF#getNote <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' attribute.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(int value);

	/**
	 * Returns the value of the '<em><b>Velocity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Velocity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Velocity</em>' attribute.
	 * @see #setVelocity(int)
	 * @see net.sf.smbt.midi.ezmidi.EzmidiPackage#getNoteOFF_Velocity()
	 * @model
	 * @generated
	 */
	int getVelocity();

	/**
	 * Sets the value of the '{@link net.sf.smbt.midi.ezmidi.NoteOFF#getVelocity <em>Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Velocity</em>' attribute.
	 * @see #getVelocity()
	 * @generated
	 */
	void setVelocity(int value);

	/**
	 * Returns the value of the '<em><b>Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pitch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pitch</em>' attribute.
	 * @see #setPitch(int)
	 * @see net.sf.smbt.midi.ezmidi.EzmidiPackage#getNoteOFF_Pitch()
	 * @model
	 * @generated
	 */
	int getPitch();

	/**
	 * Sets the value of the '{@link net.sf.smbt.midi.ezmidi.NoteOFF#getPitch <em>Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pitch</em>' attribute.
	 * @see #getPitch()
	 * @generated
	 */
	void setPitch(int value);
} // NoteOFF
