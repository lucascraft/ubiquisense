/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.midi.ezmidi.impl;

import net.sf.smbt.midi.ezmidi.ChannelPressure;
import net.sf.smbt.midi.ezmidi.EzmidiPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel Pressure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.midi.ezmidi.impl.ChannelPressureImpl#getPressure <em>Pressure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChannelPressureImpl extends DSLMidiMessageImpl implements ChannelPressure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelPressureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzmidiPackage.Literals.CHANNEL_PRESSURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPressure() {
		return (Integer)eGet(EzmidiPackage.Literals.CHANNEL_PRESSURE__PRESSURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPressure(int newPressure) {
		eSet(EzmidiPackage.Literals.CHANNEL_PRESSURE__PRESSURE, newPressure);
	}

} //ChannelPressureImpl
