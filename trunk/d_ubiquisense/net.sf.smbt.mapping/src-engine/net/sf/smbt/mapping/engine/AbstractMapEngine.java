/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2008 - 2012, Lucas Bigeardel
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

package net.sf.smbt.mapping.engine;

import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

/**
 * 
 * @author lucas
 * 
 * Map an /ez/<protocol_alias> to dual {@link Cmd} specialized form.
 *
 */
public abstract class AbstractMapEngine implements IMapEngine{
	private String name;
	protected AbstractQxEventHandlerImpl eventAdapter;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * Transforms /ez/<protocol_alias>/ based scheme to its corresponding {@link Cmd} 
	 * specialization for the given protcol.
	 *  
	 */
	public abstract Cmd ez2cmd(Cmd leftCmd);

	/**
	 * 
	 * Transforms {@link Cmd} specialization for the given protcol to its 
	 * corresponding  /ez/<protocol_alias>/ based scheme.
	 *  
	 */
	public abstract Cmd cmd2ez(Cmd leftCmd);

	/**
	 * 
	 * Return handler responsible for /ez <-> {@link Cmd} translations and send/receive.
	 *  
	 */
	public abstract AbstractQxEventHandlerImpl getQxHandler();
}
