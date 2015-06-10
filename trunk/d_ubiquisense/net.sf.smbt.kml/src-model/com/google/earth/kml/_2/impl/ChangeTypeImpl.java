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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import com.google.earth.kml._2.ChangeType;
import com.google.earth.kml._2.FeatureType;
import com.google.earth.kml._2.GeometryType;
import com.google.earth.kml._2.ObjectType;
import com.google.earth.kml._2.StyleSelectorType;
import com.google.earth.kml._2.TimePrimitiveType;
import com.google.earth.kml._2.v21Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.impl.ChangeTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.ChangeTypeImpl#getObjectGroup <em>Object Group</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.ChangeTypeImpl#getObject <em>Object</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.ChangeTypeImpl#getFeatureGroup <em>Feature Group</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.ChangeTypeImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.ChangeTypeImpl#getGeometryGroup <em>Geometry Group</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.ChangeTypeImpl#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.ChangeTypeImpl#getStyleSelectorGroup <em>Style Selector Group</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.ChangeTypeImpl#getStyleSelector <em>Style Selector</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.ChangeTypeImpl#getTimePrimitiveGroup <em>Time Primitive Group</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.ChangeTypeImpl#getTimePrimitive <em>Time Primitive</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChangeTypeImpl extends EObjectImpl implements ChangeType {
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
	protected ChangeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return v21Package.Literals.CHANGE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, v21Package.CHANGE_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getObjectGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(v21Package.Literals.CHANGE_TYPE__OBJECT_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectType> getObject() {
		return getObjectGroup().list(v21Package.Literals.CHANGE_TYPE__OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getFeatureGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(v21Package.Literals.CHANGE_TYPE__FEATURE_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureType> getFeature() {
		return getFeatureGroup().list(v21Package.Literals.CHANGE_TYPE__FEATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGeometryGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(v21Package.Literals.CHANGE_TYPE__GEOMETRY_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeometryType> getGeometry() {
		return getGeometryGroup().list(v21Package.Literals.CHANGE_TYPE__GEOMETRY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getStyleSelectorGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(v21Package.Literals.CHANGE_TYPE__STYLE_SELECTOR_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StyleSelectorType> getStyleSelector() {
		return getStyleSelectorGroup().list(v21Package.Literals.CHANGE_TYPE__STYLE_SELECTOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getTimePrimitiveGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(v21Package.Literals.CHANGE_TYPE__TIME_PRIMITIVE_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimePrimitiveType> getTimePrimitive() {
		return getTimePrimitiveGroup().list(v21Package.Literals.CHANGE_TYPE__TIME_PRIMITIVE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case v21Package.CHANGE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case v21Package.CHANGE_TYPE__OBJECT_GROUP:
				return ((InternalEList<?>)getObjectGroup()).basicRemove(otherEnd, msgs);
			case v21Package.CHANGE_TYPE__OBJECT:
				return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
			case v21Package.CHANGE_TYPE__FEATURE_GROUP:
				return ((InternalEList<?>)getFeatureGroup()).basicRemove(otherEnd, msgs);
			case v21Package.CHANGE_TYPE__FEATURE:
				return ((InternalEList<?>)getFeature()).basicRemove(otherEnd, msgs);
			case v21Package.CHANGE_TYPE__GEOMETRY_GROUP:
				return ((InternalEList<?>)getGeometryGroup()).basicRemove(otherEnd, msgs);
			case v21Package.CHANGE_TYPE__GEOMETRY:
				return ((InternalEList<?>)getGeometry()).basicRemove(otherEnd, msgs);
			case v21Package.CHANGE_TYPE__STYLE_SELECTOR_GROUP:
				return ((InternalEList<?>)getStyleSelectorGroup()).basicRemove(otherEnd, msgs);
			case v21Package.CHANGE_TYPE__STYLE_SELECTOR:
				return ((InternalEList<?>)getStyleSelector()).basicRemove(otherEnd, msgs);
			case v21Package.CHANGE_TYPE__TIME_PRIMITIVE_GROUP:
				return ((InternalEList<?>)getTimePrimitiveGroup()).basicRemove(otherEnd, msgs);
			case v21Package.CHANGE_TYPE__TIME_PRIMITIVE:
				return ((InternalEList<?>)getTimePrimitive()).basicRemove(otherEnd, msgs);
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
			case v21Package.CHANGE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case v21Package.CHANGE_TYPE__OBJECT_GROUP:
				if (coreType) return getObjectGroup();
				return ((FeatureMap.Internal)getObjectGroup()).getWrapper();
			case v21Package.CHANGE_TYPE__OBJECT:
				return getObject();
			case v21Package.CHANGE_TYPE__FEATURE_GROUP:
				if (coreType) return getFeatureGroup();
				return ((FeatureMap.Internal)getFeatureGroup()).getWrapper();
			case v21Package.CHANGE_TYPE__FEATURE:
				return getFeature();
			case v21Package.CHANGE_TYPE__GEOMETRY_GROUP:
				if (coreType) return getGeometryGroup();
				return ((FeatureMap.Internal)getGeometryGroup()).getWrapper();
			case v21Package.CHANGE_TYPE__GEOMETRY:
				return getGeometry();
			case v21Package.CHANGE_TYPE__STYLE_SELECTOR_GROUP:
				if (coreType) return getStyleSelectorGroup();
				return ((FeatureMap.Internal)getStyleSelectorGroup()).getWrapper();
			case v21Package.CHANGE_TYPE__STYLE_SELECTOR:
				return getStyleSelector();
			case v21Package.CHANGE_TYPE__TIME_PRIMITIVE_GROUP:
				if (coreType) return getTimePrimitiveGroup();
				return ((FeatureMap.Internal)getTimePrimitiveGroup()).getWrapper();
			case v21Package.CHANGE_TYPE__TIME_PRIMITIVE:
				return getTimePrimitive();
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
			case v21Package.CHANGE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case v21Package.CHANGE_TYPE__OBJECT_GROUP:
				((FeatureMap.Internal)getObjectGroup()).set(newValue);
				return;
			case v21Package.CHANGE_TYPE__FEATURE_GROUP:
				((FeatureMap.Internal)getFeatureGroup()).set(newValue);
				return;
			case v21Package.CHANGE_TYPE__GEOMETRY_GROUP:
				((FeatureMap.Internal)getGeometryGroup()).set(newValue);
				return;
			case v21Package.CHANGE_TYPE__STYLE_SELECTOR_GROUP:
				((FeatureMap.Internal)getStyleSelectorGroup()).set(newValue);
				return;
			case v21Package.CHANGE_TYPE__TIME_PRIMITIVE_GROUP:
				((FeatureMap.Internal)getTimePrimitiveGroup()).set(newValue);
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
			case v21Package.CHANGE_TYPE__GROUP:
				getGroup().clear();
				return;
			case v21Package.CHANGE_TYPE__OBJECT_GROUP:
				getObjectGroup().clear();
				return;
			case v21Package.CHANGE_TYPE__FEATURE_GROUP:
				getFeatureGroup().clear();
				return;
			case v21Package.CHANGE_TYPE__GEOMETRY_GROUP:
				getGeometryGroup().clear();
				return;
			case v21Package.CHANGE_TYPE__STYLE_SELECTOR_GROUP:
				getStyleSelectorGroup().clear();
				return;
			case v21Package.CHANGE_TYPE__TIME_PRIMITIVE_GROUP:
				getTimePrimitiveGroup().clear();
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
			case v21Package.CHANGE_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case v21Package.CHANGE_TYPE__OBJECT_GROUP:
				return !getObjectGroup().isEmpty();
			case v21Package.CHANGE_TYPE__OBJECT:
				return !getObject().isEmpty();
			case v21Package.CHANGE_TYPE__FEATURE_GROUP:
				return !getFeatureGroup().isEmpty();
			case v21Package.CHANGE_TYPE__FEATURE:
				return !getFeature().isEmpty();
			case v21Package.CHANGE_TYPE__GEOMETRY_GROUP:
				return !getGeometryGroup().isEmpty();
			case v21Package.CHANGE_TYPE__GEOMETRY:
				return !getGeometry().isEmpty();
			case v21Package.CHANGE_TYPE__STYLE_SELECTOR_GROUP:
				return !getStyleSelectorGroup().isEmpty();
			case v21Package.CHANGE_TYPE__STYLE_SELECTOR:
				return !getStyleSelector().isEmpty();
			case v21Package.CHANGE_TYPE__TIME_PRIMITIVE_GROUP:
				return !getTimePrimitiveGroup().isEmpty();
			case v21Package.CHANGE_TYPE__TIME_PRIMITIVE:
				return !getTimePrimitive().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //ChangeTypeImpl
