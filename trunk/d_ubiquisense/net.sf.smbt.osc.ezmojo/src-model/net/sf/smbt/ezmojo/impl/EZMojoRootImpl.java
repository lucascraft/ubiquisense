/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmojo.impl;

import java.util.List;

import net.sf.smbt.ezmojo.EZMojoCmd;
import net.sf.smbt.ezmojo.EZMojoNode;
import net.sf.smbt.ezmojo.EZMojoRoot;
import net.sf.smbt.ezmojo.EZMojoTarget;
import net.sf.smbt.ezmojo.EzmojoPackage;
import net.sf.smbt.ezmojo.MotionReactor;
import net.sf.smbt.osc.ezmojo.utils.EzMojoCmdUtils;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EnginePackage;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EZ Mojo Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoRootImpl#getEngines <em>Engines</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoRootImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoRootImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoRootImpl#getSelected <em>Selected</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoRootImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoRootImpl#isFeedback <em>Feedback</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoRootImpl#getMotionReactor <em>Motion Reactor</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoRootImpl#isVarsMode <em>Vars Mode</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoRootImpl#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EZMojoRootImpl extends MinimalEObjectImpl.Container implements EZMojoRoot {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EZMojoRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzmojoPackage.Literals.EZ_MOJO_ROOT;
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
	public List<CmdPipe> getEngines() {
		return (List<CmdPipe>)eGet(EnginePackage.Literals.ICONNECTED_UNIT__ENGINES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmdPipe getDefault() {
		return (CmdPipe)eGet(EnginePackage.Literals.ICONNECTED_UNIT__DEFAULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(CmdPipe newDefault) {
		eSet(EnginePackage.Literals.ICONNECTED_UNIT__DEFAULT, newDefault);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("null")
	public EZMojoNode getRoot() {
		EZMojoNode root = (EZMojoNode)eGet(EzmojoPackage.Literals.EZ_MOJO_ROOT__ROOT, true);
		if (root != null) {
			return root;
		} else {
			EObject top = eContainer();
			while (top != null && top.eContainer() != null) {
				top = top.eContainer();
			}
			if (top == null) {
				top = EzMojoCmdUtils.INSTANCE.createEzMojoNode("/");
			}
			return (EZMojoNode) top;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(EZMojoNode newRoot) {
		eSet(EzmojoPackage.Literals.EZ_MOJO_ROOT__ROOT, newRoot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZMojoNode getSelected() {
		return (EZMojoNode)eGet(EzmojoPackage.Literals.EZ_MOJO_ROOT__SELECTED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelected(EZMojoNode newSelected) {
		eSet(EzmojoPackage.Literals.EZ_MOJO_ROOT__SELECTED, newSelected);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EZMojoTarget> getTargets() {
		return (EList<EZMojoTarget>)eGet(EzmojoPackage.Literals.EZ_MOJO_ROOT__TARGETS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFeedback() {
		return (Boolean)eGet(EzmojoPackage.Literals.EZ_MOJO_ROOT__FEEDBACK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeedback(boolean newFeedback) {
		eSet(EzmojoPackage.Literals.EZ_MOJO_ROOT__FEEDBACK, newFeedback);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotionReactor getMotionReactor() {
		return (MotionReactor)eGet(EzmojoPackage.Literals.EZ_MOJO_ROOT__MOTION_REACTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotionReactor(MotionReactor newMotionReactor) {
		eSet(EzmojoPackage.Literals.EZ_MOJO_ROOT__MOTION_REACTOR, newMotionReactor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVarsMode() {
		return (Boolean)eGet(EzmojoPackage.Literals.EZ_MOJO_ROOT__VARS_MODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarsMode(boolean newVarsMode) {
		eSet(EzmojoPackage.Literals.EZ_MOJO_ROOT__VARS_MODE, newVarsMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EMap<String, EZMojoNode> getIndex() {
		return (EMap<String, EZMojoNode>)eGet(EzmojoPackage.Literals.EZ_MOJO_ROOT__INDEX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<EZMojoNode> accept(String cmd) {
		return accept((EZMojoCmd)EzMojoCmdUtils.INSTANCE.handleEzMojoFrame(this, cmd.getBytes()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<EZMojoNode> accept(EZMojoCmd cmd) {
		List<EZMojoNode> nodes = EzMojoCmdUtils.INSTANCE.handleEzMojoCmd(this, cmd);
		return nodes == null ? new BasicEList<EZMojoNode>() : new BasicEList<EZMojoNode>(nodes);
	}

} //EZMojoRootImpl
