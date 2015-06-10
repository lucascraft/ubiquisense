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

package net.sf.smbt.osc.ezmojo.utils;

public class EzMojoAgentHelp {
	/**
	 * Infrastructure commands help
	 * <p>
	 * ----------------------
	 * </p>
	 * 
	 * <ul>
	 * <li>list
     * <li>reset
     * <li>close
     * <li>status
     * <li>bind
     * <li>deploy
     * <li>hook
     * <li>unhook
     * <li>help
     * <li>protocol
     * </ul>
     *  
	 * @return text of the infrastructure commands help
	 */
	public static String getInfrastructureHelp() {
		return 
			"[ ] list" + "\t\t" +
			"\tList services from DNS-SD reachable EzMojo services" + "\n" +
			"[X] alias" + "\t\t" +
			"\tAlias a given IP:Port" + "\n" +
			"[ ] reset" + "\t\t" +
			"\tReset node from point of view of LISTEN/FORWARD and other adornements" + "\n" +
			"[ ] close" + "\t\t" +
			"\tClose and terminate all opened pipes on given node" + "\n" +
			"[ ] status" + "\t\t" +
			"\tDisplay node and sub nodes status in textual form (incl LISTEN/FORWARD/BANG/TRIGGER/...)" + "\n" +
			"[ ] bind" + "\t\t" +
			"\tForce 2 ways synchronization of given agnt with other(s) agent(s)" + "\n" +
			"[ ] deploy" + "\t\t" +
			"\tDeploy a node on a given node" + "\n" +
			"[ ] remove" + "\t\t" +
			"\tRemove all nodes on a given agent" + "\n" +
			"[X] help" + "\t\t" +
			"\tThis command" + "\n" +
			"[X] clear" + "\t" +
			"\tClear console" + "\n" +
			"[X] hook " + "\t" +
			"\tHook incoming port (as UDP by default) seeking for legagcy OSC messages" + "\n" +
			"\t\tusb:///dev/tty.USB.A32423to5<midi>" + "\n" +
			"\t\ttcp://192.168.1.103:9004<midi>" + "\n" +
			"\t\tudp://192.168.1.103:9004<tuio>" + "\n" +
			"\t\tudp://192.168.1.103:9004    // OSC implicit" + "\n" +
			"\t\tudp://:9001<osc>" + "\n" +
			"\t\tudp://:9001    // OSC implicit" + "\n" +
			"[X] unhook <INCOMING_PORT>" + "\t" +
			"\tUnhook incoming port disabling agent and legagcy OSC messages reception" + "\n" +
			"[X] protocol" + "\t" +
			"\tList all availables protocols ID / alias" + "\n\n\n\n" +
			"--------- /ez/ service subdomain ---------" + "\n" +
			" Note : " + "\n" +
			" you need to forward /ez event to an existing " +
			"[<firmata>/<midi>/<dmx>/<thingm>] connection." +"\n" +
			" It will defne a kind of automagic mapping from <osc> to /ez/<?????>." + "\n" +
			" It could be sent as plain <osc> forward as well." + "\n" +
			"------------------------------------------" + "\n\n\n" +
			".) Arduino over OSC/Firmata (Ubiquino) :" + "\n\n" +
			"\t[X] /ez/firmata/analog/set analog_port_id flaot_value" + "\n" +
			"\t[X] /ez/firmata/digital/set digital_port_id flaot_value" +"\n" +
			"\t[ ] /ez/firmata/analog/get analog_port_id flaot_value" + "\n" +
			"\t[ ] /ez/firmata/digital/get digital_port_id flaot_value" + "\n\n\n" +
			".) ThingM over OSC :" + "\n\n" +
			"\t[X] /ez/thingm/fade2hsb OxXX int_h int_s int_b" + "\n" +
			"\t[X] /ez/thingm/fade2rgb OxXX int_r int_g int_b" + "\n" +
			"\t[ ] /ez/thingm/getaddress" + "\n" +
			"\t[ ] /ez/thingm/getfirmwarever OxXX" + "\n" +
			"\t[ ] /ez/thingm/getrgb OxXX" + "\n" +
			"\t[X] /ez/thingm/go2rgb OxXX int_r int_g int_b" + "\n" +
			"\t[X] /ez/thingm/playscript OxXX" + "\n" +
			"\t[ ] /ez/thingm/readscript OxXX" + "\n" +
			"\t[ ] /ez/thingm/setaddress OxYY" + "\n" +
			"\t[ ] /ez/thingm/setfadespeed OxXX int_speed" + "\n" +
			"\t[ ] /ez/thingm/setlengthrepeatcommand OxXX int_speed" + "\n" +
			"\t[ ] /ez/thingm/setstartupparameters OxXX int_speed" + "\n" +
			"\t[ ] /ez/thingm/settimeadjust OxXX int_adjust" + "\n" +
			"\t[X] /ez/thingm/stopscript OxXX int_speed" + "\n" +
			"\t[ ] /ez/thingm/writescript OxXX int_speed" + "\n\n\n" +
			".) Midi over OSC (IAC Bus to come) :" + "\n\n" +
			"\t[X] /ez/midi/noteon channel int_v1 int_v2" + "\n" +
			"\t[] /ez/midi/noteoff channel" + "\n\n\n" +
			".) DMX over OSC (brodcast) " + "\n\n" +
			"\t[ ] /ez/dmx/fade int_red int_green int_blue " + "\n" +
			"\t[X] /ez/dmx/fadefull int_loop int_strobe int_mode int_none int_red int_green int_blue" + "\n\n\n"
			;
	}


	public static String getHelpText() {
	    return
		    "[X] \'@\' \t\t\tbang " + "\n" +
		    "[ ] \'(\' \t\t\tfunction " + "\n" +
		    "[X] \':\' \t\t\tget " + "\n" +
		    "[X] \'+\' \t\t\tset " + "\n" +
		    "[X] \'/\' \t\t\t*legacy* " + "\n" +
		    "[X] \'-\' \t\t\tunset " + "\n" +
		    "[ ] \'!\' \t\t\tlisten " + "\n" +
		    "[ ] \'#\' \t\t\tunlisten " + "\n" +
		    "[ ] \'?\' \t\t\tquery " + "\n" +
		    "[ ] \'=\' \t\t\tbind " + "\n" +
		    "[ ] \'$\' \t\t\tservice " + "\n" +
		    "[X] \'>\' \t\t\tforward " + "\n" +
		    "[X] \'<\' \t\t\tunforward " + "\n" +
		    "[ ] \'&\' \t\t\tclock " + "\n" +
		    "[ ] \')\' \t\t\ttoggle " + "\n" +
		    "[ ] \'.\' \t\t\tselect  " + "\n" +
		    "[ ] \'t\' \t\t\ttrigger  " + "\n" +
		    "[ ] \'m\' \t\t\tmap  " + "\n" +
		    "[ ] \'u\' \t\t\tunmap  " + "\n" +
		    "[ ] \'r\' \t\t\tmnemonic  " + "\n" +
		    "[ ] \'p\' \t\t\tplay/stop  " + "\n" +
	    	"[X] \'k\' \t\t\tkinematics  " + "\n"; 
	}
}
