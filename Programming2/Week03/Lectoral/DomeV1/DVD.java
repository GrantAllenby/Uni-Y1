/**
 * The DVD class represents a DVD object. Information about the 
 * DVD is stored and can be retrieved.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 1.0
 */

public class DVD extends Item
{
    private String director;
    /**
     * Constructor for objects of class DVD
     */
    public DVD(String theTitle, String theDirector, int time)
    {
        super(theTitle,time); 
        director = theDirector;
    }
}
