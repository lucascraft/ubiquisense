/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.eztuio2.impl;

import net.sf.smbt.osc.eztuio2.Eztuio2Factory;
import net.sf.smbt.osc.eztuio2.Eztuio2Package;
import net.sf.smbt.osc.eztuio2.Link;
import net.sf.smbt.osc.eztuio2.LinkTreeElem;
import net.sf.smbt.osc.eztuio2.SpansArea;
import net.sf.smbt.osc.eztuio2.TreeElem;
import net.sf.smbt.osc.eztuio2.Tuio2ALA;
import net.sf.smbt.osc.eztuio2.Tuio2ALV;
import net.sf.smbt.osc.eztuio2.Tuio2ARG;
import net.sf.smbt.osc.eztuio2.Tuio2B3D;
import net.sf.smbt.osc.eztuio2.Tuio2BND;
import net.sf.smbt.osc.eztuio2.Tuio2CHG;
import net.sf.smbt.osc.eztuio2.Tuio2COA;
import net.sf.smbt.osc.eztuio2.Tuio2CTL;
import net.sf.smbt.osc.eztuio2.Tuio2DAT;
import net.sf.smbt.osc.eztuio2.Tuio2FRM;
import net.sf.smbt.osc.eztuio2.Tuio2ICG;
import net.sf.smbt.osc.eztuio2.Tuio2LIA;
import net.sf.smbt.osc.eztuio2.Tuio2LLA;
import net.sf.smbt.osc.eztuio2.Tuio2LTA;
import net.sf.smbt.osc.eztuio2.Tuio2OCG;
import net.sf.smbt.osc.eztuio2.Tuio2P3D;
import net.sf.smbt.osc.eztuio2.Tuio2Ptr;
import net.sf.smbt.osc.eztuio2.Tuio2RAW;
import net.sf.smbt.osc.eztuio2.Tuio2SIG;
import net.sf.smbt.osc.eztuio2.Tuio2SKG;
import net.sf.smbt.osc.eztuio2.Tuio2SVG;
import net.sf.smbt.osc.eztuio2.Tuio2Sym;
import net.sf.smbt.osc.eztuio2.Tuio2T3D;
import net.sf.smbt.osc.eztuio2.Tuio2Tok;
import net.sf.smbt.osc.eztuio2.TuioPoint;
import net.sf.smbt.osccmd.OsccmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Eztuio2PackageImpl extends EPackageImpl implements Eztuio2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2TokEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2PtrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2SymEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2T3DEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2P3DEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2B3DEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2CHGEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2OCGEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2ICGEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treeElemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spansAreaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkTreeElemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2SKGEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2SVGEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2ARGEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2RAWEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2CTLEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2DATEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2SIGEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2ALAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2COAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2LIAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2LLAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2LTAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2FRMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2ALVEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuio2BNDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tuioPointEClass = null;

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
	 * @see net.sf.smbt.osc.eztuio2.Eztuio2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Eztuio2PackageImpl() {
		super(eNS_URI, Eztuio2Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Eztuio2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Eztuio2Package init() {
		if (isInited) return (Eztuio2Package)EPackage.Registry.INSTANCE.getEPackage(Eztuio2Package.eNS_URI);

		// Obtain or create and register package
		Eztuio2PackageImpl theEztuio2Package = (Eztuio2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Eztuio2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Eztuio2PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OsccmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEztuio2Package.createPackageContents();

		// Initialize created meta-data
		theEztuio2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEztuio2Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Eztuio2Package.eNS_URI, theEztuio2Package);
		return theEztuio2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2Tok() {
		return tuio2TokEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2Tok_S_id() {
		return (EAttribute)tuio2TokEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2Tok_Tu_id() {
		return (EAttribute)tuio2TokEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2Tok_C_id() {
		return (EAttribute)tuio2TokEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2Tok_X_pos() {
		return (EAttribute)tuio2TokEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2Tok_Y_pos() {
		return (EAttribute)tuio2TokEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2Tok_X_vel() {
		return (EAttribute)tuio2TokEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2Tok_Y_vel() {
		return (EAttribute)tuio2TokEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2Tok_M_acc() {
		return (EAttribute)tuio2TokEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2Tok_R_acc() {
		return (EAttribute)tuio2TokEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2Ptr() {
		return tuio2PtrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2Ptr_S_id() {
		return (EAttribute)tuio2PtrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2Ptr_Tu_id() {
		return (EAttribute)tuio2PtrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2Ptr_C_id() {
		return (EAttribute)tuio2PtrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2Ptr_X_pos() {
		return (EAttribute)tuio2PtrEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2Ptr_Y_pos() {
		return (EAttribute)tuio2PtrEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2Ptr_Width() {
		return (EAttribute)tuio2PtrEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2Ptr_Press() {
		return (EAttribute)tuio2PtrEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2Ptr_X_vel() {
		return (EAttribute)tuio2PtrEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2Ptr_Y_vel() {
		return (EAttribute)tuio2PtrEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2Ptr_M_acc() {
		return (EAttribute)tuio2PtrEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2Sym() {
		return tuio2SymEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2Sym_S_id() {
		return (EAttribute)tuio2SymEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2Sym_Tu_id() {
		return (EAttribute)tuio2SymEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2Sym_C_id() {
		return (EAttribute)tuio2SymEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2Sym_Group() {
		return (EAttribute)tuio2SymEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2Sym_S() {
		return (EAttribute)tuio2SymEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2T3D() {
		return tuio2T3DEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2T3D_S_id() {
		return (EAttribute)tuio2T3DEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2T3D_Tu_id() {
		return (EAttribute)tuio2T3DEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2T3D_C_id() {
		return (EAttribute)tuio2T3DEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2T3D_X_pos() {
		return (EAttribute)tuio2T3DEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2T3D_Y_pos() {
		return (EAttribute)tuio2T3DEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2T3D_Z_pos() {
		return (EAttribute)tuio2T3DEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2T3D_Yaw() {
		return (EAttribute)tuio2T3DEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2T3D_Pitch() {
		return (EAttribute)tuio2T3DEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2T3D_Roll() {
		return (EAttribute)tuio2T3DEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2T3D_X_vel() {
		return (EAttribute)tuio2T3DEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2T3D_Y_vel() {
		return (EAttribute)tuio2T3DEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2T3D_Z_vel() {
		return (EAttribute)tuio2T3DEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2T3D_A_vel() {
		return (EAttribute)tuio2T3DEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2T3D_B_vel() {
		return (EAttribute)tuio2T3DEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2T3D_C_vel() {
		return (EAttribute)tuio2T3DEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2T3D_M_acc() {
		return (EAttribute)tuio2T3DEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2T3D_R_acc() {
		return (EAttribute)tuio2T3DEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2P3D() {
		return tuio2P3DEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2B3D() {
		return tuio2B3DEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2B3D_S_id() {
		return (EAttribute)tuio2B3DEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2B3D_X_pos() {
		return (EAttribute)tuio2B3DEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2B3D_Y_pos() {
		return (EAttribute)tuio2B3DEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2B3D_Z_pos() {
		return (EAttribute)tuio2B3DEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2B3D_Yaw() {
		return (EAttribute)tuio2B3DEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2B3D_Pitch() {
		return (EAttribute)tuio2B3DEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2B3D_Roll() {
		return (EAttribute)tuio2B3DEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2B3D_Width() {
		return (EAttribute)tuio2B3DEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2B3D_Height() {
		return (EAttribute)tuio2B3DEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2B3D_Depth() {
		return (EAttribute)tuio2B3DEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2B3D_Vol() {
		return (EAttribute)tuio2B3DEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2B3D_X_vel() {
		return (EAttribute)tuio2B3DEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2B3D_Y_vel() {
		return (EAttribute)tuio2B3DEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2B3D_Z_vel() {
		return (EAttribute)tuio2B3DEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2B3D_A_vel() {
		return (EAttribute)tuio2B3DEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2B3D_B_vel() {
		return (EAttribute)tuio2B3DEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2B3D_C_vel() {
		return (EAttribute)tuio2B3DEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2B3D_M_acc() {
		return (EAttribute)tuio2B3DEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2B3D_R_acc() {
		return (EAttribute)tuio2B3DEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2CHG() {
		return tuio2CHGEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2CHG_S_id() {
		return (EAttribute)tuio2CHGEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTuio2CHG_Pts() {
		return (EReference)tuio2CHGEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2OCG() {
		return tuio2OCGEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2OCG_S_id() {
		return (EAttribute)tuio2OCGEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTuio2OCG_Pts() {
		return (EReference)tuio2OCGEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2ICG() {
		return tuio2ICGEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2ICG_S_id() {
		return (EAttribute)tuio2ICGEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTuio2ICG_Pts() {
		return (EReference)tuio2ICGEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTuio2ICG_Additional() {
		return (EReference)tuio2ICGEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2ICG_ShapeNeeded() {
		return (EAttribute)tuio2ICGEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTreeElem() {
		return treeElemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTreeElem_Pt() {
		return (EReference)treeElemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTreeElem_LastNode() {
		return (EAttribute)treeElemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTreeElem_Id() {
		return (EAttribute)treeElemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpansArea() {
		return spansAreaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpansArea_X() {
		return (EAttribute)spansAreaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpansArea_Y() {
		return (EAttribute)spansAreaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpansArea_W() {
		return (EAttribute)spansAreaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_S_id() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLink_Lnk() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkTreeElem() {
		return linkTreeElemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkTreeElem_Id() {
		return (EAttribute)linkTreeElemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkTreeElem_LastNode() {
		return (EAttribute)linkTreeElemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkTreeElem_Link() {
		return (EReference)linkTreeElemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2SKG() {
		return tuio2SKGEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2SKG_S_id() {
		return (EAttribute)tuio2SKGEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTuio2SKG_Nodes() {
		return (EReference)tuio2SKGEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2SKG_Radiuses() {
		return (EAttribute)tuio2SKGEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2SVG() {
		return tuio2SVGEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2SVG_S_id() {
		return (EAttribute)tuio2SVGEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2ARG() {
		return tuio2ARGEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2ARG_S_id() {
		return (EAttribute)tuio2ARGEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTuio2ARG_Args() {
		return (EReference)tuio2ARGEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2RAW() {
		return tuio2RAWEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2RAW_S_id() {
		return (EAttribute)tuio2RAWEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2RAW_Width() {
		return (EAttribute)tuio2RAWEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2RAW_Data() {
		return (EAttribute)tuio2RAWEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2CTL() {
		return tuio2CTLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2CTL_S_id() {
		return (EAttribute)tuio2CTLEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2CTL_Ctrl() {
		return (EAttribute)tuio2CTLEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2DAT() {
		return tuio2DATEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2DAT_S_id() {
		return (EAttribute)tuio2DATEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2DAT_Mime() {
		return (EAttribute)tuio2DATEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2DAT_Data() {
		return (EAttribute)tuio2DATEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2SIG() {
		return tuio2SIGEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2SIG_S_id() {
		return (EAttribute)tuio2SIGEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2SIG_C_id() {
		return (EAttribute)tuio2SIGEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2SIG_Ids() {
		return (EAttribute)tuio2SIGEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2ALA() {
		return tuio2ALAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2ALA_Ids() {
		return (EAttribute)tuio2ALAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2COA() {
		return tuio2COAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2COA_S_id() {
		return (EAttribute)tuio2COAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2COA_Slot() {
		return (EAttribute)tuio2COAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2COA_Ids() {
		return (EAttribute)tuio2COAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2LIA() {
		return tuio2LIAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTuio2LIA_Links() {
		return (EReference)tuio2LIAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2LLA() {
		return tuio2LLAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2LLA_S_id() {
		return (EAttribute)tuio2LLAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2LLA_Bool() {
		return (EAttribute)tuio2LLAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTuio2LLA_Links() {
		return (EReference)tuio2LLAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2LTA() {
		return tuio2LTAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2LTA_S_id() {
		return (EAttribute)tuio2LTAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2LTA_Bool() {
		return (EAttribute)tuio2LTAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTuio2LTA_Links() {
		return (EReference)tuio2LTAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2FRM() {
		return tuio2FRMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2FRM_F_id() {
		return (EAttribute)tuio2FRMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2FRM_Time() {
		return (EAttribute)tuio2FRMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2FRM_App() {
		return (EAttribute)tuio2FRMEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2FRM_Addr() {
		return (EAttribute)tuio2FRMEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2FRM_Dim() {
		return (EAttribute)tuio2FRMEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2ALV() {
		return tuio2ALVEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2ALV_S_ids() {
		return (EAttribute)tuio2ALVEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuio2BND() {
		return tuio2BNDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2BND_S_id() {
		return (EAttribute)tuio2BNDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2BND_X_pos() {
		return (EAttribute)tuio2BNDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2BND_Y_pos() {
		return (EAttribute)tuio2BNDEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2BND_Angle() {
		return (EAttribute)tuio2BNDEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2BND_Width() {
		return (EAttribute)tuio2BNDEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2BND_Height() {
		return (EAttribute)tuio2BNDEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2BND_Area() {
		return (EAttribute)tuio2BNDEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2BND_X_vel() {
		return (EAttribute)tuio2BNDEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2BND_Y_vel() {
		return (EAttribute)tuio2BNDEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2BND_A_vel() {
		return (EAttribute)tuio2BNDEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2BND_M_acc() {
		return (EAttribute)tuio2BNDEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuio2BND_R_acc() {
		return (EAttribute)tuio2BNDEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTuioPoint() {
		return tuioPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuioPoint_X() {
		return (EAttribute)tuioPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTuioPoint_Y() {
		return (EAttribute)tuioPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eztuio2Factory getEztuio2Factory() {
		return (Eztuio2Factory)getEFactoryInstance();
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
		tuio2TokEClass = createEClass(TUIO2_TOK);
		createEAttribute(tuio2TokEClass, TUIO2_TOK__SID);
		createEAttribute(tuio2TokEClass, TUIO2_TOK__TU_ID);
		createEAttribute(tuio2TokEClass, TUIO2_TOK__CID);
		createEAttribute(tuio2TokEClass, TUIO2_TOK__XPOS);
		createEAttribute(tuio2TokEClass, TUIO2_TOK__YPOS);
		createEAttribute(tuio2TokEClass, TUIO2_TOK__XVEL);
		createEAttribute(tuio2TokEClass, TUIO2_TOK__YVEL);
		createEAttribute(tuio2TokEClass, TUIO2_TOK__MACC);
		createEAttribute(tuio2TokEClass, TUIO2_TOK__RACC);

		tuio2PtrEClass = createEClass(TUIO2_PTR);
		createEAttribute(tuio2PtrEClass, TUIO2_PTR__SID);
		createEAttribute(tuio2PtrEClass, TUIO2_PTR__TU_ID);
		createEAttribute(tuio2PtrEClass, TUIO2_PTR__CID);
		createEAttribute(tuio2PtrEClass, TUIO2_PTR__XPOS);
		createEAttribute(tuio2PtrEClass, TUIO2_PTR__YPOS);
		createEAttribute(tuio2PtrEClass, TUIO2_PTR__WIDTH);
		createEAttribute(tuio2PtrEClass, TUIO2_PTR__PRESS);
		createEAttribute(tuio2PtrEClass, TUIO2_PTR__XVEL);
		createEAttribute(tuio2PtrEClass, TUIO2_PTR__YVEL);
		createEAttribute(tuio2PtrEClass, TUIO2_PTR__MACC);

		tuio2SymEClass = createEClass(TUIO2_SYM);
		createEAttribute(tuio2SymEClass, TUIO2_SYM__SID);
		createEAttribute(tuio2SymEClass, TUIO2_SYM__TU_ID);
		createEAttribute(tuio2SymEClass, TUIO2_SYM__CID);
		createEAttribute(tuio2SymEClass, TUIO2_SYM__GROUP);
		createEAttribute(tuio2SymEClass, TUIO2_SYM__S);

		tuio2T3DEClass = createEClass(TUIO2_T3D);
		createEAttribute(tuio2T3DEClass, TUIO2_T3D__SID);
		createEAttribute(tuio2T3DEClass, TUIO2_T3D__TU_ID);
		createEAttribute(tuio2T3DEClass, TUIO2_T3D__CID);
		createEAttribute(tuio2T3DEClass, TUIO2_T3D__XPOS);
		createEAttribute(tuio2T3DEClass, TUIO2_T3D__YPOS);
		createEAttribute(tuio2T3DEClass, TUIO2_T3D__ZPOS);
		createEAttribute(tuio2T3DEClass, TUIO2_T3D__YAW);
		createEAttribute(tuio2T3DEClass, TUIO2_T3D__PITCH);
		createEAttribute(tuio2T3DEClass, TUIO2_T3D__ROLL);
		createEAttribute(tuio2T3DEClass, TUIO2_T3D__XVEL);
		createEAttribute(tuio2T3DEClass, TUIO2_T3D__YVEL);
		createEAttribute(tuio2T3DEClass, TUIO2_T3D__ZVEL);
		createEAttribute(tuio2T3DEClass, TUIO2_T3D__AVEL);
		createEAttribute(tuio2T3DEClass, TUIO2_T3D__BVEL);
		createEAttribute(tuio2T3DEClass, TUIO2_T3D__CVEL);
		createEAttribute(tuio2T3DEClass, TUIO2_T3D__MACC);
		createEAttribute(tuio2T3DEClass, TUIO2_T3D__RACC);

		tuio2P3DEClass = createEClass(TUIO2_P3D);

		tuio2B3DEClass = createEClass(TUIO2_B3D);
		createEAttribute(tuio2B3DEClass, TUIO2_B3D__SID);
		createEAttribute(tuio2B3DEClass, TUIO2_B3D__XPOS);
		createEAttribute(tuio2B3DEClass, TUIO2_B3D__YPOS);
		createEAttribute(tuio2B3DEClass, TUIO2_B3D__ZPOS);
		createEAttribute(tuio2B3DEClass, TUIO2_B3D__YAW);
		createEAttribute(tuio2B3DEClass, TUIO2_B3D__PITCH);
		createEAttribute(tuio2B3DEClass, TUIO2_B3D__ROLL);
		createEAttribute(tuio2B3DEClass, TUIO2_B3D__WIDTH);
		createEAttribute(tuio2B3DEClass, TUIO2_B3D__HEIGHT);
		createEAttribute(tuio2B3DEClass, TUIO2_B3D__DEPTH);
		createEAttribute(tuio2B3DEClass, TUIO2_B3D__VOL);
		createEAttribute(tuio2B3DEClass, TUIO2_B3D__XVEL);
		createEAttribute(tuio2B3DEClass, TUIO2_B3D__YVEL);
		createEAttribute(tuio2B3DEClass, TUIO2_B3D__ZVEL);
		createEAttribute(tuio2B3DEClass, TUIO2_B3D__AVEL);
		createEAttribute(tuio2B3DEClass, TUIO2_B3D__BVEL);
		createEAttribute(tuio2B3DEClass, TUIO2_B3D__CVEL);
		createEAttribute(tuio2B3DEClass, TUIO2_B3D__MACC);
		createEAttribute(tuio2B3DEClass, TUIO2_B3D__RACC);

		tuio2CHGEClass = createEClass(TUIO2_CHG);
		createEAttribute(tuio2CHGEClass, TUIO2_CHG__SID);
		createEReference(tuio2CHGEClass, TUIO2_CHG__PTS);

		tuio2OCGEClass = createEClass(TUIO2_OCG);
		createEAttribute(tuio2OCGEClass, TUIO2_OCG__SID);
		createEReference(tuio2OCGEClass, TUIO2_OCG__PTS);

		tuio2SKGEClass = createEClass(TUIO2_SKG);
		createEAttribute(tuio2SKGEClass, TUIO2_SKG__SID);
		createEReference(tuio2SKGEClass, TUIO2_SKG__NODES);
		createEAttribute(tuio2SKGEClass, TUIO2_SKG__RADIUSES);

		tuio2SVGEClass = createEClass(TUIO2_SVG);
		createEAttribute(tuio2SVGEClass, TUIO2_SVG__SID);

		tuio2ARGEClass = createEClass(TUIO2_ARG);
		createEAttribute(tuio2ARGEClass, TUIO2_ARG__SID);
		createEReference(tuio2ARGEClass, TUIO2_ARG__ARGS);

		tuio2RAWEClass = createEClass(TUIO2_RAW);
		createEAttribute(tuio2RAWEClass, TUIO2_RAW__SID);
		createEAttribute(tuio2RAWEClass, TUIO2_RAW__WIDTH);
		createEAttribute(tuio2RAWEClass, TUIO2_RAW__DATA);

		tuio2CTLEClass = createEClass(TUIO2_CTL);
		createEAttribute(tuio2CTLEClass, TUIO2_CTL__SID);
		createEAttribute(tuio2CTLEClass, TUIO2_CTL__CTRL);

		tuio2DATEClass = createEClass(TUIO2_DAT);
		createEAttribute(tuio2DATEClass, TUIO2_DAT__SID);
		createEAttribute(tuio2DATEClass, TUIO2_DAT__MIME);
		createEAttribute(tuio2DATEClass, TUIO2_DAT__DATA);

		tuio2SIGEClass = createEClass(TUIO2_SIG);
		createEAttribute(tuio2SIGEClass, TUIO2_SIG__SID);
		createEAttribute(tuio2SIGEClass, TUIO2_SIG__CID);
		createEAttribute(tuio2SIGEClass, TUIO2_SIG__IDS);

		tuio2ALAEClass = createEClass(TUIO2_ALA);
		createEAttribute(tuio2ALAEClass, TUIO2_ALA__IDS);

		tuio2COAEClass = createEClass(TUIO2_COA);
		createEAttribute(tuio2COAEClass, TUIO2_COA__SID);
		createEAttribute(tuio2COAEClass, TUIO2_COA__SLOT);
		createEAttribute(tuio2COAEClass, TUIO2_COA__IDS);

		tuio2LIAEClass = createEClass(TUIO2_LIA);
		createEReference(tuio2LIAEClass, TUIO2_LIA__LINKS);

		tuio2LLAEClass = createEClass(TUIO2_LLA);
		createEAttribute(tuio2LLAEClass, TUIO2_LLA__SID);
		createEAttribute(tuio2LLAEClass, TUIO2_LLA__BOOL);
		createEReference(tuio2LLAEClass, TUIO2_LLA__LINKS);

		tuio2LTAEClass = createEClass(TUIO2_LTA);
		createEAttribute(tuio2LTAEClass, TUIO2_LTA__SID);
		createEAttribute(tuio2LTAEClass, TUIO2_LTA__BOOL);
		createEReference(tuio2LTAEClass, TUIO2_LTA__LINKS);

		tuio2FRMEClass = createEClass(TUIO2_FRM);
		createEAttribute(tuio2FRMEClass, TUIO2_FRM__FID);
		createEAttribute(tuio2FRMEClass, TUIO2_FRM__TIME);
		createEAttribute(tuio2FRMEClass, TUIO2_FRM__APP);
		createEAttribute(tuio2FRMEClass, TUIO2_FRM__ADDR);
		createEAttribute(tuio2FRMEClass, TUIO2_FRM__DIM);

		tuio2ALVEClass = createEClass(TUIO2_ALV);
		createEAttribute(tuio2ALVEClass, TUIO2_ALV__SIDS);

		tuio2BNDEClass = createEClass(TUIO2_BND);
		createEAttribute(tuio2BNDEClass, TUIO2_BND__SID);
		createEAttribute(tuio2BNDEClass, TUIO2_BND__XPOS);
		createEAttribute(tuio2BNDEClass, TUIO2_BND__YPOS);
		createEAttribute(tuio2BNDEClass, TUIO2_BND__ANGLE);
		createEAttribute(tuio2BNDEClass, TUIO2_BND__WIDTH);
		createEAttribute(tuio2BNDEClass, TUIO2_BND__HEIGHT);
		createEAttribute(tuio2BNDEClass, TUIO2_BND__AREA);
		createEAttribute(tuio2BNDEClass, TUIO2_BND__XVEL);
		createEAttribute(tuio2BNDEClass, TUIO2_BND__YVEL);
		createEAttribute(tuio2BNDEClass, TUIO2_BND__AVEL);
		createEAttribute(tuio2BNDEClass, TUIO2_BND__MACC);
		createEAttribute(tuio2BNDEClass, TUIO2_BND__RACC);

		tuioPointEClass = createEClass(TUIO_POINT);
		createEAttribute(tuioPointEClass, TUIO_POINT__X);
		createEAttribute(tuioPointEClass, TUIO_POINT__Y);

		tuio2ICGEClass = createEClass(TUIO2_ICG);
		createEAttribute(tuio2ICGEClass, TUIO2_ICG__SID);
		createEReference(tuio2ICGEClass, TUIO2_ICG__PTS);
		createEReference(tuio2ICGEClass, TUIO2_ICG__ADDITIONAL);
		createEAttribute(tuio2ICGEClass, TUIO2_ICG__SHAPE_NEEDED);

		treeElemEClass = createEClass(TREE_ELEM);
		createEReference(treeElemEClass, TREE_ELEM__PT);
		createEAttribute(treeElemEClass, TREE_ELEM__LAST_NODE);
		createEAttribute(treeElemEClass, TREE_ELEM__ID);

		spansAreaEClass = createEClass(SPANS_AREA);
		createEAttribute(spansAreaEClass, SPANS_AREA__X);
		createEAttribute(spansAreaEClass, SPANS_AREA__Y);
		createEAttribute(spansAreaEClass, SPANS_AREA__W);

		linkEClass = createEClass(LINK);
		createEAttribute(linkEClass, LINK__SID);
		createEAttribute(linkEClass, LINK__LNK);

		linkTreeElemEClass = createEClass(LINK_TREE_ELEM);
		createEAttribute(linkTreeElemEClass, LINK_TREE_ELEM__ID);
		createEAttribute(linkTreeElemEClass, LINK_TREE_ELEM__LAST_NODE);
		createEReference(linkTreeElemEClass, LINK_TREE_ELEM__LINK);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tuio2TokEClass.getESuperTypes().add(theOsccmdPackage.getOscCmd());
		tuio2PtrEClass.getESuperTypes().add(theOsccmdPackage.getOscCmd());
		tuio2SymEClass.getESuperTypes().add(theOsccmdPackage.getOscCmd());
		tuio2T3DEClass.getESuperTypes().add(theOsccmdPackage.getOscCmd());
		tuio2P3DEClass.getESuperTypes().add(theOsccmdPackage.getOscCmd());
		tuio2B3DEClass.getESuperTypes().add(theOsccmdPackage.getOscCmd());
		tuio2CHGEClass.getESuperTypes().add(theOsccmdPackage.getOscCmd());
		tuio2OCGEClass.getESuperTypes().add(theOsccmdPackage.getOscCmd());
		tuio2SKGEClass.getESuperTypes().add(theOsccmdPackage.getOscCmd());
		tuio2SVGEClass.getESuperTypes().add(theOsccmdPackage.getOscCmd());
		tuio2ARGEClass.getESuperTypes().add(theOsccmdPackage.getOscCmd());
		tuio2RAWEClass.getESuperTypes().add(theOsccmdPackage.getOscCmd());
		tuio2CTLEClass.getESuperTypes().add(theOsccmdPackage.getOscCmd());
		tuio2DATEClass.getESuperTypes().add(theOsccmdPackage.getOscCmd());
		tuio2SIGEClass.getESuperTypes().add(theOsccmdPackage.getOscCmd());
		tuio2ALAEClass.getESuperTypes().add(theOsccmdPackage.getOscCmd());
		tuio2COAEClass.getESuperTypes().add(theOsccmdPackage.getOscCmd());
		tuio2LIAEClass.getESuperTypes().add(theOsccmdPackage.getOscCmd());
		tuio2LLAEClass.getESuperTypes().add(theOsccmdPackage.getOscCmd());
		tuio2LTAEClass.getESuperTypes().add(theOsccmdPackage.getOscCmd());
		tuio2FRMEClass.getESuperTypes().add(theOsccmdPackage.getOscCmd());
		tuio2ALVEClass.getESuperTypes().add(theOsccmdPackage.getOscCmd());
		tuio2BNDEClass.getESuperTypes().add(theOsccmdPackage.getOscCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(tuio2TokEClass, Tuio2Tok.class, "Tuio2Tok", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTuio2Tok_S_id(), ecorePackage.getEString(), "s_id", null, 0, 1, Tuio2Tok.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2Tok_Tu_id(), ecorePackage.getEString(), "tu_id", null, 0, 1, Tuio2Tok.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2Tok_C_id(), ecorePackage.getEString(), "c_id", null, 0, 1, Tuio2Tok.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2Tok_X_pos(), ecorePackage.getEFloat(), "x_pos", null, 0, 1, Tuio2Tok.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2Tok_Y_pos(), ecorePackage.getEFloat(), "y_pos", null, 0, 1, Tuio2Tok.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2Tok_X_vel(), ecorePackage.getEFloat(), "x_vel", null, 0, 1, Tuio2Tok.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2Tok_Y_vel(), ecorePackage.getEFloat(), "y_vel", null, 0, 1, Tuio2Tok.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2Tok_M_acc(), ecorePackage.getEFloat(), "m_acc", null, 0, 1, Tuio2Tok.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2Tok_R_acc(), ecorePackage.getEFloat(), "r_acc", null, 0, 1, Tuio2Tok.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tuio2PtrEClass, Tuio2Ptr.class, "Tuio2Ptr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTuio2Ptr_S_id(), ecorePackage.getEString(), "s_id", null, 0, 1, Tuio2Ptr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2Ptr_Tu_id(), ecorePackage.getEString(), "tu_id", null, 0, 1, Tuio2Ptr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2Ptr_C_id(), ecorePackage.getEString(), "c_id", null, 0, 1, Tuio2Ptr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2Ptr_X_pos(), ecorePackage.getEFloat(), "x_pos", null, 0, 1, Tuio2Ptr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2Ptr_Y_pos(), ecorePackage.getEFloat(), "y_pos", null, 0, 1, Tuio2Ptr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2Ptr_Width(), ecorePackage.getEInt(), "width", null, 0, 1, Tuio2Ptr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2Ptr_Press(), ecorePackage.getEInt(), "press", null, 0, 1, Tuio2Ptr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2Ptr_X_vel(), ecorePackage.getEFloat(), "x_vel", null, 0, 1, Tuio2Ptr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2Ptr_Y_vel(), ecorePackage.getEFloat(), "y_vel", null, 0, 1, Tuio2Ptr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2Ptr_M_acc(), ecorePackage.getEFloat(), "m_acc", null, 0, 1, Tuio2Ptr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tuio2SymEClass, Tuio2Sym.class, "Tuio2Sym", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTuio2Sym_S_id(), ecorePackage.getEString(), "s_id", null, 0, 1, Tuio2Sym.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2Sym_Tu_id(), ecorePackage.getEString(), "tu_id", null, 0, 1, Tuio2Sym.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2Sym_C_id(), ecorePackage.getEString(), "c_id", null, 0, 1, Tuio2Sym.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2Sym_Group(), ecorePackage.getEString(), "group", null, 0, 1, Tuio2Sym.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2Sym_S(), ecorePackage.getEString(), "s", null, 0, 1, Tuio2Sym.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tuio2T3DEClass, Tuio2T3D.class, "Tuio2T3D", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTuio2T3D_S_id(), ecorePackage.getEString(), "s_id", null, 0, 1, Tuio2T3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2T3D_Tu_id(), ecorePackage.getEString(), "tu_id", null, 0, 1, Tuio2T3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2T3D_C_id(), ecorePackage.getEString(), "c_id", null, 0, 1, Tuio2T3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2T3D_X_pos(), ecorePackage.getEFloat(), "x_pos", null, 0, 1, Tuio2T3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2T3D_Y_pos(), ecorePackage.getEFloat(), "y_pos", null, 0, 1, Tuio2T3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2T3D_Z_pos(), ecorePackage.getEFloat(), "z_pos", null, 0, 1, Tuio2T3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2T3D_Yaw(), ecorePackage.getEFloat(), "yaw", null, 0, 1, Tuio2T3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2T3D_Pitch(), ecorePackage.getEFloat(), "pitch", null, 0, 1, Tuio2T3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2T3D_Roll(), ecorePackage.getEFloat(), "roll", null, 0, 1, Tuio2T3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2T3D_X_vel(), ecorePackage.getEFloat(), "x_vel", null, 0, 1, Tuio2T3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2T3D_Y_vel(), ecorePackage.getEFloat(), "y_vel", null, 0, 1, Tuio2T3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2T3D_Z_vel(), ecorePackage.getEFloat(), "z_vel", null, 0, 1, Tuio2T3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2T3D_A_vel(), ecorePackage.getEFloat(), "a_vel", null, 0, 1, Tuio2T3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2T3D_B_vel(), ecorePackage.getEFloat(), "b_vel", null, 0, 1, Tuio2T3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2T3D_C_vel(), ecorePackage.getEFloat(), "c_vel", null, 0, 1, Tuio2T3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2T3D_M_acc(), ecorePackage.getEFloat(), "m_acc", null, 0, 1, Tuio2T3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2T3D_R_acc(), ecorePackage.getEFloat(), "r_acc", null, 0, 1, Tuio2T3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tuio2P3DEClass, Tuio2P3D.class, "Tuio2P3D", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tuio2B3DEClass, Tuio2B3D.class, "Tuio2B3D", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTuio2B3D_S_id(), ecorePackage.getEString(), "s_id", null, 0, 1, Tuio2B3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2B3D_X_pos(), ecorePackage.getEFloat(), "x_pos", null, 0, 1, Tuio2B3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2B3D_Y_pos(), ecorePackage.getEFloat(), "y_pos", null, 0, 1, Tuio2B3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2B3D_Z_pos(), ecorePackage.getEFloat(), "z_pos", null, 0, 1, Tuio2B3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2B3D_Yaw(), ecorePackage.getEFloat(), "yaw", null, 0, 1, Tuio2B3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2B3D_Pitch(), ecorePackage.getEFloat(), "pitch", null, 0, 1, Tuio2B3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2B3D_Roll(), ecorePackage.getEFloat(), "roll", null, 0, 1, Tuio2B3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2B3D_Width(), ecorePackage.getEInt(), "width", null, 0, 1, Tuio2B3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2B3D_Height(), ecorePackage.getEInt(), "height", null, 0, 1, Tuio2B3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2B3D_Depth(), ecorePackage.getEInt(), "depth", null, 0, 1, Tuio2B3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2B3D_Vol(), ecorePackage.getEFloat(), "vol", null, 0, 1, Tuio2B3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2B3D_X_vel(), ecorePackage.getEFloat(), "x_vel", null, 0, 1, Tuio2B3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2B3D_Y_vel(), ecorePackage.getEFloat(), "y_vel", null, 0, 1, Tuio2B3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2B3D_Z_vel(), ecorePackage.getEFloat(), "z_vel", null, 0, 1, Tuio2B3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2B3D_A_vel(), ecorePackage.getEFloat(), "a_vel", null, 0, 1, Tuio2B3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2B3D_B_vel(), ecorePackage.getEFloat(), "b_vel", null, 0, 1, Tuio2B3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2B3D_C_vel(), ecorePackage.getEFloat(), "c_vel", null, 0, 1, Tuio2B3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2B3D_M_acc(), ecorePackage.getEFloat(), "m_acc", null, 0, 1, Tuio2B3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2B3D_R_acc(), ecorePackage.getEFloat(), "r_acc", null, 0, 1, Tuio2B3D.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tuio2CHGEClass, Tuio2CHG.class, "Tuio2CHG", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTuio2CHG_S_id(), ecorePackage.getEString(), "s_id", null, 0, 1, Tuio2CHG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTuio2CHG_Pts(), this.getTuioPoint(), null, "pts", null, 0, -1, Tuio2CHG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tuio2OCGEClass, Tuio2OCG.class, "Tuio2OCG", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTuio2OCG_S_id(), ecorePackage.getEString(), "s_id", null, 0, 1, Tuio2OCG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTuio2OCG_Pts(), this.getTuioPoint(), null, "pts", null, 0, -1, Tuio2OCG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tuio2SKGEClass, Tuio2SKG.class, "Tuio2SKG", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTuio2SKG_S_id(), ecorePackage.getEString(), "s_id", null, 0, 1, Tuio2SKG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTuio2SKG_Nodes(), this.getTreeElem(), null, "nodes", null, 0, -1, Tuio2SKG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2SKG_Radiuses(), ecorePackage.getEInt(), "radiuses", null, 0, -1, Tuio2SKG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tuio2SVGEClass, Tuio2SVG.class, "Tuio2SVG", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTuio2SVG_S_id(), ecorePackage.getEString(), "s_id", null, 0, 1, Tuio2SVG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tuio2ARGEClass, Tuio2ARG.class, "Tuio2ARG", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTuio2ARG_S_id(), ecorePackage.getEString(), "s_id", null, 0, 1, Tuio2ARG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTuio2ARG_Args(), this.getSpansArea(), null, "args", null, 0, -1, Tuio2ARG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tuio2RAWEClass, Tuio2RAW.class, "Tuio2RAW", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTuio2RAW_S_id(), ecorePackage.getEString(), "s_id", null, 0, 1, Tuio2RAW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2RAW_Width(), ecorePackage.getEInt(), "width", null, 0, 1, Tuio2RAW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2RAW_Data(), ecorePackage.getEByteArray(), "data", null, 0, 1, Tuio2RAW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tuio2CTLEClass, Tuio2CTL.class, "Tuio2CTL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTuio2CTL_S_id(), ecorePackage.getEString(), "s_id", null, 0, 1, Tuio2CTL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2CTL_Ctrl(), ecorePackage.getEFloat(), "ctrl", null, 0, -1, Tuio2CTL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tuio2DATEClass, Tuio2DAT.class, "Tuio2DAT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTuio2DAT_S_id(), ecorePackage.getEString(), "s_id", null, 0, 1, Tuio2DAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2DAT_Mime(), ecorePackage.getEString(), "mime", null, 0, 1, Tuio2DAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2DAT_Data(), ecorePackage.getEByteArray(), "data", null, 0, 1, Tuio2DAT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tuio2SIGEClass, Tuio2SIG.class, "Tuio2SIG", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTuio2SIG_S_id(), ecorePackage.getEString(), "s_id", null, 0, 1, Tuio2SIG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2SIG_C_id(), ecorePackage.getEString(), "c_id", null, 0, 1, Tuio2SIG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2SIG_Ids(), ecorePackage.getEString(), "ids", null, 0, -1, Tuio2SIG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tuio2ALAEClass, Tuio2ALA.class, "Tuio2ALA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTuio2ALA_Ids(), ecorePackage.getEString(), "ids", null, 0, -1, Tuio2ALA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tuio2COAEClass, Tuio2COA.class, "Tuio2COA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTuio2COA_S_id(), ecorePackage.getEString(), "s_id", null, 0, 1, Tuio2COA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2COA_Slot(), ecorePackage.getEString(), "slot", null, 0, 1, Tuio2COA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2COA_Ids(), ecorePackage.getEString(), "ids", null, 0, -1, Tuio2COA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tuio2LIAEClass, Tuio2LIA.class, "Tuio2LIA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTuio2LIA_Links(), this.getLink(), null, "links", null, 0, -1, Tuio2LIA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tuio2LLAEClass, Tuio2LLA.class, "Tuio2LLA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTuio2LLA_S_id(), ecorePackage.getEString(), "s_id", null, 0, 1, Tuio2LLA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2LLA_Bool(), ecorePackage.getEBoolean(), "bool", null, 0, 1, Tuio2LLA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTuio2LLA_Links(), this.getLink(), null, "links", null, 0, -1, Tuio2LLA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tuio2LTAEClass, Tuio2LTA.class, "Tuio2LTA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTuio2LTA_S_id(), ecorePackage.getEString(), "s_id", null, 0, 1, Tuio2LTA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2LTA_Bool(), ecorePackage.getEBoolean(), "bool", null, 0, 1, Tuio2LTA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTuio2LTA_Links(), this.getLinkTreeElem(), null, "links", null, 0, -1, Tuio2LTA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tuio2FRMEClass, Tuio2FRM.class, "Tuio2FRM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTuio2FRM_F_id(), ecorePackage.getEString(), "f_id", null, 0, 1, Tuio2FRM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2FRM_Time(), ecorePackage.getELong(), "time", null, 0, 1, Tuio2FRM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2FRM_App(), ecorePackage.getEString(), "app", null, 0, 1, Tuio2FRM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2FRM_Addr(), ecorePackage.getEString(), "addr", null, 0, 1, Tuio2FRM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2FRM_Dim(), ecorePackage.getEInt(), "dim", null, 0, 1, Tuio2FRM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tuio2ALVEClass, Tuio2ALV.class, "Tuio2ALV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTuio2ALV_S_ids(), ecorePackage.getEString(), "s_ids", null, 0, -1, Tuio2ALV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tuio2BNDEClass, Tuio2BND.class, "Tuio2BND", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTuio2BND_S_id(), ecorePackage.getEString(), "s_id", null, 0, 1, Tuio2BND.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2BND_X_pos(), ecorePackage.getEFloat(), "x_pos", null, 0, 1, Tuio2BND.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2BND_Y_pos(), ecorePackage.getEFloat(), "y_pos", null, 0, 1, Tuio2BND.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2BND_Angle(), ecorePackage.getEFloat(), "angle", null, 0, 1, Tuio2BND.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2BND_Width(), ecorePackage.getEInt(), "width", null, 0, 1, Tuio2BND.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2BND_Height(), ecorePackage.getEInt(), "height", null, 0, 1, Tuio2BND.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2BND_Area(), ecorePackage.getEString(), "area", null, 0, 1, Tuio2BND.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2BND_X_vel(), ecorePackage.getEFloat(), "x_vel", null, 0, 1, Tuio2BND.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2BND_Y_vel(), ecorePackage.getEFloat(), "y_vel", null, 0, 1, Tuio2BND.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2BND_A_vel(), ecorePackage.getEFloat(), "a_vel", null, 0, 1, Tuio2BND.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2BND_M_acc(), ecorePackage.getEFloat(), "m_acc", null, 0, 1, Tuio2BND.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2BND_R_acc(), ecorePackage.getEFloat(), "r_acc", null, 0, 1, Tuio2BND.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tuioPointEClass, TuioPoint.class, "TuioPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTuioPoint_X(), ecorePackage.getEFloat(), "x", null, 0, 1, TuioPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuioPoint_Y(), ecorePackage.getEFloat(), "y", null, 0, 1, TuioPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tuio2ICGEClass, Tuio2ICG.class, "Tuio2ICG", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTuio2ICG_S_id(), ecorePackage.getEString(), "s_id", null, 0, 1, Tuio2ICG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTuio2ICG_Pts(), this.getTuioPoint(), null, "pts", null, 0, -1, Tuio2ICG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTuio2ICG_Additional(), this.getTuioPoint(), null, "additional", null, 0, -1, Tuio2ICG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTuio2ICG_ShapeNeeded(), ecorePackage.getEBoolean(), "shapeNeeded", null, 0, 1, Tuio2ICG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(treeElemEClass, TreeElem.class, "TreeElem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTreeElem_Pt(), this.getTuioPoint(), null, "pt", null, 0, 1, TreeElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTreeElem_LastNode(), ecorePackage.getEInt(), "lastNode", null, 0, 1, TreeElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTreeElem_Id(), ecorePackage.getEInt(), "id", null, 0, 1, TreeElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spansAreaEClass, SpansArea.class, "SpansArea", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpansArea_X(), ecorePackage.getEFloat(), "x", null, 0, 1, SpansArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpansArea_Y(), ecorePackage.getEFloat(), "y", null, 0, 1, SpansArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpansArea_W(), ecorePackage.getEFloat(), "w", null, 0, 1, SpansArea.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLink_S_id(), ecorePackage.getEString(), "s_id", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Lnk(), ecorePackage.getEInt(), "lnk", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkTreeElemEClass, LinkTreeElem.class, "LinkTreeElem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkTreeElem_Id(), ecorePackage.getEInt(), "id", null, 0, 1, LinkTreeElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkTreeElem_LastNode(), ecorePackage.getEInt(), "lastNode", null, 0, 1, LinkTreeElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkTreeElem_Link(), this.getLink(), null, "link", null, 0, 1, LinkTreeElem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Eztuio2PackageImpl
