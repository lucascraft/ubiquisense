/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012, Lucas Bigeardel
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

import net.sf.smbt.ui.pachube.editors.CosmEditorInput;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.actions.RetargetAction;
import org.eeml.xsd._0._5.EnvironmentType;

public abstract class AbstractCosmRetargetAction extends RetargetAction implements IWorkbenchWindowActionDelegate {

	@SuppressWarnings("unused")
	private IWorkbenchWindow window;
	
	private CmdPipe pipe;
	private String apiKey;

	public abstract String getID();
	
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	public void setPipe(CmdPipe pipe) {
		this.pipe = pipe;
	}
	public CmdPipe getCosmPipe(){
		return pipe;
	}
	public String getApiKey(){
		return apiKey;
	}
	public AbstractCosmRetargetAction(String id, String txt) {
		super(id, txt);
	}
	public void run(IAction action) {}
	
	@Override
	public void runWithEvent(Event event) {
		run(this);
	}

	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection) {
			Object obj = ((StructuredSelection)selection).getFirstElement();
			if (obj instanceof EnvironmentType || obj instanceof CosmEditorInput) {
				//action.setEnabled(true);
			}
		}
	}

	public void dispose() {}

	public void init(IWorkbenchWindow window) {
		this.window = window;
	}
}
