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
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

import net.sf.smbt.ui.widgets.common.ColorsUtil;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class UbiKnobGrid extends Composite {
	private ConcurrentLinkedQueue<IGenericParamValuesChangedListener> listeners;
	private ConcurrentHashMap<String, UbiKnobCell> knobs;
	private ConcurrentHashMap<UbiKnobCell, UbiSelectionListener> knobsSelectionListeners;
	private ConcurrentHashMap<UbiKnobCell, UbiFocusListener> knobsFocusListeners;
	private UbiKnobCell selectedKnob;
	
	public class UbiKnobCell extends Composite {
		private UbiKnob knob;
		private Label headerLabel, bottomLabel;
		public UbiKnobCell(Composite parent, String headerText, float min, float max, float value) {
			this(parent, headerText, min, max, value, "java.lang.Float");
		}
		public UbiKnob getKnob() {
			return knob;
		}
		public UbiKnobCell(Composite parent, String headerText, float min, float max, float value, String type) {
			super(parent, SWT.BORDER_DASH);
			setLayout(GridLayoutFactory.fillDefaults().create());
			setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(100, 100).grab(false, false).create());
			setBackground(ColorsUtil.BG);
			setForeground(ColorConstants.buttonDarker);

			headerLabel = new Label(this, SWT.NONE);
			headerLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).grab(false, false).create());
			headerLabel.setForeground(ColorConstants.gray);
			headerLabel.setBackground(ColorsUtil.BG);
			headerLabel.setText(headerText);
			
			knob = new UbiKnob(this, SWT.HORIZONTAL);
			knob.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(75, 50).grab(false, false).create());
			
			knob.setMin(min);
			knob.setMax(max);
			
			float v = min + value * (max - min);
			knob.setValue(v);
			
			bottomLabel = new Label(this, SWT.NONE);
			bottomLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.TOP).grab(false, false).create());
			bottomLabel.setForeground(ColorConstants.gray);
			bottomLabel.setText(""+v);
			bottomLabel.setBackground(ColorsUtil.BG);
		}
		public void setTopText(String label) {
			headerLabel.setText(label);
		}
		public String getTopText() {
			return headerLabel.getText();
		}
		public void setMin(float min) {
			knob.setMin(min);
		}
		public float getMin() {
			return knob.getMin();
		}
		public void setMax(float max) {
			knob.setMin(max);
		}
		public float getMax() {
			return knob.getMax();
		}
		public void setValue(float value) {
			knob.setValue(value);
		}
		public float getValue() {
			return knob.getValue();
		}
		public void setValue(float value, boolean redraw) {
			knob.setValue(value, redraw);
		}
		public void setLevel(float level) {
			knob.setValue(level);
		}
		public float getLevel() {
			return knob.getLevel();
		}
		public void setBottomText(String label) {
			bottomLabel.setText(label);
		}
		public void addFocusListener(UbiFocusListener listener) {
			knob.addFocusListener(listener);
		}
		public void removeFocusListener(UbiFocusListener listener) {
			knob.removeFocusListener(listener);
		}
		public void addSelectionListener(UbiSelectionListener listener) {
			knob.addSelectionListener(listener);
		}
		public void removeSelectionListener(UbiSelectionListener listener) {
			knob.removeSelectionListener(listener);
		}
	}
	public UbiKnobGrid(Composite parent, int nbCol, int nbRow) {
		super(parent, SWT.NONE);
		
		listeners					= new ConcurrentLinkedQueue<IGenericParamValuesChangedListener>();
		knobsSelectionListeners 	= new ConcurrentHashMap<UbiKnobCell, UbiSelectionListener>();
		knobsFocusListeners 		= new ConcurrentHashMap<UbiKnobCell, UbiFocusListener>();
		knobs						= new ConcurrentHashMap<String, UbiKnobCell>();

		setLayout(GridLayoutFactory.fillDefaults().equalWidth(false).numColumns(nbCol).create());
		setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		setBackground(ColorsUtil.BG);
	}
	
	public ConcurrentHashMap<String, UbiKnobCell> getKnobsMap() {
		return knobs;
	}
	
	public UbiKnobCell getKnob(String paramID) {
		if (knobs != null && knobs.size() > 0 && knobs.containsKey(paramID)) {
			return knobs.get(paramID);
		}
		return null;
	}
	
	public ConcurrentLinkedQueue<IGenericParamValuesChangedListener> getValuesChangedListeners() {
		return listeners;
	}
	
	public void addValuesChangedListeners(IGenericParamValuesChangedListener l) {
		listeners.add(l);
	}
	
	public void removeValuesChangedListeners(IGenericParamValuesChangedListener l) {
		listeners.remove(l);
	}
	
	public void addParamToMonitor(String pID, float min, float max, float val, String type) {
		addKnob(
			new UbiKnobCell(
				this, 
				pID, 
				min, 
				max, 
				val, 
				type
			)
		);
	}
	private UbiKnobCell addKnob(final UbiKnobCell knob) {
		knob.knob.setFocus(false, false);
		UbiSelectionListener l = new UbiSelectionListener() {
			@Override
			public void handle() {
				knob.setBottomText(""+knob.getValue());
				for (IGenericParamValuesChangedListener l : listeners) {
					l.valuesChanged(
						knob.getLevel(), 
						knob.getValue(), 
						knob.getMin(), 
						knob.getMax(), 
						knob.getTopText(), 
						true
					);
				}
			}
		};
		UbiFocusListener f = new UbiFocusListener() {
			@Override
			public void handleFocus(Object target) {
				selectedKnob = knob;
				for (String k : knobs.keySet()) {
					UbiKnobCell cell = knobs.get(k);
					if (cell != null) {
						cell.knob.setFocus(cell.equals(selectedKnob), false);
						cell.knob.redraw();
					}
				}
			}
			@Override
			public void handleUnfocus(Object target) {}
		};
		
		//
		// 
		//
		knobsFocusListeners.put(
			knob,
			f
		);
		knob.addFocusListener(f);
		
		//
		// 
		//
		knobsSelectionListeners.put(
			knob,
			l
		);
		knob.addSelectionListener(l);
		
		return knob;
	}
	
	@Override
	public void redraw() {
		super.redraw();
		for (UbiKnobCell k : knobs.values()) {
			k.redraw();
		}
	}

	public UbiKnob setKnobParameters(String pID, float min, float max, float val, String type, boolean focus) {
		return setKnobParameters(pID, min, max, val, type, focus, new ArrayList<Action>());
	}
	
	public UbiKnob setKnobParameters(String pID, float min, float max, float val, String type, boolean focus, List<Action> actions) {
		if (knobs.containsKey(pID)) {
			UbiKnobCell knob = knobs.get(pID);
			if (focus) {
				knob.knob.setFocus(focus, false);
			}
			knob.removeSelectionListener(knobsSelectionListeners.get(knob));
			if (knob != null) {
				if (knob.getValue() != val) {
					knob.setValue(val);
				}
				if (knob.getMin() != min) {
					knob.setMin(min);
				}
				if (knob.getMax() != max) {
					knob.setMax(max);
				}
				knob.addSelectionListener(knobsSelectionListeners.get(knob));
			}
		} else {
			knobs.put(
				pID, 
				addKnob(
					new UbiKnobCell(
						this, 
						pID, 
						min, 
						max, 
						val
					)
				)
			);
			knobs.get(pID).knob.addMenuActions(actions);
		}
		return knobs.get(pID).knob;
	}
}
