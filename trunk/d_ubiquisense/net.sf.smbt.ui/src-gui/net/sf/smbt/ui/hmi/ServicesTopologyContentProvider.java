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

package net.sf.smbt.ui.hmi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jmdns.ServiceInfo;

import net.sf.smbt.quantic.services.ISmartDnsServiceManager;
import net.sf.smbt.quantic.warp.QuanticMojo;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class ServicesTopologyContentProvider implements ITreeContentProvider {
	
	@SuppressWarnings("unused")
	private Map<String, List<ServiceInfo>> serviceMap;

	public ServicesTopologyContentProvider() {
		serviceMap = new HashMap<String, List<ServiceInfo>>();
	}
	
	@Override
	public void dispose() {
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}
	
	
	public Object[] getInput() {
		//return QuanticMojo.INSTANCE.getAgent().getDnsServicesMap().values().toArray();
		return new Object[0];
	}
	
	@Override
	public Object[] getElements(Object inputElement) {
		//return QuanticMojo.INSTANCE.getAgent().getDnsServicesMap().values().toArray();
		return new Object[0];
	}

	@Override
	public Object[] getChildren(Object parentElement) {
//		if (parentElement instanceof ISmartDnsServiceManager) {
//			List<Object> nodes = new ArrayList<Object>();
//			ServiceInfo sInfo = ((ISmartDnsServiceManager)parentElement).getServiceInfo();
//			if (sInfo != null) {
//				nodes.add(sInfo);
//			} 
//			return nodes.toArray();
//		} else  if (parentElement instanceof ServiceInfo) {
//			List<Object> nodes = new ArrayList<Object>();
//			ServiceInfo sInfo = (ServiceInfo) parentElement;
//			if (sInfo != null) {
//				/*
//				for (ServiceInfo s : DnsSdUtil.INSTANCE.getRegistry().list(sInfo.getType())) {
//					if (s != null) {
//						nodes.add(s.getNiceTextString());
//					}
//				}
//				*/
//			}
//			return nodes.toArray();
//		}
		return new Object[0];
	}

	@Override
	public Object getParent(Object element) {
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		return getChildren(element).length > 0;
	}
}
