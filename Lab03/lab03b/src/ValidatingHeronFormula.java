/**
 * Lab03b
 * @author Abdullah Riaz
 * @version 1/11/2020
 */ 

import java.util.Scanner;

public class ValidatingHeronFormula {


    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner( System.in);

        //Constants
        final int FLOWERPERSQUAREMETER = 17;   // Flowers that can be planted per square meter 

        //Variables
        double  side1, side2, side3; //sides of the traingle
        double semiPerimeter;       // Semi-perimeter of the triangle
        double gardenArea;         // Heron's formula
        int numOfFlowers;         //Plants that can be planted in garden area
           
        
        //Inputs
        System.out.println("Enter Value 1");
        side1 = scan.nextDouble();
        System.out.println("Enter Value 2");
        side2 = scan.nextDouble();
        System.out.println("Enter Value 3");
        side3 = scan.nextDouble();
        scan.close();

        if((side1+side2)>side3 && (side1+side3)>side2 && (side2+side3)>side1) {         //Triangle Validation by checking if any side is smaller than sum of other two
            System.out.println("The Value do form a triangle");

            semiPerimeter = ( side1 + side2 + side3 ) / 2;                   // perimeter formula adapted to our variabls
            gardenArea= Math.sqrt( (semiPerimeter * ((semiPerimeter-side1) * (semiPerimeter-side2) * (semiPerimeter-side3))) );   //Herons Forumal adapted to our variables
            numOfFlowers = (int) gardenArea * FLOWERPERSQUAREMETER; 
    
         
            System.out.println("Maximum Numbers of Flowers that can be planted : " + numOfFlowers); }

                                                                                                //The messgae if it does not form triangle
        else {
            System.out.println("The Value are invalid. Try Again!");
        }
    }
}
