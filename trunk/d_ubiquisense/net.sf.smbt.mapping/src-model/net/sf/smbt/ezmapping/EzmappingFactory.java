/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmapping;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezmapping.EzmappingPackage
 * @generated
 */
public interface EzmappingFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzmappingFactory eINSTANCE = net.sf.smbt.ezmapping.impl.EzmappingFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EZ Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EZ Mapping</em>'.
	 * @generated
	 */
	EZMapping createEZMapping();

	/**
	 * Returns a new object of class '<em>EZ Mapping Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EZ Mapping Manager</em>'.
	 * @generated
	 */
	EZMappingManager createEZMappingManager();

	/**
	 * Returns a new object of class '<em>EZ Mapping Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EZ Mapping Category</em>'.
	 * @generated
	 */
	EZMappingCategory createEZMappingCategory();

	/**
	 * Returns a new object of class '<em>Abstract EZ Mapping Elem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract EZ Mapping Elem</em>'.
	 * @generated
	 */
	AbstractEZMappingElem createAbstractEZMappingElem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EzmappingPackage getEzmappingPackage();

} //EzmappingFactory
