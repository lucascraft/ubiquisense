/***********************************************************************************************
Copyright (c) 2005 Tonalsoft Inc
All Rights Reserved

AUTHOR:   Christoph Wittmann
CREATED:  2005-01-04
************************************************************************************************/

/***********************************************************************************************
Menu

Provides menu-management and responses to pre-written HTML code.  The menuId is the node
identifier of the HTMLElement (must be "div") that contains the menu-items (i.e., other menu
objects).  This is a list of div-tags, each containing an a-tag.  Note that if one of the
div-tags in the menu contains a submenu-attribute, that attribute indicates the div-element is
itself a menu (i.e., a sub-menu).
************************************************************************************************/
function Menu(menuId, anchorNode, top, depth, rightMargin, topMargin, right) {
	this.right      = right;
	this.depth      = depth;
	this.menuId     = menuId;
	this.anchorNode = anchorNode;
	this.rightMargin = rightMargin;
	this.topMargin  = topMargin;
	this.parent     = null;
	this.children   = new Array();
	this.anchorNode.menu = this;
	window.document.menus[menuId] = this;
	var docNode = null;

	// The document node that generates the appropriate mouse-out
	// events.
	if (top) {
		docNode = this.anchorNode.parentNode;
	}
	else {
		this.anchorNode.parentNode.menu = this;
		docNode = this.anchorNode.parentNode.parentNode;
	}

	docNode.menu = this;
	
	// Notice the use of the old event model.  IE6 doesn't support
	// the new event model.  Too bad since the DOM event model is
	// much more robust.
	if (window.useIE) {
		docNode.attachEvent("onmouseout", Menu.onMouseOut);
		this.anchorNode.attachEvent("onmouseover", Menu.onMouseOver);
	}
	else {
		docNode.addEventListener("mouseout", Menu.onMouseOut, false);
		this.anchorNode.addEventListener("mouseover", Menu.onMouseOver, false);
	}
}

/*..............................................................................................
Invoked within a script-tag in an HTML document to create the menu.  Once the menu has been
created, everything else happens automatically.  In this code, we perform some bookeeping by
adding some properties to the document.  Notice, the kludges!  At some point, we'll get some
code to account for them.  But for now, quick-n-dirty is the way.  Essentially, this is the
external entry point to the menu-parsing algorithm.
..............................................................................................*/
Menu.createNavBarMenu = function(anchorId, menuId, rightMargin, topMargin, right) {
	var doc  = window.document;
	
	if (!doc.menus) {
		doc.openMaster = null;
		doc.menus = new Object();
		doc.openMenus = new Array();
	}
	
	var menuNode   = doc.getElementById(menuId);
	var anchorNode = doc.getElementById(anchorId);
	var menu = new Menu(menuId, anchorNode, true, 0, null, null, right);
	Menu.parseMenu(menu, menuNode, menuId, 1, rightMargin, topMargin, right);
}

/*..............................................................................................
The master is actually our name for the top-level menu-item in a menu-tree.  This method finds
the master or top-level menu for "this".
..............................................................................................*/
Menu.prototype.getMaster = function() {
	var master = this;
	
	while (master.parent) {
		master = master.parent;
	}
	
	return master;
}

/*..............................................................................................
Hides this menu object and all of it's subordinate menu-objects.  We accomplish this by
changing the node's visibility style setting to hidden.
..............................................................................................*/
Menu.prototype.hide = function() {
	if (this.children.length > 0) {
		for (var i = 0; i < this.children.length; i++) {
			this.children[i].hide();
		}
		
		var divNode = this.children[0].anchorNode.parentNode.parentNode;
		window.document.openMenus[this.depth] = null;
		divNode.style.visibility = "hidden";
	}
}

/*..............................................................................................
This is where things get complicated!  We have two different event-notification models: the
standard DOM Level 2 model and the Microsoft model.  Additionally, we've noticed that Netscape
(i.e., Mozilla) has some peculiarities.  Specifically, it generates mouse-out events for div-
tags that we don't expect to have in the mouse-event.  Hence, we've added some additional
logic to the Netscape portion ensure that when we receive a mouse-out, we really want to close
the menus.

The basic idea here is that when a mouse-out event is generated, if the related-target (in
MS parlence the "toElement") is NOT part of the current menu-tree, the we need to close-off
all of the open menus.
..............................................................................................*/
Menu.onMouseOut = function(mouseEvt) {
	if (window.document.openMaster) {
		if (window.useIE) {
			var evt = window.event;
			
			if (evt.srcElement.tagName.toLowerCase() != "a" && !evt.toElement.menu) {
				window.document.openMaster.hide();
				window.document.openMaster = null;
			}
		}
		else {
			var reltar = mouseEvt.relatedTarget;
			
			if (window.document.openMaster && reltar && !reltar.menu) {
				window.document.openMaster.hide();
				window.document.openMaster = null;
			}
		}
	}
}

/*..............................................................................................
Here's the crux of the matter!  When a mouse-over occurs, we need to determine whether or not
there's a menu that's currently open.  If one is, then if that menu-tree is a different tree
than the new tree, we need to close the former tree and then open up the new tree.  Notice
that we keep track of the root-node of the current tree with the "openMaster" property that's
registered with the document.
..............................................................................................*/
Menu.onMouseOver = function(mouseEvt) {
	var doc = window.document;
	var menu = this.menu;
	
	if (window.useIE)
		menu = window.event.srcElement.menu;
	
	if (menu.getMaster() !== doc.openMaster) {
		if (doc.openMaster)
			doc.openMaster.hide();
	}
	else {
		for (var i = 0; i < menu.children.length; i++) {
			menu.children[i].hide();
		}
	}
	
	doc.openMaster = menu.getMaster();
	window.status  = menu.anchorNode.innerHTML;
	menu.show();
	return true;
}

/*..............................................................................................
Performs the dirty work of parsing th XML/HTML tree that describes a menu.  Note that this
function is recursive.  If one of the parsed menus (i.e., menu-items) is in turn the root for
another menu sub-tree, this function invokes itself.  Notice that we add sequence-numbers to
the children of the curernt menu to form the identifier.
..............................................................................................*/
Menu.parseMenu = function(menu, menuNode, menuId, depth, rightMargin, topMargin, right) {
	var subCount = 0;
	
	for (var i = 0; i < menuNode.childNodes.length; i++) {
		var child = menuNode.childNodes[i];
		
		if (child.tagName) {
			if (child.tagName.toLowerCase() == "div") {
				var anchorElement = child.getElementsByTagName("a")[0];
				var subId = menuId + "_" + subCount;
				subCount++;
				var subMenu = new Menu(subId, anchorElement, false, depth, rightMargin, topMargin, right);
				subMenu.parent = menu;
				menu.children[menu.children.length] = subMenu;
				
				var subMenuId = child.getAttribute("submenu");
				
				if (subMenuId) {
					var subMenuNode = window.document.getElementById(subMenuId);
					Menu.parseMenu(subMenu, subMenuNode, subMenuId, depth + 1, rightMargin, topMargin, right);
				}
			}
		}
	}
}

/*..............................................................................................
Shows this menu object.  We accomplish this by changing the node's visibility style setting to
visible.  Notice the complications.  If we're traversing across a menu-tree, we need to close
up sub-trees that belong to menus other than the current menu.  The difficult portion of this
method is indetermining where the new menu ought to appear.  Once that's established, we set
the style-sheet position before making the sub-tree visible.
..............................................................................................*/
Menu.prototype.show = function() {
	if (window.document.openMenus[this.depth] != this) {
		Menu.openMoused = this;
		Menu.openMaster = this.getMaster();
			
		for (var i = this.depth; i < window.document.openMenus.length; i++) {
			var openInWindow = window.document.openMenus[i];
			
			if (openInWindow)
				openInWindow.hide();
		}
		
		if (this.children.length > 0) {
			var divNode = this.children[0].anchorNode.parentNode.parentNode;
			var recta = Rect.getRect(this.anchorNode);
			var rectd = Rect.getRect(this.anchorNode.parentNode);
			var topKludge = 0;
			
			if (window.useNS || window.useMZ)
				topKludge = 0;
			else if (window.useIE)
				topKludge = 1;

			if (this.right) {
				if (this.parent) {
					divNode.style.left = (rectd.x + rectd.w - 1 + this.rightMargin) + "px";
					divNode.style.top  = (recta.y - this.topMargin + topKludge) + "px";
				}
				else {
					divNode.style.left = recta.x + "px";
					divNode.style.top  = (rectd.y + rectd.h - 1) + "px";
				}
			}
			else {
				var rectx = Rect.getRect(this.children[0].anchorNode.parentNode.parentNode);
			
				if (this.parent) {
					divNode.style.left = (rectd.x - rectx.w + 2 - this.rightMargin) + "px";
					divNode.style.top  = (recta.y - this.topMargin + topKludge) + "px";
				}
				else {
					divNode.style.left = (recta.x - rectx.w + recta.w) + "px";
					divNode.style.top  = (rectd.y + rectd.h - 1) + "px";
				}
			}
			
			// An annoying kludge for Netscape.  If we set the node to visible
			// right here, it'll appear before being put in the proper place.
			// Hence, we delay before making the node visible.
			Menu.showMenu = this;
			Menu.showNode = divNode;
			window.setTimeout(Menu.showTimeout, 25);
		}
	}
}

/*..............................................................................................
The back-end of an annyong kludge for Netscape.  After the brief timeout, we can set the
node to be visible.  See comments at the bottom of show().
..............................................................................................*/
Menu.showTimeout = function() {
	window.document.openMenus[Menu.showMenu.depth] = Menu.showMenu;
	Menu.showNode.style.visibility = "visible";
}

/***********************************************************************************************
Rect

The Rect is a support class that's used for determining position and size of the various
HTML elements as they appear on the client surface of the browser.  The constructor works with
either zero or one passed arguments.  If there is an argument, we compute the offset rectangle
associated with that argument, which must be an HTMLElement.
************************************************************************************************/
function Rect(node) {
	if (node) {
		this.x = node.offsetLeft;
		this.y = node.offsetTop;
		this.w = node.offsetWidth;
		this.h = node.offsetHeight;
	}
	else {
		this.x = 0;
		this.y = 0;
		this.w = 0;
		this.h = 0;
	}
}

/*..............................................................................................
Very handy function that determines the client rectangle for the passed node.  We assume that
the passed node is an HTMLElement and that it implements the offsetLeft and offsetTop properties.
..............................................................................................*/
Rect.getRect = function(node) {
	var rect = new Rect(node);
	var parent = node.offsetParent;
	
	while (parent) {
		rect.x += parent.offsetLeft;
		rect.y += parent.offsetTop;
		parent = parent.offsetParent;
	}
	
	return rect;
}

/*..............................................................................................
Overrides the generic toString() method for debugging purposes.  Note that this method provides
a one-liner with all of the pertinant rectangular data.
..............................................................................................*/
Rect.prototype.toString = function() {
	return "(" + this.x + ", " + this.y + ", " + this.w + ", " + this.h + ")";
}