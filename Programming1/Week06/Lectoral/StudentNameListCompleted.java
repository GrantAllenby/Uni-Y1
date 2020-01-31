import java.util.*;
/**
 * Example to demonstrate use of ArrayList.
 * Manages a list of names.
 * No IO code
 * 
 * @author Ian Bradley 
 * @version 2.0
 */
public class StudentNameListCompleted
{
    // DECLARE ARRAYLIST CALLED names - slide 19
    private ArrayList<String> names;   

    /**
     * Constructor for objects of class NameList
     */
    public StudentNameListCompleted()
    {
       // ADD CODE - slide 19
       names = new ArrayList <String>();

    }
    
    public void slide26()
    {
        names.add( "Amy" );
        names.add( "Bob" );
        names.add( "Chris" );
        System.out.println("Before adding at index 1:"); 
        int j = 0;
        while (j<names.size() )
        {
            System.out.println("element " + j + ": " + names.get(j) );
            j++;
        } 
    }
    
    public void slide34()
    {
        names.add( "Amy" ); 
        names.add( "Bob" ); 
        names.add( "Chris" ); 
        names.add( "Deb" ); 
        names.remove(2);  
        int j=0;
        while(j < names.size() ) {
            System.out.println( j + ": " + names.get(j) );
            j++; 
        }
    }

    /**
     *Adds a name to the list
     *@param name to add
     */
    public void addName(String name )
    {
        // ADD CODE - slide 29
        names.add(name);
    }

    /**
     *gets  name for a given index
     *@param index position of name
     *@return the name at position index
     * 
     */
    public String getName(int index)
    {
        // ADD CODE - slide 30
        return names.get(index);
    }

    /**
     * prints size of list
     *@return the size of the list
     */
    public int getSize()
    {
        // ADD CODE - slide 31
        return names.size();
    }

    /**
     * replace an element with a new value
     *@param index position of name to remove
     *@param name the replacement value
     */
    public void setName(int index,String name )
    {
        // ADD CODE - slide 36
        names.set(index, name);
    }

    /**
     * remove a name
     *@param index position of name to remove
     */
    public void removeName(int index)
    {
       // ADD CODE - slide
       names.remove(index);
    } 
}