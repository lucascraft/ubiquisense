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

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentLinkedQueue;

import javax.sound.midi.ShortMessage;

import net.sf.smbt.ui.widgets.common.ImageUtils;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class UbiMiniPianoPad extends Composite {
	private ConcurrentLinkedQueue<IPianoPadValuesChangeListener> valuesChangedListeners;
	private static final String[] keys = {
		"4:C",  "4:C#", "4:D",  "4:D#", "4:E",  "4:F", 
		"4:F#", "4:G",  "4:G#", "4:A",  "4:A#", "4:B",
		"5:C",  "5:C#", "5:D",  "5:D#", "5:E",  "5:F", 
		"5:F#", "5:G",  "5:G#", "5:A",  "5:A#", "5:B",
		"6:C",  "6:C#", "6:D",  "6:D#", "6:E",  "6:F", 
		"6:F#", "6:G",  "6:G#", "6:A",  "6:A#", "6:B",
	};
	private static final String[] zOrderedKeys = new String[] {
		"4:C#", "4:D#", 
		"4:F#", "4:G#", "4:A#",
		"5:C#", "5:D#", 
		"5:F#", "5:G#", "5:A#",
		"6:C#", "6:D#", 
		"6:F#", "6:G#", "6:A#",
		"4:C" , "4:D",  "4:E",  "4:F", 
		"4:G" , "4:A", "4:B",
		"5:C" , "5:D",  "5:E",  "5:F", 
		"5:G" , "5:A", "5:B",
		"6:C" , "6:D",  "6:E",  "6:F", 
		"6:G" , "6:A", "6:B",
	};
	class PKey {
		public String k;
		public Rectangle bounds;
		public int attack;
		public int sustain;
		public int delay;
		public int release;
		public boolean pressed;
		public PKey(String k, int x, int y, int w, int h, int a, int s, int d, int r) {
			this.k = k;
			bounds = new Rectangle(x, y, w, h);
			attack = a;
			sustain = s;
			delay = d;
			release = r;
			
		}
		public boolean isPressed() {
			return pressed;
		}
		public void setPressed(boolean pressed) {
			this.pressed = pressed;
		}
		public String getK() {
			return k;
		}
		public void setK(String k) {
			this.k = k;
		}
		public Rectangle getBounds() {
			return bounds;
		}
		public void setBounds(Rectangle bounds) {
			this.bounds = bounds;
		}
		public int getAttack() {
			return attack;
		}
		public void setAttack(int attack) {
			this.attack = attack;
		}
		public int getSustain() {
			return sustain;
		}
		public void setSustain(int sustain) {
			this.sustain = sustain;
		}
		public int getDelay() {
			return delay;
		}
		public void setDelay(int delay) {
			this.delay = delay;
		}
		public int getRelease() {
			return release;
		}
		public void setRelease(int release) {
			this.release = release;
		}
		public PKey(String k) {
			this(k, 0, 0, 0, 0, 0, 0, 0, 0);
		}
		public boolean isWhite() {
			return (k != null && !k.endsWith("#"));
		}
		public boolean isBlack() {
			return !isWhite();
		}
	}
	private PKey getPianoKey(MouseEvent e) {
		for (String key : zOrderedKeys) {
			PKey pK = keyMap.get(key);
			if (pK.getBounds().contains(e.x, e.y)) {
				pK.setPressed(false);
				return pK;
			}
		}
		return null;
	}
	PKey lastKey = null;

	private TreeMap<String, PKey> keyMap;
	public UbiMiniPianoPad(Composite parent, int style) {
		super(parent, style);
		//setBackgroundImage(ImageUtils.INSTANCE.getMiniPiano()); // 333 × 236
		setBackgroundImage(ImageUtils.INSTANCE.get3OctavesPiano()); // 1008 × 236
		//whiteColor = ColorConstants.white;
		//blackColor = ColorConstants.black;
		valuesChangedListeners = new ConcurrentLinkedQueue<IPianoPadValuesChangeListener>();
		keyMap = new TreeMap<String, UbiMiniPianoPad.PKey>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				String k1 = o1.endsWith("#") ? o1 : "Z" + o1.replace(":",":Z");
				String k2 = o2.endsWith("#") ? o2 : "Z" + o2.replace(":",":Z");
				return k2.compareTo(k1);
			}
		});
		for (String k : keys) {
			keyMap.put(k, new PKey(k));
		}
		addPaintListener(
			new PaintListener() {
				@Override
				public void paintControl(PaintEvent e) {
					e.gc.setAlpha(175);
					org.eclipse.swt.graphics.Rectangle area = getBounds();
					Float w		= new Float(area.width);
					Float h		= new Float(area.height);
					Float dlB 	= new Float(w / 36f); 
					Float dlW 	= new Float(w / 21f); 
					for (String pK : keys) {
						Float ratio = getKeyLocationsHRatios().get(pK);
						int kX = new Float(w * ratio).intValue();
						if (!keyMap.containsKey(pK)) {
							keyMap.put(pK, new PKey(pK));
						} 
						PKey infKey = keyMap.get(pK);
						if (infKey != null) {
							try {
								int wP = infKey.isWhite() ? dlW.intValue()	: dlB.intValue();
								int hP = infKey.isWhite() ? h.intValue()	: new Float(h * 0.6f).intValue();
								
								int xOffset = 0;
								if (infKey.getK().contains("C#") || infKey.getK().contains("F#")) {
									xOffset = -wP / 4; // <
								} if (infKey.getK().contains("D#") || infKey.getK().contains("A#")) {
									xOffset = +wP / 5; // >
								} else if (infKey.getK().contains("G#")) {
									xOffset = 0;
								}
								infKey.setBounds(
									new Rectangle(kX + xOffset, 0, wP, hP)
								);
							} catch (Exception ex) {
								ex.printStackTrace();
							}
						}
					}
					drawKeys(e.gc);
				}
			}
		);
		addMouseMoveListener(new MouseMoveListener() {
			@Override
			public void mouseMove(MouseEvent e) {
				PKey pK = getPianoKey(e);
				if (pK != null) {
					if (lastKey!=pK && ((e.stateMask & SWT.BUTTON1) != 0)) {
						redraw();
						fireNotification(pK, ShortMessage.NOTE_ON, e);
					}
				} else {
					redraw();
					fireNotification(pK, ShortMessage.NOTE_OFF, e);				
				}
				lastKey = pK;
			}
		});
		addMouseListener(
			new MouseListener() {
				@Override
				public void mouseUp(MouseEvent e) {
					PKey pK = getPianoKey(e);
					if (e != null) {
						redraw();
						fireNotification(pK, ShortMessage.NOTE_OFF, e);
					}
				}
				@Override
				public void mouseDown(MouseEvent e) {
					PKey pK = getPianoKey(e);
					if (e != null) {
						redraw();
						fireNotification(pK, ShortMessage.NOTE_ON, e);
					}
				}
				@Override
				public void mouseDoubleClick(MouseEvent e) {
					
				}
			}
		);
	}
	private void fireNotification(PKey key, int command, MouseEvent event) {
		String k = key.getK();
		String[] kk = k.split(":");
		for (IPianoPadValuesChangeListener l : valuesChangedListeners) {
			l.valueChanges(Integer.parseInt(kk[0]), kk[1], command, 45, event);
		}
	}
	public ConcurrentLinkedQueue<IPianoPadValuesChangeListener> getValuesChangedListeners() {
		return valuesChangedListeners;
	}
	public void addValuesChangedListeners(IPianoPadValuesChangeListener listener) {
		valuesChangedListeners.add(listener);
	}
	public void removeValuesChangedListeners(IPianoPadValuesChangeListener listener) {
		valuesChangedListeners.remove(listener);
	}
	public void drawKeys(GC gc) {
		/*
		for (String k : keyMap.keySet()) {
			PKey padKey = keyMap.get(k);
			if (padKey.isPressed()) {
				gc.setForeground(ColorConstants.orange);
				gc.setBackground(ColorConstants.red);
			} else {
				gc.setForeground(padKey.isWhite() ? ColorConstants.darkGray : ColorConstants.gray);
				gc.setBackground(padKey.isWhite() ? ColorConstants.white : ColorConstants.black);
			}
			Rectangle rect = padKey.getBounds();
			gc.fillRectangle(rect.x, rect.y, rect.width, rect.height);
			
			gc.setForeground(ColorConstants.blue);
			Point ext = gc.textExtent(k);
			gc.drawString(k, rect.x + rect.width / 2 - ext.x/2 , rect.y + rect.height /2- ext.y/2);
			
		}
		*/
		if(lastKey != null) {
			gc.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_RED));
			gc.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_RED));
			Rectangle rect = lastKey.getBounds();
			gc.fillRectangle(rect.x, rect.y, rect.width, rect.height);
		}
	}
	public HashMap<String, Float> getKeyLocationsHRatios() {
		HashMap<String, Float> ratios = new HashMap<String, Float>();
		Float dtW  = new Float(1f / (3f * 7f)	);
		Float dtB  = new Float(1f / (3f * 12f));
		Float dOct = new Float(7 * dtW);
		for (int o=0;o<3;o++) {
			ratios.put(keys[(12 * o) + 0],  ( o * dOct) +  0f);
			ratios.put(keys[(12 * o) + 1],  ( o * dOct) + (1 * dtW) - dtB / 2);
			ratios.put(keys[(12 * o) + 2],  ( o * dOct) +  1 * dtW);
			ratios.put(keys[(12 * o) + 3],  ( o * dOct) + (2 * dtW) - dtB / 2);
			ratios.put(keys[(12 * o) + 4],  ( o * dOct) +  2 * dtW);
			
			ratios.put(keys[(12 * o) + 5],  ( o * dOct) +  3 * dtW);
			ratios.put(keys[(12 * o) + 6],  ( o * dOct) + (4 * dtW) - dtB / 2);
			ratios.put(keys[(12 * o) + 7],  ( o * dOct) +  4 * dtW);
			ratios.put(keys[(12 * o) + 8],  ( o * dOct) + (5 * dtW) - dtB / 2);
			ratios.put(keys[(12 * o) + 9],  ( o * dOct) +  5 * dtW);
			ratios.put(keys[(12 * o) + 10], ( o * dOct) + (6 * dtW) - dtB / 2);
			ratios.put(keys[(12 * o) + 11], ( o * dOct) +  6 * dtW);
		}
		
		return ratios;
	}
}
