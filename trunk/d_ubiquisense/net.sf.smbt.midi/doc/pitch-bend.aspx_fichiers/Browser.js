/***********************************************************************************************
Copyright (c) 2005 Tonalsoft Inc
All Rights Reserved

AUTHOR:   Christoph Wittmann
CREATED:  2005-01-10
************************************************************************************************/

/***********************************************************************************************
Browser

A collection of functions that provide support for the versioning and validation of the user's
web browser.  These functions are really critical for ensure that at a minimu, we notify the
user if we think they're using an anitquated browser.
************************************************************************************************/
function Browser() {
}

/*..............................................................................................
Function checks whether or not the passed token contains the MSIE version number.  This part
is simple since we just check for that text and then parse the remaining portion of the string
to be the version number.
..............................................................................................*/
Browser.checkMSIE = function(token) {
	var index = token.toLowerCase().indexOf("msie");
	
	if (index >= 0) {
		var verTxt = token.slice(index + 5, token.length);
		return parseFloat(verTxt);
	}
	
	return -1;
}

/*..............................................................................................
Parses the appVersion string returned by the IE navigator object.  What we're looking for is
the MSIE value.  However, this takes a little work; especially so because we want to avoid using
regular expressions, which a considered to be a more-advanced feature.  What this function
does is to fetch the text within the parenthetical expression and then to part each of the
tokens in that string (semicolon delimited) for the value MSIE.  If found, we then take the
version number appearing after the text "MSIE" and parse it to a number to get the version.
..............................................................................................*/
Browser.parseIE = function(version) {
	var verNum = -1;
	var i0 = version.indexOf("(");
	var i1 = version.indexOf(")");
							   
	if (i0 >= 0 && i1 >= 0 && i1 > i0 + 1) {
		var at = 0;
		var parenthetical = version.slice(i0 + 1, i1);
		var len = parenthetical.length;
		var index = parenthetical.indexOf(";");
		
		while (at < len && verNum == -1) {
			if (index >= 0) {
				var token = parenthetical.slice(at, index);
				verNum = Browser.checkMSIE(token);
				at = index + 1;
				index = parenthetical.indexOf(";", at);
			}
			else {
				var token = parenthetical.slice(at, len);
				verNum = Browser.checkMSIE(token);
				at = len;
			}
		}
	}
	
	return verNum;
}

/*..............................................................................................
Parses the Netscape Navigator version number, which is actually quite straightforward.  The
version number/level appears right before the parenthetical clause.
..............................................................................................*/
Browser.parseNS = function(version) {
	var verNum = -1;
	var i0 = version.indexOf("(");

	if (i0 > 0) {
		var verTxt = version.slice(0, i0);
		return parseFloat(verTxt);
	}

	return verNum;
}

/*..............................................................................................
This method performs a thorough test on the browser application data including the software
identifier and the browser version.  If we determine that the broswer is inadequate, we'll
just re-direct the user to the bad-browser page.  Additionally, IE has some major quirks.
Hence, we'll set the useIE flag on the window for future reference.
..............................................................................................*/
Browser.probeBrowser = function() {
	window.useIE = false;
	window.useNS = false;
	window.useMZ = false;
	window.useOP = false;
	window.browserSupported = false;
	var appName = window.navigator.appName.toLowerCase();
	
	if (appName.indexOf("microsoft") >= 0) {
		window.useIE = true;
		window.browserSupported = Browser.parseIE(window.navigator.appVersion) >= 6;
	}
	else if (appName.indexOf("netscape") >= 0) {
		window.useNS = true;
		window.browserSupported = Browser.parseNS(window.navigator.appVersion) >= 5;
	}
	else if (appName.indexOf("mozilla") >= 0) {
		window.useMZ = true;
		window.browserSupported = true;
	}
	else if (appName.indexOf("opera") >= 0) {
		window.useOP = true;
		window.browserSupported = true;
	}
}

/*..............................................................................................
When all is said and done (i.e., interpreted), let's go ahead an validate the browser
automatically.
..............................................................................................*/
Browser.probeBrowser();