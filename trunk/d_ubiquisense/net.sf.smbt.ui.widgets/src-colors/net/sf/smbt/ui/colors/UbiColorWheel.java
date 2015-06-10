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

import net.sf.smbt.ui.widgets.common.ColorsUtil;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.events.DragDetectEvent;
import org.eclipse.swt.events.DragDetectListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseTrackListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class UbiColorWheel extends Canvas {
	private ConcurrentLinkedQueue<UbiWheelColorPickedListener> listeners;
	private ConcurrentLinkedQueue<UbiWheelColorBrowsedListener> bListeners;
	
	private Image wheelImg;
	private float brightness = 1f;
	private Point cursorPosition;
	boolean drag = false;
	public void addColorPickedListener(UbiWheelColorPickedListener l) {
		listeners.add(l);
	}
	public void addColorBrowsedListener(UbiWheelColorBrowsedListener l) {
		bListeners.add(l);
	}
	public float getBrightness() {
		return brightness;
	}
	public void setBrightness(float brightness) {
		this.brightness = brightness;
		redraw();
	}
	public void removeColorPickedListener(UbiWheelColorPickedListener l) {
		listeners.remove(l);
	}
	public void removeColorBrowsedListener(UbiWheelColorBrowsedListener l) {
		bListeners.remove(l);
	}
	public void notifyColorPickedListeners(RGB rgb) {
		for (UbiWheelColorPickedListener l : listeners) {
			l.rgbPicked(rgb, new ArrayList<RGB>());
		}
	}
	public void notifyColorBrowsedListeners(RGB rgb) {
		for (UbiWheelColorBrowsedListener l : bListeners) {
			l.rgbBrowsed(rgb);
		}
	}
	private RGB lastRGB;
	private void checkCursorPosition(int xt, int yt, int w, int h) {
		if (wheelImg != null) {
			int xPix = cursorPosition.x-xt;
			int yPix = cursorPosition.y-yt;
			if (xPix<wheelImg.getBounds().width && yPix < wheelImg.getBounds().height) {
				try {
					int pixel = wheelImg.getImageData().getPixel(xPix, yPix);
					RGB rgb = wheelImg.getImageData().palette.getRGB(pixel);
					if (rgb != null) {
						 RGB bgRgb = ColorsUtil.BG.getRGB();
						 lastRGB = rgb;
						 if (bgRgb.red != rgb.red && bgRgb.green != rgb.green && bgRgb.blue != rgb.blue) {
							 notifyColorBrowsedListeners(rgb);
						 }
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	private Image getWheelImage(int w, int h, float b) {
		String key = w+"x"+h+"-"+new Float(b*100).intValue();
		if (ColorsUtil.INSTANCE.getWheelImagesMap().containsKey(key)) {
			return wheelImg = ColorsUtil.INSTANCE.getWheelImagesMap().get(key);
		}
		int d  = w > h ? h : w;
		int r  = d / 2;
		int cx = (w / 2);
		int cy = (h / 2);
		
		Image wheelImage = new Image(Display.getDefault(), w, h);
		GC gc = new GC(wheelImage);
		gc.setForeground(ColorsUtil.BG);
		gc.setBackground(ColorsUtil.BG);
		gc.fillRectangle(0, 0, w, h);
		for (float theta=0f;theta<360f;theta+=.75f) {
			for (float dt=0;dt<r;dt+=2) {
				double a  = Math.toRadians(theta);
				double x  = (0 + dt) * Math.cos(a);
				double y  = (0 + dt) * Math.sin(a);
				float hue = theta / 360f;
				
				float saturation	= new Double(dt/r).floatValue();

				saturation = saturation < 0f ? 0f : saturation; 
				saturation = saturation > 1f ? 1f : saturation; 
				
				String hu = String.format("%.2f", hue*360);
				String s  = String.format("%.2f", saturation);
				String br = String.format("%.2f", brightness);
				
				Color color = ColorsUtil.INSTANCE.getHsbColor(hu+"_"+s+"_"+br);
				gc.setForeground(color);
				gc.setBackground(color);
				gc.drawRectangle((int)(cx + x), (int)(cy + y), 2, 2);
			}
		}
		gc.setAntialias(SWT.ON);
		gc.setForeground(ColorsUtil.BG);
		gc.setLineWidth(8);
		gc.drawOval(0, 0, w, h);

		wheelImg = ColorsUtil.INSTANCE.getWheelImagesMap().put(key, wheelImage);
		
		gc.dispose();
		return wheelImage;
	}
	public double dist(double x1, double y1, double x2, double y2) {
	  return Math.sqrt (Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}
	/**
	 * 
	 * @param rx [-1 .. 1]
	 * @param ry [-1 .. 1]
	 */
	public void setCursorPosition(float rx, float ry) {
		if (rx < -1 || rx > 1 || ry < -1 || ry > 1) {
			throw new java.lang.UnsupportedOperationException("color x/y bounds ratio should be [-1..1]");
		}
		if (wheelImg != null) {
			int w = wheelImg.getBounds().width;
			int h = wheelImg.getBounds().height;
			
			cursorPosition.x = new Float((w + (rx * w)) / 2).intValue();
			cursorPosition.y = new Float((h + (ry * h)) / 2).intValue();
			
			redraw();
			
			if (cursorPosition.x < w && cursorPosition.y < h) {
				try {
					int pixel = wheelImg.getImageData().getPixel(cursorPosition.x, cursorPosition.y);
					RGB rgb = wheelImg.getImageData().palette.getRGB(pixel);
					if (rgb != null) {
						 RGB bgRgb = ColorsUtil.BG.getRGB();
						 lastRGB = rgb;
						 if (bgRgb.red != rgb.red && bgRgb.green != rgb.green && bgRgb.blue != rgb.blue) {
							 notifyColorBrowsedListeners(rgb);
						 }
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	public UbiColorWheel(Composite parent) {
		super(parent, SWT.NONE);
		listeners = new ConcurrentLinkedQueue<UbiWheelColorPickedListener>();
		bListeners = new ConcurrentLinkedQueue<UbiWheelColorBrowsedListener>();
		addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent e) {
				Image img = getWheelImage(200, 200, brightness);
				int w = img.getBounds().width;
				int h = img.getBounds().height;

				if (cursorPosition == null) {
					cursorPosition = new Point(e.width/2, e.height/2);
				}
				e.gc.drawImage(img, e.width/2 -w/2, e.height/2 - h/2);
				checkCursorPosition(e.width/2 -w/2, e.height/2 - h/2, w, h);
				e.gc.setForeground(ColorsUtil.BG);
				e.gc.setLineWidth(2);
				e.gc.drawOval(cursorPosition.x-3, cursorPosition.y-3, 6, 6);
				e.gc.setLineWidth(1);
				e.gc.setForeground(ColorConstants.lightGray);
				e.gc.drawOval(cursorPosition.x-2, cursorPosition.y-2, 4, 4);
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
		addMouseMoveListener(new MouseMoveListener() {
			@Override
			public void mouseMove(MouseEvent e) {
				if (drag) {
					int w = getBounds().width;
					int h = getBounds().height;
					cursorPosition.x = e.x;
					cursorPosition.y = e.y;
					
					double dist = dist(e.x, e.y, w/2, h/2);
					if (dist < w/2) {
						checkCursorPosition(0, 0, w, h);
					}
				}
				redraw();
			}
		});
		addDragDetectListener(new DragDetectListener() {
			@Override
			public void dragDetected(DragDetectEvent e) {
				drag = true;
			}
		});
		addMouseListener(new MouseListener() {
			@Override
			public void mouseUp(MouseEvent e) {
				drag = false;
			}
			@Override
			public void mouseDown(MouseEvent e) {
				drag = false;
				int w = getBounds().width;
				int h = getBounds().height;
				cursorPosition.x = e.x;
				cursorPosition.y = e.y;
				checkCursorPosition(0, 0, w, h);
				notifyColorPickedListeners(lastRGB);
				notifyColorBrowsedListeners(lastRGB);
				redraw();
			}
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				drag = false;
				int w = getBounds().width;
				int h = getBounds().height;
				cursorPosition.x = e.x;
				cursorPosition.y = e.y;
				checkCursorPosition(0, 0, w, h);
				notifyColorPickedListeners(lastRGB);
				redraw();
			}
		});
		addMouseTrackListener(new MouseTrackListener() {
			@Override
			public void mouseHover(MouseEvent e) {}
			@Override
			public void mouseExit(MouseEvent e) {}
			@Override
			public void mouseEnter(MouseEvent e) {}
		});
	}
}
