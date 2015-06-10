/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsniff.util;

import java.util.List;

import net.sf.smbt.ezsniff.AbstractEZSniffElem;
import net.sf.smbt.ezsniff.EZSniffHit;
import net.sf.smbt.ezsniff.EZSniffProtocolGroup;
import net.sf.smbt.ezsniff.EZSniffer;
import net.sf.smbt.ezsniff.EZSnifferManager;
import net.sf.smbt.ezsniff.EzsniffPackage;

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
 * @see net.sf.smbt.ezsniff.EzsniffPackage
 * @generated
 */
public class EzsniffSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzsniffPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzsniffSwitch() {
		if (modelPackage == null) {
			modelPackage = EzsniffPackage.eINSTANCE;
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
			case EzsniffPackage.EZ_SNIFFER: {
				EZSniffer ezSniffer = (EZSniffer)theEObject;
				T result = caseEZSniffer(ezSniffer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsniffPackage.EZ_SNIFF_PROTOCOL_GROUP: {
				EZSniffProtocolGroup ezSniffProtocolGroup = (EZSniffProtocolGroup)theEObject;
				T result = caseEZSniffProtocolGroup(ezSniffProtocolGroup);
				if (result == null) result = caseAbstractEZSniffElem(ezSniffProtocolGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsniffPackage.ABSTRACT_EZ_SNIFF_ELEM: {
				AbstractEZSniffElem abstractEZSniffElem = (AbstractEZSniffElem)theEObject;
				T result = caseAbstractEZSniffElem(abstractEZSniffElem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsniffPackage.EZ_SNIFF_HIT: {
				EZSniffHit ezSniffHit = (EZSniffHit)theEObject;
				T result = caseEZSniffHit(ezSniffHit);
				if (result == null) result = caseAbstractEZSniffElem(ezSniffHit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzsniffPackage.EZ_SNIFFER_MANAGER: {
				EZSnifferManager ezSnifferManager = (EZSnifferManager)theEObject;
				T result = caseEZSnifferManager(ezSnifferManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EZ Sniffer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EZ Sniffer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEZSniffer(EZSniffer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EZ Sniff Protocol Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EZ Sniff Protocol Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEZSniffProtocolGroup(EZSniffProtocolGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract EZ Sniff Elem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract EZ Sniff Elem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractEZSniffElem(AbstractEZSniffElem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EZ Sniff Hit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EZ Sniff Hit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEZSniffHit(EZSniffHit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EZ Sniffer Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EZ Sniffer Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEZSnifferManager(EZSnifferManager object) {
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

} //EzsniffSwitch
