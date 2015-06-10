/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.model.qxf.impl;

import net.sf.smbt.dmx.model.qxf.QxfPackage;
import net.sf.smbt.dmx.model.qxf.Technical;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technical</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.impl.TechnicalImpl#getDmxConnector <em>Dmx Connector</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.qxf.impl.TechnicalImpl#getPowerConsumption <em>Power Consumption</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TechnicalImpl extends EObjectImpl implements Technical {
	/**
	 * The default value of the '{@link #getDmxConnector() <em>Dmx Connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmxConnector()
	 * @generated
	 * @ordered
	 */
	protected static final String DMX_CONNECTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDmxConnector() <em>Dmx Connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDmxConnector()
	 * @generated
	 * @ordered
	 */
	protected String dmxConnector = DMX_CONNECTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPowerConsumption() <em>Power Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerConsumption()
	 * @generated
	 * @ordered
	 */
	protected static final String POWER_CONSUMPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPowerConsumption() <em>Power Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerConsumption()
	 * @generated
	 * @ordered
	 */
	protected String powerConsumption = POWER_CONSUMPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechnicalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QxfPackage.Literals.TECHNICAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDmxConnector() {
		return dmxConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDmxConnector(String newDmxConnector) {
		String oldDmxConnector = dmxConnector;
		dmxConnector = newDmxConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QxfPackage.TECHNICAL__DMX_CONNECTOR, oldDmxConnector, dmxConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPowerConsumption() {
		return powerConsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerConsumption(String newPowerConsumption) {
		String oldPowerConsumption = powerConsumption;
		powerConsumption = newPowerConsumption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QxfPackage.TECHNICAL__POWER_CONSUMPTION, oldPowerConsumption, powerConsumption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QxfPackage.TECHNICAL__DMX_CONNECTOR:
				return getDmxConnector();
			case QxfPackage.TECHNICAL__POWER_CONSUMPTION:
				return getPowerConsumption();
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
			case QxfPackage.TECHNICAL__DMX_CONNECTOR:
				setDmxConnector((String)newValue);
				return;
			case QxfPackage.TECHNICAL__POWER_CONSUMPTION:
				setPowerConsumption((String)newValue);
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
			case QxfPackage.TECHNICAL__DMX_CONNECTOR:
				setDmxConnector(DMX_CONNECTOR_EDEFAULT);
				return;
			case QxfPackage.TECHNICAL__POWER_CONSUMPTION:
				setPowerConsumption(POWER_CONSUMPTION_EDEFAULT);
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
			case QxfPackage.TECHNICAL__DMX_CONNECTOR:
				return DMX_CONNECTOR_EDEFAULT == null ? dmxConnector != null : !DMX_CONNECTOR_EDEFAULT.equals(dmxConnector);
			case QxfPackage.TECHNICAL__POWER_CONSUMPTION:
				return POWER_CONSUMPTION_EDEFAULT == null ? powerConsumption != null : !POWER_CONSUMPTION_EDEFAULT.equals(powerConsumption);
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
		result.append(" (dmxConnector: ");
		result.append(dmxConnector);
		result.append(", powerConsumption: ");
		result.append(powerConsumption);
		result.append(')');
		return result.toString();
	}

} //TechnicalImpl
