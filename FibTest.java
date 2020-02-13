import java.util.Scanner;


public class FibTest {

  public static void main(String[] args){

    FibInterface fibIter = new FibIter();
    FibInterface fibRec = new FibRec();


    Scanner s = new Scanner(System.in);
    System.out.println("Enter an integer (any letter to quit): ");
    while(s.hasNextInt()){
      int val=s.nextInt();
      fibRec.fibSequence(val);
      System.out.println("The value of the Fib number " + val  + " is " + fibRec.getFib(val));
      for(int i=0;i<val;i++){
        System.out.println(fibRec.getFib(i));
      }
      System.out.println("Enter an integer (any letter to quit): ");
    }
  }
}

/* -fibIter and fibRec both create instances of FibInterface.
   -the iterative solution to the fibonacci sequence allows us to calculate larger numbers of the sequnce and number becuase it solves it iteratively.
   -The recursive solution makes calls to itself to solve the sequence which results in an exponential solution, thus making it infeasible to solve larger numbers.
   -you can see the difference between the two solutions around the number 40. There is a slight delay from when you enter a number and the program produces the output.
   -As a result, the iterative solution is a much more viable option to solve this sequence for larger numbers. */
