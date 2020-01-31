
/**
 * Write a description of class Person here.
 * 
 * @author (Grant Allenby) 
 * @version (21/02/19)
 */
public class Person
{
    private String firstName; //first name of the person.
    private String lastName; //last name of the person.
    
    /** Constructor for class Person.
     * 
     */
    public Person (String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    /** Empty constructor for class Person.
     * 
     */
    public Person()
    {
        
    }
    
    /** Returns first name.
     *  @return firstName.
     */
    public String getFirstName()
    {
        return firstName;
    }
    
    /** Returns last name.
     *  @return lastName.
     */
    public String getLastName()
    {
        return lastName;
    }
    
    /** Prints the persons first and last name.
     * 
     */
    public void print()
    {
        System.out.println(toString());
    }
    
    /** Sets a new first name for the person.
     * 
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    /** sets a new last name for the person.
     * 
     */
    public void setLastName (String lastName)
    {
        this.lastName = lastName;
    }
    
    /** returns the first name and last name of the person.
     *  @return firstName lastName
     */
    public String toString()
    {
        return firstName + " " + lastName;
    }
}
