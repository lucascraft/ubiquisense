/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.dmx.model.ezdmx.impl;

import net.sf.smbt.dmx.model.ezdmx.EzdmxPackage;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXFade;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open DMX Fade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXFadeImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXFadeImpl#getR <em>R</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXFadeImpl#getG <em>G</em>}</li>
 *   <li>{@link net.sf.smbt.dmx.model.ezdmx.impl.OpenDMXFadeImpl#getB <em>B</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpenDMXFadeImpl extends OpenDMXCmdImpl implements OpenDMXFade {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenDMXFadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzdmxPackage.Literals.OPEN_DMX_FADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getChannel() {
		return (Integer)eGet(EzdmxPackage.Literals.OPEN_DMX_FADE__CHANNEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannel(int newChannel) {
		eSet(EzdmxPackage.Literals.OPEN_DMX_FADE__CHANNEL, newChannel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getR() {
		return (Integer)eGet(EzdmxPackage.Literals.OPEN_DMX_FADE__R, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR(int newR) {
		eSet(EzdmxPackage.Literals.OPEN_DMX_FADE__R, newR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getG() {
		return (Integer)eGet(EzdmxPackage.Literals.OPEN_DMX_FADE__G, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setG(int newG) {
		eSet(EzdmxPackage.Literals.OPEN_DMX_FADE__G, newG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getB() {
		return (Integer)eGet(EzdmxPackage.Literals.OPEN_DMX_FADE__B, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB(int newB) {
		eSet(EzdmxPackage.Literals.OPEN_DMX_FADE__B, newB);
	}

} //OpenDMXFadeImpl
