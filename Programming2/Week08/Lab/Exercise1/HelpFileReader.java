
import java.util.*;
import java.io.*;

/**
 * Reads data from a given file.
 * 
 * @author Ian Bradley 
 * @version 1.0
 */
public class HelpFileReader
{
    private File file;
    private Scanner input;

    private final String EMPTY_STRING  = "";

    /**
     * Constructor creates a File object and establishes a link to the  Scanner object.
     * 
     * @param fileName  the name of the help file
     * @thows IllegalStateException when the help file does not exist.
     */
    public HelpFileReader(String fileName) 
    {
        file = new File(fileName);
        if (!file.exists()) 
        {
            throw new IllegalStateException( fileName + " does not exist exists");
        }
        makeLink();
    }

    /**
     * Links the File object and the Scanner
     */
    public void makeLink() 
    {
        try
        {           
            input = new Scanner(file);
        } 
        catch ( FileNotFoundException e )
        {
            System.err.println( "Failed to link to file");
        }
    }

    /**
     * Close the current Scanner object
     */
    public void closeLink()
    {       
        try
        {
            input.close();
        }
        catch ( NullPointerException e)
        {
            System.err.println(" Scanner not assigned");
        }
    }

    /**
     * Finds the next topic
     * 
     * @return a topic name or an empty string if no topic found
     */
    public String getTopic()
    {
        //ADD CODE
    }

    /**
     * Obtains the lines from the current position in the file
     * until it detects a topic or end topic line
     * 
     * @return the lines read
     */
    public String getHelp()
    {
        //ADD CODE
    }

    private String readFromFile()
    {
        return input.nextLine();
    }

    private String extractTopic(String line)
    {        
        //ADD CODE
    }
}

