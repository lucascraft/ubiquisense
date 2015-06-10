/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.midi.ezmidi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel Pressure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.midi.ezmidi.ChannelPressure#getPressure <em>Pressure</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.midi.ezmidi.EzmidiPackage#getChannelPressure()
 * @model
 * @generated
 */
public interface ChannelPressure extends DSLMidiMessage {

	/**
	 * Returns the value of the '<em><b>Pressure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pressure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pressure</em>' attribute.
	 * @see #setPressure(int)
	 * @see net.sf.smbt.midi.ezmidi.EzmidiPackage#getChannelPressure_Pressure()
	 * @model
	 * @generated
	 */
	int getPressure();

	/**
	 * Sets the value of the '{@link net.sf.smbt.midi.ezmidi.ChannelPressure#getPressure <em>Pressure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pressure</em>' attribute.
	 * @see #getPressure()
	 * @generated
	 */
	void setPressure(int value);
} // ChannelPressure
