/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.midi.ezmidi.impl;

import net.sf.smbt.midi.ezmidi.EzmidiPackage;
import net.sf.smbt.midi.ezmidi.PolyPressure;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Poly Pressure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.midi.ezmidi.impl.PolyPressureImpl#getNote <em>Note</em>}</li>
 *   <li>{@link net.sf.smbt.midi.ezmidi.impl.PolyPressureImpl#getPressure <em>Pressure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolyPressureImpl extends DSLMidiMessageImpl implements PolyPressure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolyPressureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzmidiPackage.Literals.POLY_PRESSURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNote() {
		return (Integer)eGet(EzmidiPackage.Literals.POLY_PRESSURE__NOTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(int newNote) {
		eSet(EzmidiPackage.Literals.POLY_PRESSURE__NOTE, newNote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPressure() {
		return (Integer)eGet(EzmidiPackage.Literals.POLY_PRESSURE__PRESSURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPressure(int newPressure) {
		eSet(EzmidiPackage.Literals.POLY_PRESSURE__PRESSURE, newPressure);
	}

} //PolyPressureImpl
