/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmojo.impl;

import java.util.Map;

import net.sf.smbt.comm.script.netConf.NetConfPackage;
import net.sf.smbt.ezmojo.EZCmdKind;
import net.sf.smbt.ezmojo.EZEvent;
import net.sf.smbt.ezmojo.EZMojoAgentCmd;
import net.sf.smbt.ezmojo.EZMojoCmd;
import net.sf.smbt.ezmojo.EZMojoKind;
import net.sf.smbt.ezmojo.EZMojoMappedCmd;
import net.sf.smbt.ezmojo.EZMojoNode;
import net.sf.smbt.ezmojo.EZMojoRoot;
import net.sf.smbt.ezmojo.EZMojoTarget;
import net.sf.smbt.ezmojo.EZMojoTargetedCmd;
import net.sf.smbt.ezmojo.EZScript;
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
import net.sf.smbt.ezmotion.EzmotionPackage;
import net.sf.smbt.motion.engine.MotionEngine;
import net.sf.smbt.osc.eztuio2.Eztuio2Package;
import net.sf.smbt.osccmd.OsccmdPackage;
import net.sf.smbt.xcp.XcpPackage;
import net.sf.xqz.engine.script.orchestror.OrchestrorPackage;
import net.sf.xqz.model.cmd.CmdPackage;
import net.sf.xqz.model.engine.EnginePackage;

import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzmojoPackageImpl extends EPackageImpl implements EzmojoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezMojoNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezMojoCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezMojoRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezMojoTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezMojoAgentCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezMojoInfoCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezMojoServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezMojoTargetedCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motionEvalCtxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezScriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezMojoKinematicCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eztuioVarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezMojoMappedCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motionReactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass index2MojoNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ezMojoKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ezCmdKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum motionEvalStrategyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ezVarKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType motionEngineEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType jobEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.sf.smbt.ezmojo.EzmojoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EzmojoPackageImpl() {
		super(eNS_URI, EzmojoFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EzmojoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EzmojoPackage init() {
		if (isInited) return (EzmojoPackage)EPackage.Registry.INSTANCE.getEPackage(EzmojoPackage.eNS_URI);

		// Obtain or create and register package
		EzmojoPackageImpl theEzmojoPackage = (EzmojoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EzmojoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EzmojoPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XcpPackage.eINSTANCE.eClass();
		Eztuio2Package.eINSTANCE.eClass();
		EzmotionPackage.eINSTANCE.eClass();
		EnginePackage.eINSTANCE.eClass();
		OrchestrorPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEzmojoPackage.createPackageContents();

		// Initialize created meta-data
		theEzmojoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEzmojoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EzmojoPackage.eNS_URI, theEzmojoPackage);
		return theEzmojoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEZMojoNode() {
		return ezMojoNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZMojoNode_Vars() {
		return (EReference)ezMojoNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZMojoNode_Elements() {
		return (EReference)ezMojoNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZMojoNode_Ttl() {
		return (EAttribute)ezMojoNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZMojoNode_Token() {
		return (EAttribute)ezMojoNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZMojoNode_Uuid() {
		return (EAttribute)ezMojoNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZMojoNode_Service() {
		return (EReference)ezMojoNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZMojoNode_Toggle() {
		return (EAttribute)ezMojoNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZMojoNode_LastBang() {
		return (EAttribute)ezMojoNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZMojoNode_Listeners() {
		return (EReference)ezMojoNodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZMojoNode_Forwards() {
		return (EReference)ezMojoNodeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZMojoNode_Motions() {
		return (EReference)ezMojoNodeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZMojoNode_Clock() {
		return (EAttribute)ezMojoNodeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZMojoNode_Root() {
		return (EReference)ezMojoNodeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZMojoNode_HitsRatePerSec() {
		return (EAttribute)ezMojoNodeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZMojoNode_Touches() {
		return (EAttribute)ezMojoNodeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZMojoNode_Scripts() {
		return (EReference)ezMojoNodeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEZMojoCmd() {
		return ezMojoCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZMojoCmd_Kind() {
		return (EAttribute)ezMojoCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZMojoCmd_Osc() {
		return (EReference)ezMojoCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZMojoCmd_Targets() {
		return (EReference)ezMojoCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZMojoCmd_Protocol() {
		return (EAttribute)ezMojoCmdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEZVar() {
		return ezVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZVar_Name() {
		return (EAttribute)ezVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZVar_Type() {
		return (EReference)ezVarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZVar_Value() {
		return (EAttribute)ezVarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZVar_Kind() {
		return (EAttribute)ezVarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEZMojoRoot() {
		return ezMojoRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZMojoRoot_Root() {
		return (EReference)ezMojoRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZMojoRoot_Selected() {
		return (EReference)ezMojoRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZMojoRoot_Targets() {
		return (EReference)ezMojoRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZMojoRoot_Feedback() {
		return (EAttribute)ezMojoRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZMojoRoot_MotionReactor() {
		return (EReference)ezMojoRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZMojoRoot_VarsMode() {
		return (EAttribute)ezMojoRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZMojoRoot_Index() {
		return (EReference)ezMojoRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEZMojoTarget() {
		return ezMojoTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZMojoTarget_Kind() {
		return (EAttribute)ezMojoTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZMojoTarget_Hierarchical() {
		return (EAttribute)ezMojoTargetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEZMojoAgentCmd() {
		return ezMojoAgentCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZMojoAgentCmd_Cmd() {
		return (EAttribute)ezMojoAgentCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZMojoAgentCmd_Text() {
		return (EAttribute)ezMojoAgentCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEzMojoInfoCmd() {
		return ezMojoInfoCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEzMojoInfoCmd_Text() {
		return (EAttribute)ezMojoInfoCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEzMojoService() {
		return ezMojoServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEzMojoService_ServiceID() {
		return (EAttribute)ezMojoServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEzMojoService_Excluded() {
		return (EAttribute)ezMojoServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEZMojoTargetedCmd() {
		return ezMojoTargetedCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotionEvalCtx() {
		return motionEvalCtxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotionEvalCtx_Ctx() {
		return (EReference)motionEvalCtxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotionEvalCtx_Kicked() {
		return (EReference)motionEvalCtxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotionEvalCtx_Script() {
		return (EReference)motionEvalCtxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotionEvalCtx_Node() {
		return (EReference)motionEvalCtxEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMotionEvalCtx_Cmd() {
		return (EReference)motionEvalCtxEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotionEvalCtx_Strategy() {
		return (EAttribute)motionEvalCtxEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEZScript() {
		return ezScriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZScript_Script() {
		return (EAttribute)ezScriptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZScript_Node() {
		return (EReference)ezScriptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZScript_Label() {
		return (EAttribute)ezScriptEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZScript_Events() {
		return (EReference)ezScriptEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEzMojoKinematicCmd() {
		return ezMojoKinematicCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEzMojoKinematicCmd_Script() {
		return (EAttribute)ezMojoKinematicCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEZTUIOVar() {
		return eztuioVarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZTUIOVar_Motion() {
		return (EReference)eztuioVarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZTUIOVar_B3d() {
		return (EReference)eztuioVarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEZMojoMappedCmd() {
		return ezMojoMappedCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZMojoMappedCmd_Alias() {
		return (EAttribute)ezMojoMappedCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotionReactor() {
		return motionReactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotionReactor_Job() {
		return (EAttribute)motionReactorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndex2MojoNode() {
		return index2MojoNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIndex2MojoNode_Key() {
		return (EAttribute)index2MojoNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndex2MojoNode_Value() {
		return (EReference)index2MojoNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEZ() {
		return ezEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZ_Configs() {
		return (EReference)ezEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEZEvent() {
		return ezEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEZEvent_Kind() {
		return (EAttribute)ezEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZEvent_Osc() {
		return (EReference)ezEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZEvent_Targets() {
		return (EReference)ezEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEZMojoKind() {
		return ezMojoKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEZCmdKind() {
		return ezCmdKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMotionEvalStrategy() {
		return motionEvalStrategyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEzVarKind() {
		return ezVarKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMotionEngine() {
		return motionEngineEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getJob() {
		return jobEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzmojoFactory getEzmojoFactory() {
		return (EzmojoFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ezMojoNodeEClass = createEClass(EZ_MOJO_NODE);
		createEReference(ezMojoNodeEClass, EZ_MOJO_NODE__VARS);
		createEReference(ezMojoNodeEClass, EZ_MOJO_NODE__ELEMENTS);
		createEAttribute(ezMojoNodeEClass, EZ_MOJO_NODE__TTL);
		createEAttribute(ezMojoNodeEClass, EZ_MOJO_NODE__TOKEN);
		createEAttribute(ezMojoNodeEClass, EZ_MOJO_NODE__UUID);
		createEReference(ezMojoNodeEClass, EZ_MOJO_NODE__SERVICE);
		createEAttribute(ezMojoNodeEClass, EZ_MOJO_NODE__TOGGLE);
		createEAttribute(ezMojoNodeEClass, EZ_MOJO_NODE__LAST_BANG);
		createEReference(ezMojoNodeEClass, EZ_MOJO_NODE__LISTENERS);
		createEReference(ezMojoNodeEClass, EZ_MOJO_NODE__FORWARDS);
		createEReference(ezMojoNodeEClass, EZ_MOJO_NODE__MOTIONS);
		createEAttribute(ezMojoNodeEClass, EZ_MOJO_NODE__CLOCK);
		createEReference(ezMojoNodeEClass, EZ_MOJO_NODE__ROOT);
		createEAttribute(ezMojoNodeEClass, EZ_MOJO_NODE__HITS_RATE_PER_SEC);
		createEAttribute(ezMojoNodeEClass, EZ_MOJO_NODE__TOUCHES);
		createEReference(ezMojoNodeEClass, EZ_MOJO_NODE__SCRIPTS);

		ezMojoCmdEClass = createEClass(EZ_MOJO_CMD);
		createEAttribute(ezMojoCmdEClass, EZ_MOJO_CMD__KIND);
		createEReference(ezMojoCmdEClass, EZ_MOJO_CMD__OSC);
		createEReference(ezMojoCmdEClass, EZ_MOJO_CMD__TARGETS);
		createEAttribute(ezMojoCmdEClass, EZ_MOJO_CMD__PROTOCOL);

		ezVarEClass = createEClass(EZ_VAR);
		createEAttribute(ezVarEClass, EZ_VAR__NAME);
		createEReference(ezVarEClass, EZ_VAR__TYPE);
		createEAttribute(ezVarEClass, EZ_VAR__VALUE);
		createEAttribute(ezVarEClass, EZ_VAR__KIND);

		ezMojoRootEClass = createEClass(EZ_MOJO_ROOT);
		createEReference(ezMojoRootEClass, EZ_MOJO_ROOT__ROOT);
		createEReference(ezMojoRootEClass, EZ_MOJO_ROOT__SELECTED);
		createEReference(ezMojoRootEClass, EZ_MOJO_ROOT__TARGETS);
		createEAttribute(ezMojoRootEClass, EZ_MOJO_ROOT__FEEDBACK);
		createEReference(ezMojoRootEClass, EZ_MOJO_ROOT__MOTION_REACTOR);
		createEAttribute(ezMojoRootEClass, EZ_MOJO_ROOT__VARS_MODE);
		createEReference(ezMojoRootEClass, EZ_MOJO_ROOT__INDEX);

		ezMojoTargetEClass = createEClass(EZ_MOJO_TARGET);
		createEAttribute(ezMojoTargetEClass, EZ_MOJO_TARGET__KIND);
		createEAttribute(ezMojoTargetEClass, EZ_MOJO_TARGET__HIERARCHICAL);

		ezMojoAgentCmdEClass = createEClass(EZ_MOJO_AGENT_CMD);
		createEAttribute(ezMojoAgentCmdEClass, EZ_MOJO_AGENT_CMD__CMD);
		createEAttribute(ezMojoAgentCmdEClass, EZ_MOJO_AGENT_CMD__TEXT);

		ezMojoInfoCmdEClass = createEClass(EZ_MOJO_INFO_CMD);
		createEAttribute(ezMojoInfoCmdEClass, EZ_MOJO_INFO_CMD__TEXT);

		ezMojoServiceEClass = createEClass(EZ_MOJO_SERVICE);
		createEAttribute(ezMojoServiceEClass, EZ_MOJO_SERVICE__SERVICE_ID);
		createEAttribute(ezMojoServiceEClass, EZ_MOJO_SERVICE__EXCLUDED);

		ezMojoTargetedCmdEClass = createEClass(EZ_MOJO_TARGETED_CMD);

		motionEvalCtxEClass = createEClass(MOTION_EVAL_CTX);
		createEReference(motionEvalCtxEClass, MOTION_EVAL_CTX__CTX);
		createEReference(motionEvalCtxEClass, MOTION_EVAL_CTX__KICKED);
		createEReference(motionEvalCtxEClass, MOTION_EVAL_CTX__SCRIPT);
		createEReference(motionEvalCtxEClass, MOTION_EVAL_CTX__NODE);
		createEReference(motionEvalCtxEClass, MOTION_EVAL_CTX__CMD);
		createEAttribute(motionEvalCtxEClass, MOTION_EVAL_CTX__STRATEGY);

		ezScriptEClass = createEClass(EZ_SCRIPT);
		createEAttribute(ezScriptEClass, EZ_SCRIPT__SCRIPT);
		createEReference(ezScriptEClass, EZ_SCRIPT__NODE);
		createEAttribute(ezScriptEClass, EZ_SCRIPT__LABEL);
		createEReference(ezScriptEClass, EZ_SCRIPT__EVENTS);

		ezMojoKinematicCmdEClass = createEClass(EZ_MOJO_KINEMATIC_CMD);
		createEAttribute(ezMojoKinematicCmdEClass, EZ_MOJO_KINEMATIC_CMD__SCRIPT);

		eztuioVarEClass = createEClass(EZTUIO_VAR);
		createEReference(eztuioVarEClass, EZTUIO_VAR__MOTION);
		createEReference(eztuioVarEClass, EZTUIO_VAR__B3D);

		ezMojoMappedCmdEClass = createEClass(EZ_MOJO_MAPPED_CMD);
		createEAttribute(ezMojoMappedCmdEClass, EZ_MOJO_MAPPED_CMD__ALIAS);

		motionReactorEClass = createEClass(MOTION_REACTOR);
		createEAttribute(motionReactorEClass, MOTION_REACTOR__JOB);

		index2MojoNodeEClass = createEClass(INDEX2_MOJO_NODE);
		createEAttribute(index2MojoNodeEClass, INDEX2_MOJO_NODE__KEY);
		createEReference(index2MojoNodeEClass, INDEX2_MOJO_NODE__VALUE);

		ezEClass = createEClass(EZ);
		createEReference(ezEClass, EZ__CONFIGS);

		ezEventEClass = createEClass(EZ_EVENT);
		createEAttribute(ezEventEClass, EZ_EVENT__KIND);
		createEReference(ezEventEClass, EZ_EVENT__OSC);
		createEReference(ezEventEClass, EZ_EVENT__TARGETS);

		// Create enums
		ezMojoKindEEnum = createEEnum(EZ_MOJO_KIND);
		ezCmdKindEEnum = createEEnum(EZ_CMD_KIND);
		motionEvalStrategyEEnum = createEEnum(MOTION_EVAL_STRATEGY);
		ezVarKindEEnum = createEEnum(EZ_VAR_KIND);

		// Create data types
		motionEngineEDataType = createEDataType(MOTION_ENGINE);
		jobEDataType = createEDataType(JOB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		EzmotionPackage theEzmotionPackage = (EzmotionPackage)EPackage.Registry.INSTANCE.getEPackage(EzmotionPackage.eNS_URI);
		EnginePackage theEnginePackage = (EnginePackage)EPackage.Registry.INSTANCE.getEPackage(EnginePackage.eNS_URI);
		CmdPackage theCmdPackage = (CmdPackage)EPackage.Registry.INSTANCE.getEPackage(CmdPackage.eNS_URI);
		OsccmdPackage theOsccmdPackage = (OsccmdPackage)EPackage.Registry.INSTANCE.getEPackage(OsccmdPackage.eNS_URI);
		XcpPackage theXcpPackage = (XcpPackage)EPackage.Registry.INSTANCE.getEPackage(XcpPackage.eNS_URI);
		Eztuio2Package theEztuio2Package = (Eztuio2Package)EPackage.Registry.INSTANCE.getEPackage(Eztuio2Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ezMojoCmdEClass.getESuperTypes().add(theCmdPackage.getCmd());
		ezMojoRootEClass.getESuperTypes().add(theEnginePackage.getIConnectedUnit());
		ezMojoTargetEClass.getESuperTypes().add(theXcpPackage.getXCPAddress());
		ezMojoAgentCmdEClass.getESuperTypes().add(this.getEZMojoCmd());
		ezMojoInfoCmdEClass.getESuperTypes().add(theCmdPackage.getCmd());
		ezMojoTargetedCmdEClass.getESuperTypes().add(this.getEZMojoCmd());
		ezMojoKinematicCmdEClass.getESuperTypes().add(this.getEZMojoCmd());
		eztuioVarEClass.getESuperTypes().add(this.getEZVar());
		ezMojoMappedCmdEClass.getESuperTypes().add(this.getEZMojoCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(ezMojoNodeEClass, EZMojoNode.class, "EZMojoNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEZMojoNode_Vars(), this.getEZVar(), null, "vars", null, 0, -1, EZMojoNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEZMojoNode_Elements(), this.getEZMojoNode(), null, "elements", null, 0, -1, EZMojoNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEZMojoNode_Ttl(), ecorePackage.getELong(), "ttl", null, 0, 1, EZMojoNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEZMojoNode_Token(), theEcorePackage.getEString(), "token", null, 0, 1, EZMojoNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEZMojoNode_Uuid(), theEcorePackage.getEString(), "uuid", null, 0, 1, EZMojoNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEZMojoNode_Service(), this.getEzMojoService(), null, "service", null, 0, 1, EZMojoNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEZMojoNode_Toggle(), ecorePackage.getEBoolean(), "toggle", "false", 0, 1, EZMojoNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEZMojoNode_LastBang(), theEcorePackage.getELong(), "lastBang", null, 0, 1, EZMojoNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEZMojoNode_Listeners(), this.getEZMojoTarget(), null, "listeners", null, 0, -1, EZMojoNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEZMojoNode_Forwards(), this.getEZMojoTarget(), null, "forwards", null, 0, -1, EZMojoNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEZMojoNode_Motions(), theEzmotionPackage.getMotion(), null, "motions", null, 0, -1, EZMojoNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEZMojoNode_Clock(), this.getMotionEngine(), "clock", null, 0, 1, EZMojoNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEZMojoNode_Root(), this.getEZMojoRoot(), this.getEZMojoRoot_Root(), "root", null, 0, 1, EZMojoNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEZMojoNode_HitsRatePerSec(), theEcorePackage.getEFloat(), "hitsRatePerSec", null, 0, 1, EZMojoNode.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEZMojoNode_Touches(), theEcorePackage.getELong(), "touches", null, 0, 1, EZMojoNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEZMojoNode_Scripts(), this.getEZScript(), this.getEZScript_Node(), "scripts", null, 0, -1, EZMojoNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(ezMojoNodeEClass, theEcorePackage.getEJavaObject(), "set", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "msg", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ezMojoNodeEClass, theEcorePackage.getEJavaObject(), "get", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "msg", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ezMojoNodeEClass, theEcorePackage.getEJavaObject(), "unset", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "msg", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ezMojoNodeEClass, theEcorePackage.getEJavaObject(), "query", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "msg", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ezMojoNodeEClass, theEcorePackage.getEJavaObject(), "bind", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "msg", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ezMojoNodeEClass, this.getEZMojoNode(), "listen", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "msg", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ezMojoNodeEClass, this.getEZMojoNode(), "unlisten", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "msg", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ezMojoNodeEClass, this.getEZMojoNode(), "forward", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "msg", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ezMojoNodeEClass, this.getEZMojoNode(), "unforward", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "msg", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ezMojoNodeEClass, null, "addTrigger", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "expr", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ezMojoNodeEClass, null, "addKinematics", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "expr", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(ezMojoNodeEClass, null, "removeTrigger", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(ezMojoNodeEClass, null, "removeKinematics", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(ezMojoNodeEClass, ecorePackage.getEBoolean(), "isService", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(ezMojoNodeEClass, ecorePackage.getEString(), "getAddr", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ezMojoNodeEClass, null, "bang", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMotionEvalCtx(), "motionVal", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ezMojoNodeEClass, theEnginePackage.getCmdPipe(), "getCompatibleCmdPipe", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "protocolID", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ezMojoCmdEClass, EZMojoCmd.class, "EZMojoCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEZMojoCmd_Kind(), this.getEZMojoKind(), "kind", null, 0, 1, EZMojoCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEZMojoCmd_Osc(), theOsccmdPackage.getOscCmd(), null, "osc", null, 0, 1, EZMojoCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEZMojoCmd_Targets(), this.getEZMojoTarget(), null, "targets", null, 0, -1, EZMojoCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEZMojoCmd_Protocol(), ecorePackage.getEString(), "protocol", null, 0, 1, EZMojoCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ezVarEClass, EZVar.class, "EZVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEZVar_Name(), ecorePackage.getEString(), "name", null, 0, 1, EZVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEZVar_Type(), theEcorePackage.getETypedElement(), null, "type", null, 0, 1, EZVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEZVar_Value(), theEcorePackage.getEJavaObject(), "value", null, 0, 1, EZVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEZVar_Kind(), this.getEzVarKind(), "kind", null, 0, 1, EZVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ezMojoRootEClass, EZMojoRoot.class, "EZMojoRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEZMojoRoot_Root(), this.getEZMojoNode(), this.getEZMojoNode_Root(), "root", null, 0, 1, EZMojoRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEZMojoRoot_Selected(), this.getEZMojoNode(), null, "selected", null, 0, 1, EZMojoRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEZMojoRoot_Targets(), this.getEZMojoTarget(), null, "targets", null, 0, -1, EZMojoRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEZMojoRoot_Feedback(), theEcorePackage.getEBoolean(), "feedback", null, 0, 1, EZMojoRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEZMojoRoot_MotionReactor(), this.getMotionReactor(), null, "motionReactor", null, 0, 1, EZMojoRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEZMojoRoot_VarsMode(), theEcorePackage.getEBoolean(), "varsMode", null, 0, 1, EZMojoRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEZMojoRoot_Index(), this.getIndex2MojoNode(), null, "index", null, 0, -1, EZMojoRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(ezMojoRootEClass, this.getEZMojoNode(), "accept", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "cmd", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(ezMojoRootEClass, this.getEZMojoNode(), "accept", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEZMojoCmd(), "cmd", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ezMojoTargetEClass, EZMojoTarget.class, "EZMojoTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEZMojoTarget_Kind(), this.getEZMojoKind(), "kind", null, 0, 1, EZMojoTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEZMojoTarget_Hierarchical(), theEcorePackage.getEBoolean(), "hierarchical", null, 0, 1, EZMojoTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ezMojoAgentCmdEClass, EZMojoAgentCmd.class, "EZMojoAgentCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEZMojoAgentCmd_Cmd(), this.getEZCmdKind(), "cmd", null, 0, 1, EZMojoAgentCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEZMojoAgentCmd_Text(), theEcorePackage.getEString(), "text", null, 0, 1, EZMojoAgentCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ezMojoInfoCmdEClass, EzMojoInfoCmd.class, "EzMojoInfoCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEzMojoInfoCmd_Text(), theEcorePackage.getEString(), "text", null, 0, 1, EzMojoInfoCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ezMojoServiceEClass, EzMojoService.class, "EzMojoService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEzMojoService_ServiceID(), theEcorePackage.getEString(), "serviceID", null, 0, 1, EzMojoService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEzMojoService_Excluded(), ecorePackage.getEBoolean(), "excluded", null, 0, 1, EzMojoService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ezMojoTargetedCmdEClass, EZMojoTargetedCmd.class, "EZMojoTargetedCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(motionEvalCtxEClass, MotionEvalCtx.class, "MotionEvalCtx", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMotionEvalCtx_Ctx(), theEzmotionPackage.getMotion(), null, "ctx", null, 0, -1, MotionEvalCtx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMotionEvalCtx_Kicked(), theEzmotionPackage.getMotionValue(), null, "kicked", null, 0, 1, MotionEvalCtx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMotionEvalCtx_Script(), this.getEZScript(), null, "script", null, 0, 1, MotionEvalCtx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMotionEvalCtx_Node(), this.getEZMojoNode(), null, "node", null, 0, 1, MotionEvalCtx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMotionEvalCtx_Cmd(), theOsccmdPackage.getOscCmd(), null, "cmd", null, 0, 1, MotionEvalCtx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotionEvalCtx_Strategy(), this.getMotionEvalStrategy(), "strategy", null, 0, 1, MotionEvalCtx.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ezScriptEClass, EZScript.class, "EZScript", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEZScript_Script(), ecorePackage.getEString(), "script", null, 0, 1, EZScript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEZScript_Node(), this.getEZMojoNode(), this.getEZMojoNode_Scripts(), "node", null, 0, 1, EZScript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEZScript_Label(), theEcorePackage.getEString(), "label", null, 0, 1, EZScript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEZScript_Events(), this.getEZEvent(), null, "events", null, 0, -1, EZScript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(ezScriptEClass, null, "eval", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ezMojoKinematicCmdEClass, EzMojoKinematicCmd.class, "EzMojoKinematicCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEzMojoKinematicCmd_Script(), theEcorePackage.getEString(), "script", null, 0, 1, EzMojoKinematicCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eztuioVarEClass, EZTUIOVar.class, "EZTUIOVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEZTUIOVar_Motion(), theEzmotionPackage.getMotion(), null, "motion", null, 0, 1, EZTUIOVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEZTUIOVar_B3d(), theEztuio2Package.getTuio2B3D(), null, "b3d", null, 0, 1, EZTUIOVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ezMojoMappedCmdEClass, EZMojoMappedCmd.class, "EZMojoMappedCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEZMojoMappedCmd_Alias(), theEcorePackage.getEString(), "alias", null, 0, 1, EZMojoMappedCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(motionReactorEClass, MotionReactor.class, "MotionReactor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMotionReactor_Job(), this.getJob(), "job", null, 0, 1, MotionReactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(index2MojoNodeEClass, Map.Entry.class, "Index2MojoNode", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIndex2MojoNode_Key(), theEcorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndex2MojoNode_Value(), this.getEZMojoNode(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ezEClass, net.sf.smbt.ezmojo.EZ.class, "EZ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEZ_Configs(), this.getEZMojoRoot(), null, "configs", null, 0, -1, net.sf.smbt.ezmojo.EZ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ezEventEClass, EZEvent.class, "EZEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEZEvent_Kind(), this.getEZMojoKind(), "kind", null, 0, 1, EZEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEZEvent_Osc(), theOsccmdPackage.getOscCmd(), null, "osc", null, 0, -1, EZEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEZEvent_Targets(), this.getEZMojoTarget(), null, "targets", null, 0, -1, EZEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(ezMojoKindEEnum, EZMojoKind.class, "EZMojoKind");
		addEEnumLiteral(ezMojoKindEEnum, EZMojoKind.GET);
		addEEnumLiteral(ezMojoKindEEnum, EZMojoKind.SET);
		addEEnumLiteral(ezMojoKindEEnum, EZMojoKind.LISTEN);
		addEEnumLiteral(ezMojoKindEEnum, EZMojoKind.UNSET);
		addEEnumLiteral(ezMojoKindEEnum, EZMojoKind.SERVICE);
		addEEnumLiteral(ezMojoKindEEnum, EZMojoKind.QUERY);
		addEEnumLiteral(ezMojoKindEEnum, EZMojoKind.UNLISTEN);
		addEEnumLiteral(ezMojoKindEEnum, EZMojoKind.BIND);
		addEEnumLiteral(ezMojoKindEEnum, EZMojoKind.NONE);
		addEEnumLiteral(ezMojoKindEEnum, EZMojoKind.FORWARD);
		addEEnumLiteral(ezMojoKindEEnum, EZMojoKind.UNFORWARD);
		addEEnumLiteral(ezMojoKindEEnum, EZMojoKind.LEGACY_SET);
		addEEnumLiteral(ezMojoKindEEnum, EZMojoKind.SELECT);
		addEEnumLiteral(ezMojoKindEEnum, EZMojoKind.TRIGGER);
		addEEnumLiteral(ezMojoKindEEnum, EZMojoKind.KINEMATICS);
		addEEnumLiteral(ezMojoKindEEnum, EZMojoKind.COMMAND);
		addEEnumLiteral(ezMojoKindEEnum, EZMojoKind.INFO);
		addEEnumLiteral(ezMojoKindEEnum, EZMojoKind.CLOCK);
		addEEnumLiteral(ezMojoKindEEnum, EZMojoKind.FUNCTION);
		addEEnumLiteral(ezMojoKindEEnum, EZMojoKind.BANG);
		addEEnumLiteral(ezMojoKindEEnum, EZMojoKind.TOGGLE);
		addEEnumLiteral(ezMojoKindEEnum, EZMojoKind.MAP);
		addEEnumLiteral(ezMojoKindEEnum, EZMojoKind.UNMAP);
		addEEnumLiteral(ezMojoKindEEnum, EZMojoKind.MNEMONIC);
		addEEnumLiteral(ezMojoKindEEnum, EZMojoKind.PLAY);

		initEEnum(ezCmdKindEEnum, EZCmdKind.class, "EZCmdKind");
		addEEnumLiteral(ezCmdKindEEnum, EZCmdKind.LIST);
		addEEnumLiteral(ezCmdKindEEnum, EZCmdKind.RESET);
		addEEnumLiteral(ezCmdKindEEnum, EZCmdKind.CLOSE);
		addEEnumLiteral(ezCmdKindEEnum, EZCmdKind.STATUS);
		addEEnumLiteral(ezCmdKindEEnum, EZCmdKind.BIND);
		addEEnumLiteral(ezCmdKindEEnum, EZCmdKind.DEPLOY);
		addEEnumLiteral(ezCmdKindEEnum, EZCmdKind.REMOVE);
		addEEnumLiteral(ezCmdKindEEnum, EZCmdKind.WTF);
		addEEnumLiteral(ezCmdKindEEnum, EZCmdKind.HELP);
		addEEnumLiteral(ezCmdKindEEnum, EZCmdKind.PROTOCOL);
		addEEnumLiteral(ezCmdKindEEnum, EZCmdKind.ALIAS);
		addEEnumLiteral(ezCmdKindEEnum, EZCmdKind.CLEAR);
		addEEnumLiteral(ezCmdKindEEnum, EZCmdKind.FEEDBACK);
		addEEnumLiteral(ezCmdKindEEnum, EZCmdKind.HOOK);
		addEEnumLiteral(ezCmdKindEEnum, EZCmdKind.UNHOOK);
		addEEnumLiteral(ezCmdKindEEnum, EZCmdKind.SAVE);
		addEEnumLiteral(ezCmdKindEEnum, EZCmdKind.LOAD);
		addEEnumLiteral(ezCmdKindEEnum, EZCmdKind.OK);
		addEEnumLiteral(ezCmdKindEEnum, EZCmdKind.ERROR);

		initEEnum(motionEvalStrategyEEnum, MotionEvalStrategy.class, "MotionEvalStrategy");
		addEEnumLiteral(motionEvalStrategyEEnum, MotionEvalStrategy.SCRIPTICAL);
		addEEnumLiteral(motionEvalStrategyEEnum, MotionEvalStrategy.ADDITIVE);

		initEEnum(ezVarKindEEnum, EzVarKind.class, "EzVarKind");
		addEEnumLiteral(ezVarKindEEnum, EzVarKind.REGULAR);
		addEEnumLiteral(ezVarKindEEnum, EzVarKind.OVERRIDEN);

		// Initialize data types
		initEDataType(motionEngineEDataType, MotionEngine.class, "MotionEngine", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(jobEDataType, Job.class, "Job", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EzmojoPackageImpl
