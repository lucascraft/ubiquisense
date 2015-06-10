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

package net.sf.smbt.ui.wizards;

import net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL;
import net.sf.smbt.ui.Activator;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class CommPipeConfigWizardDialog extends WizardDialog {
	public CommPipeConfigWizardDialog(Shell shell, String[] comms) {
		this(shell, new CommPipeConnectionSelectionWizard(comms));
	}
	public CommPipeConfigWizardDialog(Shell shell, TRANSPORT_PROTOCOL[] protocols,String[] comms) {
		this(shell, new CommPipeConnectionSelectionWizard(protocols, comms, true));
	}
	public CommPipeConfigWizardDialog(Shell shell, TRANSPORT_PROTOCOL[] protocols) {
		this(shell, new CommPipeConnectionSelectionWizard(protocols));
	}
	public CommPipeConfigWizardDialog(Shell shell) {
		this(shell, new CommPipeConnectionSelectionWizard());
	}
	public CommPipeConfigWizardDialog(String[] comms) {
		this(Display.getDefault().getActiveShell(), new CommPipeConnectionSelectionWizard(comms));
	}
	public CommPipeConfigWizardDialog(String[] comms, String[] visibles) {
		this(Display.getDefault().getActiveShell(), new CommPipeConnectionSelectionWizard(visibles, comms));
	}
	public CommPipeConfigWizardDialog(TRANSPORT_PROTOCOL[] protocols,String[] comms) {
		this(Display.getDefault().getActiveShell(), new CommPipeConnectionSelectionWizard(protocols, comms, true));
	}
	public CommPipeConfigWizardDialog(TRANSPORT_PROTOCOL protocol,String comm) {
		this(Display.getDefault().getActiveShell(), new CommPipeConnectionSelectionWizard(new TRANSPORT_PROTOCOL[]{ protocol }, new String[]{ comm }, true));
	}
	public CommPipeConfigWizardDialog(TRANSPORT_PROTOCOL[] protocols) {
		this(Display.getDefault().getActiveShell(), new CommPipeConnectionSelectionWizard(protocols));
	}
	public CommPipeConfigWizardDialog() {
		this(Display.getDefault().getActiveShell(), new CommPipeConnectionSelectionWizard());
	}
	@SuppressWarnings("static-access")
	public CommPipeConfigWizardDialog(Shell shell, CommPipeConnectionSelectionWizard wiz) {
		super(shell, wiz);
		setMinimumPageSize(600, 400);
		setDefaultImage(
			Activator.getDefault().imageDescriptorFromPlugin(
				Activator.PLUGIN_ID, 
				"icons/ubiquisense64.png"
			).createImage()
		);
		setHelpAvailable(true);
	}
	@Override
	protected Control createHelpControl(Composite parent) {
		return super.createHelpControl(parent);
	}
	public CmdPipe getSelection() {
		return ((CommPipeConnectionSelectionWizard)getWizard()).getCmdPipe();
	}
}
