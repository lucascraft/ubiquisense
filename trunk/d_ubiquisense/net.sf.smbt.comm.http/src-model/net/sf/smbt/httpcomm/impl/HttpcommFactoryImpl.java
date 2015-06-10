/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.httpcomm.impl;

import net.sf.smbt.httpcomm.*;

import org.eclipse.emf.ecore.EClass;
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
public class HttpcommFactoryImpl extends EFactoryImpl implements HttpcommFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HttpcommFactory init() {
		try {
			HttpcommFactory theHttpcommFactory = (HttpcommFactory)EPackage.Registry.INSTANCE.getEFactory("http://httpcomm/1.0"); 
			if (theHttpcommFactory != null) {
				return theHttpcommFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HttpcommFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpcommFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HttpcommPackage.HTTP_COMM_PORT: return createHttpCommPort();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpCommPort createHttpCommPort() {
		HttpCommPortImpl httpCommPort = new HttpCommPortImpl();
		return httpCommPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpcommPackage getHttpcommPackage() {
		return (HttpcommPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HttpcommPackage getPackage() {
		return HttpcommPackage.eINSTANCE;
	}

} //HttpcommFactoryImpl
