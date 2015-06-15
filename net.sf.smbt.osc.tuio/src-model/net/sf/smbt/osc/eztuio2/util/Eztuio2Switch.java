/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.eztuio2.util;

import java.util.List;

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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.osc.eztuio2.Eztuio2Package
 * @generated
 */
public class Eztuio2Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Eztuio2Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eztuio2Switch() {
		if (modelPackage == null) {
			modelPackage = Eztuio2Package.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Eztuio2Package.TUIO2_TOK: {
				Tuio2Tok tuio2Tok = (Tuio2Tok)theEObject;
				T result = caseTuio2Tok(tuio2Tok);
				if (result == null) result = caseOscCmd(tuio2Tok);
				if (result == null) result = caseCmd(tuio2Tok);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eztuio2Package.TUIO2_PTR: {
				Tuio2Ptr tuio2Ptr = (Tuio2Ptr)theEObject;
				T result = caseTuio2Ptr(tuio2Ptr);
				if (result == null) result = caseOscCmd(tuio2Ptr);
				if (result == null) result = caseCmd(tuio2Ptr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eztuio2Package.TUIO2_SYM: {
				Tuio2Sym tuio2Sym = (Tuio2Sym)theEObject;
				T result = caseTuio2Sym(tuio2Sym);
				if (result == null) result = caseOscCmd(tuio2Sym);
				if (result == null) result = caseCmd(tuio2Sym);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eztuio2Package.TUIO2_T3D: {
				Tuio2T3D tuio2T3D = (Tuio2T3D)theEObject;
				T result = caseTuio2T3D(tuio2T3D);
				if (result == null) result = caseOscCmd(tuio2T3D);
				if (result == null) result = caseCmd(tuio2T3D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eztuio2Package.TUIO2_P3D: {
				Tuio2P3D tuio2P3D = (Tuio2P3D)theEObject;
				T result = caseTuio2P3D(tuio2P3D);
				if (result == null) result = caseOscCmd(tuio2P3D);
				if (result == null) result = caseCmd(tuio2P3D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eztuio2Package.TUIO2_B3D: {
				Tuio2B3D tuio2B3D = (Tuio2B3D)theEObject;
				T result = caseTuio2B3D(tuio2B3D);
				if (result == null) result = caseOscCmd(tuio2B3D);
				if (result == null) result = caseCmd(tuio2B3D);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eztuio2Package.TUIO2_CHG: {
				Tuio2CHG tuio2CHG = (Tuio2CHG)theEObject;
				T result = caseTuio2CHG(tuio2CHG);
				if (result == null) result = caseOscCmd(tuio2CHG);
				if (result == null) result = caseCmd(tuio2CHG);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eztuio2Package.TUIO2_OCG: {
				Tuio2OCG tuio2OCG = (Tuio2OCG)theEObject;
				T result = caseTuio2OCG(tuio2OCG);
				if (result == null) result = caseOscCmd(tuio2OCG);
				if (result == null) result = caseCmd(tuio2OCG);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eztuio2Package.TUIO2_SKG: {
				Tuio2SKG tuio2SKG = (Tuio2SKG)theEObject;
				T result = caseTuio2SKG(tuio2SKG);
				if (result == null) result = caseOscCmd(tuio2SKG);
				if (result == null) result = caseCmd(tuio2SKG);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eztuio2Package.TUIO2_SVG: {
				Tuio2SVG tuio2SVG = (Tuio2SVG)theEObject;
				T result = caseTuio2SVG(tuio2SVG);
				if (result == null) result = caseOscCmd(tuio2SVG);
				if (result == null) result = caseCmd(tuio2SVG);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eztuio2Package.TUIO2_ARG: {
				Tuio2ARG tuio2ARG = (Tuio2ARG)theEObject;
				T result = caseTuio2ARG(tuio2ARG);
				if (result == null) result = caseOscCmd(tuio2ARG);
				if (result == null) result = caseCmd(tuio2ARG);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eztuio2Package.TUIO2_RAW: {
				Tuio2RAW tuio2RAW = (Tuio2RAW)theEObject;
				T result = caseTuio2RAW(tuio2RAW);
				if (result == null) result = caseOscCmd(tuio2RAW);
				if (result == null) result = caseCmd(tuio2RAW);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eztuio2Package.TUIO2_CTL: {
				Tuio2CTL tuio2CTL = (Tuio2CTL)theEObject;
				T result = caseTuio2CTL(tuio2CTL);
				if (result == null) result = caseOscCmd(tuio2CTL);
				if (result == null) result = caseCmd(tuio2CTL);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eztuio2Package.TUIO2_DAT: {
				Tuio2DAT tuio2DAT = (Tuio2DAT)theEObject;
				T result = caseTuio2DAT(tuio2DAT);
				if (result == null) result = caseOscCmd(tuio2DAT);
				if (result == null) result = caseCmd(tuio2DAT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eztuio2Package.TUIO2_SIG: {
				Tuio2SIG tuio2SIG = (Tuio2SIG)theEObject;
				T result = caseTuio2SIG(tuio2SIG);
				if (result == null) result = caseOscCmd(tuio2SIG);
				if (result == null) result = caseCmd(tuio2SIG);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eztuio2Package.TUIO2_ALA: {
				Tuio2ALA tuio2ALA = (Tuio2ALA)theEObject;
				T result = caseTuio2ALA(tuio2ALA);
				if (result == null) result = caseOscCmd(tuio2ALA);
				if (result == null) result = caseCmd(tuio2ALA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eztuio2Package.TUIO2_COA: {
				Tuio2COA tuio2COA = (Tuio2COA)theEObject;
				T result = caseTuio2COA(tuio2COA);
				if (result == null) result = caseOscCmd(tuio2COA);
				if (result == null) result = caseCmd(tuio2COA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eztuio2Package.TUIO2_LIA: {
				Tuio2LIA tuio2LIA = (Tuio2LIA)theEObject;
				T result = caseTuio2LIA(tuio2LIA);
				if (result == null) result = caseOscCmd(tuio2LIA);
				if (result == null) result = caseCmd(tuio2LIA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eztuio2Package.TUIO2_LLA: {
				Tuio2LLA tuio2LLA = (Tuio2LLA)theEObject;
				T result = caseTuio2LLA(tuio2LLA);
				if (result == null) result = caseOscCmd(tuio2LLA);
				if (result == null) result = caseCmd(tuio2LLA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eztuio2Package.TUIO2_LTA: {
				Tuio2LTA tuio2LTA = (Tuio2LTA)theEObject;
				T result = caseTuio2LTA(tuio2LTA);
				if (result == null) result = caseOscCmd(tuio2LTA);
				if (result == null) result = caseCmd(tuio2LTA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eztuio2Package.TUIO2_FRM: {
				Tuio2FRM tuio2FRM = (Tuio2FRM)theEObject;
				T result = caseTuio2FRM(tuio2FRM);
				if (result == null) result = caseOscCmd(tuio2FRM);
				if (result == null) result = caseCmd(tuio2FRM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eztuio2Package.TUIO2_ALV: {
				Tuio2ALV tuio2ALV = (Tuio2ALV)theEObject;
				T result = caseTuio2ALV(tuio2ALV);
				if (result == null) result = caseOscCmd(tuio2ALV);
				if (result == null) result = caseCmd(tuio2ALV);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eztuio2Package.TUIO2_BND: {
				Tuio2BND tuio2BND = (Tuio2BND)theEObject;
				T result = caseTuio2BND(tuio2BND);
				if (result == null) result = caseOscCmd(tuio2BND);
				if (result == null) result = caseCmd(tuio2BND);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eztuio2Package.TUIO_POINT: {
				TuioPoint tuioPoint = (TuioPoint)theEObject;
				T result = caseTuioPoint(tuioPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eztuio2Package.TUIO2_ICG: {
				Tuio2ICG tuio2ICG = (Tuio2ICG)theEObject;
				T result = caseTuio2ICG(tuio2ICG);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eztuio2Package.TREE_ELEM: {
				TreeElem treeElem = (TreeElem)theEObject;
				T result = caseTreeElem(treeElem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eztuio2Package.SPANS_AREA: {
				SpansArea spansArea = (SpansArea)theEObject;
				T result = caseSpansArea(spansArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eztuio2Package.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Eztuio2Package.LINK_TREE_ELEM: {
				LinkTreeElem linkTreeElem = (LinkTreeElem)theEObject;
				T result = caseLinkTreeElem(linkTreeElem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 Tok</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 Tok</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2Tok(Tuio2Tok object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 Ptr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 Ptr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2Ptr(Tuio2Ptr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 Sym</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 Sym</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2Sym(Tuio2Sym object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 T3D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 T3D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2T3D(Tuio2T3D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 P3D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 P3D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2P3D(Tuio2P3D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 B3D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 B3D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2B3D(Tuio2B3D object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 CHG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 CHG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2CHG(Tuio2CHG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 OCG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 OCG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2OCG(Tuio2OCG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 ICG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 ICG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2ICG(Tuio2ICG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tree Elem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tree Elem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTreeElem(TreeElem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spans Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spans Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpansArea(SpansArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Tree Elem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Tree Elem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkTreeElem(LinkTreeElem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 SKG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 SKG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2SKG(Tuio2SKG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 SVG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 SVG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2SVG(Tuio2SVG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 ARG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 ARG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2ARG(Tuio2ARG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 RAW</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 RAW</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2RAW(Tuio2RAW object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 CTL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 CTL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2CTL(Tuio2CTL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 DAT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 DAT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2DAT(Tuio2DAT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 SIG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 SIG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2SIG(Tuio2SIG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 ALA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 ALA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2ALA(Tuio2ALA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 COA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 COA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2COA(Tuio2COA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 LIA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 LIA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2LIA(Tuio2LIA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 LLA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 LLA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2LLA(Tuio2LLA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 LTA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 LTA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2LTA(Tuio2LTA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 FRM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 FRM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2FRM(Tuio2FRM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 ALV</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 ALV</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2ALV(Tuio2ALV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 BND</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 BND</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2BND(Tuio2BND object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuioPoint(TuioPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmd(Cmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Osc Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Osc Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOscCmd(OscCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //Eztuio2Switch
