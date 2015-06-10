/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2008 - 2013, Lucas Bigeardel
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

package net.sf.smbt.ui.logging.page;

import net.sf.smbt.ui.widgets.common.ColorsUtil;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.TextConsole;
import org.eclipse.ui.console.TextConsoleViewer;
import org.eclipse.ui.internal.console.IOConsolePage;


/**
 * The page implementing the Interactive console.
 */
public class SmbtConsoleLogPage extends IOConsolePage {

//  private static int BUNDLE_AVAILABLE = Bundle.RESOLVED | Bundle.ACTIVE |
//        Bundle.STARTING;
//    
//	private ITextViewer output;
//	
//	private ISelectionService selectionService;
//	private ISelectionListener selectionListener;
//	@SuppressWarnings("unused")
//	private Color logColor;
	
	SmbtConsoleLogPage(TextConsole console, IConsoleView view) {
		super(console, view);
	}
	
	
	@Override
	public void createControl(Composite parent) {
		// TODO Auto-generated method stub
		super.createControl(parent);
		
		getControl().setBackground(ColorConstants.darkGray);
		getControl().setForeground(ColorsUtil.lightGray);
		
		setAutoScroll(true);
		
		setReadOnly();
		
	}
	
	@Override
	public void setViewer(TextConsoleViewer viewer) {
		// TODO Auto-generated method stub
		super.setViewer(viewer);
	}
	
//	@Override
//    public void createControl(Composite parent) {
//		// force left-to-right text direction in the console, because it
//		//    works with OCL text and the OCL language is based on English
//		
//		output = new TextViewer(parent, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL);
//		output.getTextWidget().setLayoutData(new GridData(GridData.FILL_BOTH));
//		output.getTextWidget().setFont(JFaceResources.getFont(JFaceResources.TEXT_FONT));
//		output.setEditable(false);
//		output.setDocument(new Document());
//		output.getTextWidget().setBackground(ColorConstants.darkGray);
//		output.getTextWidget().setForeground(ColorConstants.lightGray);
//
//		
//		selectionService = getSite().getWorkbenchWindow().getSelectionService();
//        if (selectionService != null) {
//        	selectionService.addPostSelectionListener(selectionListener = new ISelectionListener() {
//                public void selectionChanged(IWorkbenchPart part, ISelection selection) {
//                    SmbtConsoleLogPage.this.selectionChanged(selection);
//                }
//            });
//        }
//		if (selectionService!=null && selectionService.getSelection() != null && !selectionService.getSelection().isEmpty()) {
//			// get current selection
//			selectionChanged(selectionService.getSelection());
//		}
//	}
//	
//    static boolean isAvailable(Bundle bundle) {
//        return (bundle.getState() & BUNDLE_AVAILABLE) != 0;
//    }
//    
//	@Override
//    public Control getControl() {
//		return output == null ? null : output.getTextWidget();
//	}
//
//	@Override
//    public void setFocus() {
//	}
//	
//	/**
//	 * Extends the inherited method to dispose of additional colour resources.
//	 */
//	@Override
//    public void dispose() {
//		if (selectionListener != null && selectionService != null) {
//			selectionService.removePostSelectionListener(selectionListener);
//		}
//		super.dispose();
//	}
//	private IDocument getDocument() {
//		return getViewer().getDocument();
//		return output == null ? null : output.getDocument();
//	}
//	@SuppressWarnings("unused")
//	private void append(String text, Color color, boolean bold) {
//		
//		IDocument doc = getDocument();
//		try {
//			
//			String docText = doc.get();
//			if (docText.length()>100000) {
//				doc.set(docText.substring(docText.length()-100000));
//			}
//			int offset = doc.getLength();
//			
//			text = text + '\n';
//			
//			if (offset > 0) {
//				doc.replace(offset, 0, text);
//			} else {
//				doc.set(text);
//			}
//			
//			StyleRange style = new StyleRange();
//			style.start = offset;
//			style.length = text.length();
//			style.foreground = color;
//			
//			if (bold) {
//				style.fontStyle = SWT.BOLD;
//			}
//			
//			output.getTextWidget().setStyleRange(style);
//		} catch (BadLocationException e) {
//			IStatus status = new Status(
//				IStatus.ERROR,
//				Activator.PLUGIN_ID,
//				1,
//				"error",
//				e);	
//			
//			Activator.getDefault().getLog().log(status);
//		}
//	}
//
//	private void selectionChanged(ISelection sel) {
//	    if (sel instanceof IStructuredSelection) {
//            IStructuredSelection ssel = (IStructuredSelection) sel;
//            
//            if (!ssel.isEmpty()) {
//                Object selected = ssel.getFirstElement();
//               
//                if (selected instanceof EObject) {
//                    context = (EObject) selected;
//                } else if (selected instanceof IAdaptable) {
//                    context = (EObject) ((IAdaptable) selected).getAdapter(
//                        EObject.class);
//                }
//                
//            }
//	    }
//	}
}
