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

package net.sf.smbt.rcp.proximisense;

import net.sf.smbt.ui.hmi.GUIToolkit;

import org.eclipse.jface.preference.PreferenceManager;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.ui.navigator.CommonNavigator;
import org.eclipse.ui.views.contentoutline.ContentOutline;
import org.eclipse.ui.views.properties.PropertySheet;

public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

	public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
		super(configurer);
	}

	public ActionBarAdvisor createActionBarAdvisor(
			IActionBarConfigurer configurer) {
		return new ApplicationActionBarAdvisor(configurer);
	}

	public void preWindowOpen() {
        IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
//        configurer.setInitialSize(new Point(1024, 780));
        configurer.setShowCoolBar(true);
        configurer.setShowStatusLine(true);
//        configurer.setShowMenuBar(true);
        configurer.setShowPerspectiveBar(true);
        configurer.setShowProgressIndicator(true);
	}
	
	@Override
	public void postWindowOpen() {
		getWindowConfigurer().getWindow().getShell().setMaximized(true);
	}
	
	@Override
	public void postWindowCreate() {
		super.postWindowCreate();
		PreferenceManager pm = PlatformUI.getWorkbench( ).getPreferenceManager();
		
		pm.remove("net.sf.smbt.comm.script.NetConf");
		pm.remove("net.sf.smbt.jazzmutant.diagram.general");
		pm.remove("org.eclipse.emf.ecoretools.diagram.general");
		pm.remove("net.sf.smbt.touchosc.diagram.general");
		//pm.remove("net.sf.smbt.ui.ableton.preferences.AbletonLivePreferencePage");
		pm.remove("net.sf.smbt.ui.modul8.preferences.Modul8PreferencePage");
		pm.remove("net.sf.xqz.engine.script.Orchestror");
		pm.remove("org.eclipse.ant.ui.AntPreferencePage");
		pm.remove("org.eclipse.debug.ui.DebugPreferencePage");
		pm.remove("org.eclipse.emf.cdo.ui.CDOPreferencePage");
		pm.remove("org.eclipse.emf.compare.ui.preferences.EMFComparePreferencesPage");
		pm.remove("org.eclipse.emf.mwe2.language.Mwe2");
		pm.remove("org.eclipse.emf.validation.ui.rootPage");
		pm.remove("org.eclipse.emf.ecore.diagram.general");
		pm.remove("org.eclipse.help.ui.browsersPreferencePage");
		pm.remove("org.eclipse.jdt.ui.preferences.JavaBasePreferencePage");
		pm.remove("org.eclipse.pde.ui.MainPreferencePage");
		pm.remove("org.eclipse.team.ui.TeamPreferences");
		pm.remove("org.eclipse.ui.preferencePages.Workbench");
		pm.remove("org.eclipse.xtend.shared.ui.properties.MetamodelContributorsPropertyPage");
		pm.remove("org.eclipse.xtext.Xtext");
		
		// get the view
		try {
		
			IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			if (window != null) {
				IWorkbenchPage page = window.getActivePage();
				if (page != null) {
					IViewPart viewPart = page.showView("net.sf.smbt.ui.navigator");
					if (viewPart instanceof CommonNavigator) {
						CommonNavigator view = (CommonNavigator) viewPart;
						view.getCommonViewer().getControl().setBackground(GUIToolkit.BG);
						view.getCommonViewer().getControl().setForeground(GUIToolkit.FG);
					}
					/*
					viewPart = page.showView(IPageLayout.ID_OUTLINE);
					if (viewPart instanceof ContentOutline) {
						ContentOutline view = (ContentOutline) viewPart;
						Control control = view.getCurrentPage().getControl();
						if (control != null) {
							control.setBackground(GUIToolkit.BG);
							control.setForeground(GUIToolkit.FG);
						}
						control = view.getDefaultPage().getControl();
						if (control != null) {
							control.setBackground(GUIToolkit.BG);
							control.setForeground(GUIToolkit.FG);
						}
					}
					*/
					viewPart = page.showView(IPageLayout.ID_PROP_SHEET);
					if (viewPart instanceof PropertySheet) {
						PropertySheet view = (PropertySheet) viewPart;
						Control control = view.getCurrentPage().getControl();
						if (control != null) {
							control.setBackground(GUIToolkit.BG);
							control.setForeground(GUIToolkit.FG);
						}
						control = view.getDefaultPage().getControl();
						if (control != null) {
							control.setBackground(GUIToolkit.BG);
							control.setForeground(GUIToolkit.FG);
						}
					}
				}
			}
		} catch (PartInitException e) {
			e.printStackTrace();
		}

		
/*
		PreferenceManager pm = PlatformUI.getWorkbench( ).getPreferenceManager();
		IPreferenceNode[] arr = pm.getRootSubNodes();
		        
		for(IPreferenceNode pn:arr){
		    System.out.println("Label:" + pn.getLabelText() + " ID:" + pn.getId());
		}
*/
	}
	@Override
	public void postWindowClose() {
		super.postWindowClose();
	}
}
