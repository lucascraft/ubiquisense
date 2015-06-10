/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.comm.script.netConf.impl;

import java.util.Collection;

import net.sf.smbt.comm.script.netConf.DSLOrchestrorImport;
import net.sf.smbt.comm.script.netConf.NetCfg;
import net.sf.smbt.comm.script.netConf.NetConfPackage;
import net.sf.smbt.comm.script.netConf.NetDecoder;
import net.sf.smbt.comm.script.netConf.NetInterpreter;
import net.sf.smbt.comm.script.netConf.NetListener;
import net.sf.smbt.comm.script.netConf.NetOrchestrorScope;
import net.sf.smbt.comm.script.netConf.NetPort;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Net Cfg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.comm.script.netConf.impl.NetCfgImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.impl.NetCfgImpl#getListeners <em>Listeners</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.impl.NetCfgImpl#getInterpreters <em>Interpreters</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.impl.NetCfgImpl#getDecoders <em>Decoders</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.impl.NetCfgImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.impl.NetCfgImpl#getOrchestrorScopes <em>Orchestror Scopes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetCfgImpl extends MinimalEObjectImpl.Container implements NetCfg
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<DSLOrchestrorImport> imports;

  /**
   * The cached value of the '{@link #getListeners() <em>Listeners</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListeners()
   * @generated
   * @ordered
   */
  protected EList<NetListener> listeners;

  /**
   * The cached value of the '{@link #getInterpreters() <em>Interpreters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterpreters()
   * @generated
   * @ordered
   */
  protected EList<NetInterpreter> interpreters;

  /**
   * The cached value of the '{@link #getDecoders() <em>Decoders</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecoders()
   * @generated
   * @ordered
   */
  protected EList<NetDecoder> decoders;

  /**
   * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPorts()
   * @generated
   * @ordered
   */
  protected EList<NetPort> ports;

  /**
   * The cached value of the '{@link #getOrchestrorScopes() <em>Orchestror Scopes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrchestrorScopes()
   * @generated
   * @ordered
   */
  protected EList<NetOrchestrorScope> orchestrorScopes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NetCfgImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return NetConfPackage.Literals.NET_CFG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DSLOrchestrorImport> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<DSLOrchestrorImport>(DSLOrchestrorImport.class, this, NetConfPackage.NET_CFG__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NetListener> getListeners()
  {
    if (listeners == null)
    {
      listeners = new EObjectContainmentEList<NetListener>(NetListener.class, this, NetConfPackage.NET_CFG__LISTENERS);
    }
    return listeners;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NetInterpreter> getInterpreters()
  {
    if (interpreters == null)
    {
      interpreters = new EObjectContainmentEList<NetInterpreter>(NetInterpreter.class, this, NetConfPackage.NET_CFG__INTERPRETERS);
    }
    return interpreters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NetDecoder> getDecoders()
  {
    if (decoders == null)
    {
      decoders = new EObjectContainmentEList<NetDecoder>(NetDecoder.class, this, NetConfPackage.NET_CFG__DECODERS);
    }
    return decoders;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NetPort> getPorts()
  {
    if (ports == null)
    {
      ports = new EObjectContainmentEList<NetPort>(NetPort.class, this, NetConfPackage.NET_CFG__PORTS);
    }
    return ports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NetOrchestrorScope> getOrchestrorScopes()
  {
    if (orchestrorScopes == null)
    {
      orchestrorScopes = new EObjectContainmentEList<NetOrchestrorScope>(NetOrchestrorScope.class, this, NetConfPackage.NET_CFG__ORCHESTROR_SCOPES);
    }
    return orchestrorScopes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case NetConfPackage.NET_CFG__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case NetConfPackage.NET_CFG__LISTENERS:
        return ((InternalEList<?>)getListeners()).basicRemove(otherEnd, msgs);
      case NetConfPackage.NET_CFG__INTERPRETERS:
        return ((InternalEList<?>)getInterpreters()).basicRemove(otherEnd, msgs);
      case NetConfPackage.NET_CFG__DECODERS:
        return ((InternalEList<?>)getDecoders()).basicRemove(otherEnd, msgs);
      case NetConfPackage.NET_CFG__PORTS:
        return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
      case NetConfPackage.NET_CFG__ORCHESTROR_SCOPES:
        return ((InternalEList<?>)getOrchestrorScopes()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case NetConfPackage.NET_CFG__IMPORTS:
        return getImports();
      case NetConfPackage.NET_CFG__LISTENERS:
        return getListeners();
      case NetConfPackage.NET_CFG__INTERPRETERS:
        return getInterpreters();
      case NetConfPackage.NET_CFG__DECODERS:
        return getDecoders();
      case NetConfPackage.NET_CFG__PORTS:
        return getPorts();
      case NetConfPackage.NET_CFG__ORCHESTROR_SCOPES:
        return getOrchestrorScopes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case NetConfPackage.NET_CFG__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends DSLOrchestrorImport>)newValue);
        return;
      case NetConfPackage.NET_CFG__LISTENERS:
        getListeners().clear();
        getListeners().addAll((Collection<? extends NetListener>)newValue);
        return;
      case NetConfPackage.NET_CFG__INTERPRETERS:
        getInterpreters().clear();
        getInterpreters().addAll((Collection<? extends NetInterpreter>)newValue);
        return;
      case NetConfPackage.NET_CFG__DECODERS:
        getDecoders().clear();
        getDecoders().addAll((Collection<? extends NetDecoder>)newValue);
        return;
      case NetConfPackage.NET_CFG__PORTS:
        getPorts().clear();
        getPorts().addAll((Collection<? extends NetPort>)newValue);
        return;
      case NetConfPackage.NET_CFG__ORCHESTROR_SCOPES:
        getOrchestrorScopes().clear();
        getOrchestrorScopes().addAll((Collection<? extends NetOrchestrorScope>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case NetConfPackage.NET_CFG__IMPORTS:
        getImports().clear();
        return;
      case NetConfPackage.NET_CFG__LISTENERS:
        getListeners().clear();
        return;
      case NetConfPackage.NET_CFG__INTERPRETERS:
        getInterpreters().clear();
        return;
      case NetConfPackage.NET_CFG__DECODERS:
        getDecoders().clear();
        return;
      case NetConfPackage.NET_CFG__PORTS:
        getPorts().clear();
        return;
      case NetConfPackage.NET_CFG__ORCHESTROR_SCOPES:
        getOrchestrorScopes().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case NetConfPackage.NET_CFG__IMPORTS:
        return imports != null && !imports.isEmpty();
      case NetConfPackage.NET_CFG__LISTENERS:
        return listeners != null && !listeners.isEmpty();
      case NetConfPackage.NET_CFG__INTERPRETERS:
        return interpreters != null && !interpreters.isEmpty();
      case NetConfPackage.NET_CFG__DECODERS:
        return decoders != null && !decoders.isEmpty();
      case NetConfPackage.NET_CFG__PORTS:
        return ports != null && !ports.isEmpty();
      case NetConfPackage.NET_CFG__ORCHESTROR_SCOPES:
        return orchestrorScopes != null && !orchestrorScopes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NetCfgImpl
