/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.eztuio2.impl;

import net.sf.smbt.osc.eztuio2.Eztuio2Package;
import net.sf.smbt.osc.eztuio2.Link;
import net.sf.smbt.osc.eztuio2.Tuio2LLA;
import net.sf.smbt.osccmd.impl.OscCmdImpl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tuio2 LLA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2LLAImpl#getS_id <em>Sid</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2LLAImpl#isBool <em>Bool</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2LLAImpl#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Tuio2LLAImpl extends OscCmdImpl implements Tuio2LLA {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tuio2LLAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eztuio2Package.Literals.TUIO2_LLA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getS_id() {
		return (String)eGet(Eztuio2Package.Literals.TUIO2_LLA__SID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS_id(String newS_id) {
		eSet(Eztuio2Package.Literals.TUIO2_LLA__SID, newS_id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBool() {
		return (Boolean)eGet(Eztuio2Package.Literals.TUIO2_LLA__BOOL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBool(boolean newBool) {
		eSet(Eztuio2Package.Literals.TUIO2_LLA__BOOL, newBool);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Link> getLinks() {
		return (EList<Link>)eGet(Eztuio2Package.Literals.TUIO2_LLA__LINKS, true);
	}

} //Tuio2LLAImpl
