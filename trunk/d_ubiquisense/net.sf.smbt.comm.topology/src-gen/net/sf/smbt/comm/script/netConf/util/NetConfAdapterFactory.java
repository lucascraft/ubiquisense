/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.comm.script.netConf.util;

import net.sf.smbt.comm.script.netConf.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.comm.script.netConf.NetConfPackage
 * @generated
 */
public class NetConfAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static NetConfPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetConfAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = NetConfPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NetConfSwitch<Adapter> modelSwitch =
    new NetConfSwitch<Adapter>()
    {
      @Override
      public Adapter caseNetCfg(NetCfg object)
      {
        return createNetCfgAdapter();
      }
      @Override
      public Adapter caseDSLOrchestrorImport(DSLOrchestrorImport object)
      {
        return createDSLOrchestrorImportAdapter();
      }
      @Override
      public Adapter caseNetPort(NetPort object)
      {
        return createNetPortAdapter();
      }
      @Override
      public Adapter caseNetDecoder(NetDecoder object)
      {
        return createNetDecoderAdapter();
      }
      @Override
      public Adapter caseNetInterpreter(NetInterpreter object)
      {
        return createNetInterpreterAdapter();
      }
      @Override
      public Adapter caseNetListener(NetListener object)
      {
        return createNetListenerAdapter();
      }
      @Override
      public Adapter caseNetOrchestrorScope(NetOrchestrorScope object)
      {
        return createNetOrchestrorScopeAdapter();
      }
      @Override
      public Adapter caseNetBind(NetBind object)
      {
        return createNetBindAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.comm.script.netConf.NetCfg <em>Net Cfg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.comm.script.netConf.NetCfg
   * @generated
   */
  public Adapter createNetCfgAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.comm.script.netConf.DSLOrchestrorImport <em>DSL Orchestror Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.comm.script.netConf.DSLOrchestrorImport
   * @generated
   */
  public Adapter createDSLOrchestrorImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.comm.script.netConf.NetPort <em>Net Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.comm.script.netConf.NetPort
   * @generated
   */
  public Adapter createNetPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.comm.script.netConf.NetDecoder <em>Net Decoder</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.comm.script.netConf.NetDecoder
   * @generated
   */
  public Adapter createNetDecoderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.comm.script.netConf.NetInterpreter <em>Net Interpreter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.comm.script.netConf.NetInterpreter
   * @generated
   */
  public Adapter createNetInterpreterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.comm.script.netConf.NetListener <em>Net Listener</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.comm.script.netConf.NetListener
   * @generated
   */
  public Adapter createNetListenerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.comm.script.netConf.NetOrchestrorScope <em>Net Orchestror Scope</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.comm.script.netConf.NetOrchestrorScope
   * @generated
   */
  public Adapter createNetOrchestrorScopeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.comm.script.netConf.NetBind <em>Net Bind</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.comm.script.netConf.NetBind
   * @generated
   */
  public Adapter createNetBindAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //NetConfAdapterFactory
