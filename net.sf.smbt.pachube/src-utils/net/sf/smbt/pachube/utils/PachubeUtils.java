/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2008 - 2013, Lucas Bigeardel
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

package net.sf.smbt.pachube.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;

import javax.xml.datatype.XMLGregorianCalendar;

import net.sf.smbt.comm.httpcmd.HttpMethod;
import net.sf.smbt.comm.httpcmd.HttpcmdFactory;
import net.sf.smbt.comm.httpcmd.Property;
import net.sf.smbt.ezmojo.EZMojoNode;
import net.sf.smbt.ezpachube.CosmCmd;
import net.sf.smbt.ezpachube.EzpachubeFactory;
import net.sf.smbt.ezpachube.FeedKind;
import net.sf.smbt.ezpachube.IntervalKind;
import net.sf.smbt.ezpachube.PACHUBE_ACCESS;
import net.sf.smbt.ezpachube.PACHUBE_HTTP_STATUS;
import net.sf.smbt.ezpachube.Version;
import net.sf.smbt.osc.ezmojo.utils.EzMojoCmdUtils;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.eclipse.emf.ecore.xml.type.internal.XMLCalendar;
import org.eclipse.osgi.service.datalocation.Location;
import org.eeml.xsd._0._5.CurrentValueType;
import org.eeml.xsd._0._5.DataType;
import org.eeml.xsd._0._5.DispositionType;
import org.eeml.xsd._0._5.DocumentRoot;
import org.eeml.xsd._0._5.DomainType;
import org.eeml.xsd._0._5.EemlType;
import org.eeml.xsd._0._5.EnvironmentType;
import org.eeml.xsd._0._5.ExposureType;
import org.eeml.xsd._0._5.LocationType;
import org.eeml.xsd._0._5.PrivateType;
import org.eeml.xsd._0._5.StatusType;
import org.eeml.xsd._0._5.TypeType;
import org.eeml.xsd._0._5.UnitType;
import org.eeml.xsd._0._5.ValueType;
import org.eeml.xsd._0._5.VersionType;
import org.eeml.xsd._0._5._5Factory;
import org.eeml.xsd._0._5._5Package;
import org.eeml.xsd._0._5.util._5ResourceFactoryImpl;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.illposed.osc.OSCMessage;
import com.illposed.osc.OSCPacket;

public class PachubeUtils {
	public final static PachubeUtils INSTANCE = new PachubeUtils();
	
	public SimpleDateFormat ISO_8601_DATE_FORMAT, ISO_8601_SHORT_DATE_FORMAT; 
	

	public PachubeUtils() {
		ISO_8601_DATE_FORMAT		= new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'");
		ISO_8601_DATE_FORMAT.setLenient(true);
		ISO_8601_DATE_FORMAT.setTimeZone(TimeZone.getTimeZone("GMT+2:00"));
		
		ISO_8601_SHORT_DATE_FORMAT	= new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		ISO_8601_SHORT_DATE_FORMAT.setLenient(true);
		ISO_8601_SHORT_DATE_FORMAT.setTimeZone(TimeZone.getTimeZone("GMT+2:00"));
	}
	
	public byte[] dumpPachubeCommand(Cmd cmd) {
		if (cmd instanceof CosmCmd) {
			CosmCmd c = (CosmCmd) cmd;
			String feed			= c.getFeed();
			String dataStream	= c.getDatastream();
			
			feed 				= (feed==null || "".equals(feed)) ? "" : ("/" + feed);
			dataStream 			= (dataStream==null || "".equals(dataStream)) ? "" : ("/datastreams/" + dataStream);
			
			String url =  "/" + c.getVersion() + "/feeds"+ feed + dataStream;
			url += ("".equals(feed) && "".equals(dataStream)) ? "" : ("."+ c.getFeedKind().getLiteral()) ;
			url += c.getCommand();
			return url.getBytes();
		}
		return new byte[0];
	}

	public Cmd handlePachubeFrame(byte[] frame) {
		String flux = new String(frame, Charset.forName("UTF-8"));

		CosmCmd cmd = EzpachubeFactory.eINSTANCE.createCosmCmd();
		if (flux.startsWith("<")) {
			cmd.setEeml(loadEEMLFromXML(flux));
			cmd.setFeedKind(FeedKind.EEML);
		} else if (flux.startsWith("{")) {
			cmd.setJson(loadDataFromJson(flux));
			cmd.setFeedKind(FeedKind.JSON);
		} else {
			// csv ?
			cmd.setFeedKind(FeedKind.CSV);
		}
		cmd.setAccess(PACHUBE_ACCESS.PACHUBE_HTTP);
		cmd.setStatus(PACHUBE_HTTP_STATUS.STATUS_200);
		
		return cmd;
	}
	
	//
	//
	//
	
	public Object loadDataFromJson(String json) {
		return new JsonParser().parse(json);
	}
	
	/**
	 * Initialize EEML model from a .eeml byte[] flow
	 * 
	 * @param EEML aq .eeml byte[] flow
	 * 
	 * @return EEML model
	 */
	public EemlType loadEEMLFromXML(String eemlContent) {
		//
		// Create a resource set.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		//
		// Register the default resource factory -- only needed for stand-alone!
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(_5Package.eNS_PREFIX, new _5ResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(_5Package.eNS_URI, _5Package.eINSTANCE);

		//
		// Register the package -- only needed for stand-alone!
		//
		_5Package eemlPackage = _5Package.eINSTANCE;
		
		if (Platform.inDebugMode()) {
			System.out.println("init " + eemlPackage.getNsURI());
		}

		File eemlFile = null;
		
		Location configArea = Platform.getConfigurationLocation();
		String configLocation = null;
		if (configArea != null) {
			configLocation = configArea.getURL().getFile();
		}
		if (configLocation != null) {
			Location location = Platform.getInstallLocation();
			if (location != null) {
				URL url = location.getURL();
				if (url != null) {
					eemlFile = new File(configLocation.toString() + "/__TEMP-EEML-Pachube_" + UUID.randomUUID().toString() + "._5");
				}
			}
		}

		//
		// Get the URI of the model file.
		//
		URI eemlURI = null;
		try {
			eemlURI = URI.createFileURI(eemlFile.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileOutputStream os = null;
		try {
			os = new FileOutputStream(eemlFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		BufferedWriter writer = new BufferedWriter(
			new OutputStreamWriter(
				os, 
				Charset.forName("UTF-8")
			)
		);
		
		try {
			writer.write(eemlContent);
			writer.flush();
			
			os.flush();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		//
		// Demand load the resource for this file.
		//
		Resource resource = resourceSet.getResource(eemlURI, true);

		Object obj = (Object) resource.getContents().get(0);
		
		eemlFile.delete();
		
		if (obj instanceof DocumentRoot) {
			return ((DocumentRoot)obj).getEeml();
		} else {
			return null;
		}
	}
	
	public void dumpJsonFeed(JsonElement json) {
		//new JsonWriter(new OutputStreamWriter(System.out)).;
	}
	
	private final String EEML_HEADER = "xmlns=\"http://www.eeml.org/xsd/0.5.1\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" version=\"0.5.1\" xsi:schemaLocation=\"http://www.eeml.org/xsd/0.5.1 http://www.eeml.org/xsd/0.5.1/0.5.1.xsd\"";
	public String dumpEemlEnvironementAsXML(EemlType eemlType) {
		ResourceSet resourceSet = new ResourceSetImpl();

		//
		// Register the default resource factory -- only needed for stand-alone!
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(_5Package.eNS_PREFIX, new _5ResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(_5Package.eNS_URI, _5Package.eINSTANCE);


		try {
			//
			// Get the URI of the model file.
			//
			URI touchoscURI = URI.createFileURI(File.createTempFile("EEML_", "eeml").getCanonicalPath());
			
			//
			// Demand load the resource for this file.
			//
			Resource resource = resourceSet.createResource(touchoscURI);
			
			resource.getContents().add(eemlType);
			Map<Object, Object> options = new HashMap<Object, Object>();
			options.put(XMLResource.OPTION_ENCODING, "UTF-8");
			XMLProcessor xmlProcessor = new XMLProcessor();
			String xml = xmlProcessor.saveToString(resource, options);
			
			xml = xml.replace("<_5:", "<");
			xml = xml.replace("</_5:", "</");
			xml = xml.replace("<_5:", "<");
			xml = xml.replace("</eeml_._type>", "</eeml>");
			xml = xml.replace("<eeml_._type", "<eeml");
			xml = xml.replace("xmi:version=\"2.0\"", "");
			xml = xml.replace("xmlns:xmi=\"http://www.omg.org/XMI\"", "");
			xml = xml.replace("xmlns:_5=\"http://www.eeml.org/xsd/0.5.1\"", "");
			xml = xml.replace("version=\"0.5.1\"", EEML_HEADER);
			xml = xml.replace("<name></name>", "");
			xml = xml.replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n", "");
	
			return xml;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return "";
	}
	
	public void dumpEemlEnvironement(EemlType eemlType) {
		if (eemlType !=null) {
			for (EnvironmentType envType : eemlType.getEnvironment()) {
				System.out.println(
					"Creator : " + envType.getCreator() + "\n" +
					"Descritption : " + envType.getDescription() + "\n" +
					"Email : " + envType.getEmail()  + "\n" +
					"Feed : " + envType.getFeed()  + "\n" +
					"Icon : " + envType.getIcon()  + "\n" +
					"Title : " + envType.getTitle()  + "\n" +
					"Website : " + envType.getWebsite()  + "\n" +
					"Id : " + envType.getId()  + "\n" +
					"Location : " + envType.getLocation()  + "\n" +
					"Private : " + envType.getPrivate() + "\n" +
					"Status : " + envType.getStatus()  + "\n");
				String tags = "";
				for (String t : envType.getTag()) {
					tags += "[" + t + "]";
				}
				if (Platform.inDebugMode()) {
					System.out.println(tags);
				}
				String data = "";
				for (DataType dt : envType.getData()) {
					data += "\t[" + dt.getMinValue() + ".." + dt.getMaxValue()+ "] : " + dt.getCurrentValue();
				}
				if (Platform.inDebugMode()) {
					System.out.println(data);
				}
			}
		}
	}
	
	
	//
	//
	//
	

	public DataType applyDataStreamsOnTreeViewer(String feedx, String datastream, EemlType eeml, JsonObject jsonObj) {
		JsonArray dataPoints = (JsonArray) jsonObj.get("datapoints");
		if (dataPoints != null) {
			boolean found = false;
			DataType data = null;
			for (EnvironmentType env : eeml.getEnvironment()) {
				if (feedx.equals(env.getId())) {
					for (DataType dt : env.getData()) {
						if (datastream.equals(dt.getId())) {
							data = dt;
							found = true;
							break;
						}
					}
				}
			}
			if (found) {
				if (data.getDatapoints() == null) {
					data.setDatapoints(_5Factory.eINSTANCE.createDatapointsType());
				}
				data.getDatapoints().getValue().clear();
				Iterator<JsonElement> itPoints = dataPoints.iterator();
				while(itPoints.hasNext()) {
					JsonObject pt = (JsonObject) itPoints.next();
					if (pt != null) {
						String value 	= pt.get("value")	!= null ? pt.get("value").getAsString() : "";
						String at 		= pt.get("at") 		!= null ? pt.get("at").getAsString() : "";
						
						ValueType valueT = _5Factory.eINSTANCE.createValueType();
						
						Date updatedDate = new Date();
						
						try {
							updatedDate = ISO_8601_DATE_FORMAT.parse(at);
						} catch (ParseException e) {
							e.printStackTrace();
						}
						
					    XMLGregorianCalendar cv = new XMLCalendar(updatedDate, XMLCalendar.DATE).normalize();
					    
						valueT.setAt(cv);
						valueT.setValue(value);

						data.getDatapoints().getValue().add(valueT);
					}
				}
				return data;
			}
		} 
		return null;
	}
	
	
	public List<EnvironmentType>  applyTotalResultsOnTreeViewer(String feedx, String datastream, EemlType eeml, JsonObject jsonObj) {
		List<EnvironmentType> environments = new ArrayList<EnvironmentType>();
		if (feedx != null && datastream != null && eeml != null && jsonObj != null) {
			
			JsonArray vals = (JsonArray) jsonObj.get("results");
			
			if (vals != null && vals.isJsonArray()) {
				JsonArray o = (JsonArray) vals;
				
				Iterator<JsonElement> itJsonElem = o.iterator();
				while(itJsonElem.hasNext()) {
					JsonObject obj	= (JsonObject) itJsonElem.next();
		
					String feed		= obj.get("feed")			!= null		? obj.get("feed").getAsString() 		: "";
					String title	= obj.get("title") 			!= null 	? obj.get("title").getAsString() 		: "";
					String status	= obj.get("status") 		!= null 	? obj.get("status").getAsString() 		: "";
					String creator	= obj.get("creator") 		!= null 	? obj.get("creator").getAsString() 		: "";
					String id		= obj.get("id") 			!= null 	? obj.get("id").getAsString() 			: "";
					String desc		= obj.get("description")	!= null 	? obj.get("description").getAsString()	: "";
					String updated	= obj.get("updated") 		!= null 	? obj.get("updated").getAsString() 		: "";
					String priv		= obj.get("private")	 	!= null 	? obj.get("private").getAsString() 		: "";
					String email	= obj.get("email") 			!= null 	? obj.get("email").getAsString() 		: "";
					String website	= obj.get("website") 		!= null 	? obj.get("website").getAsString() 		: "";
	
					JsonObject location = (JsonObject) obj.getAsJsonObject("location");
	
						
					String exposure	= "";
					String lon		= "";
					String lat		= "";
					String domain	= "";
					String dispo	= "";
					String name		= "";

					if (location != null) {
						exposure	= location.get("exposure")		!= null ? location.get("exposure").getAsString() 	: "";
						lon		= location.get("lon")			!= null ? location.get("lon").getAsString() 		: "";
						lat		= location.get("lat")			!= null ? location.get("lat").getAsString() 		: "";
						domain	= location.get("domain")		!= null ? location.get("domain").getAsString() 		: "";
						dispo	= location.get("disposition") 	!= null ? location.get("disposition").getAsString() : "";
						name		= location.get("name") 			!= null ? location.get("name").getAsString() 		: "";
					}
					
					Date updatedDate = new Date();
					 try {
						updatedDate = ISO_8601_DATE_FORMAT.parse(updated);
					} catch (ParseException e) {
						e.printStackTrace();
					}
				    XMLGregorianCalendar value = new XMLCalendar(updatedDate, XMLCalendar.DATE).normalize();
				    
					boolean toAdd = true;
					EnvironmentType envType = null;
					for (EnvironmentType tt : eeml.getEnvironment()) {
						if (tt.getId().equals(id)) {
							envType = tt;
							toAdd = false;
							break;
						}
					}
					if (toAdd) {
						LocationType locationType = _5Factory.eINSTANCE.createLocationType();
						locationType.setDisposition(DispositionType.get(dispo));
						locationType.setDomain(DomainType.get(domain));
						locationType.setEle(0d);
						locationType.setExposure(ExposureType.get(exposure));
						locationType.setLat(new Double(lat == null || lat.equals("") ? "0.0" : lat));
						locationType.setLon(new Double(lon == null || lon.equals("") ? "0.0" : lon));
						locationType.setName(name);

						envType = _5Factory.eINSTANCE.createEnvironmentType();
						envType.setLocation(locationType);
						envType.setCreator(creator);
						envType.setEmail(email);
						envType.setUpdated(value);
						envType.setId(id);
						envType.setDescription(desc);
						envType.setStatus(StatusType.get(status));
						envType.setPrivate(PrivateType.get(priv));
						envType.setFeed(feed);
						envType.setTitle(title);
						envType.setStatus(StatusType.get(status));
						envType.setWebsite(website);

						eeml.getEnvironment().add(envType);
						
						//
						// newly added thanks to proximal latitude/longitude query
						//
					}
				    
					environments.add(envType);
	
					JsonArray dataStreams = (JsonArray) obj.get("datastreams");
					
					if (dataStreams != null) {
						Iterator<JsonElement> itStreams = dataStreams.iterator();
						while(itStreams.hasNext()) {
							JsonObject s = (JsonObject) itStreams.next();
					
							String ID 				= s.get("id").getAsString();
							String min_value		= s.get("min_value") == null ? "" : s.get("min_value").getAsString();
							String max_value		= s.get("max_value") == null ? "" : s.get("max_value").getAsString();
							String current_value	= s.get("current_value") == null ? "" : s.get("current_value").getAsString();
							JsonElement unitElem	= s.get("unit"); 
							
							String unit = "";
							if (unitElem != null && unitElem.isJsonObject()) {
								JsonObject unitObj = (JsonObject) unitElem;
								if (unitObj != null) {
									unit = unitObj.get("label") == null ? "" : unitObj.get("label").getAsString();
								}
							}
		
							boolean dataToAdd = true;
							DataType data = null;
							for (DataType tt : envType.getData()) {
								if (tt.getId().equals(ID)) {
									data = tt;
									dataToAdd = false;
									break;
								}
							}
							if (dataToAdd) {
								data = _5Factory.eINSTANCE.createDataType();
								envType.getData().add(data);
								CurrentValueType vType = _5Factory.eINSTANCE.createCurrentValueType();
								vType.setValue(current_value);
								
								data.setCurrentValue(vType);
								data.setMinValue(min_value);
								data.setMaxValue(max_value);
								data.setId(ID);
								UnitType uType = _5Factory.eINSTANCE.createUnitType();
								uType.setValue(unit);
								uType.setSymbol(unit);
								uType.setType(TypeType.BASIC_SI);
								
								data.setUnit(uType);
							}
						}
					}
				}
			}
		}
		
		eeml.getEnvironment().clear();
		eeml.getEnvironment().addAll(environments);
		
		return environments;
	}
	
	public CosmCmd queryAroundFeeds(float lat, float lon, float dist, String apiKey) {
    	List<Property> properties = new ArrayList<Property>();
    	properties.add(PachubeUtils.INSTANCE.createProperty("content", 	"full"));
    	properties.add(PachubeUtils.INSTANCE.createProperty("distance", ""+dist));
    	properties.add(PachubeUtils.INSTANCE.createProperty("lat", 		""+lat));
    	properties.add(PachubeUtils.INSTANCE.createProperty("lon", 		""+lon));
		return PachubeUtils.INSTANCE.buildListFeedRequest("", apiKey, properties);
	}

	

	//
	//
	// Temporal feed, datastreams, datapoints API
	//
	//
	
	public String buildReadDatastreamHistory(String feed, String datastream, FeedKind kind, String apiKey, Date start, IntervalKind interval) {
		return buildReadDatastreamHistory(feed, datastream, kind, apiKey, start, interval);
	}
	
	public CosmCmd buildReadDatastreamHistory(String feed, String datastream, FeedKind kind, String apiKey,Date start, Date end) {
		if (feed != null && !"".equals(feed) && start != null && end != null) {
			List<Property> properties = new ArrayList<Property>();
	    	properties.add(PachubeUtils.INSTANCE.createProperty("start", 	ISO_8601_SHORT_DATE_FORMAT.format(start).replace("+0000", "Z")));
	    	properties.add(PachubeUtils.INSTANCE.createProperty("end", 		ISO_8601_SHORT_DATE_FORMAT.format(end).replace("+0000", "Z")));
	    	properties.add(PachubeUtils.INSTANCE.createProperty("interval", "0"));
			return buildCosmRequest(HttpMethod.GET, feed, datastream, kind, null, properties, apiKey);
		}
		return null;
	}
	
	public CosmCmd buildReadDatastream6HoursHistory(String feed, String datastream, String apiKey) {
		Date now = new Date();
		Calendar c1 = Calendar.getInstance();
		c1.setTime(now);
		c1.add(Calendar.HOUR, -6);  
		return buildReadDatastreamHistory(feed, datastream, FeedKind.JSON, apiKey, new Date(c1.getTimeInMillis()), now);
	}

	public CosmCmd buildReadDatastream1YearHistory(String feed, String datastream, String apiKey) {
		Date now = new Date();
		Calendar c1 = Calendar.getInstance();
		c1.setTime(now);
		c1.add(Calendar.YEAR, -1);  
		return buildReadDatastreamHistory(feed, datastream, FeedKind.JSON, apiKey, new Date(c1.getTimeInMillis()), now);
	}

	//
	//
	// TRIGGERS
	//
	//
	
	public CosmCmd buildCreateTriggerRequest(String feed, EemlType eeml, String apiKey) {
		StringBuffer xml = new StringBuffer();
		
		xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		xml.append("<datastream-trigger>");
		xml.append("  <url>http://www.postbin.org/1ijyltn</url>");
		xml.append("  <trigger-type>lt</trigger-type>");
		xml.append("  <threshold-value type=\"float\">15.0</threshold-value>");
		xml.append("  <environment-id type=\"integer\">1233</environment-id>");
		xml.append("  <stream-id>0</stream-id>");
		xml.append("</datastream-trigger>");

		List<Property> properties = new ArrayList<Property>();
		
		Property p = PachubeUtils.INSTANCE.createProperty("body", xml.toString());
		properties.add(p);
		
		return buildCosmRequest(HttpMethod.POST, feed, "", FeedKind.JSON, eeml, properties, apiKey);
	}
	
	public CosmCmd buildLisAllTriggersRequest(String apiKey) {
		return buildCosmRequest(HttpMethod.GET, "", "", "triggers", Version.V2, FeedKind.JSON, null, new ArrayList<Property>(), apiKey);
	}
	
	public CosmCmd buildLisTriggersRequest(String feed, String apiKey) {
		return buildCosmRequest(HttpMethod.GET, feed, "", FeedKind.JSON, null, new ArrayList<Property>(), apiKey);
	}
	
	public CosmCmd buildListTriggersRequest(String feed, String datastream, String apiKey) {
		return buildCosmRequest(HttpMethod.GET, feed, "", FeedKind.JSON, null, new ArrayList<Property>(), apiKey);
	}

	
	//
	//
	// FEEDS
	//
	//
	
	public CosmCmd buildCreateFeedRequest(String feed, EemlType eeml, String apiKey) {
		return buildCosmRequest(HttpMethod.POST, feed, "", FeedKind.JSON, eeml, new ArrayList<Property>(), apiKey);
	}
	public CosmCmd buildCreateFeedRequest(String feed, EemlType eeml, String apiKey, List<Property> properties) {
		return buildCosmRequest(HttpMethod.POST, feed, "", FeedKind.JSON, eeml, properties, apiKey);
	}
	public CosmCmd buildUpdateFeedRequest(String feed, EemlType eeml, String apiKey) {
		return buildCosmRequest(HttpMethod.PUT, feed, "", FeedKind.JSON, eeml, new ArrayList<Property>(), apiKey);
	}
	public CosmCmd buildUpdateFeedRequest(String feed, EemlType eeml, String apiKey, List<Property> properties) {
		return buildCosmRequest(HttpMethod.PUT, feed, "", FeedKind.JSON, eeml, properties, apiKey);
	}
	public CosmCmd buildListFeedRequest(String feed, String apiKey) {
		return buildCosmRequest(HttpMethod.GET, feed, "", FeedKind.JSON, null, new ArrayList<Property>(), apiKey);
	}
	
	/**
	 * <table class="docutils" border="1">
		<colgroup>
		<col width="7%">
		<col width="59%">
		<col width="34%">
		</colgroup>
		<thead valign="bottom">
		<tr><th class="head">Parameter</th>
		<th class="head">Description</th>
		<th class="head">Example</th>
		</tr>
		</thead>
		<tbody valign="top">
		<tr><td>page</td>
		<td>Integer indicating which page of results you are requesting. Starts from 1.</td>
		<td><a class="reference external" href="http://api.cosm.com/v2/feeds?page=2">http://api.cosm.com/v2/feeds?page=2</a></td>
		</tr>
		<tr><td>per_page</td>
		<td>Integer defining how many results to return per page (1 to 1000).</td>
		<td><a class="reference external" href="http://api.cosm.com/v2/feeds?per_page=5">http://api.cosm.com/v2/feeds?per_page=5</a></td>
		</tr>
		<tr><td>content</td>
		<td>String parameter ('full' or 'summary') describing whether we want full or summary results.
		Full results means all datastream values are returned, summary just returns the environment
		meta data for each feed.</td>
		<td><a class="reference external" href="http://api.cosm.com/v2/feeds?content=summary">http://api.cosm.com/v2/feeds?content=summary</a></td>
		</tr>
		<tr><td>q</td>
		<td>Full text search parameter. Should return any feeds matching this string.</td>
		<td><a class="reference external" href="http://api.cosm.com/v2/feeds?q=arduino">http://api.cosm.com/v2/feeds?q=arduino</a></td>
		</tr>
		<tr><td>tag</td>
		<td>Returns feeds containing datastreams tagged with the search query.</td>
		<td><a class="reference external" href="http://api.cosm.com/v2/feeds?tag=temperature">http://api.cosm.com/v2/feeds?tag=temperature</a></td>
		</tr>
		<tr><td>user</td>
		<td>Returns feeds created by the user specified.</td>
		<td><a class="reference external" href="http://api.cosm.com/v2/feeds.xml?user=cosm">http://api.cosm.com/v2/feeds.xml?user=cosm</a></td>
		</tr>
		<tr><td>units</td>
		<td>Returns feeds containing datastreams with units specified by the search query.</td>
		<td><a class="reference external" href="http://api.cosm.com/v2/feeds.xml?units=celsius">http://api.cosm.com/v2/feeds.xml?units=celsius</a></td>
		</tr>
		<tr><td>status</td>
		<td>Possible values ('live', 'frozen', or 'all'). Whether to search for only live feeds, only
		frozen feeds, or all feeds. Defaults to all.</td>
		<td><a class="reference external" href="http://api.cosm.com/v2/feeds.xml?status=frozen">http://api.cosm.com/v2/feeds.xml?status=frozen</a></td>
		</tr>
		<tr><td>order</td>
		<td>Order of returned feeds. Possible values ('created_at', 'retrieved_at', or 'relevance').</td>
		<td><a class="reference external" href="http://api.cosm.com/v2/feeds.xml?order=created_at">http://api.cosm.com/v2/feeds.xml?order=created_at</a></td>
		</tr>
		<tr><td>show_user</td>
		<td>Include user login and user level for each feed. Possible values: true, false (default)</td>
		<td><a class="reference external" href="http://api.cosm.com/v2/feeds.xml?show_user=true">http://api.cosm.com/v2/feeds.xml?show_user=true</a></td>
		</tr>
		</tbody>
		</table>
		
	 * @param feed feed
	 * @param eeml {@link EemlType} elem
	 * @param apiKey API KEY frm Cosm
	 * 
	 * @return {@link CosmCmd} to be triggered 
	 */
	public CosmCmd buildListFeedRequest(String feed, String apiKey, List<Property> properties) {
		return buildCosmRequest(HttpMethod.GET, feed, "", FeedKind.JSON, null, properties, apiKey);
	}
	
	//
	//
	// DATAPOINTS 
	//
	//
	public CosmCmd buildViewFeedRequest(String feed, String apiKey) {
		return buildCosmRequest(HttpMethod.GET, feed, "", FeedKind.JSON, null, new ArrayList<Property>(), apiKey);
	}
	
	/**
		<table class="docutils" border="1">
		<colgroup>
		<col width="7%">
		<col width="51%">
		<col width="41%">
		</colgroup>
		<thead valign="bottom">
		<tr><th class="head">Parameter</th>
		<th class="head">Description</th>
		<th class="head">Example</th>
		</tr>
		</thead>
		<tbody valign="top">
		<tr><td>datastreams</td>
		<td>Filter the returned datastreams. Comma separated datastream IDs.</td>
		<td><a class="reference external" href="http://api.cosm.com/v2/feeds/123.json?datastreams=energy,power">http://api.cosm.com/v2/feeds/123.json?datastreams=energy,power</a></td>
		</tr>
		<tr><td>show_user</td>
		<td>Include user login for each feed. Possible values: true, false (default).</td>
		<td><a class="reference external" href="http://api.cosm.com/v2/feeds/123.xml?show_user=true">http://api.cosm.com/v2/feeds/123.xml?show_user=true</a> (json/xml only)</td>
		</tr>
		</tbody>
		</table>	 
	 * 
	 * @param feed feed
	 * @param apiKey key
	 * @param properties properties
	 * 
	 * @return {@link CosmCmd} command to be triggered
	 */
	public CosmCmd buildViewFeedRequest(String feed, String apiKey, List<Property> properties) {
		return buildCosmRequest(HttpMethod.GET, feed, "", FeedKind.JSON, null, properties, apiKey);
	}
	public CosmCmd buildDeleteFeedRequest(String feed, String apiKey) {
		return buildCosmRequest(HttpMethod.DELETE, feed, "", FeedKind.JSON, null, new ArrayList<Property>(), apiKey);
	}
	public CosmCmd buildDeleteFeedRequest(String feed, String apiKey, List<Property> properties) {
		return buildCosmRequest(HttpMethod.DELETE, feed, "", FeedKind.JSON, null, properties, apiKey);
	}
	
	//
	//
	// DATASTREAMS
	//
	//
	
	public CosmCmd buildCosmRequest(HttpMethod method, String feed, String datastream, FeedKind kind, EemlType eeml, List<Property> properties,  String apiKey) {
		return buildCosmRequest(method, feed, datastream, "?", Version.V2, kind, eeml, properties, apiKey);
	}
	
	public CosmCmd buildCosmRequest(HttpMethod method, String feed, String datastream, String command, Version ver, FeedKind kind, EemlType eeml, List<Property> properties,  String apiKey) {
		EzpachubeFactory factory = EzpachubeFactory.eINSTANCE;
		
		CosmCmd cmd = factory.createCosmCmd();
		
		cmd.setMethod(method);
		cmd.getProperties().addAll(properties);
		if (eeml != null) {
			cmd.setEeml(eeml);
		}
		cmd.setCommand(command);
		cmd.setVersion(ver);
		cmd.setAccess(PACHUBE_ACCESS.PACHUBE_HTTP);
		cmd.setFeed(feed);
		cmd.setDatastream(datastream);
		cmd.setFeedKind(kind);
		
		cmd.getProperties().add(PachubeUtils.INSTANCE.createProperty("key", apiKey));

		return cmd;
	}
	
	public Property createProperty(String key, String... value) {
		Property property = HttpcmdFactory.eINSTANCE.createProperty();
		property.setKey(key);
		String pValues = "";
		for (String v : value) {
			pValues += v + ",";
		}
		property.setValue(pValues.substring(0, pValues.length()-1));
		return property;
	}
	
	public Cmd createFeed(EnvironmentType envType, String apiKey) {
		
		EemlType eemlType = _5Factory.eINSTANCE.createEemlType();
		
		eemlType.setVersion(VersionType._051);
		eemlType.getEnvironment().add(envType);
		
		List<Property> properties = new ArrayList<Property>();
		properties.add(createProperty(HttpMethod.POST.getLiteral(), dumpEemlEnvironementAsXML(eemlType)));
		return buildCosmRequest(
			HttpMethod.POST, 
			"", 
			"", 
			"?", 
			Version.V2, 
			FeedKind.EEML, 
			eemlType, 
			properties, 
			apiKey
		);
	}
	
	public EnvironmentType createEemlFromOSC(EZMojoNode node) {
		EnvironmentType env = _5Factory.eINSTANCE.createEnvironmentType();
		env.setDescription("");
		env.setCreator("");
		env.setFeed("");
		
		if (node instanceof EZMojoNode) {
			List<OSCMessage> addresses = EzMojoCmdUtils.INSTANCE.getOSCMessagesFromEzMojoNode(node);
			for (OSCPacket p : addresses) {
				if (p instanceof OSCMessage) {
					env.getData().addAll(createDataTypeFromOSC((OSCMessage)p));
				}
			}
		}
		return env;
	}
	
	public List<DataType> createDataTypeFromOSC(OSCMessage... messages) {
		List<DataType> dataTypes = new ArrayList<DataType>();
		
		for (OSCMessage m : messages) {
			int idx = 0;
			for (Object o : m.getArguments()) {
				DataType dt = _5Factory.eINSTANCE.createDataType();
				dt.setId(m.getAddress() + "_" + idx);
				idx++;
				
			    XMLGregorianCalendar cv = new XMLCalendar(new Date(), XMLCalendar.DATE).normalize();
				
				CurrentValueType cvt = _5Factory.eINSTANCE.createCurrentValueType();

				cvt.setValue(o.toString());
				cvt.setAt(cv);
				
				dt.setCurrentValue(cvt);
			}
		}
		return dataTypes;
	}
}
