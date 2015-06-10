/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.json.ecore.ezjson;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.json.ecore.ezjson.EzjsonPackage
 * @generated
 */
public interface EzjsonFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzjsonFactory eINSTANCE = net.sf.smbt.json.ecore.ezjson.impl.EzjsonFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Json Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Json Cmd</em>'.
	 * @generated
	 */
	JsonCmd createJsonCmd();

	/**
	 * Returns a new object of class '<em>In JSon Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In JSon Cmd</em>'.
	 * @generated
	 */
	InJSonCmd createInJSonCmd();

	/**
	 * Returns a new object of class '<em>Out Json Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Out Json Cmd</em>'.
	 * @generated
	 */
	OutJsonCmd createOutJsonCmd();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EzjsonPackage getEzjsonPackage();

} //EzjsonFactory
