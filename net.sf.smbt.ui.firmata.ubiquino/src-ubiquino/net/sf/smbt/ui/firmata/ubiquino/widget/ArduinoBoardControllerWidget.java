/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012 - 2015, Lucas Bigeardel
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

package net.sf.smbt.ui.firmata.ubiquino.widget;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import net.sf.smbt.firmata.handlers.FirmataQxEventHandler;
import net.sf.smbt.firmata.ubiquino.PortConfig;
import net.sf.smbt.firmata.ubiquino.PortConfigKind;
import net.sf.smbt.firmata.ubiquino.Ubiquino;
import net.sf.smbt.firmata.ubiquino.core.UbiquinoUtils;
import net.sf.smbt.firmata.utils.FirmataCmdUtils;
import net.sf.smbt.mdl.arduino.ARDUINO_REPORT_MODE;
import net.sf.smbt.mdl.arduino.AnalogPort;
import net.sf.smbt.mdl.arduino.ArduinoPackage;
import net.sf.smbt.mdl.arduino.DigitalPort;
import net.sf.smbt.mdl.arduino.PIN_MAPPING;
import net.sf.smbt.mdl.arduino.PIN_MODE;
import net.sf.smbt.mdl.arduino.PWM_MODE;
import net.sf.smbt.mdl.arduino.Port;
import net.sf.smbt.midi.ezmidi.DSLMidiMessage;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.smbt.ui.hmi.UbiJob;
import net.sf.smbt.ui.widgets.vu.UbiVuMeter;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EVENT_KIND;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Slider;

public class ArduinoBoardControllerWidget extends Composite {
	private CmdPipe pipe;
	private UpdateJob uJob;
	private Label versionLabel;
	private Label statusLabel;
	private static Ubiquino ubiquino;
	
	private Map<Port, Label> 		analogLabelsMap;
	private Map<Port, Button> 		analogButtonMaps;
	private Map<Port, Composite> 	analogBagsMap;
	private Map<Port, ComboViewer> 	analogModeCombosMap;

	private Map<Port, Label> 		digitalLabelsMap;
	private Map<Port, Button> 		digitalButtonMaps;
	private Map<Port, Slider> 		digitalServoSlidersMap;
	private Map<Port, Slider> 		digitalPWMSlidersMap;
	private Map<Port, Composite> 	digitalBagsMap;
	private Map<Port, ComboViewer> 	digitalModeCombosMap;
	
	private Map<Control, SelectionListener> selectionListenerMap;
	private Map<Control, ISelectionChangedListener> selectionChangedListenerMap;

	private Map<Port, UbiVuMeter> 	metersMap;
	private FirmataQxEventHandler 	firmataQxEventHandler;
	
	private Font font;
	
	private SyncJob sJob;
	
	class SyncJob extends UbiJob {
		public SyncJob() {
			super("Firmata Syncronization");
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			syncBoard();
			schedule(10000);
			return Status.OK_STATUS;
		}
	}
	
	
	public ArduinoBoardControllerWidget(Composite parent, Ubiquino _ubiquino, CmdPipe _pipe) {
		super(parent, SWT.NONE);
		
		font = Display.getDefault().getSystemFont();
		
		analogLabelsMap			= new HashMap<Port, Label>();
		analogButtonMaps		= new HashMap<Port, Button>();
		analogBagsMap			= new HashMap<Port, Composite>();
		analogModeCombosMap		= new HashMap<Port, ComboViewer>();
		
		digitalLabelsMap		= new HashMap<Port, Label>();
		digitalButtonMaps		= new HashMap<Port, Button>();
		digitalPWMSlidersMap 	= new HashMap<Port, Slider>();
		digitalServoSlidersMap 	= new HashMap<Port, Slider>();
		digitalBagsMap			= new HashMap<Port, Composite>();
		digitalModeCombosMap	= new HashMap<Port, ComboViewer>();
		
		selectionListenerMap	= new HashMap<Control, SelectionListener>();
		selectionChangedListenerMap	= new HashMap<Control, ISelectionChangedListener>();
		
		metersMap 				= new HashMap<Port, UbiVuMeter>();
		
		ubiquino				= _ubiquino;
		pipe					= _pipe;
		
		firmataQxEventHandler = new FirmataQxEventHandler() {
			public void handleQxEvent(net.sf.xqz.model.engine.Event event) {
				if (event.getKind().equals(EVENT_KIND.RX_DONE)) {
					UbiquinoUtils.INSTANCE.handleUbiquinoSysexCmdEvent(ubiquino.getBoard(), event.getCmd());
				}
				super.handleQxEvent(event);
			};
		};

		updatePipe(pipe);
		
		setBackground(GUIToolkit.BG);
		setLayout(GridLayoutFactory.fillDefaults().create());
		setLayoutData(GridDataFactory.fillDefaults().hint(SWT.DEFAULT, 200).minSize(SWT.DEFAULT, 200).indent(25, 25).grab(true, true).create());
		
		createContent(this);
		
		uJob = new UpdateJob();
		uJob.schedule();
		
		sJob = new SyncJob();
		sJob.schedule();
	}

	public void updatePipe(CmdPipe pipe) {
		this.pipe = pipe;
		if (pipe != null) {
			pipe.removeQxEventHandler(firmataQxEventHandler);
			pipe.addQxEventHandler(firmataQxEventHandler);
		}
	}
	final class UpdateJob extends UbiJob {
		public UpdateJob() {
			super("Ubiquino Update");
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			if (ubiquino != null && ubiquino.getBoard() != null && metersMap != null ) {
				for (Port p : ubiquino.getBoard().getAnalogPorts()) {
					if (p instanceof AnalogPort) {
						if (metersMap.get(p) != null && !metersMap.get(p).isDisposed()) {
								metersMap.get(p).setLevel(((AnalogPort)p).getValue());
						}
						if (!analogLabelsMap.get(p).isDisposed()) {
							analogLabelsMap.get(p).setText("A"+p.getChannel()+" : " + ((AnalogPort)p).getValue());
							analogLabelsMap.get(p).setBackground(GUIToolkit.BG);
						}
					}
					if (statusLabel != null && !statusLabel.isDisposed()) {
						boolean connected = pipe != null; 
						statusLabel.setText(ubiquino.getBoard().getBoard().getLiteral() + "  " + (connected ? "" : " not") + " connected");
						statusLabel.setForeground(connected ? ColorConstants.lightGreen : ColorConstants.orange);
						statusLabel.setBackground(GUIToolkit.BG);
					}
				}
				if (versionLabel != null && !versionLabel.isDisposed()) {
					versionLabel.setText("Firmata v " + ubiquino.getBoard().getFirmataMode().getName());
					versionLabel.setBackground(GUIToolkit.BG);
				}
			}
			schedule(75);
			return Status.OK_STATUS;
		}
	}
	
	public void createContent(Composite parent) {
		setBackground(GUIToolkit.BG);
		
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(GridLayoutFactory.fillDefaults().margins(0, 0).spacing(0, 0).extendedMargins(0, 0, 0, 0).create());
		container.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		container.setBackground(GUIToolkit.BG);
		
		boolean connected = pipe != null; 

		statusLabel = new Label(container, SWT.NONE);
		statusLabel.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		statusLabel.setText(ubiquino.getBoard().getBoard().getLiteral() + "  " + (connected ? "" : " not") + " connected");
		statusLabel.setForeground(connected ? ColorConstants.lightGreen : ColorConstants.orange);
		statusLabel.setBackground(GUIToolkit.BG);
		
		versionLabel = new Label(container, SWT.NONE);
		versionLabel.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		versionLabel.setText("Firmata v " + ubiquino.getBoard().getFirmataMode().getName());
		versionLabel.setForeground(ColorConstants.lightGreen);
		versionLabel.setBackground(GUIToolkit.BG);
		
		
		Composite digitalGrp = new Composite(container, SWT.NONE);
		digitalGrp.setLayout(GridLayoutFactory.fillDefaults().margins(0, 10).spacing(0, 0).extendedMargins(0, 0, 0, 0).create());
		digitalGrp.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		digitalGrp.setBackground(GUIToolkit.BG);
		
		Composite digitalContainer = new Composite(digitalGrp, SWT.NONE);
		digitalContainer.setLayout(GridLayoutFactory.fillDefaults().margins(0, 0).spacing(0, 0).extendedMargins(0, 0, 0, 0).numColumns(5).create());
		digitalContainer.setLayoutData(GridDataFactory.fillDefaults().create());
		digitalContainer.setBackground(GUIToolkit.BG);
		
		for (PortConfig cfg : ubiquino.getConfig().getPorts()) {
			if (PortConfigKind.DIGITAL.equals(cfg.getKind())) {
				createDigitalPanel(cfg, digitalContainer);
			}
		}

		Composite analogGrp = new Composite(container, SWT.NONE);
		analogGrp.setLayout(GridLayoutFactory.fillDefaults().margins(0, 10).spacing(0, 0).extendedMargins(0, 0, 0, 0).create());
		analogGrp.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		analogGrp.setBackground(GUIToolkit.BG);

		Composite analogContainer = new Composite(analogGrp, SWT.NONE);
		analogContainer.setLayout(GridLayoutFactory.fillDefaults().margins(0, 0).spacing(0, 0).extendedMargins(0, 0, 0, 0).numColumns(5).create());
		analogContainer.setLayoutData(GridDataFactory.fillDefaults().create());
		analogContainer.setBackground(GUIToolkit.BG);

		int idxA = 0;
		for (PortConfig cfg : ubiquino.getConfig().getPorts()) {
			if (PortConfigKind.ANALOGIC.equals(cfg.getKind())) {
				createAnalogSlider(cfg, analogContainer);
			}
		}
}
	
	
	private void createDigitalPanel(PortConfig cfg, Composite parent) {
		final StackLayout stackLayout = new StackLayout();
		stackLayout.marginHeight	= 0;
		stackLayout.marginWidth		= 0;

		final DigitalPort p = (DigitalPort) cfg.getTarget();
		
		Label lbl = new Label(parent, SWT.READ_ONLY);
		lbl.setText("Pin " + cfg.getTarget().getMap() + " : ");
		lbl.setForeground(ColorConstants.lightGray);
		lbl.setBackground(GUIToolkit.BG);

		final Button callBackCheckbox = new Button(parent, SWT.CHECK);
		callBackCheckbox.setLayoutData(GridDataFactory.fillDefaults().grab(false, false).indent(10, 0).align(SWT.RIGHT, SWT.CENTER).create());
		callBackCheckbox.setBackground(GUIToolkit.BG);
		selectionListenerMap.put(callBackCheckbox, new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				p.eSetDeliver(false);
				ARDUINO_REPORT_MODE mode = callBackCheckbox.getSelection() ? ARDUINO_REPORT_MODE.ACTIVATE : ARDUINO_REPORT_MODE.DEACTIVATE;
				p.setReport(mode);
				p.eSetDeliver(true);
				if (p instanceof DigitalPort) {
					if (pipe != null) {
						DSLMidiMessage msg = FirmataCmdUtils.INSTANCE.createReportDigitalPin(
							p.getMap().getValue(), 
							mode.getValue()
						);
						pipe.send(msg);
					}
					Button b = digitalButtonMaps.get(p);
					PWM_MODE pwm = PWM_MODE.NONE;
					if (b != null) {
						pwm = PWM_MODE.HIGH.getName().equals(b.getText()) ? PWM_MODE.HIGH: PWM_MODE.LOW; 
					}
					StructuredSelection ssel = (StructuredSelection) digitalModeCombosMap.get(p).getSelection();
					updatePort(p, callBackCheckbox.getSelection(), (PIN_MODE) ssel.getFirstElement(), pwm);
				}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
		callBackCheckbox.addSelectionListener(selectionListenerMap.get(callBackCheckbox));
		callBackCheckbox.setSelection(isPortActive(p));

		ComboViewer modesCombo = new ComboViewer(new Combo(parent, SWT.READ_ONLY));
		modesCombo.getControl().setLayoutData(GridDataFactory.fillDefaults().hint(100, SWT.DEFAULT).indent(10, 0).align(SWT.RIGHT, SWT.CENTER).grab(false, false).create());
		modesCombo.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof PIN_MODE) {
					return ((PIN_MODE)element).getLiteral();
				}
				return super.getText(element);
			}
		});
		modesCombo.setContentProvider(new ArrayContentProvider());
		modesCombo.setInput(Arrays.asList(new PIN_MODE[]{PIN_MODE.INPUT, PIN_MODE.OUTPUT, PIN_MODE.PWM, PIN_MODE.SERVO}));
		selectionChangedListenerMap.put(modesCombo.getControl(), new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection sel = event.getSelection();
				if (sel instanceof StructuredSelection) {
					Object obj = ((StructuredSelection)sel).getFirstElement();
					if (obj instanceof PIN_MODE) {
						PIN_MODE mode = (PIN_MODE) obj;
						switch (mode) {
							case INPUT: 
								stackLayout.topControl = digitalLabelsMap.get(p);
								break;
							case OUTPUT:
								stackLayout.topControl = digitalButtonMaps.get(p);
								break;
							case PWM:
								stackLayout.topControl = digitalPWMSlidersMap.get(p);
								break;
							case SERVO:
								stackLayout.topControl = digitalServoSlidersMap.get(p);
								break;
							case SHIFT:
							default:
								break;
						}
						Button b = digitalButtonMaps.get(p);
						PWM_MODE pwm = PWM_MODE.NONE;
						if (b != null) {
							pwm = PWM_MODE.HIGH.getName().equals(b.getText()) ? PWM_MODE.HIGH: PWM_MODE.LOW; 
						}
						updatePort(p, callBackCheckbox.getSelection(), mode, pwm);
						
						digitalBagsMap.get(p).layout(true);
						if (stackLayout.topControl != null) {
							stackLayout.topControl.redraw();
						}
						digitalBagsMap.get(p).redraw();

						switch(mode) {
							case INPUT:
							case OUTPUT:
							case PWM:
								if (pipe != null) {
									pipe.send(
										FirmataCmdUtils.INSTANCE.createSetPinMode(
											p.getMap().getValue(), 
											mode.getValue()
										)
									);
								}
							break;
							case SERVO:
								if (pipe != null) {
									pipe.send(
										FirmataCmdUtils.INSTANCE.createSetServo(
											p.getMap().getValue(), 
											0,
											20,
											0
										)
									);
								}
								break;
							case SHIFT:
							default:
								break;
						}
					}
				}
			}
		}
		);
		modesCombo.addSelectionChangedListener(selectionChangedListenerMap.get(modesCombo.getControl()));
		
		digitalModeCombosMap.put(p, modesCombo);
			
		Composite bag = new Composite(parent, SWT.NONE);
		bag.setLayout(stackLayout);
		bag.setLayoutData(GridDataFactory.fillDefaults().hint(100, SWT.DEFAULT).indent(10, 0).align(SWT.RIGHT, SWT.CENTER).grab(false, false).create());
		bag.setBackground(GUIToolkit.BG);
		bag.redraw();
	
		digitalBagsMap.put(p, bag);

		modesCombo.setSelection(new StructuredSelection(cfg.getMode()));
			
		Label label = new Label(bag, SWT.NONE);
		label.setText("---");
		label.setFont(font);
		label.setForeground(ColorConstants.lightGreen);
		label.setBackground(GUIToolkit.BG);
		label.setLayoutData(GridDataFactory.fillDefaults().hint(100, SWT.DEFAULT).indent(10, 0).align(SWT.RIGHT, SWT.CENTER).grab(false, false).create());
			
		digitalLabelsMap.put(p, label);
			
		final Button hiloButton = new Button(bag, SWT.TOGGLE);
		hiloButton.setText(PWM_MODE.HIGH.getName());
		
		selectionListenerMap.put(hiloButton, 		
			new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					hiloButton.setText(hiloButton.getSelection() ? PWM_MODE.LOW.getName() : PWM_MODE.HIGH.getName());
					if (pipe != null) {
						pipe.send(
							FirmataCmdUtils.INSTANCE.createDigitalIO(
								p.getMap().getValue(), 
								hiloButton.getSelection() ? PWM_MODE.HIGH_VALUE : PWM_MODE.LOW_VALUE
							)
						);
					}
					Button b = digitalButtonMaps.get(p);
					PWM_MODE pwm = PWM_MODE.NONE;
					if (b != null) {
						pwm = PWM_MODE.HIGH.getName().equals(b.getText()) ? PWM_MODE.LOW: PWM_MODE.HIGH; 
					}
					StructuredSelection ssel = (StructuredSelection) digitalModeCombosMap.get(p).getSelection();
					updatePort(p, callBackCheckbox.getSelection(), (PIN_MODE) ssel.getFirstElement(), pwm);
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
		);
		hiloButton.setLayoutData(GridDataFactory.fillDefaults().hint(100, SWT.DEFAULT).grab(false, false).create());
		hiloButton.setSelection(PWM_MODE.LOW.equals(cfg.getPwm()));
		
		digitalButtonMaps.put(p, hiloButton);
	
		Slider sliderPWM = new Slider(bag, SWT.NONE);
		sliderPWM.setMinimum(0);
		sliderPWM.setMaximum(255);
		sliderPWM.setLayoutData(GridDataFactory.fillDefaults().hint(200, SWT.DEFAULT).grab(false, false).create());
		sliderPWM.setBackground(GUIToolkit.BG);
		
		selectionListenerMap.put(sliderPWM, new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (pipe != null) {
						pipe.send(
							FirmataCmdUtils.INSTANCE.createDigitalIO(
								p.getMap().getValue(), 
								digitalPWMSlidersMap.get(p).getSelection()
							)
						);
					}
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
		);
		sliderPWM.addSelectionListener(selectionListenerMap.get(sliderPWM));
			
		digitalPWMSlidersMap.put(p, sliderPWM);
	
		Slider sliderServo = new Slider(bag, SWT.NONE);
		sliderServo.setMinimum(0);
		sliderServo.setMaximum(180);
		sliderServo.setLayoutData(GridDataFactory.fillDefaults().hint(100, SWT.DEFAULT).grab(false, false).create());
		sliderServo.setBackground(GUIToolkit.BG);
		
		selectionListenerMap.put(sliderServo, new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (pipe != null) {
					if (p.getMap().getValue() < 15) {
						pipe.send(
							FirmataCmdUtils.INSTANCE.createDigitalIO(
								p.getMap().getValue(), 
								digitalPWMSlidersMap.get(p).getSelection()
							)
						);
					} else {
						pipe.send(
							FirmataCmdUtils.INSTANCE.createExtendedAnalog(
								p.getMap().getValue(), 
								digitalPWMSlidersMap.get(p).getSelection()
							)
						);
					}
				}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
		sliderServo.addSelectionListener(selectionListenerMap.get(sliderServo));
			
		digitalServoSlidersMap.put(p, sliderServo);
			
		stackLayout.topControl = hiloButton;
			
		final Label placeholder = new Label(parent, SWT.NONE);
		placeholder.setText("");
			
		parent.layout(true, true);
	}
		
	private void updatePort(Port p, boolean active, PIN_MODE mode, PWM_MODE pwm) {
		for (PortConfig cfg : ubiquino.getConfig().getPorts()) {
			Port target = cfg.getTarget();
			if (target != null && target.getMap().equals(p.getMap())) {
				//toAdd = false;
				if (mode != null	&& cfg.getMode() != mode) {
					cfg.setMode(mode);
				}
				if (pwm != null		&& cfg.getPwm() != pwm) {
					cfg.setPwm(pwm);
				}
				if (cfg.isEnabled() != active) {
					cfg.setEnabled(active);
				}
			}
		}
	}
	
	private boolean isPortActive(Port p) {
		for (PortConfig cfg : ubiquino.getConfig().getPorts()) {
			if (cfg.getTarget() != null && cfg.getTarget().getMap().equals(p.getMap())) {
				return cfg.isEnabled();
			}
		}
		return false;
	}
	
	private void createAnalogSlider(final PortConfig cfg, Composite parent) {
		final StackLayout stackLayout = new StackLayout();
		stackLayout.marginHeight	= 0;
		stackLayout.marginWidth		= 0;
		
		final AnalogPort p = (AnalogPort) cfg.getTarget();
		Label lbl = new Label(parent, SWT.READ_ONLY);
		lbl.setText("Pin " + cfg.getTarget().getMap() + " : ");
		lbl.setForeground(ColorConstants.lightGray);
		lbl.setBackground(GUIToolkit.BG);

		final Button callBackCheckbox = new Button(parent, SWT.CHECK);
		callBackCheckbox.setLayoutData(GridDataFactory.fillDefaults().grab(false, false).indent(10, 0).align(SWT.RIGHT, SWT.CENTER).create());
		selectionListenerMap.put(callBackCheckbox, new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				p.eSetDeliver(false);
				ARDUINO_REPORT_MODE mode = callBackCheckbox.getSelection() ? ARDUINO_REPORT_MODE.ACTIVATE : ARDUINO_REPORT_MODE.DEACTIVATE;
				p.setReport(mode);
				p.eSetDeliver(true);
				if (p instanceof AnalogPort) {
					if (pipe != null) {
						DSLMidiMessage msg = FirmataCmdUtils.INSTANCE.createReportAnalogPin(
							p.getChannel(), 
							mode.getValue()
						);
						pipe.send(msg);
					}
					
					Button b = analogButtonMaps.get(p);
					PWM_MODE pwm = PWM_MODE.NONE;
					if (b != null) {
						pwm = PWM_MODE.HIGH.getName().equals(b.getText()) ? PWM_MODE.HIGH: PWM_MODE.LOW; 
					}
					StructuredSelection ssel = (StructuredSelection) analogModeCombosMap.get(p).getSelection();
					updatePort(p, callBackCheckbox.getSelection(), (PIN_MODE) ssel.getFirstElement(), pwm);
				}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
		callBackCheckbox.addSelectionListener(selectionListenerMap.get(callBackCheckbox));
		callBackCheckbox.setSelection(isPortActive(p));
		callBackCheckbox.setBackground(GUIToolkit.BG);
		
		ComboViewer modesCombo = new ComboViewer(new Combo(parent, SWT.READ_ONLY));
		modesCombo.getControl().setLayoutData(GridDataFactory.fillDefaults().indent(10, 0).align(SWT.RIGHT, SWT.CENTER).hint(100, SWT.DEFAULT).grab(false, false).create());
		modesCombo.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {
				if (element instanceof PIN_MODE) {
					return ((PIN_MODE)element).getLiteral();
				}
				return super.getText(element);
			}
		});
		modesCombo.setContentProvider(new ArrayContentProvider());
		modesCombo.setInput(Arrays.asList(new PIN_MODE[]{PIN_MODE.INPUT, PIN_MODE.OUTPUT, PIN_MODE.ANALOG}));
		analogModeCombosMap.put(p, modesCombo);

		Composite bag = new Composite(parent, SWT.NONE);
		bag.setLayout(stackLayout);
		bag.setLayoutData(GridDataFactory.fillDefaults().hint(100, SWT.DEFAULT).indent(10, 0).align(SWT.RIGHT, SWT.CENTER).grab(false, false).create());
		bag.setBackground(GUIToolkit.BG);
		bag.redraw();

		analogBagsMap.put(p, bag);

		final Label label = new Label(bag, SWT.NONE);
		label.setText("A"+p.getChannel()+" : ---");
		label.setFont(font);
		label.setForeground(ColorConstants.lightGreen);
		label.setBackground(GUIToolkit.BG);
		label.setLayoutData(GridDataFactory.fillDefaults().hint(100, SWT.DEFAULT).indent(10, 0).align(SWT.RIGHT, SWT.CENTER).grab(false, false).create());
		analogLabelsMap.put(p, label);
		
		final Button hiloButton = new Button(bag, SWT.TOGGLE);
		hiloButton.setText(PWM_MODE.HIGH.getName());
		hiloButton.setLayoutData(GridDataFactory.fillDefaults().hint(100, SWT.DEFAULT).grab(false, false).create());
		analogButtonMaps.put(p, hiloButton);
		
		final UbiVuMeter vuMeter = new UbiVuMeter(parent, SWT.HORIZONTAL);
		vuMeter.setUbiStyle(UbiVuMeter.WIDGET_BW_THEME);
		vuMeter.setMax(510f);
		vuMeter.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).hint(250, SWT.DEFAULT).minSize(250, SWT.DEFAULT).indent(25, 0).align(SWT.RIGHT, SWT.CENTER).grab(false, false).create());
		
		metersMap.put(p, vuMeter);	

		final ISelectionChangedListener l = new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection sel = event.getSelection();
				if (sel instanceof StructuredSelection) {
					Object obj = ((StructuredSelection)sel).getFirstElement();
					if (obj instanceof PIN_MODE) {
						
						PIN_MODE mode = (PIN_MODE) obj;
						switch (mode) {
							case INPUT: 
								stackLayout.topControl = analogLabelsMap.get(p);
								if (metersMap.get(p) != null) {
									metersMap.get(p).setVisible(false);
								}
								break;
							case OUTPUT:
								stackLayout.topControl = analogButtonMaps.get(p);
								if (metersMap.get(p) != null) {
									metersMap.get(p).setVisible(false);
								}
								break;
							case ANALOG:
								if (metersMap.get(p) != null) {
									metersMap.get(p).setVisible(true);
								}
								stackLayout.topControl = analogLabelsMap.get(p);
								break;
							case SHIFT:
							default:
								break;
						}
						
						Button b = analogButtonMaps.get(p);
						PWM_MODE pwm = PWM_MODE.NONE;
						if (b != null) {
							pwm = PWM_MODE.HIGH.getName().equals(b.getText()) ? PWM_MODE.HIGH: PWM_MODE.LOW; 
						}
						StructuredSelection ssel = (StructuredSelection) analogModeCombosMap.get(p).getSelection();
						updatePort(p, callBackCheckbox.getSelection(), (PIN_MODE) ssel.getFirstElement(), pwm);

						
						analogBagsMap.get(p).layout(true);
						if (stackLayout.topControl != null) {
							stackLayout.topControl.redraw();
						}
						analogBagsMap.get(p).redraw();

						if (pipe != null) {
							pipe.send(
								FirmataCmdUtils.INSTANCE.createSetPinMode(
									p.getMap().getValue(), 
									((PIN_MODE)obj).getValue()
								)
							);
						}
					}
				}
			}
		};

		modesCombo.addSelectionChangedListener(l);
		modesCombo.setSelection(new StructuredSelection(cfg.getMode()));
		
		selectionListenerMap.put(hiloButton, new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				PWM_MODE pwmMode = hiloButton.getSelection() ? PWM_MODE.LOW : PWM_MODE.HIGH;
				hiloButton.setText(pwmMode.getName());
				if (pipe != null) {
					
					int port_num = p.getMap().getValue() / 8;
					int port_val = 0;
					for (int i=0; i<8; i++) {
						int _p = port_num * 8 + i;
						if ( cfg.getMode()== PIN_MODE.INPUT || cfg.getMode() == PIN_MODE.OUTPUT) {
							//if (pin_info[_p].value) {
								port_val |= (1<<i);
							//}
						}
					}
					byte[] buf = new byte[3];
					buf[0] = (byte)(0x90 | port_num);
					buf[1] = (byte)(port_val & 0x7F);
					buf[2] = (byte)((port_val >> 7) & 0x7F);
					pipe.send(buf);

					/*
					pipe.send(
						FirmataCmdUtils.INSTANCE.createAnalogIO(
							p.getMap().getValue(), 
							hiloButton.getSelection() ? 1 : 0
						)
					);
					*/
				}
				Button b = analogButtonMaps.get(p);
				PWM_MODE pwm = PWM_MODE.NONE;
				if (b != null) {
					pwm = PWM_MODE.HIGH.getName().equals(b.getText()) ? PWM_MODE.HIGH: PWM_MODE.LOW; 
				}
				StructuredSelection ssel = (StructuredSelection) analogModeCombosMap.get(p).getSelection();
				updatePort(p, callBackCheckbox.getSelection(), (PIN_MODE) ssel.getFirstElement(), pwm);
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
		hiloButton.addSelectionListener(selectionListenerMap.get(hiloButton));
		hiloButton.setSelection(PWM_MODE.LOW.equals(cfg.getPwm()));
		stackLayout.topControl = label;
	}
	
	private void syncBoard() {
		for (PortConfig cfg : ubiquino.getConfig().getPorts()) {
			Port				p		= cfg.getTarget();
			if (p != null) {
				PIN_MAPPING 		pin 	= p.getMap();
				ARDUINO_REPORT_MODE report 	= p.getReport();
				PIN_MODE 			mode	= cfg.getMode();
				if (Platform.inDebugMode()) {
					System.out.println("Sync " + pin + " @ " + mode + " (" + report + ")");
				}
				if (pipe != null) {
					DSLMidiMessage msg = null;
					if (p.eClass().equals(ArduinoPackage.Literals.ANALOG_PORT)) {
						msg = FirmataCmdUtils.INSTANCE.createReportAnalogPin(
							p.getChannel(), 
							cfg.isEnabled() ? 1 : 0
						);
					} else if (p.eClass().equals(ArduinoPackage.Literals.DIGITAL_PORT)) {
						msg = FirmataCmdUtils.INSTANCE.createReportDigitalPin(
							p.getMap().getValue(), 
							cfg.isEnabled() ? 1 : 0
						);
					}
					pipe.send(msg, 25);
				}
			}
		}
	}
}
