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

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

import net.sf.smbt.ui.widgets.common.ColorsUtil;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class UbiEQAdvanced extends Composite {
	
	private UbiEQ equalizer;
	private UbiKnob freqKnob, gainKnob, resonanceKnob;
	
	private IEQValuesChangedListener valueChangedListener;
	private SelectionListener channelCheckSelectionListener, channelSelectSelectionListener;
	private UbiSelectionListener gainKnobSelectionListener, feqKnobSelectionListener, resonanceKnobSelectionListener;
	private Map<Integer, Button> radios = new HashMap<Integer, Button>();
	private Map<Integer, Button> checks = new HashMap<Integer, Button>();

	public void setFilterType(String outputID, int channelID, int filterID) {
		equalizer.setFilterType(outputID, channelID, filterID);
	}
	
	public int getFilterType(String outputID, int channelID) {
		return equalizer.getFilterType(outputID);
	}
	
	public void setCurrentFilterType(int filterID) {
		equalizer.setFilterType(filterID);
	}
	
	public int getCurrentFilterType() {
		return equalizer.getCurrentFilterType();
	}
	
	public void setOutputGainMax(int outputGainMax) {
		equalizer.setOutputGainMax(outputGainMax);
	}
	
	public void setOutputGainMin(int outputGainMin) {
		equalizer.setOutputGainMin(outputGainMin);
	}

	public void clearAll() {
		equalizer.clearAll();
	}
	
	public void setFilterOn(String k, boolean status, boolean notify) {
		equalizer.setFilterOn(k, status, notify);
		checkEnablements(k, status);
	}
	
	public void setFrequence(String k, float freq) {
		equalizer.setFrequence(k, freq);
	}
	
	public void setGain(String k, float gain) {
		equalizer.setGain(k, gain);
	}
	
	public void setResonance(String k, float resonance) {
		equalizer.setResonance(k, resonance);
	}

	public void addValuesChangesListener(IEQValuesChangedListener l) {
		equalizer.addValuesChangesListener(l);
	}
	
	public void removeValuesChangesListener(IEQValuesChangedListener l) {
		equalizer.removeValuesChangesListener(l);
	}
	
	public ConcurrentLinkedQueue<IEQValuesChangedListener> getValuesChangeListenr() {
		return equalizer.getValuesChangeListenr();
	}
	
	public void setCurrentOutput(String currentOutput) {
		equalizer.setCurrentOutput(currentOutput);
	}
	
	public String getCurrentOutput() {
		return equalizer.getCurrentOutput();
	}

	public void setNbChannels(int nbChannels) {
		equalizer.setNbChannels(nbChannels);
	}

	public UbiEQAdvanced(Composite parent, int style) {
		this(parent, style, false);
	}
	
	public UbiEQAdvanced(Composite parent, int nbChannels, boolean initWithplaceholder) {
		super(parent, SWT.NONE);
		valueChangedListener = new IEQValuesChangedListener() {
			@Override
			public void valuesChanged(float freq, float gain, float resonance, int index, String channel, boolean status, int filterType) {
				freqKnob.removeSelectionListener(feqKnobSelectionListener);
				gainKnob.removeSelectionListener(gainKnobSelectionListener);
				resonanceKnob.removeSelectionListener(resonanceKnobSelectionListener);
				
				if (!new Float(freq).equals(Float.NaN)) {
					freqKnob.setValue(freq * 100f);
				}
				if (!new Float(gain).equals(Float.NaN)) {
					gainKnob.setValue((1f - gain) * 100f);
				}
				if (!new Float(resonance).equals(Float.NaN)) {
					resonanceKnob.setValue(resonance * 100f);
				}
				//checkEnablements(channel+index, status);
				
				gainKnob.addSelectionListener(gainKnobSelectionListener);
				resonanceKnob.addSelectionListener(resonanceKnobSelectionListener);
				freqKnob.addSelectionListener(feqKnobSelectionListener);
			}
		};
		channelCheckSelectionListener = new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Object o = e.widget.getData();
				if (o instanceof Integer) {
					Integer i = (Integer) o;
					Button b = radios.get(i);
					Button check = (Button) e.widget;
					boolean status = check.getSelection();
					b.setEnabled(status);
					equalizer.setSelectedPoint(-1);
					equalizer.setChannelEnabled(i, status);
					equalizer.redraw();
				}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		};
		channelSelectSelectionListener = new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Object o = e.widget.getData();
				if (o instanceof Integer) {
					Integer i = (Integer) o;
					equalizer.setSelectedPoint(i);
					equalizer.redraw();
				}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		};
		createControl(nbChannels, initWithplaceholder);
	}
	public UbiEQ getEqualizer() {
		return equalizer;
	}
	public void addMenuAction(Action action) {
		equalizer.addMenuAction(action);
	}

	public void removeMenuAction(Action action) {
		equalizer.removeMenuAction(action);
	}
	
	private void checkEnablements(String k, boolean status) {
		if (k == null || k.length() < 2) return;
		if (k.startsWith(getCurrentOutput())) {
			String key = k.substring(1);
			int idx = Integer.parseInt(key);
			if (checks.containsKey(idx)) {
				Button b = checks.get(idx);
				if (b != null && !b.isDisposed()) {
					b.removeSelectionListener(channelCheckSelectionListener);
					b.setSelection(status);
					b.addSelectionListener(channelCheckSelectionListener);
				}
			}
		}
	}
	
	private void createControl(int nbChannels, boolean initWithplaceholder) {
		Composite containerPanel = new Composite(this, SWT.BORDER);
		containerPanel.setLayout(GridLayoutFactory.fillDefaults().equalWidth(false).numColumns(4).create());
		containerPanel.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		containerPanel.setBackground(ColorsUtil.BG);

		Composite leftPanel = new Composite(containerPanel, SWT.NONE);
		leftPanel.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).equalWidth(false).create());
		leftPanel.setLayoutData(GridDataFactory.fillDefaults().grab(false, true).create());
		leftPanel.setBackground(ColorsUtil.BG);
		
		Composite chanPanel = new Composite(leftPanel, SWT.NONE);
		chanPanel.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).equalWidth(false).create());
		chanPanel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).grab(false, true).create());
		chanPanel.setBackground(ColorsUtil.BG);
		
		 
		
		for (int c=1; c<=8; c++) {
			
			Button chanCheck = new Button(chanPanel, SWT.CHECK);
			chanCheck.setData(new Integer(c));
			chanCheck.setLayoutData(GridDataFactory.swtDefaults().align(SWT.BEGINNING, SWT.CENTER).create());
			chanCheck.setBackground(ColorsUtil.BG);
			chanCheck.addSelectionListener(channelCheckSelectionListener);
			checks.put(c, chanCheck);
			
			Button chanSelect = new Button(chanPanel, SWT.RADIO);
			chanSelect.setData(new Integer(c));
			chanSelect.setLayoutData(GridDataFactory.swtDefaults().align(SWT.BEGINNING, SWT.CENTER).create());
			chanSelect.setText(""+c);
			chanSelect.setBackground(ColorsUtil.BG);
			chanSelect.addSelectionListener(channelSelectSelectionListener);
			radios.put(c, chanSelect);
		}
		
		Composite knobsPanel = new Composite(leftPanel, SWT.NONE);
		knobsPanel.setLayout(GridLayoutFactory.fillDefaults().create());
		knobsPanel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).grab(true, true).create());
		knobsPanel.setBackground(ColorsUtil.BG);

		feqKnobSelectionListener = new UbiSelectionListener() {
			@Override
			public void handle() {
				freqKnob.removeSelectionListener(feqKnobSelectionListener);
				gainKnob.removeSelectionListener(gainKnobSelectionListener);
				resonanceKnob.removeSelectionListener(resonanceKnobSelectionListener);
				
				equalizer.removeValuesChangesListener(valueChangedListener);
				
				String key = equalizer.getCurrentOutput()+equalizer.getSelectedPoint();
				
				equalizer.setGain(		key, gainKnob.getValue()/100f);
				equalizer.setFrequence(	key, freqKnob.getValue()/100f);
				equalizer.setResonance(	key, resonanceKnob.getValue()/100f);
				
				equalizer.redraw();
				
				equalizer.addValuesChangesListener(valueChangedListener);
				
				resonanceKnob.addSelectionListener(resonanceKnobSelectionListener);
				
				gainKnob.addSelectionListener(gainKnobSelectionListener);
				freqKnob.addSelectionListener(feqKnobSelectionListener);
			}
		};
		freqKnob = new UbiKnob(knobsPanel, SWT.HORIZONTAL);
		freqKnob.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.TOP).hint(48, 48).grab(false, false).create());
		freqKnob.setMax(100f);
		freqKnob.setSelection(50);
		freqKnob.addSelectionListener(feqKnobSelectionListener);
		
		gainKnobSelectionListener = new UbiSelectionListener() {
			@Override
			public void handle() {
				freqKnob.removeSelectionListener(feqKnobSelectionListener);
				gainKnob.removeSelectionListener(gainKnobSelectionListener);
				resonanceKnob.removeSelectionListener(resonanceKnobSelectionListener);
				
				equalizer.removeValuesChangesListener(valueChangedListener);
				
				String key = equalizer.getCurrentOutput()+equalizer.getSelectedPoint();

				equalizer.setGain(		key, gainKnob.getValue()/100f);
				equalizer.setFrequence(	key, freqKnob.getValue()/100f);
				equalizer.setResonance(	key, resonanceKnob.getValue()/100f);
				
				equalizer.redraw();
				
				equalizer.addValuesChangesListener(valueChangedListener);
				
				resonanceKnob.addSelectionListener(resonanceKnobSelectionListener);
				gainKnob.addSelectionListener(gainKnobSelectionListener);
				freqKnob.addSelectionListener(feqKnobSelectionListener);
			}
		};
		gainKnob = new UbiKnob(knobsPanel, SWT.HORIZONTAL);
		gainKnob.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).hint(48, 48).grab(false, false).create());
		gainKnob.setMax(100f);
		gainKnob.setSelection(50);
		gainKnob.addSelectionListener(gainKnobSelectionListener);
		
		resonanceKnobSelectionListener = new UbiSelectionListener() {
			@Override
			public void handle() {
				freqKnob.removeSelectionListener(feqKnobSelectionListener);
				gainKnob.removeSelectionListener(gainKnobSelectionListener);
				resonanceKnob.removeSelectionListener(resonanceKnobSelectionListener);
				
				equalizer.removeValuesChangesListener(valueChangedListener);
				
				String key = equalizer.getCurrentOutput()+equalizer.getSelectedPoint();

				equalizer.setGain(		key, gainKnob.getValue()/100f);
				equalizer.setFrequence(	key, freqKnob.getValue()/100f);
				equalizer.setResonance(	key, resonanceKnob.getValue()/100f);
				equalizer.redraw();
				
				equalizer.addValuesChangesListener(valueChangedListener);

				resonanceKnob.addSelectionListener(resonanceKnobSelectionListener);
				gainKnob.addSelectionListener(gainKnobSelectionListener);
				freqKnob.addSelectionListener(feqKnobSelectionListener);
			}
		};
		resonanceKnob = new UbiKnob(knobsPanel, SWT.HORIZONTAL);
		resonanceKnob.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.BOTTOM).hint(48, 48).grab(false, false).create());
		resonanceKnob.setMax(100f);
		resonanceKnob.setSelection(50);
		resonanceKnob.addSelectionListener(resonanceKnobSelectionListener);
		
		Composite rightPanel = new Composite(containerPanel, SWT.NONE);
		rightPanel.setLayout(GridLayoutFactory.fillDefaults().create());
		rightPanel.setLayoutData(GridDataFactory.fillDefaults().span(3, 1).grab(true, true).create());
		rightPanel.setBackground(ColorsUtil.BG);
		
		Composite eqPanel = new Composite(rightPanel, SWT.NONE);
		eqPanel.setLayout(GridLayoutFactory.fillDefaults().create());
		eqPanel.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		eqPanel.setBackground(ColorsUtil.BG);

		equalizer = new UbiEQ(eqPanel, nbChannels);
		//equalizer.setLayout(GridLayoutFactory.fillDefaults().create());
		equalizer.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		equalizer.setSelectedPoint(1);
		equalizer.addValuesChangesListener(valueChangedListener);
		
		if (initWithplaceholder) {
			for (int c=1; c<=8; c++) {
				
				float v = new Float(c) / 8f;
				
				setGain("A"+c, 1f- v);
				setFrequence("A"+c, v);
	
				setGain("B"+c, 1f- v);
				setFrequence("B"+c, v);
			}
		}
		
		/*
		Composite filtersPanel = new Composite(eqPanel, SWT.NONE);
		filtersPanel.setLayout(GridLayoutFactory.fillDefaults().numColumns(5).equalWidth(true).create());
		filtersPanel.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		filtersPanel.setBackground(ColorsUtil.BG);
		
		
		//
		// Filters
		//
		
		filterButtonlistener = new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (e.widget == filterType1) {
					boolean toggle = filterType1.getSelection();
					setCurrentFilterType(1);
					filterType2.removeSelectionListener(filterButtonlistener);
					filterType2.setSelection(!toggle);
					filterType2.addSelectionListener(filterButtonlistener);
					filterType3.removeSelectionListener(filterButtonlistener);
					filterType3.setSelection(!toggle);
					filterType3.addSelectionListener(filterButtonlistener);
					filterType4.removeSelectionListener(filterButtonlistener);
					filterType4.setSelection(!toggle);
					filterType4.addSelectionListener(filterButtonlistener);
					filterType5.removeSelectionListener(filterButtonlistener);
					filterType5.setSelection(!toggle);
					filterType5.addSelectionListener(filterButtonlistener);
				} else if (e.widget == filterType2) {
					boolean toggle = filterType2.getSelection();
					setCurrentFilterType(2);
					filterType1.removeSelectionListener(filterButtonlistener);
					filterType1.setSelection(!toggle);
					filterType1.addSelectionListener(filterButtonlistener);
					filterType3.removeSelectionListener(filterButtonlistener);
					filterType3.setSelection(!toggle);
					filterType3.addSelectionListener(filterButtonlistener);
					filterType4.removeSelectionListener(filterButtonlistener);
					filterType4.setSelection(!toggle);
					filterType4.addSelectionListener(filterButtonlistener);
					filterType5.removeSelectionListener(filterButtonlistener);
					filterType5.setSelection(!toggle);
					filterType5.addSelectionListener(filterButtonlistener);
				}  else if (e.widget == filterType3) {
					boolean toggle = filterType3.getSelection();
					setCurrentFilterType(3);
					filterType1.removeSelectionListener(filterButtonlistener);
					filterType1.setSelection(!toggle);
					filterType1.addSelectionListener(filterButtonlistener);
					filterType2.removeSelectionListener(filterButtonlistener);
					filterType2.setSelection(!toggle);
					filterType2.addSelectionListener(filterButtonlistener);
					filterType4.removeSelectionListener(filterButtonlistener);
					filterType4.setSelection(!toggle);
					filterType4.addSelectionListener(filterButtonlistener);
					filterType5.removeSelectionListener(filterButtonlistener);
					filterType5.setSelection(!toggle);
					filterType5.addSelectionListener(filterButtonlistener);
				}  else if (e.widget == filterType4) {
					boolean toggle = filterType4.getSelection();
					setCurrentFilterType(4);
					filterType1.removeSelectionListener(filterButtonlistener);
					filterType1.setSelection(!toggle);
					filterType1.addSelectionListener(filterButtonlistener);
					filterType2.removeSelectionListener(filterButtonlistener);
					filterType2.setSelection(!toggle);
					filterType2.addSelectionListener(filterButtonlistener);
					filterType3.removeSelectionListener(filterButtonlistener);
					filterType3.setSelection(!toggle);
					filterType3.addSelectionListener(filterButtonlistener);
					filterType5.removeSelectionListener(filterButtonlistener);
					filterType5.setSelection(!toggle);
					filterType5.addSelectionListener(filterButtonlistener);
				}  else if (e.widget == filterType5) {
					boolean toggle = filterType5.getSelection();
					setCurrentFilterType(5);
					filterType1.removeSelectionListener(filterButtonlistener);
					filterType1.setSelection(!toggle);
					filterType1.addSelectionListener(filterButtonlistener);
					filterType2.removeSelectionListener(filterButtonlistener);
					filterType2.setSelection(!toggle);
					filterType2.addSelectionListener(filterButtonlistener);
					filterType3.removeSelectionListener(filterButtonlistener);
					filterType3.setSelection(!toggle);
					filterType3.addSelectionListener(filterButtonlistener);
					filterType4.removeSelectionListener(filterButtonlistener);
					filterType4.setSelection(!toggle);
					filterType4.addSelectionListener(filterButtonlistener);
				} 
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		};
		
		filterType1 = new Button(filtersPanel, SWT.TOGGLE);
		filterType1.setText("filter 1");
		filterType1.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.TOP).create());
		filterType1.addSelectionListener(filterButtonlistener);
		
		filterType2 = new Button(filtersPanel, SWT.TOGGLE);
		filterType2.setText("filter 2");
		filterType2.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.TOP).create());
		filterType2.addSelectionListener(filterButtonlistener);
		
		filterType3 = new Button(filtersPanel, SWT.TOGGLE);
		filterType3.setText("filter 3");
		filterType3.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.TOP).create());
		filterType3.addSelectionListener(filterButtonlistener);
		
		filterType4 = new Button(filtersPanel, SWT.TOGGLE);
		filterType4.setText("filter 4");
		filterType4.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.TOP).create());
		filterType4.addSelectionListener(filterButtonlistener);
		
		filterType5 = new Button(filtersPanel, SWT.TOGGLE);
		filterType5.setText("filter 5");
		filterType5.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.TOP).create());
		filterType5.addSelectionListener(filterButtonlistener);
*/
	}
}
