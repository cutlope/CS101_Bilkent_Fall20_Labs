import java.util.Scanner;

/**
 * Abdullah Riaz
 * @author Lab05c
 * @version 27.11.2020
*/ 
public class SimpleCalculator
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // Constants
        final String LINES = "------------------";                           //Constants since desing remains same                   
        final String OPERATION_TYPES  = " +,-,*,/ value";
        final String CLEAR = "Clear";
        final String QUIT = "Quit";
        final String SELECT = "Select:  ";


        // Variables
        double result;
        String operation;
        double valueEntered;

        
        // Program Code
        System.out.println("Welcome to \"SimpleCalc\"...");
        System.out.println();
        result = 0;

        while (true)  {

            System.out.println(LINES);
            System.out.println("[ " + result + " ]");
            System.out.println(LINES);
            System.out.println(OPERATION_TYPES);
            System.out.println(CLEAR);
            System.out.println(QUIT);
            System.out.println(LINES);
            System.out.print(SELECT);

            operation = scan.next();                            //Geting user input for operation to be done in calculator

            
            if ( operation.equalsIgnoreCase("q") ) {                                            //Checking if user has decided to quit or not
                System.out.print("Thanks for using \"SimpleCalc\", goodbye.");
                break;
            }

            if ( operation.equalsIgnoreCase("clear") || operation.equalsIgnoreCase("c") )  {            //checking if user wants to 'clear' the calculator
                result = 0;
                
            }
            else {

            valueEntered = scan.nextDouble();                                                  //Getting the value input from user+
            
            if ( operation.equals("-") ) {                                              //Subtraction Operation
                result = result - valueEntered;
            }
            
            else if ( operation.equals("/") ) {                                         // Division Operation                             
                result = result / valueEntered;
            }

            else if ( operation.equals("*") ) {                                 //Multiplication Operation
                result = result * valueEntered;

            }

            else if (  operation.equals("+") ) {                                //Addition Operation
                result = result + valueEntered;
            }

        }
        
     }
        
        
    }
}