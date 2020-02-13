public class Picture {
  public static void main(String[] args) {

    int num1 = Integer.valueOf(args[0]);
    int num2 = Integer.valueOf(args[1]);
    int npix = Integer.valueOf(args[2]);

    int[][] frame = new int[num1][num2];
    int rows, cols;
    int count;


    if (num1 < 1 || num2 < 1 || npix < 1){
      while (num1 < 1 || num2 < 1 || npix < 1) {
        System.out.println("ERROR: Values must be greater than zero. Please enter 3 new values.");
        num1 = Integer.valueOf(args[0]);
        num2 = Integer.valueOf(args[1]);
        npix = Integer.valueOf(args[2]);
      }
    }

    count = 0;

    for (rows = 0; rows < frame.length; rows++)
      for (cols = 0; cols < frame[rows].length; cols++)
        frame[rows][cols] = ' ';
    }

    public static int randomInt(int min, int max) { // method to generate random integer
      return (int)((Math.random()*((max - min) + 1)) + min);
    }



  }
