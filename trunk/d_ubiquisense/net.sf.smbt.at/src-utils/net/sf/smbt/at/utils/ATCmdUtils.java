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

package net.sf.smbt.at.utils;

import net.sf.smbt.at.atcmdset.ATBD;
import net.sf.smbt.at.atcmdset.ATCN;
import net.sf.smbt.at.atcmdset.ATCmd;
import net.sf.smbt.at.atcmdset.ATDL;
import net.sf.smbt.at.atcmdset.ATID;
import net.sf.smbt.at.atcmdset.ATMY;
import net.sf.smbt.at.atcmdset.ATPlusPlusPlus;
import net.sf.smbt.at.atcmdset.ATRetCmd;
import net.sf.smbt.at.atcmdset.ATWR;
import net.sf.smbt.at.atcmdset.AT_BAUD_RATE;
import net.sf.smbt.at.atcmdset.AT_COMMAND_TYPES;
import net.sf.smbt.at.atcmdset.AT_RET_CODES;
import net.sf.smbt.at.atcmdset.AtcmdsetFactory;
import net.sf.smbt.at.atcmdset.CMD_KIND;
import net.sf.xqz.model.engine.CmdPipe;

public class ATCmdUtils {

	public final char CR = 13; // /r
    public final char LF = 10; // /n

	
	public final static ATCmdUtils INSTANCE = new ATCmdUtils();
	
	/**
	 * Dump AT command
	 * 
	 * @param cmd {@link ATCmd} command
	 * 
	 * @return byte stream from an {@link ATCmd} intrinsic valuation
	 */
	public byte[] dumpATCmd(ATCmd cmd) {
		if (cmd instanceof ATCmd) {
			return dumpATCmdWithHints(cmd, -1);
		}
		return new byte[0];
	}
	
	/**
	 * Dump AT command
	 * 
	 * @param cmd {@link ATCmd} command
	 * @param hints some indications for the command dump
	 * 
	 * @return byte stream from an {@link ATCmd} intrinsic valuation
	 */
	private byte[] dumpATCmdWithHints(ATCmd cmd, int hints) {
		String atCmd = "";
		switch (cmd.getKind()) {
			case NONE:
				return cmd.getData();
			case ASLASH:
				break;
			case AT_AND_C:
				break;
			case AT_AND_D:
				break;
			case AT_AND_F:
				break;
			case AT_AND_G:
				break;
			case AT_AND_K:
				break;
			case AT_AND_P:
				break;
			case AT_AND_Q:
				break;
			case AT_AND_R:
				break;
			case AT_AND_S:
				break;
			case AT_AND_T:
				break;
			case AT_AND_V:
				break;
			case AT_AND_W:
				break;
			case AT_AND_Y:
				break;
			case AT_AND_Z:
				break;
			case AT_BSLASH_G:
				break;
			case AT_BSLASH_N:
				break;
			case AT_PERCENT_C:
				break;
			case AT_PERCENT_E:
				break;
			case AT_STAR_CN:
				break;
			case ATA:
				break;
			case ATDT:
				break;
			case ATE:
				break;
			case ATF:
				break;
			case ATH:
				break;
			case ATI:
				break;
			case ATL:
				break;
			case ATM:
				break;
			case ATN:
				break;
			case ATO:
				break;
			case ATQ:
				break;
			case ATS:
				break;
			case ATV:
				break;
			case ATW:
				break;
			case ATX:
				break;
			case ATY:
				break;
			case ATZ:
				break;
			case BRACE_M:
				break;
			case BSLASH_A:
				break;
			case D:
				break;
			case MINUS_K:
				break;
			case RTS_SLASH_CTS:
				break;
			case TAND_X:
				break;
			case XON_SLASH_XOFF:
				break;
		}
		return atCmd.getBytes();
	}
	
	public ATCmd create(String id) {
		switch(CMD_KIND.get(id)) {
			case BD:
				return createATBD();
			case CN:
				return createATCN();
			case DL:
				return createATDL();
			case ID:
				return createATID();
			case MY:
				return createATMY();
			case PP:
				return createATPlusPlusPlus();
			case WR:
				return createATWR();
		}
		return null;
	}
	
	/**
	 * +++
	 * 
	 * start modem session code
	 * 
	 * @return +++ command
	 */
	public ATPlusPlusPlus createATPlusPlusPlus() {
		ATPlusPlusPlus atPPP = AtcmdsetFactory.eINSTANCE.createATPlusPlusPlus();
		atPPP.setData("+++".getBytes());
		atPPP.setKind(AT_COMMAND_TYPES.NONE);
		atPPP.setToken("+++");
		return atPPP;
	}
	/**
	 * Get BD Baud rate command
	 * 
	 * @return Get Baud Rate command
	 */
	public ATBD createATBD() {
		ATBD atBD = AtcmdsetFactory.eINSTANCE.createATBD();
		atBD.setData(("ATBD"+CR+LF).getBytes());
		atBD.setKind(AT_COMMAND_TYPES.NONE);
		atBD.setToken("ATBD");
		return atBD;
	}
	/**
	 * Set BD Baud rate command
	 * 
	 * 0 - 1200
	 * 1 - 2400
	 * 2 - 4800
	 * 3 - 9600
	 * 4 - 19200
	 * 5 - 38400
	 * 6 - 57600
	 * 7 - 115200
	 * 
	 * @return Get Baud Rate command
	 */
	public ATBD createATBD(int baudRateID) {
		ATBD atBD = AtcmdsetFactory.eINSTANCE.createATBD();
		atBD.setData(("ATBD"+baudRateID +CR+LF).getBytes());
		atBD.setKind(AT_COMMAND_TYPES.NONE);
		atBD.setToken("ATBD"+baudRateID);
		return atBD;
	}
	/**
	 * Get Network ID
	 * 
	 * @return Get Network ID command
	 */
	public ATID createATID() {
		ATID atId = AtcmdsetFactory.eINSTANCE.createATID();
		atId.setData(("ATID"+CR+LF).getBytes());
		atId.setKind(AT_COMMAND_TYPES.NONE);
		atId.setToken("ATID"+CR+LF);
		return atId;
	}
	/**
	 * Set Network ID command
	 * 
	 * @param addr integer from 0 to 32565
	 * 
	 * @return Set Network ID command
	 */
	public ATID createATID(String addr) {
		ATID atId = AtcmdsetFactory.eINSTANCE.createATID();
		atId.setData(("ATID"+addr +CR+LF).getBytes());
		atId.setKind(AT_COMMAND_TYPES.NONE);
		atId.setToken("ATID"+addr +CR+LF);
		return atId;
	}
	/**
	 * Get node ID
	 * 
	 * @return Get node ID command
	 */
	public ATMY createATMY() {
		ATMY atMy = AtcmdsetFactory.eINSTANCE.createATMY();
		atMy.setData(("ATMY" +CR+LF).getBytes());
		atMy.setKind(AT_COMMAND_TYPES.NONE);
		atMy.setToken("ATMY" +CR+LF);
		return atMy;
	}
	/**
	 * Set Network ID command
	 * 
	 * @param addr integer from 0 to 32565
	 * 
	 * @return Set Network ID command
	 */
	public ATMY createATMY(String addr) {
		ATMY atMy = AtcmdsetFactory.eINSTANCE.createATMY();
		atMy.setData(("ATMY"+addr +CR+LF).getBytes());
		atMy.setKind(AT_COMMAND_TYPES.NONE);
		atMy.setToken("ATMY"+addr +CR+LF);
		return atMy;
	}
	/**
	 * Set Write mode command
	 * 
	 * @return Set Write mode command
	 */
	public ATWR createATWR() {
		ATWR atWr = AtcmdsetFactory.eINSTANCE.createATWR();
		atWr.setData(("ATWR"  +CR+LF).getBytes());
		atWr.setKind(AT_COMMAND_TYPES.NONE);
		atWr.setToken("ATWR" +CR+LF);
		return atWr;
	}
	/**
	 * Set end comm command
	 * 
	 * @return Set end comm command
	 */
	public ATDL createATDL() {
		ATDL atDl = AtcmdsetFactory.eINSTANCE.createATDL();
		atDl.setData(("ATDL" +CR+LF).getBytes());
		atDl.setKind(AT_COMMAND_TYPES.NONE);
		atDl.setToken("ATDL" +CR+LF);
		return atDl;
	}
	
	/**
	 * Set end comm command
	 * 
	 * @return Set end comm command
	 */
	public ATCN createATCN() {
		ATCN atCn = AtcmdsetFactory.eINSTANCE.createATCN();
		atCn.setData(("ATCN" +CR+LF).getBytes());
		atCn.setKind(AT_COMMAND_TYPES.NONE);
		atCn.setToken("ATCN" +CR+LF);
		return atCn;
	}
	
	public ATRetCmd invokeCN(CmdPipe xbeePipe) {
		return (ATRetCmd) xbeePipe.syncSend(ATCmdUtils.INSTANCE.create("CN"), 250);
	}
	
	public int getBaudRateFromID(int id) {
		String baudRateLiteral = AT_BAUD_RATE.get(id).getLiteral();
		return Integer.parseInt(baudRateLiteral);
	}
	
	public int getBaudRateFromID(AT_RET_CODES code) {
		switch (code) {
			case CONNECT_12000:
				return 1200;
			case CONNECT_2400:
				return 2400;
			case CONNECT_4800:
				return 4800;
			case CONNECT_9600:
				return 9600;
			case CONNECT_19200:
				return 19200;
			case CONNECT_38400:
				return 38400;
			case CONNECT_57600:
				return 57600;
			case CONNECT_115200:
				return 115200;
			default:
				break;
		}
		return -1;
	}
	
	public String evalATCmd(ATRetCmd cmd) {
		String ret = "";
		if (cmd != null && cmd.getData() != null && cmd.getData().length>0) {
			ret = new String(cmd.getData());
			ret = ret.substring(0, ret.length()-1);
		}
		return ret;
	}
	
	public ATRetCmd initXBeeATPPP(CmdPipe xbeePipe) {
		xbeePipe.getRx().setTtl(2000);
		xbeePipe.getTx().setTtl(2000);
		ATRetCmd cmd = (ATRetCmd) xbeePipe.syncSend(ATCmdUtils.INSTANCE.create("PP"), 2000);
		if (cmd != null && cmd.getData() != null) {
			String ret = new String(cmd.getData());
			ret = ret == null ? "" : ret; 
			if (ret.contains("K")) {
				cmd.setCode(AT_RET_CODES.OK);
			} else {
				cmd.setCode(AT_RET_CODES.BUSY);
			}
		}
		return cmd;
	}

	public int getBaudRate(CmdPipe xbeePipe) {
		ATRetCmd ret = getBaudRateATBD(xbeePipe);
		if (ret != null && ret.getCode() != null && ret.getCode().getValue() > 0) {
			return getBaudRateFromID(ret.getCode());
		}
		return -1;
	}

	public String getPanID(CmdPipe xbeePipe) {
		ATRetCmd cmd = (ATRetCmd) xbeePipe.syncSend(ATCmdUtils.INSTANCE.create("ID"), 250);
		String panID = evalATCmd(cmd);
		return panID;
	}
	
	public String getMY(CmdPipe xbeePipe) {
		ATRetCmd cmd = (ATRetCmd) xbeePipe.syncSend(ATCmdUtils.INSTANCE.create("MY"), 250);
		String myID = evalATCmd(cmd);
		return myID;
	}

	public ATRetCmd getBaudRateATBD(CmdPipe xbeePipe) {
		ATRetCmd cmd =  (ATRetCmd) xbeePipe.syncSend(ATCmdUtils.INSTANCE.create("BD"), 250);
		String ret = evalATCmd(cmd).trim();
		if (ret != null && ret != "") {
			int id = -1;
			try {
				id = Integer.parseInt(ret);
			} catch (NumberFormatException e) {
				e.printStackTrace();
				return cmd;
			}
			switch (id) {
				case 0: // 1200
					cmd.setCode(AT_RET_CODES.CONNECT_12000);
					break;
				case 1: // 2400
					cmd.setCode(AT_RET_CODES.CONNECT_2400);
					break;
				case 2: // 4800
					cmd.setCode(AT_RET_CODES.CONNECT_4800);
					break;
				case 3: // 9600
					cmd.setCode(AT_RET_CODES.CONNECT_9600);
					break;
				case 4: // 19200
					cmd.setCode(AT_RET_CODES.CONNECT_19200);
					break;
				case 5: // 38400
					cmd.setCode(AT_RET_CODES.CONNECT_38400);
					break;
				case 6: // 57600
					cmd.setCode(AT_RET_CODES.CONNECT_57600);
					break;
				case 7: // 115200
					cmd.setCode(AT_RET_CODES.CONNECT_115200);
					break;
				default:
					break;
			}
		}
		return cmd;
	}
}
