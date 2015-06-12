/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.thingmcfg;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.thingmcfg.ThingmcfgPackage
 * @generated
 */
public interface ThingmcfgFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ThingmcfgFactory eINSTANCE = net.sf.smbt.thingmcfg.impl.ThingmcfgFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Thing MCfg</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thing MCfg</em>'.
	 * @generated
	 */
	ThingMCfg createThingMCfg();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ThingmcfgPackage getThingmcfgPackage();

} //ThingmcfgFactory
