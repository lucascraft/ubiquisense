/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eeml.xsd._0._5.util;

import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;
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
import org.eeml.xsd._0._5._5Package;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eeml.xsd._0._5._5Package
 * @generated
 */
public class _5Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final _5Validator INSTANCE = new _5Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eeml.xsd._0._5";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _5Validator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return _5Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case _5Package.CURRENT_VALUE_TYPE:
				return validateCurrentValueType((CurrentValueType)value, diagnostics, context);
			case _5Package.DATAPOINTS_TYPE:
				return validateDatapointsType((DatapointsType)value, diagnostics, context);
			case _5Package.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case _5Package.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case _5Package.EEML_TYPE:
				return validateEemlType((EemlType)value, diagnostics, context);
			case _5Package.ENVIRONMENT_TYPE:
				return validateEnvironmentType((EnvironmentType)value, diagnostics, context);
			case _5Package.LOCATION_TYPE:
				return validateLocationType((LocationType)value, diagnostics, context);
			case _5Package.UNIT_TYPE:
				return validateUnitType((UnitType)value, diagnostics, context);
			case _5Package.VALUE_TYPE:
				return validateValueType((ValueType)value, diagnostics, context);
			case _5Package.DISPOSITION_TYPE:
				return validateDispositionType((DispositionType)value, diagnostics, context);
			case _5Package.DOMAIN_TYPE:
				return validateDomainType((DomainType)value, diagnostics, context);
			case _5Package.EXPOSURE_TYPE:
				return validateExposureType((ExposureType)value, diagnostics, context);
			case _5Package.PRIVATE_TYPE:
				return validatePrivateType((PrivateType)value, diagnostics, context);
			case _5Package.STATUS_TYPE:
				return validateStatusType((StatusType)value, diagnostics, context);
			case _5Package.TYPE_TYPE:
				return validateTypeType((TypeType)value, diagnostics, context);
			case _5Package.VERSION_TYPE:
				return validateVersionType((VersionType)value, diagnostics, context);
			case _5Package.CREATOR_TYPE:
				return validateCreatorType((String)value, diagnostics, context);
			case _5Package.DISPOSITION_TYPE_OBJECT:
				return validateDispositionTypeObject((DispositionType)value, diagnostics, context);
			case _5Package.DOMAIN_TYPE_OBJECT:
				return validateDomainTypeObject((DomainType)value, diagnostics, context);
			case _5Package.EXPOSURE_TYPE_OBJECT:
				return validateExposureTypeObject((ExposureType)value, diagnostics, context);
			case _5Package.LAT_TYPE:
				return validateLatType((Double)value, diagnostics, context);
			case _5Package.LAT_TYPE_OBJECT:
				return validateLatTypeObject((Double)value, diagnostics, context);
			case _5Package.LON_TYPE:
				return validateLonType((Double)value, diagnostics, context);
			case _5Package.LON_TYPE_OBJECT:
				return validateLonTypeObject((Double)value, diagnostics, context);
			case _5Package.PRIVATE_TYPE_OBJECT:
				return validatePrivateTypeObject((PrivateType)value, diagnostics, context);
			case _5Package.STATUS_TYPE_OBJECT:
				return validateStatusTypeObject((StatusType)value, diagnostics, context);
			case _5Package.TYPE_TYPE_OBJECT:
				return validateTypeTypeObject((TypeType)value, diagnostics, context);
			case _5Package.UPDATED_TYPE:
				return validateUpdatedType((XMLGregorianCalendar)value, diagnostics, context);
			case _5Package.VERSION_TYPE_OBJECT:
				return validateVersionTypeObject((VersionType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCurrentValueType(CurrentValueType currentValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(currentValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatapointsType(DatapointsType datapointsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datapointsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEemlType(EemlType eemlType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eemlType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvironmentType(EnvironmentType environmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(environmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationType(LocationType locationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitType(UnitType unitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueType(ValueType valueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDispositionType(DispositionType dispositionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainType(DomainType domainType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExposureType(ExposureType exposureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivateType(PrivateType privateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusType(StatusType statusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType(TypeType typeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionType(VersionType versionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreatorType(String creatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDispositionTypeObject(DispositionType dispositionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainTypeObject(DomainType domainTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExposureTypeObject(ExposureType exposureTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatType(double latType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLatType_Min(latType, diagnostics, context);
		if (result || diagnostics != null) result &= validateLatType_Max(latType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLatType_Min
	 */
	public static final double LAT_TYPE__MIN__VALUE = -90.0;

	/**
	 * Validates the Min constraint of '<em>Lat Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatType_Min(double latType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = latType >= LAT_TYPE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(_5Package.Literals.LAT_TYPE, latType, LAT_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLatType_Max
	 */
	public static final double LAT_TYPE__MAX__VALUE = 90.0;

	/**
	 * Validates the Max constraint of '<em>Lat Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatType_Max(double latType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = latType <= LAT_TYPE__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(_5Package.Literals.LAT_TYPE, latType, LAT_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLatTypeObject(Double latTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLatType_Min(latTypeObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateLatType_Max(latTypeObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLonType(double lonType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLonType_Min(lonType, diagnostics, context);
		if (result || diagnostics != null) result &= validateLonType_Max(lonType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLonType_Min
	 */
	public static final double LON_TYPE__MIN__VALUE = -180.0;

	/**
	 * Validates the Min constraint of '<em>Lon Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLonType_Min(double lonType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = lonType >= LON_TYPE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(_5Package.Literals.LON_TYPE, lonType, LON_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLonType_Max
	 */
	public static final double LON_TYPE__MAX__VALUE = 180.0;

	/**
	 * Validates the Max constraint of '<em>Lon Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLonType_Max(double lonType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = lonType <= LON_TYPE__MAX__VALUE;
		if (!result && diagnostics != null)
			reportMaxViolation(_5Package.Literals.LON_TYPE, lonType, LON_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLonTypeObject(Double lonTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLonType_Min(lonTypeObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateLonType_Max(lonTypeObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrivateTypeObject(PrivateType privateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusTypeObject(StatusType statusTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject(TypeType typeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdatedType(XMLGregorianCalendar updatedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionTypeObject(VersionType versionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //_5Validator
