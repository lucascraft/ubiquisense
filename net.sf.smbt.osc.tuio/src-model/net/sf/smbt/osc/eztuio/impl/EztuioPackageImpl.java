/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.eztuio.impl;

import net.sf.reactivision.tuio.TuioCursor;
import net.sf.reactivision.tuio.TuioObject;
import net.sf.smbt.osc.eztuio.EztuioFactory;
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
import net.sf.smbt.osccmd.OsccmdPackage;
import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EztuioPackageImpl extends EPackageImpl implements EztuioPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2DObjEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2DCurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio3DObjEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio3DCurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio25ObjEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio25CurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2DBlobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio3DBlobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio25BlobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2DObjAddEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2DObjUpdateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2DObjRemoveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2DCurAddEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2DCurUpdateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2DCurRemoveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuioBundleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tuioCursorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tuioObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.sf.smbt.osc.eztuio.EztuioPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EztuioPackageImpl() {
		super(eNS_URI, EztuioFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EztuioPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EztuioPackage init() {
		if (isInited) return (EztuioPackage)EPackage.Registry.INSTANCE.getEPackage(EztuioPackage.eNS_URI);

		// Obtain or create and register package
		EztuioPackageImpl theEztuioPackage = (EztuioPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EztuioPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EztuioPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OsccmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEztuioPackage.createPackageContents();

		// Initialize created meta-data
		theEztuioPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEztuioPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EztuioPackage.eNS_URI, theEztuioPackage);
		return theEztuioPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2DObj() {
		return tuio2DObjEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2DObj_S_id() {
		return (EAttribute)tuio2DObjEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2DObj_F_id() {
		return (EAttribute)tuio2DObjEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2DObj_Xpos() {
		return (EAttribute)tuio2DObjEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2DObj_Ypos() {
		return (EAttribute)tuio2DObjEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2DObj_Angle() {
		return (EAttribute)tuio2DObjEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2DObj_Xspeed() {
		return (EAttribute)tuio2DObjEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2DObj_Yspeed() {
		return (EAttribute)tuio2DObjEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2DObj_Rspeed() {
		return (EAttribute)tuio2DObjEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2DObj_Maccel() {
		return (EAttribute)tuio2DObjEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2DObj_Raccel() {
		return (EAttribute)tuio2DObjEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2DObj_TuioObject() {
		return (EAttribute)tuio2DObjEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2DObj_UpdateTime() {
		return (EAttribute)tuio2DObjEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2DObj_State() {
		return (EAttribute)tuio2DObjEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2DCur() {
		return tuio2DCurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2DCur_S_id() {
		return (EAttribute)tuio2DCurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2DCur_Xpos() {
		return (EAttribute)tuio2DCurEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2DCur_Ypos() {
		return (EAttribute)tuio2DCurEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2DCur_Xspeed() {
		return (EAttribute)tuio2DCurEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2DCur_Yspeed() {
		return (EAttribute)tuio2DCurEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2DCur_Maccel() {
		return (EAttribute)tuio2DCurEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2DCur_TuioCursor() {
		return (EAttribute)tuio2DCurEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2DCur_UpdateTime() {
		return (EAttribute)tuio2DCurEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2DCur_State() {
		return (EAttribute)tuio2DCurEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio3DObj() {
		return tuio3DObjEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio3DCur() {
		return tuio3DCurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio25Obj() {
		return tuio25ObjEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio25Cur() {
		return tuio25CurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2DBlob() {
		return tuio2DBlobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio3DBlob() {
		return tuio3DBlobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio25Blob() {
		return tuio25BlobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2DObjAdd() {
		return tuio2DObjAddEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2DObjUpdate() {
		return tuio2DObjUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2DObjRemove() {
		return tuio2DObjRemoveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2DCurAdd() {
		return tuio2DCurAddEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2DCurUpdate() {
		return tuio2DCurUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2DCurRemove() {
		return tuio2DCurRemoveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuioBundle() {
		return tuioBundleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuioBundle_Time() {
		return (EAttribute)tuioBundleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSTATE() {
		return stateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTuioCursor() {
		return tuioCursorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTuioObject() {
		return tuioObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EztuioFactory getEztuioFactory() {
		return (EztuioFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tuio2DObjEClass = createEClass(TUIO2_DOBJ);
		createEAttribute(tuio2DObjEClass, TUIO2_DOBJ__SID);
		createEAttribute(tuio2DObjEClass, TUIO2_DOBJ__FID);
		createEAttribute(tuio2DObjEClass, TUIO2_DOBJ__XPOS);
		createEAttribute(tuio2DObjEClass, TUIO2_DOBJ__YPOS);
		createEAttribute(tuio2DObjEClass, TUIO2_DOBJ__ANGLE);
		createEAttribute(tuio2DObjEClass, TUIO2_DOBJ__XSPEED);
		createEAttribute(tuio2DObjEClass, TUIO2_DOBJ__YSPEED);
		createEAttribute(tuio2DObjEClass, TUIO2_DOBJ__RSPEED);
		createEAttribute(tuio2DObjEClass, TUIO2_DOBJ__MACCEL);
		createEAttribute(tuio2DObjEClass, TUIO2_DOBJ__RACCEL);
		createEAttribute(tuio2DObjEClass, TUIO2_DOBJ__TUIO_OBJECT);
		createEAttribute(tuio2DObjEClass, TUIO2_DOBJ__UPDATE_TIME);
		createEAttribute(tuio2DObjEClass, TUIO2_DOBJ__STATE);

		tuio2DCurEClass = createEClass(TUIO2_DCUR);
		createEAttribute(tuio2DCurEClass, TUIO2_DCUR__SID);
		createEAttribute(tuio2DCurEClass, TUIO2_DCUR__XPOS);
		createEAttribute(tuio2DCurEClass, TUIO2_DCUR__YPOS);
		createEAttribute(tuio2DCurEClass, TUIO2_DCUR__XSPEED);
		createEAttribute(tuio2DCurEClass, TUIO2_DCUR__YSPEED);
		createEAttribute(tuio2DCurEClass, TUIO2_DCUR__MACCEL);
		createEAttribute(tuio2DCurEClass, TUIO2_DCUR__TUIO_CURSOR);
		createEAttribute(tuio2DCurEClass, TUIO2_DCUR__UPDATE_TIME);
		createEAttribute(tuio2DCurEClass, TUIO2_DCUR__STATE);

		tuio3DObjEClass = createEClass(TUIO3_DOBJ);

		tuio3DCurEClass = createEClass(TUIO3_DCUR);

		tuio25ObjEClass = createEClass(TUIO25_OBJ);

		tuio25CurEClass = createEClass(TUIO25_CUR);

		tuio2DBlobEClass = createEClass(TUIO2_DBLOB);

		tuio3DBlobEClass = createEClass(TUIO3_DBLOB);

		tuio25BlobEClass = createEClass(TUIO25_BLOB);

		tuio2DObjAddEClass = createEClass(TUIO2_DOBJ_ADD);

		tuio2DObjUpdateEClass = createEClass(TUIO2_DOBJ_UPDATE);

		tuio2DObjRemoveEClass = createEClass(TUIO2_DOBJ_REMOVE);

		tuio2DCurAddEClass = createEClass(TUIO2_DCUR_ADD);

		tuio2DCurUpdateEClass = createEClass(TUIO2_DCUR_UPDATE);

		tuio2DCurRemoveEClass = createEClass(TUIO2_DCUR_REMOVE);

		tuioBundleEClass = createEClass(TUIO_BUNDLE);
		createEAttribute(tuioBundleEClass, TUIO_BUNDLE__TIME);

		// Create enums
		stateEEnum = createEEnum(STATE);

		// Create data types
		tuioCursorEDataType = createEDataType(TUIO_CURSOR);
		tuioObjectEDataType = createEDataType(TUIO_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OsccmdPackage theOsccmdPackage = (OsccmdPackage)EPackage.Registry.INSTANCE.getEPackage(OsccmdPackage.eNS_URI);
		CmdPackage theCmdPackage = (CmdPackage)EPackage.Registry.INSTANCE.getEPackage(CmdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tuio2DObjEClass.getESuperTypes().add(theOsccmdPackage.getOscRcvCmd());
		tuio2DCurEClass.getESuperTypes().add(theOsccmdPackage.getOscRcvCmd());
		tuio3DObjEClass.getESuperTypes().add(theOsccmdPackage.getOscRcvCmd());
		tuio3DCurEClass.getESuperTypes().add(theOsccmdPackage.getOscRcvCmd());
		tuio25ObjEClass.getESuperTypes().add(theOsccmdPackage.getOscRcvCmd());
		tuio25CurEClass.getESuperTypes().add(theOsccmdPackage.getOscRcvCmd());
		tuio3DBlobEClass.getESuperTypes().add(theOsccmdPackage.getOscRcvCmd());
		tuio25BlobEClass.getESuperTypes().add(theOsccmdPackage.getOscRcvCmd());
		tuio2DObjAddEClass.getESuperTypes().add(this.getTuio2DObj());
		tuio2DObjUpdateEClass.getESuperTypes().add(this.getTuio2DObj());
		tuio2DObjRemoveEClass.getESuperTypes().add(this.getTuio2DObj());
		tuio2DCurAddEClass.getESuperTypes().add(this.getTuio2DCur());
		tuio2DCurUpdateEClass.getESuperTypes().add(this.getTuio2DCur());
		tuio2DCurRemoveEClass.getESuperTypes().add(this.getTuio2DCur());
		tuioBundleEClass.getESuperTypes().add(theCmdPackage.getCompoundCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(tuio2DObjEClass, Tuio2DObj.class, "Tuio2DObj", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTuio2DObj_S_id(), ecorePackage.getELong(), "s_id", null, 0, 1, Tuio2DObj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2DObj_F_id(), ecorePackage.getEInt(), "f_id", null, 0, 1, Tuio2DObj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2DObj_Xpos(), ecorePackage.getEFloat(), "xpos", null, 0, 1, Tuio2DObj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2DObj_Ypos(), ecorePackage.getEFloat(), "ypos", null, 0, 1, Tuio2DObj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2DObj_Angle(), ecorePackage.getEFloat(), "angle", null, 0, 1, Tuio2DObj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2DObj_Xspeed(), ecorePackage.getEFloat(), "xspeed", null, 0, 1, Tuio2DObj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2DObj_Yspeed(), ecorePackage.getEFloat(), "yspeed", null, 0, 1, Tuio2DObj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2DObj_Rspeed(), ecorePackage.getEFloat(), "rspeed", null, 0, 1, Tuio2DObj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2DObj_Maccel(), ecorePackage.getEFloat(), "maccel", null, 0, 1, Tuio2DObj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2DObj_Raccel(), ecorePackage.getEFloat(), "raccel", null, 0, 1, Tuio2DObj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2DObj_TuioObject(), this.getTuioObject(), "tuioObject", null, 0, 1, Tuio2DObj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2DObj_UpdateTime(), ecorePackage.getELong(), "updateTime", null, 0, 1, Tuio2DObj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2DObj_State(), this.getSTATE(), "state", null, 0, 1, Tuio2DObj.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tuio2DCurEClass, Tuio2DCur.class, "Tuio2DCur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTuio2DCur_S_id(), ecorePackage.getELong(), "s_id", null, 0, 1, Tuio2DCur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2DCur_Xpos(), ecorePackage.getEFloat(), "xpos", null, 0, 1, Tuio2DCur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2DCur_Ypos(), ecorePackage.getEFloat(), "ypos", null, 0, 1, Tuio2DCur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2DCur_Xspeed(), ecorePackage.getEFloat(), "xspeed", null, 0, 1, Tuio2DCur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2DCur_Yspeed(), ecorePackage.getEFloat(), "yspeed", null, 0, 1, Tuio2DCur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2DCur_Maccel(), ecorePackage.getEFloat(), "maccel", null, 0, 1, Tuio2DCur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2DCur_TuioCursor(), this.getTuioCursor(), "tuioCursor", null, 0, 1, Tuio2DCur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2DCur_UpdateTime(), ecorePackage.getELong(), "updateTime", null, 0, 1, Tuio2DCur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2DCur_State(), this.getSTATE(), "state", null, 0, 1, Tuio2DCur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tuio3DObjEClass, Tuio3DObj.class, "Tuio3DObj", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tuio3DCurEClass, Tuio3DCur.class, "Tuio3DCur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tuio25ObjEClass, Tuio25Obj.class, "Tuio25Obj", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tuio25CurEClass, Tuio25Cur.class, "Tuio25Cur", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tuio2DBlobEClass, Tuio2DBlob.class, "Tuio2DBlob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tuio3DBlobEClass, Tuio3DBlob.class, "Tuio3DBlob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tuio25BlobEClass, Tuio25Blob.class, "Tuio25Blob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tuio2DObjAddEClass, Tuio2DObjAdd.class, "Tuio2DObjAdd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tuio2DObjUpdateEClass, Tuio2DObjUpdate.class, "Tuio2DObjUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tuio2DObjRemoveEClass, Tuio2DObjRemove.class, "Tuio2DObjRemove", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tuio2DCurAddEClass, Tuio2DCurAdd.class, "Tuio2DCurAdd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tuio2DCurUpdateEClass, Tuio2DCurUpdate.class, "Tuio2DCurUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tuio2DCurRemoveEClass, Tuio2DCurRemove.class, "Tuio2DCurRemove", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tuioBundleEClass, TuioBundle.class, "TuioBundle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTuioBundle_Time(), ecorePackage.getELong(), "time", null, 0, 1, TuioBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(stateEEnum, net.sf.smbt.osc.eztuio.STATE.class, "STATE");
		addEEnumLiteral(stateEEnum, net.sf.smbt.osc.eztuio.STATE.TUIO_ADDED);
		addEEnumLiteral(stateEEnum, net.sf.smbt.osc.eztuio.STATE.TUIO_ACCELERATING);
		addEEnumLiteral(stateEEnum, net.sf.smbt.osc.eztuio.STATE.TUIO_DECELERATING);
		addEEnumLiteral(stateEEnum, net.sf.smbt.osc.eztuio.STATE.TUIO_STOPPED);
		addEEnumLiteral(stateEEnum, net.sf.smbt.osc.eztuio.STATE.TUIO_REMOVED);

		// Initialize data types
		initEDataType(tuioCursorEDataType, TuioCursor.class, "TuioCursor", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tuioObjectEDataType, TuioObject.class, "TuioObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EztuioPackageImpl
