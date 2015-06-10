/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.midi.ezmidi.impl;

import net.sf.smbt.midi.ezmidi.EzmidiPackage;
import net.sf.smbt.midi.ezmidi.UnofficialBusSelect;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unofficial Bus Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.midi.ezmidi.impl.UnofficialBusSelectImpl#getBusNumber <em>Bus Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnofficialBusSelectImpl extends DSLMidiMessageImpl implements UnofficialBusSelect {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnofficialBusSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzmidiPackage.Literals.UNOFFICIAL_BUS_SELECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBusNumber() {
		return (Integer)eGet(EzmidiPackage.Literals.UNOFFICIAL_BUS_SELECT__BUS_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusNumber(int newBusNumber) {
		eSet(EzmidiPackage.Literals.UNOFFICIAL_BUS_SELECT__BUS_NUMBER, newBusNumber);
	}

} //UnofficialBusSelectImpl
