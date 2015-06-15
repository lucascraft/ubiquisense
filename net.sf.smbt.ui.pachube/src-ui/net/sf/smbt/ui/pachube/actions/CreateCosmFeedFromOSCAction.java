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

package net.sf.smbt.ui.pachube.actions;

import net.sf.smbt.ezmojo.EZMojoNode;
import net.sf.smbt.pachube.utils.PachubeUtils;
import net.sf.smbt.ui.pachube.Activator;
import net.sf.smbt.ui.pachube.wizards.CosmFeedFromOSCWizardDialog;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eeml.xsd._0._5.EnvironmentType;

public class CreateCosmFeedFromOSCAction extends Action implements IWorkbenchWindowActionDelegate{
	private EZMojoNode node; 
	
	public CreateCosmFeedFromOSCAction() {
		super("Create Cosm Feed", Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/pachube.png"));
		setId("net.sf.smbt.ui.pachube.creatFeedFromOSCAction");
		
		System.out.println("net.sf.smbt.ui.pachube.creatFeedFromOSCAction");
	}

	@Override
	public void run() {
		EnvironmentType env = PachubeUtils.INSTANCE.createEemlFromOSC(node);
		
		CosmFeedFromOSCWizardDialog dlg = new CosmFeedFromOSCWizardDialog(Display.getDefault().getActiveShell(), env);
		dlg.open();
	}
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection) {
			StructuredSelection ssel = (StructuredSelection) selection;
			Object obj = ssel.getFirstElement();
			if (obj instanceof EZMojoNode) {
				node = (EZMojoNode) obj;
			}
		}
	}
	
	
	
	@Override
	public void runWithEvent(Event event) {
		run();
	}

	@Override
	public void run(IAction action) {		
		EnvironmentType env = PachubeUtils.INSTANCE.createEemlFromOSC(node);
		
		CosmFeedFromOSCWizardDialog dlg = new CosmFeedFromOSCWizardDialog(Display.getDefault().getActiveShell(), env);
		dlg.open();
	}

	@Override
	public void dispose() {}

	@Override
	public void init(IWorkbenchWindow window) {}
}
