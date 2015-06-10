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

import net.sf.smbt.ui.widgets.common.ColorsUtil;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class UbiVuMeter extends UbiWidget {
	public final static int STEP	= 3;
	private int direction			= SWT.HORIZONTAL;
	private int thickness 			= STEP * 5;
	 
	class MeterCaret {
		public MeterCaret() {
			rect	= new Rectangle(0, 0, thickness, STEP);
			lRect 	= new Rectangle(0, 0, thickness/2, STEP);
			rRect 	= new Rectangle(0, thickness/2, thickness/2, STEP);
		}
		public Rectangle rect, lRect, rRect;
		void compute() {
			float ratio		= globalLevel / max;
			float lRatio 	= lLevel / max;
			float rRatio 	= rLevel / max;
			int width 		= direction == SWT.HORIZONTAL ? getBounds().width : getBounds().height;
			int height 		= direction == SWT.HORIZONTAL ? getBounds().height : getBounds().width;
			//
			int dist 		= new Float(width * ratio).intValue();
			rect.setBounds( 
				2, height/2 - thickness/2,
				direction == SWT.HORIZONTAL ? dist - 2 : thickness,  
				direction == SWT.HORIZONTAL ? thickness : dist - 2
			);
			//
			int lDist = new Float(width * lRatio).intValue();
			lRect.setBounds( 
				2, 2,
				direction == SWT.HORIZONTAL ? lDist - 2 : thickness/2,  
				direction == SWT.HORIZONTAL ? thickness/2 : lDist - 2
			);
			//
			int rDist = new Float(width * rRatio).intValue();
			rRect.setBounds( 
				2, height/2 + 1,
				direction == SWT.HORIZONTAL ? rDist - 2 : thickness/2,  
				direction == SWT.HORIZONTAL ? thickness/2 : rDist - 2
			);
		}
	}
	
	private float max;
	private float globalLevel, rLevel, lLevel;
	public float getRange() {
		return max;
	}
	public void setMax(float max) {
		this.max = max;
		bar.compute();
		redraw();
	}
	public float getLevel() {
		return globalLevel;
	}
	public void setLevel(float level) {
		this.globalLevel = level;
		bar.compute();
		redraw();
	}
	public float getRLevel() {
		return rLevel;
	}
	public void setRLevel(float level) {
			this.rLevel = level;
			bar.compute();
	}
	public float getLLevel() {
		return lLevel;
	}
	public void setLLevel(float level) {
			this.lLevel = level;
			bar.compute();
	}
	private MeterCaret bar;
	public UbiVuMeter(Composite parent, int style) {
		super(parent, style | SWT.NO_FOCUS | SWT.NO_SCROLL | SWT.DOUBLE_BUFFERED);
		if ((style & SWT.VERTICAL) != 0) direction = SWT.VERTICAL;

		bar = new MeterCaret();
		addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent e) {
				
				Color oldBG = e.gc.getBackground();
				Color oldFG = e.gc.getForeground();
				
				e.gc.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY));
				e.gc.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY));

				e.gc.fillRectangle(
					e.x,
					e.y,
					e.width,
					e.height
				);
				e.gc.setBackground(ColorsUtil.BG);
				e.gc.setForeground(ColorsUtil.BG);
				e.gc.drawRectangle(
					e.x,
					e.y,
					e.width,
					e.height 
				);
				e.gc.drawRoundRectangle(
					e.x,
					e.y,
					e.width,
					e.height,
					4,
					4
				);
				
				drawLevel(e, bar.rect.getCopy());
				drawLeftLevel(e, bar.lRect.getCopy());
				drawRightLevel(e, bar.rRect.getCopy());
				
				e.gc.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY));
				e.gc.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY));

				e.gc.setLineWidth(1);
				
				/*
				if (direction == SWT.HORIZONTAL) {
					int x = 0;
					while (x < e.width - STEP*2) {
						e.gc.drawRectangle(x, bar.rect.getCopy().y, STEP*2, Rectangle.SINGLETON.height);
						x += STEP*2;
					}
				} else {
					int y = e.height;
					while (y > 0) {
						e.gc.drawRectangle(bar.rect.getCopy().x, y, Rectangle.SINGLETON.width, STEP*2);
						y -= STEP*2;
					}
				}
				*/

				e.gc.setLineWidth(1);
				e.gc.setBackground(oldBG);
				e.gc.setForeground(oldFG);
			}
		});
	}
	
	private void drawLevel(PaintEvent e, Rectangle rect) {
		if (globalLevel > 0) {
//			Color color = getUbiStyle() == UbiWidget.WIDGET_COLORED_THEME ? 
//					ColorsUtil.INSTANCE.getColor(globalLevel, max) :
//						Display.getDefault().getSystemColor(SWT.COLOR_WHITE);
			Color color = Display.getDefault().getSystemColor(SWT.COLOR_WHITE);
			e.gc.setBackground(color);
			e.gc.setForeground(color);

			if (direction == SWT.HORIZONTAL) {
				e.gc.fillRectangle(
					rect.x,
					rect.y, 
					rect.width, 
					rect.height
				);
			} else {
				e.gc.fillRectangle(
					rect.x,
					getBounds().height - rect.height, 
					rect.width, 
					rect.height
				);
			}
		}
	}
	
	private void drawLeftLevel(PaintEvent e, Rectangle rect) {
		if (lLevel > 0) {
			Color color = ColorConstants.white; //ColorsUtil.INSTANCE.getColor(lLevel, max);
			e.gc.setBackground(color);
			e.gc.setForeground(color);

			if (direction == SWT.HORIZONTAL) {
				e.gc.fillRectangle(
					rect.x,
					rect.y, 
					rect.width-1, 
					rect.height
				);
			} else {
				e.gc.fillRectangle(
					rect.x,
					getBounds().height - rect.height, 
					rect.width, 
					rect.height-1
				);
			}
		}
	}
	
	private void drawRightLevel(PaintEvent e, Rectangle rect) {
		if (rLevel > 0) {
			Color color = ColorConstants.white; //ColorsUtil.INSTANCE.getColor(rLevel, max);
			e.gc.setBackground(color);
			e.gc.setForeground(color);

			if (direction == SWT.HORIZONTAL) {
				e.gc.fillRectangle(
					rect.x,
					rect.y + rect.height/2-2, 
					rect.width, 
					rect.height
				);
			} else {
				e.gc.fillRectangle(
					rect.x + rect.width+3,
					getBounds().height - rect.height, 
					rect.width, 
					rect.height
				);
			}
		}
	}
}
