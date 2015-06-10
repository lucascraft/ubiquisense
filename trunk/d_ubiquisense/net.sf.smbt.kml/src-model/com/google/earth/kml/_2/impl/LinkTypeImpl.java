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

import com.google.earth.kml._2.LinkType;
import com.google.earth.kml._2.RefreshModeEnum;
import com.google.earth.kml._2.ViewRefreshModeEnum;
import com.google.earth.kml._2.v21Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.google.earth.kml._2.impl.LinkTypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.LinkTypeImpl#getRefreshMode <em>Refresh Mode</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.LinkTypeImpl#getRefreshInterval <em>Refresh Interval</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.LinkTypeImpl#getViewRefreshMode <em>View Refresh Mode</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.LinkTypeImpl#getViewRefreshTime <em>View Refresh Time</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.LinkTypeImpl#getViewBoundScale <em>View Bound Scale</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.LinkTypeImpl#getViewFormat <em>View Format</em>}</li>
 *   <li>{@link com.google.earth.kml._2.impl.LinkTypeImpl#getHttpQuery <em>Http Query</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkTypeImpl extends ObjectTypeImpl implements LinkType {
	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefreshMode() <em>Refresh Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshMode()
	 * @generated
	 * @ordered
	 */
	protected static final RefreshModeEnum REFRESH_MODE_EDEFAULT = RefreshModeEnum.ON_CHANGE;

	/**
	 * The cached value of the '{@link #getRefreshMode() <em>Refresh Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshMode()
	 * @generated
	 * @ordered
	 */
	protected RefreshModeEnum refreshMode = REFRESH_MODE_EDEFAULT;

	/**
	 * This is true if the Refresh Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean refreshModeESet;

	/**
	 * The default value of the '{@link #getRefreshInterval() <em>Refresh Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshInterval()
	 * @generated
	 * @ordered
	 */
	protected static final float REFRESH_INTERVAL_EDEFAULT = 4.0F;

	/**
	 * The cached value of the '{@link #getRefreshInterval() <em>Refresh Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefreshInterval()
	 * @generated
	 * @ordered
	 */
	protected float refreshInterval = REFRESH_INTERVAL_EDEFAULT;

	/**
	 * This is true if the Refresh Interval attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean refreshIntervalESet;

	/**
	 * The default value of the '{@link #getViewRefreshMode() <em>View Refresh Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewRefreshMode()
	 * @generated
	 * @ordered
	 */
	protected static final ViewRefreshModeEnum VIEW_REFRESH_MODE_EDEFAULT = ViewRefreshModeEnum.NEVER;

	/**
	 * The cached value of the '{@link #getViewRefreshMode() <em>View Refresh Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewRefreshMode()
	 * @generated
	 * @ordered
	 */
	protected ViewRefreshModeEnum viewRefreshMode = VIEW_REFRESH_MODE_EDEFAULT;

	/**
	 * This is true if the View Refresh Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean viewRefreshModeESet;

	/**
	 * The default value of the '{@link #getViewRefreshTime() <em>View Refresh Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewRefreshTime()
	 * @generated
	 * @ordered
	 */
	protected static final float VIEW_REFRESH_TIME_EDEFAULT = 4.0F;

	/**
	 * The cached value of the '{@link #getViewRefreshTime() <em>View Refresh Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewRefreshTime()
	 * @generated
	 * @ordered
	 */
	protected float viewRefreshTime = VIEW_REFRESH_TIME_EDEFAULT;

	/**
	 * This is true if the View Refresh Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean viewRefreshTimeESet;

	/**
	 * The default value of the '{@link #getViewBoundScale() <em>View Bound Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewBoundScale()
	 * @generated
	 * @ordered
	 */
	protected static final float VIEW_BOUND_SCALE_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getViewBoundScale() <em>View Bound Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewBoundScale()
	 * @generated
	 * @ordered
	 */
	protected float viewBoundScale = VIEW_BOUND_SCALE_EDEFAULT;

	/**
	 * This is true if the View Bound Scale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean viewBoundScaleESet;

	/**
	 * The default value of the '{@link #getViewFormat() <em>View Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String VIEW_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getViewFormat() <em>View Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewFormat()
	 * @generated
	 * @ordered
	 */
	protected String viewFormat = VIEW_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHttpQuery() <em>Http Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpQuery()
	 * @generated
	 * @ordered
	 */
	protected static final String HTTP_QUERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHttpQuery() <em>Http Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpQuery()
	 * @generated
	 * @ordered
	 */
	protected String httpQuery = HTTP_QUERY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return v21Package.Literals.LINK_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHref(String newHref) {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.LINK_TYPE__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefreshModeEnum getRefreshMode() {
		return refreshMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefreshMode(RefreshModeEnum newRefreshMode) {
		RefreshModeEnum oldRefreshMode = refreshMode;
		refreshMode = newRefreshMode == null ? REFRESH_MODE_EDEFAULT : newRefreshMode;
		boolean oldRefreshModeESet = refreshModeESet;
		refreshModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.LINK_TYPE__REFRESH_MODE, oldRefreshMode, refreshMode, !oldRefreshModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRefreshMode() {
		RefreshModeEnum oldRefreshMode = refreshMode;
		boolean oldRefreshModeESet = refreshModeESet;
		refreshMode = REFRESH_MODE_EDEFAULT;
		refreshModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.LINK_TYPE__REFRESH_MODE, oldRefreshMode, REFRESH_MODE_EDEFAULT, oldRefreshModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRefreshMode() {
		return refreshModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRefreshInterval() {
		return refreshInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefreshInterval(float newRefreshInterval) {
		float oldRefreshInterval = refreshInterval;
		refreshInterval = newRefreshInterval;
		boolean oldRefreshIntervalESet = refreshIntervalESet;
		refreshIntervalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.LINK_TYPE__REFRESH_INTERVAL, oldRefreshInterval, refreshInterval, !oldRefreshIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRefreshInterval() {
		float oldRefreshInterval = refreshInterval;
		boolean oldRefreshIntervalESet = refreshIntervalESet;
		refreshInterval = REFRESH_INTERVAL_EDEFAULT;
		refreshIntervalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.LINK_TYPE__REFRESH_INTERVAL, oldRefreshInterval, REFRESH_INTERVAL_EDEFAULT, oldRefreshIntervalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRefreshInterval() {
		return refreshIntervalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewRefreshModeEnum getViewRefreshMode() {
		return viewRefreshMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewRefreshMode(ViewRefreshModeEnum newViewRefreshMode) {
		ViewRefreshModeEnum oldViewRefreshMode = viewRefreshMode;
		viewRefreshMode = newViewRefreshMode == null ? VIEW_REFRESH_MODE_EDEFAULT : newViewRefreshMode;
		boolean oldViewRefreshModeESet = viewRefreshModeESet;
		viewRefreshModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.LINK_TYPE__VIEW_REFRESH_MODE, oldViewRefreshMode, viewRefreshMode, !oldViewRefreshModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetViewRefreshMode() {
		ViewRefreshModeEnum oldViewRefreshMode = viewRefreshMode;
		boolean oldViewRefreshModeESet = viewRefreshModeESet;
		viewRefreshMode = VIEW_REFRESH_MODE_EDEFAULT;
		viewRefreshModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.LINK_TYPE__VIEW_REFRESH_MODE, oldViewRefreshMode, VIEW_REFRESH_MODE_EDEFAULT, oldViewRefreshModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetViewRefreshMode() {
		return viewRefreshModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getViewRefreshTime() {
		return viewRefreshTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewRefreshTime(float newViewRefreshTime) {
		float oldViewRefreshTime = viewRefreshTime;
		viewRefreshTime = newViewRefreshTime;
		boolean oldViewRefreshTimeESet = viewRefreshTimeESet;
		viewRefreshTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.LINK_TYPE__VIEW_REFRESH_TIME, oldViewRefreshTime, viewRefreshTime, !oldViewRefreshTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetViewRefreshTime() {
		float oldViewRefreshTime = viewRefreshTime;
		boolean oldViewRefreshTimeESet = viewRefreshTimeESet;
		viewRefreshTime = VIEW_REFRESH_TIME_EDEFAULT;
		viewRefreshTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.LINK_TYPE__VIEW_REFRESH_TIME, oldViewRefreshTime, VIEW_REFRESH_TIME_EDEFAULT, oldViewRefreshTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetViewRefreshTime() {
		return viewRefreshTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getViewBoundScale() {
		return viewBoundScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewBoundScale(float newViewBoundScale) {
		float oldViewBoundScale = viewBoundScale;
		viewBoundScale = newViewBoundScale;
		boolean oldViewBoundScaleESet = viewBoundScaleESet;
		viewBoundScaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.LINK_TYPE__VIEW_BOUND_SCALE, oldViewBoundScale, viewBoundScale, !oldViewBoundScaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetViewBoundScale() {
		float oldViewBoundScale = viewBoundScale;
		boolean oldViewBoundScaleESet = viewBoundScaleESet;
		viewBoundScale = VIEW_BOUND_SCALE_EDEFAULT;
		viewBoundScaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, v21Package.LINK_TYPE__VIEW_BOUND_SCALE, oldViewBoundScale, VIEW_BOUND_SCALE_EDEFAULT, oldViewBoundScaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetViewBoundScale() {
		return viewBoundScaleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getViewFormat() {
		return viewFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewFormat(String newViewFormat) {
		String oldViewFormat = viewFormat;
		viewFormat = newViewFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.LINK_TYPE__VIEW_FORMAT, oldViewFormat, viewFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHttpQuery() {
		return httpQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpQuery(String newHttpQuery) {
		String oldHttpQuery = httpQuery;
		httpQuery = newHttpQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, v21Package.LINK_TYPE__HTTP_QUERY, oldHttpQuery, httpQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case v21Package.LINK_TYPE__HREF:
				return getHref();
			case v21Package.LINK_TYPE__REFRESH_MODE:
				return getRefreshMode();
			case v21Package.LINK_TYPE__REFRESH_INTERVAL:
				return getRefreshInterval();
			case v21Package.LINK_TYPE__VIEW_REFRESH_MODE:
				return getViewRefreshMode();
			case v21Package.LINK_TYPE__VIEW_REFRESH_TIME:
				return getViewRefreshTime();
			case v21Package.LINK_TYPE__VIEW_BOUND_SCALE:
				return getViewBoundScale();
			case v21Package.LINK_TYPE__VIEW_FORMAT:
				return getViewFormat();
			case v21Package.LINK_TYPE__HTTP_QUERY:
				return getHttpQuery();
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
			case v21Package.LINK_TYPE__HREF:
				setHref((String)newValue);
				return;
			case v21Package.LINK_TYPE__REFRESH_MODE:
				setRefreshMode((RefreshModeEnum)newValue);
				return;
			case v21Package.LINK_TYPE__REFRESH_INTERVAL:
				setRefreshInterval((Float)newValue);
				return;
			case v21Package.LINK_TYPE__VIEW_REFRESH_MODE:
				setViewRefreshMode((ViewRefreshModeEnum)newValue);
				return;
			case v21Package.LINK_TYPE__VIEW_REFRESH_TIME:
				setViewRefreshTime((Float)newValue);
				return;
			case v21Package.LINK_TYPE__VIEW_BOUND_SCALE:
				setViewBoundScale((Float)newValue);
				return;
			case v21Package.LINK_TYPE__VIEW_FORMAT:
				setViewFormat((String)newValue);
				return;
			case v21Package.LINK_TYPE__HTTP_QUERY:
				setHttpQuery((String)newValue);
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
			case v21Package.LINK_TYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case v21Package.LINK_TYPE__REFRESH_MODE:
				unsetRefreshMode();
				return;
			case v21Package.LINK_TYPE__REFRESH_INTERVAL:
				unsetRefreshInterval();
				return;
			case v21Package.LINK_TYPE__VIEW_REFRESH_MODE:
				unsetViewRefreshMode();
				return;
			case v21Package.LINK_TYPE__VIEW_REFRESH_TIME:
				unsetViewRefreshTime();
				return;
			case v21Package.LINK_TYPE__VIEW_BOUND_SCALE:
				unsetViewBoundScale();
				return;
			case v21Package.LINK_TYPE__VIEW_FORMAT:
				setViewFormat(VIEW_FORMAT_EDEFAULT);
				return;
			case v21Package.LINK_TYPE__HTTP_QUERY:
				setHttpQuery(HTTP_QUERY_EDEFAULT);
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
			case v21Package.LINK_TYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case v21Package.LINK_TYPE__REFRESH_MODE:
				return isSetRefreshMode();
			case v21Package.LINK_TYPE__REFRESH_INTERVAL:
				return isSetRefreshInterval();
			case v21Package.LINK_TYPE__VIEW_REFRESH_MODE:
				return isSetViewRefreshMode();
			case v21Package.LINK_TYPE__VIEW_REFRESH_TIME:
				return isSetViewRefreshTime();
			case v21Package.LINK_TYPE__VIEW_BOUND_SCALE:
				return isSetViewBoundScale();
			case v21Package.LINK_TYPE__VIEW_FORMAT:
				return VIEW_FORMAT_EDEFAULT == null ? viewFormat != null : !VIEW_FORMAT_EDEFAULT.equals(viewFormat);
			case v21Package.LINK_TYPE__HTTP_QUERY:
				return HTTP_QUERY_EDEFAULT == null ? httpQuery != null : !HTTP_QUERY_EDEFAULT.equals(httpQuery);
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
		result.append(" (href: ");
		result.append(href);
		result.append(", refreshMode: ");
		if (refreshModeESet) result.append(refreshMode); else result.append("<unset>");
		result.append(", refreshInterval: ");
		if (refreshIntervalESet) result.append(refreshInterval); else result.append("<unset>");
		result.append(", viewRefreshMode: ");
		if (viewRefreshModeESet) result.append(viewRefreshMode); else result.append("<unset>");
		result.append(", viewRefreshTime: ");
		if (viewRefreshTimeESet) result.append(viewRefreshTime); else result.append("<unset>");
		result.append(", viewBoundScale: ");
		if (viewBoundScaleESet) result.append(viewBoundScale); else result.append("<unset>");
		result.append(", viewFormat: ");
		result.append(viewFormat);
		result.append(", httpQuery: ");
		result.append(httpQuery);
		result.append(')');
		return result.toString();
	}

} //LinkTypeImpl
