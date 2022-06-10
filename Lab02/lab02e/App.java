import java.util.Scanner;

/**
 * Lab02c 
 * @author Abdullah Riaz
 * @version 25/10/2020
 */ 
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner( System.in);

        //Variable Declaration
        int value1, value2, sum, product, difference, quotient, reminder, max, min ;

        //Variable Initialization
        System.out.println("Enter Value 1");
        value1 = scan.nextInt();
        System.out.println("Enter Value 2");
        value2 = scan.nextInt();
        scan.close();

        //Formulas
        sum = value1 + value2;
        difference = value1 - value2;
        product = value1 * value2;
        quotient = value1 / value2;
        reminder = value1 % value2;
        max =  Math.max(value1, value2);
        min = Math.min(value1, value2);


        //Output
        System.out.println("The sum is " + sum);
        System.out.println("The difference is " + difference);
        System.out.println("The product is " + product);
        System.out.println("The quotient is " + quotient);
        System.out.println("The reminder is " + reminder);
        System.out.println("The Maximum is " + max);
        System.out.println("The Minimum is " + min);

        

    }
}
