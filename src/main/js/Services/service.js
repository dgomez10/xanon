 1 module.service( 'Email', [ '$rootScope', function( $rootScope ) {
 2   var service = {
 3     emails: [
 4       { name: "Magician", email: "Raymond E. Feist" },
 5       { name: "The Hobbit", email: "J.R.R Tolkien" }
 6     ],
 7 
 8     addEmail: function ( email ) {
 9       service.books.push( email );
10       $rootScope.$broadcast( 'email.update' );
11     }
12   }
13 
14   return service;
15 }]);