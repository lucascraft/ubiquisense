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

package net.sf.smbt.ui.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.jface.bindings.keys.ParseException;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.fieldassist.SimpleContentProposalProvider;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.SelectionDialog;

public class MidiMessageCreationDialog extends SelectionDialog {
	private Float factor;
	
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

    /**
     * List to display the resolutions.
     */
    private TreeViewer ezTreeViewer;

   	private ControlDecoration decFactor;
	private ContentProposalAdapter adapterFactor;
	private FieldDecoration infoFieldIndicator, errorFieldIndicator;
	
	private List<String> lastTenFactor;

    private Text factorText;

	public MidiMessageCreationDialog(Shell parentShell, String shellTitle, String shellMessage, float factor) {
		super(parentShell);
		
	    setTitle(shellTitle);
	    setMessage(shellMessage);
	
	    setFactor(factor);
	    
	    lastTenFactor = new ArrayList<String>();
	    lastTenFactor.add("1");
	    
	    setSelectionResult(new Object[0]);
	    
	}
	
    /**
     * Constructor w/ arguments
     *  
     * @param parentShell parent {@link Shell}
     * @param shellTitle {@link Shell} title
     * @param shellMessage {@link Shell} message
     */
	public MidiMessageCreationDialog(Shell parentShell, String shellTitle, String shellMessage) {
		this(parentShell, shellTitle, shellMessage, 1f);
	}
	
	public Float getFactor() {
		return factor;
	}
	public void setFactor(Float factor) {
		this.factor = factor;
	}
	
	private String[] midiCommands = new String[] {"NoteOn", "NoteOff", "CC", "Bend", "Pitch", "Progam Change"};
	
	private Integer[] channels = new Integer[]{1, 2, 3, 4, 5, 6,  7,   8,  9,  10, 11, 12, 13, 14 ,15 ,16};
	private Integer[] values = new Integer[]
	{
		 1,   2,   3,   4,   5,   6,   7,  8,    9,  10,  11,  12,  13,  14,  15,  16,
		17,  18,  19,  20,  21,  22,  23,  24,  25,  26,  27,  28,  29,  30,  31,  32, 
		33,  34,  35,  36,  37,  38,  39,  40,  41,  42,  43,  44,  45,  46,  47,  48, 
		49,  50,  51,  52,  53,  54,  55,  56,  57,  58,  59,  60,  61,  62,  63,  64,
		65,  66,  67,  68,  69,  70,  71,  72,  73,  74,  75,  76,  77,  78,  79,  80, 
		81,  82,  83,  84,  85,  86,  87,  88,  89,  90,  91,  92,  93,  94,  95,  96,
		97,  98,  99,  100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112,
		113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127
	};
	
    /* (non-Javadoc)
     * Method declared on Dialog.
     */
    protected Control createDialogArea(Composite parent) {
        Composite composite = (Composite) super.createDialogArea(parent);

        createMessageArea(composite);
        
        createFactorArea(composite);
        
		// Label for owner field
		Label msgLabel = new Label(composite, SWT.NONE);
		msgLabel.setText("Midi Message : ");


		ComboViewer midiCmdCombo = new ComboViewer(new Combo(composite, SWT.READ_ONLY));
		midiCmdCombo.getCombo().setLayoutData(GridDataFactory.fillDefaults().hint(120, SWT.DEFAULT).create());
		midiCmdCombo.setContentProvider(new ArrayContentProvider());
		midiCmdCombo.setLabelProvider(new LabelProvider());
		midiCmdCombo.setInput(midiCommands);
		midiCmdCombo.setSelection(new StructuredSelection(midiCommands[0]));

		ComboViewer midiChannelCombo = new ComboViewer(new Combo(composite, SWT.READ_ONLY));
		midiChannelCombo.getCombo().setLayoutData(GridDataFactory.fillDefaults().hint(120, SWT.DEFAULT).create());
		midiChannelCombo.setContentProvider(new ArrayContentProvider());
		midiChannelCombo.setLabelProvider(new LabelProvider());
		midiChannelCombo.setInput(channels);
		midiChannelCombo.setSelection(new StructuredSelection(channels[0]));

		ComboViewer midiValueCombo = new ComboViewer(new Combo(composite, SWT.READ_ONLY));
		midiValueCombo.getCombo().setLayoutData(GridDataFactory.fillDefaults().hint(120, SWT.DEFAULT).create());
		midiValueCombo.setContentProvider(new ArrayContentProvider());
		midiValueCombo.setLabelProvider(new LabelProvider());
		midiValueCombo.setInput(values);
		midiValueCombo.setSelection(new StructuredSelection(values[0]));
		
        composite.layout(true);
        composite.pack(true);
        
        return composite;
    }
    
    private void createFactorArea(Composite composite) {
        //
        // 
        //
        Label lbl = new Label(composite, SWT.READ_ONLY);
        lbl.setText("Factor : ");
        
        factorText = new Text(composite, SWT.BORDER);
        factorText.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
        
        factorText.setText("" + factor);
        
        factorText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				new FloatValidator().validate();
			}
		});
        
		// Create a control decoration to indicate an error.
		decFactor = new ControlDecoration(factorText, SWT.TOP | SWT.LEFT);
		infoFieldIndicator = FieldDecorationRegistry.getDefault().getFieldDecoration(FieldDecorationRegistry.DEC_CONTENT_PROPOSAL);
		errorFieldIndicator = FieldDecorationRegistry.getDefault().getFieldDecoration(FieldDecorationRegistry.DEC_ERROR);
		decFactor.setImage(infoFieldIndicator.getImage());
		decFactor.setDescriptionText(infoFieldIndicator.getDescription());
		
		KeyStroke keyStroke = null;
		try {
			keyStroke = KeyStroke.getInstance("Ctrl+Space");
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		// assume that myTextControl has already been created in some way
		adapterFactor = new ContentProposalAdapter(
			factorText, new TextContentAdapter(), 
			new SimpleContentProposalProvider(
				lastTenFactor.toArray(new String[0])
			),
			keyStroke, null);
		adapterFactor.setProposalAcceptanceStyle(ContentProposalAdapter.PROPOSAL_REPLACE);
    }
    
	@Override
	protected Point getInitialSize() {
		Point size = super.getInitialSize();
		size.x = 400;
		return size;
	}

	public class FloatValidator{
	    public boolean validate(){
	      String ip = factorText.getText(); 
	      try {
	    	  factor = Float.parseFloat(ip);
	    	  
	      } catch (NumberFormatException nfe) {
	    	  factor = 1f;
	    	  decFactor.show();
	    	  decFactor.setImage(errorFieldIndicator.getImage());
	    	  return false;
	      }
	      decFactor.hide();
		  decFactor.setImage(infoFieldIndicator.getImage());
		  return true;
	    }
	}


    /* (non-Javadoc)
     * Method declared on Dialog.
     */
    @SuppressWarnings("unchecked")
	protected void okPressed() {
        IStructuredSelection selection = (IStructuredSelection) ezTreeViewer
                .getSelection();
        
        ArrayList<Object> lst = new ArrayList<Object>();
        lst.add(factor);
        lst.addAll(selection.toList());
        
        setResult(lst);
        super.okPressed();
    }
	
	@Override
	public void setInitialSelections(Object[] selectedElements) {
		super.setInitialSelections(selectedElements);
	}
	
}
