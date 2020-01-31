import java.io.*;
import java.util.*;

/**
 * Demonstrates some of the File class methods.
 * 
 * @author Ian Bradley 
 * @version 1.0
 */
public class FilePropertyTester
{
    private File file;
    /**
     * Constructor for objects of class FilePropertyTester
     */
    public FilePropertyTester(String fileName)
    {
        file = new File(fileName);
    }

    public boolean exists()
    {        
        return file.exists();
    }

    public boolean canRead()
    {
        return  file.canRead();
    }

    public boolean canWrite()
    {
        return file.canWrite();
    }

    public boolean isDirectory()
    {
        return file.isDirectory();
    }

    public boolean isFile()
    {
        return file.isFile();
    }

    public String absolutePath()
    {
        return file.getAbsolutePath();
    }

    public String lastModified()
    {
        return new Date(file.lastModified()).toString();
    }
    
    public long fileLength()
    {
        return file.length();
    }
    
    public void printAllOutput()
    {
        System.out.println("\nDoes file exist?: " + file.exists()
                           + ".\nCan file be read?: " + file.canRead()
                           + ".\nCan file be written to?: " + file.canWrite()
                           + ".\nIs it a directory?: " + file.isDirectory()
                           + ".\nOr is it a file?: " + file.isFile()
                           + ".\nAbsolute path: " + file.getAbsolutePath()
                           + ".\nDay last modified: " + new Date(file.lastModified()).toString()
                           + ".\nFile length: " + + file.length());
    }


}
