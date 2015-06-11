/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.firmata.ubiquino;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.firmata.ubiquino.UbiquinoPackage
 * @generated
 */
public interface UbiquinoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UbiquinoFactory eINSTANCE = net.sf.smbt.firmata.ubiquino.impl.UbiquinoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ubiquino</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ubiquino</em>'.
	 * @generated
	 */
	Ubiquino createUbiquino();

	/**
	 * Returns a new object of class '<em>Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Config</em>'.
	 * @generated
	 */
	UbiquinoConfig createUbiquinoConfig();

	/**
	 * Returns a new object of class '<em>Port Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Config</em>'.
	 * @generated
	 */
	PortConfig createPortConfig();

	/**
	 * Returns a new object of class '<em>Port Sampler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Sampler</em>'.
	 * @generated
	 */
	PortSampler createPortSampler();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UbiquinoPackage getUbiquinoPackage();

} //UbiquinoFactory
