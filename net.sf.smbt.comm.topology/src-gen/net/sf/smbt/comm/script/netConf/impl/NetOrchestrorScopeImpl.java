/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.comm.script.netConf.impl;

import java.util.Collection;

import net.sf.smbt.comm.script.netConf.NetBind;
import net.sf.smbt.comm.script.netConf.NetConfPackage;
import net.sf.smbt.comm.script.netConf.NetOrchestrorScope;

import net.sf.xqz.engine.script.orchestror.DSLOrchestror;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Net Orchestror Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.comm.script.netConf.impl.NetOrchestrorScopeImpl#getDslOrchestror <em>Dsl Orchestror</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.impl.NetOrchestrorScopeImpl#getBinds <em>Binds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetOrchestrorScopeImpl extends MinimalEObjectImpl.Container implements NetOrchestrorScope
{
  /**
   * The cached value of the '{@link #getDslOrchestror() <em>Dsl Orchestror</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDslOrchestror()
   * @generated
   * @ordered
   */
  protected DSLOrchestror dslOrchestror;

  /**
   * The cached value of the '{@link #getBinds() <em>Binds</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBinds()
   * @generated
   * @ordered
   */
  protected EList<NetBind> binds;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NetOrchestrorScopeImpl()
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
    return NetConfPackage.Literals.NET_ORCHESTROR_SCOPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLOrchestror getDslOrchestror()
  {
    if (dslOrchestror != null && dslOrchestror.eIsProxy())
    {
      InternalEObject oldDslOrchestror = (InternalEObject)dslOrchestror;
      dslOrchestror = (DSLOrchestror)eResolveProxy(oldDslOrchestror);
      if (dslOrchestror != oldDslOrchestror)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetConfPackage.NET_ORCHESTROR_SCOPE__DSL_ORCHESTROR, oldDslOrchestror, dslOrchestror));
      }
    }
    return dslOrchestror;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLOrchestror basicGetDslOrchestror()
  {
    return dslOrchestror;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDslOrchestror(DSLOrchestror newDslOrchestror)
  {
    DSLOrchestror oldDslOrchestror = dslOrchestror;
    dslOrchestror = newDslOrchestror;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetConfPackage.NET_ORCHESTROR_SCOPE__DSL_ORCHESTROR, oldDslOrchestror, dslOrchestror));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NetBind> getBinds()
  {
    if (binds == null)
    {
      binds = new EObjectContainmentEList<NetBind>(NetBind.class, this, NetConfPackage.NET_ORCHESTROR_SCOPE__BINDS);
    }
    return binds;
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
      case NetConfPackage.NET_ORCHESTROR_SCOPE__BINDS:
        return ((InternalEList<?>)getBinds()).basicRemove(otherEnd, msgs);
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
      case NetConfPackage.NET_ORCHESTROR_SCOPE__DSL_ORCHESTROR:
        if (resolve) return getDslOrchestror();
        return basicGetDslOrchestror();
      case NetConfPackage.NET_ORCHESTROR_SCOPE__BINDS:
        return getBinds();
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
      case NetConfPackage.NET_ORCHESTROR_SCOPE__DSL_ORCHESTROR:
        setDslOrchestror((DSLOrchestror)newValue);
        return;
      case NetConfPackage.NET_ORCHESTROR_SCOPE__BINDS:
        getBinds().clear();
        getBinds().addAll((Collection<? extends NetBind>)newValue);
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
      case NetConfPackage.NET_ORCHESTROR_SCOPE__DSL_ORCHESTROR:
        setDslOrchestror((DSLOrchestror)null);
        return;
      case NetConfPackage.NET_ORCHESTROR_SCOPE__BINDS:
        getBinds().clear();
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
      case NetConfPackage.NET_ORCHESTROR_SCOPE__DSL_ORCHESTROR:
        return dslOrchestror != null;
      case NetConfPackage.NET_ORCHESTROR_SCOPE__BINDS:
        return binds != null && !binds.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NetOrchestrorScopeImpl
