/**
 * LibraryBook
*/

public class LibraryBook
{
    // Properties
    String title;
    String author;
    String dueDate;
    int timesLoaned;

    // Constructors
    public LibraryBook() {
        title = "To Kill a Mockingbird";
        author = "Harper Lee";
        dueDate = "17/12/2020";
        timesLoaned = 9;
    
    }

    // Methods

    public void loanBook(String newdueDate) {

        timesLoaned = timesLoaned + 1;       //Adds 1 to number of times loaned each time method is called
        dueDate = newdueDate;                    
    }

    public void returnBook() {

        dueDate = "";                   //Resets due to bblank string
        
    }

    public int getTimesLoaned() {

        return timesLoaned;                 //Returns time it got loaned
    
    }

    public boolean onLoan() {

        if (dueDate == "") {            //Checks if date is present or not
            return true;
        }

        else {
            return false;
        }
    
    }


    public String toString() {
        return "Title: " + title + "  Author: " + author + "  Due Date: " + dueDate + "  Times Loaned: " + timesLoaned;
    }


} 