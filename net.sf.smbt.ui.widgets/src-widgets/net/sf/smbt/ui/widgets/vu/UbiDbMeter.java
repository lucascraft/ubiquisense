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

import net.sf.smbt.ui.widgets.common.ImageUtils;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class UbiDbMeter extends CLabel implements IUbiWidget {
	class MeterConsole {
		private Image console;
		public MeterConsole() {
			rect = new Rectangle(0, 0, 120, 120);
			console = ImageUtils.INSTANCE.getDBMeter1();
		}
		public Image getConsole() {
			return console;
		}
		public Rectangle rect;
		void compute() {
			//float ratio = level / max;
			int width = getClientArea().width ;
			int height = getClientArea().height;
			rect.setSize( 
				width,  
				height
			);
			rect.setLocation(2, height/2);
		}
	}
	private float max;
	private float level;
	public float getRange() {
		return max;
	}

	public void setMax(float max) {
		this.max = max;
		bar.compute();
		redraw();
	}

	public float getLevel() {
		return level;
	}

	public void setLevel(float level) {
		this.level = level;
		bar.compute();
		redraw();
	}

	private MeterConsole bar;
	public UbiDbMeter(Composite parent, int style) {
		super(parent, style | SWT.NO_FOCUS | SWT.NO_SCROLL | SWT.DOUBLE_BUFFERED);
		bar = new MeterConsole();
		addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent e) {
				
				Color oldBG = e.gc.getBackground();
				Color oldFG = e.gc.getForeground();
				
				e.gc.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY));
				e.gc.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY));

				e.gc.drawImage(
					bar.getConsole(), 
					0, 
					0
				);
				
				e.gc.setBackground(ColorConstants.black);
				e.gc.setForeground(ColorConstants.black);
				
				if (level > 0) {
	
					int x = getClientArea().width /2;
					int y = getClientArea().height - 35;
					
					float ratio = level / max;
					float angle = 190f + (140f * ratio);
					
					double x2 = 80f * Math.cos(new Double(Math.toRadians(angle)));
					double y2 = 80f * Math.sin(new Double(Math.toRadians(angle)));
					
					e.gc.drawLine(x, y, x + (int) x2, y + (int) y2 );
				}
				
				e.gc.setLineWidth(1);
				
				e.gc.setBackground(oldBG);
				e.gc.setForeground(oldFG);
			}
		});
	}
}
