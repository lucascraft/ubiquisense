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

import net.sf.smbt.ui.widgets.Activator;
import net.sf.smbt.ui.widgets.common.ColorsUtil;
import net.sf.smbt.ui.widgets.common.FontUtils;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

public class ShowCase {
	
	public final static ShowCase INSTANCE = new ShowCase(); 
	private static Display display;
	private static Shell shell;
	
	public static void main(String[] args) {
		display = new Display();
		INSTANCE.launchAllDemos();
	}
	
	void launchAllDemos() {
		shell = new Shell(display, SWT.BORDER | SWT.CLOSE | SWT.RESIZE);
		shell.setLayout (new GridLayout());
		shell.addListener(SWT.Traverse, new Listener() {
			public void handleEvent(Event event) {
				switch (event.detail) {
		        	case SWT.TRAVERSE_ESCAPE:
		        		shell.close();
		        		event.detail = SWT.TRAVERSE_NONE;
		        		event.doit = false;
		        		break;
		        	}
		      	}
		    }
		);
		shell.setBackground(ColorsUtil.BG);
		
		TabFolder folder = new TabFolder(shell, SWT.TOP);
		folder.setLayout(GridLayoutFactory.fillDefaults().create());
		folder.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		folder.setBackground(ColorsUtil.BG);

		//
		// Db Meter
		//
		/*
		TabItem tabDbMeter = new TabItem(folder, SWT.BOTTOM);
		tabDbMeter.setText("Db Meter");
		TabFactory.INSTANCE.addUbiDbMeter(folder, tabDbMeter);
		*/

		//
		// EQ Meter
		//
		/*
		TabItem tabEQ = new TabItem(folder, SWT.BOTTOM);
		tabEQ.setText("Equalizer");
		TabFactory.INSTANCE.addUbiEQ(folder, tabEQ);
		*/

		//
		// Advanced EQ Meter
		//
		/*
		TabItem tabEQAdvanced = new TabItem(folder, SWT.BOTTOM);
		tabEQAdvanced.setText("Advanced Equalizer");
		TabFactory.INSTANCE.addAdvancedEQ8(folder, tabEQAdvanced);
		*/
		
		//
		// Advanced Knobs
		//
		/*
		TabItem tabKnob = new TabItem(folder, SWT.BOTTOM);
		tabKnob.setText("Knobs");
		addKnobs(folder, tabKnob);
		
		//
		// Advanced Knob Grid
		//
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
		
		
		if (isEclipseRunning()) {
			//
			// 7 segments
			//
			if (!FontUtils.INSTANCE.getFonts().isEmpty()) {
				TabItem tab7Segments = new TabItem(folder, SWT.BOTTOM);
				tab7Segments.setText("7 Segments");
				TabFactory.INSTANCE.add7Segments(folder, tab7Segments);
			}
		}
		
		//
		// 16 segments
		//
		TabItem tab16Segments = new TabItem(folder, SWT.BOTTOM);
		tab16Segments.setText("16 Segments");
		TabFactory.INSTANCE.add16Segments(folder, tab16Segments);
		
		//
		// Dot Matrix
		//
		TabItem dotMatrix = new TabItem(folder, SWT.BOTTOM);
		dotMatrix.setText("Dot Matrix");
		TabFactory.INSTANCE.addDotCharMatrix(folder, dotMatrix);
		
		//
		// Color Palette
		//
		TabItem tabColorPalette = new TabItem(folder, SWT.BOTTOM);
		tabColorPalette.setText("Color Palette");
		TabFactory.INSTANCE.addColorPalette(folder, tabColorPalette);
		
		//
		// Color Palette
		//
		TabItem tabSwtJFreeChart = new TabItem(folder, SWT.BOTTOM);
		tabSwtJFreeChart.setText("Charts");
		TabFactory.INSTANCE.addCharts(folder, tabSwtJFreeChart);
		

		//
		// Font (LCD ...)
		//
		/*
		TabItem lcdFont = new TabItem(folder, SWT.BOTTOM);
		tab16Segments.setText("Fonts");
		TabFactory.INSTANCE.addLCDFonts(folder, lcdFont);
		*/
		
		//
		// All Together
		//
		/*
		TabItem all = new TabItem(folder, SWT.BOTTOM);
		all.setText("All");
		TabFactory.INSTANCE.addAll(folder, all);
		*/
		shell.setSize(800, 600);
		
		//shell.setFullScreen(true);
		
		shell.open();
		while (!shell.isDisposed ()) {
			if (!display.readAndDispatch ()) display.sleep ();
		}
		display.dispose ();

	}
	
	private boolean isEclipseRunning() {
		return Activator.getDefault() != null && Activator.getDefault().getBundle() != null;
	}

}
