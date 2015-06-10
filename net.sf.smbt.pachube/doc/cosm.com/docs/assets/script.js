if(!$("html").hasClass("oldie")){(function(f,e){var h=f.History=f.History||{},g=f.jQuery;if(typeof h.Adapter!="undefined"){throw new Error("History.js Adapter has already been loaded...")}h.Adapter={bind:function(i,d,j){g(i).bind(d,j)},trigger:function(i,d,j){g(i).trigger(d,j)},extractEventData:function(b,k,j){var i=k&&k.originalEvent&&k.originalEvent[b]||j&&j[b]||e;return i},onDomLoad:function(b){g(b)}},typeof h.init!="undefined"&&h.init()})(window),function(B,A){var z=B.console||A,y=B.document,x=B.navigator,w=B.sessionStorage||!1,v=B.setTimeout,u=B.clearTimeout,t=B.setInterval,s=B.clearInterval,r=B.JSON,q=B.alert,p=B.History=B.History||{},o=B.history;r.stringify=r.stringify||r.encode,r.parse=r.parse||r.decode;if(typeof p.init!="undefined"){throw new Error("History.js Core has already been loaded...")}p.init=function(){return typeof p.Adapter=="undefined"?!1:(typeof p.initCore!="undefined"&&p.initCore(),typeof p.initHtml4!="undefined"&&p.initHtml4(),!0)},p.initCore=function(){if(typeof p.initCore.initialized!="undefined"){return !1}p.initCore.initialized=!0,p.options=p.options||{},p.options.hashChangeInterval=p.options.hashChangeInterval||100,p.options.safariPollInterval=p.options.safariPollInterval||500,p.options.doubleCheckInterval=p.options.doubleCheckInterval||500,p.options.storeInterval=p.options.storeInterval||1000,p.options.busyDelay=p.options.busyDelay||250,p.options.debug=p.options.debug||!1,p.options.initialTitle=p.options.initialTitle||y.title,p.intervalList=[],p.clearAllIntervals=function(){var d,c=p.intervalList;if(typeof c!="undefined"&&c!==null){for(d=0;d<c.length;d++){s(c[d])}p.intervalList=null}},p.debug=function(){(p.options.debug||!1)&&p.log.apply(p,arguments)},p.log=function(){var d=typeof z!="undefined"&&typeof z.log!="undefined"&&typeof z.log.apply!="undefined",c=y.getElementById("log"),D,C,n,m,l;d?(m=Array.prototype.slice.call(arguments),D=m.shift(),typeof z.debug!="undefined"?z.debug.apply(z,[D,m]):z.log.apply(z,[D,m])):D="\n"+arguments[0]+"\n";for(C=1,n=arguments.length;C<n;++C){l=arguments[C];if(typeof l=="object"&&typeof r!="undefined"){try{l=r.stringify(l)}catch(k){}}D+="\n"+l+"\n"}return c?(c.value+=D+"\n-----\n",c.scrollTop=c.scrollHeight-c.clientHeight):d||q(D),!0},p.getInternetExplorerMajorVersion=function(){var c=p.getInternetExplorerMajorVersion.cached=typeof p.getInternetExplorerMajorVersion.cached!="undefined"?p.getInternetExplorerMajorVersion.cached:function(){var e=3,d=y.createElement("div"),f=d.getElementsByTagName("i");while((d.innerHTML="<!--[if gt IE "+ ++e+"]><i></i><![endif]-->")&&f[0]){}return e>4?e:!1}();return c},p.isInternetExplorer=function(){var c=p.isInternetExplorer.cached=typeof p.isInternetExplorer.cached!="undefined"?p.isInternetExplorer.cached:Boolean(p.getInternetExplorerMajorVersion());return c},p.emulated={pushState:!Boolean(B.history&&B.history.pushState&&B.history.replaceState&&!/ Mobile\/([1-7][a-z]|(8([abcde]|f(1[0-8]))))/i.test(x.userAgent)&&!/AppleWebKit\/5([0-2]|3[0-2])/i.test(x.userAgent)),hashChange:Boolean(!("onhashchange" in B||"onhashchange" in y)||p.isInternetExplorer()&&p.getInternetExplorerMajorVersion()<8)},p.enabled=!p.emulated.pushState,p.bugs={setHash:Boolean(!p.emulated.pushState&&x.vendor==="Apple Computer, Inc."&&/AppleWebKit\/5([0-2]|3[0-3])/.test(x.userAgent)),safariPoll:Boolean(!p.emulated.pushState&&x.vendor==="Apple Computer, Inc."&&/AppleWebKit\/5([0-2]|3[0-3])/.test(x.userAgent)),ieDoubleCheck:Boolean(p.isInternetExplorer()&&p.getInternetExplorerMajorVersion()<8),hashEscape:Boolean(p.isInternetExplorer()&&p.getInternetExplorerMajorVersion()<7)},p.isEmptyObject=function(d){for(var c in d){return !1}return !0},p.cloneObject=function(e){var d,f;return e?(d=r.stringify(e),f=r.parse(d)):f={},f},p.getRootUrl=function(){var c=y.location.protocol+"//"+(y.location.hostname||y.location.host);if(y.location.port||!1){c+=":"+y.location.port}return c+="/",c},p.getBaseHref=function(){var e=y.getElementsByTagName("base"),d=null,f="";return e.length===1&&(d=e[0],f=d.href.replace(/[^\/]+$/,"")),f=f.replace(/\/+$/,""),f&&(f+="/"),f},p.getBaseUrl=function(){var c=p.getBaseHref()||p.getBasePageUrl()||p.getRootUrl();return c},p.getPageUrl=function(){var e=p.getState(!1,!1),d=(e||{}).url||y.location.href,f;return f=d.replace(/\/+$/,"").replace(/[^\/]+$/,function(h,g,i){return/\./.test(h)?h:h+"/"}),f},p.getBasePageUrl=function(){var c=y.location.href.replace(/[#\?].*/,"").replace(/[^\/]+$/,function(e,d,f){return/[^\/]$/.test(e)?"":e}).replace(/\/+$/,"")+"/";return c},p.getFullUrl=function(f,e){var h=f,g=f.substring(0,1);return e=typeof e=="undefined"?!0:e,/[a-z]+\:\/\//.test(f)||(g==="/"?h=p.getRootUrl()+f.replace(/^\/+/,""):g==="#"?h=p.getPageUrl().replace(/#.*/,"")+f:g==="?"?h=p.getPageUrl().replace(/[\?#].*/,"")+f:e?h=p.getBaseUrl()+f.replace(/^(\.\/)+/,""):h=p.getBasePageUrl()+f.replace(/^(\.\/)+/,"")),h.replace(/\#$/,"")},p.getShortUrl=function(f){var e=f,h=p.getBaseUrl(),g=p.getRootUrl();return p.emulated.pushState&&(e=e.replace(h,"")),e=e.replace(g,"/"),p.isTraditionalAnchor(e)&&(e="./"+e),e=e.replace(/^(\.\/)+/g,"./").replace(/\#$/,""),e},p.store={},p.idToState=p.idToState||{},p.stateToId=p.stateToId||{},p.urlToId=p.urlToId||{},p.storedStates=p.storedStates||[],p.savedStates=p.savedStates||[],p.normalizeStore=function(){p.store.idToState=p.store.idToState||{},p.store.urlToId=p.store.urlToId||{},p.store.stateToId=p.store.stateToId||{}},p.getState=function(e,d){typeof e=="undefined"&&(e=!0),typeof d=="undefined"&&(d=!0);var f=p.getLastSavedState();return !f&&d&&(f=p.createStateObject()),e&&(f=p.cloneObject(f),f.url=f.cleanUrl||f.url),f},p.getIdByState=function(e){var d=p.extractId(e.url),f;if(!d){f=p.getStateString(e);if(typeof p.stateToId[f]!="undefined"){d=p.stateToId[f]}else{if(typeof p.store.stateToId[f]!="undefined"){d=p.store.stateToId[f]}else{for(;;){d=(new Date).getTime()+String(Math.random()).replace(/\D/g,"");if(typeof p.idToState[d]=="undefined"&&typeof p.store.idToState[d]=="undefined"){break}}p.stateToId[f]=d,p.idToState[d]=e}}}return d},p.normalizeState=function(e){var d,f;if(!e||typeof e!="object"){e={}}if(typeof e.normalized!="undefined"){return e}if(!e.data||typeof e.data!="object"){e.data={}}d={},d.normalized=!0,d.title=e.title||"",d.url=p.getFullUrl(p.unescapeString(e.url||y.location.href)),d.hash=p.getShortUrl(d.url),d.data=p.cloneObject(e.data),d.id=p.getIdByState(d),d.cleanUrl=d.url.replace(/\??\&_suid.*/,""),d.url=d.cleanUrl,f=!p.isEmptyObject(d.data);if(d.title||f){d.hash=p.getShortUrl(d.url).replace(/\??\&_suid.*/,""),/\?/.test(d.hash)||(d.hash+="?"),d.hash+="&_suid="+d.id}return d.hashedUrl=p.getFullUrl(d.hash),(p.emulated.pushState||p.bugs.safariPoll)&&p.hasUrlDuplicate(d)&&(d.url=d.hashedUrl),d},p.createStateObject=function(f,e,h){var g={data:f,title:e,url:h};return g=p.normalizeState(g),g},p.getStateById=function(d){d=String(d);var e=p.idToState[d]||p.store.idToState[d]||A;return e},p.getStateString=function(f){var e,h,g;return e=p.normalizeState(f),h={data:e.data,title:f.title,url:f.url},g=r.stringify(h),g},p.getStateId=function(e){var d,f;return d=p.normalizeState(e),f=d.id,f},p.getHashByState=function(e){var d,f;return d=p.normalizeState(e),f=d.hash,f},p.extractId=function(f){var e,h,g;return h=/(.*)\&_suid=([0-9]+)$/.exec(f),g=h?h[1]||f:f,e=h?String(h[2]||""):"",e||!1},p.isTraditionalAnchor=function(d){var c=!/[\/\?\.]/.test(d);return c},p.extractState=function(g,f){var j=null,i,h;return f=f||!1,i=p.extractId(g),i&&(j=p.getStateById(i)),j||(h=p.getFullUrl(g),i=p.getIdByUrl(h)||!1,i&&(j=p.getStateById(i)),!j&&f&&!p.isTraditionalAnchor(g)&&(j=p.createStateObject(null,null,h))),j},p.getIdByUrl=function(d){var e=p.urlToId[d]||p.store.urlToId[d]||A;return e},p.getLastSavedState=function(){return p.savedStates[p.savedStates.length-1]||A},p.getLastStoredState=function(){return p.storedStates[p.storedStates.length-1]||A},p.hasUrlDuplicate=function(e){var d=!1,f;return f=p.extractState(e.url),d=f&&f.id!==e.id,d},p.storeState=function(c){return p.urlToId[c.url]=c.id,p.storedStates.push(p.cloneObject(c)),c},p.isLastSavedState=function(g){var f=!1,j,i,h;return p.savedStates.length&&(j=g.id,i=p.getLastSavedState(),h=i.id,f=j===h),f},p.saveState=function(c){return p.isLastSavedState(c)?!1:(p.savedStates.push(p.cloneObject(c)),!0)},p.getStateByIndex=function(d){var c=null;return typeof d=="undefined"?c=p.savedStates[p.savedStates.length-1]:d<0?c=p.savedStates[p.savedStates.length+d]:c=p.savedStates[d],c},p.getHash=function(){var c=p.unescapeHash(y.location.hash);return c},p.unescapeString=function(e){var g=e,f;for(;;){f=B.unescape(g);if(f===g){break}g=f}return g},p.unescapeHash=function(d){var c=p.normalizeHash(d);return c=p.unescapeString(c),c},p.normalizeHash=function(d){var c=d.replace(/[^#]*#/,"").replace(/#.*/,"");return c},p.setHash=function(g,d){var j,i,h;return d!==!1&&p.busy()?(p.pushQueue({scope:p,callback:p.setHash,args:arguments,queue:d}),!1):(j=p.escapeHash(g),p.busy(!0),i=p.extractState(g,!0),i&&!p.emulated.pushState?p.pushState(i.data,i.title,i.url,!1):y.location.hash!==j&&(p.bugs.setHash?(h=p.getPageUrl(),p.pushState(null,null,h+"#"+j,!1)):y.location.hash=j),p)},p.escapeHash=function(d){var e=p.normalizeHash(d);return e=B.escape(e),p.bugs.hashEscape||(e=e.replace(/\%21/g,"!").replace(/\%26/g,"&").replace(/\%3D/g,"=").replace(/\%3F/g,"?")),e},p.getHashByUrl=function(d){var c=String(d).replace(/([^#]*)#?([^#]*)#?(.*)/,"$2");return c=p.unescapeHash(c),c},p.setTitle=function(f){var d=f.title,h;d||(h=p.getStateByIndex(0),h&&h.url===f.url&&(d=h.title||p.options.initialTitle));try{y.getElementsByTagName("title")[0].innerHTML=d.replace("<","&lt;").replace(">","&gt;").replace(" & "," &amp; ")}catch(g){}return y.title=d,p},p.queues=[],p.busy=function(d){typeof d!="undefined"?p.busy.flag=d:typeof p.busy.flag=="undefined"&&(p.busy.flag=!1);if(!p.busy.flag){u(p.busy.timeout);var c=function(){var e,g,f;if(p.busy.flag){return}for(e=p.queues.length-1;e>=0;--e){g=p.queues[e];if(g.length===0){continue}f=g.shift(),p.fireQueueItem(f),p.busy.timeout=v(c,p.options.busyDelay)}};p.busy.timeout=v(c,p.options.busyDelay)}return p.busy.flag},p.busy.flag=!1,p.fireQueueItem=function(c){return c.callback.apply(c.scope||p,c.args||[])},p.pushQueue=function(c){return p.queues[c.queue||0]=p.queues[c.queue||0]||[],p.queues[c.queue||0].push(c),p},p.queue=function(d,c){return typeof d=="function"&&(d={callback:d}),typeof c!="undefined"&&(d.queue=c),p.busy()?p.pushQueue(d):p.fireQueueItem(d),p},p.clearQueue=function(){return p.busy.flag=!1,p.queues=[],p},p.stateChanged=!1,p.doubleChecker=!1,p.doubleCheckComplete=function(){return p.stateChanged=!0,p.doubleCheckClear(),p},p.doubleCheckClear=function(){return p.doubleChecker&&(u(p.doubleChecker),p.doubleChecker=!1),p},p.doubleCheck=function(c){return p.stateChanged=!1,p.doubleCheckClear(),p.bugs.ieDoubleCheck&&(p.doubleChecker=v(function(){return p.doubleCheckClear(),p.stateChanged||c(),!0},p.options.doubleCheckInterval)),p},p.safariStatePoll=function(){var d=p.extractState(y.location.href),e;if(!p.isLastSavedState(d)){e=d}else{return}return e||(e=p.createStateObject()),p.Adapter.trigger(B,"popstate"),p},p.back=function(c){return c!==!1&&p.busy()?(p.pushQueue({scope:p,callback:p.back,args:arguments,queue:c}),!1):(p.busy(!0),p.doubleCheck(function(){p.back(!1)}),o.go(-1),!0)},p.forward=function(c){return c!==!1&&p.busy()?(p.pushQueue({scope:p,callback:p.forward,args:arguments,queue:c}),!1):(p.busy(!0),p.doubleCheck(function(){p.forward(!1)}),o.go(1),!0)},p.go=function(e,d){var f;if(e>0){for(f=1;f<=e;++f){p.forward(d)}}else{if(!(e<0)){throw new Error("History.go: History.go requires a positive or negative integer passed.")}for(f=-1;f>=e;--f){p.back(d)}}return p};if(p.emulated.pushState){var b=function(){};p.pushState=p.pushState||b,p.replaceState=p.replaceState||b}else{p.onPopState=function(d,m){var l=!1,k=!1,j,i;return p.doubleCheckComplete(),j=p.getHash(),j?(i=p.extractState(j||y.location.href,!0),i?p.replaceState(i.data,i.title,i.url,!1):(p.Adapter.trigger(B,"anchorchange"),p.busy(!1)),p.expectedStateId=!1,!1):(l=p.Adapter.extractEventData("state",d,m)||!1,l?k=p.getStateById(l):p.expectedStateId?k=p.getStateById(p.expectedStateId):k=p.extractState(y.location.href),k||(k=p.createStateObject(null,null,y.location.href)),p.expectedStateId=!1,p.isLastSavedState(k)?(p.busy(!1),!1):(p.storeState(k),p.saveState(k),p.setTitle(k),p.Adapter.trigger(B,"statechange"),p.busy(!1),!0))},p.Adapter.bind(B,"popstate",p.onPopState),p.pushState=function(g,k,j,i){if(p.getHashByUrl(j)&&p.emulated.pushState){throw new Error("History.js does not support states with fragement-identifiers (hashes/anchors).")}if(i!==!1&&p.busy()){return p.pushQueue({scope:p,callback:p.pushState,args:arguments,queue:i}),!1}p.busy(!0);var h=p.createStateObject(g,k,j);return p.isLastSavedState(h)?p.busy(!1):(p.storeState(h),p.expectedStateId=h.id,o.pushState(h.id,h.title,h.url),p.Adapter.trigger(B,"popstate")),!0},p.replaceState=function(g,k,j,i){if(p.getHashByUrl(j)&&p.emulated.pushState){throw new Error("History.js does not support states with fragement-identifiers (hashes/anchors).")}if(i!==!1&&p.busy()){return p.pushQueue({scope:p,callback:p.replaceState,args:arguments,queue:i}),!1}p.busy(!0);var h=p.createStateObject(g,k,j);return p.isLastSavedState(h)?p.busy(!1):(p.storeState(h),p.expectedStateId=h.id,o.replaceState(h.id,h.title,h.url),p.Adapter.trigger(B,"popstate")),!0}}if(w){try{p.store=r.parse(w.getItem("History.store"))||{}}catch(a){p.store={}}p.normalizeStore()}else{p.store={},p.normalizeStore()}p.Adapter.bind(B,"beforeunload",p.clearAllIntervals),p.Adapter.bind(B,"unload",p.clearAllIntervals),p.saveState(p.storeState(p.extractState(y.location.href,!0))),w&&(p.onUnload=function(){var e,d;try{e=r.parse(w.getItem("History.store"))||{}}catch(f){e={}}e.idToState=e.idToState||{},e.urlToId=e.urlToId||{},e.stateToId=e.stateToId||{};for(d in p.idToState){if(!p.idToState.hasOwnProperty(d)){continue}e.idToState[d]=p.idToState[d]}for(d in p.urlToId){if(!p.urlToId.hasOwnProperty(d)){continue}e.urlToId[d]=p.urlToId[d]}for(d in p.stateToId){if(!p.stateToId.hasOwnProperty(d)){continue}e.stateToId[d]=p.stateToId[d]}p.store=e,p.normalizeStore(),w.setItem("History.store",r.stringify(e))},p.intervalList.push(t(p.onUnload,p.options.storeInterval)),p.Adapter.bind(B,"beforeunload",p.onUnload),p.Adapter.bind(B,"unload",p.onUnload));if(!p.emulated.pushState){p.bugs.safariPoll&&p.intervalList.push(t(p.safariStatePoll,p.options.safariPollInterval));if(x.vendor==="Apple Computer, Inc."||(x.appCodeName||"")==="Mozilla"){p.Adapter.bind(B,"hashchange",function(){p.Adapter.trigger(B,"popstate")}),p.getHash()&&p.Adapter.onDomLoad(function(){p.Adapter.trigger(B,"hashchange")})}}},p.init()}(window)}else{var History={enabled:false}}window.log=function(){log.history=log.history||[];log.history.push(arguments);if(this.console){arguments.callee=arguments.callee.caller;var a=[].slice.call(arguments);(typeof console.log==="object"?log.apply.call(console.log,console,a):console.log.apply(console,a))}};(function(e){function h(){}for(var g="assert,count,debug,dir,dirxml,error,exception,group,groupCollapsed,groupEnd,info,log,timeStamp,profile,profileEnd,time,timeEnd,trace,warn".split(","),f;f=g.pop();){e[f]=e[f]||h}})((function(){try{console.log();return window.console}catch(a){return window.console={}}})());function makeClass(){return function(a){if(this instanceof arguments.callee){if(typeof this.init=="function"){this.init.apply(this,a.callee?a:arguments)}}else{return new arguments.callee(arguments)}}}Docs=function(){var a=this;a.init();return a};Docs.prototype.init=function(){var a=this;a.settings={anim:{slow:1000,normal:300,fast:150},debug:true,history_default:true,history:function(){return((!History.enabled||!Modernizr.history)?false:a.settings.history_default)}};a.util={scrollToTop:function(b){$("html,body").animate({scrollTop:0},((b&&b>=0)?b:a.settings.anim.normal))},getSiteTitle:function(){return document.title.replace(/^.*?- /,"")},redirect:function(b){if(b&&b!=""){location.href=b}},error:function(b){return b},cookies:{create:function(d,e,f){if(f){var c=new Date();c.setTime(c.getTime()+(f*24*60*60*1000));var b="; expires="+c.toGMTString()}else{var b=""}document.cookie=d+"="+e+b+"; path=/"},read:function(d){var f=d+"=";var b=document.cookie.split(";");for(var e=0;e<b.length;e++){var g=b[e];while(g.charAt(0)==" "){g=g.substring(1,g.length)}if(g.indexOf(f)==0){return g.substring(f.length,g.length)}}return null},erase:function(b){a.util.cookies.create(b,"",-1)}},reducedScreen:function(){return(window.matchMedia&&window.matchMedia("(max-width: 768px)").matches)?true:false}};$(".oldie table tr:nth-child(even)").addClass("even");if($("html").hasClass("ie7")&&location.hash&&location.hash!==""){$("html,body").scrollTop($("html,body").scrollTop()-70)}if(a.settings.history()){a.history()}a.nav();a.tabs();document.addEventListener("touchstart",function(){},true)};Docs.prototype.history=function(){var a=this;a.history.toFunction=function(b){if(b&&(b.url&&b.url!="")&&b.data&&b.data.section&&b.data.action&&a[b.data.section]&&a[b.data.section][b.data.action]){a[b.data.section][b.data.action](b.url)}else{return false}};History.Adapter.bind(window,"statechange",function(){var b=History.getState();a.history.toFunction(b)})};Docs.prototype.nav=function(){var a=this;a.nav.loader={on:function(e){if(!e){return false}e=$(e).first();var f=e.offset(),d=$("#container").offset();if(f&&d){var b=parseInt(f.top,10)-parseInt(e.outerHeight(),10)-(e.hasClass("root")?-92:-29),c=(a.util.reducedScreen&&a.util.reducedScreen())?261:parseInt(d.left,10)-1;if($(".loader2").length){$(".loader2").stop(true,false).fadeIn(a.settings.anim.fast);$(".loader2").animate({top:b,left:c},a.settings.anim.fast)}else{$("body").append('<span class="loader2"></span>');$(".loader2").css({top:b+"px",left:(c-18)+"px"}).animate({left:c+"px"},a.settings.anim.fast)}}},off:function(){if($(".loader2").length){$(".loader2").stop(true,false).fadeOut(((a.util.reducedScreen&&a.util.reducedScreen())?0:a.settings.anim.fast),function(){$(this).remove()})}}};a.nav.toggle=function(b,d){if(!b){return false}var c=$(b).parent("a").next("ul").is(":visible");b=$(b).first();if((d&&!c)||!c){$(".oldie").find(b).removeClass("expand").addClass("collapse");$(b).parent().removeClass("collapsed").next("ul").slideDown(a.settings.anim.normal).removeClass("collapsed")}else{if(!d){$(".oldie").find(b).removeClass("collapse").addClass("expand");$(b).parent().addClass("collapsed").next("ul").slideUp(a.settings.anim.normal).addClass("collapsed")}}};a.nav.mobile={open:function(b){if(Modernizr.csstransitions){$("nav.main").addClass("m-show")}else{$("nav.main").animate({left:0},a.settings.anim.fast,function(){$(this).addClass("m-show").attr("style","")})}$(b).addClass("selected")},close:function(b){if(Modernizr.csstransitions){$("nav.main").removeClass("m-show")}else{$("nav.main").hide().removeClass("m-show").attr("style","")}$(b).removeClass("selected")}};a.nav.to=function(b){if(!b){return false}b=b.replace(location.href.replace(location.pathname,""),"");var c=$('nav.main a[href="'+b+'"]');a.nav.loader.on(c);a.nav.toggle($(".toggle",c),true);if(b&&c.length){$.ajax({url:b,type:"GET",dataType:"html",success:function(d,e){$("#container").html($("#main",d));if(a.util.reducedScreen&&a.util.reducedScreen()){a.nav.mobile.close($("header.main .list"));a.util.scrollToTop(0)}else{a.util.scrollToTop()}$(".selected").removeClass("selected");$(c).parent().addClass("selected");a.tabs();a.nav.loader.off();if(window._gaq){window._gaq.push(["_trackPageview",b])}},timeout:5000,error:function(d,e){if(e=="timeout"){a.util.redirect(this.url)}else{a.util.error(e)}}})}};$("nav.main ul ul").each(function(b){$(this).addClass("collapsed").prev("a").addClass("collapsed has-children")});$("nav.main .selected").first().parents(".collapsed").removeClass("collapsed").attr("style","display:block;").prev("a").removeClass("collapsed");$("nav.main .selected").first().children(".collapsed").removeClass("collapsed").attr("style","display:block;").prev("a").removeClass("collapsed");$("nav.main a").each(function(){$(this).attr("title",$(this).html())});$("nav.main .has-children").each(function(b){if(b){$(this).append('<span class="toggle icon expand">Toggle</span>').find(".toggle").click(function(c){c.stopPropagation();a.nav.toggle($(this));return false}).fadeIn(a.settings.anim.normal)}else{$(this).addClass("root")}});$("header.main .list").click(function(b){b.stopPropagation();if($(this).hasClass("selected")||parseInt($("nav.main").css("left"),10)>0){a.nav.mobile.close($(this))}else{a.nav.mobile.open($(this))}return false});if($("html").hasClass("oldie")){$(".oldie nav.main .selected").first().parents("ul").prev("a").find(".toggle").removeClass("expand").addClass("collapse");$(".oldie nav.main .selected").first().children("ul").prev("a").find(".toggle").removeClass("expand").addClass("collapse");$(".oldie nav.main").css({"background-image":"none"}).find("ul").first().fadeIn(a.settings.anim.normal)}if(a.settings.history()){$("nav.main a").click(function(b){b.stopPropagation();if($(this).attr("href")==location.pathname){History.replaceState({section:"nav",action:"to",mode:"replace"},$(this).attr("title")+" - "+a.util.getSiteTitle(),$(this).attr("href"))}else{History.pushState({section:"nav",action:"to",mode:"new"},$(this).attr("title")+" - "+a.util.getSiteTitle(),$(this).attr("href"))}return false})}};Docs.prototype.tabs=function(){var a=this;a.tabs.selected=a.util.cookies.read("docs.tabs.selected")||"json";a.tabs.instances=[];a.tabs.switchTo=function(d){if(!d){return false}var d=$(d),c=d.closest(".docs-tabs"),f=d.attr("rel"),e=$(".section.selected",c),g=$(".section."+f,c),b={currentSection:parseInt($(".section.selected",c).height(),10)};if(!c.length||f==""||!g.length||g.hasClass("selected")){return false}if(!a.util.reducedScreen()){g.attr("style","position:absolute;right:-999em;display:block;visibility:hidden;").removeClass("hidden");b.targetSection=$(".section."+f,c).height();g.attr("style","height:"+b.currentSection+"px").addClass("hidden");g.animate({height:b.targetSection+"px"},a.settings.anim.normal)}$(".docs-tabs-menu .selected",c).removeClass("selected");$(".section.selected",c).removeClass("selected").addClass("hidden");$(".docs-tabs-menu ."+f,c).addClass("selected");$(".section."+f,c).removeClass("hidden").addClass("selected");a.tabs.selected=f;a.util.cookies.create("docs.tabs.selected",f,30)};$("h1,h2,h3,h4,h5,h6").each(function(){var d=$(this),b=d.html(),c=d.parent();if(b=="Examples"){a.tabs.instances.push(c[0]);d.addClass("title");c.addClass("docs-tabs");c.prepend('<nav class="docs-tabs-menu"><ul class="clearfix"></ul></nav>')}else{if(d.parent(".section").parent(".docs-tabs").length){d.addClass("hidden");c.addClass(b.toLowerCase());if(b.toLowerCase()==a.tabs.selected){c.addClass("selected");d.closest(".docs-tabs").find(".docs-tabs-menu ul").append('<li class="selected '+b.toLowerCase()+'"><a href="#" rel='+b.toLowerCase()+' title="Switch to '+b+'">'+b+"</a></li>")}else{c.addClass("hidden");d.closest(".docs-tabs").find(".docs-tabs-menu ul").append('<li class="'+b.toLowerCase()+'"><a href="#" rel='+b.toLowerCase()+' title="Switch to '+b+'">'+b+"</a></li>")}}else{if(d.closest(".docs-tabs").length){d.addClass("inner-title");c.addClass("inner-section")}}}});$(".docs-tabs-menu a",a.tabs.instances).click(function(b){b.stopPropagation();a.tabs.switchTo($(this));return false});$(".oldie .docs-tabs .section .inner-section:nth-child(2)").addClass("first")};var docs=new Docs();