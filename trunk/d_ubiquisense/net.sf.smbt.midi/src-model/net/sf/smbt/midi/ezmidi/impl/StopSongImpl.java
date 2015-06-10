/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.midi.ezmidi.impl;

import net.sf.smbt.midi.ezmidi.EzmidiPackage;
import net.sf.smbt.midi.ezmidi.StopSong;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stop Song</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StopSongImpl extends DSLMidiMessageImpl implements StopSong {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StopSongImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzmidiPackage.Literals.STOP_SONG;
	}

} //StopSongImpl
