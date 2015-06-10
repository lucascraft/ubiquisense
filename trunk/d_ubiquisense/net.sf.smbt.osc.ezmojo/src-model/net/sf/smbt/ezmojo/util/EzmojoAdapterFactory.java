/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmojo.util;

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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezmojo.EzmojoPackage
 * @generated
 */
public class EzmojoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzmojoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzmojoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EzmojoPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EzmojoSwitch<Adapter> modelSwitch =
		new EzmojoSwitch<Adapter>() {
			@Override
			public Adapter caseEZMojoNode(EZMojoNode object) {
				return createEZMojoNodeAdapter();
			}
			@Override
			public Adapter caseEZMojoCmd(EZMojoCmd object) {
				return createEZMojoCmdAdapter();
			}
			@Override
			public Adapter caseEZVar(EZVar object) {
				return createEZVarAdapter();
			}
			@Override
			public Adapter caseEZMojoRoot(EZMojoRoot object) {
				return createEZMojoRootAdapter();
			}
			@Override
			public Adapter caseEZMojoTarget(EZMojoTarget object) {
				return createEZMojoTargetAdapter();
			}
			@Override
			public Adapter caseEZMojoAgentCmd(EZMojoAgentCmd object) {
				return createEZMojoAgentCmdAdapter();
			}
			@Override
			public Adapter caseEzMojoInfoCmd(EzMojoInfoCmd object) {
				return createEzMojoInfoCmdAdapter();
			}
			@Override
			public Adapter caseEzMojoService(EzMojoService object) {
				return createEzMojoServiceAdapter();
			}
			@Override
			public Adapter caseEZMojoTargetedCmd(EZMojoTargetedCmd object) {
				return createEZMojoTargetedCmdAdapter();
			}
			@Override
			public Adapter caseMotionEvalCtx(MotionEvalCtx object) {
				return createMotionEvalCtxAdapter();
			}
			@Override
			public Adapter caseEZScript(EZScript object) {
				return createEZScriptAdapter();
			}
			@Override
			public Adapter caseEzMojoKinematicCmd(EzMojoKinematicCmd object) {
				return createEzMojoKinematicCmdAdapter();
			}
			@Override
			public Adapter caseEZTUIOVar(EZTUIOVar object) {
				return createEZTUIOVarAdapter();
			}
			@Override
			public Adapter caseEZMojoMappedCmd(EZMojoMappedCmd object) {
				return createEZMojoMappedCmdAdapter();
			}
			@Override
			public Adapter caseMotionReactor(MotionReactor object) {
				return createMotionReactorAdapter();
			}
			@Override
			public Adapter caseIndex2MojoNode(Map.Entry<String, EZMojoNode> object) {
				return createIndex2MojoNodeAdapter();
			}
			@Override
			public Adapter caseEZ(EZ object) {
				return createEZAdapter();
			}
			@Override
			public Adapter caseEZEvent(EZEvent object) {
				return createEZEventAdapter();
			}
			@Override
			public Adapter caseCmd(Cmd object) {
				return createCmdAdapter();
			}
			@Override
			public Adapter caseIConnectedUnit(IConnectedUnit object) {
				return createIConnectedUnitAdapter();
			}
			@Override
			public Adapter caseXCPAddress(XCPAddress object) {
				return createXCPAddressAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezmojo.EZMojoNode <em>EZ Mojo Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezmojo.EZMojoNode
	 * @generated
	 */
	public Adapter createEZMojoNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezmojo.EZMojoCmd <em>EZ Mojo Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezmojo.EZMojoCmd
	 * @generated
	 */
	public Adapter createEZMojoCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezmojo.EZVar <em>EZ Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezmojo.EZVar
	 * @generated
	 */
	public Adapter createEZVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezmojo.EZMojoRoot <em>EZ Mojo Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezmojo.EZMojoRoot
	 * @generated
	 */
	public Adapter createEZMojoRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezmojo.EZMojoTarget <em>EZ Mojo Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezmojo.EZMojoTarget
	 * @generated
	 */
	public Adapter createEZMojoTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezmojo.EZMojoAgentCmd <em>EZ Mojo Agent Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezmojo.EZMojoAgentCmd
	 * @generated
	 */
	public Adapter createEZMojoAgentCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezmojo.EzMojoInfoCmd <em>Ez Mojo Info Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezmojo.EzMojoInfoCmd
	 * @generated
	 */
	public Adapter createEzMojoInfoCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezmojo.EzMojoService <em>Ez Mojo Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezmojo.EzMojoService
	 * @generated
	 */
	public Adapter createEzMojoServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezmojo.EZMojoTargetedCmd <em>EZ Mojo Targeted Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezmojo.EZMojoTargetedCmd
	 * @generated
	 */
	public Adapter createEZMojoTargetedCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezmojo.MotionEvalCtx <em>Motion Eval Ctx</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezmojo.MotionEvalCtx
	 * @generated
	 */
	public Adapter createMotionEvalCtxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezmojo.EZScript <em>EZ Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezmojo.EZScript
	 * @generated
	 */
	public Adapter createEZScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezmojo.EzMojoKinematicCmd <em>Ez Mojo Kinematic Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezmojo.EzMojoKinematicCmd
	 * @generated
	 */
	public Adapter createEzMojoKinematicCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezmojo.EZTUIOVar <em>EZTUIO Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezmojo.EZTUIOVar
	 * @generated
	 */
	public Adapter createEZTUIOVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezmojo.EZMojoMappedCmd <em>EZ Mojo Mapped Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezmojo.EZMojoMappedCmd
	 * @generated
	 */
	public Adapter createEZMojoMappedCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezmojo.MotionReactor <em>Motion Reactor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezmojo.MotionReactor
	 * @generated
	 */
	public Adapter createMotionReactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Index2 Mojo Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createIndex2MojoNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezmojo.EZ <em>EZ</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezmojo.EZ
	 * @generated
	 */
	public Adapter createEZAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezmojo.EZEvent <em>EZ Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezmojo.EZEvent
	 * @generated
	 */
	public Adapter createEZEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.xqz.model.cmd.Cmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.xqz.model.cmd.Cmd
	 * @generated
	 */
	public Adapter createCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.xqz.model.engine.IConnectedUnit <em>IConnected Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.xqz.model.engine.IConnectedUnit
	 * @generated
	 */
	public Adapter createIConnectedUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.xcp.XCPAddress <em>XCP Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.xcp.XCPAddress
	 * @generated
	 */
	public Adapter createXCPAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EzmojoAdapterFactory
