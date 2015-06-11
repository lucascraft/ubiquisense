/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2011 - 2015, Lucas Bigeardel
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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Path;
import org.eclipse.swt.graphics.PathData;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class UbiOscilloscope extends Canvas implements IUbiWidget {
	private volatile float[] array;
	private int size = 500;
	private float max;
	private class Pt {
		public float x, y;
		public Pt(float _x, float _y) {
			x = _x;
			y = _y;
		}
	}
	public UbiOscilloscope(Composite parent, int size) {
		this(parent, size, -1);
	}
	public float getMax() {
		return max;
	}
	public UbiOscilloscope(Composite parent, int size, final float max) {
		super(parent, SWT.DOUBLE_BUFFERED);
		this.max = max;
		this.size = size;
		setLayout(GridLayoutFactory.fillDefaults().create());
		setLayoutData(GridDataFactory.fillDefaults().grab(true,true).create());
		array = new float[size];
		addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent e) {
				synchronized(array) {
					if (array != null && array.length>0) {
						float fmin=array[0], fmax=array[0];
						Rectangle inside = new Rectangle(e.x+1,e.y+1,e.width-2,e.height-2);
						
						for (int i=0; i<array.length; i++) {
							if (fmin>array[i]) { fmin=array[i]; }
							if (fmax<array[i]) { fmax=array[i]; }
						}
						List<Pt> points = new ArrayList<Pt>();
						for (int i=0; i<array.length; i++) {
							float w = inside.width;
							float l = array.length;
							float x = i * ( w / l);
							float y = computeY(inside.height, fmin, fmax, array[i]);
							points.add(new Pt(x, y));
						}
						drawPath(e, points);
						drawLabels(e, fmin, fmax, points.get(0));
					}
				}
			}
		});
	}
		
	private void drawLabels(PaintEvent e, float fmin, float fmax, Pt p) {
		String lmax = ""+fmax;
		String lmin = ""+fmin;
		//org.eclipse.swt.graphics.Point fmaxExt = e.gc.textExtent(lmax);
		org.eclipse.swt.graphics.Point fminExt = e.gc.textExtent(lmin);
		
		e.gc.drawString(lmax, 0, 0);
		e.gc.drawString(""+lmin, 0, e.x+e.height-fminExt.y);
	}

	
	private void drawPath(PaintEvent e, List<Pt> points) {
		if (points != null && !points.isEmpty() ) {
			PathData pData = new PathData();

			//
			// points
			//
			int ptLength = 2 * (2 + points.size());
			float[] pts		= new float[ptLength];
			pts[0]		= 0;
			pts[1]		= 0;
			int i = 2;
			for (Pt pt : points) {
				pts[i++] = pt.x;
				pts[i++] = pt.y;
			}
			pts[ptLength - 2] = e.width;
			pts[ptLength - 1] = 0;
			
			//
			// types
			//
			byte[] types	= new byte[2 + points.size()];
			types[0]	= SWT.PATH_MOVE_TO;
			int j = 1;
			for (Pt pt : points) {
				types[j++]		= SWT.PATH_LINE_TO;
			}
			types[1 + points.size()] = SWT.PATH_LINE_TO;
			
			pData.types = types;
			pData.points = pts;
			
			Path path = new Path(Display.getDefault(), pData);
			
			e.gc.drawPath(path);
		}

	}
	private int computeY(int insideHeight, float _min, float _max, float _value) {
		float ratio = (_value - _min) / (_max - _min);
		return new Float((1f - ratio) * insideHeight).intValue();
	}
	public synchronized void setValues(float[] values) {
		if (values != null && values.length>0) {
			synchronized(array) {
				if (array.length != values.length) {
					array = new float[values.length];
					size = array.length;
				}
				System.arraycopy(values, 0, array, 0, values.length);
			}
			refresh();
		}
	}
	
	public synchronized void pushValue(float val) {
		synchronized(array) {
			System.arraycopy(array, 1, array, 0, size-1);
			array[size-1] = val;
			if (Platform.inDebugMode()) {
				System.out.println("-- val : " + val);
			}
			refresh();
		}
	}
	
	public void refresh() {
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				redraw();
			}
		});
	}
	/*
	private void drawTriangle(GC gc, int x, int y, int direction) {
		Point head, p2, p3;
		head = new Point(x, y);
		switch (direction) {
			case Triangle.SOUTH:
				p2 = new Point(x + 4, y - 8);
				p3 = new Point(x - 4, y - 8);
				break;
			default:
				p2 = new Point(x + 4, y + 8);
				p3 = new Point(x - 4, y + 8);
				break;
		}
		
		PathData pData = new PathData();
		byte[] types	= new byte[3];
		float[] pts		= new float[6];
		
		types[0]		= SWT.PATH_MOVE_TO;
		pts[0] 			= head.x;
		pts[1] 			= head.y ;
		
		types[1]		= SWT.PATH_LINE_TO;
		pts[2] 			= p2.x;
		pts[3] 			= p2.y;
		
		types[2]		= SWT.PATH_LINE_TO;
		pts[4] 			= p3.x;
		pts[5] 			= p3.y;
			
		pData.types 	= types;
		pData.points 	= pts;

		Path path = new Path(Display.getDefault(), pData);
		gc.fillPath(path);
	}
	*/
}
