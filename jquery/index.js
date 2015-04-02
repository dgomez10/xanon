//= require_self
//= require_tree ./blocks
//= require_tree ./generic






@mixin descibe($horizontal-align){ 
  #content-box {
    horizontal-align : 516px; 
   }
}
body {@include content-box("horizontal-align")}




@mixin body(align){
   %horizontal-align {
      align: $align;
    }
  body {  
   @include ("horizontal-align")
}


@mixin body($horizontal-align){
  $Placeholder-selectors: unique-id("horizontal-align")
   %horizontal-align: {
      align: $align;
    }
  body {  
   @include ("horizontal-align")
}


