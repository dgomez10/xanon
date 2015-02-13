 module.directive( "addEmail", [ 'Email', function( Email ) {
 2   return {
 3     restrict: "A",
 4     link: function( scope, element, attrs ) {
 5       element.bind( "click", function() {
 6         Email.addEmail( { email: "lucy@gmail.com", name: "Keaton Lucas" } );
 7       });
 8     }
 9   }
10 }]);