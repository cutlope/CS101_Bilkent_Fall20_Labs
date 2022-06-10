/**
 * Lab04b
 * @author Abdullah Riaz
 * @version 22/11/2020
 */ 


public class DoubleCheck
{
    public static void main(String[] args)
    {
        // Variables

        double d;                           

        // Program Code
        d = 0.1;
        while ( d <= 1.0 )
        {
           System.out.println( d);
           d = d + 0.1;
        }
        System.out.println( d + " <- final value after loop!");
    }

    //It runs to an infinite loop in the initial code.
    //After changing to less-than instead of not-equal, it doesnt run infinitly
    //Its because doubles are approximations so they never 'not' equal or equal a value.
    // In this case it will output to ~1.09999999
    
}