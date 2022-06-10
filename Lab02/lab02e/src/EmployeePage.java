import java.util.Scanner;

/**
 * Lab02e
 * @author Abdullah Riaz
 * @version 25/10/2020
 */ 


public class EmployeePage {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner( System.in);

        //Constant Declaration
        final String HTML_TAG = "<html>";
        final String HTML_CLOSINGTAG = "</html>";
        final String HEAD_TAG = "<head>";
        final String HEAD_CLOSINGTAG = "</head>";
        final String BODY_TAG = "<body>";
        final String BODY_CLOSINGTAG = "</body>";
        final String HR_TAG = "<hr>";
        final String HR_CLOSINGTAG = "</hr>";
        final String PARAGRAPH_TAG = "<p>";
        final String PARAGRAPH_CLOSINGTAG = "</p>";
        final String HEADING1_TAG = "<h1>";
        final String HEADING1_CLOSINGTAG = "</h1>";
        final String TITLE_TAG = "<title>";
        final String TITLE_CLOSINGTAG = "</title>";


        
        //Variable Declaration
        int age;
        String name;
        double salary;
        String comment;

        //Inputs and Validations
        
        System.out.println("Enter Name");
        name = scan.nextLine();
        System.out.println("Enter Age");
        age = scan.nextInt();
        System.out.println("Enter Salary");
        salary = scan.nextDouble();
        System.out.println("Enter Comments");                       //Comments  Input
        comment = scan.nextLine();
        scan.close();
        
        //Output
        System.out.println(HTML_TAG);
        System.out.println(HEAD_TAG);
        System.out.println(TITLE_TAG + name + "'s Home Page" + TITLE_CLOSINGTAG);
        System.out.println(HEAD_CLOSINGTAG);
        System.out.println(BODY_TAG);
        System.out.println(HR_TAG);
        System.out.println(HEADING1_TAG + name + HEADING1_CLOSINGTAG);
        System.out.println(PARAGRAPH_TAG + "Age:" + age + PARAGRAPH_CLOSINGTAG);
        System.out.println(PARAGRAPH_TAG + "Salary: " + salary + PARAGRAPH_CLOSINGTAG);
        System.out.println(PARAGRAPH_TAG + "Comments:" + comment + PARAGRAPH_CLOSINGTAG);
        System.out.println(HR_CLOSINGTAG);
        System.out.println(BODY_CLOSINGTAG);
        System.out.println(HTML_CLOSINGTAG);

   
        

    }
}

