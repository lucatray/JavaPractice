public class Size {

  public static double randomDouble() {
      return Math.random();
  }

  public static void main(String[] args) {

  int size = Integer.valueOf(args[0]);

  double totally = fill(size);
  average(totally, size);
  }

  public static double fill(int s){
    int row;
    double[] r = new double [s];
    double total = 0;
    for (row = 0; row < r.length; row++ ) {
      r[row] = randomDouble();
      total = total + r[row];
      }
      return total;
  }

  public static void average(double n, int l) {
    double average = n / l;
    System.out.println(average);
  }


}
