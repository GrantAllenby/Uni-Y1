import java.util.Scanner;

public class ReporterExample
{
    Scanner keyboard;
    ReporterFactory rf;
    Reporter r;

    public ReporterExample()
    {
        keyboard = new Scanner(System.in);
        rf = new ReporterFactory();
    }

    public void selectReporter(int choice)
    {
        r = rf.getReporter(choice);
    }

    public void printReport() // represents the application
    {
        r.reporter("Outside loop");
        for ( int i = 0; i<3 ; i++)
            r.reporter("inside loop " + i);
        r.reporter("end of example");
    }

}