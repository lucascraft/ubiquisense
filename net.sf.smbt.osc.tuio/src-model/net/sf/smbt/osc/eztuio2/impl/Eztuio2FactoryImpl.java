/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.eztuio2.impl;

import net.sf.smbt.osc.eztuio2.*;
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

import org.eclipse.emf.ecore.EClass;
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
public class Eztuio2FactoryImpl extends EFactoryImpl implements Eztuio2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Eztuio2Factory init() {
		try {
			Eztuio2Factory theEztuio2Factory = (Eztuio2Factory)EPackage.Registry.INSTANCE.getEFactory("http://eztuio2/1.0"); 
			if (theEztuio2Factory != null) {
				return theEztuio2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Eztuio2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eztuio2FactoryImpl() {
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
			case Eztuio2Package.TUIO2_TOK: return createTuio2Tok();
			case Eztuio2Package.TUIO2_PTR: return createTuio2Ptr();
			case Eztuio2Package.TUIO2_SYM: return createTuio2Sym();
			case Eztuio2Package.TUIO2_T3D: return createTuio2T3D();
			case Eztuio2Package.TUIO2_P3D: return createTuio2P3D();
			case Eztuio2Package.TUIO2_B3D: return createTuio2B3D();
			case Eztuio2Package.TUIO2_CHG: return createTuio2CHG();
			case Eztuio2Package.TUIO2_OCG: return createTuio2OCG();
			case Eztuio2Package.TUIO2_SKG: return createTuio2SKG();
			case Eztuio2Package.TUIO2_SVG: return createTuio2SVG();
			case Eztuio2Package.TUIO2_ARG: return createTuio2ARG();
			case Eztuio2Package.TUIO2_RAW: return createTuio2RAW();
			case Eztuio2Package.TUIO2_CTL: return createTuio2CTL();
			case Eztuio2Package.TUIO2_DAT: return createTuio2DAT();
			case Eztuio2Package.TUIO2_SIG: return createTuio2SIG();
			case Eztuio2Package.TUIO2_ALA: return createTuio2ALA();
			case Eztuio2Package.TUIO2_COA: return createTuio2COA();
			case Eztuio2Package.TUIO2_LIA: return createTuio2LIA();
			case Eztuio2Package.TUIO2_LLA: return createTuio2LLA();
			case Eztuio2Package.TUIO2_LTA: return createTuio2LTA();
			case Eztuio2Package.TUIO2_FRM: return createTuio2FRM();
			case Eztuio2Package.TUIO2_ALV: return createTuio2ALV();
			case Eztuio2Package.TUIO2_BND: return createTuio2BND();
			case Eztuio2Package.TUIO_POINT: return createTuioPoint();
			case Eztuio2Package.TUIO2_ICG: return createTuio2ICG();
			case Eztuio2Package.TREE_ELEM: return createTreeElem();
			case Eztuio2Package.SPANS_AREA: return createSpansArea();
			case Eztuio2Package.LINK: return createLink();
			case Eztuio2Package.LINK_TREE_ELEM: return createLinkTreeElem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2Tok createTuio2Tok() {
		Tuio2TokImpl tuio2Tok = new Tuio2TokImpl();
		return tuio2Tok;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2Ptr createTuio2Ptr() {
		Tuio2PtrImpl tuio2Ptr = new Tuio2PtrImpl();
		return tuio2Ptr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2Sym createTuio2Sym() {
		Tuio2SymImpl tuio2Sym = new Tuio2SymImpl();
		return tuio2Sym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2T3D createTuio2T3D() {
		Tuio2T3DImpl tuio2T3D = new Tuio2T3DImpl();
		return tuio2T3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2P3D createTuio2P3D() {
		Tuio2P3DImpl tuio2P3D = new Tuio2P3DImpl();
		return tuio2P3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2B3D createTuio2B3D() {
		Tuio2B3DImpl tuio2B3D = new Tuio2B3DImpl();
		return tuio2B3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2CHG createTuio2CHG() {
		Tuio2CHGImpl tuio2CHG = new Tuio2CHGImpl();
		return tuio2CHG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2OCG createTuio2OCG() {
		Tuio2OCGImpl tuio2OCG = new Tuio2OCGImpl();
		return tuio2OCG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2ICG createTuio2ICG() {
		Tuio2ICGImpl tuio2ICG = new Tuio2ICGImpl();
		return tuio2ICG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeElem createTreeElem() {
		TreeElemImpl treeElem = new TreeElemImpl();
		return treeElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpansArea createSpansArea() {
		SpansAreaImpl spansArea = new SpansAreaImpl();
		return spansArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkTreeElem createLinkTreeElem() {
		LinkTreeElemImpl linkTreeElem = new LinkTreeElemImpl();
		return linkTreeElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2SKG createTuio2SKG() {
		Tuio2SKGImpl tuio2SKG = new Tuio2SKGImpl();
		return tuio2SKG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2SVG createTuio2SVG() {
		Tuio2SVGImpl tuio2SVG = new Tuio2SVGImpl();
		return tuio2SVG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2ARG createTuio2ARG() {
		Tuio2ARGImpl tuio2ARG = new Tuio2ARGImpl();
		return tuio2ARG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2RAW createTuio2RAW() {
		Tuio2RAWImpl tuio2RAW = new Tuio2RAWImpl();
		return tuio2RAW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2CTL createTuio2CTL() {
		Tuio2CTLImpl tuio2CTL = new Tuio2CTLImpl();
		return tuio2CTL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2DAT createTuio2DAT() {
		Tuio2DATImpl tuio2DAT = new Tuio2DATImpl();
		return tuio2DAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2SIG createTuio2SIG() {
		Tuio2SIGImpl tuio2SIG = new Tuio2SIGImpl();
		return tuio2SIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2ALA createTuio2ALA() {
		Tuio2ALAImpl tuio2ALA = new Tuio2ALAImpl();
		return tuio2ALA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2COA createTuio2COA() {
		Tuio2COAImpl tuio2COA = new Tuio2COAImpl();
		return tuio2COA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2LIA createTuio2LIA() {
		Tuio2LIAImpl tuio2LIA = new Tuio2LIAImpl();
		return tuio2LIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2LLA createTuio2LLA() {
		Tuio2LLAImpl tuio2LLA = new Tuio2LLAImpl();
		return tuio2LLA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2LTA createTuio2LTA() {
		Tuio2LTAImpl tuio2LTA = new Tuio2LTAImpl();
		return tuio2LTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2FRM createTuio2FRM() {
		Tuio2FRMImpl tuio2FRM = new Tuio2FRMImpl();
		return tuio2FRM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2ALV createTuio2ALV() {
		Tuio2ALVImpl tuio2ALV = new Tuio2ALVImpl();
		return tuio2ALV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tuio2BND createTuio2BND() {
		Tuio2BNDImpl tuio2BND = new Tuio2BNDImpl();
		return tuio2BND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TuioPoint createTuioPoint() {
		TuioPointImpl tuioPoint = new TuioPointImpl();
		return tuioPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eztuio2Package getEztuio2Package() {
		return (Eztuio2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Eztuio2Package getPackage() {
		return Eztuio2Package.eINSTANCE;
	}

} //Eztuio2FactoryImpl
