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

package net.sf.smbt.ui.colors;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class UbiColorPalette extends Canvas {
	
	public final static int[] nms = new int[]{0, 51, 102, 153, 204, 255}; 
	private Color[][][] rgbs = new Color[3][nms.length][nms.length];
	private ConcurrentLinkedQueue<UbiColorPickedListener> listeners;
	
	public void addColorPickedListener(UbiColorPickedListener l) {
		listeners.add(l);
	}
	
	public void removeColorPickedListener(UbiColorPickedListener l) {
		listeners.remove(l);
	}
	
	private void notifyColorPickedListeners(Color c) {
		for (UbiColorPickedListener l : listeners) {
			l.rgbPicked(c.getRGB(), new ArrayList<RGB>(), rgbs);
			l.colorPicked(c, new ArrayList<Color>(), rgbs);
		}
	}
	
	public UbiColorPalette(Composite parent) {
		super(parent, SWT.NONE);
		listeners = new ConcurrentLinkedQueue<UbiColorPickedListener>();
		for (int idx=0;idx<3;idx++) {
			for (int x=0;x<nms.length;x++) {
				for (int y=0;y<nms.length;y++) {
					int c = y-x>0 ? y-x : 0;
					if (idx == 0) {			// R
						rgbs[idx][x][y] = new Color(Display.getDefault(), new RGB(nms[x], nms[y], nms[c]));
					} else if (idx == 1) {	// G
						rgbs[idx][x][y] = new Color(Display.getDefault(), new RGB(nms[c], nms[x], nms[y]));
					} else {				// B
						rgbs[idx][x][y] = new Color(Display.getDefault(), new RGB(nms[y], nms[c], nms[x]));
					}
				}
			}
		}
		addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent e) {
				int w = getClientArea().width;
				int h = getClientArea().height;
				double d = w > h ? h : w;
				d = d / (nms.length * 3);
				for (int idx=0;idx<3;idx++) {
					for (int x=0;x<nms.length;x++) {
						for (int y=0;y<nms.length;y++) {
							Color c = rgbs[idx][x][y];
							if (c != null && !c.isDisposed()) {
								e.gc.setForeground(c);
								e.gc.setBackground(c);
							}
							e.gc.fillRectangle(
								(int) (((idx*nms.length)+x)*d), 
								(int) (y*d), 
								(int) d, 
								(int) d
							);
						}
					}
				}
			}
		});
		addControlListener(new ControlListener() {
			@Override
			public void controlResized(ControlEvent e) {
				redraw();
			}
			@Override
			public void controlMoved(ControlEvent e) {
				redraw();
			}
		});
		addMouseListener(new MouseListener() {
			@Override
			public void mouseUp(MouseEvent e) {
				int w = getClientArea().width;
				int h = getClientArea().height;
				double d = w > h ? h : w;
				d = d / (nms.length * 3);
				for (int idx=0;idx<3;idx++) {
					for (int x=0;x<nms.length;x++) {
						for (int y=0;y<nms.length;y++) {
							Rectangle r = Rectangle.SINGLETON.setBounds(
								(int) (((idx*nms.length)+x)*d), 
								(int) (y*d), 
								(int) d, 
								(int) d
							);
							if(r.contains(e.x, e.y)) {
								notifyColorPickedListeners(rgbs[idx][x][y]);
								break;
							}
						}
					}
				}
			}
			@Override
			public void mouseDown(MouseEvent e) {}
			@Override
			public void mouseDoubleClick(MouseEvent e) {}
		});
	}
}
