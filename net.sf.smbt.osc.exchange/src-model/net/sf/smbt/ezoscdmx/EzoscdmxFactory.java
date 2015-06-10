/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezoscdmx;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezoscdmx.EzoscdmxPackage
 * @generated
 */
public interface EzoscdmxFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzoscdmxFactory eINSTANCE = net.sf.smbt.ezoscdmx.impl.EzoscdmxFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Osc Dmx Fade To RGB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Osc Dmx Fade To RGB</em>'.
	 * @generated
	 */
	OscDmxFadeToRGB createOscDmxFadeToRGB();

	/**
	 * Returns a new object of class '<em>Osc Dmx Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Osc Dmx Cmd</em>'.
	 * @generated
	 */
	OscDmxCmd createOscDmxCmd();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EzoscdmxPackage getEzoscdmxPackage();

} //EzoscdmxFactory
