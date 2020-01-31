/**
 * The CD class represents a CD object. Information about the 
 * CD is stored and can be retrieved.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 3.0
 */
public class CD extends Item
{
    private String artist;
    private int numberOfTracks;

    /**
     * Constructor for objects of class CD
     */
    public CD(String theTitle, String theArtist, int tracks, int time)
    {
        super(theTitle, time);
        artist = theArtist;
        numberOfTracks = tracks;
    }

    /**
     * Return the artist for this CD.
     */
    public String getArtist()
    {
        return artist;
    }

    /**
     * Return the number of tracks on this CD.
     */
    public int getNumberOfTracks()
    {
        return numberOfTracks;
    }

    public String getDetails()
    {
        String details =  artist + "  " 
            + getTitle() +"\n";        
        details = details +"tracks: " 
        + numberOfTracks + " ";
        details = details +  "playing time "
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
