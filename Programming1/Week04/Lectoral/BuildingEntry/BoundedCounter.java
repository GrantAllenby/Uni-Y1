/**
 * A simple counter with a max occupancy.
 * 
 * This version of Counter is that amended during 
 * week 3's lectoral. 
 * 
 * It includes decrementCount() which uses selection.
 * 
 * @author Grant Allenby 
 * @version 2.1
 */
public class BoundedCounter
{
    // the counter integer.
    private int count;
    // the max allowed (not yet set)
    private int maxAllowed;

    /**
     * Constructor for objects of class Counter
     * Sets count to 0.
     */
    public BoundedCounter(int maxValue)
    {
        count = 0;
        maxAllowed = maxValue;
    }

    /**
     * Return  value of counter.
     * 
     * @return current value of count
     */
    public int getCount()
    {
        return count;
    }

    /** 
     * returns the max allowed occupancy for the counter.
     * @return maxAllowed.
     */   
    public int getMaxAllowed()
    {
        return maxAllowed;
    }

    /**
     * adds 1 to the counter if the counter has not reached max allowed.
     */
    public boolean incrementCount()
    {
        if (count < maxAllowed)
        {
            count = count + 1;
            return true;
        }       
        else
        {
            return false;
        }	
    }

    /**
     * sets the counter to 0.
     */
    public void resetCount()
    {
        count = 0 ;
    }

    /**
     * Subtract 1 from count as long at this
     * wll not cause a negative result
     *
     * Alternate version of decrementCount introduced
     * in Week 3 Slide 29     * 
     * @return whether the operation was successful
     */

    public boolean decrementCount()
    {
        if (count > 0 )
        {
            count = count - 1;
            return true;
        }       
        else
        {
            return false;
        }	
    }
}


