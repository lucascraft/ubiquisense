/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.comm.script.netConf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.smbt.comm.script.netConf.NetConfFactory
 * @model kind="package"
 * @generated
 */
public interface NetConfPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "netConf";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sf.net/smbt/comm/script/NetConf";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "netConf";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  NetConfPackage eINSTANCE = net.sf.smbt.comm.script.netConf.impl.NetConfPackageImpl.init();

  /**
   * The meta object id for the '{@link net.sf.smbt.comm.script.netConf.impl.NetCfgImpl <em>Net Cfg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.comm.script.netConf.impl.NetCfgImpl
   * @see net.sf.smbt.comm.script.netConf.impl.NetConfPackageImpl#getNetCfg()
   * @generated
   */
  int NET_CFG = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_CFG__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Listeners</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_CFG__LISTENERS = 1;

  /**
   * The feature id for the '<em><b>Interpreters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_CFG__INTERPRETERS = 2;

  /**
   * The feature id for the '<em><b>Decoders</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_CFG__DECODERS = 3;

  /**
   * The feature id for the '<em><b>Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_CFG__PORTS = 4;

  /**
   * The feature id for the '<em><b>Orchestror Scopes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_CFG__ORCHESTROR_SCOPES = 5;

  /**
   * The number of structural features of the '<em>Net Cfg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_CFG_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link net.sf.smbt.comm.script.netConf.impl.DSLOrchestrorImportImpl <em>DSL Orchestror Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.comm.script.netConf.impl.DSLOrchestrorImportImpl
   * @see net.sf.smbt.comm.script.netConf.impl.NetConfPackageImpl#getDSLOrchestrorImport()
   * @generated
   */
  int DSL_ORCHESTROR_IMPORT = 1;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_ORCHESTROR_IMPORT__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>DSL Orchestror Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DSL_ORCHESTROR_IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.comm.script.netConf.impl.NetPortImpl <em>Net Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.comm.script.netConf.impl.NetPortImpl
   * @see net.sf.smbt.comm.script.netConf.impl.NetConfPackageImpl#getNetPort()
   * @generated
   */
  int NET_PORT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_PORT__NAME = 0;

  /**
   * The feature id for the '<em><b>Port ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_PORT__PORT_ID = 1;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_PORT__KIND = 2;

  /**
   * The feature id for the '<em><b>Speed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_PORT__SPEED = 3;

  /**
   * The feature id for the '<em><b>Ports</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_PORT__PORTS = 4;

  /**
   * The feature id for the '<em><b>Ip Expr</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_PORT__IP_EXPR = 5;

  /**
   * The feature id for the '<em><b>Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_PORT__MODE = 6;

  /**
   * The number of structural features of the '<em>Net Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_PORT_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link net.sf.smbt.comm.script.netConf.impl.NetDecoderImpl <em>Net Decoder</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.comm.script.netConf.impl.NetDecoderImpl
   * @see net.sf.smbt.comm.script.netConf.impl.NetConfPackageImpl#getNetDecoder()
   * @generated
   */
  int NET_DECODER = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_DECODER__NAME = 0;

  /**
   * The feature id for the '<em><b>Clazz</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_DECODER__CLAZZ = 1;

  /**
   * The number of structural features of the '<em>Net Decoder</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_DECODER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sf.smbt.comm.script.netConf.impl.NetInterpreterImpl <em>Net Interpreter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.comm.script.netConf.impl.NetInterpreterImpl
   * @see net.sf.smbt.comm.script.netConf.impl.NetConfPackageImpl#getNetInterpreter()
   * @generated
   */
  int NET_INTERPRETER = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_INTERPRETER__NAME = 0;

  /**
   * The feature id for the '<em><b>Clazz</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_INTERPRETER__CLAZZ = 1;

  /**
   * The number of structural features of the '<em>Net Interpreter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_INTERPRETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sf.smbt.comm.script.netConf.impl.NetListenerImpl <em>Net Listener</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.comm.script.netConf.impl.NetListenerImpl
   * @see net.sf.smbt.comm.script.netConf.impl.NetConfPackageImpl#getNetListener()
   * @generated
   */
  int NET_LISTENER = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_LISTENER__NAME = 0;

  /**
   * The feature id for the '<em><b>Clazz</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_LISTENER__CLAZZ = 1;

  /**
   * The number of structural features of the '<em>Net Listener</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_LISTENER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sf.smbt.comm.script.netConf.impl.NetOrchestrorScopeImpl <em>Net Orchestror Scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.comm.script.netConf.impl.NetOrchestrorScopeImpl
   * @see net.sf.smbt.comm.script.netConf.impl.NetConfPackageImpl#getNetOrchestrorScope()
   * @generated
   */
  int NET_ORCHESTROR_SCOPE = 6;

  /**
   * The feature id for the '<em><b>Dsl Orchestror</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_ORCHESTROR_SCOPE__DSL_ORCHESTROR = 0;

  /**
   * The feature id for the '<em><b>Binds</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_ORCHESTROR_SCOPE__BINDS = 1;

  /**
   * The number of structural features of the '<em>Net Orchestror Scope</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_ORCHESTROR_SCOPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sf.smbt.comm.script.netConf.impl.NetBindImpl <em>Net Bind</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.comm.script.netConf.impl.NetBindImpl
   * @see net.sf.smbt.comm.script.netConf.impl.NetConfPackageImpl#getNetBind()
   * @generated
   */
  int NET_BIND = 7;

  /**
   * The feature id for the '<em><b>Engine</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_BIND__ENGINE = 0;

  /**
   * The feature id for the '<em><b>Interpreter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_BIND__INTERPRETER = 1;

  /**
   * The feature id for the '<em><b>Cmd Inject</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_BIND__CMD_INJECT = 2;

  /**
   * The feature id for the '<em><b>Decoder</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_BIND__DECODER = 3;

  /**
   * The feature id for the '<em><b>Frame Inject</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_BIND__FRAME_INJECT = 4;

  /**
   * The feature id for the '<em><b>Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_BIND__PORT = 5;

  /**
   * The feature id for the '<em><b>Listeners</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_BIND__LISTENERS = 6;

  /**
   * The number of structural features of the '<em>Net Bind</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_BIND_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL <em>TRANSPORT PROTOCOL</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL
   * @see net.sf.smbt.comm.script.netConf.impl.NetConfPackageImpl#getTRANSPORT_PROTOCOL()
   * @generated
   */
  int TRANSPORT_PROTOCOL = 8;

  /**
   * The meta object id for the '{@link net.sf.smbt.comm.script.netConf.RxKind <em>Rx Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.comm.script.netConf.RxKind
   * @see net.sf.smbt.comm.script.netConf.impl.NetConfPackageImpl#getRxKind()
   * @generated
   */
  int RX_KIND = 9;


  /**
   * Returns the meta object for class '{@link net.sf.smbt.comm.script.netConf.NetCfg <em>Net Cfg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Net Cfg</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetCfg
   * @generated
   */
  EClass getNetCfg();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.smbt.comm.script.netConf.NetCfg#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetCfg#getImports()
   * @see #getNetCfg()
   * @generated
   */
  EReference getNetCfg_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.smbt.comm.script.netConf.NetCfg#getListeners <em>Listeners</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Listeners</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetCfg#getListeners()
   * @see #getNetCfg()
   * @generated
   */
  EReference getNetCfg_Listeners();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.smbt.comm.script.netConf.NetCfg#getInterpreters <em>Interpreters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Interpreters</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetCfg#getInterpreters()
   * @see #getNetCfg()
   * @generated
   */
  EReference getNetCfg_Interpreters();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.smbt.comm.script.netConf.NetCfg#getDecoders <em>Decoders</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Decoders</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetCfg#getDecoders()
   * @see #getNetCfg()
   * @generated
   */
  EReference getNetCfg_Decoders();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.smbt.comm.script.netConf.NetCfg#getPorts <em>Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ports</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetCfg#getPorts()
   * @see #getNetCfg()
   * @generated
   */
  EReference getNetCfg_Ports();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.smbt.comm.script.netConf.NetCfg#getOrchestrorScopes <em>Orchestror Scopes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Orchestror Scopes</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetCfg#getOrchestrorScopes()
   * @see #getNetCfg()
   * @generated
   */
  EReference getNetCfg_OrchestrorScopes();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.comm.script.netConf.DSLOrchestrorImport <em>DSL Orchestror Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DSL Orchestror Import</em>'.
   * @see net.sf.smbt.comm.script.netConf.DSLOrchestrorImport
   * @generated
   */
  EClass getDSLOrchestrorImport();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.comm.script.netConf.DSLOrchestrorImport#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see net.sf.smbt.comm.script.netConf.DSLOrchestrorImport#getImportURI()
   * @see #getDSLOrchestrorImport()
   * @generated
   */
  EAttribute getDSLOrchestrorImport_ImportURI();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.comm.script.netConf.NetPort <em>Net Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Net Port</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetPort
   * @generated
   */
  EClass getNetPort();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.comm.script.netConf.NetPort#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetPort#getName()
   * @see #getNetPort()
   * @generated
   */
  EAttribute getNetPort_Name();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.comm.script.netConf.NetPort#getPortID <em>Port ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Port ID</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetPort#getPortID()
   * @see #getNetPort()
   * @generated
   */
  EAttribute getNetPort_PortID();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.comm.script.netConf.NetPort#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetPort#getKind()
   * @see #getNetPort()
   * @generated
   */
  EAttribute getNetPort_Kind();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.comm.script.netConf.NetPort#getSpeed <em>Speed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Speed</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetPort#getSpeed()
   * @see #getNetPort()
   * @generated
   */
  EAttribute getNetPort_Speed();

  /**
   * Returns the meta object for the attribute list '{@link net.sf.smbt.comm.script.netConf.NetPort#getPorts <em>Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Ports</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetPort#getPorts()
   * @see #getNetPort()
   * @generated
   */
  EAttribute getNetPort_Ports();

  /**
   * Returns the meta object for the attribute list '{@link net.sf.smbt.comm.script.netConf.NetPort#getIpExpr <em>Ip Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Ip Expr</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetPort#getIpExpr()
   * @see #getNetPort()
   * @generated
   */
  EAttribute getNetPort_IpExpr();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.comm.script.netConf.NetPort#getMode <em>Mode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mode</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetPort#getMode()
   * @see #getNetPort()
   * @generated
   */
  EAttribute getNetPort_Mode();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.comm.script.netConf.NetDecoder <em>Net Decoder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Net Decoder</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetDecoder
   * @generated
   */
  EClass getNetDecoder();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.comm.script.netConf.NetDecoder#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetDecoder#getName()
   * @see #getNetDecoder()
   * @generated
   */
  EAttribute getNetDecoder_Name();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.comm.script.netConf.NetDecoder#getClazz <em>Clazz</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Clazz</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetDecoder#getClazz()
   * @see #getNetDecoder()
   * @generated
   */
  EAttribute getNetDecoder_Clazz();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.comm.script.netConf.NetInterpreter <em>Net Interpreter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Net Interpreter</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetInterpreter
   * @generated
   */
  EClass getNetInterpreter();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.comm.script.netConf.NetInterpreter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetInterpreter#getName()
   * @see #getNetInterpreter()
   * @generated
   */
  EAttribute getNetInterpreter_Name();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.comm.script.netConf.NetInterpreter#getClazz <em>Clazz</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Clazz</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetInterpreter#getClazz()
   * @see #getNetInterpreter()
   * @generated
   */
  EAttribute getNetInterpreter_Clazz();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.comm.script.netConf.NetListener <em>Net Listener</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Net Listener</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetListener
   * @generated
   */
  EClass getNetListener();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.comm.script.netConf.NetListener#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetListener#getName()
   * @see #getNetListener()
   * @generated
   */
  EAttribute getNetListener_Name();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.comm.script.netConf.NetListener#getClazz <em>Clazz</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Clazz</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetListener#getClazz()
   * @see #getNetListener()
   * @generated
   */
  EAttribute getNetListener_Clazz();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.comm.script.netConf.NetOrchestrorScope <em>Net Orchestror Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Net Orchestror Scope</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetOrchestrorScope
   * @generated
   */
  EClass getNetOrchestrorScope();

  /**
   * Returns the meta object for the reference '{@link net.sf.smbt.comm.script.netConf.NetOrchestrorScope#getDslOrchestror <em>Dsl Orchestror</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dsl Orchestror</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetOrchestrorScope#getDslOrchestror()
   * @see #getNetOrchestrorScope()
   * @generated
   */
  EReference getNetOrchestrorScope_DslOrchestror();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.smbt.comm.script.netConf.NetOrchestrorScope#getBinds <em>Binds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Binds</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetOrchestrorScope#getBinds()
   * @see #getNetOrchestrorScope()
   * @generated
   */
  EReference getNetOrchestrorScope_Binds();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.comm.script.netConf.NetBind <em>Net Bind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Net Bind</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetBind
   * @generated
   */
  EClass getNetBind();

  /**
   * Returns the meta object for the reference '{@link net.sf.smbt.comm.script.netConf.NetBind#getEngine <em>Engine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Engine</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetBind#getEngine()
   * @see #getNetBind()
   * @generated
   */
  EReference getNetBind_Engine();

  /**
   * Returns the meta object for the reference '{@link net.sf.smbt.comm.script.netConf.NetBind#getInterpreter <em>Interpreter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Interpreter</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetBind#getInterpreter()
   * @see #getNetBind()
   * @generated
   */
  EReference getNetBind_Interpreter();

  /**
   * Returns the meta object for the reference list '{@link net.sf.smbt.comm.script.netConf.NetBind#getCmdInject <em>Cmd Inject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Cmd Inject</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetBind#getCmdInject()
   * @see #getNetBind()
   * @generated
   */
  EReference getNetBind_CmdInject();

  /**
   * Returns the meta object for the reference '{@link net.sf.smbt.comm.script.netConf.NetBind#getDecoder <em>Decoder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Decoder</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetBind#getDecoder()
   * @see #getNetBind()
   * @generated
   */
  EReference getNetBind_Decoder();

  /**
   * Returns the meta object for the reference list '{@link net.sf.smbt.comm.script.netConf.NetBind#getFrameInject <em>Frame Inject</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Frame Inject</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetBind#getFrameInject()
   * @see #getNetBind()
   * @generated
   */
  EReference getNetBind_FrameInject();

  /**
   * Returns the meta object for the reference '{@link net.sf.smbt.comm.script.netConf.NetBind#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Port</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetBind#getPort()
   * @see #getNetBind()
   * @generated
   */
  EReference getNetBind_Port();

  /**
   * Returns the meta object for the reference list '{@link net.sf.smbt.comm.script.netConf.NetBind#getListeners <em>Listeners</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Listeners</em>'.
   * @see net.sf.smbt.comm.script.netConf.NetBind#getListeners()
   * @see #getNetBind()
   * @generated
   */
  EReference getNetBind_Listeners();

  /**
   * Returns the meta object for enum '{@link net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL <em>TRANSPORT PROTOCOL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>TRANSPORT PROTOCOL</em>'.
   * @see net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL
   * @generated
   */
  EEnum getTRANSPORT_PROTOCOL();

  /**
   * Returns the meta object for enum '{@link net.sf.smbt.comm.script.netConf.RxKind <em>Rx Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Rx Kind</em>'.
   * @see net.sf.smbt.comm.script.netConf.RxKind
   * @generated
   */
  EEnum getRxKind();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  NetConfFactory getNetConfFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link net.sf.smbt.comm.script.netConf.impl.NetCfgImpl <em>Net Cfg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.comm.script.netConf.impl.NetCfgImpl
     * @see net.sf.smbt.comm.script.netConf.impl.NetConfPackageImpl#getNetCfg()
     * @generated
     */
    EClass NET_CFG = eINSTANCE.getNetCfg();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NET_CFG__IMPORTS = eINSTANCE.getNetCfg_Imports();

    /**
     * The meta object literal for the '<em><b>Listeners</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NET_CFG__LISTENERS = eINSTANCE.getNetCfg_Listeners();

    /**
     * The meta object literal for the '<em><b>Interpreters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NET_CFG__INTERPRETERS = eINSTANCE.getNetCfg_Interpreters();

    /**
     * The meta object literal for the '<em><b>Decoders</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NET_CFG__DECODERS = eINSTANCE.getNetCfg_Decoders();

    /**
     * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NET_CFG__PORTS = eINSTANCE.getNetCfg_Ports();

    /**
     * The meta object literal for the '<em><b>Orchestror Scopes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NET_CFG__ORCHESTROR_SCOPES = eINSTANCE.getNetCfg_OrchestrorScopes();

    /**
     * The meta object literal for the '{@link net.sf.smbt.comm.script.netConf.impl.DSLOrchestrorImportImpl <em>DSL Orchestror Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.comm.script.netConf.impl.DSLOrchestrorImportImpl
     * @see net.sf.smbt.comm.script.netConf.impl.NetConfPackageImpl#getDSLOrchestrorImport()
     * @generated
     */
    EClass DSL_ORCHESTROR_IMPORT = eINSTANCE.getDSLOrchestrorImport();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DSL_ORCHESTROR_IMPORT__IMPORT_URI = eINSTANCE.getDSLOrchestrorImport_ImportURI();

    /**
     * The meta object literal for the '{@link net.sf.smbt.comm.script.netConf.impl.NetPortImpl <em>Net Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.comm.script.netConf.impl.NetPortImpl
     * @see net.sf.smbt.comm.script.netConf.impl.NetConfPackageImpl#getNetPort()
     * @generated
     */
    EClass NET_PORT = eINSTANCE.getNetPort();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NET_PORT__NAME = eINSTANCE.getNetPort_Name();

    /**
     * The meta object literal for the '<em><b>Port ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NET_PORT__PORT_ID = eINSTANCE.getNetPort_PortID();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NET_PORT__KIND = eINSTANCE.getNetPort_Kind();

    /**
     * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NET_PORT__SPEED = eINSTANCE.getNetPort_Speed();

    /**
     * The meta object literal for the '<em><b>Ports</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NET_PORT__PORTS = eINSTANCE.getNetPort_Ports();

    /**
     * The meta object literal for the '<em><b>Ip Expr</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NET_PORT__IP_EXPR = eINSTANCE.getNetPort_IpExpr();

    /**
     * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NET_PORT__MODE = eINSTANCE.getNetPort_Mode();

    /**
     * The meta object literal for the '{@link net.sf.smbt.comm.script.netConf.impl.NetDecoderImpl <em>Net Decoder</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.comm.script.netConf.impl.NetDecoderImpl
     * @see net.sf.smbt.comm.script.netConf.impl.NetConfPackageImpl#getNetDecoder()
     * @generated
     */
    EClass NET_DECODER = eINSTANCE.getNetDecoder();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NET_DECODER__NAME = eINSTANCE.getNetDecoder_Name();

    /**
     * The meta object literal for the '<em><b>Clazz</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NET_DECODER__CLAZZ = eINSTANCE.getNetDecoder_Clazz();

    /**
     * The meta object literal for the '{@link net.sf.smbt.comm.script.netConf.impl.NetInterpreterImpl <em>Net Interpreter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.comm.script.netConf.impl.NetInterpreterImpl
     * @see net.sf.smbt.comm.script.netConf.impl.NetConfPackageImpl#getNetInterpreter()
     * @generated
     */
    EClass NET_INTERPRETER = eINSTANCE.getNetInterpreter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NET_INTERPRETER__NAME = eINSTANCE.getNetInterpreter_Name();

    /**
     * The meta object literal for the '<em><b>Clazz</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NET_INTERPRETER__CLAZZ = eINSTANCE.getNetInterpreter_Clazz();

    /**
     * The meta object literal for the '{@link net.sf.smbt.comm.script.netConf.impl.NetListenerImpl <em>Net Listener</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.comm.script.netConf.impl.NetListenerImpl
     * @see net.sf.smbt.comm.script.netConf.impl.NetConfPackageImpl#getNetListener()
     * @generated
     */
    EClass NET_LISTENER = eINSTANCE.getNetListener();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NET_LISTENER__NAME = eINSTANCE.getNetListener_Name();

    /**
     * The meta object literal for the '<em><b>Clazz</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NET_LISTENER__CLAZZ = eINSTANCE.getNetListener_Clazz();

    /**
     * The meta object literal for the '{@link net.sf.smbt.comm.script.netConf.impl.NetOrchestrorScopeImpl <em>Net Orchestror Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.comm.script.netConf.impl.NetOrchestrorScopeImpl
     * @see net.sf.smbt.comm.script.netConf.impl.NetConfPackageImpl#getNetOrchestrorScope()
     * @generated
     */
    EClass NET_ORCHESTROR_SCOPE = eINSTANCE.getNetOrchestrorScope();

    /**
     * The meta object literal for the '<em><b>Dsl Orchestror</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NET_ORCHESTROR_SCOPE__DSL_ORCHESTROR = eINSTANCE.getNetOrchestrorScope_DslOrchestror();

    /**
     * The meta object literal for the '<em><b>Binds</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NET_ORCHESTROR_SCOPE__BINDS = eINSTANCE.getNetOrchestrorScope_Binds();

    /**
     * The meta object literal for the '{@link net.sf.smbt.comm.script.netConf.impl.NetBindImpl <em>Net Bind</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.comm.script.netConf.impl.NetBindImpl
     * @see net.sf.smbt.comm.script.netConf.impl.NetConfPackageImpl#getNetBind()
     * @generated
     */
    EClass NET_BIND = eINSTANCE.getNetBind();

    /**
     * The meta object literal for the '<em><b>Engine</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NET_BIND__ENGINE = eINSTANCE.getNetBind_Engine();

    /**
     * The meta object literal for the '<em><b>Interpreter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NET_BIND__INTERPRETER = eINSTANCE.getNetBind_Interpreter();

    /**
     * The meta object literal for the '<em><b>Cmd Inject</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NET_BIND__CMD_INJECT = eINSTANCE.getNetBind_CmdInject();

    /**
     * The meta object literal for the '<em><b>Decoder</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NET_BIND__DECODER = eINSTANCE.getNetBind_Decoder();

    /**
     * The meta object literal for the '<em><b>Frame Inject</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NET_BIND__FRAME_INJECT = eINSTANCE.getNetBind_FrameInject();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NET_BIND__PORT = eINSTANCE.getNetBind_Port();

    /**
     * The meta object literal for the '<em><b>Listeners</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NET_BIND__LISTENERS = eINSTANCE.getNetBind_Listeners();

    /**
     * The meta object literal for the '{@link net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL <em>TRANSPORT PROTOCOL</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL
     * @see net.sf.smbt.comm.script.netConf.impl.NetConfPackageImpl#getTRANSPORT_PROTOCOL()
     * @generated
     */
    EEnum TRANSPORT_PROTOCOL = eINSTANCE.getTRANSPORT_PROTOCOL();

    /**
     * The meta object literal for the '{@link net.sf.smbt.comm.script.netConf.RxKind <em>Rx Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.comm.script.netConf.RxKind
     * @see net.sf.smbt.comm.script.netConf.impl.NetConfPackageImpl#getRxKind()
     * @generated
     */
    EEnum RX_KIND = eINSTANCE.getRxKind();

  }

} //NetConfPackage
