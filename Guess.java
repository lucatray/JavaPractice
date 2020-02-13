public class Guess {
  public static void main(String[] args) {

    System.out.println();
    System.out.println("Welcome to the guessing game, where I can guess any number you choose.\nAll you have to do is think of a number, and set an upper and lower bound.");
    System.out.println();
    System.out.println("After we start, if you would like to exit the game at any point, just enter 'q'.");
    System.out.println();
    System.out.println("You also should know that your lower bound must be less than your upper bound.");
    System.out.println("If the rules make sense, enter: yes");
    String makeSense = TextIO.getWord();

    while (!makeSense.equals("yes")) { // this loop makes sure the user understands the rules of the game
      System.out.println();
      System.out.println("The reason you must set an upper and lower bound is because I need to have\nsome parameters to start with. Otherwise this could take all day!");
      System.out.println("If this makes sense now, enter: yes");
      makeSense = TextIO.getWord();
    }
    System.out.println();
    System.out.println("Awesome! Lets begin.");
    System.out.println();
    System.out.println("Pick a number, any number. Keep that number in your head. "); // prompt the user to pick a number
    System.out.println();
    System.out.println("Now that you have selected a number, what is the highest your number could be: "); // prompt user to enter upper bound
    int highBound = TextIO.getlnInt();
    System.out.println(); // print empty line for formatting
    System.out.println("Lastly, what is the lowest your number could be: "); //prompt user to enter lower bound
    int lowBound = TextIO.getlnInt();

    if (lowBound >= highBound) { // low bound must be less than upper bound, so user input must meet conditions before continuing
      System.out.println();
      System.out.println("ERROR: Your low bound cannot be greater than your high bound. Please enter new\nbounds.");
      System.out.println();
      System.out.println("What's the highest your number may be: ");
      highBound = TextIO.getlnInt();
      System.out.println();
      System.out.println("What's the lowest your number may be: ");
      lowBound = TextIO.getlnInt();

      while (lowBound >= highBound) { // until user enters valid bounds, run while loop
        System.out.println();
        System.out.println("ERROR: Your low bound cannot be greater than your high bound. Please enter new\nbounds.");
        System.out.println();
        System.out.println("What's the highest your number may be: ");
        highBound = TextIO.getlnInt();
        System.out.println();
        System.out.println("What's the lowest your number may be: ");
        lowBound = TextIO.getlnInt();
      }

    }


    System.out.println("Great! Now it's time to start guessing...."); // inform user game is about to begin
    System.out.println();
    System.out.println();
    System.out.println();

    String  userFeedback = ""; // declare vairable userFeedback

    int guessCount = 1; // count starts at one because the first guess is made before loop starts
                  // So by the time the first iteration is complete, two guesses have already been made

    int guess = randomInt(lowBound, highBound);
    System.out.println("Based on this information, my guess is: " + guess); // first guess of integer
    System.out.println();

    while (!userFeedback.equals("=")) { // if the user doesn't enter an equals sign, while loop will continue
      System.out.println();
      System.out.println("If this was your number, enter: =. If my guess was too high, enter: >.\nIf the guess was too low, enter: <. If you would like to quit, enter: q.");
      System.out.println();
      userFeedback = TextIO.getWord(); // user enters one of the three symbols listed above

        if (userFeedback.equals("<")) { // if user enters <, guess was too low and guesses again with guess as lower bound
          System.out.println("Shoot, looks like I was too low. Let me try again.");
          lowBound = guess;
          int guess2 = randomInt(lowBound + 1, highBound);
          System.out.println();
          System.out.println("Im going to guess your number is: " + guess2);
          guess = guess2;
          }


        else if (userFeedback.equals(">")){ // if user enters >, guess was too high
          System.out.println("Shoot, looks like I was too high. Let me try again.");
          highBound = guess;
          int guess2 = randomInt(lowBound, highBound - 1);
          System.out.println();
          System.out.println("Im going to guess your number is: " + guess2);
          guess = guess2;
        }

        else if (!userFeedback.equals("<") && !userFeedback.equals(">") && !userFeedback.equals("=") && !userFeedback.equals("q")) {// if user enters any input besides these 4, error message occurs
          System.out.println();
          System.out.println("ERROR: You must enter one of the keys listed above.");
        }
        else if (userFeedback.equals("q")) { // if user enters 'q', program terminates
          System.out.println();
          System.out.println("Sorry to see you go!");
          return;
        }
        else { // if userFeedback is none of condtions above, program guessed the user's number
          System.out.println();
          System.out.println("I knew I'd get it right!");
          System.out.println("And it only required " + guessCount + " guesses!");
          System.out.println();
        }
        guessCount++; // every time loop iterates, 1 is added to guessCount
    }

    System.out.println("Thanks for playing!");  // thank you message

  }
  public static int randomInt(int min, int max) { // method to generate random integer
      return (int)((Math.random()*((max - min) + 1)) + min);

}
}
