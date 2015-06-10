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

package net.sf.smbt.ui.firmata.ubiquino.editor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import net.sf.smbt.firmata.ubiquino.Ubiquino;
import net.sf.smbt.mdl.arduino.ARDUINO_BOARD_UID;
import net.sf.smbt.ui.hmi.GUIToolkit;

import org.apache.batik.transcoder.TranscoderException;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.image.PNGTranscoder;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

public class UbiquinoPropertySection extends AbstractPropertySection {
	private Ubiquino ubiquino;
	private Label ubiquinoSVGImage;
	
	private Map<ARDUINO_BOARD_UID, String> svgMap; 

	public UbiquinoPropertySection() {
		svgMap = new HashMap<ARDUINO_BOARD_UID, String>(); 
		
		svgMap.put(ARDUINO_BOARD_UID.DIECIMILA_ATMEGA328,		"svg/controller_arduino_diecimila.svg");
		svgMap.put(ARDUINO_BOARD_UID.DIECIMILA_ATMEGA_328P, 	"svg/controller_arduino_diecimila.svg");
		svgMap.put(ARDUINO_BOARD_UID.DIECMILA_ATMEGA_168,		"svg/controller_arduino_diecimila.svg");
		svgMap.put(ARDUINO_BOARD_UID.DUEMILANOVE_ATMEGA_168, 	"svg/controller_arduino_diecimila.svg");
		svgMap.put(ARDUINO_BOARD_UID.DUEMILANOVE_ATMEGA_328, 	"svg/controller_arduino_diecimila.svg");
		svgMap.put(ARDUINO_BOARD_UID.FUNNEL_IO_ATMEGA328P, 		"svg/Arduino_Fio.svg");
		svgMap.put(ARDUINO_BOARD_UID.LEONARDO_ATMEGA32U4, 		"svg/controller_arduino_uno_r3.svg");
		svgMap.put(ARDUINO_BOARD_UID.LILIPAD_ATMEGA_328V, 		"svg/Arduino_LilyPad7f6.svg");
		svgMap.put(ARDUINO_BOARD_UID.PRO_ATMEGA_168, 			"svg/controller_arduino_uno_r3.svg");
		svgMap.put(ARDUINO_BOARD_UID.PRO_ATMEGA_328, 			"svg/controller_arduino_uno_r3.svg");
		svgMap.put(ARDUINO_BOARD_UID.UNO_ATMEGA328, 			"svg/controller_arduino_uno_r3.svg");
		svgMap.put(ARDUINO_BOARD_UID.MEGA_ATMEGA_1280, 			"svg/controller_arduino_mega.svg");
		svgMap.put(ARDUINO_BOARD_UID.MINI_ATMEGA_168, 			"svg/controller_arduino_mega.svg");
		svgMap.put(ARDUINO_BOARD_UID.MINI_PRO_ATMEGA_168, 		"svg/Arduino-Pro-Mini-v11_breadboard.svg");
		svgMap.put(ARDUINO_BOARD_UID.NANO_30_ATMEGA328, 		"svg/Arduino-Pro-Mini-v11_breadboard.svg");
	}
	
	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		aTabbedPropertySheetPage.getControl().setBackground(GUIToolkit.BG);
		
		parent.setLayout(GridLayoutFactory.fillDefaults().create());
		parent.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		parent.setBackground(GUIToolkit.BG);
		parent.getParent().setBackground(GUIToolkit.BG);
		parent.getParent().getParent().setBackground(GUIToolkit.BG);
		
		createFixturesView(parent);
	}

	
//	private ListViewer streamListViewer;

	private void createFixturesView(Composite container) {
	    ubiquinoSVGImage = new Label(container, SWT.NONE);
	    ubiquinoSVGImage.setLayoutData(GridDataFactory.fillDefaults().align(SWT.BEGINNING, SWT.TOP).create());
	}
	
	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		Object o = unwrap(selection);
		if (o instanceof Ubiquino && ((Ubiquino) o).getBoard() != null) {
			ubiquino = (Ubiquino) o;
		    if (svgMap.containsKey(ubiquino.getBoard().getKind())) {
				try {
					
					String filePath = svgMap.get(ubiquino.getBoard().getKind());
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
			    
						ubiquinoSVGImage.setImage(svg2SWTImage2(canonical));
					}
				} catch (IOException io) {
					io.printStackTrace();
				}
		    }
		}
	}
	
	private Object unwrap(Object element) {
		if (element instanceof IStructuredSelection) {
			return ((IStructuredSelection) element).getFirstElement();
		}
		return element;
	}
	
	public Image svg2SWTImage2(String svgPath) {
		PNGTranscoder transcoder = new PNGTranscoder();

		TranscoderInput input = new TranscoderInput(getInputStream(svgPath));
		try {

			File dstFile = File.createTempFile("Ubiquisense", ".png");
			OutputStream ostream = new FileOutputStream(dstFile);
			InputStream istream = new FileInputStream(dstFile);
			TranscoderOutput output = new TranscoderOutput(ostream);
	
			transcoder.transcode(input, output);
			Image img = null;
			try {
				img = new Image(Display.getDefault(), istream);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				ostream.flush();
				ostream.close();
				istream.close();
			}
			return img;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (TranscoderException e) {
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
				if (resourceAsStream == null) {
					System.err.println("Could not read resource: '" + filePath + "'. Is your file system case sensitive?");
				} else {
					return resourceAsStream; 
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
