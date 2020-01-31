import java.io.*;

/**
 * Demonstration of PrintWriter.
 * 
 * @author Ian Bradley 
 * @version 1.0
 */
public class WriteData
{
    private File file;
    private PrintWriter output;

    /**
     * Constructor for objects of class WriteData
     */
    public WriteData(String fileName)
    {
        file = new File(fileName);
        if (file.exists()) 
        {
            throw new IllegalStateException( fileName + " already exists");
        }
    }  

    public void makeLink() throws FileNotFoundException
    {
        output = new PrintWriter(file);
    }

    public void writeToFile()
    {
        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones ");
        output.println(85);
    }

    public void closeLink()
    {       
        output.close();
    }
}
