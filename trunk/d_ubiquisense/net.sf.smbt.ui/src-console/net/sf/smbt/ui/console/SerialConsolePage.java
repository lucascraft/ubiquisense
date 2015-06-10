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

package net.sf.smbt.ui.console;

import net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL;
import net.sf.smbt.rawcomm.RawCmd;
import net.sf.smbt.rawcomm.RawcommFactory;
import net.sf.smbt.ui.Activator;
import net.sf.smbt.ui.dialogs.CommPipeSelectionDialog;
import net.sf.smbt.ui.wizards.CommPipeConfigWizardDialog;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EVENT_KIND;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.Page;
import org.eclipse.ui.progress.UIJob;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

/**
 * The page implementing the Serial console.
 */
public class SerialConsolePage extends Page implements ITabbedPropertySheetPageContributor {
	private Composite topContainer;
	private TextViewer consoleViewer;
	private Text sendText;
	private Button sendButton;
	private Document document;
	private Action connectSerialAction, dumpSerialAction;
	private CmdPipe serialPipe;
	private Color consoleFG = ColorConstants.lightBlue;
	private SerialCmdDumper dumper;
	private UpdateJob updateJob;
	private SerialConsolePage SELF;
	
	class UpdateJob extends UIJob {
		private String text;
		private void setText(String text) {
			this.text = text;
		}
		public UpdateJob() {
			super("Serial Console Update Job");
			setSystem(true);
			setPriority(INTERACTIVE);
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			scrollText();
			append(text, consoleFG);
			return Status.OK_STATUS;
		}
	}
	class SerialCmdDumper extends AbstractQxEventHandlerImpl {
		@Override
		public synchronized void handleQxEvent(Event event) {
			if (event.getKind() == EVENT_KIND.RX_DONE) {
				if (event.getCmd() instanceof Cmd) {
					updateJob.setText(event.getCmd().toString());
					updateJob.schedule();
				}
			}
		}
	}

	@Override
 	public void createControl(Composite parent) {
		setSELF(this);
		
		updateJob = new UpdateJob();
		
		topContainer = new Composite(parent, SWT.NONE);
		topContainer.setLayout(GridLayoutFactory.fillDefaults().create());
		topContainer.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());

		consoleViewer = new TextViewer(topContainer, SWT.BORDER | SWT.MULTI);
		consoleViewer.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		
		document = new Document();
		document.set("Serial Terminal ver 0.5.1 \n");
		consoleViewer.setDocument(document);
		
		Composite bottomContainer = new Composite(topContainer, SWT.NONE);
		bottomContainer.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		bottomContainer.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		
		sendText = new Text(bottomContainer, SWT.BORDER);
		sendText.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		sendText.addKeyListener(new KeyListener() {
			@Override
			public void keyReleased(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.character == SWT.CR) {
					String text = sendText.getText(); 
					if (serialPipe != null && text != null && !"".equals(text)) {
						RawCmd cmd = RawcommFactory.eINSTANCE.createRawCmd();
						cmd.setBytes(text.getBytes());
						sendText.setText("");
						serialPipe.send(cmd);
					}
				}
			}
		});
		
		//TODO
		sendButton = new Button(bottomContainer, SWT.PUSH);
		sendButton.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).create());
		sendButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String text = sendText.getText(); 
				if (serialPipe != null && text != null && !"".equals(text)) {
					RawCmd cmd = RawcommFactory.eINSTANCE.createRawCmd();
					cmd.setBytes(text.getBytes());
					sendText.setText("");
					serialPipe.send(cmd);
				}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
		sendButton.setText("Send");
		
		dumper = new SerialCmdDumper();
		
		connectSerialAction = new Action() {
			public void run() {
				CommPipeSelectionDialog dlg = new CommPipeSelectionDialog(new TRANSPORT_PROTOCOL[] {TRANSPORT_PROTOCOL.USB}, new String[] {"raw"});
				if (dlg.open() == Window.OK) {
					Object[] results = dlg.getResult();
					if (results != null) {
						for (Object obj : results) {
							if (obj instanceof CmdPipe) {
								CmdPipe serialPipe = (CmdPipe) obj;
								if(serialPipe != null) {
									serialPipe.removeQxEventHandler(dumper);
									serialPipe.addQxEventHandler(dumper);
								}
							}
						}
					} else {
						CommPipeConfigWizardDialog pipeConfigWizardDialog = new CommPipeConfigWizardDialog(new TRANSPORT_PROTOCOL[] {TRANSPORT_PROTOCOL.USB}, new String[] {"raw"});
						int status = pipeConfigWizardDialog.open();
						if (status == Window.OK) {
							CmdPipe pipe = pipeConfigWizardDialog.getSelection();
							if (pipe != null) {
								CmdPipe serialPipe = pipe;
								if(serialPipe != null) {
									serialPipe.removeQxEventHandler(dumper);
									serialPipe.addQxEventHandler(dumper);
								}
							}
						}
					}
				}
			}
		};	
		connectSerialAction.setToolTipText("plug a serial connection");
		connectSerialAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui", 
				"icons/new/plug.png"
			)
		);
		
		dumpSerialAction = new Action("Dump ThingM as OSC", SWT.TOGGLE) {
			public void run() {
				if(serialPipe != null) {
					serialPipe.removeQxEventHandler(dumper);
					if (isChecked()) {
						serialPipe.addQxEventHandler(dumper);
					}
				}
			}
		};
		dumpSerialAction.setToolTipText("Dump ThingM as OSC in the console");
		dumpSerialAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui", 
				"icons/status/software-update-available.png"
			)
		);

		contributeToActionBars();
 	}
	
	private void fillLocalPullDown(IMenuManager manager) {
		//manager.add(connectArduinoAction);
		//manager.add(disconnectArduinoAction);
		//manager.add(uploadThingMScriptAction);
		manager.add(new Separator());
		manager.add(connectSerialAction);
		manager.add(dumpSerialAction);
	}

	private void contributeToActionBars() {
		IActionBars bars = getSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalToolBar(IToolBarManager manager) {
		//manager.add(connectArduinoAction);
		//manager.add(disconnectArduinoAction);
		//manager.add(uploadThingMScriptAction);
		manager.add(new Separator());
		manager.add(connectSerialAction);
		manager.add(dumpSerialAction);
	}

 
	@Override
	public Control getControl() {
		return topContainer;
	}
	 
	public Object getAdapter(Class<?> adapter) {
        if (adapter == IPropertySheetPage.class)
            return new TabbedPropertySheetPage(this);
        return super.getSite().getAdapter(adapter);
    }

	@Override
	public void setFocus() {
		consoleViewer.getControl().setFocus();
	}

	@Override
	public String getContributorId() {
		return "net.sf.smbt.ui.console.SerialConsolePageID";
	}
	
	
	
	/**
	 * Obtains the document in the output viewer.
	 * 
	 * @return the output document
	 */	
	private IDocument getDocument() {
		return consoleViewer != null ? consoleViewer.getDocument() : null;
	}
	
	/**
	 * Prints an error message to the output viewer, in red text.
	 * 
	 * @param message the error message to print
	 */
	@SuppressWarnings("unused")
	private void error(final String message) {
		scrollText();
	}
	
	/**
	 * Ensures that the last text printed to the output viewer is shown.
	 */
	private void scrollText() {
		if (consoleViewer != null) {
			consoleViewer.revealRange(getDocument().getLength(), 0);
		}
	}
	
	/**
	 * Appends the specidied text to the output viewer.
	 * 
	 * @param text the text to append
	 * @param color the color to print the text with
	 * @param bold whether to print the text bold
	 */
	private void append(String text, Color color) {
		
		IDocument doc = getDocument();
		if (doc != null) {
			try {
				int offset = doc.getLength();
				int length = text.length();
				
				if (offset > 0) {
					doc.replace(offset, 0, text);
				} else {
					doc.set(text);
				}
				
				StyleRange style = new StyleRange();
				style.start = offset;
				style.length = length;
				style.foreground = color;
				
				consoleViewer.getTextWidget().setStyleRange(style);
			} catch (BadLocationException e) {
				IStatus status = new Status(
					IStatus.ERROR,
					Activator.PLUGIN_ID,
					1,
					"error",
					e
				);
				
				Activator.getDefault().getLog().log(status);
			}
		}
	}

	public SerialConsolePage getSELF() {
		return SELF;
	}

	public void setSELF(SerialConsolePage sELF) {
		SELF = sELF;
	}
}