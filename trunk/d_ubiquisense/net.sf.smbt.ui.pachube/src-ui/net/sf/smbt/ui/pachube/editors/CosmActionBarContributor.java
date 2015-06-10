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

package net.sf.smbt.ui.pachube.editors;

import net.sf.smbt.gpx.utils.Gpx1Utils;
import net.sf.smbt.kml.utils.KmlUtils;
import net.sf.smbt.ui.pachube.Activator;
import net.sf.smbt.ui.pachube.actions.CosmImportGpxAction;
import net.sf.smbt.ui.pachube.actions.CosmImportKmlAction;
import net.sf.smbt.ui.pachube.actions.CreateCosmFeedAction;
import net.sf.smbt.ui.pachube.wizards.CreateCosmFeedWizardDialog;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.part.EditorActionBarContributor;


public class CosmActionBarContributor extends EditorActionBarContributor {
	private CreateCosmFeedAction	createCosmFeedAction;
	private CosmImportGpxAction 	importGpxAction;
	private CosmImportKmlAction 	importKmlAction;
	private CosmEditor 				cosmEditor;
	
	public CosmEditor getCosmEditor() {
		return cosmEditor;
	}

	public CosmActionBarContributor() {
		importKmlAction = new CosmImportKmlAction(CosmImportGpxAction.ID, "Import KML") {
			@Override
			public void runWithEvent(Event event) {
				run();
			}
			@Override
			public void run(IAction action) {
				run();
			}
			public void run() {
				FileDialog dlg = new FileDialog(Display.getDefault().getActiveShell());
				String file = dlg.open();
				if (file != null) {
					String kmlString = KmlUtils.INSTANCE.loadKmlAsString(file);
					if (cosmEditor != null) {
						cosmEditor.getGoogleMap().addKmlFromString(kmlString);
					}
				}
			}
		};	
		importKmlAction.setText("Import KML");
		importKmlAction.setToolTipText("Import KML");
		importKmlAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.pachube", 
				"icons/cosm-kml.png"
			)
		);
		
		importGpxAction = new CosmImportGpxAction(CosmImportGpxAction.ID, "Import GPX") {
			@Override
			public void runWithEvent(Event event) {
				run();
			}
			@Override
			public void run(IAction action) {
				run();
			}
			public void run() {
				FileDialog dlg = new FileDialog(Display.getDefault().getActiveShell());
				String file = dlg.open();
				if (file != null) {
					String gpxString = Gpx1Utils.INSTANCE.loadGPXAsPureXML(file);
					if (cosmEditor != null) {
						cosmEditor.getGoogleMap().addGpxFromString(gpxString);
					}
				}
			}
		};	
		importGpxAction.setText("Import GPX");
		importGpxAction.setToolTipText("Import GPX");
		importGpxAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.pachube", 
				"icons/cosm-gpx.png"
			)
		);
		
		createCosmFeedAction = new CreateCosmFeedAction(CreateCosmFeedAction.ID, "Create Cosm Feed") {
			@Override
			public void runWithEvent(Event event) {
				run();
			}
			@Override
			public void run(IAction action) {
				run();
			}
			public void run() {
				CreateCosmFeedWizardDialog dlg = new CreateCosmFeedWizardDialog(Display.getDefault().getActiveShell(), cosmEditor, cosmEditor.getEnvType(), getCosmPipe(), getApiKey());
				dlg.open();
			}
		};	
		createCosmFeedAction.setText("Create Cosm Feed");
		createCosmFeedAction.setToolTipText("Create Cosm Feed");
		createCosmFeedAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.pachube", 
				"icons/cosm-feed.png"
			)
		);
	}
	
	@Override
	public void contributeToToolBar(IToolBarManager toolBarManager) {
		toolBarManager.add(new Separator());
		toolBarManager.add(importKmlAction);
		toolBarManager.add(importGpxAction);
		toolBarManager.add(createCosmFeedAction);
	}
	
	public void setActiveEditor(IEditorPart part) {
	    IActionBars actionBars = getActionBars();
	    if (actionBars != null && part instanceof CosmEditor) {
	    	cosmEditor = (CosmEditor) part;
	        
	    	// GPX
	    	actionBars.setGlobalActionHandler(CosmImportGpxAction.ID, 	importGpxAction);
	        importGpxAction.setEnabled(true);
	        
	        // KML
	        actionBars.setGlobalActionHandler(CosmImportKmlAction.ID, 	importKmlAction);
	        importKmlAction.setEnabled(true);
	        
	        // Feed
	        actionBars.setGlobalActionHandler(CreateCosmFeedAction.ID, 	createCosmFeedAction);
	        createCosmFeedAction.setEnabled(true);
	    }
	}
	
	public void contributeToMenu(IMenuManager manager) {
		IMenuManager menu = new MenuManager("Cosm");
		manager.prependToGroup(IWorkbenchActionConstants.MB_ADDITIONS, menu);
		menu.add(importGpxAction);
		menu.add(importKmlAction);
		menu.add(createCosmFeedAction);
	}
}
