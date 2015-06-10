/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmojo.impl;

import java.util.Map;

import net.sf.smbt.ezmojo.*;
import net.sf.smbt.ezmojo.EZCmdKind;
import net.sf.smbt.ezmojo.EZMojoAgentCmd;
import net.sf.smbt.ezmojo.EZMojoCmd;
import net.sf.smbt.ezmojo.EZMojoKind;
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
import net.sf.smbt.ezmojo.EzVarKind;
import net.sf.smbt.ezmojo.EzmojoFactory;
import net.sf.smbt.ezmojo.EzmojoPackage;
import net.sf.smbt.ezmojo.MotionEvalCtx;
import net.sf.smbt.ezmojo.MotionEvalStrategy;
import net.sf.smbt.ezmojo.MotionReactor;
import net.sf.smbt.ezmojo.ScriptEval;
import net.sf.smbt.motion.engine.MotionEngine;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzmojoFactoryImpl extends EFactoryImpl implements EzmojoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EzmojoFactory init() {
		try {
			EzmojoFactory theEzmojoFactory = (EzmojoFactory)EPackage.Registry.INSTANCE.getEFactory("http://ezmojo/1.0"); 
			if (theEzmojoFactory != null) {
				return theEzmojoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EzmojoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzmojoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EzmojoPackage.EZ_MOJO_NODE: return createEZMojoNode();
			case EzmojoPackage.EZ_MOJO_CMD: return createEZMojoCmd();
			case EzmojoPackage.EZ_VAR: return createEZVar();
			case EzmojoPackage.EZ_MOJO_ROOT: return createEZMojoRoot();
			case EzmojoPackage.EZ_MOJO_TARGET: return createEZMojoTarget();
			case EzmojoPackage.EZ_MOJO_AGENT_CMD: return createEZMojoAgentCmd();
			case EzmojoPackage.EZ_MOJO_INFO_CMD: return createEzMojoInfoCmd();
			case EzmojoPackage.EZ_MOJO_SERVICE: return createEzMojoService();
			case EzmojoPackage.EZ_MOJO_TARGETED_CMD: return createEZMojoTargetedCmd();
			case EzmojoPackage.MOTION_EVAL_CTX: return createMotionEvalCtx();
			case EzmojoPackage.EZ_SCRIPT: return createEZScript();
			case EzmojoPackage.EZ_MOJO_KINEMATIC_CMD: return createEzMojoKinematicCmd();
			case EzmojoPackage.EZTUIO_VAR: return createEZTUIOVar();
			case EzmojoPackage.EZ_MOJO_MAPPED_CMD: return createEZMojoMappedCmd();
			case EzmojoPackage.MOTION_REACTOR: return createMotionReactor();
			case EzmojoPackage.INDEX2_MOJO_NODE: return (EObject)createIndex2MojoNode();
			case EzmojoPackage.EZ: return createEZ();
			case EzmojoPackage.EZ_EVENT: return createEZEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EzmojoPackage.EZ_MOJO_KIND:
				return createEZMojoKindFromString(eDataType, initialValue);
			case EzmojoPackage.EZ_CMD_KIND:
				return createEZCmdKindFromString(eDataType, initialValue);
			case EzmojoPackage.MOTION_EVAL_STRATEGY:
				return createMotionEvalStrategyFromString(eDataType, initialValue);
			case EzmojoPackage.EZ_VAR_KIND:
				return createEzVarKindFromString(eDataType, initialValue);
			case EzmojoPackage.MOTION_ENGINE:
				return createMotionEngineFromString(eDataType, initialValue);
			case EzmojoPackage.JOB:
				return createJobFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EzmojoPackage.EZ_MOJO_KIND:
				return convertEZMojoKindToString(eDataType, instanceValue);
			case EzmojoPackage.EZ_CMD_KIND:
				return convertEZCmdKindToString(eDataType, instanceValue);
			case EzmojoPackage.MOTION_EVAL_STRATEGY:
				return convertMotionEvalStrategyToString(eDataType, instanceValue);
			case EzmojoPackage.EZ_VAR_KIND:
				return convertEzVarKindToString(eDataType, instanceValue);
			case EzmojoPackage.MOTION_ENGINE:
				return convertMotionEngineToString(eDataType, instanceValue);
			case EzmojoPackage.JOB:
				return convertJobToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZMojoNode createEZMojoNode() {
		EZMojoNodeImpl ezMojoNode = new EZMojoNodeImpl();
		return ezMojoNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZMojoCmd createEZMojoCmd() {
		EZMojoCmdImpl ezMojoCmd = new EZMojoCmdImpl();
		return ezMojoCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZVar createEZVar() {
		EZVarImpl ezVar = new EZVarImpl();
		return ezVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EZMojoRoot createEZMojoRoot() {
		EZMojoRootImpl ezMojoRoot = new EZMojoRootImpl();
		ezMojoRoot.eSet(EzmojoPackage.Literals.EZ_MOJO_ROOT__INDEX, new BasicEMap<String, EZMojoNode>(50));
		return ezMojoRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZMojoTarget createEZMojoTarget() {
		EZMojoTargetImpl ezMojoTarget = new EZMojoTargetImpl();
		return ezMojoTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZMojoAgentCmd createEZMojoAgentCmd() {
		EZMojoAgentCmdImpl ezMojoAgentCmd = new EZMojoAgentCmdImpl();
		return ezMojoAgentCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzMojoInfoCmd createEzMojoInfoCmd() {
		EzMojoInfoCmdImpl ezMojoInfoCmd = new EzMojoInfoCmdImpl();
		return ezMojoInfoCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzMojoService createEzMojoService() {
		EzMojoServiceImpl ezMojoService = new EzMojoServiceImpl();
		return ezMojoService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZMojoTargetedCmd createEZMojoTargetedCmd() {
		EZMojoTargetedCmdImpl ezMojoTargetedCmd = new EZMojoTargetedCmdImpl();
		return ezMojoTargetedCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotionEvalCtx createMotionEvalCtx() {
		MotionEvalCtxImpl motionEvalCtx = new MotionEvalCtxImpl();
		return motionEvalCtx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZScript createEZScript() {
		EZScriptImpl ezScript = new EZScriptImpl();
		return ezScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzMojoKinematicCmd createEzMojoKinematicCmd() {
		EzMojoKinematicCmdImpl ezMojoKinematicCmd = new EzMojoKinematicCmdImpl();
		return ezMojoKinematicCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZTUIOVar createEZTUIOVar() {
		EZTUIOVarImpl eztuioVar = new EZTUIOVarImpl();
		return eztuioVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZMojoMappedCmd createEZMojoMappedCmd() {
		EZMojoMappedCmdImpl ezMojoMappedCmd = new EZMojoMappedCmdImpl();
		return ezMojoMappedCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotionReactor createMotionReactor() {
		MotionReactorImpl motionReactor = new MotionReactorImpl();
		return motionReactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, EZMojoNode> createIndex2MojoNode() {
		Index2MojoNodeImpl index2MojoNode = new Index2MojoNodeImpl();
		return index2MojoNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZ createEZ() {
		EZImpl ez = new EZImpl();
		return ez;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZEvent createEZEvent() {
		EZEventImpl ezEvent = new EZEventImpl();
		return ezEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZMojoKind createEZMojoKindFromString(EDataType eDataType, String initialValue) {
		EZMojoKind result = EZMojoKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEZMojoKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZCmdKind createEZCmdKindFromString(EDataType eDataType, String initialValue) {
		EZCmdKind result = EZCmdKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEZCmdKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotionEvalStrategy createMotionEvalStrategyFromString(EDataType eDataType, String initialValue) {
		MotionEvalStrategy result = MotionEvalStrategy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMotionEvalStrategyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzVarKind createEzVarKindFromString(EDataType eDataType, String initialValue) {
		EzVarKind result = EzVarKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEzVarKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotionEngine createMotionEngineFromString(EDataType eDataType, String initialValue) {
		return (MotionEngine)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMotionEngineToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Job createJobFromString(EDataType eDataType, String initialValue) {
		return (Job)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJobToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzmojoPackage getEzmojoPackage() {
		return (EzmojoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EzmojoPackage getPackage() {
		return EzmojoPackage.eINSTANCE;
	}

} //EzmojoFactoryImpl
