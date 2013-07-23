package incrementdecrementoperator;

/**
 *
 * @author  Karan Sharma
 * @time     Jul 19, 2013 8:23:09 AM 
 */
public class IncrementDecrementOperator {

    public static void main(String[] args)
    {
        int a = 0;
        int  b;
        
        b = a-- + a + --a;
        System.out.println("B : " + b);
        System.out.println("A : " + a);
        
    }

}
