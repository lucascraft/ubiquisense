/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.json.ecore.ezjson.impl;

import net.sf.smbt.json.ecore.ezjson.EzjsonPackage;
import net.sf.smbt.json.ecore.ezjson.JsonCmd;

import net.sf.xqz.model.cmd.impl.CmdImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Json Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.json.ecore.ezjson.impl.JsonCmdImpl#getJson <em>Json</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JsonCmdImpl extends CmdImpl implements JsonCmd {
	/**
	 * The default value of the '{@link #getJson() <em>Json</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJson()
	 * @generated
	 * @ordered
	 */
	protected static final Object JSON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJson() <em>Json</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJson()
	 * @generated
	 * @ordered
	 */
	protected Object json = JSON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JsonCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzjsonPackage.Literals.JSON_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getJson() {
		return json;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJson(Object newJson) {
		Object oldJson = json;
		json = newJson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzjsonPackage.JSON_CMD__JSON, oldJson, json));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EzjsonPackage.JSON_CMD__JSON:
				return getJson();
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
			case EzjsonPackage.JSON_CMD__JSON:
				setJson(newValue);
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
			case EzjsonPackage.JSON_CMD__JSON:
				setJson(JSON_EDEFAULT);
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
			case EzjsonPackage.JSON_CMD__JSON:
				return JSON_EDEFAULT == null ? json != null : !JSON_EDEFAULT.equals(json);
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
		result.append(" (json: ");
		result.append(json);
		result.append(')');
		return result.toString();
	}

} //JsonCmdImpl
