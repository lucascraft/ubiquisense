///////////////////////////////
// API - to be called from java
var circlesArray = [];
var markersArray = [];
var lastDist;

window.init = function( center, zoom, typeId ) {
  var options = {
    disableDefaultUI : true,
    zoom : zoom,
    center : new google.maps.LatLng( center[ 0 ], center[ 1 ] ),
    mapTypeId : typeId
  };
  var parent = document.getElementById( "map_canvas" );
  window.gmap = new google.maps.Map( parent, options );
  window.geocoder = new google.maps.Geocoder();
  
  _registerEventListener();

  
};

window.addGpxFromString = function( gpxXml ) {
	//loadXMLString("");
	
	

	addMarker(gpxXml);

	
	
//	parser = new GPXParser(gpx, gmap);
//	parser.SetTrackColour("#ff0000");					// Set the track line colour
//	parser.SetTrackWidth(5);							// Set the track line width
//	parser.SetMinTrackPointDelta(0.001);				// Set the minimum distance between track points
//	parser.CenterAndZoom(gpx, G_NORMAL_MAP); // Center and Zoom the map over all the points.
//	parser.AddTrackpointsToMap();						// Add the trackpoints
//	parser.AddWaypointsToMap();							// Add the waypoints

	
	
}

window.addKmlFromString = function( kmlXml ) {
	var kml = loadXMLString(kmlXml);
}

window.gotoAddress = function( address ) {
  geocoder.geocode( { "address" : address }, window._handleAddressResolved );
};

window.resolveAddress = function() {
  var req = { "location" : gmap.getCenter() };
  geocoder.geocode( req, window._handleLocationResolved );
};

window.setCenter = function( center ) {  
  window._blockEvents = true;
  gmap.panTo( new google.maps.LatLng( center[ 0 ], center[ 1 ] ) );
  window._blockEvents = false;
}

window.setZoom = function( zoom ) {
  window._blockEvents = true;
  gmap.setZoom( zoom );
  window._blockEvents = false;
}

window.setType = function( type ) {
  gmap.setMapTypeId( type );
}

window.addTrace = function( gpx ) {
	if (gpx) {

	  var polyOptions = {
		strokeColor: '#0000FF',
	    strokeOpacity: 0.7,
	    strokeWeight: 4
	  }
	  
	  poly = new google.maps.Polyline(polyOptions);
	  poly.setMap(gmap);
			  
	  var path = poly.getPath();
	  
      for (l in gpx) {
    	var lat = 0;
    	var lng = 0;
    	if (l % 2 == 0) { // even
    	  lat = gpx[l];
    	} else {            // odd
    	  lng = gpx[l];
    	}
    	var pt = new google.maps.LatLng(lat, lng);
    	path.push(pt);
	  }
	}
}


window.selectMarker = function( position, title ) {
	if (markersArray) {
		var animation = google.maps.Animation.BOUNCE;
		var str1 = title;
		
		var newMarkersArray = [];
		for (i in markersArray) {
			var marker = markersArray[i];
			if (marker) {
				var ll1 = marker.getPosition();
				var ll2 = new google.maps.LatLng(
					position[0], 
					position[1]
		    	);
				var str2 = marker.getTitle();
				if (str1 != str2) {
					animation = google.maps.Animation.DROP;
				}
			    var marker2 = new google.maps.Marker( 
				  {
					position	: marker.getPosition(),
			    	animation   : animation,
			   		title 		: marker.getTitle(),
			    	draggable 	: false
			  	  } 
			  	);
			  	marker2.setMap( gmap );
			}
			newMarkersArray.push(marker2);
		}
		markersArray = newMarkersArray;
	}
}

window.addMarkerDetail = function ( markerTopItems ) {
	if (markerTopItems) {
		var iconPlay = 'http://maps.google.com/mapfiles/ms/micons/green-dot.png';
		var iconStop = 'http://maps.google.com/mapfiles/ms/micons/red-dot.png';

		for (j in markerTopItems) {
			var parts = markerTopItems[j].split(":");
			if (parts[0] && parts[1] && parts[2]) {
		      var id		= parts[0];
		      var coord 	= parts[1].split(",");
		      var status	= parts[2];	
		      
			  if (status == "frozen") {
			      addMarkersFromCoords(id, coord, status, iconStop);
			  } else if (status == "live") {
			      addMarkersFromCoords(id, coord, status, iconPlay);
			  }
		    }
	    } 
	}
}

function addMarkersFromCoords(id, coord, status, icon) {
	  
	  var m = new google.maps.Marker( {
		  position	: new google.maps.LatLng(coord[0], coord[1]),
		  title 		: id,
		  icon			: icon,
		  draggable 	: false
	  });
	  m.setMap( gmap );
	  var _id = id;
	
	  var markerContent = '<div id="content">'+
	    '<div id="siteNotice">'+
	    '</div>'+
	    '<h2 id="firstHeading" class="firstHeading">Cosm Feed</h2>'+
	    '<div id="bodyContent" bgcolor=black fgcolor=white>'+
	    '<p>'+id+'</p>'+
	    '<p>'+status+'</p>'+
	    '</div>'+
	    '</div>';
	  	
	  var infowindow = new google.maps.InfoWindow( 
	    {
	      content : markerContent,
	      disableAutoPan : true
	    } 
	  );
	      
	  google.maps.event.addListener(m, 'click', function() {
	    if (m.getAnimation() != null) {
	    	m.setAnimation(null);
	    } else {
	    	m.setAnimation(google.maps.Animation.BOUNCE);
	    	window._onMarkerSelected( _id );
	    }
	  });
	      
	  google.maps.event.addListener( 
        m, 
		"mouseover", 
		function() {
          infowindow.open( gmap, m );
		}
	  );
	  google.maps.event.addListener( 
		m, 
		"mouseout", 
		function() {
          infowindow.close();
		}
	);

	markersArray.push(m);
}


window.addMarkerList = function( markers ) {
  _clearMarkers();
  if (markers) {
      var markerTopItems = markers.split("|");
      addMarkerDetail( markerTopItems );
  }
}


window.addMarker = function( name ) {
  var marker = new google.maps.Marker( {
    position : gmap.getCenter(),
    title : name,
    draggable : true
  } );
  marker.setMap( gmap );
  var infowindow = new google.maps.InfoWindow( {
      content : name,
      disableAutoPan : true
  } );
  google.maps.event.addListener( marker, "click", function() {
    infowindow.open( gmap, marker );
  } );
}

window.addCircle = function(dist) {  
	var center = new google.maps.LatLng(
		gmap.getCenter().lat(), 
		gmap.getCenter().lng()
	);
	window.addCircleOnPoint(dist, center);
}

window.addCircleOnPoint = function(dist, center) {  
	var radius = parseInt(dist);
	lastDist = radius; 
	window._blockEvents = true;
	var circleOptions = {
      strokeColor: "#FF0000",
      strokeOpacity: 0.6,
      strokeWeight: 3,
      fillColor: "#FF0000",
      fillOpacity: 0,
      map: gmap,
      center: center,
      radius: radius
    };
    _clearOverlays();
    var cityCircle = new google.maps.Circle(circleOptions);
    circlesArray.push(cityCircle);
  	window._blockEvents = false;
}

window.clearMarkers = function() {
	window._clearMarkers();
}

////////////
// Internals

function _clearOverlays() {
  if (circlesArray) {
    for (i in circlesArray) {
      circlesArray[i].setMap(null);
    }
  }
}


function _clearMarkers() {
  if (markersArray) {
	for (i in markersArray) {
		markersArray[i].setMap(null);
	}
  }
}

function setCenterAtLatLng(event) {
	event.stop();
	onBoundsChanged(
		event.latLng.lat(), 
		event.latLng.lng(), 
        gmap.getZoom()
	);
	addCircleOnPoint(lastDist, event.latLng);
	event = null;
}

// Note: Using "_" to mark as non-public API.

window._blockEvents = false;

window._registerEventListener = function(){
  //The actual "center_changed" event can't be easily used because it can create
  //a lot of events (resulting in requests) while dragging. 
  google.maps.event.addListener( gmap, "dragend", function() {
    _handleBoundsChanged();
  } );
  google.maps.event.addListener( gmap, "zoom_changed", function() {
    _handleBoundsChanged();
  } );

  google.maps.event.addListener(gmap, 'click', setCenterAtLatLng );
  google.maps.event.addListener(gmap, 'dblclick',  function(event) {
    event = null;
  } );

 
};

window._onMarkerSelected = function( id ) {
	onMarkerSelected( id );
};


window._handleAddressResolved = function( results, status ) {
  // NOTE: This function is called asynchronously (i.e. not from within java)
  if( status == google.maps.GeocoderStatus.OK && results[ 0 ] ) {
    var newBounds = results[ 0 ].geometry.viewport;
    gmap.fitBounds( newBounds );
  }
};

window._handleLocationResolved = function( results, status ) {
  if( status == google.maps.GeocoderStatus.OK && results[ 0 ] ) {
    onAddressResolved( results[ 0 ].formatted_address );
  }
};

window._handleBoundsChanged = function() {
  // The script that gets executed from java might create change-events that 
  // call a browser-function. That would be a bad idea (unnecessary traffic, 
  // risk of recursion and buggy in SWT), therefore the "blockEvents" flag:
  if( !_blockEvents ) {
    // BrowserFunction:
    onBoundsChanged( gmap.getCenter().lat(), 
                     gmap.getCenter().lng(), 
                     gmap.getZoom() );
  }
};








function loadXMLString(xmlstring) {
	var xmlDoc;
	var parser;
//   if (window.DOMParser) {
//        parser=new DOMParser();
//        xmlDoc=parser.parseFromString(xmlstring,"text/xml");
//    }
//    else // Internet Explorer
//    {
//        xmlDoc=new ActiveXObject("Microsoft.XMLDOM");
//        xmlDoc.async="false";
//        xmlDoc.loadXML(xmlstring); 
//    }
//    return xmlDoc;
//	return "";
}



function drawMarkersFromKMLString(str) {
	$(str).find("Placemark").each(function(i) {
		var coordinates = $("coordinates", this).text().split(",");
		var lat = coordinates[0];
		var lng = coordinates[1];
		
		var x = new google.maps.LatLng(lat, lng)

		var m = new google.maps.Marker({
			map: map, 
			position: x, 
			title:"Hello World!",
			draggable: true,		
			zIndex: i
		});   

		google.maps.event.addListener(m, 'click', function(evt)  {
			var info = document.getElementById('info');
			info.innerHTML = "Clicked marker ID " + this.getZIndex();
		});

		markersArray.push(m);

	})
}

















///////////////////////////////////////////////////////////////////////////////
//loadgpx.4.js
//
//Javascript object to load GPX-format GPS data into Google Maps.
//
//Copyright (C) 2006 Kaz Okuda (http://notions.okuda.ca)
//
//This program is free software; you can redistribute it and/or
//modify it under the terms of the GNU General Public License
//as published by the Free Software Foundation; either version 2
//of the License, or (at your option) any later version.
//
//This program is distributed in the hope that it will be useful,
//but WITHOUT ANY WARRANTY; without even the implied warranty of
//MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//GNU General Public License for more details.
//
//You should have received a copy of the GNU General Public License
//along with this program; if not, write to the Free Software
//Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
//
//If you use this script or have any questions please leave a comment
//at http://notions.okuda.ca/geotagging/projects-im-working-on/gpx-viewer/
//A link to the GPL license can also be found there.
//
///////////////////////////////////////////////////////////////////////////////
//
//History:
// revision 1 - Initial implementation
// revision 2 - Removed LoadGPXFileIntoGoogleMap and made it the callers
//              responsibility.  Added more options (colour, width, delta).
// revision 3 - Waypoint parsing now compatible with Firefox.
// revision 4 - Upgraded to Google Maps API version 2.  Tried changing the way
//            that the map calculated the way the center and zoom level, but
//            GMAP API 2 requires that you center and zoom the map first.
//            I have left the bounding box calculations commented out in case
//            they might come in handy in the future.
//
//Author: Kaz Okuda
//URI: http://notions.okuda.ca/geotagging/projects-im-working-on/gpx-viewer/
//
///////////////////////////////////////////////////////////////////////////////

function GPXParser(xmlDoc, map)
{
	this.xmlDoc = xmlDoc;
	this.map = map;
	this.trackcolour = "#ff00ff"; // red
	this.trackwidth = 5;
	this.mintrackpointdelta = 0.0001
}

//Set the colour of the track line segements.
GPXParser.prototype.SetTrackColour = function(colour)
{
	this.trackcolour = colour;
}

//Set the width of the track line segements
GPXParser.prototype.SetTrackWidth = function(width)
{
	this.trackwidth = width;
}

//Set the minimum distance between trackpoints.
//Used to cull unneeded trackpoints from map.
GPXParser.prototype.SetMinTrackPointDelta = function(delta)
{
	this.mintrackpointdelta = delta;
}

GPXParser.prototype.TranslateName = function(name)
{
	if (name == "wpt")
	{
		return "Waypoint";
	}
	else if (name == "trkpt")
	{
		return "Track Point";
	}
}


GPXParser.prototype.CreateMarker = function(point)
{
	var lon = parseFloat(point.getAttribute("lon"));
	var lat = parseFloat(point.getAttribute("lat"));
	var html = "";

	if (point.getElementsByTagName("html").length > 0)
	{
		for (i=0; i<point.getElementsByTagName("html").item(0).childNodes.length; i++)
		{
			html += point.getElementsByTagName("html").item(0).childNodes[i].nodeValue;
		}
	}
	else
	{
		// Create the html if it does not exist in the point.
		html = "<b>" + this.TranslateName(point.nodeName) + "</b><br>";
		var attributes = point.attributes;
		var attrlen = attributes.length;
		for (i=0; i<attrlen; i++)
		{
			html += attributes.item(i).name + " = " + attributes.item(i).nodeValue + "<br>";
		}

		if (point.hasChildNodes)
		{
			var children = point.childNodes;
			var childrenlen = children.length;
			for (i=0; i<childrenlen; i++)
			{
				// Ignore empty nodes
				if (children[i].nodeType != 1) continue;
				if (children[i].firstChild == null) continue;
				html += children[i].nodeName + " = " + children[i].firstChild.nodeValue + "<br>";
			}
		}
	}

	var marker = new GMarker(new GLatLng(lat,lon));
	GEvent.addListener(marker, "click",
		function()
		{
			marker.openInfoWindowHtml(html);
		}
	);

	this.map.addOverlay(marker);


	// All methods that add items to the map return the bounding box of what they added.
	//var latlng = new GLatLng(lat,lon);
	//return new GLatLngBounds(latlng,latlng);
}


GPXParser.prototype.AddTrackSegmentToMap = function(trackSegment, colour, width)
{
	//var latlngbounds = new GLatLngBounds();

	var trackpoints = trackSegment.getElementsByTagName("trkpt");
	if (trackpoints.length == 0)
	{
		return; //latlngbounds;
	}

	var pointarray = [];

	// process first point
	var lastlon = parseFloat(trackpoints[0].getAttribute("lon"));
	var lastlat = parseFloat(trackpoints[0].getAttribute("lat"));
	var latlng = new GLatLng(lastlat,lastlon);
	pointarray.push(latlng);
	//latlngbounds.extend(latlng);

	// Create a marker at the begining of each track segment
	//this.CreateMarker(trackpoints[0]);

	for (var i=1; i < trackpoints.length; i++)
	{
		var lon = parseFloat(trackpoints[i].getAttribute("lon"));
		var lat = parseFloat(trackpoints[i].getAttribute("lat"));

		// Verify that this is far enough away from the last point to be used.
		var latdiff = lat - lastlat;
		var londiff = lon - lastlon;
		if ( Math.sqrt(latdiff*latdiff + londiff*londiff) > this.mintrackpointdelta )
		{
			lastlon = lon;
			lastlat = lat;
			latlng = new GLatLng(lat,lon);
			pointarray.push(latlng);
			//latlngbounds.extend(latlng);
		}

	}

	var polyline = new GPolyline(pointarray, colour, width);

	this.map.addOverlay(polyline);

	// All methods that add items to the map return the bounding box of what they added.
	//return latlngbounds;
}

GPXParser.prototype.AddTrackToMap = function(track, colour, width)
{
	var segments = track.getElementsByTagName("trkseg");
	//var latlngbounds = new GLatLngBounds();
	for (var i=0; i < segments.length; i++)
	{
		var segmentlatlngbounds = this.AddTrackSegmentToMap(segments[i], colour, width);
		//this.AddTrackSegmentToMap(segments[i], colour, width);
		//latlngbounds.extend(segmentlatlngbounds.getSouthWest());
		//latlngbounds.extend(segmentlatlngbounds.getNorthEast());
	}

	// All methods that add items to the map return the bounding box of what they added.
	//return latlngbounds;
}

GPXParser.prototype.CenterAndZoom = function (trackSegment, maptype)
{

	var pointlist = new Array("trkpt", "wpt");
	var minlat = 0;
	var maxlat = 0;
	var minlon = 0;
	var maxlon = 0;

	for (var pointtype=0; pointtype < pointlist.length; pointtype++)
	{

		// Center the map and zoom on the given segment.
		var trackpoints = trackSegment.getElementsByTagName(pointlist[pointtype]);

		// If the min and max are uninitialized then initialize them.
		if ( (trackpoints.length > 0) && (minlat == maxlat) && (minlat == 0) )
		{
			minlat = parseFloat(trackpoints[0].getAttribute("lat"));
			maxlat = parseFloat(trackpoints[0].getAttribute("lat"));
			minlon = parseFloat(trackpoints[0].getAttribute("lon"));
			maxlon = parseFloat(trackpoints[0].getAttribute("lon"));
		}

		for (var i=0; i < trackpoints.length; i++)
		{
			var lon = parseFloat(trackpoints[i].getAttribute("lon"));
			var lat = parseFloat(trackpoints[i].getAttribute("lat"));

			if (lon < minlon) minlon = lon;
			if (lon > maxlon) maxlon = lon;
			if (lat < minlat) minlat = lat;
			if (lat > maxlat) maxlat = lat;
		}
	}

	if ( (minlat == maxlat) && (minlat == 0) )
	{
		this.map.setCenter(new GLatLng(49.327667, -122.942333), 14);
		return;
	}

	// Center around the middle of the points
	var centerlon = (maxlon + minlon) / 2;
	var centerlat = (maxlat + minlat) / 2;

	var bounds = new GLatLngBounds(new GLatLng(minlat, minlon), new GLatLng(maxlat, maxlon));

	this.map.setCenter(new GLatLng(centerlat, centerlon), this.map.getBoundsZoomLevel(bounds), maptype);
}

GPXParser.prototype.CenterAndZoomToLatLngBounds = function (latlngboundsarray)
{
	var boundingbox = new GLatLngBounds();
	for (var i=0; i<latlngboundsarray.length; i++)
	{
		if (!latlngboundsarray[i].isEmpty())
		{
			boundingbox.extend(latlngboundsarray[i].getSouthWest());
			boundingbox.extend(latlngboundsarray[i].getNorthEast());
		}
	}

	var centerlat = (boundingbox.getNorthEast().lat() + boundingbox.getSouthWest().lat()) / 2;
	var centerlng = (boundingbox.getNorthEast().lng() + boundingbox.getSouthWest().lng()) / 2;
	this.map.setCenter(new GLatLng(centerlat, centerlng), this.map.getBoundsZoomLevel(boundingbox));
}


GPXParser.prototype.AddTrackpointsToMap = function ()
{
	var tracks = this.xmlDoc.documentElement.getElementsByTagName("trk");
	//var latlngbounds = new GLatLngBounds();

	for (var i=0; i < tracks.length; i++)
	{
		this.AddTrackToMap(tracks[i], this.trackcolour, this.trackwidth);
		//var tracklatlngbounds = this.AddTrackToMap(tracks[i], this.trackcolour, this.trackwidth);
		//latlngbounds.extend(tracklatlngbounds.getSouthWest());
		//latlngbounds.extend(tracklatlngbounds.getNorthEast());
	}

	// All methods that add items to the map return the bounding box of what they added.
	//return latlngbounds;
}

GPXParser.prototype.AddWaypointsToMap = function ()
{
	var waypoints = this.xmlDoc.documentElement.getElementsByTagName("wpt");
	//var latlngbounds = new GLatLngBounds();

	for (var i=0; i < waypoints.length; i++)
	{
		this.CreateMarker(waypoints[i]);
		//var waypointlatlngbounds = this.CreateMarker(waypoints[i]);
		//latlngbounds.extend(waypointlatlngbounds.getSouthWest());
		//latlngbounds.extend(waypointlatlngbounds.getNorthEast());
	}

	// All methods that add items to the map return the bounding box of what they added.
	//return latlngbounds;
}



