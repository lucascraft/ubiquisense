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

import java.util.ArrayList;
import java.util.List;

import net.sf.smbt.ui.widgets.common.ColorsUtil;
import net.sf.smbt.ui.widgets.common.ImageUtils;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class UbiRange extends UbiWidget {
	public final static int STEP 	= 3;
	private int direction			= SWT.HORIZONTAL;
	private int thickness 			= STEP * 5;
	
	private Cursor normalCursor, clickableCursor;
	
	private List<UbiSelectionListener> listeners;
	
	public void addSelectionListener(UbiSelectionListener listener) {
		listeners.add(listener);
	}
	
	public void removeSelectionListener(UbiSelectionListener listener) {
		listeners.remove(listener);
	}
	
	class MeterCaret {
		public MeterCaret() {
			rect = new Rectangle(0, 0, thickness, STEP);
		}
		public Rectangle rect;
		void compute() {
			float ratio		= level / max;
			int width		= direction == SWT.HORIZONTAL ? getBounds().width : getBounds().height;
			int height		= direction == SWT.HORIZONTAL ? getBounds().height : getBounds().width;
			
			Float dist = new Float(width) * ratio;
			rect.setSize( 
				direction == SWT.HORIZONTAL ? dist.intValue() - 2 : thickness,  
				direction == SWT.HORIZONTAL ? thickness : dist.intValue() - 2
			);
			rect.setLocation(2, height/2 - thickness/2);
		}
	}
	
	class SliderCaret {
		private Image thumb;
		public SliderCaret() {
			rect = new Rectangle(0, 0, 12, 20);
			thumb = ImageUtils.INSTANCE.getSliderThumbH();
		}
		public Rectangle rect;
		void compute() {
			float ratio = value / max;
			int width = direction == SWT.HORIZONTAL ? getBounds().width : getBounds().height;
			rect.setSize( 
				direction == SWT.HORIZONTAL ? thumb.getBounds().width : thumb.getBounds().height,  
				direction == SWT.HORIZONTAL ? thumb.getBounds().height : thumb.getBounds().width
			);
			Float dist = new Float(width) * ratio;
			rect.setLocation(dist.intValue(), 0);
		}
		public Image getThumb() {
			return thumb;
		}
	}
	
	private float max;
	private float level;
	private float value; 
	private boolean synchro;
	
	public float getValue() {
		return value;
	}
	public int getSelection() {
		return new Float(value).intValue();
	}
	public void setSelection(int val) {
		setValue(new Float(val));
	}
	private void notifySelectionListeners(float value) {
		if (listeners != null && !listeners.isEmpty()) {
			for (UbiSelectionListener l : listeners) {
				if (l instanceof UbiSelectionListener) {
					l.handle();
				}
			}
		}
	}
	public void setValue(float value) {
		synchronized(this) {
			this.value = value;
			if (synchro) {
				setLevel(value);
			}
			notifySelectionListeners(value);
			slider.compute();
			redraw();
		}
	}
	public float getRange() {
		return max;
	}
	public void setMax(float max) {
		synchronized(this){ 
			this.max = max;
			bar.compute();
			redraw();
		}
	}
	public float getLevel() {
		return level;
	}
	public void setLevel(float level) {
		synchronized(this){ 
			this.level = level;
			bar.compute();
			redraw();
		}
	}

	private MeterCaret bar;
	private SliderCaret slider;
	private boolean mouseDown;
	
	public UbiRange(Composite parent, int style) {
		this(parent, style, false);
	}
	
	public UbiRange(Composite parent, int style, boolean synchro) {
		super(parent, style | SWT.NO_FOCUS | SWT.NO_SCROLL | SWT.DOUBLE_BUFFERED);
		listeners		= new ArrayList<UbiSelectionListener>();
		bar				= new MeterCaret();
		slider			= new SliderCaret();
		normalCursor 	= Display.getDefault().getSystemCursor(SWT.CURSOR_ARROW);
		clickableCursor = Display.getDefault().getSystemCursor(SWT.CURSOR_HAND);
		this.synchro 	= synchro;
		addMouseListener(new MouseListener() {
			@Override
			public void mouseUp(MouseEvent e) {
				mouseDown = false;
			}
			@Override
			public void mouseDown(MouseEvent e) {
				mouseDown = true;
			}
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				int w		= direction == SWT.VERTICAL ? e.y : e.x;
				int width	= direction == SWT.HORIZONTAL ? getBounds().width : getBounds().height;
				float ratio	= new Float(w) / new Float(width);
				ratio = ratio < 0f ? 0 : ratio;
				ratio = ratio > 1f ? 1f : ratio;
				setValue(max * ratio);
			}
		});
		addMouseMoveListener(new MouseMoveListener() {
			@Override
			public void mouseMove(MouseEvent e) {
				Rectangle.SINGLETON.setBounds(
					direction == SWT.VERTICAL ? 
						slider.rect.getCopy().transpose() : 
							slider.rect.getCopy()
				); 
				if (Rectangle.SINGLETON.contains(e.x, e.y)) {
					setCursor(clickableCursor);
				} else {
					setCursor(normalCursor);
				}
				if (mouseDown) {
					int w		= direction == SWT.VERTICAL ? e.y : e.x;
					int width	= direction == SWT.HORIZONTAL ? getBounds().width : getBounds().height;
					float ratio	= new Float(w) / new Float(width/*-slider.getThumb().getBounds().width/2*/);
					ratio = ratio < 0f ? 0f : ratio;
					ratio = ratio > 1f ? 1f : ratio;
					setValue(max * ratio);
				}
			}
		});
		addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent e) {
				
				Color oldBG = e.gc.getBackground();
				Color oldFG = e.gc.getForeground();
				
				Rectangle.SINGLETON.setBounds(
					direction == SWT.VERTICAL ? 
						bar.rect.getCopy().transpose() : 
							bar.rect.getCopy()
				); 
				
				e.gc.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY));
				e.gc.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY));

				e.gc.fillRectangle(
					e.x,
					e.y,
					e.width,
					e.height
				);
				
				if (level > 0) {
					Color color = ColorsUtil.INSTANCE.getColor(level, max);
					e.gc.setBackground(color);
					e.gc.setForeground(color);
	
					e.gc.fillRectangle(
						Rectangle.SINGLETON.x,
						Rectangle.SINGLETON.y, 
						Rectangle.SINGLETON.width, 
						Rectangle.SINGLETON.height
					);
				}
				
				e.gc.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY));
				e.gc.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY));

				e.gc.setLineWidth(1);
				
				int x = 0;
				while (x < e.width - STEP*2) {
					e.gc.drawRectangle(x, Rectangle.SINGLETON.y, STEP*2, Rectangle.SINGLETON.height);
					x += STEP*2;
				}

				e.gc.setLineWidth(1);
				
				e.gc.setBackground(ColorConstants.lightGray);
				e.gc.setForeground(ColorConstants.gray);

				Rectangle rect = slider.rect.getCopy().shrink(0, 1); 
				rect.translate(-slider.getThumb().getBounds().width/2, 0);
				Rectangle.SINGLETON.setBounds(
					direction == SWT.VERTICAL ? 
						rect.transpose() : 
							rect
				); 
				
				e.gc.drawImage(slider.getThumb(), Rectangle.SINGLETON.x, Rectangle.SINGLETON.y);
				
				e.gc.setLineWidth(1);
				e.gc.setAlpha(0);

				e.gc.setBackground(oldBG);
				e.gc.setForeground(oldFG);
			}
		});
	}
}
