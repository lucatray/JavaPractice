 class Zillion{

  private int[] digits;

  public Zillion(int size){

    this.digits=new int[size];

    if (digits.length==0){
      throw new IllegalArgumentException("Array must have atleast 1 value");
    }
    else{
      int length=0;
      while(length<digits.length){
        if(digits[length]>=0 && digits[length]<=9){
          length++;
        }
        else{
          throw new IllegalArgumentException("array must contain digits");
        }

      }
    }

  }

  public void increment(){
    int b=digits.length-1;
    while(b>=0 && digits[b]==9){
      digits[b]=0;
      b--;
    }
    if(b==-1){
      for(int i=0;i<digits.length;i++){
        digits[i]=0;
      }
    }
    else{
    digits[b]+=1;
    }

  }




  public String toString(){
    String s="";
    for(int i=0;i<digits.length;i++){
      s+=digits[i];
    }


    return s;

  }
}
 class Driver{

  public static void main(String[] args){

    Zillion z = new Zillion(2);
     System.out.println(z);  //  00  2 points

     z.increment();
     System.out.println(z);  //  01  2 points

     z.increment();
     System.out.println(z);  //  02  2 points

     z.increment();
     z.increment();
     z.increment();
     z.increment();
     z.increment();
     z.increment();
     z.increment();
     z.increment();

     System.out.println(z);  //  10  2 points
     z.increment();
     System.out.println(z);  //  11  2 points

     z = new Zillion(4);
     System.out.println(z);  //  0000  2 points

     for (int j = 1; j <= 999; j += 1)
     {
       z.increment();
     }
     System.out.println(z);  //  0999  2 points

     z.increment();
     System.out.println(z);  //  1000  2 points

     for (int j = 1; j <= 999; j += 1)
     {
       z.increment();
     }
     System.out.println(z);  //  1999  2 points

     z.increment();
     System.out.println(z);  //  2000  2 points

     for (int j = 1; j <= 7999; j += 1)
     {
       z.increment();
     }
     System.out.println(z);  //  9999  2 points

     z.increment();
     System.out.println(z);  //  0000  2 points

     z.increment();
     System.out.println(z);  //  0001  1 point
  }
}
