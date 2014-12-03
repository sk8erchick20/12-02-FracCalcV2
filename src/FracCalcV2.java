public class FracCalcV2
{
  public static void main(String[]args)
  {
    RationalNumber frac1=new RationalNumber(3,6);
    RationalNumber frac2=new RationalNumber(2,8);
    System.out.println("frac1:"+frac1.toString());
    System.out.println("frac2:"+frac2.toString());
    frac1.add(frac2);
    System.out.println("frac1+frac2="+frac1.toString());
    frac1.subtract(frac2);
    System.out.println("frac1-frac2="+frac1.toString());
    frac1.multiply(frac2);
    System.out.println("frac1*frac2="+frac1.toString());
    frac1.divide(frac2);
    System.out.println("frac1/frac2="+frac1.toString());
  }
}
