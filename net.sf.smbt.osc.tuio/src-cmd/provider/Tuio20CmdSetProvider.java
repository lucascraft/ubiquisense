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

import net.sf.smbt.osc.eztuio2.Eztuio2Package;
import net.sf.xqz.engine.ext.service.AbstractCmdSetProvider;

import org.eclipse.emf.ecore.EClassifier;

public class Tuio20CmdSetProvider extends AbstractCmdSetProvider {
	public Tuio20CmdSetProvider() {
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
		return "2.0";
	}
	@Override
	public String getUri() {
		return Eztuio2Package.eNS_URI;
	}
	@Override
	public Map<String, List<EClassifier>> getCommandSets() {
		Map<String, List<EClassifier>> commandSets = new HashMap<String, List<EClassifier>>();
		
		commandSets.put(
			"Tuio 2.0 Common Commands", 
			Arrays.asList(
				new EClassifier[] {
					Eztuio2Package.Literals.TUIO2_ALA,
					Eztuio2Package.Literals.TUIO2_ARG,
					Eztuio2Package.Literals.TUIO2_B3D,
					Eztuio2Package.Literals.TUIO2_BND,
					Eztuio2Package.Literals.TUIO2_CHG,
					Eztuio2Package.Literals.TUIO2_COA,
					Eztuio2Package.Literals.TUIO2_CTL,
					Eztuio2Package.Literals.TUIO2_DAT,
					Eztuio2Package.Literals.TUIO2_ICG,
					Eztuio2Package.Literals.TUIO2_LIA,
					Eztuio2Package.Literals.TUIO2_LLA,
					Eztuio2Package.Literals.TUIO2_LTA,
					Eztuio2Package.Literals.TUIO2_OCG,
					Eztuio2Package.Literals.TUIO2_P3D,
					Eztuio2Package.Literals.TUIO2_PTR,
					Eztuio2Package.Literals.TUIO2_RAW,
					Eztuio2Package.Literals.TUIO2_SIG,
					Eztuio2Package.Literals.TUIO2_SKG,
					Eztuio2Package.Literals.TUIO2_SVG,
					Eztuio2Package.Literals.TUIO2_SYM,
					Eztuio2Package.Literals.TUIO2_T3D,
					Eztuio2Package.Literals.TUIO2_TOK
				}
			)
		);
		
		return commandSets;
	}
}
