/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezoscthingm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezoscthingm.EzoscthingmPackage
 * @generated
 */
public interface EzoscthingmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzoscthingmFactory eINSTANCE = net.sf.smbt.ezoscthingm.impl.EzoscthingmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Thing MOsc Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thing MOsc Cmd</em>'.
	 * @generated
	 */
	ThingMOscCmd createThingMOscCmd();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EzoscthingmPackage getEzoscthingmPackage();

} //EzoscthingmFactory
