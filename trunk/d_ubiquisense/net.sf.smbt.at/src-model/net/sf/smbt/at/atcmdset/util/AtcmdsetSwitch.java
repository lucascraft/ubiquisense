/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.at.atcmdset.util;

import net.sf.smbt.at.atcmdset.*;
import net.sf.smbt.at.atcmdset.ATBD;
import net.sf.smbt.at.atcmdset.ATCN;
import net.sf.smbt.at.atcmdset.ATCmd;
import net.sf.smbt.at.atcmdset.ATDL;
import net.sf.smbt.at.atcmdset.ATID;
import net.sf.smbt.at.atcmdset.ATMY;
import net.sf.smbt.at.atcmdset.ATPlusPlusPlus;
import net.sf.smbt.at.atcmdset.ATRetCmd;
import net.sf.smbt.at.atcmdset.ATWR;
import net.sf.smbt.at.atcmdset.AtcmdsetPackage;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

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
 * @see net.sf.smbt.at.atcmdset.AtcmdsetPackage
 * @generated
 */
public class AtcmdsetSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AtcmdsetPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtcmdsetSwitch() {
		if (modelPackage == null) {
			modelPackage = AtcmdsetPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AtcmdsetPackage.AT_CMD: {
				ATCmd atCmd = (ATCmd)theEObject;
				T result = caseATCmd(atCmd);
				if (result == null) result = caseCmd(atCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtcmdsetPackage.AT_RET_CMD: {
				ATRetCmd atRetCmd = (ATRetCmd)theEObject;
				T result = caseATRetCmd(atRetCmd);
				if (result == null) result = caseCmd(atRetCmd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtcmdsetPackage.AT_PLUS_PLUS_PLUS: {
				ATPlusPlusPlus atPlusPlusPlus = (ATPlusPlusPlus)theEObject;
				T result = caseATPlusPlusPlus(atPlusPlusPlus);
				if (result == null) result = caseATCmd(atPlusPlusPlus);
				if (result == null) result = caseCmd(atPlusPlusPlus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtcmdsetPackage.ATBD: {
				ATBD atbd = (ATBD)theEObject;
				T result = caseATBD(atbd);
				if (result == null) result = caseATCmd(atbd);
				if (result == null) result = caseCmd(atbd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtcmdsetPackage.ATWR: {
				ATWR atwr = (ATWR)theEObject;
				T result = caseATWR(atwr);
				if (result == null) result = caseATCmd(atwr);
				if (result == null) result = caseCmd(atwr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtcmdsetPackage.ATCN: {
				ATCN atcn = (ATCN)theEObject;
				T result = caseATCN(atcn);
				if (result == null) result = caseATCmd(atcn);
				if (result == null) result = caseCmd(atcn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtcmdsetPackage.ATID: {
				ATID atid = (ATID)theEObject;
				T result = caseATID(atid);
				if (result == null) result = caseATCmd(atid);
				if (result == null) result = caseCmd(atid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtcmdsetPackage.ATMY: {
				ATMY atmy = (ATMY)theEObject;
				T result = caseATMY(atmy);
				if (result == null) result = caseATCmd(atmy);
				if (result == null) result = caseCmd(atmy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AtcmdsetPackage.ATDL: {
				ATDL atdl = (ATDL)theEObject;
				T result = caseATDL(atdl);
				if (result == null) result = caseATCmd(atdl);
				if (result == null) result = caseCmd(atdl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AT Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AT Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATCmd(ATCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AT Ret Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AT Ret Cmd</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATRetCmd(ATRetCmd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AT Plus Plus Plus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AT Plus Plus Plus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATPlusPlusPlus(ATPlusPlusPlus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATBD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATBD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATBD(ATBD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATWR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATWR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATWR(ATWR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATCN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATCN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATCN(ATCN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATID(ATID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATMY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATMY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATMY(ATMY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATDL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATDL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATDL(ATDL object) {
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
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AtcmdsetSwitch
