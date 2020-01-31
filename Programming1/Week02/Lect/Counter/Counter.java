
/**
 * A Class representing a simple counter.
 * @author (Grant Lawrence Allenby) 
 * @version (v1.0 08/10/18)
 */

public class Counter
{
    private int count;
    /** initialises counter to 0 */
    public Counter()
    {
        count = 0;
    }
    
    public int getCount()
    /** returns current value of the counter 
      * @return current value of count **/
    {
        return count;
    }
    
    public void incrementCount()
    /** add one to count 
      * can also use "++" to do "+1" **/
    {
        count = count + 1;
    }
    
    public void resetCount()
    /** resets count to 0 
      * @count should be 0 **/
    {
        count = 0;
    }
}
