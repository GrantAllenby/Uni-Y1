import java.io.*;

/**
 * Class to demo File dir lister.
 * Lists files in current directory, ( folder)
 * 
 * @author Ian Bradley
 * @version 1.0
 */
public class DirList
{
    private File path;
    private String [] fileNames;

    /**
     * Constructor for objects of class DirList
     */
    public DirList()
    {
    }

    private void output()
    {
        for ( int i = 0 ; i < fileNames.length ; i++ )
        {
            System.out.println( fileNames[i]);
        }
    }

    public  void getDirList()
    {
        path = new File("."); // "." means current dir
        fileNames = path.list();
        output();
    }

}
