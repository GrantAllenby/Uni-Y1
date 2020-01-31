//imports the scanner utility for user input
import java.util.Scanner;
/**
 * Exercise for week 5 lab.
 * Allows input for students final results from grades.
 * @author (Grant Allenby) 
 * @version (v1.0 02/11/18)
 */

public class Week5Exercises 
{
    private Scanner myScanner;
    
    /** Defines a new scanner for use by the user.
     * 
     */
    public Week5Exercises() 
    {
        myScanner = new Scanner(System.in);
    }
    
    /** Constructor for entering students level 5 and level 6 marks and then averaging the result.
     *  It will then output a grade boundary for the average result.
     *  The constructor will also output an error message to the user if the results are incorrect.
     */
    public void ex1() 
    {
        System.out.println("Enter level 5 results");
        int level5results = myScanner.nextInt();
        
        System.out.println("Enter level 6 results");
        int level6results = myScanner.nextInt();
        
        int averagemark;
        averagemark = (level5results + level6results) / 2;
        
        if (averagemark < 0)
        {
            System.out.println("Mark entered was lower than 0: " + averagemark);
        }
        
        if (averagemark > 100) 
        {
            System.out.println("Mark entered was over 100: " + averagemark);
        }
        
        if (averagemark >= 70 && averagemark <=100)
        {
            System.out.println("Average mark is a First: " + averagemark);
        }
        
        if (averagemark >= 60 && averagemark <= 69) 
        {
            System.out.println("Average mark is an Upper Second: " + averagemark);
        }
        
        if (averagemark >= 50 && averagemark <= 59)
        {
            System.out.println("Average mark is a Lower Second: " + averagemark);
        }
        
        if (averagemark >= 40 && averagemark <= 49)
        {
            System.out.println("Average mark is a Third: " + averagemark);
        }
        
        if (averagemark < 39 && averagemark >= 0) 
        {
            System.out.println("Average Mark is a fail: " + averagemark);
        }
    }
    
    public void ex2()
    {
        System.out.println("Enter Level 5 results");
        String level5results = myScanner.nextLine();
        
        System.out.println("Enter Level 6 results");
        String level6results = myScanner.nextLine();
        
        String averagemark;
        
        averagemark = level5results + level6results;
        
        if (level5results != "d" || level5results != "m" || level5results != "p" || level5results != "f" || level5results != "a")
        {
            System.out.println("Illegal value entered: " + level5results);
        }
        
        else if (level6results != "d" || level6results != "m" || level6results != "p" || level6results != "f" || level6results != "a")
        {
            System.out.println("Illegal value entered: " + level6results);
        }
        
        else 
        {
            System.out.println("Grades received are: " + averagemark);
        }
    }
}
