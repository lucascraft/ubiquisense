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

package net.sf.smbt.ui.widgets.showcase;

import java.awt.BasicStroke;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Random;

import net.sf.smbt.ui.colors.UbiColorWheel;
import net.sf.smbt.ui.pachube.gmap.GMap;
import net.sf.smbt.ui.pachube.gmap.MapAdapter;
import net.sf.smbt.ui.video.VideoComposite;
import net.sf.smbt.ui.video.VideoHelper;
import net.sf.smbt.ui.widgets.common.ColorsUtil;
import net.sf.smbt.ui.widgets.common.FontUtils;
import net.sf.smbt.ui.widgets.common.GeoUtils;
import net.sf.smbt.ui.widgets.common.ImageUtils;
import net.sf.smbt.ui.widgets.common.TimedDataUtils;
import net.sf.smbt.ui.widgets.dialogs.UbiColorPickerDialog;
import net.sf.smbt.ui.widgets.leds.DotMatrixUtils;
import net.sf.smbt.ui.widgets.utils.SelfTimedRange;
import net.sf.smbt.ui.widgets.utils.TimedValue;
import net.sf.smbt.ui.widgets.vu.DotMatrixCharDisplay;
import net.sf.smbt.ui.widgets.vu.DotMatrixDisplay;
import net.sf.smbt.ui.widgets.vu.SevenSegmentsDisplay;
import net.sf.smbt.ui.widgets.vu.SixteenSegmentsDisplay;
import net.sf.smbt.ui.widgets.vu.UbiDbMeter;
import net.sf.smbt.ui.widgets.vu.UbiEQ;
import net.sf.smbt.ui.widgets.vu.UbiEQAdvanced;
import net.sf.smbt.ui.widgets.vu.UbiKnob;
import net.sf.smbt.ui.widgets.vu.UbiKnobGrid;
import net.sf.smbt.ui.widgets.vu.UbiOscilloscope;
import net.sf.smbt.ui.widgets.vu.UbiSelectionListener;
import net.sf.smbt.ui.widgets.vu.UbiSlider;
import net.sf.smbt.ui.widgets.vu.UbiTimed2DChart;
import net.sf.smbt.ui.widgets.vu.UbiVuMeter;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.progress.UIJob;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.date.DateUtilities;
import org.jfree.experimental.chart.swt.ChartComposite;


public class TabFactory {
	
	public final static TabFactory INSTANCE = new TabFactory();

	private Label labelH1, labelH2, labelH3, l1, l2, l3, lcdLabel1, lcdLabel2, lbl;
	private UbiSlider hslider1, hslider2, hslider3, vslider1, vslider2, vslider3;
	private UbiVuMeter vuH1, vuV1;
	private UbiOscilloscope oscH1;
	private UbiTimed2DChart t2dChart;
	private SevenSegmentsDisplay disp7Segments1;
	private SixteenSegmentsDisplay disp16Segments1, disp16Segments2;
	private DotMatrixCharDisplay dotMatrixDisplay;
	private DotMatrixDisplay matrixDisplay;
	private UbiKnob richKnob1, 	richKnob2, 	richKnob3, 	richKnob4, 	richKnob5, 	
					richKnob6, 	richKnob7, 	richKnob8, richKnob9, 	richKnob10, 
					richKnob11, richKnob12, richKnob13, richKnob14, richKnob15, 
					richKnob16, richKnob17, richKnob18, richKnob19, richKnob20, 
					richKnob21, richKnob22, richKnob23, 
					basicKnob;
	
	private Random randomizer;
	
	private static SliderAnimationJob 		sliderAnimationJob;
	private static DotMatrixAnimationJob 	dotMatrixAnimationJob;
	private static DotMatrixAnimationJob2 	dotMatrixAnimationJob2;
	private static B16SegmentsAnimationJob 	b16AnimationJob;
	private static B7SegmentsAnimationJob 	b7AnimationJob;
	private static VusAnimationJob 			vusAnimationJob;
	private static KnobAnimationJob			knobAnimationJob;
	private static FontAnimationJob			fontAnimationJob;
	private static OscilloscopeAnimationJob oscAnimationJob;
	
	private Button 	slidersStimulationButton, 
					matrixStimulationButton, 
					matrixStimulationButton2, 
					b7StimulationButton, 
					b16StimulationButton, 
					knobStimulationButton, 
					vusStimulationButton, 
					oscStimulationButton, 
					fontStimulationButton;
	
	public TabFactory() {
		randomizer				= new Random();
		
		sliderAnimationJob		= new SliderAnimationJob();
		dotMatrixAnimationJob	= new DotMatrixAnimationJob();
		dotMatrixAnimationJob2	= new DotMatrixAnimationJob2();
		b16AnimationJob			= new B16SegmentsAnimationJob();
		b7AnimationJob			= new B7SegmentsAnimationJob();
		vusAnimationJob			= new VusAnimationJob();
		knobAnimationJob		= new KnobAnimationJob();
		fontAnimationJob		= new FontAnimationJob();
		oscAnimationJob			= new OscilloscopeAnimationJob();
	}
	
	public void dispose() {
		sliderAnimationJob.cancel();
		dotMatrixAnimationJob.cancel();
		dotMatrixAnimationJob2.cancel();
		b16AnimationJob.cancel();
		b7AnimationJob.cancel();
		vusAnimationJob.cancel();
		knobAnimationJob.cancel();
		fontAnimationJob.cancel();
	}
	
	class FontAnimationJob extends UIJob {
		int idx = 0;
		List<Font> fonts;
		public FontAnimationJob() {
			super("Font Animation Job");
			setSystem(true);
			setPriority(INTERACTIVE);
			fonts = new ArrayList<Font>();
			try {
				fonts = FontUtils.INSTANCE.getFonts();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			Font font = fonts.get(idx);
			if (font != null && font.getFontData()[0] != null) {
				FontData fd = font.getFontData()[0];
				lcdLabel1.setFont(font);
				
				String str = (idx+1) + "/" + fonts.size() + " : " + fd.getName() + " " + fd.getHeight();
				
				lcdLabel1.setText(str);
				
				lcdLabel2.setText(str);
			}
			idx = idx>=(fonts.size()-1) ? 0 : idx + 1;
			lcdLabel1.redraw();
			schedule(200);
			return Status.OK_STATUS;
		}
	}
	
	class KnobAnimationJob extends UIJob {
		public KnobAnimationJob() {
			super("Knob Animation Job");
			setSystem(true);
			setPriority(INTERACTIVE);
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			richKnob1.setValue(new Float(randomizer.nextInt(100)));
			richKnob2.setValue(new Float(randomizer.nextInt(100)));
			richKnob3.setValue(new Float(randomizer.nextInt(100)));
			richKnob4.setValue(new Float(randomizer.nextInt(100)));
			richKnob5.setValue(new Float(randomizer.nextInt(100)));
			richKnob6.setValue(new Float(randomizer.nextInt(100)));
			richKnob7.setValue(new Float(randomizer.nextInt(100)));
			richKnob8.setValue(new Float(randomizer.nextInt(100)));
			richKnob9.setValue(new Float(randomizer.nextInt(100)));
			richKnob10.setValue(new Float(randomizer.nextInt(100)));
			richKnob11.setValue(new Float(randomizer.nextInt(100)));
			richKnob12.setValue(new Float(randomizer.nextInt(100)));
			richKnob13.setValue(new Float(randomizer.nextInt(100)));
			richKnob14.setValue(new Float(randomizer.nextInt(100)));
			richKnob15.setValue(new Float(randomizer.nextInt(100)));
			richKnob16.setValue(new Float(randomizer.nextInt(100)));
			richKnob17.setValue(new Float(randomizer.nextInt(100)));
			richKnob18.setValue(new Float(randomizer.nextInt(100)));
			richKnob19.setValue(new Float(randomizer.nextInt(100)));
			richKnob20.setValue(new Float(randomizer.nextInt(100)));
			richKnob21.setValue(new Float(randomizer.nextInt(100)));
			richKnob22.setValue(new Float(randomizer.nextInt(100)));
			richKnob23.setValue(new Float(randomizer.nextInt(100)));

			basicKnob.setValue(new Float(randomizer.nextInt(100)));
			schedule(75);
			return Status.OK_STATUS;
		}
	}
	
	class B7SegmentsAnimationJob extends UIJob {
		public B7SegmentsAnimationJob() {
			super("7 Segments Animation Job");
			setSystem(true);
			setPriority(INTERACTIVE);
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			String nb = ""+randomizer.nextInt(100000);
			disp7Segments1.setText(nb);
			lbl.setText(nb);
			schedule(75);
			return Status.OK_STATUS;
		}
	}
	
	class B16SegmentsAnimationJob extends UIJob {
		String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		int idx;
		public B16SegmentsAnimationJob() {
			super("16 Segments Animation Job");
			setSystem(true);
			setPriority(INTERACTIVE);
			idx = 0;
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			if (idx>=alphabet.length()) {
				idx = 0;
			}
			idx++;
			
			String lastPhabet = alphabet.substring(idx);
			int end = (idx >= (lastPhabet.length()-5)) ? lastPhabet.length() : 6;
			
			disp16Segments1.setText(lastPhabet.substring(0, end));
			disp16Segments2.setText(""+randomizer.nextFloat()*10000f);
			
			
			schedule(75);
			return Status.OK_STATUS;
		}
	}
	
	class DotMatrixAnimationJob2 extends UIJob {
		String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		int idx;
		public DotMatrixAnimationJob2() {
			super("Matrix Animation Job 2");
			setSystem(true);
			setPriority(INTERACTIVE);
			idx = 0;
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			dotMatrixDisplay.setText(0, "Ubiquisense");
			dotMatrixDisplay.setText(1, ""+randomizer.nextFloat()*100f);
			
			if (idx>=alphabet.length()) {
				idx = 0;
			}
			idx++;
			
			String lastPhabet = alphabet.substring(idx);
			int end = (idx >= (lastPhabet.length()-5)) ? lastPhabet.length() : 6;
			
			dotMatrixDisplay.setText(2, lastPhabet.substring(0, end));
			
			schedule(75);
			return Status.OK_STATUS;
		}
	}
	
	class DotMatrixAnimationJob extends UIJob {
		String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		int idx;
		public DotMatrixAnimationJob() {
			super("Matrix Animation Job");
			setSystem(true);
			setPriority(INTERACTIVE);
			idx = 0;
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			dotMatrixDisplay.setText(0, "Ubiquisense");
			dotMatrixDisplay.setText(1, ""+randomizer.nextFloat()*100f);
			
			if (idx>=alphabet.length()) {
				idx = 0;
			}
			idx++;
			
			String lastPhabet = alphabet.substring(idx);
			int end = (idx >= (lastPhabet.length()-5)) ? lastPhabet.length() : 6;
			
			dotMatrixDisplay.setText(2, lastPhabet.substring(0, end));
			
			schedule(75);
			return Status.OK_STATUS;
		}
	}

	
	class SliderAnimationJob extends UIJob {
		public SliderAnimationJob() {
			super("Slider Animation Job");
			setSystem(true);
			setPriority(INTERACTIVE);
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			if (hslider1 != null) {
				hslider1.setLevel(randomizer.nextFloat()*100f);
				hslider1.setLLevel(randomizer.nextFloat()*100f);
				hslider1.setRLevel(randomizer.nextFloat()*100f);
			}
			if (hslider2 != null) {
				hslider2.setLevel(randomizer.nextFloat()*100f);
				hslider2.setLLevel(randomizer.nextFloat()*100f);
				hslider2.setRLevel(randomizer.nextFloat()*100f);
			}
			if (hslider3 != null) {
				hslider3.setLevel(randomizer.nextFloat()*100f);
				hslider3.setLLevel(randomizer.nextFloat()*100f);
				hslider3.setRLevel(randomizer.nextFloat()*100f);
			}
			if (vslider1 != null) {
				vslider1.setLevel(randomizer.nextFloat()*100f);
				vslider1.setLLevel(randomizer.nextFloat()*100f);
				vslider1.setRLevel(randomizer.nextFloat()*100f);
			}
			if (vslider2 != null) {
				vslider2.setLevel(randomizer.nextFloat()*100f);
				vslider2.setLLevel(randomizer.nextFloat()*100f);
				vslider2.setRLevel(randomizer.nextFloat()*100f);
			}
			if (vslider3 != null) {
				vslider3.setLevel(randomizer.nextFloat()*100f);
				vslider3.setLLevel(randomizer.nextFloat()*100f);
				vslider3.setRLevel(randomizer.nextFloat()*100f);
			}
			schedule(75);
			return Status.OK_STATUS;
		}
	}
	
	class VusAnimationJob extends UIJob {
		public VusAnimationJob() {
			super("Vus Animation Job");
			setSystem(true);
			setPriority(INTERACTIVE);
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			if (vuH1 != null) {
				vuH1.setLevel(randomizer.nextFloat()*100f);
			}
			if (vuV1 != null) {
				vuV1.setLevel(randomizer.nextFloat()*100f);
			}
			schedule(75);
			return Status.OK_STATUS;
		}
	}
	
	class OscilloscopeAnimationJob extends UIJob {
		public OscilloscopeAnimationJob() {
			super("Oscilloscopes Animation Job");
			setSystem(true);
			setPriority(INTERACTIVE);
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			if (oscH1 != null) {
				oscH1.pushValue(randomizer.nextFloat()*100f);
			}
			schedule(75);
			return Status.OK_STATUS;
		}
	}
	
	public void addUbiSlider(TabFolder folder, TabItem item) {
		Composite container = new Composite(folder, SWT.NONE);
		container.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		container.setLayoutData(GridDataFactory.fillDefaults().minSize(SWT.DEFAULT, 300).grab(true, true).create());
		
		slidersStimulationButton = new Button(container, SWT.TOGGLE);
		slidersStimulationButton.setLayoutData(GridDataFactory.fillDefaults().span(2, 1).align(SWT.BEGINNING, SWT.BOTTOM).create());
		slidersStimulationButton.setText("Animate");
		slidersStimulationButton.addSelectionListener(
			new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (slidersStimulationButton.getSelection()) {
						sliderAnimationJob.schedule();
					} else {
						sliderAnimationJob.cancel();
					}
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
		);


		Composite hcontainer = new Composite(container, SWT.NONE);
		hcontainer.setLayout(GridLayoutFactory.fillDefaults().create());
		hcontainer.setLayoutData(GridDataFactory.fillDefaults().minSize(SWT.DEFAULT, 200).grab(true, true).create());

		hslider1 = new UbiSlider(hcontainer, SWT.HORIZONTAL);
		hslider1.setMax(100);
		hslider1.setLayout(GridLayoutFactory.fillDefaults().create());
		hslider1.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).hint(200, 20).minSize(200, 20).create());
		hslider1.setLevel(50);
		hslider1.setSelection(30);
		hslider1.setValue(50f);
		hslider1.addSelectionListener(new UbiSelectionListener() {
			@Override
			public void handle() {
				labelH1.setText(""+hslider1.getValue());
				hslider2.setValue(hslider1.getValue());
			}
		});
		
		labelH1 = new Label(hcontainer, SWT.NONE);
		labelH1.setText("---");
		
		hslider2 = new UbiSlider(hcontainer, SWT.HORIZONTAL);
		hslider2.setMax(100);
		hslider2.setLayout(GridLayoutFactory.fillDefaults().create());
		hslider2.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).hint(200, 20).minSize(200, 20).create());
		hslider2.setLevel(50);
		hslider2.setSelection(30);
		hslider2.addSelectionListener(new UbiSelectionListener() {
			@Override
			public void handle() {
				labelH2.setText(""+hslider2.getValue());
			}
		});

		labelH2 = new Label(hcontainer, SWT.NONE);
		labelH2.setText("---");

		hslider3 = new UbiSlider(hcontainer, SWT.HORIZONTAL);
		hslider3.setMax(100);
		hslider3.setLayout(GridLayoutFactory.fillDefaults().create());
		hslider3.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).hint(200, 20).minSize(200, 20).create());
		hslider3.setLevel(50);
		hslider3.setSelection(30);
		hslider3.addSelectionListener(new UbiSelectionListener() {
			@Override
			public void handle() {
				labelH3.setText(""+hslider3.getValue());
			}
		});

		labelH3 = new Label(hcontainer, SWT.NONE);
		labelH3.setText("---");

		Composite vcontainer = new Composite(container, SWT.NONE);
		vcontainer.setLayout(GridLayoutFactory.fillDefaults().numColumns(6).create());
		vcontainer.setLayoutData(GridDataFactory.fillDefaults().minSize(SWT.DEFAULT, 300).grab(true, true).create());
		
		vslider1 = new UbiSlider(vcontainer, SWT.VERTICAL);
		vslider1.setMax(100);
		vslider1.setLayout(GridLayoutFactory.fillDefaults().create());
		vslider1.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.BOTTOM).hint(20, 200).minSize(20, 200).create());
		vslider1.setLevel(50);
		vslider1.setSelection(30);
		
		l1 = new Label(vcontainer, SWT.NONE);
		l1.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.BOTTOM).hint(20, 20).minSize(20, 20).create());
		l1.setText("---");
	
		vslider1.addSelectionListener(new UbiSelectionListener() {
			@Override
			public void handle() {
				l1.setText(""+vslider1.getValue());
				vslider2.setValue(vslider1.getValue());
			}
		});
		
		vslider2 = new UbiSlider(vcontainer, SWT.VERTICAL);
		vslider2.setMax(100);
		vslider2.setLayout(GridLayoutFactory.fillDefaults().create());
		vslider2.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.BOTTOM).hint(20, 200).minSize(20, 200).create());
		vslider2.setLevel(50);
		vslider2.setSelection(30);
		
		l2 = new Label(vcontainer, SWT.NONE);
		l2.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.BOTTOM).hint(20, 20).minSize(20, 20).create());
		l2.setText("---");
		
		vslider2.addSelectionListener(new UbiSelectionListener() {
			@Override
			public void handle() {
				l2.setText(""+vslider2.getValue());
			}
		});
		
		vslider3 = new UbiSlider(vcontainer, SWT.VERTICAL);
		vslider3.setMax(100);
		vslider3.setLayout(GridLayoutFactory.fillDefaults().create());
		vslider3.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.BOTTOM).hint(20, 200).minSize(20, 200).create());
		vslider3.setLevel(50);
		vslider3.setSelection(30);
		
		l3 = new Label(vcontainer, SWT.NONE);
		l3.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.BOTTOM).hint(20, 20).minSize(20, 20).create());
		l3.setText("---");

		vslider3.addSelectionListener(new UbiSelectionListener() {
			@Override
			public void handle() {
				l3.setText(""+vslider3.getValue());
			}
		});
		
		item.setControl(container);
		container.update();
	}
	
	public void addVuMeter(TabFolder folder, TabItem item) {
		Composite container = new Composite(folder, SWT.NONE);
		container.setLayout(GridLayoutFactory.fillDefaults().create());
		container.setLayoutData(GridDataFactory.fillDefaults().minSize(SWT.DEFAULT, 300).grab(true, true).create());

		vusStimulationButton = new Button(container, SWT.TOGGLE);
		vusStimulationButton.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.BOTTOM).create());
		vusStimulationButton.setText("Animate");
		vusStimulationButton.addSelectionListener(
			new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (vusStimulationButton.getSelection()) {
						vusAnimationJob.schedule();
					} else {
						vusAnimationJob.cancel();
					}
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
		);


		Composite hcontainer = new Composite(container, SWT.NONE);
		hcontainer.setLayout(GridLayoutFactory.fillDefaults().create());
		hcontainer.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());

		vuH1 = new UbiVuMeter(hcontainer, SWT.HORIZONTAL);
		vuH1.setMax(100f);
		vuH1.setLayout(GridLayoutFactory.fillDefaults().create());
		vuH1.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).hint(200, 20).minSize(200, 20).create());
		vuH1.setLevel(66f);
		
		Composite vcontainer = new Composite(container, SWT.NONE);
		vcontainer.setLayout(GridLayoutFactory.fillDefaults().create());
		vcontainer.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());

		vuV1 = new UbiVuMeter(vcontainer, SWT.VERTICAL);
		vuV1.setMax(100f);
		vuV1.setLayout(GridLayoutFactory.fillDefaults().create());
		vuV1.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.BOTTOM).hint(20, 200).minSize(20, 200).create());
		vuV1.setLevel(66f);
		vuV1.setLevel(66f);
		
		item.setControl(container);
	}
	
	
	//
	public void addTimed2DChart(TabFolder folder, TabItem item) {
		Composite container = new Composite(folder, SWT.NONE);
		container.setLayout(GridLayoutFactory.fillDefaults().create());
		container.setLayoutData(GridDataFactory.fillDefaults().minSize(SWT.DEFAULT, 300).grab(true, true).create());

		SelfTimedRange<TimedValue> str = TimedDataUtils .INSTANCE .genRandomTimeValues();
		
		Date d1 = new Date();
		Date d2 = new Date();
		
		ArrayList<TimedValue> timedValues = new ArrayList<TimedValue>(str.getTimeValues());
		if (!timedValues.isEmpty()) {
			TimedValue v2 = timedValues.get(timedValues.size()-1);
			if (v2.getD() != null) {
				d2 = v2.getD();
			}
			if (timedValues.size() > 1) {
				d1 = timedValues.get(0).getD();
			}
		}

		t2dChart = new UbiTimed2DChart(
			container, 
			UbiTimed2DChart.STYLE_LINES, 
			str.getMinValueOverall(), 
			str.getMaxValueOverall(), 
			"X", "Chart", 
			d2, d1, 
			str.getTimeValues().toArray(new TimedValue[0])
		);
		
		t2dChart.setLayout(GridLayoutFactory.fillDefaults().create());
		t2dChart.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		
		item.setControl(container);
	}
	
	
	public void addOscilloscope(TabFolder folder, TabItem item) {
		Composite container = new Composite(folder, SWT.NONE);
		container.setLayout(GridLayoutFactory.fillDefaults().create());
		container.setLayoutData(GridDataFactory.fillDefaults().minSize(SWT.DEFAULT, 300).grab(true, true).create());

		oscStimulationButton = new Button(container, SWT.TOGGLE);
		oscStimulationButton.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.BOTTOM).create());
		oscStimulationButton.setText("Animate");
		oscStimulationButton.addSelectionListener(
			new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (oscStimulationButton.getSelection()) {
						oscAnimationJob.schedule();
					} else {
						oscAnimationJob.cancel();
					}
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
		);


		Composite hcontainer = new Composite(container, SWT.NONE);
		hcontainer.setLayout(GridLayoutFactory.fillDefaults().create());
		hcontainer.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());

		oscH1 = new UbiOscilloscope(hcontainer, 500);
		oscH1.setLayout(GridLayoutFactory.fillDefaults().create());
		oscH1.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).grab(true, false).hint(250, 50).minSize(250, 50).create());
		
		
		
		item.setControl(container);
	}
	
	   public static XYDataset createStepXYDataset() {

	        final int feb = 2;
	        final XYSeries s1 = new XYSeries("Plan 1", false, true);
	        s1.add(DateUtilities.createDate(2002, feb, 19, 8, 0).getTime(), 0);
	        s1.add(DateUtilities.createDate(2002, feb, 19, 8, 1).getTime(), 2);
	        s1.add(DateUtilities.createDate(2002, feb, 19, 9, 5).getTime(), 4);
	        s1.add(DateUtilities.createDate(2002, feb, 19, 10, 6).getTime(), 4);
	        s1.add(DateUtilities.createDate(2002, feb, 19, 11, 6).getTime(), 5);
	        s1.add(DateUtilities.createDate(2002, feb, 19, 12, 6).getTime(), 3);
	        s1.add(DateUtilities.createDate(2002, feb, 19, 13, 6).getTime(), 6);
	        s1.add(DateUtilities.createDate(2002, feb, 19, 14, 6).getTime(), 6);
	        s1.add(DateUtilities.createDate(2002, feb, 19, 15, 30).getTime(), 2);
	        s1.add(DateUtilities.createDate(2002, feb, 19, 16, 7).getTime(), 0);

	        final XYSeries s2 = new XYSeries("Plan 2");
	        s2.add(DateUtilities.createDate(2002, feb, 19, 8, 40).getTime(), 0);
	        s2.add(DateUtilities.createDate(2002, feb, 19, 8, 45).getTime(), 1);
	        s2.add(DateUtilities.createDate(2002, feb, 19, 9, 0).getTime(), 6);
	        s2.add(DateUtilities.createDate(2002, feb, 19, 10, 6).getTime(), 2);
	        s2.add(DateUtilities.createDate(2002, feb, 19, 10, 45).getTime(), 4);
	        s2.add(DateUtilities.createDate(2002, feb, 19, 12, 0).getTime(), 7);
	        s2.add(DateUtilities.createDate(2002, feb, 19, 13, 0).getTime(), 5);
	        s2.add(DateUtilities.createDate(2002, feb, 19, 14, 6).getTime(), 4);
	        s2.add(DateUtilities.createDate(2002, feb, 19, 15, 15).getTime(), 4);
	        s2.add(DateUtilities.createDate(2002, feb, 19, 16, 0).getTime(), 0);

	        final XYSeriesCollection dataset = new XYSeriesCollection();
	        dataset.addSeries(s1);
	        dataset.addSeries(s2);
	        return dataset;
	    }
	public void addCharts(TabFolder folder, TabItem item) {
	
        // create a default chart based on some sample data...
        final String title = "LCACs in use at given time";
        final String xAxisLabel = "Time";
        final String yAxisLabel = "Number of Transports";

        final XYDataset data = createStepXYDataset();

        final JFreeChart chart = ChartFactory.createXYStepChart(
            title,
            xAxisLabel, yAxisLabel,
            data,
            PlotOrientation.VERTICAL,
            true,   // legend
            true,   // tooltips
            false   // urls
        );

        // then customise it a little...
        chart.setBackgroundPaint(new java.awt.Color(216, 216, 216));
        final XYPlot plot = chart.getXYPlot();
        plot.getRenderer().setSeriesStroke(0, new BasicStroke(2.0f));
        plot.getRenderer().setSeriesStroke(1, new BasicStroke(2.0f));
        
        // and present it in a frame...
        
		
		ChartComposite cc = new ChartComposite(folder, SWT.NONE, chart, true);
		cc.setLayout(GridLayoutFactory.fillDefaults().create());
		cc.setLayoutData(GridDataFactory.fillDefaults().create());
		
		folder.layout(true);
		
		cc.layout(true);
	}
	
	Canvas rgbCanvas;
	public void addColorPalette(TabFolder folder, TabItem item) {
		Composite container = new Composite(folder, SWT.NONE);
		container.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		container.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		
		/*
		UbiColorPalette colorPalette = new UbiColorPalette(container);
		colorPalette.setLayout(GridLayoutFactory.fillDefaults().create());
		colorPalette.setLayoutData(GridDataFactory.fillDefaults().hint(300, 150).grab(true, true).create());
		*/
		
		Composite container2 = new Composite(container, SWT.NONE);
		container2.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		container2.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());

		
		UbiColorWheel colorWheel1 = new UbiColorWheel(container2);
		colorWheel1.setLayout(GridLayoutFactory.fillDefaults().create());
		colorWheel1.setLayoutData(GridDataFactory.fillDefaults().span(2, 1).hint(200, 200).minSize(100, 100).grab(false, false).create());
		
		Composite container3 = new Composite(container, SWT.NONE);
		container3.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		container3.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());

		Button colorPickerButton = new Button(container3, SWT.PUSH);
		colorPickerButton.setText("Color...");
		colorPickerButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				UbiColorPickerDialog dlg = new UbiColorPickerDialog(Display.getDefault().getActiveShell());
				int status = dlg.open();
				if (status == Window.OK) {
					Color color = ColorsUtil.INSTANCE.getColor(dlg.getRGB());
					rgbCanvas.setBackground(color);
					rgbCanvas.setForeground(color);
					rgbCanvas.redraw();
				}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
		
		rgbCanvas = new Canvas(container3, SWT.NONE);
		rgbCanvas.setLayout(GridLayoutFactory.fillDefaults().create());
		rgbCanvas.setLayoutData(GridDataFactory.fillDefaults().hint(200, 100).create());
		rgbCanvas.setBackground(ColorConstants.gray);
		rgbCanvas.setForeground(ColorConstants.gray);

		
		item.setControl(container);
	}
	
	public void add7Segments(TabFolder folder, TabItem item) {
		Composite container = new Composite(folder, SWT.NONE);
		container.setLayout(GridLayoutFactory.fillDefaults().create());
		container.setLayoutData(GridDataFactory.fillDefaults().minSize(SWT.DEFAULT, 300).grab(true, true).create());

		b7StimulationButton = new Button(container, SWT.TOGGLE);
		b7StimulationButton.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.BOTTOM).create());
		b7StimulationButton.setText("Animate");
		b7StimulationButton.addSelectionListener(
			new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (b7StimulationButton.getSelection()) {
						b7AnimationJob.schedule();
					} else {
						b7AnimationJob.cancel();
					}
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
		);
		disp7Segments1 = new SevenSegmentsDisplay(container, 5, SWT.HORIZONTAL);
		disp7Segments1.setText(""+36559);
		disp7Segments1.setLayout(GridLayoutFactory.fillDefaults().create());
		disp7Segments1.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.TOP).hint(250, 100).grab(true, true).create());
		
		lbl = new Label(container, SWT.NONE);
		lbl.setFont(FontUtils.INSTANCE.getFonts().get(22));
		lbl.setText("abc123");
		
		lbl.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		
		item.setControl(container);
	}
	
	
	public void addVideo(TabFolder folder, TabItem item) {
		Composite container = new Composite(folder, SWT.NONE);
		container.setLayout(GridLayoutFactory.fillDefaults().create());
		container.setLayoutData(GridDataFactory.fillDefaults().minSize(SWT.DEFAULT, 500).grab(true, true).create());

		VideoComposite videoComposite = new VideoComposite(container, SWT.NONE, null , 720, 500);
		videoComposite.setVideo(VideoHelper.INSTANCE.getPlayerPath() + "/ubiquisense-widgets-0_5.m4v");
		
		item.setControl(container);
	}
	

	static final private String INIT_CENTER = "33.0,5.0";
	static final private int INIT_ZOOM = 2;
	static final private int INIT_TYPE = net.sf.smbt.ui.pachube.gmap.GMap.TYPE_ROADMAP;

	GMap gmap;
	public void addGMap(TabFolder folder, TabItem item) {
		Composite container = new Composite(folder, SWT.NONE);
		container.setLayout(GridLayoutFactory.fillDefaults().create());
		container.setLayoutData(GridDataFactory.fillDefaults().minSize(SWT.DEFAULT, 300).grab(true, true).create());

		SashForm sash2 = new SashForm(container, SWT.HORIZONTAL);
		
		
		
	    gmap = new GMap(sash2, SWT.NONE );
	    gmap.setCenter( GeoUtils.stringToLatLng( INIT_CENTER ) );
	    gmap.setZoom( INIT_ZOOM );
	    gmap.setType( INIT_TYPE );

	    Composite controls = new Composite( sash2, SWT.BORDER );
	    controls.setLayout	( new GridLayout( 1, true ) );
	    createCenterControl	( sash2.getDisplay(), controls );
	    createZoomControl	( controls );
	    createMapTypeControl( controls );
	    createAddressControl( sash2.getDisplay(), controls );
	    //createMarkerControl	( sashRight.getDisplay(), controls );
	        
	    sash2.setWeights		( new int[] { 7, 1 } );

		
		item.setControl(container);
	}
	

	private void createCenterControl( Display display, Composite parent ) {
	    Label zoomLabel = new Label( parent, SWT.None );
	    zoomLabel.setText( "Location:" );
	    zoomLabel.setForeground(ColorsUtil.FG);
	    
	    final Text location = new Text( parent, SWT.BORDER );
	    location.setLayoutData( new GridData( SWT.FILL, SWT.TOP, true, false ) );
	    location.setText( INIT_CENTER );
	    location.setFont( new 	Font(display, "Arial", 9, SWT.NORMAL ) );
	    location.addModifyListener( new ModifyListener() {
	      public void modifyText( ModifyEvent event ) {
	        gmap.setCenter( GeoUtils.stringToLatLng( location.getText() ) );
	      }
	    } );
	    gmap.addMapListener( new MapAdapter() {
	      public void centerChanged() {
	        location.setText( gmap.getCenter().toString() );
	      }
	      public void markerSelected(String id) {}
	    } );
	    
	    //
	    // Cosm Lon/lat 
	    //
	    /*
	    gmap.addMapListener(
	    	new MapAdapter() {
	    		public void centerChanged() {
	    			float lat = new Double(gmap.getCenter().latitude).floatValue();
	    			float lon = new Double(gmap.getCenter().longitude).floatValue();
	    			queryAroundFeeds(lat, lon, radius);
	    		}
	    	}
	    );
	    */
	}

	private void createZoomControl( Composite controls ) {
	    Label zoomLabel = new Label( controls, SWT.None );
	    zoomLabel.setText( "Zoom:" );
	    zoomLabel.setForeground(ColorsUtil.FG);
	    final Spinner zoom = new Spinner( controls, SWT.NORMAL );
	    zoom.setMaximum( 20 );
	    zoom.setMinimum( 0 );
	    zoom.setSelection( INIT_ZOOM );
	    zoom.addModifyListener( new ModifyListener() {
	      public void modifyText( ModifyEvent event ) {
	        gmap.setZoom( Integer.parseInt( zoom.getText() ) );
	      }
	    } );
	    gmap.addMapListener( new MapAdapter() {
	      public void zoomChanged() {
	        zoom.setSelection( gmap.getZoom() );              
	      };
	      public void markerSelected(String id) {}
	    } );
	}

	private void createMapTypeControl( Composite parent ) {
	    Label typeLabel = new Label( parent, SWT.None );
	    typeLabel.setText( "Type:" );
	    typeLabel.setForeground(ColorsUtil.FG);

	    final Combo type = new Combo( parent, SWT.DROP_DOWN | SWT.READ_ONLY );
	    type.setItems( new String[]{
	      "ROADMAP",
	      "SATELLITE",
	      "HYBRID",
	      "TERRAIN"
	    } );
	    type.setText( "ROADMAP" );
	    type.addSelectionListener( new SelectionAdapter() {
	      public void widgetSelected(SelectionEvent e) {
	        int index = type.getSelectionIndex();
	        if( index != -1 ) {
	          gmap.setType( index );
	        }
	      }
	    } );
	}

	private void createAddressControl( Display display, Composite parent ) {
	    Label addrLabel = new Label( parent, SWT.None );
	    addrLabel.setText( "Address:" );
	    addrLabel.setForeground(ColorsUtil.BG);

	    final Text addr = new Text( parent, SWT.BORDER );
	    addr.setLayoutData( new GridData( SWT.FILL, SWT.TOP, true, false ) );
	    addr.addSelectionListener( new SelectionAdapter() {
	      public void widgetDefaultSelected( SelectionEvent e ) {
	        gmap.gotoAddress( addr.getText() );
	      }
	    } );
	    addr.setFont( new Font(display, "Arial", 9, SWT.NORMAL ) );
	    Button goToAddr = new Button( parent, SWT.PUSH );
	    goToAddr.setText( "go to" );
	    goToAddr.addSelectionListener( new SelectionAdapter() {
	      public void widgetSelected( SelectionEvent e ) {
	        gmap.gotoAddress( addr.getText() );
	      }
	    } );
	    Button resolveAddr = new Button( parent, SWT.PUSH );
	    resolveAddr.setText( "resolve" );
	    resolveAddr.addSelectionListener( new SelectionAdapter() {
	      public void widgetSelected( SelectionEvent e ) {
	        gmap.resolveAddress();
	      }
	    } );
	    gmap.addMapListener( new MapAdapter() {
	      public void addressResolved() {
	        addr.setText( gmap.getAddress() );
	      }
	      public void markerSelected(String id) {}
	    } );
	}
	  

	
	
	public void add16Segments(TabFolder folder, TabItem item) {
		Composite container = new Composite(folder, SWT.NONE);
		container.setLayout(GridLayoutFactory.fillDefaults().create());
		container.setLayoutData(GridDataFactory.fillDefaults().minSize(SWT.DEFAULT, 300).grab(true, true).create());
		
		b16StimulationButton = new Button(container, SWT.TOGGLE);
		b16StimulationButton.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).create());
		b16StimulationButton.setText("Animate");
		b16StimulationButton.addSelectionListener(
			new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (b16StimulationButton.getSelection()) {
						b16AnimationJob.schedule();
					} else {
						b16AnimationJob.cancel();
					}
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
		);

		disp16Segments1 = new SixteenSegmentsDisplay(container, 5, SWT.HORIZONTAL);
		disp16Segments1.setText(""+58249);
		disp16Segments1.setLayout(GridLayoutFactory.fillDefaults().create());
		disp16Segments1.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).hint(52*20, 120).grab(true, true).create());
		
		disp16Segments2 = new SixteenSegmentsDisplay(container, 26, SWT.HORIZONTAL);
		disp16Segments2.setText("abcdefghijklmnopqrstuvwxyz");
		disp16Segments2.setLayout(GridLayoutFactory.fillDefaults().create());
		disp16Segments2.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).hint(52*20, 120).grab(true, true).create());
		

		item.setControl(container);
	}
	
	
	
	void addDotMatrix(TabFolder folder, TabItem item) {
		Composite container = new Composite(folder, SWT.NONE);
		container.setLayout(GridLayoutFactory.fillDefaults().create());
		container.setLayoutData(GridDataFactory.fillDefaults().minSize(SWT.DEFAULT, 300).grab(true, true).create());
		container.setBackground(ColorsUtil.BG);
		
		matrixStimulationButton2 = new Button(container, SWT.TOGGLE);
		matrixStimulationButton2.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).create());
		matrixStimulationButton2.setText("Animate");
		matrixStimulationButton2.addSelectionListener(
			new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (matrixStimulationButton2.getSelection()) {
						matrixDisplay.animate();
					} else {
						matrixDisplay.stop();
					}
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
		);
	
		//ImageData[] brainScanGifFrames = ImageUtils.INSTANCE.loadGif2("/Animated-gif-cat-scan-picture-moving.gif");
		
		matrixDisplay = new DotMatrixDisplay(container);
		//matrixDisplay.handleImage(ImageUtils.HEAD_SCAN_ANIMATED, brainScanGifFrames);
		matrixDisplay.setBackground(ColorsUtil.BG);
		matrixDisplay.setForeground(ColorConstants.orange);
		matrixDisplay.setLayout(GridLayoutFactory.fillDefaults().create());
		matrixDisplay.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).minSize(SWT.DEFAULT, 300).create());

		container.update();

		item.setControl(container);
	}
	void addDotCharMatrix(TabFolder folder, TabItem item) {
		Composite container = new Composite(folder, SWT.NONE);
		container.setLayout(GridLayoutFactory.fillDefaults().create());
		container.setLayoutData(GridDataFactory.fillDefaults().minSize(SWT.DEFAULT, 300).grab(true, true).create());
		container.setBackground(ColorsUtil.BG);
		
		matrixStimulationButton = new Button(container, SWT.TOGGLE);
		matrixStimulationButton.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).create());
		matrixStimulationButton.setText("Animate");
		matrixStimulationButton.addSelectionListener(
			new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (matrixStimulationButton.getSelection()) {
						dotMatrixAnimationJob.schedule();
					} else {
						dotMatrixAnimationJob.cancel();
					}
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
		);
	
		dotMatrixDisplay = new DotMatrixCharDisplay(container, DotMatrixUtils.DOT_MATRIX_CHAR_12X12_DIM);
		dotMatrixDisplay.setText(0, "Ubiquisense");
		dotMatrixDisplay.setText(1, "SWT");
		dotMatrixDisplay.setText(2, "Widgets");
		dotMatrixDisplay.setBackground(ColorsUtil.BG);
		dotMatrixDisplay.setForeground(ColorConstants.orange);
		dotMatrixDisplay.setLayout(GridLayoutFactory.fillDefaults().create());
		dotMatrixDisplay.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).minSize(SWT.DEFAULT, 300).create());

		container.update();

		item.setControl(container);
	}
	public void addKnobs(TabFolder folder, TabItem item) {
		Composite container = new Composite(folder, SWT.NONE);
		container.setLayout(GridLayoutFactory.fillDefaults().create());
		container.setLayoutData(GridDataFactory.fillDefaults().minSize(SWT.DEFAULT, 300).grab(true, true).create());
		container.setBackground(ColorsUtil.BG);
		
		knobStimulationButton = new Button(container, SWT.TOGGLE);
		knobStimulationButton.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).create());
		knobStimulationButton.setText("Animate");
		knobStimulationButton.addSelectionListener(
			new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (knobStimulationButton.getSelection()) {
						knobAnimationJob.schedule();
					} else {
						knobAnimationJob.cancel();
					}
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
		);
		
		Composite bag = new Composite(container, SWT.NONE);
		bag.setLayout(GridLayoutFactory.fillDefaults().margins(16, 2).numColumns(10).create());
		bag.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		bag.setBackground(ColorsUtil.BG);

		basicKnob = new UbiKnob(bag, SWT.HORIZONTAL, UbiKnob.KNOB_MINIMAL_LOOK);
		basicKnob.setMax(100f);
		basicKnob.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(48, 48).grab(false, false).create());

		richKnob1 = new UbiKnob(bag, SWT.HORIZONTAL, false, UbiKnob.KNOB_RICH_LOOK, ImageUtils.KNOB_1_IMAGE);
		richKnob1.setMax(100f);
		richKnob1.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(48, 48).grab(false, false).create());
		
		richKnob2 = new UbiKnob(bag, SWT.HORIZONTAL, false, UbiKnob.KNOB_RICH_LOOK, ImageUtils.KNOB_2_IMAGE);
		richKnob2.setMax(100f);
		richKnob2.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(48, 48).grab(false, false).create());
		
		richKnob3 = new UbiKnob(bag, SWT.HORIZONTAL, false, UbiKnob.KNOB_RICH_LOOK, ImageUtils.KNOB_3_IMAGE);
		richKnob3.setMax(100f);
		richKnob3.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(48, 48).grab(false, false).create());
		
		richKnob4 = new UbiKnob(bag, SWT.HORIZONTAL, false, UbiKnob.KNOB_RICH_LOOK, ImageUtils.KNOB_4_IMAGE);
		richKnob4.setMax(100f);
		richKnob4.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(48, 48).grab(false, false).create());
		
		richKnob5 = new UbiKnob(bag, SWT.HORIZONTAL, false, UbiKnob.KNOB_RICH_LOOK, ImageUtils.KNOB_5_IMAGE);
		richKnob5.setMax(100f);
		richKnob5.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(48, 48).grab(false, false).create());
		
		richKnob6 = new UbiKnob(bag, SWT.HORIZONTAL, false, UbiKnob.KNOB_RICH_LOOK, ImageUtils.KNOB_6_IMAGE);
		richKnob6.setMax(100f);
		richKnob6.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(48, 48).grab(false, false).create());
		
		richKnob7 = new UbiKnob(bag, SWT.HORIZONTAL, false, UbiKnob.KNOB_RICH_LOOK, ImageUtils.KNOB_7_IMAGE);
		richKnob7.setMax(100f);
		richKnob7.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(48, 48).grab(false, false).create());
		
		richKnob8 = new UbiKnob(bag, SWT.HORIZONTAL, false, UbiKnob.KNOB_RICH_LOOK, ImageUtils.KNOB_8_IMAGE);
		richKnob8.setMax(100f);
		richKnob8.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(48, 48).grab(false, false).create());
		
		richKnob9 = new UbiKnob(bag, SWT.HORIZONTAL, false, UbiKnob.KNOB_RICH_LOOK, ImageUtils.KNOB_9_IMAGE);
		richKnob9.setMax(100f);
		richKnob9.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(48, 48).grab(false, false).create());
		
		richKnob10 = new UbiKnob(bag, SWT.HORIZONTAL, false, UbiKnob.KNOB_RICH_LOOK, ImageUtils.KNOB_10_IMAGE);
		richKnob10.setMax(100f);
		richKnob10.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(48, 48).grab(false, false).create());
		
		richKnob11 = new UbiKnob(bag, SWT.HORIZONTAL, false, UbiKnob.KNOB_RICH_LOOK, ImageUtils.KNOB_11_IMAGE);
		richKnob11.setMax(100f);
		richKnob11.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(48, 48).grab(false, false).create());
		
		richKnob12 = new UbiKnob(bag, SWT.HORIZONTAL, false, UbiKnob.KNOB_RICH_LOOK, ImageUtils.KNOB_12_IMAGE);
		richKnob12.setMax(100f);
		richKnob12.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(48, 48).grab(false, false).create());
		
		richKnob13 = new UbiKnob(bag, SWT.HORIZONTAL, false, UbiKnob.KNOB_RICH_LOOK, ImageUtils.KNOB_13_IMAGE);
		richKnob13.setMax(100f);
		richKnob13.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(48, 48).grab(false, false).create());
		
		richKnob14 = new UbiKnob(bag, SWT.HORIZONTAL, false, UbiKnob.KNOB_RICH_LOOK, ImageUtils.KNOB_14_IMAGE);
		richKnob14.setMax(100f);
		richKnob14.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(48, 48).grab(false, false).create());
		
		richKnob15 = new UbiKnob(bag, SWT.HORIZONTAL, false, UbiKnob.KNOB_RICH_LOOK, ImageUtils.KNOB_15_IMAGE);
		richKnob15.setMax(100f);
		richKnob15.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(48, 48).grab(false, false).create());
		
		richKnob16 = new UbiKnob(bag, SWT.HORIZONTAL, false, UbiKnob.KNOB_RICH_LOOK, ImageUtils.KNOB_16_IMAGE);
		richKnob16.setMax(100f);
		richKnob16.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(48, 48).grab(false, false).create());
		
		richKnob17 = new UbiKnob(bag, SWT.HORIZONTAL, false, UbiKnob.KNOB_RICH_LOOK, ImageUtils.KNOB_17_IMAGE);
		richKnob17.setMax(100f);
		richKnob17.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(48, 48).grab(false, false).create());
		
		richKnob18 = new UbiKnob(bag, SWT.HORIZONTAL, false, UbiKnob.KNOB_RICH_LOOK, ImageUtils.KNOB_18_IMAGE);
		richKnob18.setMax(100f);
		richKnob18.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(48, 48).grab(false, false).create());
		
		richKnob19 = new UbiKnob(bag, SWT.HORIZONTAL, false, UbiKnob.KNOB_RICH_LOOK, ImageUtils.KNOB_19_IMAGE);
		richKnob19.setMax(100f);
		richKnob19.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(48, 48).grab(false, false).create());
		
		richKnob20 = new UbiKnob(bag, SWT.HORIZONTAL, false, UbiKnob.KNOB_RICH_LOOK, ImageUtils.KNOB_20_IMAGE);
		richKnob20.setMax(100f);
		richKnob20.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(48, 48).grab(false, false).create());
		
		richKnob21 = new UbiKnob(bag, SWT.HORIZONTAL, false, UbiKnob.KNOB_RICH_LOOK, ImageUtils.KNOB_21_IMAGE);
		richKnob21.setMax(100f);
		richKnob21.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(48, 48).grab(false, false).create());
		
		richKnob22 = new UbiKnob(bag, SWT.HORIZONTAL, false, UbiKnob.KNOB_RICH_LOOK, ImageUtils.KNOB_22_IMAGE);
		richKnob22.setMax(100f);
		richKnob22.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(48, 48).grab(false, false).create());
		
		richKnob23 = new UbiKnob(bag, SWT.HORIZONTAL, false, UbiKnob.KNOB_RICH_LOOK, ImageUtils.KNOB_23_IMAGE);
		richKnob23.setMax(100f);
		richKnob23.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(48, 48).grab(false, false).create());
		
		item.setControl(container);
	}
	public void addKnobGrid(TabFolder folder, TabItem item) {
		UbiKnobGrid knob = new UbiKnobGrid(folder, 4, 4);
		for (int i=0;i<4;i++) {
			for (int j=0;j<4;i++) {
				knob.addParamToMonitor("cell [" + i + "," + j +"]", 0f, 100f, 33f, Float.class.getCanonicalName());
			}			
		}
		item.setControl(knob);
	}
	public void addLCDFonts(TabFolder folder, TabItem item) {
		Composite container = new Composite(folder, SWT.NONE);
		container.setLayout(GridLayoutFactory.fillDefaults().create());
		container.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());

		fontStimulationButton = new Button(container, SWT.TOGGLE);
		fontStimulationButton.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.CENTER).create());
		fontStimulationButton.setText("Animate");
		fontStimulationButton.addSelectionListener(
			new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (fontStimulationButton.getSelection()) {
						fontAnimationJob.schedule();
					} else {
						fontAnimationJob.cancel();
					}
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
		);
		lcdLabel1 = new Label(container, SWT.NONE);
		lcdLabel1.setForeground(ColorConstants.lightGray);
		lcdLabel1.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		lcdLabel1.setText("Lorem Ipsum 1+1=2");
		
		lcdLabel2 = new Label(container, SWT.NONE);
		lcdLabel2.setForeground(ColorConstants.lightGray);
		lcdLabel2.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		
		item.setControl(container);
	}
	public void addUbiDbMeter(TabFolder folder, TabItem item) {
		UbiDbMeter dbMeter = new UbiDbMeter(folder, SWT.HORIZONTAL);
		dbMeter.setMax(100f);
		dbMeter.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(145, 145).grab(false, false).create());
		item.setControl(dbMeter);
	}
	public void addUbiEQ(TabFolder folder, TabItem item) {
		UbiEQ eq = new UbiEQ(folder, 8);
		eq.setLayout(GridLayoutFactory.fillDefaults().create());
		eq.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		item.setControl(eq);
	}
	public void addAdvancedEQ8(TabFolder folder, TabItem item) {
		UbiEQAdvanced eq = new UbiEQAdvanced(folder, 8);
		eq.setLayout(GridLayoutFactory.fillDefaults().create());
		eq.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		item.setControl(eq);
	}
}
