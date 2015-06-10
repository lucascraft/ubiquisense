/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.comm.script.netConf.impl;

import net.sf.smbt.comm.script.netConf.DSLOrchestrorImport;
import net.sf.smbt.comm.script.netConf.NetBind;
import net.sf.smbt.comm.script.netConf.NetCfg;
import net.sf.smbt.comm.script.netConf.NetConfFactory;
import net.sf.smbt.comm.script.netConf.NetConfPackage;
import net.sf.smbt.comm.script.netConf.NetDecoder;
import net.sf.smbt.comm.script.netConf.NetInterpreter;
import net.sf.smbt.comm.script.netConf.NetListener;
import net.sf.smbt.comm.script.netConf.NetOrchestrorScope;
import net.sf.smbt.comm.script.netConf.NetPort;
import net.sf.smbt.comm.script.netConf.RxKind;

import net.sf.xqz.engine.script.orchestror.OrchestrorPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NetConfPackageImpl extends EPackageImpl implements NetConfPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass netCfgEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dslOrchestrorImportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass netPortEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass netDecoderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass netInterpreterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass netListenerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass netOrchestrorScopeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass netBindEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum transporT_PROTOCOLEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum rxKindEEnum = null;

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
   * @see net.sf.smbt.comm.script.netConf.NetConfPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private NetConfPackageImpl()
  {
    super(eNS_URI, NetConfFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link NetConfPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static NetConfPackage init()
  {
    if (isInited) return (NetConfPackage)EPackage.Registry.INSTANCE.getEPackage(NetConfPackage.eNS_URI);

    // Obtain or create and register package
    NetConfPackageImpl theNetConfPackage = (NetConfPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NetConfPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NetConfPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    OrchestrorPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theNetConfPackage.createPackageContents();

    // Initialize created meta-data
    theNetConfPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theNetConfPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(NetConfPackage.eNS_URI, theNetConfPackage);
    return theNetConfPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNetCfg()
  {
    return netCfgEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNetCfg_Imports()
  {
    return (EReference)netCfgEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNetCfg_Listeners()
  {
    return (EReference)netCfgEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNetCfg_Interpreters()
  {
    return (EReference)netCfgEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNetCfg_Decoders()
  {
    return (EReference)netCfgEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNetCfg_Ports()
  {
    return (EReference)netCfgEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNetCfg_OrchestrorScopes()
  {
    return (EReference)netCfgEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDSLOrchestrorImport()
  {
    return dslOrchestrorImportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDSLOrchestrorImport_ImportURI()
  {
    return (EAttribute)dslOrchestrorImportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNetPort()
  {
    return netPortEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNetPort_Name()
  {
    return (EAttribute)netPortEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNetPort_PortID()
  {
    return (EAttribute)netPortEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNetPort_Kind()
  {
    return (EAttribute)netPortEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNetPort_Speed()
  {
    return (EAttribute)netPortEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNetPort_Ports()
  {
    return (EAttribute)netPortEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNetPort_IpExpr()
  {
    return (EAttribute)netPortEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNetPort_Mode()
  {
    return (EAttribute)netPortEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNetDecoder()
  {
    return netDecoderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNetDecoder_Name()
  {
    return (EAttribute)netDecoderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNetDecoder_Clazz()
  {
    return (EAttribute)netDecoderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNetInterpreter()
  {
    return netInterpreterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNetInterpreter_Name()
  {
    return (EAttribute)netInterpreterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNetInterpreter_Clazz()
  {
    return (EAttribute)netInterpreterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNetListener()
  {
    return netListenerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNetListener_Name()
  {
    return (EAttribute)netListenerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNetListener_Clazz()
  {
    return (EAttribute)netListenerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNetOrchestrorScope()
  {
    return netOrchestrorScopeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNetOrchestrorScope_DslOrchestror()
  {
    return (EReference)netOrchestrorScopeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNetOrchestrorScope_Binds()
  {
    return (EReference)netOrchestrorScopeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNetBind()
  {
    return netBindEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNetBind_Engine()
  {
    return (EReference)netBindEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNetBind_Interpreter()
  {
    return (EReference)netBindEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNetBind_CmdInject()
  {
    return (EReference)netBindEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNetBind_Decoder()
  {
    return (EReference)netBindEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNetBind_FrameInject()
  {
    return (EReference)netBindEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNetBind_Port()
  {
    return (EReference)netBindEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNetBind_Listeners()
  {
    return (EReference)netBindEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTRANSPORT_PROTOCOL()
  {
    return transporT_PROTOCOLEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getRxKind()
  {
    return rxKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetConfFactory getNetConfFactory()
  {
    return (NetConfFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    netCfgEClass = createEClass(NET_CFG);
    createEReference(netCfgEClass, NET_CFG__IMPORTS);
    createEReference(netCfgEClass, NET_CFG__LISTENERS);
    createEReference(netCfgEClass, NET_CFG__INTERPRETERS);
    createEReference(netCfgEClass, NET_CFG__DECODERS);
    createEReference(netCfgEClass, NET_CFG__PORTS);
    createEReference(netCfgEClass, NET_CFG__ORCHESTROR_SCOPES);

    dslOrchestrorImportEClass = createEClass(DSL_ORCHESTROR_IMPORT);
    createEAttribute(dslOrchestrorImportEClass, DSL_ORCHESTROR_IMPORT__IMPORT_URI);

    netPortEClass = createEClass(NET_PORT);
    createEAttribute(netPortEClass, NET_PORT__NAME);
    createEAttribute(netPortEClass, NET_PORT__PORT_ID);
    createEAttribute(netPortEClass, NET_PORT__KIND);
    createEAttribute(netPortEClass, NET_PORT__SPEED);
    createEAttribute(netPortEClass, NET_PORT__PORTS);
    createEAttribute(netPortEClass, NET_PORT__IP_EXPR);
    createEAttribute(netPortEClass, NET_PORT__MODE);

    netDecoderEClass = createEClass(NET_DECODER);
    createEAttribute(netDecoderEClass, NET_DECODER__NAME);
    createEAttribute(netDecoderEClass, NET_DECODER__CLAZZ);

    netInterpreterEClass = createEClass(NET_INTERPRETER);
    createEAttribute(netInterpreterEClass, NET_INTERPRETER__NAME);
    createEAttribute(netInterpreterEClass, NET_INTERPRETER__CLAZZ);

    netListenerEClass = createEClass(NET_LISTENER);
    createEAttribute(netListenerEClass, NET_LISTENER__NAME);
    createEAttribute(netListenerEClass, NET_LISTENER__CLAZZ);

    netOrchestrorScopeEClass = createEClass(NET_ORCHESTROR_SCOPE);
    createEReference(netOrchestrorScopeEClass, NET_ORCHESTROR_SCOPE__DSL_ORCHESTROR);
    createEReference(netOrchestrorScopeEClass, NET_ORCHESTROR_SCOPE__BINDS);

    netBindEClass = createEClass(NET_BIND);
    createEReference(netBindEClass, NET_BIND__ENGINE);
    createEReference(netBindEClass, NET_BIND__INTERPRETER);
    createEReference(netBindEClass, NET_BIND__CMD_INJECT);
    createEReference(netBindEClass, NET_BIND__DECODER);
    createEReference(netBindEClass, NET_BIND__FRAME_INJECT);
    createEReference(netBindEClass, NET_BIND__PORT);
    createEReference(netBindEClass, NET_BIND__LISTENERS);

    // Create enums
    transporT_PROTOCOLEEnum = createEEnum(TRANSPORT_PROTOCOL);
    rxKindEEnum = createEEnum(RX_KIND);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    OrchestrorPackage theOrchestrorPackage = (OrchestrorPackage)EPackage.Registry.INSTANCE.getEPackage(OrchestrorPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(netCfgEClass, NetCfg.class, "NetCfg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNetCfg_Imports(), this.getDSLOrchestrorImport(), null, "imports", null, 0, -1, NetCfg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNetCfg_Listeners(), this.getNetListener(), null, "listeners", null, 0, -1, NetCfg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNetCfg_Interpreters(), this.getNetInterpreter(), null, "interpreters", null, 0, -1, NetCfg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNetCfg_Decoders(), this.getNetDecoder(), null, "decoders", null, 0, -1, NetCfg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNetCfg_Ports(), this.getNetPort(), null, "ports", null, 0, -1, NetCfg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNetCfg_OrchestrorScopes(), this.getNetOrchestrorScope(), null, "orchestrorScopes", null, 0, -1, NetCfg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dslOrchestrorImportEClass, DSLOrchestrorImport.class, "DSLOrchestrorImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDSLOrchestrorImport_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, DSLOrchestrorImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(netPortEClass, NetPort.class, "NetPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNetPort_Name(), ecorePackage.getEString(), "name", null, 0, 1, NetPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNetPort_PortID(), ecorePackage.getEString(), "portID", null, 0, 1, NetPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNetPort_Kind(), this.getTRANSPORT_PROTOCOL(), "kind", null, 0, 1, NetPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNetPort_Speed(), ecorePackage.getEInt(), "speed", null, 0, 1, NetPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNetPort_Ports(), ecorePackage.getEInt(), "ports", null, 0, -1, NetPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNetPort_IpExpr(), ecorePackage.getEString(), "ipExpr", null, 0, -1, NetPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNetPort_Mode(), this.getRxKind(), "mode", null, 0, 1, NetPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(netDecoderEClass, NetDecoder.class, "NetDecoder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNetDecoder_Name(), ecorePackage.getEString(), "name", null, 0, 1, NetDecoder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNetDecoder_Clazz(), ecorePackage.getEString(), "clazz", null, 0, 1, NetDecoder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(netInterpreterEClass, NetInterpreter.class, "NetInterpreter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNetInterpreter_Name(), ecorePackage.getEString(), "name", null, 0, 1, NetInterpreter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNetInterpreter_Clazz(), ecorePackage.getEString(), "clazz", null, 0, 1, NetInterpreter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(netListenerEClass, NetListener.class, "NetListener", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNetListener_Name(), ecorePackage.getEString(), "name", null, 0, 1, NetListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNetListener_Clazz(), ecorePackage.getEString(), "clazz", null, 0, 1, NetListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(netOrchestrorScopeEClass, NetOrchestrorScope.class, "NetOrchestrorScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNetOrchestrorScope_DslOrchestror(), theOrchestrorPackage.getDSLOrchestror(), null, "dslOrchestror", null, 0, 1, NetOrchestrorScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNetOrchestrorScope_Binds(), this.getNetBind(), null, "binds", null, 0, -1, NetOrchestrorScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(netBindEClass, NetBind.class, "NetBind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNetBind_Engine(), theOrchestrorPackage.getDSLCommandEngine(), null, "engine", null, 0, 1, NetBind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNetBind_Interpreter(), this.getNetInterpreter(), null, "interpreter", null, 0, 1, NetBind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNetBind_CmdInject(), this.getNetPort(), null, "cmdInject", null, 0, -1, NetBind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNetBind_Decoder(), this.getNetDecoder(), null, "decoder", null, 0, 1, NetBind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNetBind_FrameInject(), this.getNetPort(), null, "frameInject", null, 0, -1, NetBind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNetBind_Port(), this.getNetPort(), null, "port", null, 0, 1, NetBind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNetBind_Listeners(), this.getNetListener(), null, "listeners", null, 0, -1, NetBind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(transporT_PROTOCOLEEnum, net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL.class, "TRANSPORT_PROTOCOL");
    addEEnumLiteral(transporT_PROTOCOLEEnum, net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL.USB);
    addEEnumLiteral(transporT_PROTOCOLEEnum, net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL.TCP);
    addEEnumLiteral(transporT_PROTOCOLEEnum, net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL.UDP);
    addEEnumLiteral(transporT_PROTOCOLEEnum, net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL.HTTP);
    addEEnumLiteral(transporT_PROTOCOLEEnum, net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL.BLUETOOTH);
    addEEnumLiteral(transporT_PROTOCOLEEnum, net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL.XBEE);
    addEEnumLiteral(transporT_PROTOCOLEEnum, net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL.MIDI);

    initEEnum(rxKindEEnum, RxKind.class, "RxKind");
    addEEnumLiteral(rxKindEEnum, RxKind.UNICAST);
    addEEnumLiteral(rxKindEEnum, RxKind.MULTICAST);
    addEEnumLiteral(rxKindEEnum, RxKind.BROADCAST);

    // Create resource
    createResource(eNS_URI);
  }

} //NetConfPackageImpl
