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

package net.sf.smbt.ui.firmata.ubiquino.editor;

import java.util.concurrent.ConcurrentLinkedQueue;

import net.sf.smbt.firmata.ubiquino.Ubiquino;
import net.sf.smbt.firmata.ubiquino.UbiquinoFactory;
import net.sf.smbt.firmata.ubiquino.core.UbiquinoUtils;
import net.sf.smbt.firmata.ubiquino.provider.UbiquinoItemProviderAdapterFactory;
import net.sf.smbt.mdl.arduino.provider.ArduinoItemProviderAdapterFactory;
import net.sf.smbt.midi.ezmidi.DSLMidiMessage;
import net.sf.smbt.midi.ezmidi.NoteOFF;
import net.sf.smbt.midi.ezmidi.NoteON;
import net.sf.smbt.osc.utils.OscCmdUtils;
import net.sf.smbt.osccmd.OscCmd;
import net.sf.smbt.quantic.services.XCPAddressUtils;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.ui.firmata.ubiquino.widget.ArduinoBoardControllerContainer;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.smbt.xcp.XCPAddress;
import net.sf.smbt.xcp.provider.XcpItemProviderAdapterFactory;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.cmd.CompoundCmd;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;
import net.sf.xqz.model.temporal.provider.TemporalItemProviderAdapterFactory;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;

public class UbiquinoEditor extends EditorPart implements ISelectionProvider, ITabbedPropertySheetPageContributor {

	private static Ubiquino		ubiquino;
	private Composite			container;
	private ScrolledComposite	sc;
	
	private CmdPipe ubiquinoPipe;

	private ConcurrentLinkedQueue<ISelectionChangedListener> listeners;
	
	private ArduinoBoardControllerContainer	inside;
	private EzUbiquinoCmdDumper				ezDumperQxHandler;
	private ComposedAdapterFactory			adapterFactory;
	
	private boolean dumpActive;
	
	public void setDumpActive(boolean dumpActive) {
		this.dumpActive = dumpActive;
	}
	public boolean isDumpActive() {
		return dumpActive;
	}
	
	public AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}
	@Override
	public void doSave(IProgressMonitor monitor) {
		//UbiquinoUtils.INSTANCE.save(getEditorInput(), ubiquino);
	}
	@Override
	public void doSaveAs() {
		doSave(new NullProgressMonitor());
	}
	public UbiquinoEditor() {
		initAdapterFactory();
		listeners			= new ConcurrentLinkedQueue<ISelectionChangedListener>();
		ezDumperQxHandler	= new EzUbiquinoCmdDumper(10);
	}
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		ubiquino = UbiquinoUtils.INSTANCE.load(input);
		setSite(site);
		site.setSelectionProvider(
			this
		);
		setInput(input);
		
		//
		// forces outline view to show
		//
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("org.eclipse.ui.views.ContentOutline");
		
		
		if (ubiquino.getConfig() == null) {
			ubiquino.setConfig(UbiquinoFactory.eINSTANCE.createUbiquinoConfig());
		}
				
		setSelection(new StructuredSelection(ubiquino));
	}
	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		if (IContentOutlinePage.class.equals(adapter)) {
			return new UbiquinoOutlinePage(this);
		} else if (adapter.equals(IPropertySheetPage.class)) {
			return new UbiquinoPropertySheetPage(this);
		}
		return super.getAdapter(adapter);
	}
	
	private void initAdapterFactory() {
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new TemporalItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new XcpItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new UbiquinoItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ArduinoItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
	}
	@Override
	public boolean isDirty() {
		return false;
	}
	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}
	public void redraw() {
		container.layout(true);
		container.redraw();
	}
	public void updatePipe(CmdPipe pipe) {}
	
	@Override
	public void createPartControl(final Composite parent) {
		parent.setBackground(GUIToolkit.BG);
		container = GUIToolkit.INSTANCE.createComposite(parent, SWT.NONE);
		container.setBackground(GUIToolkit.BG);
		container.setLayout(GridLayoutFactory.fillDefaults().create());
		container.setLayoutData(GridDataFactory.fillDefaults().indent(25, 25).grab(true, true).create());
		container.setBackground(GUIToolkit.BG);

		setSelection(new StructuredSelection(ubiquino));
	}
	public Ubiquino getUbiquino() {
		return ubiquino;
	}
	private final class EzUbiquinoCmdDumper extends AbstractQxEventHandlerImpl {
		int sampling;
		int tick;
		public EzUbiquinoCmdDumper(int sampling) {
			this.sampling = sampling;
			tick = 0;
		}
		@Override
		public synchronized void handleQxEvent(Event event) {
			if (tick > sampling) {
				tick = 0;
				if (isDumpActive()) {
					if (event.getCmd() instanceof CompoundCmd) {
						for (Cmd c : ((CompoundCmd)event.getCmd()).getChildren()) {
							handleFirmataCmd(c);
						}
					} else {
						handleFirmataCmd(event.getCmd());
					}
				}
			}
			tick++;
		}
	}
	
	private OscCmd createOscFrom(Cmd cmd) {
		if (cmd instanceof NoteON) {
			NoteON noteON = (NoteON) cmd;
			if (noteON.getCmd() == Integer.decode("0x90")) {
				int value 	= noteON.getByte1()<<7 | noteON.getByte2();
				String addr = "/firmata/digital/" + noteON.getChannel();
				return OscCmdUtils.INSTANCE.createOscRcvCmd(addr, value);
			} else if (noteON.getCmd() == Integer.decode("0xe0")) {
				int v		= noteON.getByte1()<<7 | noteON.getByte2();
				float value = new Float(v);
				String addr = "/firmata/analog/" + noteON.getChannel();
				return OscCmdUtils.INSTANCE.createOscRcvCmd(addr, value);
			} 
		}
		return null;
	}
	
	private void handleFirmataCmd(Cmd cmd) {
		if (cmd instanceof CompoundCmd) {
			for (Cmd c : ((CompoundCmd) cmd).getChildren()) {
				if (c instanceof DSLMidiMessage) {
					QuanticMojo.INSTANCE.acceptLocalAgentCmd(
						createOscFrom(c)
					);
				} else if (c instanceof CompoundCmd) {
					handleFirmataCmd(c);
				}
			}
		}
	}
    public void enableComposite(Composite composite, boolean status) {
/*
    	if (composite != null) {
			for (Control c : composite.getChildren()) {
				if (c instanceof Composite) {
					enableComposite((Composite) c, status);
				}
				if (c != null && !c.isDisposed()) {
					c.setEnabled(status);
				}
			}
    	}
*/
    }
    private void layoutComposite(Composite composite) {
    	if (composite != null) {
			for (Control c : composite.getChildren()) {
				if (!c.isDisposed()) {
					if (c instanceof Composite) {
						Composite cmp = (Composite) c;
						cmp.layout(true);
						layoutComposite(cmp);
					}
					c.redraw();
				}
			}
    	}
    }
    
	public void createUbiquinoUI() {
	    sc = GUIToolkit.INSTANCE.createScrolledComposite(container, SWT.V_SCROLL | SWT.H_SCROLL | SWT.BORDER);
	    sc.setLayout(GridLayoutFactory.fillDefaults().create());
	    sc.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
	    sc.setBackground(GUIToolkit.BG);

		inside = new ArduinoBoardControllerContainer(sc, ubiquino, null);
		inside.setLayout(GridLayoutFactory.fillDefaults().create());
		inside.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).indent(25, 25).create());
		inside.setBackground(GUIToolkit.BG);
		
	    sc.setAlwaysShowScrollBars(true);
	    sc.setExpandVertical(true);
	    sc.setExpandHorizontal(true);

		sc.setContent(inside);
			
	    container.addControlListener(
	        new ControlListener() {
				@Override
				public void controlResized(ControlEvent e) {
					Rectangle r = inside.getClientArea();
				    sc.setMinSize(r.width, r.height);
				        
				    container.layout(true);
				    container.redraw();
				    sc.layout(true);
				    sc.redraw();
				    inside.layout(true);
				    inside.redraw();
			        
			        layoutComposite(container);
				}
				@Override
				public void controlMoved(ControlEvent e) {}
			}
	    );
	        
		Rectangle r = container.getClientArea();
	    sc.setMinSize(r.width, r.height);
	        
	    container.layout(true);
	    container.redraw();
	    sc.layout(true);
	    sc.redraw();
	    inside.layout(true);
	    inside.redraw();
	        
	    layoutComposite(container);
	    
	    enableComposite(inside, false);
	    
	    inside.addDisposeListener(new DisposeListener() {
			@Override
			public void widgetDisposed(DisposeEvent e) {
				doSaveAs();
			}
		});
	    
	    updateUbiquinoUI(ubiquino.getDefault());
	    
	    setSelection(getSelection());
	}
	
	public void toggleOscFirmataDump(boolean status) {
		setDumpActive(status);
		XCPAddress addr = ubiquino.getLastAddress();
		System.out.println("Toggle OSC dump to " + status);
		if (addr != null) {
			CmdPipe pipe = XCPAddressUtils.INSTANCE.getCmdPipe(addr, true);
			if (pipe instanceof CmdPipe) {
				ubiquino.setDefault(pipe);
				if (status) {
					pipe.removeQxEventHandler(ezDumperQxHandler);
					pipe.addQxEventHandler(ezDumperQxHandler);
				} else {
					pipe.removeQxEventHandler(ezDumperQxHandler);
				}
				updateUbiquinoUI(pipe);
			}
		}
	}
	
	@Override
	public void dispose() {
		if (ubiquinoPipe != null) {
			ubiquinoPipe.setLocked(false);
			QuanticMojo.INSTANCE.closePipe(ubiquinoPipe, true);
		}
		super.dispose();
	}
	
	public void updateUbiquinoUI(CmdPipe pipe) {
		if (pipe != null) {
			if (inside != null) {
				inside.updatePipe(pipe);
			}
			ubiquinoPipe = pipe;
			getUbiquino().setDefault(pipe);
			ubiquinoPipe.setLocked(true);		
			
		}	
		enableComposite(inside, pipe != null);
	}
	
	private String valueOf(byte num) {
		String hex = Integer.toHexString((int) num & 0xFF);
		return "0x" + (hex.length() == 1 ? "0" : "") + hex;
	}

	public String getKind(byte hex) {
		return valueOf((byte) (hex & 0xff));
	}
	public String getIOKind(byte hex) {
		return valueOf((byte) (hex & 0xf0));
	}
	@Override
	public boolean isSaveOnCloseNeeded() {
		return true;
	}
	@Override
	public void setFocus() {
		setSelection(getSelection());
	}
	
	//
	// Selection
	//
	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		listeners.add(listener);
	}
	@Override
	public ISelection getSelection() {
		return new StructuredSelection(ubiquino);
	}
	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		listeners.remove(listener);
	}
	
	@Override
	public void setSelection(ISelection selection) {
		for (ISelectionChangedListener l : listeners) {
			l.selectionChanged(new SelectionChangedEvent(this, getSelection()));
		}
	}
	@Override
	public String getContributorId() {
		return "net.sf.smbt.ui.ubiquino";
	}
}