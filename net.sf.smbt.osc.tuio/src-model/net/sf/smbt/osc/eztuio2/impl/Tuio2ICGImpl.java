/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.eztuio2.impl;

import net.sf.smbt.osc.eztuio2.Eztuio2Package;
import net.sf.smbt.osc.eztuio2.Tuio2ICG;
import net.sf.smbt.osc.eztuio2.TuioPoint;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tuio2 ICG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2ICGImpl#getS_id <em>Sid</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2ICGImpl#getPts <em>Pts</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2ICGImpl#getAdditional <em>Additional</em>}</li>
 *   <li>{@link net.sf.smbt.osc.eztuio2.impl.Tuio2ICGImpl#isShapeNeeded <em>Shape Needed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Tuio2ICGImpl extends MinimalEObjectImpl.Container implements Tuio2ICG {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tuio2ICGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Eztuio2Package.Literals.TUIO2_ICG;
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
	public String getS_id() {
		return (String)eGet(Eztuio2Package.Literals.TUIO2_ICG__SID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS_id(String newS_id) {
		eSet(Eztuio2Package.Literals.TUIO2_ICG__SID, newS_id);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TuioPoint> getPts() {
		return (EList<TuioPoint>)eGet(Eztuio2Package.Literals.TUIO2_ICG__PTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TuioPoint> getAdditional() {
		return (EList<TuioPoint>)eGet(Eztuio2Package.Literals.TUIO2_ICG__ADDITIONAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShapeNeeded() {
		return (Boolean)eGet(Eztuio2Package.Literals.TUIO2_ICG__SHAPE_NEEDED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShapeNeeded(boolean newShapeNeeded) {
		eSet(Eztuio2Package.Literals.TUIO2_ICG__SHAPE_NEEDED, newShapeNeeded);
	}

} //Tuio2ICGImpl
