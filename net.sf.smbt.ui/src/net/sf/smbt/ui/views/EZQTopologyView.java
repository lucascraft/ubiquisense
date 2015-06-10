/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2011 - 2015, Lucas Bigeardel
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

package net.sf.smbt.ui.views;

import net.sf.smbt.ui.console.dnd.CmdPipeTransfert;
import net.sf.smbt.ui.hmi.TopologyGraphWidget;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.Event;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.part.ViewPart;





public class EZQTopologyView  extends ViewPart  {

	private TopologyGraphWidget topologyWidget;
	
	private CopyPipeAction copyPipeAction;
	private PastePipeAction pastePipeAction;
	
	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "net.sf.smbt.ui.views.EZQTopologyView";

	public EZQTopologyView() {
	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		topologyWidget = new TopologyGraphWidget(parent, SWT.NONE);
		
		makeActions();
		
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();
		contributeCutCopyPaste();
	}

	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				//EZQTopologyView.this.fillContextMenu(manager);
			}
		});
//		Menu menu = menuMgr.createContextMenu(viewer.getControl());
//		viewer.getControl().setMenu(menu);
//		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}
	
	private CmdPipe getPipeSelection() {
		ISelection sel = topologyWidget.getPipeTreeViewer().getSelection();
		if (sel instanceof StructuredSelection) {
			Object obj = ((StructuredSelection)sel).getFirstElement();
			if (obj instanceof CmdPipe) {
				return (CmdPipe) obj;
			}
		}
		return null;
	}
	class CopyPipeAction extends Action {
		private Clipboard clipboard; 
		public CopyPipeAction(Clipboard clipboard) {
			this.clipboard = clipboard;
		}
		@Override
		public void run() {
			ISelection sel = topologyWidget.getPipeTreeViewer().getSelection();
			if (sel instanceof StructuredSelection) {
				Object obj = ((StructuredSelection)sel).getFirstElement();
				if (obj instanceof CmdPipe) {
					CmdPipe pipe = (CmdPipe) obj;
					clipboard.setContents(new Object[] {pipe}, new Transfer[] {CmdPipeTransfert.INSTANCE});
				}
			}
		}
		public void runWithEvent(Event event) {
			run();
		}
	}
	class PastePipeAction extends Action {
		private Clipboard clipboard; 
		public PastePipeAction(Clipboard clipboard) {
			this.clipboard = clipboard;
		}
		@SuppressWarnings("unused")
		@Override
		public void run() {
			ISelection sel = topologyWidget.getPipeTreeViewer().getSelection();
			if (sel instanceof StructuredSelection) {
				Object obj = clipboard.getContents(CmdPipeTransfert.INSTANCE);
				if (obj instanceof CmdPipe) {
					CmdPipe pipe = (CmdPipe) obj;
				}
			}
		}
		public void runWithEvent(Event event) {
			run();
		}
	}
	
	private void contributeCutCopyPaste() {
		IActionBars bars = getViewSite().getActionBars();
	    bars.setGlobalActionHandler(
	    	ActionFactory.COPY.getId(), 
	        copyPipeAction
	    );
	    bars.setGlobalActionHandler(
	        ActionFactory.PASTE.getId(), 
	        pastePipeAction
	    );
	}

	private void fillLocalPullDown(IMenuManager manager) {
		//manager.add(topologyWidget.getActivatePipeAction());
		//manager.add(topologyWidget.getActivatePipeAction());
		//manager.add(topologyWidget.getActivatePipeAction());
		//manager.add(topologyWidget.getActivatePipeAction());
	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(topologyWidget.getActivatePipeAction());
		manager.add(topologyWidget.getDeactivatePipeAction());
		manager.add(topologyWidget.getAddPipeAction());
		manager.add(topologyWidget.getDeletePipeAction());
		
		manager.add(topologyWidget.getStartDumpPipeAction());
		manager.add(topologyWidget.getStopDumpPipeAction());
		//manager.add(copyPipeAction);
		//manager.add(pastePipeAction);
	}
	
	private void makeActions() {
		Clipboard clipboard = new Clipboard(getSite().getShell().getDisplay());

        copyPipeAction	= new CopyPipeAction(clipboard);
        pastePipeAction = new PastePipeAction(clipboard);
		
/*		action1 = new Action() {
			public void run() {
				showMessage("Action 1 executed");
			}
		};
		action1.setText("Action 1");
		action1.setToolTipText("Action 1 tooltip");
		action1.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		
		action2 = new Action() {
			public void run() {
				showMessage("Action 2 executed");
			}
		};
		action2.setText("Action 2");
		action2.setToolTipText("Action 2 tooltip");
		action2.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		doubleClickAction = new Action() {
			public void run() {
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				showMessage("Double-click detected on "+obj.toString());
			}
		};
		*/
	}

	private void hookDoubleClickAction() {
/*		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
		*/
	}
	/*
	private void showMessage(String message) {
		MessageDialog.openInformation(
			viewer.getControl().getShell(),
			"Topology",
			message);
	}
*/
	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
	//	viewer.getControl().setFocus();
	}
}