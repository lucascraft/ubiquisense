/**
 */
package net.sf.smbt.protocol.ezfirmata.impl;

import net.sf.smbt.protocol.ezfirmata.EzfirmataPackage;
import net.sf.smbt.protocol.ezfirmata.FirmataPinStateResponse;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Firmata Pin State Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.protocol.ezfirmata.impl.FirmataPinStateResponseImpl#getPin <em>Pin</em>}</li>
 *   <li>{@link net.sf.smbt.protocol.ezfirmata.impl.FirmataPinStateResponseImpl#getModel <em>Model</em>}</li>
 *   <li>{@link net.sf.smbt.protocol.ezfirmata.impl.FirmataPinStateResponseImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FirmataPinStateResponseImpl extends FirmataCmdImpl implements FirmataPinStateResponse {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FirmataPinStateResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzfirmataPackage.Literals.FIRMATA_PIN_STATE_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPin() {
		return (Integer)eGet(EzfirmataPackage.Literals.FIRMATA_PIN_STATE_RESPONSE__PIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPin(int newPin) {
		eSet(EzfirmataPackage.Literals.FIRMATA_PIN_STATE_RESPONSE__PIN, newPin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getModel() {
		return (Integer)eGet(EzfirmataPackage.Literals.FIRMATA_PIN_STATE_RESPONSE__MODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(int newModel) {
		eSet(EzfirmataPackage.Literals.FIRMATA_PIN_STATE_RESPONSE__MODEL, newModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValue() {
		return (Float)eGet(EzfirmataPackage.Literals.FIRMATA_PIN_STATE_RESPONSE__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(float newValue) {
		eSet(EzfirmataPackage.Literals.FIRMATA_PIN_STATE_RESPONSE__VALUE, newValue);
	}

} //FirmataPinStateResponseImpl
