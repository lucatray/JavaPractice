public class WindChill {
  public static void main(String[] args) {

    double tempF = Double.valueOf(args[0]);

    double windSpeed = Double.valueOf(args[1]);

    double windChill = (0.6215 * tempF) - (35.75 * (Math.pow(windSpeed, 0.16))) + (0.4275 * tempF * (Math.pow(windSpeed, 0.16))) + 35.74;

    System.out.println("The windchill, based on your information, is: " + windChill);
  }
}
