/**
 */
package net.sf.smbt.comm.httpcmd;

import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.smbt.comm.httpcmd.HttpcmdFactory
 * @model kind="package"
 * @generated
 */
public interface HttpcmdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "httpcmd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://httpcmd/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "httpcmd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HttpcmdPackage eINSTANCE = net.sf.smbt.comm.httpcmd.impl.HttpcmdPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.comm.httpcmd.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.comm.httpcmd.impl.PropertyImpl
	 * @see net.sf.smbt.comm.httpcmd.impl.HttpcmdPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.comm.httpcmd.impl.HttpCommCmdImpl <em>Http Comm Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.comm.httpcmd.impl.HttpCommCmdImpl
	 * @see net.sf.smbt.comm.httpcmd.impl.HttpcmdPackageImpl#getHttpCommCmd()
	 * @generated
	 */
	int HTTP_COMM_CMD = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_COMM_CMD__PRIORITY = CmdPackage.CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_COMM_CMD__STAMP = CmdPackage.CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_COMM_CMD__PROPERTIES = CmdPackage.CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_COMM_CMD__METHOD = CmdPackage.CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_COMM_CMD__COMMAND = CmdPackage.CMD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Http Comm Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_COMM_CMD_FEATURE_COUNT = CmdPackage.CMD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.comm.httpcmd.HttpMethod <em>Http Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.comm.httpcmd.HttpMethod
	 * @see net.sf.smbt.comm.httpcmd.impl.HttpcmdPackageImpl#getHttpMethod()
	 * @generated
	 */
	int HTTP_METHOD = 2;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.comm.httpcmd.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see net.sf.smbt.comm.httpcmd.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.comm.httpcmd.Property#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see net.sf.smbt.comm.httpcmd.Property#getKey()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Key();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.comm.httpcmd.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.comm.httpcmd.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.comm.httpcmd.HttpCommCmd <em>Http Comm Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Http Comm Cmd</em>'.
	 * @see net.sf.smbt.comm.httpcmd.HttpCommCmd
	 * @generated
	 */
	EClass getHttpCommCmd();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.comm.httpcmd.HttpCommCmd#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see net.sf.smbt.comm.httpcmd.HttpCommCmd#getProperties()
	 * @see #getHttpCommCmd()
	 * @generated
	 */
	EReference getHttpCommCmd_Properties();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.comm.httpcmd.HttpCommCmd#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see net.sf.smbt.comm.httpcmd.HttpCommCmd#getMethod()
	 * @see #getHttpCommCmd()
	 * @generated
	 */
	EAttribute getHttpCommCmd_Method();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.comm.httpcmd.HttpCommCmd#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command</em>'.
	 * @see net.sf.smbt.comm.httpcmd.HttpCommCmd#getCommand()
	 * @see #getHttpCommCmd()
	 * @generated
	 */
	EAttribute getHttpCommCmd_Command();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.comm.httpcmd.HttpMethod <em>Http Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Http Method</em>'.
	 * @see net.sf.smbt.comm.httpcmd.HttpMethod
	 * @generated
	 */
	EEnum getHttpMethod();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HttpcmdFactory getHttpcmdFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.smbt.comm.httpcmd.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.comm.httpcmd.impl.PropertyImpl
		 * @see net.sf.smbt.comm.httpcmd.impl.HttpcmdPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__KEY = eINSTANCE.getProperty_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.comm.httpcmd.impl.HttpCommCmdImpl <em>Http Comm Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.comm.httpcmd.impl.HttpCommCmdImpl
		 * @see net.sf.smbt.comm.httpcmd.impl.HttpcmdPackageImpl#getHttpCommCmd()
		 * @generated
		 */
		EClass HTTP_COMM_CMD = eINSTANCE.getHttpCommCmd();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_COMM_CMD__PROPERTIES = eINSTANCE.getHttpCommCmd_Properties();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_COMM_CMD__METHOD = eINSTANCE.getHttpCommCmd_Method();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_COMM_CMD__COMMAND = eINSTANCE.getHttpCommCmd_Command();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.comm.httpcmd.HttpMethod <em>Http Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.comm.httpcmd.HttpMethod
		 * @see net.sf.smbt.comm.httpcmd.impl.HttpcmdPackageImpl#getHttpMethod()
		 * @generated
		 */
		EEnum HTTP_METHOD = eINSTANCE.getHttpMethod();

	}

} //HttpcmdPackage
