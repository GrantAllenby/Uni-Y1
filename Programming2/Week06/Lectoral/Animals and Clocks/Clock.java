
/**
 * Write a description of class Clock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clock implements Talkative
{
    private boolean even = true;   
    public void talk()
    {
        if ( even)
        {
            System.out.println("tic");
            even = false;
        }
        else
        {
            System.out.println("toc");
            even = true;
        }
    }
}
