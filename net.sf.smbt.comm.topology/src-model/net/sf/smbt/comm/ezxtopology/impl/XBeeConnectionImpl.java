/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.comm.ezxtopology.impl;

import net.sf.smbt.comm.ezxtopology.EzxtopologyPackage;
import net.sf.smbt.comm.ezxtopology.XBeeConnection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import com.rapplogic.xbee.api.XBee;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XBee Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.comm.ezxtopology.impl.XBeeConnectionImpl#getXbee <em>Xbee</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XBeeConnectionImpl extends MinimalEObjectImpl.Container implements XBeeConnection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XBeeConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzxtopologyPackage.Literals.XBEE_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XBee getXbee() {
		return (XBee)eGet(EzxtopologyPackage.Literals.XBEE_CONNECTION__XBEE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXbee(XBee newXbee) {
		eSet(EzxtopologyPackage.Literals.XBEE_CONNECTION__XBEE, newXbee);
	}

} //XBeeConnectionImpl
