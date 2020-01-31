import java.util.ArrayList;

/**
 * The database class provides a facility to store CD and DVD 
 * objects. A list of all CDs and dvds can be printed to the
 * terminal.
 * 
 * This version does not save the data to disk, and it does not
 * provide any search functions.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 1.0
 */
public class Database
{
    private ArrayList<Item> items;

    /**
     * Construct an empty Database.
     */
    public Database()
    {
        items = new ArrayList<Item>();
    }

    /**
     * Add an item to the database.
     */
    public void addItem(Item item)
    {
        items.add(item);
    }

    /**
     * Print a list of all currently stored CDs and dvds to the
     * text terminal.
     */
    public String list()
    {
       
        String list = "";
        for ( Item item : items )
        {            
             list = list + item.getDetails() +"\n";
        }
        
        return list;
    }
}
