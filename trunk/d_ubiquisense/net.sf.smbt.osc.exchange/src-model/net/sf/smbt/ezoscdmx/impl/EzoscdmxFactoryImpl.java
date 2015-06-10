/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezoscdmx.impl;

import net.sf.smbt.ezoscdmx.*;
import net.sf.smbt.ezoscdmx.EzoscdmxFactory;
import net.sf.smbt.ezoscdmx.EzoscdmxPackage;
import net.sf.smbt.ezoscdmx.OscDmxCmd;
import net.sf.smbt.ezoscdmx.OscDmxFadeToRGB;

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
public class EzoscdmxFactoryImpl extends EFactoryImpl implements EzoscdmxFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EzoscdmxFactory init() {
		try {
			EzoscdmxFactory theEzoscdmxFactory = (EzoscdmxFactory)EPackage.Registry.INSTANCE.getEFactory("http://ezoscdmx/1.0"); 
			if (theEzoscdmxFactory != null) {
				return theEzoscdmxFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EzoscdmxFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzoscdmxFactoryImpl() {
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
			case EzoscdmxPackage.OSC_DMX_FADE_TO_RGB: return createOscDmxFadeToRGB();
			case EzoscdmxPackage.OSC_DMX_CMD: return createOscDmxCmd();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscDmxFadeToRGB createOscDmxFadeToRGB() {
		OscDmxFadeToRGBImpl oscDmxFadeToRGB = new OscDmxFadeToRGBImpl();
		return oscDmxFadeToRGB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OscDmxCmd createOscDmxCmd() {
		OscDmxCmdImpl oscDmxCmd = new OscDmxCmdImpl();
		return oscDmxCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzoscdmxPackage getEzoscdmxPackage() {
		return (EzoscdmxPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EzoscdmxPackage getPackage() {
		return EzoscdmxPackage.eINSTANCE;
	}

} //EzoscdmxFactoryImpl
