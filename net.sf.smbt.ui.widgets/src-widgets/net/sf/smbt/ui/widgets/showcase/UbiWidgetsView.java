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

package net.sf.smbt.ui.widgets.showcase;

import java.util.Random;

import net.sf.smbt.ui.widgets.common.ColorsUtil;
import net.sf.smbt.ui.widgets.vu.SixteenSegmentsDisplay;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.ui.part.ViewPart;

public class UbiWidgetsView extends ViewPart{

	private final static String TEST_STRING = "Ubiquisense Widgets Demo";
	private int curPos = 0;
	
	private SixteenSegmentsDisplay vu, dualPhabet2;

	@Override
	public void dispose() {
		TabFactory.INSTANCE.dispose();
		
		super.dispose();
	}
	
	@Override
	public void createPartControl(Composite parent) {
		
		
		TabFolder folder = new TabFolder(parent, SWT.TOP);
		folder.setLayout(GridLayoutFactory.fillDefaults().create());
		folder.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		folder.setBackground(ColorsUtil.BG);

		//
		// Db Meter
		//
		
		TabItem tabDbMeter = new TabItem(folder, SWT.BOTTOM);
		tabDbMeter.setText("Db Meter");
		TabFactory.INSTANCE.addUbiDbMeter(folder, tabDbMeter);
		
		
		//
		// EQ Meter
		//
		
		TabItem tabEQ = new TabItem(folder, SWT.BOTTOM);
		tabEQ.setText("Equalizer");
		TabFactory.INSTANCE.addUbiEQ(folder, tabEQ);
		
		
		//
		// Advanced EQ Meter
		//
		
		TabItem tabEQAdvanced = new TabItem(folder, SWT.BOTTOM);
		tabEQAdvanced.setText("Advanced Equalizer");
		TabFactory.INSTANCE.addAdvancedEQ8(folder, tabEQAdvanced);
		
		
		//
		// Advanced Knobs
		//
		TabItem tabKnob = new TabItem(folder, SWT.BOTTOM);
		tabKnob.setText("Knobs");
		TabFactory.INSTANCE.addKnobs(folder, tabKnob);
		
		//
		// Advanced Knob Grid
		//
		/*
		TabItem tabKnobGrid = new TabItem(folder, SWT.BOTTOM);
		tabKnobGrid.setText("Knob Grid");
		addKnobGrid(folder, tabKnobGrid);
		*/
		
		//
		// UbiSlider
		//
		TabItem tabUbiSlider = new TabItem(folder, SWT.BOTTOM);
		tabUbiSlider.setText("Slider");
		TabFactory.INSTANCE.addUbiSlider(folder, tabUbiSlider);
		
		//
		// UbiVuMeter
		//
		TabItem tabVuMeter = new TabItem(folder, SWT.BOTTOM);
		tabVuMeter.setText("VU Meter");
		TabFactory.INSTANCE.addVuMeter(folder, tabVuMeter);
		
		
		//
		// 7 segments
		//
//		TabItem tab7Segments = new TabItem(folder, SWT.BOTTOM);
//		tab7Segments.setText("7 Segments");
//		TabFactory.INSTANCE.add7Segments(folder, tab7Segments);

		//
		// 16 segments
		//

		TabItem tab16Segments = new TabItem(folder, SWT.BOTTOM);
		tab16Segments.setText("16 Segments");
		TabFactory.INSTANCE.add16Segments(folder, tab16Segments);

		//
		// 16 segments
		//
		/*
		TabItem tab16Segments2 = new TabItem(folder, SWT.BOTTOM);
		tab16Segments2.setText("16 Segments 2");
		add16Segment2(folder, tab16Segments);
		*/
		
		//
		// LCD Char Dot Matrix Display
		//

		TabItem dotCharMatrixItem = new TabItem(folder, SWT.BOTTOM);
		dotCharMatrixItem.setText("LCD Matrix");
		TabFactory.INSTANCE.addDotCharMatrix(folder, dotCharMatrixItem);
		
		//
		// LCD Char Dot Matrix Display
		//

		TabItem oscilloscopesItem = new TabItem(folder, SWT.BOTTOM);
		oscilloscopesItem.setText("Oscilloscopes");
		TabFactory.INSTANCE.addOscilloscope(folder, oscilloscopesItem);
		
		//
		// Dot Matrix Display
		//

		/*
		TabItem dotMatrixItem = new TabItem(folder, SWT.BOTTOM);
		dotMatrixItem.setText("Dot Matrix");
		TabFactory.INSTANCE.addDotMatrix(folder, dotMatrixItem);
		*/
		
		//
		// Fonts
		//

		TabItem fontsItem = new TabItem(folder, SWT.BOTTOM);
		fontsItem.setText("Fonts");
		TabFactory.INSTANCE.addLCDFonts(folder, fontsItem);
		
		//
		// Video
		//
		/*
		TabItem videoItem = new TabItem(folder, SWT.BOTTOM);
		videoItem.setText("Video");
		TabFactory.INSTANCE.addVideo(folder, videoItem);
		*/
		//
		// GoogleMap
		//

		TabItem mapItem = new TabItem(folder, SWT.BOTTOM);
		mapItem.setText("Map");
		TabFactory.INSTANCE.addGMap(folder, mapItem);
		
		//
		// UbiColorPalette
		//
		TabItem tabColorPalette = new TabItem(folder, SWT.BOTTOM);
		tabColorPalette.setText("Color Palette");
		TabFactory.INSTANCE.addColorPalette(folder, tabColorPalette);

		//
		// All Together
		//
		/*
		TabItem all = new TabItem(folder, SWT.BOTTOM);
		all.setText("All");
		TabFactory.INSTANCE.addAll(folder, all);
		*/
	}
	
	
	private String getTestString(int ndDigits) {
		curPos = curPos < 0 ? 0 : curPos;
		curPos = curPos >= TEST_STRING.length() ? 0 : curPos;
		
		String first	= TEST_STRING.substring(curPos);
		String second	= "";
		if (first.length() < ndDigits) {
			second	= TEST_STRING.substring(0, (ndDigits - first.length()));
		} else {
			first = first.substring(0, ndDigits);
		}
		return first + second;
	}
	
	class Random5DigitUpdater extends Thread {
		Random randomizer;
		public Random5DigitUpdater() {
			super("");
			randomizer = new Random();
		}
		@Override
		public void run() {
			final String v = randomizer.nextInt(10000)+"";
			Display.getDefault().syncExec(
				new Runnable() {
					@Override
					public void run() {
						vu.setText(v);
						vu.redraw();
						System.out.println(v);
						
						String t = getTestString(10);
						dualPhabet2.setText(t);
						System.out.println(t);
						curPos++;
					}
				}
			);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			run();
		}
	}
	
	
	void add16Segment2(TabFolder folder, TabItem item) {
		Composite container = new Composite(folder, SWT.NONE);
		container.setLayout(GridLayoutFactory.fillDefaults().create());
		container.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		
		vu = new SixteenSegmentsDisplay(container, 5, SWT.HORIZONTAL);
		vu.setText(""+58249);
		vu.setLayout(GridLayoutFactory.fillDefaults().create());
		vu.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).hint(200, 50).create());
		
		
		
		/*
		SixteenSegmentsDisplay alphabetLowercase = new SixteenSegmentsDisplay(container, 26, SWT.HORIZONTAL);
		alphabetLowercase.setText("abcdefghijklmnopqrstuvwxyz");
		alphabetLowercase.setLayout(GridLayoutFactory.fillDefaults().create());
		alphabetLowercase.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).grab(true, true).create());
		
		SixteenSegmentsDisplay alphabetUppercase = new SixteenSegmentsDisplay(container, 26, SWT.HORIZONTAL);
		alphabetUppercase.setText("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		alphabetUppercase.setLayout(GridLayoutFactory.fillDefaults().create());
		alphabetUppercase.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).grab(true, true).create());
		
		SixteenSegmentsDisplay numbers = new SixteenSegmentsDisplay(container, 10, SWT.HORIZONTAL);
		numbers.setText("0123456789");
		numbers.setLayout(GridLayoutFactory.fillDefaults().create());
		numbers.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).grab(true, true).create());
	
		SixteenSegmentsDisplay ubqRocks = new SixteenSegmentsDisplay(container, 17, SWT.HORIZONTAL);
		ubqRocks.setText("Ubiquisense Rocks");
		ubqRocks.setLayout(GridLayoutFactory.fillDefaults().create());
		ubqRocks.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).grab(true, true).create());
		
		SixteenSegmentsDisplay dualPhabet1 = new SixteenSegmentsDisplay(container, 26, SWT.HORIZONTAL);
		dualPhabet1.setText("AaBbCcDdEeFfGgHhIiJjKkLlMm");
		dualPhabet1.setLayout(GridLayoutFactory.fillDefaults().create());
		dualPhabet1.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).hint(52*20, 500).grab(true, true).create());

		*/

		dualPhabet2 = new SixteenSegmentsDisplay(container, 10, SWT.HORIZONTAL);
		dualPhabet2.setText("0 1 2 3 4 ");
		dualPhabet2.setForeground(ColorConstants.orange);
		dualPhabet2.setLayout(GridLayoutFactory.fillDefaults().create());
		dualPhabet2.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).hint(300, 50).create());

		item.setControl(container);
	}


	@Override
	public void setFocus() {
	}

}
