/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.impl;

import net.sf.smbt.osc.OscFraming;
import net.sf.smbt.osc.OscMeta;
import net.sf.smbt.osc.OscPackage;
import net.sf.smbt.osc.OscType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.impl.OscMetaImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link net.sf.smbt.osc.impl.OscMetaImpl#getFraming <em>Framing</em>}</li>
 *   <li>{@link net.sf.smbt.osc.impl.OscMetaImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link net.sf.smbt.osc.impl.OscMetaImpl#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OscMetaImpl extends EObjectImpl implements OscMeta {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OscMetaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OscPackage.Literals.OSC_META;
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
	public OscType getVersion() {
		return (OscType)eGet(OscPackage.Literals.OSC_META__VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(OscType newVersion) {
		eSet(OscPackage.Literals.OSC_META__VERSION, newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscFraming getFraming() {
		return (OscFraming)eGet(OscPackage.Literals.OSC_META__FRAMING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFraming(OscFraming newFraming) {
		eSet(OscPackage.Literals.OSC_META__FRAMING, newFraming);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return (String)eGet(OscPackage.Literals.OSC_META__URI, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		eSet(OscPackage.Literals.OSC_META__URI, newUri);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OscType> getTypes() {
		return (EList<OscType>)eGet(OscPackage.Literals.OSC_META__TYPES, true);
	}

} //OscMetaImpl
