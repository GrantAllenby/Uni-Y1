
public class DVD extends Item 
{
    private String director;

    public DVD(String theTitle, String theDirector, int time)
    {
        super(theTitle, time);
        director = theDirector;
    }

    public String getDirector()
    {
        return director;
    }

    public String getDetails()
    {
        String details =  director + " " 
            + getTitle() + "\n ";
        details = details  + "playing time : " 
        + getPlayingTime() + " mins \n";
        if(getOwn()) 
            details = details + "*" + "\n";
        else 
            details = details + "\n";    
        details = details + "    " 
        + getComment() + "\n";
        return details;
    }

}
