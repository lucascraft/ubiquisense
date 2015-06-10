/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012, Lucas Bigeardel
 * 
 * The library is released under:
 * 
 * A) LGPL
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA 02110-1301 USA
 * 
 * B) EPL
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Lucas Bigeardel <lucas.bigeardel@gmail.com> - Initial API and implementation
 ***********************************************************************************/

package net.sf.smbt.ui.midi.views;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Receiver;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Synthesizer;
import javax.sound.midi.Transmitter;

import net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL;
import net.sf.smbt.mappings.midi.Midi2OscMapping;
import net.sf.smbt.midi.ezmidi.DSLMidiMessage;
import net.sf.smbt.midi.utils.MidiCmdUtils;
import net.sf.smbt.midi.utils.MidiSystemUtils;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.ui.Activator;
import net.sf.smbt.ui.dialogs.CommPipeSelectionDialog;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.smbt.ui.widgets.vu.IPianoPadValuesChangeListener;
import net.sf.smbt.ui.widgets.vu.UbiMiniPianoPad;
import net.sf.smbt.ui.wizards.CommPipeConfigWizardDialog;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EVENT_KIND;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.ViewPart;

public class MidiView extends ViewPart {

	private Action openMidiInAction,
					dumpMidiAsOSC;
	
	private boolean liveNotification;

	private HashMap<String, List<Instrument>> instrumentsMap;
	
	private Sequencer    	seq;
	private Transmitter  	seqTrans;
	private Synthesizer  	synth;
	private Receiver	    synthRcvr;

	private EzMidiCmdDumper ezDumper;
	
	private CmdPipe midiPipe;
	
	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "net.sf.smbt.ui.midi.views.MidiView";



	public MidiView() {
		ezDumper = new EzMidiCmdDumper();
		liveNotification = true;
	}
	
	class EzMidiCmdDumper extends AbstractQxEventHandlerImpl {
		@Override
		public synchronized void handleQxEvent(Event event) {
			if (event.getKind() == EVENT_KIND.TX_DONE) {
				if (event.getCmd() instanceof DSLMidiMessage) {
					QuanticMojo.INSTANCE.acceptLocalAgentCmd(
						Midi2OscMapping.INSTANCE.midi2osc(((DSLMidiMessage)event.getCmd()))
					);
				}
			}
		}
	}
	private void initSequencer() {
		try {
	          seq		= MidiSystem.getSequencer();
	          seqTrans	= seq.getTransmitter();
	          synth		= MidiSystem.getSynthesizer();
	          synth.open();
	          synthRcvr	= synth.getReceiver(); 
	          seqTrans.setReceiver(synthRcvr);	
		} catch (MidiUnavailableException e) {
			e.printStackTrace();
		}
	}

	private class TreeArrayContentProvider extends ArrayContentProvider implements ITreeContentProvider {

		/**
		 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
		 */
		public Object[] getChildren(Object parentElement) {
			return new Object[0];
		}

		/**
		 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
		 */
		public Object getParent(Object element) {
			return null;
		}

		/**
		 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
		 */
		public boolean hasChildren(Object element) {
			return false;
		}

	}

	boolean useSynthetizer = true;
	ComboViewer tv;
	public void createPartControl(Composite parent) {
		parent.setBackground(GUIToolkit.BG);
		parent.setLayout(GridLayoutFactory.fillDefaults().create());
		parent.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		
		Composite container = GUIToolkit.INSTANCE.createComposite(parent);
		container.setBackground(GUIToolkit.BG);
		container.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).equalWidth(false).create());
		container.setLayoutData(GridDataFactory.fillDefaults().indent(25, 25).grab(true, true).create());
		
		initSequencer();
		
		final Button useSynthCheckbox = new Button(container, SWT.CHECK);
		useSynthCheckbox.setText("Use Midi Synthetizer");
		useSynthCheckbox.setSelection(true);
		useSynthCheckbox.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				useSynthetizer = useSynthCheckbox.getSelection();
				tv.getControl().setEnabled(useSynthetizer);
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
		useSynthCheckbox.setLayoutData(GridDataFactory.fillDefaults().grab(false, false).align(SWT.LEFT, SWT.CENTER).create());
		useSynthCheckbox.setBackground(GUIToolkit.BG);
		useSynthCheckbox.setForeground(GUIToolkit.FG);

		tv = new ComboViewer(container);
		tv.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(false, false).align(SWT.LEFT, SWT.CENTER).hint(SWT.DEFAULT, 250).minSize(SWT.DEFAULT, 200).create());
		tv.getControl().setBackground(GUIToolkit.BG);
		tv.getControl().setForeground(GUIToolkit.FG);

		tv.setContentProvider(new TreeArrayContentProvider() );
		tv.setLabelProvider(new LabelProvider(){
			@Override
			public Image getImage(Object element) {
				return super.getImage(element);
			}
			@Override
			public String getText(Object element) {
				return element == null ? "???" : element.toString();
			}
		});

		instrumentsMap = MidiSystemUtils.INSTANCE.instrumentsByBanks(synth);
		List<Instrument> instruments = new ArrayList<Instrument>();
		for (String k : instrumentsMap.keySet()) {
			for (Instrument in : instrumentsMap.get(k)) {
				int bankID = in.getPatch().getBank();
				if (bankID == 0) {
					instruments.add(in);
				}
			}
		}
		
		tv.setInput(synth != null ? instruments.toArray() : new Object[0]);
		tv.setSelection(new StructuredSelection(instruments.get(0)));
		tv.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection sel = event.getSelection();
				if (sel instanceof IStructuredSelection) {
					Object obj = ((StructuredSelection)sel).getFirstElement();
					if (obj instanceof Instrument) {
						Instrument instr = (Instrument) obj;
						if (synth.isOpen()) {
							MidiChannel[] channels = synth.getChannels();
							int program = instr.getPatch().getProgram();
							if (channels != null && channels.length>0) {
								int idx = instr.getPatch().getBank();
								synth.loadInstrument(instr);
								channels[0].programChange(idx, program);
								channels[1].programChange(idx, program);
								channels[2].programChange(idx, program);
								channels[3].programChange(idx, program);
								channels[4].programChange(idx, program);
								channels[5].programChange(idx, program);
								channels[6].programChange(idx, program);
								channels[7].programChange(idx, program);
								channels[8].programChange(idx, program);
							}
						}
					}
				}
			}
		});
		
		UbiMiniPianoPad keyPad = new UbiMiniPianoPad(container, SWT.NONE);
		keyPad.setLayout(GridLayoutFactory.fillDefaults().create());
		keyPad.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).grab(false, false).span(2, 0).hint(1008, 236).minSize(1008, 236).create());
		keyPad.addValuesChangedListeners(
			new IPianoPadValuesChangeListener() {
				@Override
				public void valueChanges(int octave, String keyCode, int command, int attack, MouseEvent event) {
					DSLMidiMessage msg = MidiCmdUtils.INSTANCE.createMidiMessage(
						command, 
						(byte) MidiSystemUtils.INSTANCE.getNote(octave, keyCode),  
						(byte) attack
					);
					if (liveNotification) {
						QuanticMojo.INSTANCE.acceptLocalAgentCmd(
							Midi2OscMapping.INSTANCE.midi2osc(msg)
						);
					}
					if (msg != null) {
						byte[] stream = MidiCmdUtils.INSTANCE.dumpLegacyMidiMessageStream(msg);
						if (useSynthetizer) {
							MidiChannel[] channels = synth.getChannels();
							if (channels != null && channels[msg.getChannel()] != null) {
								channels[msg.getChannel()].allNotesOff();
								if (ShortMessage.NOTE_ON == command){
									channels[msg.getChannel()].noteOn((int)msg.getByte1(), (int)msg.getByte1());
								} else if (ShortMessage.NOTE_OFF == command){
									channels[msg.getChannel()].noteOff((int)msg.getByte1(), (int)msg.getByte1());
								}
							}
						}
						synthRcvr.send(
							new MidiMessage(stream) {
								@Override
								public Object clone() {
									// who cares ...
									return null;
								}
							}, 
							System.currentTimeMillis()
						);
					}
				}
			}
		);
		
		makeActions();
		
		contributeToActionBars();
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(openMidiInAction);
		manager.add(new Separator());
		manager.add(dumpMidiAsOSC);
	}

	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(openMidiInAction);
		manager.add(new Separator());
		manager.add(dumpMidiAsOSC);
	}
	
	private void hookMidiPipe(CmdPipe pipe) {
		midiPipe = pipe;
		midiPipe.addQxEventHandler(
			new AbstractQxEventHandlerImpl() {
				public synchronized void handleQxEvent(net.sf.xqz.model.engine.Event event) {
					if (event.getKind() == EVENT_KIND.RX_DONE && event.getCmd() instanceof DSLMidiMessage) {
						if(!synth.isOpen()) {
							try {
								synth.open();
							} catch (MidiUnavailableException e) {
								e.printStackTrace();
								return;
							}
						}
						if (synthRcvr != null) {
							DSLMidiMessage msg = (DSLMidiMessage) event.getCmd();
							if (liveNotification) {
								QuanticMojo.INSTANCE.acceptLocalAgentCmd(
									Midi2OscMapping.INSTANCE.midi2osc(msg)
								);
							}
							byte[] stream = MidiCmdUtils.INSTANCE.dumpLegacyMidiMessageStream(msg);
							synthRcvr.send(
								new MidiMessage(stream) {
									@Override
									public Object clone() {
										// who cares ...
										return null;
									}
								}, 
								System.currentTimeMillis()
							);
						}
					}
				};
			}
		);
	}

	private void makeActions() {
		openMidiInAction = new Action() {
			public void run() {
				CommPipeSelectionDialog dlg = new CommPipeSelectionDialog(new TRANSPORT_PROTOCOL[] {TRANSPORT_PROTOCOL.USB, TRANSPORT_PROTOCOL.UDP, TRANSPORT_PROTOCOL.TCP, TRANSPORT_PROTOCOL.MIDI }, new String[] {"midi"});
				if (dlg.open() == Window.OK) {
					Object[] results = dlg.getResult();
					if (results != null) {
						for (Object obj : results) {
							if (obj instanceof CmdPipe) {
								CmdPipe p = (CmdPipe) obj;
								hookMidiPipe(p);
							}
						}
					} else {
						CommPipeConfigWizardDialog pipeConfigWizardDialog = new CommPipeConfigWizardDialog(new TRANSPORT_PROTOCOL[] { TRANSPORT_PROTOCOL.USB, TRANSPORT_PROTOCOL.UDP, TRANSPORT_PROTOCOL.TCP, TRANSPORT_PROTOCOL.MIDI }, new String[] {"midi"});
						int status = pipeConfigWizardDialog.open();
						if (status == Window.OK) {
							CmdPipe pipe = pipeConfigWizardDialog.getSelection();
							if (pipe != null) {
								hookMidiPipe(pipe);
							}
						}
					}
				}
			}
		};
		
		openMidiInAction.setText("Connection To Midi");
		openMidiInAction.setToolTipText("Connection To Midi Input Pipe");
		openMidiInAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui", 
				"icons/midiIcon.gif"
			)
		);
		
		dumpMidiAsOSC = new Action("Dump ThingM as OSC", SWT.TOGGLE){
			@Override
			public void run() {
				super.run();
				liveNotification = isChecked();
				midiPipe.removeQxEventHandler(ezDumper);
				if (liveNotification) {
					midiPipe.addQxEventHandler(ezDumper);
				}
			}
		};
		dumpMidiAsOSC.setToolTipText("Dump ThingM as OSC in the console");
		dumpMidiAsOSC.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui", 
				"icons/status/software-update-available.png"
			)
		);

		
		/*
		disconnectMidiInAction = new Action() {
			public void run() {
				showMessage("Disconnection From Arduino Executed");
			}
		};
		disconnectMidiInAction.setText("Disconnection From Arduino");
		disconnectMidiInAction.setToolTipText("Disconnection From Arduino Tooltip");
		disconnectMidiInAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.firmata.ubiquino", 
				"icons/arduino-remove.png"
			)
		);

		muteToggleAction = new Action() {
			public void run() {
				showMessage("Refresh Arduino Executed");
			}
		};
		muteToggleAction.setText("Refresh Arduino");
		muteToggleAction.setToolTipText("Refresh Arduino Tooltip");
		muteToggleAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.firmata.ubiquino", 
				"icons/arduino-refresh.png"
			)
		);
	
		editMidiAction = new Action() {
			public void run() {
				showMessage("Edit Arduino Properties Executed");
			}
		};
		editMidiAction.setText("Edit Arduino Properties");
		editMidiAction.setToolTipText("Edit Arduino Properties Tooltip");
		editMidiAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.firmata.ubiquino", 
				"icons/arduino-open.png"
			)
		);
		*/
	}

	/*
	private void showMessage(String message) {
		MessageDialog.openInformation(
			Display.getDefault().getActiveShell(),
			"Midi View",
			message);
	}
	 */
	
	
	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		//pane.getViewer().getControl().setFocus();
	}
}
