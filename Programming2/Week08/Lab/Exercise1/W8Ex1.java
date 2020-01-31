import java.io.*;
/**
 * Write a description of class W8Ex1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W8Ex1
{
    private File file;
    private PrintWriter output;
    
    public W8Ex1(String fileName)
    {
        file = new File(fileName);
        if(file.exists())
        {
            throw new IllegalStateException(fileName + " already exists");
        }
    }
    
    public void makeLink() throws FileNotFoundException
    {
        output = new PrintWriter(file);
    }
    
    public void writeToFile()
    {
        output.println("Ansel Adams 20 49.5");
        output.println("Betty Boothroyd 45 92.3");
    }
    
        public void closeLink()
    {       
        output.close();
    }
}
