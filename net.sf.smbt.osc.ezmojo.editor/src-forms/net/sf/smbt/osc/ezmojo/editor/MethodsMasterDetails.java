/*******************************************************************************
 * Copyright (c) 2011 Sierra Wireless and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sierra Wireless - initial API and implementation
 *******************************************************************************/
package net.sf.smbt.osc.ezmojo.editor;

import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.pde.emfforms.editor.EmfFormEditor;
import org.eclipse.pde.emfforms.editor.EmfMasterDetailBlock;
import org.eclipse.pde.emfforms.editor.actions.AbstractAddAction;
import org.eclipse.pde.emfforms.editor.actions.RemoveAction;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IManagedForm;


public class MethodsMasterDetails extends EmfMasterDetailBlock
{
	private static final String NEW_METHOD_NAME = "input";

	public static final int SOURCE_COMPONENT_CLASS = 0;

	public static final int RECORD_COMPONENT_CLASS = 1;

	private EditingDomain _editingDomain;

	// -- Actions
	private AbstractAddAction addAction;

	private RemoveAction removeAction;

	public MethodsMasterDetails(EmfFormEditor<?> editor)
	{
		super(editor, "Messages.ACTION");
		_editingDomain = editor.getEditingDomain();

	}

	// ----------------------------------------------------------//
	// -- HMI ---------------------------------------------------//
	// ----------------------------------------------------------//

	/**
	 * @see org.eclipse.ui.forms.MasterDetailsBlock#createContent(org.eclipse.ui.forms.IManagedForm)
	 */
	@Override
	public void createContent(IManagedForm managedForm)
	{
		super.createContent(managedForm);

		// add ENTER shortcut
		getTreeViewer().getTree().addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(org.eclipse.swt.events.KeyEvent e)
			{
				if (e.keyCode == Action.findKeyCode("ENTER")) { //$NON-NLS-1$
					if (addAction != null)
						addAction.run();
				}
			}
		});
	}

	// ----------------------------------------------------------//
	// -- Actions -----------------------------------------------//
	// ----------------------------------------------------------//

	/**
	 * @see org.eclipse.pde.emfforms.editor.EmfMasterDetailBlock#createCustomToolbarAddAction()
	 */
	@Override
	protected AbstractAddAction createCustomToolbarAddAction()
	{

		if (addAction == null)
		{
			addAction = new AbstractAddAction(this) {

				@Override
				protected Object createNewObject(EmfMasterDetailBlock masterDetail)
				{
					/*
					// the add action uses a wizard only if it's not a
					// RecordComponentClass
					// because a RecordComponentClass is only an INPUT & EVENT
					// method
					ComponentClass componentClass = (ComponentClass) getEditor()
							.getCurrentEObject();

					if (isRecordComponentClass())
					{
						// get first datatype
						Set<String> availableDataTypes = NavigationHelper.getAvailableDataTypes(
								componentClass, false);
						Iterator<String> iterator = availableDataTypes.iterator();
						String datatype = "";
						if (iterator.hasNext())
							datatype = iterator.next();

						// create method
						Method newMethod = CustomM2MFactory.createMethod(MethodKind.VALUE,
								MethodDirection.INPUT, datatype, componentClass);

						ArrayList<String> actualNames = new ArrayList<String>();
						for (Method method : componentClass.getMethods())
						{
							actualNames.add(method.getName());
						}
						newMethod.setName(NameHelper.computeNewName(NEW_METHOD_NAME, actualNames));

						// create the method using the commandStack
						Command c = AddCommand.create(_editingDomain, componentClass,
								M2MPackage.eINSTANCE.getComponentClass_Methods(), newMethod);
						_editingDomain.getCommandStack().execute(c);

						// launch refactoring if necessary
						AbstractM2MRefactoring refactoring = new AddMethodRefactoring();
						refactoring.runRefactoring(componentClass, newMethod);

						return newMethod;
					}

					// create wizard to create a Method if it s not a
					// RecordComponentClass
					NewMethodWizard wizard = new NewMethodWizard(_editingDomain);
					wizard.init(PlatformUI.getWorkbench(), new StructuredSelection(componentClass));

					WizardDialog dialog = new WizardDialog(PlatformUI.getWorkbench()
							.getActiveWorkbenchWindow().getShell(), wizard);
					dialog.create();
					if (dialog.open() == Window.OK)
					{
						// a method have been created.
						// we have to check if a refactoring is necessary.

						// Get the new method
						Method method = wizard.getNewMethod();

						// launch refactoring if necessary
						AbstractM2MRefactoring refactoring = new AddMethodRefactoring();
						refactoring.runRefactoring(componentClass, method);
						return method;
					}
					
					*/

					return null;
				}
			};
		}
		return addAction;
	}

	// ----------------------------------------------------------//
	// -- Tools -------------------------------------------------//
	// ----------------------------------------------------------//

	private boolean isRecordComponentClass()
	{
//		final ComponentClass componentClass = (ComponentClass) getEditor().getCurrentEObject();
//		return (componentClass instanceof RecordComponentClass);
		
		return true;
	}

	// ----------------------------------------------------------//
	// -- Overridden methods ------------------------------------//
	// ----------------------------------------------------------//

	@Override
	protected void createToolBarActions(IManagedForm managedForm)
	{
		// split master/details weights in % of the width
		sashForm.setWeights(new int[] { 55, 45 });
	}

	@Override
	public IDetailsPage getPage(Object key)
	{
		/*
		if (key instanceof Method)
			return new MethodPart(getEditor());
		*/
		return null;
	}

	@Override
	public Object getPageKey(Object object)
	{
		return object;
	}

	@Override
	protected ViewerFilter getTreeFilter()
	{
		return new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element)
			{
				Object unwrap = AdapterFactoryEditingDomain.unwrap(element);
				/*
				if (!(unwrap instanceof Method))
					return false;

				Method method = (Method) unwrap;

				// don't display OUTPUT_VALUE Method in Record Component Class
				if (isRecordComponentClass())
					return (method.getKind() == MethodKind.VALUE)
							&& (method.getDirection() == MethodDirection.INPUT);

				 */
				return true;
			}
		};
	}
}
