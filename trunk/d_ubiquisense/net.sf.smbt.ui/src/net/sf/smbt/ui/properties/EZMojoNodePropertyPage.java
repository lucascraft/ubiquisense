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

package net.sf.smbt.ui.properties;

import net.sf.smbt.ezmojo.EZMojoKind;
import net.sf.smbt.ezmojo.EZMojoNode;
import net.sf.smbt.ezmojo.EZMojoTarget;
import net.sf.smbt.osc.ezmojo.utils.EZMojoTargetUtils;
import net.sf.smbt.ui.Activator;
import net.sf.smbt.ui.dialogs.CommPipeSelectionDialog;
import net.sf.smbt.ui.wizards.CommPipeConfigWizardDialog;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
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
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.dialogs.PropertyPage;

public class EZMojoNodePropertyPage extends PropertyPage {

	private static ListViewer listViewer;
	
	private void createContent(Composite parent) {
		Composite container = createDefaultComposite(parent);
		

		// Label for owner field
		Label ownerLabel = new Label(container, SWT.NONE);
		ownerLabel.setText("Forward Targets : ");

		// Owner text field
		
		listViewer = new ListViewer(container, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
	    listViewer.getList().setLayoutData(GridDataFactory.fillDefaults().minSize(200, 50).hint(200, 50).grab(true, true).create());
	    listViewer.getList().setFont(parent.getFont());
	    
	    // Set the label provider		
	    listViewer.setLabelProvider(new LabelProvider() {
	        public String getText(Object element) {
	            // Return the features's label.
	            if (element instanceof EZMojoTarget) {
	            	return ((EZMojoTarget) element).toString(); //$NON-NLS-1$
	            }
	            return "???";
	         }
	        @Override
	        public Image getImage(Object element) {
	            if (element instanceof EZMojoTarget) {
	            	return Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/ezcmd/forward.png").createImage();
	            }
	        	return super.getImage(element);
	        }
	    });

	    // Set the content provider
	    ArrayContentProvider cp = new ArrayContentProvider();
	    listViewer.setContentProvider(cp);
	    
	    Object elem = getElement().getAdapter(EZMojoNode.class);
	    if (elem instanceof EZMojoNode) {
		    EZMojoNode node = (EZMojoNode) elem;
		    
		    listViewer.setInput(node.getForwards());
	
		    if (!node.getForwards().isEmpty()) {
			    // Set the initial selection
			    listViewer.setSelection(new StructuredSelection(node.getForwards().get(0)), true);
		    }
	    }
	        
	        // Add a selection change listener
	    listViewer.addSelectionChangedListener(new ISelectionChangedListener() {
	        public void selectionChanged(SelectionChangedEvent event) {
	                // Update OK button enablement
	            ISelection sel = listViewer.getSelection();
	            if (sel instanceof IStructuredSelection) {
	            	updateTargetDetails((EZMojoTarget)((IStructuredSelection)sel).getFirstElement());
	            }
	        }
	    });

	        // Add double-click listener
	   listViewer.addDoubleClickListener(new IDoubleClickListener() {
	        public void doubleClick(DoubleClickEvent event) {
	        	//okPressed();
	        }
	    });
	   listViewer.refresh();

	   Composite buttonBar = new Composite(container, SWT.NONE);
	   buttonBar.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
	   buttonBar.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
	   
	   Button addTargetButton = new Button(buttonBar, SWT.PUSH);
	   addTargetButton.setText("+");
	   addTargetButton.addSelectionListener(
			   new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					CommPipeSelectionDialog dlg = new CommPipeSelectionDialog();
					if (dlg.open() == Window.OK) {
						Object[] r = dlg.getResult();
						if (r!=null && r.length>0) {
							CmdPipe pipe = (CmdPipe) r[0];
							EZMojoTarget t = EZMojoTargetUtils.INSTANCE.createEzTarget(pipe, EZMojoKind.FORWARD);
							if (t instanceof EZMojoTarget) {
							    Object elem = getElement().getAdapter(EZMojoNode.class);
								if (elem instanceof EZMojoNode) {
									((EZMojoNode)elem).getForwards().add(t);
									listViewer.refresh(true);
								}
							}
						} else {
							CommPipeConfigWizardDialog pipeConfigWizardDialog = new CommPipeConfigWizardDialog();
							int status = pipeConfigWizardDialog.open();
							if (status == Window.OK) {
								CmdPipe pipe = pipeConfigWizardDialog.getSelection();
								EZMojoTarget t = EZMojoTargetUtils.INSTANCE.createEzTarget(pipe, EZMojoKind.FORWARD);
								if (t instanceof EZMojoTarget) {
								    Object elem = getElement().getAdapter(EZMojoNode.class);
									if (elem instanceof EZMojoNode) {
										((EZMojoNode)elem).getForwards().add(t);
										listViewer.refresh(true);
									}
								}
							}

						}
					}
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
	   );
	   addTargetButton.setLayoutData(GridDataFactory.swtDefaults().align(SWT.BEGINNING, SWT.CENTER).create());

	   
	   Button deleteTargetButton = new Button(buttonBar, SWT.PUSH);
	   deleteTargetButton.setText("-");
	   deleteTargetButton.addSelectionListener(
			   new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
		            ISelection sel = listViewer.getSelection();
		            if (sel instanceof IStructuredSelection) {
						EZMojoTarget t = (EZMojoTarget)((IStructuredSelection)sel).getFirstElement();
						if (t instanceof EZMojoTarget) {
							Object elem = getElement().getAdapter(EZMojoNode.class);
						    if (elem instanceof EZMojoNode) {
							    EZMojoNode node = (EZMojoNode) elem;
							    node.getForwards().remove(t);
								listViewer.refresh(true);
							}
						}
					}
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
	   );
	   deleteTargetButton.setLayoutData(GridDataFactory.swtDefaults().align(SWT.END, SWT.CENTER).create());
	   
	   container.layout(true);
	   container.pack(true);
	}
	
	void updateTargetDetails(EZMojoTarget target) {
		
	}

	
	
	/**
	 * @see PreferencePage#createContents(Composite)
	 */
	protected Control createContents(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		composite.setLayout(layout);
		GridData data = new GridData(GridData.FILL);
		data.grabExcessHorizontalSpace = true;
		composite.setLayoutData(data);

		//addFirstSection(composite);
		//addSeparator(composite);
		createContent(composite);
		return composite;
	}

	private Composite createDefaultComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(GridLayoutFactory.fillDefaults().create());
		composite.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		return composite;
	}

	protected void performDefaults() {
		super.performDefaults();
		// Populate the owner text field with the default value
	}
	
	public boolean performOk() {
		// store the value in the owner text field

		/*
		try {
			((IResource) getElement()).setPersistentProperty(
				new QualifiedName("", OWNER_PROPERTY),
				ownerText.getText());
		} catch (CoreException e) {
			return false;
		}
		*/
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}