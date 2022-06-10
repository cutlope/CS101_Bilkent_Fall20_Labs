/**
 * DiceGame
*/


public class DiceGame
{
    // Properties
    Dice dice = new Dice();

    
    // Methods
    public int play()
    {

        //Variables
        int sum;
        int rollCount;

        //Initializing Variables
        rollCount = 0;
        sum = 0;

        while ( sum!= 12 ) {

            sum = 0;                //Reseting the value of sum in each loop
            sum = dice.roll();

            rollCount = rollCount + 1 ;         //Incrementing our count in each loop

        }

        return rollCount;

    }
    

}