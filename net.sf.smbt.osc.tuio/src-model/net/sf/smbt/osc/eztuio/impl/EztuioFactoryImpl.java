/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.eztuio.impl;

import net.sf.reactivision.tuio.TuioCursor;
import net.sf.reactivision.tuio.TuioObject;
import net.sf.smbt.osc.eztuio.*;
import net.sf.smbt.osc.eztuio.EztuioFactory;
import net.sf.smbt.osc.eztuio.EztuioPackage;
import net.sf.smbt.osc.eztuio.STATE;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EztuioFactoryImpl extends EFactoryImpl implements EztuioFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EztuioFactory init() {
		try {
			EztuioFactory theEztuioFactory = (EztuioFactory)EPackage.Registry.INSTANCE.getEFactory("http://eztuio/1.0"); 
			if (theEztuioFactory != null) {
				return theEztuioFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EztuioFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EztuioFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EztuioPackage.TUIO2_DOBJ: return createTuio2DObj();
			case EztuioPackage.TUIO2_DCUR: return createTuio2DCur();
			case EztuioPackage.TUIO3_DOBJ: return createTuio3DObj();
			case EztuioPackage.TUIO3_DCUR: return createTuio3DCur();
			case EztuioPackage.TUIO25_OBJ: return createTuio25Obj();
			case EztuioPackage.TUIO25_CUR: return createTuio25Cur();
			case EztuioPackage.TUIO2_DBLOB: return createTuio2DBlob();
			case EztuioPackage.TUIO3_DBLOB: return createTuio3DBlob();
			case EztuioPackage.TUIO25_BLOB: return createTuio25Blob();
			case EztuioPackage.TUIO2_DOBJ_ADD: return createTuio2DObjAdd();
			case EztuioPackage.TUIO2_DOBJ_UPDATE: return createTuio2DObjUpdate();
			case EztuioPackage.TUIO2_DOBJ_REMOVE: return createTuio2DObjRemove();
			case EztuioPackage.TUIO2_DCUR_ADD: return createTuio2DCurAdd();
			case EztuioPackage.TUIO2_DCUR_UPDATE: return createTuio2DCurUpdate();
			case EztuioPackage.TUIO2_DCUR_REMOVE: return createTuio2DCurRemove();
			case EztuioPackage.TUIO_BUNDLE: return createTuioBundle();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EztuioPackage.STATE:
				return createSTATEFromString(eDataType, initialValue);
			case EztuioPackage.TUIO_CURSOR:
				return createTuioCursorFromString(eDataType, initialValue);
			case EztuioPackage.TUIO_OBJECT:
				return createTuioObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EztuioPackage.STATE:
				return convertSTATEToString(eDataType, instanceValue);
			case EztuioPackage.TUIO_CURSOR:
				return convertTuioCursorToString(eDataType, instanceValue);
			case EztuioPackage.TUIO_OBJECT:
				return convertTuioObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2DObj createTuio2DObj() {
		Tuio2DObjImpl tuio2DObj = new Tuio2DObjImpl();
		return tuio2DObj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2DCur createTuio2DCur() {
		Tuio2DCurImpl tuio2DCur = new Tuio2DCurImpl();
		return tuio2DCur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio3DObj createTuio3DObj() {
		Tuio3DObjImpl tuio3DObj = new Tuio3DObjImpl();
		return tuio3DObj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio3DCur createTuio3DCur() {
		Tuio3DCurImpl tuio3DCur = new Tuio3DCurImpl();
		return tuio3DCur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio25Obj createTuio25Obj() {
		Tuio25ObjImpl tuio25Obj = new Tuio25ObjImpl();
		return tuio25Obj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio25Cur createTuio25Cur() {
		Tuio25CurImpl tuio25Cur = new Tuio25CurImpl();
		return tuio25Cur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2DBlob createTuio2DBlob() {
		Tuio2DBlobImpl tuio2DBlob = new Tuio2DBlobImpl();
		return tuio2DBlob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio3DBlob createTuio3DBlob() {
		Tuio3DBlobImpl tuio3DBlob = new Tuio3DBlobImpl();
		return tuio3DBlob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio25Blob createTuio25Blob() {
		Tuio25BlobImpl tuio25Blob = new Tuio25BlobImpl();
		return tuio25Blob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2DObjAdd createTuio2DObjAdd() {
		Tuio2DObjAddImpl tuio2DObjAdd = new Tuio2DObjAddImpl();
		return tuio2DObjAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2DObjUpdate createTuio2DObjUpdate() {
		Tuio2DObjUpdateImpl tuio2DObjUpdate = new Tuio2DObjUpdateImpl();
		return tuio2DObjUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2DObjRemove createTuio2DObjRemove() {
		Tuio2DObjRemoveImpl tuio2DObjRemove = new Tuio2DObjRemoveImpl();
		return tuio2DObjRemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2DCurAdd createTuio2DCurAdd() {
		Tuio2DCurAddImpl tuio2DCurAdd = new Tuio2DCurAddImpl();
		return tuio2DCurAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2DCurUpdate createTuio2DCurUpdate() {
		Tuio2DCurUpdateImpl tuio2DCurUpdate = new Tuio2DCurUpdateImpl();
		return tuio2DCurUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2DCurRemove createTuio2DCurRemove() {
		Tuio2DCurRemoveImpl tuio2DCurRemove = new Tuio2DCurRemoveImpl();
		return tuio2DCurRemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuioBundle createTuioBundle() {
		TuioBundleImpl tuioBundle = new TuioBundleImpl();
		return tuioBundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STATE createSTATEFromString(EDataType eDataType, String initialValue) {
		STATE result = STATE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSTATEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuioCursor createTuioCursorFromString(EDataType eDataType, String initialValue) {
		return (TuioCursor)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTuioCursorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuioObject createTuioObjectFromString(EDataType eDataType, String initialValue) {
		return (TuioObject)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTuioObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EztuioPackage getEztuioPackage() {
		return (EztuioPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EztuioPackage getPackage() {
		return EztuioPackage.eINSTANCE;
	}

} //EztuioFactoryImpl
