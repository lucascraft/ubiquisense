/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2010, Lucas Bigeardel
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

package net.sf.smbt.ui.console.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import net.sf.smbt.ezmojo.EZMojoNode;
import net.sf.smbt.ezmojo.EZMojoRoot;
import net.sf.smbt.osc.ezmojo.utils.EzAgent;
import net.sf.smbt.osc.ezmojo.utils.EzMojoAgentManager;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class EzMojoContentProvider implements ITreeContentProvider {
	
	@Override
	public void dispose() {
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (newInput instanceof EZMojoRoot) {
			for (EzAgent agent : EzMojoAgentManager.INSTANCE.getAgentsMap().values()) {
				agent.resetEzMojo((EZMojoRoot)newInput, true);
				// just first, will see later
				return;
			}
		} 
	}
	
	
	public Object[] getInput() {
		List<Object> nodes = new ArrayList<Object>();
		for (EzAgent agent : EzMojoAgentManager.INSTANCE.getAgentsMap().values()) {
			nodes.add(agent.getEzMojo());
		}
		return nodes.toArray();
	}
	
	@Override
	public Object[] getElements(Object inputElement) {
		List<Object> nodes = new ArrayList<Object>();
		for (EzAgent agent : EzMojoAgentManager.INSTANCE.getAgentsMap().values()) {
			if (agent != null && agent.getEzMojo() != null) {
				EZMojoNode n = agent.getEzMojo().getRoot();
				for (EZMojoNode c : n.getElements()) {
					if (!c.getToken().equals("")) {
						nodes.add(c);
					}
				}
			}
		}
		return nodes.toArray();
	}

	
	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof EZMojoRoot) {
			SortedSet<EZMojoNode> nodes = new TreeSet<EZMojoNode>(new Comparator<EZMojoNode>() {
				@Override
				public int compare(EZMojoNode n1, EZMojoNode n2) {
					long delta = n2.getTouches() - n1.getTouches();
					return delta != 0 ? new Long(delta).intValue() : n2.getAddr().compareTo(n1.getAddr());
				}
			});
			nodes.addAll(((EZMojoRoot)parentElement).getRoot().getElements());
			return nodes.toArray();
		} else if (parentElement instanceof EZMojoNode) {
			List<EObject> list = new ArrayList<EObject>();
			list.addAll(((EZMojoNode)parentElement).getForwards());
			list.addAll(((EZMojoNode)parentElement).getListeners());
			list.addAll(((EZMojoNode)parentElement).getVars());
			SortedSet<EZMojoNode> nodes = new TreeSet<EZMojoNode>(new Comparator<EZMojoNode>() {
				@Override
				public int compare(EZMojoNode n1, EZMojoNode n2) {
					long delta = n2.getTouches() - n1.getTouches();
					return delta != 0 ? new Long(delta).intValue() : n2.getAddr().compareTo(n1.getAddr());
				}
			});
			nodes.addAll(((EZMojoNode)parentElement).getElements());
			list.addAll(nodes);
			return list.toArray();
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
		if (element instanceof EZMojoRoot) {
			return !((EZMojoRoot)element).getRoot().getElements().isEmpty();
		} else if (element instanceof EZMojoNode) {
			return !((EZMojoNode)element).getElements().isEmpty() || !((EZMojoNode)element).getVars().isEmpty()|| !((EZMojoNode)element).getForwards().isEmpty()|| !((EZMojoNode)element).getListeners().isEmpty();
		}
		return false;
	}
}
