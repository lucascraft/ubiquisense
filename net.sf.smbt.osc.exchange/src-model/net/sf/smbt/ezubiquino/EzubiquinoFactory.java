/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezubiquino;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezubiquino.EzubiquinoPackage
 * @generated
 */
public interface EzubiquinoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzubiquinoFactory eINSTANCE = net.sf.smbt.ezubiquino.impl.EzubiquinoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Osc Ubiquino Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Osc Ubiquino Cmd</em>'.
	 * @generated
	 */
	OscUbiquinoCmd createOscUbiquinoCmd();

	/**
	 * Returns a new object of class '<em>Osc Firmata Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Osc Firmata Cmd</em>'.
	 * @generated
	 */
	OscFirmataCmd createOscFirmataCmd();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EzubiquinoPackage getEzubiquinoPackage();

} //EzubiquinoFactory
