
public class Fraction
{
    private int numerator;
    private int denominator;
    private int mathBottom;
    private int mathTop;


    public Fraction(int num, int den)
    {
        numerator = num;
        denominator = den;
    }
    
    public int getNum()
    {
        return numerator;
    }
    
    public int getDem()
    {
       return denominator;
    }
    
    public void addFrac(Fraction tempFrac)
    {
       mathBottom = denominator * tempFrac.getDem();
       mathTop = numerator * tempFrac.getDem() + tempFrac.getNum() * denominator;
       System.out.println(mathTop + "/" + mathBottom);
    }
    
    public void subFrac(Fraction tempFrac)
    {
       mathBottom = denominator * tempFrac.getDem();
       mathTop = numerator * tempFrac.getDem() - tempFrac.getNum() * denominator;
       System.out.println(mathTop + "/" + mathBottom);
    }
    
    public void multFrac(Fraction tempFrac)
    {
        mathBottom = denominator * tempFrac.getDem();
        mathTop = numerator * tempFrac.getNum();
        System.out.println(mathTop + "/" + mathBottom);
    }
    
    
    public void divFrac(Fraction tempFrac)
    {
        mathTop = numerator * tempFrac.getDem();
        mathBottom = denominator * tempFrac.getNum();
        System.out.println(mathTop + "/" + mathBottom);
    }
}
