public class Roman {

  public static void main(String[] args) { //create main method

    int userNumber; // The number the user seclects

    System.out.println("Type a number (1-10) to be converted to Roman Numerals: "); // prompt the user to enter an integer

    userNumber = TextIO.getlnInt(); // collect and store input in userNumber

    if (userNumber < 1 || userNumber > 10) {
      System.out.println("ERROR: The number you have choosen is outside of the range 1-10.");
    } // if number is outside of range, print error message

    else // if number is inside of range, print one of the messages below
    {
      if (userNumber == 1)
        System.out.println("Your number converted is: I");

      else if (userNumber == 2)
        System.out.println("Your number converted is: II");

      else if (userNumber == 3)
        System.out.println("Your number converted is: III");

      else if (userNumber == 4)
        System.out.println("Your number converted is: IV");

      else if (userNumber == 5)
        System.out.println("Your number converted is: V");

      else if (userNumber == 6)
        System.out.println("Your number converted is: VI");

      else if (userNumber == 7)
        System.out.println("Your number converted is: VII");

      else if (userNumber == 8)
        System.out.println("Your number converted is: VIII");

      else if (userNumber == 9)
        System.out.println("Your number converted is: IX");

      else if (userNumber == 10)
        System.out.println("Your number converted is: X");
  }

System.out.println();

  } // end of main()
} // end of class Roman
