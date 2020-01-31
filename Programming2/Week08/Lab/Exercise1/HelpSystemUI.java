import java.util.*; 

/**
 * User Interface for Help System.
 * 
 * @author Ian Bradley 
 * @version 1.0
 */
public class HelpSystemUI
{
    private Scanner keyboard;
    private boolean fileSelected;
    private HelpSystem helpSystem;

    /**
     * Constructor 
     */
    public HelpSystemUI()
    {
        keyboard = new Scanner(System.in);
        fileSelected = false;
        helpSystem = new HelpSystem();
    }

    /**
     * The main menu for the user interface.
     */
    public void menu() 
    {
        int command = -1;
        while ( command != 0 )
        { 
            displayMenu();
            command = getCommand();
            execute( command );
        }
    }

    private void displayMenu()
    {
        System.out.println( "Help System" );
        System.out.println("   Select Help File  1");
        if ( fileSelected )
        {
            System.out.println("   Search for topic  2");
            System.out.println("   List all topics   3");
        }
        System.out.println("   Quit              0");
    }

    private int getCommand()
    {
        System.out.print ("Enter command: ");
        int command = keyboard.nextInt();
        keyboard.nextLine();
        return command;        
    }

    private void execute( int command) 
    {
        if ( command == 1)
            selectFile();
        else
        if ( command == 2 )
            searchForTopic();
        else
        if ( command == 3 )
            listAllTopics();
        else
        if ( command == 0)
            quit();
        else
            invalid();

    }

    private void selectFile() 
    {
        System.out.print ( "Enter name of help file ");
        String fileName = keyboard.nextLine();
        boolean result = helpSystem.selectHelpFile(fileName);
        if ( result )
        {
            fileSelected = true;
            System.out.println("File selected ");
        }
        else
        {
            fileSelected = false;
            System.out.println(" ERROR Failed to select file ");
        }
    }

    private void searchForTopic() 
    {
        System.out.print("Enter topic name ");
        String topic = keyboard.nextLine();
        System.out.println( helpSystem.getHelp(topic));

    }

    private void listAllTopics()
    {
        System.out.println( helpSystem.getTopics() );
    }

    private void quit()
    {
        helpSystem.close();
        System.out.println( " Program closing down");
    }

    private void invalid()
    {
        System.out.println("Unknown command");
    }
}

