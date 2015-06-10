/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.google.earth.kml._2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.google.earth.kml._2.ColorModeEnum;
import com.google.earth.kml._2.ColorStyleType;
import com.google.earth.kml._2.v21Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color Style Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.impl.ColorStyleTypeImpl#getColor <em>Color</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.ColorStyleTypeImpl#getColorMode <em>Color Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ColorStyleTypeImpl extends ObjectTypeImpl implements ColorStyleType {
	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] COLOR_EDEFAULT = { (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff };

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected byte[] color = COLOR_EDEFAULT;

	/**
	 * This is true if the Color attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean colorESet;

	/**
	 * The default value of the '{@link #getColorMode() <em>Color Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorMode()
	 * @generated
	 * @ordered
	 */
	protected static final ColorModeEnum COLOR_MODE_EDEFAULT = ColorModeEnum.NORMAL;

	/**
	 * The cached value of the '{@link #getColorMode() <em>Color Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorMode()
	 * @generated
	 * @ordered
	 */
	protected ColorModeEnum colorMode = COLOR_MODE_EDEFAULT;

	/**
	 * This is true if the Color Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean colorModeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColorStyleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return v21Package.Literals.COLOR_STYLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(byte[] newColor) {
		byte[] oldColor = color;
		color = newColor;
		boolean oldColorESet = colorESet;
		colorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.COLOR_STYLE_TYPE__COLOR, oldColor, color, !oldColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetColor() {
		byte[] oldColor = color;
		boolean oldColorESet = colorESet;
		color = COLOR_EDEFAULT;
		colorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.COLOR_STYLE_TYPE__COLOR, oldColor, COLOR_EDEFAULT, oldColorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetColor() {
		return colorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorModeEnum getColorMode() {
		return colorMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorMode(ColorModeEnum newColorMode) {
		ColorModeEnum oldColorMode = colorMode;
		colorMode = newColorMode == null ? COLOR_MODE_EDEFAULT : newColorMode;
		boolean oldColorModeESet = colorModeESet;
		colorModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.COLOR_STYLE_TYPE__COLOR_MODE, oldColorMode, colorMode, !oldColorModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetColorMode() {
		ColorModeEnum oldColorMode = colorMode;
		boolean oldColorModeESet = colorModeESet;
		colorMode = COLOR_MODE_EDEFAULT;
		colorModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.COLOR_STYLE_TYPE__COLOR_MODE, oldColorMode, COLOR_MODE_EDEFAULT, oldColorModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetColorMode() {
		return colorModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case v21Package.COLOR_STYLE_TYPE__COLOR:
				return getColor();
			case v21Package.COLOR_STYLE_TYPE__COLOR_MODE:
				return getColorMode();
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
			case v21Package.COLOR_STYLE_TYPE__COLOR:
				setColor((byte[])newValue);
				return;
			case v21Package.COLOR_STYLE_TYPE__COLOR_MODE:
				setColorMode((ColorModeEnum)newValue);
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
			case v21Package.COLOR_STYLE_TYPE__COLOR:
				unsetColor();
				return;
			case v21Package.COLOR_STYLE_TYPE__COLOR_MODE:
				unsetColorMode();
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
			case v21Package.COLOR_STYLE_TYPE__COLOR:
				return isSetColor();
			case v21Package.COLOR_STYLE_TYPE__COLOR_MODE:
				return isSetColorMode();
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
		result.append(" (color: ");
		if (colorESet) result.append(color); else result.append("<unset>");
		result.append(", colorMode: ");
		if (colorModeESet) result.append(colorMode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ColorStyleTypeImpl
