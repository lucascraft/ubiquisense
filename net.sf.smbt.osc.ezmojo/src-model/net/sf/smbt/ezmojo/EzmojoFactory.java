/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmojo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezmojo.EzmojoPackage
 * @generated
 */
public interface EzmojoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzmojoFactory eINSTANCE = net.sf.smbt.ezmojo.impl.EzmojoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EZ Mojo Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EZ Mojo Node</em>'.
	 * @generated
	 */
	EZMojoNode createEZMojoNode();

	/**
	 * Returns a new object of class '<em>EZ Mojo Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EZ Mojo Cmd</em>'.
	 * @generated
	 */
	EZMojoCmd createEZMojoCmd();

	/**
	 * Returns a new object of class '<em>EZ Var</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EZ Var</em>'.
	 * @generated
	 */
	EZVar createEZVar();

	/**
	 * Returns a new object of class '<em>EZ Mojo Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EZ Mojo Root</em>'.
	 * @generated
	 */
	EZMojoRoot createEZMojoRoot();

	/**
	 * Returns a new object of class '<em>EZ Mojo Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EZ Mojo Target</em>'.
	 * @generated
	 */
	EZMojoTarget createEZMojoTarget();

	/**
	 * Returns a new object of class '<em>EZ Mojo Agent Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EZ Mojo Agent Cmd</em>'.
	 * @generated
	 */
	EZMojoAgentCmd createEZMojoAgentCmd();

	/**
	 * Returns a new object of class '<em>Ez Mojo Info Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ez Mojo Info Cmd</em>'.
	 * @generated
	 */
	EzMojoInfoCmd createEzMojoInfoCmd();

	/**
	 * Returns a new object of class '<em>Ez Mojo Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ez Mojo Service</em>'.
	 * @generated
	 */
	EzMojoService createEzMojoService();

	/**
	 * Returns a new object of class '<em>EZ Mojo Targeted Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EZ Mojo Targeted Cmd</em>'.
	 * @generated
	 */
	EZMojoTargetedCmd createEZMojoTargetedCmd();

	/**
	 * Returns a new object of class '<em>Motion Eval Ctx</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Motion Eval Ctx</em>'.
	 * @generated
	 */
	MotionEvalCtx createMotionEvalCtx();

	/**
	 * Returns a new object of class '<em>EZ Script</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EZ Script</em>'.
	 * @generated
	 */
	EZScript createEZScript();

	/**
	 * Returns a new object of class '<em>Ez Mojo Kinematic Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ez Mojo Kinematic Cmd</em>'.
	 * @generated
	 */
	EzMojoKinematicCmd createEzMojoKinematicCmd();

	/**
	 * Returns a new object of class '<em>EZTUIO Var</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EZTUIO Var</em>'.
	 * @generated
	 */
	EZTUIOVar createEZTUIOVar();

	/**
	 * Returns a new object of class '<em>EZ Mojo Mapped Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EZ Mojo Mapped Cmd</em>'.
	 * @generated
	 */
	EZMojoMappedCmd createEZMojoMappedCmd();

	/**
	 * Returns a new object of class '<em>Motion Reactor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Motion Reactor</em>'.
	 * @generated
	 */
	MotionReactor createMotionReactor();

	/**
	 * Returns a new object of class '<em>EZ</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EZ</em>'.
	 * @generated
	 */
	EZ createEZ();

	/**
	 * Returns a new object of class '<em>EZ Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EZ Event</em>'.
	 * @generated
	 */
	EZEvent createEZEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EzmojoPackage getEzmojoPackage();

} //EzmojoFactory
