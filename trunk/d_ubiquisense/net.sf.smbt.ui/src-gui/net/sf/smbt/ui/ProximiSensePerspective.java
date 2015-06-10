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

package net.sf.smbt.ui;

import net.sf.smbt.ui.logging.page.SmbtLogConsoleFactory;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.IViewLayout;
import org.eclipse.ui.navigator.resources.ProjectExplorer;

public class ProximiSensePerspective implements IPerspectiveFactory {

	public final static String ProximiSensePerspectiveID = "net.sf.smbt.rcp.proximisense.perspective";
	
	public void createInitialLayout(IPageLayout layout) {
//		String editorArea = layout.getEditorArea();
//		layout.setEditorAreaVisible(false);
//		layout.setFixed(false);
//		
//		IFolderLayout projectFolderLayout = layout.createFolder("projectFolder", IPageLayout.LEFT, 0.3f, editorArea);
//		projectFolderLayout.addView("net.sf.smbt.ui.navigator");
//		
//		IFolderLayout topologyFolderLayout = layout.createFolder("topologyFolder", IPageLayout.BOTTOM, 0.3f, "projectFolder");
//		topologyFolderLayout.addView("net.sf.smbt.ui.views.EZQTopologyView");
//		
//		IFolderLayout bottomFolder = layout.createFolder("bottomFolder", IPageLayout.BOTTOM, 0.33f, editorArea);
//		//bottomFolder.addView("org.eclipse.ui.browser.view");
//		bottomFolder.addView("org.eclipse.ui.console.ConsoleView");
		
		// Editors are placed for free.
		String editorArea = layout.getEditorArea();

		// Top Left
		layout.addView(ProjectExplorer.VIEW_ID, IPageLayout.LEFT, (float) 0.25, editorArea);
		IViewLayout explorer = layout.getViewLayout(ProjectExplorer.VIEW_ID);
		explorer.setCloseable(false);

//		// Bottom Left
//		layout.addView(IPageLayout.ID_OUTLINE, IPageLayout.BOTTOM, (float) 0.50, ProjectExplorer.VIEW_ID);
//		IViewLayout outline = layout.getViewLayout(IPageLayout.ID_OUTLINE);
//		outline.setCloseable(false);

		// Bottom
		IFolderLayout bottom = layout.createFolder("bottom", IPageLayout.BOTTOM, (float) 0.70, editorArea); //$NON-NLS-1$
		bottom.addView(IPageLayout.ID_PROP_SHEET);
		bottom.addView(IPageLayout.ID_PROBLEM_VIEW);
		bottom.addView("org.eclipse.ui.console.ConsoleView");
		bottom.addView("net.sf.smbt.ui.views.EZQTopologyView");
		bottom.addView("net.sf.smbt.ui.view.ez");

		IViewLayout properties = layout.getViewLayout(IPageLayout.ID_PROP_SHEET);
		properties.setCloseable(false);


		new SmbtLogConsoleFactory().openConsole();
		//new SmbtConsoleFactory().openConsole();
	}
}
