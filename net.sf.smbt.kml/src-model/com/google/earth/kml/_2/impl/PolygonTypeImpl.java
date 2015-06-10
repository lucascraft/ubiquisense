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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.google.earth.kml._2.AltitudeModeEnum;
import com.google.earth.kml._2.BoundaryType;
import com.google.earth.kml._2.PolygonType;
import com.google.earth.kml._2.v21Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polygon Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.impl.PolygonTypeImpl#isExtrude <em>Extrude</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.PolygonTypeImpl#isTessellate <em>Tessellate</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.PolygonTypeImpl#getAltitudeMode <em>Altitude Mode</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.PolygonTypeImpl#getOuterBoundaryIs <em>Outer Boundary Is</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.PolygonTypeImpl#getInnerBoundaryIs <em>Inner Boundary Is</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolygonTypeImpl extends GeometryTypeImpl implements PolygonType {
	/**
	 * The default value of the '{@link #isExtrude() <em>Extrude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExtrude()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTRUDE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExtrude() <em>Extrude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExtrude()
	 * @generated
	 * @ordered
	 */
	protected boolean extrude = EXTRUDE_EDEFAULT;

	/**
	 * This is true if the Extrude attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean extrudeESet;

	/**
	 * The default value of the '{@link #isTessellate() <em>Tessellate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTessellate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TESSELLATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTessellate() <em>Tessellate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTessellate()
	 * @generated
	 * @ordered
	 */
	protected boolean tessellate = TESSELLATE_EDEFAULT;

	/**
	 * This is true if the Tessellate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tessellateESet;

	/**
	 * The default value of the '{@link #getAltitudeMode() <em>Altitude Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitudeMode()
	 * @generated
	 * @ordered
	 */
	protected static final AltitudeModeEnum ALTITUDE_MODE_EDEFAULT = AltitudeModeEnum.CLAMP_TO_GROUND;

	/**
	 * The cached value of the '{@link #getAltitudeMode() <em>Altitude Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitudeMode()
	 * @generated
	 * @ordered
	 */
	protected AltitudeModeEnum altitudeMode = ALTITUDE_MODE_EDEFAULT;

	/**
	 * This is true if the Altitude Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean altitudeModeESet;

	/**
	 * The cached value of the '{@link #getOuterBoundaryIs() <em>Outer Boundary Is</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterBoundaryIs()
	 * @generated
	 * @ordered
	 */
	protected BoundaryType outerBoundaryIs;

	/**
	 * The cached value of the '{@link #getInnerBoundaryIs() <em>Inner Boundary Is</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerBoundaryIs()
	 * @generated
	 * @ordered
	 */
	protected EList<BoundaryType> innerBoundaryIs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolygonTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return v21Package.Literals.POLYGON_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExtrude() {
		return extrude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtrude(boolean newExtrude) {
		boolean oldExtrude = extrude;
		extrude = newExtrude;
		boolean oldExtrudeESet = extrudeESet;
		extrudeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.POLYGON_TYPE__EXTRUDE, oldExtrude, extrude, !oldExtrudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExtrude() {
		boolean oldExtrude = extrude;
		boolean oldExtrudeESet = extrudeESet;
		extrude = EXTRUDE_EDEFAULT;
		extrudeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.POLYGON_TYPE__EXTRUDE, oldExtrude, EXTRUDE_EDEFAULT, oldExtrudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExtrude() {
		return extrudeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTessellate() {
		return tessellate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTessellate(boolean newTessellate) {
		boolean oldTessellate = tessellate;
		tessellate = newTessellate;
		boolean oldTessellateESet = tessellateESet;
		tessellateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.POLYGON_TYPE__TESSELLATE, oldTessellate, tessellate, !oldTessellateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTessellate() {
		boolean oldTessellate = tessellate;
		boolean oldTessellateESet = tessellateESet;
		tessellate = TESSELLATE_EDEFAULT;
		tessellateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.POLYGON_TYPE__TESSELLATE, oldTessellate, TESSELLATE_EDEFAULT, oldTessellateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTessellate() {
		return tessellateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AltitudeModeEnum getAltitudeMode() {
		return altitudeMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltitudeMode(AltitudeModeEnum newAltitudeMode) {
		AltitudeModeEnum oldAltitudeMode = altitudeMode;
		altitudeMode = newAltitudeMode == null ? ALTITUDE_MODE_EDEFAULT : newAltitudeMode;
		boolean oldAltitudeModeESet = altitudeModeESet;
		altitudeModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.POLYGON_TYPE__ALTITUDE_MODE, oldAltitudeMode, altitudeMode, !oldAltitudeModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAltitudeMode() {
		AltitudeModeEnum oldAltitudeMode = altitudeMode;
		boolean oldAltitudeModeESet = altitudeModeESet;
		altitudeMode = ALTITUDE_MODE_EDEFAULT;
		altitudeModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.POLYGON_TYPE__ALTITUDE_MODE, oldAltitudeMode, ALTITUDE_MODE_EDEFAULT, oldAltitudeModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAltitudeMode() {
		return altitudeModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundaryType getOuterBoundaryIs() {
		return outerBoundaryIs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuterBoundaryIs(BoundaryType newOuterBoundaryIs, NotificationChain msgs) {
		BoundaryType oldOuterBoundaryIs = outerBoundaryIs;
		outerBoundaryIs = newOuterBoundaryIs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, v21Package.POLYGON_TYPE__OUTER_BOUNDARY_IS, oldOuterBoundaryIs, newOuterBoundaryIs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterBoundaryIs(BoundaryType newOuterBoundaryIs) {
		if (newOuterBoundaryIs != outerBoundaryIs) {
			NotificationChain msgs = null;
			if (outerBoundaryIs != null)
				msgs = ((InternalEObject)outerBoundaryIs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - v21Package.POLYGON_TYPE__OUTER_BOUNDARY_IS, null, msgs);
			if (newOuterBoundaryIs != null)
				msgs = ((InternalEObject)newOuterBoundaryIs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - v21Package.POLYGON_TYPE__OUTER_BOUNDARY_IS, null, msgs);
			msgs = basicSetOuterBoundaryIs(newOuterBoundaryIs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.POLYGON_TYPE__OUTER_BOUNDARY_IS, newOuterBoundaryIs, newOuterBoundaryIs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BoundaryType> getInnerBoundaryIs() {
		if (innerBoundaryIs == null) {
			innerBoundaryIs = new EObjectContainmentEList<BoundaryType>(BoundaryType.class, this, v21Package.POLYGON_TYPE__INNER_BOUNDARY_IS);
		}
		return innerBoundaryIs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case v21Package.POLYGON_TYPE__OUTER_BOUNDARY_IS:
				return basicSetOuterBoundaryIs(null, msgs);
			case v21Package.POLYGON_TYPE__INNER_BOUNDARY_IS:
				return ((InternalEList<?>)getInnerBoundaryIs()).basicRemove(otherEnd, msgs);
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
			case v21Package.POLYGON_TYPE__EXTRUDE:
				return isExtrude();
			case v21Package.POLYGON_TYPE__TESSELLATE:
				return isTessellate();
			case v21Package.POLYGON_TYPE__ALTITUDE_MODE:
				return getAltitudeMode();
			case v21Package.POLYGON_TYPE__OUTER_BOUNDARY_IS:
				return getOuterBoundaryIs();
			case v21Package.POLYGON_TYPE__INNER_BOUNDARY_IS:
				return getInnerBoundaryIs();
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
			case v21Package.POLYGON_TYPE__EXTRUDE:
				setExtrude((Boolean)newValue);
				return;
			case v21Package.POLYGON_TYPE__TESSELLATE:
				setTessellate((Boolean)newValue);
				return;
			case v21Package.POLYGON_TYPE__ALTITUDE_MODE:
				setAltitudeMode((AltitudeModeEnum)newValue);
				return;
			case v21Package.POLYGON_TYPE__OUTER_BOUNDARY_IS:
				setOuterBoundaryIs((BoundaryType)newValue);
				return;
			case v21Package.POLYGON_TYPE__INNER_BOUNDARY_IS:
				getInnerBoundaryIs().clear();
				getInnerBoundaryIs().addAll((Collection<? extends BoundaryType>)newValue);
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
			case v21Package.POLYGON_TYPE__EXTRUDE:
				unsetExtrude();
				return;
			case v21Package.POLYGON_TYPE__TESSELLATE:
				unsetTessellate();
				return;
			case v21Package.POLYGON_TYPE__ALTITUDE_MODE:
				unsetAltitudeMode();
				return;
			case v21Package.POLYGON_TYPE__OUTER_BOUNDARY_IS:
				setOuterBoundaryIs((BoundaryType)null);
				return;
			case v21Package.POLYGON_TYPE__INNER_BOUNDARY_IS:
				getInnerBoundaryIs().clear();
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
			case v21Package.POLYGON_TYPE__EXTRUDE:
				return isSetExtrude();
			case v21Package.POLYGON_TYPE__TESSELLATE:
				return isSetTessellate();
			case v21Package.POLYGON_TYPE__ALTITUDE_MODE:
				return isSetAltitudeMode();
			case v21Package.POLYGON_TYPE__OUTER_BOUNDARY_IS:
				return outerBoundaryIs != null;
			case v21Package.POLYGON_TYPE__INNER_BOUNDARY_IS:
				return innerBoundaryIs != null && !innerBoundaryIs.isEmpty();
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
		result.append(" (extrude: ");
		if (extrudeESet) result.append(extrude); else result.append("<unset>");
		result.append(", tessellate: ");
		if (tessellateESet) result.append(tessellate); else result.append("<unset>");
		result.append(", altitudeMode: ");
		if (altitudeModeESet) result.append(altitudeMode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PolygonTypeImpl
