/**
 * A simple Java class!
*/

public class Dice
{
    // Properties
    int result;
    int die1FaceValue;
    int die2FaceValue;

    //Creating New Objects from die class
    Die die1 = new Die();
    Die die2 = new Die();

    
    
    
    // Methods
    public int roll() {

        //Variabkles
        int dice1;
        int dice2;
        int sum;

        //Program Code
        dice1 = die1.roll();        
        dice2 = die2.roll();

        die1FaceValue = dice1;                      
        die2FaceValue = dice2;


        sum = dice1 + dice2;        
        result = sum;
        
        return sum;
        
    }



    public int getDie1FaceValue() {
        return die1FaceValue;                       //Returns Die 1 face value
    }

    public int getDie2FaceValue() {
        return die2FaceValue;                   //Returns Die 2 face value
    }


     public int getDiceTotal() {
         return result;                     //Returns Dice sum
     }

     public String toString() {
        return result + " " + getDie1FaceValue() + " " + getDie2FaceValue();            //Return Class properties
    }

    
}