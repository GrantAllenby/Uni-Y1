import java.util.*;

/**
 * A WordList is a set of words loaded from a file and searchable by
 * substring.  A word is defined as a sequence of characters
 * ignore alphabetic case when comparing or searching. 
 */
public class WordList 
{
    private ArrayList<String> words;
    private FileReader fileReader;

    /*
     * Rep invariant:
     *      words != null
     */

    /**
     * Make a WordList.
     */
    public WordList(String fileName) 
    {
        try
        {
            fileReader = new FileReader(fileName);
            load();
        }
        catch (IllegalStateException e)
        {            
        }    
    }

    /**
     * Load words from file

     */
    private void load()  {
        fileReader.makeLink();        
        words = new ArrayList<String>();

        while ( !fileReader.endOfFile())
        {
            words.add( fileReader.readFromFile());
        }
        fileReader.closeLink();
    }

    public ArrayList<String> getAllWords()
    {
        return words;
    }

    /**
     * Find words containing a given substring.
     * @param s Substring to search for
     * @return list of words in this word set (sorted case-insensitively)
     * that contain the substring s (matched case-insensitively).  A
     * word appears at most once in the returned list.
     */
    public ArrayList<String> find(String s) {
        s = s.toLowerCase();
        ArrayList<String> matches = new ArrayList<String>();
        for (String word : words) 
        {
            if (word.toLowerCase().indexOf(s) != -1)
                matches.add(word);
        }
        return matches;
    }

}
