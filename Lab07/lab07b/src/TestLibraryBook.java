
/**
 * Testing Library Book Class
 * @author Abdullah Riaz
 * @version 13.12.2020
*/ 
public class TestLibraryBook
{
    public static void main(String[] args)
    {
        //Creating objects from LibraryBook Class
        LibraryBook libraryBook1 = new LibraryBook();
        LibraryBook libraryBook2 = new LibraryBook();
        LibraryBook libraryBook3 = new LibraryBook();


        //Printing out the objects
        System.out.println(libraryBook1);
        System.out.println(libraryBook2);
        System.out.println(libraryBook3);

        //Loan Book Method
        libraryBook1.loanBook("18/12/2020");             
        System.out.println("New Due Date: " + libraryBook1.dueDate);
        

        //Print number of times loaned
        System.out.println("Times loaned: " + libraryBook1.getTimesLoaned());

        //Return the book
        libraryBook2.returnBook();

        //Check if on loan
        System.out.println("On Loan : " + libraryBook2.onLoan());




    }
    


 








}
