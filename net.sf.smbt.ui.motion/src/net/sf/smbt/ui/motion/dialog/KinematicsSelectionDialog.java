/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2008 - 2010, Lucas Bigeardel
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

package net.sf.smbt.ui.motion.dialog;


import java.util.Arrays;
import java.util.List;

import net.sf.smbt.ezmotion.Motion;
import net.sf.smbt.ezmotion.MotionAxis;
import net.sf.smbt.ezmotion.MotionCinematic;
import net.sf.smbt.ezmotion.MotionKind;
import net.sf.smbt.motion.engine.MotionUtils;
import net.sf.smbt.ui.motion.Activator;

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
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.SelectionDialog;

public class KinematicsSelectionDialog extends SelectionDialog {
	private List<Motion> motions;
	private ListViewer motionSelectionList;
	private Composite container, buttonsContainer;
	private Group editionGroup;
	private Text durationText, rateText, amplitudeText;
	private ComboViewer axisViewer, kindViewer, cinematicViewer;
	private Object selectedMotion;
	
	/**
     * List height in characters.
     */
    private final static int LIST_HEIGHT = 10;
    
	/**
     * List width in characters.
     */
   private final static int LIST_WIDTH = 20;


    /**
     * Constructor w/ arguments
     *  
     * @param parentShell parent {@link Shell}
     * @param shellTitle {@link Shell} title
     * @param shellMessage {@link Shell} message
     */
	public KinematicsSelectionDialog(Shell parentShell, String shellTitle, String shellMessage) {
		super(parentShell);
		motions = MotionUtils.INSTANCE.createBasicMotions();

		setTitle(shellTitle);
	    setMessage(shellMessage);
	    
	    
	    setSelectionResult(new Object[] { motions.get(0) });
	}
	
    /* (non-Javadoc)
     * Method declared on Dialog.
     */
    protected Control createDialogArea(Composite parent) {
        Composite composite = (Composite) super.createDialogArea(parent);
        
        // Create label
 
        createMessageArea(composite);
        
        container = new Composite(composite, SWT.NONE);
        container.setLayout(GridLayoutFactory.fillDefaults().numColumns(3).create());
        container.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).span(3, 1).create());
        
        // Create list viewer	
        motionSelectionList = new ListViewer(container, SWT.SINGLE | SWT.H_SCROLL
                | SWT.V_SCROLL | SWT.BORDER);
        GridData data2 = new GridData(GridData.FILL_BOTH);
        data2.heightHint = convertHeightInCharsToPixels(LIST_HEIGHT);
        data2.widthHint = convertWidthInCharsToPixels(LIST_WIDTH);
        data2.horizontalSpan = 2;
        motionSelectionList.getList().setLayoutData(data2);
        motionSelectionList.getList().setFont(parent.getFont());
        // Set the label provider		
        motionSelectionList.setLabelProvider(new LabelProvider() {
            public String getText(Object element) {
                // Return the features's label.
            	Motion motion = (Motion) element;
                return element == null ? "" : motion.getCinematic().getLiteral() + " amp " + motion.getAmplitude() + ", freq " + motion.getFrequency(); //$NON-NLS-1$
            }
        });
        motionSelectionList.addSelectionChangedListener(
        	new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					selectedMotion = ((IStructuredSelection)event.getSelection()).getFirstElement();
				}
			}
        );
        
        buttonsContainer = new Composite(container, SWT.NONE);
        buttonsContainer.setLayout(GridLayoutFactory.fillDefaults().create());
        buttonsContainer.setLayoutData(GridDataFactory.fillDefaults().grab(false, true).create());
        
        Button addMotionButton = new Button(buttonsContainer, SWT.PUSH);
        addMotionButton.setImage(Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.motion", "icons/list-add.png").createImage());
        addMotionButton.setToolTipText("Add motion");
        addMotionButton.setEnabled(false);
        
        Button removeMotionButton = new Button(buttonsContainer, SWT.PUSH);
        removeMotionButton.setImage(Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.motion", "icons/list-remove.png").createImage());
        removeMotionButton.setToolTipText("Remove motion");
        removeMotionButton.setEnabled(false);

        // Set the content provider
        ArrayContentProvider cp2 = new ArrayContentProvider();
        motionSelectionList.setContentProvider(cp2);
        motionSelectionList.setInput(motions);
        motionSelectionList.addSelectionChangedListener(
        	new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					Motion motion = (Motion) ((IStructuredSelection)event.getSelection()).getFirstElement();
					handleMotionSelection(motion);
				}
			}
        );
        
        
        editionGroup = new Group(container, SWT.NONE);
        editionGroup.setLayout(GridLayoutFactory.fillDefaults().numColumns(5).create());
        editionGroup.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).span(2, 1).create());
        editionGroup.setText("Motion Config:");
        
        //
        // 
        //
        
        Label cinematic = new Label(editionGroup, SWT.RIGHT);
        cinematic.setLayoutData(GridDataFactory.fillDefaults().align(SWT.RIGHT, SWT.CENTER).grab(false, false).create());
        cinematic.setText("Cinematic :");
        
        cinematicViewer = new ComboViewer(new CCombo(editionGroup, SWT.BORDER | SWT.READ_ONLY));
        cinematicViewer.getControl().setLayoutData(GridDataFactory.fillDefaults().span(4, 1).grab(true, false).create());
        cinematicViewer.setLabelProvider(new LabelProvider());
        cinematicViewer.setContentProvider(new ArrayContentProvider());
        cinematicViewer.setInput(MotionCinematic.VALUES);
        cinematicViewer.addSelectionChangedListener(
            new ISelectionChangedListener() {
        		@Override
        		public void selectionChanged(SelectionChangedEvent event) {
        			Object obj = ((IStructuredSelection)motionSelectionList.getSelection()).getFirstElement();
        			if (obj instanceof Motion) {
        				((Motion)obj).setCinematic((MotionCinematic)((IStructuredSelection)event.getSelection()).getFirstElement());
						motionSelectionList.refresh(obj, true);
        			}
        		}
        	}
        );
        
        Label axis = new Label(editionGroup, SWT.NONE);
        axis.setLayoutData(GridDataFactory.fillDefaults().align(SWT.RIGHT, SWT.CENTER).grab(false, false).create());
        axis.setText("Axis :");
    
        axisViewer = new ComboViewer(new CCombo(editionGroup, SWT.BORDER | SWT.READ_ONLY));
        axisViewer.getControl().setLayoutData(GridDataFactory.fillDefaults().span(4, 1).grab(true, false).create());
        axisViewer.setLabelProvider(new LabelProvider());
        axisViewer.setContentProvider(new ArrayContentProvider());
        axisViewer.setInput(MotionAxis.VALUES);
        axisViewer.addSelectionChangedListener(
            new ISelectionChangedListener() {
    			@Override
    			public void selectionChanged(SelectionChangedEvent event) {
    				Object obj = ((IStructuredSelection)motionSelectionList.getSelection()).getFirstElement();
    				if (obj instanceof Motion) {
    					((Motion)obj).setAxis((MotionAxis)((IStructuredSelection)event.getSelection()).getFirstElement());
						motionSelectionList.refresh(obj, true);
    				}
    			}
    		}
        );

        
        Label rate = new Label(editionGroup, SWT.NONE);
        rate.setLayoutData(GridDataFactory.fillDefaults().align(SWT.RIGHT, SWT.CENTER).grab(false, false).create());
        rate.setText("Rate :");

        rateText = new Text(editionGroup, SWT.BORDER | SWT.LEFT);
        rateText.setLayoutData(GridDataFactory.fillDefaults().span(4, 1).grab(true, false).create());
        rateText.addModifyListener(
        	new ModifyListener() {
				@Override
				public void modifyText(ModifyEvent e) {
					try {
						Object obj = ((IStructuredSelection)motionSelectionList.getSelection()).getFirstElement();
						if (obj instanceof Motion) {
							((Motion)obj).setSampleRate(Integer.parseInt(rateText.getText()));
							motionSelectionList.refresh(obj, true);
						}
					} catch (NumberFormatException nfe) {
						System.err.println(nfe);
					}
				}
			}
        );

        Label amplitude = new Label(editionGroup, SWT.NONE);
        amplitude.setLayoutData(GridDataFactory.fillDefaults().align(SWT.RIGHT, SWT.CENTER).grab(false, false).create());
        amplitude.setText("Amplitude :");

        amplitudeText = new Text(editionGroup, SWT.BORDER | SWT.LEFT);
        amplitudeText.setLayoutData(GridDataFactory.fillDefaults().span(4, 1).grab(true, false).create());
        amplitudeText.addModifyListener(
            new ModifyListener() {
    			@Override
    			public void modifyText(ModifyEvent e) {
    				try {
    					Object obj = ((IStructuredSelection)motionSelectionList.getSelection()).getFirstElement();
    					if (obj instanceof Motion) {
    						((Motion)obj).setAmplitude(Float.parseFloat	(amplitudeText.getText()));
    						motionSelectionList.refresh(obj, true);
    					}
    				} catch (NumberFormatException nfe) {
    					System.err.println(nfe);
    				}
    			}
    		}
        );
        
        Label duration = new Label(editionGroup, SWT.NONE);
        duration.setLayoutData(GridDataFactory.fillDefaults().align(SWT.RIGHT, SWT.CENTER).grab(false, false).create());
        duration.setText("Duration :");

        durationText = new Text(editionGroup, SWT.BORDER | SWT.LEFT);
        durationText.setLayoutData(GridDataFactory.fillDefaults().span(4, 1).grab(true, false).create());
        durationText.addModifyListener(
            new ModifyListener() {
        		@Override
        		public void modifyText(ModifyEvent e) {
        			try {
        				Object obj = ((IStructuredSelection)motionSelectionList.getSelection()).getFirstElement();
        				if (obj instanceof Motion) {
        					((Motion)obj).setDuration(Long.parseLong(durationText.getText()));
    						motionSelectionList.refresh(obj, true);
        				}
        			} catch (NumberFormatException nfe) {
        				System.err.println(nfe);
        			}
        		}
        	}
        );
            
        Label kind = new Label(editionGroup, SWT.NONE);
        kind.setLayoutData(GridDataFactory.fillDefaults().align(SWT.RIGHT, SWT.CENTER).grab(false, false).create());
        kind.setText("Kind :");

        kindViewer = new ComboViewer(new CCombo(editionGroup, SWT.BORDER | SWT.READ_ONLY));
        kindViewer.getControl().setLayoutData(GridDataFactory.fillDefaults().span(4, 1).grab(true, false).create());
        kindViewer.setLabelProvider(new LabelProvider());
        kindViewer.setContentProvider(new ArrayContentProvider());
        kindViewer.setInput(MotionKind.VALUES);
        kindViewer.addSelectionChangedListener(
        	new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					Object obj = ((IStructuredSelection)motionSelectionList.getSelection()).getFirstElement();
					if (obj instanceof Motion) {
						((Motion)obj).setKind((MotionKind)((IStructuredSelection)event.getSelection()).getFirstElement());
						motionSelectionList.refresh(obj, true);
					}
				}
			}
        );

        // Set the initial selection
        motionSelectionList.setSelection(
        	new StructuredSelection(
        		motions.get(0)
            ), 
            true
        );
        
        return composite;
    }

	public void handleMotionSelection(Motion motion) {
		durationText.setText(""+motion.getDuration());
		rateText.setText(""+motion.getSampleRate());
		amplitudeText.setText(""+motion.getAmplitude());
		axisViewer.setSelection(new StructuredSelection(motion.getAxis()));
		kindViewer.setSelection(new StructuredSelection(motion.getKind()));
		cinematicViewer.setSelection(new StructuredSelection(motion.getCinematic()));
	}

    
    /* (non-Javadoc)
     * Method declared on Dialog.
     */
    protected void okPressed() {
        setResult(Arrays.asList(selectedMotion));
        super.okPressed();
    }
	
	@Override
	public void setInitialSelections(Object[] selectedElements) {
		super.setInitialSelections(selectedElements);
	}
	
	@Override
	public Object[] getResult() {
		return new Object[] { selectedMotion };
	}
}
