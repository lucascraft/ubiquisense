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

package net.sf.smbt.osc.ezmojo.utils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import net.sf.smbt.ezmojo.EZMojoNode;
import net.sf.smbt.ezmojo.EZMojoRoot;
import net.sf.smbt.ezmojo.EzmojoFactory;
import net.sf.smbt.ezmojo.EzmojoPackage;
import net.sf.smbt.xcp.XcpPackage;
import net.sf.xqz.engine.script.orchestror.OrchestrorPackage;
import net.sf.xqz.model.cmd.CmdPackage;
import net.sf.xqz.model.temporal.TemporalPackage;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.osgi.service.datalocation.Location;

public class EzMojoResourceUtils {
	public final static EzMojoResourceUtils INSTANCE = new EzMojoResourceUtils();

	public void dumpEzMojo() {}
	
	public EZMojoRoot loadEzMojoFromPrefs() {
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
					return loadEzMojoFromPrefs(configLocation);
				}
			}
		}
		return null;
	}
	
	public void storeEmptyConsoleEzTree() {
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
					dumpEmptyEzMojo2File(configLocation);
				}
			}
		}
	}
	
	public void dumpConsoleEzTree(EZMojoRoot root) {
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
					dumpEzMojo2File(root, configLocation);
				}
			}
		}
	}
	
	
	public void dumpEmptyEzMojo2File(String destDirname) {
		// Create a resource set.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		//
		// Register the default resource factory -- only needed for stand-alone!
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(EzmojoPackage.eNS_PREFIX, new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(EzmojoPackage.eNS_URI, EzmojoPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(OrchestrorPackage.eNS_URI, OrchestrorPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(CmdPackage.eNS_URI, CmdPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(TemporalPackage.eNS_URI, TemporalPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(XcpPackage.eNS_URI, XcpPackage.eINSTANCE);

		String dirname;
		if (destDirname == null) {
			dirname = Platform.getInstallLocation().getURL().getPath() + "/" + "configuration";
			
			if (Platform.inDebugMode()) {
				System.out.println("creating " + dirname + " directory");
			}
			
			new File(dirname).mkdir();
		} else {
			dirname = destDirname;
		}
		
		//
		// Get the URI of the model file.
		//
		URI touchoscURI = URI.createFileURI(dirname + "/" + "ezmojoroot.ezmojo");
		
		//
		// Demand load the resource for this file.
		//
		Resource resource = resourceSet.createResource(touchoscURI);
		
		EZMojoRoot root = createEmptyEZMojoRoot();
		
		resource.getContents().add(root);

		try {
			Map<Object, Object> options = new HashMap<Object, Object>();
			options.put(XMLResource.OPTION_ENCODING, "UTF-8");
			resource.save(options);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public EZMojoRoot createEmptyEZMojoRoot() {
		EZMojoRoot root = EzmojoFactory.eINSTANCE.createEZMojoRoot();
		EZMojoNode top = EzmojoFactory.eINSTANCE.createEZMojoNode();
		top.set("/");
		top.setToken("/");
		top.setRoot(root);
		top.setLastBang(System.currentTimeMillis());
		root.setRoot(top);
		root.setSelected(top);
		return root;
	}
	
	public void saveEzMojoToFile(EZMojoRoot root, String filename) {
		// Create a resource set.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		//
		// Register the default resource factory -- only needed for stand-alone!
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(EzmojoPackage.eNS_PREFIX, new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(EzmojoPackage.eNS_URI, EzmojoPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(OrchestrorPackage.eNS_URI, OrchestrorPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(CmdPackage.eNS_URI, CmdPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(TemporalPackage.eNS_URI, TemporalPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(XcpPackage.eNS_URI, XcpPackage.eINSTANCE);

		//
		// Get the URI of the model file.
		//
		URI touchoscURI = URI.createFileURI(filename);
		
		//
		// Demand load the resource for this file.
		//
		Resource resource = resourceSet.createResource(touchoscURI);
		
		resource.getContents().add(root);

		try {
			Map<Object, Object> options = new HashMap<Object, Object>();
			options.put(XMLResource.OPTION_ENCODING, "UTF-8");
			resource.save(options);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void dumpEzMojo2File(EZMojoRoot mojo, String destDirname) {
		// Create a resource set.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		//
		// Register the default resource factory -- only needed for stand-alone!
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(EzmojoPackage.eNS_PREFIX, new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(EzmojoPackage.eNS_URI, EzmojoPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(OrchestrorPackage.eNS_URI, OrchestrorPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(CmdPackage.eNS_URI, CmdPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(TemporalPackage.eNS_URI, TemporalPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(XcpPackage.eNS_URI, XcpPackage.eINSTANCE);

		String dirname;
		if (destDirname == null) {
			dirname = Platform.getInstallLocation().getURL().getPath() + "/" + "configuration";
			
			if (Platform.inDebugMode()) {
				System.out.println("creating " + dirname + " directory");
			}
			
			new File(dirname).mkdir();
		} else {
			dirname = destDirname;
		}
		
		//
		// Get the URI of the model file.
		//
		URI touchoscURI = URI.createFileURI(dirname + "/" + "ezmojoroot.ezmojo");
		
		//
		// Demand load the resource for this file.
		//
		Resource resource = resourceSet.createResource(touchoscURI);
		
		resource.getContents().add(mojo);

		try {
			Map<Object, Object> options = new HashMap<Object, Object>();
			options.put(XMLResource.OPTION_ENCODING, "UTF-8");
			resource.save(options);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public EZMojoRoot loadEzMojoFromPrefs(String destDirname) {
		// Create a resource set.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		//
		// Register the default resource factory -- only needed for stand-alone!
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(EzmojoPackage.eNS_PREFIX, new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(EzmojoPackage.eNS_URI, EzmojoPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(OrchestrorPackage.eNS_URI, OrchestrorPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(CmdPackage.eNS_URI, CmdPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(TemporalPackage.eNS_URI, TemporalPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(XcpPackage.eNS_URI, XcpPackage.eINSTANCE);

		String dirname;
		if (destDirname == null) {
			dirname = Platform.getInstallLocation().getURL().getPath() + "/" + "configuration";
			
			if (Platform.inDebugMode()) {
				System.out.println("creating " + dirname + " directory");
			}
			
			new File(dirname).mkdir();
		} else {
			dirname = destDirname;
		}
		
		File f = new File(dirname + "/" + "ezmojoroot.ezmojo");
		if (f != null && f.exists()) {
			//
			// Get the URI of the model file.
			//
			URI touchoscURI = URI.createFileURI(dirname + "/" + "ezmojoroot.ezmojo");
			
			//
			// Demand load the resource for this file.
			//
			Resource resource = resourceSet.getResource(touchoscURI, true);
			
			return (EZMojoRoot) resource.getContents().get(0);
		}
		return null;
	}
	
	public EZMojoRoot loadEzMojoFromFile(String filename) {
		// Create a resource set.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		//
		// Register the default resource factory -- only needed for stand-alone!
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(EzmojoPackage.eNS_PREFIX, new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(EzmojoPackage.eNS_URI, EzmojoPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(OrchestrorPackage.eNS_URI, OrchestrorPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(CmdPackage.eNS_URI, CmdPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(TemporalPackage.eNS_URI, TemporalPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(XcpPackage.eNS_URI, XcpPackage.eINSTANCE);

		
		//
		// Get the URI of the model file.
		//
		URI touchoscURI = URI.createFileURI(filename);
		
		//
		// Demand load the resource for this file.
		//
		Resource resource = resourceSet.getResource(touchoscURI, true);
		
		return (EZMojoRoot) resource.getContents().get(0);
	}
}
