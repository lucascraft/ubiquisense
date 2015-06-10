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

//import gnu.io.CommPortIdentifier;

import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import net.sf.smbt.ui.Activator;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.PlatformUI;

public class USBCommPipeConnectionWizardPage extends WizardPage {
	private String config;
	private int speed, mandatorySpeed, dataBit, stopBit, parity, flowControl;
	private boolean complete;
	private Button showAllChecbox;
	private boolean showAll;
	
	/**
	 * List height in characters.
	 */
	private final static int LIST_HEIGHT = 65;

	/**
	 * List width in characters.
	 */
	private final static int LIST_WIDTH = 20;
	
	private Integer[] usbSpeeds = new Integer[] {
		300, 
		1200, 
		2400, 
		4800, 
		9600, 
		14400, 
		19200, 
		28800, 
		38400, 
		57600, 
		115200
	};
	
	private Integer[] dataBits = new Integer[] {
		new Integer(SerialPort.DATABITS_8),
		new Integer(SerialPort.DATABITS_7),
		new Integer(SerialPort.DATABITS_6),
		new Integer(SerialPort.DATABITS_5)
	};
	
	private Integer[] stopBits = new Integer[] {
		new Integer(SerialPort.STOPBITS_1),
		new Integer(SerialPort.STOPBITS_1_5),
		new Integer(SerialPort.STOPBITS_2)
	};
	
	private int[] parityBits = new int[] {
		SerialPort.PARITY_NONE,
		SerialPort.PARITY_EVEN,
		SerialPort.PARITY_ODD,
		SerialPort.PARITY_MARK,
		SerialPort.PARITY_SPACE
	};
	
	private String[] parityBitsLabels = new String[] {
		"None",
		"Even",
		"Odd",
		"Mark",
		"Space"
	};

	private int[] flowControlBits = new int[] {
			SerialPort.FLOWCONTROL_NONE,
			SerialPort.FLOWCONTROL_RTSCTS_IN,
			SerialPort.FLOWCONTROL_RTSCTS_OUT,
			SerialPort.FLOWCONTROL_XONXOFF_IN,
			SerialPort.FLOWCONTROL_XONXOFF_OUT
		};

	private String[] flowControlLabels = new String[]{
		"None",
		"RtsCts In",
		"RtsCts Out",
		"XonXOff In",
		"XonXOff Out"
	};
	
	public int getStopBit() {
		return stopBit;
	}
	
	public int getParity() {
		return parity;
	}
	
	public int getDataBit() {
		return dataBit;
	}
	public int getFlowControl() {
		return flowControl;
	}
	public boolean isNotifyOnDataAvailable() {
		return notifyOnDataAvailable;
	}
	public boolean isNotifyOnOutput() {
		return notifyOnOutput;
	}
	
	private int getParityFromLabel(String label) {
		if (label != null) {
			int idx = 0;
			for (String l : parityBitsLabels) {
				if (label.equals(l)) {
					return parityBits[idx];
				}
				idx++;
			}
		}
		return 0;
	}
	
	private int getFlowControlFromLabel(String label) {
		if (label != null) {
			int idx = 0;
			for (String l : flowControlLabels) {
				if (label.equals(l)) {
					return flowControlBits[idx];
				}
				idx++;
			}
		}
		return 0;
	}

	protected ListViewer usbCfgListViewer;
	protected ListViewer usbSpeedListViewer;
	protected ComboViewer dataBitsListViewer;
	protected ComboViewer stopBitsListViewer;
	protected ComboViewer parityListViewer;
	protected ComboViewer flowListViewer;
	
	boolean notifyOnOutput;
	boolean notifyOnDataAvailable;
	
	protected List<CommPortIdentifier> availableCommPortIdentifiers;
	private boolean rxtxLibGoneBad;
	
	public USBCommPipeConnectionWizardPage() {
		this(-1);
	}
	
	public USBCommPipeConnectionWizardPage(int mandatorySpeed) {
		super("USB");
		rxtxLibGoneBad = false;
		showAll = false;
	    setTitle("Select USB port connected with Device");
	    setMessage("Select USB port connected with Device");
	    
	    this.mandatorySpeed = mandatorySpeed;
	    try {
	    	availableCommPortIdentifiers = new ArrayList<CommPortIdentifier>();
		    Enumeration<?> portIdentifiers = CommPortIdentifier.getPortIdentifiers();
		    while(portIdentifiers.hasMoreElements()) {
		    	Object elem = portIdentifiers.nextElement();
		    	if (elem instanceof CommPortIdentifier) {
		    		availableCommPortIdentifiers.add((CommPortIdentifier)elem);
		    	}
		    }
	    } catch (Throwable t) {
	    	rxtxLibGoneBad = true;
	    	t.printStackTrace();
	    }
	}
	
	@Override
	public boolean isPageComplete() {
		return complete;
	}
	
	private void hidePossiblyWrongAddresses() {
		if (!availableCommPortIdentifiers.isEmpty()) {
			List<CommPortIdentifier> commPortToBeRemoved = new ArrayList<CommPortIdentifier>();
			for (CommPortIdentifier pID : availableCommPortIdentifiers) {
				if (pID.getName().contains("Wireless") || pID.getName().contains("Bluetooth") ) {
					commPortToBeRemoved.add(pID);
				}
			}
			for (CommPortIdentifier p : commPortToBeRemoved) {
				availableCommPortIdentifiers.remove(p);
			}
		    if (usbCfgListViewer != null && !usbCfgListViewer.getControl().isDisposed()) {
		    	usbCfgListViewer.refresh(true);
		    }
		}
	}

	private void showAllPossibleAddresses() {
	    try {
	    	availableCommPortIdentifiers.clear();
		    Enumeration<?> portIdentifiers = CommPortIdentifier.getPortIdentifiers();
		    while(portIdentifiers.hasMoreElements()) {
		    	Object elem = portIdentifiers.nextElement();
		    	if (elem instanceof CommPortIdentifier) {
		    		CommPortIdentifier ident = (CommPortIdentifier)elem;
		    		if (!availableCommPortIdentifiers.contains(ident)) {
		    			availableCommPortIdentifiers.add(ident);
		    		}
		    	}
		    }
	    } catch (Throwable t) {
	    	rxtxLibGoneBad = true;
	    	t.printStackTrace();
	    }
	    if (usbCfgListViewer != null && !usbCfgListViewer.getControl().isDisposed()) {
	    	usbCfgListViewer.refresh(true);
	    }
	}
	
	
	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(GridLayoutFactory.fillDefaults().create());
		composite.setLayoutData(GridDataFactory.fillDefaults().create());
	
		showAllChecbox = new Button(composite, SWT.CHECK);
		showAllChecbox.setText("Show All Possible Connections");
		showAllChecbox.addSelectionListener(
			new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					showAll = showAllChecbox.getSelection();
					if (!showAll) {
						hidePossiblyWrongAddresses();
					} else {
						showAllPossibleAddresses();
					}
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
		);
		
		loadDialogSettings();
		
		if (!showAllChecbox.getSelection()) {
			hidePossiblyWrongAddresses();
		} else {
			showAllPossibleAddresses();
		}
		
	    // Create list viewer	
	    Label usbPortAddrLabel = new Label(composite, SWT.NONE);
	    usbPortAddrLabel.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
	    usbPortAddrLabel.setText("USB Address :");

	    usbCfgListViewer = new ListViewer(composite, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
	    GridData data = new GridData(GridData.FILL_BOTH);
	    data.heightHint 	= convertHeightInCharsToPixels(LIST_HEIGHT);
	    data.widthHint 		= convertWidthInCharsToPixels(LIST_WIDTH);
	    data.minimumHeight 	= 25;
	    
	    usbCfgListViewer.getList().setLayoutData(GridDataFactory.fillDefaults().grab(true, true).hint(LIST_WIDTH, LIST_HEIGHT).minSize(SWT.DEFAULT, LIST_HEIGHT).create());
	    usbCfgListViewer.getList().setFont(parent.getFont());
	    // Set the label provider		
	    usbCfgListViewer.setLabelProvider(new LabelProvider() {
	        public String getText(Object element) {
	            // Return the features's label.
	        	if (rxtxLibGoneBad) {
	        		return null;
	        	}
	            return element == null ? "" : ((CommPortIdentifier)element).getName(); //$NON-NLS-1$
	        }
	    });

	    // Set the content provider
	    usbCfgListViewer.setContentProvider(new ArrayContentProvider());
	    usbCfgListViewer.setInput(availableCommPortIdentifiers);
	    usbCfgListViewer.addSelectionChangedListener(
	    	new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					if (event.getSelection() instanceof IStructuredSelection) {
						if (!((IStructuredSelection)event.getSelection()).isEmpty()) {
							if (!rxtxLibGoneBad) {
								config = ((CommPortIdentifier)((IStructuredSelection)event.getSelection()).getFirstElement()).getName();
								complete = true;
								if (getWizard() != null && getWizard().getContainer() != null) {
									try {
										getWizard().getContainer().updateButtons();
									} catch(Throwable t) {
										//
									}
								}
							}
						}
					}
				}
			}
	    );
	    
	    if (availableCommPortIdentifiers.size() > 0) {
	    	usbCfgListViewer.setSelection(
	    		new StructuredSelection(availableCommPortIdentifiers.get(0))
	    	);
	    	config = availableCommPortIdentifiers.get(0).getName();
	    } else {
	    	complete = false;
	    }
	    
	    Label baudRateLabel = new Label(composite, SWT.NONE);
	    baudRateLabel.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
	    baudRateLabel.setText("Baud Rate :");
	    
	    usbSpeedListViewer = new ListViewer(composite, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
	    usbSpeedListViewer.getList().setLayoutData(GridDataFactory.fillDefaults().grab(true, true).hint(LIST_WIDTH, LIST_HEIGHT).minSize(SWT.DEFAULT, LIST_HEIGHT).create());
	    usbSpeedListViewer.getList().setFont(parent.getFont());
	    // Set the label provider		
	    usbSpeedListViewer.setLabelProvider(new LabelProvider() {
	        public String getText(Object element) {
	            // Return the features's label.
	            return element == null ? "" : element.toString(); //$NON-NLS-1$
	        }
	    });
	    
	    // Set the content provider
	    usbSpeedListViewer.setContentProvider(new ArrayContentProvider());
	    usbSpeedListViewer.setInput(usbSpeeds);
	    usbSpeedListViewer.addSelectionChangedListener(
	    	new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					if (event.getSelection() instanceof IStructuredSelection) {
						if (!((IStructuredSelection)event.getSelection()).isEmpty()) {
							speed = (Integer)((IStructuredSelection)event.getSelection()).getFirstElement();
							complete = true;
							if (getWizard() != null && getWizard().getContainer() != null) {
								try {
									getWizard().getContainer().updateButtons();
								} catch(Throwable t) {
									//
								}
							}
						}
					}
				}
			}
	    );
	    usbSpeedListViewer.setSelection(
	    	new StructuredSelection(usbSpeeds[9])
	   	);
	    
	    int idx = 0;
	    if (mandatorySpeed != -1) {
	    	for (int sp : usbSpeeds) {
	    		if (sp == mandatorySpeed) {
	    		    usbSpeedListViewer.setSelection(
	    			    new StructuredSelection(usbSpeeds[idx])
	    			);
	    		}
	    		idx++;
	    	}
	    	usbSpeedListViewer.getControl().setVisible(false);
	    	baudRateLabel.setVisible(false);
	    } else {
	    	usbSpeedListViewer.getControl().setVisible(true);
	    	baudRateLabel.setVisible(true);
	    }

	    usbCfgListViewer.getControl().addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent e) {
				storeDialogSettings();
			}
		});
	    
	    
	    
	    
	    //
	    // Advanced USB options 
	    //
	    
	    
	    Label dataBitsLabel = new Label(composite, SWT.NONE);
	    dataBitsLabel.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
	    dataBitsLabel.setText("Data Bits :");
	    
	    dataBitsListViewer = new ComboViewer(composite, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
	    dataBitsListViewer.getCombo().setLayoutData(data);
	    dataBitsListViewer.getCombo().setFont(parent.getFont());
	    // Set the label provider		
	    dataBitsListViewer.setLabelProvider(new LabelProvider() {
	        public String getText(Object element) {
	            // Return the features's label.
	            return element == null ? "" : element.toString(); //$NON-NLS-1$
	        }
	    });
	    
	    // Set the content provider
	    dataBitsListViewer.setContentProvider(new ArrayContentProvider());
	    dataBitsListViewer.setInput(dataBits);
	    dataBitsListViewer.addSelectionChangedListener(
	    	new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					if (event.getSelection() instanceof IStructuredSelection) {
						if (!((IStructuredSelection)event.getSelection()).isEmpty()) {
							dataBit = (Integer)((IStructuredSelection)event.getSelection()).getFirstElement();
							complete = true;
							if (getWizard() != null && getWizard().getContainer() != null) {
								try {
									getWizard().getContainer().updateButtons();
								} catch(Throwable t) {
									//
								}
							}
						}
					}
				}
			}
	    );
	    dataBitsListViewer.setSelection(
	    	new StructuredSelection(dataBits[0])
	   	);
	    

	    
	    
	    Label stopBitsLabel = new Label(composite, SWT.NONE);
	    stopBitsLabel.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
	    stopBitsLabel.setText("Stop Bits :");
	    
	    stopBitsListViewer = new ComboViewer(composite, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
	    stopBitsListViewer.getCombo().setLayoutData(data);
	    stopBitsListViewer.getCombo().setFont(parent.getFont());
	    // Set the label provider		
	    stopBitsListViewer.setLabelProvider(new LabelProvider() {
	        public String getText(Object element) {
	            // Return the features's label.
	            return element == null ? "" : element.toString(); //$NON-NLS-1$
	        }
	    });
	    
	    // Set the content provider
	    stopBitsListViewer.setContentProvider(new ArrayContentProvider());
	    stopBitsListViewer.setInput(stopBits);
	    stopBitsListViewer.addSelectionChangedListener(
	    	new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					if (event.getSelection() instanceof IStructuredSelection) {
						if (!((IStructuredSelection)event.getSelection()).isEmpty()) {
							stopBit = (Integer)((IStructuredSelection)event.getSelection()).getFirstElement();
							complete = true;
							if (getWizard() != null && getWizard().getContainer() != null) {
								try {
									getWizard().getContainer().updateButtons();
								} catch(Throwable t) {
									//
								}
							}
						}
					}
				}
			}
	    );
	    stopBitsListViewer.setSelection(
	    	new StructuredSelection(stopBits[0])
	   	);

	    
	    
	    Label parityLabel = new Label(composite, SWT.NONE);
	    parityLabel.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
	    parityLabel.setText("Parity :");
	    
	    parityListViewer = new ComboViewer(composite, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
	    parityListViewer.getCombo().setLayoutData(data);
	    parityListViewer.getCombo().setFont(parent.getFont());
	    // Set the label provider		
	    parityListViewer.setLabelProvider(new LabelProvider() {
	        public String getText(Object element) {
	            // Return the features's label.
	            return element == null ? "" : element.toString(); //$NON-NLS-1$
	        }
	    });
	    
	    // Set the content provider
	    parityListViewer.setContentProvider(new ArrayContentProvider());
	    parityListViewer.setInput(parityBitsLabels);
	    parityListViewer.addSelectionChangedListener(
	    	new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					if (event.getSelection() instanceof IStructuredSelection) {
						if (!((IStructuredSelection)event.getSelection()).isEmpty()) {
							parity = getParityFromLabel((String)((IStructuredSelection)event.getSelection()).getFirstElement());
							complete = true;
							if (getWizard() != null && getWizard().getContainer() != null) {
								try {
									getWizard().getContainer().updateButtons();
								} catch(Throwable t) {
									//
								}
							}
						}
					}
				}
			}
	    );
	    parityListViewer.setSelection(
	    	new StructuredSelection(parityBitsLabels[0])
	   	);
	    
	    Label flowLabel = new Label(composite, SWT.NONE);
	    flowLabel.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
	    flowLabel.setText("Flow Control :");
	    
	    flowListViewer = new ComboViewer(composite, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
	    flowListViewer.getCombo().setLayoutData(data);
	    flowListViewer.getCombo().setFont(parent.getFont());
	    // Set the label provider		
	    flowListViewer.setLabelProvider(new LabelProvider() {
	        public String getText(Object element) {
	            // Return the features's label.
	            return element == null ? "" : element.toString(); //$NON-NLS-1$
	        }
	    });
	    
	    // Set the content provider
	    flowListViewer.setContentProvider(new ArrayContentProvider());
	    flowListViewer.setInput(flowControlLabels);
	    flowListViewer.addSelectionChangedListener(
	    	new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					if (event.getSelection() instanceof IStructuredSelection) {
						if (!((IStructuredSelection)event.getSelection()).isEmpty()) {
							flowControl = getFlowControlFromLabel((String)((IStructuredSelection)event.getSelection()).getFirstElement());
							complete = true;
							if (getWizard() != null && getWizard().getContainer() != null) {
								try {
									getWizard().getContainer().updateButtons();
								} catch(Throwable t) {
									//
								}
							}
						}
					}
				}
			}
	    );
	    flowListViewer.setSelection(
	    	new StructuredSelection(flowControlLabels[0])
	   	);
	    

	    Composite bag = new Composite(composite, SWT.NONE);
	    bag.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).equalWidth(true).create());
	    bag.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
	    
	    
	    final Button notifyOnOutputCheck = new Button(composite, SWT.CHECK);
	    notifyOnOutputCheck.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
	    notifyOnOutputCheck.setText("Notify On Output :");
	    notifyOnOutputCheck.addSelectionListener(
	    	new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					notifyOnOutput = notifyOnOutputCheck.getSelection();
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
	    );
	    
	    final Button notifyOnDataAvailableCheck = new Button(composite, SWT.CHECK);
	    notifyOnDataAvailableCheck.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
	    notifyOnDataAvailableCheck.setText("Notify On Data Available :");
	    notifyOnDataAvailableCheck.addSelectionListener(
	    	new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					notifyOnDataAvailable = notifyOnDataAvailableCheck.getSelection();
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
	    );
	    notifyOnDataAvailableCheck.setSelection(true);
	    notifyOnDataAvailable = true;
	    
		setControl(composite);

		PlatformUI.getWorkbench().getHelpSystem().setHelp(getControl(), "net.sf.smbt.doc.usb_context"); // NEW
	}
	
	@Override
	public boolean canFlipToNextPage() {
		return false;
	}

		
	public String getConfig() {
		return config;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	
	
	
	
	
	   
		public final static String USB_SECTION_DIALOG_SETTINGS_ID = "net.sf.smbt.ui.dialogs";
		public final static String USB_ADDRESSES_CONFIGS_ID = "net.sf.smbt.ui.dialogs.usb.addresses";
		
		private void storeDialogSettings() {
			IDialogSettings settings = Activator.getDefault().getDialogSettings();
			IDialogSettings consolePageDialogSettings;
			if ((consolePageDialogSettings = settings.getSection(USB_SECTION_DIALOG_SETTINGS_ID))==null) {
				consolePageDialogSettings = settings.addNewSection(USB_SECTION_DIALOG_SETTINGS_ID);
			}
			
			consolePageDialogSettings.put(USB_ADDRESSES_CONFIGS_ID, showAll);
		}
		
		private void loadDialogSettings() {
			IDialogSettings settings = Activator.getDefault().getDialogSettings();
			IDialogSettings consolePageDialogSettings;
			if ((consolePageDialogSettings = settings.getSection(USB_SECTION_DIALOG_SETTINGS_ID))==null) {
				consolePageDialogSettings = settings.addNewSection(USB_SECTION_DIALOG_SETTINGS_ID);
			}
			showAll = consolePageDialogSettings.getBoolean(USB_ADDRESSES_CONFIGS_ID);
			showAllChecbox.setSelection(showAll);
		}


}
