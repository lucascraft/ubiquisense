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

package provider;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.smbt.osc.eztuio.EztuioPackage;
import net.sf.smbt.osc.eztuio2.Eztuio2Package;
import net.sf.xqz.engine.ext.service.AbstractCmdSetProvider;

import org.eclipse.emf.ecore.EClassifier;

public class Tuio11CmdSetProvider extends AbstractCmdSetProvider {
	public Tuio11CmdSetProvider() {
	}
	@Override
	public String getPartNumber() {
		return "N/A";
	}
	@Override
	public String getProtocol() {
		return "TUIO";
	}
	@Override
	public String getVendor() {
		return "Reactivision";
	}
	@Override
	public String getVersionNumber() {
		return "1.1";
	}
	@Override
	public String getUri() {
		return Eztuio2Package.eNS_URI;
	}
	@Override
	public Map<String, List<EClassifier>> getCommandSets() {
		Map<String, List<EClassifier>> commandSets = new HashMap<String, List<EClassifier>>();
		
		commandSets.put(
			"Tuio 1.1 Common Commands", 
			Arrays.asList(
				new EClassifier[] {
					EztuioPackage.Literals.TUIO25_BLOB,
					EztuioPackage.Literals.TUIO25_CUR,
					EztuioPackage.Literals.TUIO25_OBJ,
					EztuioPackage.Literals.TUIO2_DCUR,
					EztuioPackage.Literals.TUIO2_DCUR_ADD,
					EztuioPackage.Literals.TUIO2_DCUR_REMOVE,
					EztuioPackage.Literals.TUIO2_DCUR_UPDATE,
					EztuioPackage.Literals.TUIO3_DBLOB,
					EztuioPackage.Literals.TUIO3_DCUR,
					EztuioPackage.Literals.TUIO3_DOBJ
				}
			)
		);
		
		return commandSets;
	}
}
