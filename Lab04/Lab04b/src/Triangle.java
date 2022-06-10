import java.util.Scanner;

/**
 * Lab04b
 * @author Abdullah Riaz
 * @version 22/11/2020
 */ 

public class Triangle
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // Constants
        
        // Variables
        char ch;            // User Input Character 
        int width;          

        
        // Program Code
        System.out.println("Enter A Character");                            //Asking user for character and width size
        ch = scan.next().charAt(0);
        System.out.println("Enter Width");
        width = scan.nextInt();


        System.out.println("<----------Excercise 1--------->");
        System.out.println();
        for(int i = 1; i <= width; ++i) {                                   //Controls which row 
            for(int j = 1 ; j <=i; ++j) {                                   //Controls number of characters in row
                System.out.print(ch);
            }
            System.out.println();
        }
        
        System.out.println("<----------Excercise 2--------->");
        System.out.println();
        System.out.println("Enter A Character");                             //Asking user for character and width size
        ch = scan.next().charAt(0); 
        System.out.println("Enter Width");
        width = scan.nextInt();

        for(int i = width; i >= 0; --i) {                                   //Controls which row but goes in descending order
            for(int j = 1 ; j <=i; ++j) {                                   //Controls number of characters in row
                System.out.print(ch);
            }
            System.out.println();
        }





    }
    
}