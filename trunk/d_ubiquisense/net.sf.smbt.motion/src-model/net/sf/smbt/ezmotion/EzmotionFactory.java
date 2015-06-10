/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmotion;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezmotion.EzmotionPackage
 * @generated
 */
public interface EzmotionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzmotionFactory eINSTANCE = net.sf.smbt.ezmotion.impl.EzmotionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Motion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Motion</em>'.
	 * @generated
	 */
	Motion createMotion();

	/**
	 * Returns a new object of class '<em>Motion Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Motion Value</em>'.
	 * @generated
	 */
	MotionValue createMotionValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EzmotionPackage getEzmotionPackage();

} //EzmotionFactory
