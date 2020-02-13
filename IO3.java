import java.io.File;
import java.util.Scanner;

public class IO3{
    public static void main(String[] args){
      Scanner s;
      Scanner r;


      try{

       r = new Scanner(System.in);

       String fileName = "";
       System.out.println("Please enter the name of your file: ");
       if (r.hasNext())
        fileName = r.nextLine();
      s=new Scanner(new File(fileName));

       String[] lines = new String[15];
       int count = 0;
       while (count < lines.length){
         lines[count] = s.nextLine();
         count++;
       }

       System.out.println("Enter the number of the line to be printed: ");
       while (r.hasNextInt()) {
         int i = r.nextInt();
         if (i >= 0 && i <= 15){
           System.out.print("\nLine" + i + ": ");
           System.out.println(lines[i]);
         }

         }

        }


      catch (Exception e) {
        System.out.println("Oops, File not found.");
      }




}

}
