/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012 - 2013, Lucas Bigeardel
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

package net.sf.smbt.ui.pachube.editors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

import net.sf.smbt.comm.httpcmd.Property;
import net.sf.smbt.ezcosm.Coordinates;
import net.sf.smbt.ezcosm.CosmProject;
import net.sf.smbt.ezcosm.EzcosmFactory;
import net.sf.smbt.ezcosm.provider.EzcosmItemProviderAdapterFactory;
import net.sf.smbt.ezpachube.CosmCmd;
import net.sf.smbt.ezpachube.FeedKind;
import net.sf.smbt.pachube.utils.CosmUtils;
import net.sf.smbt.pachube.utils.PachubeUtils;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.smbt.ui.hmi.UbiJob;
import net.sf.smbt.ui.pachube.Activator;
import net.sf.smbt.ui.pachube.controller.CosmCellLabelProvider;
import net.sf.smbt.ui.pachube.controller.GMapUtils;
import net.sf.smbt.ui.pachube.controller.PachubeContentProvider;
import net.sf.smbt.ui.pachube.dialogs.TriggersManagementDialog;
import net.sf.smbt.ui.pachube.gmap.GMap;
import net.sf.smbt.ui.pachube.gmap.LatLng;
import net.sf.smbt.ui.pachube.gmap.MapAdapter;
import net.sf.smbt.ui.pachube.preferences.PreferenceConstants;
import net.sf.smbt.ui.widgets.common.GeoUtils;
import net.sf.smbt.ui.widgets.vu.UbiButton;
import net.sf.smbt.ui.widgets.vu.UbiSelectionListener;
import net.sf.smbt.ui.widgets.vu.UbiSlider;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EVENT_KIND;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;
import net.sf.xqz.model.temporal.provider.TemporalItemProviderAdapterFactory;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.progress.UIJob;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheet;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eeml.xsd._0._5.DataType;
import org.eeml.xsd._0._5.EemlType;
import org.eeml.xsd._0._5.EnvironmentType;
import org.eeml.xsd._0._5.StatusType;
import org.eeml.xsd._0._5._5Factory;
import org.eeml.xsd._0._5.provider._5ItemProviderAdapterFactory;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
//import net.sf.smbt.ui.pachube.views.PachubeDataWidget;

public class CosmEditor extends EditorPart implements ISelectionProvider, ITabbedPropertySheetPageContributor {
	 
	static final private String INIT_CENTER = "33.0,5.0";
	static final private int INIT_ZOOM = 2;
	static final private int INIT_TYPE = net.sf.smbt.ui.pachube.gmap.GMap.TYPE_ROADMAP;
	
	private net.sf.smbt.ui.pachube.gmap.GMap gmap = null;
	
	public net.sf.smbt.ui.pachube.gmap.GMap getGoogleMap() {
		return gmap;
	}

	private FilteredTree filteredTree1, filteredTree2;
	private UbiButton filterDatastreamsButton; 
	private UbiSlider radiusSlider;
	
	private EnvironmentType environmentType;
	

	//private Map<String,	PachubeDataWidget> widgetsMap;
	private Composite	inside2;
	private TabFolder	folder;
	private SashForm	sash1, sash2;
	private RefreshJob	ttl;
	private CmdPipe 	pachubeEngine;
    private TreeViewer 	tv1, tv2;
	private static CosmProject cosmProject;
	private boolean hideFrozenStreams = false;
	
	private int radius;

	private ConcurrentLinkedQueue<ISelectionChangedListener> listeners;
	private ComposedAdapterFactory adapterFactory;
	
	private Action manageTriggersAction;
	
	public EnvironmentType getEnvType() {
		return environmentType;
	}
	public static CosmProject getCosmProject() {
		return cosmProject;
	}
	public CmdPipe getPachubeEngine() {
		return pachubeEngine;
	}
	public boolean isHideFrozenStreams() {
		return hideFrozenStreams;
	}
	public void setHideFrozenStreams(boolean hideFrozenStreams) {
		this.hideFrozenStreams = hideFrozenStreams;
	}
	
	private final class RefreshJob extends UIJob {
		public RefreshJob() {
			super("Cosm refresh job");
			setSystem(true);
			setPriority(INTERACTIVE);
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			if (gmap != null) {
				LatLng ll = gmap.getCenter();
				queryAroundFeeds(ll.latitude, ll.longitude, radius, isHideFrozenStreams());
			}
			
			for (int i=folder.getItemCount()-1;i>=0;i--) {
				TabItem item = folder.getItem(i);
				if (item != null && item.getControl() != null) {
					folder.setSelection(item);
				}
			}
			
			for (TabItem item :	folder.getSelection()) {
				folder.setSelection(item);
			}
			
			schedule(10000);
			return Status.OK_STATUS;
		}
	}

	private ScrolledComposite scx;
	private CosmCellLabelProvider cellLabelProvider;
	private PachubeContentProvider contentProvider;
	
	@Override
	public void dispose() {
		if (ttl != null) {
			ttl.cancel();
			ttl.done(Status.OK_STATUS);
		}
		super.dispose();
	}
	
	public String getApiKey() {
		String apiKey = Activator.getDefault().getPreferenceStore().getString(PreferenceConstants.P_APIKEY);
		
		return (apiKey==null||"".equals(apiKey)) ? "lEYzx-UwJQZtWyWY8Nka8H3NRJeSAKxGZ1NTekxNT3ZSbz0g" : apiKey;
	}
	
   	private boolean matchPattern(FilteredTree filteredTree, EnvironmentType node) {
		String text = null;
		if (node instanceof EnvironmentType) {
			text = cellLabelProvider.getText(node);
		}
		return text != null ? text.contains(filteredTree.getFilterControl().getText()) : false;
	}

   	private final static String datastreamKEY = "DATASTREAMS_JOB_KEY";
   	
   	private class HandleDataJob extends UbiJob {
   		private String feed;
   		private DataType datastream;
   		public HandleDataJob(String feed, DataType datastream) {
   			super(datastreamKEY);
   			this.feed = feed;
   			this.datastream = datastream;
		}
   		public String getFeed() {
			return feed;
		}
   		public DataType getDatastream() {
			return datastream;
		}
   		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			CosmCmd cmd = PachubeUtils.INSTANCE.buildReadDatastream6HoursHistory( feed  , ""+ datastream.getId(), getApiKey());
		    CosmCmd result = (CosmCmd) pachubeEngine.syncSend(cmd);
		    if (result != null) {
		    	handleJsonFeed(getFeed(), ""+ getDatastream().getId(), (JsonElement)result.getJson());
		    }
			return Status.OK_STATUS;
		}
   	}
   	
	private HandleDataJob requestEnvTypeData(final Object w, final String last, final DataType type, final FeedKind kind) {
		return new HandleDataJob(last, type);
	}
	
	private void queryAroundFeeds(double lat, double lon, int dist, boolean hideFrozen) {
    	List<Property> properties = new ArrayList<Property>();
    	properties.add(PachubeUtils.INSTANCE.createProperty("content", 	"full"));
    	properties.add(PachubeUtils.INSTANCE.createProperty("distance", ""+dist));
    	properties.add(PachubeUtils.INSTANCE.createProperty("lat", 		""+lat));
    	properties.add(PachubeUtils.INSTANCE.createProperty("lon", 		""+lon));
    	properties.add(PachubeUtils.INSTANCE.createProperty("status", 	hideFrozen?"live":"all"));

    	try {
    		if (gmap != null) { 
    			gmap.addCircle("" + lat, "" + lon, "" + dist * 1000);
    		}
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
		pachubeEngine.send(
			PachubeUtils.INSTANCE.buildListFeedRequest("", getApiKey(), properties)
		);
	}

	public AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}
	
	@Override
	public void doSave(IProgressMonitor monitor) {
		if (gmap != null && gmap.getCenter() != null && !gmap.isDisposed()) {
			Coordinates coord = EzcosmFactory.eINSTANCE.createCoordinates();
			coord.setLat(gmap.getCenter().latitude);
			coord.setLon(gmap.getCenter().longitude);
			coord.setZoom(gmap.getZoom());
			cosmProject.setLastCoordinate(coord);
		}
		CosmUtils.INSTANCE.save(getEditorInput(), cosmProject);
	}
	
	@Override
	public void doSaveAs() {
		doSave(new NullProgressMonitor());
	}
	
	public CosmEditor() {
		radius		= 25;
		listeners	= new ConcurrentLinkedQueue<ISelectionChangedListener>();
		
	   	pachubeEngine = QuanticMojo.INSTANCE.createHttpPipe(
			"pachube", 
			"http://api.pachube.com"
		);
	   	pachubeEngine.setLocked(true);
	   	
	   	if (pachubeEngine != null) {
			pachubeEngine.addQxEventHandler(new AbstractQxEventHandlerImpl() {
				@Override
				public void handleQxEvent(Event event) {
					if (event.getCmd() instanceof CosmCmd) {
						CosmCmd pachubeCmd = (CosmCmd) event.getCmd();
						if (event.getKind().equals(EVENT_KIND.RX_DONE)) {
							if (FeedKind.EEML.equals(pachubeCmd.getFeedKind())) {
								EemlType eeml = pachubeCmd.getEeml();
								//PachubeUtils.INSTANCE.dumpEemlEnvironement(eeml);
							} else if (FeedKind.JSON.equals(pachubeCmd.getFeedKind())) {
								final Object json = pachubeCmd.getJson();
								if (json != null) {
									//System.out.println(json.toString());
								}
								if (json instanceof JsonElement) {
									new UbiJob("Refresh Cosm UI From Feed") {
										@Override
										public IStatus runInUIThread(IProgressMonitor monitor) {
											handleJsonFeed("", "", (JsonElement) json);
											return Status.OK_STATUS;
										}
									}.schedule();
								}
							}
						}
					}
				}
			});
	   	}
		contentProvider = new PachubeContentProvider();
	}
	
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		setSite(site);
		site.setSelectionProvider(
			this
		);
		setInput(input);
		
		cosmProject = CosmUtils.INSTANCE.load(input);
		
		initAdapterFactory();
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		if (IContentOutlinePage.class.equals(adapter)) {
			//return new UbiquinoOutlinePage(this);
		} else if (adapter.equals(IPropertySheetPage.class)) {
			return new CosmPropertySheetPage(this);
		}
		return super.getAdapter(adapter);
	}
	
	private void initAdapterFactory() {
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new TemporalItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new EzcosmItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new _5ItemProviderAdapterFactory());
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
	
	@Override
	public void createPartControl(final Composite parent) {
		parent.setBackground(GUIToolkit.BG);
	
		scx = GUIToolkit.INSTANCE.createScrolledComposite(parent, SWT.V_SCROLL | SWT.H_SCROLL | SWT.BORDER);
		scx.setLayout(GridLayoutFactory.fillDefaults().create());
		scx.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		scx.setBackground(GUIToolkit.BG);
		
		folder = new TabFolder(scx, SWT.TOP);
		folder.setLayout(GridLayoutFactory.fillDefaults().create());
		folder.setLayoutData(GridDataFactory.fillDefaults().grab(true,true).create());
		
        //
        // TabItem 1
        //
        
		TabItem tabItem1 = new TabItem(folder, SWT.TOP);
		tabItem1.setText("Browse");
		
        sash1 = new SashForm(folder, SWT.HORIZONTAL);
        sash1.setLayout(GridLayoutFactory.fillDefaults().create());
        sash1.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());

        createBrowseComponent(sash1);
        
        tabItem1.setControl(sash1);
        
        
        //
        // TabItem 2
        //
        
		TabItem tabItem2 = new TabItem(folder, SWT.TOP);
		tabItem2.setText("Manage");
		
		Composite manageContainer = GUIToolkit.INSTANCE.createComposite(folder);

        sash2 = new SashForm(manageContainer, SWT.HORIZONTAL);
        sash2.setLayout(GridLayoutFactory.fillDefaults().create());
        sash2.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
        
        createManageComponent(sash2);

		tabItem2.setControl(manageContainer);
		
        scx.setAlwaysShowScrollBars(true);
        scx.setExpandVertical(true);
        scx.setExpandHorizontal(true);

		scx.setContent(folder);
		
        folder.addControlListener(
        	new ControlListener() {
				@Override
				public void controlResized(ControlEvent e) {
					Rectangle r = parent.getClientArea();
			        scx.setMinSize(r.width, r.height);
			        scx.layout(true);
			        scx.redraw();
			        layoutComposite(scx);
				}
				@Override
				public void controlMoved(ControlEvent e) {}
			}
        );
        
		Rectangle r2 = parent.getClientArea();
        scx.setMinSize(r2.width, r2.height);
        
        scx.layout(true);
        scx.redraw();
		
		//
		//
		//
		
		if (cosmProject != null) {
			if (cosmProject.getEeml() != null) {
				tv1.setInput(cosmProject.getEeml());
			}
			Coordinates coord = cosmProject.getLastCoordinate();
			if (coord != null) {
				LatLng latLng = new LatLng(coord.getLat(), coord.getLon());
				gmap.setCenter(latLng);
				gmap.setZoom(coord.getZoom());
			}
			if (cosmProject.getLastDatastream() != null) {
				tv1.setSelection(new StructuredSelection(cosmProject.getLastDatastream()));
			}
		}
		
		String apiKey = Activator.getDefault().getPreferenceStore().getString(PreferenceConstants.P_APIKEY);
		if (apiKey == null || apiKey.equals("")) {
			MessageDialog.openInformation(Display.getDefault().getActiveShell(), "Cosm Key Information", "Cosm Authentication Key is missing in preferences. \nPlease grab a key from cosm.com and update the eclipse preferences page accordingly.");
		}
	}
	
    private void layoutComposite(Control control) {
    	if (control instanceof Composite) {
    		Composite composite = (Composite) control;
    		for (Control c : composite.getChildren()) {
				if (!c.isDisposed()) {
					if (c instanceof Composite) {
						Composite cmp = (Composite) c;
						layoutComposite(cmp);
					}
					c.redraw();
				}
			}
    	}
    }

	private void createManageComponent(SashForm sashAdmin) {
		
        PatternFilter patternFilter = new PatternFilter() {
			protected boolean isLeafMatch(Viewer viewer, Object element) {
				if (element instanceof DataType) {
					if (((DataType)element).eContainer() instanceof EnvironmentType) {
						return matchPattern(filteredTree2, (EnvironmentType)((DataType)element).eContainer());
					}
				}
				return false;
			}
        };
        
		filteredTree2 = GUIToolkit.INSTANCE.createFilteredTree(sashAdmin, SWT.NONE, patternFilter, true);
		
        tv2 = filteredTree2.getViewer();
        tv2.setContentProvider(contentProvider);
        tv2.setLabelProvider(cellLabelProvider);
        tv2.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
        tv2.getControl().setBackground(ColorConstants.gray);
        
        inside2 = new Composite(sashAdmin, SWT.NONE);
        inside2.setLayout(GridLayoutFactory.fillDefaults().spacing(0, 0).extendedMargins(0, 0, 0, 0).create());
        inside2.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
        
        tv2.addSelectionChangedListener(
            new ISelectionChangedListener() {
    			@Override
    			public void selectionChanged(SelectionChangedEvent event) {
    				if (event.getSelection() instanceof IStructuredSelection) {
    					Object obj = ((IStructuredSelection)event.getSelection()).getFirstElement();
    					if (obj instanceof DataType) {
    						//handleWidgets((DataType) obj);
    					}
    				}
    			}
    		}
        );
        
        sashAdmin.setWeights(new int[]{1, 5});
	}
	
	private void createBrowseComponent(SashForm sashBrowse) {
		contentProvider = new PachubeContentProvider();
	        
	    cellLabelProvider = new CosmCellLabelProvider();
	 
	    PatternFilter patternFilter = new PatternFilter() {
			protected boolean isLeafMatch(Viewer viewer, Object element) {
				if (element instanceof DataType) {
					if (((DataType)element).eContainer() instanceof EnvironmentType) {
						return matchPattern(filteredTree1, (EnvironmentType)((DataType)element).eContainer());
					}
				}
				return false;
			}
	    };
	    
	    makeActions();

	    Composite bag = GUIToolkit.INSTANCE.createComposite(sashBrowse);
	    bag.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).equalWidth(false).extendedMargins(0, 0, 0, 0).margins(0, 0).create());
	    bag.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
	    
	    filterDatastreamsButton = new UbiButton(bag);
	    filterDatastreamsButton.setImage(filterDatastreamsAction.getImageDescriptor().createImage());
	    filterDatastreamsButton.addSelectionListener(
	    	new UbiSelectionListener() {
				@Override
				public void handle() {
					filterDatastreamsAction.run();
				}
	    	}
	    );
	    
	    radiusSlider = new UbiSlider(bag, SWT.HORIZONTAL, false, UbiSlider.UBI_SLIDER_RICH_LOOK);
	    radiusSlider.setLayout(GridLayoutFactory.fillDefaults().create());
	    radiusSlider.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).minSize(120, 20).hint(120, 20).create());
	    radiusSlider.setMax(100f);
	    radiusSlider.setValue(0f);
	    radiusSlider.addSelectionListener(
	    	new UbiSelectionListener() {
				@Override
				public void handle() {
					Float d		= 25f + radiusSlider.getValue() * 2f;
					radius		= d.intValue();
			        LatLng ll	= gmap.getCenter();
			        gmap.setCenter(ll);
			        gmap.addCircle(
			        	""+ll.latitude, 
			        	""+ll.longitude, 
			        	"" + (radius * 1000) 
			        );
				}
			}
	    );
	    
	    filteredTree1 = GUIToolkit.INSTANCE.createFilteredTree(bag, SWT.NONE, patternFilter, true);
	    filteredTree1.setLayout(GridLayoutFactory.fillDefaults().create());
	    filteredTree1.setLayoutData(GridDataFactory.fillDefaults().span(2, 1).grab(true, true).create());
	    
	    tv1 = filteredTree1.getViewer();
	    tv1.setContentProvider(contentProvider);
	    tv1.setLabelProvider(cellLabelProvider);
	    tv1.getControl().setLayoutData(GridDataFactory.fillDefaults().span(1, 1).grab(true, true).create());
	    tv1.getControl().setBackground(GUIToolkit.BG);
	    tv1.addSelectionChangedListener(
	        new ISelectionChangedListener() {
	    		@Override
	    		public void selectionChanged(SelectionChangedEvent event) {
	    			if (event.getSelection() instanceof IStructuredSelection) {
	    				Object obj = ((IStructuredSelection)event.getSelection()).getFirstElement();
	    				if (obj instanceof DataType) {
	    					handleWidgets((DataType) obj);
	    				}
	    			}
	    		}
	    	}
	    );
	    
	    getSite().setSelectionProvider(tv1);
	        
	    hookContextMenu();
	    
	    SashForm sash2 = new SashForm( sashBrowse, SWT.HORIZONTAL );    
	    createMap( sash2 );
	    
	    Composite controls = new Composite( sash2, SWT.BORDER );
	    controls.setLayout	( new GridLayout( 1, true ) );
	    createCenterControl	( sashBrowse.getDisplay(), controls );
	    createZoomControl	( controls );
	    createMapTypeControl( controls );
	    createAddressControl( sashBrowse.getDisplay(), controls );
	    //createMarkerControl	( sashRight.getDisplay(), controls );
	        
	    sash2.setWeights		( new int[] { 7, 1 } );
	    sashBrowse.setWeights	( new int[] { 1, 5 } );
	        
	    init();
	}
	
	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				//fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(tv1.getControl());
		tv1.getControl().setMenu(menu);

		getSite().registerContextMenu("#PopupMenu", menuMgr, tv1);
	}
	
	@SuppressWarnings("unused")
	private void fillContextMenu(IMenuManager manager) {
		ISelection sel = tv1.getSelection();
		if (sel instanceof IStructuredSelection) {
			Object o = ((IStructuredSelection)sel).getFirstElement();
			if (o instanceof EObject) {
				if (o instanceof EnvironmentType) {
					//manager.add(playAction);
					manager.add(manageTriggersAction);
				}
				// manager.add(editArduinoConfigurationAction);
				// drillDownAdapter.addNavigationActions(manager);
				// Other plug-ins can contribute there actions here
				manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));

			}
		}
	}

	
	
	Action filterDatastreamsAction;
	
	private void makeActions() {
		filterDatastreamsAction = new Action("Filter Data Streams", SWT.TOGGLE) {
			public void run() {
    			float lat = new Double(gmap.getCenter().latitude).floatValue();
    			float lon = new Double(gmap.getCenter().longitude).floatValue();
    			queryAroundFeeds(lat, lon, radius, isHideFrozenStreams());

				contentProvider.setHideFrozenStreams(filterDatastreamsButton.getSelection());
				setHideFrozenStreams(filterDatastreamsButton.getSelection());
				
				final Text text2 = filteredTree2.getFilterControl();
				text2.setText(text2.getText());
				
				final Text text1 = filteredTree1.getFilterControl();
				text1.setText(text1.getText());

				tv1.refresh();
			}
		};	
		filterDatastreamsAction.setToolTipText("Filter Data Streams");
		filterDatastreamsAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.pachube", 
				"icons/filter.png"
			)
		);
		manageTriggersAction = new Action("Manage Triggers", SWT.PUSH) {
			public void run() {
				StructuredSelection ssel = (StructuredSelection) tv1.getSelection();
				Object fElem = ssel.getFirstElement();
				if (fElem instanceof EnvironmentType) {
					TriggersManagementDialog dlg = new TriggersManagementDialog(Display.getDefault().getActiveShell(), cosmProject, (EnvironmentType) fElem);
					dlg.open();
				}
			}
		};	
		manageTriggersAction.setToolTipText("Manage Triggers");
		manageTriggersAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.pachube", 
				"icons/filter.png"
			)
		);
	}

	
    @SuppressWarnings("static-access")
	private void handleWidgets(DataType envType) {
    	if (envType instanceof DataType) {
			cosmProject.setLastDatastream((DataType)envType);
    		if (envType.eContainer() instanceof EnvironmentType) {
    			EnvironmentType env = (EnvironmentType) envType.eContainer();
	    		tv1.setExpandedState(env, true);
	    		
//	    		gmap.selectMarker(
//	    			new LatLng(env.getLocation().getLat(), env.getLocation().getLon()),
//	    			env.getTitle()
//	    		);
	    		
	    		String last = "";
				if (env != null && env.getFeed() != null && env.getFeed().contains("/")) { 
					String[] parts = env.getFeed().split("/");
					last = parts[parts.length-1];
					last = last.replace(".json", "");
					last = last.replace(".xml", "");
					last = last.replace(".csv", "");
				}
				/*
	    		for (Control c : widgetsMap.values()) {
	    			if (!c.isDisposed()) {
	    				c.dispose();
	    			}
	    		}
	    		widgetsMap.clear();
	    		*/
	    		final DataType d =  (DataType) envType;
	    		if (d instanceof DataType && !"".equals(last)) {
	    			//final PachubeDataWidget w = new PachubeDataWidget(inside1, d);
		   			HandleDataJob job = requestEnvTypeData(null, last, d, FeedKind.JSON);
		   			job.getJobManager().cancel(datastreamKEY);
		   			/*
		   			job.addJobChangeListener(new IJobChangeListener() {
						@Override
						public void sleeping(IJobChangeEvent event) {}
						@Override
						public void scheduled(IJobChangeEvent event) {}
						@Override
						public void running(IJobChangeEvent event) {}
						@Override
						public void done(IJobChangeEvent event) {
							w.setData(d);
							w.getChart().redraw();
						}
						@Override
						public void awake(IJobChangeEvent event) {}
						@Override
						public void aboutToRun(IJobChangeEvent event) {}
					});
					*/
		   			//widgetsMap.put(env.getFeed() + "_" + 0, w);
		   			job.schedule();
	    		}
    		}
 		}
    }



    void init() {
		ttl = new RefreshJob();
		ttl.schedule(3000);
		
		Activator.getDefault().getPreferenceStore().addPropertyChangeListener(new IPropertyChangeListener() {
			@Override
			public void propertyChange(org.eclipse.jface.util.PropertyChangeEvent event) {
				if (event.getProperty().equals(PreferenceConstants.P_APIKEY)) {
					ttl.schedule();
				}
			}
		});
	}
	@Override
	public boolean isSaveOnCloseNeeded() {
		return true;
	}
	@Override
	public void setFocus() {}
	
	//
	// Selection
	//
	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		listeners.add(listener);
	}
	@Override
	public ISelection getSelection() {
		return tv1.getSelection();
	}
	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		listeners.remove(listener);
	}
	@Override
	public void setSelection(ISelection selection) {
		if (selection instanceof StructuredSelection) {
			Object obj = ((StructuredSelection)selection).getFirstElement();
			if (obj instanceof EnvironmentType) {
				environmentType = (EnvironmentType) obj;
				if (environmentType.getData() != null && !environmentType.getData().isEmpty()) {
					try {
						
						IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
						if (window != null) {
							IWorkbenchPage page = window.getActivePage();
							if (page != null) {
								IViewPart viewPart = page.showView(IPageLayout.ID_PROP_SHEET);
								if (viewPart instanceof PropertySheet) {
									PropertySheet view = (PropertySheet) viewPart;
									Control control = view.getCurrentPage().getControl();
									if (control != null) {
										control.setBackground(GUIToolkit.BG);
										control.setForeground(GUIToolkit.FG);
									}
									control = view.getDefaultPage().getControl();
									if (control != null) {
										control.setBackground(GUIToolkit.BG);
										control.setForeground(GUIToolkit.FG);
									}
								}
							}
						}
					} catch (PartInitException e) {
						e.printStackTrace();
					}
					tv1.setSelection(new StructuredSelection(environmentType.getData().get(0)), true);
				}
			}
		}
		for (ISelectionChangedListener l : listeners) {
			l.selectionChanged(new SelectionChangedEvent(this, getSelection()));
		}
	}
	
	@Override
	public String getContributorId() {
		return "net.sf.smbt.ui.pachube";
	}
	
	
	//
	//
	// Feed
	//
	//
	
	private DataType handleJsonFeed(final String feed, final String datastream, JsonElement json) {
		if (json instanceof JsonElement && json.isJsonObject()) {
			JsonObject jsonObj = (JsonObject) json;
			if (jsonObj.get("totalResults") != null || jsonObj.get("datapoints") != null) {
				if (tv1 != null && !tv1.getControl().isDisposed()) {
					if (tv1.getInput()==null) {
						tv1.setInput(_5Factory.eINSTANCE.createEemlType());
					}
					final EemlType eeml = (EemlType) tv1.getInput();
					cosmProject.setEeml(eeml);
					
					if (jsonObj.get("totalResults") != null) {
						List<EnvironmentType> environments = PachubeUtils.INSTANCE.applyTotalResultsOnTreeViewer(feed, datastream, eeml, jsonObj);
						if (isHideFrozenStreams()) {
							List<EnvironmentType> toRemove = new ArrayList<EnvironmentType>();
							for (EnvironmentType e : environments) {
								if (e.getStatus().equals(StatusType.FROZEN)) {
									toRemove.add(e);
								}
							}
							environments.removeAll(toRemove);
						}
						String compactString = GMapUtils.INSTANCE.buildEnvironmentTypesCompactString(environments);
						boolean nothing = true;
						if (compactString != null && compactString.contains(":") && compactString.contains(",")) {
							if (compactString.contains("|")) {
								gmap.addMarkers( compactString );
							} else {
								gmap.addMarkerDetail( compactString );
							}
							nothing = false;
						}
						if (nothing) {
							gmap.clearMarkers();
						}
					} else if (jsonObj.get("datapoints") != null) {
						return PachubeUtils.INSTANCE.applyDataStreamsOnTreeViewer(feed, datastream, eeml, jsonObj);
					}
					
					new UIJob("refresh cosm") {
						@Override
						public IStatus runInUIThread(IProgressMonitor monitor) {
							tv1.refresh();
							for (EnvironmentType et : eeml.getEnvironment()) {
								for (DataType tt : et.getData()) {
									if (tt.getId().equals(datastream) && et.getId().equals(feed)) {
										tv1.setExpandedState(et, true);
										tv1.setExpandedElements(new Object[]{et});
										break;
									}
								}
							}
							return Status.OK_STATUS;
						}
					}.schedule();
				}
			} else if (jsonObj.get("location") != null){
				//handleLocationAndStreams(jsonObj);
			}
		}
		return null;
	}
	
	
	
	
	private void createMap( final Composite parent ) {
	    gmap = new GMap( parent, SWT.NONE );
	    gmap.setCenter( GeoUtils.stringToLatLng( INIT_CENTER ) );
	    gmap.setZoom( INIT_ZOOM );
	    gmap.setType( INIT_TYPE );
	    gmap.addDisposeListener(
	    	new DisposeListener() {
				@Override
				public void widgetDisposed(DisposeEvent e) {
				   	pachubeEngine.setLocked(false);
					QuanticMojo.INSTANCE.closePipe(pachubeEngine, true);
					doSaveAs();
				}
			}
	    );
	}

	private void createCenterControl( Display display, Composite parent ) {
	    Label zoomLabel = new Label( parent, SWT.None );
	    zoomLabel.setText( "Location:" );
	    zoomLabel.setForeground(GUIToolkit.FG);
	    
	    final Text location = new Text( parent, SWT.BORDER );
	    location.setLayoutData( new GridData( SWT.FILL, SWT.TOP, true, false ) );
	    location.setText( INIT_CENTER );
	    location.setFont( new 	Font(display, "Arial", 9, SWT.NORMAL ) );
	    location.addModifyListener( new ModifyListener() {
	      public void modifyText( ModifyEvent event ) {
	        gmap.setCenter( GeoUtils.stringToLatLng( location.getText() ) );
	      }
	    } );
	    gmap.addMapListener( 
	      new MapAdapter() {
	        public void centerChanged() {
	          location.setText( gmap.getCenter().toString() );
	        }
		    public void markerSelected(String id) {
			  boolean selected = true;
		    }
	      } 
	    );
	    
	    //
	    // Cosm Lon/lat 
	    //
	    gmap.addMapListener(
	    	new MapAdapter() {
	    		public void centerChanged() {
	    			new UbiJob("eeeeeeeeeee") {
	    				public IStatus runInUIThread(IProgressMonitor monitor) {
	    					float lat = new Double(gmap.getCenter().latitude).floatValue();
	    	    			float lon = new Double(gmap.getCenter().longitude).floatValue();
	    	    			queryAroundFeeds(lat, lon, radius, isHideFrozenStreams());	    					
	    	    			return Status.OK_STATUS;
	    				};
	    			}.schedule();
	    		}
				@Override
				public void markerSelected(final String id) {
	    			new UbiJob("eeeeeeeeeee") {
	    				public IStatus runInUIThread(IProgressMonitor monitor) {
	    	    			float lat = new Double(gmap.getCenter().latitude).floatValue();
	    	    			float lon = new Double(gmap.getCenter().longitude).floatValue();
	    	    			queryAroundFeeds(lat, lon, radius, isHideFrozenStreams());
	    	    			
	    	    	    	EemlType eeml = cosmProject.getEeml();
	    	    	    	if (eeml instanceof EemlType) {
	    	    	    	  for (EnvironmentType env : eeml.getEnvironment()) {
	    	    	    		if (env.getTitle() != null && env.getTitle().equals(id)) {
	    	    		    	  setSelection(new StructuredSelection(env));
	    	    		    	}
	    	    	    	  }
	    	    	    	}
	    	    			return Status.OK_STATUS;
	    				};
	    			}.schedule();
				}
	    	}
	    );
	}

	private void createZoomControl( Composite controls ) {
	    Label zoomLabel = new Label( controls, SWT.None );
	    zoomLabel.setText( "Zoom:" );
	    zoomLabel.setForeground(GUIToolkit.FG);
	    final Spinner zoom = new Spinner( controls, SWT.NORMAL );
	    zoom.setMaximum( 20 );
	    zoom.setMinimum( 0 );
	    zoom.setSelection( INIT_ZOOM );
	    zoom.addModifyListener( 
	      new ModifyListener() {
	        public void modifyText( ModifyEvent event ) {
	          gmap.setZoom( Integer.parseInt( zoom.getText() ) );
	        }
	      } 
	    );
	    gmap.addMapListener( 
	      new MapAdapter() {
	        public void zoomChanged() {
	          zoom.setSelection( gmap.getZoom() );              
	        }
		    public void markerSelected(String id) {
			  boolean selected = true;
		    }
	      } 
	    );
	}

	private void createMapTypeControl( Composite parent ) {
	    Label typeLabel = new Label( parent, SWT.None );
	    typeLabel.setText( "Type:" );
	    typeLabel.setForeground(GUIToolkit.FG);

	    final Combo type = new Combo( parent, SWT.DROP_DOWN | SWT.READ_ONLY );
	    type.setItems( new String[]{
	      "ROADMAP",
	      "SATELLITE",
	      "HYBRID",
	      "TERRAIN"
	    } );
	    type.setText( "ROADMAP" );
	    type.addSelectionListener( new SelectionAdapter() {
	      public void widgetSelected(SelectionEvent e) {
	        int index = type.getSelectionIndex();
	        if( index != -1 ) {
	          gmap.setType( index );
	        }
	      }
	    } );
	}

	private void createAddressControl( Display display, Composite parent ) {
	    Label addrLabel = new Label( parent, SWT.None );
	    addrLabel.setText( "Address:" );
	    addrLabel.setForeground(GUIToolkit.FG);

	    final Text addr = new Text( parent, SWT.BORDER );
	    addr.setLayoutData( new GridData( SWT.FILL, SWT.TOP, true, false ) );
	    addr.addSelectionListener( new SelectionAdapter() {
	      public void widgetDefaultSelected( SelectionEvent e ) {
	        gmap.gotoAddress( addr.getText() );
	      }
	    } );
	    addr.setFont( new Font(display, "Arial", 9, SWT.NORMAL ) );
	    Button goToAddr = new Button( parent, SWT.PUSH );
	    goToAddr.setText( "go to" );
	    goToAddr.addSelectionListener( new SelectionAdapter() {
	      public void widgetSelected( SelectionEvent e ) {
	        gmap.gotoAddress( addr.getText() );
	      }
	    } );
	    Button resolveAddr = new Button( parent, SWT.PUSH );
	    resolveAddr.setText( "resolve" );
	    resolveAddr.addSelectionListener( new SelectionAdapter() {
	      public void widgetSelected( SelectionEvent e ) {
	        gmap.resolveAddress();
	      }
	    } );
	    gmap.addMapListener( new MapAdapter() {
	      public void addressResolved() {
	        addr.setText( gmap.getAddress() );
	      }
	      public void markerSelected(String id) {
	      }
	    } 
	  );
	}
	public void stop() {}
}
