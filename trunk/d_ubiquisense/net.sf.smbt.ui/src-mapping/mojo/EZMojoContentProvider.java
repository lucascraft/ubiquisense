/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2008 - 2010, Lucas Bigeardel
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

package mojo;

import java.util.List;

import net.sf.smbt.ezmojo.EZMojoNode;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class EZMojoContentProvider implements ITreeContentProvider {
	private EZMojoNode root;
	
	public EZMojoContentProvider() {
	}

	public EZMojoContentProvider(EZMojoNode _board) {
		setRoot(_board);
	}
	
	@Override
	public void dispose() {

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (newInput instanceof EZMojoNode) {
			setRoot((EZMojoNode) newInput);
		}
	}

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof EZMojoNode) {
			return ((EZMojoNode) inputElement).getElements().toArray();
		} else if (inputElement instanceof List<?>) {
			return ((List<?>)inputElement).toArray();
		}
		return new Object[0];
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof EZMojoNode) {
			return ((EZMojoNode)parentElement).getElements().toArray();
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
		if (element instanceof EZMojoNode) {
			return !((EZMojoNode)element).getElements().isEmpty();
		}
		return false;
	}

	public EZMojoNode getRoot() {
		return root;
	}

	public void setRoot(EZMojoNode root) {
		this.root = root;
	}
}
