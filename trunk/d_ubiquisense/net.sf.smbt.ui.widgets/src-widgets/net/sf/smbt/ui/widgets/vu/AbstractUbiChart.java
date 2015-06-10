/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2013, Lucas Bigeardel
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

import java.util.Arrays;
import java.util.Date;

import net.sf.smbt.ui.widgets.utils.LinkedFinancialTimedValue;
import net.sf.smbt.ui.widgets.utils.SelfTimedRange;
import net.sf.smbt.ui.widgets.utils.TimeRange;
import net.sf.smbt.ui.widgets.utils.TimedValue;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public abstract class AbstractUbiChart extends UbiWidget implements IUbiChart {
	protected float minValueOverall, maxValueOverall, minVolumeSampling, maxVolumeSampling;

	protected SelfTimedRange<LinkedFinancialTimedValue> timedRange;
	
	protected String 	label, unit;
	
	protected int vMargin, hMargin;
	protected int topMArgin, bottomMargin, leftMargin, rightMargin;
	protected int lineWidth;
	
	protected Color bulletColor, 
					lineColor, insideColor, 
					tooltipFG, tooltipBG, 
					minColor, maxColor, 
					minUnitColor, maxUnitColor, 
					hAxisColor, vAxisColor;
	
	protected Date bulletTime;
	protected Font dateFont;
	protected Date begin;
	protected Date end;
	protected TimeRange range;
	
	public AbstractUbiChart(Composite parent,int style, float min, float max, String unit, String label, long scope, long precision, LinkedFinancialTimedValue... values) {
		super(parent, style);

		this.timedRange 	= new SelfTimedRange<LinkedFinancialTimedValue>(scope);
		this.minValueOverall 			= min;
		this.maxValueOverall 			= max;
		this.unit 			= unit;
		this.label 			= label;
		this.hMargin		= 40;
		this.vMargin		= 30;
		
		this.lineWidth		= 3;
		this.lineColor		= ColorConstants.lightBlue;
		this.insideColor	= ColorConstants.lightGray;
		this.bulletColor	= ColorConstants.white;
		
		dateFont = new Font(Display.getDefault(), "tahoma", 10, SWT.NORMAL);
		
		timedRange.setTimedValues(Arrays.asList(values));
	}
	public TimedValue getValue(Date d) {
		return timedRange.getTimedValue(d);
	}
	public Font getDateFont() {
		return dateFont;
	}
	public void setDateFont(Font dateFont) {
		this.dateFont = dateFont;
	}
	public Date getBulletTime() {
		return bulletTime;
	}
	public void setBulletTime(Date bulletTime) {
		this.bulletTime = bulletTime;
	}
	public void setPeriod(TimeRange range) {
		this.range = range;
	}
	public TimeRange getPeriod() {
		return range;
	}
	public SelfTimedRange<LinkedFinancialTimedValue> getTimedRange() {
		return timedRange;
	}
	public void setTimedRange(SelfTimedRange<LinkedFinancialTimedValue> timedRange) {
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
		return minValueOverall;
	}
	public float getMaxVolume() {
		return maxVolumeSampling;
	}
	public float getMinVolume() {
		return minVolumeSampling;
	}
	public float getMax() {
		return maxValueOverall;
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
}
