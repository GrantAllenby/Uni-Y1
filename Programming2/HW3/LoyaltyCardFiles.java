import java.util.Scanner;
import java.io.*;
/**
 * A class LoyaltyCardFiles that contains details of loyalty cards and their points
 *
 * ID: w18015084
 * @author Katherine Boyfield
 * @version 23/03/19
 */
public class LoyaltyCardFiles
{
    private File inFile;            //the existing file to read from
    private File outFile;           //the file to write to
    private Scanner input;          //the Scanner to read the inFile
    private PrintWriter output;     //the PrintWriter to output to the outFile

    /**
     * The constuctor for the class LoyaltyCardFiles
     * Instantiates the in and out files, throwing exceptions if they don't 
     * exist or already exist respectively, and calls the other methods of the class
     * 
     * @param inFileName    the file name of the existing file
     * @param outFileName   the file name for the new file
     */
    public LoyaltyCardFiles(String inFileName, String outFileName) throws FileNotFoundException
    {
        inFile = new File(inFileName + ".txt");
        if (!inFile.exists()) 
        {
            throw new IllegalStateException( inFileName + " does not exist");
        }
        outFile = new File(outFileName + ".txt");
        if (outFile.exists()) 
        {
            throw new IllegalStateException( outFileName + " already exists");
        }
        makeLinks();
        processFiles();
        closeLinks();
    }

    /**
     * Instantiates the Scanner and PrintWriter objects and links them to the appropriate files
     */
    public void makeLinks() throws FileNotFoundException
    {
        input = new Scanner(inFile);
        output = new PrintWriter(outFile);
    }

    /**
     * Reads the inFile, and writes to the outFile, giving details depending on the input
     */
    public void processFiles()
    {
        int lineCounter = 0;
        int stuPts = 0;
        int staPts = 0;
        int stuCards = 0;
        int staCards = 0;
        while (input.hasNextLine())
        {
            String title = input.next();
            String firstName = input.next();
            String lastName = input.next();
            String type = input.next();
            int points  = input.nextInt();
            output.println(title + "\t" + firstName + "\t" + lastName + "\t" + type + "\t" + points );
            lineCounter++;
            if (type.equals("stu"))
            {
                stuCards++;
                stuPts += points;
            }
            else if (type.equals("sta"))
            {
                staCards++;
                staPts += points;
            }
            else
            {
                System.out.println("Not formatted correctly");
            }
        }
        output.println("There are a total of " + lineCounter + " loyalty cards holding " + (stuPts + staPts) + " points.");
        output.println("There are " + staCards + " staff cards holding " + staPts + " points and " + stuCards + " student cards holding " + stuPts + " points.");
    }

    /**
     * Closes the links to the files via the Scanner and PrintWriter objects
     */
    public void closeLinks()
    {
        input.close();
        output.close();
    }
}
