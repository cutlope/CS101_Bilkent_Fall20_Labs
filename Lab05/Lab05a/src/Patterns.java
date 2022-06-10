import java.util.Scanner;

/**
 * Lab05a 
 * @author Abdullah Riaz
 * @version 22.11.2020
*/ 

public class Patterns
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // Constants
        
        // Variables
        int width;
        int height;
        int thickness;          
        char repeat;
        boolean decision;


        // Program Code

        do {                                                //using do while loop so it runs atleast onces 

            System.out.println("Enter Width");              //Inputs
            width = scan.nextInt();
            System.out.println("Enter Height");
            height = scan.nextInt();
            System.out.println("Enter Thickness");
            thickness = scan.nextInt();

            if ( width > 0 && height > 0 && thickness >0 ) {                 //Positive Value Validation

                for ( int i = 1; i <= height ;i++ )                           //Columns
                    {           
                        for ( int j = 1; j<= width; j++ ) {                     //Rows
     
                            if ( i > thickness && i <= (height- thickness ) ) {        //Checking whether these are the rows with 'Space' or 'Hole' with them
                    
                                    if ( j <= thickness )                           //Checking if the row counter is in place of hole
                                    {
                                        System.out.print("*");
                                    }
                                    else if(j > (width - thickness)) {          //Checking if the row counter is in place of hole
                                        System.out.print("*");  
                                    }
    
                                    else {
                                        System.out.print(" ");                      //Placing Hole or Space
                                    }
    
                                
                            }
    
                            else {
                                System.out.print("*");                              // if not the row with hole or space, print full line with '*'
                            }
                            
                        }
                        System.out.println("");             //Move to New Line After Every Row
                    }   


                    if ( height/ thickness < thickness) {                 //Hole Exist or Not Validation
    
                        System.out.println("Oops... no hole!");
                    }
            }
    
            else {
                System.out.println("Error: all values must be positive!");
            }
            

            System.out.println("Do You Want To Repeat?");                               //Repeat Prompt 
            repeat = scan.next().charAt(0);
            if (repeat == 'y' || repeat == 'Y') {                                      //Repeat Validation 
                decision = true;
            }
            else {                                          
                decision = false;   
                System.out.println("goodbye");                                      //Exit Message 
        }

        }

        while (decision);                                   // Condition for Do WHile 

    }
    
}