/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012 - 2013, Lucas Bigeardel
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

package net.sf.smbt.ui.pachube.properties;

import net.sf.smbt.ezcosm.CosmProject;
import net.sf.smbt.ui.Activator;

import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.graphics.Image;
import org.eeml.xsd._0._5.DataType;
import org.eeml.xsd._0._5.EnvironmentType;

public class EnvTypeSheetLabelProvider extends BaseLabelProvider implements
		ILabelProvider {

	public String getText(Object selection) {
		Object element = unwrap(selection);
		if (element instanceof DataType) {
			String label = ((DataType)element).getId();
			return "data : " + (label == null ? "" : label);
		} else 	if (element instanceof EnvironmentType) {
			String label = ((EnvironmentType)element).getTitle();
			return "feed : " + (label == null ? "" : label);
		} else if (element instanceof CosmProject) {
			return "xxx";
		}
		return "???";
	}

	public Image getImage(Object element) {
		return Activator.imageDescriptorFromPlugin(
			Activator.PLUGIN_ID, "icons/ubiquisense.png"
		).createImage();
	}

	private Object unwrap(Object element) {
		if (element instanceof IStructuredSelection) {
			return ((IStructuredSelection) element).getFirstElement();
		}
		return element;
	}
}
