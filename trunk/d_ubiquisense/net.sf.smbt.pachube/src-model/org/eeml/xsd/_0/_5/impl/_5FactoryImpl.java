/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eeml.xsd._0._5.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eeml.xsd._0._5.CurrentValueType;
import org.eeml.xsd._0._5.DataType;
import org.eeml.xsd._0._5.DatapointsType;
import org.eeml.xsd._0._5.DispositionType;
import org.eeml.xsd._0._5.DocumentRoot;
import org.eeml.xsd._0._5.DomainType;
import org.eeml.xsd._0._5.EemlType;
import org.eeml.xsd._0._5.EnvironmentType;
import org.eeml.xsd._0._5.ExposureType;
import org.eeml.xsd._0._5.LocationType;
import org.eeml.xsd._0._5.PrivateType;
import org.eeml.xsd._0._5.StatusType;
import org.eeml.xsd._0._5.TypeType;
import org.eeml.xsd._0._5.UnitType;
import org.eeml.xsd._0._5.ValueType;
import org.eeml.xsd._0._5.VersionType;
import org.eeml.xsd._0._5._5Factory;
import org.eeml.xsd._0._5._5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _5FactoryImpl extends EFactoryImpl implements _5Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static _5Factory init() {
		try {
			_5Factory the_5Factory = (_5Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.eeml.org/xsd/0.5.1"); 
			if (the_5Factory != null) {
				return the_5Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new _5FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _5FactoryImpl() {
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
			case _5Package.CURRENT_VALUE_TYPE: return createCurrentValueType();
			case _5Package.DATAPOINTS_TYPE: return createDatapointsType();
			case _5Package.DATA_TYPE: return createDataType();
			case _5Package.DOCUMENT_ROOT: return createDocumentRoot();
			case _5Package.EEML_TYPE: return createEemlType();
			case _5Package.ENVIRONMENT_TYPE: return createEnvironmentType();
			case _5Package.LOCATION_TYPE: return createLocationType();
			case _5Package.UNIT_TYPE: return createUnitType();
			case _5Package.VALUE_TYPE: return createValueType();
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
			case _5Package.DISPOSITION_TYPE:
				return createDispositionTypeFromString(eDataType, initialValue);
			case _5Package.DOMAIN_TYPE:
				return createDomainTypeFromString(eDataType, initialValue);
			case _5Package.EXPOSURE_TYPE:
				return createExposureTypeFromString(eDataType, initialValue);
			case _5Package.PRIVATE_TYPE:
				return createPrivateTypeFromString(eDataType, initialValue);
			case _5Package.STATUS_TYPE:
				return createStatusTypeFromString(eDataType, initialValue);
			case _5Package.TYPE_TYPE:
				return createTypeTypeFromString(eDataType, initialValue);
			case _5Package.VERSION_TYPE:
				return createVersionTypeFromString(eDataType, initialValue);
			case _5Package.CREATOR_TYPE:
				return createCreatorTypeFromString(eDataType, initialValue);
			case _5Package.DISPOSITION_TYPE_OBJECT:
				return createDispositionTypeObjectFromString(eDataType, initialValue);
			case _5Package.DOMAIN_TYPE_OBJECT:
				return createDomainTypeObjectFromString(eDataType, initialValue);
			case _5Package.EXPOSURE_TYPE_OBJECT:
				return createExposureTypeObjectFromString(eDataType, initialValue);
			case _5Package.LAT_TYPE:
				return createLatTypeFromString(eDataType, initialValue);
			case _5Package.LAT_TYPE_OBJECT:
				return createLatTypeObjectFromString(eDataType, initialValue);
			case _5Package.LON_TYPE:
				return createLonTypeFromString(eDataType, initialValue);
			case _5Package.LON_TYPE_OBJECT:
				return createLonTypeObjectFromString(eDataType, initialValue);
			case _5Package.PRIVATE_TYPE_OBJECT:
				return createPrivateTypeObjectFromString(eDataType, initialValue);
			case _5Package.STATUS_TYPE_OBJECT:
				return createStatusTypeObjectFromString(eDataType, initialValue);
			case _5Package.TYPE_TYPE_OBJECT:
				return createTypeTypeObjectFromString(eDataType, initialValue);
			case _5Package.UPDATED_TYPE:
				return createUpdatedTypeFromString(eDataType, initialValue);
			case _5Package.VERSION_TYPE_OBJECT:
				return createVersionTypeObjectFromString(eDataType, initialValue);
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
			case _5Package.DISPOSITION_TYPE:
				return convertDispositionTypeToString(eDataType, instanceValue);
			case _5Package.DOMAIN_TYPE:
				return convertDomainTypeToString(eDataType, instanceValue);
			case _5Package.EXPOSURE_TYPE:
				return convertExposureTypeToString(eDataType, instanceValue);
			case _5Package.PRIVATE_TYPE:
				return convertPrivateTypeToString(eDataType, instanceValue);
			case _5Package.STATUS_TYPE:
				return convertStatusTypeToString(eDataType, instanceValue);
			case _5Package.TYPE_TYPE:
				return convertTypeTypeToString(eDataType, instanceValue);
			case _5Package.VERSION_TYPE:
				return convertVersionTypeToString(eDataType, instanceValue);
			case _5Package.CREATOR_TYPE:
				return convertCreatorTypeToString(eDataType, instanceValue);
			case _5Package.DISPOSITION_TYPE_OBJECT:
				return convertDispositionTypeObjectToString(eDataType, instanceValue);
			case _5Package.DOMAIN_TYPE_OBJECT:
				return convertDomainTypeObjectToString(eDataType, instanceValue);
			case _5Package.EXPOSURE_TYPE_OBJECT:
				return convertExposureTypeObjectToString(eDataType, instanceValue);
			case _5Package.LAT_TYPE:
				return convertLatTypeToString(eDataType, instanceValue);
			case _5Package.LAT_TYPE_OBJECT:
				return convertLatTypeObjectToString(eDataType, instanceValue);
			case _5Package.LON_TYPE:
				return convertLonTypeToString(eDataType, instanceValue);
			case _5Package.LON_TYPE_OBJECT:
				return convertLonTypeObjectToString(eDataType, instanceValue);
			case _5Package.PRIVATE_TYPE_OBJECT:
				return convertPrivateTypeObjectToString(eDataType, instanceValue);
			case _5Package.STATUS_TYPE_OBJECT:
				return convertStatusTypeObjectToString(eDataType, instanceValue);
			case _5Package.TYPE_TYPE_OBJECT:
				return convertTypeTypeObjectToString(eDataType, instanceValue);
			case _5Package.UPDATED_TYPE:
				return convertUpdatedTypeToString(eDataType, instanceValue);
			case _5Package.VERSION_TYPE_OBJECT:
				return convertVersionTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentValueType createCurrentValueType() {
		CurrentValueTypeImpl currentValueType = new CurrentValueTypeImpl();
		return currentValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatapointsType createDatapointsType() {
		DatapointsTypeImpl datapointsType = new DatapointsTypeImpl();
		return datapointsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EemlType createEemlType() {
		EemlTypeImpl eemlType = new EemlTypeImpl();
		return eemlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentType createEnvironmentType() {
		EnvironmentTypeImpl environmentType = new EnvironmentTypeImpl();
		return environmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType createLocationType() {
		LocationTypeImpl locationType = new LocationTypeImpl();
		return locationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType createUnitType() {
		UnitTypeImpl unitType = new UnitTypeImpl();
		return unitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType createValueType() {
		ValueTypeImpl valueType = new ValueTypeImpl();
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispositionType createDispositionTypeFromString(EDataType eDataType, String initialValue) {
		DispositionType result = DispositionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDispositionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainType createDomainTypeFromString(EDataType eDataType, String initialValue) {
		DomainType result = DomainType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDomainTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExposureType createExposureTypeFromString(EDataType eDataType, String initialValue) {
		ExposureType result = ExposureType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExposureTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivateType createPrivateTypeFromString(EDataType eDataType, String initialValue) {
		PrivateType result = PrivateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrivateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusType createStatusTypeFromString(EDataType eDataType, String initialValue) {
		StatusType result = StatusType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeFromString(EDataType eDataType, String initialValue) {
		TypeType result = TypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionType createVersionTypeFromString(EDataType eDataType, String initialValue) {
		VersionType result = VersionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCreatorTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCreatorTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispositionType createDispositionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDispositionTypeFromString(_5Package.Literals.DISPOSITION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDispositionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDispositionTypeToString(_5Package.Literals.DISPOSITION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainType createDomainTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDomainTypeFromString(_5Package.Literals.DOMAIN_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDomainTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDomainTypeToString(_5Package.Literals.DOMAIN_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExposureType createExposureTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createExposureTypeFromString(_5Package.Literals.EXPOSURE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExposureTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertExposureTypeToString(_5Package.Literals.EXPOSURE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createLatTypeFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLatTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createLatTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLatTypeFromString(_5Package.Literals.LAT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLatTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLatTypeToString(_5Package.Literals.LAT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createLonTypeFromString(EDataType eDataType, String initialValue) {
		return (Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLonTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createLonTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLonTypeFromString(_5Package.Literals.LON_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLonTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLonTypeToString(_5Package.Literals.LON_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivateType createPrivateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPrivateTypeFromString(_5Package.Literals.PRIVATE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrivateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPrivateTypeToString(_5Package.Literals.PRIVATE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusType createStatusTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStatusTypeFromString(_5Package.Literals.STATUS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStatusTypeToString(_5Package.Literals.STATUS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeTypeFromString(_5Package.Literals.TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeTypeToString(_5Package.Literals.TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createUpdatedTypeFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpdatedTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionType createVersionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createVersionTypeFromString(_5Package.Literals.VERSION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVersionTypeToString(_5Package.Literals.VERSION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _5Package get_5Package() {
		return (_5Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static _5Package getPackage() {
		return _5Package.eINSTANCE;
	}

} //_5FactoryImpl
