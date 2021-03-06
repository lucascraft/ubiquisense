/***********************************************************************
 * Copyright (c) 2007 Anyware Technologies
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Anyware Technologies - initial API and implementation
 *
 * $Id: EEnumLiteralsEditPart.java,v 1.6 2009/05/06 13:00:26 jlescot Exp $
 **********************************************************************/

package org.eclipse.emf.ecoretools.diagram.edit.parts;

import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecoretools.diagram.edit.policies.CompartmentChildCreationEditPolicy;
import org.eclipse.emf.ecoretools.diagram.edit.policies.EEnumLiteralsCanonicalEditPolicy;
import org.eclipse.emf.ecoretools.diagram.edit.policies.EEnumLiteralsItemSemanticEditPolicy;
import org.eclipse.emf.ecoretools.diagram.edit.policies.ReorderingCompartmentEditPolicy;
import org.eclipse.emf.ecoretools.diagram.part.Messages;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class EEnumLiteralsEditPart extends ListCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 5006;

	/**
	 * @generated
	 */
	public EEnumLiteralsEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected boolean hasModelChildrenChanged(Notification evt) {
		return false;
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return Messages.EEnumLiteralsEditPart_title;
	}

	/**
	 * @generated NOT
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
		FlowLayout layout = new FlowLayout();
		layout.setMajorSpacing(getMapMode().DPtoLP(0));
		layout.setMinorSpacing(getMapMode().DPtoLP(0));
		layout.setHorizontal(false);
		result.getContentPane().setLayoutManager(layout);
		result.setTitleVisibility(false);
		return result;
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, new ResizableCompartmentEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new EEnumLiteralsItemSemanticEditPolicy());

		// Use a custom Policy to create child elements and initialize their
		// initial position
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CompartmentChildCreationEditPolicy());

		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new EEnumLiteralsCanonicalEditPolicy());

		// Add a policy used to reorder children
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new ReorderingCompartmentEditPolicy(EcorePackage.Literals.EENUM__ELITERALS));
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		// nothing to do -- parent layout does not accept Double constraints as
		// ratio
		// super.setRatio(ratio);
	}

	@Override
	public boolean isSelectable() {
		// Bug 238814 : Compartment must not be selectable
		return false;
	}
}
