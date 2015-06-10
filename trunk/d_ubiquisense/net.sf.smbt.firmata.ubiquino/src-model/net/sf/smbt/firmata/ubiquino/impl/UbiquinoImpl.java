/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.firmata.ubiquino.impl;

import java.util.Collection;
import java.util.List;

import net.sf.smbt.firmata.ubiquino.Ubiquino;
import net.sf.smbt.firmata.ubiquino.UbiquinoConfig;
import net.sf.smbt.firmata.ubiquino.UbiquinoPackage;
import net.sf.smbt.mdl.arduino.Arduino;
import net.sf.smbt.xcp.XCPAddress;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ubiquino</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.firmata.ubiquino.impl.UbiquinoImpl#getEngines <em>Engines</em>}</li>
 *   <li>{@link net.sf.smbt.firmata.ubiquino.impl.UbiquinoImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link net.sf.smbt.firmata.ubiquino.impl.UbiquinoImpl#getBoard <em>Board</em>}</li>
 *   <li>{@link net.sf.smbt.firmata.ubiquino.impl.UbiquinoImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link net.sf.smbt.firmata.ubiquino.impl.UbiquinoImpl#getLastAddress <em>Last Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UbiquinoImpl extends MinimalEObjectImpl.Container implements Ubiquino {
	/**
	 * The cached value of the '{@link #getEngines() <em>Engines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngines()
	 * @generated
	 * @ordered
	 */
	protected EList<CmdPipe> engines;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected CmdPipe default_;

	/**
	 * The cached value of the '{@link #getBoard() <em>Board</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoard()
	 * @generated
	 * @ordered
	 */
	protected Arduino board;

	/**
	 * The cached value of the '{@link #getConfig() <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig()
	 * @generated
	 * @ordered
	 */
	protected UbiquinoConfig config;

	/**
	 * The cached value of the '{@link #getLastAddress() <em>Last Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastAddress()
	 * @generated
	 * @ordered
	 */
	protected XCPAddress lastAddress;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UbiquinoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UbiquinoPackage.Literals.UBIQUINO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<CmdPipe> getEngines() {
		if (engines == null) {
			engines = new EObjectResolvingEList<CmdPipe>(CmdPipe.class, this, UbiquinoPackage.UBIQUINO__ENGINES);
		}
		return engines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmdPipe getDefault() {
		if (default_ != null && default_.eIsProxy()) {
			InternalEObject oldDefault = (InternalEObject)default_;
			default_ = (CmdPipe)eResolveProxy(oldDefault);
			if (default_ != oldDefault) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UbiquinoPackage.UBIQUINO__DEFAULT, oldDefault, default_));
			}
		}
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(CmdPipe newDefault) {
		CmdPipe oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbiquinoPackage.UBIQUINO__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arduino getBoard() {
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoard(Arduino newBoard, NotificationChain msgs) {
		Arduino oldBoard = board;
		board = newBoard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UbiquinoPackage.UBIQUINO__BOARD, oldBoard, newBoard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoard(Arduino newBoard) {
		if (newBoard != board) {
			NotificationChain msgs = null;
			if (board != null)
				msgs = ((InternalEObject)board).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UbiquinoPackage.UBIQUINO__BOARD, null, msgs);
			if (newBoard != null)
				msgs = ((InternalEObject)newBoard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UbiquinoPackage.UBIQUINO__BOARD, null, msgs);
			msgs = basicSetBoard(newBoard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbiquinoPackage.UBIQUINO__BOARD, newBoard, newBoard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UbiquinoConfig getConfig() {
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfig(UbiquinoConfig newConfig, NotificationChain msgs) {
		UbiquinoConfig oldConfig = config;
		config = newConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UbiquinoPackage.UBIQUINO__CONFIG, oldConfig, newConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfig(UbiquinoConfig newConfig) {
		if (newConfig != config) {
			NotificationChain msgs = null;
			if (config != null)
				msgs = ((InternalEObject)config).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UbiquinoPackage.UBIQUINO__CONFIG, null, msgs);
			if (newConfig != null)
				msgs = ((InternalEObject)newConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UbiquinoPackage.UBIQUINO__CONFIG, null, msgs);
			msgs = basicSetConfig(newConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbiquinoPackage.UBIQUINO__CONFIG, newConfig, newConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XCPAddress getLastAddress() {
		return lastAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastAddress(XCPAddress newLastAddress, NotificationChain msgs) {
		XCPAddress oldLastAddress = lastAddress;
		lastAddress = newLastAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UbiquinoPackage.UBIQUINO__LAST_ADDRESS, oldLastAddress, newLastAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastAddress(XCPAddress newLastAddress) {
		if (newLastAddress != lastAddress) {
			NotificationChain msgs = null;
			if (lastAddress != null)
				msgs = ((InternalEObject)lastAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UbiquinoPackage.UBIQUINO__LAST_ADDRESS, null, msgs);
			if (newLastAddress != null)
				msgs = ((InternalEObject)newLastAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UbiquinoPackage.UBIQUINO__LAST_ADDRESS, null, msgs);
			msgs = basicSetLastAddress(newLastAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UbiquinoPackage.UBIQUINO__LAST_ADDRESS, newLastAddress, newLastAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UbiquinoPackage.UBIQUINO__BOARD:
				return basicSetBoard(null, msgs);
			case UbiquinoPackage.UBIQUINO__CONFIG:
				return basicSetConfig(null, msgs);
			case UbiquinoPackage.UBIQUINO__LAST_ADDRESS:
				return basicSetLastAddress(null, msgs);
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
			case UbiquinoPackage.UBIQUINO__ENGINES:
				return getEngines();
			case UbiquinoPackage.UBIQUINO__DEFAULT:
				return getDefault();
			case UbiquinoPackage.UBIQUINO__BOARD:
				return getBoard();
			case UbiquinoPackage.UBIQUINO__CONFIG:
				return getConfig();
			case UbiquinoPackage.UBIQUINO__LAST_ADDRESS:
				return getLastAddress();
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
			case UbiquinoPackage.UBIQUINO__ENGINES:
				getEngines().clear();
				getEngines().addAll((Collection<? extends CmdPipe>)newValue);
				return;
			case UbiquinoPackage.UBIQUINO__DEFAULT:
				setDefault((CmdPipe)newValue);
				return;
			case UbiquinoPackage.UBIQUINO__BOARD:
				setBoard((Arduino)newValue);
				return;
			case UbiquinoPackage.UBIQUINO__CONFIG:
				setConfig((UbiquinoConfig)newValue);
				return;
			case UbiquinoPackage.UBIQUINO__LAST_ADDRESS:
				setLastAddress((XCPAddress)newValue);
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
			case UbiquinoPackage.UBIQUINO__ENGINES:
				getEngines().clear();
				return;
			case UbiquinoPackage.UBIQUINO__DEFAULT:
				setDefault((CmdPipe)null);
				return;
			case UbiquinoPackage.UBIQUINO__BOARD:
				setBoard((Arduino)null);
				return;
			case UbiquinoPackage.UBIQUINO__CONFIG:
				setConfig((UbiquinoConfig)null);
				return;
			case UbiquinoPackage.UBIQUINO__LAST_ADDRESS:
				setLastAddress((XCPAddress)null);
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
			case UbiquinoPackage.UBIQUINO__ENGINES:
				return engines != null && !engines.isEmpty();
			case UbiquinoPackage.UBIQUINO__DEFAULT:
				return default_ != null;
			case UbiquinoPackage.UBIQUINO__BOARD:
				return board != null;
			case UbiquinoPackage.UBIQUINO__CONFIG:
				return config != null;
			case UbiquinoPackage.UBIQUINO__LAST_ADDRESS:
				return lastAddress != null;
		}
		return super.eIsSet(featureID);
	}

} //UbiquinoImpl
