



angular.module('xanonEmail').configure('EmailController'), {, }  //variables need to be configured in 


var pandaPoop = angular.module('xanonEmail').constant('MONGOLAB_CONFIG', {   //need to configure the MONGOLAB_CONFIG var to meet my database
  baseUrl: '/databases/',
  dbName: 'email_signup'
});

	.value('email', {
		instruction: 'Enter email here: name@domain.com'
		localize: function(localization){
			this.instruction = localization.instruction
		}, 

	})

	.value('user', {
		instuction: 'Enter First/Last name'
		load: function(name) {
			this.name = name;
		}
	})


pandaPoop.factory ('serviceID', $emailbox function() {
	var helloTank; 
	// factory function body function that makes this possible 
	//this should collect all the e-mail adresses 
})




//beginning to find NN with Bridsons

function rootElement() {
  var bestCandidate, bestDistance = 0;
  for (var i = 0; i < numCandidates; ++i) {
    var c = [Math.random() * width, Math.random() * height],
        d = distance(findClosest(samples, c), c);
    if (d > bestDistance) {
      bestDistance = d;
      bestCandidate = c;
    }
  }
  return bestCandidate;
}


//find closest distance 
 function distance(a, b) {
  var dx = a[0] - b[0],
      dy = a[1] - b[1];
  return Math.sqrt(dx * dx + dy * dy);
}



function void QueryInterface(
  in nsIIDRef login,
  [iid_is(login),retval] out nsQIResult Account_Info
  else 
    throw NS_ERROR_NO_INTERFACE;
 


function makeURI(aURL, aOriginCharset, aBaseURI) {
	//path from Yodlee
  var ioService = Components.classes["//to call local log file of mapreduce yodlee"]
                  .getService(Components.interfaces.nsIIOService);
  return ioService.newURI(aURL, aOriginCharset, aBaseURI);
}

// Function to change the content of t2
function modifyText() {
  var t2 = document.getElementById("t2");
  if (t2.firstChild.nodeValue == "three") {
    t2.firstChild.nodeValue = "two";
  } else {
    t2.firstChild.nodeValue = "three";
  }
}

// add event listener to table
var el = document.getElementById("outside");
el.addEventListener("click", modifyText, false);






