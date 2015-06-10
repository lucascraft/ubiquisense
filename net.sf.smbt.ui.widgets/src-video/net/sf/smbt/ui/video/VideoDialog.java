/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2013, Lucas Bigeardel
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

package net.sf.smbt.ui.video;

import org.eclipse.jface.dialogs.TrayDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

public class VideoDialog extends TrayDialog {
    private static final int DEFAULT_WIDTH = 866;
    private static final int DEFAULT_HEIGHT = 515;

    private Browser browser;
    private String url;
    private Rectangle parentBounds = null;
    private String htmlContent;
    private final String title;
    private int width = DEFAULT_WIDTH;
    private int height = DEFAULT_HEIGHT;

    public VideoDialog(final Shell shell, final String title) {
        super(shell);
        this.title = title;
        this.parentBounds = shell.getBounds();
    }

    public VideoDialog(final Shell shell, final String title, final String url) {
        this(shell, title);
        this.url = url;
    }

    public VideoDialog(final Shell shell, final String title, final int width, final int height) {
        this(shell, title);
        this.width = width;
        this.height = height;
    }

    public void setHTMLContent(final String htmlContent) {
        this.htmlContent = htmlContent;
    }

    @Override
    protected Control createDialogArea(final Composite parent) {
        Composite area = new Composite(parent, SWT.NONE);
        GridLayoutFactory.fillDefaults().margins(0, 0).spacing(0, 0).applyTo(area);
        GridDataFactory.fillDefaults().grab(true, true).applyTo(area);

        browser = new Browser(area, SWT.NONE);
        GridDataFactory.fillDefaults().grab(true, true).applyTo(browser);

        if (htmlContent != null) {
            browser.setText(htmlContent);
        } else {
            browser.setUrl(url);
        }

        return area;
    }

    @Override
    protected void configureShell(final Shell newShell) {
        super.configureShell(newShell);

        newShell.setText(title);
        newShell.setSize(width, height);
        newShell.setLocation(getDefaultShellLocation(newShell));
    }

    protected Point getDefaultShellSize() {
        return new Point(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }

    protected Point getDefaultShellLocation(final Shell newShell) {
        Rectangle area = parentBounds;
        if (area == null) {
            area = newShell.getDisplay().getClientArea();
        }

        Point shellSize = newShell.getSize();
        Point center = new Point((area.width / 2) + area.x, (area.height / 2) + area.y);
        return new Point(center.x - (shellSize.x / 2), center.y - (shellSize.y / 2));
    }

    @Override
    protected Button createButton(final Composite parent, final int id, final String label, final boolean defaultButton) {
        return null;
    }

    @Override
    protected Control createButtonBar(final Composite parent) {
        return null;
    }
}
