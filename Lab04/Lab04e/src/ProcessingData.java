import java.util.Scanner;
import java.io.*;

/**
 * Lab04e
 * @author Abdullah Riaz
 * @version 22/11/2020
 */ 

public class ProcessingData {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Scanner dataInputFile = new Scanner( new File( "src/testdata.txt") );
        
        
        // Constants
        final int NUM_OF_VALUES_TO_READ = 6;  


        
        // Variables
        int numOfValues;
        int sum;
        double average;
        int value;
        int lineCount;
        int max;
        int min;
        String decision;        //used to know when to break the loop

         
        
        // Program Code
        System.out.println();
        System.out.println("<----------Excercise 1--------->");
        System.out.println();

        numOfValues = 0;
        sum=0;
        while (numOfValues < NUM_OF_VALUES_TO_READ ) {       // Limits the while loop to number decided by me. 
            System.out.println("Enter A Number");               
            sum = scan.nextInt() + sum;
            numOfValues++;
        }

        while (true) {                                       //Seperate Loop created so the entered numbers are ignored
            decision = scan.nextLine();                     //Done before Systemo.out because last loop used nextInt and does not read the newline character("Enter")
            System.out.println("Enter A Number (To finish, Enter quit)");

            if ( decision.equalsIgnoreCase("quit") ) {              //Validation for if user wants to quit entering values
                break;  
            }
        }
        
        scan.close();                                                   //Closed to avoid terminal warnings
        System.out.println("The Sum of Values is " + sum);
        System.out.println("The Value Count is "  + numOfValues);


        System.out.println();
        System.out.println("<----------Excercise 2--------->");
        System.out.println(); 

        sum = 0;
        lineCount = 0;
        max = Integer.MIN_VALUE;                //Setting to minimum value possible
        min = Integer.MAX_VALUE;                //Setting to Maximum value possible

        while( lineCount < 100  ) {
            if (dataInputFile.hasNextLine()) {                  //Reading value from file
                value = dataInputFile.nextInt();

                if (value > max) {                      // Finding Max
                    max = value;
                }
                else if (value < min) {                 // Finding Minimum
                    min = value;
                }

                sum = value + sum;                      //Calculatin Sum
                lineCount++;            
            }




        }

        average = sum/ (double) lineCount;

        System.out.println("The Sum of Values is " + sum);
        System.out.println("The Avergae of Values is "  + average);
        System.out.println("The Maximum of Values is "  + max);
        System.out.println("The Minimum of Values is "  + min);



        System.out.println();
        System.out.println("<----------Excercise 3--------->");
        System.out.println();

        sum = 0;
        lineCount = 0;
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;

        while( lineCount < 1000  ) {
            if (dataInputFile.hasNextLine()) {          //Reading value from file
                value = dataInputFile.nextInt();

                if (value > max) {                      // Finding Maximum
                    max = value;
                }
                else if (value < min) {                 // Finding Minimum
                    min = value;
                }

                sum = value + sum;                      //Calculating Sum
                lineCount++;            
            }
        }

        average = sum/ (double) lineCount;              //Calculatin Average


        System.out.println("The Sum of Values is " + sum);
        System.out.println("The Avergae of Values is "  + average);
        System.out.println("The Maximum of Values is "  + max);
        System.out.println("The Minimum of Values is "  + min);


    }
}
