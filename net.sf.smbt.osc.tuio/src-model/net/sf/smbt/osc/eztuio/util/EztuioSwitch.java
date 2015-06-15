/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.eztuio.util;

import java.util.List;

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
 * @see net.sf.smbt.osc.eztuio.EztuioPackage
 * @generated
 */
public class EztuioSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EztuioPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EztuioSwitch() {
		if (modelPackage == null) {
			modelPackage = EztuioPackage.eINSTANCE;
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
			case EztuioPackage.TUIO2_DOBJ: {
				Tuio2DObj tuio2DObj = (Tuio2DObj)theEObject;
				T result = caseTuio2DObj(tuio2DObj);
				if (result == null) result = caseOscRcvCmd(tuio2DObj);
				if (result == null) result = caseOscCmd(tuio2DObj);
				if (result == null) result = caseCmd(tuio2DObj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EztuioPackage.TUIO2_DCUR: {
				Tuio2DCur tuio2DCur = (Tuio2DCur)theEObject;
				T result = caseTuio2DCur(tuio2DCur);
				if (result == null) result = caseOscRcvCmd(tuio2DCur);
				if (result == null) result = caseOscCmd(tuio2DCur);
				if (result == null) result = caseCmd(tuio2DCur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EztuioPackage.TUIO3_DOBJ: {
				Tuio3DObj tuio3DObj = (Tuio3DObj)theEObject;
				T result = caseTuio3DObj(tuio3DObj);
				if (result == null) result = caseOscRcvCmd(tuio3DObj);
				if (result == null) result = caseOscCmd(tuio3DObj);
				if (result == null) result = caseCmd(tuio3DObj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EztuioPackage.TUIO3_DCUR: {
				Tuio3DCur tuio3DCur = (Tuio3DCur)theEObject;
				T result = caseTuio3DCur(tuio3DCur);
				if (result == null) result = caseOscRcvCmd(tuio3DCur);
				if (result == null) result = caseOscCmd(tuio3DCur);
				if (result == null) result = caseCmd(tuio3DCur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EztuioPackage.TUIO25_OBJ: {
				Tuio25Obj tuio25Obj = (Tuio25Obj)theEObject;
				T result = caseTuio25Obj(tuio25Obj);
				if (result == null) result = caseOscRcvCmd(tuio25Obj);
				if (result == null) result = caseOscCmd(tuio25Obj);
				if (result == null) result = caseCmd(tuio25Obj);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EztuioPackage.TUIO25_CUR: {
				Tuio25Cur tuio25Cur = (Tuio25Cur)theEObject;
				T result = caseTuio25Cur(tuio25Cur);
				if (result == null) result = caseOscRcvCmd(tuio25Cur);
				if (result == null) result = caseOscCmd(tuio25Cur);
				if (result == null) result = caseCmd(tuio25Cur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EztuioPackage.TUIO2_DBLOB: {
				Tuio2DBlob tuio2DBlob = (Tuio2DBlob)theEObject;
				T result = caseTuio2DBlob(tuio2DBlob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EztuioPackage.TUIO3_DBLOB: {
				Tuio3DBlob tuio3DBlob = (Tuio3DBlob)theEObject;
				T result = caseTuio3DBlob(tuio3DBlob);
				if (result == null) result = caseOscRcvCmd(tuio3DBlob);
				if (result == null) result = caseOscCmd(tuio3DBlob);
				if (result == null) result = caseCmd(tuio3DBlob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EztuioPackage.TUIO25_BLOB: {
				Tuio25Blob tuio25Blob = (Tuio25Blob)theEObject;
				T result = caseTuio25Blob(tuio25Blob);
				if (result == null) result = caseOscRcvCmd(tuio25Blob);
				if (result == null) result = caseOscCmd(tuio25Blob);
				if (result == null) result = caseCmd(tuio25Blob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EztuioPackage.TUIO2_DOBJ_ADD: {
				Tuio2DObjAdd tuio2DObjAdd = (Tuio2DObjAdd)theEObject;
				T result = caseTuio2DObjAdd(tuio2DObjAdd);
				if (result == null) result = caseTuio2DObj(tuio2DObjAdd);
				if (result == null) result = caseOscRcvCmd(tuio2DObjAdd);
				if (result == null) result = caseOscCmd(tuio2DObjAdd);
				if (result == null) result = caseCmd(tuio2DObjAdd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EztuioPackage.TUIO2_DOBJ_UPDATE: {
				Tuio2DObjUpdate tuio2DObjUpdate = (Tuio2DObjUpdate)theEObject;
				T result = caseTuio2DObjUpdate(tuio2DObjUpdate);
				if (result == null) result = caseTuio2DObj(tuio2DObjUpdate);
				if (result == null) result = caseOscRcvCmd(tuio2DObjUpdate);
				if (result == null) result = caseOscCmd(tuio2DObjUpdate);
				if (result == null) result = caseCmd(tuio2DObjUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EztuioPackage.TUIO2_DOBJ_REMOVE: {
				Tuio2DObjRemove tuio2DObjRemove = (Tuio2DObjRemove)theEObject;
				T result = caseTuio2DObjRemove(tuio2DObjRemove);
				if (result == null) result = caseTuio2DObj(tuio2DObjRemove);
				if (result == null) result = caseOscRcvCmd(tuio2DObjRemove);
				if (result == null) result = caseOscCmd(tuio2DObjRemove);
				if (result == null) result = caseCmd(tuio2DObjRemove);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EztuioPackage.TUIO2_DCUR_ADD: {
				Tuio2DCurAdd tuio2DCurAdd = (Tuio2DCurAdd)theEObject;
				T result = caseTuio2DCurAdd(tuio2DCurAdd);
				if (result == null) result = caseTuio2DCur(tuio2DCurAdd);
				if (result == null) result = caseOscRcvCmd(tuio2DCurAdd);
				if (result == null) result = caseOscCmd(tuio2DCurAdd);
				if (result == null) result = caseCmd(tuio2DCurAdd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EztuioPackage.TUIO2_DCUR_UPDATE: {
				Tuio2DCurUpdate tuio2DCurUpdate = (Tuio2DCurUpdate)theEObject;
				T result = caseTuio2DCurUpdate(tuio2DCurUpdate);
				if (result == null) result = caseTuio2DCur(tuio2DCurUpdate);
				if (result == null) result = caseOscRcvCmd(tuio2DCurUpdate);
				if (result == null) result = caseOscCmd(tuio2DCurUpdate);
				if (result == null) result = caseCmd(tuio2DCurUpdate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EztuioPackage.TUIO2_DCUR_REMOVE: {
				Tuio2DCurRemove tuio2DCurRemove = (Tuio2DCurRemove)theEObject;
				T result = caseTuio2DCurRemove(tuio2DCurRemove);
				if (result == null) result = caseTuio2DCur(tuio2DCurRemove);
				if (result == null) result = caseOscRcvCmd(tuio2DCurRemove);
				if (result == null) result = caseOscCmd(tuio2DCurRemove);
				if (result == null) result = caseCmd(tuio2DCurRemove);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EztuioPackage.TUIO_BUNDLE: {
				TuioBundle tuioBundle = (TuioBundle)theEObject;
				T result = caseTuioBundle(tuioBundle);
				if (result == null) result = caseCompoundCmd(tuioBundle);
				if (result == null) result = caseCmd(tuioBundle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 DObj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 DObj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2DObj(Tuio2DObj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 DCur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 DCur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2DCur(Tuio2DCur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio3 DObj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio3 DObj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio3DObj(Tuio3DObj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio3 DCur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio3 DCur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio3DCur(Tuio3DCur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio25 Obj</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio25 Obj</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio25Obj(Tuio25Obj object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio25 Cur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio25 Cur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio25Cur(Tuio25Cur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 DBlob</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 DBlob</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2DBlob(Tuio2DBlob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio3 DBlob</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio3 DBlob</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio3DBlob(Tuio3DBlob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio25 Blob</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio25 Blob</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio25Blob(Tuio25Blob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 DObj Add</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 DObj Add</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2DObjAdd(Tuio2DObjAdd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 DObj Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 DObj Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2DObjUpdate(Tuio2DObjUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 DObj Remove</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 DObj Remove</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2DObjRemove(Tuio2DObjRemove object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 DCur Add</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 DCur Add</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2DCurAdd(Tuio2DCurAdd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 DCur Update</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 DCur Update</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2DCurUpdate(Tuio2DCurUpdate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio2 DCur Remove</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio2 DCur Remove</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuio2DCurRemove(Tuio2DCurRemove object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tuio Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tuio Bundle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTuioBundle(TuioBundle object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Osc Rcv Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Osc Rcv Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOscRcvCmd(OscRcvCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundCmd(CompoundCmd object) {
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

} //EztuioSwitch
