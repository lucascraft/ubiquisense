/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.impl;

import net.sf.smbt.osc.OscAtom;
import net.sf.smbt.osc.OscData;
import net.sf.smbt.osc.OscFactory;
import net.sf.smbt.osc.OscFraming;
import net.sf.smbt.osc.OscMeta;
import net.sf.smbt.osc.OscPackage;
import net.sf.smbt.osc.OscType;
import net.sf.smbt.osc.OscVersion;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.illposed.osc.OSCMessage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OscFactoryImpl extends EFactoryImpl implements OscFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OscFactory init() {
		try {
			OscFactory theOscFactory = (OscFactory)EPackage.Registry.INSTANCE.getEFactory("http://osc/1.0"); 
			if (theOscFactory != null) {
				return theOscFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OscFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscFactoryImpl() {
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
			case OscPackage.OSC_ATOM: return (EObject)createOscAtom();
			case OscPackage.OSC_META: return (EObject)createOscMeta();
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
			case OscPackage.OSC_TYPE:
				return createOscTypeFromString(eDataType, initialValue);
			case OscPackage.OSC_DATA:
				return createOscDataFromString(eDataType, initialValue);
			case OscPackage.OSC_FRAMING:
				return createOscFramingFromString(eDataType, initialValue);
			case OscPackage.OSC_VERSION:
				return createOscVersionFromString(eDataType, initialValue);
			case OscPackage.OSC_MESSAGE:
				return createOSCMessageFromString(eDataType, initialValue);
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
			case OscPackage.OSC_TYPE:
				return convertOscTypeToString(eDataType, instanceValue);
			case OscPackage.OSC_DATA:
				return convertOscDataToString(eDataType, instanceValue);
			case OscPackage.OSC_FRAMING:
				return convertOscFramingToString(eDataType, instanceValue);
			case OscPackage.OSC_VERSION:
				return convertOscVersionToString(eDataType, instanceValue);
			case OscPackage.OSC_MESSAGE:
				return convertOSCMessageToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscAtom createOscAtom() {
		OscAtomImpl oscAtom = new OscAtomImpl();
		return oscAtom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscMeta createOscMeta() {
		OscMetaImpl oscMeta = new OscMetaImpl();
		return oscMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscType createOscTypeFromString(EDataType eDataType, String initialValue) {
		OscType result = OscType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOscTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscData createOscDataFromString(EDataType eDataType, String initialValue) {
		OscData result = OscData.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOscDataToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscFraming createOscFramingFromString(EDataType eDataType, String initialValue) {
		OscFraming result = OscFraming.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOscFramingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscVersion createOscVersionFromString(EDataType eDataType, String initialValue) {
		OscVersion result = OscVersion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOscVersionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSCMessage createOSCMessageFromString(EDataType eDataType, String initialValue) {
		return (OSCMessage)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOSCMessageToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscPackage getOscPackage() {
		return (OscPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OscPackage getPackage() {
		return OscPackage.eINSTANCE;
	}

} //OscFactoryImpl
