/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.comm.script.netConf.impl;

import net.sf.smbt.comm.script.netConf.NetConfPackage;
import net.sf.smbt.comm.script.netConf.NetDecoder;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Net Decoder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.comm.script.netConf.impl.NetDecoderImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.impl.NetDecoderImpl#getClazz <em>Clazz</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetDecoderImpl extends MinimalEObjectImpl.Container implements NetDecoder
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getClazz() <em>Clazz</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClazz()
   * @generated
   * @ordered
   */
  protected static final String CLAZZ_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClazz() <em>Clazz</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClazz()
   * @generated
   * @ordered
   */
  protected String clazz = CLAZZ_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NetDecoderImpl()
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
    return NetConfPackage.Literals.NET_DECODER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetConfPackage.NET_DECODER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClazz()
  {
    return clazz;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClazz(String newClazz)
  {
    String oldClazz = clazz;
    clazz = newClazz;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetConfPackage.NET_DECODER__CLAZZ, oldClazz, clazz));
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
      case NetConfPackage.NET_DECODER__NAME:
        return getName();
      case NetConfPackage.NET_DECODER__CLAZZ:
        return getClazz();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case NetConfPackage.NET_DECODER__NAME:
        setName((String)newValue);
        return;
      case NetConfPackage.NET_DECODER__CLAZZ:
        setClazz((String)newValue);
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
      case NetConfPackage.NET_DECODER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case NetConfPackage.NET_DECODER__CLAZZ:
        setClazz(CLAZZ_EDEFAULT);
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
      case NetConfPackage.NET_DECODER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case NetConfPackage.NET_DECODER__CLAZZ:
        return CLAZZ_EDEFAULT == null ? clazz != null : !CLAZZ_EDEFAULT.equals(clazz);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", clazz: ");
    result.append(clazz);
    result.append(')');
    return result.toString();
  }

} //NetDecoderImpl
