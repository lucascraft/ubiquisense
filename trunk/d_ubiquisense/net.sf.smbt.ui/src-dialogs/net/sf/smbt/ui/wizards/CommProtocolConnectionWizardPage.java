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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.sf.smbt.comm.extensions.protocol.ProtocolReactor;
import net.sf.smbt.comm.extensions.protocol.ProtocolWithSpecificTransportConfig;

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
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;

public class CommProtocolConnectionWizardPage extends WizardPage {
	
	private ProtocolWithSpecificTransportConfig protocol;
	
	private boolean midiMode;
	
	private String[] comms;
	
	private String selectedComm;
	
	/**
	 * List height in characters.
	 */
	private final static int LIST_HEIGHT = 10;

	/**
	 * List width in characters.
	 */
	private final static int LIST_WIDTH = 20;

	protected ListViewer listViewer;
	protected Text descText;
	

	protected List<ProtocolWithSpecificTransportConfig> availableCommProtocolIdentifiers;

	public CommProtocolConnectionWizardPage(String[] comms, String[] visibles) {
		this(comms, visibles, comms[0]);
	}
	public CommProtocolConnectionWizardPage(String[] comms, String[] visibles, String selectedComm) {
		super("Protocol");
		this.comms = comms;
		this.selectedComm = selectedComm;
		this.midiMode = false;
		
		protocol = ProtocolReactor.INSTANCE.getProtocolsWithSpecificTransportMap(selectedComm);
		
		availableCommProtocolIdentifiers = new ArrayList<ProtocolWithSpecificTransportConfig>();
		
		setTitle("Select Communication Protocol");
		setMessage("Select Communication Protocol");
		setDescription("Select Communication Protocol");
		
		List<String> commList = new ArrayList<String>();
		commList.addAll(Arrays.asList(comms));
		for (ProtocolWithSpecificTransportConfig pCfg : ProtocolReactor.INSTANCE.getProtocolsWithSpecificTransport()) {
			if (commList.contains(pCfg.getID()) || commList.contains(pCfg.getAlias())) {
				availableCommProtocolIdentifiers.add(pCfg);
			}
		}
		if (availableCommProtocolIdentifiers.isEmpty()) {
			throw new UnsupportedOperationException("No suitable communication protocol found for pipe wizard !");
		}
	}
	
	public CommProtocolConnectionWizardPage() {
		this(
			ProtocolReactor.INSTANCE.getProtocolsWithSpecificTransport().toArray(new String[0]), 
			ProtocolReactor.INSTANCE.getProtocolsWithSpecificTransport().toArray(new String[0]),
			ProtocolReactor.INSTANCE.getProtocolsWithSpecificTransport().toArray(new String[0])[0]
		);
	}
	
	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(GridLayoutFactory.fillDefaults().create());
		composite.setLayoutData(GridDataFactory.fillDefaults().create());
		
		final Button showAllCheckbox = new Button(composite, SWT.CHECK);
		showAllCheckbox.setText("Show All Possible Protocols :");
		showAllCheckbox.addSelectionListener(
			new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					availableCommProtocolIdentifiers.clear();
					if (showAllCheckbox.getSelection()) {
						availableCommProtocolIdentifiers.addAll(
							ProtocolReactor.INSTANCE.getProtocolsWithSpecificTransport()
						);
					} else {
						List<String> commList = new ArrayList<String>();
						commList.addAll(Arrays.asList(comms));
						for (ProtocolWithSpecificTransportConfig pCfg : ProtocolReactor.INSTANCE.getProtocolsWithSpecificTransport()) {
							if (commList.contains(pCfg.getID()) || commList.contains(pCfg.getAlias())) {
								availableCommProtocolIdentifiers.add(pCfg);
							}
						}
					}
					listViewer.refresh(true);
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
		);
		showAllCheckbox.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		
		//
	    // Create list viewer
		//
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
	            return element == null ? "" : ((ProtocolWithSpecificTransportConfig)element).getAlias(); //$NON-NLS-1$
	        }
	    });

	    // Set the content provider
	    ArrayContentProvider cp = new ArrayContentProvider();
	    listViewer.setContentProvider(cp);
	    listViewer.setInput(availableCommProtocolIdentifiers);
	    
	    listViewer.addSelectionChangedListener(
	    	new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					if (event.getSelection() instanceof IStructuredSelection) {
						protocol = (ProtocolWithSpecificTransportConfig) ((IStructuredSelection)event.getSelection()).getFirstElement();
						if (protocol != null) {
							descText.setText(protocol.getDesc());
							if (protocol.getAlias() != null) {
								midiMode = protocol.getAlias().equalsIgnoreCase("midi");
								if (getNextPage() instanceof CommPipeConnectionSelectionWizardPage) {
									((CommPipeConnectionSelectionWizardPage)getNextPage()).setMidiMode(midiMode);
								}
							}
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

	    descText = new Text(composite, SWT.READ_ONLY | SWT.BORDER);
	    descText.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());

	    ProtocolWithSpecificTransportConfig cfg = ProtocolReactor.INSTANCE.getProtocolsWithSpecificTransportMap(selectedComm);
	    
	    listViewer.setSelection(
	    	new StructuredSelection(cfg == null ? availableCommProtocolIdentifiers.get(0) : cfg)
	    );
	    
	    protocol = cfg;

		setControl(composite);

		PlatformUI.getWorkbench().getHelpSystem().setHelp(getControl(), "net.sf.smbt.doc.comm_protocol_context"); // NEW
	}
	
	public ProtocolWithSpecificTransportConfig getProtocol() {
		return protocol;
	}
}
