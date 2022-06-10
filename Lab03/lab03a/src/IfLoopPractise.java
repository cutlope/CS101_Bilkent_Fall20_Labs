
/**
 * Lab03a
 * @author Abdullah Riaz
 * @version 1/11/2020
 */ 

import java.util.Scanner;

public class IfLoopPractise {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        //Variable Declartion
        int oddValues;
        int evenValues;
        int n;      // user input
        int sum;
        int sumFormula;

        
        System.out.println("Enter an postivie integer less than or equal to 50");
        n = scan.nextInt();
        scan.close();
        sumFormula = ((n * (n+1)) / 2);

        // Variable Initializations
        sum = 0;                                        
        oddValues = 0;
        evenValues = 0;

        for ( int x = 0; x <= 50; x++ )                                 // Making it run exactly how many time user has decided 
            {   
                
                System.out.println("x = " + x);

                if ( x >= 12 &  x<= 25 ) {                              //Check if in range 12-25
                    System.out.println("Out of range 12-25");
                }
            
                if ( x % 2 == 0) {                                      //Checks for even values
                    ++evenValues;
                    
                }

                else {                                                  // If the check for even values fails, it auto assigns them as odd use else
                    ++oddValues;
                }
    
                if ( x % 5 == 0) {                                      // Checks if the value is multiple of 5
                    
                    System.out.println("Hi Five");
                }

                else if (x % 2 == 0) {                                  // Checks if the value is multiple of 2
                    
                    System.out.println("Hi Two");
                }

                else if ( x % 3 == 0 || x % 7 == 0) {                   // Checks if the value is multiple of 3 or 7
                    
                    System.out.println("Hi ThreeOrSeven");
                }
                                                                        // Lined printed If not multiple of 2,3,5,7
                else {                                                  
                    
                    System.out.println("Hi Others");
                }

                if (x>=1 && x<=n ) {                                    // sums all values from 1 to  value given by user inclusive
                    sum = x + sum;
                } 
                
                }

                if ( sumFormula == sum ) {                             // Compares sum from the loop above to mathematical formula n(n+1)/2
                    System.out.println("They are same");
                }
                else {
                    System.out.println("They are not same");
                }
                
                
                System.out.println("The number of odd values : " + oddValues);      
                System.out.println("The number of even values : " + evenValues);

            }}



    