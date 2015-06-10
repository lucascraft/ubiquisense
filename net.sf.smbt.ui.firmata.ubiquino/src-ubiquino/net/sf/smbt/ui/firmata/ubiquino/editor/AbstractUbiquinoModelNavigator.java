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

import javax.swing.text.View;

import net.sf.smbt.mdl.arduino.Arduino;
import net.sf.smbt.mdl.arduino.util.ArduinoAdapterFactory;
import net.sf.smbt.ui.firmata.ubiquino.controller.FirmataCompseableAdapterFactory;
import net.sf.smbt.ui.firmata.ubiquino.controller.UbiquinoArduinoBoardContentProvider;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
//import org.eclipse.emf.ecoretools.diagram.ui.outline.NavigatorLabelProvider;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.IViewerNotification;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.part.IPageSite;

public abstract class AbstractUbiquinoModelNavigator extends Composite implements IMenuListener {

	private UbiquinoEditor editor;
	private TreeViewer viewer;
	private IPageSite site;

	private Adapter modelListener = new AdapterImpl() {
		@Override
		public void notifyChanged(Notification msg) {
			refreshViewer(true);
		}
	};

	protected class NavigatorAdapterFactoryContentProvider extends AdapterFactoryContentProvider {

		/**
		 * Constructor
		 * 
		 * @param adapterFactory
		 *            the factory
		 */
		public NavigatorAdapterFactoryContentProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		/**
		 * @see org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider#notifyChanged(org.eclipse.emf.common.notify.Notification)
		 */
		@Override
		public void notifyChanged(Notification notification) {
			if (notification instanceof IViewerNotification) {
				
				Object element = ((IViewerNotification) notification).getElement();
				if (!(element instanceof View)) {
					// Filter only non-graphical object events
					super.notifyChanged(notification);
				} /*else if ((element instanceof Diagram) && ((IViewerNotification) notification).isLabelUpdate()) {
					// A diagram or a Diagrams is added or removed : refresh the
					// whole tree
					refreshViewer(true);
				} */
				
			} else {
				super.notifyChanged(notification);
			}
		}
	}

	/**
	 * Constructor
	 * 
	 * @param parent		the parent composite
	 * @param diagEditor	the viewer to edit as tree
	 * @param pageSite		the site
	 */
	public AbstractUbiquinoModelNavigator(Composite parent, UbiquinoEditor diagEditor, IPageSite pageSite) {
		super(parent, SWT.BORDER);

		this.editor = diagEditor;
		site = pageSite;
		GridLayout gl = new GridLayout();
		gl.marginHeight = 0;
		gl.marginWidth = 0;
		setLayout(gl);
		createContents(this);
	}

	/**
	 * Returns the TreeViewer used as navigator
	 * 
	 * @return the navigable tree
	 */
	public TreeViewer getTreeViewer() {
		return viewer;
	}

	/**
	 * Create the contents of the widget
	 * 
	 * @param parent
	 *            the current widget
	 */
	protected void createContents(Composite parent) {
		FilteredTree tree = new FilteredTree(parent, SWT.MULTI, new PatternFilter(), true);
		tree.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_WHITE));
		tree.setLayoutData(new GridData(GridData.FILL_BOTH));

		viewer = tree.getViewer();
		viewer.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));

		initDragAndDrop();
		initProviders();
		initFilters();
		hookListeners();
		hookKeyListeners();

		Arduino board = getEditor().getUbiquino().getBoard();
		
		viewer.setContentProvider(new UbiquinoArduinoBoardContentProvider(board));
		viewer.setLabelProvider(
			new AdapterFactoryLabelProvider(
				new FirmataCompseableAdapterFactory()
			)
		);
		
		// Add our custom ElementComparer that unwrap model objects before the
		// comparison
		//viewer.setComparer(new ModelElementComparer());
		
		if (getEditor() != null && getEditor().getUbiquino() != null) {
			viewer.setInput(board);
		}

		createContextMenu(viewer);

		refreshViewer();
	}

	/**
	 * The diagram model Resource
	 * 
	 * @return Resource
	 */
	protected Resource getDiagramResource() {
		/*
		if (diagramViewer != null && diagramViewer.getContents() != null) {
			Object model = diagramViewer.getContents().getModel();
			if (model instanceof Diagram) {
				return ((Diagram) model).eResource();
			}
		}
		 */
		return null;
	}

	/**
	 * The domain model Resource
	 * 
	 * @return Resource
	 */
	protected Resource getModelResource() {
/*
		Object model = diagramViewer.getContents().getModel();
		if (model instanceof Diagram) {
			EObject eObject = ((Diagram) model).getElement();
			return EcoreUtil.getRootContainer(eObject).eResource();
		}
*/
		return null;
	}

	/**
	 * Add drag and drop ability between the outline to the editor.
	 */
	protected void initDragAndDrop() {
//		int ops = DND.DROP_COPY | DND.DROP_MOVE;

//		OutlineDragAdapter dragAdapter = new OutlineDragAdapter(viewer);
//		viewer.addDragSupport(ops, dragAdapter.getSupportedDragTransfers(), dragAdapter);

		// Transfer[] transfers = new Transfer[]
		// {OutlineToDiagramTransfer.getInstance()};
		// viewer.addDragSupport(ops, transfers, new
		// OutlineDragAdapter(viewer));

		// // TODO restore EMF internal drag and drop (need model refactoring
		// // capabilities)
		// int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
		// Transfer[] transfers = new Transfer[] {LocalTransfer.getInstance()};
		// viewer.addDragSupport(dndOperations, transfers, new
		// ViewerDragAdapter(viewer));
		// viewer.addDropSupport(dndOperations, transfers, new
		// EditingDomainViewerDropAdapter(modeler.getEditingDomain(),
		// viewer));
	}

	/**
	 * Set the tree providers for the outline
	 */
	protected void initProviders() {
		AdapterFactoryContentProvider adapterContentProvider = new NavigatorAdapterFactoryContentProvider(getAdapterFactory());
		adapterContentProvider.inputChanged(viewer, null, null);

		viewer.setContentProvider(new UbiquinoArduinoBoardContentProvider(editor.getUbiquino().getBoard()));
		viewer.setLabelProvider(
			new AdapterFactoryLabelProvider(
				new ArduinoAdapterFactory()
			)
		);
		
//		ILabelProvider fullLabelProvider = new DecoratingLabelProvider(new NavigatorLabelProvider(new AdapterFactoryLabelProvider(getAdapterFactory())), Activator.getDefault().getWorkbench()
//				.getDecoratorManager().getLabelDecorator());
//		viewer.setLabelProvider(fullLabelProvider);
	}

	/**
	 * Set the tree filters for the outline
	 * 
	 */
	protected void initFilters() {
		// TODO Complete This later
		// IPreferenceStore ps = modeler.getPreferenceStore();
		// Collection configs = FiltersAction.getFilterConfigurations(ps != null
		// ?
		// ps.getString(ModelerPreferenceConstants.FILTERS_PREF) : "");
		//
		// for (Iterator it = configs.iterator(); it.hasNext();)
		// {
		// FilterConfiguration config = (FilterConfiguration) it.next();
		// viewer.addFilter(config.getFilter());
		// }

	}

	/**
	 * Add listeners : <br>
	 * - on the model<br>
	 */
	protected void hookListeners() {
		if (getModelResource() != null && getModelResource().getResourceSet() != null) {
			getModelResource().getResourceSet().eAdapters().add(modelListener);
		}
		if (getDiagramResource() != null) {
			getDiagramResource().eAdapters().add(modelListener);
		}
	}

	/**
	 * Remove listeners
	 */
	protected void unhookListeners() {
		if (getDiagramResource() != null) {
			getDiagramResource().eAdapters().remove(modelListener);
		}
		if (getModelResource() != null && getModelResource().getResourceSet() != null) {
			getModelResource().getResourceSet().eAdapters().remove(modelListener);
		}
	}

	/**
	 * Add a key listener to the tree control. When a key is released, the
	 * DELETE key is filtered to fire the action.
	 */
	protected void hookKeyListeners() {
		KeyListener keyListener = new KeyListener() {

			public void keyPressed(KeyEvent e) {
				// Do nothing
			}

			public void keyReleased(KeyEvent e) {
				if (e.keyCode == SWT.DEL) {
					// TODO Restore this
					// IAction deleteAction = createDeleteAction();
					// deleteAction.run();
				}
			}

		};
		viewer.getControl().addKeyListener(keyListener);
	}

	/**
	 * This creates a context menu for the viewer and adds a listener as well
	 * registering the menu for extension.
	 * 
	 * @param sViewer
	 *            the tree viewer
	 */
	protected void createContextMenu(StructuredViewer sViewer) {
		MenuManager contextMenu = new MenuManager("#PopUp"); //$NON-NLS-1$
		contextMenu.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
		contextMenu.setRemoveAllWhenShown(true);
		contextMenu.addMenuListener(this);
		Menu menu = contextMenu.createContextMenu(viewer.getControl());
		sViewer.getControl().setMenu(menu);
		site.registerContextMenu(getClass().getName(), contextMenu, viewer);
	}

	/**
	 * Get the resource associated with the given selected object
	 * 
	 * @param selection
	 *            the selected object
	 * @return the EMF resource
	 */
	/*
	private Resource getResourceFromSelection(Object selection) {
		Resource resource = null;

		if (selection instanceof EObject) {
			resource = ((EObject) selection).eResource();
		} else if (selection instanceof Resource) {
			resource = (Resource) selection;
		} else if ((selection instanceof IWrapperItemProvider) || (selection instanceof FeatureMap.Entry)) {
			resource = ((EObject) AdapterFactoryEditingDomain.unwrap(selection)).eResource();
		}

		return resource;
	}
	*/

	/**
	 * This implements {@link org.eclipse.jface.action.IMenuListener}to help
	 * fill the context menus with contributions from the Edit menu.
	 * 
	 * @param menuManager
	 *            the menu to fill
	 */
	public void menuAboutToShow(IMenuManager menuManager) {

		// Add our standard marker.
		//
		/*
		menuManager.add(new Separator(IOutlineMenuConstants.NEW_GROUP));
		menuManager.add(new Separator(IOutlineMenuConstants.EDIT_GROUP));
		menuManager.add(new Separator(IOutlineMenuConstants.ADDITIONS_GROUP));
		menuManager.add(new Separator(IOutlineMenuConstants.PROPERTIES_GROUP));
		menuManager.add(new Separator(IOutlineMenuConstants.ADDITIONS_END_GROUP));
		*/
//		IStructuredSelection sel = (IStructuredSelection) viewer.getSelection();

//		Object currentSel = sel.getFirstElement();
//		Resource resource = getResourceFromSelection(currentSel);

		// Create context menu if the resource associated to the current
		// selection is writable.
		
		/*
		if (currentSel instanceof AdditionalResources || resource != null) // &&
		// !ResourceUtils.isReadOnly(resource)))
		{
			if (sel.size() == 1) {
				Object selection = sel.getFirstElement();
				createSingleSelectionMenu(menuManager, selection);
			}

			createMultiSelectionMenu(menuManager, sel);
		}
		*/
	}

	/**
	 * Add to the MenuManager the actions for a multiple selection.
	 * 
	 * @param manager
	 *            The menu to fill
	 * @param selection
	 *            the selection
	 */
	protected void createMultiSelectionMenu(IMenuManager manager, IStructuredSelection selection) {
		IEditingDomainProvider domainProvider = (IEditingDomainProvider) editor.getAdapter(IEditingDomainProvider.class);
		if (domainProvider != null) {
			// TODO Restore this
			// Add the delete from model action
			// DeleteAction deleteAction = new DeleteAction(domain,
			// editor.getDiagram(), selection);
			// manager.appendToGroup(IOutlineMenuConstants.EDIT_GROUP,
			// deleteAction);

			// Add load resource action
			// LoadResourceAction loadAction = new LoadResourceAction(domainProvider.getEditingDomain());
			// manager.appendToGroup(IOutlineMenuConstants.ADDITIONS_END_GROUP, loadAction);
		}
	}

	/**
	 * Add to the MenuManager the actions for a single object.
	 * 
	 * @param manager
	 *            The menu to fill
	 * @param selection
	 *            the selected object
	 */
	/*
	private void createSingleSelectionMenu(IMenuManager manager, Object selection) {
		EObject selectedObject = null;

		if (selection instanceof EObject) {
			selectedObject = (EObject) selection;
		} else if ((selection instanceof IWrapperItemProvider) || (selection instanceof FeatureMap.Entry)) {
			selectedObject = (EObject) AdapterFactoryEditingDomain.unwrap(selection);
		}

		if (selectedObject != null) {
			if (isEMFMenuEnabledFor(selectedObject)) {
				createEMFMenu(manager, selectedObject);
			}
			if (isDiagramsMenuEnabledFor(selectedObject)) {
				createDiagramsMenu(manager, selectedObject);
			}
			if (isControlActionEnabledFor(selectedObject)) {
				createControlActions(manager);
			}
		}
	}
*/
	/**
	 * Subclasses should override this method to control enabling/disabling the
	 * EMF menu for the current selection.
	 * 
	 * Default returns true.
	 * 
	 * @param selectedObject
	 * @return whether the control action is enabled for the current selection
	 *         or not.
	 */
	protected boolean isEMFMenuEnabledFor(EObject selectedObject) {
		return true;
	}

	/**
	 * Subclasses should override this method to add/remove actions related to
	 * EMF stuff
	 * 
	 * @param manager
	 *            the IMenuManager
	 * @param selectedObject
	 *            the selected model object
	 */
	protected void createEMFMenu(IMenuManager manager, EObject selectedObject) {
//
//		if (!isEMFMenuEnabledFor(selectedObject)) {
//			return;
//		}
//		ISharedImages sharedImages = PlatformUI.getWorkbench().getSharedImages();
//
//		final TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(getDiagramResource());
//		final IStructuredSelection structuredSelection = new StructuredSelection(selectedObject);
//
//		Collection<?> newChildDescriptors = editingDomain.getNewChildDescriptors(selectedObject, null);
//		Collection<?> newSiblingDescriptors = editingDomain.getNewChildDescriptors(null, selectedObject);
//
//		/*
//		if (newChildDescriptors.size() > 0) {
//			MenuManager menuManager = new MenuManager(Messages.AbstractModelNavigator_NewChild);
//			for (Object descriptor : newChildDescriptors) {
//				menuManager.add(new CreateChildAction(getEditor(), structuredSelection, descriptor));
//			}
//			manager.add(menuManager);
//		}
//		if (newSiblingDescriptors.size() > 0) {
//			MenuManager menuManager = new MenuManager(Messages.AbstractModelNavigator_NewSibling);
//			for (Object descriptor : newSiblingDescriptors) {
//				menuManager.add(new CreateSiblingAction(getEditor(), structuredSelection, descriptor));
//			}
//			manager.add(menuManager);
//		}
//		manager.add(new Separator());
//
//		UndoAction undoAction = new UndoAction(editingDomain);
//		undoAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_UNDO));
//		manager.add(new ActionContributionItem(undoAction));
//
//		RedoAction redoAction = new RedoAction(editingDomain);
//		redoAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_REDO));
//		manager.add(new ActionContributionItem(redoAction));
//
//		manager.add(new Separator());
//
//		CopyAction copyAction = new CopyAction(editingDomain);
//		copyAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_COPY));
//		manager.add(new ActionContributionItem(copyAction));
//
//		CutAction cutAction = new CutAction(editingDomain);
//		cutAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_CUT));
//		manager.add(new ActionContributionItem(cutAction));
//
//		PasteAction pasteAction = new PasteAction(editingDomain);
//		pasteAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_PASTE));
//		manager.add(new ActionContributionItem(pasteAction));
//
//		manager.add(new Separator());
//
//		DeleteAction deleteAction = new DeleteAction(editingDomain, true);
//		deleteAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_DELETE));
//		manager.add(new ActionContributionItem(deleteAction));
//
//		manager.add(new Separator());
//
//		ValidateAction validateAction = new ValidateAction();
//		manager.add(new ActionContributionItem(validateAction));
//
//		ControlAction controlAction = new ControlAction(editingDomain);
//		manager.add(new ActionContributionItem(controlAction));
//
//		manager.add(new Separator());
//
//		copyAction.updateSelection(structuredSelection);
//		cutAction.updateSelection(structuredSelection);
//		pasteAction.updateSelection(structuredSelection);
//		deleteAction.updateSelection(structuredSelection);
//		validateAction.updateSelection(structuredSelection);
//		controlAction.updateSelection(structuredSelection);
//		*/
	}

	/**
	 * Subclasses should override this method to control enabling/disabling the
	 * Diagrams menu for the current selection.
	 * 
	 * Default returns true.
	 * 
	 * @param selectedObject
	 * @return whether the control action is enabled for the current selection
	 *         or not.
	 */
	protected boolean isDiagramsMenuEnabledFor(EObject selectedObject) {
		return true;
	}

	/**
	 * Subclasses should override this method to add their own actions related
	 * to Diagram stuff
	 * 
	 * @param manager
	 *            the IMenuManager
	 * @param selectedObject
	 *            the selected model object
	 */
	protected void createDiagramsMenu(IMenuManager manager, EObject selectedObject) {
		/*
		if (selectedObject instanceof Diagram) {
			manager.appendToGroup(IOutlineMenuConstants.NEW_GROUP, new DuplicateDiagramAction((Diagram) selectedObject));
			manager.appendToGroup(IOutlineMenuConstants.NEW_GROUP, new RenameDiagramAction((Diagram) selectedObject));
			// Check that this is not the current diagram
			if (getEditor().getDiagram() != selectedObject) {
				manager.appendToGroup(IOutlineMenuConstants.NEW_GROUP, new DeleteDiagramAction((Diagram) selectedObject));
			}
		}
		*/
	}

	/**
	 * Subclasses should override this method to control enabling/disabling the
	 * control action for the current selection.
	 * 
	 * Default returns true.
	 * 
	 * @param selectedObject
	 * @return whether the control action is enabled for the current selection
	 *         or not.
	 */
	protected boolean isControlActionEnabledFor(EObject selectedObject) {
		return true;
	}

	/**
	 * Subclasses should override this method to add their own actions related
	 * to Control/Uncontrol actions
	 * 
	 * @param manager
	 *            the IMenuManager
	 */
//	private void createControlActions(IMenuManager manager) {
//		// Empty implementation
//	}
	protected final void refreshViewer() {
		refreshViewer(false);
	}
	protected final void refreshViewer(final boolean updateLabel) {
		if ((viewer != null) && !viewer.getTree().isDisposed() /*&& diagramViewer.getContents() != null*/) {
			if (Display.getCurrent() != Display.getDefault()) {
				syncRefreshViewer(updateLabel);
			} else {
				viewer.refresh(updateLabel);
			}
		}
	}
	private void syncRefreshViewer(final boolean updateLabel) {
		viewer.getControl().getDisplay().syncExec(new Runnable() {

			public void run() {
				viewer.refresh(updateLabel);
			}
		});
	}
	@Override
	public void dispose() {
		unhookListeners();
		super.dispose();
	}
	protected UbiquinoEditor getEditor() {
		return editor;
	}
	protected abstract AdapterFactory getAdapterFactory();

}
