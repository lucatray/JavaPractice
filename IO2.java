import java.io.File;
import java.util.Scanner;

public class IO2{
    public static void main(String[] args){
      Scanner s;
      try{
       s=new Scanner(new File("IO2.java"));
       String[] lines = new String[15];
       int count = 0;
       while (s.hasNext()) {
         lines[count] = s.nextLine();
         count++;
         if (count >= lines.length)
           break;
         }
        int index = 0;
        while (index <= 15){
          System.out.println(lines[index]);
          index++;
        }

      }
      catch (Exception e) {
        System.out.println("Oops, File not found.");
      }




}

}
