/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.at.atcmdset;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.at.atcmdset.AtcmdsetPackage
 * @generated
 */
public interface AtcmdsetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtcmdsetFactory eINSTANCE = net.sf.smbt.at.atcmdset.impl.AtcmdsetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>AT Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AT Cmd</em>'.
	 * @generated
	 */
	ATCmd createATCmd();

	/**
	 * Returns a new object of class '<em>AT Ret Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AT Ret Cmd</em>'.
	 * @generated
	 */
	ATRetCmd createATRetCmd();

	/**
	 * Returns a new object of class '<em>AT Plus Plus Plus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AT Plus Plus Plus</em>'.
	 * @generated
	 */
	ATPlusPlusPlus createATPlusPlusPlus();

	/**
	 * Returns a new object of class '<em>ATBD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ATBD</em>'.
	 * @generated
	 */
	ATBD createATBD();

	/**
	 * Returns a new object of class '<em>ATWR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ATWR</em>'.
	 * @generated
	 */
	ATWR createATWR();

	/**
	 * Returns a new object of class '<em>ATCN</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ATCN</em>'.
	 * @generated
	 */
	ATCN createATCN();

	/**
	 * Returns a new object of class '<em>ATID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ATID</em>'.
	 * @generated
	 */
	ATID createATID();

	/**
	 * Returns a new object of class '<em>ATMY</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ATMY</em>'.
	 * @generated
	 */
	ATMY createATMY();

	/**
	 * Returns a new object of class '<em>ATDL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ATDL</em>'.
	 * @generated
	 */
	ATDL createATDL();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AtcmdsetPackage getAtcmdsetPackage();

} //AtcmdsetFactory
