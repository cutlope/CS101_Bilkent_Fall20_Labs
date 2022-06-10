import java.util.Scanner;


/**
 * Lab05b 
 * @author Abdullah Riaz
 * @version 22.11.2020
*/ 

public class RowColumns
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // Constants
        final int MAX_WIDTH = 6;
        // Variables
        int row;
        int column;
        int count;
        String digits;

        
        // Program Code
        System.out.println("Enter Rows");
        row = scan.nextInt();
        System.out.println("Enter Column");
        column = scan.nextInt();


        System.out.println("Table with row & column numbers ");
        for ( int i = 1; i <= row; i++) {                               // Rows Counter
            for ( int j = 1; j <= column; j++) {                        //Column Counter

                    digits = i + "," + j;                               // getting row and column in format row,column

                    for ( int k = 0; k < MAX_WIDTH - digits.length(); k++)              //Calculating space to the left by subtracting the max possible width with row,column length
                        {
                            System.out.print(" ");                                      //Printing the space
                            
                        }

                        System.out.print(digits);
                }
                System.out.println();
        }


        System.out.println("Table with product of the row & column number");
        for (int i = 1; i <= row; i++) {                                // Rows Counter
            for (int  j = 1; j <= column; j++) {                        //Column Counter

                    digits = "";                                        //Reseting the varibale to 'empty' each loop
                    digits = digits + (i * j) ;                         

                    for ( int k = 0; k < MAX_WIDTH - digits.length(); k++)          //Calculating space to the left by subtracting the max possible width with row,column length
                        {
                            System.out.print(" ");                              //Printing the space
                            
                        }

                        System.out.print(digits);
                }
                System.out.println();
        }

        System.out.println("Table  beginning from 0 and increasing left to right, top to bottom ");
        count = 0;
        for ( int i = 1; i <= row; i++) {
            for ( int j = 1; j <= column; j++) {

                    digits = "";                                                    //Reseting the varibale to 'empty' each loop
                    

                    for ( int k = 0; k < MAX_WIDTH - digits.length(); k++)          //Calculating space to the left by subtracting the max possible width with row,column length
                        {
                            System.out.print(" ");                                  //Printing the space
                            
                        }

                        System.out.print(count);                                        //Printing the table
                        count++;
                }
                System.out.println();                                               // Moving to next row
                
        }

        System.out.println("Table with row number in the first column only ");
        count = 0;
        for ( int i = 1; i <= row; i++) {
            for ( int j = 1; j <= column; j++) {
                
                if ( j == 1) {
                    digits = i +"";                                 // Making it so it only prints the row number in first column of every row
                }

                else {
                    digits = "-";                           
                }
                

                for ( int k = 0; k < MAX_WIDTH - digits.length(); k++)          //Calculating space to the left by subtracting the max possible width with row,column length
                    {
                        System.out.print(" ");                                   //Printing the space
                        
                    }

                    System.out.print(digits);                                   //Printing the table
            }
                System.out.println();                                           // Moving to next row
                
        }




    }
}

