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

package net.sf.smbt.pachube.utils;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import net.sf.smbt.comm.http.io.HttpCommunicator;
import net.sf.smbt.comm.httpcmd.HttpCommCmd;
import net.sf.smbt.comm.httpcmd.HttpMethod;
import net.sf.smbt.comm.httpcmd.Property;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.Event;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.eclipse.core.runtime.Platform;


public class CosmHttpCommunicator extends HttpCommunicator {
    protected DataInputStream in;
    
    private int response_code;
    private String response_message;
    private byte[] data;
    

    protected int access_index;
	
    public CosmHttpCommunicator() {
    	properties = new HashMap<String, String>();
    }
    
	public void init(String pipeID, String portID, int[] acceptedPorts) {
		this.pipeID = pipeID;
		this.portID = portID;
		this.acceptedPorts = acceptedPorts;
	}
	@Override
	public void get(Event event) {
		doHttp(event);
	}
	String postData = "";
	HttpURLConnection httpc;
	private synchronized void doHttp(final Event evt) {
		if (evt != null && evt.getQx() != null && evt.getQx().getEngine() != null) {

			try {
				String command = "";
				final CmdPipe pipe = evt.getQx().getEngine();
				synchronized (pipe.getOutputInterpreter()) {
					pipe.getPort().getChannel().setLastFrame(data);
					properties.clear();
					if (evt.getCmd() instanceof HttpCommCmd) {
						HttpCommCmd cmd = (HttpCommCmd) evt.getCmd();
						command = new String(pipe.getOutputInterpreter().cmd2ByteArray(cmd));
						String url = portID + command;
						if (Platform.inDebugMode()) {
							System.out.println("Http : " + url);
						}
						
						setMethod(HttpMethod.GET.getLiteral());
						setMethod(cmd.getMethod() == null ? HttpMethod.GET.getLiteral() : cmd.getMethod().getLiteral());
						
						Property postProperty = null;
						for (Property p : cmd.getProperties()) {
							if (p.getKey().equals(HttpMethod.POST.getLiteral())) {
								postProperty = p;
							}
						}
						if (postProperty != null) {
							postData = postProperty.getValue();

							cmd.getProperties().remove(postProperty);
						}
						for (Property p : cmd.getProperties()) {
							properties.put(p.getKey(), p.getValue());
						}
					}
					
					if (getMethod().equals(HttpMethod.GET.getLiteral())) {
						URL url = null;
					    try {
					    	String query = portID + "/" + command + getQueryArguments();
					        url = new URL(query);
					        
					        httpc = (HttpURLConnection) url.openConnection();
					        
					        if (httpc != null) {
					        	if (method != null) {
					        		try {
					        			httpc.setRequestMethod(method);
					        		} catch (Exception e) {
					        			e.printStackTrace();
					        			System.out.println(method + " : bad method connection !");
					        		}
					        	}
					        }
					        
					        if (Platform.inDebugMode()) {
						        System.out.println(httpc);
					        }
					        try {
					        	httpc.connect();
					        } catch (Exception e) {
					        	e.printStackTrace();
					        }
					        response_code = httpc.getResponseCode();
					        if (!(response_code == HttpURLConnection.HTTP_OK)
					                && !(response_code == HttpURLConnection.HTTP_PARTIAL)) {
					            response_message = httpc.getResponseMessage();
					            if (response_code == HttpURLConnection.HTTP_UNAUTHORIZED) {
					                System.out.println(portID
					                        + " requires password!\n"+response_message);
					                }
					            }
					    } catch (MalformedURLException e) {
					        e.printStackTrace();
					        System.out.println("Malformed URL");
							pipe.getPort().getChannel().setLastFrame(null);
					    } catch (IOException ioe) {
					        ioe.printStackTrace();
							pipe.getPort().getChannel().setLastFrame(null);
					    }
					    
					    in = new DataInputStream(httpc.getInputStream());
					    int len = httpc.getContentLength();
					    if (len == -1) {
					        return;
					    }
					    data = new byte[len];
					    in.readFully(data);
			
					    pipe.receive(data);
							
						pipe.getPort().getChannel().setLastFrame(data);
			
			            httpc.disconnect();
					} else if (getMethod().equals(HttpMethod.POST.getLiteral())) {
				    	String query = portID + "/" + command;
				    	query.replace("?", "");

						boolean verbose = true;
						boolean requestFailed = false;

						HttpResponse response;
				    	HttpEntity entity;

				    	StringEntity myData = new StringEntity(postData.toString());
				    	myData.setChunked(false);
				    	
						HttpClient httpclient = new DefaultHttpClient();
						HttpPost httpput = new HttpPost(query);
						if (properties.containsKey("key")) {
							httpput.setHeader("X-ApiKey", properties.get("key"));
						}
						httpput.setHeader("Accepts", "application/xml");
						httpput.setHeader("Content-Type", "application/xml");
						httpput.setHeader("Host", "api.cosm.com");
						httpput.setHeader("Version", "HTTP/1.1");
						
						httpput.setEntity(myData);

						try {
							if (verbose) {
								System.out.println("-------- open cosmic connection --------");
								System.out.println("executing request: " + httpput.getURI());
								System.out.println("data to send: " + postData);
								System.out.println("using ApiKey: " + properties.get("key"));
							}
							
							response = httpclient.execute(httpput); // execute this mother
							entity = response.getEntity();
							
							String cosmResponse = "";
							String statusLine = response.getStatusLine().toString() + "\n";
							String delims = "[ ]+";
							String[] tokens = statusLine.split(delims);

							if (tokens[1].equals("200")) { // success
								System.out.println("\nserver response:");
								System.out.println(statusLine);
								cosmResponse = EntityUtils.toString(entity);
							} else { // bad request
								System.out.println("\nCosm says bad request. status code: \n");
								System.out.println(statusLine);
								System.out.println("check the HTTP status codes at http://cosm.com/docs/v2/\n");
								cosmResponse = EntityUtils.toString(entity) + "\n\n";
								Header[] respHeader;
								respHeader = response.getAllHeaders();
								for (int i = 0; i < respHeader.length; i++) {
									cosmResponse += respHeader[i].toString() + "\n";
								}
								if (verbose)
									System.out.print(cosmResponse);
									requestFailed = true;
									// "***failed request***";
								}
							} catch (IOException e) {
								e.printStackTrace();
							} finally {
								// shut down the connection manager to ensure
								// immediate deallocation of all system resources
								httpclient.getConnectionManager().shutdown();
								if (verbose) {
									System.out.println("----------- connection closed ----------\n");
								}
							}
					} else if (getMethod().equals(HttpMethod.PUT.getLiteral())) {
				    	String query = portID + "/" + command + getQueryArguments();

						boolean verbose = true;
						boolean requestFailed = false;

						HttpResponse response;
				    	HttpEntity entity;

				    	StringEntity myData = new StringEntity(postData.toString());
				    	myData.setChunked(false);
				    	
						HttpClient httpclient = new DefaultHttpClient();
						HttpPut httpput = new HttpPut(query);
						if (properties.containsKey("key")) {
							httpput.setHeader("X-ApiKey", properties.get("key"));
						}
						httpput.setHeader("Accepts", "application/xml");
						httpput.setHeader("Content-Type", "application/xml");
						httpput.setHeader("Host", "api.cosm.com");
						httpput.setHeader("Version", "HTTP/1.1");
						
						httpput.setEntity(myData);

						try {
							if (verbose) {
								System.out.println("-------- open cosmic connection --------");
								System.out.println("executing request: " + httpput.getURI());
								System.out.println("data to send: " + postData);
								System.out.println("using ApiKey: " + properties.get("key"));
							}
							
							response = httpclient.execute(httpput); // execute this mother
							entity = response.getEntity();
							
							String cosmResponse = "";
							String statusLine = response.getStatusLine().toString() + "\n";
							String delims = "[ ]+";
							String[] tokens = statusLine.split(delims);

							if (tokens[1].equals("200")) { // success
								System.out.println("\nserver response:");
								System.out.println(statusLine);
								cosmResponse = EntityUtils.toString(entity);
							} else { // bad request
								System.out.println("\nCosm says bad request. status code: \n");
								System.out.println(statusLine);
								System.out.println("check the HTTP status codes at http://cosm.com/docs/v2/\n");
								cosmResponse = EntityUtils.toString(entity) + "\n\n";
								Header[] respHeader;
								respHeader = response.getAllHeaders();
								for (int i = 0; i < respHeader.length; i++) {
									cosmResponse += respHeader[i].toString() + "\n";
								}
								if (verbose)
									System.out.print(cosmResponse);
									requestFailed = true;
									// "***failed request***";
								}
							} catch (IOException e) {
								e.printStackTrace();
							} finally {
								// shut down the connection manager to ensure
								// immediate deallocation of all system resources
								httpclient.getConnectionManager().shutdown();
								if (verbose) {
									System.out.println("----------- connection closed ----------\n");
								}
							}
					} else if (getMethod().equals(HttpMethod.DELETE.getLiteral())) {
				    	String query = portID + "/" + command + getQueryArguments();

						boolean verbose = true;
						boolean requestFailed = false;

						HttpResponse response;
				    	HttpEntity entity;

						HttpClient httpclient = new DefaultHttpClient();
						HttpDelete httpput = new HttpDelete(query);
						if (properties.containsKey("key")) {
							httpput.setHeader("X-ApiKey", properties.get("key"));
						}
						httpput.setHeader("Accepts", "application/xml");
						httpput.setHeader("Content-Type", "application/xml");
						httpput.setHeader("Host", "api.cosm.com");
						httpput.setHeader("Version", "HTTP/1.1");
						

						try {
							if (verbose) {
								System.out.println("-------- open cosmic connection --------");
								System.out.println("executing request: " + httpput.getURI());
								System.out.println("data to send: " + postData);
								System.out.println("using ApiKey: " + properties.get("key"));
							}
							
							response = httpclient.execute(httpput); // execute this mother
							entity = response.getEntity();
							
							String cosmResponse = "";
							String statusLine = response.getStatusLine().toString() + "\n";
							String delims = "[ ]+";
							String[] tokens = statusLine.split(delims);

							if (tokens[1].equals("200")) { // success
								System.out.println("\nserver response:");
								System.out.println(statusLine);
								cosmResponse = EntityUtils.toString(entity);
							} else { // bad request
								System.out.println("\nCosm says bad request. status code: \n");
								System.out.println(statusLine);
								System.out.println("check the HTTP status codes at http://cosm.com/docs/v2/\n");
								cosmResponse = EntityUtils.toString(entity) + "\n\n";
								Header[] respHeader;
								respHeader = response.getAllHeaders();
								for (int i = 0; i < respHeader.length; i++) {
									cosmResponse += respHeader[i].toString() + "\n";
								}
								if (verbose)
									System.out.print(cosmResponse);
									requestFailed = true;
									// "***failed request***";
								}
							} catch (IOException e) {
								e.printStackTrace();
							} finally {
								// shut down the connection manager to ensure
								// immediate deallocation of all system resources
								httpclient.getConnectionManager().shutdown();
								if (verbose) {
									System.out.println("----------- connection closed ----------\n");
								}
							}
					}
		                
		            properties.clear();
		
				}
			} catch (java.net.SocketException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private String getQueryArguments() {
		if (properties.isEmpty()) {
			return "";
		} else {
			String q = "";
			for (String k : properties.keySet()) {
				q += k + "=" + properties.get(k) + "&";
			}
			return q.substring(0, q.length()-1);
		}
	}
	
	public void close() {
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		httpc.disconnect();
	}
}
