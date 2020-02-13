public class MyHistogram {
  public static void main(String[] args){


      int[] hist= new int[101];
      int count;
      int argsCount;
      argsCount = 0;
      count = 0;
      int num = 0;
      int n = 0;


      while (count < hist.length) {  // format used from lecture example
        hist[count] = 0;
        count++;
      }

      while (argsCount < args.length) {
        int number = Integer.valueOf(args[num]);
        if (number < 0 || number > 100) {
          System.out.println("Value not within range of 1-100");
        }
        else {
          hist[number]++;
        }
        argsCount++;
        num++;
      }




      for(n = 0;n < hist.length; n++) {
        if (hist[n] > 0)
          System.out.println("Frequency of: " + n + " is " + hist[n]);
      }

      int m = 100;

      for (m = 100; m < hist.length; m--) {
        if (hist[m] > 0) {
          System.out.println("The largest number is: " + m);
          break;
          }
        }

      int l = 0;

      for (l = 0; l < hist.length; l++) {
        if (hist[l] > 0) {
          System.out.println("The lowest number is: " + l);
          break;
          }
        }


      int mode = hist[0];
      int i;



      for (i = 1; i < hist.length; i++) {
        if (hist[i] > mode)
           mode = i;
        }
        System.out.println("The mode for the scores is:  " + mode + " freq is " + hist[mode]);


      double average;
      double total = 0;
      int counter = 0;
      int j;

      for (j = 0; j < hist.length; j++) {
        if (hist[j] != 0) {
          total = total + j;
          counter++;
        }
      }

        average = total / counter;
        System.out.println("The average is: " + average);








    }
  }
