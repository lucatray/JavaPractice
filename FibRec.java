public class FibRec implements FibInterface {

 public void fibSequence(int n){

   if(n > 1)
     System.out.println("The number at " + n + " is: " + getFib(n));

   if(n < 0){ // cannot have a negative integer
     System.out.println("Number must be postive.")
     return;
   }
  }



 public int getFib(int n){

   if(n == 0){ // fib number at 0 is 0
     return 0;
   }

   if(n == 1){ // fib number at 1 is 1
     return 1;
   }

   if(n > 1){
     return getFib(n-1) + getFib(n-2); // returns the recursive solution to the fib sequence
   }
   return -1; 
 } // end of getFib

} // end of class FibRec
