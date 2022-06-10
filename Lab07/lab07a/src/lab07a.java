/**
 * Program Description 
 * @author Abdullah Riaz
 * @version 12.12.2020
*/ 
public class lab07a
{
    public static void main(String[] args)
    {
        //Constants
        final int max = 6;

        
        // Variables
        int die1;
        int die2;
        int sum;
        int rollCount;
        
        // Program Code
        sum = 0;                    //Inintializing Value of Sum
        rollCount = 0;
        while ( sum!= 12 ) {

            sum = 0;                //Reseting the value of sum in each loop
            die1 = (int) (Math.random() * max) + 1;              //Adding 1 so maximum range is 6 for die
            die2 = (int) (Math.random() * max) + 1;
            sum = die1 + die2;

            rollCount = rollCount + 1 ;


        }
        
        System.out.println("It took " + rollCount + " tries to get 2 sixes");

    
        
    }
    
}