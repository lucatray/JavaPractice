import java.util.Scanner;

public class Hanoi {

  public static int count = 0; // static variable used to count number of moves to complete puzzle

  public static void hanoi (int n, char source, char dest, char temp) {

    count++; // everytime method is called, add 1 to count

    if (n == 1) {

    }
    else {
      hanoi(n - 1, source, temp, dest);
      hanoi(n - 1, temp, dest, source);
    }
  }

  public static void main(String[] args){
    System.out.println("Please enter the number of disks or enter any letter to quit: "); // prompts user to enter number of disks

    Scanner l = new Scanner(System.in); // scanner for input
    while (l.hasNextInt()){ // until user stops entering an integer, keep running loop
      int numberOfDisks = l.nextInt();
      hanoi(numberOfDisks, 'A' , 'B' , 'C');
      System.out.println("The total number of moves for " + numberOfDisks + " disks is: " + count);
      System.out.println("Please enter the number of disks or enter any letter to quit: ");
    } // end of while loop
  } // end of main()
} // end of class Hanoi
