/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.model.qxf.impl;

import net.sf.smbt.dmx.model.qxf.Lens;
import net.sf.smbt.dmx.model.qxf.QxfPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lens</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.impl.LensImpl#getDegreesMax <em>Degrees Max</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.impl.LensImpl#getDegreesMin <em>Degrees Min</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.impl.LensImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LensImpl extends EObjectImpl implements Lens {
	/**
	 * The default value of the '{@link #getDegreesMax() <em>Degrees Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreesMax()
	 * @generated
	 * @ordered
	 */
	protected static final String DEGREES_MAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDegreesMax() <em>Degrees Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreesMax()
	 * @generated
	 * @ordered
	 */
	protected String degreesMax = DEGREES_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getDegreesMin() <em>Degrees Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreesMin()
	 * @generated
	 * @ordered
	 */
	protected static final String DEGREES_MIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDegreesMin() <em>Degrees Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreesMin()
	 * @generated
	 * @ordered
	 */
	protected String degreesMin = DEGREES_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LensImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QxfPackage.Literals.LENS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDegreesMax() {
		return degreesMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDegreesMax(String newDegreesMax) {
		String oldDegreesMax = degreesMax;
		degreesMax = newDegreesMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QxfPackage.LENS__DEGREES_MAX, oldDegreesMax, degreesMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDegreesMin() {
		return degreesMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDegreesMin(String newDegreesMin) {
		String oldDegreesMin = degreesMin;
		degreesMin = newDegreesMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QxfPackage.LENS__DEGREES_MIN, oldDegreesMin, degreesMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QxfPackage.LENS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QxfPackage.LENS__DEGREES_MAX:
				return getDegreesMax();
			case QxfPackage.LENS__DEGREES_MIN:
				return getDegreesMin();
			case QxfPackage.LENS__NAME:
				return getName();
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
			case QxfPackage.LENS__DEGREES_MAX:
				setDegreesMax((String)newValue);
				return;
			case QxfPackage.LENS__DEGREES_MIN:
				setDegreesMin((String)newValue);
				return;
			case QxfPackage.LENS__NAME:
				setName((String)newValue);
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
			case QxfPackage.LENS__DEGREES_MAX:
				setDegreesMax(DEGREES_MAX_EDEFAULT);
				return;
			case QxfPackage.LENS__DEGREES_MIN:
				setDegreesMin(DEGREES_MIN_EDEFAULT);
				return;
			case QxfPackage.LENS__NAME:
				setName(NAME_EDEFAULT);
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
			case QxfPackage.LENS__DEGREES_MAX:
				return DEGREES_MAX_EDEFAULT == null ? degreesMax != null : !DEGREES_MAX_EDEFAULT.equals(degreesMax);
			case QxfPackage.LENS__DEGREES_MIN:
				return DEGREES_MIN_EDEFAULT == null ? degreesMin != null : !DEGREES_MIN_EDEFAULT.equals(degreesMin);
			case QxfPackage.LENS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (degreesMax: ");
		result.append(degreesMax);
		result.append(", degreesMin: ");
		result.append(degreesMin);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LensImpl
