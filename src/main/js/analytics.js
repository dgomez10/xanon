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
analytics.page('Views' {

  "anonymousId": "507f191e810c19729de860ea",
  "channel": "browser",
  "context": {
    "ip": "8.8.8.8",
    "userAgent": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_5) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.115 Safari/537.36"
  },
  "event": "Registered",
  "integrations": {
    "All": true,
    "Mixpanel": false,
    "Salesforce": false
    "Google Analytics": true
  },
  "messageId": "022bb90c-bbac-11e4-8dfc-aa07a5b093db",  //auto-generate anon? 
  "name": "Home",
  "projectId": "sjdhv6wim",
  "properties": {
    "title": "Xanon",
    "url": "http://www.xanon.us"
    "path": "url/[blog], [about], [signin]" // how to specify the subdomain?
  },
  "receivedAt": "2015-02-23T22:28:55.387Z",
  "sentAt": "2015-02-23T22:28:55.111Z",
  "timestamp": "2015-02-23T22:28:55.111Z",
  "type": "page",
  "version": "1.1"
});

// Identify User -- Create [anonymousId] token? 
analytics.identify('1e810c197e', {
  name: 'Bill Lumbergh',
  email: 'bill@initech.com'
});

//track Clicks 
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


//track Links
var link = document.getElementById('free-trial-link');

analytics.trackLink(link, 'Clicked Free-Trial Link', {
  plan: 'Enterprise'
});


