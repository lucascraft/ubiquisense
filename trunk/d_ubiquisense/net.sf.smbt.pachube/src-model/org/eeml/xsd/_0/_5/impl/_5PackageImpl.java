/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eeml.xsd._0._5.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
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
import org.eeml.xsd._0._5.util._5Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _5PackageImpl extends EPackageImpl implements _5Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datapointsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eemlTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dispositionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum domainTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exposureTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum privateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum versionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType creatorTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dispositionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType domainTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType exposureTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType latTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType latTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lonTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lonTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType privateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType statusTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType updatedTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eeml.xsd._0._5._5Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private _5PackageImpl() {
		super(eNS_URI, _5Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link _5Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static _5Package init() {
		if (isInited) return (_5Package)EPackage.Registry.INSTANCE.getEPackage(_5Package.eNS_URI);

		// Obtain or create and register package
		_5PackageImpl the_5Package = (_5PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof _5PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new _5PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		the_5Package.createPackageContents();

		// Initialize created meta-data
		the_5Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(the_5Package, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return _5Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		the_5Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(_5Package.eNS_URI, the_5Package);
		return the_5Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurrentValueType() {
		return currentValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrentValueType_Value() {
		return (EAttribute)currentValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCurrentValueType_At() {
		return (EAttribute)currentValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatapointsType() {
		return datapointsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatapointsType_Value() {
		return (EReference)datapointsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Tag() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_CurrentValue() {
		return (EReference)dataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_MaxValue() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_MinValue() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_Datapoints() {
		return (EReference)dataTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_Unit() {
		return (EReference)dataTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Id() {
		return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Eeml() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEemlType() {
		return eemlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEemlType_Environment() {
		return (EReference)eemlTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEemlType_Version() {
		return (EAttribute)eemlTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironmentType() {
		return environmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironmentType_Title() {
		return (EAttribute)environmentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironmentType_Feed() {
		return (EAttribute)environmentTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironmentType_Status() {
		return (EAttribute)environmentTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironmentType_Private() {
		return (EAttribute)environmentTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironmentType_Description() {
		return (EAttribute)environmentTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironmentType_Icon() {
		return (EAttribute)environmentTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironmentType_Website() {
		return (EAttribute)environmentTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironmentType_Email() {
		return (EAttribute)environmentTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironmentType_Tag() {
		return (EAttribute)environmentTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironmentType_Location() {
		return (EReference)environmentTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironmentType_Data() {
		return (EReference)environmentTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironmentType_Creator() {
		return (EAttribute)environmentTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironmentType_Id() {
		return (EAttribute)environmentTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironmentType_Updated() {
		return (EAttribute)environmentTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationType() {
		return locationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationType_Name() {
		return (EAttribute)locationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationType_Lat() {
		return (EAttribute)locationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationType_Lon() {
		return (EAttribute)locationTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationType_Ele() {
		return (EAttribute)locationTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationType_Disposition() {
		return (EAttribute)locationTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationType_Domain() {
		return (EAttribute)locationTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationType_Exposure() {
		return (EAttribute)locationTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitType() {
		return unitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitType_Value() {
		return (EAttribute)unitTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitType_Symbol() {
		return (EAttribute)unitTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitType_Type() {
		return (EAttribute)unitTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueType() {
		return valueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType_Value() {
		return (EAttribute)valueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType_At() {
		return (EAttribute)valueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDispositionType() {
		return dispositionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDomainType() {
		return domainTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExposureType() {
		return exposureTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrivateType() {
		return privateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatusType() {
		return statusTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeType() {
		return typeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVersionType() {
		return versionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCreatorType() {
		return creatorTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDispositionTypeObject() {
		return dispositionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDomainTypeObject() {
		return domainTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExposureTypeObject() {
		return exposureTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLatType() {
		return latTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLatTypeObject() {
		return latTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLonType() {
		return lonTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLonTypeObject() {
		return lonTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPrivateTypeObject() {
		return privateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStatusTypeObject() {
		return statusTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeTypeObject() {
		return typeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUpdatedType() {
		return updatedTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVersionTypeObject() {
		return versionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _5Factory get_5Factory() {
		return (_5Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		currentValueTypeEClass = createEClass(CURRENT_VALUE_TYPE);
		createEAttribute(currentValueTypeEClass, CURRENT_VALUE_TYPE__VALUE);
		createEAttribute(currentValueTypeEClass, CURRENT_VALUE_TYPE__AT);

		datapointsTypeEClass = createEClass(DATAPOINTS_TYPE);
		createEReference(datapointsTypeEClass, DATAPOINTS_TYPE__VALUE);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEAttribute(dataTypeEClass, DATA_TYPE__TAG);
		createEReference(dataTypeEClass, DATA_TYPE__CURRENT_VALUE);
		createEAttribute(dataTypeEClass, DATA_TYPE__MAX_VALUE);
		createEAttribute(dataTypeEClass, DATA_TYPE__MIN_VALUE);
		createEReference(dataTypeEClass, DATA_TYPE__DATAPOINTS);
		createEReference(dataTypeEClass, DATA_TYPE__UNIT);
		createEAttribute(dataTypeEClass, DATA_TYPE__ID);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EEML);

		eemlTypeEClass = createEClass(EEML_TYPE);
		createEReference(eemlTypeEClass, EEML_TYPE__ENVIRONMENT);
		createEAttribute(eemlTypeEClass, EEML_TYPE__VERSION);

		environmentTypeEClass = createEClass(ENVIRONMENT_TYPE);
		createEAttribute(environmentTypeEClass, ENVIRONMENT_TYPE__TITLE);
		createEAttribute(environmentTypeEClass, ENVIRONMENT_TYPE__FEED);
		createEAttribute(environmentTypeEClass, ENVIRONMENT_TYPE__STATUS);
		createEAttribute(environmentTypeEClass, ENVIRONMENT_TYPE__PRIVATE);
		createEAttribute(environmentTypeEClass, ENVIRONMENT_TYPE__DESCRIPTION);
		createEAttribute(environmentTypeEClass, ENVIRONMENT_TYPE__ICON);
		createEAttribute(environmentTypeEClass, ENVIRONMENT_TYPE__WEBSITE);
		createEAttribute(environmentTypeEClass, ENVIRONMENT_TYPE__EMAIL);
		createEAttribute(environmentTypeEClass, ENVIRONMENT_TYPE__TAG);
		createEReference(environmentTypeEClass, ENVIRONMENT_TYPE__LOCATION);
		createEReference(environmentTypeEClass, ENVIRONMENT_TYPE__DATA);
		createEAttribute(environmentTypeEClass, ENVIRONMENT_TYPE__CREATOR);
		createEAttribute(environmentTypeEClass, ENVIRONMENT_TYPE__ID);
		createEAttribute(environmentTypeEClass, ENVIRONMENT_TYPE__UPDATED);

		locationTypeEClass = createEClass(LOCATION_TYPE);
		createEAttribute(locationTypeEClass, LOCATION_TYPE__NAME);
		createEAttribute(locationTypeEClass, LOCATION_TYPE__LAT);
		createEAttribute(locationTypeEClass, LOCATION_TYPE__LON);
		createEAttribute(locationTypeEClass, LOCATION_TYPE__ELE);
		createEAttribute(locationTypeEClass, LOCATION_TYPE__DISPOSITION);
		createEAttribute(locationTypeEClass, LOCATION_TYPE__DOMAIN);
		createEAttribute(locationTypeEClass, LOCATION_TYPE__EXPOSURE);

		unitTypeEClass = createEClass(UNIT_TYPE);
		createEAttribute(unitTypeEClass, UNIT_TYPE__VALUE);
		createEAttribute(unitTypeEClass, UNIT_TYPE__SYMBOL);
		createEAttribute(unitTypeEClass, UNIT_TYPE__TYPE);

		valueTypeEClass = createEClass(VALUE_TYPE);
		createEAttribute(valueTypeEClass, VALUE_TYPE__VALUE);
		createEAttribute(valueTypeEClass, VALUE_TYPE__AT);

		// Create enums
		dispositionTypeEEnum = createEEnum(DISPOSITION_TYPE);
		domainTypeEEnum = createEEnum(DOMAIN_TYPE);
		exposureTypeEEnum = createEEnum(EXPOSURE_TYPE);
		privateTypeEEnum = createEEnum(PRIVATE_TYPE);
		statusTypeEEnum = createEEnum(STATUS_TYPE);
		typeTypeEEnum = createEEnum(TYPE_TYPE);
		versionTypeEEnum = createEEnum(VERSION_TYPE);

		// Create data types
		creatorTypeEDataType = createEDataType(CREATOR_TYPE);
		dispositionTypeObjectEDataType = createEDataType(DISPOSITION_TYPE_OBJECT);
		domainTypeObjectEDataType = createEDataType(DOMAIN_TYPE_OBJECT);
		exposureTypeObjectEDataType = createEDataType(EXPOSURE_TYPE_OBJECT);
		latTypeEDataType = createEDataType(LAT_TYPE);
		latTypeObjectEDataType = createEDataType(LAT_TYPE_OBJECT);
		lonTypeEDataType = createEDataType(LON_TYPE);
		lonTypeObjectEDataType = createEDataType(LON_TYPE_OBJECT);
		privateTypeObjectEDataType = createEDataType(PRIVATE_TYPE_OBJECT);
		statusTypeObjectEDataType = createEDataType(STATUS_TYPE_OBJECT);
		typeTypeObjectEDataType = createEDataType(TYPE_TYPE_OBJECT);
		updatedTypeEDataType = createEDataType(UPDATED_TYPE);
		versionTypeObjectEDataType = createEDataType(VERSION_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(currentValueTypeEClass, CurrentValueType.class, "CurrentValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCurrentValueType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, CurrentValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCurrentValueType_At(), theXMLTypePackage.getDateTime(), "at", null, 0, 1, CurrentValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datapointsTypeEClass, DatapointsType.class, "DatapointsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatapointsType_Value(), this.getValueType(), null, "value", null, 0, -1, DatapointsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataType_Tag(), theXMLTypePackage.getString(), "tag", null, 0, -1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataType_CurrentValue(), this.getCurrentValueType(), null, "currentValue", null, 1, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_MaxValue(), theXMLTypePackage.getString(), "maxValue", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_MinValue(), theXMLTypePackage.getString(), "minValue", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataType_Datapoints(), this.getDatapointsType(), null, "datapoints", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataType_Unit(), this.getUnitType(), null, "unit", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataType_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Eeml(), this.getEemlType(), null, "eeml", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(eemlTypeEClass, EemlType.class, "EemlType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEemlType_Environment(), this.getEnvironmentType(), null, "environment", null, 0, -1, EemlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEemlType_Version(), this.getVersionType(), "version", null, 0, 1, EemlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(environmentTypeEClass, EnvironmentType.class, "EnvironmentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvironmentType_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, EnvironmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentType_Feed(), theXMLTypePackage.getAnyURI(), "feed", null, 0, 1, EnvironmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentType_Status(), this.getStatusType(), "status", null, 0, 1, EnvironmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentType_Private(), this.getPrivateType(), "private", null, 0, 1, EnvironmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentType_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, EnvironmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentType_Icon(), theXMLTypePackage.getAnyURI(), "icon", null, 0, 1, EnvironmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentType_Website(), theXMLTypePackage.getAnyURI(), "website", null, 0, 1, EnvironmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentType_Email(), theXMLTypePackage.getString(), "email", null, 0, 1, EnvironmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentType_Tag(), theXMLTypePackage.getString(), "tag", null, 0, -1, EnvironmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnvironmentType_Location(), this.getLocationType(), null, "location", null, 0, 1, EnvironmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnvironmentType_Data(), this.getDataType(), null, "data", null, 1, -1, EnvironmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentType_Creator(), this.getCreatorType(), "creator", null, 0, 1, EnvironmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentType_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, EnvironmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvironmentType_Updated(), this.getUpdatedType(), "updated", null, 0, 1, EnvironmentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationTypeEClass, LocationType.class, "LocationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocationType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, LocationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationType_Lat(), this.getLatType(), "lat", null, 1, 1, LocationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationType_Lon(), this.getLonType(), "lon", null, 1, 1, LocationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationType_Ele(), theXMLTypePackage.getDouble(), "ele", null, 0, 1, LocationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationType_Disposition(), this.getDispositionType(), "disposition", null, 0, 1, LocationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationType_Domain(), this.getDomainType(), "domain", null, 1, 1, LocationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationType_Exposure(), this.getExposureType(), "exposure", null, 0, 1, LocationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitTypeEClass, UnitType.class, "UnitType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnitType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, UnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitType_Symbol(), theXMLTypePackage.getString(), "symbol", null, 0, 1, UnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnitType_Type(), this.getTypeType(), "type", null, 0, 1, UnitType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueTypeEClass, ValueType.class, "ValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, ValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueType_At(), theXMLTypePackage.getDateTime(), "at", null, 0, 1, ValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dispositionTypeEEnum, DispositionType.class, "DispositionType");
		addEEnumLiteral(dispositionTypeEEnum, DispositionType.FIXED);
		addEEnumLiteral(dispositionTypeEEnum, DispositionType.MOBILE);

		initEEnum(domainTypeEEnum, DomainType.class, "DomainType");
		addEEnumLiteral(domainTypeEEnum, DomainType.PHYSICAL);
		addEEnumLiteral(domainTypeEEnum, DomainType.VIRTUAL);

		initEEnum(exposureTypeEEnum, ExposureType.class, "ExposureType");
		addEEnumLiteral(exposureTypeEEnum, ExposureType.INDOOR);
		addEEnumLiteral(exposureTypeEEnum, ExposureType.OUTDOOR);

		initEEnum(privateTypeEEnum, PrivateType.class, "PrivateType");
		addEEnumLiteral(privateTypeEEnum, PrivateType.TRUE);
		addEEnumLiteral(privateTypeEEnum, PrivateType.FALSE);

		initEEnum(statusTypeEEnum, StatusType.class, "StatusType");
		addEEnumLiteral(statusTypeEEnum, StatusType.FROZEN);
		addEEnumLiteral(statusTypeEEnum, StatusType.LIVE);

		initEEnum(typeTypeEEnum, TypeType.class, "TypeType");
		addEEnumLiteral(typeTypeEEnum, TypeType.BASIC_SI);
		addEEnumLiteral(typeTypeEEnum, TypeType.DERIVED_SI);
		addEEnumLiteral(typeTypeEEnum, TypeType.CONVERSION_BASED_UNITS);
		addEEnumLiteral(typeTypeEEnum, TypeType.DERIVED_UNITS);
		addEEnumLiteral(typeTypeEEnum, TypeType.CONTEXT_DEPENDENT_UNITS);

		initEEnum(versionTypeEEnum, VersionType.class, "VersionType");
		addEEnumLiteral(versionTypeEEnum, VersionType._051);

		// Initialize data types
		initEDataType(creatorTypeEDataType, String.class, "CreatorType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dispositionTypeObjectEDataType, DispositionType.class, "DispositionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(domainTypeObjectEDataType, DomainType.class, "DomainTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(exposureTypeObjectEDataType, ExposureType.class, "ExposureTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(latTypeEDataType, double.class, "LatType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(latTypeObjectEDataType, Double.class, "LatTypeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(lonTypeEDataType, double.class, "LonType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(lonTypeObjectEDataType, Double.class, "LonTypeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(privateTypeObjectEDataType, PrivateType.class, "PrivateTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(statusTypeObjectEDataType, StatusType.class, "StatusTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(typeTypeObjectEDataType, TypeType.class, "TypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(updatedTypeEDataType, XMLGregorianCalendar.class, "UpdatedType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(versionTypeObjectEDataType, VersionType.class, "VersionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (creatorTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "creator_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });		
		addAnnotation
		  (currentValueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "current_value_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getCurrentValueType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getCurrentValueType_At(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "at"
		   });		
		addAnnotation
		  (datapointsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "datapoints_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDatapointsType_Value(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "value",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (dataTypeEClass, 
		   source, 
		   new String[] {
			 "name", "data_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDataType_Tag(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tag",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDataType_CurrentValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "current_value",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDataType_MaxValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "max_value",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDataType_MinValue(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "min_value",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDataType_Datapoints(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "datapoints",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDataType_Unit(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "unit",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDataType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (dispositionTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "disposition_._type"
		   });		
		addAnnotation
		  (dispositionTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "disposition_._type:Object",
			 "baseType", "disposition_._type"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_Eeml(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "eeml",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (domainTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "domain_._type"
		   });		
		addAnnotation
		  (domainTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "domain_._type:Object",
			 "baseType", "domain_._type"
		   });		
		addAnnotation
		  (eemlTypeEClass, 
		   source, 
		   new String[] {
			 "name", "eeml_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEemlType_Environment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "environment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEemlType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });		
		addAnnotation
		  (environmentTypeEClass, 
		   source, 
		   new String[] {
			 "name", "environment_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEnvironmentType_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEnvironmentType_Feed(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "feed",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEnvironmentType_Status(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "status",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEnvironmentType_Private(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "private",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEnvironmentType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEnvironmentType_Icon(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "icon",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEnvironmentType_Website(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "website",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEnvironmentType_Email(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "email",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEnvironmentType_Tag(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tag",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEnvironmentType_Location(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "location",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEnvironmentType_Data(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "data",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEnvironmentType_Creator(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "creator"
		   });		
		addAnnotation
		  (getEnvironmentType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getEnvironmentType_Updated(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "updated"
		   });		
		addAnnotation
		  (exposureTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "exposure_._type"
		   });		
		addAnnotation
		  (exposureTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "exposure_._type:Object",
			 "baseType", "exposure_._type"
		   });		
		addAnnotation
		  (latTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "lat_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#double",
			 "minInclusive", "-90",
			 "maxInclusive", "90"
		   });		
		addAnnotation
		  (latTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "lat_._type:Object",
			 "baseType", "lat_._type"
		   });		
		addAnnotation
		  (locationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "location_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLocationType_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLocationType_Lat(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lat",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLocationType_Lon(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "lon",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLocationType_Ele(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ele",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLocationType_Disposition(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "disposition"
		   });		
		addAnnotation
		  (getLocationType_Domain(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "domain"
		   });		
		addAnnotation
		  (getLocationType_Exposure(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "exposure"
		   });		
		addAnnotation
		  (lonTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "lon_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#double",
			 "minInclusive", "-180",
			 "maxInclusive", "180"
		   });		
		addAnnotation
		  (lonTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "lon_._type:Object",
			 "baseType", "lon_._type"
		   });		
		addAnnotation
		  (privateTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "private_._type"
		   });		
		addAnnotation
		  (privateTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "private_._type:Object",
			 "baseType", "private_._type"
		   });		
		addAnnotation
		  (statusTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "status_._type"
		   });		
		addAnnotation
		  (statusTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "status_._type:Object",
			 "baseType", "status_._type"
		   });		
		addAnnotation
		  (typeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "type_._type"
		   });		
		addAnnotation
		  (typeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "type_._type:Object",
			 "baseType", "type_._type"
		   });		
		addAnnotation
		  (unitTypeEClass, 
		   source, 
		   new String[] {
			 "name", "unit_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getUnitType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getUnitType_Symbol(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "symbol"
		   });		
		addAnnotation
		  (getUnitType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });		
		addAnnotation
		  (updatedTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "updated_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#dateTime"
		   });		
		addAnnotation
		  (valueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "value_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getValueType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getValueType_At(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "at"
		   });		
		addAnnotation
		  (versionTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "version_._type"
		   });		
		addAnnotation
		  (versionTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "version_._type:Object",
			 "baseType", "version_._type"
		   });
	}

} //_5PackageImpl
