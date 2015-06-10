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

package net.sf.smbt.dmx.utils;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;

import net.sf.smbt.dmx.Activator;
import net.sf.smbt.dmx.ezdmxctrl.DMXLibrary;
import net.sf.smbt.dmx.ezdmxctrl.DMXProject;
import net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl;
import net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlFactory;
import net.sf.smbt.dmx.ezdmxctrl.EzdmxctrlPackage;
import net.sf.smbt.dmx.model.ezdmx.EzdmxPackage;
import net.sf.smbt.dmx.model.qxf.FixtureDefinition;
import net.sf.smbt.dmx.model.qxf.QxfPackage;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.part.FileEditorInput;
import org.osgi.framework.Bundle;

public class DMXUtils {
	public final static DMXUtils INSTANCE = new DMXUtils();
	
	public DMXLibrary initDMX() {
		DMXLibrary lib = EzdmxctrlFactory.eINSTANCE.createDMXLibrary();
		
		for (FixtureDefinition fixture : loadFixtureDefinitions(true)) {
			lib.getFixtures().add(fixture);
		}
		
		return lib;
	}
	
	private List<FixtureDefinition> loadFixtureDefinitions(boolean internal) {
		List<FixtureDefinition> fixtures = new ArrayList<FixtureDefinition>();
		
		String dirName = Platform.getInstallLocation().getURL().getPath() + "/fixtures";
		
		// System.out.println("Load DMX fixtures from " + dirName);
		
		String[] files = new File(dirName).list();

		if (!internal && files != null && files.length>0) { 
			// System.out.println("external QXF load from jar resources ...");
			for (String f : files) {
				String filepath = dirName + "/" + f;
				if (filepath.endsWith(".qxf")) {
					FixtureDefinition fixture = QxfUtils.INSTANCE.loadQXF(filepath);
					if (fixture instanceof FixtureDefinition) {
					   	fixtures.add(fixture);
					}
				}
			}	
		} else {		
			// System.out.println("internal QXF load from jar resources ...");
			Bundle bundle = Platform.getBundle(Activator.getDefault().getBundle().getSymbolicName());
			
			Enumeration<String> entries = bundle.getEntryPaths("/fixtures");
			
			while (entries.hasMoreElements()) {
				String entry = entries.nextElement();
				
				if (!entry.endsWith(".qxf")) {
					continue;
				}
				

				File f = null;
				try {
			        URL entryURL = bundle.getEntry(entry);
			        URL fileUrl = FileLocator.toFileURL(entryURL);
			        java.net.URI fileUri = FileLocator.resolve(fileUrl).toURI();
			        
			        // System.out.println("---> " + uri.getRawPath());
			        
			        f = new File(fileUri);
			        
			        if (f != null) {
			        	System.out.println("File : " + f.getCanonicalPath());
			        	
				        FixtureDefinition fixture = QxfUtils.INSTANCE.loadQXF(f.getCanonicalPath());
				        if (fixture instanceof FixtureDefinition) {
				        	fixtures.add(fixture);
				        }
			        }
				} catch(URISyntaxException e1) {
					e1.printStackTrace();
				} catch(IOException e2) {
					e2.printStackTrace();
				}
			}
		}
		return fixtures;
	}
	
	public DMXProject initDMXProject() {
		DMXProject dmxProject = EzdmxctrlFactory.eINSTANCE.createDMXProject();
		dmxProject.getUniverses().add(initDMXUniverse());
		dmxProject.setLibrary(initDMX());
		return dmxProject;
	}
	
	public DMXUniverseCtrl initDMXUniverse() {
		DMXUniverseCtrl dmxUniverse = EzdmxctrlFactory.eINSTANCE.createDMXUniverseCtrl();
		dmxUniverse.setAddrRangeMin(0);
		dmxUniverse.setAddrRangeMax(512);
		return dmxUniverse;
	}
	

	//
	//
	// URI Resource load/save
	//
	//

	public void save(IEditorInput uriInput, DMXProject project) {
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
	
	@SuppressWarnings("unused")
	public DMXProject load(IEditorInput uriInput) {
		EzdmxPackage		p1	= EzdmxPackage.eINSTANCE;
		EzdmxctrlPackage	p2	= EzdmxctrlPackage.eINSTANCE;
		QxfPackage			p3	= QxfPackage.eINSTANCE;
		
		if (uriInput instanceof FileEditorInput) {
			IFile file = ((FileEditorInput)uriInput).getFile();
			
			ResourceSetImpl resourceSetImpl = new ResourceSetImpl();
			
			try {
				URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
				
				Resource resource = resourceSetImpl.getResource(uri, true);
			
				resource.load(new HashMap<Object, Object>());
				
				return (DMXProject) resource.getContents().get(0);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
