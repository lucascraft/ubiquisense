/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.midi.ezmidi.impl;

import net.sf.smbt.midi.ezmidi.EzmidiPackage;
import net.sf.smbt.midi.ezmidi.KeyPressure;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Pressure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.midi.ezmidi.impl.KeyPressureImpl#getKey <em>Key</em>}</li>
 *   <li>{@link net.sf.smbt.midi.ezmidi.impl.KeyPressureImpl#getPressure <em>Pressure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KeyPressureImpl extends DSLMidiMessageImpl implements KeyPressure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyPressureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzmidiPackage.Literals.KEY_PRESSURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getKey() {
		return (Integer)eGet(EzmidiPackage.Literals.KEY_PRESSURE__KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(int newKey) {
		eSet(EzmidiPackage.Literals.KEY_PRESSURE__KEY, newKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPressure() {
		return (Integer)eGet(EzmidiPackage.Literals.KEY_PRESSURE__PRESSURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPressure(int newPressure) {
		eSet(EzmidiPackage.Literals.KEY_PRESSURE__PRESSURE, newPressure);
	}

} //KeyPressureImpl
