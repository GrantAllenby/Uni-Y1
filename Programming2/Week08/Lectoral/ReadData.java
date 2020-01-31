
import java.util.*;
import java.io.*;

/**
 * Demonstrates reading a text file using the Scanner class.
 * 
 * @author Ian Bradley 
 * @version 1.0
 */
public class ReadData
{
    private File file;
    private Scanner input;

    /**
     * Constructor for objects of class ReadData
     */
    public ReadData(String fileName)
    {
        file = new File(fileName);
        if (!file.exists()) 
        {
            throw new IllegalStateException( fileName + " does not exist");
        }
    }

   public void makeLink() throws FileNotFoundException
    {
        input = new Scanner(file);
    }
    
    public String readFromFile()
    {
      String firstName = input.next();
      String mi = input.next();
      String lastName = input.next();
      int score = input.nextInt();
      return firstName  + " " + mi + " " + lastName + " " + score;
    }
    
    
    public void closeLink()
    {       
        input.close();
    }
  }

