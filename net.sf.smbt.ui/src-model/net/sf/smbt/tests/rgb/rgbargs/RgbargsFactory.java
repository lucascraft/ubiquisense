/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.tests.rgb.rgbargs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.tests.rgb.rgbargs.RgbargsPackage
 * @generated
 */
public interface RgbargsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RgbargsFactory eINSTANCE = net.sf.smbt.tests.rgb.rgbargs.impl.RgbargsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>RGB Step NDelay Args</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RGB Step NDelay Args</em>'.
	 * @generated
	 */
	RGBStepNDelayArgs createRGBStepNDelayArgs();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RgbargsPackage getRgbargsPackage();

} //RgbargsFactory
