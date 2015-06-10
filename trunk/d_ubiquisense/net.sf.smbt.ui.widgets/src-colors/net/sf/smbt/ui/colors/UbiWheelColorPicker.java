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

package net.sf.smbt.ui.colors;

import java.util.List;

import net.sf.smbt.ui.widgets.common.ColorsUtil;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Slider;

public class UbiWheelColorPicker extends Composite {
	//private boolean drag = false;
	private UbiColorWheel colorWheel;
	private CLabel colorLabel;
	private Slider brightnessSlider;
	private RGB rgb;
	private float brightness = 1f;
	public UbiWheelColorPicker(Composite parent) {
		super(parent, SWT.NONE);
		rgb 				= new RGB(255, 255, 255);
		setBackground(ColorsUtil.BG);
		createContent(this);
	}
	public void setLabelColor(RGB rgb) {
		Color color = ColorsUtil.INSTANCE.getColor(rgb);
		colorLabel.setForeground(color);
		colorLabel.setBackground(color);
	}
	private void createContent(Composite container) {
		colorWheel = new UbiColorWheel(container);
		colorWheel.setLayout(GridLayoutFactory.fillDefaults().create());
		colorWheel.setLayoutData(GridDataFactory.fillDefaults().grab(false, false).align(SWT.CENTER, SWT.CENTER).hint(200, 200).minSize(200, 200).create());
		colorWheel.setBackground(ColorsUtil.BG);
		colorWheel.addColorPickedListener(new UbiWheelColorPickedListener() {
			@Override
			public void rgbPicked(RGB picked, List<RGB> lastColors) {
				Color color = ColorsUtil.INSTANCE.getColor(picked);
				colorLabel.setForeground(color);
				colorLabel.setBackground(color);
				rgb = color.getRGB();
				updateColorLabel();
			}
		});
		
		colorLabel = new CLabel(container, SWT.NONE);
		colorLabel.setLayoutData(GridDataFactory.fillDefaults().grab(false, false).align(SWT.CENTER, SWT.CENTER).hint(200, 20).minSize(200, 20).create());
		colorLabel.setForeground(ColorConstants.white);
		colorLabel.setBackground(ColorConstants.white);
		colorLabel.addMouseListener(new MouseListener() {
			@Override
			public void mouseUp(MouseEvent e) {}
			@Override
			public void mouseDown(MouseEvent e) {}
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				colorWheel.notifyColorPickedListeners(colorLabel.getBackground().getRGB());
			}
		});
		
		brightnessSlider = new Slider(container, SWT.HORIZONTAL); 
		brightnessSlider.setLayoutData(
			GridDataFactory.fillDefaults().grab(false, true).align(SWT.CENTER, SWT.CENTER).hint(200, 20).minSize(200, 20).create()
		);
		brightnessSlider.setMaximum(100);
		brightnessSlider.setSelection(100);
		brightnessSlider.redraw();
		brightnessSlider.addSelectionListener(
			new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					updateColorLabel();
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
		);
		addColorBrowsedListener(
			new UbiWheelColorBrowsedListener() {
				@Override
				public void rgbBrowsed(RGB picked) {
					rgb = picked;
					updateColorLabel();
				}
			}
		);
		addColorPickedListener(
			new UbiWheelColorPickedListener() {
				@Override
				public void rgbPicked(RGB picked, List<RGB> lastColors) {
					rgb = picked;
					updateColorLabel();
				}
			}
		);
	}
	private void updateColorLabel() {
		if (rgb != null) {
			float[] hsbvals = new float[3];
			java.awt.Color.RGBtoHSB(rgb.red, rgb.green, rgb.blue, hsbvals);
			brightness = new Float(brightnessSlider.getSelection()) / new Float(100f);
			Color color = ColorsUtil.INSTANCE.getHsbColor(hsbvals[0], hsbvals[1], brightness);
			colorLabel.setForeground(color);
			colorLabel.setBackground(color);
			rgb = new RGB(color.getRed(), color.getGreen(), color.getBlue());
		}
	}
	public RGB getRGB() {
		return rgb;
	}
	public void addColorPickedListener(UbiWheelColorPickedListener l) {
		colorWheel.addColorPickedListener(l);
	}
	public void addColorBrowsedListener(UbiWheelColorBrowsedListener l) {
		colorWheel.addColorBrowsedListener(l);
	}
	public void removeColorPickedListener(UbiWheelColorPickedListener l) {
		colorWheel.removeColorPickedListener(l);
	}
	public void removeColorBrowsedListener(UbiWheelColorBrowsedListener l) {
		colorWheel.removeColorBrowsedListener(l);
	}
}
