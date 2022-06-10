import java.util.Scanner;
/**
 * Testing Library  Class
 * @author Abdullah Riaz
 * @version 20.12.2020
*/ 
public class LibraryTest
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        Library libraryBooks  = new Library();
        String operation;
        String title;
        String author;
        
            System.out.println();
            System.out.println("Welcome to the Library");


            while (true) {

                System.out.println();
                System.out.println("Select Your Action");
                System.out.println("Show");
                System.out.println("Find");
                System.out.println("Add");
                System.out.println("Exit");
                System.out.println();


                operation = scan.next();
                    
                if ( operation.equalsIgnoreCase("Exit") ) {                //Checking if user has decided to quit or not
                    System.out.print("Thanks for Coming to Library");
                    break;
                }

                if ( operation.equalsIgnoreCase("Show") )  {            //checking if user wants to Look at catalog
                libraryBooks.toString();
                
                }

                if ( operation.equalsIgnoreCase("Add") )  {            //checking if user wants to add a book
                
                System.out.println("Enter Title");
                title = scan.next();
                System.out.println("Enter Author");
                author = scan.next();

                libraryBooks.add(title, author);
                
                }


                if ( operation.equalsIgnoreCase("Find") )  {            //checking if user wants to find book from  catalog
                    
                    title = scan.next();
                    libraryBooks.findByTitle(title);



                    
                }

        }



    }
    



}
