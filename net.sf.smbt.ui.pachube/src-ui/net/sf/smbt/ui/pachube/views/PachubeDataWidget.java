/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012 - 2013, Lucas Bigeardel
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

package net.sf.smbt.ui.pachube.views;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.smbt.ui.widgets.utils.TimedValue;
import net.sf.smbt.ui.widgets.utils.TimedValuesUtils;
import net.sf.smbt.ui.widgets.vu.UbiTimed2DChart;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eeml.xsd._0._5.DataType;
import org.eeml.xsd._0._5.UnitType;
import org.eeml.xsd._0._5.ValueType;

public class PachubeDataWidget extends Composite {
	private UbiTimed2DChart chart;
	private Color lightBlue = new Color(Display.getDefault(), new RGB(0, 191, 255));

	private Font bigFont = new Font(Display.getDefault(), "tahoma", 18, SWT.BOLD);
	public PachubeDataWidget(Composite parent, DataType d) {
		super(parent, SWT.NONE);
		
		setLayout(GridLayoutFactory.fillDefaults().create());
		setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		setBackground(ColorConstants.green);
		
		float min = (d.getMinValue() != null && !d.getMinValue().equals("")) ? Float.parseFloat(d.getMinValue()) : 0f;
		float max = (d.getMaxValue() != null && !d.getMaxValue().equals("")) ? Float.parseFloat(d.getMaxValue()) : 0f;
		List<TimedValue> timedValues = new ArrayList<TimedValue>();
		if (d.getDatapoints() != null && d.getDatapoints().getValue() != null) {
			for (ValueType v : d.getDatapoints().getValue()) {
				if (v != null && v.getValue() != null) {
					Date at = v.getAt().toGregorianCalendar().getTime();
					Float value = min;
					try {
						value = Float.parseFloat(v.getValue());
					} catch (NumberFormatException e) {
						// shut up
					}
					timedValues.add(TimedValuesUtils.INSTANCE.createTimedValue(value, at));
				}
			}
		}
		UnitType u = d.getUnit();
		String unit = (u == null || u.getValue() == "") ? "" : "[" + d.getUnit().getValue() + "]";
		
		Date d1 = new Date();
		Date d2 = new Date();
		
		if (!timedValues.isEmpty()) {
			TimedValue v2 = timedValues.get(timedValues.size()-1);
			if (v2.getD() != null) {
				d2 = v2.getD();
			}
			if (timedValues.size() > 1) {
				d1 = timedValues.get(0).getD();
			}
		}
		
		chart = new UbiTimed2DChart(this, UbiTimed2DChart.STYLE_LINES, min, max, unit, " ("+d.getId() + ")", d1, d2, timedValues.toArray(new TimedValue[0]));
		
		chart.setFont(bigFont);
		chart.setBackground(ColorConstants.darkGray);
		chart.setInsideColor(ColorConstants.darkGray);
		chart.setLineColor(lightBlue);
		chart.setTooltipFGColor(ColorConstants.white);
		chart.setTooltipBGColor(ColorConstants.orange);
		chart.setMinValueColor(ColorConstants.orange);
		chart.setMaxValueColor(ColorConstants.orange);
		chart.setMinUnitColor(ColorConstants.red);
		chart.setMaxUnitColor(ColorConstants.red);
		
		addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent e) {
				chart.dispose();
			}
		});
		layout(true);
	}
	public UbiTimed2DChart getChart() {
		return chart;
	}
	public void setData(DataType d) {
		float min = (d.getMinValue() != null && !d.getMinValue().equals("")) ? Float.parseFloat(d.getMinValue()) : 0f;
		List<TimedValue> timedValues = new ArrayList<TimedValue>();
		if (d.getDatapoints() != null && d.getDatapoints().getValue() != null) {
			for (ValueType v : d.getDatapoints().getValue()) {
				if (v != null && v.getValue() != null) {
					Date at = v.getAt().toGregorianCalendar().getTime();
					Float value = min;
					try {
						value = Float.parseFloat(v.getValue());
					} catch (NumberFormatException e) {
						// shut up
					}
					timedValues.add(TimedValuesUtils.INSTANCE.createTimedValue(value, at));
				}
			}
		}
		getChart().getTimedRange().clearTimedValues();
		getChart().getTimedRange().setTimedValues(timedValues);
		getChart().redraw();
	}
	@Override
	public void redraw() {
		super.redraw();
		if (chart!=null && !chart.isDisposed()) {
			chart.redraw();
		}
	}
}