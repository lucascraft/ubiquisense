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

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.smbt.ui.widgets.Activator;

import org.eclipse.core.runtime.Path;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Display;

public class FontUtils {
	
	public final static FontUtils INSTANCE = new FontUtils();
	
	private Map<String, Font> fontRegistry;

	public FontUtils() {
		fontRegistry = new HashMap<String, Font>();
		loadFonts();
	}
	
	public List<Font> getFonts() {
		List<Font> fontList = new ArrayList<Font>();
		for (Object k : fontRegistry.keySet()) {
			String key = (String)k;
			System.out.println("getFonts() : " + key);
			Font f = fontRegistry.get(key);
			if (f!=null) {
				fontList.add(f);
			}
		}
		return fontList;
	}
	
	public Map<String, Font> getFontRegistry() {
		return fontRegistry;
	}
	
	public List<Font> getFont(String path) {
		String key = path.replace(".ttf", "");
		key = key.replace(".TTF", "");
		if (fontRegistry.keySet().contains(key)) {
			System.out.println("Found Font = " + key);
			return Arrays.asList(new Font[]{fontRegistry.get(key)});
		}
		List<Font> fonts = new ArrayList<Font>();
		try {
			fonts = loadFont("fonts/"+path);
		} catch (Throwable t) {
			t.printStackTrace();
		}
		return fonts;
	}

	
	@SuppressWarnings("resource")
	private List<Font> loadFont(String filePath) {
		try {
			ClassLoader classLoader = getClass().getClassLoader();
			URL url = classLoader.getResource(filePath);
			if (url == null) {
				System.err.println("Could not read resource: '" + filePath + "'. Is your file system case sensitive?");
			} else {
				File inFile = new File(url.getPath());
				String canonical = inFile.getCanonicalPath();
				if(canonical == null) 
					throw new RuntimeException(filePath + ":\n" +
							"The file does not exist exactly as it was named.\n" +
							"The test is likely to cause trouble on the build server.\n" +
							"Is your filesystem case insensitive? Please verify the spelling.");
	
				InputStream resourceAsStream = classLoader.getResourceAsStream(filePath);
				try {
					if (resourceAsStream == null) {
						System.err.println("Could not read resource: '" + filePath + "'. Is your file system case sensitive?");
					} else {
						File f = File.createTempFile("font-", ".ttf");
						
						BufferedInputStream reader = new BufferedInputStream(resourceAsStream);
						ByteBuffer byteBuffer = ByteBuffer.allocate(resourceAsStream.available());
						byte[] buffer = new byte[resourceAsStream.available()];
						int l = 0;
						while (l != -1) {
							l = reader.read(buffer);
							if (l>0) {
								byteBuffer.put(buffer, 0, l);
							}
						}
						byteBuffer.flip();
						
						FileOutputStream fos = new FileOutputStream(f);
						f.deleteOnExit();
						fos.write(byteBuffer.array());
						fos.flush();
						
				        boolean isFontLoaded = Display.getDefault().loadFont(f.getCanonicalPath());
				        if( isFontLoaded ) {
				        	Path path = new org.eclipse.core.runtime.Path(filePath);
				        	String key = path.lastSegment();
				        	key = key.replace("."+path.getFileExtension(), "");
				        	//System.out.println("Load Font = " + key);
				        	
				        	int i = 0;
				        	List<Font> fonts = new ArrayList<Font>();
				        	for (FontData fData : Display.getDefault().getFontList(key, true)) {
				        		fData.height = 30;
				        		fData.setStyle(SWT.NORMAL);
				        		
				        		System.out.println("===> Font " + i + " : [" + fData.getName() + "][" + fData.height + "]");
				        		Font font =  new Font(Display.getDefault(), fData);
				        		
					        	fontRegistry.put(key, font);
					        	
					        	fonts.add(font);
				        	}
				        	return fonts;
				        }
				        fos.close();
					}
				} finally {
					if (resourceAsStream != null)
						resourceAsStream.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ArrayList<Font>();
	}

	
	public void loadFonts() {
		if (Activator.getDefault() != null) {
			if (Activator.getDefault().getBundle() != null) {
				Enumeration<URL> urls = Activator.getDefault().getBundle().findEntries("src/fonts", "*.ttf", false);
				if (urls != null) {
					while(urls.hasMoreElements()) {
						URL url = urls.nextElement();
						if (url != null) {
							//System.out.println(url.getFile());
							String fname = url.getFile(); 
							if (fname.contains("/") && fname.endsWith(".ttf")) {
								String path = fname.substring(fname.lastIndexOf("/")+1);
								getFont(path);
							}
						}
					}
				}
			}
		}
	}
}
