/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmojo.impl;

import net.sf.smbt.ezmojo.EZMojoNode;
import net.sf.smbt.ezmojo.EZScript;
import net.sf.smbt.ezmojo.EzmojoPackage;
import net.sf.smbt.ezmojo.MotionEvalCtx;
import net.sf.smbt.ezmojo.MotionEvalStrategy;
import net.sf.smbt.ezmojo.ScriptEval;
import net.sf.smbt.ezmotion.Motion;
import net.sf.smbt.ezmotion.MotionValue;
import net.sf.smbt.osccmd.OscCmd;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Motion Eval Ctx</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmojo.impl.MotionEvalCtxImpl#getCtx <em>Ctx</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.MotionEvalCtxImpl#getKicked <em>Kicked</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.MotionEvalCtxImpl#getScript <em>Script</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.MotionEvalCtxImpl#getNode <em>Node</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.MotionEvalCtxImpl#getCmd <em>Cmd</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.MotionEvalCtxImpl#getStrategy <em>Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MotionEvalCtxImpl extends MinimalEObjectImpl.Container implements MotionEvalCtx {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MotionEvalCtxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzmojoPackage.Literals.MOTION_EVAL_CTX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Motion> getCtx() {
		return (EList<Motion>)eGet(EzmojoPackage.Literals.MOTION_EVAL_CTX__CTX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotionValue getKicked() {
		return (MotionValue)eGet(EzmojoPackage.Literals.MOTION_EVAL_CTX__KICKED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKicked(MotionValue newKicked) {
		eSet(EzmojoPackage.Literals.MOTION_EVAL_CTX__KICKED, newKicked);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZScript getScript() {
		return (EZScript)eGet(EzmojoPackage.Literals.MOTION_EVAL_CTX__SCRIPT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScript(EZScript newScript) {
		eSet(EzmojoPackage.Literals.MOTION_EVAL_CTX__SCRIPT, newScript);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZMojoNode getNode() {
		return (EZMojoNode)eGet(EzmojoPackage.Literals.MOTION_EVAL_CTX__NODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(EZMojoNode newNode) {
		eSet(EzmojoPackage.Literals.MOTION_EVAL_CTX__NODE, newNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscCmd getCmd() {
		return (OscCmd)eGet(EzmojoPackage.Literals.MOTION_EVAL_CTX__CMD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCmd(OscCmd newCmd) {
		eSet(EzmojoPackage.Literals.MOTION_EVAL_CTX__CMD, newCmd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotionEvalStrategy getStrategy() {
		return (MotionEvalStrategy)eGet(EzmojoPackage.Literals.MOTION_EVAL_CTX__STRATEGY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrategy(MotionEvalStrategy newStrategy) {
		eSet(EzmojoPackage.Literals.MOTION_EVAL_CTX__STRATEGY, newStrategy);
	}

} //MotionEvalCtxImpl
