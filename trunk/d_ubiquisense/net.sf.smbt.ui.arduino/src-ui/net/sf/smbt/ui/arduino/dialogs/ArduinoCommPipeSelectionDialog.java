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

package net.sf.smbt.ui.arduino.dialogs;

import gnu.io.CommPortIdentifier;

import java.util.ArrayList;
import java.util.List;

import net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.ui.arduino.Activator;
import net.sf.smbt.ui.arduino.wizards.ArduinoConfigWizardDialog;
import net.sf.smbt.ui.firmata.ubiquino.model.arduinocfg.ArduinoConfig;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.SelectionDialog;

public class ArduinoCommPipeSelectionDialog extends SelectionDialog {
	List<CmdPipe> availableArduinoPipes;
	/**
     * List height in characters.
     */
    private final static int LIST_HEIGHT = 10;
    
	/**
     * List width in characters.
     */
   private final static int LIST_WIDTH = 20;

    /**
     * List to display the resolutions.
     */
    private ListViewer listViewer;

    /**
     * Constructor w/ arguments
     *  
     * @param parentShell parent {@link Shell}
     * @param shellTitle {@link Shell} title
     * @param shellMessage {@link Shell} message
     */
	public ArduinoCommPipeSelectionDialog(Shell parentShell, String shellTitle, String shellMessage) {
		super(parentShell);
		availableArduinoPipes = new ArrayList<CmdPipe>();
	    setTitle(shellTitle);
	    setMessage(shellMessage);
	    
	    for(CmdPipe pipe : QuanticMojo.INSTANCE.getPipes()) {
	    	if (pipe.getCommunicationProtocol().equals(TRANSPORT_PROTOCOL.USB)
	    		|| pipe.getCommunicationProtocol().equals(TRANSPORT_PROTOCOL.BLUETOOTH)
	    	) {
	    		availableArduinoPipes.add(pipe);
	    	}
	    }
	    
	    setSelectionResult(availableArduinoPipes.toArray());
	}
	
    /* (non-Javadoc)
     * Method declared on Dialog.
     */
    protected Control createDialogArea(Composite parent) {
        Composite composite = (Composite) super.createDialogArea(parent);

        // Create label
        createMessageArea(composite);
        // Create list viewer	
        listViewer = new ListViewer(composite, SWT.SINGLE | SWT.H_SCROLL
                | SWT.V_SCROLL | SWT.BORDER);
        GridData data = new GridData(GridData.FILL_BOTH);
        data.heightHint = convertHeightInCharsToPixels(LIST_HEIGHT);
        data.widthHint = convertWidthInCharsToPixels(LIST_WIDTH);
        listViewer.getList().setLayoutData(data);
        listViewer.getList().setFont(parent.getFont());
        // Set the label provider		
        listViewer.setLabelProvider(new LabelProvider() {
            public String getText(Object element) {
                // Return the features's label.
                return element == null ? "" : ((CommPortIdentifier)element).getName(); //$NON-NLS-1$
            }
        });

        // Set the content provider
        ArrayContentProvider cp = new ArrayContentProvider();
        listViewer.setContentProvider(cp);
        listViewer.setInput(availableArduinoPipes);

        // Set the initial selection
        listViewer.setSelection(new StructuredSelection(
                getInitialElementSelections()), true);

        // Add a selection change listener
        listViewer.addSelectionChangedListener(new ISelectionChangedListener() {
            public void selectionChanged(SelectionChangedEvent event) {
                // Update OK button enablement
                getOkButton().setEnabled(!event.getSelection().isEmpty());
            }
        });

        // Add double-click listener
        listViewer.addDoubleClickListener(new IDoubleClickListener() {
            public void doubleClick(DoubleClickEvent event) {
                okPressed();
            }
        });
        
        Composite buttonBar = new Composite(composite, SWT.NONE);
        buttonBar.setLayout(GridLayoutFactory.fillDefaults().create());
        buttonBar.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
        
        Button createArduinoConnectionButton = new Button(buttonBar, SWT.PUSH);
        createArduinoConnectionButton.setImage(
        	Activator.imageDescriptorFromPlugin(
        		Activator.PLUGIN_ID, 
        		"icons/arduino-add.png"
        	).createImage()
        );
        createArduinoConnectionButton.addSelectionListener(
        	new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					ArduinoConfigWizardDialog arduinoConfigWizardDialog = new ArduinoConfigWizardDialog();
					int status = arduinoConfigWizardDialog.open();
					if (status == Window.OK) {
						ArduinoConfig cfg = arduinoConfigWizardDialog.getArduinoConfiguration();
						if (cfg != null) {
/*							CommPortIdentifier obj = cfg.getUsbComm();
							if (obj instanceof CommPortIdentifier) {
								if (checkIfArduinoConnectionAlreadyExistAndAskForReplace(obj)) {
									CmdPipe arduinoPipe = QuanticMojo.INSTANCE.openUsbPipe(
										COMM_PROTOCOL.FIRMATA21.getProtocolID(), 
										((CommPortIdentifier)obj).getName(), 
										cfg.getUsbSpeed()
									);
									Arduino arduino = UbiquinoUtils.INSTANCE.createArduinoBoard(
										ARDUINO_BOARD_UID.DIECMILA_ATMEGA_168,
										ARDUINO_FIRMWARE_MODE.ARDUINO_FIRMATA_V20,
										arduinoPipe
									);
									
									arduinos.put(obj.getName(), arduino);
									pane.put(obj.getName(), new ArduinoBoardControllerTab(tabFolder, arduino, arduinoPipe));
									if (pane.get(obj.getName()) != null) {
										pane.get(obj.getName()).setInput(arduinos);
										pane.get(obj.getName()).refresh(true);
									}
								}
							}	
							*/	
						}
						
					}

				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					
				}
			}
			
        );
        
        return composite;
    }

    /* (non-Javadoc)
     * Method declared on Dialog.
     */
    protected void okPressed() {
        IStructuredSelection selection = (IStructuredSelection) listViewer
                .getSelection();
        setResult(selection.toList());
        super.okPressed();
    }
	
	@Override
	public void setInitialSelections(Object[] selectedElements) {
		super.setInitialSelections(selectedElements);
	}
	
	@Override
	public Object[] getResult() {
		return availableArduinoPipes.toArray();
	}
}
