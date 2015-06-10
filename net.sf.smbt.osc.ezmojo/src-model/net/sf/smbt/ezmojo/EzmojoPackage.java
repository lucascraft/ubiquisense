/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmojo;

import net.sf.smbt.xcp.XcpPackage;
import net.sf.xqz.model.cmd.CmdPackage;
import net.sf.xqz.model.engine.EnginePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see net.sf.smbt.ezmojo.EzmojoFactory
 * @model kind="package"
 * @generated
 */
public interface EzmojoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezmojo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ezmojo/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezmojo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzmojoPackage eINSTANCE = net.sf.smbt.ezmojo.impl.EzmojoPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmojo.impl.EZMojoNodeImpl <em>EZ Mojo Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmojo.impl.EZMojoNodeImpl
	 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEZMojoNode()
	 * @generated
	 */
	int EZ_MOJO_NODE = 0;

	/**
	 * The feature id for the '<em><b>Vars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_NODE__VARS = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_NODE__ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Ttl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_NODE__TTL = 2;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_NODE__TOKEN = 3;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_NODE__UUID = 4;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_NODE__SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Toggle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_NODE__TOGGLE = 6;

	/**
	 * The feature id for the '<em><b>Last Bang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_NODE__LAST_BANG = 7;

	/**
	 * The feature id for the '<em><b>Listeners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_NODE__LISTENERS = 8;

	/**
	 * The feature id for the '<em><b>Forwards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_NODE__FORWARDS = 9;

	/**
	 * The feature id for the '<em><b>Motions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_NODE__MOTIONS = 10;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_NODE__CLOCK = 11;

	/**
	 * The feature id for the '<em><b>Root</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_NODE__ROOT = 12;

	/**
	 * The feature id for the '<em><b>Hits Rate Per Sec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_NODE__HITS_RATE_PER_SEC = 13;

	/**
	 * The feature id for the '<em><b>Touches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_NODE__TOUCHES = 14;

	/**
	 * The feature id for the '<em><b>Scripts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_NODE__SCRIPTS = 15;

	/**
	 * The number of structural features of the '<em>EZ Mojo Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_NODE_FEATURE_COUNT = 16;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmojo.impl.EZMojoCmdImpl <em>EZ Mojo Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmojo.impl.EZMojoCmdImpl
	 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEZMojoCmd()
	 * @generated
	 */
	int EZ_MOJO_CMD = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_CMD__PRIORITY = CmdPackage.CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_CMD__STAMP = CmdPackage.CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_CMD__KIND = CmdPackage.CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Osc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_CMD__OSC = CmdPackage.CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_CMD__TARGETS = CmdPackage.CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_CMD__PROTOCOL = CmdPackage.CMD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EZ Mojo Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_CMD_FEATURE_COUNT = CmdPackage.CMD_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmojo.impl.EZVarImpl <em>EZ Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmojo.impl.EZVarImpl
	 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEZVar()
	 * @generated
	 */
	int EZ_VAR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_VAR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_VAR__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_VAR__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_VAR__KIND = 3;

	/**
	 * The number of structural features of the '<em>EZ Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_VAR_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmojo.impl.EZMojoRootImpl <em>EZ Mojo Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmojo.impl.EZMojoRootImpl
	 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEZMojoRoot()
	 * @generated
	 */
	int EZ_MOJO_ROOT = 3;

	/**
	 * The feature id for the '<em><b>Engines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_ROOT__ENGINES = EnginePackage.ICONNECTED_UNIT__ENGINES;

	/**
	 * The feature id for the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_ROOT__DEFAULT = EnginePackage.ICONNECTED_UNIT__DEFAULT;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_ROOT__ROOT = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_ROOT__SELECTED = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_ROOT__TARGETS = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Feedback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_ROOT__FEEDBACK = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Motion Reactor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_ROOT__MOTION_REACTOR = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Vars Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_ROOT__VARS_MODE = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Index</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_ROOT__INDEX = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>EZ Mojo Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_ROOT_FEATURE_COUNT = EnginePackage.ICONNECTED_UNIT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmojo.impl.EZMojoTargetImpl <em>EZ Mojo Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmojo.impl.EZMojoTargetImpl
	 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEZMojoTarget()
	 * @generated
	 */
	int EZ_MOJO_TARGET = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_TARGET__TYPE = XcpPackage.XCP_ADDRESS__TYPE;

	/**
	 * The feature id for the '<em><b>Addr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_TARGET__ADDR = XcpPackage.XCP_ADDRESS__ADDR;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_TARGET__PORTS = XcpPackage.XCP_ADDRESS__PORTS;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_TARGET__ALIAS = XcpPackage.XCP_ADDRESS__ALIAS;

	/**
	 * The feature id for the '<em><b>Transport ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_TARGET__TRANSPORT_ID = XcpPackage.XCP_ADDRESS__TRANSPORT_ID;

	/**
	 * The feature id for the '<em><b>Protocol ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_TARGET__PROTOCOL_ID = XcpPackage.XCP_ADDRESS__PROTOCOL_ID;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_TARGET__SPEED = XcpPackage.XCP_ADDRESS__SPEED;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_TARGET__PORT = XcpPackage.XCP_ADDRESS__PORT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_TARGET__NAME = XcpPackage.XCP_ADDRESS__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_TARGET__KIND = XcpPackage.XCP_ADDRESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hierarchical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_TARGET__HIERARCHICAL = XcpPackage.XCP_ADDRESS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EZ Mojo Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_TARGET_FEATURE_COUNT = XcpPackage.XCP_ADDRESS_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmojo.impl.EZMojoAgentCmdImpl <em>EZ Mojo Agent Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmojo.impl.EZMojoAgentCmdImpl
	 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEZMojoAgentCmd()
	 * @generated
	 */
	int EZ_MOJO_AGENT_CMD = 5;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_AGENT_CMD__PRIORITY = EZ_MOJO_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_AGENT_CMD__STAMP = EZ_MOJO_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_AGENT_CMD__KIND = EZ_MOJO_CMD__KIND;

	/**
	 * The feature id for the '<em><b>Osc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_AGENT_CMD__OSC = EZ_MOJO_CMD__OSC;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_AGENT_CMD__TARGETS = EZ_MOJO_CMD__TARGETS;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_AGENT_CMD__PROTOCOL = EZ_MOJO_CMD__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_AGENT_CMD__CMD = EZ_MOJO_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_AGENT_CMD__TEXT = EZ_MOJO_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EZ Mojo Agent Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_AGENT_CMD_FEATURE_COUNT = EZ_MOJO_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmojo.impl.EzMojoInfoCmdImpl <em>Ez Mojo Info Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmojo.impl.EzMojoInfoCmdImpl
	 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEzMojoInfoCmd()
	 * @generated
	 */
	int EZ_MOJO_INFO_CMD = 6;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_INFO_CMD__PRIORITY = CmdPackage.CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_INFO_CMD__STAMP = CmdPackage.CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_INFO_CMD__TEXT = CmdPackage.CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ez Mojo Info Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_INFO_CMD_FEATURE_COUNT = CmdPackage.CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmojo.impl.EzMojoServiceImpl <em>Ez Mojo Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmojo.impl.EzMojoServiceImpl
	 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEzMojoService()
	 * @generated
	 */
	int EZ_MOJO_SERVICE = 7;

	/**
	 * The feature id for the '<em><b>Service ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_SERVICE__SERVICE_ID = 0;

	/**
	 * The feature id for the '<em><b>Excluded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_SERVICE__EXCLUDED = 1;

	/**
	 * The number of structural features of the '<em>Ez Mojo Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_SERVICE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmojo.impl.EZMojoTargetedCmdImpl <em>EZ Mojo Targeted Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmojo.impl.EZMojoTargetedCmdImpl
	 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEZMojoTargetedCmd()
	 * @generated
	 */
	int EZ_MOJO_TARGETED_CMD = 8;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_TARGETED_CMD__PRIORITY = EZ_MOJO_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_TARGETED_CMD__STAMP = EZ_MOJO_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_TARGETED_CMD__KIND = EZ_MOJO_CMD__KIND;

	/**
	 * The feature id for the '<em><b>Osc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_TARGETED_CMD__OSC = EZ_MOJO_CMD__OSC;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_TARGETED_CMD__TARGETS = EZ_MOJO_CMD__TARGETS;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_TARGETED_CMD__PROTOCOL = EZ_MOJO_CMD__PROTOCOL;

	/**
	 * The number of structural features of the '<em>EZ Mojo Targeted Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_TARGETED_CMD_FEATURE_COUNT = EZ_MOJO_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmojo.impl.MotionEvalCtxImpl <em>Motion Eval Ctx</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmojo.impl.MotionEvalCtxImpl
	 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getMotionEvalCtx()
	 * @generated
	 */
	int MOTION_EVAL_CTX = 9;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_EVAL_CTX__CTX = 0;

	/**
	 * The feature id for the '<em><b>Kicked</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_EVAL_CTX__KICKED = 1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_EVAL_CTX__SCRIPT = 2;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_EVAL_CTX__NODE = 3;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_EVAL_CTX__CMD = 4;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_EVAL_CTX__STRATEGY = 5;

	/**
	 * The number of structural features of the '<em>Motion Eval Ctx</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_EVAL_CTX_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmojo.impl.EZScriptImpl <em>EZ Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmojo.impl.EZScriptImpl
	 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEZScript()
	 * @generated
	 */
	int EZ_SCRIPT = 10;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_SCRIPT__SCRIPT = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_SCRIPT__NODE = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_SCRIPT__LABEL = 2;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_SCRIPT__EVENTS = 3;

	/**
	 * The number of structural features of the '<em>EZ Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_SCRIPT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmojo.impl.EzMojoKinematicCmdImpl <em>Ez Mojo Kinematic Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmojo.impl.EzMojoKinematicCmdImpl
	 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEzMojoKinematicCmd()
	 * @generated
	 */
	int EZ_MOJO_KINEMATIC_CMD = 11;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_KINEMATIC_CMD__PRIORITY = EZ_MOJO_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_KINEMATIC_CMD__STAMP = EZ_MOJO_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_KINEMATIC_CMD__KIND = EZ_MOJO_CMD__KIND;

	/**
	 * The feature id for the '<em><b>Osc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_KINEMATIC_CMD__OSC = EZ_MOJO_CMD__OSC;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_KINEMATIC_CMD__TARGETS = EZ_MOJO_CMD__TARGETS;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_KINEMATIC_CMD__PROTOCOL = EZ_MOJO_CMD__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_KINEMATIC_CMD__SCRIPT = EZ_MOJO_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ez Mojo Kinematic Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_KINEMATIC_CMD_FEATURE_COUNT = EZ_MOJO_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmojo.impl.EZTUIOVarImpl <em>EZTUIO Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmojo.impl.EZTUIOVarImpl
	 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEZTUIOVar()
	 * @generated
	 */
	int EZTUIO_VAR = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZTUIO_VAR__NAME = EZ_VAR__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZTUIO_VAR__TYPE = EZ_VAR__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZTUIO_VAR__VALUE = EZ_VAR__VALUE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZTUIO_VAR__KIND = EZ_VAR__KIND;

	/**
	 * The feature id for the '<em><b>Motion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZTUIO_VAR__MOTION = EZ_VAR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>B3d</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZTUIO_VAR__B3D = EZ_VAR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>EZTUIO Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZTUIO_VAR_FEATURE_COUNT = EZ_VAR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmojo.impl.EZMojoMappedCmdImpl <em>EZ Mojo Mapped Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmojo.impl.EZMojoMappedCmdImpl
	 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEZMojoMappedCmd()
	 * @generated
	 */
	int EZ_MOJO_MAPPED_CMD = 13;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_MAPPED_CMD__PRIORITY = EZ_MOJO_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_MAPPED_CMD__STAMP = EZ_MOJO_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_MAPPED_CMD__KIND = EZ_MOJO_CMD__KIND;

	/**
	 * The feature id for the '<em><b>Osc</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_MAPPED_CMD__OSC = EZ_MOJO_CMD__OSC;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_MAPPED_CMD__TARGETS = EZ_MOJO_CMD__TARGETS;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_MAPPED_CMD__PROTOCOL = EZ_MOJO_CMD__PROTOCOL;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_MAPPED_CMD__ALIAS = EZ_MOJO_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EZ Mojo Mapped Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_MOJO_MAPPED_CMD_FEATURE_COUNT = EZ_MOJO_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmojo.impl.MotionReactorImpl <em>Motion Reactor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmojo.impl.MotionReactorImpl
	 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getMotionReactor()
	 * @generated
	 */
	int MOTION_REACTOR = 14;

	/**
	 * The feature id for the '<em><b>Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_REACTOR__JOB = 0;

	/**
	 * The number of structural features of the '<em>Motion Reactor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_REACTOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmojo.impl.Index2MojoNodeImpl <em>Index2 Mojo Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmojo.impl.Index2MojoNodeImpl
	 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getIndex2MojoNode()
	 * @generated
	 */
	int INDEX2_MOJO_NODE = 15;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX2_MOJO_NODE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX2_MOJO_NODE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Index2 Mojo Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX2_MOJO_NODE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmojo.impl.EZImpl <em>EZ</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmojo.impl.EZImpl
	 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEZ()
	 * @generated
	 */
	int EZ = 16;

	/**
	 * The feature id for the '<em><b>Configs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ__CONFIGS = 0;

	/**
	 * The number of structural features of the '<em>EZ</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmojo.impl.EZEventImpl <em>EZ Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmojo.impl.EZEventImpl
	 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEZEvent()
	 * @generated
	 */
	int EZ_EVENT = 17;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_EVENT__KIND = 0;

	/**
	 * The feature id for the '<em><b>Osc</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_EVENT__OSC = 1;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_EVENT__TARGETS = 2;

	/**
	 * The number of structural features of the '<em>EZ Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_EVENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmojo.EZMojoKind <em>EZ Mojo Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmojo.EZMojoKind
	 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEZMojoKind()
	 * @generated
	 */
	int EZ_MOJO_KIND = 18;


	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmojo.EZCmdKind <em>EZ Cmd Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmojo.EZCmdKind
	 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEZCmdKind()
	 * @generated
	 */
	int EZ_CMD_KIND = 19;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmojo.MotionEvalStrategy <em>Motion Eval Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmojo.MotionEvalStrategy
	 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getMotionEvalStrategy()
	 * @generated
	 */
	int MOTION_EVAL_STRATEGY = 20;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezmojo.EzVarKind <em>Ez Var Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezmojo.EzVarKind
	 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEzVarKind()
	 * @generated
	 */
	int EZ_VAR_KIND = 21;

	/**
	 * The meta object id for the '<em>Motion Engine</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.motion.engine.MotionEngine
	 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getMotionEngine()
	 * @generated
	 */
	int MOTION_ENGINE = 22;

	/**
	 * The meta object id for the '<em>Job</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.jobs.Job
	 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getJob()
	 * @generated
	 */
	int JOB = 23;

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezmojo.EZMojoNode <em>EZ Mojo Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EZ Mojo Node</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoNode
	 * @generated
	 */
	EClass getEZMojoNode();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezmojo.EZMojoNode#getVars <em>Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vars</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoNode#getVars()
	 * @see #getEZMojoNode()
	 * @generated
	 */
	EReference getEZMojoNode_Vars();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezmojo.EZMojoNode#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoNode#getElements()
	 * @see #getEZMojoNode()
	 * @generated
	 */
	EReference getEZMojoNode_Elements();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmojo.EZMojoNode#getTtl <em>Ttl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ttl</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoNode#getTtl()
	 * @see #getEZMojoNode()
	 * @generated
	 */
	EAttribute getEZMojoNode_Ttl();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmojo.EZMojoNode#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoNode#getToken()
	 * @see #getEZMojoNode()
	 * @generated
	 */
	EAttribute getEZMojoNode_Token();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmojo.EZMojoNode#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoNode#getUuid()
	 * @see #getEZMojoNode()
	 * @generated
	 */
	EAttribute getEZMojoNode_Uuid();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ezmojo.EZMojoNode#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoNode#getService()
	 * @see #getEZMojoNode()
	 * @generated
	 */
	EReference getEZMojoNode_Service();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmojo.EZMojoNode#isToggle <em>Toggle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Toggle</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoNode#isToggle()
	 * @see #getEZMojoNode()
	 * @generated
	 */
	EAttribute getEZMojoNode_Toggle();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmojo.EZMojoNode#getLastBang <em>Last Bang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Bang</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoNode#getLastBang()
	 * @see #getEZMojoNode()
	 * @generated
	 */
	EAttribute getEZMojoNode_LastBang();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezmojo.EZMojoNode#getListeners <em>Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Listeners</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoNode#getListeners()
	 * @see #getEZMojoNode()
	 * @generated
	 */
	EReference getEZMojoNode_Listeners();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezmojo.EZMojoNode#getForwards <em>Forwards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forwards</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoNode#getForwards()
	 * @see #getEZMojoNode()
	 * @generated
	 */
	EReference getEZMojoNode_Forwards();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezmojo.EZMojoNode#getMotions <em>Motions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Motions</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoNode#getMotions()
	 * @see #getEZMojoNode()
	 * @generated
	 */
	EReference getEZMojoNode_Motions();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmojo.EZMojoNode#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clock</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoNode#getClock()
	 * @see #getEZMojoNode()
	 * @generated
	 */
	EAttribute getEZMojoNode_Clock();

	/**
	 * Returns the meta object for the container reference '{@link net.sf.smbt.ezmojo.EZMojoNode#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Root</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoNode#getRoot()
	 * @see #getEZMojoNode()
	 * @generated
	 */
	EReference getEZMojoNode_Root();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmojo.EZMojoNode#getHitsRatePerSec <em>Hits Rate Per Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hits Rate Per Sec</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoNode#getHitsRatePerSec()
	 * @see #getEZMojoNode()
	 * @generated
	 */
	EAttribute getEZMojoNode_HitsRatePerSec();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmojo.EZMojoNode#getTouches <em>Touches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Touches</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoNode#getTouches()
	 * @see #getEZMojoNode()
	 * @generated
	 */
	EAttribute getEZMojoNode_Touches();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezmojo.EZMojoNode#getScripts <em>Scripts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scripts</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoNode#getScripts()
	 * @see #getEZMojoNode()
	 * @generated
	 */
	EReference getEZMojoNode_Scripts();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezmojo.EZMojoCmd <em>EZ Mojo Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EZ Mojo Cmd</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoCmd
	 * @generated
	 */
	EClass getEZMojoCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmojo.EZMojoCmd#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoCmd#getKind()
	 * @see #getEZMojoCmd()
	 * @generated
	 */
	EAttribute getEZMojoCmd_Kind();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezmojo.EZMojoCmd#getOsc <em>Osc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Osc</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoCmd#getOsc()
	 * @see #getEZMojoCmd()
	 * @generated
	 */
	EReference getEZMojoCmd_Osc();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezmojo.EZMojoCmd#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Targets</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoCmd#getTargets()
	 * @see #getEZMojoCmd()
	 * @generated
	 */
	EReference getEZMojoCmd_Targets();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmojo.EZMojoCmd#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoCmd#getProtocol()
	 * @see #getEZMojoCmd()
	 * @generated
	 */
	EAttribute getEZMojoCmd_Protocol();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezmojo.EZVar <em>EZ Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EZ Var</em>'.
	 * @see net.sf.smbt.ezmojo.EZVar
	 * @generated
	 */
	EClass getEZVar();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmojo.EZVar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.ezmojo.EZVar#getName()
	 * @see #getEZVar()
	 * @generated
	 */
	EAttribute getEZVar_Name();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezmojo.EZVar#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see net.sf.smbt.ezmojo.EZVar#getType()
	 * @see #getEZVar()
	 * @generated
	 */
	EReference getEZVar_Type();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmojo.EZVar#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.ezmojo.EZVar#getValue()
	 * @see #getEZVar()
	 * @generated
	 */
	EAttribute getEZVar_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmojo.EZVar#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see net.sf.smbt.ezmojo.EZVar#getKind()
	 * @see #getEZVar()
	 * @generated
	 */
	EAttribute getEZVar_Kind();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezmojo.EZMojoRoot <em>EZ Mojo Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EZ Mojo Root</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoRoot
	 * @generated
	 */
	EClass getEZMojoRoot();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ezmojo.EZMojoRoot#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoRoot#getRoot()
	 * @see #getEZMojoRoot()
	 * @generated
	 */
	EReference getEZMojoRoot_Root();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezmojo.EZMojoRoot#getSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selected</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoRoot#getSelected()
	 * @see #getEZMojoRoot()
	 * @generated
	 */
	EReference getEZMojoRoot_Selected();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezmojo.EZMojoRoot#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Targets</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoRoot#getTargets()
	 * @see #getEZMojoRoot()
	 * @generated
	 */
	EReference getEZMojoRoot_Targets();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmojo.EZMojoRoot#isFeedback <em>Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feedback</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoRoot#isFeedback()
	 * @see #getEZMojoRoot()
	 * @generated
	 */
	EAttribute getEZMojoRoot_Feedback();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.ezmojo.EZMojoRoot#getMotionReactor <em>Motion Reactor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Motion Reactor</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoRoot#getMotionReactor()
	 * @see #getEZMojoRoot()
	 * @generated
	 */
	EReference getEZMojoRoot_MotionReactor();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmojo.EZMojoRoot#isVarsMode <em>Vars Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vars Mode</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoRoot#isVarsMode()
	 * @see #getEZMojoRoot()
	 * @generated
	 */
	EAttribute getEZMojoRoot_VarsMode();

	/**
	 * Returns the meta object for the map '{@link net.sf.smbt.ezmojo.EZMojoRoot#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Index</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoRoot#getIndex()
	 * @see #getEZMojoRoot()
	 * @generated
	 */
	EReference getEZMojoRoot_Index();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezmojo.EZMojoTarget <em>EZ Mojo Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EZ Mojo Target</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoTarget
	 * @generated
	 */
	EClass getEZMojoTarget();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmojo.EZMojoTarget#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoTarget#getKind()
	 * @see #getEZMojoTarget()
	 * @generated
	 */
	EAttribute getEZMojoTarget_Kind();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmojo.EZMojoTarget#isHierarchical <em>Hierarchical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hierarchical</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoTarget#isHierarchical()
	 * @see #getEZMojoTarget()
	 * @generated
	 */
	EAttribute getEZMojoTarget_Hierarchical();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezmojo.EZMojoAgentCmd <em>EZ Mojo Agent Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EZ Mojo Agent Cmd</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoAgentCmd
	 * @generated
	 */
	EClass getEZMojoAgentCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmojo.EZMojoAgentCmd#getCmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cmd</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoAgentCmd#getCmd()
	 * @see #getEZMojoAgentCmd()
	 * @generated
	 */
	EAttribute getEZMojoAgentCmd_Cmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmojo.EZMojoAgentCmd#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoAgentCmd#getText()
	 * @see #getEZMojoAgentCmd()
	 * @generated
	 */
	EAttribute getEZMojoAgentCmd_Text();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezmojo.EzMojoInfoCmd <em>Ez Mojo Info Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ez Mojo Info Cmd</em>'.
	 * @see net.sf.smbt.ezmojo.EzMojoInfoCmd
	 * @generated
	 */
	EClass getEzMojoInfoCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmojo.EzMojoInfoCmd#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see net.sf.smbt.ezmojo.EzMojoInfoCmd#getText()
	 * @see #getEzMojoInfoCmd()
	 * @generated
	 */
	EAttribute getEzMojoInfoCmd_Text();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezmojo.EzMojoService <em>Ez Mojo Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ez Mojo Service</em>'.
	 * @see net.sf.smbt.ezmojo.EzMojoService
	 * @generated
	 */
	EClass getEzMojoService();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmojo.EzMojoService#getServiceID <em>Service ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service ID</em>'.
	 * @see net.sf.smbt.ezmojo.EzMojoService#getServiceID()
	 * @see #getEzMojoService()
	 * @generated
	 */
	EAttribute getEzMojoService_ServiceID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmojo.EzMojoService#isExcluded <em>Excluded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Excluded</em>'.
	 * @see net.sf.smbt.ezmojo.EzMojoService#isExcluded()
	 * @see #getEzMojoService()
	 * @generated
	 */
	EAttribute getEzMojoService_Excluded();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezmojo.EZMojoTargetedCmd <em>EZ Mojo Targeted Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EZ Mojo Targeted Cmd</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoTargetedCmd
	 * @generated
	 */
	EClass getEZMojoTargetedCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezmojo.MotionEvalCtx <em>Motion Eval Ctx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motion Eval Ctx</em>'.
	 * @see net.sf.smbt.ezmojo.MotionEvalCtx
	 * @generated
	 */
	EClass getMotionEvalCtx();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.ezmojo.MotionEvalCtx#getCtx <em>Ctx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ctx</em>'.
	 * @see net.sf.smbt.ezmojo.MotionEvalCtx#getCtx()
	 * @see #getMotionEvalCtx()
	 * @generated
	 */
	EReference getMotionEvalCtx_Ctx();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezmojo.MotionEvalCtx#getKicked <em>Kicked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Kicked</em>'.
	 * @see net.sf.smbt.ezmojo.MotionEvalCtx#getKicked()
	 * @see #getMotionEvalCtx()
	 * @generated
	 */
	EReference getMotionEvalCtx_Kicked();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezmojo.MotionEvalCtx#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Script</em>'.
	 * @see net.sf.smbt.ezmojo.MotionEvalCtx#getScript()
	 * @see #getMotionEvalCtx()
	 * @generated
	 */
	EReference getMotionEvalCtx_Script();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezmojo.MotionEvalCtx#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see net.sf.smbt.ezmojo.MotionEvalCtx#getNode()
	 * @see #getMotionEvalCtx()
	 * @generated
	 */
	EReference getMotionEvalCtx_Node();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezmojo.MotionEvalCtx#getCmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cmd</em>'.
	 * @see net.sf.smbt.ezmojo.MotionEvalCtx#getCmd()
	 * @see #getMotionEvalCtx()
	 * @generated
	 */
	EReference getMotionEvalCtx_Cmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmojo.MotionEvalCtx#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy</em>'.
	 * @see net.sf.smbt.ezmojo.MotionEvalCtx#getStrategy()
	 * @see #getMotionEvalCtx()
	 * @generated
	 */
	EAttribute getMotionEvalCtx_Strategy();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezmojo.EZScript <em>EZ Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EZ Script</em>'.
	 * @see net.sf.smbt.ezmojo.EZScript
	 * @generated
	 */
	EClass getEZScript();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmojo.EZScript#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see net.sf.smbt.ezmojo.EZScript#getScript()
	 * @see #getEZScript()
	 * @generated
	 */
	EAttribute getEZScript_Script();

	/**
	 * Returns the meta object for the container reference '{@link net.sf.smbt.ezmojo.EZScript#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Node</em>'.
	 * @see net.sf.smbt.ezmojo.EZScript#getNode()
	 * @see #getEZScript()
	 * @generated
	 */
	EReference getEZScript_Node();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmojo.EZScript#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.sf.smbt.ezmojo.EZScript#getLabel()
	 * @see #getEZScript()
	 * @generated
	 */
	EAttribute getEZScript_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezmojo.EZScript#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see net.sf.smbt.ezmojo.EZScript#getEvents()
	 * @see #getEZScript()
	 * @generated
	 */
	EReference getEZScript_Events();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezmojo.EzMojoKinematicCmd <em>Ez Mojo Kinematic Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ez Mojo Kinematic Cmd</em>'.
	 * @see net.sf.smbt.ezmojo.EzMojoKinematicCmd
	 * @generated
	 */
	EClass getEzMojoKinematicCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmojo.EzMojoKinematicCmd#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script</em>'.
	 * @see net.sf.smbt.ezmojo.EzMojoKinematicCmd#getScript()
	 * @see #getEzMojoKinematicCmd()
	 * @generated
	 */
	EAttribute getEzMojoKinematicCmd_Script();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezmojo.EZTUIOVar <em>EZTUIO Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EZTUIO Var</em>'.
	 * @see net.sf.smbt.ezmojo.EZTUIOVar
	 * @generated
	 */
	EClass getEZTUIOVar();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezmojo.EZTUIOVar#getMotion <em>Motion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Motion</em>'.
	 * @see net.sf.smbt.ezmojo.EZTUIOVar#getMotion()
	 * @see #getEZTUIOVar()
	 * @generated
	 */
	EReference getEZTUIOVar_Motion();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.ezmojo.EZTUIOVar#getB3d <em>B3d</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>B3d</em>'.
	 * @see net.sf.smbt.ezmojo.EZTUIOVar#getB3d()
	 * @see #getEZTUIOVar()
	 * @generated
	 */
	EReference getEZTUIOVar_B3d();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezmojo.EZMojoMappedCmd <em>EZ Mojo Mapped Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EZ Mojo Mapped Cmd</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoMappedCmd
	 * @generated
	 */
	EClass getEZMojoMappedCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmojo.EZMojoMappedCmd#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoMappedCmd#getAlias()
	 * @see #getEZMojoMappedCmd()
	 * @generated
	 */
	EAttribute getEZMojoMappedCmd_Alias();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezmojo.MotionReactor <em>Motion Reactor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motion Reactor</em>'.
	 * @see net.sf.smbt.ezmojo.MotionReactor
	 * @generated
	 */
	EClass getMotionReactor();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmojo.MotionReactor#getJob <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job</em>'.
	 * @see net.sf.smbt.ezmojo.MotionReactor#getJob()
	 * @see #getMotionReactor()
	 * @generated
	 */
	EAttribute getMotionReactor_Job();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Index2 Mojo Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index2 Mojo Node</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="net.sf.smbt.ezmojo.EZMojoNode"
	 * @generated
	 */
	EClass getIndex2MojoNode();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getIndex2MojoNode()
	 * @generated
	 */
	EAttribute getIndex2MojoNode_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getIndex2MojoNode()
	 * @generated
	 */
	EReference getIndex2MojoNode_Value();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezmojo.EZ <em>EZ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EZ</em>'.
	 * @see net.sf.smbt.ezmojo.EZ
	 * @generated
	 */
	EClass getEZ();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezmojo.EZ#getConfigs <em>Configs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configs</em>'.
	 * @see net.sf.smbt.ezmojo.EZ#getConfigs()
	 * @see #getEZ()
	 * @generated
	 */
	EReference getEZ_Configs();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezmojo.EZEvent <em>EZ Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EZ Event</em>'.
	 * @see net.sf.smbt.ezmojo.EZEvent
	 * @generated
	 */
	EClass getEZEvent();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezmojo.EZEvent#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see net.sf.smbt.ezmojo.EZEvent#getKind()
	 * @see #getEZEvent()
	 * @generated
	 */
	EAttribute getEZEvent_Kind();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezmojo.EZEvent#getOsc <em>Osc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Osc</em>'.
	 * @see net.sf.smbt.ezmojo.EZEvent#getOsc()
	 * @see #getEZEvent()
	 * @generated
	 */
	EReference getEZEvent_Osc();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.ezmojo.EZEvent#getTargets <em>Targets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Targets</em>'.
	 * @see net.sf.smbt.ezmojo.EZEvent#getTargets()
	 * @see #getEZEvent()
	 * @generated
	 */
	EReference getEZEvent_Targets();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezmojo.EZMojoKind <em>EZ Mojo Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EZ Mojo Kind</em>'.
	 * @see net.sf.smbt.ezmojo.EZMojoKind
	 * @generated
	 */
	EEnum getEZMojoKind();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezmojo.EZCmdKind <em>EZ Cmd Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EZ Cmd Kind</em>'.
	 * @see net.sf.smbt.ezmojo.EZCmdKind
	 * @generated
	 */
	EEnum getEZCmdKind();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezmojo.MotionEvalStrategy <em>Motion Eval Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Motion Eval Strategy</em>'.
	 * @see net.sf.smbt.ezmojo.MotionEvalStrategy
	 * @generated
	 */
	EEnum getMotionEvalStrategy();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezmojo.EzVarKind <em>Ez Var Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ez Var Kind</em>'.
	 * @see net.sf.smbt.ezmojo.EzVarKind
	 * @generated
	 */
	EEnum getEzVarKind();

	/**
	 * Returns the meta object for data type '{@link net.sf.smbt.motion.engine.MotionEngine <em>Motion Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Motion Engine</em>'.
	 * @see net.sf.smbt.motion.engine.MotionEngine
	 * @model instanceClass="net.sf.smbt.motion.engine.MotionEngine"
	 * @generated
	 */
	EDataType getMotionEngine();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.jobs.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Job</em>'.
	 * @see org.eclipse.core.runtime.jobs.Job
	 * @model instanceClass="org.eclipse.core.runtime.jobs.Job"
	 * @generated
	 */
	EDataType getJob();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EzmojoFactory getEzmojoFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmojo.impl.EZMojoNodeImpl <em>EZ Mojo Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmojo.impl.EZMojoNodeImpl
		 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEZMojoNode()
		 * @generated
		 */
		EClass EZ_MOJO_NODE = eINSTANCE.getEZMojoNode();

		/**
		 * The meta object literal for the '<em><b>Vars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_MOJO_NODE__VARS = eINSTANCE.getEZMojoNode_Vars();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_MOJO_NODE__ELEMENTS = eINSTANCE.getEZMojoNode_Elements();

		/**
		 * The meta object literal for the '<em><b>Ttl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_MOJO_NODE__TTL = eINSTANCE.getEZMojoNode_Ttl();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_MOJO_NODE__TOKEN = eINSTANCE.getEZMojoNode_Token();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_MOJO_NODE__UUID = eINSTANCE.getEZMojoNode_Uuid();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_MOJO_NODE__SERVICE = eINSTANCE.getEZMojoNode_Service();

		/**
		 * The meta object literal for the '<em><b>Toggle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_MOJO_NODE__TOGGLE = eINSTANCE.getEZMojoNode_Toggle();

		/**
		 * The meta object literal for the '<em><b>Last Bang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_MOJO_NODE__LAST_BANG = eINSTANCE.getEZMojoNode_LastBang();

		/**
		 * The meta object literal for the '<em><b>Listeners</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_MOJO_NODE__LISTENERS = eINSTANCE.getEZMojoNode_Listeners();

		/**
		 * The meta object literal for the '<em><b>Forwards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_MOJO_NODE__FORWARDS = eINSTANCE.getEZMojoNode_Forwards();

		/**
		 * The meta object literal for the '<em><b>Motions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_MOJO_NODE__MOTIONS = eINSTANCE.getEZMojoNode_Motions();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_MOJO_NODE__CLOCK = eINSTANCE.getEZMojoNode_Clock();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_MOJO_NODE__ROOT = eINSTANCE.getEZMojoNode_Root();

		/**
		 * The meta object literal for the '<em><b>Hits Rate Per Sec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_MOJO_NODE__HITS_RATE_PER_SEC = eINSTANCE.getEZMojoNode_HitsRatePerSec();

		/**
		 * The meta object literal for the '<em><b>Touches</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_MOJO_NODE__TOUCHES = eINSTANCE.getEZMojoNode_Touches();

		/**
		 * The meta object literal for the '<em><b>Scripts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_MOJO_NODE__SCRIPTS = eINSTANCE.getEZMojoNode_Scripts();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmojo.impl.EZMojoCmdImpl <em>EZ Mojo Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmojo.impl.EZMojoCmdImpl
		 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEZMojoCmd()
		 * @generated
		 */
		EClass EZ_MOJO_CMD = eINSTANCE.getEZMojoCmd();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_MOJO_CMD__KIND = eINSTANCE.getEZMojoCmd_Kind();

		/**
		 * The meta object literal for the '<em><b>Osc</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_MOJO_CMD__OSC = eINSTANCE.getEZMojoCmd_Osc();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_MOJO_CMD__TARGETS = eINSTANCE.getEZMojoCmd_Targets();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_MOJO_CMD__PROTOCOL = eINSTANCE.getEZMojoCmd_Protocol();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmojo.impl.EZVarImpl <em>EZ Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmojo.impl.EZVarImpl
		 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEZVar()
		 * @generated
		 */
		EClass EZ_VAR = eINSTANCE.getEZVar();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_VAR__NAME = eINSTANCE.getEZVar_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_VAR__TYPE = eINSTANCE.getEZVar_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_VAR__VALUE = eINSTANCE.getEZVar_Value();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_VAR__KIND = eINSTANCE.getEZVar_Kind();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmojo.impl.EZMojoRootImpl <em>EZ Mojo Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmojo.impl.EZMojoRootImpl
		 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEZMojoRoot()
		 * @generated
		 */
		EClass EZ_MOJO_ROOT = eINSTANCE.getEZMojoRoot();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_MOJO_ROOT__ROOT = eINSTANCE.getEZMojoRoot_Root();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_MOJO_ROOT__SELECTED = eINSTANCE.getEZMojoRoot_Selected();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_MOJO_ROOT__TARGETS = eINSTANCE.getEZMojoRoot_Targets();

		/**
		 * The meta object literal for the '<em><b>Feedback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_MOJO_ROOT__FEEDBACK = eINSTANCE.getEZMojoRoot_Feedback();

		/**
		 * The meta object literal for the '<em><b>Motion Reactor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_MOJO_ROOT__MOTION_REACTOR = eINSTANCE.getEZMojoRoot_MotionReactor();

		/**
		 * The meta object literal for the '<em><b>Vars Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_MOJO_ROOT__VARS_MODE = eINSTANCE.getEZMojoRoot_VarsMode();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_MOJO_ROOT__INDEX = eINSTANCE.getEZMojoRoot_Index();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmojo.impl.EZMojoTargetImpl <em>EZ Mojo Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmojo.impl.EZMojoTargetImpl
		 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEZMojoTarget()
		 * @generated
		 */
		EClass EZ_MOJO_TARGET = eINSTANCE.getEZMojoTarget();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_MOJO_TARGET__KIND = eINSTANCE.getEZMojoTarget_Kind();

		/**
		 * The meta object literal for the '<em><b>Hierarchical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_MOJO_TARGET__HIERARCHICAL = eINSTANCE.getEZMojoTarget_Hierarchical();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmojo.impl.EZMojoAgentCmdImpl <em>EZ Mojo Agent Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmojo.impl.EZMojoAgentCmdImpl
		 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEZMojoAgentCmd()
		 * @generated
		 */
		EClass EZ_MOJO_AGENT_CMD = eINSTANCE.getEZMojoAgentCmd();

		/**
		 * The meta object literal for the '<em><b>Cmd</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_MOJO_AGENT_CMD__CMD = eINSTANCE.getEZMojoAgentCmd_Cmd();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_MOJO_AGENT_CMD__TEXT = eINSTANCE.getEZMojoAgentCmd_Text();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmojo.impl.EzMojoInfoCmdImpl <em>Ez Mojo Info Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmojo.impl.EzMojoInfoCmdImpl
		 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEzMojoInfoCmd()
		 * @generated
		 */
		EClass EZ_MOJO_INFO_CMD = eINSTANCE.getEzMojoInfoCmd();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_MOJO_INFO_CMD__TEXT = eINSTANCE.getEzMojoInfoCmd_Text();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmojo.impl.EzMojoServiceImpl <em>Ez Mojo Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmojo.impl.EzMojoServiceImpl
		 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEzMojoService()
		 * @generated
		 */
		EClass EZ_MOJO_SERVICE = eINSTANCE.getEzMojoService();

		/**
		 * The meta object literal for the '<em><b>Service ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_MOJO_SERVICE__SERVICE_ID = eINSTANCE.getEzMojoService_ServiceID();

		/**
		 * The meta object literal for the '<em><b>Excluded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_MOJO_SERVICE__EXCLUDED = eINSTANCE.getEzMojoService_Excluded();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmojo.impl.EZMojoTargetedCmdImpl <em>EZ Mojo Targeted Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmojo.impl.EZMojoTargetedCmdImpl
		 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEZMojoTargetedCmd()
		 * @generated
		 */
		EClass EZ_MOJO_TARGETED_CMD = eINSTANCE.getEZMojoTargetedCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmojo.impl.MotionEvalCtxImpl <em>Motion Eval Ctx</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmojo.impl.MotionEvalCtxImpl
		 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getMotionEvalCtx()
		 * @generated
		 */
		EClass MOTION_EVAL_CTX = eINSTANCE.getMotionEvalCtx();

		/**
		 * The meta object literal for the '<em><b>Ctx</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTION_EVAL_CTX__CTX = eINSTANCE.getMotionEvalCtx_Ctx();

		/**
		 * The meta object literal for the '<em><b>Kicked</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTION_EVAL_CTX__KICKED = eINSTANCE.getMotionEvalCtx_Kicked();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTION_EVAL_CTX__SCRIPT = eINSTANCE.getMotionEvalCtx_Script();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTION_EVAL_CTX__NODE = eINSTANCE.getMotionEvalCtx_Node();

		/**
		 * The meta object literal for the '<em><b>Cmd</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOTION_EVAL_CTX__CMD = eINSTANCE.getMotionEvalCtx_Cmd();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTION_EVAL_CTX__STRATEGY = eINSTANCE.getMotionEvalCtx_Strategy();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmojo.impl.EZScriptImpl <em>EZ Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmojo.impl.EZScriptImpl
		 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEZScript()
		 * @generated
		 */
		EClass EZ_SCRIPT = eINSTANCE.getEZScript();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_SCRIPT__SCRIPT = eINSTANCE.getEZScript_Script();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_SCRIPT__NODE = eINSTANCE.getEZScript_Node();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_SCRIPT__LABEL = eINSTANCE.getEZScript_Label();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_SCRIPT__EVENTS = eINSTANCE.getEZScript_Events();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmojo.impl.EzMojoKinematicCmdImpl <em>Ez Mojo Kinematic Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmojo.impl.EzMojoKinematicCmdImpl
		 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEzMojoKinematicCmd()
		 * @generated
		 */
		EClass EZ_MOJO_KINEMATIC_CMD = eINSTANCE.getEzMojoKinematicCmd();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_MOJO_KINEMATIC_CMD__SCRIPT = eINSTANCE.getEzMojoKinematicCmd_Script();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmojo.impl.EZTUIOVarImpl <em>EZTUIO Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmojo.impl.EZTUIOVarImpl
		 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEZTUIOVar()
		 * @generated
		 */
		EClass EZTUIO_VAR = eINSTANCE.getEZTUIOVar();

		/**
		 * The meta object literal for the '<em><b>Motion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZTUIO_VAR__MOTION = eINSTANCE.getEZTUIOVar_Motion();

		/**
		 * The meta object literal for the '<em><b>B3d</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZTUIO_VAR__B3D = eINSTANCE.getEZTUIOVar_B3d();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmojo.impl.EZMojoMappedCmdImpl <em>EZ Mojo Mapped Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmojo.impl.EZMojoMappedCmdImpl
		 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEZMojoMappedCmd()
		 * @generated
		 */
		EClass EZ_MOJO_MAPPED_CMD = eINSTANCE.getEZMojoMappedCmd();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_MOJO_MAPPED_CMD__ALIAS = eINSTANCE.getEZMojoMappedCmd_Alias();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmojo.impl.MotionReactorImpl <em>Motion Reactor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmojo.impl.MotionReactorImpl
		 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getMotionReactor()
		 * @generated
		 */
		EClass MOTION_REACTOR = eINSTANCE.getMotionReactor();

		/**
		 * The meta object literal for the '<em><b>Job</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTION_REACTOR__JOB = eINSTANCE.getMotionReactor_Job();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmojo.impl.Index2MojoNodeImpl <em>Index2 Mojo Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmojo.impl.Index2MojoNodeImpl
		 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getIndex2MojoNode()
		 * @generated
		 */
		EClass INDEX2_MOJO_NODE = eINSTANCE.getIndex2MojoNode();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX2_MOJO_NODE__KEY = eINSTANCE.getIndex2MojoNode_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX2_MOJO_NODE__VALUE = eINSTANCE.getIndex2MojoNode_Value();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmojo.impl.EZImpl <em>EZ</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmojo.impl.EZImpl
		 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEZ()
		 * @generated
		 */
		EClass EZ = eINSTANCE.getEZ();

		/**
		 * The meta object literal for the '<em><b>Configs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ__CONFIGS = eINSTANCE.getEZ_Configs();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmojo.impl.EZEventImpl <em>EZ Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmojo.impl.EZEventImpl
		 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEZEvent()
		 * @generated
		 */
		EClass EZ_EVENT = eINSTANCE.getEZEvent();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EZ_EVENT__KIND = eINSTANCE.getEZEvent_Kind();

		/**
		 * The meta object literal for the '<em><b>Osc</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_EVENT__OSC = eINSTANCE.getEZEvent_Osc();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_EVENT__TARGETS = eINSTANCE.getEZEvent_Targets();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmojo.EZMojoKind <em>EZ Mojo Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmojo.EZMojoKind
		 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEZMojoKind()
		 * @generated
		 */
		EEnum EZ_MOJO_KIND = eINSTANCE.getEZMojoKind();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmojo.EZCmdKind <em>EZ Cmd Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmojo.EZCmdKind
		 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEZCmdKind()
		 * @generated
		 */
		EEnum EZ_CMD_KIND = eINSTANCE.getEZCmdKind();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmojo.MotionEvalStrategy <em>Motion Eval Strategy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmojo.MotionEvalStrategy
		 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getMotionEvalStrategy()
		 * @generated
		 */
		EEnum MOTION_EVAL_STRATEGY = eINSTANCE.getMotionEvalStrategy();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezmojo.EzVarKind <em>Ez Var Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezmojo.EzVarKind
		 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getEzVarKind()
		 * @generated
		 */
		EEnum EZ_VAR_KIND = eINSTANCE.getEzVarKind();

		/**
		 * The meta object literal for the '<em>Motion Engine</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.motion.engine.MotionEngine
		 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getMotionEngine()
		 * @generated
		 */
		EDataType MOTION_ENGINE = eINSTANCE.getMotionEngine();

		/**
		 * The meta object literal for the '<em>Job</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.jobs.Job
		 * @see net.sf.smbt.ezmojo.impl.EzmojoPackageImpl#getJob()
		 * @generated
		 */
		EDataType JOB = eINSTANCE.getJob();

	}

} //EzmojoPackage
