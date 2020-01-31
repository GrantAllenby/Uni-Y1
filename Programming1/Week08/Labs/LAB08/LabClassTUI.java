import java.util.Scanner; //Imports scanner utility.
/**
 * Adds a text UI interface to the LabClass class.
 * 
 * @author (Grant Allenby) 
 * @version (v1.0 23/11/18)
 */
public class LabClassTUI
{
    private Scanner myScanner; //Defines private scanner myScanner.
    private LabClass labClass; //Fetches from the LabClass class.
    
    /** 
     *  Constructor class for defining a scanner and labClass.
     */
    public LabClassTUI() 
    {
        myScanner  = new Scanner(System.in); //Defines new Scanner for use in system.
        labClass = new LabClass(); //Establishes new labClass.
    }
    
    /** 
     *  Method that calls from displayMenu and getCommand.
     */
    public void menu() // calls displayMenu and getCommand
    {
        int command = -1;
        while (command != 0)
        {
            displayMenu();
            command = getCommand();
            execute(command);
        }
    }
    
    /**
     *  Method that outputs the available functions to the user through a command line style system.
     */
    private void displayMenu()
    {
        System.out.println("Display Full Class Details.....[1]");
        System.out.println("Find Student By Name...........[2]");
        System.out.println("Add Student....................[3]");
        System.out.println("Set Instructor.................[4]");
        System.out.println("Set Room Number................[5]");
        System.out.println("Set Time and Day...............[6]");
        System.out.println("Remove Student.................[7]");
        System.out.println("Get Class Size.................[8]");
        System.out.println("Quit...........................[0]");
    }
    
    /**
     * 
     */
    private int getCommand()
    {
        System.out.println("Select an Option to perform....[X]");
        int command = myScanner.nextInt();
        myScanner.nextLine();
        return command;
    }
    
    /**
     * 
     */
    private void execute(int command)
    {
        if (command == 1)
        {
            labClass.toString();
        }
        
        else if (command == 2)
        {
            System.out.println("Enter student name: ");
            String studentName = myScanner.next();
        }
        
        else if (command == 3)
        {
            return labClass.enrollStudent();
        }
        
        else if (command == 4)
        {
            
        }
        
        else if (command == 5)
        {
            
        }
        
        else if (command == 6)
        {
            
        }
        
        else if (command == 7)
        {
            
        }
        
        else if (command == 8)
        {
            
        }
        
        else if (command == 8)
        {
            
        }
        
        else if (command == 0)
        {
            
        }
        else
        {
            System.out.println("Unknown Command, please re-enter command...");
        }
    }
}
