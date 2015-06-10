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

package net.sf.smbt.ui.widgets.vu;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import net.sf.smbt.ui.widgets.common.ColorsUtil;
import net.sf.smbt.ui.widgets.utils.CandleStickData;
import net.sf.smbt.ui.widgets.utils.LinkedFinancialTimedValue;
import net.sf.smbt.ui.widgets.utils.TimeBounds;
import net.sf.smbt.ui.widgets.utils.TimeDuration;
import net.sf.smbt.ui.widgets.utils.TimeRange;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;

public class UbiCandelstickChart extends AbstractUbiChart  {
	private int mouseX, mouseY;
	
	private int style;
	
	private CandlesManager candlesManager;
	
	public final static int STYLE_CANDLES 	= 0;
	public final static int STYLE_LINES 	= 1;
	public final static int STYLE_POINTS 	= 2;
	
	private List<Ribbon> ribbons = new ArrayList<UbiCandelstickChart.Ribbon>();
	public abstract class Ribbon extends Canvas {
		protected int _mouseX, _mouseY;
		public int height;
		public float cursor;
		public void setCursor(float cursor) {
			this.cursor = cursor;
		}
		UbiCandelstickChart chart;
		public abstract void rdraw(PaintEvent e, UbiCandelstickChart chart);
		public Ribbon(final UbiCandelstickChart chart, int h) {
			super(chart, SWT.NONE);
			this.chart = chart;
			this.height = h;
			addPaintListener(new PaintListener() {
				@Override
				public void paintControl(PaintEvent e) {
					rdraw(e, chart);
				}
			});
			addMouseMoveListener(new MouseMoveListener() {
				@Override
				public void mouseMove(MouseEvent e) {
					_mouseX = e.x;
					_mouseY = e.y;	
					mouseX = e.x;
					chart.redraw();
					redraw();
				}
			});
		}
	}
	public CandlesManager getCandlesManager() {
		return candlesManager;
	}
	public Ribbon addRibbon(Ribbon r) {
		ribbons.add(r);
		return r;
	}
	public UbiCandelstickChart(Composite parent, float min, float max, String unit, String label, TimeRange range, Date end, TimeDuration scope, TimeDuration durationStep, LinkedFinancialTimedValue... values) {
		this(parent, STYLE_LINES, min, max, unit, label, range.getOrigin(end), range.getPivot(), scope, durationStep, values);
	}
	public UbiCandelstickChart(Composite parent, int style, float min, float max, String unit, String label, TimeRange range, Date end, TimeDuration scope, TimeDuration durationStep, LinkedFinancialTimedValue... values) {
		this(parent, style, min, max, unit, label, range.getOrigin(end), range.getPivot(), scope, durationStep, values);
	}
	public UbiCandelstickChart(Composite parent, int style, float min, float max, String unit, String label, TimeRange range, TimeDuration scope, TimeDuration durationStep, LinkedFinancialTimedValue... values) {
		this(parent, style, min, max, unit, label, range.getOrigin(), range.getPivot(), scope, durationStep, values);
	}
	public UbiCandelstickChart(Composite parent, float min, float max, String unit, String label, TimeRange range, TimeDuration scope, TimeDuration durationStep, LinkedFinancialTimedValue... values) {
		this(parent, STYLE_LINES, min, max, unit, label, range.getOrigin(), range.getPivot(), scope, durationStep, values);
	}
	public UbiCandelstickChart(Composite parent, int style, float min, float max, String unit, String label, Date begin, Date end, TimeDuration scope, TimeDuration durationStep, LinkedFinancialTimedValue... values) {
		super(parent, SWT.NONE, min, max, unit, label, scope.getDuration(), durationStep.getDuration(), values);
		
		this.candlesManager = new CandlesManager(timedRange);
		
		this.style = STYLE_LINES;
		
		this.minValueOverall 	= timedRange.getMinValueOverall();
		this.maxValueOverall 	= timedRange.getMaxValueOverall();
		this.minVolumeSampling 	= timedRange.getMinVolumeSampling();
		this.maxVolumeSampling 	= timedRange.getMaxVolumeSampling();
		
		setLayout		(GridLayoutFactory.fillDefaults().spacing(0, 0).extendedMargins(0, 0, 0, 0).margins(0, 0).create());
		setLayoutData	(GridDataFactory.fillDefaults().hint(SWT.DEFAULT, 120).minSize(SWT.DEFAULT, 120).grab(true, true).create());
		
		Canvas c = new Canvas(this, SWT.NONE);
		c.setLayout		(GridLayoutFactory.fillDefaults().spacing(0, 0).extendedMargins(0, 0, 0, 0).margins(0, 0).create());
		c.setLayoutData	(GridDataFactory.fillDefaults().hint(SWT.DEFAULT, 120).minSize(SWT.DEFAULT, 120).grab(true, true).create());

		c.addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent e) {
				draw(e);
			}
		});
		c.addMouseMoveListener(new MouseMoveListener() {
			@Override
			public void mouseMove(MouseEvent e) {
				mouseX = e.x;
				mouseY = e.y;
				/*
				Rectangle r = getClientArea();
				Rectangle inside = new Rectangle(hMargin, vMargin, r.width - (2 * hMargin), r.height - (2 * vMargin));
				Map<PositionningValue, Date> bulletsMap = timedRange.getTimeBullets(inside.width, inside.height);
				for (Ribbon ribbon : ribbons) {
					ribbon.setCursor(e.x);
				}
				bulletTime = null;
				for (PositionningValue p : bulletsMap.keySet()) {
					org.eclipse.draw2d.geometry.Rectangle bulletRect = new org.eclipse.draw2d.geometry.Rectangle(p.getPosition().x + hMargin - 12, 0, 24, inside.height);
					if (bulletRect.contains(e.x, e.y)) {
						bulletTime = bulletsMap.get(p);
						break;
					}
				}
				*/
				redraw();
			}
		});
		
		//
		// Volume Ribbon
		//
		
		Ribbon r = new Ribbon(this, 30) {
			@Override
			public void rdraw(PaintEvent e, UbiCandelstickChart chart) {
				Rectangle inside = new Rectangle(hMargin, 0, e.width - (2 * hMargin), e.height);
				
				e.gc.setForeground(insideColor);
				e.gc.setBackground(insideColor);

				Rectangle r = new Rectangle(e.x, e.y, e.width, e.height);
				e.gc.fillRectangle(r);
				
				e.gc.setBackground(ColorConstants.gray);
				e.gc.setForeground(ColorConstants.gray);
				e.gc.drawRectangle(r);
				e.gc.setLineStyle(SWT.LINE_DOT);
				for (Integer d : getInsideLines(inside.width, 50, 5)) {
					e.gc.drawLine(d + inside.x, 0 , d + inside.x, inside.y + inside.height);
				}
				
				e.gc.setLineStyle(SWT.LINE_SOLID);
				e.gc.setBackground(ColorConstants.white);
				e.gc.setForeground(ColorConstants.white);

				List<CandleStickData> candles = candlesManager.getCandles();
				int x = 0;
				float maxVol=0f, minVol=0f;
				for (CandleStickData c : candles) {
					if (c.getVolume() < minVol || minVol == 0) { minVol = c.getVolume(); }
					if (c.getVolume() > maxVol) { maxVol = c.getVolume(); }
				}
				for (CandleStickData c : candles) {
					if (!c.getValues().isEmpty()) {
						double volumeRatio	=  c.getVolume() / maxVol; 	
						int volY	= new Double(volumeRatio * inside.height).intValue();
						e.gc.setLineWidth(CandlesManager.DEFAUTLT_CANDLE_WIDTH-1);
						e.gc.drawLine(inside.x + x, e.height - volY - 2, inside.x + x, e.height);
					}
					x += CandlesManager.DEFAUTLT_CANDLE_WIDTH;
				}
				
				e.gc.setLineWidth(1);
				e.gc.setForeground(ColorConstants.orange);
				e.gc.drawLine(mouseX, 0, mouseX, e.height);
			}
		};
		r.setBackground(getBackground());
		r.setLayout		(GridLayoutFactory.fillDefaults().spacing(0, 0).extendedMargins(0, 0, 0, 0).margins(0, 0).create());
		r.setLayoutData	(GridDataFactory.fillDefaults().hint(SWT.DEFAULT, 30).minSize(SWT.DEFAULT, 30).grab(true, false).create());

		addRibbon(r);
	}
	private void draw(PaintEvent e) {
		switch (style) { // Just candles
			case STYLE_CANDLES:
			case STYLE_LINES:
			case STYLE_POINTS:
				drawCandleStyle(e);
		}
	}
	public void redraw() {
		super.redraw();
		for (Ribbon r : ribbons) {
			r.redraw();
		}
	}
	private void drawCandleStyle(PaintEvent e) {
		minValueOverall = timedRange.getMinValueSampling();
		maxValueOverall = timedRange.getMaxValueSampling();
		
		Rectangle inside = new Rectangle(hMargin, vMargin, e.width - (2 * hMargin), e.height - (2 * vMargin));
		
		GC gc = e.gc;
		Rectangle r = getClientArea();
		
		gc.setBackground(insideColor);
		gc.fillRectangle(r);

		String minStr = minValueOverall + " " + unit;
		String maxStr = maxValueOverall + " " + unit;
		Point minStrExtent = gc.textExtent(minStr);

		if (!timedRange.getSampledTimeValues().isEmpty()) {
			
			gc.setFont(getFont());
			
			gc.setBackground(insideColor);
			gc.fillRectangle(inside);

			gc.setForeground(lineColor);
			gc.setBackground(lineColor);
			
			gc.setLineWidth(lineWidth);
			
			gc.setLineStyle(SWT.LINE_DASH);
			gc.setAlpha(100);
			
			gc.drawLine(inside.x, inside.y, inside.x, inside.y + inside.height);
			gc.drawLine(inside.x + inside.width, inside.y, inside.x + inside.width, inside.y + inside.height);
			
			gc.setAlpha(100);
			gc.setLineWidth(1);
			gc.setForeground(ColorsUtil.lightGray);
			gc.setLineStyle(SWT.LINE_DASH);

			for (Integer d : getInsideLines(inside.width, 50, 5)) {
				gc.drawLine(d + inside.x,inside.y , d + inside.x, inside.y + inside.height);
			}
			
			gc.setLineStyle(SWT.LINE_SOLID);
			gc.setLineCap(SWT.CAP_ROUND);
			gc.setLineJoin(SWT.JOIN_ROUND);
			
			gc.setAlpha(255);
			gc.setLineWidth(1);
			gc.setForeground(getLineColor());
			
			candlesManager.updateCandles(e.width, e.height, hMargin, vMargin);
			
			int x = 0;
			for (CandleStickData c : candlesManager.getCandles()) {
				if (!c.getValues().isEmpty()) {
					
					float distH = timedRange.getMaxValueSampling() - timedRange.getMinValueSampling();
					
					double highRatio	= (timedRange.getMaxValueSampling() - c.getHigh()) 	/ distH; 	
					double lowRatio		= (timedRange.getMaxValueSampling() - c.getLow()) 	/ distH; 	
					double openRatio	= (timedRange.getMaxValueSampling() - c.getOpen()) 	/ distH; 	
					double closeRatio	= (timedRange.getMaxValueSampling() - c.getClose()) 	/ distH; 	
					//double avgRatio		= (c.getAvg()	- timedRange.getMinOverall()) / distH; 	

					int highY	= vMargin + new Double((highRatio)	* inside.height).intValue();
					int lowY	= vMargin + new Double((lowRatio)	* inside.height).intValue();
					int openY	= vMargin + new Double((openRatio)	* inside.height).intValue();
					int closeY	= vMargin + new Double((closeRatio) * inside.height).intValue();
					
					gc.setForeground(c.getOpen()<c.getClose() ? ColorConstants.lightGreen	: ColorConstants.red);
					gc.setBackground(c.getOpen()<c.getClose() ? ColorConstants.green		: ColorConstants.red);
					
					gc.drawLine(
						1 + inside.x + x, 
						lowY, 
						1 + inside.x + x, 
						highY
					);
					gc.setForeground(getBackground());
					gc.setBackground(getBackground());

					gc.fillRectangle(
						inside.x + x, 
						openY, 
						candlesManager.DEFAUTLT_CANDLE_WIDTH - 1, 
						closeY-openY + 2
					);

					gc.setForeground(c.getOpen()<c.getClose() ? ColorConstants.lightGreen 	: ColorConstants.red);
					gc.setBackground(c.getOpen()<c.getClose() ? ColorConstants.green 		: ColorConstants.red);

					gc.drawRectangle(
						inside.x + x, 
						openY, 
						candlesManager.DEFAUTLT_CANDLE_WIDTH - 2, 
						closeY-openY + 2
					);
				}
				x += candlesManager.DEFAUTLT_CANDLE_WIDTH;
			}
		}
		
		gc.setForeground(ColorConstants.orange);
		gc.drawLine(mouseX, e.y, mouseX, e.y+e.height);
		gc.drawLine(e.x, mouseY, e.x+e.width, mouseY);
		
		
		gc.setForeground(getMaxColor());
		gc.setBackground(getMaxColor());
		gc.setFont(getFont());


		
		if (maxStr != null && maxStr.length() > 0) {
			gc.drawText(maxStr, hMargin + 5, 5, true);
		}

		gc.setForeground(getMinColor());
		gc.setBackground(getMinColor());
		gc.setFont(getFont());

		if (minStr != null && minStr.length() > 0) {
			int rHeight = 0;
			for (Ribbon rr : ribbons) {
				rHeight += (rr.height +5);
			}
			gc.drawText(minStr, hMargin + 5, (r.height - minStrExtent.y - 5 - rHeight), true);
		}
	
		gc.setForeground(ColorConstants.white);
		gc.setBackground(getBackground());

		Float ratio = new Float(mouseY-vMargin) / new Float(inside.height); 
		String vText = (minValueOverall + ((1-ratio)*(maxValueOverall - minValueOverall)))+"";
		Point pt = gc.stringExtent(vText);
		gc.drawText(vText+"", 0, mouseY-(pt.y/2), 0);
	}
	public double dist(double x1, double y1, double x2, double y2) {
	  return Math.sqrt (Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}
	private List<Integer> getInsideLines(int dist, int minDist, int minNumber) {
		List<Integer> pts = new ArrayList<Integer>();
		if (dist >= minDist ) {
			int mind = dist / minNumber;
			mind = mind > minDist ? mind : minDist;
			int d = 0;
			while (d <= dist) {
				pts.add(new Integer(d+=mind));
			}
		}
		if (!pts.isEmpty()) {
			pts.remove(pts.size()-2);
		}
		return pts;
	}
	/*
	private void drawTooltip(GC gc, int x, int y, TimedValue v) {
		Rectangle r = getClientArea();
		org.eclipse.draw2d.geometry.Rectangle inside = new org.eclipse.draw2d.geometry.Rectangle(hMargin, vMargin, r.width - (2 * hMargin), r.height - (2 * vMargin));

		int margin = 8;
		
		gc.setForeground(getMinColor());
		gc.setBackground(getMinColor());
		gc.setFont(getFont());

		String tooltip = v.getV() + " " + unit + "\n" + v.getD(); 
		
		Point tooltipExtent = gc.textExtent(tooltip);

		gc.setForeground(getTooltipBG());
		gc.setBackground(getTooltipBG());
		
		int w = tooltipExtent.x + (2 * margin);
		int h = tooltipExtent.y + (2 * margin);
		
		org.eclipse.draw2d.geometry.Rectangle rect = new org.eclipse.draw2d.geometry.Rectangle(x - (w / 2), y, w, h);
		if (!inside.contains(rect.getLeft())) {
			if (inside.contains(rect.getRight())) {
				rect.x = 0;
			}
		}
		if (y < inside.y + inside.height/2) {
			rect.y = y + 16;
			drawTriangle(gc, x+3, y+8, Triangle.NORTH);
		} else {
			rect.y = y - rect.height - 8;
			drawTriangle(gc, x+3, y, Triangle.SOUTH);
		}
		
		gc.drawRoundRectangle(rect.x, rect.y, rect.width, rect.height, 10, 10);
		gc.setForeground(getTooltipFG());
		gc.setBackground(getTooltipBG());

		if (tooltip != null && tooltip.length() > 0) {
			gc.drawText(tooltip, margin + rect.x, margin + rect.y, true);
		}
	}
	private void drawTriangle(GC gc, int x, int y, int direction) {
		Point head, p2, p3;
		head = new Point(x, y);
		switch (direction) {
			case Triangle.SOUTH:
				p2 = new Point(x + 4, y - 8);
				p3 = new Point(x - 4, y - 8);
				break;
			default:
				p2 = new Point(x + 4, y + 8);
				p3 = new Point(x - 4, y + 8);
				break;
		}
		
		PathData pData = new PathData();
		byte[] types	= new byte[3];
		float[] pts		= new float[6];
		
		types[0]		= SWT.PATH_MOVE_TO;
		pts[0] 			= head.x;
		pts[1] 			= head.y ;
		
		types[1]		= SWT.PATH_LINE_TO;
		pts[2] 			= p2.x;
		pts[3] 			= p2.y;
		
		types[2]		= SWT.PATH_LINE_TO;
		pts[4] 			= p3.x;
		pts[5] 			= p3.y;
			
		pData.types 	= types;
		pData.points 	= pts;

		gc.fillPath(new Path(Display.getDefault(), pData));
	}
	*/
}
