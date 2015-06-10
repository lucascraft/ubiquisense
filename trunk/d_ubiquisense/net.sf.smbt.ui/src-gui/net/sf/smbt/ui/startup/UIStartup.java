package net.sf.smbt.ui.startup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import net.sf.smbt.ui.hmi.GUIToolkit;

import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.navigator.CommonNavigator;
import org.eclipse.ui.views.properties.PropertySheet;
import org.eclipse.ui.wizards.IWizardCategory;
import org.eclipse.ui.wizards.IWizardDescriptor;


/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2010 - 2012, Lucas Bigeardel
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

public class UIStartup implements IStartup {

	@Override
	public void earlyStartup() {
		// TouchOSC
		//TouchoscguiDiagramEditorPlugin.getInstance().getBundle();
		//
		
		//
		// Lemur
		// JzmuiDiagramEditorPlugin.getInstance().getBundle();
		//
		


		// New File Wizards
		/*
		AbstractExtensionWizardRegistry wizardRegistry = (AbstractExtensionWizardRegistry)WorkbenchPlugin.getDefault().getNewWizardRegistry();
		IWizardCategory[] categories = WorkbenchPlugin.getDefault().getNewWizardRegistry().getRootCategory().getCategories();
		for(IWizardDescriptor wizard : getAllWizards(categories)){
			WorkbenchWizardElement wizardElement = (WorkbenchWizardElement) wizard;
			if(!allowedWizard(wizardElement.getId())){
				wizardRegistry.removeExtension(wizardElement.getConfigurationElement().getDeclaringExtension(), new Object[]{wizardElement});
			}
		}
		*/
		
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

		
	}
	
	protected static final List<String> FILE_NEW__ALLOWED_WIZARDS = Collections.unmodifiableList(Arrays.asList(new String[]{
		"net.sf.smbt.touchosc.ui.touchoscgui.diagram.part.TouchoscguiCreationWizardID", // TouchOSC diagram wizards
		"net.sf.smbt.jzmui.diagram.part.JzmuiCreationWizardID", // Lemur diagram wizards
		"org.eclipse.ui.editors.wizards.UntitledTextFileWizard", // Basic wizards
		"net.sf.smbt.ui.wizards.project.UbqProjectNewWizard", // Ubqt Project
		"org.eclipse.ui.wizards.new.project",// Basic wizards
		"org.eclipse.ui.wizards.new.folder",// Basic wizards
		"org.eclipse.cdt.ui.wizards.NewMakeFromExisting",// CDT wizards
		"org.eclipse.cdt.ui.wizards.NewSourceFileCreationWizard",// CDT wizards
		"org.eclipse.cdt.ui.wizards.NewHeaderFileCreationWizard",// CDT wizards
		"org.eclipse.cdt.ui.wizards.NewFileCreationWizard",// CDT wizards
		"org.eclipse.cdt.ui.wizards.NewSourceFolderCreationWizard",// CDT wizards
		"org.eclipse.cdt.ui.wizards.NewFolderCreationWizard",// CDT wizards
		"org.eclipse.cdt.internal.ui.wizards.NewClassCreationWizard",// CDT wizards
		"org.eclipse.cdt.ui.wizards.NewCWizard1",// CDT wizards
		"org.eclipse.cdt.ui.wizards.NewCWizard2",// CDT wizards
		"de.innot.avreclipse.ui.wizards.NewFusesWizard",// CDT wizards
		"de.innot.avreclipse.ui.wizards.NewLockbitsWizard",// CDT wizards 
		"org.eclipse.jdt.ui.wizards.JavaProjectWizard", // JDT wizards
		"org.eclipse.jdt.ui.wizards.NewPackageCreationWizard", // JDT wizards
		"org.eclipse.jdt.ui.wizards.NewClassCreationWizard", // JDT wizards
		"org.eclipse.jdt.ui.wizards.NewInterfaceCreationWizard", // JDT wizards
		"org.eclipse.jdt.internal.ui.wizards.NewSourceFolderCreationWizard", // JDT wizards
		"org.eclipse.jdt.internal.ui.wizards.NewEnumCreationWizard", // JDT wizards
		"org.eclipse.jdt.internal.ui.wizards.NewAnnotationCreationWizard", // JDT wizards
		"org.eclipse.jdt.ui.wizards.NewJavaWorkingSetWizard", // JDT Wizards
		"org.eclipse.ui.wizards.new.file", // Basic wizards
		/*
		"org.eclipse.koneki.mfe.ide.ui.DataFlowComponentClassWizard",
		"org.eclipse.koneki.mfe.ide.ui.SourceComponentClassWizard",
		"org.eclipse.koneki.mfe.model.presentation.M2MModelWizardID",
		"org.eclipse.koneki.examples.core.ui.wizard",
		"org.eclipse.koneki.ldt.wizard"
		*/
		"net.sf.smbt.dmx.model.qxf.presentation.QxfModelWizardID",
		"net.sf.smbt.dmx.ezdmxctrl.presentation.EzdmxctrlModelWizardID",
		"net.sf.smbt.ezmojo.presentation.EzmojoModelWizardID",
		"net.sf.smbt.ezsequence.diagram.part.EzsequenceCreationWizardID",
		"net.sf.smbt.ezsequence.presentation.EzsequenceModelWizardID",
	}));

	protected boolean allowedWizard(String wizardId) {
		return FILE_NEW__ALLOWED_WIZARDS.contains(wizardId);
	}

	@SuppressWarnings("unused")
	private IWizardDescriptor[] getAllWizards(IWizardCategory... categories) {
		List<IWizardDescriptor> results = new ArrayList<IWizardDescriptor>();
		for(IWizardCategory wizardCategory : categories) {
			results.addAll(Arrays.asList(wizardCategory.getWizards()));
			results.addAll(Arrays.asList(getAllWizards(wizardCategory.getCategories())));
		}
		return results.toArray(new IWizardDescriptor[0]);
	}
}
