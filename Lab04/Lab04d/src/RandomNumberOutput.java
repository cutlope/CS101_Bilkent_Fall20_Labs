import java.util.Scanner;
import java.lang.Math;
import java.io.*;

/**
 * Lab04d
 * @author Abdullah Riaz
 * @version 22/11/2020
 */ 

public class RandomNumberOutput
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner scan = new Scanner(System.in);
        PrintStream originalStdOut = System.out;
        
        // Constants
        
        // Variables
        int numOfValues;            
        String fileName;
        
        // Program Code
        System.out.println("Enter FileName");
        fileName = scan.nextLine();
        System.out.println("Enter Required Number of Values");
        numOfValues = scan.nextInt();
        scan.close();
        

        System.setOut( new PrintStream( fileName + ".txt" ) );          //Generates fill according to user filname input
        
        for(int i = 1; i <= numOfValues; i++) {                         //Keeps on adding value to fill till it reaches the amount given by user
            
            
            System.out.println((int) (10*Math.random()));;              // Math.random gives value between 0.0 to 1.0 so multiplied by 10 to get 1 s.f numbers
        }                                                               //Also use (int) to convert to integer

        System.out.close();
        System.setOut( originalStdOut);                             
        System.out.println( "File created.");


    }
    
}

