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

package net.sf.smbt.ui.widgets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.ui.Activator;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.jface.action.ControlContribution;
import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.jface.bindings.keys.ParseException;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.fieldassist.SimpleContentProposalProvider;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

public class ToolbarComboRcv extends ControlContribution
{	
	private Label label;
	private CCombo ingoingPortText;
	private ContentProposalAdapter adapterInPort;
	private List<String> lastTenInputPorts;
	@SuppressWarnings("unused")
	private FieldDecoration infoFieldIndicator, errorFieldIndicator;

	public class IPAddressValidator{
	    @SuppressWarnings("unused")
		private Pattern pattern;
	    @SuppressWarnings("unused")
		private Matcher matcher;
	 
	    private static final String IPADDRESS_PATTERN = 
			"^(localhost|([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5]))(\\:\\d\\d\\d?\\d?)?$";
	 
	    public IPAddressValidator(){
		  pattern = Pattern.compile(IPADDRESS_PATTERN);
	    }
	 
		public List<Integer> getIngoingPorts() {
			int p[] = getIngoingPortsAtomic();
			if (p.length > 0 ) {
				return Arrays.asList(new Integer(p[0]));
			}
			return new ArrayList<Integer>();
		}

		public int[] getIngoingPortsAtomic() {
			int[] ports = new int[]{};
			try {
				ports = new int[]{Integer.parseInt(ingoingPortText.getText())};
			} catch(NumberFormatException nfe) {
				//
			}
			return ports;
		}

	    public boolean validate(){
		  boolean portOK = true;
		  if (ingoingPortText.getText().equals("")) {
			  //setErrorMessage(null);
			  //setMessage(USAGE_MSG);
			  portOK = false;
		  } else if (!getIngoingPorts().isEmpty()) {
			  int port = getIngoingPorts().get(0);
			  if (port>0) {
				  //setErrorMessage(null);
				  //setMessage(USAGE_MSG);
			  } else {
				  //setErrorMessage("Invalid input port");
				  portOK = false;
			  }
		  }
		  return portOK; 	    	    
	    }
	}
		
	public ToolbarComboRcv(String str) {
		super(str);	
	}
	
	@Override
	protected Control createControl(Composite parent) {
//		Composite box = new Composite(parent, SWT.NONE);
//		box.setLayout(GridLayoutFactory.swtDefaults().create());
//		box.setLayoutData(GridDataFactory.swtDefaults().hint(140, 25).create());
		
//		org.eclipse.swt.widgets.Label listen = new org.eclipse.swt.widgets.Label(box, SWT.NONE);
//		listen.setText("Listen :");
//		listen.setLayoutData(GridDataFactory.swtDefaults().align(SWT.END, SWT.CENTER).create());
		
		List<String> ports = new ArrayList<String>(10);
		
		lastTenInputPorts = new ArrayList<String>(10);
		for (String ip : lastTenInputPorts) {
			int p = -1;
			try {
				p = Integer.parseInt(ip);
			} catch(Exception e) {
				//
			}
			if (p > 0) {
				ports.add("" + p);
			}
		}
		loadIpAddresseSettings();

		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).equalWidth(false).create());
		container.setLayoutData(GridDataFactory.fillDefaults().grab(false, false).align(SWT.END, SWT.CENTER).create());
		
		label = new Label(container, SWT.NONE);
		label.setText("OUT");
		label.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).create());
		
		ingoingPortText = new CCombo(container, SWT.BORDER);
		ingoingPortText.setLayoutData(GridDataFactory.fillDefaults().hint(48, 18).align(SWT.END, SWT.CENTER).create());
		ingoingPortText.setItems(ports.isEmpty() ? new String[0] : lastTenInputPorts.toArray(new String[0]));
		
		infoFieldIndicator = FieldDecorationRegistry.getDefault().
				   getFieldDecoration(FieldDecorationRegistry.DEC_CONTENT_PROPOSAL);
		errorFieldIndicator = FieldDecorationRegistry.getDefault().
				   getFieldDecoration(FieldDecorationRegistry.DEC_ERROR);

		// Create a control decoration to indicate an error.
		
		ingoingPortText.addKeyListener(new KeyListener() {
			@Override
			public void keyReleased(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR && new IPAddressValidator().validate()) {
					String port = ingoingPortText.getText();
					CmdPipe pipe = QuanticMojo.INSTANCE.openUdpPipe("osc", "localhost:"+Integer.parseInt(port));
					ingoingPortText.setText("");
					storeConsolePageSettings();
				}
			}
		});
		
		
		KeyStroke keyStroke = null;
		try {
			keyStroke = KeyStroke.getInstance("Ctrl+Space");
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
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
			keyStroke, 
			null
		);
		
		adapterInPort.setProposalAcceptanceStyle(ContentProposalAdapter.PROPOSAL_REPLACE);

		ingoingPortText.addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent e) {
				storeConsolePageSettings();
			}
		});
		
		return container;
	}
	
	
	public final static String IP_SECTION_DIALOG_SETTINGS_ID = "net.sf.smbt.ui.dialogs";
	public final static String IP_ADDRESSES_CONFIGS_ID = "net.sf.smbt.ui.dialogs.ip.addresses";
	public final static String INPUT_PORTS_CONFIGS_ID = "net.sf.smbt.ui.dialogs.ip.input.ports";
	
	private void storeConsolePageSettings() {
		IDialogSettings settings = Activator.getDefault().getDialogSettings();
		IDialogSettings consolePageDialogSettings;
		if ((consolePageDialogSettings = settings.getSection(IP_SECTION_DIALOG_SETTINGS_ID))==null) {
			consolePageDialogSettings = settings.addNewSection(IP_SECTION_DIALOG_SETTINGS_ID);
		}
		
		boolean canStoreSettings = new IPAddressValidator().validate();
		if (canStoreSettings) {
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

	
        // TRY to set the width I want... not working!
	protected int computeWidth(Control control) {
		return control.computeSize(100, 35, true).x;
	}
}