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

package net.sf.smbt.ui.services;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.Action;

public class EZViewActionManager {
	
	public final static EZViewActionManager INSTANCE = new EZViewActionManager();

	private Map<String, Action> actionsMap;
	
	public EZViewActionManager() {
		actionsMap 	= getContributedActions();
	}
	
	
	public Map<String, Action> getContributedActions() {
		Map<String, Action> abletonWidgetsMap = new HashMap<String, Action>();
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		
		System.out.println("Open actions ext point");

		IExtensionPoint point = registry.getExtensionPoint("net.sf.smbt.ui.actions");
		
		
		if (point == null) return null;
		
		System.out.println("net.smbt.ui.actions extension point loaded");
		
		IExtension[] extensions = point.getExtensions();
		for (int i = 0; i < extensions.length; i++) {
			for (IConfigurationElement elem : extensions[i].getConfigurationElements()) {
				String ID = elem.getAttribute("ID");
				ID = ID.trim();
				
				System.out.println("     found : " + ID);

				
				Action action = null;
				try {
					action = (Action) elem.createExecutableExtension("action");
				} catch (CoreException e) {
					e.printStackTrace();
				}
				if (action instanceof Action) {
					if (!abletonWidgetsMap.containsKey(ID)) {
						System.out.println("   Added");
						abletonWidgetsMap.put(ID, action);
					}
				}
			}
		}
		return abletonWidgetsMap;
	}
	
	public Action getWidget(String ID) {
		if (actionsMap == null || !actionsMap.containsKey(ID)) {
			return null;
		}
		return actionsMap.get(ID);
	}
}
