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

package net.sf.smbt.ui.console;

import org.eclipse.ui.console.IOConsole;
import org.eclipse.ui.console.IPatternMatchListenerDelegate;
import org.eclipse.ui.console.PatternMatchEvent;
import org.eclipse.ui.console.TextConsole;

public class SmbtPatternMatchListenerDelegate implements
		IPatternMatchListenerDelegate {

	@Override
	public void connect(TextConsole console) {
		if (console instanceof IOConsole) {
			console.activate();
		}
	}

	@Override
	public void disconnect() {

	}

	@Override
	public void matchFound(PatternMatchEvent event) {
		if (event != null) {
			if (event.getSource() instanceof IOConsole) {
//				IDocument document =  ((IOConsole)event.getSource()).getDocument();
//				document.
//	               try {
//                       final int offset = event.getOffset();
//                       final int length = event.getLength();
//                       final String matchedText = observedConsole.getDocument().get(offset, length - 1);
//                       final int lineColSep = matchedText.lastIndexOf(':');
//                       if (lineColSep < 3) {
//                               return;
//                       }
//                       final int nameLineSep = matchedText.lastIndexOf(':', lineColSep - 1);
//                       if (nameLineSep < 1) {
//                               return;
//                       }
//                       final IFile file = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(matchedText.substring(0, nameLineSep)));
//                       if (file == null) {
//                               return;
//                       }
//                       final int lineNum = Integer.parseInt(matchedText.substring(nameLineSep + 1, lineColSep));
//                       if (lineNum < 1) {
//                               return;
//                       }
//                       final int colNum = Integer.parseInt(matchedText.substring(lineColSep + 1));
//                       if (colNum < 1) {
//                               return;
//                       }
//                       final IHyperlink link = new FileLink(file, null, -1, -1, lineNum);
//                       observedConsole.addHyperlink(link, offset, length - 1);
//               } catch (final BadLocationException e) {
//               } catch (final NumberFormatException e) {
//               }
			}
		}
	}

}
