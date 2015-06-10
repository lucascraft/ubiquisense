/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2011, Lucas Bigeardel
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

package net.sf.smbt.ui.actions;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

public abstract class AbstractGUIActionDelegate  extends Action implements IObjectActionDelegate{
	protected IStructuredSelection eObjectSelection;

	public AbstractGUIActionDelegate(String text, ImageDescriptor imageDescriptor) {
		super(text, imageDescriptor);
		setEnabled(true);
	}
	
	protected void refreshTargetFromCrurentWorkbenchSelection() {
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		if (page.getActiveEditor() != null) {
			if (page.getActiveEditor().getEditorSite() != null) {
				ISelection selection = page.getActiveEditor().getEditorSite().getSelectionProvider().getSelection();
				if (selection instanceof IStructuredSelection) {
					Object o = ((IStructuredSelection)selection).getFirstElement();
					if (o instanceof IAdaptable) {
						Object a = ((IAdaptable)o).getAdapter(EObject.class);
						if (a instanceof EObject) {
							eObjectSelection = new StructuredSelection(a);
						}
					}
				}
			}
		}
	}
	
	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {}

	@Override
	public void run() {
		run(this);
	}
	
	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			eObjectSelection = (IStructuredSelection)selection;
		}
	}

	/**
	 * Mainly called from Ecore Diagram Editors
	 */
	@Override
	public void runWithEvent(Event event) {
		refreshTargetFromCrurentWorkbenchSelection();
		run();
	}
	public void run(IAction action) {
		run();		
	}
}
