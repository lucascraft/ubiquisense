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

package net.sf.smbt.ui.wizards;

import gnu.io.CommPortIdentifier;

import java.util.HashMap;
import java.util.Map;

import net.sf.smbt.comm.extensions.protocol.ProtocolReactor;
import net.sf.smbt.comm.extensions.protocol.ProtocolWithSpecificTransportConfig;
import net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL;
import net.sf.smbt.midi.ezmidi.DSLMidiMessage;
import net.sf.smbt.osc.exchange.oscmidi.OscMidiUtils;
import net.sf.smbt.osc.utils.OscCmdUtils;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.ui.Activator;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.graphics.Image;

public class CommPipeConnectionSelectionWizard extends Wizard {
	
	public CommProtocolConnectionWizardPage			protocolWizardPage;
	public CommPipeConnectionSelectionWizardPage	selectionWizardPage;
	
	public BTCommPipeConnectionWizardPage			btCommWizardPage;
	public USBCommPipeConnectionWizardPage			usbCommWizardPage;
	public IPCommPipeConnectionWizardPage			ipCommWizardPage;
	public XBeeCommPipeConnectionWizardPage			xbeeCommWizardPage;
	public UBQCommPipeConnectionWizardPage			ubqCommWizardPage;
	public HTTPCommPipeConnectionWizardPage			httpCommWizardPage;
	
	// Not very nice ...
	public MidiCommPipeConnectionWizardPage			midiCommWizardPage;

	protected TRANSPORT_PROTOCOL[] protocols;
	protected String[] comms, visibles;
	protected boolean hook;
	
	protected boolean isTransportAvailable(TRANSPORT_PROTOCOL p) {
		for (TRANSPORT_PROTOCOL transportProtocol : protocols) {
			if (transportProtocol.equals(p)) {
				return true;
			}
		}
		return false;
	}
	public CommPipeConnectionSelectionWizard() {
		this(
			TRANSPORT_PROTOCOL.values(),
			ProtocolReactor.INSTANCE.getProtocolIDS(),
			true
		);
	}
	public CommPipeConnectionSelectionWizard(TRANSPORT_PROTOCOL[] protocols) {
		this(
			protocols,
			ProtocolReactor.INSTANCE.getProtocolIDS(),
			true
		);
	}
	public CommPipeConnectionSelectionWizard(String[] visibles, String ...comms) {
		this(
			TRANSPORT_PROTOCOL.values(),
			comms, 
			true,
			visibles
		);
	}
	public CommPipeConnectionSelectionWizard(String ...comms) {
		this(
			TRANSPORT_PROTOCOL.values(),
			comms, 
			true
		);
	}
	public CommPipeConnectionSelectionWizard(TRANSPORT_PROTOCOL[] protocols, String[] comms, boolean hook) {
		this(
			protocols,
			comms, 
			true,
			comms
		);
	}
	public CommPipeConnectionSelectionWizard(TRANSPORT_PROTOCOL[] protocols, String[] comms, boolean hook, String[] visibles) {
		this.protocols		= protocols;
		this.comms			= comms;
		this.hook			= hook;
		this.visibles		= visibles;
		boolean rxtxGoneBad = false;
		try {
			CommPortIdentifier.getPortIdentifiers();
		} catch (Throwable t) {
			rxtxGoneBad = true;
			t.printStackTrace();
		}
		if (protocols.length==1) {
			protocolWizardPage	= new CommProtocolConnectionWizardPage(comms, visibles, comms[0]);
		} else {
			protocolWizardPage	= new CommProtocolConnectionWizardPage(comms, visibles);
		}
		selectionWizardPage = new CommPipeConnectionSelectionWizardPage(protocols);
		
		if (!rxtxGoneBad) {
			usbCommWizardPage	= new USBCommPipeConnectionWizardPage(-1);
		}
		btCommWizardPage	= new BTCommPipeConnectionWizardPage();
		ipCommWizardPage	= new IPCommPipeConnectionWizardPage();
		if (!rxtxGoneBad) {
			xbeeCommWizardPage	= new XBeeCommPipeConnectionWizardPage();
			ubqCommWizardPage	= new UBQCommPipeConnectionWizardPage();
		}
		midiCommWizardPage = new MidiCommPipeConnectionWizardPage();
		//
		// FIXME : LB to get stuff done ASAP
		//
		//httpCommWizardPage	= new HTTPCommPipeConnectionWizardPage();
		setHelpAvailable(true);
		setWindowTitle("Communication Pipe Creation Wizard");
	}
	
	CmdPipe pipe;
	@Override
	public boolean performFinish() {
		int[] inPorts = new int[]{};
		inPorts = ipCommWizardPage.getIngoingPortsAtomic();
		if (selectionWizardPage.isMidiMode()) {
			if (midiCommWizardPage.getMidiDevice() != null) {
				pipe = QuanticMojo.INSTANCE.openMidiPipe(midiCommWizardPage.getMidiDevice());
				if (midiCommWizardPage.isDumpedAsOSC()) {
					pipe.addQxEventHandler(
						new AbstractQxEventHandlerImpl() {
							public synchronized void handleQxEvent(net.sf.xqz.model.engine.Event event) {
								if (event.getCmd() instanceof DSLMidiMessage) {
									QuanticMojo.INSTANCE.acceptLocalAgentCmd(
										OscMidiUtils.INSTANCE.createOscMidiMessage(
											(DSLMidiMessage) event.getCmd()
										)
									);
								}
							};
						}
					);
				}
			}
		} else {
			switch(selectionWizardPage.getSelectedProtocol()) {
	//			case BLUETOOTH:
	//				pipe = QuanticMojo.INSTANCE.openBluetoothPipe("", portConfig)
	//				break;
	//			case HTTP:
	//				pipe = QuanticMojo.INSTANCE.openHttpPipe("", protocolID, portConfig, acceptedPorts[])
	//				break;
				case TCP:
					if (inPorts == null || inPorts.length == 0) {
						pipe = QuanticMojo.INSTANCE.openTcpPipe(protocolWizardPage.getProtocol().getID(), ipCommWizardPage.getIpAddr());
					} else {
						pipe = QuanticMojo.INSTANCE.openTcpPipe(protocolWizardPage.getProtocol().getID(), ipCommWizardPage.getIpAddr(), inPorts);
					}
					break;
				case UDP:
					if (inPorts == null || inPorts.length == 0) {
						pipe = QuanticMojo.INSTANCE.openUdpPipe(protocolWizardPage.getProtocol().getID(), ipCommWizardPage.getIpAddr());
					} else {
						pipe = QuanticMojo.INSTANCE.openUdpPipe(protocolWizardPage.getProtocol().getID(), ipCommWizardPage.getIpAddr(), inPorts);
					}
					break;
				case USB:
					if (Platform.inDebugMode()) {
						System.out.println("id     : " + protocolWizardPage.getProtocol().getID());
						System.out.println("config : " + usbCommWizardPage.getConfig());
						System.out.println("speed  : " + usbCommWizardPage.getSpeed());
						System.out.println("data   : " + usbCommWizardPage.getDataBit());
						System.out.println("stop   : " + usbCommWizardPage.getStopBit());
						System.out.println("parity : " + usbCommWizardPage.getParity());
						System.out.println("flow   : " + usbCommWizardPage.getFlowControl());
						System.out.println("notifyOnOutput   : " 		+ usbCommWizardPage.isNotifyOnOutput());
						System.out.println("notifyOnDataAvailable   : " + usbCommWizardPage.isNotifyOnDataAvailable());
					}
					
					Map<Object, Object> options = new HashMap<Object, Object>();
					options.put("data",						usbCommWizardPage.getDataBit());
					options.put("stop", 					usbCommWizardPage.getStopBit());
					options.put("parity",					usbCommWizardPage.getParity());
					options.put("flow",						usbCommWizardPage.getFlowControl());
					options.put("notifyOnOutput",			usbCommWizardPage.isNotifyOnOutput());
					options.put("notifyOnDataAvailable",	usbCommWizardPage.isNotifyOnDataAvailable());
					
					pipe = QuanticMojo.INSTANCE.openUsbPipe(
						protocolWizardPage.getProtocol().getID(), 
						usbCommWizardPage.getConfig(), 
						usbCommWizardPage.getSpeed(),
						options
					);
					break;
	//			case XBEE:
	//				pipe = QuanticMojo.INSTANCE.openXBeePipe("", portConfig)
	//				break;
				default:
					break;
			}
		}
		if (hook && pipe instanceof CmdPipe && !pipe.getPorts().isEmpty()) {
			try {
				ProtocolWithSpecificTransportConfig tCfg = ProtocolReactor.INSTANCE.getProtocolsWithSpecificTransportMap(pipe.getCommunicationProtocol());
				String speed	= pipe.getSpeed()>0?("@"+pipe.getSpeed()):"";
				String alias	= tCfg.getAlias().equals("")?"":"<"+tCfg.getAlias()+">";
				String port		= (pipe.getPorts().isEmpty()?"":(":"+pipe.getPorts().get(0)));
				String expr		= pipe.getTransportProtocol() + port + alias + speed;
				
				if (!"".equals(port)) {
					QuanticMojo.INSTANCE.acceptLocalAgentCmd(
						OscCmdUtils.INSTANCE.createOscCmd(
							"/ez/hook",
							expr
						)
					);
				}
			} catch (Throwable t) {
				t.printStackTrace();
			}
		}
		return true;
	}
	
	public CmdPipe getCmdPipe() {
		return pipe;
	}
	
	@SuppressWarnings("incomplete-switch")
	@Override
	public boolean canFinish() {
		TRANSPORT_PROTOCOL p = selectionWizardPage.getSelectedProtocol();
		boolean rxtxGoneBad = false;
		try {
			CommPortIdentifier.getPortIdentifiers();
		} catch (Throwable t) {
			rxtxGoneBad = true;
			t.printStackTrace();
		}
		if (selectionWizardPage.isMidiMode()) {
			return midiCommWizardPage.isPageComplete();
		}
		switch(p) {
			case USB:
				if (!rxtxGoneBad) {
					return usbCommWizardPage.isPageComplete();
				}
			case UDP:
			case TCP:
				return ipCommWizardPage.isPageComplete();
			case HTTP:
				if (!rxtxGoneBad) {
					return usbCommWizardPage.isPageComplete();
				}
			case BLUETOOTH:
				return usbCommWizardPage.isPageComplete();
		}
		return false;
	}
	
	@Override
	public void addPages() {
		if(protocols.length > 1) {
			addPage(protocolWizardPage);
		}
		if (comms.length > 1) {
			addPage(selectionWizardPage);
		}
		
		boolean rxtxGoneBad = false;
		try {
			CommPortIdentifier.getPortIdentifiers();
		} catch (Throwable t) {
			rxtxGoneBad = true;
			t.printStackTrace();
		}
		if (!rxtxGoneBad && isTransportAvailable(TRANSPORT_PROTOCOL.USB)) {
			addPage(usbCommWizardPage);
		}
		if (isTransportAvailable(TRANSPORT_PROTOCOL.UDP) || isTransportAvailable(TRANSPORT_PROTOCOL.TCP)) {
			addPage(ipCommWizardPage);
		}
		addPage(midiCommWizardPage);
		
		//
		//FIXME : LB to implement that later : robustify it first !!!
		//
		
		/*		
		if (!rxtxGoneBad && isTransportAvailable(TRANSPORT_PROTOCOL.HTTP)) {
			addPage(httpCommWizardPage);
		}
		if (isTransportAvailable(TRANSPORT_PROTOCOL.BLUETOOTH)) {
			addPage(btCommWizardPage);
		}
		if (!rxtxGoneBad && isTransportAvailable(TRANSPORT_PROTOCOL.MIDI)) {
			addPage(ubqCommWizardPage);
		}
		if (!rxtxGoneBad && isTransportAvailable(TRANSPORT_PROTOCOL.XBEE)) {
			addPage(xbeeCommWizardPage);
		}
		*/
	}

	@SuppressWarnings("static-access")
	@Override
	public Image getDefaultPageImage() {
		return Activator.getDefault().imageDescriptorFromPlugin(
			Activator.PLUGIN_ID, 
			"icons/ubiquisense64.png"
		).createImage();
	}
	
	@SuppressWarnings("incomplete-switch")
	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		if (page instanceof CommPipeConnectionSelectionWizardPage) {
			if (selectionWizardPage.isMidiTransportSelected()) {
				return midiCommWizardPage;
			} else {
				switch(selectionWizardPage.getSelectedProtocol()) {
					case BLUETOOTH:
						return btCommWizardPage;
					case HTTP:
						return httpCommWizardPage;
					case TCP:
					case UDP:
						return ipCommWizardPage;
					case USB:
						boolean rxtxGoneBad = false;
						try {
							CommPortIdentifier.getPortIdentifiers();
						} catch (Throwable t) {
							rxtxGoneBad = true;
							t.printStackTrace();
						}
						if (!rxtxGoneBad) {
							return usbCommWizardPage;
						}
					case XBEE:
						return xbeeCommWizardPage;
				}
			}
		}
		return super.getNextPage(page);
	}
	
	@Override
	public IWizardPage getPreviousPage(IWizardPage page) {
		if (page instanceof MidiCommPipeConnectionWizardPage) {
			selectionWizardPage.listViewer.getControl().setEnabled(true);
		}
		if (page == usbCommWizardPage
			|| page == ipCommWizardPage 
			|| page == midiCommWizardPage
		) {
			return selectionWizardPage; 
		}
		return super.getPreviousPage(page);
	}
}
