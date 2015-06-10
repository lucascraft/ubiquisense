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

package net.sf.smbt.ui.widgets.vu;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Path;
import org.eclipse.swt.graphics.PathData;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class UbiSimple2DChart extends UbiWidget {
	private float 	min;
	private float 	max;
	private float[] data;
	private String 	unit;

	public UbiSimple2DChart(Composite parent, float min, float max, float[] data, String unit, String label) {
		super(parent, SWT.NONE);
		
		this.min 	= min;
		this.max 	= max;
		this.data 	= data;
		this.unit 	= unit;
		
		setLayout(GridLayoutFactory.fillDefaults().spacing(0, 0).extendedMargins(0, 0, 0, 0).margins(0, 0).create());
		setLayoutData(GridDataFactory.fillDefaults().hint(SWT.DEFAULT, 120).minSize(SWT.DEFAULT, 120).grab(true, true).create());
		
		addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent e) {
				draw(e);
			}
		});
	}

	private void draw(PaintEvent e) {
		GC gc = e.gc;
		
		Rectangle r = getClientArea();
		
		String minStr = min + " " + unit;
		String maxStr = max + " " + unit;
		
		Point maxStrExtent = gc.textExtent(maxStr);
		//Point lblStrExtent = gc.textExtent(label);
		
		PathData pData = new PathData();

		//
		// points
		//
		int ptLength = 2 * (2 + data.length);
		float[] pts		= new float[ptLength];
		pts[0]		= 0;
		pts[1]		= 0;
		int i = 2;
		for (float f : data) {
			float ratio = (max - f) / (max - min);
			pts[i++] = (1f - ratio) * new Float(r.height);
		}
		pts[ptLength - 2] = r.width;
		pts[ptLength - 1] = 0;
		
		//
		// types
		//
		byte[] types	= new byte[2 + data.length];
		types[0]	= SWT.PATH_MOVE_TO;
		int j = 1;
		for (float f : data) {
			f = f * 1f;
			types[j++]		= SWT.PATH_LINE_TO;
		}
		types[1 + data.length] = SWT.PATH_LINE_TO;
		
		pData.types = types;
		pData.points = pts;
		
		Path path = new Path(Display.getDefault(), pData);
		
		gc.drawPath(path);
		
		if (minStr != null && minStr.length() > 0) {
			gc.drawText(minStr, 5, 5);
		}
		if (maxStr != null && maxStr.length() > 0) {
			gc.drawText(maxStr, 5, (r.height - maxStrExtent.y - 5));
		}
	}
}
