/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012, Lucas Bigeardel
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

package net.sf.smbt.osc.ezmojo.midi;

//import net.sf.smbt.midi.utils.nmj.MidiNode;

//import de.humatic.nmj.NMJConfig;
//import de.humatic.nmj.NMJSystemListener;
//import de.humatic.nmj.NetworkMidiListener;
//import de.humatic.nmj.NetworkMidiPort;
//import de.humatic.nmj.NetworkMidiSystem;

public class MidiDnsSDAgent {
	/*
	private List<MidiNode> midiNodes = new ArrayList<MidiNode>();
*/	
	public final static MidiDnsSDAgent INSTANCE = new MidiDnsSDAgent();
	
//	private SmbtMidiNetworkMidiListener midiNetworkListener;
	
	public MidiDnsSDAgent() {
		init();
	}
	
	public void addNode(int index, int mode, int ioMode, String addr, int port) {
//		midiNodes.add(
//			new MidiNode(index, mode, ioMode, addr, port)
//		);
	}
	
	public void init() {
		//midiNetworkListener = new SmbtMidiNetworkMidiListener();
		doIt();
	}
	
	/*
	public class SmbtMidiNetworkMidiListener implements NetworkMidiListener {
		@Override
		public void midiReceived(final int channel, final int ssrc, final byte[] data, final long timeStamp) {
			new Job("SmbtMidiNetworkMidiListener") {
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					System.out.println("midi received on: ");
					System.out.println("nmj channel: " + channel);
					System.out.println("timestamp: " + new java.util.Date(timeStamp));
					System.out.print("data: ");
					
					for (int i = 0; i < data.length; i++) {
						System.out.print(data[i]+" ");
					}
					System.out.println("");
					
					OscCmd cmd = Midi2OscMapping.INSTANCE.midi2osc(
						MidiCmdUtils.INSTANCE.createMidiMessage(
							Byte.valueOf(data[0]).intValue(),
							channel,
							data[1],
							data[2]
						)
					);
					
					QuanticMojo.INSTANCE.acceptLocalAgentCmd(cmd);
					
					return Status.OK_STATUS;
				}
			}.schedule();
		}
	}
	*/

	public void doIt(){
		try{
			/*
			NetworkMidiSystem nwms	= NetworkMidiSystem.get();
			
			NMJConfig.addSystemListener(new NMJSystemListener() {
				@Override
				public void systemError(int arg0, int arg1, String arg2) {
					System.out.println("System error : " + arg0 + ", " + arg1 + ", " + arg2);
				}
				@Override
				public void systemChanged(int arg0, int arg1, int arg2) {
					System.out.println("System changed : " + arg0 + ", " + arg1 + ", " + arg2);
				}
			});
			
			System.out.println(
				NMJConfig.asXML()
			);
			*/

//			((NetworkMidiOutput)out).sendMidi(
//				new byte[]{
//					(byte)0x80, 7, 0
//				}
//			);
			
//			NetworkMidiPort outRtp		= nwms.openOutput(2, midiNetworkListener);
//			((NetworkMidiOutput)outRtp).sendMidi(
//				new byte[]{
//					(byte)0x80, 7, 0
//				}
//			);
			
			//NetworkMidiPort inRtp		= nwms.openInput(0, midiNetworkListener);

			//if (showDialog) NMJConfig.showConfigDialog(null, null);

//			in.close(midiNetworkListener);
//			out.close(midiNetworkListener);
//			outRtp.close(midiNetworkListener);
		} catch (Exception x){
			x.printStackTrace(); 
		}
	}

	public void controlDNS(int param, int value, int flags) {
		//NMJConfig.controlDNS(param, value, flags);
	}
	
	

}
