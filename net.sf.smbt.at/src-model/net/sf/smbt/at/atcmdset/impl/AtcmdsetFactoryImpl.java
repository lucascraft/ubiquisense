/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.at.atcmdset.impl;

import net.sf.smbt.at.atcmdset.*;
import net.sf.smbt.at.atcmdset.ATCmd;
import net.sf.smbt.at.atcmdset.ATRetCmd;
import net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES;
import net.sf.smbt.at.atcmdset.AT_COUNTRY_CODES;
import net.sf.smbt.at.atcmdset.AT_RET_CODES;
import net.sf.smbt.at.atcmdset.AtcmdsetFactory;
import net.sf.smbt.at.atcmdset.AtcmdsetPackage;
import net.sf.smbt.at.atcmdset.V34_COMMAND_TYPES;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class AtcmdsetFactoryImpl extends EFactoryImpl implements AtcmdsetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AtcmdsetFactory init() {
		try {
			AtcmdsetFactory theAtcmdsetFactory = (AtcmdsetFactory)EPackage.Registry.INSTANCE.getEFactory("http://atcmdset/1.0"); 
			if (theAtcmdsetFactory != null) {
				return theAtcmdsetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AtcmdsetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtcmdsetFactoryImpl() {
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
			case AtcmdsetPackage.AT_CMD: return createATCmd();
			case AtcmdsetPackage.AT_RET_CMD: return createATRetCmd();
			case AtcmdsetPackage.AT_PLUS_PLUS_PLUS: return createATPlusPlusPlus();
			case AtcmdsetPackage.ATBD: return createATBD();
			case AtcmdsetPackage.ATWR: return createATWR();
			case AtcmdsetPackage.ATCN: return createATCN();
			case AtcmdsetPackage.ATID: return createATID();
			case AtcmdsetPackage.ATMY: return createATMY();
			case AtcmdsetPackage.ATDL: return createATDL();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AtcmdsetPackage.AT_COMMAND_TYPES:
				return createAT_COMMAND_TYPESFromString(eDataType, initialValue);
			case AtcmdsetPackage.V34_COMMAND_TYPES:
				return createV34_COMMAND_TYPESFromString(eDataType, initialValue);
			case AtcmdsetPackage.AT_RET_CODES:
				return createAT_RET_CODESFromString(eDataType, initialValue);
			case AtcmdsetPackage.AT_COUNTRY_CODES:
				return createAT_COUNTRY_CODESFromString(eDataType, initialValue);
			case AtcmdsetPackage.AT_BAUD_RATE:
				return createAT_BAUD_RATEFromString(eDataType, initialValue);
			case AtcmdsetPackage.AT_STATUS:
				return createAT_STATUSFromString(eDataType, initialValue);
			case AtcmdsetPackage.CMD_KIND:
				return createCMD_KINDFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AtcmdsetPackage.AT_COMMAND_TYPES:
				return convertAT_COMMAND_TYPESToString(eDataType, instanceValue);
			case AtcmdsetPackage.V34_COMMAND_TYPES:
				return convertV34_COMMAND_TYPESToString(eDataType, instanceValue);
			case AtcmdsetPackage.AT_RET_CODES:
				return convertAT_RET_CODESToString(eDataType, instanceValue);
			case AtcmdsetPackage.AT_COUNTRY_CODES:
				return convertAT_COUNTRY_CODESToString(eDataType, instanceValue);
			case AtcmdsetPackage.AT_BAUD_RATE:
				return convertAT_BAUD_RATEToString(eDataType, instanceValue);
			case AtcmdsetPackage.AT_STATUS:
				return convertAT_STATUSToString(eDataType, instanceValue);
			case AtcmdsetPackage.CMD_KIND:
				return convertCMD_KINDToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATCmd createATCmd() {
		ATCmdImpl atCmd = new ATCmdImpl();
		return atCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATRetCmd createATRetCmd() {
		ATRetCmdImpl atRetCmd = new ATRetCmdImpl();
		return atRetCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATPlusPlusPlus createATPlusPlusPlus() {
		ATPlusPlusPlusImpl atPlusPlusPlus = new ATPlusPlusPlusImpl();
		return atPlusPlusPlus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATBD createATBD() {
		ATBDImpl atbd = new ATBDImpl();
		return atbd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATWR createATWR() {
		ATWRImpl atwr = new ATWRImpl();
		return atwr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATCN createATCN() {
		ATCNImpl atcn = new ATCNImpl();
		return atcn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATID createATID() {
		ATIDImpl atid = new ATIDImpl();
		return atid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATMY createATMY() {
		ATMYImpl atmy = new ATMYImpl();
		return atmy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATDL createATDL() {
		ATDLImpl atdl = new ATDLImpl();
		return atdl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AT_COMMAND_TYPES createAT_COMMAND_TYPESFromString(EDataType eDataType, String initialValue) {
		AT_COMMAND_TYPES result = AT_COMMAND_TYPES.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAT_COMMAND_TYPESToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public V34_COMMAND_TYPES createV34_COMMAND_TYPESFromString(EDataType eDataType, String initialValue) {
		V34_COMMAND_TYPES result = V34_COMMAND_TYPES.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertV34_COMMAND_TYPESToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AT_RET_CODES createAT_RET_CODESFromString(EDataType eDataType, String initialValue) {
		AT_RET_CODES result = AT_RET_CODES.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAT_RET_CODESToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AT_COUNTRY_CODES createAT_COUNTRY_CODESFromString(EDataType eDataType, String initialValue) {
		AT_COUNTRY_CODES result = AT_COUNTRY_CODES.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAT_COUNTRY_CODESToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AT_BAUD_RATE createAT_BAUD_RATEFromString(EDataType eDataType, String initialValue) {
		AT_BAUD_RATE result = AT_BAUD_RATE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAT_BAUD_RATEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AT_STATUS createAT_STATUSFromString(EDataType eDataType, String initialValue) {
		AT_STATUS result = AT_STATUS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAT_STATUSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMD_KIND createCMD_KINDFromString(EDataType eDataType, String initialValue) {
		CMD_KIND result = CMD_KIND.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCMD_KINDToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtcmdsetPackage getAtcmdsetPackage() {
		return (AtcmdsetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AtcmdsetPackage getPackage() {
		return AtcmdsetPackage.eINSTANCE;
	}

} //AtcmdsetFactoryImpl
