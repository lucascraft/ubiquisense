/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmojo.impl;

import net.sf.smbt.ezmojo.EZMojoNode;
import net.sf.smbt.ezmojo.EZMojoRoot;
import net.sf.smbt.ezmojo.EZMojoTarget;
import net.sf.smbt.ezmojo.EZScript;
import net.sf.smbt.ezmojo.EZTUIOVar;
import net.sf.smbt.ezmojo.EZVar;
import net.sf.smbt.ezmojo.EzMojoService;
import net.sf.smbt.ezmojo.EzmojoFactory;
import net.sf.smbt.ezmojo.EzmojoPackage;
import net.sf.smbt.ezmojo.MotionEvalCtx;
import net.sf.smbt.ezmotion.Motion;
import net.sf.smbt.ezmotion.MotionValue;
import net.sf.smbt.motion.engine.MotionEngine;
import net.sf.smbt.osc.ezmojo.utils.EZ;
import net.sf.smbt.osc.ezmojo.utils.EzMojoCmdUtils;
import net.sf.smbt.osc.eztuio2.Eztuio2Factory;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import com.illposed.osc.OSCMessage;
import com.illposed.osc.OSCPacket;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EZ Mojo Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoNodeImpl#getVars <em>Vars</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoNodeImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoNodeImpl#getTtl <em>Ttl</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoNodeImpl#getToken <em>Token</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoNodeImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoNodeImpl#getService <em>Service</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoNodeImpl#isToggle <em>Toggle</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoNodeImpl#getLastBang <em>Last Bang</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoNodeImpl#getListeners <em>Listeners</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoNodeImpl#getForwards <em>Forwards</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoNodeImpl#getMotions <em>Motions</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoNodeImpl#getClock <em>Clock</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoNodeImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoNodeImpl#getHitsRatePerSec <em>Hits Rate Per Sec</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoNodeImpl#getTouches <em>Touches</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoNodeImpl#getScripts <em>Scripts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EZMojoNodeImpl extends MinimalEObjectImpl.Container implements EZMojoNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EZMojoNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzmojoPackage.Literals.EZ_MOJO_NODE;
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
	public long getTtl() {
		return (Long)eGet(EzmojoPackage.Literals.EZ_MOJO_NODE__TTL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTtl(long newTtl) {
		eSet(EzmojoPackage.Literals.EZ_MOJO_NODE__TTL, newTtl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToken() {
		return (String)eGet(EzmojoPackage.Literals.EZ_MOJO_NODE__TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToken(String newToken) {
		eSet(EzmojoPackage.Literals.EZ_MOJO_NODE__TOKEN, newToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUuid() {
		return (String)eGet(EzmojoPackage.Literals.EZ_MOJO_NODE__UUID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUuid(String newUuid) {
		eSet(EzmojoPackage.Literals.EZ_MOJO_NODE__UUID, newUuid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzMojoService getService() {
		return (EzMojoService)eGet(EzmojoPackage.Literals.EZ_MOJO_NODE__SERVICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(EzMojoService newService) {
		eSet(EzmojoPackage.Literals.EZ_MOJO_NODE__SERVICE, newService);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isToggle() {
		return (Boolean)eGet(EzmojoPackage.Literals.EZ_MOJO_NODE__TOGGLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToggle(boolean newToggle) {
		eSet(EzmojoPackage.Literals.EZ_MOJO_NODE__TOGGLE, newToggle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLastBang() {
		return (Long)eGet(EzmojoPackage.Literals.EZ_MOJO_NODE__LAST_BANG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastBang(long newLastBang) {
		eSet(EzmojoPackage.Literals.EZ_MOJO_NODE__LAST_BANG, newLastBang);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EZMojoTarget> getListeners() {
		return (EList<EZMojoTarget>)eGet(EzmojoPackage.Literals.EZ_MOJO_NODE__LISTENERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EZMojoTarget> getForwards() {
		return (EList<EZMojoTarget>)eGet(EzmojoPackage.Literals.EZ_MOJO_NODE__FORWARDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Motion> getMotions() {
		return (EList<Motion>)eGet(EzmojoPackage.Literals.EZ_MOJO_NODE__MOTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MotionEngine getClock() {
		return (MotionEngine)eGet(EzmojoPackage.Literals.EZ_MOJO_NODE__CLOCK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClock(MotionEngine newClock) {
		eSet(EzmojoPackage.Literals.EZ_MOJO_NODE__CLOCK, newClock);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZMojoRoot getRoot() {
		return (EZMojoRoot)eGet(EzmojoPackage.Literals.EZ_MOJO_NODE__ROOT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(EZMojoRoot newRoot) {
		eSet(EzmojoPackage.Literals.EZ_MOJO_NODE__ROOT, newRoot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHitsRatePerSec() {
		return (Float)eGet(EzmojoPackage.Literals.EZ_MOJO_NODE__HITS_RATE_PER_SEC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHitsRatePerSec(float newHitsRatePerSec) {
		eSet(EzmojoPackage.Literals.EZ_MOJO_NODE__HITS_RATE_PER_SEC, newHitsRatePerSec);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTouches() {
		return (Long)eGet(EzmojoPackage.Literals.EZ_MOJO_NODE__TOUCHES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTouches(long newTouches) {
		eSet(EzmojoPackage.Literals.EZ_MOJO_NODE__TOUCHES, newTouches);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTouches() {
		eUnset(EzmojoPackage.Literals.EZ_MOJO_NODE__TOUCHES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTouches() {
		return eIsSet(EzmojoPackage.Literals.EZ_MOJO_NODE__TOUCHES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EZScript> getScripts() {
		return (EList<EZScript>)eGet(EzmojoPackage.Literals.EZ_MOJO_NODE__SCRIPTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Object set(String msg) {
		return EzMojoCmdUtils.INSTANCE.setMojo(this, msg);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Object get(String msg) {
		return EzMojoCmdUtils.INSTANCE.getMojo(this, msg);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Object unset(String msg) {
		
		
		//return null; //MojoCmdUtils.INSTANCE.unsetMojo(this, msg);
		
		
		
		
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Object query(String addr) {
		return EzMojoCmdUtils.INSTANCE.findMojo(this, addr);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object bind(String msg) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZMojoNode listen(String msg) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZMojoNode unlisten(String msg) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EZMojoNode forward(String msg) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZMojoNode unforward(String msg) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addTrigger(String expr) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addKinematics(String expr) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeTrigger() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeKinematics() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isService() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getAddr() {
		return EzMojoCmdUtils.INSTANCE.getOscAddr(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void bang(MotionEvalCtx ctx) {
		EZTUIOVar var = null;
		for (EZVar v : getVars()) {
			if (v instanceof EZTUIOVar) {
				EZTUIOVar tuioVar = (EZTUIOVar) v;
				tuioVar.setMotion(ctx.getCtx().get(0)); // FIXME : LB to consider multiple/composite motions
				OSCPacket packet = ctx.getCmd().getMsg();
				if (packet instanceof OSCMessage) {
					if (tuioVar.getB3d() == null) {
						tuioVar.setB3d(Eztuio2Factory.eINSTANCE.createTuio2B3D());
					}						
					var = tuioVar;
				}
			}
		}
		
		if (var == null) {
			var = EzmojoFactory.eINSTANCE.createEZTUIOVar();
			if (var.getB3d() == null) {
				var.setB3d(Eztuio2Factory.eINSTANCE.createTuio2B3D());
			}						
			getVars().add(var);
		} else {
			if (!getVars().contains(var)) {
				getVars().add(var);
			}
		}
		if (ctx.getKicked() instanceof MotionValue) {
			var.getB3d().setX_pos(new Double(ctx.getKicked().getX()).floatValue());
			var.getB3d().setY_pos(new Double(ctx.getKicked().getY()).floatValue());
			var.getB3d().setZ_pos(new Double(ctx.getKicked().getZ()).floatValue());
			var.getB3d().setX_vel(new Double(ctx.getKicked().getXAccel()).floatValue());
			var.getB3d().setY_vel(new Double(ctx.getKicked().getYAccel()).floatValue());
			var.getB3d().setZ_vel(new Double(ctx.getKicked().getZAccel()).floatValue());
			var.getB3d().setYaw(new Double(ctx.getKicked().getXRot()).floatValue());
			var.getB3d().setPitch(new Double(ctx.getKicked().getYRot()).floatValue());
			var.getB3d().setRoll(new Double(ctx.getKicked().getZRot()).floatValue());
		}		
		for (EZMojoTarget target : getForwards()) {
			CmdPipe pipe = QuanticMojo.INSTANCE.openUdpPipe("osc", target.getAddr(), new int[]{});
			OSCPacket packet = ctx.getCmd().getMsg();
			if (packet instanceof OSCMessage) {
				if (ctx.getKicked() instanceof MotionValue) {
					((OSCMessage)packet).addArgument(new Double(ctx.getKicked().getX()));
					((OSCMessage)packet).addArgument(new Double(ctx.getKicked().getY()));
					((OSCMessage)packet).addArgument(new Double(ctx.getKicked().getZ()));
					((OSCMessage)packet).addArgument(new Double(ctx.getKicked().getXAccel()));
					((OSCMessage)packet).addArgument(new Double(ctx.getKicked().getYAccel()));
					((OSCMessage)packet).addArgument(new Double(ctx.getKicked().getZAccel()));
					((OSCMessage)packet).addArgument(new Double(ctx.getKicked().getXRot()));
					((OSCMessage)packet).addArgument(new Double(ctx.getKicked().getYRot()));
					((OSCMessage)packet).addArgument(new Double(ctx.getKicked().getZRot()));
					System.out.println(((OSCMessage)packet).getArguments().length);
				}
			}
			
			pipe.send(ctx.getCmd());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<CmdPipe> getCompatibleCmdPipe(String protocolID) {
		return new BasicEList<CmdPipe>(EZ.INSTANCE.getCompatibleCmdPipe(this, protocolID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EZVar> getVars() {
		return (EList<EZVar>)eGet(EzmojoPackage.Literals.EZ_MOJO_NODE__VARS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EZMojoNode> getElements() {
		return (EList<EZMojoNode>)eGet(EzmojoPackage.Literals.EZ_MOJO_NODE__ELEMENTS, true);
	}

} //EZMojoNodeImpl
