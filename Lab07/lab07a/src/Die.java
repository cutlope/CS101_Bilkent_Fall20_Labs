/**
 * Dices
*/


public class Die
{
    // Properties
    int currentFaceValue;

    // Constructors
    
    // Methods
    public int roll() {

        //Variables
        final int max = 6;
        int dieValue;

        dieValue = (int) (Math.random() * max) + 1;

        currentFaceValue = dieValue;

        return dieValue;
    }


    public int getFaceValue() {
        return currentFaceValue;                        //Returns Curent face value of dice
    }

    public String toString() {
        return currentFaceValue + " ";                  //Return Class properties
 
    }


    
    
}