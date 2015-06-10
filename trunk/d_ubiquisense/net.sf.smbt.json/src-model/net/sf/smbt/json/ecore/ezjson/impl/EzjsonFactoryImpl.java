/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.json.ecore.ezjson.impl;

import net.sf.smbt.json.ecore.ezjson.*;

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
public class EzjsonFactoryImpl extends EFactoryImpl implements EzjsonFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EzjsonFactory init() {
		try {
			EzjsonFactory theEzjsonFactory = (EzjsonFactory)EPackage.Registry.INSTANCE.getEFactory("http://ubiquisense.com/ezjson/1.0"); 
			if (theEzjsonFactory != null) {
				return theEzjsonFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EzjsonFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzjsonFactoryImpl() {
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
			case EzjsonPackage.JSON_CMD: return createJsonCmd();
			case EzjsonPackage.IN_JSON_CMD: return createInJSonCmd();
			case EzjsonPackage.OUT_JSON_CMD: return createOutJsonCmd();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonCmd createJsonCmd() {
		JsonCmdImpl jsonCmd = new JsonCmdImpl();
		return jsonCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InJSonCmd createInJSonCmd() {
		InJSonCmdImpl inJSonCmd = new InJSonCmdImpl();
		return inJSonCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutJsonCmd createOutJsonCmd() {
		OutJsonCmdImpl outJsonCmd = new OutJsonCmdImpl();
		return outJsonCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzjsonPackage getEzjsonPackage() {
		return (EzjsonPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EzjsonPackage getPackage() {
		return EzjsonPackage.eINSTANCE;
	}

} //EzjsonFactoryImpl
