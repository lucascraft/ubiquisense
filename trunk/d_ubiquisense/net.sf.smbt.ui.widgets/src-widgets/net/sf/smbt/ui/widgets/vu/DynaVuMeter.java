/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2008 - 2010, Lucas Bigeardel
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

import java.util.UUID;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.progress.UIJob;

public class DynaVuMeter extends UbiWidget {
	volatile long lastVal;
	volatile float level; // 0.0f -> 1.0f
	
	private int min, max, step;
	
	public int getMax() {
		return max;
	}
	public int getMin() {
		return min;
	}
	public int getStep() {
		return step;
	}
	class MeterCaret {
		public MeterCaret() {
			rect = new Rectangle(0, 0, thickness, 3);
		}
		public Rectangle rect;
	}
	class RelaxerJob extends UIJob {
		public RelaxerJob() {
			super("VuMeter_" + UUID.randomUUID().toString());
			setPriority(UIJob.SHORT);
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			doRelax();
			schedule();
			return Status.OK_STATUS;
		}
	}
	private int direction;
	private int thickness = 5;
	//private int gap = 1;
	private int DEFAULT_WIDTH = 100, DEFAULT_HEIGHT = 100;
	private MeterCaret bar;
	public DynaVuMeter(Composite parent, int style) {
		super(parent, style | SWT.NO_FOCUS);
		bar = new MeterCaret();
		new RelaxerJob().schedule();
		
		addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent e) {
				GC gc = e.gc;
				Rectangle.SINGLETON.setBounds(
					direction == SWT.HORIZONTAL ? 
						bar.rect.getCopy().transpose() : 
							bar.rect.getCopy()
				); 
				gc.fillRectangle(
					Rectangle.SINGLETON.x,
					Rectangle.SINGLETON.y, 
					Rectangle.SINGLETON.width, 
					Rectangle.SINGLETON.height
				);
			}
		});
	}
	
	public synchronized void setSettings(int min, int max, int step) {
		this.min	= min; 
		this.max	= max;
		this.step	= step;
		redraw();
	}
	
	public synchronized void setLevel(float level) {
		this.level = level;
		redraw();
	}
	
	private synchronized void doRelax() {
		//float dist = (float) max - (float) min;
		bar.rect.x		= 0;
		bar.rect.y		= 0;
		bar.rect.width	= getBounds().width > getBounds().height ? (int) (((float) getBounds().width) * level) : (int) (((float) getBounds().height) * level) ;
		bar.rect.height = thickness;
		
		// compute the caret kinematics here
	}
	
	public Point computeSize (int wHint, int hHint, boolean changed) {
		checkWidget();
		int width = DEFAULT_WIDTH, height = DEFAULT_HEIGHT;
		if ((getStyle() & SWT.HORIZONTAL) != 0) {		
			direction = SWT.HORIZONTAL;
			height = (int)Math.ceil(thickness);
			width = height * 10;
		} else {
			direction = SWT.VERTICAL;
			width = (int)Math.ceil(thickness);
			height = width * 10;
		}
		if (wHint != SWT.DEFAULT) width = wHint;
		if (hHint != SWT.DEFAULT) height = hHint;
		return new Point (width, height);
	}
}
