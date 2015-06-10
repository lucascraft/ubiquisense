/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.model.qxf.impl;

import net.sf.smbt.dmx.model.qxf.Bulb;
import net.sf.smbt.dmx.model.qxf.QxfPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bulb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.impl.BulbImpl#getColourTemperature <em>Colour Temperature</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.impl.BulbImpl#getLumens <em>Lumens</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.impl.BulbImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BulbImpl extends EObjectImpl implements Bulb {
	/**
	 * The default value of the '{@link #getColourTemperature() <em>Colour Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColourTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOUR_TEMPERATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColourTemperature() <em>Colour Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColourTemperature()
	 * @generated
	 * @ordered
	 */
	protected String colourTemperature = COLOUR_TEMPERATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLumens() <em>Lumens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLumens()
	 * @generated
	 * @ordered
	 */
	protected static final String LUMENS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLumens() <em>Lumens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLumens()
	 * @generated
	 * @ordered
	 */
	protected String lumens = LUMENS_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BulbImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QxfPackage.Literals.BULB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColourTemperature() {
		return colourTemperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColourTemperature(String newColourTemperature) {
		String oldColourTemperature = colourTemperature;
		colourTemperature = newColourTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QxfPackage.BULB__COLOUR_TEMPERATURE, oldColourTemperature, colourTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLumens() {
		return lumens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLumens(String newLumens) {
		String oldLumens = lumens;
		lumens = newLumens;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QxfPackage.BULB__LUMENS, oldLumens, lumens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QxfPackage.BULB__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QxfPackage.BULB__COLOUR_TEMPERATURE:
				return getColourTemperature();
			case QxfPackage.BULB__LUMENS:
				return getLumens();
			case QxfPackage.BULB__TYPE:
				return getType();
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
			case QxfPackage.BULB__COLOUR_TEMPERATURE:
				setColourTemperature((String)newValue);
				return;
			case QxfPackage.BULB__LUMENS:
				setLumens((String)newValue);
				return;
			case QxfPackage.BULB__TYPE:
				setType((String)newValue);
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
			case QxfPackage.BULB__COLOUR_TEMPERATURE:
				setColourTemperature(COLOUR_TEMPERATURE_EDEFAULT);
				return;
			case QxfPackage.BULB__LUMENS:
				setLumens(LUMENS_EDEFAULT);
				return;
			case QxfPackage.BULB__TYPE:
				setType(TYPE_EDEFAULT);
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
			case QxfPackage.BULB__COLOUR_TEMPERATURE:
				return COLOUR_TEMPERATURE_EDEFAULT == null ? colourTemperature != null : !COLOUR_TEMPERATURE_EDEFAULT.equals(colourTemperature);
			case QxfPackage.BULB__LUMENS:
				return LUMENS_EDEFAULT == null ? lumens != null : !LUMENS_EDEFAULT.equals(lumens);
			case QxfPackage.BULB__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (colourTemperature: ");
		result.append(colourTemperature);
		result.append(", lumens: ");
		result.append(lumens);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //BulbImpl
