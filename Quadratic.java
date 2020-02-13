public class Quadratic {
  public static void main(String[] args) { //create main method

    double varA; // declare variable a
    double varB; // declare variable b
    double varC; // declare variable c

    System.out.println("Enter variable a: "); // prompt user to enter variable a
    varA = TextIO.getlnDouble();

    System.out.println("Enter variable b: "); // prompt user to enter variable b
    varB = TextIO.getlnDouble();

    System.out.println("Enter variable c: "); // prompt user to enter variable c
    varC = TextIO.getlnDouble();

    if ((Math.pow(varB, 2) - (4 * varA * varC)) < 0) { // first conditional
          System.out.println("Error: No real roots."); // if result is negative, print error message
        }
    else { // else, if positive, run the equations and print results

      double xPlus = ((-varB + (Math.sqrt(Math.pow(varB, 2) - (4 * varA * varC)))) / (2 * varA)); // first quadratic equation
      double xMinus = ((-varB - (Math.sqrt(Math.pow(varB, 2) - (4 * varA * varC)))) / (2 * varA)); // second quadratic equation

      System.out.printf("X1 equates to: %1.2f%n", xPlus); // print results of x1
      System.out.printf("X2 equates to: %1.2f%n", xMinus); // print results of x2
    }
  } // end of main()
} // end of class Quadratic
