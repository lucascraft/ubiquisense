/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezoscmidi.util;

import net.sf.smbt.ezoscmidi.*;
import net.sf.smbt.ezoscmidi.EzoscmidiPackage;
import net.sf.smbt.ezoscmidi.OscMidiCmd;
import net.sf.smbt.ezoscmidi.OscMidiEndSysex;
import net.sf.smbt.ezoscmidi.OscMidiNoteOff;
import net.sf.smbt.ezoscmidi.OscMidiNoteOn;
import net.sf.smbt.ezoscmidi.OscMidiPolyPressure;
import net.sf.smbt.ezoscmidi.OscMidiSysEx;
import net.sf.smbt.midi.ezmidi.AbstractMidiCmd;
import net.sf.smbt.osccmd.OscCmd;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezoscmidi.EzoscmidiPackage
 * @generated
 */
public class EzoscmidiAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzoscmidiPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzoscmidiAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EzoscmidiPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EzoscmidiSwitch<Adapter> modelSwitch =
		new EzoscmidiSwitch<Adapter>() {
			@Override
			public Adapter caseOscMidiNoteOn(OscMidiNoteOn object) {
				return createOscMidiNoteOnAdapter();
			}
			@Override
			public Adapter caseOscMidiNoteOff(OscMidiNoteOff object) {
				return createOscMidiNoteOffAdapter();
			}
			@Override
			public Adapter caseOscMidiSysEx(OscMidiSysEx object) {
				return createOscMidiSysExAdapter();
			}
			@Override
			public Adapter caseOscMidiPolyPressure(OscMidiPolyPressure object) {
				return createOscMidiPolyPressureAdapter();
			}
			@Override
			public Adapter caseOscMidiEndSysex(OscMidiEndSysex object) {
				return createOscMidiEndSysexAdapter();
			}
			@Override
			public Adapter caseOscMidiCmd(OscMidiCmd object) {
				return createOscMidiCmdAdapter();
			}
			@Override
			public Adapter caseCmd(Cmd object) {
				return createCmdAdapter();
			}
			@Override
			public Adapter caseOscCmd(OscCmd object) {
				return createOscCmdAdapter();
			}
			@Override
			public Adapter caseAbstractMidiCmd(AbstractMidiCmd object) {
				return createAbstractMidiCmdAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezoscmidi.OscMidiNoteOn <em>Osc Midi Note On</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezoscmidi.OscMidiNoteOn
	 * @generated
	 */
	public Adapter createOscMidiNoteOnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezoscmidi.OscMidiNoteOff <em>Osc Midi Note Off</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezoscmidi.OscMidiNoteOff
	 * @generated
	 */
	public Adapter createOscMidiNoteOffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezoscmidi.OscMidiSysEx <em>Osc Midi Sys Ex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezoscmidi.OscMidiSysEx
	 * @generated
	 */
	public Adapter createOscMidiSysExAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezoscmidi.OscMidiPolyPressure <em>Osc Midi Poly Pressure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezoscmidi.OscMidiPolyPressure
	 * @generated
	 */
	public Adapter createOscMidiPolyPressureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezoscmidi.OscMidiEndSysex <em>Osc Midi End Sysex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezoscmidi.OscMidiEndSysex
	 * @generated
	 */
	public Adapter createOscMidiEndSysexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezoscmidi.OscMidiCmd <em>Osc Midi Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezoscmidi.OscMidiCmd
	 * @generated
	 */
	public Adapter createOscMidiCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.xqz.model.cmd.Cmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.xqz.model.cmd.Cmd
	 * @generated
	 */
	public Adapter createCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osccmd.OscCmd <em>Osc Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osccmd.OscCmd
	 * @generated
	 */
	public Adapter createOscCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.AbstractMidiCmd <em>Abstract Midi Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.AbstractMidiCmd
	 * @generated
	 */
	public Adapter createAbstractMidiCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EzoscmidiAdapterFactory
