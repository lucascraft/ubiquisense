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

package net.sf.smbt.kml.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.google.earth.kml._2.KmlType;
import com.google.earth.kml._2.v21Package;
import com.google.earth.kml._2.util.v21ResourceFactoryImpl;


public class KmlUtils {

	public final static KmlUtils INSTANCE = new KmlUtils();

	/**
	 * Initialize KML model from a .kml file
	 * 
	 * @param kmlFilePath a .kml file
	 * 
	 * @return UI model
	 */
	public KmlType loadKML(String kmlFilePath) {
		
		//System.out.println("... load " + kmlFilePath);
		
		//
		// Create a resource set.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		//
		// Register the default resource factory -- only needed for stand-alone!
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(v21Package.eNS_PREFIX, new v21ResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("kml", new v21ResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(v21Package.eNS_URI, v21Package.eINSTANCE);

		//
		// Register the package -- only needed for stand-alone!
		//
		@SuppressWarnings("unused")
		v21Package kmlPackage = v21Package.eINSTANCE;
		
		File kmlFile = new File(kmlFilePath);
		
		Path path = new Path(kmlFilePath);
		String tmpPath = path.removeLastSegments(1) + "/tmp-" + path.lastSegment();
		File tmpQxfFile = new File(tmpPath);
		try {
			FileInputStream fileIS = new FileInputStream(kmlFile);
			byte[] buffer = new byte[fileIS.available()];
			
			fileIS.read(buffer);
			fileIS.close();
			
			String content = new String(buffer, Charset.forName("UTF-8"));
			
			content = content.replace("http://earth.google.com/kml/2.0", "http://earth.google.com/kml/2.1");

			System.out.println(content);
			
			/*
			content = content.replace("</kml>",QXF_XMLNS_FOOTER);
			*/
			FileOutputStream neOutputStream = new FileOutputStream(tmpQxfFile);
			
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
			URI kmlURI = URI.createFileURI(tmpQxfFile.getAbsolutePath());
			
			//
			// Demand load the resource for this file.
			//
			Resource resource = resourceSet.getResource(kmlURI, true);
			
			Object obj = (Object) resource.getContents().get(0);
			
			tmpQxfFile.delete();
			
			if (obj instanceof KmlType) {
				return postProcessing((KmlType) obj);
			} 
		} catch (Throwable t) {
			t.printStackTrace();
		}
		
		return null;
	}
	
	/**
	 * Initialize KML Fixture model from a .kml file
	 * 
	 * @param kmlFilePath a .kml file
	 * 
	 * @return KML xml
	 */
	public String loadKmlAsString(String kmlFilePath) {
		String xml = ""; 

		//
		// Create a resource set.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		//
		// Register the default resource factory -- only needed for stand-alone!
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(v21Package.eNS_PREFIX, new v21ResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("kml", new v21ResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(v21Package.eNS_URI, v21Package.eINSTANCE);

		//
		// Register the package -- only needed for stand-alone!
		//
		@SuppressWarnings("unused")
		v21Package kmlPackage = v21Package.eINSTANCE;
		
		File kmlFile = new File(kmlFilePath);
		
		Path path = new Path(kmlFilePath);
		String tmpPath = path.removeLastSegments(1) + "/tmp-" + path.lastSegment();
		File tmpKmlFile = new File(tmpPath);
		
		try {
			FileInputStream fileIS = new FileInputStream(kmlFile);
			byte[] buffer = new byte[fileIS.available()];
			
			fileIS.read(buffer);
			fileIS.close();
			
			String content = new String(buffer, Charset.forName("UTF-8"));
			
			content = content.replace("http://earth.google.com/kml/2.0", "http://earth.google.com/kml/2.1");

			xml = content;
			
			System.out.println(content);
			
			/*
			content = content.replace("</kml>",QXF_XMLNS_FOOTER);
			*/
			FileOutputStream neOutputStream = new FileOutputStream(tmpKmlFile);
			
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
	
	private KmlType postProcessing(KmlType fixtureDefinition) {
		//if (fixtureDefinition instanceof FixtureDefinition) {
		//	fixtureDefinition.getChannel();
		//}
		return fixtureDefinition;
	}
	
	public static void main(String[] args) {
		//KmlUtils.INSTANCE.loadKML("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.kml/src/samples/922484.kml");
		KmlUtils.INSTANCE.loadAppFromKmlXML("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.kml/src/samples/1731198.kmz");
	}
	
	public final static String Kml_XMLNS_HEADER = new String("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<Kml:TOP xmlns:Kml=\"http:///net.sf.smbt.Kml/src/net/sf/smbt/Kml/model/Kml.xsd\">".getBytes(), Charset.forName("ASCII"));
	
	public String loadKmzXML(String zipKmlFilePath) {
		List<String> KmlFilePathList = new ArrayList<String>();
		IPath path = new Path(zipKmlFilePath);
		String xml = "";
		try {
			FileInputStream KmlFile = new FileInputStream(zipKmlFilePath);
			ZipInputStream fileIS = new ZipInputStream(KmlFile);
			ZipEntry zEntry = null;
			while ((zEntry = fileIS.getNextEntry()) != null) {
				if (zEntry.getName().endsWith(".kml")) {
					KmlFilePathList.add(path.removeLastSegments(1) + "/_" + path.lastSegment() );
				}
				
				InputStreamReader is = new InputStreamReader(fileIS, Charset.forName("UTF-8"));
				BufferedReader reader = new BufferedReader(is);
				CharBuffer charBuffer = CharBuffer.allocate(65535);

				while (reader.read(charBuffer) != -1)
				
				charBuffer.flip();
				
				xml = charBuffer.toString();
				
				is.close();
				
				System.out.println(xml);
			}
			
			fileIS.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		return xml;
	}
	
	
	/**
	 * Initialize UI model from a .kmz file
	 * 
	 * @param zipKmlFilePath a .kmz file
	 * 
	 * @return UI model
	 */
	public KmlType loadAppFromKmlXML(String zipKmlFilePath) {
		//
		// Create a resource set.
		//
		ResourceSet resourceSet = new ResourceSetImpl();


		IPath path = new Path(zipKmlFilePath);
		
		//
		// Register the default resource factory -- only needed for stand-alone!
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(v21Package.eNS_PREFIX, new v21ResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(v21Package.eNS_URI, v21Package.eINSTANCE);
		//resourceSet.getPackageRegistry().put(KmlappPackage.eNS_URI, KmlappPackage.eINSTANCE);

		List<String> KmlFilePathList = new ArrayList<String>();
		try {
			FileInputStream KmlFile = new FileInputStream(zipKmlFilePath);
			ZipInputStream fileIS = new ZipInputStream(KmlFile);
			
			ZipEntry zEntry = null;
			while ((zEntry = fileIS.getNextEntry()) != null) {
				if (zEntry.getName().endsWith(".xml")) {
					KmlFilePathList.add(path.removeLastSegments(1) + "/_" + path.lastSegment() );
				}
				FileOutputStream os		= new FileOutputStream(path.removeLastSegments(1) + "/_" + path.lastSegment());
				BufferedWriter writer	= new BufferedWriter(new OutputStreamWriter(os));
				InputStreamReader is	= new InputStreamReader(fileIS, Charset.forName("UTF-8"));
				BufferedReader reader = new BufferedReader(is);
				CharBuffer charBuffer = CharBuffer.allocate(6553500);
				while (reader.read(charBuffer) != -1)
				
				charBuffer.append("</Kml:TOP>\n");
				charBuffer.flip();
				
				String content = charBuffer.toString();
				content = content.replace("<Kml>", "");
				content = content.replace("</Kml>", "");
				content = content.replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", Kml_XMLNS_HEADER);
				
				is.close();
				
				writer.write(content);
				writer.flush();
				os.flush();
				os.close();
			}
			fileIS.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
			
		//
		// Get the URI of the model file.
		//
		URI KmlURI = URI.createFileURI(KmlFilePathList.get(0));
		
		//
		// Demand load the resource for this file.
		//
		Resource resource = resourceSet.getResource(KmlURI, true);
		
		Object obj = (Object) resource.getContents().get(0);
		if (obj instanceof KmlType) {
			KmlType top = (KmlType) obj;
			
			return top;
		} 
		return null;
	}
	
	/**
	 * Initialize UI model from a .Kml file
	 * 
	 * @param zipKmlFilePath a .Kml file
	 * 
	 * @return UI model
	 */
	public KmlType loadAppFromKmlXML2(String zipKmlFilePath) {
		//
		// Create a resource set.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		//
		// Register the default resource factory -- only needed for stand-alone!
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(v21Package.eNS_PREFIX, new v21ResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(v21Package.eNS_URI, v21Package.eINSTANCE);
		//resourceSet.getPackageRegistry().put(KmlappPackage.eNS_URI, KmlappPackage.eINSTANCE);

		List<String> KmlFilePathList = new ArrayList<String>();
		try {
			URL url = KmlUtils.class.getClassLoader().getResource(".");
			
			FileInputStream KmlFile = new FileInputStream(url.getPath()  + "../samples/" + zipKmlFilePath);
			ZipInputStream fileIS = new ZipInputStream(KmlFile);
			
			ZipEntry zEntry = null;
			while ((zEntry = fileIS.getNextEntry()) != null) {
				if (zEntry.getName().endsWith(".xml")) {
					KmlFilePathList.add(url.getPath()  + "../samples/_"+ zipKmlFilePath);
				}
				FileOutputStream os		= new FileOutputStream(url.getPath()  + "../samples/_"+ zipKmlFilePath);
				BufferedWriter writer 	= new BufferedWriter(new OutputStreamWriter(os));
				InputStreamReader is 	= new InputStreamReader(fileIS, Charset.forName("UTF-8"));
				BufferedReader reader 	= new BufferedReader(is);
				CharBuffer charBuffer 	= CharBuffer.allocate(65535);
				
				while (reader.read(charBuffer) != -1)
				
				charBuffer.append("</Kml:TOP>\n");
				charBuffer.flip();
				
				String content = charBuffer.toString();
				content = content.replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", Kml_XMLNS_HEADER);
				
				is.close();
				
				writer.write(content);
				writer.flush();
				os.flush();
				os.close();
			}
			fileIS.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
			
		//
		// Get the URI of the model file.
		//
		URI KmlURI = URI.createFileURI(KmlFilePathList.get(0));
		
		//
		// Demand load the resource for this file.
		//
		Resource resource = resourceSet.getResource(KmlURI, true);
		
		Object obj = (Object) resource.getContents().get(0);
		if (obj instanceof KmlType) {
			KmlType top = (KmlType) obj;
			
			return top;
		} 
		return null;
	}
}
