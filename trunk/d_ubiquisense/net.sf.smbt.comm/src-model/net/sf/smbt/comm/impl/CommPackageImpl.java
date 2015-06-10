/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.comm.impl;

import net.sf.smbt.comm.BTPort;
import net.sf.smbt.comm.CommFactory;
import net.sf.smbt.comm.CommPackage;
import net.sf.smbt.comm.HttpPort;
import net.sf.smbt.comm.ProcessPort;
import net.sf.smbt.comm.TcpInJob;
import net.sf.smbt.comm.TcpOutJob;
import net.sf.smbt.comm.TcpPort;
import net.sf.smbt.comm.UbiPort;
import net.sf.smbt.comm.UdpInJob;
import net.sf.smbt.comm.UdpOutJob;
import net.sf.smbt.comm.UdpPort;

import net.sf.smbt.comm.UsbPort;
import net.sf.smbt.comm.XBeePort;
import net.sf.xqz.model.cmd.CmdPackage;

import net.sf.xqz.model.engine.EnginePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommPackageImpl extends EPackageImpl implements CommPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass udpPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcpPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usbPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass btPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xBeePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ubiPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass udpInJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcpInJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass udpOutJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcpOutJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processPortEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.sf.smbt.comm.CommPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommPackageImpl() {
		super(eNS_URI, CommFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CommPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommPackage init() {
		if (isInited) return (CommPackage)EPackage.Registry.INSTANCE.getEPackage(CommPackage.eNS_URI);

		// Obtain or create and register package
		CommPackageImpl theCommPackage = (CommPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CommPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CommPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EnginePackage.eINSTANCE.eClass();
		CmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCommPackage.createPackageContents();

		// Initialize created meta-data
		theCommPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommPackage.eNS_URI, theCommPackage);
		return theCommPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUdpPort() {
		return udpPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTcpPort() {
		return tcpPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsbPort() {
		return usbPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBTPort() {
		return btPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHttpPort() {
		return httpPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXBeePort() {
		return xBeePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUbiPort() {
		return ubiPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUdpInJob() {
		return udpInJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTcpInJob() {
		return tcpInJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUdpOutJob() {
		return udpOutJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTcpOutJob() {
		return tcpOutJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessPort() {
		return processPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommFactory getCommFactory() {
		return (CommFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		udpPortEClass = createEClass(UDP_PORT);

		tcpPortEClass = createEClass(TCP_PORT);

		usbPortEClass = createEClass(USB_PORT);

		btPortEClass = createEClass(BT_PORT);

		httpPortEClass = createEClass(HTTP_PORT);

		xBeePortEClass = createEClass(XBEE_PORT);

		ubiPortEClass = createEClass(UBI_PORT);

		udpInJobEClass = createEClass(UDP_IN_JOB);

		tcpInJobEClass = createEClass(TCP_IN_JOB);

		udpOutJobEClass = createEClass(UDP_OUT_JOB);

		tcpOutJobEClass = createEClass(TCP_OUT_JOB);

		processPortEClass = createEClass(PROCESS_PORT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EnginePackage theEnginePackage = (EnginePackage)EPackage.Registry.INSTANCE.getEPackage(EnginePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		udpPortEClass.getESuperTypes().add(theEnginePackage.getPort());
		tcpPortEClass.getESuperTypes().add(theEnginePackage.getPort());
		usbPortEClass.getESuperTypes().add(theEnginePackage.getPort());
		btPortEClass.getESuperTypes().add(theEnginePackage.getPort());
		httpPortEClass.getESuperTypes().add(theEnginePackage.getPort());
		xBeePortEClass.getESuperTypes().add(theEnginePackage.getPort());
		ubiPortEClass.getESuperTypes().add(theEnginePackage.getPort());
		udpInJobEClass.getESuperTypes().add(theEnginePackage.getInputJob());
		tcpInJobEClass.getESuperTypes().add(theEnginePackage.getInputJob());
		udpOutJobEClass.getESuperTypes().add(theEnginePackage.getOutputJob());
		tcpOutJobEClass.getESuperTypes().add(theEnginePackage.getOutputJob());
		processPortEClass.getESuperTypes().add(theEnginePackage.getPort());

		// Initialize classes and features; add operations and parameters
		initEClass(udpPortEClass, UdpPort.class, "UdpPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tcpPortEClass, TcpPort.class, "TcpPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(usbPortEClass, UsbPort.class, "UsbPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(btPortEClass, BTPort.class, "BTPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(httpPortEClass, HttpPort.class, "HttpPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xBeePortEClass, XBeePort.class, "XBeePort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ubiPortEClass, UbiPort.class, "UbiPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(udpInJobEClass, UdpInJob.class, "UdpInJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tcpInJobEClass, TcpInJob.class, "TcpInJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(udpOutJobEClass, UdpOutJob.class, "UdpOutJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tcpOutJobEClass, TcpOutJob.class, "TcpOutJob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processPortEClass, ProcessPort.class, "ProcessPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CommPackageImpl
