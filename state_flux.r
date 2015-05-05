

  open(OUT,">movie.txt");
  print OUT "iter\tx\ty\tz\n";
  for ($iter=0; $iter<1000; $iter++) {
    for ($k=0; $k<20; $k++) {
      for ($l=0; $l<20; $l++) {

        $r=0.50;
        $c=(($k+$l)%81)/200;
        $color=2.4*$c;
        $pi=3.14159265358979323846264;
        $x=$k+$r*sin($c*$pi*$iter);
        $y=$l+$r*cos($c*$pi*$iter);

        print OUT "$iter\t$x\t$y\t$color\n";
      }
    }
  }
  close(OUT);


  vv<-read.table("c:/vincentg/movie.txt",header=TRUE);
  iter<-vv$iter;
  for (n in 0:999) {
    x<-vv$x[iter == n]; 
    y<-vv$y[iter == n]; 
    z<-vv$z[iter == n];
    plot(x,y,xlim=c(3,17),ylim=c(3,17),pch=20,cex=1,col=rgb(0,0,z),xlab="",ylab="",axes=TRUE);
    Sys.sleep(0.01); # sleep 0.05 second between each iteration
  }



