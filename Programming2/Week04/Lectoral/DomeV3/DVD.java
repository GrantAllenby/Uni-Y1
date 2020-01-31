/**
 * The dvd class represents a DVD object. Information about the 
 * DVD is stored and can be retrieved. 
 */
public class DVD extends Item 
{
    private String director;

    /**
     * Constructor for objects of class DVD
     */
    public DVD(String theTitle, String theDirector, int time)
    {
        super(theTitle, time);
        director = theDirector;
    }

    /**
     * Return the director for this DVD.
     */
    public String getDirector()
    {
        return director;
    }

    /**
     * 
     */
    @Override
    public String getDetails()
    {
        String details =  director + "\n ";
        details += getTitle() + " (" + getPlayingTime() + " mins)";
        details += super.getDetails();
        return details;
    }
}
