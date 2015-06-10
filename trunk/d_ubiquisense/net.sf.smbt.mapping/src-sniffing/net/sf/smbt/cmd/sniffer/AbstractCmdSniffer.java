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

package net.sf.smbt.cmd.sniffer;

import java.util.List;

import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.ecore.EClassifier;

public abstract class AbstractCmdSniffer implements ICmdSniffer {
	@Override
	public void addCmd(Cmd cmd) {
		
	}
	@Override
	public void removeCmd(Cmd cmd) {
		
	}
	@Override
	public void updateCmd(Cmd cmd) {
		
	}
	@Override
	public boolean match(Cmd cmd) {
		return true;
	}
	@Override
	public boolean filter(Cmd cmd) {
		return false;
	}
	@Override
	public void addTracking(EClassifier eClassifier) {
		
	}
	@Override
	public void addTracking(List<EClassifier> eClassifiers) {
		
	}
	@Override
	public void removeTracking(EClassifier eClassifier) {
		
	} 
	@Override
	public void removeTracking(List<EClassifier> eClassifiers) {
		
	}
}
