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

package net.sf.smbt.ui.widgets.common;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.IndexColorModel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.stream.ImageInputStream;

import org.apache.batik.apps.rasterizer.DestinationType;
import org.apache.batik.apps.rasterizer.SVGConverter;
import org.apache.batik.apps.rasterizer.SVGConverterException;
import org.apache.batik.bridge.DocumentLoader;
import org.apache.batik.bridge.UserAgent;
import org.apache.batik.bridge.UserAgentAdapter;
import org.apache.batik.swing.svg.SVGDocumentLoader;
import org.apache.batik.swing.svg.SVGDocumentLoaderAdapter;
import org.apache.batik.swing.svg.SVGDocumentLoaderEvent;
import org.apache.batik.transcoder.TranscoderException;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.image.PNGTranscoder;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.graphics.PaletteData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.svg.SVGDocument;


public class ImageUtils {
	public final static ImageUtils INSTANCE = new ImageUtils();
	
	private Map<String, Image> images;
	
	public final static String SLIDER_H_THUMB_IMAGE 			= "icons/thumb1h.png";
	public final static String SLIDER_V_THUMB_IMAGE 			= "icons/thumb1v.png";
	
	public final static String KNOB_1_IMAGE 					= "icons/knob1.png";
	public final static String KNOB_2_IMAGE 					= "icons/knob2.png";
	public final static String KNOB_3_IMAGE 					= "icons/knob3.png";
	public final static String KNOB_4_IMAGE 					= "icons/knob4.png";
	public final static String KNOB_5_IMAGE 					= "icons/knob5.png";
	public final static String KNOB_6_IMAGE 					= "icons/knob6.png";
	public final static String KNOB_7_IMAGE 					= "icons/knob7.png";
	public final static String KNOB_8_IMAGE 					= "icons/knob8.png";
	public final static String KNOB_9_IMAGE 					= "icons/knob9.png";
	public final static String KNOB_10_IMAGE 					= "icons/knob10.png";
	public final static String KNOB_11_IMAGE 					= "icons/knob11.png";
	public final static String KNOB_12_IMAGE 					= "icons/knob12.png";
	public final static String KNOB_13_IMAGE 					= "icons/knob13.png";
	public final static String KNOB_14_IMAGE 					= "icons/knob14.png";
	public final static String KNOB_15_IMAGE 					= "icons/knob15.png";
	public final static String KNOB_16_IMAGE 					= "icons/knob16.png";
	public final static String KNOB_17_IMAGE 					= "icons/knob17.png";
	public final static String KNOB_18_IMAGE 					= "icons/knob18.png";
	public final static String KNOB_19_IMAGE 					= "icons/knob19.png";
	public final static String KNOB_20_IMAGE 					= "icons/knob20.png";
	public final static String KNOB_21_IMAGE 					= "icons/knob21.png";
	public final static String KNOB_22_IMAGE 					= "icons/knob22.png";
	public final static String KNOB_23_IMAGE 					= "icons/knob23.png";
	
	public final static String ONE_OCTAVE_PIANO_IMAGE 			= "icons/miniPiano.bmp";
	public final static String THREE_OCTAVE_PIANO_IMAGE 		= "icons/3OctavesPianoPad.bmp";
	public final static String DBMETER_1_IMAGE 					= "icons/dbmeter1.png";
	
	public final static String SIXTEEN_DIGIT_ALL_STUFF_IMAGE 	= "icons/14-segCharacterSet.gif";
	public final static String SIXTEEN_DIGIT_PATH_PREFIX 		= "icons/14-segCharacterSet";
	
	//
	// Animated GIFs
	//
	
	public final static String IDEA_SWT_ANIMATED				= "icons/animated/Idea_SWT_Animation.gif";
//	public final static String DROUGHT_USA_12_WEEKS 			= "icons/animated/12_week.gif";
//	public final static String HEAD_SCAN_ANIMATED		 		= "icons/animated/Animated-gif-cat-scan-picture-moving.gif";
//	public final static String HIMYM_BARNEY_ANIMATED	 		= "icons/animated/barney.gif";
//	public final static String ANIMAL_ANIMATED		 			= "icons/animated/animal.gif";
	public final static String MATHS_1_ANIMATED			 		= "icons/animated/abstract_maths_1.gif";
	public final static String MATHS_2_ANIMATED			 		= "icons/animated/abstract_maths_2.gif";
	public final static String MATHS_3_ANIMATED			 		= "icons/animated/abstract_maths_3.gif";
	public final static String MATHS_4_ANIMATED			 		= "icons/animated/abstract_maths_4.gif";
	public final static String MATHS_5_ANIMATED			 		= "icons/animated/abstract_maths_5.gif";
	public final static String MATHS_6_ANIMATED			 		= "icons/animated/abstract_maths_6.gif";
	public final static String MATHS_7_ANIMATED			 		= "icons/animated/abstract_maths_7.gif";
	public final static String MATHS_8_ANIMATED			 		= "icons/animated/abstract_maths_8.gif";
	public final static String MATHS_9_ANIMATED			 		= "icons/animated/abstract_maths_9.gif";
//	public final static String DAVE_DOPE_ANIMATED		 		= "icons/animated/davidope.gif";
//	public final static String BIRD_PETTNG_ANIMATED		 		= "icons/animated/DGBBirdPetting.gif";
//	public final static String ERMILLIO_ZEBRA_ANIMATED		 	= "icons/animated/ermilio-zebra.gif";
//	public final static String MAC_CHICK_ANIMATED		 		= "icons/animated/McChick.gif";
//	public final static String MOTHER_ANIMATED		 			= "icons/animated/mother.gif";
//	public final static String RATY_X_ANIMATED		 			= "icons/animated/RatyX.gif";
//	public final static String TAPY_Y_ANIMATED		 			= "icons/animated/TapYy.gif";
//	public final static String YEAH_ANIMATED		 			= "icons/animated/yeahhh.gif";

	private SVGConverter svgConverteer;

	public ImageUtils() {
		images = new HashMap<String, Image>();
		svgConverteer = new SVGConverter();
		load16DigitsImages();
	}
	
	public Image getSixteenDigitImage(String suffix) {
		return getImage(SIXTEEN_DIGIT_PATH_PREFIX + "-" + suffix + ".bmp");
	}

	public Image getImage(String path) {
		if (images.containsKey(path)) {
			return images.get(path);
		}
		Image image = null;
		try {
			image = loadImage("net/sf/smbt/ui/widgets/common/"+path);
		} catch (Throwable t) {
			//
		}
		if (image != null) {
			images.put(path, image);
		}
		return image;
	}
	
	public ImageData[] loadGif(String filePath) {
		BufferedImage[] awtImages = loadLocalAnimatedGif(filePath);
		if (awtImages != null && awtImages.length > 0) {
			ImageData[] swtImages = new ImageData[awtImages.length];
			int i = 0;
			for (BufferedImage img : awtImages) {
				swtImages[i] = convertToSWT(img);
				i++;
			}
		}
		return new ImageData[0];
	}

	public ImageData[] loadGif2(String filePath) {
		BufferedImage[] awtImages = loadLocalAnimatedGif2(filePath);
		if (awtImages != null && awtImages.length > 0) {
			ImageData[] swtImages = new ImageData[awtImages.length];
			int i = 0;
			for (BufferedImage img : awtImages) {
				swtImages[i] = convertToSWT(img);
				i++;
			}
			return swtImages;
		}
		return new ImageData[0];
	}
	
	private Image loadImage(String filePath) {
		try {
			ClassLoader classLoader = getClass().getClassLoader();
			URL url = classLoader.getResource(filePath);
			if (url == null) {
				System.err.println("Could not read resource: '" + filePath + "'. Is your file system case sensitive?");
			} else {
				String canonical = new File(url.getPath()).getCanonicalPath();
				if(!canonical.endsWith(new org.eclipse.core.runtime.Path(filePath).lastSegment())) 
					throw new RuntimeException(filePath + ":\n" +
							"The file does not exist exactly as it was named.\n" +
							"The test is likely to cause trouble on the build server.\n" +
							"Is your filesystem case insensitive? Please verify the spelling.");
	
				InputStream resourceAsStream = classLoader.getResourceAsStream(filePath);
				try {
					if (resourceAsStream == null) {
						System.err.println("Could not read resource: '" + filePath + "'. Is your file system case sensitive?");
					} else {
						return new Image(Display.getDefault(), resourceAsStream);
					}
				} finally {
					if (resourceAsStream != null)
						resourceAsStream.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private InputStream getInputStream2(String path) {
		String filePath = "net/sf/smbt/ui/widgets/common/" + path;
		return getInputStream(filePath);
	}
	
	private InputStream getLocalInputStream(String filePath) {
		try {
		File file = new File(filePath);
		String canonical = file.getCanonicalPath();
		if(!canonical.endsWith(new org.eclipse.core.runtime.Path(filePath).lastSegment())) 
			throw new RuntimeException(filePath + ":\n" +
					"The file does not exist exactly as it was named.\n" +
					"The test is likely to cause trouble on the build server.\n" +
					"Is your filesystem case insensitive? Please verify the spelling.");

		InputStream resourceAsStream = new FileInputStream(file);
		try {
			return resourceAsStream; 
		} catch(Exception e) {	
		} finally {
			if (resourceAsStream != null) {
				resourceAsStream.close();
			}
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
	private InputStream getInputStream(String filePath) {
		try {
			ClassLoader classLoader = getClass().getClassLoader();
			URL url = classLoader.getResource(filePath);
			if (url == null) {
				System.err.println("Could not read resource: '" + filePath + "'. Is your file system case sensitive?");
			} else {
				String canonical = new File(url.getPath()).getCanonicalPath();
				if(!canonical.endsWith(new org.eclipse.core.runtime.Path(filePath).lastSegment())) 
					throw new RuntimeException(filePath + ":\n" +
							"The file does not exist exactly as it was named.\n" +
							"The test is likely to cause trouble on the build server.\n" +
							"Is your filesystem case insensitive? Please verify the spelling.");
	
				InputStream resourceAsStream = classLoader.getResourceAsStream(filePath);
				try {
					if (resourceAsStream == null) {
						System.err.println("Could not read resource: '" + filePath + "'. Is your file system case sensitive?");
					} else {
						return resourceAsStream; 
					}
				} finally {
					if (resourceAsStream != null) {
						resourceAsStream.close();
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Image getSliderThumbH() {
		return getImage(SLIDER_H_THUMB_IMAGE);
	}
	
	public Image getSliderThumbV() {
		return getImage(SLIDER_V_THUMB_IMAGE);
	}
	public Image getKnob1() {
		return getImage(KNOB_1_IMAGE);
	}
	public Image getKnob2() {
		return getImage(KNOB_2_IMAGE);
	}
	public Image getKnob3() {
		return getImage(KNOB_3_IMAGE);
	}
	public Image getKnob4() {
		return getImage(KNOB_4_IMAGE);
	}
	public Image getMiniPiano() {
		return getImage(ONE_OCTAVE_PIANO_IMAGE);
	}
	public Image get3OctavesPiano() {
		return getImage(THREE_OCTAVE_PIANO_IMAGE);
	}
	public void load16DigitsImages() {
		for (int col=0; col<16; col++) {
			for (int row = 0; row < 5; row++) {
				getImage(SIXTEEN_DIGIT_ALL_STUFF_IMAGE.replace(".gif", "-" + col + "_" + row + ".bmp"));
			}
		}
	}
	public Image getKnob1(int width, int height) {
		return getImage(KNOB_1_IMAGE, width, height);
	}
	
	public Image getKnob2(int width, int height) {
		return getImage(KNOB_2_IMAGE, width, height);
	}
	
	public Image getKnob3(int width, int height) {
		return getImage(KNOB_3_IMAGE, width, height);
	}
	
	public Image getKnob4(int width, int height) {
		return getImage(KNOB_4_IMAGE, width, height);
	}
	
	public Image getDBMeter1() {
		return getImage(DBMETER_1_IMAGE);
	}
	
	public Image getDBMeter1(int width, int height) {
		return getImage(DBMETER_1_IMAGE, width, height);
	}
	
	public Image getImage(String path, int width, int height) {
		String newPath =  width + "x" + height + "-" + path; 
		Image image = getImage(newPath);
		if (image != null) {
			return image;
		}
		image = getImage(path);
		if (image == null) {
			return image;
		}
		Image scaled = new Image(Display.getDefault(), width, height);
		
		GC gc = new GC(scaled);
		gc.setAntialias(SWT.ON);
		gc.setInterpolation(SWT.HIGH);
		
		gc.drawImage(
			image, 
			0, 
			0, 
			image.getBounds().width, 
			image.getBounds().height, 
			0, 
			0, 
			width, 
			height
		);
		
		gc.dispose();
		
		ImageData data = scaled.getImageData();
		data.transparentPixel = 0;

		images.put(newPath, new Image(Display.getDefault(), data));
		
		scaled.dispose();
		
		return images.get(newPath);
	}
	
	public Image[] getAnimatedGIF(String path) {
		ImageData[] imageData = loadAnimatedGIF(path);
		if (imageData != null && imageData.length > 0) {
			Image[] images = new Image[imageData.length];
			int i = 0;
			for (ImageData imgData : imageData) {
				images[i] = new Image(Display.getDefault(), imgData);
				i++;
			}
		}
		return new Image[0];
	}
	
	public Image[] getAnimatedGIF2(String path) {
		ImageData[] imageData = loadAnimatedGIF2(path);
		if (imageData != null && imageData.length > 0) {
			Image[] images = new Image[imageData.length];
			int i = 0;
			for (ImageData imgData : imageData) {
				images[i] = new Image(Display.getDefault(), imgData);
				i++;
			}
		}
		return new Image[0];
	}
	
	public Image[] getAnimatedGIF3(String path) {
		ImageData[] imageData = loadAnimatedGIF3(path);
		if (imageData != null && imageData.length > 0) {
			Image[] images = new Image[imageData.length];
			int i = 0;
			for (ImageData imgData : imageData) {
				images[i] = new Image(Display.getDefault(), imgData);
				i++;
			}
		}
		return new Image[0];
	}
	
	public ImageData[] loadAnimatedGIF(String path) {
		ImageLoader imageLoader = new ImageLoader();
		InputStream inStream = getInputStream2(path);
		if (inStream != null) {
			imageLoader.load(inStream);
			return imageLoader.data;
		}
		return new ImageData[0];
	}
	
	public ImageData[] loadAnimatedGIF2(String path) {
		ImageLoader imageLoader = new ImageLoader();
		InputStream inStream = getInputStream(path);
		if (inStream != null) {
			imageLoader.load(inStream);
			return imageLoader.data;
		}
		return new ImageData[0];
	}
	
	public ImageData[] loadAnimatedGIF3(String path) {
		ImageLoader imageLoader = new ImageLoader();
		InputStream inStream = getLocalInputStream(path);
		if (inStream != null) {
			imageLoader.load(inStream);
			return imageLoader.data;
		}
		return new ImageData[0];
	}
	
	public ImageData rasterizeBufferedImage(BufferedImage bufferedImage) {
		ImageData data = null;
		if (bufferedImage.getColorModel() instanceof ComponentColorModel) {
		    ComponentColorModel colorModel = (ComponentColorModel)bufferedImage.getColorModel();

		    // ASSUMES: 3 BYTE BGR IMAGE TYPE

		    PaletteData palette = new PaletteData(0x0000FF, 0x00FF00,0xFF0000);
		    data = new ImageData(bufferedImage.getWidth(), bufferedImage.getHeight(), colorModel.getPixelSize(), palette);

		    //This is valid because we are using a 3-byte Data model with no transparent pixels
		    data.transparentPixel = -1;

		    WritableRaster raster = bufferedImage.getRaster();
		    int[] pixelArray = new int[3];
		    for (int y = 0; y < data.height; y++) {
		        for (int x = 0; x < data.width; x++) {
		            raster.getPixel(x, y, pixelArray);
		            int pixel = palette.getPixel(new RGB(pixelArray[0], pixelArray[1], pixelArray[2]));
		            data.setPixel(x, y, pixel);
		        }
		    }
		}
		return data;
	}
	
	public BufferedImage getColorPalette2(int width, int height) {
		BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        double halfW = width/2.0;
        double vSpacing = 1.0/height;
        double hSpacing = 1.0/halfW;
        for (int y =0; y<(height-1); y++) {
        	for (int x =0; x<(halfW-1); x++) {
        		img.setRGB(x,y,java.awt.Color.HSBtoRGB(new java.lang.Float(vSpacing*y), 1, new java.lang.Float(hSpacing*x)));
        	}
        }
        for (int y =0; y<(height-1); y++) { 
        	for (int x =(int)halfW; x<(width-1); x++) {
        		img.setRGB(x,y,java.awt.Color.HSBtoRGB(new java.lang.Float(vSpacing*y), new java.lang.Float(1-(hSpacing*(x-halfW))), 1));
        	}
        }
        return img;
	}
	
	public ImageData convertToSWT(BufferedImage bufferedImage) {
		if (bufferedImage.getColorModel() instanceof DirectColorModel) {
			DirectColorModel colorModel = (DirectColorModel)bufferedImage.getColorModel();
			PaletteData palette = new PaletteData(colorModel.getRedMask(), colorModel.getGreenMask(), colorModel.getBlueMask());
			ImageData data = new ImageData(bufferedImage.getWidth(), bufferedImage.getHeight(), colorModel.getPixelSize(), palette);
			for (int y = 0; y < data.height; y++) {
				for (int x = 0; x < data.width; x++) {
					int rgb = bufferedImage.getRGB(x, y);
					int pixel = palette.getPixel(new RGB((rgb >> 16) & 0xFF, (rgb >> 8) & 0xFF, rgb & 0xFF)); 
					data.setPixel(x, y, pixel);
					if (colorModel.hasAlpha()) {
						data.setAlpha(x, y, (rgb >> 24) & 0xFF);
					}
				}
			}
			return data;		
		} else if (bufferedImage.getColorModel() instanceof IndexColorModel) {
			IndexColorModel colorModel = (IndexColorModel)bufferedImage.getColorModel();
			int size = colorModel.getMapSize();
			byte[] reds = new byte[size];
			byte[] greens = new byte[size];
			byte[] blues = new byte[size];
			colorModel.getReds(reds);
			colorModel.getGreens(greens);
			colorModel.getBlues(blues);
			RGB[] rgbs = new RGB[size];
			for (int i = 0; i < rgbs.length; i++) {
				rgbs[i] = new RGB(reds[i] & 0xFF, greens[i] & 0xFF, blues[i] & 0xFF);
			}
			PaletteData palette = new PaletteData(rgbs);
			ImageData data = new ImageData(bufferedImage.getWidth(), bufferedImage.getHeight(), colorModel.getPixelSize(), palette);
			data.transparentPixel = colorModel.getTransparentPixel();
			WritableRaster raster = bufferedImage.getRaster();
			int[] pixelArray = new int[1];
			for (int y = 0; y < data.height; y++) {
				for (int x = 0; x < data.width; x++) {
					raster.getPixel(x, y, pixelArray);
					data.setPixel(x, y, pixelArray[0]);
				}
			}
			return data;
		}
		return null;
	}
	
	public BufferedImage convertToAWT(ImageData data) {
		ColorModel colorModel = null;
		PaletteData palette = data.palette;
		if (palette.isDirect) {
			colorModel = new DirectColorModel(data.depth, palette.redMask, palette.greenMask, palette.blueMask);
			BufferedImage bufferedImage = new BufferedImage(colorModel, colorModel.createCompatibleWritableRaster(data.width, data.height), false, null);
			for (int y = 0; y < data.height; y++) {
				for (int x = 0; x < data.width; x++) {
					int pixel = data.getPixel(x, y);
					RGB rgb = palette.getRGB(pixel);
					bufferedImage.setRGB(x, y,  rgb.red << 16 | rgb.green << 8 | rgb.blue);
				}
			}
			return bufferedImage;
		} else {
			RGB[] rgbs = palette.getRGBs();
			byte[] red = new byte[rgbs.length];
			byte[] green = new byte[rgbs.length];
			byte[] blue = new byte[rgbs.length];
			for (int i = 0; i < rgbs.length; i++) {
				RGB rgb = rgbs[i];
				red[i] = (byte)rgb.red;
				green[i] = (byte)rgb.green;
				blue[i] = (byte)rgb.blue;
			}
			if (data.transparentPixel != -1) {
				colorModel = new IndexColorModel(data.depth, rgbs.length, red, green, blue, data.transparentPixel);
			} else {
				colorModel = new IndexColorModel(data.depth, rgbs.length, red, green, blue);
			}		
			BufferedImage bufferedImage = new BufferedImage(colorModel, colorModel.createCompatibleWritableRaster(data.width, data.height), false, null);
			WritableRaster raster = bufferedImage.getRaster();
			int[] pixelArray = new int[1];
			for (int y = 0; y < data.height; y++) {
				for (int x = 0; x < data.width; x++) {
					int pixel = data.getPixel(x, y);
					pixelArray[0] = pixel;
					raster.setPixel(x, y, pixelArray);
				}
			}
			return bufferedImage;
		}
	}
	
	public Image getSWTColorPalette2(int w, int h) {
		ImageData imageData = rasterizeBufferedImage(getColorPalette2(w, h));
		return new Image(Display.getDefault(), imageData);
	}

	
	public Image getColorPalette(int n, int hue) {
		List<RGB> rgbs = new ArrayList<RGB>();
		for (int i=n*n; i > 0; i--) {
			rgbs.add(new RGB(hue, i / (n*n), (1/n) * (i % n)));
		}
	    PaletteData pData = new PaletteData(0x0000FF, 0x00FF00,0xFF0000);
		ImageData iData = new ImageData(n, n, 16, pData);
		iData.transparentPixel = -1;
		for (int i=n*n; i > 0; i--) {
			iData.setPixel(i % n, (int) Math.floor(i / n),  0);
		}
		return new Image(Display.getDefault(), iData); 
	}
	
	public RGB select_color(int me,int num){
		  int s[]= new int[]{0,1,3,6,10,15,21,28,36,45,55,66,78,91};
		  int j,nrows=0,irow=0,jcol=0;
		  double del,red,grn,blu;
		// we build a red/green triangle with an area>=num
		  for(j=0;j<14;j++)if(me>=s[j])irow=j;
		  for(j=13;j>0;j--)if(num<=s[j])nrows=j;
		  jcol=me-s[irow];
		  del=1./(nrows-.9);
		  red=1.-del*irow;
		  grn=del*jcol;
		  blu=1.-red-grn;
		  return new RGB(new Double(red).intValue(),new Double(grn).intValue(),new Double(blu).intValue());
	}
	 
		public static BufferedImage noise(BufferedImage img, int quantity, int threshold) {
			BufferedImage dest = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_ARGB);
	 
			//good values are
			//quantity = 10;
			//threshold = 50;
	 
			Random r = new Random();
	 
			for (int x = 0; x < img.getWidth(); x++) {
				for (int y = 0; y < img.getHeight(); y++) {
					int px = img.getRGB(x, y);
	 
					int ran = r.nextInt(quantity);
					if (ran <= 1) {
						int amount = r.nextInt(threshold);
						int red = ((px >> 16) & 0xFF) + amount;
	 
						amount = r.nextInt(threshold);
						int green = ((px >> 8) & 0xFF) + amount;	
	 
						amount = r.nextInt(threshold);			
						int blue = (px & 0xFF) + amount;
	 
						//Overflow fix
						if (red > 255) { red = 255; }
						if (green > 255) { green = 255; }
						if (blue > 255) { blue = 255; }
	 
						px = (0xFF<<24) + (red<<16) + (green<<8) + blue;
					}
	 
					dest.setRGB(x, y, px);
				}
			}
			return dest;
		}
	 
		public ImageData pixelateSWT(Image img, int size) {
			return convertToSWT(pixelate(convertToAWT(img.getImageData()), size)); 
		}
		
		//
		// 
		//
		public ImageData pixelateSwt2LCD(Image img, int size, Dimension margins) {
			ImageData imgData = pixelateSWT(img, size);
			if (size%2 != 0) {
				throw new UnsupportedOperationException("can't pixalite on a non pair pixel basis");
			}
			Rectangle r = img.getBounds();
			int w	= r.width;
			int h	= r.height;
			
			int nW	= w / size;
			int nH	= h / size;
			
			int fWidth	= w + (margins.width	* (nW - 1));
			int fHeight	= h + (margins.height 	* (nH - 1));
			
			ImageData imdDataFinal = new ImageData(fWidth, fHeight, 32, imgData.palette);
			
			for (int i=0;i<nW;i++) {
				for (int j=0;j<nH;j++) {
					int[] bytes = new int[size * size];
					for (int k=0;k<size;k++) {
						imgData.getPixels((i * size), (j * size) + k, size, bytes, 0);
						imdDataFinal.setPixels((i * (size + margins.width)), (j * (size + margins.height)) + k, size, bytes, 4*k);
					}
				}
			}
			
			return imdDataFinal;
			
//			return imgData;
		}	 
	 
		public BufferedImage pixelate(Image img, int size) {
			return pixelate(convertToAWT(img.getImageData()), size); 
		}	 
	 
		public static BufferedImage pixelate(BufferedImage img, int size) {
			BufferedImage dest = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_ARGB);
			for (int x = 0; x < img.getWidth(); x+=size) {
				for (int y = 0; y < img.getHeight(); y+=size) {
					int px = 0;
					for (int xi = 0; xi < size; xi++) {
						for (int yi = 0; yi < size; yi++) {
							px += img.getRGB(x, y);
							px = px / 2;
						}
					}
					for (int xi = 0; xi < size; xi++) {
						for (int yi = 0; yi < size; yi++) {
							dest.setRGB(x+xi, y+yi, px);
						}
					}
				}
			}
			return dest;
		}
	 
		public static BufferedImage histogramThreshold(BufferedImage img, int threshold) {
	 
			BufferedImage dest = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_ARGB);
	 
			int reds[] = new int[256];
			int greens[] = new int[256];
			int blues[] = new int[256];
	 
			//Count the occurance of each pixel's red, green and blue
			for (int x = 0; x < img.getWidth(); x++) {
				for (int y = 0; y < img.getHeight(); y++) {
					int px = img.getRGB(x, y);
	 
	 
					int red = ((px >> 16) & 0xFF);
					reds[red]++;
	 
					int green = ((px >> 8) & 0xFF);
					greens[green]++;
	 
					int blue = (px & 0xFF);
					blues[blue]++;
	 
					dest.setRGB(x, y, px);
				}
			}
	 
			//Analyse the results
			int mostCommonRed = 0;
			int mostCommonBlue = 0;
			int mostCommonGreen = 0;
	 
			for (int i = 0; i < 256; i++) {
				if (reds[i] > mostCommonRed) {
					mostCommonRed = i;
				}
	 
				if (blues[i] > mostCommonBlue) {
					mostCommonBlue = i;
				}
	 
				if (greens[i] > mostCommonGreen) {
					mostCommonGreen = i;
				}
			}
	 
			//Set the destination to pixels that are in a range +/- threshold from mostCommon value
			for (int x = 0; x < img.getWidth(); x++) {
				for (int y = 0; y < img.getHeight(); y++) {
					int px = img.getRGB(x, y);
	 
					int red = ((px >> 16) & 0xFF);
					int green = ((px >> 8) & 0xFF);				
					int blue = (px & 0xFF);
					int val = 0;
	 
	 
					if (((red - 20 < mostCommonRed) && (red + threshold > mostCommonRed)) || ((blue - threshold < mostCommonBlue) && (blue + threshold > mostCommonBlue)) || ((green - threshold < mostCommonGreen) && (green + threshold > mostCommonGreen))) {
						val = (0xFF<<24) + (red<<16) + (green<<8) + blue;
					} else {
						val = (0xFF<<24) + (0xFF<<16) + (0xFF<<8) + 0xFF;
					}
	 
	 
					dest.setRGB(x, y, val);
				}
			}
	 
			return dest;
		}
	 
	 
	 
		public static BufferedImage invert(BufferedImage img) {
			BufferedImage dest = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_ARGB);
	 
			for (int x = 0; x < img.getWidth(); x++) {
				for (int y = 0; y < img.getHeight(); y++) {
					int px = img.getRGB(x, y);
	 
					//Subtracting the channels value from 0xFF effectively inverts it
					int red = 0xFF - ((px >> 16) & 0xFF);
					int green = 0xFF - ((px >> 8) & 0xFF);
					int blue = 0xFF - (px & 0xFF);
	 
					int inverted = (0xFF<<24) + (red<<16) + (green<<8) + blue;
					dest.setRGB(x, y, inverted);
				}
			}
	 
			return dest;
		}
	 
	 
	 
		public BufferedImage greyScale(BufferedImage img) {
			BufferedImage dest = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_ARGB);
	 
			for (int x = 0; x < img.getWidth(); x++) {
				for (int y = 0; y < img.getHeight(); y++) {
	 
					int px = img.getRGB(x, y);
	 
					int alpha = (px >> 24) & 0xFF;
					int red = (px >> 16) & 0xFF;
					int green = (px >> 8) & 0xFF;
					int blue = px & 0xFF;
	 
					//average of RGB
					int avg = (red + blue + green) / 3;
	 
					//set R, G & B with avg color
					int grey = (alpha<<24) + (avg<<16) + (avg<<8) + avg;
	 
					dest.setRGB(x, y, grey);
				}
			}
	 
			return dest;
		}
	 
	 
		public BufferedImage burn(BufferedImage img) {
			BufferedImage dest = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_ARGB);
	 
			for (int x = 0; x < img.getWidth(); x++) {
				for (int y = 0; y < img.getHeight(); y++) {
					int px = img.getRGB(x, y);
	 
					int burn = px << 8; //this was a lucky guess. not sure why it works
	 
					dest.setRGB(x, y, burn);
				}
			}
	 
			return dest;
		}
	 
	 
		public static BufferedImage gaussianFilter(BufferedImage img) {
			int cuttoff = 2000;
			double magic = 1.442695;
			//int xcenter = img.getWidth() / 2 - 1;
			//int ycenter = img.getHeight() / 2 - 1;
	 
			BufferedImage dest = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_ARGB);
	 
			for (int x = 0; x < img.getWidth(); x++) {
				for (int y = 0; y < img.getHeight(); y++) {
					int px = img.getRGB(x, y);
	 
					double distance = Math.sqrt(x*x+y*y);
					double value = px*255*Math.exp((-1*distance*distance)/(magic*cuttoff*cuttoff));
					dest.setRGB(x, y, (int) value);	
	 
				}
			}
			return dest;
	 
		}
	 
	 
		public static BufferedImage flipVerticalHorizontal(BufferedImage img) {
			BufferedImage dest = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_ARGB);
			for (int x = 0; x < img.getWidth(); x++) {
				for (int y = 0; y < img.getHeight(); y++) {
					int px = img.getRGB(x, y);
					int destX = img.getWidth() - x - 1;
					int destY = img.getHeight() - y - 1;
					dest.setRGB(destX, destY, px);			
				}
			}
			return dest;
		}
	 
	 
	 
		public static BufferedImage flipVertical(BufferedImage img) {
			BufferedImage dest = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_ARGB);
			for (int x = 0; x < img.getWidth(); x++) {
				for (int y = 0; y < img.getHeight(); y++) {
					int px = img.getRGB(x, y);
					dest.setRGB(x, img.getHeight() - y - 1, px);			
				}
			}
			return dest;
		}
	 
	 
		public static BufferedImage flipHorizontal(BufferedImage img) {
			BufferedImage dest = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_ARGB);
			for (int x = 0; x < img.getWidth(); x++) {
				for (int y = 0; y < img.getHeight(); y++) {
					int px = img.getRGB(x, y);
					dest.setRGB(img.getWidth() - x - 1, y, px);			
				}
			}
			return dest;
		}
		
		
		public BufferedImage[] loadLocalAnimatedGif(String filePath) {
			return loadAnimatedGif("net/sf/smbt/ui/widgets/common/" + filePath);
		}
		
		public BufferedImage[] loadLocalAnimatedGif2(String filePath) {
			return loadAnimatedGif2(filePath);
		}
		
		public BufferedImage[] loadAnimatedGif(String filePath) {
			List<BufferedImage> imagesList = new ArrayList<BufferedImage>();
			try {

				String[] imageatt = new String[]{
					"imageLeftPosition",
			        "imageTopPosition",
			        "imageWidth",
			        "imageHeight"
				};

				ImageReader reader = (ImageReader)ImageIO.getImageReadersByFormatName("gif").next();
				
				File file = null;
				ClassLoader classLoader = getClass().getClassLoader();
				URL url = classLoader.getResource(filePath);
				
				if (url == null) {
					System.err.println("Could not read resource: '" + filePath + "'. Is your file system case sensitive?");
				} else {
					file = new File(url.getPath());
					String canonical = file.getCanonicalPath();
					if(!canonical.endsWith(new org.eclipse.core.runtime.Path(filePath).lastSegment())) 
						throw new RuntimeException(filePath + ":\n" +
								"The file does not exist exactly as it was named.\n" +
								"The test is likely to cause trouble on the build server.\n" +
								"Is your filesystem case insensitive? Please verify the spelling.");
				}

				if (file != null) {
			        ImageInputStream ciis = ImageIO.createImageInputStream(new FileInputStream(file));
			        reader.setInput(ciis, false);   
			        int noi = reader.getNumImages(true);
			        BufferedImage master = null;
			        
			        for (int i = 0; i < noi; i++) {
			            BufferedImage image = reader.read(i);
			            IIOMetadata metadata = reader.getImageMetadata(i);
			            Node tree = metadata.getAsTree("javax_imageio_gif_image_1.0");
			            NodeList children = tree.getChildNodes();
			            for (int j = 0; j < children.getLength(); j++) {
			                Node nodeItem = children.item(j);
			                if(nodeItem.getNodeName().equals("ImageDescriptor")){
			                    Map<String, Integer> imageAttr = new HashMap<String, Integer>();
			                    for (int k = 0; k < imageatt.length; k++) {
			                        NamedNodeMap attr = nodeItem.getAttributes();
			                        Node attnode = attr.getNamedItem(imageatt[k]);
			                        imageAttr.put(imageatt[k], Integer.valueOf(attnode.getNodeValue()));
			                    }
			
			                    if(i==0){
			                        master = new BufferedImage(imageAttr.get("imageWidth"), imageAttr.get("imageHeight"), BufferedImage.TYPE_INT_ARGB);
			                    }
			                    master.getGraphics().drawImage(image, imageAttr.get("imageLeftPosition"), imageAttr.get("imageTopPosition"), null);
			                    imagesList.add(image);
			                }
			            }
			           //ImageIO.write(master, "GIF", new File( i + ".gif"));
			        }
				}
		    } catch (IOException e) {
		        e.printStackTrace();
		    } 
			 
		return imagesList.toArray(new BufferedImage[0]);
	}

		public BufferedImage[] loadAnimatedGif2(String filePath) {
			List<BufferedImage> imagesList = new ArrayList<BufferedImage>();
			try {

				String[] imageatt = new String[]{
					"imageLeftPosition",
			        "imageTopPosition",
			        "imageWidth",
			        "imageHeight"
				};

				ImageReader reader = (ImageReader)ImageIO.getImageReadersByFormatName("gif").next();
				
				File file = null;
				
				file = new File(filePath);
				String canonical = file.getCanonicalPath();
				if(!canonical.endsWith(new org.eclipse.core.runtime.Path(filePath).lastSegment())) {
					throw new RuntimeException(filePath + ":\n" +
						"The file does not exist exactly as it was named.\n" +
						"The test is likely to cause trouble on the build server.\n" +
						"Is your filesystem case insensitive? Please verify the spelling."
					);
				}

				if (file != null) {
			        ImageInputStream ciis = ImageIO.createImageInputStream(new FileInputStream(file));
			        reader.setInput(ciis, false);   
			        int noi = reader.getNumImages(true);
			        BufferedImage master = null;
			        
			        for (int i = 0; i < noi; i++) {
			            BufferedImage image = reader.read(i);
			            IIOMetadata metadata = reader.getImageMetadata(i);
			            Node tree = metadata.getAsTree("javax_imageio_gif_image_1.0");
			            NodeList children = tree.getChildNodes();
			            for (int j = 0; j < children.getLength(); j++) {
			                Node nodeItem = children.item(j);
			                if(nodeItem.getNodeName().equals("ImageDescriptor")){
			                    Map<String, Integer> imageAttr = new HashMap<String, Integer>();
			                    for (int k = 0; k < imageatt.length; k++) {
			                        NamedNodeMap attr = nodeItem.getAttributes();
			                        Node attnode = attr.getNamedItem(imageatt[k]);
			                        imageAttr.put(imageatt[k], Integer.valueOf(attnode.getNodeValue()));
			                    }
			
			                    if(i==0){
			                        master = new BufferedImage(imageAttr.get("imageWidth"), imageAttr.get("imageHeight"), BufferedImage.TYPE_INT_ARGB);
				                    imagesList.add(master);
			                    }
			                    master.getGraphics().drawImage(image, imageAttr.get("imageLeftPosition"), imageAttr.get("imageTopPosition"), null);
			                    imagesList.add(image);
			                }
			            }
			           //ImageIO.write(master, "GIF", new File( i + ".gif"));
			        }
				}
		    } catch (IOException e) {
		        e.printStackTrace();
		    } 
			 
		return imagesList.toArray(new BufferedImage[0]);
	}
		
	public Image svg2SWTImage2(String svgPath) {
		PNGTranscoder transcoder = new PNGTranscoder();

		TranscoderInput input = new TranscoderInput(getInputStream(svgPath));
		try {

			File dstFile = File.createTempFile("Ubiquisense", ".png");
			OutputStream ostream = new FileOutputStream(dstFile);
			TranscoderOutput output = new TranscoderOutput(ostream);
	
			transcoder.transcode(input, output);
	
			BufferedImage bufferedImage = ImageIO.read(dstFile);
			if (bufferedImage != null) {
				return new Image(Display.getDefault(), convertToSWT(bufferedImage));
			}
			ostream.flush();
			ostream.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TranscoderException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public Image svg2SWTImage(String svgPath) {
		svgConverteer.setDestinationType(DestinationType.PNG);
		svgConverteer.setWidth(400);
		svgConverteer.setMaxWidth(400);
		svgConverteer.setHeight(400);
		svgConverteer.setMaxHeight(400);
		svgConverteer.setSources(new String[] { "/Users/lucas/Documents/workspace_3.8_2/net.sf.smbt.ui.firmata.ubiquino/svg/" + svgPath });
		try {
			File dstFile = File.createTempFile("Ubiquisense", ".png");
			svgConverteer.setDst(dstFile);
			svgConverteer.execute();
			BufferedImage bufferedImage = ImageIO.read(dstFile);
			if (bufferedImage != null) {
				return new Image(Display.getDefault(), convertToSWT(bufferedImage));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SVGConverterException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	 // ***********************************
		
	  SVGDocument svgDocument = null;
	  public SVGDocument loadSVGDocument(String url)
	  { 
		  UserAgent userAgent;
		  DocumentLoader loader;
		  SVGDocumentLoader nextDocumentLoader;
		  System.out.println("testLoading:");
		  userAgent=new UserAgentAdapter();
		  loader = new DocumentLoader(userAgent);
		  nextDocumentLoader = new SVGDocumentLoader(url, loader);
		  nextDocumentLoader.setPriority(Thread.MIN_PRIORITY);
		  nextDocumentLoader.addSVGDocumentLoaderListener(new SVGDocumentLoaderAdapter() { 
			  public void documentLoadingStarted(SVGDocumentLoaderEvent e) { 
				  System.out.println("Document Loading..."); 
			  }
			  public void documentLoadingFailed(SVGDocumentLoaderEvent e) { 
				  System.out.println("Document Loading FAILED."); 
			  }
			  public void documentLoadingCompleted(SVGDocumentLoaderEvent e)
			  { 
				  System.out.println("Document Loaded.");
		      		svgDocument=e.getSVGDocument();
		      		System.out.println("Document Loaded: svgDocument="+svgDocument);
		      		//	try { emitSVG(svgDocument,DTD_URI,System.out); } catch(Throwable ee) { ee.printStackTrace(); }
			  }
		  	}
		 );
		  nextDocumentLoader.run(); //.start();

		  return svgDocument;
	  }


}
