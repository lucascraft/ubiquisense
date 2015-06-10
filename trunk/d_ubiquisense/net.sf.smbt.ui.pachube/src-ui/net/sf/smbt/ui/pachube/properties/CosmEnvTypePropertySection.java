/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012 - 2013, Lucas Bigeardel
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

package net.sf.smbt.ui.pachube.properties;

import net.sf.smbt.ui.hmi.GUIToolkit;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eeml.xsd._0._5.EnvironmentType;

public class CosmEnvTypePropertySection extends AbstractPropertySection {
	private EnvironmentType envType;

	private Text idText;
	private Text titleText;
	private Text feedText;
	private Text descText;
	private Text createdText;
	private Text creatorText;
	private Text tagsText;
	private Text emailText;
	
	public CosmEnvTypePropertySection() {}
	
	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		aTabbedPropertySheetPage.getControl().setBackground(GUIToolkit.BG);
		
		parent.setLayout(GridLayoutFactory.fillDefaults().create());
		parent.setLayoutData(GridDataFactory.fillDefaults().indent(25, 25).grab(true, true).create());
		parent.setBackground(GUIToolkit.BG);
		parent.getParent().setBackground(GUIToolkit.BG);
		parent.getParent().getParent().setBackground(GUIToolkit.BG);

		SashForm container = new SashForm(parent, SWT.HORIZONTAL);
		container.setBackground(GUIToolkit.BG);
		
		createFixturesView(container);
		
		container.setWeights(new int[]{1, 2});
	}

	
//	private ListViewer streamListViewer;

	private void createFixturesView(Composite container) {
		
		Composite leftBag = new Composite(container, SWT.NONE);
		leftBag.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		leftBag.setLayoutData(GridDataFactory.fillDefaults().minSize(300, SWT.DEFAULT).indent(25, 25).grab(true, true).create());
		leftBag.setBackground(GUIToolkit.BG);
		
	    //
	    // ID
	    //
		Label IDLabel = new Label(leftBag, SWT.NONE);
		IDLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).create());
		IDLabel.setText("ID : ");
		IDLabel.setForeground(GUIToolkit.FG);
		IDLabel.setBackground(GUIToolkit.BG);
	    
	    idText = new Text(leftBag, SWT.SINGLE);
	    idText.setLayoutData(GridDataFactory.fillDefaults().minSize(200, 0).grab(true, false).create());
	    idText.setBackground(GUIToolkit.BG);
	    idText.setForeground(GUIToolkit.white);
	    idText.setText("");
	    
	    //
	    // Title
	    //
		Label titleLabel = new Label(leftBag, SWT.NONE);
		titleLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).create());
		titleLabel.setText("Title : ");
		titleLabel.setForeground(GUIToolkit.FG);
		titleLabel.setBackground(GUIToolkit.BG);
	    
		titleText = new Text(leftBag, SWT.SINGLE);
		titleText.setLayoutData(GridDataFactory.fillDefaults().minSize(200, 0).grab(true, false).create());
		titleText.setBackground(GUIToolkit.BG);
		titleText.setForeground(GUIToolkit.white);
	    titleText.setText("");
	    
	    //
	    // Feed
	    //
		Label feedLabel = new Label(leftBag, SWT.NONE);
		feedLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).create());
		feedLabel.setText("Feed : ");
		feedLabel.setForeground(GUIToolkit.FG);
		feedLabel.setBackground(GUIToolkit.BG);
	    
	    feedText = new Text(leftBag, SWT.SINGLE);
	    feedText.setLayoutData(GridDataFactory.fillDefaults().minSize(200, 0).grab(true, false).create());
	    feedText.setBackground(GUIToolkit.BG);
	    feedText.setForeground(GUIToolkit.white);
	    feedText.setText("");
	    
	    //
	    // Tags
	    //
	    Label descLabel = new Label(leftBag, SWT.NONE);
	    descLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).create());
	    descLabel.setText("Description : ");
	    descLabel.setForeground(GUIToolkit.FG);
	    descLabel.setBackground(GUIToolkit.BG);
	    
	    descText = new Text(leftBag, SWT.SINGLE);
	    descText.setLayoutData(GridDataFactory.fillDefaults().minSize(200, 0).grab(true, false).create());
	    descText.setBackground(GUIToolkit.BG);
	    descText.setForeground(GUIToolkit.white);
	    descText.setText("");
	    
	    //
	    // Min
	    //
	    Label createdLabel = new Label(leftBag, SWT.NONE);
	    createdLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).create());
	    createdLabel.setText("Created : ");
	    createdLabel.setForeground(GUIToolkit.FG);
	    createdLabel.setBackground(GUIToolkit.BG);

	    createdText = new Text(leftBag, SWT.SINGLE);
	    createdText.setLayoutData(GridDataFactory.fillDefaults().minSize(200, 0).grab(true, false).create());
	    createdText.setBackground(GUIToolkit.BG);
	    createdText.setForeground(GUIToolkit.white);
	    createdText.setText("");
	    
	    //
	    // Max
	    //
	    Label creatorLabel = new Label(leftBag, SWT.NONE);
	    creatorLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).create());
	    creatorLabel.setText("Creator : ");
	    creatorLabel.setForeground(GUIToolkit.FG);
	    creatorLabel.setBackground(GUIToolkit.BG);

	    creatorText = new Text(leftBag, SWT.SINGLE);
	    creatorText.setLayoutData(GridDataFactory.fillDefaults().minSize(200, 0).grab(true, false).create());
	    creatorText.setBackground(GUIToolkit.BG);
	    creatorText.setForeground(GUIToolkit.white);
	    creatorText.setText("");
	    
	    //
	    // Tags
	    //
	    Label tagsLabel = new Label(leftBag, SWT.NONE);
	    tagsLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).create());
	    tagsLabel.setText("Tags : ");
	    tagsLabel.setForeground(GUIToolkit.FG);
	    tagsLabel.setBackground(GUIToolkit.BG);
	    
	    tagsText = new Text(leftBag, SWT.SINGLE);
	    tagsText.setLayoutData(GridDataFactory.fillDefaults().minSize(200, 0).grab(true, false).create());
	    tagsText.setBackground(GUIToolkit.BG);
	    tagsText.setForeground(GUIToolkit.white);
	    tagsText.setText("");

	    //
	    // Email
	    //
	    Label emailLabel = new Label(leftBag, SWT.NONE);
	    emailLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).create());
	    emailLabel.setText("Email : ");
	    emailLabel.setForeground(GUIToolkit.FG);
	    emailLabel.setBackground(GUIToolkit.BG);
	    
	    emailText = new Text(leftBag, SWT.SINGLE);
	    emailText.setLayoutData(GridDataFactory.fillDefaults().minSize(200, 0).grab(true, false).create());
	    emailText.setBackground(GUIToolkit.BG);
	    emailText.setForeground(GUIToolkit.white);
	    emailText.setText("");

		//
		// Desc
		//
		
		Composite rightBag = new Composite(container, SWT.NONE);
		rightBag.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		rightBag.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		rightBag.setBackground(GUIToolkit.BG);
		
		/*

		//
		// TODO : Tags (ListViewer ...)
		//
		
	    //createFactorArea(composite);
	    // Label for owner field
		Label msgLabel = new Label(rightBag, SWT.NONE);
		msgLabel.setText("Data Streams : ");

		// Owner text field
			
		streamListViewer = new ListViewer(rightBag, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		streamListViewer.getList().setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		streamListViewer.getList().setFont(container.getFont());
		streamListViewer.getList().setForeground(GUIToolkit.BG);
		streamListViewer.getList().setBackground(GUIToolkit.FG);
		    
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
		    
		streamListViewer.setInput(envType != null ? envType.getData() : new ArrayList<DataType>());
		streamListViewer.refresh();
		
		Composite buttonBar2 = new Composite(rightBag, SWT.NONE);
		buttonBar2.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		buttonBar2.setLayoutData(GridDataFactory.fillDefaults().span(2, 1).grab(true, false).create());
		buttonBar2.setBackground(GUIToolkit.BG);

		   
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
		*/
		
	    rightBag.layout(true);
	    rightBag.pack(true);
	}
	
	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		Object o = unwrap(selection);
		if (o instanceof EnvironmentType) {
			envType = (EnvironmentType) o;
			
			idText.setText(envType.getId());
			feedText.setText(envType.getFeed());
			titleText.setText(envType.getTitle());
			descText.setText(envType.getDescription());
			creatorText.setText(envType.getCreator());
			
			String text = "";
			for (String tag : envType.getTag()) {
				text += tag + ", ";
			}
			if (text.length()>2) {
				text.substring(0, text.length()-2);
			}
			tagsText.setText(text);
			
			//streamListViewer.setInput(envType != null ? envType.getData() : new ArrayList<DataType>());
			//streamListViewer.refresh();
		}
	}
	
	private Object unwrap(Object element) {
		if (element instanceof IStructuredSelection) {
			return ((IStructuredSelection) element).getFirstElement();
		}
		return element;
	}
}
