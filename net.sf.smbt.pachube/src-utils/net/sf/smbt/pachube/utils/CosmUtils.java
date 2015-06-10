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

package net.sf.smbt.pachube.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.UUID;

import net.sf.smbt.ezcosm.CosmProject;
import net.sf.smbt.ezcosm.EzcosmPackage;
import net.sf.smbt.ezcosm.util.EzcosmResourceFactoryImpl;
import net.sf.xqz.model.temporal.TemporalPackage;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.osgi.service.datalocation.Location;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.part.FileEditorInput;
import org.eeml.xsd._0._5.DispositionType;
import org.eeml.xsd._0._5.DomainType;
import org.eeml.xsd._0._5.EnvironmentType;
import org.eeml.xsd._0._5.ExposureType;
import org.eeml.xsd._0._5.LocationType;
import org.eeml.xsd._0._5._5Factory;
import org.eeml.xsd._0._5._5Package;

public class CosmUtils {

	public final static CosmUtils INSTANCE = new CosmUtils();
	
	public final static String COSM_ADDR = "/cosm";
	public final static String COSM_VER = "/v2";
	
	
	
	
	/**
	 * Initialize Cosm model from a .ezcosm XMI persistence
	 * 
	 * @param EEML aq .ezcosm byte[] flow
	 * 
	 * @return EEML model
	 */
	public CosmProject loadCosmProjectFromXML(String eemlContent) {
		//
		// Create a resource set.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		//
		// Register the default resource factory -- only needed for stand-alone!
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(EzcosmPackage.eNS_PREFIX, new EzcosmResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(EzcosmPackage.eNS_URI, _5Package.eINSTANCE);
		resourceSet.getPackageRegistry().put(_5Package.eNS_URI, _5Package.eINSTANCE);

		//
		// Register the package -- only needed for stand-alone !
		//
		_5Package eemlPackage		= _5Package.eINSTANCE;
		
		if (Platform.inDebugMode()) {
			System.out.println("init " + eemlPackage.getNsURI());
		}

		File ezcosmFile = null;
		
		Location configArea = Platform.getConfigurationLocation();
		String configLocation = null;
		if (configArea != null) {
			configLocation = configArea.getURL().getFile();
		}
		if (configLocation != null) {
			Location location = Platform.getInstallLocation();
			if (location != null) {
				URL url = location.getURL();
				if (url != null) {
					ezcosmFile = new File(configLocation.toString() + "/__TEMP-EZ-COSM_" + UUID.randomUUID().toString() + ".cosm");
				}
			}
		}

		//
		// Get the URI of the model file.
		//
		URI ezcosmURI = null;
		try {
			ezcosmURI = URI.createFileURI(ezcosmFile.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileOutputStream os = null;
		try {
			os = new FileOutputStream(ezcosmFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		BufferedWriter writer = new BufferedWriter(
			new OutputStreamWriter(
				os, 
				Charset.forName("UTF-8")
			)
		);
		
		try {
			writer.write(eemlContent);
			writer.flush();
			
			os.flush();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		//
		// Demand load the resource for this file.
		//
		Resource resource = resourceSet.getResource(ezcosmURI, true);

		Object obj = (Object) resource.getContents().get(0);
		
		ezcosmFile.delete();
		
		if (obj instanceof CosmProject) {
			return (CosmProject) obj;
		} else {
			return null;
		}
	}
	
	
	
	
	
	
	
	
	//
	//
	// URI Resource load/save
	//
	//

	public void save(IEditorInput uriInput, CosmProject project) {
		if (project != null) {
			if (uriInput instanceof FileEditorInput) {
				IFile file = ((FileEditorInput)uriInput).getFile();
				ResourceSetImpl resourceSetImpl = new ResourceSetImpl();
				try {
					URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
					Resource resource = resourceSetImpl.createResource(uri);
					resource.getContents().add(project);
					resource.save(new HashMap<Object, Object>());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	@SuppressWarnings("unused")
	public CosmProject load(IEditorInput uriInput) {
		TemporalPackage		p0	= TemporalPackage.eINSTANCE;
		_5Package			p1	= _5Package.eINSTANCE;
		EzcosmPackage		p2	= EzcosmPackage.eINSTANCE;
		
		if (uriInput instanceof FileEditorInput) {
			IFile file = ((FileEditorInput)uriInput).getFile();
			ResourceSetImpl resourceSetImpl = new ResourceSetImpl();
			try {
				URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
				Resource resource = resourceSetImpl.getResource(uri, true);
				resource.load(new HashMap<Object, Object>());
				return (CosmProject) resource.getContents().get(0);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public EnvironmentType createDefaultEnvType() {
		EnvironmentType envType = _5Factory.eINSTANCE.createEnvironmentType();
		
		LocationType loc = _5Factory.eINSTANCE.createLocationType();
		loc.setDisposition(DispositionType.FIXED);
		loc.setDomain(DomainType.PHYSICAL);
		loc.setExposure(ExposureType.INDOOR);
		loc.setLon(0d);
		loc.setLat(0d);
		loc.setName("");
		
		envType.setLocation(loc);
		envType.setDescription("");
		
		return envType;
	}
	
	
}
