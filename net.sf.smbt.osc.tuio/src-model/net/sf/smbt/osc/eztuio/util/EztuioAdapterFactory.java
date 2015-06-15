/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.eztuio.util;

import net.sf.smbt.osc.eztuio.*;
import net.sf.smbt.osc.eztuio.EztuioPackage;
import net.sf.smbt.osc.eztuio.Tuio25Blob;
import net.sf.smbt.osc.eztuio.Tuio25Cur;
import net.sf.smbt.osc.eztuio.Tuio25Obj;
import net.sf.smbt.osc.eztuio.Tuio2DBlob;
import net.sf.smbt.osc.eztuio.Tuio2DCur;
import net.sf.smbt.osc.eztuio.Tuio2DCurAdd;
import net.sf.smbt.osc.eztuio.Tuio2DCurRemove;
import net.sf.smbt.osc.eztuio.Tuio2DCurUpdate;
import net.sf.smbt.osc.eztuio.Tuio2DObj;
import net.sf.smbt.osc.eztuio.Tuio2DObjAdd;
import net.sf.smbt.osc.eztuio.Tuio2DObjRemove;
import net.sf.smbt.osc.eztuio.Tuio2DObjUpdate;
import net.sf.smbt.osc.eztuio.Tuio3DBlob;
import net.sf.smbt.osc.eztuio.Tuio3DCur;
import net.sf.smbt.osc.eztuio.Tuio3DObj;
import net.sf.smbt.osc.eztuio.TuioBundle;
import net.sf.smbt.osccmd.OscCmd;
import net.sf.smbt.osccmd.OscRcvCmd;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.cmd.CompoundCmd;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.osc.eztuio.EztuioPackage
 * @generated
 */
public class EztuioAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EztuioPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EztuioAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EztuioPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EztuioSwitch<Adapter> modelSwitch =
		new EztuioSwitch<Adapter>() {
			@Override
			public Adapter caseTuio2DObj(Tuio2DObj object) {
				return createTuio2DObjAdapter();
			}
			@Override
			public Adapter caseTuio2DCur(Tuio2DCur object) {
				return createTuio2DCurAdapter();
			}
			@Override
			public Adapter caseTuio3DObj(Tuio3DObj object) {
				return createTuio3DObjAdapter();
			}
			@Override
			public Adapter caseTuio3DCur(Tuio3DCur object) {
				return createTuio3DCurAdapter();
			}
			@Override
			public Adapter caseTuio25Obj(Tuio25Obj object) {
				return createTuio25ObjAdapter();
			}
			@Override
			public Adapter caseTuio25Cur(Tuio25Cur object) {
				return createTuio25CurAdapter();
			}
			@Override
			public Adapter caseTuio2DBlob(Tuio2DBlob object) {
				return createTuio2DBlobAdapter();
			}
			@Override
			public Adapter caseTuio3DBlob(Tuio3DBlob object) {
				return createTuio3DBlobAdapter();
			}
			@Override
			public Adapter caseTuio25Blob(Tuio25Blob object) {
				return createTuio25BlobAdapter();
			}
			@Override
			public Adapter caseTuio2DObjAdd(Tuio2DObjAdd object) {
				return createTuio2DObjAddAdapter();
			}
			@Override
			public Adapter caseTuio2DObjUpdate(Tuio2DObjUpdate object) {
				return createTuio2DObjUpdateAdapter();
			}
			@Override
			public Adapter caseTuio2DObjRemove(Tuio2DObjRemove object) {
				return createTuio2DObjRemoveAdapter();
			}
			@Override
			public Adapter caseTuio2DCurAdd(Tuio2DCurAdd object) {
				return createTuio2DCurAddAdapter();
			}
			@Override
			public Adapter caseTuio2DCurUpdate(Tuio2DCurUpdate object) {
				return createTuio2DCurUpdateAdapter();
			}
			@Override
			public Adapter caseTuio2DCurRemove(Tuio2DCurRemove object) {
				return createTuio2DCurRemoveAdapter();
			}
			@Override
			public Adapter caseTuioBundle(TuioBundle object) {
				return createTuioBundleAdapter();
			}
			@Override
			public Adapter caseCmd(Cmd object) {
				return createCmdAdapter();
			}
			@Override
			public Adapter caseOscCmd(OscCmd object) {
				return createOscCmdAdapter();
			}
			@Override
			public Adapter caseOscRcvCmd(OscRcvCmd object) {
				return createOscRcvCmdAdapter();
			}
			@Override
			public Adapter caseCompoundCmd(CompoundCmd object) {
				return createCompoundCmdAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio.Tuio2DObj <em>Tuio2 DObj</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DObj
	 * @generated
	 */
	public Adapter createTuio2DObjAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio.Tuio2DCur <em>Tuio2 DCur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DCur
	 * @generated
	 */
	public Adapter createTuio2DCurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio.Tuio3DObj <em>Tuio3 DObj</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio.Tuio3DObj
	 * @generated
	 */
	public Adapter createTuio3DObjAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio.Tuio3DCur <em>Tuio3 DCur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio.Tuio3DCur
	 * @generated
	 */
	public Adapter createTuio3DCurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio.Tuio25Obj <em>Tuio25 Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio.Tuio25Obj
	 * @generated
	 */
	public Adapter createTuio25ObjAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio.Tuio25Cur <em>Tuio25 Cur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio.Tuio25Cur
	 * @generated
	 */
	public Adapter createTuio25CurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio.Tuio2DBlob <em>Tuio2 DBlob</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DBlob
	 * @generated
	 */
	public Adapter createTuio2DBlobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio.Tuio3DBlob <em>Tuio3 DBlob</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio.Tuio3DBlob
	 * @generated
	 */
	public Adapter createTuio3DBlobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio.Tuio25Blob <em>Tuio25 Blob</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio.Tuio25Blob
	 * @generated
	 */
	public Adapter createTuio25BlobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio.Tuio2DObjAdd <em>Tuio2 DObj Add</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DObjAdd
	 * @generated
	 */
	public Adapter createTuio2DObjAddAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio.Tuio2DObjUpdate <em>Tuio2 DObj Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DObjUpdate
	 * @generated
	 */
	public Adapter createTuio2DObjUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio.Tuio2DObjRemove <em>Tuio2 DObj Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DObjRemove
	 * @generated
	 */
	public Adapter createTuio2DObjRemoveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio.Tuio2DCurAdd <em>Tuio2 DCur Add</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DCurAdd
	 * @generated
	 */
	public Adapter createTuio2DCurAddAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio.Tuio2DCurUpdate <em>Tuio2 DCur Update</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DCurUpdate
	 * @generated
	 */
	public Adapter createTuio2DCurUpdateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio.Tuio2DCurRemove <em>Tuio2 DCur Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio.Tuio2DCurRemove
	 * @generated
	 */
	public Adapter createTuio2DCurRemoveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio.TuioBundle <em>Tuio Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio.TuioBundle
	 * @generated
	 */
	public Adapter createTuioBundleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.xqz.model.cmd.Cmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.xqz.model.cmd.Cmd
	 * @generated
	 */
	public Adapter createCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osccmd.OscCmd <em>Osc Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osccmd.OscCmd
	 * @generated
	 */
	public Adapter createOscCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osccmd.OscRcvCmd <em>Osc Rcv Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osccmd.OscRcvCmd
	 * @generated
	 */
	public Adapter createOscRcvCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.xqz.model.cmd.CompoundCmd <em>Compound Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.xqz.model.cmd.CompoundCmd
	 * @generated
	 */
	public Adapter createCompoundCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EztuioAdapterFactory
