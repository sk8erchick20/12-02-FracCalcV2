public class RationalNumber
{
  int numer;
  int denom;
  public RationalNumber()
  {
    numer=0;
    denom=0;
  }
  public RationalNumber(int numerator, int denominator)
  {
    numer=numerator;
    denom=denominator;
  }
  public int getDenominator()
  {
    return denom;
  }
  public int getNumerator()
  {
    return numer;
  }
  public int GreatestCommonDivisor(int first, int second)
  {
    int temp;
    while (second != 0)
    {
      temp = second;
      second = first % second;
      first = temp;
    }
    return first;
  }
  public String toString()
  {
    return (numer+"/"+denom);
  }
  public void add(RationalNumber frac)
  {
    int x=frac.getDenominator();
    int y=frac.getNumerator();
    numer=(numer*x)+(y*denom);
    denom=denom*x;
  }
  public void subtract(RationalNumber frac)
  {
    int y=frac.getNumerator();
    int x=frac.getDenominator();
    numer=(numer*x)-(y*denom);
    denom=denom*x;
  }
  public void multiply(RationalNumber frac)
  {
    int y=frac.getNumerator();
    int x=frac.getDenominator();
    denom=denom*x;
    numer=numer*y;
  }
  public void divide(RationalNumber frac)
  {
    int y=frac.getNumerator();
    int x=frac.getDenominator();
    numer=numer*x;
    denom=denom*y;
  }
}
