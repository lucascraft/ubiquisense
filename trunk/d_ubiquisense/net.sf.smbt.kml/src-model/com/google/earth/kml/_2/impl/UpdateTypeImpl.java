/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import com.google.earth.kml._2.ChangeType;
import com.google.earth.kml._2.CreateType;
import com.google.earth.kml._2.DeleteType;
import com.google.earth.kml._2.ReplaceType;
import com.google.earth.kml._2.UpdateType;
import com.google.earth.kml._2.v21Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.impl.UpdateTypeImpl#getTargetHref <em>Target Href</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.UpdateTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.UpdateTypeImpl#getCreate <em>Create</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.UpdateTypeImpl#getDelete <em>Delete</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.UpdateTypeImpl#getChange <em>Change</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.UpdateTypeImpl#getReplace <em>Replace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UpdateTypeImpl extends EObjectImpl implements UpdateType {
	/**
	 * The default value of the '{@link #getTargetHref() <em>Target Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetHref()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetHref() <em>Target Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetHref()
	 * @generated
	 * @ordered
	 */
	protected String targetHref = TARGET_HREF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return v21Package.Literals.UPDATE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetHref() {
		return targetHref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetHref(String newTargetHref) {
		String oldTargetHref = targetHref;
		targetHref = newTargetHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.UPDATE_TYPE__TARGET_HREF, oldTargetHref, targetHref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, v21Package.UPDATE_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CreateType> getCreate() {
		return getGroup().list(v21Package.Literals.UPDATE_TYPE__CREATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeleteType> getDelete() {
		return getGroup().list(v21Package.Literals.UPDATE_TYPE__DELETE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChangeType> getChange() {
		return getGroup().list(v21Package.Literals.UPDATE_TYPE__CHANGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReplaceType> getReplace() {
		return getGroup().list(v21Package.Literals.UPDATE_TYPE__REPLACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case v21Package.UPDATE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case v21Package.UPDATE_TYPE__CREATE:
				return ((InternalEList<?>)getCreate()).basicRemove(otherEnd, msgs);
			case v21Package.UPDATE_TYPE__DELETE:
				return ((InternalEList<?>)getDelete()).basicRemove(otherEnd, msgs);
			case v21Package.UPDATE_TYPE__CHANGE:
				return ((InternalEList<?>)getChange()).basicRemove(otherEnd, msgs);
			case v21Package.UPDATE_TYPE__REPLACE:
				return ((InternalEList<?>)getReplace()).basicRemove(otherEnd, msgs);
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
			case v21Package.UPDATE_TYPE__TARGET_HREF:
				return getTargetHref();
			case v21Package.UPDATE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case v21Package.UPDATE_TYPE__CREATE:
				return getCreate();
			case v21Package.UPDATE_TYPE__DELETE:
				return getDelete();
			case v21Package.UPDATE_TYPE__CHANGE:
				return getChange();
			case v21Package.UPDATE_TYPE__REPLACE:
				return getReplace();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case v21Package.UPDATE_TYPE__TARGET_HREF:
				setTargetHref((String)newValue);
				return;
			case v21Package.UPDATE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case v21Package.UPDATE_TYPE__CREATE:
				getCreate().clear();
				getCreate().addAll((Collection<? extends CreateType>)newValue);
				return;
			case v21Package.UPDATE_TYPE__DELETE:
				getDelete().clear();
				getDelete().addAll((Collection<? extends DeleteType>)newValue);
				return;
			case v21Package.UPDATE_TYPE__CHANGE:
				getChange().clear();
				getChange().addAll((Collection<? extends ChangeType>)newValue);
				return;
			case v21Package.UPDATE_TYPE__REPLACE:
				getReplace().clear();
				getReplace().addAll((Collection<? extends ReplaceType>)newValue);
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
			case v21Package.UPDATE_TYPE__TARGET_HREF:
				setTargetHref(TARGET_HREF_EDEFAULT);
				return;
			case v21Package.UPDATE_TYPE__GROUP:
				getGroup().clear();
				return;
			case v21Package.UPDATE_TYPE__CREATE:
				getCreate().clear();
				return;
			case v21Package.UPDATE_TYPE__DELETE:
				getDelete().clear();
				return;
			case v21Package.UPDATE_TYPE__CHANGE:
				getChange().clear();
				return;
			case v21Package.UPDATE_TYPE__REPLACE:
				getReplace().clear();
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
			case v21Package.UPDATE_TYPE__TARGET_HREF:
				return TARGET_HREF_EDEFAULT == null ? targetHref != null : !TARGET_HREF_EDEFAULT.equals(targetHref);
			case v21Package.UPDATE_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case v21Package.UPDATE_TYPE__CREATE:
				return !getCreate().isEmpty();
			case v21Package.UPDATE_TYPE__DELETE:
				return !getDelete().isEmpty();
			case v21Package.UPDATE_TYPE__CHANGE:
				return !getChange().isEmpty();
			case v21Package.UPDATE_TYPE__REPLACE:
				return !getReplace().isEmpty();
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
		result.append(" (targetHref: ");
		result.append(targetHref);
		result.append(", group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //UpdateTypeImpl
