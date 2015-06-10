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

package net.sf.smbt.ui.widgets.vu;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.MenuAdapter;
import org.eclipse.swt.events.MenuEvent;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

public abstract class UbiWidget extends CLabel implements IUbiWidget {
	
	public final static int WIDGET_COLORED_THEME	= 1;
	public final static int WIDGET_BW_THEME			= 2;

	private int ustyle;
	
	public UbiWidget(Composite parent, int style) {
		super(parent, style);
		ustyle = WIDGET_COLORED_THEME;
		menuActions 	= new ArrayList<Action>();
		addMouseListener(new MouseListener() {
			@Override
			public void mouseUp(MouseEvent e) {
			}
			@Override
			public void mouseDown(MouseEvent e) {
			}
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				doMenuAction(e);
			}
		});
	}
	
	public void setUbiStyle(int style) {
		ustyle = style;
	}
	
	public int getUbiStyle() {
		return ustyle;
	}
	
	protected void doMenuAction(MouseEvent e) {
		if (menuActions != null && menuActions.size()>0) {
			menuActions.get(0).run();
		}
	}
	
	//
	// Menu contributions
	//

	private List<Action> menuActions;
	
	public Menu getMenu() {
		Menu menu = super.getMenu();
		fillMenu(menu);
		return menu;
	}

	public void addMenuAction(Action action) {
		menuActions.add(action);
	}
	
	public void addMenuActions(List<Action> actions) {
		menuActions.addAll(actions);
	}
	
	public void removeMenuAction(Action action) {
		menuActions.remove(action);
	}
	
	public void removeMenuActions(List<Action> actions) {
		menuActions.removeAll(actions);
	}
	
	private void fillMenu(final Menu localMenu) {
		int accelerator = 0;
		for (Action action : menuActions) {
			addToMenu(localMenu, action, accelerator++);
		}
		localMenu.addMenuListener(new MenuAdapter() {
			public void menuHidden(MenuEvent e) {
				e.display.asyncExec(new Runnable() {
					public void run() {
						for (MenuItem item : localMenu.getItems()) {
							item.dispose();
						}
						localMenu.dispose();
					}
				});
			}
		});
	}

	private void addToMenu(Menu localMenu, IAction action, int accelerator) {
		StringBuffer label= new StringBuffer();
		if (accelerator >= 0 && accelerator < 10) {
			//add the numerical accelerator
			label.append('&');
			label.append(accelerator);
			label.append(' ');
		}
		label.append(action.getText());
		action.setText(label.toString());
		ActionContributionItem item = new ActionContributionItem(action);
		item.fill(localMenu, -1);
	}

}
