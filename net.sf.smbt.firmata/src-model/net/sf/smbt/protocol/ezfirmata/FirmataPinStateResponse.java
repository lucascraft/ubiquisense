/**
 */
package net.sf.smbt.protocol.ezfirmata;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Firmata Pin State Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.protocol.ezfirmata.FirmataPinStateResponse#getPin <em>Pin</em>}</li>
 *   <li>{@link net.sf.smbt.protocol.ezfirmata.FirmataPinStateResponse#getModel <em>Model</em>}</li>
 *   <li>{@link net.sf.smbt.protocol.ezfirmata.FirmataPinStateResponse#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.protocol.ezfirmata.EzfirmataPackage#getFirmataPinStateResponse()
 * @model
 * @generated
 */
public interface FirmataPinStateResponse extends FirmataCmd {
	/**
	 * Returns the value of the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin</em>' attribute.
	 * @see #setPin(int)
	 * @see net.sf.smbt.protocol.ezfirmata.EzfirmataPackage#getFirmataPinStateResponse_Pin()
	 * @model
	 * @generated
	 */
	int getPin();

	/**
	 * Sets the value of the '{@link net.sf.smbt.protocol.ezfirmata.FirmataPinStateResponse#getPin <em>Pin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin</em>' attribute.
	 * @see #getPin()
	 * @generated
	 */
	void setPin(int value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(int)
	 * @see net.sf.smbt.protocol.ezfirmata.EzfirmataPackage#getFirmataPinStateResponse_Model()
	 * @model
	 * @generated
	 */
	int getModel();

	/**
	 * Sets the value of the '{@link net.sf.smbt.protocol.ezfirmata.FirmataPinStateResponse#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(int value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see net.sf.smbt.protocol.ezfirmata.EzfirmataPackage#getFirmataPinStateResponse_Value()
	 * @model
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link net.sf.smbt.protocol.ezfirmata.FirmataPinStateResponse#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

} // FirmataPinStateResponse
