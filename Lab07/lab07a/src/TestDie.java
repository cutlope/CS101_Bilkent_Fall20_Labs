/**
 * Test Die
*/
public class TestDie
{
    public static void main(String[] args) {
        // Variables
        Die die1;
        Die die2;


        // Program Code
        die1 = new Die();
        die2 = new Die();

        //Calling Methods
        die1.roll();
        die2.roll();
        
        System.out.println(die1.toString());
        System.out.println(die1);
        
    }
    
}

//S
//Simple Printing out "die1" gives className@MemoryLocation