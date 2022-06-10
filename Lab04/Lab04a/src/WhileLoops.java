import java.util.Scanner;

/**
 * Lab04a
 * @author Abdullah Riaz
 * @version 22/11/2020
 */ 

public class WhileLoops {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner( System.in);

        // variables
        int n;              //User Defined Variable
        int counter;        //Counts current loop iteration 
        int lineCount;      //Count if line is more than 5 or not

        // program code
        System.out.println("Enter a Postive Integer!"); 
        n = scan.nextInt();
        scan.close();

        
        System.out.println("<----------Excercise 1--------->");
        System.out.println();

        counter = 0;            
        if(n < 0) {                                                     //Checks if user has input postive value or not
            System.out.println("Error. Negative Value Detected");
        }

        else {
            while (counter < n) {
                System.out.print(counter++ + " ");
            }

        System.out.println();
        System.out.println("<----------Excercise 2--------->");
        System.out.println();

        counter = 0;
        while (counter < n) {
            System.out.print(counter++ + " ");
            if ( counter % 5 == 0 ) {                                           //checks if line has reached 5 value per line limit
                System.out.println();
            };
    };

        System.out.println();
        System.out.println("<----------Excercise 3--------->");
        System.out.println();

        counter =0;
        while (counter <= n) {                                                 //Checks if values printed has exceeded user inout value or not
            System.out.print( (n - counter)  + " ");                           
            counter++;
        }

        System.out.println();
        System.out.println("<----------Excercise 4--------->");
        System.out.println();

        counter = -n;
        while ( n >= counter) {                                 
            if(counter % 2 == 0  ) {                            //Checks if even value or not 
            System.out.print(counter + " ");
            }
            counter++;
        }

        
        System.out.println();
        System.out.println("<----------Excercise 5--------->");
        System.out.println();

        lineCount = 0;
        counter=0;

        while ( n >= counter) {
            if (lineCount < 5) {
                if( counter % 2 == 0  ) {                                       //Checks if even value or not
                System.out.print( (counter*counter) + " ");                    // Multiplies counter by itself to get square   
                lineCount++;            
                }
                counter++;
            }

                else if(lineCount >=5) {                            //checks if line has reached 5 value per line limit
                    System.out.println();
                    lineCount = 0;

        };
    }

    System.out.println();
    System.out.println("<----------Excercise 6--------->");
    System.out.println();

    lineCount = 0;
    counter=n;

    while ( counter >= 3) {
        if (lineCount < 5) {                        //checks if line has reached 5 value per line limit
            if ( (counter % 3 == 0 || counter % 4 == 0) && ( !(counter % 3 == 0 && counter % 4 == 0) ) ) {      //checks wheter the current number is divisible by 3 OR 4 and not 3 AND 4 
                System.out.print(counter + " ");
                lineCount++;
        }
            counter--;
    }

        else if(lineCount >=5) {
            System.out.println();
            lineCount = 0;
    }
}

    System.out.println();
    System.out.println("<----------Excercise 7--------->");
    System.out.println();
    counter=2;

    while (counter <= n ) {
        if ( n % counter == 0) {                            //checks if current value is divisors of user input value 'n'
            System.out.print(counter + " ");
        }
        counter++;
    }


}}}
