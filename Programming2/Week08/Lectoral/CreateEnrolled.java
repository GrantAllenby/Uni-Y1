import java.io.*;
import java.util.Scanner;

public class CreateEnrolled
{
    private File file;
    private PrintWriter output;
    
    // if using Scanner
    private Scanner keyboard;

    /**
     * Constructor for objects of class WriteData
     */
    public CreateEnrolled(String fileName)
    {
        keyboard = new Scanner(System.in);
        file = new File(fileName);
        
    }

    public void makeLink() throws FileNotFoundException
    {
        output = new PrintWriter(file);
    }
    
    public void writeToFile()
    {
        output.println("Alan Alda 111 enrolled");
        output.println("Barbara Bach 222 enrolled");
        output.println("Charlotte Church 333 deferred");
        output.println("Daniel Defoe 444 enrolled");
        output.println("Emilio Estevez 555 enrolled");        
    }
    
    /**
     * Create the required data using a Scanner object
     * which is written to the text file.
     * 
     * Performs no data validation.
     * Input continues until "x" is entered
     */
    public void writeToFileUsingScanner()
    {
        String student = "";
        System.out.print("Enter a student's details: ");
        student = keyboard.nextLine();
        while (!student.equals("x"))
        {
            output.println(student);
            System.out.print("Enter a student's details: ");
            student = keyboard.nextLine();            
        }
        System.out.println("Data entry complete.");
    }    

    public void closeLink()
    {       
        output.close();
    }
}
