/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.at.atcmdset.impl;

import net.sf.smbt.at.atcmdset.ATCmd;
import net.sf.smbt.at.atcmdset.ATPlusPlusPlus;
import net.sf.smbt.at.atcmdset.ATRetCmd;
import net.sf.smbt.at.atcmdset.AtcmdsetFactory;
import net.sf.smbt.at.atcmdset.AtcmdsetPackage;
import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtcmdsetPackageImpl extends EPackageImpl implements AtcmdsetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atRetCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atPlusPlusPlusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atbdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atwrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atcnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atmyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atdlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aT_COMMAND_TYPESEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum v34_COMMAND_TYPESEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aT_RET_CODESEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aT_COUNTRY_CODESEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aT_BAUD_RATEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aT_STATUSEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cmD_KINDEEnum = null;

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
	 * @see net.sf.smbt.at.atcmdset.AtcmdsetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AtcmdsetPackageImpl() {
		super(eNS_URI, AtcmdsetFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AtcmdsetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AtcmdsetPackage init() {
		if (isInited) return (AtcmdsetPackage)EPackage.Registry.INSTANCE.getEPackage(AtcmdsetPackage.eNS_URI);

		// Obtain or create and register package
		AtcmdsetPackageImpl theAtcmdsetPackage = (AtcmdsetPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AtcmdsetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AtcmdsetPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAtcmdsetPackage.createPackageContents();

		// Initialize created meta-data
		theAtcmdsetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAtcmdsetPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AtcmdsetPackage.eNS_URI, theAtcmdsetPackage);
		return theAtcmdsetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATCmd() {
		return atCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATCmd_Kind() {
		return (EAttribute)atCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATCmd_Token() {
		return (EAttribute)atCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATCmd_Data() {
		return (EAttribute)atCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATRetCmd() {
		return atRetCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATRetCmd_Code() {
		return (EAttribute)atRetCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATRetCmd_Data() {
		return (EAttribute)atRetCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATRetCmd_Message() {
		return (EAttribute)atRetCmdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATRetCmd_Status() {
		return (EAttribute)atRetCmdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATPlusPlusPlus() {
		return atPlusPlusPlusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATBD() {
		return atbdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATWR() {
		return atwrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATCN() {
		return atcnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATID() {
		return atidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATMY() {
		return atmyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATDL() {
		return atdlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAT_COMMAND_TYPES() {
		return aT_COMMAND_TYPESEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getV34_COMMAND_TYPES() {
		return v34_COMMAND_TYPESEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAT_RET_CODES() {
		return aT_RET_CODESEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAT_COUNTRY_CODES() {
		return aT_COUNTRY_CODESEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAT_BAUD_RATE() {
		return aT_BAUD_RATEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAT_STATUS() {
		return aT_STATUSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCMD_KIND() {
		return cmD_KINDEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtcmdsetFactory getAtcmdsetFactory() {
		return (AtcmdsetFactory)getEFactoryInstance();
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
		atCmdEClass = createEClass(AT_CMD);
		createEAttribute(atCmdEClass, AT_CMD__KIND);
		createEAttribute(atCmdEClass, AT_CMD__TOKEN);
		createEAttribute(atCmdEClass, AT_CMD__DATA);

		atRetCmdEClass = createEClass(AT_RET_CMD);
		createEAttribute(atRetCmdEClass, AT_RET_CMD__CODE);
		createEAttribute(atRetCmdEClass, AT_RET_CMD__DATA);
		createEAttribute(atRetCmdEClass, AT_RET_CMD__MESSAGE);
		createEAttribute(atRetCmdEClass, AT_RET_CMD__STATUS);

		atPlusPlusPlusEClass = createEClass(AT_PLUS_PLUS_PLUS);

		atbdEClass = createEClass(ATBD);

		atwrEClass = createEClass(ATWR);

		atcnEClass = createEClass(ATCN);

		atidEClass = createEClass(ATID);

		atmyEClass = createEClass(ATMY);

		atdlEClass = createEClass(ATDL);

		// Create enums
		aT_COMMAND_TYPESEEnum = createEEnum(AT_COMMAND_TYPES);
		v34_COMMAND_TYPESEEnum = createEEnum(V34_COMMAND_TYPES);
		aT_RET_CODESEEnum = createEEnum(AT_RET_CODES);
		aT_COUNTRY_CODESEEnum = createEEnum(AT_COUNTRY_CODES);
		aT_BAUD_RATEEEnum = createEEnum(AT_BAUD_RATE);
		aT_STATUSEEnum = createEEnum(AT_STATUS);
		cmD_KINDEEnum = createEEnum(CMD_KIND);
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
		CmdPackage theCmdPackage = (CmdPackage)EPackage.Registry.INSTANCE.getEPackage(CmdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		atCmdEClass.getESuperTypes().add(theCmdPackage.getCmd());
		atRetCmdEClass.getESuperTypes().add(theCmdPackage.getCmd());
		atPlusPlusPlusEClass.getESuperTypes().add(this.getATCmd());
		atbdEClass.getESuperTypes().add(this.getATCmd());
		atwrEClass.getESuperTypes().add(this.getATCmd());
		atcnEClass.getESuperTypes().add(this.getATCmd());
		atidEClass.getESuperTypes().add(this.getATCmd());
		atmyEClass.getESuperTypes().add(this.getATCmd());
		atdlEClass.getESuperTypes().add(this.getATCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(atCmdEClass, ATCmd.class, "ATCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getATCmd_Kind(), this.getAT_COMMAND_TYPES(), "kind", null, 0, 1, ATCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATCmd_Token(), ecorePackage.getEString(), "token", null, 0, 1, ATCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATCmd_Data(), ecorePackage.getEByteArray(), "data", null, 0, 1, ATCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atRetCmdEClass, ATRetCmd.class, "ATRetCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getATRetCmd_Code(), this.getAT_RET_CODES(), "code", null, 0, 1, ATRetCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATRetCmd_Data(), ecorePackage.getEByteArray(), "data", null, 0, 1, ATRetCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATRetCmd_Message(), ecorePackage.getEString(), "message", null, 0, 1, ATRetCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATRetCmd_Status(), this.getAT_STATUS(), "status", null, 0, 1, ATRetCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atPlusPlusPlusEClass, ATPlusPlusPlus.class, "ATPlusPlusPlus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atbdEClass, net.sf.smbt.at.atcmdset.ATBD.class, "ATBD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atwrEClass, net.sf.smbt.at.atcmdset.ATWR.class, "ATWR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atcnEClass, net.sf.smbt.at.atcmdset.ATCN.class, "ATCN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atidEClass, net.sf.smbt.at.atcmdset.ATID.class, "ATID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atmyEClass, net.sf.smbt.at.atcmdset.ATMY.class, "ATMY", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atdlEClass, net.sf.smbt.at.atcmdset.ATDL.class, "ATDL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.class, "AT_COMMAND_TYPES");
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.ASLASH);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.ATA);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.D);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.ATDT);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.ATE);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.ATF);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.ATH);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.ATI);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.ATL);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.ATM);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.ATN);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.ATO);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.ATQ);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.ATS);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.ATV);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.ATW);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.ATX);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.ATY);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.ATZ);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.AT_AND_C);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.AT_AND_D);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.AT_AND_F);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.AT_AND_G);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.AT_AND_K);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.RTS_SLASH_CTS);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.XON_SLASH_XOFF);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.AT_AND_P);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.AT_AND_Q);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.AT_AND_R);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.AT_AND_S);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.AT_AND_T);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.AT_AND_V);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.AT_AND_W);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.TAND_X);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.AT_AND_Y);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.AT_AND_Z);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.AT_PERCENT_E);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.AT_PERCENT_C);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.AT_BSLASH_G);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.AT_BSLASH_N);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.BSLASH_A);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.BRACE_M);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.MINUS_K);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.AT_STAR_CN);
		addEEnumLiteral(aT_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES.NONE);

		initEEnum(v34_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.V34_COMMAND_TYPES.class, "V34_COMMAND_TYPES");
		addEEnumLiteral(v34_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.V34_COMMAND_TYPES.AROBASE_M);
		addEEnumLiteral(v34_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.V34_COMMAND_TYPES.TWODOTS_E);
		addEEnumLiteral(v34_COMMAND_TYPESEEnum, net.sf.smbt.at.atcmdset.V34_COMMAND_TYPES.PLUS_MS);

		initEEnum(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.class, "AT_RET_CODES");
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.OK);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.RING);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.NO_CARRIER);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.ERROR);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.CONNECT);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.NO_DIALTONE);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.BUSY);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.NO_ANSWER);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.CONNECT_O600);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.CONNECT_2400);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.CONNECT_4800);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.CONNECT_9600);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.CONNECT_7200);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.CONNECT_12000);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.CONNECT_14400);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.CONNECT_19200);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.CONNECT_38400);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.CONNECT_57600);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.CONNECT_115200);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.CONNECT_75TX_1200RX);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.CONNECT_1200TX_75RX);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.DELAYED);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.BLACKLISTED);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.FAX);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.DATA);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.CARRIER_300);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.CARRIER_1200_75);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.CARRIER_75_1200);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.CAARRIER_1200);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.CARRIER_2400);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.CARRIER_4800);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.CARRIER_9600);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.CARRIER_7200);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.CARRIER_12000);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.CARRIER_14400);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.CONNECT_16800);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.CARRIER_19200);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.CONNECT_21600);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.CONNECT_24000);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.CONNECT_26400);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.CONNECT_28800);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.CONNECT_31200);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.CONNECT_36600);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.COMPRESSION_CLASS_5);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.COMPRESSION_V42_BIS);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.COMPRESSION_NONE);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.PROTOCOL_NONE);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.PROTOCOL_LAPM);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.PROTOCOL_ALT);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.PROTOCOL_ALT_CELLULAR);
		addEEnumLiteral(aT_RET_CODESEEnum, net.sf.smbt.at.atcmdset.AT_RET_CODES.PLUS_F4_PLUS_FCERROR);

		initEEnum(aT_COUNTRY_CODESEEnum, net.sf.smbt.at.atcmdset.AT_COUNTRY_CODES.class, "AT_COUNTRY_CODES");
		addEEnumLiteral(aT_COUNTRY_CODESEEnum, net.sf.smbt.at.atcmdset.AT_COUNTRY_CODES.AUSTRALIA);
		addEEnumLiteral(aT_COUNTRY_CODESEEnum, net.sf.smbt.at.atcmdset.AT_COUNTRY_CODES.AUSTRIA);
		addEEnumLiteral(aT_COUNTRY_CODESEEnum, net.sf.smbt.at.atcmdset.AT_COUNTRY_CODES.BELGIUM);
		addEEnumLiteral(aT_COUNTRY_CODESEEnum, net.sf.smbt.at.atcmdset.AT_COUNTRY_CODES.DENMARK);
		addEEnumLiteral(aT_COUNTRY_CODESEEnum, net.sf.smbt.at.atcmdset.AT_COUNTRY_CODES.FINLAND);
		addEEnumLiteral(aT_COUNTRY_CODESEEnum, net.sf.smbt.at.atcmdset.AT_COUNTRY_CODES.FRANCE);
		addEEnumLiteral(aT_COUNTRY_CODESEEnum, net.sf.smbt.at.atcmdset.AT_COUNTRY_CODES.GERMANY);
		addEEnumLiteral(aT_COUNTRY_CODESEEnum, net.sf.smbt.at.atcmdset.AT_COUNTRY_CODES.GREECE);
		addEEnumLiteral(aT_COUNTRY_CODESEEnum, net.sf.smbt.at.atcmdset.AT_COUNTRY_CODES.NETHERLANDS);
		addEEnumLiteral(aT_COUNTRY_CODESEEnum, net.sf.smbt.at.atcmdset.AT_COUNTRY_CODES.IRELAND);
		addEEnumLiteral(aT_COUNTRY_CODESEEnum, net.sf.smbt.at.atcmdset.AT_COUNTRY_CODES.ITALY);
		addEEnumLiteral(aT_COUNTRY_CODESEEnum, net.sf.smbt.at.atcmdset.AT_COUNTRY_CODES.JAPAN);
		addEEnumLiteral(aT_COUNTRY_CODESEEnum, net.sf.smbt.at.atcmdset.AT_COUNTRY_CODES.NAMIBIA);
		addEEnumLiteral(aT_COUNTRY_CODESEEnum, net.sf.smbt.at.atcmdset.AT_COUNTRY_CODES.NORWAY);
		addEEnumLiteral(aT_COUNTRY_CODESEEnum, net.sf.smbt.at.atcmdset.AT_COUNTRY_CODES.PORTUGAL);
		addEEnumLiteral(aT_COUNTRY_CODESEEnum, net.sf.smbt.at.atcmdset.AT_COUNTRY_CODES.SOUTH_AFRICA);
		addEEnumLiteral(aT_COUNTRY_CODESEEnum, net.sf.smbt.at.atcmdset.AT_COUNTRY_CODES.SPAIN);
		addEEnumLiteral(aT_COUNTRY_CODESEEnum, net.sf.smbt.at.atcmdset.AT_COUNTRY_CODES.SWEDEN);
		addEEnumLiteral(aT_COUNTRY_CODESEEnum, net.sf.smbt.at.atcmdset.AT_COUNTRY_CODES.SWITZERLAND);
		addEEnumLiteral(aT_COUNTRY_CODESEEnum, net.sf.smbt.at.atcmdset.AT_COUNTRY_CODES.UK);
		addEEnumLiteral(aT_COUNTRY_CODESEEnum, net.sf.smbt.at.atcmdset.AT_COUNTRY_CODES.CZECH_REPUBLIC);
		addEEnumLiteral(aT_COUNTRY_CODESEEnum, net.sf.smbt.at.atcmdset.AT_COUNTRY_CODES.POLAND);
		addEEnumLiteral(aT_COUNTRY_CODESEEnum, net.sf.smbt.at.atcmdset.AT_COUNTRY_CODES.RUSSIA);
		addEEnumLiteral(aT_COUNTRY_CODESEEnum, net.sf.smbt.at.atcmdset.AT_COUNTRY_CODES.UNITED_STATES);

		initEEnum(aT_BAUD_RATEEEnum, net.sf.smbt.at.atcmdset.AT_BAUD_RATE.class, "AT_BAUD_RATE");
		addEEnumLiteral(aT_BAUD_RATEEEnum, net.sf.smbt.at.atcmdset.AT_BAUD_RATE.RATE_1200);
		addEEnumLiteral(aT_BAUD_RATEEEnum, net.sf.smbt.at.atcmdset.AT_BAUD_RATE.RATE_2400);
		addEEnumLiteral(aT_BAUD_RATEEEnum, net.sf.smbt.at.atcmdset.AT_BAUD_RATE.RATE_4800);
		addEEnumLiteral(aT_BAUD_RATEEEnum, net.sf.smbt.at.atcmdset.AT_BAUD_RATE.RATE_9600);
		addEEnumLiteral(aT_BAUD_RATEEEnum, net.sf.smbt.at.atcmdset.AT_BAUD_RATE.RATE_19200);
		addEEnumLiteral(aT_BAUD_RATEEEnum, net.sf.smbt.at.atcmdset.AT_BAUD_RATE.RATE_38400);
		addEEnumLiteral(aT_BAUD_RATEEEnum, net.sf.smbt.at.atcmdset.AT_BAUD_RATE.RATE_57600);
		addEEnumLiteral(aT_BAUD_RATEEEnum, net.sf.smbt.at.atcmdset.AT_BAUD_RATE.RATE_115200);

		initEEnum(aT_STATUSEEnum, net.sf.smbt.at.atcmdset.AT_STATUS.class, "AT_STATUS");
		addEEnumLiteral(aT_STATUSEEnum, net.sf.smbt.at.atcmdset.AT_STATUS.OK);
		addEEnumLiteral(aT_STATUSEEnum, net.sf.smbt.at.atcmdset.AT_STATUS.ERROR);
		addEEnumLiteral(aT_STATUSEEnum, net.sf.smbt.at.atcmdset.AT_STATUS.UNKNOWN);

		initEEnum(cmD_KINDEEnum, net.sf.smbt.at.atcmdset.CMD_KIND.class, "CMD_KIND");
		addEEnumLiteral(cmD_KINDEEnum, net.sf.smbt.at.atcmdset.CMD_KIND.BD);
		addEEnumLiteral(cmD_KINDEEnum, net.sf.smbt.at.atcmdset.CMD_KIND.WR);
		addEEnumLiteral(cmD_KINDEEnum, net.sf.smbt.at.atcmdset.CMD_KIND.PP);
		addEEnumLiteral(cmD_KINDEEnum, net.sf.smbt.at.atcmdset.CMD_KIND.ID);
		addEEnumLiteral(cmD_KINDEEnum, net.sf.smbt.at.atcmdset.CMD_KIND.MY);
		addEEnumLiteral(cmD_KINDEEnum, net.sf.smbt.at.atcmdset.CMD_KIND.CN);
		addEEnumLiteral(cmD_KINDEEnum, net.sf.smbt.at.atcmdset.CMD_KIND.DL);

		// Create resource
		createResource(eNS_URI);
	}

} //AtcmdsetPackageImpl
