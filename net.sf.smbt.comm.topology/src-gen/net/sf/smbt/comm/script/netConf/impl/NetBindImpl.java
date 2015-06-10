/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.comm.script.netConf.impl;

import java.util.Collection;

import net.sf.smbt.comm.script.netConf.NetBind;
import net.sf.smbt.comm.script.netConf.NetConfPackage;
import net.sf.smbt.comm.script.netConf.NetDecoder;
import net.sf.smbt.comm.script.netConf.NetInterpreter;
import net.sf.smbt.comm.script.netConf.NetListener;
import net.sf.smbt.comm.script.netConf.NetPort;

import net.sf.xqz.engine.script.orchestror.DSLCommandEngine;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Net Bind</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.comm.script.netConf.impl.NetBindImpl#getEngine <em>Engine</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.impl.NetBindImpl#getInterpreter <em>Interpreter</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.impl.NetBindImpl#getCmdInject <em>Cmd Inject</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.impl.NetBindImpl#getDecoder <em>Decoder</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.impl.NetBindImpl#getFrameInject <em>Frame Inject</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.impl.NetBindImpl#getPort <em>Port</em>}</li>
 *   <li>{@link net.sf.smbt.comm.script.netConf.impl.NetBindImpl#getListeners <em>Listeners</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetBindImpl extends MinimalEObjectImpl.Container implements NetBind
{
  /**
   * The cached value of the '{@link #getEngine() <em>Engine</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEngine()
   * @generated
   * @ordered
   */
  protected DSLCommandEngine engine;

  /**
   * The cached value of the '{@link #getInterpreter() <em>Interpreter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterpreter()
   * @generated
   * @ordered
   */
  protected NetInterpreter interpreter;

  /**
   * The cached value of the '{@link #getCmdInject() <em>Cmd Inject</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCmdInject()
   * @generated
   * @ordered
   */
  protected EList<NetPort> cmdInject;

  /**
   * The cached value of the '{@link #getDecoder() <em>Decoder</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecoder()
   * @generated
   * @ordered
   */
  protected NetDecoder decoder;

  /**
   * The cached value of the '{@link #getFrameInject() <em>Frame Inject</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrameInject()
   * @generated
   * @ordered
   */
  protected EList<NetPort> frameInject;

  /**
   * The cached value of the '{@link #getPort() <em>Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected NetPort port;

  /**
   * The cached value of the '{@link #getListeners() <em>Listeners</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListeners()
   * @generated
   * @ordered
   */
  protected EList<NetListener> listeners;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NetBindImpl()
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
    return NetConfPackage.Literals.NET_BIND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLCommandEngine getEngine()
  {
    if (engine != null && engine.eIsProxy())
    {
      InternalEObject oldEngine = (InternalEObject)engine;
      engine = (DSLCommandEngine)eResolveProxy(oldEngine);
      if (engine != oldEngine)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetConfPackage.NET_BIND__ENGINE, oldEngine, engine));
      }
    }
    return engine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLCommandEngine basicGetEngine()
  {
    return engine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEngine(DSLCommandEngine newEngine)
  {
    DSLCommandEngine oldEngine = engine;
    engine = newEngine;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetConfPackage.NET_BIND__ENGINE, oldEngine, engine));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetInterpreter getInterpreter()
  {
    if (interpreter != null && interpreter.eIsProxy())
    {
      InternalEObject oldInterpreter = (InternalEObject)interpreter;
      interpreter = (NetInterpreter)eResolveProxy(oldInterpreter);
      if (interpreter != oldInterpreter)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetConfPackage.NET_BIND__INTERPRETER, oldInterpreter, interpreter));
      }
    }
    return interpreter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetInterpreter basicGetInterpreter()
  {
    return interpreter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterpreter(NetInterpreter newInterpreter)
  {
    NetInterpreter oldInterpreter = interpreter;
    interpreter = newInterpreter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetConfPackage.NET_BIND__INTERPRETER, oldInterpreter, interpreter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NetPort> getCmdInject()
  {
    if (cmdInject == null)
    {
      cmdInject = new EObjectResolvingEList<NetPort>(NetPort.class, this, NetConfPackage.NET_BIND__CMD_INJECT);
    }
    return cmdInject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetDecoder getDecoder()
  {
    if (decoder != null && decoder.eIsProxy())
    {
      InternalEObject oldDecoder = (InternalEObject)decoder;
      decoder = (NetDecoder)eResolveProxy(oldDecoder);
      if (decoder != oldDecoder)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetConfPackage.NET_BIND__DECODER, oldDecoder, decoder));
      }
    }
    return decoder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetDecoder basicGetDecoder()
  {
    return decoder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecoder(NetDecoder newDecoder)
  {
    NetDecoder oldDecoder = decoder;
    decoder = newDecoder;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetConfPackage.NET_BIND__DECODER, oldDecoder, decoder));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NetPort> getFrameInject()
  {
    if (frameInject == null)
    {
      frameInject = new EObjectResolvingEList<NetPort>(NetPort.class, this, NetConfPackage.NET_BIND__FRAME_INJECT);
    }
    return frameInject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetPort getPort()
  {
    if (port != null && port.eIsProxy())
    {
      InternalEObject oldPort = (InternalEObject)port;
      port = (NetPort)eResolveProxy(oldPort);
      if (port != oldPort)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, NetConfPackage.NET_BIND__PORT, oldPort, port));
      }
    }
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetPort basicGetPort()
  {
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPort(NetPort newPort)
  {
    NetPort oldPort = port;
    port = newPort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NetConfPackage.NET_BIND__PORT, oldPort, port));
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
      listeners = new EObjectResolvingEList<NetListener>(NetListener.class, this, NetConfPackage.NET_BIND__LISTENERS);
    }
    return listeners;
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
      case NetConfPackage.NET_BIND__ENGINE:
        if (resolve) return getEngine();
        return basicGetEngine();
      case NetConfPackage.NET_BIND__INTERPRETER:
        if (resolve) return getInterpreter();
        return basicGetInterpreter();
      case NetConfPackage.NET_BIND__CMD_INJECT:
        return getCmdInject();
      case NetConfPackage.NET_BIND__DECODER:
        if (resolve) return getDecoder();
        return basicGetDecoder();
      case NetConfPackage.NET_BIND__FRAME_INJECT:
        return getFrameInject();
      case NetConfPackage.NET_BIND__PORT:
        if (resolve) return getPort();
        return basicGetPort();
      case NetConfPackage.NET_BIND__LISTENERS:
        return getListeners();
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
      case NetConfPackage.NET_BIND__ENGINE:
        setEngine((DSLCommandEngine)newValue);
        return;
      case NetConfPackage.NET_BIND__INTERPRETER:
        setInterpreter((NetInterpreter)newValue);
        return;
      case NetConfPackage.NET_BIND__CMD_INJECT:
        getCmdInject().clear();
        getCmdInject().addAll((Collection<? extends NetPort>)newValue);
        return;
      case NetConfPackage.NET_BIND__DECODER:
        setDecoder((NetDecoder)newValue);
        return;
      case NetConfPackage.NET_BIND__FRAME_INJECT:
        getFrameInject().clear();
        getFrameInject().addAll((Collection<? extends NetPort>)newValue);
        return;
      case NetConfPackage.NET_BIND__PORT:
        setPort((NetPort)newValue);
        return;
      case NetConfPackage.NET_BIND__LISTENERS:
        getListeners().clear();
        getListeners().addAll((Collection<? extends NetListener>)newValue);
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
      case NetConfPackage.NET_BIND__ENGINE:
        setEngine((DSLCommandEngine)null);
        return;
      case NetConfPackage.NET_BIND__INTERPRETER:
        setInterpreter((NetInterpreter)null);
        return;
      case NetConfPackage.NET_BIND__CMD_INJECT:
        getCmdInject().clear();
        return;
      case NetConfPackage.NET_BIND__DECODER:
        setDecoder((NetDecoder)null);
        return;
      case NetConfPackage.NET_BIND__FRAME_INJECT:
        getFrameInject().clear();
        return;
      case NetConfPackage.NET_BIND__PORT:
        setPort((NetPort)null);
        return;
      case NetConfPackage.NET_BIND__LISTENERS:
        getListeners().clear();
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
      case NetConfPackage.NET_BIND__ENGINE:
        return engine != null;
      case NetConfPackage.NET_BIND__INTERPRETER:
        return interpreter != null;
      case NetConfPackage.NET_BIND__CMD_INJECT:
        return cmdInject != null && !cmdInject.isEmpty();
      case NetConfPackage.NET_BIND__DECODER:
        return decoder != null;
      case NetConfPackage.NET_BIND__FRAME_INJECT:
        return frameInject != null && !frameInject.isEmpty();
      case NetConfPackage.NET_BIND__PORT:
        return port != null;
      case NetConfPackage.NET_BIND__LISTENERS:
        return listeners != null && !listeners.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NetBindImpl
