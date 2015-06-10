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

package net.sf.smbt.ui.sniffer;

import net.sf.smbt.ui.mapping.SniffCompseableAdapterFactory;
import net.sf.smbt.ui.mapping.SniffContentProvider;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.DrillDownAdapter;
import org.eclipse.ui.part.ViewPart;

public class CmdSnifferView extends ViewPart {

	private DrillDownAdapter drillDownAdapter;
	private Action connectArduinoAction;
	private Action disconnectArduinoAction;
	private Action refreshArduinoAction;
	private Action editArduinoConfigurationAction;
	private Action doubleClickAction;

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "net.sf.smbt.ui.dxxp.views.DxxpView";

	private TreeViewer viewer;

	public void createPartControl(Composite parent) {
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		drillDownAdapter = new DrillDownAdapter(viewer);
		viewer.setContentProvider(new SniffContentProvider());
		viewer.setLabelProvider(
			new AdapterFactoryLabelProvider(
				new SniffCompseableAdapterFactory()
			)
		);
		viewer.setInput(getViewSite());
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				CmdSnifferView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(connectArduinoAction);
		manager.add(disconnectArduinoAction);
		manager.add(refreshArduinoAction);
		manager.add(new Separator());
		manager.add(editArduinoConfigurationAction);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(connectArduinoAction);
		manager.add(disconnectArduinoAction);
		manager.add(refreshArduinoAction);
		manager.add(new Separator());
		manager.add(editArduinoConfigurationAction);
		drillDownAdapter.addNavigationActions(manager);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(connectArduinoAction);
		manager.add(disconnectArduinoAction);
		manager.add(refreshArduinoAction);
		manager.add(new Separator());
		manager.add(editArduinoConfigurationAction);
		drillDownAdapter.addNavigationActions(manager);
	}

	private void makeActions() {
		connectArduinoAction = new Action() {
			public void run() {
				showMessage("Connection To Arduino Executed");
			}
		};
		connectArduinoAction.setText("Connection To Arduino");
		connectArduinoAction.setToolTipText("Connection To Arduino Tooltip");
		connectArduinoAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		
		disconnectArduinoAction = new Action() {
			public void run() {
				showMessage("Disconnection From Arduino Executed");
			}
		};
		disconnectArduinoAction.setText("Disconnection From Arduino");
		disconnectArduinoAction.setToolTipText("Disconnection From Arduino Tooltip");
		disconnectArduinoAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		doubleClickAction = new Action() {
			public void run() {
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				showMessage("Double-click detected on "+obj.toString());
			}
		};

		refreshArduinoAction = new Action() {
			public void run() {
				showMessage("Refresh Arduino Executed");
			}
		};
		refreshArduinoAction.setText("Refresh Arduino");
		refreshArduinoAction.setToolTipText("Refresh Arduino Tooltip");
		refreshArduinoAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
	
		editArduinoConfigurationAction = new Action() {
			public void run() {
				showMessage("Edit Arduino Properties Executed");
			}
		};
		editArduinoConfigurationAction.setText("Edit Arduino Properties");
		editArduinoConfigurationAction.setToolTipText("Edit Arduino Properties Tooltip");
		editArduinoConfigurationAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
	
	}

	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
	}
	private void showMessage(String message) {
		MessageDialog.openInformation(
			viewer.getControl().getShell(),
			"Dxxp View",
			message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}
}
