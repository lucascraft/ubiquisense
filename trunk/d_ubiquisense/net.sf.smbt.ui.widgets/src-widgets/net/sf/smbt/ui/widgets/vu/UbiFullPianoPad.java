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
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentLinkedQueue;

import javax.sound.midi.ShortMessage;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;

@Deprecated
public class UbiFullPianoPad extends Composite {
	private ConcurrentLinkedQueue<IPianoPadValuesChangeListener> valuesChangedListeners;

	class PKey {
		public int octave;
		public String k;
		public Rectangle bounds;
		public int attack;
		public int sustain;
		public int delay;
		public int release;
		public PKey(String k, int x, int y, int w, int h, int a, int s, int d, int r) {
			this.k = k;
			bounds = new Rectangle(x, y, w, h);
			attack = a;
			sustain = s;
			delay = d;
			release = r;
			
		}
		public int getOctave() {
			return octave;
		}
		public void setOctave(int octave) {
			this.octave = octave;
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
		public PKey(int octave, String k) {
			this(k, 0, 0, 0, 0, 0, 0, 0, 0);
		}
		public boolean isWhite() {
			return (k != null && !k.endsWith("#"));
		}
		public boolean isBlack() {
			return !isWhite();
		}
	}
	private TreeMap<String, PKey> keyMap;
	private Map<Integer, Map<String, Integer>> notesWithShiftMap;
	private Map<Integer, Integer> octaves;
	private int nbOctaves;
	private int startOctave;
	public UbiFullPianoPad(Composite parent, final int startOctave, final int nbOctaves) {
		super(parent, SWT.NONE);
		this.startOctave	= startOctave;
		this.nbOctaves		= nbOctaves;
		this.octaves		= new HashMap<Integer, Integer>();
		notesWithShiftMap	= new HashMap<Integer, Map<String, Integer>>();
		int r =0;
		for (int i=startOctave; i<=startOctave+nbOctaves;i++) {
			octaves.put(i, r);
			Map<String, Integer> notesMap = new HashMap<String, Integer>();
			notesMap.put(i+":C",  0);
			notesMap.put(i+":C#", 1);
			notesMap.put(i+":D",  2);
			notesMap.put(i+":D#", 3);
			notesMap.put(i+":E",  4);
			notesMap.put(i+":F",  5);
			notesMap.put(i+":F#", 6);
			notesMap.put(i+":G",  7);
			notesMap.put(i+":G#", 8);
			notesMap.put(i+":A",  9);
			notesMap.put(i+":A#", 10);
			notesMap.put(i+":B",  11);
			notesWithShiftMap.put(i, notesMap);
			r++;
		}

		valuesChangedListeners = new ConcurrentLinkedQueue<IPianoPadValuesChangeListener>();
		keyMap = new TreeMap<String, UbiFullPianoPad.PKey>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
			//	String k1 = o1.endsWith("#") ? o1 : "Z" + o1.substring(0, 1);
			//	String k2 = o2.endsWith("#") ? o2 : "Z" + o2.substring(0, 1);
			//	return k2.compareTo(k1);
				return o2.compareTo(o1);
			}
		});
		for (Integer octIdx : notesWithShiftMap.keySet()) {
			Map<String, Integer> map = notesWithShiftMap.get(octIdx);
			for (String k : map.keySet()) {
				keyMap.put(k, new PKey(octIdx, k));
			}
		}
		addPaintListener(
			new PaintListener() {
				@Override
				public void paintControl(PaintEvent e) {
					org.eclipse.swt.graphics.Rectangle area = getClientArea();
					
					Float w		= new Float(area.width) / new Float(nbOctaves);
					Float h		= new Float(area.height);
					Float dlB 	= new Float(w / 12f); 
					Float dlW 	= new Float(w / 7f);
					
					Map<String, Float> ratios = getKeyLocationsHRatios();
					for (Integer oct : notesWithShiftMap.keySet()) {
						for (String pK : notesWithShiftMap.get(oct).keySet()) {
							if (ratios.containsKey(pK)) {
								Float ratio = ratios.get(pK);
								float kX = new Float(w) * new Float(ratio);
								String rK = pK; //pK.substring(pK.indexOf(":")+1);
								if (!keyMap.containsKey(rK)) {
									keyMap.put(rK, new PKey(oct, rK));
								} 
								PKey infKey = keyMap.get(rK);
								if (infKey != null) {
									try {
										int wP		= infKey.isWhite() ? dlW.intValue()	: dlB.intValue();
										//int hP		= infKey.isWhite() ? h.intValue()	: h.intValue() - 20;
										float newX	= octaves.get(oct).intValue() * kX + 2;
										
										Rectangle r = new Rectangle((int)newX, 0, wP - 4, h.intValue());
										if (r != null) {
											infKey.setBounds(
												r
											);
										}
									} catch (Exception ex) {
										ex.printStackTrace();
									}
								}
							}
						}
					}
					drawKeys(e.gc);
				}
			}
		);
		addMouseListener(
			new MouseListener() {
				@Override
				public void mouseUp(MouseEvent e) {
					for (String key : keyMap.keySet()) {
						PKey pK = keyMap.get(key);
						if (pK.getBounds().contains(e.x, e.y)) {
							fireNotification(pK, ShortMessage.NOTE_OFF, e);
						}
					}
				}
				@Override
				public void mouseDown(MouseEvent e) {
					for (String key : keyMap.keySet()) {
						PKey pK = keyMap.get(key);
						if (pK.getBounds().contains(e.x, e.y)) {
							fireNotification(pK, ShortMessage.NOTE_ON, e);
						}
					}
				}
				@Override
				public void mouseDoubleClick(MouseEvent e) {}
			}
		);
	}
	private void fireNotification(PKey key, int command, MouseEvent event) {
		String k = key.getK();
		for (IPianoPadValuesChangeListener l : valuesChangedListeners) {
			l.valueChanges(key.getOctave(), k, command, 60, event);
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
		for (String k : keyMap.keySet()) {
			PKey padKey = keyMap.get(k);
			gc.setForeground(padKey.isWhite() ? ColorConstants.white : ColorConstants.black);
			gc.setBackground(padKey.isWhite() ? ColorConstants.white : ColorConstants.black);
			Rectangle rect = padKey.getBounds();
			gc.fillRectangle(rect.x, rect.y, rect.width, rect.height);
			gc.setForeground(ColorConstants.blue);
			Point extent = gc.textExtent(k);
			gc.drawString(k, rect.x + rect.width / 2 - extent.x / 2, rect.y + rect.height /2 - extent.y / 2);
		}
	}
	
	public HashMap<String, Float> getKeyLocationsHRatios() {
		HashMap<String, Float> ratios = new HashMap<String, Float>();
		Float dtW = new Float(1f / 7f)  / new Float(nbOctaves);
		Float dtB = new Float(1f / 12f) / new Float(nbOctaves);
		int rank = 0;
		for (int i=0;i<nbOctaves; i++) {
			int kk = startOctave+i;
			ratios.put(kk + ":C",   ( rank * 0 * dtW));
			ratios.put(kk + ":C#",  ((rank * 1 * dtW) - dtB / 2));
			ratios.put(kk + ":D",   ( rank * 1 * dtW));
			ratios.put(kk + ":D#",  ((rank * 2 * dtW) - dtB / 2));
			ratios.put(kk + ":E",   ( rank * 2 * dtW));
			ratios.put(kk + ":F",   ( rank * 3 * dtW));
			ratios.put(kk + ":F#",  ((rank * 4 * dtW) - dtB / 2));
			ratios.put(kk + ":G",   ( rank * 4 * dtW));
			ratios.put(kk + ":G#",  ((rank * 5 * dtW) - dtB / 2));
			ratios.put(kk + ":A",   ( rank * 5 * dtW));
			ratios.put(kk + ":A#",  ((rank * 6 * dtW) - dtB / 2));
			ratios.put(kk + ":B",   ( rank * 6 * dtW));
			rank++;
		}
		return ratios;
	}
}
