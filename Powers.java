public class Powers {
  public static void main (String[] args) {

  int b = Integer.valueOf(args[0]);

  int n = 0;

  int count = 0;

  while (0 <= n && n <= 10);

  }
}
int randomNum = randomInteger(lowBound, highBound);

if (userFeedback == "<") {
  System.out.println("Shoot, looks like I guessed too low. I'll try again!");
  int randomNum = randomInteger(guess1, highBound);
  System.out.println("Is your number: " + randomNum);
  int guess2 = randomNum;
  System.out.println("If this was your number, enter =. If the guess was too high,
  enter >. If the guess was too low, enter <.");
  userFeedback = TextIO.getWord();
}
      if (userFeedback == "<") {
      System.out.println("Shoot, looks like I guessed too low. I'll try again!");
      int randomNum = randomInteger(guess1, highBound);
      System.out.println("Is your number: " + randomNum);
      int guess2 = randomNum;
      System.out.println("If this was your number, enter =. If the guess was too high,
      enter >. If the guess was too low, enter <.");
      userFeedback = TextIO.getWord();
    }



else if (userFeedback == ">");


else
  System.out.println("I knew I'd guess it first try!");
