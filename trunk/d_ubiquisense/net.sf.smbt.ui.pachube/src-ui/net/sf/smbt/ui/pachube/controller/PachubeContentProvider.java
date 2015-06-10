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

package net.sf.smbt.ui.pachube.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eeml.xsd._0._5.EemlType;
import org.eeml.xsd._0._5.EnvironmentType;
import org.eeml.xsd._0._5.StatusType;

public class PachubeContentProvider implements ITreeContentProvider {
	private boolean hideFrozenStreams;
	
	@Override
	public void dispose() {}

	public PachubeContentProvider() {
		hideFrozenStreams = false;
	}
	
	public boolean isHideFrozenStreams() {
		return hideFrozenStreams;
	}
	
	public void setHideFrozenStreams(boolean hideFrozenStreams) {
		this.hideFrozenStreams = hideFrozenStreams;
	}
	
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {}

	@Override
	@SuppressWarnings("rawtypes")
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof EemlType) {
			EemlType eemlType = (EemlType) inputElement;
			List<Object> lst = new ArrayList<Object>();
			for (EnvironmentType e : eemlType.getEnvironment()) {
				if (StatusType.FROZEN.equals(e.getStatus())) {
	 				if (!isHideFrozenStreams()) {
						lst.add(e);
					}
				} else if (StatusType.LIVE.equals(e.getStatus())) {
					lst.add(e);
				}
			}
			return lst.toArray();
		} else if (inputElement instanceof Map) {
			return ((Map)inputElement).values().toArray();
		}
		return new Object[0];
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof EemlType) {
			return ((EemlType)parentElement).getEnvironment().toArray();
		} else if (parentElement instanceof EnvironmentType) {
			List<Object> lst = new ArrayList<Object>();
			
			lst.addAll(((EnvironmentType)parentElement).getData());
			
			return lst.toArray();
		}
		return new Object[0];
	}

	@Override
	public Object getParent(Object element) {
		if (element instanceof EObject) {
			if (((EObject)element).eContainer() != null) {
				return ((EObject)element).eContainer();
			}
		}
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		if (element instanceof EemlType) {
			return true;
		} else if (element instanceof EnvironmentType) {
			return true;
		}
		return false;
	}
}
