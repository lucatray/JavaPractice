import java.util.Scanner;

public class IO{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int count=0;
    int n;
    String[] words= new String[4];
    System.out.println("Please enter 4 strings. (^d to stop)");
    while(s.hasNext()) {
      words[count]=s.nextLine();
      count++;
      if(count>3)
        break;
      else if (words[count - 1].equals("stop")) {
        words[count-1] = null;
        break;
      }
      System.out.println("Please enter 4 strings. (^d to stop)");
    }
    System.out.println();

    int index = 0;
    System.out.println("Your words are: ");
    while (index < 4){
      System.out.println(words[index]);
      index++;
    }

  }
}
