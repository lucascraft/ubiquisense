/**
 */
package net.sf.smbt.comm.httpcmd.impl;

import java.util.Collection;

import net.sf.smbt.comm.httpcmd.HttpCommCmd;
import net.sf.smbt.comm.httpcmd.HttpMethod;
import net.sf.smbt.comm.httpcmd.HttpcmdPackage;
import net.sf.smbt.comm.httpcmd.Property;

import net.sf.xqz.model.cmd.impl.CmdImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Http Comm Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.comm.httpcmd.impl.HttpCommCmdImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link net.sf.smbt.comm.httpcmd.impl.HttpCommCmdImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link net.sf.smbt.comm.httpcmd.impl.HttpCommCmdImpl#getCommand <em>Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HttpCommCmdImpl extends CmdImpl implements HttpCommCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HttpCommCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HttpcmdPackage.Literals.HTTP_COMM_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Property> getProperties() {
		return (EList<Property>)eGet(HttpcmdPackage.Literals.HTTP_COMM_CMD__PROPERTIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpMethod getMethod() {
		return (HttpMethod)eGet(HttpcmdPackage.Literals.HTTP_COMM_CMD__METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(HttpMethod newMethod) {
		eSet(HttpcmdPackage.Literals.HTTP_COMM_CMD__METHOD, newMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommand() {
		return (String)eGet(HttpcmdPackage.Literals.HTTP_COMM_CMD__COMMAND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommand(String newCommand) {
		eSet(HttpcmdPackage.Literals.HTTP_COMM_CMD__COMMAND, newCommand);
	}

} //HttpCommCmdImpl
