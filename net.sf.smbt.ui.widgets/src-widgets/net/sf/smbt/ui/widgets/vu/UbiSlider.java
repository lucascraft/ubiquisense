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
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class UbiSlider extends UbiWidget {
	public final static int STEP 	= 3;
	private int direction			= SWT.HORIZONTAL;
	private int thickness 			= STEP * 5;
	private int response 			= ABSOLUTE_RESPONSE;
	private Color veryDark;
	private Color mainLevelColor, leftLevelColor, rightLevelColor;
	
	public final static int ABSOLUTE_RESPONSE 		= 0x00, RELATIVE_RESPONSE 		= 0x01;
	public final static int UBI_SLIDER_RICH_LOOK 	= 0x00, UBI_SLIDER_MINIMAL_LOOK = 0x01;
	
	private Cursor normalCursor, clickableCursor;
	
	private List<UbiSelectionListener> listeners;
	
	public void addSelectionListener(UbiSelectionListener listener) {
		listeners.add(listener);
	}
	
	public void removeSelectionListener(UbiSelectionListener listener) {
		listeners.remove(listener);
	}
	
	public void setRightLevelColor(Color rightLevelColor) {
		this.rightLevelColor = rightLevelColor;
	}
	
	public void setLeftLevelColor(Color leftLevelColor) {
		this.leftLevelColor = leftLevelColor;
	}
	
	public void setMainLevelColor(Color mainLevelColor) {
		this.mainLevelColor = mainLevelColor;
	}
	 
	public int getResponse() {
		return response;
	}
	
	public Color getVeryDark() {
		return veryDark;
	}
	
	class MeterCaret {
		public MeterCaret() {
			rect	= new Rectangle(0, 0, thickness, STEP);
			lRect	= new Rectangle(0, 0, thickness / 2, STEP);
			rRect	= new Rectangle(0, thickness / 2, thickness / 2, STEP);
		}
		public Rectangle rect, lRect, rRect;
		void compute() {
			float ratio 	= globallevel / max;
			float lRatio 	= lLevel / max;
			float rRatio 	= rLevel / max;
			int width		= direction == SWT.HORIZONTAL ? getBounds().width : getBounds().height;
			int height 		= direction == SWT.HORIZONTAL ? getBounds().height : getBounds().width;
			//
			Float dist = new Float(width) * ratio;
			rect.setSize( 
				direction == SWT.HORIZONTAL ? dist.intValue() - 2 : thickness,  
				direction == SWT.HORIZONTAL ? thickness : dist.intValue() - 2
			);
			rect.setLocation(2, height / 2 - thickness / 2);
			//
			Float lDist = new Float(width) * lRatio;
			lRect.setSize( 
				direction == SWT.HORIZONTAL ? lDist.intValue() - 2 : thickness / 2,  
				direction == SWT.HORIZONTAL ? thickness / 2 : lDist.intValue() - 2
			);
			lRect.setLocation(2, 2);
			//
			Float rDist = new Float(width) * rRatio;
			rRect.setSize( 
				direction == SWT.HORIZONTAL ? rDist.intValue() - 2 : thickness / 2,  
				direction == SWT.HORIZONTAL ? thickness / 2 : rDist.intValue() - 2
			);
			rRect.setLocation(2, height/2 + 1);
		}
	}
	
	class SliderCaret {
		private Image thumb;
		public SliderCaret() {
			rect = new Rectangle(0, 0, 16, 20);
			thumb = ImageUtils.INSTANCE.getSliderThumbH();
			if (direction != SWT.HORIZONTAL) {
				thumb = ImageUtils.INSTANCE.getSliderThumbV();
			}
		}
		public Rectangle rect;
		void compute() {
			float ratio = value / max;
			int dl = direction == SWT.HORIZONTAL ? getBounds().width : getBounds().height;
			if (thumb != null) {
				rect.setSize( 
					direction == SWT.HORIZONTAL ? thumb.getBounds().width : thumb.getBounds().height,  
					direction == SWT.HORIZONTAL ? thumb.getBounds().height : thumb.getBounds().width
				);
			}
			Float dist = new Float(dl-rect.width) * (direction == SWT.HORIZONTAL ? ratio : (1 - ratio));
			dist = dist < 0f ? 0f : dist;
			if (direction == SWT.HORIZONTAL ) {
				rect.setLocation(dist.intValue(), 0);
			} else {
				rect.setLocation(0, dist.intValue());
			}
		}
		public Image getThumb() {
			return thumb;
		}
	}
	
	private float max;
	private float globallevel;
	private float lLevel, rLevel;
	private float value; 
	private boolean synchro;
	private int look;
	
	public float getValue() {
		return value;
	}

	public int getSelection() {
		return new Float(getValue()).intValue();
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
		return globallevel;
	}

	public void setLevel(float level) {
		synchronized(this){ 
			this.globallevel = level;
			bar.compute();
			redraw();
		}
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
	private SliderCaret slider;
	private boolean mouseDown;
	
	public UbiSlider(Composite parent, int style) {
		this(parent, style, false, UBI_SLIDER_MINIMAL_LOOK);
	}
	public UbiSlider(Composite parent, int style, boolean synchro) {
		this(parent, style, synchro, UBI_SLIDER_MINIMAL_LOOK);
	}
	public UbiSlider(Composite parent, int style, boolean synchro, int _look) {
		super(parent, style | SWT.NO_FOCUS | SWT.NO_SCROLL | SWT.DOUBLE_BUFFERED);
		if ((style & SWT.VERTICAL) != 0) direction = SWT.VERTICAL;
		this.look		= _look;
		this.max 		= 100;
		this.value 		= 50;
		this.synchro	= synchro;
		veryDark		= new Color(Display.getDefault(), new RGB(99, 99, 99));
		mainLevelColor	= ColorConstants.lightGreen;
		leftLevelColor	= ColorConstants.white;
		rightLevelColor	= ColorConstants.white;
		listeners 		= new ArrayList<UbiSelectionListener>();
		bar				= new MeterCaret();
		slider			= new SliderCaret();
		normalCursor 	= Display.getDefault().getSystemCursor(SWT.CURSOR_ARROW);
		clickableCursor = Display.getDefault().getSystemCursor(SWT.CURSOR_HAND);
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
				setValue(max * (1f - ratio));
			}
		});
		addMouseMoveListener(new MouseMoveListener() {
			@Override
			public void mouseMove(MouseEvent e) {
				if (Rectangle.SINGLETON.contains(e.x, e.y)) {
					setCursor(clickableCursor);
				} else {
					setCursor(normalCursor);
				}
				if (mouseDown) {
					int w		= direction == SWT.HORIZONTAL ? e.x : e.y;
					int width	= direction == SWT.HORIZONTAL ? getBounds().width : getBounds().height;
					float ratio	= direction == SWT.HORIZONTAL ? (new Float(w) / new Float(width)) : ((new Float(width) - new Float(w)) / new Float(width)) ;
					ratio = ratio < 0f ? 0f : ratio;
					ratio = ratio > 1f ? 1f : ratio;
					setValue(max * ratio);
				}
			}
		});
		addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent e) {
				slider.compute();
				
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
				
				Rectangle rect = slider.rect.getCopy();
				
				e.gc.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_BLACK));
				e.gc.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_BLACK));
				
				if (look == UBI_SLIDER_RICH_LOOK) {
					e.gc.drawImage(slider.getThumb(), rect.x, rect.y);
				} else {
					e.gc.setAlpha(160);
					if (direction == SWT.HORIZONTAL) {
						e.gc.fillRoundRectangle(
							rect.x+1,
							rect.y+1,
							16,
							getBounds().height,
							4,
							4
						);
					} else {
						e.gc.fillRoundRectangle(
							rect.x+1,
							rect.y, 
							getBounds().width, 
							16,
							4,
							4
						);
					}
				}
				e.gc.setBackground(oldBG);
				e.gc.setForeground(oldFG);
			}
		});
	}
	
	
	
	private void drawLevel(PaintEvent e, Rectangle rect) {
		if (globallevel > 0) {
			//Color color = getUbiStyle() == UbiWidget.WIDGET_COLORED_THEME ? 
			//		ColorsUtil.INSTANCE.getColor(globallevel, max) :
			//			Display.getDefault().getSystemColor(SWT.COLOR_WHITE);
			Color color = mainLevelColor;
			e.gc.setBackground(color);
			e.gc.setForeground(color);

			if (direction == SWT.HORIZONTAL) {
				e.gc.fillRoundRectangle(
					rect.x,
					rect.y, 
					rect.width, 
					rect.height,
					4,
					4
				);
			} else {
				e.gc.fillRoundRectangle(
					rect.x,
					getBounds().height - rect.height, 
					rect.width, 
					rect.height,
					4,
					4
				);
			}
		}
	}
	
	private void drawLeftLevel(PaintEvent e, Rectangle rect) {
		if (lLevel > 0) {
			Color color = leftLevelColor;
			e.gc.setBackground(color);
			e.gc.setForeground(color);

			if (direction == SWT.HORIZONTAL) {
				e.gc.fillRoundRectangle(
					rect.x,
					rect.y, 
					rect.width, 
					rect.height,
					4,
					4
				);
			} else {
				e.gc.fillRoundRectangle(
					rect.x,
					getBounds().height - rect.height, 
					rect.width, 
					rect.height,
					4,
					4
				);
			}
		}
	}
	
	private void drawRightLevel(PaintEvent e, Rectangle rect) {
		if (rLevel > 0) {
			Color color = rightLevelColor;
			
			e.gc.setBackground(color);
			e.gc.setForeground(color);

			if (direction == SWT.HORIZONTAL) {
				e.gc.fillRoundRectangle(
					rect.x,
					rect.y + rect.height/2-2, 
					rect.width, 
					rect.height,
					4,
					4
				);
			} else {
				e.gc.fillRoundRectangle(
					rect.x + rect.width+3,
					getBounds().height - rect.height, 
					rect.width, 
					rect.height,
					4,
					4
				);
			}
		}
	}
}
