/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2011, Lucas Bigeardel
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

package net.sf.smbt.ui.widgets.common;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

public class ColorsUtil {
	private Color 	barLowLevelColor, 
					barMidLevelColor, 
					barHighLevelColor, 
					barMaxLevelColor, 
					barMinLevelColor;

	public final static ColorsUtil INSTANCE = new ColorsUtil();
	
	public final static Color BG 			= new Color(Display.getDefault(), new RGB(100, 100, 100));
	public final static Color FG 			= ColorConstants.lightGray;
	
	public final static Color Red 			= new Color(Display.getDefault(), new RGB(255, 0, 0));
	public final static Color Green 		= new Color(Display.getDefault(), new RGB(0, 0, 255));
	public final static Color Blue 			= new Color(Display.getDefault(), new RGB(100, 100, 100));
	
	public final static Color magenta 		= new Color(Display.getDefault(), new RGB(255, 0, 255));
	public final static Color Cyan 			= new Color(Display.getDefault(), new RGB(0, 255, 255));
	public final static Color yellow 		= new Color(Display.getDefault(), new RGB(255, 255, 0));
	
	public final static Color black 		= Display.getDefault().getSystemColor(SWT.COLOR_BLACK);
	public final static Color white 		= Display.getDefault().getSystemColor(SWT.COLOR_WHITE);
	public final static Color dark_gray 	= Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY);

	public final static Color dark_red 		= Display.getDefault().getSystemColor(SWT.COLOR_DARK_RED);
	public final static Color dark_green 	= Display.getDefault().getSystemColor(SWT.COLOR_DARK_GREEN);
	public final static Color dark_blue 	= Display.getDefault().getSystemColor(SWT.COLOR_DARK_BLUE);
	
	public final static Color dark_cyan 	= Display.getDefault().getSystemColor(SWT.COLOR_DARK_CYAN);
	public final static Color dark_magenta 	= Display.getDefault().getSystemColor(SWT.COLOR_DARK_MAGENTA);
	public final static Color dark_yellow 	= Display.getDefault().getSystemColor(SWT.COLOR_DARK_YELLOW);
	
	public final static Color orange 		= ColorConstants.orange;	
	public final static Color lightBlue 	= ColorConstants.lightBlue;	
	public final static Color lightGray 	= ColorConstants.lightGray;	
	public final static Color lightGreen 	= ColorConstants.lightGreen;	
	
	
	private Map<String, Color>  colors;
	private static Map<String, RGB>  rgbs;
	private Map<String, Color> colorsMap;
	private Map<String, Image> wheelImagesMap;

	public ColorsUtil() {
		barMinLevelColor	= Display.getDefault().getSystemColor(SWT.COLOR_CYAN);
		barLowLevelColor 	= Display.getDefault().getSystemColor(SWT.COLOR_GREEN);
		barMidLevelColor 	= Display.getDefault().getSystemColor(SWT.COLOR_YELLOW);
		barHighLevelColor 	= Display.getDefault().getSystemColor(SWT.COLOR_RED);
		barMaxLevelColor 	= Display.getDefault().getSystemColor(SWT.COLOR_DARK_RED);
		wheelImagesMap 		= new HashMap<String, Image>();
		colorsMap 			= new HashMap<String, Color>(10000);
		colors 				= new HashMap<String, Color>();
		rgbs 				= new HashMap<String, RGB>();
	}
	public Map<String, Image> getWheelImagesMap() {
		return wheelImagesMap;
	}
	public Map<String, Color> getColorsMap() {
		return colorsMap;
	}

	public org.eclipse.swt.graphics.Color getHsbColor(float hue, float saturation, float brightness) {
		String hu = String.format("%.2f", hue*360);
		String s  = String.format("%.2f", saturation);
		String br = String.format("%.2f", brightness);
		return getHsbColor(hu+"_"+s+"_"+br);
	}
	public org.eclipse.swt.graphics.Color getHsbColor(String key) {
		if (!colorsMap.containsKey(key)) {
			String[] atoms = key.split("_");
			org.eclipse.swt.graphics.Color color = new org.eclipse.swt.graphics.Color(
				Display.getDefault(), 
				new RGB(
					Float.parseFloat(atoms[0].replace(",", ".").trim()),
					Float.parseFloat(atoms[1].replace(",", ".").trim()),
					Float.parseFloat(atoms[2].replace(",", ".").trim())
				)
			);
			colorsMap.put(
				key, 
				color
			);
			return color;
		}
		return colorsMap.get(key);
	}

	public Color getColor(float level, float max) {
		float ratioF = (level/max)*100f;
		int pwr = (int)ratioF;
		
		int ratio = 100;
		// 0 - 50
		// 51 - 75
		// 76 - 90
		// 91 - 100
		RGB rgb = barLowLevelColor.getRGB();
		ratio = new Float(((100f - ratioF)/10f) * 100f).intValue();
		if (pwr > 90) {
			ratio = new Float(((100f - ratioF)/10f) * 100f).intValue();
			rgb = blend(
				barMaxLevelColor.getRGB(), 
				barHighLevelColor.getRGB(), 
				ratio
			);
		} else if (pwr > 75) {
			ratio = new Float(((90 - ratioF)/15f) * 100f).intValue();
			rgb = blend(
				barHighLevelColor.getRGB(), 
				barMidLevelColor.getRGB(), 
				ratio
			);
		} else if (pwr > 50) {
			ratio = new Float(((75f - ratioF)/25f) * 100f).intValue();
			rgb = blend(
				barMidLevelColor.getRGB(), 
				barLowLevelColor.getRGB(), 
				ratio
			);
		} else  {
			ratio = new Float((ratioF/50f) * 100f).intValue();
			rgb = blend(
				barLowLevelColor.getRGB(), 
				barMinLevelColor.getRGB(),
				ratio
			);
		}
		String key = rgb.red + "_" + rgb.green + "_" + rgb.blue;
		if (!colors.containsKey(key)) {
			colors.put(key, new Color(Display.getDefault(), rgb));
		}
		return colors.get(key);
	}
	
	public Color getColor(RGB rgb) {
		if (rgb == null) return ColorConstants.black;
		String key = rgb.red + "_" + rgb.green + "_" + rgb.blue;
		if (!colors.containsKey(key)) {
			colors.put(key, new Color(Display.getDefault(), rgb));
		}
		return colors.get(key);
	}

	/**
	 * Blends the two color values according to the provided ratio.
	 * 
	 * @param c1 first color
	 * @param c2 second color
	 * @param ratio percentage of the first color in the blend (0-100)
	 * 
	 * @return the RGB value of the blended color
	 * 
	 * @since 3.3
	 */
	public static RGB blend(RGB c1, RGB c2, int ratio) {
		String k = getKey(c1, c2, ratio);
		if (rgbs.containsKey(k)) {
			return rgbs.get(k);
		}
		int r = blend(c1.red, c2.red, ratio);
		int g = blend(c1.green, c2.green, ratio);
		int b = blend(c1.blue, c2.blue, ratio);
		RGB rgb = new RGB(r, g, b);
		rgbs.put(k, rgb);
		return rgb;
	}

	private static int blend(int v1, int v2, int ratio) {
		int b = (ratio * v1 + (100 - ratio) * v2) / 100;
		return Math.min(255, b);
	}
	
	private static String getKey(RGB c1, RGB c2, int ratio) {
		return c1.red + "_" + c1.green + "_" + c1.blue + "#" + c2.red + "_" + c2.green + "_" + c2.blue + "!" + ratio; 
	}
		
	/**
	 * Blend the two color values returning a value that is halfway between
	 * them.
	 * 
	 * @param val1 the first value
	 * @param val2 the second value
	 * 
	 * @return the blended color
	 */
	public static RGB blend(RGB val1, RGB val2) {
		String k = getKey(val1, val2, -1);
		if (rgbs.containsKey(k)) {
			return rgbs.get(k);
		}
		int red = blend(val1.red, val2.red);
		int green = blend(val1.green, val2.green);
		int blue = blend(val1.blue, val2.blue);
		RGB rgb = new RGB(red, green, blue);
		rgbs.put(k, rgb);
		return rgb;
	}

	/**
	 * Blend the two color values returning a value that is halfway between
	 * them.
	 * 
	 * @param temp1 the first value
	 * @param temp2 the second value
	 * 
	 * @return the blended int value
	 */
	private static int blend(int temp1, int temp2) {
		return (Math.abs(temp1 - temp2) / 2) + Math.min(temp1, temp2);
	}
}
