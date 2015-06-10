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
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

import net.sf.smbt.ui.widgets.common.ColorsUtil;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class UbiEQ extends UbiWidget {
	private int outputGainMin = -12; // -12 Db .. +12 Db 
	private int outputGainMax = 12; // -12 Db .. +12 Db 
	
	private String outputA = "A";
	private String outputB = "B";
	
	private String currentOutput = outputA;
	
	private int nbChannels;
	private int selectedPoint;
	private String selectedChannel;
	
	private Map<String, Boolean> enablementMap;
	private Map<String, Integer> filterMap;
	private Map<String, Float> frequencesMap;
	private Map<String, Float> gainsMap;
	private Map<String, Float> resonanceMap;
	
	private ConcurrentLinkedQueue<IEQValuesChangedListener> valueListeners;
	private ConcurrentLinkedQueue<IEQSelectionChangedListener> selectionListeners;
	
	private int diam = 12;

	public final static double freqz[] = new double[]{
		30, 
		50, 60, 70, 80, 90,
		100, 200, 300, 400, 500, 600, 700, 800, 900, 
		1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000,
		10000, 20000
	};
	
	private boolean mouseDown;
	private Cursor normalCursor, clickableCursor;
	
	public void setSelectedPoint(int point) {
		selectedPoint = point;
		redraw();
	}
	
	public void setNbChannels(int nbChannels) {
		this.nbChannels = nbChannels;
	}
	
	public void setSelectedChannel(String channel) {
		selectedChannel = channel;
		redraw();
	}
	
	public int getSelectedPoint() {
		return selectedPoint;
	}
	
	public String getSelectedChannel() {
		return selectedChannel;
	}
	
	public void setFilterType(String output, int channel, int filterID) {
		String k = output+channel;
		filterMap.put(k, filterID);
		Boolean enabled = enablementMap.containsKey(k) ?  enablementMap.get(k) : false;
		if (k != null && k.length()>0) {
			String kk = k.substring(1);
			if( !"".equals(kk)) {
				snotify(k, Integer.parseInt(kk), enabled);
			}
		}
		redraw();
	}
	public void setFilterType(int filterID) {
		setFilterType(getSelectedChannel(), getSelectedPoint(), filterID);
	}


	public int getCurrentFilterType() {
		return filterMap.containsKey(getCurrentOutput()) ? filterMap.get(getCurrentOutput()) : 0;
	}

	public int getFilterType(String outputID) {
		return filterMap.containsKey(outputID) ? filterMap.get(outputID) : 0;
	}
	
	public void setFilterOn(String k, boolean status) {
		setFilterOn(k, status, true);
	}

	public void setFilterOn(String k, boolean status, boolean notify) {
		enablementMap.put(k, status);
		if (notify) {
			snotify(k, Integer.parseInt(k.substring(1)), status);
		}
		redraw();
	}
	
	public boolean isFilterOn(String k) {
		return enablementMap.containsKey(k) ? enablementMap.get(k).booleanValue() : false;
	}

	public int getNbChannels() {
		return nbChannels;
	}
	
	public void setCurrentOutput(String currentOutput) {
		this.currentOutput = currentOutput;
		redraw();
	}
	
	public String getCurrentOutput() {
		return currentOutput;
	}
	
	public int getOutputGainMax() {
		return outputGainMax;
	}
	
	public int getOutputGainMin() {
		return outputGainMin;
	}
	
	public String getOutputA() {
		return outputA;
	}
	
	public String getOutputB() {
		return outputB;
	}
	
	public void addValuesChangesListener(IEQValuesChangedListener l) {
		valueListeners.add(l);
	}
	public void removeValuesChangesListener(IEQValuesChangedListener l) {
		valueListeners.remove(l);
	}
	public ConcurrentLinkedQueue<IEQValuesChangedListener> getValuesChangeListenr() {
		return valueListeners;
	}
	public void addSelectionChangesListener(IEQSelectionChangedListener l) {
		selectionListeners.add(l);
	}
	public void removeSelectionChangesListener(IEQSelectionChangedListener l) {
		selectionListeners.remove(l);
	}
	public ConcurrentLinkedQueue<IEQSelectionChangedListener> getSelectionChangeListenr() {
		return selectionListeners;
	}
	
	public void setChannelEnabled(int channel, boolean status) {
		String k = getCurrentOutput()+channel;
		enablementMap.put(k, status);
		snotify(k,channel, status);
		redraw();
	}
	
	public void isChannelEnabled(int channel) {
		enablementMap.get(getCurrentOutput()+channel);
	}
	
	public UbiEQ(Composite parent, int nbChannels) {
		super(parent, SWT.NONE);
		setBackground(ColorsUtil.black);
		this.nbChannels		= nbChannels;
		valueListeners		= new ConcurrentLinkedQueue<IEQValuesChangedListener>();
		selectionListeners	= new ConcurrentLinkedQueue<IEQSelectionChangedListener>();
		enablementMap		= new ConcurrentHashMap<String, Boolean>();
		filterMap			= new ConcurrentHashMap<String, Integer>();
		frequencesMap		= new ConcurrentHashMap<String, Float>();
		gainsMap			= new ConcurrentHashMap<String, Float>();
		resonanceMap		= new ConcurrentHashMap<String, Float>();
		normalCursor		= Display.getDefault().getSystemCursor(SWT.CURSOR_ARROW);
		clickableCursor 	= Display.getDefault().getSystemCursor(SWT.CURSOR_HAND);
		selectedChannel 	= "A";
		
		filterMap.put("A", 1);
		filterMap.put("B", 0);
		
		for (int b=1; b<=nbChannels;b++) {
			enablementMap.put("A"+b, true);
			enablementMap.put("B"+b, true);
		}
		
		addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent e) {
				GC g = e.gc;
				Rectangle rect = getBounds();
				g.setBackground(ColorConstants.black);
				g.setForeground(ColorConstants.orange);
				g.fillRoundRectangle(rect.x, rect.y, rect.width, rect.height, 8, 8);
				g.setAlpha(120);
				drawGrid(g);
				//drawCurve(g);
				drawPoints(g);
			}
		});
		normalCursor = Display.getDefault().getSystemCursor(SWT.CURSOR_ARROW);
		clickableCursor = Display.getDefault().getSystemCursor(SWT.CURSOR_HAND);
		
		addMouseListener(new MouseListener() {
			@Override
			public void mouseUp(MouseEvent e) {
				mouseDown = false;
			}
			@Override
			public void mouseDown(MouseEvent e) {
				mouseDown = true;
				TreeMap<String, org.eclipse.draw2d.geometry.Rectangle> rects = getRectsOrederdByX();
				for (String k : rects.keySet()) {
					org.eclipse.draw2d.geometry.Rectangle r = rects.get(k);
					if (r.contains(e.x, e.y)) {
						int chanIndex = k.contains("-") ? k.indexOf("-") + 1 : 0;
						selectedChannel = k.substring(chanIndex, chanIndex+1);
						selectedPoint 	= Integer.parseInt(k.substring(chanIndex+1));
						return;
					} else {
						selectedPoint = -1;
						setCursor(normalCursor);
					}
				}
				redraw();
			}
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				mouseDown = false;
				redraw();
			}
		});
		addMouseMoveListener(new MouseMoveListener() {
			@Override
			public void mouseMove(MouseEvent e) {
				TreeMap<String, org.eclipse.draw2d.geometry.Rectangle> rects = getRectsOrederdByX();
				for (String k : rects.keySet()) {
					org.eclipse.draw2d.geometry.Rectangle r = rects.get(k);
					if (mouseDown) {
						if (!k.startsWith("-")) {
							String sub = k.substring(k.indexOf("-")+2);
							int deviceID = Integer.parseInt(sub);
							if (selectedPoint == deviceID) {
								tnotify(k, r, e.x, e.y, selectedPoint, selectedChannel);
							}
						}
					}
					if (r.contains(e.x, e.y)) {
						setCursor(clickableCursor);
						return;
					} else {
						setCursor(normalCursor);
					}
				}
				redraw();
			}
		});
	}
	
	@Override
	protected void doMenuAction(MouseEvent e) {
		TreeMap<String, org.eclipse.draw2d.geometry.Rectangle> rects = getRectsOrederdByX();
		for (String k : rects.keySet()) {
			org.eclipse.draw2d.geometry.Rectangle r = rects.get(k);
			if (r.contains(e.x, e.y)) {
				int chanIndex = k.contains("-") ? k.indexOf("-") + 1 : 0;
				selectedChannel = k.substring(chanIndex, chanIndex+1);
				selectedPoint 	= Integer.parseInt(k.substring(chanIndex+1));
				super.doMenuAction(e);
				return;
			} else {
				selectedPoint = -1;
				setCursor(normalCursor);
			}
		}
	}
	
	private void snotify(
		String k,
		int selectedPoint,
		boolean status
	) {
		
		/*
		String kReso = selectedChannel+selectedPoint;
		String key = k.substring(k.indexOf("-")+1);
		
		float freq		= 0f;
		float gain		= 0f;
		float resonance	= 0f;
		
		if (key != null && key.equals(kReso)) {
			if (frequencesMap.keySet().contains(key)) {
				freq = frequencesMap.get(key);
			}
			if (gainsMap.keySet().contains(key)) {
				gain = gainsMap.get(key);
			}
			resonance = resonanceMap.containsKey(kReso) ? resonanceMap.get(kReso) : 0;
		}
		*/
		
		redraw();
		
		int type = getFilterType(getCurrentOutput());
		
		for (IEQValuesChangedListener l : valueListeners) {
			l.valuesChanged(
				Float.NaN, 
				Float.NaN, 
				Float.NaN, 
				selectedPoint, 
				selectedChannel, 
				status, 
				type
			);
		}
		
		selectedChannel = "";

	}
	
	private void tnotify(
			String k, 
			org.eclipse.draw2d.geometry.Rectangle pointRect, 
			int x, 
			int y, 
			int selectedPoint, 
			String selectedChannel
	) {
		Rectangle rect = getDrawRect();

		float freq = new Float(x) /  rect.width;
		float gain = 1f - (new Float(y) /  rect.height);
		
		String kReso = selectedChannel+selectedPoint;
		
		String key = k.substring(k.indexOf("-")+1);
		if (key != null && key.equals(kReso)) {
			if (frequencesMap.keySet().contains(key)) {
				frequencesMap.put(key, freq);
			}
			if (gainsMap.keySet().contains(key)) {
				gainsMap.put(key, gain);
			}
		}
		
		redraw();
		
		float resonance = resonanceMap.containsKey(kReso) ? resonanceMap.get(kReso) : 0;
		
		Boolean enabled = enablementMap.containsKey(kReso) ?  enablementMap.get(kReso) : false;
		int type = getFilterType(getCurrentOutput());
		
		for (IEQValuesChangedListener l : valueListeners) {
			l.valuesChanged(freq, 1f - gain, resonance, selectedPoint, selectedChannel, enabled, type);
		}
		
		selectedChannel = "";
	}

	private Rectangle getDrawRect() {
		Rectangle area = getBounds();
		return new Rectangle(
			area.x + diam / 2, 
			area.y + diam / 2, 
			area.width - diam, 
			area.height - diam
		);
	}
	
	public void setOutputGainMax(int outputGainMax) {
		this.outputGainMax = outputGainMax;
	}
	
	public void setOutputGainMin(int outputGainMin) {
		this.outputGainMin = outputGainMin;
	}
	
	private void drawGrid(GC gc) {
		int h = getBounds().height;
		int w = getBounds().width;
		gc.setAlpha(100);
		gc.drawLine(0, h / 2, 0, w);
		double f30Hz = Math.log10(30);
		double fMax  = Math.log10(20000);
		double fAmp  = fMax - f30Hz;
		for (double f : freqz) {
			double x = ((Math.log10(f) - f30Hz) / fAmp) * ((double) getBounds().width);
			gc.setLineStyle(SWT.LINE_DOT);
			gc.drawLine((int)x, 0, (int)x, h);
			String lbl = "";
			if (f == 100) {
				lbl = "100";
				gc.drawString(lbl, (int) x, (int) getBounds().y + h - 20, true);
			} else if (f == 1000) {
				lbl = "1K";
				gc.drawString(lbl, (int) x, (int) getBounds().y + h - 20, true);
			} else if (f == 10000) {
				lbl = "10K";
				gc.drawString(lbl, (int) x, (int) getBounds().y + h - 20, true);
			}
		}
		int dt = h / 5;
		
		int dta0 = h / 2 - 2 * dt;
		int dta1 = h / 2 - dt;
		int dtb1 = h / 2 + dt;
		int dtb0 = h / 2 + 2 * dt;
		
		gc.drawLine(0, h / 2,  w, h / 2);
		gc.drawLine(0, dta0, w, dta0);
		gc.drawLine(0, dta1, w, dta1);
		gc.drawLine(0, dtb1, w, dtb1);
		gc.drawLine(0, dtb0, w, dtb0);
		
		int ht = new Float(gc.getFont().getFontData()[0].height / 2).intValue();
		
		gc.drawString("+" +outputGainMax , 0, dta0 - ht);
		gc.drawString(" +" +outputGainMax / 2, 0, dta1 - ht);
		gc.drawString("  0", 0, h / 2 - ht);
		gc.drawString(" -" +outputGainMax / 2, 0, dtb1 - ht);
		gc.drawString("-" +outputGainMax, 0, dtb0 - ht);
	}
	/*
	private void drawCurve(GC gc) {
		
		gc.setAlpha(100);
		gc.setLineStyle(SWT.LINE_SOLID);
		gc.setLineWidth(2);

		Rectangle drawZone = getDrawRect();
		
		Path path = new Path(Display.getDefault());
		path.moveTo(0, drawZone.height / 2);
		
		TreeMap<String, org.eclipse.draw2d.geometry.Rectangle> rects = getRectsOrederdByX();
		
		if (!rects.isEmpty()) {
			
			List<org.eclipse.draw2d.geometry.Rectangle> lst = new ArrayList<org.eclipse.draw2d.geometry.Rectangle>();
			for (String k : rects.keySet()) {
				lst.add(rects.get(k));
				if (enablementMap.containsKey(k)) {
					if (!enablementMap.get(k)) {
						continue;
					}
				}

				//String channel = k.substring(1);
				double freq = getFreq(k);
				double gain = getGain(k);
				
				QuadFilterParameter p = QuadFilterUtils.INSTANCE.compute(
					QuadFilterComputationType.HighPassFilter, 
					40000, // 40 Hz ??? 
					(int)freq, 
					(int)gain, 
					1
				);
				
				org.eclipse.draw2d.geometry.Rectangle r = rects.get(k);
					
				
				path.quadTo(
					0f, 
					new Double(p.a1 * drawZone.height).floatValue(), 
					(float) r.x,
					(float) r.y
				);
				
				path.quadTo(
					(float) r.x,
					(float) r.y,
					(float) r.x, 
					new Double(p.a2 * drawZone.height).floatValue()
				);
					
				path.quadTo(
						(float) r.x,
						(float) r.y,
						(float) drawZone.width, 
						-new Double(p.b0 * drawZone.height).floatValue()
				);
				path.quadTo(
					(float) r.x, 
					-new Double(p.b1 * drawZone.height).floatValue(), 
					(float) r.x,
					(float) r.y
				);
			}
		}
		gc.setLineWidth(3);
		gc.drawPath(path);
		
		path.dispose();
	}
	private double getFreq(String pID) {
		for (String k : frequencesMap.keySet()) {
			double f30Hz = Math.log10(30);
			double fMax  = Math.log10(20000);
			float freq   = frequencesMap.get(k);
			return QuadFilterUtils.INSTANCE.getFreqFromRatio(freq, f30Hz, fMax);
		}
		return -1;
	}
	
	private double getGain(String pID) {
		for (String k : gainsMap.keySet()) {
			float gain = gainsMap.get(k);
			return QuadFilterUtils.INSTANCE.getGainFromRatio((double)gain, (double)-12, (double)12);
		}
		return 0f;
	}
	
	private float getReso(String pID) {
		for (String k : resonanceMap.keySet()) {
			if (k.startsWith(currentOutput)) { 
				return resonanceMap.get(k);
			}
		}
		return 0f;
	}
	 */
	
	private TreeMap<String, org.eclipse.draw2d.geometry.Rectangle> getRectsOrederdByX() {
		TreeMap<String, org.eclipse.draw2d.geometry.Rectangle> rects = 
			new TreeMap<String, org.eclipse.draw2d.geometry.Rectangle>(new Comparator<String>() {
				public int compare(String o1, String o2) {
					if (o1 != null && o2 != null) {
						String[] k1 = o1.split("-");
						
						int w1 = -1;
						if (k1[0] != null && k1[0] != null && !k1[0].equals("")) {
							w1 = Integer.parseInt(k1[0]);
						}
						String s1 = "";
						if (k1[1] != null && k1[1] != "") {
							s1 = k1[1];
						}
										
						String[] k2 = o2.split("-");
						
						int w2 = -1;
						if (k2[0] != null && k2[0] != null && !k2[0].equals("")) {
							w2 = Integer.parseInt(k2[0]);
						}
					
						String s2 = "";
						if (k2[1] != null && k2[1] != "") {
							s2 = k2[1];
						}
								
						if (s1 != null && s2 != null) {
							if (w1 == w2) {
								return s1.compareTo(s2);
							}
							return w1 - w2;
						}
					}
					return 0;
				};
			}
		);
		
		int w = getDrawRect().width;
		int h = getDrawRect().height;
		
		for (String k : gainsMap.keySet()) {
			if (k.startsWith(currentOutput)) { 
				Float fFreq		= frequencesMap.containsKey(k) ? frequencesMap.get(k) : 0f;
				Float fGain 	= 1f - gainsMap.get(k);

				Float fWidth	= new Float(w);
				Float fHeigth 	= new Float(h);
				
				int newX		= new Float(fFreq * fWidth).intValue();
				int newY 		= new Float(fGain * fHeigth).intValue();
				
				rects.put(
					newX + "-" + k, 
					new org.eclipse.draw2d.geometry.Rectangle(
						newX,
						newY,
						diam + 1,
						diam + 1
					)
				);
			}
		}
		return rects;
	}
	
	private void drawPoints(GC gc) {
		gc.setAlpha(255);
		gc.setLineStyle(SWT.LINE_SOLID);
		gc.setLineWidth(2);
		int w = getDrawRect().width;
		int h = getDrawRect().height;
		for (String k : gainsMap.keySet()) {
			if (k.startsWith(currentOutput)) { 
				int idx = Integer.parseInt(k.substring(1));
				if (idx  > 0) {
					if (enablementMap.containsKey(k)) {
						if (!enablementMap.get(k)) {
							continue;
						}
					}
					Float fFreq = frequencesMap.get(k);
					if (fFreq != null) {
						Float fWidth = new Float(w);
						Float fHeigth = new Float(h);

						Float fGain = 1f - gainsMap.get(k);
						
						int newX = new Float(fFreq * fWidth).intValue();
						int newY = new Float(fGain * fHeigth).intValue();
			
						gc.setLineWidth(idx == selectedPoint ? 2 : 1);
						
						gc.drawOval(newX, newY, diam + 1, diam + 1);
						
						String txt = k.substring(1);
						org.eclipse.swt.graphics.Point extent = gc.textExtent(""+txt);
						gc.drawText(txt, newX + extent.x - extent.x / 2 - extent.x % 2, newY, true);
					}
				}
			}
		}
	}
	
	public void clearAll() {
		frequencesMap.clear();
		gainsMap.clear();
		resonanceMap.clear();
	}

	private void notifyCurrentValues() {
		if (selectedPoint>0) {
			String k = selectedChannel+selectedPoint; 
			TreeMap<String, org.eclipse.draw2d.geometry.Rectangle> rects = getRectsOrederdByX();
			Rectangle drawRect = getDrawRect();
			
			Float fv = frequencesMap.get(k);
			Float gv = gainsMap.get(k);
			
			if (drawRect.width>0 && drawRect.height>0 && fv !=null && gv != null) {
				try {
					Float fX	= new Float( fv * new Float(drawRect.width));
					Float fY 	= new Float( gv * new Float(drawRect.height));

					int x 		= fX == null ? drawRect.width / 2 : fX.intValue();
					int y 		= fX == null ? drawRect.height / 2 : fY.intValue();
					
					for (String key : rects.keySet()) {
						if (key.endsWith(k)) {
							tnotify(k, rects.get(key), x, y, selectedPoint, selectedChannel);
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void setFrequence(String k, float freq) {
		frequencesMap.put(k, new Float(freq));
		notifyCurrentValues();
	}
	
	public void setGain(String k, float gain) {
		gainsMap.put(k, new Float(1f - gain));
		notifyCurrentValues();
	}
	
	public void setResonance(String k, float resonance) {
		resonanceMap.put(k, new Float(resonance));
		notifyCurrentValues();
	}
}
