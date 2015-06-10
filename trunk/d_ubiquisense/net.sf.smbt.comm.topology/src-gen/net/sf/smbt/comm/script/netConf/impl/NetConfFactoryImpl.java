/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.comm.script.netConf.impl;

import net.sf.smbt.comm.script.netConf.*;

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
public class NetConfFactoryImpl extends EFactoryImpl implements NetConfFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NetConfFactory init()
  {
    try
    {
      NetConfFactory theNetConfFactory = (NetConfFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.sf.net/smbt/comm/script/NetConf"); 
      if (theNetConfFactory != null)
      {
        return theNetConfFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new NetConfFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetConfFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case NetConfPackage.NET_CFG: return createNetCfg();
      case NetConfPackage.DSL_ORCHESTROR_IMPORT: return createDSLOrchestrorImport();
      case NetConfPackage.NET_PORT: return createNetPort();
      case NetConfPackage.NET_DECODER: return createNetDecoder();
      case NetConfPackage.NET_INTERPRETER: return createNetInterpreter();
      case NetConfPackage.NET_LISTENER: return createNetListener();
      case NetConfPackage.NET_ORCHESTROR_SCOPE: return createNetOrchestrorScope();
      case NetConfPackage.NET_BIND: return createNetBind();
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
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case NetConfPackage.TRANSPORT_PROTOCOL:
        return createTRANSPORT_PROTOCOLFromString(eDataType, initialValue);
      case NetConfPackage.RX_KIND:
        return createRxKindFromString(eDataType, initialValue);
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
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case NetConfPackage.TRANSPORT_PROTOCOL:
        return convertTRANSPORT_PROTOCOLToString(eDataType, instanceValue);
      case NetConfPackage.RX_KIND:
        return convertRxKindToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetCfg createNetCfg()
  {
    NetCfgImpl netCfg = new NetCfgImpl();
    return netCfg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLOrchestrorImport createDSLOrchestrorImport()
  {
    DSLOrchestrorImportImpl dslOrchestrorImport = new DSLOrchestrorImportImpl();
    return dslOrchestrorImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetPort createNetPort()
  {
    NetPortImpl netPort = new NetPortImpl();
    return netPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetDecoder createNetDecoder()
  {
    NetDecoderImpl netDecoder = new NetDecoderImpl();
    return netDecoder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetInterpreter createNetInterpreter()
  {
    NetInterpreterImpl netInterpreter = new NetInterpreterImpl();
    return netInterpreter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetListener createNetListener()
  {
    NetListenerImpl netListener = new NetListenerImpl();
    return netListener;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetOrchestrorScope createNetOrchestrorScope()
  {
    NetOrchestrorScopeImpl netOrchestrorScope = new NetOrchestrorScopeImpl();
    return netOrchestrorScope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetBind createNetBind()
  {
    NetBindImpl netBind = new NetBindImpl();
    return netBind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TRANSPORT_PROTOCOL createTRANSPORT_PROTOCOLFromString(EDataType eDataType, String initialValue)
  {
    TRANSPORT_PROTOCOL result = TRANSPORT_PROTOCOL.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTRANSPORT_PROTOCOLToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RxKind createRxKindFromString(EDataType eDataType, String initialValue)
  {
    RxKind result = RxKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRxKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetConfPackage getNetConfPackage()
  {
    return (NetConfPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static NetConfPackage getPackage()
  {
    return NetConfPackage.eINSTANCE;
  }

} //NetConfFactoryImpl
