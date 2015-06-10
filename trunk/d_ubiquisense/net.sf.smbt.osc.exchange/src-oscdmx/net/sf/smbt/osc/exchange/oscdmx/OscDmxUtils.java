/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2010 - 2012, Lucas Bigeardel
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

package net.sf.smbt.osc.exchange.oscdmx;


public class OscDmxUtils {
	public final static OscDmxUtils INSTANCE = new OscDmxUtils();

	public final static String OSC_DMX_FADE_RGB				= "/ez/dmx/fade";
	public final static String OSC_DMX_FADE_RGB_FULL		= "/ez/dmx/fadefull";
	public final static String OSC_DMX_FADE_RGB_WITH_STROBE	= "/ez/dmx/fadestrobe";
	
	/*
	public OscDmxCmd createFade2RGB(int channel, int r, int g, int b) {
		OscDmxCmd cmd = EzoscdmxFactory.eINSTANCE.createOscDmxCmd();
		cmd.setMsg(
			new OSCMessage(
				OSC_DMX_FADE_RGB, 
				new Object[] { 
					new Integer(channel), 
					new Integer(r), 
					new Integer(g),
					new Integer(b) 
				}
			)
		);
		return cmd;
	}
	
	public OscDmxCmd createFade2RGBWithStrobe(int channel, int r, int g, int b, int strobe) {
		OscDmxCmd cmd = EzoscdmxFactory.eINSTANCE.createOscDmxCmd();
		cmd.setMsg(
			new OSCMessage(
				OSC_DMX_FADE_RGB_WITH_STROBE, 
				new Object[] { 
					new Integer(channel), 
					new Integer(r), 
					new Integer(g),
					new Integer(b),
					new Integer(strobe) 
				}
			)
		);
		return cmd;
	}
	
	public OscDmxCmd createFade2RGBFull(int r, int g, int b, int fullColor, int strobe, int modi) {
		OscDmxCmd cmd = EzoscdmxFactory.eINSTANCE.createOscDmxCmd();
		cmd.setMsg(
			new OSCMessage(
				OSC_DMX_FADE_RGB_FULL, 
				new Object[] { 
					new Integer(r), 
					new Integer(g),
					new Integer(b),
					new Integer(fullColor) ,
					new Integer(strobe) ,
					new Integer(modi) 
				}
			)
		);
		return cmd;
	}
	*/
}
