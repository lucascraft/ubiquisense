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

import net.sf.smbt.ezcosm.Coordinates;
import net.sf.smbt.ezcosm.CosmProject;
import net.sf.smbt.ezcosm.EzcosmFactory;
import net.sf.smbt.ui.pachube.editors.CosmEditor;
import net.sf.smbt.ui.pachube.gmap.GMap;
import net.sf.smbt.ui.pachube.gmap.LatLng;
import net.sf.smbt.ui.pachube.gmap.MapListener;
import net.sf.smbt.ui.widgets.common.GeoUtils;

import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
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
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eeml.xsd._0._5.DispositionType;
import org.eeml.xsd._0._5.DomainType;
import org.eeml.xsd._0._5.ExposureType;

import Pachube.Disposition;
import Pachube.Domain;
import Pachube.Exposure;

public class CreateCosmLocationWizardPage extends WizardPage {
	private final static String INFO_MSG = "Define Cosm Feed Location";
	
	private CosmEditor cosmEditor;
	private Text locNameText;
	
	protected CreateCosmLocationWizardPage(CosmEditor cosmEditor) {
		super("Location");
		
		setMessage("Define Location");
		setDescription("Location");
		setTitle(INFO_MSG);
		
		this.cosmEditor = cosmEditor;
	}
	
	private ControlDecoration decFeedName;
	private FieldDecoration infoFieldIndicator, errorFieldIndicator;

	@Override
	public void createControl(Composite parent) {
		
	    SashForm sash = new SashForm( parent, SWT.VERTICAL );    

		createGoogleMapLocator(sash);
		
		Composite composite = new Composite(sash, SWT.NONE);
		composite.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		composite.setLayoutData(GridDataFactory.fillDefaults().create());

		//
		// API Key
		//
		Label locNameLabel = new Label(composite, SWT.NONE);
		locNameLabel.setText("Name : ");
		locNameLabel.setLayoutData(GridDataFactory.swtDefaults().align(SWT.END, SWT.CENTER).create());
		
		locNameText = new Text(composite, SWT.BORDER);
		locNameText.setText("Test Feed");
		locNameText.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		/**
		locNameText.addVerifyListener(new VerifyListener() {
			@Override
			public void verifyText(VerifyEvent e) {
				if (isPageComplete()) {
					((CreateCosmFeedWizard)getWizard()).getEnvType().getLocation().setName(e.text);
				}
			}
		});		
		locNameText.addKeyListener(new KeyListener() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (isPageComplete()) {
					((CreateCosmFeedWizard)getWizard()).getEnvType().getLocation().setName(locNameText.getText());
				}
			}
			@Override
			public void keyPressed(KeyEvent e) {}
		});		
		*/
		// Create a control decoration to indicate an error.
		decFeedName = new ControlDecoration(locNameText, SWT.TOP | SWT.LEFT);
		infoFieldIndicator = FieldDecorationRegistry.getDefault().
				   getFieldDecoration(FieldDecorationRegistry.DEC_CONTENT_PROPOSAL);
		errorFieldIndicator = FieldDecorationRegistry.getDefault().
				   getFieldDecoration(FieldDecorationRegistry.DEC_ERROR);
		decFeedName.setImage(infoFieldIndicator.getImage());
		decFeedName.setDescriptionText(infoFieldIndicator.getDescription());
		
		
		//
		// Disposition
		//
		Label dispoLabel = new Label(composite, SWT.NONE);
		dispoLabel.setText("Disposition : ");
		dispoLabel.setLayoutData(GridDataFactory.swtDefaults().align(SWT.END, SWT.CENTER).create());

		ComboViewer dispoComboViewer  = new ComboViewer(composite);
		dispoComboViewer.setLabelProvider(new LabelProvider(){
			@Override
			public String getText(Object element) {
				if (element instanceof Disposition) {
					return ((Disposition)element).name();
				}
				return super.getText(element);
			}
		});
		dispoComboViewer.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true,	false).create());
		dispoComboViewer.setContentProvider(new ArrayContentProvider());
		dispoComboViewer.setInput(Disposition.values());
		dispoComboViewer.setSelection(new StructuredSelection(Disposition.fixed));
		dispoComboViewer.addSelectionChangedListener(
			new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					if (event.getSelection() instanceof IStructuredSelection) {
						Object obj = ((IStructuredSelection)event.getSelection()).getFirstElement();
						if (obj instanceof Disposition) {
							Disposition d = (Disposition) obj;
							((CreateCosmFeedWizard)getWizard()).getEnvType().getLocation().setDisposition(DispositionType.get(d.name()));
						}
					}
				}
			}
		);

		//
		// Exposure
		//
		Label exposureLabel = new Label(composite, SWT.NONE);
		exposureLabel.setText("Exposure : ");
		exposureLabel.setLayoutData(GridDataFactory.swtDefaults().align(SWT.END, SWT.CENTER).create());

		ComboViewer exposureComboViewer  = new ComboViewer(composite);
		exposureComboViewer.setLabelProvider(new LabelProvider(){
			@Override
			public String getText(Object element) {
				if (element instanceof Exposure) {
					return ((Exposure)element).name();
				}
				return super.getText(element);
			}
		});
		exposureComboViewer.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true,	false).create());
		exposureComboViewer.setContentProvider(new ArrayContentProvider());
		exposureComboViewer.setInput(Exposure.values());
		exposureComboViewer.setSelection(new StructuredSelection(Exposure.indoor));
		exposureComboViewer.addSelectionChangedListener(
			new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					if (event.getSelection() instanceof IStructuredSelection) {
						Object obj = ((IStructuredSelection)event.getSelection()).getFirstElement();
						if (obj instanceof Exposure) {
							Exposure d = (Exposure) obj;
							((CreateCosmFeedWizard)getWizard()).getEnvType().getLocation().setExposure(ExposureType.get(d.name()));
						}
					}
				}
			}
		);


		//
		// Domain
		//
		Label domainLabel = new Label(composite, SWT.NONE);
		domainLabel.setText("Domain : ");
		domainLabel.setLayoutData(GridDataFactory.swtDefaults().align(SWT.END, SWT.CENTER).create());

		ComboViewer domainComboViewer  = new ComboViewer(composite);
		domainComboViewer.setLabelProvider(new LabelProvider(){
			@Override
			public String getText(Object element) {
				if (element instanceof Domain) {
					return ((Domain)element).name();
				}
				return super.getText(element);
			}
		});
		domainComboViewer.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true,	false).create());
		domainComboViewer.setContentProvider(new ArrayContentProvider());
		domainComboViewer.setInput(Domain.values());
		domainComboViewer.setSelection(new StructuredSelection(Domain.physical));
		domainComboViewer.addSelectionChangedListener(
			new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					if (event.getSelection() instanceof IStructuredSelection) {
						Object obj = ((IStructuredSelection)event.getSelection()).getFirstElement();
						if (obj instanceof Domain) {
							Domain d = (Domain) obj;
							((CreateCosmFeedWizard)getWizard()).getEnvType().getLocation().setDomain(DomainType.get(d.name()));
						}
					}
				}
			}
		);
		
		sash.setWeights(new int[]{3, 1});
		
		setControl(sash);
		
		//PlatformUI.getWorkbench().getHelpSystem().setHelp(getControl(), "net.sf.smbt.doc.transport_protocol_context"); // NEW
	}

	
	static final private String INIT_CENTER = "33.0,5.0";
	static final private int INIT_ZOOM = 2;
	static final private int INIT_TYPE = net.sf.smbt.ui.pachube.gmap.GMap.TYPE_ROADMAP;
	
	private net.sf.smbt.ui.pachube.gmap.GMap gmap = null;

	private void createGoogleMapLocator(Composite inside) {
		gmap = new GMap(inside, SWT.NONE);
	    gmap.setCenter( GeoUtils.stringToLatLng( INIT_CENTER ) );
	    gmap.setZoom( INIT_ZOOM );
	    gmap.setType( INIT_TYPE );
	    
		Coordinates coord = EzcosmFactory.eINSTANCE.createCoordinates();
		coord.setLat(0d);
		coord.setLon(0d);
		coord.setZoom(5);
		
		if (cosmEditor != null) {
			@SuppressWarnings("static-access")
			CosmProject proj = cosmEditor.getCosmProject();
			if (proj != null) {
				coord = proj.getLastCoordinate();
			}
		}
		
		LatLng latLng = new LatLng(coord.getLat(), coord.getLon());
		gmap.setCenter(latLng);
		gmap.setZoom(coord.getZoom());
		
		gmap.addMapListener(new MapListener() {
			@Override
			public void zoomChanged() {
				updateCoords(gmap.getCenter());
			}
			@Override
			public void centerChanged() {
				updateCoords(gmap.getCenter());
			}
			@Override
			public void addressResolved() {
				updateCoords(gmap.getCenter());
			}
			public void markerSelected(String id) {
				
			}
		});
	}
	
	private void updateCoords(LatLng coords) {
		((CreateCosmFeedWizard)getWizard()).getEnvType().getLocation().setLon(coords.longitude);
		((CreateCosmFeedWizard)getWizard()).getEnvType().getLocation().setLat(coords.latitude);
	}
	
	public class IPAddressValidator{
	    public IPAddressValidator(){
	    	
	    }
	 
	    public boolean validate(){
		  String txt = locNameText.getText();
		  
		  setErrorMessage(null);
		  if (txt != null && txt.length() > 2) {
			  decFeedName.hide();
			  decFeedName.setImage(infoFieldIndicator.getImage());
			  setErrorMessage(null);
			  setMessage(INFO_MSG);
			  //setPageComplete(true);
			  return true;
		  }
		  decFeedName.show();
		  decFeedName.setImage(errorFieldIndicator.getImage());
		  setErrorMessage("Location Name should be 3 characther or more");

		  return false; 	    	    
	    }
	}

	@Override
	public boolean isPageComplete() {
		boolean ipValid = new IPAddressValidator().validate();
		return super.isPageComplete() && ipValid;
	}

	
}
