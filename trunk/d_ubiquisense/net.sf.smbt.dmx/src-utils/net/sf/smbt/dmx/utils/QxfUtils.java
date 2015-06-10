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

package net.sf.smbt.dmx.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import net.sf.smbt.dmx.model.qxf.Channel;
import net.sf.smbt.dmx.model.qxf.FixtureDefinition;
import net.sf.smbt.dmx.model.qxf.Mode;
import net.sf.smbt.dmx.model.qxf.ModeChannel;
import net.sf.smbt.dmx.model.qxf.QxfPackage;
import net.sf.smbt.dmx.model.qxf.util.QxfResourceFactoryImpl;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class QxfUtils {

	public final static QxfUtils INSTANCE = new QxfUtils();
	
	public final static String QXF_XMLNS_HEADER = new String("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<qxf:FixtureDefinition xmlns:qxf=\"http:///net.sf.smbt.dmx/model/qxf.xsd\">".getBytes(), Charset.forName("UTF-8"));
	public final static String QXF_XMLNS_FOOTER = new String("</qxf:FixtureDefinition>");

	
	/**
	 * Initialize DMX Fixture model from a .qxf file
	 * 
	 * @param qxfFilePath a .qxf file
	 * 
	 * @return UI model
	 */
	public FixtureDefinition loadQXF(String qxfFilePath) {
		
		//System.out.println("... load " + qxfFilePath);
		
		//
		// Create a resource set.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		//
		// Register the default resource factory -- only needed for stand-alone!
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(QxfPackage.eNS_PREFIX, new QxfResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(QxfPackage.eNS_URI, QxfPackage.eINSTANCE);

		//
		// Register the package -- only needed for stand-alone!
		//
		@SuppressWarnings("unused")
		QxfPackage qxfPackage = QxfPackage.eINSTANCE;
		
		File qxfFile = new File(qxfFilePath);
		
		Path path = new Path(qxfFilePath);
		String tmpPath = path.removeLastSegments(1) + "/tmp-" + path.lastSegment();
		File tmpQxfFile = new File(tmpPath);
		try {
			FileInputStream fileIS = new FileInputStream(qxfFile);
			byte[] buffer = new byte[fileIS.available()];
			
			fileIS.read(buffer);
			fileIS.close();
			
			String content = new String(buffer, Charset.forName("UTF-8"));
			
			content = content.replace("<!DOCTYPE FixtureDefinition>\n", "");
			content = content.replace("<FixtureDefinition>", QXF_XMLNS_HEADER);
			content = content.replace("</FixtureDefinition>",QXF_XMLNS_FOOTER);
			
			FileOutputStream neOutputStream = new FileOutputStream(tmpQxfFile);
			
			neOutputStream.write(content.getBytes());
			neOutputStream.flush();
			neOutputStream.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
			
		try {
			//
			// Get the URI of the model file.
			//
			URI qxfURI = URI.createFileURI(tmpQxfFile.getAbsolutePath());
			
			//
			// Demand load the resource for this file.
			//
			Resource resource = resourceSet.getResource(qxfURI, true);
			
			Object obj = (Object) resource.getContents().get(0);
			
			tmpQxfFile.delete();
			
			if (obj instanceof FixtureDefinition) {
				return postProcessing((FixtureDefinition) obj);
			} 
		} catch (Throwable t) {
			t.printStackTrace();
		}
		
		return null;
	}
	
	private FixtureDefinition postProcessing(FixtureDefinition fixtureDefinition) {
		if (fixtureDefinition instanceof FixtureDefinition) {
			fixtureDefinition.getChannel();
		}
		return fixtureDefinition;
	}
	
	public Channel getChannelFromID(FixtureDefinition definition, String channelID) {
		List<Channel> channels = definition.getChannel();
		for (Channel channel : channels) {
			if (channel.getName().equals(channelID)) {
				return channel;
			}
		}
		return null;
	}
	
	public Map<String, Channel> getChannelsMapFromModeID(FixtureDefinition fixture, String modeID) {
		Map<String, Channel> channelMap = new TreeMap<String, Channel>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1 != null && o2 != null) {
					return o1.compareTo(o2);
				}
				return 0;
			}
		});
		if (!fixture.getMode().isEmpty()) {
			for (Mode mode : fixture.getMode()) {
				if (mode.getName().equals(modeID)) {
					for (ModeChannel c : mode.getChannel()) {
						String bi = c.getNumber();
						String value = c.getValue();
						if (bi != null && value != null) {
							Channel channel = getChannelFromID(fixture, value);
							if (channel != null) {
								channel.setNumber(new BigInteger(bi));
								channelMap.put(bi, channel);
							}
						}
					}
				}
			}
		}
		return channelMap;
	}
	
	
	
	public static void main(String[] args) {
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/American-DJ-Accu-Spot-250-II.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/American-DJ-DJ-Spot-300.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/American-DJ-Galaxian-3D.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/American-DJ-Mega-Bar-LED.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/American-DJ-Mega-Flash-DMX.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/American-DJ-Nucleus-LED.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/American-DJ-ProPAR-56RGB.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/American-DJ-Quad-Gem-DMX.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/American-DJ-Revo-3.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/American-DJ-Revo-4.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/American-DJ-Spherion-Tri-LED.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/American-DJ-Vizi-LED-Spot.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Chauvet-200b.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Chauvet-COLORado-1-Tour.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Chauvet-ColorStrip-Mini.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Chauvet-DMX-Mega-Strobe-III.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Chauvet-Hurricane-1800-Flex.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Chauvet-Hurricane-Haze-2.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Chauvet-LEDrain64.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Chauvet-LEDSplash-Jr.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Chauvet-Q-Spot-260-LED.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Chauvet-Vue-3.1.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Chauvet-Vue-6.1.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Coemar-Stage-Lite-LED.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Elation-Color-Spot-150.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Elation-Vision-250.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Electroconcept-PAR-56-LED-Full-RGB-18x3W.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Eurolite-DMXSuperstrobe-2700.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Eurolite-KLS200.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Eurolite-LED-PAR56.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Eurolite-LED-PAR64-RGB.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Eurolite-TC-150.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Eurolite-TC-200.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Eurolite-TC-250.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Eurolite-TC-300.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Eurolite-TC-5.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Eurolite-TF-5.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Eurolite-TG-5.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Eurolite-TMH-155.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Eurolite-TMH-250.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Eurolite-TR-5.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Eurolite-TS-10.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Eurolite-TS-150.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Eurolite-TS-155.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Eurolite-TS-2.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Eurolite-TS-250.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Eurolite-TS-255.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Eurolite-TS-5.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Eurolite-TS-7.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Eurolite-TS-7B.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Futurelight-AHS-150.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Futurelight-CF-200.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Futurelight-CY-200.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Futurelight-CY-250.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Futurelight-DJ-Color200.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Futurelight-DJ-LEDScan100.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Futurelight-DJScan200.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Futurelight-DJScan250.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Futurelight-EVO-5.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Futurelight-EVO-7.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Futurelight-EYE-18.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Futurelight-EYE-36.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Futurelight-MCF-200.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Futurelight-MH-440.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Futurelight-MH-840.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Futurelight-PCC-1200.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Futurelight-PCC-250.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Futurelight-PCC-250CMY.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Futurelight-PFE-1200.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Futurelight-PHS-150.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Futurelight-PHS-200.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Futurelight-PHS-220.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Futurelight-PHS-250.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Futurelight-PHS-700.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Futurelight-PHW-250.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Futurelight-PHW-700.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Futurelight-PSC-1200.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Futurelight-PSC-250.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Futurelight-PSC-575.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Futurelight-XF-200.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/GLP-Impression.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/GLP-ImpressionWA.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/GLP-ImpressionXL.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/GLP-Junior-Scan-1.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/GLP-Junior-Scan-2.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/GLP-PocketScan.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/GLP-Volkslicht.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/GLP-YPOC250.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/GLP-YPOC250Pro.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/GLP-YPOC575.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/GLP-YPOC700CMY.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/GLP-YPOCBasic250.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/GLP-YPOCBasicColor.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/GLP-YPOCColor.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/GLP-YPOCColor575.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/i-Pix-BB4.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/JB-Lighting-Varyscan-2.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/JB-Lighting-Varyscan-3-Special.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/JB-Lighting-Varyscan-3-SpecialPlus.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/JB-Lighting-Varyscan-4-Compact-Plus.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/JB-Lighting-Varyscan-4-EV.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/JB-Lighting-Varyscan-P2.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/JB-Systems-The-WinnerII.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Lite-Works-ColorChanger.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/MacMah-WiderPanel.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Martin-Atomic-3000.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Martin-Destroyer.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Martin-EFX-500.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Martin-EFX-600.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Martin-EFX-700.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Martin-EFX-800.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Martin-MAC250-Krypton.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Martin-MAC250plus.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Martin-MAC300.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Martin-MAC500.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Martin-MiniMAC-Maestro.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Martin-MiniMAC-Profile.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Martin-MiniMAC-Wash.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Martin-MX-1.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Martin-MX-10.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Martin-MX-4.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Martin-Punisher.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Martin-Robocolor-Pro-400.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Martin-Roboscan-218.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Martin-Roboscan-518.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Martin-Roboscan-812.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Martin-SCX-500.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Martin-SCX-600.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Martin-SCX-700.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Martin-SCX-800.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Microh-Firefly-RGY-II.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Movitec-SL-250.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Movitec-SL-575.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Movitec-WL-250.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Movitec-WL-575.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Pro-Lights-XP250.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Pro-Lights-XP575-Spot.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Pro-Lights-XP575-Wash.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/ProLights-V200.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Robe-ClubScan-150CT.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Robe-ClubScan-250CT.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Robe-ClubSpot-150CT.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Robe-ClubSpot-160CT.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Robe-ClubSpot-250CT.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Robe-ClubSpot-300-CT.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Robe-ClubSpot-500-CT.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Robe-ClubWash-250CT.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Robe-ClubWash-300CT.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Robe-ClubWash-500-CT.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Robe-Colorspot-170-AT.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Robe-ColorSpot-250-XT.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/SGM-Colorlab-250.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/SGM-Giotto-Spot-250.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/SGM-Giotto-Wash-400.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/SGM-Victory-250.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/SGM-Victory-II-250.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/SGM-Victory-II-Pro150.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Showtec-LED-Par-56-Short.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Showtec-MiniMax-250.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Stairville-LED-PAR56.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Stairville-PS1500DMX.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Stairville-SC250H.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Stairville-ZF-1500.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Varytec-Easy-Move-LED-XS-Spot.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Varytec-Easy-Move-LED-XS-Wash.qxf");
		QxfUtils.INSTANCE.loadQXF("/Users/lucas/Documents/workspace-helios-2/net.sf.smbt.dmx/src-utils/net/sf/smbt/dmx/utils/fixture/Varytec-Gigabar-II.qxf");
	}
}
