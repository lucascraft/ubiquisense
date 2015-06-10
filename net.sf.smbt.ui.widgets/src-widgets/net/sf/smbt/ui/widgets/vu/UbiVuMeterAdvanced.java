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

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class UbiVuMeterAdvanced extends UbiWidget {
	public final static int STEP = 3;
	private int direction= SWT.HORIZONTAL;
	private int thickness = STEP * 5;
	 
	 
	class MeterCaret {
		public MeterCaret() {
			rect = new Rectangle(0, 0, thickness, STEP);
			lRect = new Rectangle(0, 0, thickness/2, STEP);
			rRect = new Rectangle(0, thickness/2, thickness/2, STEP);
		}
		public Rectangle rect, lRect, rRect;
		void compute() {
			float ratio = globalLevel / max;
			float lRatio = lLevel / max;
			float rRatio = rLevel / max;
			int width = direction == SWT.HORIZONTAL ? getBounds().width : getBounds().height;
			int height = direction == SWT.HORIZONTAL ? getBounds().height : getBounds().width;
			//
			Float dist = new Float(width) * ratio;
			rect.setSize( 
				direction == SWT.HORIZONTAL ? dist.intValue() - 2 : thickness,  
				direction == SWT.HORIZONTAL ? thickness : dist.intValue() - 2
			);
			rect.setLocation(2, height/2 - thickness/2);
			//
			Float lDist = new Float(width) * lRatio;
			lRect.setSize( 
				direction == SWT.HORIZONTAL ? lDist.intValue() - 2 : thickness/2,  
				direction == SWT.HORIZONTAL ? thickness/2 : lDist.intValue() - 2
			);
			lRect.setLocation(2, 2);
			//
			Float rDist = new Float(width) * rRatio;
			rRect.setSize( 
				direction == SWT.HORIZONTAL ? rDist.intValue() - 2 : thickness/2,  
				direction == SWT.HORIZONTAL ? thickness/2 : rDist.intValue() - 2
			);
			rRect.setLocation(2, height/2 + 1);
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
		synchronized(this){ 
			this.rLevel = level;
			bar.compute();
			redraw();
		}
	}
	
	public float getLLevel() {
		return lLevel;
	}

	public void setLLevel(float level) {
		synchronized(this){ 
			this.lLevel = level;
			bar.compute();
			redraw();
		}
	}

	private MeterCaret bar;
	public UbiVuMeterAdvanced(Composite parent, int style) {
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
				
				drawLevel(e, bar.rect.getCopy());
				drawLeftLevel(e, bar.lRect.getCopy());
				drawRightLevel(e, bar.rRect.getCopy());
				
				e.gc.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY));
				e.gc.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY));

				e.gc.setLineWidth(1);
				
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

				e.gc.setLineWidth(1);
				e.gc.setBackground(oldBG);
				e.gc.setForeground(oldFG);
			}
		});
	}
	
	private void drawLevel(PaintEvent e, Rectangle rect) {
		if (globalLevel > 0) {
			Color color = ColorsUtil.INSTANCE.getColor(globalLevel, max);
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
			Color color = ColorsUtil.INSTANCE.getColor(lLevel, max);
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
	
	private void drawRightLevel(PaintEvent e, Rectangle rect) {
		if (rLevel > 0) {
			Color color = ColorsUtil.INSTANCE.getColor(rLevel, max);
			e.gc.setBackground(color);
			e.gc.setForeground(color);

			if (direction == SWT.HORIZONTAL) {
				e.gc.fillRectangle(
					rect.x,
					rect.y + rect.height/2-1, 
					rect.width, 
					rect.height-1
				);
			} else {
				e.gc.fillRectangle(
					rect.x + rect.width/2-1,
					getBounds().height - rect.height, 
					rect.width-1, 
					rect.height
				);
			}
		}
	}
}
