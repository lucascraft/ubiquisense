/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2011 - 2012, Lucas Bigeardel
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

import gnu.io.CommPortIdentifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL;

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
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;

public class CommPipeConnectionSelectionWizardPage extends WizardPage {
	
	/**
	 * List height in characters.
	 */
	private final static int LIST_HEIGHT = 10;

	/**
	 * List width in characters.
	 */
	private final static int LIST_WIDTH = 20;

	private List<TRANSPORT_PROTOCOL> commProtocols;
	protected ListViewer listViewer, midiListViewer;
	
	private TRANSPORT_PROTOCOL selectedProtocol;
	private Button midiBusCheckbox;
	
	private boolean midiMode;
	
	public void setMidiMode(boolean midiMode) {
			
	 	this.midiMode = midiMode;
		if (midiBusCheckbox != null && !midiBusCheckbox.isDisposed()) {
			midiBusCheckbox.setVisible(midiMode);
			if (!midiMode) {
				listViewer.getControl().setEnabled(true);
				midiBusCheckbox.setSelection(false);
			}
		}
		
	}
	
	public boolean isMidiMode() {
		return midiMode;
	}
	
	public TRANSPORT_PROTOCOL getSelectedProtocol() {
		return selectedProtocol;
	}

	protected CommPipeConnectionSelectionWizardPage() {
		super("Selection");
		
		setMessage("Select a transport protocol");
		setDescription("Transport protocol will determine channel two way communication rules.");
		setTitle("Transport Protocol");
		
		boolean rxtxGoneBad = false;
		try {
			CommPortIdentifier.getPortIdentifiers();
		} catch (Throwable t) {
			rxtxGoneBad = true;
			t.printStackTrace();
		}

		commProtocols = new ArrayList<TRANSPORT_PROTOCOL>();
		if (!rxtxGoneBad) {
			commProtocols.add(TRANSPORT_PROTOCOL.USB);
		}
		commProtocols.add(TRANSPORT_PROTOCOL.UDP);
		commProtocols.add(TRANSPORT_PROTOCOL.TCP);
		//commProtocols.add(TRANSPORT_PROTOCOL.BLUETOOTH);
		if (!rxtxGoneBad) {
//			commProtocols.add(TRANSPORT_PROTOCOL.HTTP);
//			commProtocols.add(TRANSPORT_PROTOCOL.XBEE);
		}
//		commProtocols.add("UBQT");
	}
	
	protected CommPipeConnectionSelectionWizardPage(TRANSPORT_PROTOCOL... comms) {
		super("Selection");
		
		setMessage("Select a transport protocol");
		setDescription("Transport protocol will determine channel two way communication rules.");
		setTitle("Transport Protocol");

		List<TRANSPORT_PROTOCOL> commList = Arrays.asList(comms);
		commProtocols = new ArrayList<TRANSPORT_PROTOCOL>();
		commProtocols.addAll(commList);

		boolean rxtxGoneBad = false;
		try {
			CommPortIdentifier.getPortIdentifiers();
		} catch (Throwable t) {
			rxtxGoneBad = true;
			t.printStackTrace();
		}

		if (rxtxGoneBad) {
			commProtocols.remove(TRANSPORT_PROTOCOL.USB);
		}

		//
		// FIXME : LB to implement these ASAP
		//
		commProtocols.remove(TRANSPORT_PROTOCOL.XBEE);
		commProtocols.remove(TRANSPORT_PROTOCOL.HTTP);
		commProtocols.remove(TRANSPORT_PROTOCOL.MIDI);
		commProtocols.remove(TRANSPORT_PROTOCOL.BLUETOOTH);
		
		selectedProtocol = comms[0];
		
		//commProtocols.add("UBQT");
	}
	

//	private TRANSPORT_PROTOCOL getSelectedTransportProtocol() {
//		ISelection s =  listViewer.getSelection();
//		if (s instanceof IStructuredSelection) {
//			Object obj = ((IStructuredSelection)s).getFirstElement();
//			if (obj instanceof TRANSPORT_PROTOCOL) {
//				return selectedProtocol = (TRANSPORT_PROTOCOL) obj;
//			}
//		}
//		return null;
//	}
	
	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(GridLayoutFactory.fillDefaults().create());
		composite.setLayoutData(GridDataFactory.fillDefaults().create());
		
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
	            return element == null ? "" : ((TRANSPORT_PROTOCOL)element).getName(); //$NON-NLS-1$
	        }
	    });

	    // Set the content provider
	    ArrayContentProvider cp = new ArrayContentProvider();
	    listViewer.setContentProvider(cp);
	    listViewer.setInput(commProtocols);
	    listViewer.setSelection(
	    	new StructuredSelection(commProtocols.get(0))
	    );
	    
	    listViewer.addSelectionChangedListener(
	    	new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					if (event.getSelection() instanceof IStructuredSelection) {
						if (!event.getSelection().isEmpty()) {
							selectedProtocol = (TRANSPORT_PROTOCOL)((IStructuredSelection)event.getSelection()).getFirstElement();
							getWizard().getContainer().updateButtons();
						}
					}
				}
			}
	    );
	    listViewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				if (isPageComplete()) {
					getContainer().showPage(getNextPage());
				}
			}
		});
	    listViewer.getControl().setEnabled(true);
	    
	    
	    midiBusCheckbox = new Button(composite, SWT.CHECK);
	    midiBusCheckbox.setText("Use Midi Bus Connectivity");
	    midiBusCheckbox.addSelectionListener(
	    	new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (listViewer != null) {
						listViewer.getControl().setEnabled(!midiBusCheckbox.getSelection());
						if(midiBusCheckbox.getSelection()) {
							getWizard().getContainer().showPage(getNextPage());
						}
					}
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
	    );
	    
	    
		setControl(composite);
		
		PlatformUI.getWorkbench().getHelpSystem().setHelp(getControl(), "net.sf.smbt.doc.transport_protocol_context"); // NEW
	}
	
	public boolean isMidiTransportSelected() {
		
		if (midiBusCheckbox != null && !midiBusCheckbox.isDisposed()) {
			return midiBusCheckbox.getSelection();
		}
		
		return false;
	}
	
	@Override
	public IWizardPage getNextPage() {
		return ((CommPipeConnectionSelectionWizard)getWizard()).getNextPage(this);
	}
}
