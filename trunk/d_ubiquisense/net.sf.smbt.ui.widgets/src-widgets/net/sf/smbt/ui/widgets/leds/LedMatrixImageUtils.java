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

package net.sf.smbt.ui.widgets.leds;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.smbt.ui.widgets.common.ImageUtils;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.PaletteData;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

public class LedMatrixImageUtils {
	
	public final static LedMatrixImageUtils INSTANCE = new LedMatrixImageUtils();
	
	private Map<RGB, Color> colorMap;
	
	public LedMatrixImageUtils() {
		colorMap = new HashMap<RGB, Color>();
	}

	public Color getColor(RGB rgb) {
		if (colorMap.keySet().contains(rgb)) {
			return colorMap.get(rgb);
		} else {
			return colorMap.put(rgb, new Color(Display.getDefault(), rgb));
		}
	}
	
	public Image createLedImage(String path, int spotSize) {
		Image img = new Image(Display.getDefault(), path);
		if (img != null) {
			ImageData data = img.getImageData();
			if (data != null) {
				ImageData d = ledConvert(data, 5);
				if (d != null) {
					return new Image(Display.getDefault(), d);
				}
			}
		}
		return null;
	}
	
	public Image createLedImage(Image img, Dimension dim, int size) {
		BufferedImage bufferedImg = ImageUtils.INSTANCE.convertToAWT(img.getImageData());
		BufferedImage rImg = ImageUtils.pixelate(bufferedImg, size);
		return new Image(Display.getDefault(), ImageUtils.INSTANCE.convertToSWT(rImg));
	}
	
	public Map<Point, int[][]> convertToMatrix(ImageData data, int size) {
		if (data != null && data.width > size && data.height >size) {
			Map<Point, int[][]> matrix = new HashMap<Point, int[][]>();
			for (int x = 0; x < data.width / size; x++) {
				for (int y =0; y < data.height / size; y++) {
					int[][] pixels = new int[size][size];
					matrix.put(new Point(x, y), pixels);
					for (int i=0; i < size; i++) {
						for (int j = 0; j < size; j++) {
							pixels[i][j] = data.getPixel(x*size+i, y*size+j);
						}
					}
				}
			}
			return matrix;
		}
		return new HashMap<Point, int[][]>();
	}
	
	public ImageData ledConvert(ImageData data, int size) {
		Map<Point, int[][]> matrix = convertToMatrix(data, size);
		Map<String, RGB> rgbs = new HashMap<String, RGB>();
		for (Point pt : matrix.keySet()) {
			int[][] pixels = matrix.get(pt);
			int[] pixelsRaw = new int[size*size];
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					pixelsRaw[i*size+j] = pixels[i][j];
				}
			}
			RGB color = average(data, pixelsRaw);
			rgbs.put(color.red+"_"+color.green+"_"+color.blue, color);
		}
		PaletteData palette = new PaletteData(rgbs.values().toArray(new RGB[0]));
		ImageData imageData = new ImageData(data.width, data.height, data.depth, palette);
		for (Point pt : matrix.keySet()) {
			int[][] pixels = matrix.get(pt);
			int[] pixelsRaw = new int[size*size];
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					pixelsRaw[i*size+j] = pixels[i][j];
				}
			}
			RGB color = average(data, pixelsRaw);
			int x2 = pt.x * size;
			int y2 = pt.y * size;
			for (int c = 0; c < size; c++) {
				for (int r = 0; r < size; r++) {
					int pixel  = palette.getPixel(color);
					imageData.setPixel(x2+c, y2+r, pixel > 0 && pixel < palette.colors.length ? pixel : 0);
				}
			}
		}
		return imageData; 
	}
	
	int[][] createSpot(int[][] pixels, int avgPixel) {
		for (int i=0;i<pixels.length;i++) {
			for (int j=0;j<pixels.length; j++) {
				pixels[i][j] = avgPixel;
			}
		}
		return pixels;
	}
	
	RGB average(ImageData data, int[] pixels) {
		PaletteData palette = data.palette;
		List<RGB> rgbs = new ArrayList<RGB>();
		for (int pixel : pixels) {
			if (palette != null) {
				RGB color = palette.getRGB(pixel);
				if (color != null) {
					rgbs.add(color);
				}
			}
		}
		RGB avgRGB = new RGB(0,0,0);
		int r = 0;
		int g = 0;
		int b = 0;
		for (RGB rgb : rgbs) {
			r += rgb.red;
			g += rgb.green;
			b += rgb.blue;
		}
		
		avgRGB.red 		= r / rgbs.size();
		avgRGB.green	= g / rgbs.size();
		avgRGB.blue     = b / rgbs.size();
		
		return avgRGB;
	}
}
