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

package net.sf.smbt.ui.pachube.wizards;

import net.sf.smbt.ui.Activator;
import net.sf.smbt.ui.pachube.editors.CosmEditor;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eeml.xsd._0._5.EnvironmentType;

import Pachube.Feed;

public class CreateCosmFeedWizardDialog extends WizardDialog {
	public CreateCosmFeedWizardDialog(Shell shell, CosmEditor cosmEditor, EnvironmentType envType, CmdPipe pipe, String apiKey) {
		this(shell, new CreateCosmFeedWizard(cosmEditor, pipe, apiKey));
	}
	@SuppressWarnings("static-access")
	public CreateCosmFeedWizardDialog(Shell shell, CreateCosmFeedWizard wiz) {
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
	public Feed getSelection() {
		return ((CreateCosmFeedWizard)getWizard()).getFeed();
	}
}
