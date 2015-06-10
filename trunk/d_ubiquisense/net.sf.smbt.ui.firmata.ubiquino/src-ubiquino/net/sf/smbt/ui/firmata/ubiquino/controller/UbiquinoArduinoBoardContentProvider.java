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

package net.sf.smbt.ui.firmata.ubiquino.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.sf.smbt.mdl.arduino.Arduino;
import net.sf.smbt.mdl.arduino.Port;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class UbiquinoArduinoBoardContentProvider implements ITreeContentProvider {
	private Arduino board;
	
	public UbiquinoArduinoBoardContentProvider(Arduino _board) {
		setBoard(_board);
	}
	
	@Override
	public void dispose() {

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (newInput instanceof Arduino) {
			setBoard((Arduino) newInput);
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof Arduino) {
			Arduino _board = (Arduino) inputElement;
			List<Port> ports = new ArrayList<Port>();
			ports.addAll(_board.getAnalogPorts());
			ports.addAll(_board.getDigitalPorts());
			return ports.toArray();
		} else if (inputElement instanceof Map) {
			return ((Map)inputElement).values().toArray();
		}
		return new Object[0];
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof Arduino) {
			return ((Arduino)parentElement).getPorts().toArray();
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
		if (element instanceof Arduino) {
			return true;
		} else if (element instanceof Port) {
			return false;
		}
		return false;
	}

	public Arduino getBoard() {
		return board;
	}

	public void setBoard(Arduino board) {
		this.board = board;
	}
}
