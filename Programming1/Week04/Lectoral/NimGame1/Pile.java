
/**
 * Pile class that tracks sticks left in the pile.
 * 
 * @author (Grant Allenby) 
 * @version (v1.0)
 */
public class Pile
{
    /** constructor that defines sticks left for input.
     * 
     */
    //integer for sticks left.
    private int sticksLeft;
    public Pile(int sticks){
        sticksLeft = sticks;
    }
    
    /** returns sticks left in pile.
     * @return sticksLeft sticks left.
     */
    public int getSticksLeft(){
        return sticksLeft;
    }
    
    public boolean removeSticks(int number){
        if ((number >0) && (number <= sticksLeft)) {
            sticksLeft = sticksLeft - number;
            return true;
        }
        return false;
    }
}
