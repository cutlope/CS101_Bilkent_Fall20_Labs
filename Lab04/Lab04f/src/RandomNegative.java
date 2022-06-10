import java.util.Scanner;
import java.lang.Math;
import java.io.*;

/**
 * Lab04f
 * @author Abdullah Riaz
 * @version 22/11/2020
 */ 

public class RandomNegative {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner scan = new Scanner(System.in);
        PrintStream originalStdOut = System.out;
        
        // Constants
        
        // Variables
        int numOfValues;
        String fileName;
        int negativeLocation;           //user defined
        int negativePlace1;             //Predefined
        int negativePlace2;             //Predefined
        int negativePlace3;             //Predefined

        // Program Code

        System.out.println();
        System.out.println("<----------Excercise 1--------->");
        System.out.println();


        System.out.println("Enter FileName");
        fileName = scan.nextLine();
        System.out.println("Enter Required Number of Values");
        numOfValues = scan.nextInt();
        System.out.println("Enter Line at which -1");
        negativeLocation = scan.nextInt();
        scan.close();
    
        



        System.setOut( new PrintStream( fileName + ".txt" ) );
        for( int i = 1; i <= numOfValues; i++) {
            if (i == negativeLocation) {                                                        //checks if file line number has reached the user defined lcoation
                System.out.println(-1);                                                         // inserts negative one
            }
            else {
            System.out.println((int) (10*Math.random()));
            }

        }

        System.out.close();
        System.setOut(originalStdOut);
        System.out.println( "File created.");

        System.out.println();



        System.out.println("<----------Excercise 2--------->");
        System.out.println();
        System.out.println("Enter FileName");
        fileName = scan.nextLine();
        System.out.println("Enter Required Number of Values for file");
        numOfValues = scan.nextInt();                                           

        negativePlace1 = (int) (numOfValues *  Math.random());                  //Makes a location for negative value
        negativePlace2 = (int) (numOfValues *  Math.random());                  //Makes a location for negative value
        negativePlace3 = (int) (numOfValues *  Math.random());                  //Makes a location for negative value       

        System.setOut( new PrintStream( fileName + ".txt" ) );

        for( int i = 1; i <= numOfValues; i++) {                                                    //Prints lines till user input value

            if ( i == negativePlace1 || i == negativePlace2 || i == negativePlace3 ) {              //checks if file line number has reached the negative lcoation
                
                System.out.println((int) ( (-100) * Math.random()));

            }

            else {

                System.out.println((int) (100*Math.random()));

            }
            

        }

    }
}
    
