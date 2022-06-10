
/**
 * Testing Library Book Class
 * @author Abdullah Riaz
 * @version 13.12.2020
*/ 
public class TestLibraryBook
{
    public static void main(String[] args)
    {
        //Variables
        LibraryBook x,y;


        //Creating objects from LibraryBook Class
        LibraryBook libraryBook1 = new LibraryBook("To Kill a Mockingbird", "Harper Lee" , "17/12/2020", 9  );
        LibraryBook libraryBook2 = new LibraryBook("To Kill a Mockingbird Part 2", "Harper Lee" , "20/12/2020", 5  );
        LibraryBook libraryBook3 = new LibraryBook("To Kill a Mockingbird", "Harper Lee" , "17/12/2020", 9  );




        
        System.out.println("Comparing Two references to a single object");
        x = libraryBook1;
        y = libraryBook1;
        System.out.println("Using '=='  : " + (x == y) );                    //Comparing Two references to a single object
        System.out.println("Using '.equals'  : " + (x.equals(y)));


        
        System.out.println("Comparing Two references to two individual objects with different properties");
        x = libraryBook1;
        y = libraryBook2;
        System.out.println("Using '=='  : " + (x == y) );            //Comparing Two references to two individual objects with different properties
        System.out.println("Using '.equals'  : " + (x.equals(y)));

       
        System.out.println("Comparing Two references to two individual objects with identical relevant properties");
        x = libraryBook1;
        y = libraryBook3;
        System.out.println("Using '=='  : " + (x == y) );           //Comparing Two references to two individual objects with identical relevant properties
        System.out.println("Using '.equals'  : " + (x.equals(y)));



        //For Part A, Memory Location is different for different objects even with same properties



        //For Part B, Our new equal method compares specific properties



        LibraryBook libraryBookCopy = new LibraryBook(libraryBook2);
        System.out.println(libraryBookCopy);






    }
    



}
