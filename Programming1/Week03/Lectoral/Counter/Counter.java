
/**
 * A simple counter.
 * 
 * @author (Grant Lawrence Allenby) 
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
    
    /** 
     * lowers the value of the count by 1, as well as preventing the user from reducing @counter below 0 
     */
    public void decrementCount()
    { //braces for if/else statements not needed for single statements like below, but multiple statements require braces.
        if(count > 0)
        {
        count -= 1;
        }
        else
        {
        System.out.println("Error: count is already 0");
        }
    }
}
