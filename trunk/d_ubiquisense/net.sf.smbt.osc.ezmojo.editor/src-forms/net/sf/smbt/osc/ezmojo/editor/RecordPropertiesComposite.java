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

import org.eclipse.pde.emfforms.editor.PDEFormToolkit;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;


/**
 * This composite is the one for the first tab in
 *         {@link RecordEditor}
 */
public class RecordPropertiesComposite extends Composite
{

	private Text _textName;

	private Text _textareaDescription;

	public RecordPropertiesComposite(Composite parent)
	{
		super(parent, SWT.None);
		createContent();
	}

	private void createContent()
	{
		_textName = PDEFormToolkit.createLabelAndText("Messages.SOURCE_PROPERTIES_NAME_LABEL", this);
		_textName.setEnabled(false);

		_textareaDescription = PDEFormToolkit.createLabelAndTextArea(
				"Messages.SOURCE_PROPERTIES_DESCRIPTION_LABEL", this, true);
		GridData descGD = (GridData) _textareaDescription.getLayoutData();
		descGD.heightHint = 40;
	}

	public Text getTextName()
	{
		return _textName;
	}

	public Text getTextareaDescription()
	{
		return _textareaDescription;
	}

}
