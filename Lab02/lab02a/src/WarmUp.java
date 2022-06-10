import java.util.Scanner;

/**
 * Lab02a
 * @author Abdullah Riaz
 * @version 25/10/2020
 */ 


public class WarmUp
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);

        //Constant Declaration
        final String YOUR_NAME = "Abdullah";               


        //Vairable Declaration
        String yourName;
        String userName;
        int age;


        //First Exercise 
        System.out.println( "Hello  Abdullah, Welcome to Java!" );                  

        //Second Exercise 
        System.out.print( "Hello " );                                               
        System.out.print( " Abdullah " );
        System.out.println( "Welcome to Java!" );

        //Third Exercise
        System.out.println( "Hello " + YOUR_NAME + ", Welcome to Java!" );          
        
        
        //Fourth Exercise
        yourName = "Abdullah";
        System.out.println( "Hello " + yourName + ", Welcome to Java!" );          



        //Fifth Exercise        
        System.out.print("Please enter your name: ");                              
        userName = in.nextLine();
        System.out.println( "Hello " + userName + ", Welcome to Java!" );



        //Sixth Exercise 
        System.out.print("Please enter your Age: ");                                
        age = in.nextInt();
        in.nextLine();                              // So it doesnt skip the newline character and read the username properly
        System.out.print("Please enter your name: ");                              
        userName = in.nextLine();
        in.close();
        System.out.println("Hello");
        System.out.println(userName);
        System.out.println("Age:" + age);
        System.out.println("Welcome to Java!");


    }
    
}