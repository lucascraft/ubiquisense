/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.firmata.ubiquino.impl;

import net.sf.smbt.firmata.ubiquino.PortConfig;
import net.sf.smbt.firmata.ubiquino.PortConfigKind;
import net.sf.smbt.firmata.ubiquino.UbiquinoPackage;
import net.sf.smbt.mdl.arduino.PIN_MODE;
import net.sf.smbt.mdl.arduino.PWM_MODE;
import net.sf.smbt.mdl.arduino.Port;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.firmata.ubiquino.impl.PortConfigImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link net.sf.smbt.firmata.ubiquino.impl.PortConfigImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link net.sf.smbt.firmata.ubiquino.impl.PortConfigImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link net.sf.smbt.firmata.ubiquino.impl.PortConfigImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link net.sf.smbt.firmata.ubiquino.impl.PortConfigImpl#getPwm <em>Pwm</em>}</li>
 *   <li>{@link net.sf.smbt.firmata.ubiquino.impl.PortConfigImpl#getChannel <em>Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortConfigImpl extends MinimalEObjectImpl.Container implements PortConfig {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Port target;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final PortConfigKind KIND_EDEFAULT = PortConfigKind.ANALOGIC;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected PortConfigKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final PIN_MODE MODE_EDEFAULT = PIN_MODE.INPUT;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected PIN_MODE mode = MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPwm() <em>Pwm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPwm()
	 * @generated
	 * @ordered
	 */
	protected static final PWM_MODE PWM_EDEFAULT = PWM_MODE.HIGH;

	/**
	 * The cached value of the '{@link #getPwm() <em>Pwm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPwm()
	 * @generated
	 * @ordered
	 */
	protected PWM_MODE pwm = PWM_EDEFAULT;

	/**
	 * The default value of the '{@link #getChannel() <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected static final int CHANNEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getChannel() <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected int channel = CHANNEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UbiquinoPackage.Literals.PORT_CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Port)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UbiquinoPackage.PORT_CONFIG__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Port newTarget) {
		Port oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbiquinoPackage.PORT_CONFIG__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConfigKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(PortConfigKind newKind) {
		PortConfigKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbiquinoPackage.PORT_CONFIG__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbiquinoPackage.PORT_CONFIG__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PIN_MODE getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(PIN_MODE newMode) {
		PIN_MODE oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbiquinoPackage.PORT_CONFIG__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PWM_MODE getPwm() {
		return pwm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPwm(PWM_MODE newPwm) {
		PWM_MODE oldPwm = pwm;
		pwm = newPwm == null ? PWM_EDEFAULT : newPwm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbiquinoPackage.PORT_CONFIG__PWM, oldPwm, pwm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getChannel() {
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannel(int newChannel) {
		int oldChannel = channel;
		channel = newChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbiquinoPackage.PORT_CONFIG__CHANNEL, oldChannel, channel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UbiquinoPackage.PORT_CONFIG__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case UbiquinoPackage.PORT_CONFIG__KIND:
				return getKind();
			case UbiquinoPackage.PORT_CONFIG__ENABLED:
				return isEnabled();
			case UbiquinoPackage.PORT_CONFIG__MODE:
				return getMode();
			case UbiquinoPackage.PORT_CONFIG__PWM:
				return getPwm();
			case UbiquinoPackage.PORT_CONFIG__CHANNEL:
				return getChannel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UbiquinoPackage.PORT_CONFIG__TARGET:
				setTarget((Port)newValue);
				return;
			case UbiquinoPackage.PORT_CONFIG__KIND:
				setKind((PortConfigKind)newValue);
				return;
			case UbiquinoPackage.PORT_CONFIG__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case UbiquinoPackage.PORT_CONFIG__MODE:
				setMode((PIN_MODE)newValue);
				return;
			case UbiquinoPackage.PORT_CONFIG__PWM:
				setPwm((PWM_MODE)newValue);
				return;
			case UbiquinoPackage.PORT_CONFIG__CHANNEL:
				setChannel((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UbiquinoPackage.PORT_CONFIG__TARGET:
				setTarget((Port)null);
				return;
			case UbiquinoPackage.PORT_CONFIG__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case UbiquinoPackage.PORT_CONFIG__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case UbiquinoPackage.PORT_CONFIG__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case UbiquinoPackage.PORT_CONFIG__PWM:
				setPwm(PWM_EDEFAULT);
				return;
			case UbiquinoPackage.PORT_CONFIG__CHANNEL:
				setChannel(CHANNEL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UbiquinoPackage.PORT_CONFIG__TARGET:
				return target != null;
			case UbiquinoPackage.PORT_CONFIG__KIND:
				return kind != KIND_EDEFAULT;
			case UbiquinoPackage.PORT_CONFIG__ENABLED:
				return enabled != ENABLED_EDEFAULT;
			case UbiquinoPackage.PORT_CONFIG__MODE:
				return mode != MODE_EDEFAULT;
			case UbiquinoPackage.PORT_CONFIG__PWM:
				return pwm != PWM_EDEFAULT;
			case UbiquinoPackage.PORT_CONFIG__CHANNEL:
				return channel != CHANNEL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (kind: ");
		result.append(kind);
		result.append(", enabled: ");
		result.append(enabled);
		result.append(", mode: ");
		result.append(mode);
		result.append(", pwm: ");
		result.append(pwm);
		result.append(", channel: ");
		result.append(channel);
		result.append(')');
		return result.toString();
	}

} //PortConfigImpl
