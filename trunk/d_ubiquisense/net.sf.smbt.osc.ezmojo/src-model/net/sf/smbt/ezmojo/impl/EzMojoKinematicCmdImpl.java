/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmojo.impl;

import net.sf.smbt.ezmojo.EzMojoKinematicCmd;
import net.sf.smbt.ezmojo.EzmojoPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ez Mojo Kinematic Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EzMojoKinematicCmdImpl#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EzMojoKinematicCmdImpl extends EZMojoCmdImpl implements EzMojoKinematicCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EzMojoKinematicCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzmojoPackage.Literals.EZ_MOJO_KINEMATIC_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScript() {
		return (String)eGet(EzmojoPackage.Literals.EZ_MOJO_KINEMATIC_CMD__SCRIPT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScript(String newScript) {
		eSet(EzmojoPackage.Literals.EZ_MOJO_KINEMATIC_CMD__SCRIPT, newScript);
	}

} //EzMojoKinematicCmdImpl
