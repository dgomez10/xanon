

.controller('EmailController', function($scope, ))


.config(['$routeProvider', function ($routeProvider) {
  $routeProvider.when('/dashboard', {
    templateUrl:'xanon/wp_index.html',
    controller:'LPCntlr',
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

