/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2008 - 2012, Lucas Bigeardel
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

package net.sf.smbt.ui.wizards;

import javax.sound.midi.MidiDevice;
import javax.sound.midi.MidiDevice.Info;

import net.sf.smbt.ui.hmi.MidiContentProvider;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;

public class MidiCommPipeConnectionWizardPage extends WizardPage {
	
	/**
	 * List height in characters.
	 */
	private final static int LIST_HEIGHT = 10;

	/**
	 * List width in characters.
	 */
	private final static int LIST_WIDTH = 20;
	
	private Button dumpOscCheckBox;

	private ListViewer midiListViewer;
	
	private MidiDevice device;
	
	
	public MidiCommPipeConnectionWizardPage() {
		super("Midi Bus Config");
		
	    setTitle("Configure Midi");
	    setMessage("Configure a Midi connectivity w/ ingoing or outgoing ports");
	}
 
	public boolean isDumpedAsOSC() {
		return dumpOscCheckBox.getSelection();
	}
	
    @Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(GridLayoutFactory.fillDefaults().create());
		composite.setLayoutData(GridDataFactory.fillDefaults().create());

	    dumpOscCheckBox = new Button(composite, SWT.CHECK);
	    dumpOscCheckBox.setText("Dump as OSC in the console");
	    dumpOscCheckBox.setSelection(true);
    	
	    // Create list viewer	
	    midiListViewer = new ListViewer(composite, SWT.SINGLE | SWT.H_SCROLL
	            | SWT.V_SCROLL | SWT.BORDER);
	    GridData data = new GridData(GridData.FILL_BOTH);
	    data.heightHint = convertHeightInCharsToPixels(LIST_HEIGHT);
	    data.widthHint = convertWidthInCharsToPixels(LIST_WIDTH);
	    midiListViewer.getList().setLayoutData(data);
	    midiListViewer.getList().setFont(parent.getFont());
	    
	    // Set the label provider		
	    midiListViewer.setLabelProvider(new LabelProvider() {
	        public String getText(Object element) {
	        	if (element instanceof MidiDevice) {
	        		MidiDevice device = (MidiDevice) element;
	        		
	        		Info info		= ((MidiDevice)element).getDeviceInfo();
	        		String name 	= info.getName();
	        		String desc 	= info.getDescription();
	        		String vendor 	= info.getVendor();
	        		String ver 		= info.getVersion();
	        		
	        		desc 			= desc != null && !desc.contains("Unknown") ? " (" + desc + ") " : "";
	        		vendor 			= vendor != null && !vendor.contains("Unknown") ? vendor : "";
	        		ver				= ver != null && !ver.contains("Unknown") ? " [" + ver + "]" : "";

	        		String kind = "[???] : ";
	        		
	        		boolean outDevice	= device.getMaxReceivers() >=0 && device.getMaxTransmitters() == -1;
	        		if (outDevice) {
	        			kind = "[INPUT] : ";
	        		}

	        		boolean inDevice	= device.getMaxTransmitters() >=0 && device.getMaxReceivers() == -1;
	        		if (inDevice) {
	        			kind = "[OUTPUT] : ";
	        		}
	        		
	        		return kind + name + desc + vendor + ver;
	        	}
	        	return "";
	        }
	    });

	    // Set the content provider
	    MidiContentProvider cpMidi = new MidiContentProvider();
	    midiListViewer.setContentProvider(cpMidi);
	    
	    midiListViewer.setInput("*** VOID ***");
	    
	    midiListViewer.addSelectionChangedListener(
	    	new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					if (event.getSelection() instanceof IStructuredSelection) {
						if (!event.getSelection().isEmpty()) {
							ISelection sel = event.getSelection();
							if (sel instanceof IStructuredSelection) {
								Object obj = ((IStructuredSelection)sel).getFirstElement();
								if (obj instanceof MidiDevice) {
									device = (MidiDevice) obj;
								}
							}
							try {
								if (getWizard() !=null && getWizard().getContainer() != null) {
									getWizard().getContainer().updateButtons();
								}
							} catch(Throwable t) {
								t.printStackTrace();
							}
						}
					}
				}
			}
	    );
	    
	    midiListViewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				if (isPageComplete()) {
					if (getWizard() !=null) {
						getWizard().performFinish();
					}
					//getContainer().showPage(getNextPage());
				}
			}
		});

		setControl(composite);
		
		getControl().addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent e) {
				//storeConsolePageSettings();
			}
		});

		PlatformUI.getWorkbench().getHelpSystem().setHelp(getControl(), "net.sf.smbt.doc.midi_context"); // NEW
    }
    
    /*
	public final static String MIDI_SECTION_DIALOG_SETTINGS_ID = "net.sf.smbt.ui.dialogs";
	public final static String MIDI_ADDRESSES_CONFIGS_ID = "net.sf.smbt.ui.dialogs.midi.addresses";
	
	private void storeConsolePageSettings() {
		IDialogSettings settings = Activator.getDefault().getDialogSettings();
		IDialogSettings consolePageDialogSettings;
		if ((consolePageDialogSettings = settings.getSection(MIDI_SECTION_DIALOG_SETTINGS_ID))==null) {
			consolePageDialogSettings = settings.addNewSection(MIDI_SECTION_DIALOG_SETTINGS_ID);
		}
	}
	
	private void loadIpAddresseSettings() {
		IDialogSettings settings = Activator.getDefault().getDialogSettings();
		IDialogSettings consolePageDialogSettings;
		if ((consolePageDialogSettings = settings.getSection(MIDI_SECTION_DIALOG_SETTINGS_ID))==null) {
			consolePageDialogSettings = settings.addNewSection(MIDI_SECTION_DIALOG_SETTINGS_ID);
		}
	}
	*/

	@Override
	public boolean canFlipToNextPage() {
		return false;
	}
	
	@Override
	public boolean isPageComplete() {
		return device instanceof MidiDevice;
	}

	public MidiDevice getMidiDevice() {
		return device;
	}
}
