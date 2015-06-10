/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmojo.util;

import java.util.List;
import java.util.Map;

import net.sf.smbt.ezmojo.*;
import net.sf.smbt.ezmojo.EZMojoAgentCmd;
import net.sf.smbt.ezmojo.EZMojoCmd;
import net.sf.smbt.ezmojo.EZMojoMappedCmd;
import net.sf.smbt.ezmojo.EZMojoNode;
import net.sf.smbt.ezmojo.EZMojoRoot;
import net.sf.smbt.ezmojo.EZMojoTarget;
import net.sf.smbt.ezmojo.EZMojoTargetedCmd;
import net.sf.smbt.ezmojo.EZTUIOVar;
import net.sf.smbt.ezmojo.EZVar;
import net.sf.smbt.ezmojo.EzMojoInfoCmd;
import net.sf.smbt.ezmojo.EzMojoKinematicCmd;
import net.sf.smbt.ezmojo.EzMojoService;
import net.sf.smbt.ezmojo.EzmojoPackage;
import net.sf.smbt.ezmojo.MotionEvalCtx;
import net.sf.smbt.ezmojo.MotionReactor;
import net.sf.smbt.ezmojo.ScriptEval;
import net.sf.smbt.xcp.XCPAddress;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.IConnectedUnit;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezmojo.EzmojoPackage
 * @generated
 */
public class EzmojoSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzmojoPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzmojoSwitch() {
		if (modelPackage == null) {
			modelPackage = EzmojoPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EzmojoPackage.EZ_MOJO_NODE: {
				EZMojoNode ezMojoNode = (EZMojoNode)theEObject;
				T result = caseEZMojoNode(ezMojoNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmojoPackage.EZ_MOJO_CMD: {
				EZMojoCmd ezMojoCmd = (EZMojoCmd)theEObject;
				T result = caseEZMojoCmd(ezMojoCmd);
				if (result == null) result = caseCmd(ezMojoCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmojoPackage.EZ_VAR: {
				EZVar ezVar = (EZVar)theEObject;
				T result = caseEZVar(ezVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmojoPackage.EZ_MOJO_ROOT: {
				EZMojoRoot ezMojoRoot = (EZMojoRoot)theEObject;
				T result = caseEZMojoRoot(ezMojoRoot);
				if (result == null) result = caseIConnectedUnit(ezMojoRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmojoPackage.EZ_MOJO_TARGET: {
				EZMojoTarget ezMojoTarget = (EZMojoTarget)theEObject;
				T result = caseEZMojoTarget(ezMojoTarget);
				if (result == null) result = caseXCPAddress(ezMojoTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmojoPackage.EZ_MOJO_AGENT_CMD: {
				EZMojoAgentCmd ezMojoAgentCmd = (EZMojoAgentCmd)theEObject;
				T result = caseEZMojoAgentCmd(ezMojoAgentCmd);
				if (result == null) result = caseEZMojoCmd(ezMojoAgentCmd);
				if (result == null) result = caseCmd(ezMojoAgentCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmojoPackage.EZ_MOJO_INFO_CMD: {
				EzMojoInfoCmd ezMojoInfoCmd = (EzMojoInfoCmd)theEObject;
				T result = caseEzMojoInfoCmd(ezMojoInfoCmd);
				if (result == null) result = caseCmd(ezMojoInfoCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmojoPackage.EZ_MOJO_SERVICE: {
				EzMojoService ezMojoService = (EzMojoService)theEObject;
				T result = caseEzMojoService(ezMojoService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmojoPackage.EZ_MOJO_TARGETED_CMD: {
				EZMojoTargetedCmd ezMojoTargetedCmd = (EZMojoTargetedCmd)theEObject;
				T result = caseEZMojoTargetedCmd(ezMojoTargetedCmd);
				if (result == null) result = caseEZMojoCmd(ezMojoTargetedCmd);
				if (result == null) result = caseCmd(ezMojoTargetedCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmojoPackage.MOTION_EVAL_CTX: {
				MotionEvalCtx motionEvalCtx = (MotionEvalCtx)theEObject;
				T result = caseMotionEvalCtx(motionEvalCtx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmojoPackage.EZ_SCRIPT: {
				EZScript ezScript = (EZScript)theEObject;
				T result = caseEZScript(ezScript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmojoPackage.EZ_MOJO_KINEMATIC_CMD: {
				EzMojoKinematicCmd ezMojoKinematicCmd = (EzMojoKinematicCmd)theEObject;
				T result = caseEzMojoKinematicCmd(ezMojoKinematicCmd);
				if (result == null) result = caseEZMojoCmd(ezMojoKinematicCmd);
				if (result == null) result = caseCmd(ezMojoKinematicCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmojoPackage.EZTUIO_VAR: {
				EZTUIOVar eztuioVar = (EZTUIOVar)theEObject;
				T result = caseEZTUIOVar(eztuioVar);
				if (result == null) result = caseEZVar(eztuioVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmojoPackage.EZ_MOJO_MAPPED_CMD: {
				EZMojoMappedCmd ezMojoMappedCmd = (EZMojoMappedCmd)theEObject;
				T result = caseEZMojoMappedCmd(ezMojoMappedCmd);
				if (result == null) result = caseEZMojoCmd(ezMojoMappedCmd);
				if (result == null) result = caseCmd(ezMojoMappedCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmojoPackage.MOTION_REACTOR: {
				MotionReactor motionReactor = (MotionReactor)theEObject;
				T result = caseMotionReactor(motionReactor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmojoPackage.INDEX2_MOJO_NODE: {
				@SuppressWarnings("unchecked") Map.Entry<String, EZMojoNode> index2MojoNode = (Map.Entry<String, EZMojoNode>)theEObject;
				T result = caseIndex2MojoNode(index2MojoNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmojoPackage.EZ: {
				EZ ez = (EZ)theEObject;
				T result = caseEZ(ez);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzmojoPackage.EZ_EVENT: {
				EZEvent ezEvent = (EZEvent)theEObject;
				T result = caseEZEvent(ezEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EZ Mojo Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EZ Mojo Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEZMojoNode(EZMojoNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EZ Mojo Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EZ Mojo Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEZMojoCmd(EZMojoCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EZ Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EZ Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEZVar(EZVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EZ Mojo Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EZ Mojo Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEZMojoRoot(EZMojoRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EZ Mojo Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EZ Mojo Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEZMojoTarget(EZMojoTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EZ Mojo Agent Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EZ Mojo Agent Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEZMojoAgentCmd(EZMojoAgentCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ez Mojo Info Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ez Mojo Info Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEzMojoInfoCmd(EzMojoInfoCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ez Mojo Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ez Mojo Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEzMojoService(EzMojoService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EZ Mojo Targeted Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EZ Mojo Targeted Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEZMojoTargetedCmd(EZMojoTargetedCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Motion Eval Ctx</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Motion Eval Ctx</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMotionEvalCtx(MotionEvalCtx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EZ Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EZ Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEZScript(EZScript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ez Mojo Kinematic Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ez Mojo Kinematic Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEzMojoKinematicCmd(EzMojoKinematicCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EZTUIO Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EZTUIO Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEZTUIOVar(EZTUIOVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EZ Mojo Mapped Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EZ Mojo Mapped Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEZMojoMappedCmd(EZMojoMappedCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Motion Reactor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Motion Reactor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMotionReactor(MotionReactor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index2 Mojo Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index2 Mojo Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndex2MojoNode(Map.Entry<String, EZMojoNode> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EZ</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EZ</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEZ(EZ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EZ Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EZ Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEZEvent(EZEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmd(Cmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IConnected Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IConnected Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIConnectedUnit(IConnectedUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XCP Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XCP Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXCPAddress(XCPAddress object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EzmojoSwitch
