/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezpachube.impl;

import net.sf.smbt.ezpachube.CosmCmd;
import net.sf.smbt.ezpachube.DatastreamAction;
import net.sf.smbt.ezpachube.EzpachubeFactory;
import net.sf.smbt.ezpachube.EzpachubePackage;
import net.sf.smbt.ezpachube.FeedAction;
import net.sf.smbt.ezpachube.FeedKind;
import net.sf.smbt.ezpachube.IntervalKind;
import net.sf.smbt.ezpachube.PACHUBE_ACCESS;
import net.sf.smbt.ezpachube.PACHUBE_HTTP_STATUS;
import net.sf.smbt.ezpachube.Version;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class EzpachubeFactoryImpl extends EFactoryImpl implements EzpachubeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EzpachubeFactory init() {
		try {
			EzpachubeFactory theEzpachubeFactory = (EzpachubeFactory)EPackage.Registry.INSTANCE.getEFactory("http://ezpachube/1.0"); 
			if (theEzpachubeFactory != null) {
				return theEzpachubeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EzpachubeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzpachubeFactoryImpl() {
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
			case EzpachubePackage.COSM_CMD: return createCosmCmd();
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
			case EzpachubePackage.PACHUBE_ACCESS:
				return createPACHUBE_ACCESSFromString(eDataType, initialValue);
			case EzpachubePackage.PACHUBE_HTTP_STATUS:
				return createPACHUBE_HTTP_STATUSFromString(eDataType, initialValue);
			case EzpachubePackage.INTERVAL_KIND:
				return createIntervalKindFromString(eDataType, initialValue);
			case EzpachubePackage.FEED_KIND:
				return createFeedKindFromString(eDataType, initialValue);
			case EzpachubePackage.VERSION:
				return createVersionFromString(eDataType, initialValue);
			case EzpachubePackage.FEED_ACTION:
				return createFeedActionFromString(eDataType, initialValue);
			case EzpachubePackage.DATASTREAM_ACTION:
				return createDatastreamActionFromString(eDataType, initialValue);
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
			case EzpachubePackage.PACHUBE_ACCESS:
				return convertPACHUBE_ACCESSToString(eDataType, instanceValue);
			case EzpachubePackage.PACHUBE_HTTP_STATUS:
				return convertPACHUBE_HTTP_STATUSToString(eDataType, instanceValue);
			case EzpachubePackage.INTERVAL_KIND:
				return convertIntervalKindToString(eDataType, instanceValue);
			case EzpachubePackage.FEED_KIND:
				return convertFeedKindToString(eDataType, instanceValue);
			case EzpachubePackage.VERSION:
				return convertVersionToString(eDataType, instanceValue);
			case EzpachubePackage.FEED_ACTION:
				return convertFeedActionToString(eDataType, instanceValue);
			case EzpachubePackage.DATASTREAM_ACTION:
				return convertDatastreamActionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CosmCmd createCosmCmd() {
		CosmCmdImpl cosmCmd = new CosmCmdImpl();
		return cosmCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PACHUBE_ACCESS createPACHUBE_ACCESSFromString(EDataType eDataType, String initialValue) {
		PACHUBE_ACCESS result = PACHUBE_ACCESS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPACHUBE_ACCESSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PACHUBE_HTTP_STATUS createPACHUBE_HTTP_STATUSFromString(EDataType eDataType, String initialValue) {
		PACHUBE_HTTP_STATUS result = PACHUBE_HTTP_STATUS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPACHUBE_HTTP_STATUSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntervalKind createIntervalKindFromString(EDataType eDataType, String initialValue) {
		IntervalKind result = IntervalKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntervalKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedKind createFeedKindFromString(EDataType eDataType, String initialValue) {
		FeedKind result = FeedKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFeedKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version createVersionFromString(EDataType eDataType, String initialValue) {
		Version result = Version.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedAction createFeedActionFromString(EDataType eDataType, String initialValue) {
		FeedAction result = FeedAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFeedActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatastreamAction createDatastreamActionFromString(EDataType eDataType, String initialValue) {
		DatastreamAction result = DatastreamAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatastreamActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzpachubePackage getEzpachubePackage() {
		return (EzpachubePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EzpachubePackage getPackage() {
		return EzpachubePackage.eINSTANCE;
	}

} //EzpachubeFactoryImpl
