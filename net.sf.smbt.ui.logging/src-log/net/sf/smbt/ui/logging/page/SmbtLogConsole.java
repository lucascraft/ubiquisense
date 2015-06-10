/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2008 - 2011, Lucas Bigeardel
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

import java.io.PrintStream;

import net.sf.smbt.ui.logging.Activator;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.IOConsoleInputStream;
import org.eclipse.ui.console.IOConsoleOutputStream;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.part.IPageBookViewPage;

public class SmbtLogConsole extends MessageConsole {
	private static SmbtLogConsole instance;
	private IPageBookViewPage logPage;
	
	private PrintStream myS;
	
	/**
	 * Initializes me.
	 */
	private SmbtLogConsole() {
		super(
			"Ubiquisense Logging Console",
			ImageDescriptor.createFromURL(
				Activator.getDefault().getBundle().getEntry(
					"/icons/console/transmit.png"))); //$NON-NLS-1$
			
		myS = new PrintStream(newMessageStream());
		boolean logActive = true;
		for (String arg : Platform.getCommandLineArgs()) {
			if (arg.equals("-nolog")) {
				logActive = false;
			}
		}
		if(logActive) { 
			System.setOut(myS); // link standard output stream to the console
			System.setErr(myS); // link error output stream to the console
		}
	}
	
    /* (non-Javadoc)
     * @see org.eclipse.ui.console.IOConsole#getInputStream()
     */
    public IOConsoleInputStream getInputStream() {
        throw new UnsupportedOperationException("Message Console does not support user input"); //$NON-NLS-1$
    }
    
	

	/**
	 * Obtains the singleton instance.  It is created, if necessary.
	 * 
	 * @return the singleton console instance
	 */
	public static SmbtLogConsole getInstance() {
		if (instance == null) {
			instance = new SmbtLogConsole();
			ConsolePlugin.getDefault().getConsoleManager().addConsoles(
				new IConsole[] {instance});
		}
		
		return instance;
	}
	
	public IPageBookViewPage createPage(IConsoleView view) {
		logPage = new SmbtConsoleLogPage(this, view);
		return logPage;// = super.createPage(view);
	}
	
	public IPageBookViewPage getConsoleLogPage() {
		return logPage;
	}
	
	
	/**
	 * Closes me and clears the singleton instance reference, so that it will
	 * be reinitialized when another console is requested.
	 */
	void close() {
		try {
			ConsolePlugin.getDefault().getConsoleManager().removeConsoles(
				new IConsole[] {this}
			);
			dispose();
		} finally {
			instance = null;
		}
	}
	
	@Override
	public IOConsoleOutputStream newOutputStream() {
		return new MessageConsoleStream(this);
	}
	
	
	
	@Override
	protected void dispose() {
		myS.close();
		super.dispose();
	}
}
