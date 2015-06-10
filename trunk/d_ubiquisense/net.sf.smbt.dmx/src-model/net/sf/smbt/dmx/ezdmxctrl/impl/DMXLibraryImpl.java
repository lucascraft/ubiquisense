/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.ezdmxctrl.impl;

import java.util.Collection;

import net.sf.smbt.dmx.ezdmxctrl.DMXFx;
import net.sf.smbt.dmx.ezdmxctrl.DMXLibrary;
import net.sf.smbt.dmx.ezdmxctrl.DMXProject;
import net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage;
import net.sf.smbt.dmx.model.qxf.FixtureDefinition;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DMX Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXLibraryImpl#getFixtures <em>Fixtures</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXLibraryImpl#getProjects <em>Projects</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.ezdmxctrl.impl.DMXLibraryImpl#getFx <em>Fx</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DMXLibraryImpl extends MinimalEObjectImpl.Container implements DMXLibrary {
	/**
	 * The cached value of the '{@link #getFixtures() <em>Fixtures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixtures()
	 * @generated
	 * @ordered
	 */
	protected EList<FixtureDefinition> fixtures;

	/**
	 * The cached value of the '{@link #getProjects() <em>Projects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjects()
	 * @generated
	 * @ordered
	 */
	protected EList<DMXProject> projects;

	/**
	 * The cached value of the '{@link #getFx() <em>Fx</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFx()
	 * @generated
	 * @ordered
	 */
	protected EList<DMXFx> fx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DMXLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzdmxctrlPackage.Literals.DMX_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FixtureDefinition> getFixtures() {
		if (fixtures == null) {
			fixtures = new EObjectContainmentEList<FixtureDefinition>(FixtureDefinition.class, this, EzdmxctrlPackage.DMX_LIBRARY__FIXTURES);
		}
		return fixtures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DMXProject> getProjects() {
		if (projects == null) {
			projects = new EObjectContainmentEList<DMXProject>(DMXProject.class, this, EzdmxctrlPackage.DMX_LIBRARY__PROJECTS);
		}
		return projects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DMXFx> getFx() {
		if (fx == null) {
			fx = new EObjectContainmentWithInverseEList<DMXFx>(DMXFx.class, this, EzdmxctrlPackage.DMX_LIBRARY__FX, EzdmxctrlPackage.DMX_FX__MANAGER);
		}
		return fx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EzdmxctrlPackage.DMX_LIBRARY__FX:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFx()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EzdmxctrlPackage.DMX_LIBRARY__FIXTURES:
				return ((InternalEList<?>)getFixtures()).basicRemove(otherEnd, msgs);
			case EzdmxctrlPackage.DMX_LIBRARY__PROJECTS:
				return ((InternalEList<?>)getProjects()).basicRemove(otherEnd, msgs);
			case EzdmxctrlPackage.DMX_LIBRARY__FX:
				return ((InternalEList<?>)getFx()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EzdmxctrlPackage.DMX_LIBRARY__FIXTURES:
				return getFixtures();
			case EzdmxctrlPackage.DMX_LIBRARY__PROJECTS:
				return getProjects();
			case EzdmxctrlPackage.DMX_LIBRARY__FX:
				return getFx();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EzdmxctrlPackage.DMX_LIBRARY__FIXTURES:
				getFixtures().clear();
				getFixtures().addAll((Collection<? extends FixtureDefinition>)newValue);
				return;
			case EzdmxctrlPackage.DMX_LIBRARY__PROJECTS:
				getProjects().clear();
				getProjects().addAll((Collection<? extends DMXProject>)newValue);
				return;
			case EzdmxctrlPackage.DMX_LIBRARY__FX:
				getFx().clear();
				getFx().addAll((Collection<? extends DMXFx>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case EzdmxctrlPackage.DMX_LIBRARY__FIXTURES:
				getFixtures().clear();
				return;
			case EzdmxctrlPackage.DMX_LIBRARY__PROJECTS:
				getProjects().clear();
				return;
			case EzdmxctrlPackage.DMX_LIBRARY__FX:
				getFx().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EzdmxctrlPackage.DMX_LIBRARY__FIXTURES:
				return fixtures != null && !fixtures.isEmpty();
			case EzdmxctrlPackage.DMX_LIBRARY__PROJECTS:
				return projects != null && !projects.isEmpty();
			case EzdmxctrlPackage.DMX_LIBRARY__FX:
				return fx != null && !fx.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DMXLibraryImpl
