/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.google.earth.kml._2.BalloonStyleType;
import com.google.earth.kml._2.IconStyleType;
import com.google.earth.kml._2.LabelStyleType;
import com.google.earth.kml._2.LineStyleType;
import com.google.earth.kml._2.ListStyleType;
import com.google.earth.kml._2.PolyStyleType;
import com.google.earth.kml._2.StyleType;
import com.google.earth.kml._2.v21Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.impl.StyleTypeImpl#getIconStyle <em>Icon Style</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.StyleTypeImpl#getLabelStyle <em>Label Style</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.StyleTypeImpl#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.StyleTypeImpl#getPolyStyle <em>Poly Style</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.StyleTypeImpl#getBalloonStyle <em>Balloon Style</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.StyleTypeImpl#getListStyle <em>List Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StyleTypeImpl extends StyleSelectorTypeImpl implements StyleType {
	/**
	 * The cached value of the '{@link #getIconStyle() <em>Icon Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconStyle()
	 * @generated
	 * @ordered
	 */
	protected IconStyleType iconStyle;

	/**
	 * The cached value of the '{@link #getLabelStyle() <em>Label Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelStyle()
	 * @generated
	 * @ordered
	 */
	protected LabelStyleType labelStyle;

	/**
	 * The cached value of the '{@link #getLineStyle() <em>Line Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineStyle()
	 * @generated
	 * @ordered
	 */
	protected LineStyleType lineStyle;

	/**
	 * The cached value of the '{@link #getPolyStyle() <em>Poly Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolyStyle()
	 * @generated
	 * @ordered
	 */
	protected PolyStyleType polyStyle;

	/**
	 * The cached value of the '{@link #getBalloonStyle() <em>Balloon Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalloonStyle()
	 * @generated
	 * @ordered
	 */
	protected BalloonStyleType balloonStyle;

	/**
	 * The cached value of the '{@link #getListStyle() <em>List Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListStyle()
	 * @generated
	 * @ordered
	 */
	protected ListStyleType listStyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return v21Package.Literals.STYLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IconStyleType getIconStyle() {
		return iconStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIconStyle(IconStyleType newIconStyle, NotificationChain msgs) {
		IconStyleType oldIconStyle = iconStyle;
		iconStyle = newIconStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, v21Package.STYLE_TYPE__ICON_STYLE, oldIconStyle, newIconStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIconStyle(IconStyleType newIconStyle) {
		if (newIconStyle != iconStyle) {
			NotificationChain msgs = null;
			if (iconStyle != null)
				msgs = ((InternalEObject)iconStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - v21Package.STYLE_TYPE__ICON_STYLE, null, msgs);
			if (newIconStyle != null)
				msgs = ((InternalEObject)newIconStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - v21Package.STYLE_TYPE__ICON_STYLE, null, msgs);
			msgs = basicSetIconStyle(newIconStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.STYLE_TYPE__ICON_STYLE, newIconStyle, newIconStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelStyleType getLabelStyle() {
		return labelStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelStyle(LabelStyleType newLabelStyle, NotificationChain msgs) {
		LabelStyleType oldLabelStyle = labelStyle;
		labelStyle = newLabelStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, v21Package.STYLE_TYPE__LABEL_STYLE, oldLabelStyle, newLabelStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelStyle(LabelStyleType newLabelStyle) {
		if (newLabelStyle != labelStyle) {
			NotificationChain msgs = null;
			if (labelStyle != null)
				msgs = ((InternalEObject)labelStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - v21Package.STYLE_TYPE__LABEL_STYLE, null, msgs);
			if (newLabelStyle != null)
				msgs = ((InternalEObject)newLabelStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - v21Package.STYLE_TYPE__LABEL_STYLE, null, msgs);
			msgs = basicSetLabelStyle(newLabelStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.STYLE_TYPE__LABEL_STYLE, newLabelStyle, newLabelStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineStyleType getLineStyle() {
		return lineStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineStyle(LineStyleType newLineStyle, NotificationChain msgs) {
		LineStyleType oldLineStyle = lineStyle;
		lineStyle = newLineStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, v21Package.STYLE_TYPE__LINE_STYLE, oldLineStyle, newLineStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineStyle(LineStyleType newLineStyle) {
		if (newLineStyle != lineStyle) {
			NotificationChain msgs = null;
			if (lineStyle != null)
				msgs = ((InternalEObject)lineStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - v21Package.STYLE_TYPE__LINE_STYLE, null, msgs);
			if (newLineStyle != null)
				msgs = ((InternalEObject)newLineStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - v21Package.STYLE_TYPE__LINE_STYLE, null, msgs);
			msgs = basicSetLineStyle(newLineStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.STYLE_TYPE__LINE_STYLE, newLineStyle, newLineStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolyStyleType getPolyStyle() {
		return polyStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolyStyle(PolyStyleType newPolyStyle, NotificationChain msgs) {
		PolyStyleType oldPolyStyle = polyStyle;
		polyStyle = newPolyStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, v21Package.STYLE_TYPE__POLY_STYLE, oldPolyStyle, newPolyStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolyStyle(PolyStyleType newPolyStyle) {
		if (newPolyStyle != polyStyle) {
			NotificationChain msgs = null;
			if (polyStyle != null)
				msgs = ((InternalEObject)polyStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - v21Package.STYLE_TYPE__POLY_STYLE, null, msgs);
			if (newPolyStyle != null)
				msgs = ((InternalEObject)newPolyStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - v21Package.STYLE_TYPE__POLY_STYLE, null, msgs);
			msgs = basicSetPolyStyle(newPolyStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.STYLE_TYPE__POLY_STYLE, newPolyStyle, newPolyStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BalloonStyleType getBalloonStyle() {
		return balloonStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBalloonStyle(BalloonStyleType newBalloonStyle, NotificationChain msgs) {
		BalloonStyleType oldBalloonStyle = balloonStyle;
		balloonStyle = newBalloonStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, v21Package.STYLE_TYPE__BALLOON_STYLE, oldBalloonStyle, newBalloonStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBalloonStyle(BalloonStyleType newBalloonStyle) {
		if (newBalloonStyle != balloonStyle) {
			NotificationChain msgs = null;
			if (balloonStyle != null)
				msgs = ((InternalEObject)balloonStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - v21Package.STYLE_TYPE__BALLOON_STYLE, null, msgs);
			if (newBalloonStyle != null)
				msgs = ((InternalEObject)newBalloonStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - v21Package.STYLE_TYPE__BALLOON_STYLE, null, msgs);
			msgs = basicSetBalloonStyle(newBalloonStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.STYLE_TYPE__BALLOON_STYLE, newBalloonStyle, newBalloonStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListStyleType getListStyle() {
		return listStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListStyle(ListStyleType newListStyle, NotificationChain msgs) {
		ListStyleType oldListStyle = listStyle;
		listStyle = newListStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, v21Package.STYLE_TYPE__LIST_STYLE, oldListStyle, newListStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListStyle(ListStyleType newListStyle) {
		if (newListStyle != listStyle) {
			NotificationChain msgs = null;
			if (listStyle != null)
				msgs = ((InternalEObject)listStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - v21Package.STYLE_TYPE__LIST_STYLE, null, msgs);
			if (newListStyle != null)
				msgs = ((InternalEObject)newListStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - v21Package.STYLE_TYPE__LIST_STYLE, null, msgs);
			msgs = basicSetListStyle(newListStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.STYLE_TYPE__LIST_STYLE, newListStyle, newListStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case v21Package.STYLE_TYPE__ICON_STYLE:
				return basicSetIconStyle(null, msgs);
			case v21Package.STYLE_TYPE__LABEL_STYLE:
				return basicSetLabelStyle(null, msgs);
			case v21Package.STYLE_TYPE__LINE_STYLE:
				return basicSetLineStyle(null, msgs);
			case v21Package.STYLE_TYPE__POLY_STYLE:
				return basicSetPolyStyle(null, msgs);
			case v21Package.STYLE_TYPE__BALLOON_STYLE:
				return basicSetBalloonStyle(null, msgs);
			case v21Package.STYLE_TYPE__LIST_STYLE:
				return basicSetListStyle(null, msgs);
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
			case v21Package.STYLE_TYPE__ICON_STYLE:
				return getIconStyle();
			case v21Package.STYLE_TYPE__LABEL_STYLE:
				return getLabelStyle();
			case v21Package.STYLE_TYPE__LINE_STYLE:
				return getLineStyle();
			case v21Package.STYLE_TYPE__POLY_STYLE:
				return getPolyStyle();
			case v21Package.STYLE_TYPE__BALLOON_STYLE:
				return getBalloonStyle();
			case v21Package.STYLE_TYPE__LIST_STYLE:
				return getListStyle();
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
			case v21Package.STYLE_TYPE__ICON_STYLE:
				setIconStyle((IconStyleType)newValue);
				return;
			case v21Package.STYLE_TYPE__LABEL_STYLE:
				setLabelStyle((LabelStyleType)newValue);
				return;
			case v21Package.STYLE_TYPE__LINE_STYLE:
				setLineStyle((LineStyleType)newValue);
				return;
			case v21Package.STYLE_TYPE__POLY_STYLE:
				setPolyStyle((PolyStyleType)newValue);
				return;
			case v21Package.STYLE_TYPE__BALLOON_STYLE:
				setBalloonStyle((BalloonStyleType)newValue);
				return;
			case v21Package.STYLE_TYPE__LIST_STYLE:
				setListStyle((ListStyleType)newValue);
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
			case v21Package.STYLE_TYPE__ICON_STYLE:
				setIconStyle((IconStyleType)null);
				return;
			case v21Package.STYLE_TYPE__LABEL_STYLE:
				setLabelStyle((LabelStyleType)null);
				return;
			case v21Package.STYLE_TYPE__LINE_STYLE:
				setLineStyle((LineStyleType)null);
				return;
			case v21Package.STYLE_TYPE__POLY_STYLE:
				setPolyStyle((PolyStyleType)null);
				return;
			case v21Package.STYLE_TYPE__BALLOON_STYLE:
				setBalloonStyle((BalloonStyleType)null);
				return;
			case v21Package.STYLE_TYPE__LIST_STYLE:
				setListStyle((ListStyleType)null);
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
			case v21Package.STYLE_TYPE__ICON_STYLE:
				return iconStyle != null;
			case v21Package.STYLE_TYPE__LABEL_STYLE:
				return labelStyle != null;
			case v21Package.STYLE_TYPE__LINE_STYLE:
				return lineStyle != null;
			case v21Package.STYLE_TYPE__POLY_STYLE:
				return polyStyle != null;
			case v21Package.STYLE_TYPE__BALLOON_STYLE:
				return balloonStyle != null;
			case v21Package.STYLE_TYPE__LIST_STYLE:
				return listStyle != null;
		}
		return super.eIsSet(featureID);
	}

} //StyleTypeImpl
