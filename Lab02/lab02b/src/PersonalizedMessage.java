import java.util.Scanner;

/**
 * Lab02b
 * @author Abdullah Riaz
 * @version 25/10/2020
 */ 

 
public class PersonalizedMessage {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);


        //Vairable Declartion
        String yourName;
        int age;
        
        System.out.print("Please enter your name: ");
        yourName = in.nextLine();
        System.out.print("Please enter your Age: ");
        age = in.nextInt();
        in.close();

        
        System.out.println("Hello");
        System.out.println(yourName);
        System.out.println("Age:" + age);
        System.out.println("Welcome to Java!");

    }
}


