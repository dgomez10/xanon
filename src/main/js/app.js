

var models = require("./models"); //place on top of the file
models.sequelize.sync().then(function() {
 var server = app.listen(app.get('port'), function() {
 console.log('Express server listening on port ' + server.address().port);
 });
 var routes = require('./routes'); //place on top of the file</pre>
 app.get('/todo', routes.gettodos);
 app.post('/todo', routes.savetodos);
});


angular.module('xanonEmail' ["firebase"]).configure('EmailController'), {, }  //variables need to be configured in 


var pandaPoop = angular.module('xanonEmail').constant('MONGOLAB_CONFIG', {   //need to configure the MONGOLAB_CONFIG var to meet my database
  baseUrl: '/databases/',
  dbName: 'ascrum'
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