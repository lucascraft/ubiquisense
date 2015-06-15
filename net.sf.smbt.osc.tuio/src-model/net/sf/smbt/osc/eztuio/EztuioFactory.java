/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.eztuio;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.osc.eztuio.EztuioPackage
 * @generated
 */
public interface EztuioFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EztuioFactory eINSTANCE = net.sf.smbt.osc.eztuio.impl.EztuioFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tuio2 DObj</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tuio2 DObj</em>'.
	 * @generated
	 */
	Tuio2DObj createTuio2DObj();

	/**
	 * Returns a new object of class '<em>Tuio2 DCur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tuio2 DCur</em>'.
	 * @generated
	 */
	Tuio2DCur createTuio2DCur();

	/**
	 * Returns a new object of class '<em>Tuio3 DObj</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tuio3 DObj</em>'.
	 * @generated
	 */
	Tuio3DObj createTuio3DObj();

	/**
	 * Returns a new object of class '<em>Tuio3 DCur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tuio3 DCur</em>'.
	 * @generated
	 */
	Tuio3DCur createTuio3DCur();

	/**
	 * Returns a new object of class '<em>Tuio25 Obj</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tuio25 Obj</em>'.
	 * @generated
	 */
	Tuio25Obj createTuio25Obj();

	/**
	 * Returns a new object of class '<em>Tuio25 Cur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tuio25 Cur</em>'.
	 * @generated
	 */
	Tuio25Cur createTuio25Cur();

	/**
	 * Returns a new object of class '<em>Tuio2 DBlob</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tuio2 DBlob</em>'.
	 * @generated
	 */
	Tuio2DBlob createTuio2DBlob();

	/**
	 * Returns a new object of class '<em>Tuio3 DBlob</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tuio3 DBlob</em>'.
	 * @generated
	 */
	Tuio3DBlob createTuio3DBlob();

	/**
	 * Returns a new object of class '<em>Tuio25 Blob</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tuio25 Blob</em>'.
	 * @generated
	 */
	Tuio25Blob createTuio25Blob();

	/**
	 * Returns a new object of class '<em>Tuio2 DObj Add</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tuio2 DObj Add</em>'.
	 * @generated
	 */
	Tuio2DObjAdd createTuio2DObjAdd();

	/**
	 * Returns a new object of class '<em>Tuio2 DObj Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tuio2 DObj Update</em>'.
	 * @generated
	 */
	Tuio2DObjUpdate createTuio2DObjUpdate();

	/**
	 * Returns a new object of class '<em>Tuio2 DObj Remove</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tuio2 DObj Remove</em>'.
	 * @generated
	 */
	Tuio2DObjRemove createTuio2DObjRemove();

	/**
	 * Returns a new object of class '<em>Tuio2 DCur Add</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tuio2 DCur Add</em>'.
	 * @generated
	 */
	Tuio2DCurAdd createTuio2DCurAdd();

	/**
	 * Returns a new object of class '<em>Tuio2 DCur Update</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tuio2 DCur Update</em>'.
	 * @generated
	 */
	Tuio2DCurUpdate createTuio2DCurUpdate();

	/**
	 * Returns a new object of class '<em>Tuio2 DCur Remove</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tuio2 DCur Remove</em>'.
	 * @generated
	 */
	Tuio2DCurRemove createTuio2DCurRemove();

	/**
	 * Returns a new object of class '<em>Tuio Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tuio Bundle</em>'.
	 * @generated
	 */
	TuioBundle createTuioBundle();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EztuioPackage getEztuioPackage();

} //EztuioFactory
