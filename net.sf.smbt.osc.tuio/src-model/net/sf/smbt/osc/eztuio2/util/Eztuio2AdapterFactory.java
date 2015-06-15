/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.eztuio2.util;

import net.sf.smbt.osc.eztuio2.*;
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
import net.sf.smbt.osccmd.OscCmd;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.osc.eztuio2.Eztuio2Package
 * @generated
 */
public class Eztuio2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Eztuio2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eztuio2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Eztuio2Package.eINSTANCE;
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
	protected Eztuio2Switch<Adapter> modelSwitch =
		new Eztuio2Switch<Adapter>() {
			@Override
			public Adapter caseTuio2Tok(Tuio2Tok object) {
				return createTuio2TokAdapter();
			}
			@Override
			public Adapter caseTuio2Ptr(Tuio2Ptr object) {
				return createTuio2PtrAdapter();
			}
			@Override
			public Adapter caseTuio2Sym(Tuio2Sym object) {
				return createTuio2SymAdapter();
			}
			@Override
			public Adapter caseTuio2T3D(Tuio2T3D object) {
				return createTuio2T3DAdapter();
			}
			@Override
			public Adapter caseTuio2P3D(Tuio2P3D object) {
				return createTuio2P3DAdapter();
			}
			@Override
			public Adapter caseTuio2B3D(Tuio2B3D object) {
				return createTuio2B3DAdapter();
			}
			@Override
			public Adapter caseTuio2CHG(Tuio2CHG object) {
				return createTuio2CHGAdapter();
			}
			@Override
			public Adapter caseTuio2OCG(Tuio2OCG object) {
				return createTuio2OCGAdapter();
			}
			@Override
			public Adapter caseTuio2SKG(Tuio2SKG object) {
				return createTuio2SKGAdapter();
			}
			@Override
			public Adapter caseTuio2SVG(Tuio2SVG object) {
				return createTuio2SVGAdapter();
			}
			@Override
			public Adapter caseTuio2ARG(Tuio2ARG object) {
				return createTuio2ARGAdapter();
			}
			@Override
			public Adapter caseTuio2RAW(Tuio2RAW object) {
				return createTuio2RAWAdapter();
			}
			@Override
			public Adapter caseTuio2CTL(Tuio2CTL object) {
				return createTuio2CTLAdapter();
			}
			@Override
			public Adapter caseTuio2DAT(Tuio2DAT object) {
				return createTuio2DATAdapter();
			}
			@Override
			public Adapter caseTuio2SIG(Tuio2SIG object) {
				return createTuio2SIGAdapter();
			}
			@Override
			public Adapter caseTuio2ALA(Tuio2ALA object) {
				return createTuio2ALAAdapter();
			}
			@Override
			public Adapter caseTuio2COA(Tuio2COA object) {
				return createTuio2COAAdapter();
			}
			@Override
			public Adapter caseTuio2LIA(Tuio2LIA object) {
				return createTuio2LIAAdapter();
			}
			@Override
			public Adapter caseTuio2LLA(Tuio2LLA object) {
				return createTuio2LLAAdapter();
			}
			@Override
			public Adapter caseTuio2LTA(Tuio2LTA object) {
				return createTuio2LTAAdapter();
			}
			@Override
			public Adapter caseTuio2FRM(Tuio2FRM object) {
				return createTuio2FRMAdapter();
			}
			@Override
			public Adapter caseTuio2ALV(Tuio2ALV object) {
				return createTuio2ALVAdapter();
			}
			@Override
			public Adapter caseTuio2BND(Tuio2BND object) {
				return createTuio2BNDAdapter();
			}
			@Override
			public Adapter caseTuioPoint(TuioPoint object) {
				return createTuioPointAdapter();
			}
			@Override
			public Adapter caseTuio2ICG(Tuio2ICG object) {
				return createTuio2ICGAdapter();
			}
			@Override
			public Adapter caseTreeElem(TreeElem object) {
				return createTreeElemAdapter();
			}
			@Override
			public Adapter caseSpansArea(SpansArea object) {
				return createSpansAreaAdapter();
			}
			@Override
			public Adapter caseLink(Link object) {
				return createLinkAdapter();
			}
			@Override
			public Adapter caseLinkTreeElem(LinkTreeElem object) {
				return createLinkTreeElemAdapter();
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
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio2.Tuio2Tok <em>Tuio2 Tok</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2Tok
	 * @generated
	 */
	public Adapter createTuio2TokAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio2.Tuio2Ptr <em>Tuio2 Ptr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2Ptr
	 * @generated
	 */
	public Adapter createTuio2PtrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio2.Tuio2Sym <em>Tuio2 Sym</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2Sym
	 * @generated
	 */
	public Adapter createTuio2SymAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio2.Tuio2T3D <em>Tuio2 T3D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2T3D
	 * @generated
	 */
	public Adapter createTuio2T3DAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio2.Tuio2P3D <em>Tuio2 P3D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2P3D
	 * @generated
	 */
	public Adapter createTuio2P3DAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio2.Tuio2B3D <em>Tuio2 B3D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2B3D
	 * @generated
	 */
	public Adapter createTuio2B3DAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio2.Tuio2CHG <em>Tuio2 CHG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2CHG
	 * @generated
	 */
	public Adapter createTuio2CHGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio2.Tuio2OCG <em>Tuio2 OCG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2OCG
	 * @generated
	 */
	public Adapter createTuio2OCGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio2.Tuio2ICG <em>Tuio2 ICG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2ICG
	 * @generated
	 */
	public Adapter createTuio2ICGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio2.TreeElem <em>Tree Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio2.TreeElem
	 * @generated
	 */
	public Adapter createTreeElemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio2.SpansArea <em>Spans Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio2.SpansArea
	 * @generated
	 */
	public Adapter createSpansAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio2.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio2.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio2.LinkTreeElem <em>Link Tree Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio2.LinkTreeElem
	 * @generated
	 */
	public Adapter createLinkTreeElemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio2.Tuio2SKG <em>Tuio2 SKG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2SKG
	 * @generated
	 */
	public Adapter createTuio2SKGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio2.Tuio2SVG <em>Tuio2 SVG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2SVG
	 * @generated
	 */
	public Adapter createTuio2SVGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio2.Tuio2ARG <em>Tuio2 ARG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2ARG
	 * @generated
	 */
	public Adapter createTuio2ARGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio2.Tuio2RAW <em>Tuio2 RAW</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2RAW
	 * @generated
	 */
	public Adapter createTuio2RAWAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio2.Tuio2CTL <em>Tuio2 CTL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2CTL
	 * @generated
	 */
	public Adapter createTuio2CTLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio2.Tuio2DAT <em>Tuio2 DAT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2DAT
	 * @generated
	 */
	public Adapter createTuio2DATAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio2.Tuio2SIG <em>Tuio2 SIG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2SIG
	 * @generated
	 */
	public Adapter createTuio2SIGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio2.Tuio2ALA <em>Tuio2 ALA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2ALA
	 * @generated
	 */
	public Adapter createTuio2ALAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio2.Tuio2COA <em>Tuio2 COA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2COA
	 * @generated
	 */
	public Adapter createTuio2COAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio2.Tuio2LIA <em>Tuio2 LIA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2LIA
	 * @generated
	 */
	public Adapter createTuio2LIAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio2.Tuio2LLA <em>Tuio2 LLA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2LLA
	 * @generated
	 */
	public Adapter createTuio2LLAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio2.Tuio2LTA <em>Tuio2 LTA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2LTA
	 * @generated
	 */
	public Adapter createTuio2LTAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio2.Tuio2FRM <em>Tuio2 FRM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2FRM
	 * @generated
	 */
	public Adapter createTuio2FRMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio2.Tuio2ALV <em>Tuio2 ALV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2ALV
	 * @generated
	 */
	public Adapter createTuio2ALVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio2.Tuio2BND <em>Tuio2 BND</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio2.Tuio2BND
	 * @generated
	 */
	public Adapter createTuio2BNDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.eztuio2.TuioPoint <em>Tuio Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.eztuio2.TuioPoint
	 * @generated
	 */
	public Adapter createTuioPointAdapter() {
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

} //Eztuio2AdapterFactory
