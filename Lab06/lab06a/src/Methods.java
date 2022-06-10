import java.util.Scanner;

/**
 * lab06a 
 * @author Abdullah Riaz
 * @version 28.11.2020
*/ 

public class Methods
{

/**
 * Takes a value and raises it to the power given by the user
 * @param value to be raised to the power
 * @param power the value is raised to
 * @return value raised to power
 */

public static double  power( double value, int power )
    {
        int counter;
        double result;
        counter = 0;                
        result = 1;                                     // Anything power 0 is 1 so it starts from 1

    while (  counter < power ) {                     //used to raise the value to how many times the user wants
            result = result * value;                
            counter++;
    }
    return result;

}

/**
 * Find the factorial of a number
 * @param value for which the factorial is found
 * @return the factorial of the value
 */


public static int factorial( int value)
    {

        int factorial;
        factorial = 1;                              //factorial of 0 is 1

    for ( int i = value; i > 0; i--  ) {

            factorial = factorial * i;
        
    }

    return factorial;
}


/**
 * Reverses a string
 * @param s string to be reversed
 * @return reversed string
 */
public static String reverse(String s)
{
    String reversedString;
    reversedString = "";   
    for(int i = (s.length() - 1) ; i >=0; i--) {               //-1 as charAt() and by extension java element index starts from 0
        
        reversedString = reversedString + s.charAt(i);
   }

   return reversedString;




}

/**
 * Binary to Decimal Converter
 * @param base2 Takes base2 to convert to decimal 
 * @return a decimal value
 */
public static int toDecimal( String base2)
{
    int decimal;
    decimal = 0;
    int stringLength;
    stringLength = base2.length() - 1 ;                              //Using -1 since  .length method starts from 1
   for( int i = stringLength; i >=0; i--  ) {
       if (base2.charAt(i) == '1') {
            decimal = decimal + (int) power(2, stringLength - i );            
       }
   }

   return decimal;
}

/**
 * Decimal to binary using division method
 * @param decimal value to converted to base 2
 * @return base 2 form of the base10 input
 */

public static String toBinary( int decimal)         
{
    String binary;
    binary = "";

  while ( decimal != 0) {
      int reminder = decimal % 2;
      binary = reminder + binary;           // Reminder is added before since we are getting the binary digits in reverse order
      decimal = decimal / 2 ;                 
  }

   return binary;
}


/**
//  * Calculating sinx using previous terms
//  * @param i an example input parameter
//  * @param s another example input
//  * @return some useful result
//  */

// public static String sinx( int x)         
// {
//     double firstTaylor;
//     int n ;
//     double secondTaylor;
//     double sumTaylor;
//     n= 1;
//     firstTaylor = x;
//     secondTaylor = (power(-1, 3) * power(x, 2* 3 + 1) ) / (factorial(2*3 + 1));
//     sumTaylor = firstTaylor + secondTaylor;
    
//     while (n < 11 ) {


//         sumTaylor = sumTaylor +  (secondTaylor + ( power(x, n+2) / factorial(n+2) 
        
//         n++;
//     }

//     return taylorTerm;
    
// }



    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // Constants
        final String DIVIDER = "--------------------------------------------------------------";
        final String SMALL_DIVIDER = "----------------------";

        // Variables
        int sum;
        String binary1;
        String binary2;
        String orignalText;
        String currentWord;
        String reversedLine;
        String currentWordReversed;
        char currentCharacter;
        int x;
        double taylorTerm;
        double sumOfTaylorTerm;
        double taylorNumerator1;
        double taylorDenominator;
        double taylorNumerator2;



        //Program Code
        System.out.println();
        System.out.println("<----------Excercise 1--------->");
        System.out.println();

        System.out.println();
        System.out.printf("%-10s%10s%15s%25s \n", "n" , "n^2", "n^3", "n^4" );              //String formating 
        System.out.println(DIVIDER);

        for (int n = -1; n <=10; n++) {                     //  from -1 to 10 inclusive

            System.out.printf("%-10d %10.0f %15.0f %25.0f \n", n , power(n, 2), power(n, 3), power(n, 4) );          // string formating the results
            System.out.println(DIVIDER);

        }

        System.out.println();
        System.out.println("<----------Excercise 2--------->");
        System.out.println();

        System.out.printf("%-10s%10s \n", "n" , "n-factorial");              //String formating 
        System.out.println(SMALL_DIVIDER);

        for (int n = 1; n <=15; n++) {                     //  from -1 to 10 inclusive

            System.out.printf("%-10d%-10d \n", n , factorial(n) );          // string formating the results
            System.out.println(SMALL_DIVIDER);

        }


        System.out.println();
        System.out.println("<----------Excercise 3--------->");
        System.out.println();

        

        System.out.print("Enter Binary String #1: ");
        binary1 = scan.nextLine();
        System.out.print("Enter Binary String #2: ");
        binary2 = scan.nextLine();

        sum = toDecimal(binary1) + toDecimal(binary2); 
                                 // Adds the decimals togather
        System.out.println( sum );
        System.out.println( toBinary(sum) );                                      //converts decimal to binary and prints

        System.out.println();
        System.out.println("<----------Excercise 4--------->");
        System.out.println();

        System.out.print("Enter Some Text: ");
        orignalText = scan.nextLine();
        reversedLine = "";
        currentWord="";
        for ( int i = 0; i <= orignalText.length() - 1; i++) {
            currentCharacter = orignalText.charAt(i);
            if( currentCharacter != ' ') {
                currentWord = currentWord + currentCharacter;
            }
            else {
                currentWordReversed = reverse(currentWord);
                reversedLine = reversedLine + currentWordReversed + " ";
                currentWord = "";
            }

            if ( i == orignalText.length() - 1) {
                currentWordReversed = reverse(currentWord);
                reversedLine = reversedLine + currentWordReversed;
                currentWord = "";
            }
        }
        


        System.out.print("The Reversed Text is : " + reversedLine);
        

        System.out.println();
        System.out.println("<----------Excercise 5-------->");
        System.out.println();

        System.out.print("Enter Value of x : ");                //Taking user input
        x = scan.nextInt();

        


        System.out.printf("%-15s %-15s %-15s %-20s %-20s %-40s \n", "n", "(-1)^n" , " x^(2n+1)", "(2n+1)!", "Term" , "Sum of Terms So Far"  );              //String formating 
        System.out.print(SMALL_DIVIDER);
        System.out.print(SMALL_DIVIDER);
        System.out.println(DIVIDER);

        sumOfTaylorTerm = 0;                                // initializing the variable
  

        for (int n = 0 ; n <= 10; n++) {                     //  from 0 to 10 inclusive

            taylorNumerator1 = power(-1, n);
            taylorNumerator2 = power( x, (2*n+1) );
            taylorDenominator = factorial( ((2*n) + 1) ) ; 

            taylorTerm = (taylorNumerator1 * taylorNumerator2 ) / taylorDenominator   ;    //Taylor Term
                  
            sumOfTaylorTerm = sumOfTaylorTerm + taylorTerm;                                              //Sum of Taylor Term

            System.out.printf("%-15d %-15.0f %-15.0f %-20.0f %-20.12f %-25.12f \n", n , taylorNumerator1 , taylorNumerator2, taylorDenominator, taylorTerm, sumOfTaylorTerm );          // string formating the results
            System.out.print(SMALL_DIVIDER);
            System.out.print(SMALL_DIVIDER);
            System.out.println(DIVIDER);
           

        }

        System.out.println("The difference is: " + (Math.sin(x) - sumOfTaylorTerm ))  ;

        // System.out.println();
        // System.out.println("<----------Excercise 6-------->");
        // System.out.println();
        
        // System.out.print("Enter Value of x : ");                //Taking user input
        // x = scan.nextInt();

        // System.out.println("The Value of the sinx method is: " + sinx(x));
        // System.out.println("The Diference from math.sinx is : " + ( Math.sin(x) - sinx(x)   ));
        

    
    }
}




