/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import com.google.earth.kml._2.GeometryType;
import com.google.earth.kml._2.MultiGeometryType;
import com.google.earth.kml._2.v21Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.impl.MultiGeometryTypeImpl#getGeometryGroup <em>Geometry Group</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.MultiGeometryTypeImpl#getGeometry <em>Geometry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiGeometryTypeImpl extends GeometryTypeImpl implements MultiGeometryType {
	/**
	 * The cached value of the '{@link #getGeometryGroup() <em>Geometry Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap geometryGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiGeometryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return v21Package.Literals.MULTI_GEOMETRY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGeometryGroup() {
		if (geometryGroup == null) {
			geometryGroup = new BasicFeatureMap(this, v21Package.MULTI_GEOMETRY_TYPE__GEOMETRY_GROUP);
		}
		return geometryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeometryType> getGeometry() {
		return getGeometryGroup().list(v21Package.Literals.MULTI_GEOMETRY_TYPE__GEOMETRY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case v21Package.MULTI_GEOMETRY_TYPE__GEOMETRY_GROUP:
				return ((InternalEList<?>)getGeometryGroup()).basicRemove(otherEnd, msgs);
			case v21Package.MULTI_GEOMETRY_TYPE__GEOMETRY:
				return ((InternalEList<?>)getGeometry()).basicRemove(otherEnd, msgs);
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
			case v21Package.MULTI_GEOMETRY_TYPE__GEOMETRY_GROUP:
				if (coreType) return getGeometryGroup();
				return ((FeatureMap.Internal)getGeometryGroup()).getWrapper();
			case v21Package.MULTI_GEOMETRY_TYPE__GEOMETRY:
				return getGeometry();
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
			case v21Package.MULTI_GEOMETRY_TYPE__GEOMETRY_GROUP:
				((FeatureMap.Internal)getGeometryGroup()).set(newValue);
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
			case v21Package.MULTI_GEOMETRY_TYPE__GEOMETRY_GROUP:
				getGeometryGroup().clear();
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
			case v21Package.MULTI_GEOMETRY_TYPE__GEOMETRY_GROUP:
				return geometryGroup != null && !geometryGroup.isEmpty();
			case v21Package.MULTI_GEOMETRY_TYPE__GEOMETRY:
				return !getGeometry().isEmpty();
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
		result.append(" (geometryGroup: ");
		result.append(geometryGroup);
		result.append(')');
		return result.toString();
	}

} //MultiGeometryTypeImpl
