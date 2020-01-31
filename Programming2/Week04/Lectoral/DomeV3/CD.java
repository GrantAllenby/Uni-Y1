/**
 * The CD class represents a CD object. Information about the 
 * CD is stored and can be retrieved.
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
    
    /**
     * 
     */
    @Override
    public String getDetails()
    {
        String details =  artist + "\n ";
        details += "Tracks: " + numberOfTracks + "\n ";
        details +=  super.getDetails();
        return details;
    }
}
