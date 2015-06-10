/***********************************************************************************************
Copyright (c) 2005 Tonalsoft Inc
All Rights Reserved

AUTHOR:   Christoph Wittmann
CREATED:  2005-01-04
************************************************************************************************/

/***********************************************************************************************
Utils

A collection of general-purpose utilities that are used in two or more Tonalsoft web pages.
These utilities are generally targeted for advanced browsers that support DOM Level 2 document
objects.  Generally speaking, we're looking at Netscape 7+, Mozilla, and IE 6+, although IE
isn't very compliant to DOM Level 2.
************************************************************************************************/
function Utils() {
}

/*..............................................................................................
Rouesey mousesy, who's in the housey.  We love some little neat rhymes.  Bugsy Mugsy is
the lugsy of the house!
..............................................................................................*/
Utils.mnz = "\x6a\x6d\x6f\x6e\x7a\x6f";
Utils.inv = "\x69\x63\x76\x65\x73\x74\x6f\x72\x73";
Utils.jgl = "\x6a\x67\x6c\x61\x73\x69\x65\x72";
Utils.spp = "\x73\x75\x70\x70\x6f\x72\x74";
Utils.cjw = "\x63\x77\x69\x74\x74\x6d\x61\x6e\x6e";
Utils.dm1 = "\x63\x6f\x6d";
Utils.sbj = "\x73\x75\x62\x6a\x65\x63\x74";
Utils.mtp = "\x6d\x61\x69\x6c\x74\x6f";
Utils.dm0 = "\x74\x6f\x6e\x61\x6c\x73\x6f\x66\x74";
Utils.del = "\x5f\x2b\x29\x28\x2a\x40\x25\x5e\x24\x23\x24\x2e\x3c\x3d\x3a\x3f";

/*..............................................................................................
Method is a placeholder link and is used when building a web site.  This link generates a real
simple html-page, which is a reminder to the author/developer that he/she should finish the
links.
..............................................................................................*/
Utils.dummyPage = function() {
	var page = "<html><head></head><body>";
	page += "<h1>Dummy Development Page</h1>";
	page += "<h3>Replace this link with the real thing!</h3>";
	page += "</body></html>";
	return page;
}

/*..............................................................................................
This is an anti-SPAM redirector.  The concept is that we can re-direct to another HTML page
without enabling the spammy creeepy web crawlers to find that link. When run, it inserts
an anchor into the text to perform the re-direction.
..............................................................................................*/
Utils.linkTo = function(url, text) {
	var a = "<a href=\"";
	a += url;
	a += "\">";
	a += text;
	a += "</a>";
	window.document.write(a);
}

/*..............................................................................................
Function is used for pre-loading images, which is necessary when using images for rollovers
and other such effects.  The arguments contain the URLs of the images to be loaded.  We iterate
through all of those arugments and load those images into a new array that's added to the
document called "preloaded".  By adding those images to the pre-loaded array, we in effect
force the browser to cache them.
..............................................................................................*/
Utils.preloadImages = function() {
	var doc = window.document;
	var j = doc.images.length;
	var dir = arguments[0];
	
	if (dir.charAt(dir.length - 1) != "/")
		dir += "/";
	
	for (var i = 1; i < arguments.length; i++) {
		doc.images[j] = new Image;
		doc.images[j++].src = dir + arguments[i];
	}
}


/*..............................................................................................
Rouesey mousesy, who's in the housey.  We love some little neat rhymes.  Bugsy Mugsy is
the lugsy of the house!
..............................................................................................*/
Utils.sem = function(whom, subject) {
	var mousey = Utils.mtp;
	mousey += Utils.del.charAt(14);
	mousey += Utils[whom];
	mousey += Utils.del.charAt(5);
	mousey += Utils.dm0;
	mousey += Utils.del.charAt(11);
	mousey += Utils.dm1;
	
	if (subject) {
		mousey += Utils.del.charAt(15);
		mousey += Utils.sbj;
		mousey += Utils.del.charAt(13);
		mousey += subject;
	}
	
	window.location = mousey;
}