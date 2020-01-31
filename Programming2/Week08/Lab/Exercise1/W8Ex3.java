import java.io.*;
import java.util.Scanner;
/**
 * Write a description of class W8Ex3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W8Ex3
{
    private File file;
    private PrintWriter output;
    private Scanner keyboard;
    
    public W8Ex3(String fileName)
    {
        file = new File(fileName);
        if(file.exists())
        {
            throw new IllegalStateException(fileName + " already exists");
        }
        keyboard = new Scanner(System.in);
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
