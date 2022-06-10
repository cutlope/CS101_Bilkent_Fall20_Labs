import java.util.Scanner;
import java.nio.file.*;  

/**
 * Lab03c
 * @author Abdullah Riaz
 * @version 1/11/2020
 */ 


public class GrossSalary {
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

        //Variable Delcaration
        int age;
        String name;
        double grossSalary;
        int netSalary;
        String fileName;
        String filePath;
        String comment;             // comment on employee

        //Inputs and Validations
        
        System.out.println("Enter Name");
        name = scan.nextLine();
        System.out.println("Enter Age");
        age = scan.nextInt();
        System.out.println("Enter Salary");

        if (age < 0 ) {                                             //Age Validation
            System.out.println("Invalid Value! Try Again");
            age = scan.nextInt();
        }

        grossSalary = scan.nextDouble();                            //Salary Input
        scan.nextLine();

        if (grossSalary < 0 || grossSalary > 10000 ) {              //Salary Validation
            System.out.println("Invalid Value! Try Again");
            scan.nextLine();
        }

        System.out.println("Enter Comments");                       //Comments  Input
        comment = scan.nextLine();
        scan.close();

        //Tax Calculations for different brackets
        if (grossSalary > 5000 ) {
             netSalary = (int) (grossSalary  - (25/100 * (grossSalary - 100))) ;
        }

        else if (grossSalary < 5000 && grossSalary > 1000) {
             netSalary = (int) (grossSalary  - (15/100 * (grossSalary - 100))) ;
        }
        
        else {
             netSalary = (int) (grossSalary  - (5/100 * (grossSalary - 100))) ;
        }

        
        //Final HTML TAG Output

        System.out.println(HTML_TAG);
        System.out.println(HEAD_TAG);
        System.out.println(TITLE_TAG + name + "'s Home Page" + TITLE_CLOSINGTAG);
        System.out.println(HEAD_CLOSINGTAG);
        System.out.println(BODY_TAG);
        System.out.println(HR_TAG);

        fileName = name + ".jpg";                                       //FilePath Declaration 
        filePath =  "D:/cs101/Lab03/lab03c/src/"+ fileName ;

        if (Files.exists( Paths.get(filePath) )) {                      //Employee Image Validation
            System.out.println("<img src=" + fileName + ">");           //Checks if images exits before printing image html tag
        }


        //Output continued
        System.out.println(HEADING1_TAG + name + HEADING1_CLOSINGTAG);
        System.out.println(PARAGRAPH_TAG + "Age:" + age + PARAGRAPH_CLOSINGTAG);
        System.out.println(PARAGRAPH_TAG + netSalary + "(15% Tax Rate)" + PARAGRAPH_CLOSINGTAG);
        System.out.println(PARAGRAPH_TAG + "Comments:" + comment + PARAGRAPH_CLOSINGTAG);
        System.out.println(HR_CLOSINGTAG);
        System.out.println(BODY_CLOSINGTAG);
        System.out.println(HTML_CLOSINGTAG);

   
        

    }
}

