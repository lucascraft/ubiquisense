package net.sf.smbt.osc.ezmojo.editor;

import net.sf.smbt.ezmojo.EzmojoPackage;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.pde.emfforms.editor.AbstractEmfFormPage;
import org.eclipse.pde.emfforms.editor.EmfFormEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Section;

public class EZMojoFormPage extends AbstractEmfFormPage
{
	// Composites
	private RecordPropertiesComposite _propertiesComposite;

	private MethodsMasterDetails _masterDetail;

	public EZMojoFormPage(EmfFormEditor<?> editor)
	{
		super(editor, 1, true);
	}

	// ----------------------------------------------------------//
	// -- HMI ---------------------------------------------------//
	// ----------------------------------------------------------//
	@Override
	public void createContents(Composite parent)
	{
		Composite body = this.getManagedForm().getForm().getBody();
		createPropertiesSection(body);
		createMasterDetail(body);
		adaptComposites();
	}

	protected void adaptComposites()
	{
		getFormToolkit().adapt(_propertiesComposite);
	}

	private void createMasterDetail(Composite parent)
	{
		_masterDetail = new MethodsMasterDetails(getEditor());
		_masterDetail.createContent(this.getManagedForm());
	}

	private void createPropertiesSection(Composite parent)
	{
		Section s = getFormToolkit().createSection(parent, Section.TITLE_BAR);
		s.marginWidth = 5;
		GridDataFactory.fillDefaults().grab(true, false).applyTo(s);
		s.setText("Messages.SOURCE_PROPERTIES_SECTION_TITLE");
		_propertiesComposite = new RecordPropertiesComposite(s);
		s.setClient(_propertiesComposite);

	}

	// ----------------------------------------------------------//
	// -- Data Binding ------------------------------------------//
	// ----------------------------------------------------------//

	@Override
	public void bind(DataBindingContext bindingContext)
	{

		bindingContext.bindValue(ViewersObservables.observeInput(_masterDetail.getTreeViewer()),
				getEditor().getInputObservable(), null, null);

		EditingDomain editingDomain = ((EZMojoFormEditor) getEditor()).getEditingDomain();

		// -- Bind the Name
		bindingContext.bindValue(SWTObservables.observeText(_propertiesComposite.getTextName(),
				SWT.FocusOut), EMFEditObservables.observeDetailValue(Realm.getDefault(),
				editingDomain, getObservedValue(), EzmojoPackage.eINSTANCE.getEZMojoNode_Token()),
				null, null);

		// -- Bind the Description
		bindingContext.bindValue(SWTObservables.observeText(_propertiesComposite
				.getTextareaDescription(), SWT.FocusOut), EMFEditObservables.observeDetailValue(
				Realm.getDefault(), editingDomain, getObservedValue(), EzmojoPackage.eINSTANCE.getEZMojoNode_Forwards()), null, null);

	}

	// ----------------------------------------------------------//
	// -- Getters -----------------------------------------------//
	// ----------------------------------------------------------//

	protected IObservableValue getObservedValue()
	{
		return ((EZMojoFormEditor) getEditor()).getInputObservable();
	}

	// ----------------------------------------------------------//
	// -- Overridden methods ------------------------------------//
	// ----------------------------------------------------------//

	@Override
	public String getId()
	{
		return "m2m.record.editor.general"; //$NON-NLS-1$
	}

	@Override
	public Viewer getViewer()
	{
		return null;
	}
}

