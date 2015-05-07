


function medcouple(vector X):
       // X is a vector of size n
       
       // compute initial ingredients as for the naïve medcouple
       sort_decreasing(X)
       
       xm := median(X)
       xscale := 2*max(X)
       
       Zplus  := [(x - xm)/xscale | x in X such that x >= xm]
       Zminus := [(x - xm)/xscale | x in X such that x <= xm]
       
       p := size(Zplus)
       q := size(Zminus)
       
       function h(i,j):
           a := Zplus[i]
           b := Zminus[j]
           
           if a == b:
               return signum(p - 1 - i - j)
           else:
               return (a + b)/(a - b)
           endif
       endfunction
       
       // begin Kth pair algorithm (Johnson & Mizoguchi)
       
       // the initial left and right boundaries, two vectors of size p
       L := [0, 0, ..., 0]
       R := [q - 1, q - 1, ..., q - 1]
       
       // number of entries to the left of the left boundary
       Ltotal := 0
       
       // number of entries to the left of the right boundary
       Rtotal := p*q
       
       // since we are indexing from zero, the medcouple index is one
       // less than its rank
       medcouple_index := floor(Rtotal/2)
       
       // iterate while the number of entries between the boundaries is
       // greater than the number of rows in the matrix
       while Rtotal - Ltotal > p:
           
           // compute row medians and their associated weights, but skip
           // any rows that are already empty
           middle_idx  := [i | i in [0, 1, ..., p - 1] such that L[i] <= R[i]]
           row_medians := [h(i, floor((L[i] + R[i])/2) | i in middle_idx]
           weights := [R[i] - L[i] + 1 | i in middle_idx]
           
           WM := weighted median(row_medians, weights)
           
           // new tentative right and left boundaries
           P := greater_h(h, p, q, WM)
           Q := less_h(h, p, q, WM)
           
           Ptotal := sum(P) + size(P)
           Qtotal := sum(Q)
           
           // determine which entries to discard, or if we've found the medcouple
           if medcouple_index <= Ptotal - 1:
               R := P
               Rtotal := P
           else:
               if medcouple_index > Qtotal - 1:
                   L := Q
                   Ltotal := Qtotal
               else:
                   // found the medcouple, rank of the weighted median equals medcouple index
                   return WM
               endif
           endif
      
       endwhile
       
       // did not find the medcouple, but there are very few tentative entries remaining
       remaining := [h(i,j) | i in [0, 1, ..., p - 1],
                              j in [L[i], L[i] + 1, ..., R[i]]
                              such that L[i] <= R[i] ]
       
       // select the medcouple by rank amongst the remaining entries
       medcouple := select_nth(remaining, medcouple_index - Ltotal)
      
       return medcouple
   endfunction

