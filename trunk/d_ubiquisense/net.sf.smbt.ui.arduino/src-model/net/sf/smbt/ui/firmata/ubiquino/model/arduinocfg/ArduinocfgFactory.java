/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinocfgPackage
 * @generated
 */
public interface ArduinocfgFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArduinocfgFactory eINSTANCE = net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.impl.ArduinocfgFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Arduino Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arduino Config</em>'.
	 * @generated
	 */
	ArduinoConfig createArduinoConfig();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ArduinocfgPackage getArduinocfgPackage();

} //ArduinocfgFactory
