
/**
 * This is the basic present class.
 * 
 * @author Ian Braldey 
 * @version 1.0
 */
public class Present
{
    private Label label;
    private String contents;
    private boolean wrapped;

    /**
     * Constructor for Present
     * 
     * @param contents the content of the present
     */
    public Present( String contents )
    {
        this.contents = contents;
        wrapped = false;
    }

    /**
     * Method to wrap present
     * 
     * @param label the label on the present
     */
    public void wrapPresent(Label label)
    {
        this.label = label;
        wrapped = true;
    }

    public String readTo()
    {
        return label.getReceiver();
    }

    public String readFrom()
    {
        return label.getGiver();
    }

    /**
     * Method to read the message on the present's label
     * 
     * @return the message on the label
     */
    public String readMessage()
    {
        return label.getMessage();
    }

    public void openPresent()
    {
        wrapped = false;
    }

    public String getDescription()
    {
        if ( !wrapped )
            return contents;
        else
            return " present still wrapped";
    }

    public boolean isWrapped()
    {
        return wrapped;
    }
}
