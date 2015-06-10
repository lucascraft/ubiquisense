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
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import net.sf.smbt.ui.widgets.common.ColorsUtil;
import net.sf.smbt.ui.widgets.utils.PositionningValue;
import net.sf.smbt.ui.widgets.utils.SelfTimedRange;
import net.sf.smbt.ui.widgets.utils.TimeDuration;
import net.sf.smbt.ui.widgets.utils.TimeRange;
import net.sf.smbt.ui.widgets.utils.TimedValue;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Triangle;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Path;
import org.eclipse.swt.graphics.PathData;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class UbiTimed2DChart extends UbiWidget {
	private float 	min;
	private float 	max;
	
	private int style;
	
	public final static int STYLE_CANDLES 	= 0;
	public final static int STYLE_LINES 	= 1;
	public final static int STYLE_POINTS 	= 2;
	
	private SelfTimedRange<TimedValue> timedRange;
	
	private String 	label;
	private String 	unit;
	
	private int vMargin, hMargin;
	private int topMArgin, bottomMargin, leftMargin, rightMargin;
	private int lineWidth;
	
	private Color 	bulletColor, 
					lineColor, insideColor, 
					tooltipFG, tooltipBG, 
					minColor, maxColor, 
					minUnitColor, maxUnitColor, 
					hAxisColor, vAxisColor;
	
	private Date bulletTime;
	private Font dateFont;
	private Date begin;
	private Date end;
	private TimeRange range;

	public void setPeriod(TimeRange range) {
		this.range = range;
	}
	public TimeRange getPeriod() {
		return range;
	}
	public SelfTimedRange<TimedValue> getTimedRange() {
		return timedRange;
	}
	public void setTimedRange(SelfTimedRange<TimedValue> timedRange) {
		this.timedRange = timedRange;
	}
	public int getvMargin() {
		return vMargin;
	}
	public void setvMargin(int vMargin) {
		this.vMargin = vMargin;
	}
	public int gethMargin() {
		return hMargin;
	}
	public void sethMargin(int hMargin) {
		this.hMargin = hMargin;
	}
	public int getTopMArgin() {
		return topMArgin;
	}
	public void setTopMArgin(int topMArgin) {
		this.topMArgin = topMArgin;
	}
	public int getBottomMargin() {
		return bottomMargin;
	}
	public void setBottomMargin(int bottomMargin) {
		this.bottomMargin = bottomMargin;
	}
	public int getLeftMargin() {
		return leftMargin;
	}
	public void setLeftMargin(int leftMargin) {
		this.leftMargin = leftMargin;
	}
	public int getRightMargin() {
		return rightMargin;
	}
	public void setRightMargin(int rightMargin) {
		this.rightMargin = rightMargin;
	}
	public float getMin() {
		return min;
	}
	public float getMax() {
		return max;
	}
	public void setLineWidth(int lineWidth) {
		this.lineWidth = lineWidth;
	}
	public void setLineColor(Color lineColor) {
		this.lineColor = lineColor;
	}
	public void setInsideColor(Color insideColor) {
		this.insideColor = insideColor;
	}
	public void setTooltipFGColor(Color color) {
		this.tooltipFG = color;
	}
	public void setTooltipBGColor(Color color) {
		this.tooltipBG = color;
	}
	public void setMinValueColor(Color color) {
		this.minColor = color;
	}
	public void setMaxValueColor(Color color) {
		this.maxColor = color;
	}
	public void setMinUnitColor(Color color) {
		this.minUnitColor = color;
	}
	public void setMaxUnitColor(Color color) {
		this.maxUnitColor = color;
	}
	public void setHorizontalAxisColor(Color color) {
		this.hAxisColor = color;
	}
	public void setVerticalAxisColor(Color color) {
		this.vAxisColor = color;
	}
	public int getLineWidth() {
		return lineWidth;
	}
	public Color getLineColor() {
		return lineColor;
	}
	public Color getInsideColor() {
		return insideColor;
	}
	public Color getTooltipFG() {
		return tooltipFG;
	}
	public Color getTooltipBG() {
		return tooltipBG;
	}
	public Color getMinColor() {
		return minColor;
	}
	public Color getMaxColor() {
		return maxColor;
	}
	public Color getMinUnitColor() {
		return minUnitColor;
	}
	public Color getMaxUnitColor() {
		return maxUnitColor;
	}
	public Color gethAxisColor() {
		return hAxisColor;
	}
	public Color getvAxisColor() {
		return vAxisColor;
	}
	public Color getBulletColor() {
		return bulletColor;
	}
	public void setBulletColor(Color bulletColor) {
		this.bulletColor = bulletColor;
	}
	public Date getBegin() {
		return begin;
	}
	public void setBegin(Date begin) {
		this.begin = begin;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public UbiTimed2DChart(Composite parent, float min, float max, String unit, String label, TimeRange range, Date end, TimedValue... values) {
		this(parent, STYLE_LINES, min, max, unit, label, range.getOrigin(end), range.getPivot(), values);
	}
	public UbiTimed2DChart(Composite parent, int style, float min, float max, String unit, String label, TimeRange range, Date end, TimedValue... values) {
		this(parent, style, min, max, unit, label, range.getOrigin(end), range.getPivot(), values);
	}
	public UbiTimed2DChart(Composite parent, int style, float min, float max, String unit, String label, TimeRange range, TimedValue... values) {
		this(parent, style, min, max, unit, label, range.getOrigin(), range.getPivot(), values);
	}
	public UbiTimed2DChart(Composite parent, float min, float max, String unit, String label, TimeRange range, TimedValue... values) {
		this(parent, STYLE_LINES, min, max, unit, label, range.getOrigin(), range.getPivot(), values);
	}
	public UbiTimed2DChart(Composite parent, int style, float min, float max, String unit, String label, Date begin, Date end, TimedValue... values) {
		super(parent, SWT.NONE);
		
		this.style			= STYLE_LINES;
		this.timedRange 	= new SelfTimedRange<TimedValue>(TimeDuration.HALF_DAY.getDuration());
		this.min 			= min;
		this.max 			= max;
		this.unit 			= unit;
		this.label 			= label;
		
		//
		// Margins
		//
		this.hMargin		= 40;
		this.vMargin		= 30;
		
		this.lineWidth		= 3;
		this.lineColor		= ColorConstants.lightBlue;
		this.insideColor	= ColorConstants.lightGray;
		this.bulletColor	= ColorConstants.white;
		
		dateFont = new Font(Display.getDefault(), "tahoma", 10, SWT.NORMAL);
		
		timedRange.setTimedValues(Arrays.asList(values));
		
		setLayout(GridLayoutFactory.fillDefaults().spacing(0, 0).extendedMargins(0, 0, 0, 0).margins(0, 0).create());
		setLayoutData(GridDataFactory.fillDefaults().hint(SWT.DEFAULT, 120).minSize(SWT.DEFAULT, 120).grab(true, true).create());
		
		addPaintListener(new PaintListener() {
			@Override
			public void paintControl(PaintEvent e) {
				draw(e);
			}
		});
		addMouseMoveListener(new MouseMoveListener() {
			@Override
			public void mouseMove(MouseEvent e) {
				Rectangle r = getClientArea();
				Rectangle inside = new Rectangle(hMargin, vMargin, r.width - (2 * hMargin), r.height - (2 * vMargin));
				Map<PositionningValue, Date> bulletsMap = timedRange.getTimeBullets(inside.width, inside.height);
				bulletTime = null;
				for (PositionningValue p : bulletsMap.keySet()) {
					org.eclipse.draw2d.geometry.Rectangle bulletRect = new org.eclipse.draw2d.geometry.Rectangle(p.getPosition().x + hMargin - 12, 0, 24, inside.height);
					if (bulletRect.contains(e.x, e.y)) {
						bulletTime = bulletsMap.get(p);
						break;
					}
				}
				redraw();
			}
		});
	}
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	private void draw(PaintEvent e) {
		switch (style) {
			case STYLE_CANDLES:
				drawCandleStyle(e);
				break;
			case STYLE_LINES:
				drawLineStyle(e);
				break;
			case STYLE_POINTS:
				//drawPointStyle(e);
				break;
			default:
				break;
		}
	}
	private void drawLineStyle(PaintEvent e) {
		GC gc = e.gc;
		Rectangle r = getClientArea();
		
		String minStr = min + " " + unit;
		String maxStr = max + " " + unit;
		Point minStrExtent = gc.textExtent(minStr);

		if (!timedRange.getSampledTimeValues().isEmpty()) {
			Rectangle inside = new Rectangle(hMargin, vMargin, e.width - (2 * hMargin), e.height - (2 * vMargin));
			Map<Date, PositionningValue> points		= timedRange.getPositions(inside.width, inside.height);
			
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
			gc.setLineWidth(3);
			gc.setForeground(getLineColor());

			if (points != null && !points.isEmpty() ) {
				PathData pData = new PathData();
				int i = 0;
				int j = 1;
				int size 		= points.values().size();
				int ptLength 	= 2 * size;
				byte[] types	= new byte[size];
				float[] pts		= new float[ptLength];
				types[0]	= SWT.PATH_MOVE_TO;
				for (Date d : points.keySet()) {
					org.eclipse.draw2d.geometry.Point pt = points.get(d).getPosition();
					pts[i++] = pt.x + hMargin;
					pts[i++] = inside.height + vMargin - pt.y;
					if (j < size) {
						types[j++] = SWT.PATH_LINE_TO;
					}
					pData.types = types;
					pData.points = pts;
				}
				
				gc.setAlpha(200);

				Path path = new Path(Display.getDefault(), pData);
				gc.drawPath(path);
			}
			gc.setAlpha(255);
			gc.setLineWidth(3);
			gc.setForeground(ColorConstants.gray);
			gc.setLineStyle(SWT.LINE_SOLID);
			gc.setFont(dateFont);
			Map<PositionningValue, Date> bulletsMap = timedRange.getTimeBullets(inside.width, inside.height);
			for (PositionningValue p : bulletsMap.keySet()) {
				int tX = p.getPosition().x + hMargin - 3;
				int tY = inside.height + vMargin - p.getPosition().y -2;
				gc.setBackground(bulletColor);
				gc.setForeground(bulletColor);
				gc.drawOval(tX,tY, 6, 6);
			}
			for (PositionningValue p : bulletsMap.keySet()) {
				int tX = p.getPosition().x + hMargin - 3;
				int tY = inside.height + vMargin - p.getPosition().y -2;
				if (bulletsMap.get(p).equals(bulletTime)) {
					TimedValue value = timedRange.getTimedValue(bulletTime);
					
					gc.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_RED));
					gc.fillOval(tX+2,tY+2, 3, 3);
					
					drawTooltip(gc, tX, tY, value);
				}
			}
		}
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
			gc.drawText(minStr, hMargin + 5, (r.height - minStrExtent.y - 5), true);
		}
	}
	
	private void drawCandleStyle(PaintEvent e) {
		GC gc = e.gc;
		Rectangle r = getClientArea();
		
		String minStr = min + " " + unit;
		String maxStr = max + " " + unit;
		Point minStrExtent = gc.textExtent(minStr);

		if (!timedRange.getSampledTimeValues().isEmpty()) {
			Rectangle inside = new Rectangle(hMargin, vMargin, e.width - (2 * hMargin), e.height - (2 * vMargin));
			Map<Date, PositionningValue> points		= timedRange.getPositions(inside.width, inside.height);
			
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
			gc.setLineWidth(3);
			gc.setForeground(getLineColor());

			if (points != null && !points.isEmpty() ) {
				PathData pData = new PathData();
				int i = 0;
				int j = 1;
				int size 		= points.values().size();
				int ptLength 	= 2 * size;
				byte[] types	= new byte[size];
				float[] pts		= new float[ptLength];
				types[0]	= SWT.PATH_MOVE_TO;
				for (Date d : points.keySet()) {
					org.eclipse.draw2d.geometry.Point pt = points.get(d).getPosition();
					pts[i++] = pt.x + hMargin;
					pts[i++] = inside.height + vMargin - pt.y;
					
					if (j < size) {
						types[j++]		= SWT.PATH_LINE_TO;
					}
					pData.types = types;
					pData.points = pts;
				}
				
				gc.setAlpha(200);

				Path path = new Path(Display.getDefault(), pData);
				gc.drawPath(path);
			}
			gc.setAlpha(255);
			gc.setLineWidth(3);
			gc.setForeground(ColorConstants.gray);
			gc.setLineStyle(SWT.LINE_SOLID);
			gc.setFont(dateFont);
			Map<PositionningValue, Date> bulletsMap = timedRange.getTimeBullets(inside.width, inside.height);
			for (PositionningValue p : bulletsMap.keySet()) {
				int tX = p.getPosition().x + hMargin - 3;
				int tY = inside.height + vMargin - p.getPosition().y -2;
				gc.setBackground(bulletColor);
				gc.setForeground(bulletColor);
				gc.drawOval(tX,tY, 6, 6);
			}
			for (PositionningValue p : bulletsMap.keySet()) {
				int tX = p.getPosition().x + hMargin - 3;
				int tY = inside.height + vMargin - p.getPosition().y -2;
				if (bulletsMap.get(p).equals(bulletTime)) {
					TimedValue value = timedRange.getTimedValue(bulletTime);
					gc.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_RED));
					gc.fillOval(tX+2,tY+2, 3, 3);
					drawTooltip(gc, tX, tY, value);
				}
			}
		}
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
			gc.drawText(minStr, hMargin + 5, (r.height - minStrExtent.y - 5), true);
		}
	}
	
	private List<Integer> getInsideLines(int dist, int minDist, int minNumber) {
		List<Integer> pts = new ArrayList<Integer>();
		if (dist > minDist ) {
			
			int mind = dist / minNumber;
			mind = mind > minDist ? mind : minDist;
			/*while (mind > minDist && minNumber > 0) {
				mind = dist / minNumber--;
			}*/
			int d = 0;
			while (d < dist) {
				pts.add(new Integer(d+=mind));
			}
		}
		if (!pts.isEmpty()) {
			pts.remove(pts.size()-2);
		}
		return pts;
	}
	
	
	private void drawTooltip(GC gc, int x, int y, TimedValue v) {
		Rectangle r = getClientArea();
		org.eclipse.draw2d.geometry.Rectangle inside = new org.eclipse.draw2d.geometry.Rectangle(hMargin, vMargin, r.width - (2 * hMargin), r.height - (2 * vMargin));

		int margin = 20;
		
		gc.setForeground(getMinColor());
		gc.setBackground(getMinColor());
		gc.setFont(getFont());

		String tooltip = v.getV() + " " + unit; 
		
		Point tooltipExtent = gc.textExtent(tooltip);

		gc.setForeground(getTooltipBG());
		gc.setBackground(getTooltipBG());
		
		int w = tooltipExtent.x + (2 * margin);
		int h = tooltipExtent.y + (2 * margin);
		
		org.eclipse.draw2d.geometry.Rectangle rect = new org.eclipse.draw2d.geometry.Rectangle(x - (w / 2), y, w, h);
		{
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
		}
		gc.fillRoundRectangle(rect.x, rect.y, rect.width, rect.height, 10, 10);
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

		Path path = new Path(Display.getDefault(), pData);
		gc.fillPath(path);
	}
}
