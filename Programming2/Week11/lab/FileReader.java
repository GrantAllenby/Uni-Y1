import java.util.*;
import java.io.*;

/**
 * Reads data from a given file.
 * 
 * @author Ian Bradley 
 * @version 1.0
 */
public class FileReader
{
    private File file;
    protected Scanner input;
    
    /**
     * Constructor creates a File object and establishes a link to the  Scanner object.
     * 
     * @param fileName  the name of the help file
     * @thows IllegalStateException when the help file does not exist.
     */
    public FileReader(String fileName) 
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

    public String readFromFile()
    {
        return input.next();
    }
    
    public boolean endOfFile()
    {
        return !input.hasNext();
    }


}

