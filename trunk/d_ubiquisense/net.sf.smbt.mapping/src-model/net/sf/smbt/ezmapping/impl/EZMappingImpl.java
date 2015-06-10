/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezmapping.impl;

import net.sf.smbt.ezmapping.EZMapping;
import net.sf.smbt.ezmapping.EzmappingPackage;
import net.sf.xqz.model.cmd.XCmd;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EZ Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmapping.impl.EZMappingImpl#getFrom <em>From</em>}</li>
 *   <li>{@link net.sf.smbt.ezmapping.impl.EZMappingImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EZMappingImpl extends AbstractEZMappingElemImpl implements EZMapping {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EZMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzmappingPackage.Literals.EZ_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier getFrom() {
		return (EClassifier)eGet(EzmappingPackage.Literals.EZ_MAPPING__FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(EClassifier newFrom) {
		eSet(EzmappingPackage.Literals.EZ_MAPPING__FROM, newFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassifier getTo() {
		return (EClassifier)eGet(EzmappingPackage.Literals.EZ_MAPPING__TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(EClassifier newTo) {
		eSet(EzmappingPackage.Literals.EZ_MAPPING__TO, newTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XCmd left2right(XCmd cmd) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XCmd right2left(XCmd cmd) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} //EZMappingImpl
