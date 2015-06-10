/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.midi.ezmidi.impl;

import net.sf.smbt.midi.ezmidi.EzmidiPackage;
import net.sf.smbt.midi.ezmidi.PitchBend;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pitch Bend</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.midi.ezmidi.impl.PitchBendImpl#getBend <em>Bend</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PitchBendImpl extends DSLMidiMessageImpl implements PitchBend {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PitchBendImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzmidiPackage.Literals.PITCH_BEND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBend() {
		return (Integer)eGet(EzmidiPackage.Literals.PITCH_BEND__BEND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBend(int newBend) {
		eSet(EzmidiPackage.Literals.PITCH_BEND__BEND, newBend);
	}

} //PitchBendImpl
