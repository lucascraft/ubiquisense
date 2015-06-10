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

package net.sf.smbt.ui.scripts;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

//import net.sf.smbt.osc.OscDslRuntimeModule;
//import net.sf.smbt.osc.ui.quickfix.OscDslQuickfixProvider;
//import net.sf.smbt.ui.console.text.EzXtextEditorModule;
//import net.sf.smbt.ui.console.text.EzXtextResource;
//import net.sf.smbt.ui.console.text.SmbtSourceViewer;
//
//import org.eclipse.core.runtime.IProgressMonitor;
//import org.eclipse.emf.common.util.URI;
//import org.eclipse.emf.ecore.resource.ResourceSet;
//import org.eclipse.jface.layout.GridDataFactory;
//import org.eclipse.jface.text.IDocumentPartitioner;
//import org.eclipse.jface.text.ISynchronizable;
//import org.eclipse.jface.text.source.AnnotationModel;
//import org.eclipse.swt.SWT;
//import org.eclipse.swt.widgets.Composite;
//import org.eclipse.xtext.resource.IResourceFactory;
//import org.eclipse.xtext.ui.editor.model.XtextDocument;
//import org.eclipse.xtext.ui.editor.validation.AnnotationIssueProcessor;
//import org.eclipse.xtext.ui.editor.validation.IValidationIssueProcessor;
//import org.eclipse.xtext.ui.editor.validation.ValidationJob;
//import org.eclipse.xtext.ui.resource.IResourceSetProvider;
//import org.eclipse.xtext.ui.shared.SharedStateModule;
//import org.eclipse.xtext.util.StringInputStream;
//import org.eclipse.xtext.validation.CheckMode;
//import org.eclipse.xtext.validation.IResourceValidator;
//import org.eclipse.xtext.validation.Issue;
//
//import com.google.inject.Guice;
//import com.google.inject.Inject;
//import com.google.inject.Injector;
//import com.google.inject.Provider;
//import com.google.inject.util.Modules;

public class EZScriptEditor { // extends Composite {
//	private SmbtSourceViewer input;
//    @Inject
//    private Provider<EzXtextResource> fEmbeddedXtextResourceProvider;
//    @Inject
//    private Provider<XtextDocument> documentProvider;
//    @Inject
//    protected Provider<IDocumentPartitioner> documentPartitioner;
//	@Inject
//	private IResourceValidator resourceValidator;
//	private EzXtextResource fResource;
//	@Inject
//	private IResourceSetProvider fResourceSetProvider;
//	@Inject
//	private IResourceFactory resourceFactory;
//	private XtextDocument document;
//	public SmbtSourceViewer getViewer() {
//		return input;
//	}
//	private void initEzInputEditor(Composite parent) {
//		input = new SmbtSourceViewer(parent, SWT.BORDER | SWT.MULTI);
//		input.getControl().setLayoutData(
//			GridDataFactory.fillDefaults().grab(true, true).create()
//		);
//		
//		document = documentProvider.get();
//		document.set("");
//		
//		IDocumentPartitioner partitioner = documentPartitioner.get();
//		partitioner.connect(document);
//		document.setDocumentPartitioner(partitioner);
//		
//		setText(document, "");
//		ValidationJob job = new ValidationJob(resourceValidator, document, 
//			new IValidationIssueProcessor() {
//				private AnnotationIssueProcessor annotationIssueProcessor;
//				public void processIssues(List<Issue> issues, IProgressMonitor monitor) {
//					if (annotationIssueProcessor == null) {
//						annotationIssueProcessor = new AnnotationIssueProcessor(
//							document, 
//							input.getAnnotationModel(), 
//							new OscDslQuickfixProvider()
//						);
//					}
//					if (annotationIssueProcessor != null) {
//						annotationIssueProcessor.processIssues(issues, monitor);
//					}
//				}
//			}, 
//			CheckMode.FAST_ONLY
//		);
//		document.setValidationJob(job);
//	}
//	
//	protected EzXtextResource createResource() {
//		ResourceSet resourceSet = fResourceSetProvider.get(null);
//		EzXtextResource result = (EzXtextResource) fEmbeddedXtextResourceProvider.get();
//		result.setURI(URI.createURI(UUID.randomUUID().toString() + ".ubqosc"));
//		resourceSet.getResources().add(result);
//		return result;
//	}
//	
//	private EzXtextResource createResource(String content) {
//		EzXtextResource result = createResource();
//		try {
//			result.load(new StringInputStream(content, result.getEncoding()), Collections.emptyMap());
//		} catch (Exception e) {
//			throw new RuntimeException(e);
//		}
//		return result;
//	}
//	
//	protected void setText(XtextDocument document, String text) {
//		document.set(text);
//		fResource = createResource(text);
//		document.setInput(fResource);
//		AnnotationModel annotationModel = new AnnotationModel();
//		if (document instanceof ISynchronizable) {
//			Object lock = ((ISynchronizable)document).getLockObject();
//			if (lock == null) {
//				lock= new Object();
//				((ISynchronizable)document).setLockObject(lock);
//			}
//			((ISynchronizable) annotationModel).setLockObject(lock);
//		}
//		input.setDocument(document, annotationModel);
//	}
//
//	public EZScriptEditor(Composite parent, int style) {
//		super(parent, style);
//		Injector injector = Guice.createInjector(
//			Modules.override(
//				new SharedStateModule()).with(
//				Modules.override(new OscDslRuntimeModule()).with(
//					new EzXtextEditorModule()
//				)
//			)
//		);
//		injector.injectMembers(this);
//		initEzInputEditor(parent);
//	}
//
//	/**
//	 * Updates the text of this editor with the given String
//	 * 
//	 * @param text
//	 */
//	public void update(String text) {
//		input.setRedraw(false);
//		input.getDocument().set(text);
//		input.setVisibleRegion(0, text.length());
//		input.setRedraw(true);
//	}
}
