
public class main
{

    public static void main (String[] args){
        //FRACTION MAKER
        Fraction oneHalf = new Fraction(1,2);
        Fraction oneThird = new Fraction(1,3);
        Fraction oneFourth = new Fraction(1,4);
        
        //FRACTION TESTER
        System.out.println("Adding 1/2 and 1/3");
        oneHalf.addFrac(oneThird);
        System.out.println("Subtracting 1/4 from 1/2");
        oneHalf.subFrac(oneFourth);
        System.out.println("Multiplying 1/2 by itself");
        oneHalf.multFrac(oneHalf);
        System.out.println("Dividing 1/3 by 1/4");
        oneThird.divFrac(oneFourth);
    }
}
