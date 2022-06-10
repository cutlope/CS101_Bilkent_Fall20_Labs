import java.util.ArrayList;
import java.util.Scanner;
/**
 * Library Class
 * @author Abdullah Riaz
 * @version 20.12.2020
*/ 
public class Library
{

        Scanner scan = new Scanner(System.in);


        //Properties
        ArrayList<LibraryBook> LibraryBooks;
        String k;
        String operation;
        String newdueDate;


        //Constructors
        public Library() {
            LibraryBooks = new ArrayList<LibraryBook>();
        } 


        //Methods
        public boolean isEmpty() {
            if (LibraryBooks.size() == 0) {

                return true;
            }

            else  
                return false;
        }

        public String toString(){

            if ( isEmpty() == true ) {

                System.out.println("The Library is Empty");
                return "The Library is Empty";

            }

            else {
                k = "";
                for( int i = 0; i <= LibraryBooks.size() - 1; i++) {

                     k = k + "\n" + LibraryBooks.get(i); 
                   
                }
                System.out.println(k);
                return k;
                
            }
        }

        public void add( String title, String author)   {
            
            LibraryBook book = new LibraryBook(title, author, " " , 0); 
            LibraryBooks.add(book);

        }


        public boolean remove( LibraryBook book)   {
            
            if ( LibraryBooks.contains(book) ) {

                LibraryBooks.remove(book);
                return true;
            }

            else
                return false;
           
        }



        


        public void findByTitle(String title)   {
            
            for( int i = 0; i <= LibraryBooks.size() -1 ; i++) {

                if (title.equalsIgnoreCase(LibraryBooks.get(i).title )) {

                    System.out.println(LibraryBooks.get(i).toString());

                    while (true) {

                        System.out.println();
                        System.out.println("Select Your Action");
                        System.out.println("Loan");
                        System.out.println("Return");
                        System.out.println("Remove");
                        System.out.println("Exit");
                        System.out.println();

                        operation = scan.next();


                        if ( operation.equalsIgnoreCase("Exit") ) {                //Checking if user has decided to quit or not
                            System.out.print("Thanks for Your Intrest In This Book");
                            break;
                        }


                        if ( operation.equalsIgnoreCase("Loan") ) {           

                            System.out.println("Enter New Due Date");
                            newdueDate = scan.next();
                            LibraryBooks.get(i).loanBook(newdueDate);
                            
                        }


                        if ( operation.equalsIgnoreCase("Return") ) {           

                            LibraryBooks.get(i).returnBook();
                            System.out.println("Book has been returned");
                            
                        }

                        
                        if ( operation.equalsIgnoreCase("Remove") ) {           

                            LibraryBooks.remove(i);
                            System.out.println("Book has been removed");
                            
                        }




                    }


                }

                else  
                    System.out.println("The book Could Not Be Found \n");
                    
                

            }




        }





    }
    
    




