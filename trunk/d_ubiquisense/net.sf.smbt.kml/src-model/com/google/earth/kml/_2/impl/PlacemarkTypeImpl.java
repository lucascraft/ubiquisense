/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import com.google.earth.kml._2.GeometryType;
import com.google.earth.kml._2.PlacemarkType;
import com.google.earth.kml._2.v21Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Placemark Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.impl.PlacemarkTypeImpl#getGeometryGroup <em>Geometry Group</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.PlacemarkTypeImpl#getGeometry <em>Geometry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlacemarkTypeImpl extends FeatureTypeImpl implements PlacemarkType {
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
	protected PlacemarkTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return v21Package.Literals.PLACEMARK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGeometryGroup() {
		if (geometryGroup == null) {
			geometryGroup = new BasicFeatureMap(this, v21Package.PLACEMARK_TYPE__GEOMETRY_GROUP);
		}
		return geometryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometryType getGeometry() {
		return (GeometryType)getGeometryGroup().get(v21Package.Literals.PLACEMARK_TYPE__GEOMETRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeometry(GeometryType newGeometry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getGeometryGroup()).basicAdd(v21Package.Literals.PLACEMARK_TYPE__GEOMETRY, newGeometry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case v21Package.PLACEMARK_TYPE__GEOMETRY_GROUP:
				return ((InternalEList<?>)getGeometryGroup()).basicRemove(otherEnd, msgs);
			case v21Package.PLACEMARK_TYPE__GEOMETRY:
				return basicSetGeometry(null, msgs);
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
			case v21Package.PLACEMARK_TYPE__GEOMETRY_GROUP:
				if (coreType) return getGeometryGroup();
				return ((FeatureMap.Internal)getGeometryGroup()).getWrapper();
			case v21Package.PLACEMARK_TYPE__GEOMETRY:
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
			case v21Package.PLACEMARK_TYPE__GEOMETRY_GROUP:
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
			case v21Package.PLACEMARK_TYPE__GEOMETRY_GROUP:
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
			case v21Package.PLACEMARK_TYPE__GEOMETRY_GROUP:
				return geometryGroup != null && !geometryGroup.isEmpty();
			case v21Package.PLACEMARK_TYPE__GEOMETRY:
				return getGeometry() != null;
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

} //PlacemarkTypeImpl
