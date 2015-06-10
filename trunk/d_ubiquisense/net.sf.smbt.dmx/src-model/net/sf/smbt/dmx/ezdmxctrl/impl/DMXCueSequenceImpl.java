/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.ezdmxctrl.impl;

import net.sf.smbt.dmx.ezdmxctrl.DMXCueSequence;
import net.sf.smbt.dmx.ezdmxctrl.DMXFixtureValuations;
import net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DMX Cue Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXCueSequenceImpl#getPrev <em>Prev</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXCueSequenceImpl#getNext <em>Next</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXCueSequenceImpl#getStart <em>Start</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXCueSequenceImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXCueSequenceImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXCueSequenceImpl#isLoop <em>Loop</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXCueSequenceImpl#getTimes <em>Times</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DMXCueSequenceImpl extends MinimalEObjectImpl.Container implements DMXCueSequence {
	/**
	 * The cached value of the '{@link #getPrev() <em>Prev</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrev()
	 * @generated
	 * @ordered
	 */
	protected DMXFixtureValuations prev;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected DMXFixtureValuations next;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final long START_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected long start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final long DURATION_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected long duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final long SPEED_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected long speed = SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #isLoop() <em>Loop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoop()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOOP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLoop() <em>Loop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoop()
	 * @generated
	 * @ordered
	 */
	protected boolean loop = LOOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimes() <em>Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimes()
	 * @generated
	 * @ordered
	 */
	protected static final int TIMES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimes() <em>Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimes()
	 * @generated
	 * @ordered
	 */
	protected int times = TIMES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DMXCueSequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzdmxctrlPackage.Literals.DMX_CUE_SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMXFixtureValuations getPrev() {
		if (prev != null && prev.eIsProxy()) {
			InternalEObject oldPrev = (InternalEObject)prev;
			prev = (DMXFixtureValuations)eResolveProxy(oldPrev);
			if (prev != oldPrev) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EzdmxctrlPackage.DMX_CUE_SEQUENCE__PREV, oldPrev, prev));
			}
		}
		return prev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMXFixtureValuations basicGetPrev() {
		return prev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrev(DMXFixtureValuations newPrev) {
		DMXFixtureValuations oldPrev = prev;
		prev = newPrev;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzdmxctrlPackage.DMX_CUE_SEQUENCE__PREV, oldPrev, prev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMXFixtureValuations getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (DMXFixtureValuations)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EzdmxctrlPackage.DMX_CUE_SEQUENCE__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMXFixtureValuations basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(DMXFixtureValuations newNext) {
		DMXFixtureValuations oldNext = next;
		next = newNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzdmxctrlPackage.DMX_CUE_SEQUENCE__NEXT, oldNext, next));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(long newStart) {
		long oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzdmxctrlPackage.DMX_CUE_SEQUENCE__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(long newDuration) {
		long oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzdmxctrlPackage.DMX_CUE_SEQUENCE__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeed(long newSpeed) {
		long oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzdmxctrlPackage.DMX_CUE_SEQUENCE__SPEED, oldSpeed, speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLoop() {
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoop(boolean newLoop) {
		boolean oldLoop = loop;
		loop = newLoop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzdmxctrlPackage.DMX_CUE_SEQUENCE__LOOP, oldLoop, loop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimes() {
		return times;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimes(int newTimes) {
		int oldTimes = times;
		times = newTimes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzdmxctrlPackage.DMX_CUE_SEQUENCE__TIMES, oldTimes, times));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EzdmxctrlPackage.DMX_CUE_SEQUENCE__PREV:
				if (resolve) return getPrev();
				return basicGetPrev();
			case EzdmxctrlPackage.DMX_CUE_SEQUENCE__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case EzdmxctrlPackage.DMX_CUE_SEQUENCE__START:
				return getStart();
			case EzdmxctrlPackage.DMX_CUE_SEQUENCE__DURATION:
				return getDuration();
			case EzdmxctrlPackage.DMX_CUE_SEQUENCE__SPEED:
				return getSpeed();
			case EzdmxctrlPackage.DMX_CUE_SEQUENCE__LOOP:
				return isLoop();
			case EzdmxctrlPackage.DMX_CUE_SEQUENCE__TIMES:
				return getTimes();
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
			case EzdmxctrlPackage.DMX_CUE_SEQUENCE__PREV:
				setPrev((DMXFixtureValuations)newValue);
				return;
			case EzdmxctrlPackage.DMX_CUE_SEQUENCE__NEXT:
				setNext((DMXFixtureValuations)newValue);
				return;
			case EzdmxctrlPackage.DMX_CUE_SEQUENCE__START:
				setStart((Long)newValue);
				return;
			case EzdmxctrlPackage.DMX_CUE_SEQUENCE__DURATION:
				setDuration((Long)newValue);
				return;
			case EzdmxctrlPackage.DMX_CUE_SEQUENCE__SPEED:
				setSpeed((Long)newValue);
				return;
			case EzdmxctrlPackage.DMX_CUE_SEQUENCE__LOOP:
				setLoop((Boolean)newValue);
				return;
			case EzdmxctrlPackage.DMX_CUE_SEQUENCE__TIMES:
				setTimes((Integer)newValue);
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
			case EzdmxctrlPackage.DMX_CUE_SEQUENCE__PREV:
				setPrev((DMXFixtureValuations)null);
				return;
			case EzdmxctrlPackage.DMX_CUE_SEQUENCE__NEXT:
				setNext((DMXFixtureValuations)null);
				return;
			case EzdmxctrlPackage.DMX_CUE_SEQUENCE__START:
				setStart(START_EDEFAULT);
				return;
			case EzdmxctrlPackage.DMX_CUE_SEQUENCE__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case EzdmxctrlPackage.DMX_CUE_SEQUENCE__SPEED:
				setSpeed(SPEED_EDEFAULT);
				return;
			case EzdmxctrlPackage.DMX_CUE_SEQUENCE__LOOP:
				setLoop(LOOP_EDEFAULT);
				return;
			case EzdmxctrlPackage.DMX_CUE_SEQUENCE__TIMES:
				setTimes(TIMES_EDEFAULT);
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
			case EzdmxctrlPackage.DMX_CUE_SEQUENCE__PREV:
				return prev != null;
			case EzdmxctrlPackage.DMX_CUE_SEQUENCE__NEXT:
				return next != null;
			case EzdmxctrlPackage.DMX_CUE_SEQUENCE__START:
				return start != START_EDEFAULT;
			case EzdmxctrlPackage.DMX_CUE_SEQUENCE__DURATION:
				return duration != DURATION_EDEFAULT;
			case EzdmxctrlPackage.DMX_CUE_SEQUENCE__SPEED:
				return speed != SPEED_EDEFAULT;
			case EzdmxctrlPackage.DMX_CUE_SEQUENCE__LOOP:
				return loop != LOOP_EDEFAULT;
			case EzdmxctrlPackage.DMX_CUE_SEQUENCE__TIMES:
				return times != TIMES_EDEFAULT;
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
		result.append(" (start: ");
		result.append(start);
		result.append(", duration: ");
		result.append(duration);
		result.append(", speed: ");
		result.append(speed);
		result.append(", loop: ");
		result.append(loop);
		result.append(", times: ");
		result.append(times);
		result.append(')');
		return result.toString();
	}

} //DMXCueSequenceImpl
