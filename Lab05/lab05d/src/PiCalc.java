import java.util.Scanner;


/**
 * Abdullah Riaz
 * @author Lab05d
 * @version 27.11.2020
*/ 

public class PiCalc

{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // Constants
        
        // Variables
        int n;          // number of terms
        double pi;
        double accuracy;
        int term;       //pi formula term
        
        // Program Code
        System.out.println("using the Java constant, Math.PI");
        System.out.println(Math.PI);                                    //Printing Built in Pi Value


        System.out.println("Using the formula ");
        System.out.println("Enter Number of Terms ");
        n = scan.nextInt();

        pi = 0.0;
        for (  int i = 0; i < n; i++) {                         
            pi = pi + 4 * ( (Math.pow( (-1) , i )) / (2*i + 1)) ;           // Factoring 4 outside the formula so pi approximation goes 4*(1 - 1/3 + 1/5 - 1/7)
        }
        System.out.println(pi);                                             //Printing Pi


        System.out.println("Using the formula ");
        System.out.println("Enter accuracy required ");
        accuracy = scan.nextDouble();                                       //Getting user input for accuracy
       

        pi = 0.0;                                                           //Resetting Pi Value for third part of exercise
        term = 0;                                                           //Initializing value of term

        do {
            pi = pi + 4 * ( (Math.pow( (-1) , term )) / (2*term + 1)) ;             //Using Pi Approximation Formula
            System.out.println(pi);
            term++;
        }
        while ( ( Math.abs( (pi- Math.PI) )  ) > accuracy ) ;

        

     


    }
    
}