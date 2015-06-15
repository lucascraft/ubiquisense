/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.eztuio2.impl;

import net.sf.smbt.osc.eztuio2.Eztuio2Package;
import net.sf.smbt.osc.eztuio2.SpansArea;
import net.sf.smbt.osc.eztuio2.Tuio2ARG;
import net.sf.smbt.osccmd.impl.OscCmdImpl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tuio2 ARG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2ARGImpl#getS_id <em>Sid</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2ARGImpl#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Tuio2ARGImpl extends OscCmdImpl implements Tuio2ARG {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tuio2ARGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eztuio2Package.Literals.TUIO2_ARG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getS_id() {
		return (String)eGet(Eztuio2Package.Literals.TUIO2_ARG__SID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS_id(String newS_id) {
		eSet(Eztuio2Package.Literals.TUIO2_ARG__SID, newS_id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SpansArea> getArgs() {
		return (EList<SpansArea>)eGet(Eztuio2Package.Literals.TUIO2_ARG__ARGS, true);
	}

} //Tuio2ARGImpl
