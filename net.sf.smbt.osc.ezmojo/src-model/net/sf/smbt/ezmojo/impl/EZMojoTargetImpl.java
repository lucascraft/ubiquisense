/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmojo.impl;

import net.sf.smbt.comm.extensions.protocol.ProtocolReactor;
import net.sf.smbt.ezmojo.EZMojoKind;
import net.sf.smbt.ezmojo.EZMojoTarget;
import net.sf.smbt.ezmojo.EzmojoPackage;
import net.sf.smbt.xcp.impl.XCPAddressImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EZ Mojo Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoTargetImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link net.sf.smbt.ezmojo.impl.EZMojoTargetImpl#isHierarchical <em>Hierarchical</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EZMojoTargetImpl extends XCPAddressImpl implements EZMojoTarget {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EZMojoTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzmojoPackage.Literals.EZ_MOJO_TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZMojoKind getKind() {
		return (EZMojoKind)eGet(EzmojoPackage.Literals.EZ_MOJO_TARGET__KIND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(EZMojoKind newKind) {
		eSet(EzmojoPackage.Literals.EZ_MOJO_TARGET__KIND, newKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHierarchical() {
		return (Boolean)eGet(EzmojoPackage.Literals.EZ_MOJO_TARGET__HIERARCHICAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHierarchical(boolean newHierarchical) {
		eSet(EzmojoPackage.Literals.EZ_MOJO_TARGET__HIERARCHICAL, newHierarchical);
	}
	
	@Override
	public String toString() {
		String kind = getKind() != null ? getKind().getLiteral() : "";
		String  transport = getTransportID() == null ? "???://" : getTransportID();
		String  addr = getAddr() == null ? "???" : getAddr();
		String ports = "";
		if (getPorts() != null & getPorts().isEmpty()) {
			for (Integer i : getPorts()) {
				ports += i + ",";
			}
			ports = ports.contains(",") ? "$"+ports.substring(0, ports.lastIndexOf(",")) : "";
		}
		String alias = getProtocolID();
		alias = alias == null ? "???" : ProtocolReactor.INSTANCE.getProtocolsWithSpecificTransportMap(alias).getAlias();
		alias = alias == null ? "???" : alias;
		String protocol = "<" + alias + ">";
		String speed = (getSpeed() <= 0) ? "" : "@" + getSpeed();
		
		return "[" + kind + "]" + " " + transport + addr + ports + protocol + speed;
	}

	
	@Override
	public String toString2() {
		String  transport = getTransportID() == null ? "???://" : getTransportID();
		String  addr = getAddr() == null ? "???" : getAddr();
		String ports = "";
		if (getPorts() != null & getPorts().isEmpty()) {
			for (Integer i : getPorts()) {
				ports += i + ",";
			}
			ports = ports.contains(",") ? "$"+ports.substring(0, ports.lastIndexOf(",")) : "";
		}
		String alias = getProtocolID();
		alias = alias == null ? "???" : ProtocolReactor.INSTANCE.getProtocolsWithSpecificTransportMap(alias).getAlias();
		alias = alias == null ? "???" : alias;
		String protocol = "<" + alias + ">";
		String speed = (getSpeed() <= 0) ? "" : "@" + getSpeed();
		
		return "[" + transport + "]["+ protocol + "]" + addr + ports + speed;
	}

} //EZMojoTargetImpl
