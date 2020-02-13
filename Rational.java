public class Rational {

// attributes
private int numerator;

private int denominator;

// constructors
  public Rational() {}

  public Rational(int numerator, int denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
}
  public void multiply() {}

  public Rational multiply(Rational r) {
    int top = r.getNumerator() * this.numerator;
    int bottom = r.getDenominator() * this.denominator;
    Rational mult = new Rational(top, bottom);
    return mult;

  }



  public double toDecimal() {
    double n = (double) numerator/ (double) denominator;
    return n;
  }

  public void reduce() {
    int top = this.numerator;
    int bottom = this.denominator;
    int divisor = 0;
    if (top < bottom)
      divisor = top;
    else
      divisor = bottom;
    while (divisor > 1){
      if (top%divisor == 0 && bottom%divisor == 0){
        top = top/divisor;
        bottom = bottom/divisor;

      }
      divisor--;
    }
    this.numerator = top;
    this.denominator = bottom;
  }

  public Rational add(Rational r) {
    int top1 = this.numerator;
    int bottom1 = this.denominator;
    int top2 = r.getNumerator();
    int bottom2 = r.getDenominator();
    int sumTop;
    if(bottom1 != bottom2){
      top1 = top1 * bottom2;
      bottom1 = bottom1 * bottom2;
      top2 = top2 * bottom1;
      bottom2 = bottom1;
      sumTop = top1 + top2;
    }
    else {
      sumTop = top1 + top2;

    }
    this.numerator = sumTop;
    this.denominator = bottom2;

    return r;
  }

  public void copy (Rational anotherRational){

  Rational rational1= new Rational();
  Rational rational2= rational1;
}
  public
  //Rational newRational= new Rational();
   //newRational.numerator=anotherRational.numerator;
  //newRational.denominator=anotherRational.denominator;

 Rational clone(){

  Rational newRational = new Rational(getNumerator(),getDenominator());

    return newRational;
}



  //this.rational=Rational;
  //this.anotherRational= Rational;

// methods
  public String toString() {
    return numerator + "/" + denominator;
}
public int getNumerator() { return numerator; }

public int getDenominator() { return denominator; }

public void setNumerator(int n) { numerator = n; }

public void setDenominator(int d) { denominator = d; }

public double getToDecimal() { return numerator/denominator; }

//public void setToDecimal(int d) { decimal = d; }



// main for testing
  public static void main(String[] args) {
    Rational r1 = new Rational(1, 2); // for the rational number ½
    Rational r2 = new Rational(3, 4); // for the rational number ¾
    Rational r3 = new Rational(); // uses the default constructor
    System.out.println(r2.toString());
    System.out.println(r1.toString());
    System.out.println(r1.toDecimal());
    Rational r4 = r1.multiply(r2);
    System.out.println(r4.toString());
    Rational r5 = new Rational(9, 27);
    r5.reduce();
    System.out.println(r5.toString());
    Rational r6 = r1.add(r2);
    System.out.println(r6.toString());
    r1.copy(r3);
    System.out.println(r3.toString());
   //r3=r2.clone();
    System.out.println(r2.clone());
  }
  }
