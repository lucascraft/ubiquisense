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

import java.util.concurrent.ConcurrentLinkedQueue;

import net.sf.smbt.ui.widgets.common.ColorsUtil;
import net.sf.smbt.ui.widgets.common.ImageUtils;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseWheelListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Transform;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;

/**
 * Knob can get different kinds :
 * <ul>
 * <li>NORMAL
 * <li>CENTERED
 * <li>INVERTED
 * <li>INFINITE
 * </ul>
 * @author lucas
 *
 */
public class UbiKnob extends UbiWidget  {
	private int direction= SWT.HORIZONTAL;
	
	public final static int NORMAL	 = 0;
	public final static int CENTERED = 1;
	public final static int INVERTED = 2;
	
	public final static int INFINITE = 4;
	
	private Cursor normalCursor, clickableCursor;
	private float offset;
//	private boolean focus;
	
	@SuppressWarnings("unused")
	private float initialValue;
	private int initialY;

	private ConcurrentLinkedQueue<UbiSelectionListener> listeners;
	private ConcurrentLinkedQueue<UbiFocusListener> focusListeners;
	
	public void addSelectionListener(UbiSelectionListener listener) {
		listeners.add(listener);
	}
	
	public void removeSelectionListener(UbiSelectionListener listener) {
		listeners.remove(listener);
	}
	
	public void addFocusListener(UbiFocusListener listener) {
		focusListeners.add(listener);
	}
	
	public void removeFocusListener(UbiFocusListener listener) {
		focusListeners.remove(listener);
	}

	class CentralKnob {
		private Image knob;
		public Image getKnob() {
			return knob;
		}
		public CentralKnob(String knobImage) {
			rect = new Rectangle(0, 0, 28, 28);
			knob = ImageUtils.INSTANCE.getImage(knobImage);
		}
		public Rectangle rect;
		void compute() {
			int width	= direction == SWT.HORIZONTAL ? getClientArea().width	: getClientArea().height;
			int height	= direction == SWT.HORIZONTAL ? getClientArea().height	: getClientArea().width;
			rect.setSize( 
				width,  
				height
			);
			rect.setLocation(width/2 - rect.width/2, height/2 - rect.height/2);
		}
	}
	
	class OuterCrown {
		public OuterCrown() {
			rect = new Rectangle(0, 0, 28, 28);
		}
		public Rectangle rect;
		void compute() {
			int width	= direction == SWT.HORIZONTAL ? getBounds().width : getBounds().height;
			int height	= direction == SWT.HORIZONTAL ? getBounds().height : getBounds().width;
			rect.setSize( 
				width,  
				height
			);
			rect.setLocation(width/2 - rect.width/2, height/2 - rect.height/2);
		}
	}
	
	private float max;
	private float min;
	private float value;
	private float level;
	private boolean synchro;
	
	private int look;
	
	public int getLook() {
		return look;
	}
	
	public void setLook(int look) {
		this.look = look;
	}

	public float getRange() {
		return max;
	}

	public float getMax() {
		return max;
	}

	public float getMin() {
		return min;
	}

	public int getSelection() {
		return new Float(value).intValue();
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
	
	public void setValue(float value, boolean redraw) {
		setValue(value, true, redraw);
	}
	
	public void setValue(float value) {
		setValue(value, true, true);
	}
	
	public void setValue(float value, boolean notify, boolean redraw) {
		this.value = value;
		if (redraw) {
			redraw();
		}
		if (synchro) {
			setLevel(value);
		}
		knob.compute();
		crown.compute();
		setFocus(true, notify);
		if (notify) {
			notifySelectionListeners(value);
		}
	}

	public float getValue() {
		return value;
	}
	
	public void setSelection(int val) {
		setValue(new Float(val));
	}

	public void setMin(float min) {
		this.min = min;
		knob.compute();
		crown.compute();
		redraw();
	}

	public void setMax(float max) {
		this.max = max;
		knob.compute();
		crown.compute();
		redraw();
	}

	public float getLevel() {
		return level;
	}

	public void setLevel(float level) {
		this.level = level;
		knob.compute();
		crown.compute();
		redraw();
	}

	private CentralKnob knob;
	private OuterCrown crown;
	private boolean mouseDown;
	
	private void notifyFocus(boolean focus) {
		for (UbiFocusListener l : focusListeners) {
			if (focus) {
				l.handleFocus(getData());
			} else {
				l.handleUnfocus(getData());
			}
		}
	}
	

	//
	// Ctor
	//
	
	public UbiKnob(Composite parent, int style, boolean synchro, int look, String knobImage) {
		super(parent, style | SWT.NO_FOCUS | SWT.NO_SCROLL | SWT.DOUBLE_BUFFERED);
		
		knob			= new CentralKnob(knobImage);
		crown			= new OuterCrown();
		
		listeners		= new ConcurrentLinkedQueue<UbiSelectionListener>();
		focusListeners	= new ConcurrentLinkedQueue<UbiFocusListener>();
		
		normalCursor	= Display.getDefault().getSystemCursor(SWT.CURSOR_ARROW);
		clickableCursor	= Display.getDefault().getSystemCursor(SWT.CURSOR_HAND);
		offset			= -0;
		
		this.look 		= look;
//		this.focus		= false;
		
		setMenu(new Menu(this));
		
		addMouseWheelListener(new MouseWheelListener() {
			@Override
			public void mouseScrolled(MouseEvent e) {
				float v = value + e.count;

				v = v <= 0 ?  0  : v;
				v = v > max? max : v;

				setValue(v);
				e.count = 0;
				e.button = -1;
			}
		});
		addMouseListener(new MouseListener() {
			@Override
			public void mouseUp(MouseEvent e) {
				mouseDown = false;
			}
			@Override
			public void mouseDown(MouseEvent e) {
				if (e.button != SWT.RIGHT) {
					mouseDown = true;
					setValue(getValue());
					initialValue 	= getValue();
					Point center 	= Rectangle.SINGLETON.getCenter();
					initialY 		= e.y - center.y;
				}
			}
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				mouseDown 		= true;
				initialValue 	= getValue();
				Point center 	= Rectangle.SINGLETON.getCenter();
				initialY 		= e.y - center.y;
			}
		});
		addMouseMoveListener(new MouseMoveListener() {
			@Override
			public void mouseMove(MouseEvent e) {
				if (getClientArea().contains(e.x, e.y)) {
					setCursor(clickableCursor);
				} else {
					setCursor(normalCursor);
				}
				if (mouseDown) {
					int deltaY 		= e.y - initialY;
					int height		= getClientArea().height*4;
					float ratio     = new Float(deltaY) / new Float(height);		
					float v 		= value - (ratio * max);
					v = v <= 0 ?  0  : v;
					v = v > max? max : v;

					//System.out.println(ratio + " : " + deltaY + " => " + value + "(" + v + ")");
					
					setValue(v);
				}
			}
		});
		addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent e) {
				Color oldBG = e.gc.getBackground();
				Color oldFG = e.gc.getForeground();
				
				e.gc.setBackground(ColorsUtil.BG);
				e.gc.setForeground(ColorsUtil.BG);

				e.gc.fillRectangle(
					getClientArea()
				);
				
				int width	= getClientArea().width;
				int height	= getClientArea().height;

				float ratio = value / max;
				
				/*
				if (focus) {
					e.gc.setBackground(ColorConstants.black);
					e.gc.setForeground(ColorConstants.black);
					
					e.gc.setLineWidth(2);

					org.eclipse.swt.graphics.Rectangle rArea = getClientArea();
					Rectangle rect = new Rectangle(rArea.x, rArea.y, rArea.width, rArea.height);
					rect.shrink(2, 2);
					
					e.gc.drawLine(rect.getTopLeft().x, rect.getTopLeft().y, rect.getTopLeft().x + 8, rect.getTopLeft().y);
					e.gc.drawLine(rect.getTopLeft().x, rect.getTopLeft().y, rect.getTopLeft().x, rect.getTopLeft().y + 8);
					
					e.gc.drawLine(rect.getTopRight().x, rect.getTopRight().y, rect.getTopRight().x - 8, rect.getTopRight().y);
					e.gc.drawLine(rect.getTopRight().x, rect.getTopRight().y, rect.getTopRight().x, rect.getTopRight().y + 8);
					
					e.gc.drawLine(rect.getBottomRight().x, rect.getBottomRight().y, rect.getBottomRight().x - 8, rect.getBottomRight().y);
					e.gc.drawLine(rect.getBottomRight().x, rect.getBottomRight().y, rect.getBottomRight().x, rect.getBottomRight().y - 8);
					
					e.gc.drawLine(rect.getBottomLeft().x, rect.getBottomLeft().y, rect.getBottomLeft().x + 8, rect.getBottomLeft().y);
					e.gc.drawLine(rect.getBottomLeft().x, rect.getBottomLeft().y, rect.getBottomLeft().x, rect.getBottomLeft().y - 8);
				}
				*/

				Transform transform = new Transform(Display.getDefault());
				
				transform.translate(width / 2, height / 2);
				
				float angle = ratio * 360 - offset;
				
				transform.rotate(angle);
				e.gc.setTransform(transform);
		        
		        if (getLook() == KNOB_RICH_LOOK) {
		        	e.gc.drawImage(
		        		knob.getKnob(), 
		        		- knob.getKnob().getBounds().width / 2, 
		        		- knob.getKnob().getBounds().height / 2
		        	);
		        } else if (getLook() == KNOB_MINIMAL_LOOK) {
		        	
		        	e.gc.setLineWidth(4);
					e.gc.setForeground(ColorConstants.black);
					e.gc.setBackground(ColorConstants.black);
					e.gc.setLineStyle(SWT.JOIN_MITER);
					e.gc.fillOval(
						-5,
						-5,
						10,
						10
					);

					e.gc.drawLine(
						0, 
						0, 
						-knob.getKnob().getBounds().width / 3, 
						-knob.getKnob().getBounds().height / 3);
					e.gc.setForeground(ColorsUtil.BG);
		        	e.gc.setLineWidth(1);
		        }
				
				transform.rotate(- angle);

		        e.gc.setTransform(transform);
				
		        transform.dispose();
				
				if (level > 0) {
					Color color = ColorsUtil.INSTANCE.getColor(level, max);
					e.gc.setBackground(color);
					e.gc.setForeground(color);
	
					// draw the level feedback arc here !!!
				}
				
				e.gc.setBackground(ColorConstants.black);
				e.gc.setForeground(ColorConstants.black);

				/*				
				org.eclipse.swt.graphics.Rectangle r = knob.getKnob().getBounds();
				int w = r.width;
				int h = r.height;
				if (value > 0) {
					for (float t = offset; t < offset + (ratio * 300f); t += 16) {
						double rad	= Math.toRadians(t);
						double dX	= (w / 2 + 3) * Math.cos(rad);
						double dY	= (h / 2 + 3) * Math.sin(rad);
						e.gc.fillOval(r.x + (int) dX - 2, r.y + (int) dY - 2, 4, 4);
					}
				}

				if (value > 0) {
					float dW = 0f;
					for (float t = offset; t < offset + (ratio * 300f); t += 16) {
						double rad	= Math.toRadians(t);
						double dX	= (w / 2 + 3) * Math.cos(rad);
						double dY	= (h / 2 + 3) * Math.sin(rad);
						Color color = ColorsUtil.INSTANCE.getColor(dW / 300, 1);
						e.gc.setBackground(color);
						e.gc.setForeground(color);
						e.gc.fillOval(r.x + (int) dX - 1, r.y + (int) dY - 1, 2, 2);
						dW += 16;
					}
				}
*/				
				e.gc.setLineWidth(1);
				e.gc.setBackground(oldBG);
				e.gc.setForeground(oldFG);
			}
		});

		this.synchro = synchro;
		
	}
	
	public boolean setFocus(boolean focus, boolean notify) {
		if (notify) {
			notifyFocus(focus);
		}
		if (focus) {
			setFocus();
		}
		return /*this.focus =*/ focus;
	}
	
	public final static int KNOB_RICH_LOOK		= 0;
	public final static int KNOB_MINIMAL_LOOK	= 1;
	
	public UbiKnob(Composite parent, int style, int look) {
		this(parent, style, false, look, ImageUtils.KNOB_4_IMAGE);
		this.min	= 0;
		this.max	= 100f;
		this.value	= 0;
	}
	
	public UbiKnob(Composite parent, int style, float min, float max, float val, int look, String knobImage) {
		this(parent, style, false, look, knobImage);
		this.min	= min;
		this.max	= max;
		this.value	= val;
	}
	
	public UbiKnob(Composite parent, int style) {
		this(parent, style, false, KNOB_RICH_LOOK, ImageUtils.KNOB_4_IMAGE);
		this.min	= 0;
		this.max	= 100f;
		this.value	= 0;
	}
	
	public UbiKnob(Composite parent, int style, float min, float max, float val) {
		this(parent, style, false, KNOB_RICH_LOOK, ImageUtils.KNOB_4_IMAGE);
		this.min	= min;
		this.max	= max;
		this.value	= val;
	}
}
