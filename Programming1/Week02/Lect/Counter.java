
/**
 * A simple counter.
 * 
 * @author (your name) 
 * @version 1.0
 */
public class Counter
{
    private int count;
    
    /**
     * Constructor for objects of class Counter
     */
    public Counter()
    {
        count = 0;
    }
    
    /**
     * Return  the value of the counter.
     *
     * @return current value of count
     */
    public int getCount()
    {
	     return count ;
    }
    
    /**
     * Add one to count
     */
    public void incrementCount()
    {
        count = count + 1;
    }
    
    /**
     * Reset count to 0
     */    
    public void reset()
    {
        count = 0;
    }
    
    

    
    
    


   
}
