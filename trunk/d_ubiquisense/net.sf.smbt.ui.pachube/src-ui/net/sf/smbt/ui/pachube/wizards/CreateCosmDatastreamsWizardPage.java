/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2013, Lucas Bigeardel
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
package net.sf.smbt.ui.pachube.wizards;

import java.util.ArrayList;
import java.util.List;

import net.sf.smbt.ui.pachube.controller.PachubeComposeableAdapterFactory;
import net.sf.smbt.ui.pachube.dialogs.DataStreamConfigDialog;
import net.sf.smbt.ui.pachube.editors.CosmEditor;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eeml.xsd._0._5.DataType;
import org.eeml.xsd._0._5.EnvironmentType;

public class CreateCosmDatastreamsWizardPage extends WizardPage {
	
	private EnvironmentType envType;
	private ListViewer streamListViewer;
	
	protected CreateCosmDatastreamsWizardPage(CosmEditor cosmEditor) {
		super("Data streams");
		
		setMessage("Define Datastreams Characteristics");
		setDescription("Data Streams.");
		setTitle("Define Datastreams");
		
		this.envType	= cosmEditor.getEnvType();
	}
	
	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		composite.setLayoutData(GridDataFactory.fillDefaults().create());
		
		//
		// TODO : Tags (ListViewer ...)
		//
		
	    //createFactorArea(composite);
	    // Label for owner field
		Label msgLabel = new Label(composite, SWT.NONE);
		msgLabel.setText("Data Streams : ");

		// Owner text field
			
		streamListViewer = new ListViewer(composite, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		streamListViewer.getList().setLayoutData(GridDataFactory.fillDefaults().span(2,1).minSize(200, 50).hint(200, 50).grab(true, true).create());
		streamListViewer.getList().setFont(parent.getFont());
		    
		// Set the label provider		
		streamListViewer.setLabelProvider(new AdapterFactoryLabelProvider(
			new PachubeComposeableAdapterFactory()
		){
			@Override
			public String getText(Object object) {
				if (object instanceof DataType) {
					DataType dt = (DataType) object;
					String txt = dt.getId() + " : [" + dt.getMinValue() + " .. " + dt.getMaxValue() + "], tags : ";
					for (String t : dt.getTag()) {
						txt += " " + t;
					}
					return txt;
				}
				return super.getText(object);
			}
		});

		// Set the content provider
		ArrayContentProvider cp2 = new ArrayContentProvider();
		streamListViewer.setContentProvider(cp2);
		    
		// Add a selection change listener
		streamListViewer.addSelectionChangedListener(new ISelectionChangedListener() {
		    public void selectionChanged(SelectionChangedEvent event) {
		        // Update OK button enablement
		    	ISelection sel = streamListViewer.getSelection();
		    	if (sel instanceof IStructuredSelection) {
		    		//updateTargetDetails((EZMojoTarget)((IStructuredSelection)sel).getFirstElement());
		    	}
		    }
		});

		// Add double-click listener
		streamListViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				//okPressed();
			}
		});
		    
		envType = ((CreateCosmFeedWizard)getWizard()).getEnvType(); 
				
		streamListViewer.setInput(envType != null ? envType.getData() : new ArrayList<DataType>());
		streamListViewer.refresh();
		
		Composite buttonBar2 = new Composite(composite, SWT.NONE);
		buttonBar2.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		buttonBar2.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		   
		Button addMsgButton = new Button(buttonBar2, SWT.PUSH);
		addMsgButton.setText("+");
		addMsgButton.addSelectionListener(
			new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					DataStreamConfigDialog dlg = new DataStreamConfigDialog(Display.getDefault().getActiveShell(), null, null);
					int status = dlg.open();
					if (status == org.eclipse.jface.window.Window.OK) {
						Object[] r = dlg.getResult();
						if (r != null && r.length > 0) {
							Object o = r[0];
							if (o instanceof DataType) {
								DataType dt = (DataType) o;
								ISelection sel = streamListViewer.getSelection();
								if (sel instanceof StructuredSelection) {
									Object obj = ((StructuredSelection)sel).getFirstElement();
									if (envType.getData().contains(obj)) {
										int idx = envType.getData().indexOf(obj);
										if (idx < 0 || idx >= envType.getData().size()) {
											envType.getData().add(dt);
										} else {
											envType.getData().add(idx, dt);
										}
									} else {
										envType.getData().add(dt);
									}
								}
								int id = 1;
								for (DataType tt : envType.getData()) {
									tt.setId(""+id);
									id++;
								}
								streamListViewer.setInput(envType.getData());
								streamListViewer.refresh(true);
							}
						}
					}
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {widgetSelected(e);}
			}
		);
		addMsgButton.setLayoutData(GridDataFactory.swtDefaults().align(SWT.BEGINNING, SWT.CENTER).create());

		   
		Button deleteMsgButton = new Button(buttonBar2, SWT.PUSH);
		deleteMsgButton.setText("-");
		deleteMsgButton.addSelectionListener(
			new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					ISelection sel = streamListViewer.getSelection();
					if (sel instanceof IStructuredSelection) {
						DataType t = (DataType)((IStructuredSelection)sel).getFirstElement();
						if (t instanceof DataType) {
							@SuppressWarnings("unchecked")
							List<DataType> tt = (List<DataType>) streamListViewer.getInput();
							if (tt instanceof List) {
								tt.remove(t);
							}
							int id = 1;
							for (DataType ttt : envType.getData()) {
								ttt.setId(""+id);
								id++;
							}
							streamListViewer.refresh(true);
						}
					}
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {widgetSelected(e);}}
		);
		deleteMsgButton.setLayoutData(GridDataFactory.swtDefaults().align(SWT.END, SWT.CENTER).create());

	    composite.layout(true);
	    composite.pack(true);


		setControl(composite);
		
		//PlatformUI.getWorkbench().getHelpSystem().setHelp(getControl(), "net.sf.smbt.doc.transport_protocol_context"); // NEW
	}
}
