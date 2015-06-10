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

package net.sf.smbt.ui.pachube.controller;

import java.util.Map;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;
import org.eeml.xsd._0._5.DataType;
import org.eeml.xsd._0._5.EnvironmentType;
import org.eeml.xsd._0._5.StatusType;

public class CosmCellLabelProvider extends CellLabelProvider implements IColorProvider, ILabelProvider {
	static long[] temporalThresholds = new long[] {
		25, 50, 100, 250, 500, 1000, 1500, 2500, 5000, 10000, 60000
	};
	 
	static RGB[] temporalBlur = new RGB[] { 
	 	new RGB(245, 15, 15),
	 	new RGB(235, 25, 25),
	 	new RGB(220, 30, 30),
	 	new RGB(220, 45, 45),
	 	new RGB(220, 70, 70),
	 	new RGB(225, 130, 130),
	 	new RGB(230, 150, 150),
	 	new RGB(235, 166, 166),
	 	new RGB(240, 175, 175),
	 	new RGB(245, 190, 190),
	 	new RGB(255, 200, 200)
	};

	Map<RGB, Color> colors;
	public Color getColor(RGB rgb) {
		if (!colors.containsKey(rgb)) {
			return colors.put(rgb, new Color(Display.getDefault(), rgb));
		}
		return colors.get(rgb);
	}

	/**
	 * 
	 */
	AdapterFactoryLabelProvider labelProvider;
	public CosmCellLabelProvider() {
		this.labelProvider = new AdapterFactoryLabelProvider(
		    new PachubeComposeableAdapterFactory()
		) {
	    	@Override
	    	public String getText(Object object) {
	    		String text = super.getText(object);
	    		try {
	    			int t = Integer.parseInt(text);
	    		} catch (NumberFormatException e) {
	    			return text;
	    		}
	    		return "unamed stream #" + text;
	    	}
	    };
	}
	@Override
	public Color getForeground(Object element) {
		if (element instanceof EnvironmentType) {
			EnvironmentType env = (EnvironmentType) element;
			if (StatusType.FROZEN.equals(env.getStatus())) {
				return ColorConstants.lightGray;
			} else if (StatusType.LIVE.equals(env.getStatus())) {
				return ColorConstants.lightGreen;
			}
			return getColor(temporalBlur[temporalThresholds.length-1]);
		} else if (element instanceof DataType) {
			DataType dat = (DataType) element;
			if (dat.getDatapoints() != null && dat.getDatapoints().getValue() != null && dat.getDatapoints().getValue().isEmpty()) {
				return ColorConstants.orange;
			} else {
				return ColorConstants.white;
			}
		}
		return getColor(temporalBlur[0]);
	}
	@Override
	public Color getBackground(Object element) {
		return ColorConstants.darkGray;
	}
	@Override
	public void update(ViewerCell cell) {
		Object obj = cell.getElement();
		cell.setImage(labelProvider.getImage(obj));
		cell.setText(labelProvider.getText(obj));
		cell.setForeground(getForeground(obj));
	}
	@Override
	public Image getImage(Object element) {
		return labelProvider != null ? labelProvider.getImage(element) : null;
	}
	@Override
	public String getText(Object element) {
		return labelProvider != null ? labelProvider.getText(element) : null;
	}
}