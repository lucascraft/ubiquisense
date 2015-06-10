/**
 */
package net.sf.smbt.ezcosm.impl;

import net.sf.smbt.ezcosm.EzcosmPackage;
import net.sf.smbt.ezcosm.Trigger;
import net.sf.smbt.ezcosm.TriggerKind;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezcosm.impl.TriggerImpl#getFeed <em>Feed</em>}</li>
 *   <li>{@link net.sf.smbt.ezcosm.impl.TriggerImpl#getStream <em>Stream</em>}</li>
 *   <li>{@link net.sf.smbt.ezcosm.impl.TriggerImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link net.sf.smbt.ezcosm.impl.TriggerImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.smbt.ezcosm.impl.TriggerImpl#getValue <em>Value</em>}</li>
 *   <li>{@link net.sf.smbt.ezcosm.impl.TriggerImpl#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TriggerImpl extends EObjectImpl implements Trigger {
	/**
	 * The default value of the '{@link #getFeed() <em>Feed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeed()
	 * @generated
	 * @ordered
	 */
	protected static final String FEED_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFeed() <em>Feed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeed()
	 * @generated
	 * @ordered
	 */
	protected String feed = FEED_EDEFAULT;
	/**
	 * The default value of the '{@link #getStream() <em>Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStream()
	 * @generated
	 * @ordered
	 */
	protected static final String STREAM_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getStream() <em>Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStream()
	 * @generated
	 * @ordered
	 */
	protected String stream = STREAM_EDEFAULT;
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final TriggerKind KIND_EDEFAULT = TriggerKind.LT;
	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected TriggerKind kind = KIND_EDEFAULT;
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzcosmPackage.Literals.TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeed() {
		return feed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeed(String newFeed) {
		String oldFeed = feed;
		feed = newFeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzcosmPackage.TRIGGER__FEED, oldFeed, feed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStream() {
		return stream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStream(String newStream) {
		String oldStream = stream;
		stream = newStream;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzcosmPackage.TRIGGER__STREAM, oldStream, stream));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(TriggerKind newKind) {
		TriggerKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzcosmPackage.TRIGGER__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzcosmPackage.TRIGGER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzcosmPackage.TRIGGER__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzcosmPackage.TRIGGER__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EzcosmPackage.TRIGGER__FEED:
				return getFeed();
			case EzcosmPackage.TRIGGER__STREAM:
				return getStream();
			case EzcosmPackage.TRIGGER__KIND:
				return getKind();
			case EzcosmPackage.TRIGGER__TYPE:
				return getType();
			case EzcosmPackage.TRIGGER__VALUE:
				return getValue();
			case EzcosmPackage.TRIGGER__URL:
				return getUrl();
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
			case EzcosmPackage.TRIGGER__FEED:
				setFeed((String)newValue);
				return;
			case EzcosmPackage.TRIGGER__STREAM:
				setStream((String)newValue);
				return;
			case EzcosmPackage.TRIGGER__KIND:
				setKind((TriggerKind)newValue);
				return;
			case EzcosmPackage.TRIGGER__TYPE:
				setType((String)newValue);
				return;
			case EzcosmPackage.TRIGGER__VALUE:
				setValue((String)newValue);
				return;
			case EzcosmPackage.TRIGGER__URL:
				setUrl((String)newValue);
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
			case EzcosmPackage.TRIGGER__FEED:
				setFeed(FEED_EDEFAULT);
				return;
			case EzcosmPackage.TRIGGER__STREAM:
				setStream(STREAM_EDEFAULT);
				return;
			case EzcosmPackage.TRIGGER__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case EzcosmPackage.TRIGGER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case EzcosmPackage.TRIGGER__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case EzcosmPackage.TRIGGER__URL:
				setUrl(URL_EDEFAULT);
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
			case EzcosmPackage.TRIGGER__FEED:
				return FEED_EDEFAULT == null ? feed != null : !FEED_EDEFAULT.equals(feed);
			case EzcosmPackage.TRIGGER__STREAM:
				return STREAM_EDEFAULT == null ? stream != null : !STREAM_EDEFAULT.equals(stream);
			case EzcosmPackage.TRIGGER__KIND:
				return kind != KIND_EDEFAULT;
			case EzcosmPackage.TRIGGER__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case EzcosmPackage.TRIGGER__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case EzcosmPackage.TRIGGER__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
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
		result.append(" (feed: ");
		result.append(feed);
		result.append(", stream: ");
		result.append(stream);
		result.append(", kind: ");
		result.append(kind);
		result.append(", type: ");
		result.append(type);
		result.append(", value: ");
		result.append(value);
		result.append(", url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //TriggerImpl
