import java.util.Scanner;

/**
 * Lab02d 
 * @author Abdullah Riaz
 * @version 25/10/2020
 */ 

public class MaxFlowers {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner( System.in);

        //Constants
        final int FLOWERPERSQUAREMETER = 17;   // Flowers that can be planted per square meter 

        //Variables
        double  side1, side2, side3;  //sides of the traingle
        double semiPerimeter;      // Semi-perimeter of the triangle
        double gardenArea;    // Heron's formula
        int numOfFlowers;       //Plants that can be planted in garden area
           
        
        //Input
        System.out.println("Enter Value 1");
        side1 = scan.nextDouble();
        System.out.println("Enter Value 2");
        side2 = scan.nextDouble();
        System.out.println("Enter Value 3");
        side3 = scan.nextDouble();
        scan.close();

        
        //Intialization of Forumulas
        semiPerimeter = ( side1 + side2 + side3 ) / 2;     //  Semi Perimeter Formula adapted to our variables 
        gardenArea= Math.sqrt( (semiPerimeter * ((semiPerimeter-side1) * (semiPerimeter-side2) * (semiPerimeter-side3))) );     // Herron Formula addapted to our variables
        numOfFlowers = (int) gardenArea * FLOWERPERSQUAREMETER; 
    
         
        System.out.println("Maximum Numbers of Flowers that can be planted : " + numOfFlowers); }


        
    }

       


