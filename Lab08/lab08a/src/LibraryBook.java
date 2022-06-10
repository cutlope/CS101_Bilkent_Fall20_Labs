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
    public LibraryBook(String theTitle, String theAuthor, String theDueDate, int theTimeLoaned) {

        title = theTitle;
        author = theAuthor;
        dueDate = theDueDate;
        timesLoaned = theTimeLoaned;
    
    }


    LibraryBook(LibraryBook x) {                        //Copy Constructor

        this.title = x.title;
        this.author = x.author;
        this.dueDate = x.dueDate;
        this.timesLoaned = x.timesLoaned;

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



    // Lab08 Method

    public boolean equals(LibraryBook x) {

        if ( (x.title == this.title) && (x.author == this.author) ) {

            return true;

        }

        else return false;
        

    }


    public boolean hasSameTitle(LibraryBook x) {

        if (x.title == this.title) {

            return true;

        }

        else 
            return false;
            

    } 


    public boolean hasSameAuthor(LibraryBook x) {

        if (x.author == this.author) {

            return true;

        }

        else 
            return false;
            

    } 




} 
