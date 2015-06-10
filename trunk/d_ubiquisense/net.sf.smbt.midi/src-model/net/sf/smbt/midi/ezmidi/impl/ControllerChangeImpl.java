/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.midi.ezmidi.impl;

import net.sf.smbt.midi.ezmidi.ControllerChange;
import net.sf.smbt.midi.ezmidi.EzmidiPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.midi.ezmidi.impl.ControllerChangeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link net.sf.smbt.midi.ezmidi.impl.ControllerChangeImpl#getController <em>Controller</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControllerChangeImpl extends DSLMidiMessageImpl implements ControllerChange {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerChangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzmidiPackage.Literals.CONTROLLER_CHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return (Integer)eGet(EzmidiPackage.Literals.CONTROLLER_CHANGE__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		eSet(EzmidiPackage.Literals.CONTROLLER_CHANGE__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getController() {
		return (Integer)eGet(EzmidiPackage.Literals.CONTROLLER_CHANGE__CONTROLLER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setController(int newController) {
		eSet(EzmidiPackage.Literals.CONTROLLER_CHANGE__CONTROLLER, newController);
	}

} //ControllerChangeImpl
