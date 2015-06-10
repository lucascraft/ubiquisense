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

package net.sf.smbt.gpx.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.topografix.gpx.v1._1.DocumentRoot;
import com.topografix.gpx.v1._1.GpxType;
import com.topografix.gpx.v1._1.v1Package;
import com.topografix.gpx.v1._1.util.v1ResourceFactoryImpl;

public class Gpx1Utils {

	public final static Gpx1Utils INSTANCE = new Gpx1Utils();
	
	public final static String GPX_XMLNS_HEADER = new String("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<gpx:GpxType xmlns:gpx=\"http:///net.sf.smbt.gpx/xsd/gpx.xsd\">".getBytes(), Charset.forName("UTF-8"));
	public final static String GPX_XMLNS_FOOTER = new String("</gpx:GpxType>");

	
	/**
	 * Initialize GPX  model from a .gpx file
	 * 
	 * @param gpxFilePath a .gpx file
	 * 
	 * @return GPS model
	 */
	public GpxType loadGPX(String gpxFilePath) {
		
		//System.out.println("... load " + gpxFilePath);
		
		//
		// Create a resource set.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		//
		// Register the default resource factory -- only needed for stand-alone!
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(v1Package.eNS_PREFIX, new v1ResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("gpx", new v1ResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(v1Package.eNS_URI, v1Package.eINSTANCE);

		//
		// Register the package -- only needed for stand-alone!
		//
		@SuppressWarnings("unused")
		v1Package gpxPackage = v1Package.eINSTANCE;
		
		File gpxFile = new File(gpxFilePath);
		
		Path path = new Path(gpxFilePath);
		String tmpPath = path.removeLastSegments(1) + "/tmp-" + path.lastSegment();
		File tmpGpxFile = new File(tmpPath);
		try {
			FileInputStream fileIS = new FileInputStream(gpxFile);
			byte[] buffer = new byte[fileIS.available()];
			
			fileIS.read(buffer);
			fileIS.close();
			
			String content = new String(buffer, Charset.forName("UTF-8"));
			
			System.out.println(content);
			
			FileOutputStream neOutputStream = new FileOutputStream(tmpGpxFile);
			
			neOutputStream.write(content.getBytes());
			neOutputStream.flush();
			neOutputStream.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
			
		try {
			//
			// Get the URI of the model file.
			//
			URI gpxURI = URI.createFileURI(tmpGpxFile.getAbsolutePath());
			
			//
			// Demand load the resource for this file.
			//
			Resource resource = resourceSet.getResource(gpxURI, true);
			
			Object obj = (Object) resource.getContents().get(0);
			
			tmpGpxFile.delete();
			
			if (obj instanceof DocumentRoot) {
				if (((DocumentRoot)obj).getGpx() instanceof GpxType) {
					return postProcessing(((DocumentRoot)obj).getGpx());
				} 
			}
		} catch (Throwable t) {
			t.printStackTrace();
		}
		
		return null;
	}
	
	private GpxType postProcessing(GpxType fixtureDefinition) {
		//if (fixtureDefinition instanceof FixtureDefinition) {
		//	fixtureDefinition.getChannel();
		//}
		return fixtureDefinition;
	}
	
	public String loadGPXAsPureXML(String gpxFilePath) {
		String xml = loadGPXAsString(gpxFilePath);
		int idxMetadata = xml.lastIndexOf("</metadata>");
		xml = xml.substring(idxMetadata + "</metadata>".length());
		xml = "<gpx>" + xml;
		return xml;
	}
	
	/**
	 * Initialize GPX Fixture model from a .kml file
	 * 
	 * @param gpxFilePath a .gpx file
	 * 
	 * @return GPX xml
	 */
	public String loadGPXAsString(String gpxFilePath) {
		String xml = ""; 

		//
		// Create a resource set.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		//
		// Register the default resource factory -- only needed for stand-alone!
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(v1Package.eNS_PREFIX, new v1ResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("gpx", new v1ResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(v1Package.eNS_URI, v1Package.eINSTANCE);

		//
		// Register the package -- only needed for stand-alone!
		//
		@SuppressWarnings("unused")
		v1Package gpxPackage = v1Package.eINSTANCE;
		
		File gpxFile = new File(gpxFilePath);
		
		Path path = new Path(gpxFilePath);
		String tmpPath = path.removeLastSegments(1) + "/tmp-" + path.lastSegment();
		File tmpGpxFile = new File(tmpPath);
		
		try {
			FileInputStream fileIS = new FileInputStream(gpxFile);
			byte[] buffer = new byte[fileIS.available()];
			
			fileIS.read(buffer);
			fileIS.close();
			
			String content = new String(buffer, Charset.forName("UTF-8"));
			
			content = content.replace("http://earth.google.com/kml/2.0", "http://earth.google.com/kml/2.1");

			xml = content;
			
			System.out.println(content);
			
			FileOutputStream neOutputStream = new FileOutputStream(tmpGpxFile);
			
			neOutputStream.write(content.getBytes());
			neOutputStream.flush();
			neOutputStream.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		
		return xml;
	}

	
	
	public static void main(String[] args) {
/*
		Gpx1Utils.INSTANCE.loadGPX("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.gpx/src-utils/samples/cabanedaula.gpx");
		Gpx1Utils.INSTANCE.loadGPX("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.gpx/src-utils/samples/cascadedars.gpx");
		Gpx1Utils.INSTANCE.loadGPX("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.gpx/src-utils/samples/cirquedanglade.gpx");
		Gpx1Utils.INSTANCE.loadGPX("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.gpx/src-utils/samples/Pic_de_turguilla.gpx");
		Gpx1Utils.INSTANCE.loadGPX("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.gpx/src-utils/samples/Pic_du_Midi.gpx");
		Gpx1Utils.INSTANCE.loadGPX("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.gpx/src-utils/samples/valleedelatrappe.gpx");
		Gpx1Utils.INSTANCE.loadGPX("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.gpx/src-utils/samples/Vignemale.gpx");
*/
		Gpx1Utils.INSTANCE.loadGPXAsString("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.gpx/src-utils/samples/cabanedaula.gpx");
		Gpx1Utils.INSTANCE.loadGPXAsString("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.gpx/src-utils/samples/cascadedars.gpx");
		Gpx1Utils.INSTANCE.loadGPXAsString("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.gpx/src-utils/samples/cirquedanglade.gpx");
		Gpx1Utils.INSTANCE.loadGPXAsString("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.gpx/src-utils/samples/Pic_de_turguilla.gpx");
		Gpx1Utils.INSTANCE.loadGPXAsString("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.gpx/src-utils/samples/Pic_du_Midi.gpx");
		Gpx1Utils.INSTANCE.loadGPXAsString("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.gpx/src-utils/samples/valleedelatrappe.gpx");
		Gpx1Utils.INSTANCE.loadGPXAsString("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.gpx/src-utils/samples/Vignemale.gpx");
	}
}
