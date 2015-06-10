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

import net.sf.smbt.pachube.utils.CosmUtils;
import net.sf.smbt.pachube.utils.PachubeUtils;
import net.sf.smbt.ui.Activator;
import net.sf.smbt.ui.pachube.editors.CosmEditor;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.graphics.Image;
import org.eeml.xsd._0._5.EnvironmentType;

import Pachube.Feed;

public class CreateCosmFeedWizard extends Wizard {
	private CmdPipe pipe;
	private CosmEditor cosmEditor;
	private EnvironmentType envType;
	
	public CreateCosmFeedWizardPage			feedWizardPage;
	public CreateCosmLocationWizardPage		locationWizardPage;
	public CreateCosmDatastreamsWizardPage	datastreamsWizardPage;

	public CreateCosmFeedWizard(CosmEditor cosmEditor, CmdPipe pipe, String apiKey) {
		this.pipe = pipe;
		this.cosmEditor = cosmEditor;
		this.envType = CosmUtils.INSTANCE.createDefaultEnvType();
		
		feedWizardPage 			= new CreateCosmFeedWizardPage();
		locationWizardPage		= new CreateCosmLocationWizardPage(cosmEditor);
		datastreamsWizardPage	= new CreateCosmDatastreamsWizardPage(cosmEditor);
		setHelpAvailable(true);
		setWindowTitle("Cosm Feed Creation Wizard");
	}
	
	public EnvironmentType getEnvType() {
		return envType;
	}
	
	@Override
	public boolean performFinish() {
		Cmd cmd = PachubeUtils.INSTANCE.createFeed(envType, cosmEditor.getApiKey());
		if (cmd != null) {
			cosmEditor.getPachubeEngine().send(
				cmd
			);
		}
		return true;
	}
	
	@Override
	public boolean canFinish() {
		return true;
	}
	
	@Override
	public void addPages() {
		addPage(feedWizardPage);
		addPage(locationWizardPage);
		addPage(datastreamsWizardPage);
	}

	@SuppressWarnings("static-access")
	@Override
	public Image getDefaultPageImage() {
		return Activator.getDefault().imageDescriptorFromPlugin(
			Activator.PLUGIN_ID, 
			"icons/ubiquisense64.png"
		).createImage();
	}
	
	public Feed getFeed() {
		return null;
	}
	
	public CmdPipe getPipe() {
		return pipe;
	}
}
