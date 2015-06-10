/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2008 - 2010, Lucas Bigeardel
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

package net.sf.smbt.ui.arduino.wizards;

import java.util.HashMap;
import java.util.Map;

import net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID;
import net.sf.smbt.mdl.arduino.ARDUINO_COMM;
import net.sf.smbt.ui.Activator;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class ArduinoConfigurationWizardPage extends WizardPage {

	private Map<ARDUINO_BOARD_UID, Image> images;
	private Label image;
	
	public ArduinoConfigurationWizardPage() {
		super("Arduino Configuration");
	    setTitle("Select Arduino board settings");
	    setMessage("Select among available Arduino kind and communication settings");
	    
	    loadImages();
	}
	
	private void loadImages() {
		images = new HashMap<ARDUINO_BOARD_UID, Image>();
		
		images.put(
				ARDUINO_BOARD_UID.LEONARDO_ATMEGA32U4, 
				Activator.imageDescriptorFromPlugin(
					"net.sf.smbt.ui.firmata.ubiquino", 
					"images/ArduinoLeonardo.jpg"
				).createImage(true)
			);
		images.put(
				ARDUINO_BOARD_UID.DIECMILA_ATMEGA_168, 
				Activator.imageDescriptorFromPlugin(
					"net.sf.smbt.ui.firmata.ubiquino", 
					"images/ArduinoDiecimila.jpg"
				).createImage(true)
			);
		images.put(
			ARDUINO_BOARD_UID.DIECIMILA_ATMEGA328, 
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.firmata.ubiquino", 
				"images/ArduinoDiecimila.jpg"
			).createImage(true)
		);
		images.put(
			ARDUINO_BOARD_UID.DIECIMILA_ATMEGA_328P, 
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.firmata.ubiquino", 
				"images/ArduinoDiecimila.jpg"
			).createImage(true)
		);
		images.put(
			ARDUINO_BOARD_UID.MINI_ATMEGA_168, 
				Activator.imageDescriptorFromPlugin(
					"net.sf.smbt.ui.firmata.ubiquino", 
					"images/arduino_mini.jpg"
				).createImage(true)
			);
		images.put(
				ARDUINO_BOARD_UID.NANO_23_ATMEGA168, 
				Activator.imageDescriptorFromPlugin(
					"net.sf.smbt.ui.firmata.ubiquino", 
					"images/ArduinoNanoTop.jpg"
				).createImage(true));
		images.put(
				ARDUINO_BOARD_UID.NANO_30_ATMEGA328, 
				Activator.imageDescriptorFromPlugin(
					"net.sf.smbt.ui.firmata.ubiquino", 
					"images/ArduinoNanoTop.jpg"
				).createImage(true));
		images.put(
				ARDUINO_BOARD_UID.BT_ATMEGA_168, 
				Activator.imageDescriptorFromPlugin(
					"net.sf.smbt.ui.firmata.ubiquino", 
					"images/ArduinoBT400.jpg"
				).createImage(true));
		images.put(
				ARDUINO_BOARD_UID.DUEMILANOVE_ATMEGA_168, 
				Activator.imageDescriptorFromPlugin(
					"net.sf.smbt.ui.firmata.ubiquino", 
					"images/ArduinoDuemilanove.jpg"
				).createImage(true));
		images.put(
				ARDUINO_BOARD_UID.DUEMILANOVE_ATMEGA_328, 
				Activator.imageDescriptorFromPlugin(
					"net.sf.smbt.ui.firmata.ubiquino", 
					"images/ArduinoDuemilanove.jpg"
				).createImage(true));
		images.put(
			ARDUINO_BOARD_UID.FUNNEL_IO_ATMEGA328P, 
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.firmata.ubiquino", 
				"images/ArduinoFio.jpg"
			).createImage(true));
		images.put(
			ARDUINO_BOARD_UID.MEGA_ATMEGA_1280, 
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.firmata.ubiquino", 
				"images/ArduinoMega.jpg"
			).createImage(true));
		images.put(
			ARDUINO_BOARD_UID.NANO_23_ATMEGA168, 
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.firmata.ubiquino", 
				"images/ArduinoNanoTop.jpg"
			).createImage(true));
		images.put(
			ARDUINO_BOARD_UID.PRO_ATMEGA_168, 
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.firmata.ubiquino", 
				"images/ArduinoPro.jpg"
			).createImage(true));
		images.put(
			ARDUINO_BOARD_UID.PRO_MINI_ATMEGA_168, 
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.firmata.ubiquino", 
				"images/ArduinoProMini.jpg"
			).createImage(true));
		images.put(
			ARDUINO_BOARD_UID.UNO_ATMEGA328, 
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.firmata.ubiquino", 
				"images/ArduinoUnoFront.jpg"
			).createImage(true));
		images.put(
			ARDUINO_BOARD_UID.LILIPAD_ATMEGA_328V, 
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.firmata.ubiquino", 
				"images/LilyPad_3.jpg"
			).createImage(true));
	}
	
	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(GridLayoutFactory.fillDefaults().create());
		container.setLayoutData(GridDataFactory.fillDefaults().create());
		
		ComboViewer arduinoKindChoices = new ComboViewer(container);
		arduinoKindChoices.setLabelProvider(new LabelProvider(){
			@Override
			public String getText(Object element) {
				if (element instanceof ARDUINO_BOARD_UID) {
					return ((ARDUINO_BOARD_UID)element).getLiteral();
				}
				return super.getText(element);
			}
		});
		arduinoKindChoices.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true,	false).create());
		arduinoKindChoices.setContentProvider(new ArrayContentProvider());
		arduinoKindChoices.setInput(ARDUINO_BOARD_UID.values());
		arduinoKindChoices.addSelectionChangedListener(
			new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					if (event.getSelection() instanceof IStructuredSelection) {
						Object obj = ((IStructuredSelection)event.getSelection()).getFirstElement();
						if (obj instanceof ARDUINO_BOARD_UID) {
							((ArduinoConnectionSelectionWizard)getWizard()).cfg.setBoardKind((ARDUINO_BOARD_UID) obj);
							if (images.containsKey(((ARDUINO_BOARD_UID) obj))) {
								image.setImage(images.get(((ARDUINO_BOARD_UID) obj)));
							} else {
								try {
									image.setImage(null);
								} catch (Throwable t) {
									// ugly but harmless
								}
							}
						}
					}
				}
			}
		);
		
		ComboViewer arduinoCommChoices = new ComboViewer(container);
		arduinoCommChoices.setLabelProvider(new LabelProvider(){
			@Override
			public String getText(Object element) {
				if (element instanceof ARDUINO_COMM) {
					return ((ARDUINO_COMM)element).getLiteral();
				}
				return super.getText(element);
			}
		});
		
		arduinoCommChoices.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true,	false).create());
		arduinoCommChoices.setContentProvider(new ArrayContentProvider());
		arduinoCommChoices.setInput(ARDUINO_COMM.values());
		arduinoCommChoices.addSelectionChangedListener(
			new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					if (event.getSelection() instanceof IStructuredSelection) {
						Object obj = ((IStructuredSelection)event.getSelection()).getFirstElement();
						((ArduinoConnectionSelectionWizard)getWizard()).cfg.setArduinoComm((ARDUINO_COMM) obj);
					}
				}
			}
		);
		arduinoCommChoices.setSelection(
			new StructuredSelection(
				ARDUINO_COMM.USB
			)
		);
		arduinoCommChoices.getControl().setEnabled(false);
		
		Integer[] usbSpeeds = new Integer[] {
			300, 
			1200, 
			2400, 
			4800, 
			9600, 
			14400, 
			19200, 
			28800, 
			38400, 
			57600, 
			115200
		};
		
		ComboViewer arduinoCommSpeedChoices = new ComboViewer(container);
		arduinoCommSpeedChoices.setLabelProvider(new LabelProvider(){
			@Override
			public String getText(Object element) {
				if (element instanceof Integer) {
					return ((Integer)element).intValue() + " bauds";
				}
				return super.getText(element);
			}
		});
		
		arduinoCommSpeedChoices.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		arduinoCommSpeedChoices.setContentProvider(new ArrayContentProvider());
		arduinoCommSpeedChoices.setInput(usbSpeeds);
		arduinoCommSpeedChoices.addSelectionChangedListener(
			new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					if (event.getSelection() instanceof IStructuredSelection) {
						Object obj = ((IStructuredSelection)event.getSelection()).getFirstElement();
						((ArduinoConnectionSelectionWizard)getWizard()).cfg.setUsbSpeed(((Integer)obj).intValue());
					}
				}
			}
		);
		arduinoCommSpeedChoices.setSelection(
			new StructuredSelection(
				usbSpeeds[9]
			)
		);
		
		image =  new Label(container, SWT.NONE);
		image.setSize(400, 300);
		image.setLayoutData(
			GridDataFactory.fillDefaults().
				grab(true, true).hint(400, 300).
					minSize(400, 300).create()
		);
		
		arduinoKindChoices.setSelection(
			new StructuredSelection(
				ARDUINO_BOARD_UID.get(0)
			)
		);

		
		setControl(container);
	}
}
