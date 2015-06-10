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

package net.sf.smbt.osc.ezmojo.utils;

import java.util.HashMap;
import java.util.Map;

import net.sf.smbt.mapping.engine.AbstractMapEngine;
import net.sf.smbt.mapping.engine.IMapEngine;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

public class EzMojoMappingManager {
	public final static EzMojoMappingManager INSTANCE = new EzMojoMappingManager();
	
	/**
	 * 
	 * @param mappingID
	 * @return corresponding {@link IMapEngine}
	 */
	public IMapEngine getMapping(String mappingID) {
		return mappingsRegistrations().get(mappingID);
	}
	
	/**
	 * register contributed mappings  
	 * 
	 * @param mappingID unique mapping identifier
	 * 
	 * @return a {@link IMapEngine} mapping map
	 */
	public Map<String, IMapEngine> mappingsRegistrations() {
		Map<String, IMapEngine> mappingsMap = new HashMap<String, IMapEngine>();
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint point = registry.getExtensionPoint("net.sf.smbt.mapping.cmdMapping");
		if (point == null) return null;
		IExtension[] extensions = point.getExtensions();
		for (int i = 0; i < extensions.length; i++) {
			for (IConfigurationElement elem : extensions[i].getConfigurationElements()) {
				try {
					AbstractMapEngine engine = (AbstractMapEngine) elem.createExecutableExtension("engine");
					engine.setName(elem.getAttribute("name"));
					mappingsMap.put(elem.getAttribute("ID"), engine);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}
		return mappingsMap;
	}
}
