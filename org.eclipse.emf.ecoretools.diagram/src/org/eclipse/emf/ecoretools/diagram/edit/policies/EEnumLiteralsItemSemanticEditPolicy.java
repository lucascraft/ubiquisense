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
 * $Id: EEnumLiteralsItemSemanticEditPolicy.java,v 1.3 2009/02/02 08:39:06 jlescot Exp $
 **********************************************************************/

package org.eclipse.emf.ecoretools.diagram.edit.policies;

import org.eclipse.emf.ecoretools.diagram.edit.commands.EEnumLiteralCreateCommand;
import org.eclipse.emf.ecoretools.diagram.providers.EcoreElementTypes;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class EEnumLiteralsItemSemanticEditPolicy extends EcoreBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EEnumLiteralsItemSemanticEditPolicy() {
		super(EcoreElementTypes.EEnum_2005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EcoreElementTypes.EEnumLiteral_2006 == req.getElementType()) {
			return getGEFWrapper(new EEnumLiteralCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}
}
