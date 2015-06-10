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

package net.sf.smbt.ui.widgets.vu;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class UbiPieMeter extends UbiWidget {
	int sectors = 8;
	int step;
	 
	public int getSectors() {
		return sectors;
	}
	 
	public void setSectors(int sectors) {
		this.sectors = sectors;
	}
	 
	public void setStep(int step) {
		this.step = step;
		redraw();
	}

	public UbiPieMeter(Composite parent, int style) {
		super(parent, style | SWT.NO_FOCUS | SWT.NO_SCROLL | SWT.DOUBLE_BUFFERED);

		addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent e) {
				
				Color oldBG = e.gc.getBackground();
				Color oldFG = e.gc.getForeground();
				
				e.gc.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY));
				e.gc.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY));

				e.gc.fillOval(
					e.x,
					e.y,
					e.width,
					e.height
				);
				
				/*
				List<Float> pts = new ArrayList<Float>();
				
				int w = getBounds().width;
				int h = getBounds().height;
				
				pts.add(new Float(w/2));
				pts.add(new Float(h/2));
				
				e.gc.setBackground(ColorConstants.white);
				e.gc.setForeground(ColorConstants.white);

				org.eclipse.swt.graphics.Rectangle r = getBounds();
				float ratio = step / sectors;
				float gap = 360f / sectors;
				for (float t = 90f; t < 90f + (ratio * 360f); t+=gap) {
					double rad	= Math.toRadians(t);
					double dX	= (w / 2 + 3) * Math.cos(rad);
					double dY	= (h / 2 + 3) * Math.sin(rad);
					//for (float precision = 0f; precision<gap; precision++) {
					//	double rad2	= Math.toRadians(t);
					//	double dX2	= (w / 2 + 3) * Math.cos(rad2);
					//	double dY2	= (h / 2 + 3) * Math.sin(rad2);
						pts.add(new Float(dX));
						pts.add(new Float(dY));
					//}
				}
				PathData pData =  new PathData();
				float[] points = new float[pts.size()];
				int idx = 0;
				for (Float f : pts) {
					points[idx] = f.floatValue();
					idx++;
				}
				pData.points = points;
				Path path = new Path(Display.getDefault(), pData);
				
				e.gc.fillPath(path);
				path.dispose();
*/
				e.gc.setLineWidth(1);
				e.gc.setBackground(oldBG);
				e.gc.setForeground(oldFG);
				
			}
		});
	}
	
}
