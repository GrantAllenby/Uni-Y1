
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player
{    
    
    private String name;
    private  int numberTaken;
    public Player(String name){
        this.name = name;
        numberTaken = 0;
    }
    
    public boolean takeTurn(int number, Pile pile) {
    // This fetches the remove sticks method from the pile class.
    boolean success = pile.removeSticks(number);
    if (success)
    {

        numberTaken = number;
    }
    else 
    {
       numberTaken = 0;
    }
    return success;
    }

    public String getName(){
        return name;
    }
    
    public int getNumberTaken(){
        return numberTaken;
    }
}
