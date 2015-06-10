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

public interface ICmdSniffer {
	
	/**
	 * Add given {@link Cmd} to the sniffing process
	 * 
	 * @param cmd the {@link Cmd} to be added 
	 */
	void addCmd(Cmd cmd);
	
	/**
	 * Remove given {@link Cmd} from the sniffing process
	 * 
	 * @param cmd the {@link Cmd} to be removed 
	 */
	void removeCmd(Cmd cmd);
	
	/**
	 * Updates the sniff status of the {@link Cmd} 
	 * 
	 * @param cmd the {@link Cmd} which status has to be updated
	 */
	void updateCmd(Cmd cmd);
	
	/**
	 * Check whether a {@link Cmd} meets match requirement or not as it is considered at sniffing time
	 * 
	 * @param cmd the currently considered {@link Cmd}
	 * 
	 * @return true if match requirement is valid, false otherwise
	 */
	boolean match(Cmd cmd);
	
	/**
	 * Filter a {@link Cmd} so that it won't appear as part of the sniffed stuff
	 * 
	 * @param cmd the currently considered {@link Cmd}
	 * 
	 * @return true if filter requirement is valid, false otherwise
	 */
	boolean filter(Cmd cmd);
	
	/**
	 * Add metamodel based tracking for {@link Cmd} subclasses.
	 * 
	 * @param eClassifiers a {@link Cmd} subclass list of elements which references has to be tracked
	 */
	void addTracking(List<EClassifier> eClassifiers);
	
	/**
	 * Remove metamodel based tracking for {@link Cmd} subclasses.
	 * 
	 * @param eClassifiers a {@link Cmd} subclass list of elements to not track any more
	 */
	void removeTracking(List<EClassifier> eClassifiers);
	
	/**
	 * Add metamodel based tracking for {@link Cmd} subclasses.
	 * 
	 * @param eClassifier a {@link Cmd} subclass element which references has to be tracked
	 */
	void addTracking(EClassifier eClassifier);
	
	/**
	 * Remove metamodel based tracking for {@link Cmd} subclasses.
	 * 
	 * @param eClassifier a {@link Cmd} subclass element to not track any more
	 */
	void removeTracking(EClassifier eClassifier);
	
}
