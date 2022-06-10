import java.util.Scanner;
import java.io.*;

/**
 * Lab04g
 * @author Abdullah Riaz
 * @version 22/11/2020
 */  

public class Operations
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner readFile = new Scanner(new File("src/test1.txt"));
        
        // Constants
        
        // Variables
        int max;
        int min;
        int sum;
        double average;
        int valueCount;
        int value;
        boolean isNegativeValue;
        
        // Program Code
        sum =0;
        valueCount=0;
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        isNegativeValue = false;



        while (readFile.hasNext() && isNegativeValue != true ) {        //Checks if line is there and if it is positive
            value = readFile.nextInt();
            if(value >= 0) {
                if (value > max) {                      // Finding Max by checking if current value is bigger than maximum value at this point
                    max = value;
                }
                else if (value < min) {                 // Finding Minimum
                    min = value;
                }

                    sum = value + sum;                  //Sum Calculation
                    valueCount++;
                }

            else {
                isNegativeValue = true;             //if negative value it changes to true thus breaking the while loop
            }


            
        }
    
            
            average = sum / (double) valueCount;        //Finding Average

            System.out.println("The Sum of Values is " + sum);
            System.out.println("The Avergae of Values is "  + average);
            System.out.println("The Maximum of Values is "  + max);
            System.out.println("The Minimum of Values is "  + min);
        

    
    
}}