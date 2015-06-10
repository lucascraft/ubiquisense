/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.rawcomm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.rawcomm.RawcommPackage
 * @generated
 */
public interface RawcommFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RawcommFactory eINSTANCE = net.sf.smbt.rawcomm.impl.RawcommFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Raw Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Raw Cmd</em>'.
	 * @generated
	 */
	RawCmd createRawCmd();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RawcommPackage getRawcommPackage();

} //RawcommFactory
