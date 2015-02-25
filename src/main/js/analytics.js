 // Define a method to load Analytics.js from our CDN,
 // and that will be sure to only ever load it once.
    
    analytics.load = function(key){
      // Create an async script element based on your key.
      var script = document.createElement('script');
      script.type = 'text/javascript';
      script.async = true;
      script.src = ('https:' === document.location.protocol
        ? 'https://' : 'http://')
        + 'cdn.segment.com/analytics.js/v1/'
        + key + '/analytics.min.js';




//Analytics Methods: Page 


// Identify User -- Create [anonymousId] token? 
analytics.identify('1e810c197e', {
  name: 'Bill Lumbergh',
  email: 'bill@initech.com'
});

//This to track 
analytics.trackClick([userID], {
	//possible to id word
	//# clicks total
	//#clicksWord
	anonymousId: () //auto-generate? 
	integrations: {
    'All': false,
    'Mixpanel': true,
    'KISSMetrics': true,
    'Google Analytics': false
  }
});