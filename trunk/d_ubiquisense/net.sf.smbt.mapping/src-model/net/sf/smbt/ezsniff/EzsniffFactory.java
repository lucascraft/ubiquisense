/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsniff;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezsniff.EzsniffPackage
 * @generated
 */
public interface EzsniffFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzsniffFactory eINSTANCE = net.sf.smbt.ezsniff.impl.EzsniffFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EZ Sniffer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EZ Sniffer</em>'.
	 * @generated
	 */
	EZSniffer createEZSniffer();

	/**
	 * Returns a new object of class '<em>EZ Sniff Protocol Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EZ Sniff Protocol Group</em>'.
	 * @generated
	 */
	EZSniffProtocolGroup createEZSniffProtocolGroup();

	/**
	 * Returns a new object of class '<em>EZ Sniff Hit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EZ Sniff Hit</em>'.
	 * @generated
	 */
	EZSniffHit createEZSniffHit();

	/**
	 * Returns a new object of class '<em>EZ Sniffer Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EZ Sniffer Manager</em>'.
	 * @generated
	 */
	EZSnifferManager createEZSnifferManager();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EzsniffPackage getEzsniffPackage();

} //EzsniffFactory
