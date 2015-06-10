/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.model.qxf.impl;

import net.sf.smbt.dmx.model.qxf.Bulb;
import net.sf.smbt.dmx.model.qxf.Dimensions;
import net.sf.smbt.dmx.model.qxf.Focus;
import net.sf.smbt.dmx.model.qxf.Lens;
import net.sf.smbt.dmx.model.qxf.Physical;
import net.sf.smbt.dmx.model.qxf.QxfPackage;
import net.sf.smbt.dmx.model.qxf.Technical;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.impl.PhysicalImpl#getBulb <em>Bulb</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.impl.PhysicalImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.impl.PhysicalImpl#getLens <em>Lens</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.impl.PhysicalImpl#getFocus <em>Focus</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.impl.PhysicalImpl#getTechnical <em>Technical</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalImpl extends EObjectImpl implements Physical {
	/**
	 * The cached value of the '{@link #getBulb() <em>Bulb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBulb()
	 * @generated
	 * @ordered
	 */
	protected Bulb bulb;

	/**
	 * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected Dimensions dimensions;

	/**
	 * The cached value of the '{@link #getLens() <em>Lens</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLens()
	 * @generated
	 * @ordered
	 */
	protected Lens lens;

	/**
	 * The cached value of the '{@link #getFocus() <em>Focus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocus()
	 * @generated
	 * @ordered
	 */
	protected Focus focus;

	/**
	 * The cached value of the '{@link #getTechnical() <em>Technical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnical()
	 * @generated
	 * @ordered
	 */
	protected Technical technical;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QxfPackage.Literals.PHYSICAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bulb getBulb() {
		return bulb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBulb(Bulb newBulb, NotificationChain msgs) {
		Bulb oldBulb = bulb;
		bulb = newBulb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QxfPackage.PHYSICAL__BULB, oldBulb, newBulb);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBulb(Bulb newBulb) {
		if (newBulb != bulb) {
			NotificationChain msgs = null;
			if (bulb != null)
				msgs = ((InternalEObject)bulb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QxfPackage.PHYSICAL__BULB, null, msgs);
			if (newBulb != null)
				msgs = ((InternalEObject)newBulb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QxfPackage.PHYSICAL__BULB, null, msgs);
			msgs = basicSetBulb(newBulb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QxfPackage.PHYSICAL__BULB, newBulb, newBulb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimensions getDimensions() {
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDimensions(Dimensions newDimensions, NotificationChain msgs) {
		Dimensions oldDimensions = dimensions;
		dimensions = newDimensions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QxfPackage.PHYSICAL__DIMENSIONS, oldDimensions, newDimensions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensions(Dimensions newDimensions) {
		if (newDimensions != dimensions) {
			NotificationChain msgs = null;
			if (dimensions != null)
				msgs = ((InternalEObject)dimensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QxfPackage.PHYSICAL__DIMENSIONS, null, msgs);
			if (newDimensions != null)
				msgs = ((InternalEObject)newDimensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QxfPackage.PHYSICAL__DIMENSIONS, null, msgs);
			msgs = basicSetDimensions(newDimensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QxfPackage.PHYSICAL__DIMENSIONS, newDimensions, newDimensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lens getLens() {
		return lens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLens(Lens newLens, NotificationChain msgs) {
		Lens oldLens = lens;
		lens = newLens;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QxfPackage.PHYSICAL__LENS, oldLens, newLens);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLens(Lens newLens) {
		if (newLens != lens) {
			NotificationChain msgs = null;
			if (lens != null)
				msgs = ((InternalEObject)lens).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QxfPackage.PHYSICAL__LENS, null, msgs);
			if (newLens != null)
				msgs = ((InternalEObject)newLens).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QxfPackage.PHYSICAL__LENS, null, msgs);
			msgs = basicSetLens(newLens, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QxfPackage.PHYSICAL__LENS, newLens, newLens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Focus getFocus() {
		return focus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFocus(Focus newFocus, NotificationChain msgs) {
		Focus oldFocus = focus;
		focus = newFocus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QxfPackage.PHYSICAL__FOCUS, oldFocus, newFocus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFocus(Focus newFocus) {
		if (newFocus != focus) {
			NotificationChain msgs = null;
			if (focus != null)
				msgs = ((InternalEObject)focus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QxfPackage.PHYSICAL__FOCUS, null, msgs);
			if (newFocus != null)
				msgs = ((InternalEObject)newFocus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QxfPackage.PHYSICAL__FOCUS, null, msgs);
			msgs = basicSetFocus(newFocus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QxfPackage.PHYSICAL__FOCUS, newFocus, newFocus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Technical getTechnical() {
		return technical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTechnical(Technical newTechnical, NotificationChain msgs) {
		Technical oldTechnical = technical;
		technical = newTechnical;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QxfPackage.PHYSICAL__TECHNICAL, oldTechnical, newTechnical);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnical(Technical newTechnical) {
		if (newTechnical != technical) {
			NotificationChain msgs = null;
			if (technical != null)
				msgs = ((InternalEObject)technical).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QxfPackage.PHYSICAL__TECHNICAL, null, msgs);
			if (newTechnical != null)
				msgs = ((InternalEObject)newTechnical).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QxfPackage.PHYSICAL__TECHNICAL, null, msgs);
			msgs = basicSetTechnical(newTechnical, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QxfPackage.PHYSICAL__TECHNICAL, newTechnical, newTechnical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QxfPackage.PHYSICAL__BULB:
				return basicSetBulb(null, msgs);
			case QxfPackage.PHYSICAL__DIMENSIONS:
				return basicSetDimensions(null, msgs);
			case QxfPackage.PHYSICAL__LENS:
				return basicSetLens(null, msgs);
			case QxfPackage.PHYSICAL__FOCUS:
				return basicSetFocus(null, msgs);
			case QxfPackage.PHYSICAL__TECHNICAL:
				return basicSetTechnical(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QxfPackage.PHYSICAL__BULB:
				return getBulb();
			case QxfPackage.PHYSICAL__DIMENSIONS:
				return getDimensions();
			case QxfPackage.PHYSICAL__LENS:
				return getLens();
			case QxfPackage.PHYSICAL__FOCUS:
				return getFocus();
			case QxfPackage.PHYSICAL__TECHNICAL:
				return getTechnical();
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
			case QxfPackage.PHYSICAL__BULB:
				setBulb((Bulb)newValue);
				return;
			case QxfPackage.PHYSICAL__DIMENSIONS:
				setDimensions((Dimensions)newValue);
				return;
			case QxfPackage.PHYSICAL__LENS:
				setLens((Lens)newValue);
				return;
			case QxfPackage.PHYSICAL__FOCUS:
				setFocus((Focus)newValue);
				return;
			case QxfPackage.PHYSICAL__TECHNICAL:
				setTechnical((Technical)newValue);
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
			case QxfPackage.PHYSICAL__BULB:
				setBulb((Bulb)null);
				return;
			case QxfPackage.PHYSICAL__DIMENSIONS:
				setDimensions((Dimensions)null);
				return;
			case QxfPackage.PHYSICAL__LENS:
				setLens((Lens)null);
				return;
			case QxfPackage.PHYSICAL__FOCUS:
				setFocus((Focus)null);
				return;
			case QxfPackage.PHYSICAL__TECHNICAL:
				setTechnical((Technical)null);
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
			case QxfPackage.PHYSICAL__BULB:
				return bulb != null;
			case QxfPackage.PHYSICAL__DIMENSIONS:
				return dimensions != null;
			case QxfPackage.PHYSICAL__LENS:
				return lens != null;
			case QxfPackage.PHYSICAL__FOCUS:
				return focus != null;
			case QxfPackage.PHYSICAL__TECHNICAL:
				return technical != null;
		}
		return super.eIsSet(featureID);
	}

} //PhysicalImpl
