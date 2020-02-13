public class Pictures {
  public static void main(String[] args) {

    int rows = Integer.valueOf(args[0]);
    int cols = Integer.valueOf(args[1]);
    int npix = Integer.valueOf(args[2]);

    char[][] frame = new char[rows][cols];
    int count;


    if (rows < 1 || cols < 1 || npix < 1){
      while (rows < 1 || cols < 1 || npix < 1) {
        System.out.println("ERROR: Values must be greater than zero. Please enter 3 new values.");
        break;
    }
  }
    count = 0;

    for (rows = 0; rows < frame.length; rows++)
      for (cols = 0; cols < frame[rows].length; cols++)
        frame[rows][cols] = ' ';

    int n = 0;

    //while (n <= npix) {

      //int location1 = randomInt(0, rows);
      //int location2 = randomInt(0, cols);

      for(n=0;n < npix; n++){
        int location1 = randomInt(0, rows - 1);
        int location2 = randomInt(0, cols - 1);

        frame[location1][location2] = '*';


      }
      for (rows = 0; rows < frame.length; rows++){
        for (cols = 0; cols < frame[rows].length; cols++){
          System.out.print(frame[rows][cols]);
        }
        System.out.println();

    }

  }


    public static int randomInt(int min, int max) { // method to generate random integer
      return (int)((Math.random()*((max - min) + 1)) + min);
    }
}
