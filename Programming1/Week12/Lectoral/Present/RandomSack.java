import java.util.Random;
import java.util.ArrayList;
/**
 * Write a description of class RandomSack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomSack
{
    private Random randomGenerator;
    private ArrayList<Present> sack;
    private boolean loaded;
    public RandomSack() 
    {
        sack = new ArrayList<Present>();
        loaded = false;
        randomGenerator = new Random();
    }
    
     public Present removeFromSack()
    {
        if ( loaded )
        {
            if ( sack.isEmpty() )
            {
                loaded = false;
                return null;
            }
            else
            {
                int index = getIndex();
                return sack.remove(index);
            }
        }
        else
            return null;
    }
    
    public void addToSack(Present present)
    {
        
    }
    
    public void closeSack()
    {
        
    }
    
    public boolean isSackLoaded()
    {
        
    }
}
