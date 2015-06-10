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

package net.sf.smbt.ui.wizards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.ui.Activator;

import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.jface.bindings.keys.ParseException;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.fieldassist.SimpleContentProposalProvider;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;

public class IPCommPipeConnectionWizardPage extends WizardPage {
	
	/**
	 * List height in characters.
	 */
	@SuppressWarnings("unused")
	private final static int LIST_HEIGHT = 10;

	/**
	 * List width in characters.
	 */
	@SuppressWarnings("unused")
	private final static int LIST_WIDTH = 20;
	
	private final static String USAGE_MSG = "Configure IP : [192.168.0.10:3455] + [] for OUT or [localhost] + [7645] for IN";

	protected Text ipAddrText, ingoingPortText;
	
	private ControlDecoration decIPAddr, decInPort;
	private ContentProposalAdapter adapterIPAddr, adapterInPort;
	private FieldDecoration infoFieldIndicator, errorFieldIndicator;
	
	private List<String> lastTenIPAddresses, lastTenInputPorts;
	
	public String getIpAddr() {
		boolean valid = new IPAddressValidator().validate();
		return valid ? ipAddrText.getText() : "localhost:1234";
	}
	
	
	
	public int[] getIngoingPortsAtomic() {
		int[] ports = new int[]{};
		if (ingoingPortText != null) {
			try {
				ports = new int[]{Integer.parseInt(ingoingPortText.getText())};
			} catch(NumberFormatException nfe) {
				//
			}
		}
		return ports;
	}

	public List<Integer> getIngoingPorts() {
		int p[] = getIngoingPortsAtomic();
		if (p.length > 0 ) {
			return Arrays.asList(new Integer(p[0]));
		}
		return new ArrayList<Integer>();
	}

	public class IPAddressValidator{
	    private Pattern pattern;
	    private Matcher matcher;
	 
	    private static final String IPADDRESS_PATTERN = 
			"^(localhost|([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5]))(\\:\\d\\d\\d?\\d?)?$";
	 
	    public IPAddressValidator(){
		  pattern = Pattern.compile(IPADDRESS_PATTERN);
	    }
	 
	    public boolean validate(){
	      String ip = ipAddrText.getText(); 
	      ip = ip == null ? "" : ip.toLowerCase();
	      ip = ip.trim();
		  matcher = pattern.matcher(ip);
		  boolean addrOK = matcher.matches();;
		  setErrorMessage(null);
		  if (decIPAddr != null) {
			  if (addrOK) {
				  decIPAddr.hide();
				  decIPAddr.setImage(infoFieldIndicator.getImage());
				  setErrorMessage(null);
				  setMessage(USAGE_MSG);
			  } else {
				  decIPAddr.show();
				  decIPAddr.setImage(errorFieldIndicator.getImage());
				  setErrorMessage("Invalid IP address format" + "\n" + USAGE_MSG);
			  }
		  }
		  boolean portOK = true;
		  if (ingoingPortText.getText().equals("") && !addrOK) {
			  decInPort.hide();
			  decInPort.setImage(infoFieldIndicator.getImage());
			  setErrorMessage(null);
			  setMessage(USAGE_MSG);
			  portOK = false;
		  } else if (!getIngoingPorts().isEmpty()) {
			  int port = getIngoingPorts().get(0);
			  if (port>0) {
				  decInPort.hide();
				  decInPort.setImage(infoFieldIndicator.getImage());
				  setErrorMessage(null);
				  setMessage(USAGE_MSG);
			  } else {
				  decInPort.show();
				  decInPort.setImage(errorFieldIndicator.getImage());
				  setErrorMessage("Invalid input port" + "\n" + USAGE_MSG);
				  portOK = false;
			  }
		  }
		  boolean status = addrOK && portOK; 
		  if (!ip.contains(":")) {
			  if (getIngoingPorts().isEmpty()) {
				  decInPort.show();
				  setErrorMessage("No port selected, neither in or out" + "\n" + USAGE_MSG);
				  status = false;
			  } else {
				  if ((getIngoingPorts().get(0) + "").length() < 2) {
					  decInPort.show();
					  setErrorMessage("One digit port are invalid" + "\n" + USAGE_MSG);
					  status = false;
				  }
			  }
		  }
		  if (!getIngoingPorts().isEmpty()) {
			  int port = getIngoingPorts().get(0);
			  if (port>0) {
				  if (!(ip.equals("localhost") || ip.equals("127.0.0.1"))) {
					  status = false;
					  decIPAddr.show();
					  decIPAddr.setImage(errorFieldIndicator.getImage());
					  setErrorMessage("Only localhost or 127.0.0.1 allowed in case of input port creation" + "\n" + USAGE_MSG);
				  }
			  }
		  }
		  return status; 	    	    
	    }
	}
	public IPCommPipeConnectionWizardPage() {
		super("IP Config");
		
		lastTenInputPorts = new ArrayList<String>(10);
		lastTenIPAddresses = new ArrayList<String>(10);
		
	    setTitle("Configure TCP/IP");
	    setMessage("Configure a TCP/IP connectivity w/ ingoing or outgoing ports");
	}

 
    @Override
	public void createControl(Composite parent) {
    	loadIpAddresseSettings();
    	
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(GridLayoutFactory.fillDefaults().create());
		container.setLayoutData(GridDataFactory.fillDefaults().create());
		
		Composite ipBox = new Composite(container, SWT.NONE);
		ipBox.setLayout(GridLayoutFactory.fillDefaults().numColumns(4).create());
		ipBox.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		
		Label ipAddrLabel = new Label(ipBox, SWT.NONE);
		ipAddrLabel.setText("Output IP :");
		ipAddrLabel.setLayoutData(GridDataFactory.swtDefaults().grab(false, false).create());
		
		ipAddrText = new Text(ipBox, SWT.BORDER);
		ipAddrText.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		ipAddrText.setText("localhost");
		ipAddrText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				try {
					getWizard().getContainer().updateButtons();
				} catch (Throwable t) {
					t.printStackTrace();
				}
			}
		});
		
		// Create a control decoration to indicate an error.
		decIPAddr = new ControlDecoration(ipAddrText, SWT.TOP | SWT.LEFT);
		infoFieldIndicator = FieldDecorationRegistry.getDefault().
				   getFieldDecoration(FieldDecorationRegistry.DEC_CONTENT_PROPOSAL);
		errorFieldIndicator = FieldDecorationRegistry.getDefault().
				   getFieldDecoration(FieldDecorationRegistry.DEC_ERROR);
		decIPAddr.setImage(infoFieldIndicator.getImage());
		decIPAddr.setDescriptionText(infoFieldIndicator.getDescription());
		
		KeyStroke keyStroke = null;
		try {
			keyStroke = KeyStroke.getInstance("Ctrl+Space");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		List<String> ipProposals = new ArrayList<String>();
		for (String lastIp : lastTenIPAddresses) {
			if (!ipProposals.contains(lastIp)) {
				ipProposals.add(lastIp);
			}
		}
		for (String liveIp : QuanticMojo.INSTANCE.getLiveIpAddresses()) {
			if (!ipProposals.contains(liveIp)) {
				ipProposals.add(liveIp);
			}
		}
		// assume that myTextControl has already been created in some way
		adapterIPAddr = new ContentProposalAdapter(
			ipAddrText, new TextContentAdapter(), 
			new SimpleContentProposalProvider(
				getFilteredResults(
					ipAddrText.getText(), 
					ipProposals
				)
			),
			keyStroke, null);
		adapterIPAddr.setProposalAcceptanceStyle(ContentProposalAdapter.PROPOSAL_REPLACE);
		

	    //
		//
		// INGOING STUFF
		//
		//
		
		
		Label ingoingPortsLabel = new Label(ipBox, SWT.NONE);
		ingoingPortsLabel.setText("Input port :");
		ingoingPortsLabel.setLayoutData(GridDataFactory.fillDefaults().grab(false, false).create());
		
		ingoingPortText = new Text(ipBox, SWT.BORDER);
		ingoingPortText.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		ingoingPortText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				try {
					getWizard().getContainer().updateButtons();
				} catch (Throwable t) {
					t.printStackTrace();
				}
			}
		});

		// Create a control decoration to indicate an error.
		decInPort = new ControlDecoration(ingoingPortText, SWT.TOP | SWT.LEFT);
		decInPort.setImage(infoFieldIndicator.getImage());
		decInPort.setDescriptionText(infoFieldIndicator.getDescription());
		
		List<String> portsProposals = new ArrayList<String>();
		for (String lastInput : lastTenInputPorts) {
			if (!portsProposals.contains(lastInput)) {
				portsProposals.add(lastInput);
			}
		}
		for (String livePort : QuanticMojo.INSTANCE.getLiveIpIngoingPorts()) {
			if (!portsProposals.contains(livePort)) {
				portsProposals.add(livePort);
			}
		}

		adapterInPort = new ContentProposalAdapter(
			ingoingPortText, new TextContentAdapter(), 
			new SimpleContentProposalProvider(
				getFilteredResults(
					ingoingPortText.getText(), 
					portsProposals
				)
			),
			keyStroke, null);
		adapterInPort.setProposalAcceptanceStyle(ContentProposalAdapter.PROPOSAL_REPLACE);

		setControl(container);
		
		getControl().addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent e) {
				storeConsolePageSettings();
			}
		});
		
		PlatformUI.getWorkbench().getHelpSystem().setHelp(getControl(), "net.sf.smbt.doc.comm_ip_context"); // NEW
	}
    
    
	public final static String IP_SECTION_DIALOG_SETTINGS_ID	= "net.sf.smbt.ui.dialogs";
	public final static String IP_ADDRESSES_CONFIGS_ID			= "net.sf.smbt.ui.dialogs.ip.addresses";
	public final static String INPUT_PORTS_CONFIGS_ID			= "net.sf.smbt.ui.dialogs.ip.input.ports";
	
	private void storeConsolePageSettings() {
		IDialogSettings settings = Activator.getDefault().getDialogSettings();
		IDialogSettings consolePageDialogSettings;
		if ((consolePageDialogSettings = settings.getSection(IP_SECTION_DIALOG_SETTINGS_ID))==null) {
			consolePageDialogSettings = settings.addNewSection(IP_SECTION_DIALOG_SETTINGS_ID);
		}
		
		boolean canStoreSettings = new IPAddressValidator().validate();
		if (canStoreSettings) {
		
			if (!lastTenIPAddresses.contains(ipAddrText.getText())) {
				List<String> ipAddressesToStore = new ArrayList<String>();
				if (lastTenIPAddresses.size() > 10) {
					lastTenIPAddresses = lastTenIPAddresses.subList(0, 9);
				}
				ipAddressesToStore.add(ipAddrText.getText());
				ipAddressesToStore.addAll(lastTenIPAddresses);
				
				consolePageDialogSettings.put(IP_ADDRESSES_CONFIGS_ID, ipAddressesToStore.toArray(new String[0]));
			}
			if (!lastTenInputPorts.contains(ingoingPortText.getText())) {
				List<String> inputPortsToStore = new ArrayList<String>();
				if (lastTenInputPorts.size() > 10) {
					lastTenInputPorts = lastTenInputPorts.subList(0, 9);
				}
				inputPortsToStore.add(ingoingPortText.getText());
				inputPortsToStore.addAll(lastTenInputPorts);
				
				consolePageDialogSettings.put(INPUT_PORTS_CONFIGS_ID, inputPortsToStore.toArray(new String[0]));
			}
		}
	}
	
	private void loadIpAddresseSettings() {
		IDialogSettings settings = Activator.getDefault().getDialogSettings();
		IDialogSettings consolePageDialogSettings;
		if ((consolePageDialogSettings = settings.getSection(IP_SECTION_DIALOG_SETTINGS_ID))==null) {
			consolePageDialogSettings = settings.addNewSection(IP_SECTION_DIALOG_SETTINGS_ID);
		}
		String[] ipAddrLst = consolePageDialogSettings.getArray(IP_ADDRESSES_CONFIGS_ID);
		lastTenIPAddresses = ipAddrLst == null ? new ArrayList<String>() : Arrays.asList(ipAddrLst);

		String[] inputPortsLst = consolePageDialogSettings.getArray(INPUT_PORTS_CONFIGS_ID);
		lastTenInputPorts = inputPortsLst == null ? new ArrayList<String>() : Arrays.asList(inputPortsLst);
	}

    private String[] getFilteredResults(String prefix, List<String> elements) {
    	if (prefix == null || prefix.equals("")) {
    		return elements.toArray(new String[0]);
    	}
    	List<String> results = new ArrayList<String>();
    	List<String> bottom = new ArrayList<String>();
    	for (String e : elements) {
    		if (e.startsWith(prefix)) {
    			results.add(e);
    		} else {
    			bottom.add(e);
    		}
    	}
    	results.add("--------------------");
    	results.addAll(bottom);
    	return results.toArray(new String[0]);
    }

	@Override
	public boolean canFlipToNextPage() {
		return false;
	}
	
	@Override
	public boolean isPageComplete() {
		boolean ipValid = new IPAddressValidator().validate();
		return super.isPageComplete() && ipValid;
	}
	
}
