/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.btcomm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.btcomm.BtcommPackage
 * @generated
 */
public interface BtcommFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BtcommFactory eINSTANCE = net.sf.smbt.btcomm.impl.BtcommFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bluetooth Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bluetooth Port</em>'.
	 * @generated
	 */
	BluetoothPort createBluetoothPort();

	/**
	 * Returns a new object of class '<em>L2CAP In Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>L2CAP In Job</em>'.
	 * @generated
	 */
	L2CAPInJob createL2CAPInJob();

	/**
	 * Returns a new object of class '<em>L2CA Pout Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>L2CA Pout Job</em>'.
	 * @generated
	 */
	L2CAPoutJob createL2CAPoutJob();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BtcommPackage getBtcommPackage();

} //BtcommFactory
