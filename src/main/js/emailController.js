

xanonEmail.controller('emailController',['$scope', '$firebase' function($scope, $firebase) {
  $firebase
  var url = "https://o8i28rwmv81.firebaseio-demo.com/"; 
  var ref = new Firebase(url);
  $scope.messages = $firebase(myDataRef).$asArray();

  $scope.master = {};

  $scope.update = function(user) {
    $scope.master = angular.copy(user);
  };

  $scope.reset = function(form) {
    if (form) {
      form.$setPristine();
      form.$setUntouched();
    }
    $scope.user = angular.copy($scope.master);
  };

  $scope.reset();

  $scope.submitForm = function(user.name) {
    if (user.name) {
        error: $pristine || $dirty
        success: $touched 
    };
  };

  $scope.addUser = function(user.name){
    pg.connect(process.env.DATABASE_URL, function(err, client){
      var query = client.query('VALUES(\'' + $scope.user.name + '\', \'' + $scope.user.email + '\')')
      query.on('row', function(row){
        console.log(JSON.stringify(row));
      });

    }); //I dont know but have a psql database already -- how do I find the URL? 
  }; 

}]);


xanonEmail.config(['$routeProvider', function ($routeProvider) {
  $routeProvider.when('/dashboard', {
    templateUrl:'xanon/wp_index.html',
    controller:'EmailController',
    resolve:{
      projects:['Xanon', function (Xanon) {
        //TODO: need to know the current user here
        return Xanon.all();
      }],
      tasks:['Tasks', function (Tasks) {
        //TODO: need to know the current user here
        return Tasks.all();
      }]
    }
  });
}]) //NEED TO BE ABLE TO RECONFIGURE THE LAST PART OF THE METHOD

