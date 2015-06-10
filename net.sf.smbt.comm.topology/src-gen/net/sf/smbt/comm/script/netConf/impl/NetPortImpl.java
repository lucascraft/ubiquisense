/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.comm.script.netConf.impl;

import java.util.Collection;

import net.sf.smbt.comm.script.netConf.NetConfPackage;
import net.sf.smbt.comm.script.netConf.NetPort;
import net.sf.smbt.comm.script.netConf.RxKind;
import net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Net Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.comm.script.netConf.impl.NetPortImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.impl.NetPortImpl#getPortID <em>Port ID</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.impl.NetPortImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.impl.NetPortImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.impl.NetPortImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.impl.NetPortImpl#getIpExpr <em>Ip Expr</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.impl.NetPortImpl#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetPortImpl extends MinimalEObjectImpl.Container implements NetPort
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
   * The default value of the '{@link #getPortID() <em>Port ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPortID()
   * @generated
   * @ordered
   */
  protected static final String PORT_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPortID() <em>Port ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPortID()
   * @generated
   * @ordered
   */
  protected String portID = PORT_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected static final TRANSPORT_PROTOCOL KIND_EDEFAULT = TRANSPORT_PROTOCOL.USB;

  /**
   * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected TRANSPORT_PROTOCOL kind = KIND_EDEFAULT;

  /**
   * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpeed()
   * @generated
   * @ordered
   */
  protected static final int SPEED_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpeed()
   * @generated
   * @ordered
   */
  protected int speed = SPEED_EDEFAULT;

  /**
   * The cached value of the '{@link #getPorts() <em>Ports</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPorts()
   * @generated
   * @ordered
   */
  protected EList<Integer> ports;

  /**
   * The cached value of the '{@link #getIpExpr() <em>Ip Expr</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIpExpr()
   * @generated
   * @ordered
   */
  protected EList<String> ipExpr;

  /**
   * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMode()
   * @generated
   * @ordered
   */
  protected static final RxKind MODE_EDEFAULT = RxKind.UNICAST;

  /**
   * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMode()
   * @generated
   * @ordered
   */
  protected RxKind mode = MODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NetPortImpl()
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
    return NetConfPackage.Literals.NET_PORT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, NetConfPackage.NET_PORT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPortID()
  {
    return portID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPortID(String newPortID)
  {
    String oldPortID = portID;
    portID = newPortID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetConfPackage.NET_PORT__PORT_ID, oldPortID, portID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TRANSPORT_PROTOCOL getKind()
  {
    return kind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKind(TRANSPORT_PROTOCOL newKind)
  {
    TRANSPORT_PROTOCOL oldKind = kind;
    kind = newKind == null ? KIND_EDEFAULT : newKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetConfPackage.NET_PORT__KIND, oldKind, kind));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSpeed()
  {
    return speed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpeed(int newSpeed)
  {
    int oldSpeed = speed;
    speed = newSpeed;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetConfPackage.NET_PORT__SPEED, oldSpeed, speed));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getPorts()
  {
    if (ports == null)
    {
      ports = new EDataTypeEList<Integer>(Integer.class, this, NetConfPackage.NET_PORT__PORTS);
    }
    return ports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getIpExpr()
  {
    if (ipExpr == null)
    {
      ipExpr = new EDataTypeEList<String>(String.class, this, NetConfPackage.NET_PORT__IP_EXPR);
    }
    return ipExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RxKind getMode()
  {
    return mode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMode(RxKind newMode)
  {
    RxKind oldMode = mode;
    mode = newMode == null ? MODE_EDEFAULT : newMode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetConfPackage.NET_PORT__MODE, oldMode, mode));
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
      case NetConfPackage.NET_PORT__NAME:
        return getName();
      case NetConfPackage.NET_PORT__PORT_ID:
        return getPortID();
      case NetConfPackage.NET_PORT__KIND:
        return getKind();
      case NetConfPackage.NET_PORT__SPEED:
        return getSpeed();
      case NetConfPackage.NET_PORT__PORTS:
        return getPorts();
      case NetConfPackage.NET_PORT__IP_EXPR:
        return getIpExpr();
      case NetConfPackage.NET_PORT__MODE:
        return getMode();
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
      case NetConfPackage.NET_PORT__NAME:
        setName((String)newValue);
        return;
      case NetConfPackage.NET_PORT__PORT_ID:
        setPortID((String)newValue);
        return;
      case NetConfPackage.NET_PORT__KIND:
        setKind((TRANSPORT_PROTOCOL)newValue);
        return;
      case NetConfPackage.NET_PORT__SPEED:
        setSpeed((Integer)newValue);
        return;
      case NetConfPackage.NET_PORT__PORTS:
        getPorts().clear();
        getPorts().addAll((Collection<? extends Integer>)newValue);
        return;
      case NetConfPackage.NET_PORT__IP_EXPR:
        getIpExpr().clear();
        getIpExpr().addAll((Collection<? extends String>)newValue);
        return;
      case NetConfPackage.NET_PORT__MODE:
        setMode((RxKind)newValue);
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
      case NetConfPackage.NET_PORT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case NetConfPackage.NET_PORT__PORT_ID:
        setPortID(PORT_ID_EDEFAULT);
        return;
      case NetConfPackage.NET_PORT__KIND:
        setKind(KIND_EDEFAULT);
        return;
      case NetConfPackage.NET_PORT__SPEED:
        setSpeed(SPEED_EDEFAULT);
        return;
      case NetConfPackage.NET_PORT__PORTS:
        getPorts().clear();
        return;
      case NetConfPackage.NET_PORT__IP_EXPR:
        getIpExpr().clear();
        return;
      case NetConfPackage.NET_PORT__MODE:
        setMode(MODE_EDEFAULT);
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
      case NetConfPackage.NET_PORT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case NetConfPackage.NET_PORT__PORT_ID:
        return PORT_ID_EDEFAULT == null ? portID != null : !PORT_ID_EDEFAULT.equals(portID);
      case NetConfPackage.NET_PORT__KIND:
        return kind != KIND_EDEFAULT;
      case NetConfPackage.NET_PORT__SPEED:
        return speed != SPEED_EDEFAULT;
      case NetConfPackage.NET_PORT__PORTS:
        return ports != null && !ports.isEmpty();
      case NetConfPackage.NET_PORT__IP_EXPR:
        return ipExpr != null && !ipExpr.isEmpty();
      case NetConfPackage.NET_PORT__MODE:
        return mode != MODE_EDEFAULT;
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
    result.append(", portID: ");
    result.append(portID);
    result.append(", kind: ");
    result.append(kind);
    result.append(", speed: ");
    result.append(speed);
    result.append(", ports: ");
    result.append(ports);
    result.append(", ipExpr: ");
    result.append(ipExpr);
    result.append(", mode: ");
    result.append(mode);
    result.append(')');
    return result.toString();
  }

} //NetPortImpl
